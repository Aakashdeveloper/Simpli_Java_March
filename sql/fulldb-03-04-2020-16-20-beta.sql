-- Generation time: Fri, 03 Apr 2020 16:20:40 +0000
-- Host: mysql.hostinger.ro
-- DB name: u574849695_20
/*!40030 SET NAMES UTF8 */;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `birthdate` date NOT NULL,
  `added` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `authors` VALUES ('1','Creola','Lind','domingo56@example.org','1982-10-11','1997-03-10 17:49:40'),
('2','Flavio','Luettgen','kautzer.jermain@example.org','2007-04-20','1999-12-28 07:25:46'),
('3','Kianna','Bauch','kzulauf@example.org','1994-01-03','2005-08-17 00:40:34'),
('4','Dominic','O\'Hara','rhett.pfannerstill@example.org','2002-03-28','1982-11-20 04:18:31'),
('5','Nils','Bins','orpha.gerlach@example.org','2019-03-22','1980-01-21 17:02:29'),
('6','Hillard','Huels','zstokes@example.com','2009-10-14','1970-03-05 12:36:55'),
('7','Evangeline','Beier','modesto.murazik@example.com','1985-12-27','1984-04-25 11:02:50'),
('8','Muriel','Wisoky','kuvalis.peggie@example.org','2015-08-31','2000-08-19 22:10:08'),
('9','Godfrey','Predovic','etreutel@example.org','1975-10-05','2013-06-07 00:06:22'),
('10','Harrison','Hagenes','schumm.ressie@example.com','1973-04-25','1970-01-16 18:48:03'),
('11','Edward','Hodkiewicz','zjacobi@example.org','2010-03-05','1983-04-25 00:15:11'),
('12','Kiley','Hills','pfannerstill.afton@example.net','2001-12-08','1977-12-22 22:05:48'),
('13','Adolph','Rice','walter.ericka@example.org','2018-04-21','1974-02-28 00:56:11'),
('14','Matilda','Schoen','pbode@example.com','2002-12-03','1998-11-12 03:41:02'),
('15','Dakota','Schinner','miles75@example.org','2009-09-27','1987-07-21 17:14:25'),
('16','Eugenia','Ledner','donny31@example.org','1992-07-06','2016-08-08 14:36:53'),
('17','Brannon','Koepp','andre08@example.net','2009-08-01','1975-06-26 16:28:17'),
('18','Khalid','Brekke','beth03@example.net','1986-01-24','2016-11-17 13:24:41'),
('19','Van','Armstrong','o\'conner.blaise@example.com','1974-07-07','2019-05-21 14:46:15'),
('20','Ashton','Hilll','kerluke.robyn@example.net','1976-12-26','2016-01-18 07:38:55'),
('21','Vince','Koss','akohler@example.com','2002-01-05','2014-01-22 09:36:31'),
('22','Lindsay','Lebsack','crist.alex@example.com','1988-01-20','1975-04-08 09:00:30'),
('23','Lisandro','Pfannerstill','carmella.turcotte@example.com','1979-12-25','1992-11-23 16:49:23'),
('24','Winfield','Gulgowski','hammes.alvena@example.net','1972-11-10','1998-05-31 21:58:43'),
('25','Delores','Terry','tevin98@example.com','2003-01-17','2011-10-08 11:19:30'),
('26','Danika','Kilback','bauch.olaf@example.net','2019-12-03','2016-08-02 20:35:39'),
('27','Bessie','Beier','katelin.feeney@example.com','1995-05-11','1977-07-05 10:55:10'),
('28','Oceane','Corkery','ehessel@example.com','2004-03-03','1972-11-13 13:08:02'),
('29','Maya','Frami','buckridge.shanny@example.com','1982-08-29','1991-08-14 12:45:56'),
('30','Estella','Rau','fkozey@example.com','1988-05-05','1972-03-02 20:24:21'),
('31','Heath','Haley','kkeebler@example.com','1998-01-28','2017-12-19 09:40:25'),
('32','Geovany','Flatley','hartmann.andreane@example.com','2019-03-08','1977-07-21 09:31:42'),
('33','Ron','Kerluke','mohamed69@example.net','1983-02-27','2011-08-23 03:05:59'),
('34','Haley','Hauck','zulauf.mateo@example.com','1990-02-22','2004-04-25 23:01:51'),
('35','Tito','Koelpin','kerluke.preston@example.net','2007-11-06','2002-05-14 06:05:31'),
('36','Lori','Anderson','tad.krajcik@example.net','2005-02-20','1980-01-16 10:16:30'),
('37','Sidney','Koss','rosenbaum.shakira@example.org','1986-04-10','1987-07-26 02:53:45'),
('38','Cordelia','O\'Kon','nikolaus.bianka@example.com','2004-10-14','2012-01-23 09:24:27'),
('39','Erin','Williamson','oernser@example.org','1978-04-19','1981-06-11 07:35:31'),
('40','Jedediah','Breitenberg','afton.schuppe@example.org','2019-12-06','1985-07-21 08:26:16'),
('41','Fatima','Schaefer','germaine67@example.net','2004-07-30','1973-12-10 00:41:30'),
('42','Rubye','Emard','corwin.halle@example.com','1992-12-03','1996-12-24 04:39:08'),
('43','Kyla','Wilderman','arne43@example.net','2017-08-27','1991-03-01 12:40:30'),
('44','George','Marks','melody03@example.net','2009-10-26','2008-10-20 12:08:13'),
('45','Garret','Hermiston','clovis40@example.org','1976-05-09','2005-11-29 08:21:55'),
('46','Abelardo','Hessel','kulas.bret@example.org','2002-11-24','1976-12-14 17:26:59'),
('47','Mckenzie','Upton','kailyn75@example.com','2010-03-28','2001-02-15 13:01:50'),
('48','Kody','Ruecker','celine.boyer@example.com','1987-01-30','1975-10-14 11:52:41'),
('49','Benjamin','Weissnat','brodriguez@example.net','1984-04-02','1993-09-04 16:51:19'),
('50','Eloise','Schimmel','audrey55@example.com','1988-12-24','2004-05-13 22:40:04'),
('51','Jeff','Shields','ldicki@example.net','2015-12-05','2000-05-29 07:38:27'),
('52','Sally','Barton','karen.gislason@example.com','2000-11-30','1991-04-12 21:52:12'),
('53','Cooper','Hudson','jbechtelar@example.com','2014-05-15','2015-04-08 03:32:25'),
('54','Zechariah','Swift','elisa57@example.org','1997-09-20','1997-05-05 03:34:03'),
('55','Estell','Hilpert','willard51@example.net','2009-06-27','1970-01-04 12:40:36'),
('56','Christy','Mertz','feil.viva@example.com','1974-02-02','1978-10-05 22:41:16'),
('57','Savanna','Leuschke','deion.wiegand@example.org','1975-10-31','1974-04-11 05:43:04'),
('58','Tony','Schaefer','littel.lukas@example.org','2013-12-31','1992-10-10 00:51:06'),
('59','Karen','Bauch','meghan05@example.org','2009-09-14','1979-09-15 07:48:22'),
('60','Jack','Boehm','nyasia.kertzmann@example.net','1972-10-30','2013-03-10 22:11:51'),
('61','Dayton','Prosacco','oemard@example.org','2011-09-30','2003-01-31 14:44:08'),
('62','Shannon','Fahey','beahan.carolyn@example.com','2008-11-15','2011-06-13 14:44:26'),
('63','Halle','Hansen','mayert.thomas@example.org','1989-11-05','2010-07-07 06:29:28'),
('64','Candida','Rodriguez','wiza.monica@example.com','1987-05-14','2005-07-15 16:22:50'),
('65','Adelia','Conn','lkovacek@example.net','1989-01-02','1991-12-21 07:33:58'),
('66','Anya','Bogisich','freeman68@example.com','1986-06-14','2012-04-09 21:30:37'),
('67','Stanton','Bednar','raoul.renner@example.net','1975-11-20','2017-06-18 23:37:25'),
('68','Nicolette','Hayes','hyatt.vesta@example.org','2015-12-09','2012-10-28 15:40:39'),
('69','Antonetta','Russel','kasandra.schuster@example.com','2009-07-01','1981-04-08 18:42:54'),
('70','Elisha','Bashirian','cummings.brett@example.com','1986-11-06','1975-12-06 01:37:18'),
('71','Leif','Williamson','herzog.aisha@example.com','1973-09-03','2011-06-22 16:43:47'),
('72','Maximo','Parisian','reginald37@example.com','2005-11-04','1978-05-16 11:07:59'),
('73','Keanu','Green','napoleon66@example.org','2002-05-05','1978-05-18 15:22:01'),
('74','Haley','Sanford','ogutmann@example.org','1990-09-18','1990-02-26 14:17:55'),
('75','Lizzie','Maggio','imueller@example.org','2015-02-22','1982-05-27 21:57:59'),
('76','David','Hettinger','yost.jaeden@example.org','2010-07-16','1988-07-22 18:32:50'),
('77','Dino','Strosin','rosamond15@example.net','1998-01-11','2000-03-08 04:50:22'),
('78','Martine','Ortiz','earlene27@example.net','1978-04-15','1973-04-12 15:53:51'),
('79','Humberto','Gibson','owyman@example.org','2008-05-20','2000-05-11 07:42:20'),
('80','Irma','Cassin','augustus39@example.com','1975-01-11','1978-09-11 03:54:49'),
('81','Jakayla','Simonis','ibradtke@example.com','2007-11-07','2009-01-06 11:49:28'),
('82','Lesly','Feil','labadie.aiyana@example.com','1995-01-23','1979-05-02 04:41:17'),
('83','Jessica','Quitzon','spinka.dina@example.org','1997-01-26','1994-05-23 05:46:01'),
('84','Willy','Pfeffer','cara.gutkowski@example.com','1979-10-10','1972-07-10 17:37:44'),
('85','Nels','Buckridge','julia.gislason@example.net','1974-11-14','2008-05-02 09:45:44'),
('86','Araceli','Bradtke','kertzmann.rene@example.org','1979-02-24','2011-03-24 09:59:46'),
('87','Hannah','Dibbert','delphine.kassulke@example.net','1992-12-26','1978-04-14 23:09:12'),
('88','Shanny','Botsford','rabshire@example.org','2000-03-14','1990-06-14 19:22:39'),
('89','Caleb','Deckow','orlo00@example.com','2002-06-17','1984-06-16 11:23:47'),
('90','Anderson','Purdy','lindsey.dibbert@example.com','2004-09-02','1999-10-18 05:58:19'),
('91','Clyde','Bode','madisen.jakubowski@example.org','2002-01-20','1976-03-20 08:27:16'),
('92','Nicolas','Hudson','merl90@example.org','1997-02-05','1984-03-23 00:27:31'),
('93','Esteban','Carroll','jacobson.amy@example.org','1980-11-18','1986-11-27 15:55:35'),
('94','Darius','Hilpert','ydonnelly@example.net','1975-02-08','1989-03-17 10:23:43'),
('95','Rupert','Fritsch','muhammad17@example.net','1977-04-18','1972-10-25 22:14:36'),
('96','Roberta','Nikolaus','lebsack.joyce@example.org','1970-12-14','1999-08-30 07:04:10'),
('97','Reymundo','Wehner','luettgen.valerie@example.com','1974-01-17','1994-01-20 13:29:30'),
('98','Tremaine','Little','jacobson.garett@example.com','2006-12-07','2016-06-08 09:23:58'),
('99','Dominic','Labadie','nathanael78@example.org','1974-09-19','1971-08-20 05:48:26'),
('100','Annabelle','Jacobson','naomie65@example.net','2000-05-29','2013-04-14 03:00:50'); 


DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author_id` int(11) NOT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;





/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

