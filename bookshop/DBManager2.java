package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager implements AutoCloseable {
    private Connection connection;

    public DBManager() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        String url ="jdbc:sqlite:C:\\db\\BookShop.db";
        connection = DriverManager.getConnection(url);
    }

    /**
     * Close the connection to the database if it is still open.
     *
     */
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        connection = null;
    }

    /**
     * Return the number of units in stock of the given book.
     *
     * @param bookId The book identifier in the database.
     * @return The number of units in stock, or 0 if the book does not exist in the
     *         database.
     */
    public int getStock(int bookId) throws SQLException {
        int cantidad= 0;
        try (var stm = connection.prepareStatement("select cantidad from Inventario where id_libro = ?")){
            stm.setInt(1, bookId);
            try(var rs= stm.executeQuery()){
                if (rs.next()){
                    cantidad = rs.getInt("cantidad");
                }

            }
        }

        return cantidad;
    }

    /**
     * Search book by ISBN.
     *
     * @param isbn The ISBN of the book.
     * @return The Book object, or null if not found.
     * @throws SQLException If somthing fails with the DB.
     */
    public Book searchBook(String isbn) throws SQLException {
        ResultSet rs = null;
        Statement stm = null;
        Book libro = null;
        try{
            stm = connection.createStatement();
            String sql = "Select * from Libro where isbn = '"+isbn+"'";
            rs = stm.executeQuery(sql);
            while (rs.next()){
                libro = new Book();
                libro.setId(rs.getInt("id_libro"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitle(rs.getString("titulo"));
                libro.setYear(rs.getInt("anio"));
            }
        }
        finally{
            if (rs != null){
                rs.close();
            }
            if (stm !=null){
                stm.close();
            }
        }
        
        return libro;
    }

    /**
     * Sell a book.
     *
     * @param book  The book.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise (e.g. when the
     *         stock of the book is not big enough).
     * @throws SQLException If somthing fails with the DB.
     */
    public boolean sellBook(Book book, int units) throws SQLException {
        return sellBook(book.getId(), units);
    }

    /**
     * Sell a book.
     *
     * @param book  The book's identifier.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise (e.g. when the
     *         stock of the book is not big enough).
     * @throws SQLException If something fails with the DB.
     */
    public boolean sellBook(int book, int units) throws SQLException {
        // TODO: program this method
        return false;
    }

    /**
     * Return a list with all the books in the database.
     *
     * @return List with all the books.
     * @throws SQLException If something fails with the DB.
     */
    public List<Book> listBooks() throws SQLException {
        List<Book> libros = new ArrayList<>();
        String sql = "Select * from Libro";   
        try(//lo que est?? aq?? se cierra cuando termian el Try
            Statement stm = connection.createStatement();
            var rs = stm.executeQuery(sql);
            ){while (rs.next()){
                var libro = new Book();
                libro.setId(rs.getInt("id_libro"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitle(rs.getString("titulo"));
                libro.setYear(rs.getInt("anio"));
                libros.add(libro);
            }

        }
        return libros;
    }
}
