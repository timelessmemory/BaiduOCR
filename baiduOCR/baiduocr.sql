/*
Navicat MySQL Data Transfer

Source Server         : mario
Source Server Version : 50721
Source Host           : 192.168.1.110:3306
Source Database       : baiduocr

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-05-11 13:40:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `nation` varchar(10) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `code` varchar(30) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `is_deleted` smallint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
