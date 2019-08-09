/*
 Navicat Premium Data Transfer

 Source Server         : ORCL_rbac_db
 Source Server Type    : Oracle
 Source Server Version : 100200
 Source Host           : localhost:1521
 Source Schema         : RBAC_DB

 Target Server Type    : Oracle
 Target Server Version : 100200
 File Encoding         : 65001

 Date: 09/08/2019 17:12:35
*/


-- ----------------------------
-- Table structure for MEMBER
-- ----------------------------
DROP TABLE "RBAC_DB"."MEMBER";
CREATE TABLE "RBAC_DB"."MEMBER" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "NAME" VARCHAR2(20 BYTE) ,
  "NICKNAME" VARCHAR2(20 BYTE) ,
  "PHONENUM" VARCHAR2(20 BYTE) ,
  "EMAIL" VARCHAR2(20 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "MEMBER"
-- ----------------------------
INSERT INTO "RBAC_DB"."MEMBER" VALUES ('E61D65F673D54F68B0861025C69773DB', '张三', '小三', '18888888888', 'zs@163.com');

-- ----------------------------
-- Table structure for ORDERS
-- ----------------------------
DROP TABLE "RBAC_DB"."ORDERS";
CREATE TABLE "RBAC_DB"."ORDERS" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "ORDERNUM" VARCHAR2(20 BYTE) NOT NULL ,
  "ORDERTIME" TIMESTAMP(6) ,
  "PEOPLECOUNT" NUMBER ,
  "ORDERDESC" VARCHAR2(500 BYTE) ,
  "PAYTYPE" NUMBER ,
  "ORDERSTATUS" NUMBER ,
  "PRODUCTID" VARCHAR2(32 BYTE) ,
  "MEMBERID" VARCHAR2(32 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "ORDERS"
-- ----------------------------
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('0E7231DC797C486290E8713CA3C6ECCC', '12345', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '676C5BD1D35E429A8C2E114939C5685A', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('5DC6A48DD4E94592AE904930EA866AFA', '54321', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '676C5BD1D35E429A8C2E114939C5685A', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('2FF351C4AC744E2092DCF08CFD314420', '67890', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('A0657832D93E4B10AE88A2D4B70B1A28', '98765', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('E4DD4C45EED84870ABA83574A801083E', '11111', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('96CC8BD43C734CC2ACBFF09501B4DD5D', '22222', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '12B7ABF2A4C544568B0A7C69F36BF8B7', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('55F9AF582D5A4DB28FB4EC3199385762', '33333', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('CA005CF1BE3C4EF68F88ABC7DF30E976', '44444', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');
INSERT INTO "RBAC_DB"."ORDERS" VALUES ('3081770BC3984EF092D9E99760FDABDE', '55555', TO_TIMESTAMP('2018-03-02 12:00:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '2', '没什么', '0', '1', '9F71F01CB448476DAFB309AA6DF9497F', 'E61D65F673D54F68B0861025C69773DB');

-- ----------------------------
-- Table structure for ORDER_TRAVELLER
-- ----------------------------
DROP TABLE "RBAC_DB"."ORDER_TRAVELLER";
CREATE TABLE "RBAC_DB"."ORDER_TRAVELLER" (
  "ORDERID" VARCHAR2(32 BYTE) NOT NULL ,
  "TRAVELLERID" VARCHAR2(32 BYTE) NOT NULL 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "ORDER_TRAVELLER"
-- ----------------------------
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('0E7231DC797C486290E8713CA3C6ECCC', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('2FF351C4AC744E2092DCF08CFD314420', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('3081770BC3984EF092D9E99760FDABDE', 'EE7A71FB6945483FBF91543DBE851960');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('55F9AF582D5A4DB28FB4EC3199385762', 'EE7A71FB6945483FBF91543DBE851960');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('5DC6A48DD4E94592AE904930EA866AFA', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('96CC8BD43C734CC2ACBFF09501B4DD5D', 'EE7A71FB6945483FBF91543DBE851960');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('A0657832D93E4B10AE88A2D4B70B1A28', '3FE27DF2A4E44A6DBC5D0FE4651D3D3E');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('CA005CF1BE3C4EF68F88ABC7DF30E976', 'EE7A71FB6945483FBF91543DBE851960');
INSERT INTO "RBAC_DB"."ORDER_TRAVELLER" VALUES ('E4DD4C45EED84870ABA83574A801083E', 'EE7A71FB6945483FBF91543DBE851960');

-- ----------------------------
-- Table structure for PERMISSION
-- ----------------------------
DROP TABLE "RBAC_DB"."PERMISSION";
CREATE TABLE "RBAC_DB"."PERMISSION" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "PERMISSIONNAME" VARCHAR2(50 BYTE) ,
  "URL" VARCHAR2(50 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "PERMISSION"
-- ----------------------------
INSERT INTO "RBAC_DB"."PERMISSION" VALUES ('CFC4B2E0634B4C1587FE445C1E38C8FE', 'findsss', '/sfaf');
INSERT INTO "RBAC_DB"."PERMISSION" VALUES ('1', 'findAll', '/sdf');
INSERT INTO "RBAC_DB"."PERMISSION" VALUES ('2', 'findById', '/ggg');

-- ----------------------------
-- Table structure for PRODUCT
-- ----------------------------
DROP TABLE "RBAC_DB"."PRODUCT";
CREATE TABLE "RBAC_DB"."PRODUCT" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "PRODUCTNUM" VARCHAR2(50 BYTE) NOT NULL ,
  "PRODUCTNAME" VARCHAR2(50 BYTE) ,
  "CITYNAME" VARCHAR2(50 BYTE) ,
  "DEPARTURETIME" TIMESTAMP(6) ,
  "PRODUCTPRICE" NUMBER ,
  "PRODUCTDESC" VARCHAR2(500 BYTE) ,
  "PRODUCTSTATUS" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "PRODUCT"
-- ----------------------------
INSERT INTO "RBAC_DB"."PRODUCT" VALUES ('676C5BD1D35E429A8C2E114939C5685A', 'itcast-002', '北京三日游', '北京', TO_TIMESTAMP('2018-10-10 10:10:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '1200', '不错的旅行', '1');
INSERT INTO "RBAC_DB"."PRODUCT" VALUES ('12B7ABF2A4C544568B0A7C69F36BF8B7', 'itcast-003', '上海五日游', '上海', TO_TIMESTAMP('2018-04-25 14:30:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '1800', '魔都我来了', '0');
INSERT INTO "RBAC_DB"."PRODUCT" VALUES ('9F71F01CB448476DAFB309AA6DF9497F', 'itcast-001', '北京三日游', '北京', TO_TIMESTAMP('2018-10-10 10:10:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '1200', '不错的旅行', '1');
INSERT INTO "RBAC_DB"."PRODUCT" VALUES ('459C0DDDC3C14D849E98BAE378849F00', 'zzzz-000', '斯蒂芬', '广州', TO_TIMESTAMP('2019-08-05 09:45:00.000000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), '66', 'sadf第三方', '1');

-- ----------------------------
-- Table structure for ROLE
-- ----------------------------
DROP TABLE "RBAC_DB"."ROLE";
CREATE TABLE "RBAC_DB"."ROLE" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "ROLENAME" VARCHAR2(50 BYTE) ,
  "ROLEDESC" VARCHAR2(50 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "ROLE"
-- ----------------------------
INSERT INTO "RBAC_DB"."ROLE" VALUES ('16503F7A0E9F469E9B1DED2432C10027', 'KEFU', '客服');
INSERT INTO "RBAC_DB"."ROLE" VALUES ('12', 'USER', '超级用户');
INSERT INTO "RBAC_DB"."ROLE" VALUES ('13', 'ADMIN', '管理员');

-- ----------------------------
-- Table structure for ROLE_PERMISSION
-- ----------------------------
DROP TABLE "RBAC_DB"."ROLE_PERMISSION";
CREATE TABLE "RBAC_DB"."ROLE_PERMISSION" (
  "PERMISSIONID" VARCHAR2(32 BYTE) NOT NULL ,
  "ROLEID" VARCHAR2(32 BYTE) NOT NULL 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "ROLE_PERMISSION"
-- ----------------------------
INSERT INTO "RBAC_DB"."ROLE_PERMISSION" VALUES ('1', '12');
INSERT INTO "RBAC_DB"."ROLE_PERMISSION" VALUES ('1', '16503F7A0E9F469E9B1DED2432C10027');
INSERT INTO "RBAC_DB"."ROLE_PERMISSION" VALUES ('2', '12');
INSERT INTO "RBAC_DB"."ROLE_PERMISSION" VALUES ('2', '13');
INSERT INTO "RBAC_DB"."ROLE_PERMISSION" VALUES ('CFC4B2E0634B4C1587FE445C1E38C8FE', '16503F7A0E9F469E9B1DED2432C10027');

-- ----------------------------
-- Table structure for SYSLOG
-- ----------------------------
DROP TABLE "RBAC_DB"."SYSLOG";
CREATE TABLE "RBAC_DB"."SYSLOG" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "VISITTIME" TIMESTAMP(6) ,
  "USERNAME" VARCHAR2(50 BYTE) ,
  "IP" VARCHAR2(30 BYTE) ,
  "URL" VARCHAR2(50 BYTE) ,
  "EXECUTIONTIME" NUMBER ,
  "METHOD" VARCHAR2(200 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "SYSLOG"
-- ----------------------------
INSERT INTO "RBAC_DB"."SYSLOG" VALUES ('01FA72702F0B49F982797D9436A95B72', TO_TIMESTAMP('2019-08-09 16:21:22.345000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), 'zhouzhu', '0:0:0:0:0:0:0:1', 'ordersfindAll', '146', '[类名]：com.zhouzhu.cotroller.OrdersController[方法名]：findAll');
INSERT INTO "RBAC_DB"."SYSLOG" VALUES ('863E048E112648E3BF4E04CA2DF91B0D', TO_TIMESTAMP('2019-08-09 16:35:07.629000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), 'zhouzhu', '0:0:0:0:0:0:0:1', 'sysLogfindAll', '42', '[类名]：com.zhouzhu.cotroller.SysLogController[方法名]：findAll');
INSERT INTO "RBAC_DB"."SYSLOG" VALUES ('FDA9C9E335184E7AAA5F6BC13F2B42F9', TO_TIMESTAMP('2019-08-09 16:38:43.075000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), 'zhouzhu', '0:0:0:0:0:0:0:1', 'sysLogfindAll', '8', '[类名]：com.zhouzhu.cotroller.SysLogController[方法名]：findAll');
INSERT INTO "RBAC_DB"."SYSLOG" VALUES ('268977D2B5F04D2CB1D486A3375136FA', TO_TIMESTAMP('2019-08-09 16:39:01.889000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), 'zhouzhu', '0:0:0:0:0:0:0:1', 'sysLogfindAll', '5', '[类名]：com.zhouzhu.cotroller.SysLogController[方法名]：findAll');
INSERT INTO "RBAC_DB"."SYSLOG" VALUES ('A78894BB9B1C42E6B2F1A52DE80F44F4', TO_TIMESTAMP('2019-08-09 16:39:19.080000', 'SYYYY-MM-DD HH24:MI:SS:FF6'), 'zhouzhu', '0:0:0:0:0:0:0:1', 'sysLogfindAll', '5', '[类名]：com.zhouzhu.cotroller.SysLogController[方法名]：findAll');

-- ----------------------------
-- Table structure for TRAVELLER
-- ----------------------------
DROP TABLE "RBAC_DB"."TRAVELLER";
CREATE TABLE "RBAC_DB"."TRAVELLER" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "NAME" VARCHAR2(20 BYTE) ,
  "SEX" VARCHAR2(20 BYTE) ,
  "PHONENUM" VARCHAR2(20 BYTE) ,
  "CREDENTIALSTYPE" NUMBER ,
  "CREDENTIALSNUM" VARCHAR2(50 BYTE) ,
  "TRAVELLERTYPE" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "TRAVELLER"
-- ----------------------------
INSERT INTO "RBAC_DB"."TRAVELLER" VALUES ('3FE27DF2A4E44A6DBC5D0FE4651D3D3E', '张龙', '男', '13333333333', '0', '123456789009876543', '0');
INSERT INTO "RBAC_DB"."TRAVELLER" VALUES ('EE7A71FB6945483FBF91543DBE851960', '张小龙', '男', '15555555555', '0', '987654321123456789', '1');

-- ----------------------------
-- Table structure for USERS
-- ----------------------------
DROP TABLE "RBAC_DB"."USERS";
CREATE TABLE "RBAC_DB"."USERS" (
  "ID" VARCHAR2(32 BYTE) DEFAULT SYS_GUID()  NOT NULL ,
  "EMAIL" VARCHAR2(50 BYTE) NOT NULL ,
  "USERNAME" VARCHAR2(50 BYTE) ,
  "PASSWORD" VARCHAR2(100 BYTE) ,
  "PHONENUM" VARCHAR2(20 BYTE) ,
  "STATUS" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "USERS"
-- ----------------------------
INSERT INTO "RBAC_DB"."USERS" VALUES ('12332124', 'sdf@12sdf', 'zzz', '123', '12345678952', '1');
INSERT INTO "RBAC_DB"."USERS" VALUES ('896F1AB0600845B6939A578EBDD6A268', '6666@qq.com', 'zhouzhu', '$2a$10$MU5/0I4nzGJQKAjQsi7GEuw2t3xa2pjtjT8gY2y3hp8mqdZeX/7L.', '13702478140', '1');
INSERT INTO "RBAC_DB"."USERS" VALUES ('2CFB4683CDAC4E98B8A5428611DE166E', '12345@qq.com', '张三', '$2a$10$8ED8aEE7pI2X8X3.XkJG0eiDyqeiy68ck4TYB6OWuEodtLTs6Hon2', '12345687485', '1');

-- ----------------------------
-- Table structure for USERS_ROLE
-- ----------------------------
DROP TABLE "RBAC_DB"."USERS_ROLE";
CREATE TABLE "RBAC_DB"."USERS_ROLE" (
  "USERID" VARCHAR2(32 BYTE) NOT NULL ,
  "ROLEID" VARCHAR2(32 BYTE) NOT NULL 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of "USERS_ROLE"
-- ----------------------------
INSERT INTO "RBAC_DB"."USERS_ROLE" VALUES ('12332124', '16503F7A0E9F469E9B1DED2432C10027');
INSERT INTO "RBAC_DB"."USERS_ROLE" VALUES ('2CFB4683CDAC4E98B8A5428611DE166E', '12');
INSERT INTO "RBAC_DB"."USERS_ROLE" VALUES ('896F1AB0600845B6939A578EBDD6A268', '12');
INSERT INTO "RBAC_DB"."USERS_ROLE" VALUES ('896F1AB0600845B6939A578EBDD6A268', '13');
INSERT INTO "RBAC_DB"."USERS_ROLE" VALUES ('896F1AB0600845B6939A578EBDD6A268', '16503F7A0E9F469E9B1DED2432C10027');

-- ----------------------------
-- Primary Key structure for table MEMBER
-- ----------------------------
ALTER TABLE "RBAC_DB"."MEMBER" ADD CONSTRAINT "SYS_C005399" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table ORDERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDERS" ADD CONSTRAINT "SYS_C005402" PRIMARY KEY ("ID");

-- ----------------------------
-- Uniques structure for table ORDERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDERS" ADD CONSTRAINT "SYS_C005403" UNIQUE ("ORDERNUM") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table ORDERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDERS" ADD CONSTRAINT "SYS_C005401" CHECK ("ORDERNUM" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Primary Key structure for table ORDER_TRAVELLER
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDER_TRAVELLER" ADD CONSTRAINT "SYS_C005406" PRIMARY KEY ("ORDERID", "TRAVELLERID");

-- ----------------------------
-- Primary Key structure for table PERMISSION
-- ----------------------------
ALTER TABLE "RBAC_DB"."PERMISSION" ADD CONSTRAINT "SYS_C005416" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table PRODUCT
-- ----------------------------
ALTER TABLE "RBAC_DB"."PRODUCT" ADD CONSTRAINT "SYS_C005397" PRIMARY KEY ("ID");

-- ----------------------------
-- Uniques structure for table PRODUCT
-- ----------------------------
ALTER TABLE "RBAC_DB"."PRODUCT" ADD CONSTRAINT "PRODUCT" UNIQUE ("ID", "PRODUCTNUM") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table PRODUCT
-- ----------------------------
ALTER TABLE "RBAC_DB"."PRODUCT" ADD CONSTRAINT "SYS_C005396" CHECK ("PRODUCTNUM" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Primary Key structure for table ROLE
-- ----------------------------
ALTER TABLE "RBAC_DB"."ROLE" ADD CONSTRAINT "SYS_C005412" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table ROLE_PERMISSION
-- ----------------------------
ALTER TABLE "RBAC_DB"."ROLE_PERMISSION" ADD CONSTRAINT "SYS_C005417" PRIMARY KEY ("PERMISSIONID", "ROLEID");

-- ----------------------------
-- Primary Key structure for table SYSLOG
-- ----------------------------
ALTER TABLE "RBAC_DB"."SYSLOG" ADD CONSTRAINT "SYS_C005420" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table TRAVELLER
-- ----------------------------
ALTER TABLE "RBAC_DB"."TRAVELLER" ADD CONSTRAINT "SYS_C005400" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table USERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."USERS" ADD CONSTRAINT "SYS_C005410" PRIMARY KEY ("ID");

-- ----------------------------
-- Uniques structure for table USERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."USERS" ADD CONSTRAINT "SYS_C005411" UNIQUE ("EMAIL") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table USERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."USERS" ADD CONSTRAINT "SYS_C005409" CHECK ("EMAIL" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Primary Key structure for table USERS_ROLE
-- ----------------------------
ALTER TABLE "RBAC_DB"."USERS_ROLE" ADD CONSTRAINT "SYS_C005413" PRIMARY KEY ("USERID", "ROLEID");

-- ----------------------------
-- Foreign Keys structure for table ORDERS
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDERS" ADD CONSTRAINT "SYS_C005404" FOREIGN KEY ("PRODUCTID") REFERENCES "PRODUCT" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "RBAC_DB"."ORDERS" ADD CONSTRAINT "SYS_C005405" FOREIGN KEY ("MEMBERID") REFERENCES "MEMBER" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Foreign Keys structure for table ORDER_TRAVELLER
-- ----------------------------
ALTER TABLE "RBAC_DB"."ORDER_TRAVELLER" ADD CONSTRAINT "SYS_C005407" FOREIGN KEY ("ORDERID") REFERENCES "ORDERS" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "RBAC_DB"."ORDER_TRAVELLER" ADD CONSTRAINT "SYS_C005408" FOREIGN KEY ("TRAVELLERID") REFERENCES "TRAVELLER" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Foreign Keys structure for table ROLE_PERMISSION
-- ----------------------------
ALTER TABLE "RBAC_DB"."ROLE_PERMISSION" ADD CONSTRAINT "SYS_C005418" FOREIGN KEY ("PERMISSIONID") REFERENCES "PERMISSION" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "RBAC_DB"."ROLE_PERMISSION" ADD CONSTRAINT "SYS_C005419" FOREIGN KEY ("ROLEID") REFERENCES "ROLE" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Foreign Keys structure for table USERS_ROLE
-- ----------------------------
ALTER TABLE "RBAC_DB"."USERS_ROLE" ADD CONSTRAINT "SYS_C005414" FOREIGN KEY ("USERID") REFERENCES "USERS" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "RBAC_DB"."USERS_ROLE" ADD CONSTRAINT "SYS_C005415" FOREIGN KEY ("ROLEID") REFERENCES "ROLE" ("ID") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
