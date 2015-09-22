# ************************************************************
# Sequel Pro SQL dump
# Version 4096
#
# http://www.sequelpro.com/
# http://code.google.com/p/sequel-pro/
#
# Host: 127.0.0.1 (MySQL 5.6.13)
# Database: lizi
# Generation Time: 2015-09-21 15:06:30 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table lizi
# ------------------------------------------------------------

DROP TABLE IF EXISTS `lizi`;

CREATE TABLE `lizi` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) NOT NULL DEFAULT '',
  `tel` varchar(20) DEFAULT NULL,
  `mother_tel` varchar(20) DEFAULT NULL,
  `father_tel` varchar(20) DEFAULT NULL,
  `ms_grandma_tel` varchar(20) DEFAULT NULL,
  `ms_grandpa_tel` varchar(20) DEFAULT NULL,
  `fs_grandma_tel` varchar(20) DEFAULT NULL,
  `fs_grandpa_tel` varchar(20) DEFAULT NULL,
  `home_tel` varchar(20) DEFAULT NULL,
  `other_tel` varchar(20) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `school` varchar(50) DEFAULT NULL,
  `community` varchar(50) DEFAULT NULL,
  `comment` varchar(500) DEFAULT NULL,
  `collector_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL DEFAULT '',
  `tel` varchar(30) DEFAULT NULL,
  `role` varchar(30) DEFAULT NULL,
  `status` int(2) NOT NULL DEFAULT '0',
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
