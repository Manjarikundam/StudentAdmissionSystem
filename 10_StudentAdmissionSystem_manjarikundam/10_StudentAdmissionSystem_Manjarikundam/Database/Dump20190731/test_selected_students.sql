-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `selected_students`
--

DROP TABLE IF EXISTS `selected_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `selected_students` (
  `applicant_no` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `board` varchar(20) DEFAULT NULL,
  `percentage` varchar(20) DEFAULT NULL,
  `gpa` varchar(20) DEFAULT NULL,
  `school_name` varchar(20) DEFAULT NULL,
  `dept_choice` varchar(20) DEFAULT NULL,
  `alloted_dept` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selected_students`
--

LOCK TABLES `selected_students` WRITE;
/*!40000 ALTER TABLE `selected_students` DISABLE KEYS */;
INSERT INTO `selected_students` VALUES ('6','ewrg','ssc','99',NULL,'erzbt','ece','ece'),('2','sima','ssc','92',NULL,'gss','it','it'),('1','manju','ssc','85',NULL,'bghs','ece','ece'),('1','manju','ssc','85',NULL,'bghs','ece','ece'),('2','sima','cbse','78','9','schs','it','it'),('2','sima','cbse','78','9','schs','it','it'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('5','africa','cbse','98','8','cyn','ece','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('9','karuna','ssc','8',NULL,'trge','it','it'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('5','africa','cbse','98','8','cyn','ece','it'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('9','karuna','ssc','8',NULL,'trge','it','it'),('5','africa','cbse','98','8','cyn','ece','it'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('5','africa','cbse','98','8','cyn','ece','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('5','africa','cbse','98','8','cyn','ece','it'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','it'),('9','karuna','ssc','8',NULL,'trge','it','it'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('7','pravs','cbse','76','8','gfb','mechanical','mechanical'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('9','karuna','ssc','8',NULL,'trge','it','it'),('5','africa','cbse','98','8','cyn','ece','ece'),('8','shreya','ssc','89',NULL,'datg','cse','cse'),('12','som','ssc','87',NULL,'ebgta','ece','ece'),('2','geek','ssc','86',NULL,'hfytf','cse','cse'),('9','karuna','ssc','8',NULL,'trge','it','it'),('10','rahul','cbse','78','9','jgs','mechanical','mechanical'),('3','maheshbabu','ssc','77',NULL,'hgfku','mechanical','mechanical'),('11','naveen','ssc','76',NULL,'restapi','cse','cse'),('6','pravs','ssc','76',NULL,'gfb','mechanical','mechanical');
/*!40000 ALTER TABLE `selected_students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-31 12:07:39
