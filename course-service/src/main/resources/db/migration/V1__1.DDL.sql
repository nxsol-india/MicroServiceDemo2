CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `country_id` bigint(20) DEFAULT NULL,
  `domestic_price` double DEFAULT NULL,
  `institute_name` varchar(255) DEFAULT NULL,
  `international_price` double DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);