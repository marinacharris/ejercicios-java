select department_id, AVG(salary) from employees group by department_id

select department_id, job_id, sum(salary) from employees group by department_id, job_id order by department_id 

select department_id, max(salary) from employees group by department_id  having max(salary)>10000

select department_id, department_name, location_id, city from departments d natural join locations l 

select employee_id, last_name, location_id, department_id, department_name from employees join departments using (department_id)

select e.employee_id, e.last_name, e.department_id, d.location_id, d.department_id from employees e join departments d on (e.department_id = d.department_id)

select employee_id, last_name, location_id, department_id from departments d2 join employees e2 using (department_id)

select e.employee_id, e.last_name, d.department_id, l.location_id 
	from employees e join departments d on (e.department_id=d.department_id) 
	join locations l on(d.location_id=l.location_id);

select last_name, salary from employees e where salary>(
	select salary from employees e2 where last_name = 'Hunold'
)

select last_name, salary from employees e3 where last_name ='Sciarra'

select last_name, department_name from employees e cross join departments d 

select last_name, city from employees e2  cross join locations l group by last_name 
