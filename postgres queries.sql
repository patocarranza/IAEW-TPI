CREATE TABLE IF NOT EXISTS Licenses 
(license_id SERIAL PRIMARY KEY, 
 licensee_email VARCHAR(100) NOT NULL, 
 license_admin_creator VARCHAR(10) NOT NULL, 
 license_creation_date DATE NOT NULL, 
 license_start_date DATE NOT NULL, 
 license_end_date DATE NOT NULL, 
 license_activated_date DATE, 
 license_computer_ref VARCHAR(200), 
 license_mac_address CHAR(17))

 INSERT INTO Licenses(licensee_email, license_admin_creator, 
		      license_start_date, license_end_date, 
		      license_creation_date)
      VALUES('wachin@gmail.com', 'Patricio', 
	     to_date('02/24/2016', 'mm/dd/yyyy'), 
	     to_date('05/24/2016', 'mm/dd/yyyy'), 
	     '01/01/2016')
	     
SELECT licensee_email, 
	to_char(MAX(license_start_date), 'mm/dd/yyyy') "start", 
	to_char(MAX(license_end_date), 'mm/dd/yyyy') "end"
FROM Licenses
WHERE licensee_email = 'wachin@gmail.com' 
AND license_end_date > now()
GROUP BY licensee_email

SELECT *
From Licenses

SELECT  license_id, licensee_email, 
	to_char(license_start_date, 'mm/dd/yyyy') "start", 
	to_char(license_end_date, 'mm/dd/yyyy') "end" 
FROM Licenses 
ORDER BY license_start_date DESC

SELECT license_start_date, license_end_date
FROM Licenses
WHERE license_mac_address IS NULL

UPDATE Licenses
SET license_mac_address = 'A0-88-69-35-A3-41', license_computer_ref = 'vevo', license_activated_date = now()
WHERE license_mac_address IS NULL
AND licensee_email = 've@.aw'
AND license_start_date = to_date('06/30/2016', 'mm/dd/yyyy')
AND license_end_date = to_date('12/30/2016', 'mm/dd/yyyy')

DELETE FROM Licenses