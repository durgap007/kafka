package kafkapoc;


import kafkapoc.oracle_db_subscriber.row1Struct;
import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

//publisher imports
//import util.properties packages
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
//import simple producer packages
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
//import KafkaProducer packages
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.serialization.ByteArraySerializer;
//import ProducerRecord packages
import org.apache.kafka.clients.producer.ProducerConfig;


public class kafka_oracle_consumer {
	
	//Prepare prepared statement:
	
	//Starting point of the consumer
	public static void main(String[] args){
		
		System.out.println("Started consumer..");
		kafka_oracle_consumer koc = new kafka_oracle_consumer();
		
		int j = 1;
		koc.tOracleInput_1Process();
		j=0;
		
		if(j==0){
			System.out.println("Successfully completed");
		}else{
			System.out.println("Failed");
		}
		
	}
	
	//Create Target Database connection and sql statement
	public java.sql.PreparedStatement prepareTargetdb()
	{
		java.sql.PreparedStatement pstmt_tOracleOutput_1 = null;
		try {
	

		int tos_count_tOracleOutput_1 = 0;


		// optional table
		String dbschema_tOracleOutput_1 = null;
		String tableName_tOracleOutput_1 = null;
		String driverClass_tOracleOutput_1 = "oracle.jdbc.OracleDriver";

		java.lang.Class.forName(driverClass_tOracleOutput_1);
		String url_tOracleOutput_1 = null;
		url_tOracleOutput_1 = "jdbc:oracle:thin:@" + "10.100.6.23"
				+ ":" + "1202" + ":" + "DEMODB";
		String dbUser_tOracleOutput_1 = "PVD_STAGE_DATAHUB31";

		final String decryptedPassword_tOracleOutput_1 = routines.system.PasswordEncryptUtil
				.decryptPassword("568eb830737d4d92");

		String dbPwd_tOracleOutput_1 = decryptedPassword_tOracleOutput_1;
		dbschema_tOracleOutput_1 = "PVD_STAGE_DATAHUB31";

		java.sql.Connection conn_tOracleOutput_1 = null;
		conn_tOracleOutput_1 = java.sql.DriverManager.getConnection(
				url_tOracleOutput_1, dbUser_tOracleOutput_1,
				dbPwd_tOracleOutput_1);
		
		conn_tOracleOutput_1.setAutoCommit(true);
	

		if (dbschema_tOracleOutput_1 == null
				|| dbschema_tOracleOutput_1.trim().length() == 0) {
			tableName_tOracleOutput_1 = ("case_master");
		} else {
			tableName_tOracleOutput_1 = dbschema_tOracleOutput_1 + "."
					+ ("case_master");
		}
		
		
		/*
		//DROP TABLE
		java.sql.Statement stmtDrop_tOracleOutput_1 = conn_tOracleOutput_1.createStatement();		
		stmtDrop_tOracleOutput_1.execute("DROP TABLE "+ tableName_tOracleOutput_1 + "");
		stmtDrop_tOracleOutput_1.close();
		
		
		//CREATE TABLE
		java.sql.Statement stmtCreate_tOracleOutput_1 = conn_tOracleOutput_1.createStatement();		
		stmtCreate_tOracleOutput_1
				.execute("CREATE TABLE "
						+ tableName_tOracleOutput_1
						+ "(CASE_ID NUMBER  not null ,CASE_NUM VARCHAR2(20)  ,REV NUMBER ,WORKFLOW_SEQ_NUM NUMBER ,LAST_WORKFLOW_SEQ_NUM NUMBER ,CREATE_TIME DATE ,INIT_REPT_DATE DATE  not null ,USER_ID NUMBER ,LAST_UPDATE_TIME DATE ,LAST_UPDATE_USER_ID NUMBER  not null ,REQUIRES_FOLLOWUP NUMBER default 0  not null ,FOLLOWUP_DATE DATE ,OWNER_ID NUMBER default 0 ,STATE_ID NUMBER ,COUNTRY_ID NUMBER ,LANG_ID NUMBER ,PRIORITY NUMBER ,SITE_ID NUMBER ,SERIOUSNESS NUMBER ,RPT_TYPE_ID NUMBER ,LAST_STATE_ID NUMBER ,ASSESSMENT_NEEDED NUMBER default 0 ,PRIORITY_OVERRIDE NUMBER(1,0)  ,SID VARCHAR2(128)  ,SAFETY_DATE DATE ,NORMAL_TIME DATE ,MAX_TIME DATE ,REPORT_SCHEDULING NUMBER default 0 ,PRIORITY_ASSESSMENT NUMBER default 0 ,CLOSE_USER_ID NUMBER ,CLOSE_DATE DATE ,CLOSE_NOTES VARCHAR2(200)  ,DATE_LOCKED DATE ,UD_TEXT_1 VARCHAR2(100)  ,UD_TEXT_2 VARCHAR2(100)  ,UD_TEXT_3 VARCHAR2(100)  ,UD_TEXT_4 VARCHAR2(100)  ,UD_TEXT_5 VARCHAR2(100)  ,UD_TEXT_6 VARCHAR2(100)  ,UD_TEXT_7 VARCHAR2(100)  ,UD_TEXT_8 VARCHAR2(100)  ,UD_TEXT_9 VARCHAR2(100)  ,UD_TEXT_10 VARCHAR2(100)  ,UD_TEXT_11 VARCHAR2(100)  ,UD_TEXT_12 VARCHAR2(100)  ,UD_DATE_1 DATE ,UD_DATE_2 DATE ,UD_DATE_3 DATE ,UD_DATE_4 DATE ,UD_DATE_5 DATE ,UD_DATE_6 DATE ,UD_DATE_7 DATE ,UD_DATE_8 DATE ,UD_DATE_9 DATE ,UD_DATE_10 DATE ,UD_DATE_11 DATE ,UD_DATE_12 DATE ,UD_NUMBER_1 NUMBER(30,10)  ,UD_NUMBER_2 NUMBER(30,10)  ,UD_NUMBER_3 NUMBER(30,10)  ,UD_NUMBER_4 NUMBER(30,10)  ,UD_NUMBER_5 NUMBER(30,10)  ,UD_NUMBER_6 NUMBER(30,10)  ,UD_NUMBER_7 NUMBER(30,10)  ,UD_NUMBER_8 NUMBER(30,10)  ,UD_NUMBER_9 NUMBER(30,10)  ,UD_NUMBER_10 NUMBER(30,10)  ,UD_NUMBER_11 NUMBER(30,10)  ,UD_NUMBER_12 NUMBER(30,10)  ,DELETED DATE ,DUE_SOON DATE ,GLOBAL_NUM VARCHAR2(20)  ,PRIORITY_DATE_ASSESSED DATE ,LAM_ASSESS_DONE NUMBER(1,0)  default 0  not null ,E2B_WW_NUMBER VARCHAR2(100)  ,WORKLIST_OWNER_ID NUMBER ,SUSAR NUMBER default 0 ,LAST_UPDATE_EVENT DATE ,INITIAL_JUSTIFICATION VARCHAR2(1000)  ,FORCE_SOON DATE ,DUE_SOON_J DATE ,FOLLOWUP_DATE_J DATE ,INIT_REPT_DATE_J DATE ,JUST_INIT_REPT_DATE_J VARCHAR2(1000)  ,UD_TEXT_1_J VARCHAR2(100)  ,UD_TEXT_2_J VARCHAR2(100)  ,UD_TEXT_3_J VARCHAR2(100)  ,UD_TEXT_4_J VARCHAR2(100)  ,UD_TEXT_5_J VARCHAR2(100)  ,UD_TEXT_6_J VARCHAR2(100)  ,UD_TEXT_7_J VARCHAR2(100)  ,UD_TEXT_8_J VARCHAR2(100)  ,UD_TEXT_9_J VARCHAR2(100)  ,UD_TEXT_10_J VARCHAR2(100)  ,UD_TEXT_11_J VARCHAR2(100)  ,UD_TEXT_12_J VARCHAR2(100)  ,INITIAL_JUSTIFICATION_J VARCHAR2(1000)  ,LOCK_STATUS_ID NUMBER default 1  not null ,MEDICALLY_CONFIRM NUMBER ,ENTERPRISE_ID NUMBER default SYS_CONTEXT('Argus_ctx','enterprise_id')  not null ,primary key(CASE_ID))");
		stmtCreate_tOracleOutput_1.close();
		*/
		
		//INSERT TABLE
		String insert_tOracleOutput_1 = "INSERT INTO "
				+ tableName_tOracleOutput_1
				+ " (CASE_ID,CASE_NUM,REV,WORKFLOW_SEQ_NUM,LAST_WORKFLOW_SEQ_NUM,CREATE_TIME,INIT_REPT_DATE,USER_ID,LAST_UPDATE_TIME,LAST_UPDATE_USER_ID,REQUIRES_FOLLOWUP,FOLLOWUP_DATE,OWNER_ID,STATE_ID,COUNTRY_ID,LANG_ID,PRIORITY,SITE_ID,SERIOUSNESS,RPT_TYPE_ID,LAST_STATE_ID,ASSESSMENT_NEEDED,PRIORITY_OVERRIDE,SID,SAFETY_DATE,NORMAL_TIME,MAX_TIME,REPORT_SCHEDULING,PRIORITY_ASSESSMENT,CLOSE_USER_ID,CLOSE_DATE,CLOSE_NOTES,DATE_LOCKED,UD_TEXT_1,UD_TEXT_2,UD_TEXT_3,UD_TEXT_4,UD_TEXT_5,UD_TEXT_6,UD_TEXT_7,UD_TEXT_8,UD_TEXT_9,UD_TEXT_10,UD_TEXT_11,UD_TEXT_12,UD_DATE_1,UD_DATE_2,UD_DATE_3,UD_DATE_4,UD_DATE_5,UD_DATE_6,UD_DATE_7,UD_DATE_8,UD_DATE_9,UD_DATE_10,UD_DATE_11,UD_DATE_12,UD_NUMBER_1,UD_NUMBER_2,UD_NUMBER_3,UD_NUMBER_4,UD_NUMBER_5,UD_NUMBER_6,UD_NUMBER_7,UD_NUMBER_8,UD_NUMBER_9,UD_NUMBER_10,UD_NUMBER_11,UD_NUMBER_12,DELETED,DUE_SOON,GLOBAL_NUM,PRIORITY_DATE_ASSESSED,LAM_ASSESS_DONE,E2B_WW_NUMBER,WORKLIST_OWNER_ID,SUSAR,LAST_UPDATE_EVENT,INITIAL_JUSTIFICATION,FORCE_SOON,DUE_SOON_J,FOLLOWUP_DATE_J,INIT_REPT_DATE_J,JUST_INIT_REPT_DATE_J,UD_TEXT_1_J,UD_TEXT_2_J,UD_TEXT_3_J,UD_TEXT_4_J,UD_TEXT_5_J,UD_TEXT_6_J,UD_TEXT_7_J,UD_TEXT_8_J,UD_TEXT_9_J,UD_TEXT_10_J,UD_TEXT_11_J,UD_TEXT_12_J,INITIAL_JUSTIFICATION_J,LOCK_STATUS_ID,MEDICALLY_CONFIRM,ENTERPRISE_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	
		pstmt_tOracleOutput_1 = conn_tOracleOutput_1.prepareStatement(insert_tOracleOutput_1);
		
		}
		catch (SQLException e) {

			e.printStackTrace();

		} 
		catch (java.lang.Exception e) {

			e.printStackTrace();

		} catch (java.lang.Error error) {

			throw error;
		}
		
		System.out.println("Successfully prepared target..");
		return pstmt_tOracleOutput_1;
		
	}
	
	//Initialize Kafka consumer
	public Consumer<String, row1Struct> initKafkaConsumer()
	{
		
		System.out.println("Initializing Kafka consumer..");
	    String topicName = "Durga-Topic";//args[0].toString();
	     
	    // create instance for properties to access producer configs   
	      Properties props = new Properties();
	      props.put("bootstrap.servers", "localhost:9092");
	      props.put("enable.auto.commit", "true");
	      props.put("auto.commit.interval.ms", "1000");
	      props.put("auto.offset.reset", "latest");
	      props.put("bootstrap.servers", "localhost:9092");
	      props.put("group.id", "mygroup");
	      props.put("enable.auto.commit", "true");	  
	      props.put("security.protocol", "PLAINTEXT");
	      props.put("session.timeout.ms", "30000");
	      props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
	      props.put("value.deserializer","kafkapoc.row1StructDeserializer"); 
	    
	   
	    
	    final Consumer<String, row1Struct> consumer = new KafkaConsumer<>(props);
	    consumer.subscribe(Collections.singletonList(topicName));
	    return consumer;
	      
	}
	
	//Bind records to DB object and persist into target DB
	public void updateTargetDb(java.sql.PreparedStatement pstmt_tOracleOutput_2,kafkapoc.row1Struct row1)
	{
		
		System.out.println("DURGA ROWS from updateTargetDb:"+row1.toString());
/////////////////////////////////////////////////////////////////////////			
		try
		{
			java.sql.PreparedStatement pstmt_tOracleOutput_1 = pstmt_tOracleOutput_2;
			
			System.out.println("CASENUM:"+row1.CASE_NUM);
			
			pstmt_tOracleOutput_1.setBigDecimal(1, row1.CASE_ID);
	
			if (row1.CASE_NUM == null) {
				pstmt_tOracleOutput_1.setNull(2,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(2, row1.CASE_NUM);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(3, row1.REV);
	
			pstmt_tOracleOutput_1.setBigDecimal(4,row1.WORKFLOW_SEQ_NUM);
	
			pstmt_tOracleOutput_1.setBigDecimal(5,row1.LAST_WORKFLOW_SEQ_NUM);
	
			if (row1.CREATE_TIME != null) {
				pstmt_tOracleOutput_1.setObject(6,new java.sql.Timestamp(row1.CREATE_TIME.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(6,java.sql.Types.DATE);
			}
	
			if (row1.INIT_REPT_DATE != null) {
				pstmt_tOracleOutput_1.setObject(7,new java.sql.Timestamp(row1.INIT_REPT_DATE.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(7,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(8, row1.USER_ID);
	
			if (row1.LAST_UPDATE_TIME != null) {
				pstmt_tOracleOutput_1.setObject(9,new java.sql.Timestamp(row1.LAST_UPDATE_TIME.getTime()),java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(9,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(10,row1.LAST_UPDATE_USER_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(11,row1.REQUIRES_FOLLOWUP);
	
			if (row1.FOLLOWUP_DATE != null) {
				pstmt_tOracleOutput_1.setObject(12,new java.sql.Timestamp(row1.FOLLOWUP_DATE.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(12,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(13, row1.OWNER_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(14, row1.STATE_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(15, row1.COUNTRY_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(16, row1.LANG_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(17, row1.PRIORITY);
	
			pstmt_tOracleOutput_1.setBigDecimal(18, row1.SITE_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(19,row1.SERIOUSNESS);
	
			pstmt_tOracleOutput_1.setBigDecimal(20,row1.RPT_TYPE_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(21,row1.LAST_STATE_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(22,row1.ASSESSMENT_NEEDED);
	
			pstmt_tOracleOutput_1.setBigDecimal(23,row1.PRIORITY_OVERRIDE);
	
			if (row1.SID == null) {
				pstmt_tOracleOutput_1.setNull(24,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(24, row1.SID);
			}
	
			if (row1.SAFETY_DATE != null) {
				pstmt_tOracleOutput_1.setObject(25,new java.sql.Timestamp(row1.SAFETY_DATE.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(25,java.sql.Types.DATE);
			}
	
			if (row1.NORMAL_TIME != null) {
				pstmt_tOracleOutput_1.setObject(26,new java.sql.Timestamp(row1.NORMAL_TIME.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(26,java.sql.Types.DATE);
			}
	
			if (row1.MAX_TIME != null) {
				pstmt_tOracleOutput_1.setObject(27,new java.sql.Timestamp(row1.MAX_TIME.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(27,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(28,row1.REPORT_SCHEDULING);
	
			pstmt_tOracleOutput_1.setBigDecimal(29,row1.PRIORITY_ASSESSMENT);
	
			pstmt_tOracleOutput_1.setBigDecimal(30,row1.CLOSE_USER_ID);
	
			if (row1.CLOSE_DATE != null) {
				pstmt_tOracleOutput_1.setObject(31,new java.sql.Timestamp(row1.CLOSE_DATE.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(31,java.sql.Types.DATE);
			}
	
			if (row1.CLOSE_NOTES == null) {
				pstmt_tOracleOutput_1.setNull(32,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(32,row1.CLOSE_NOTES);
			}
	
			if (row1.DATE_LOCKED != null) {
				pstmt_tOracleOutput_1.setObject(33,new java.sql.Timestamp(row1.DATE_LOCKED.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(33,java.sql.Types.DATE);
			}
	
			if (row1.UD_TEXT_1 == null) {
				pstmt_tOracleOutput_1.setNull(34,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(34, row1.UD_TEXT_1);
			}
	
			if (row1.UD_TEXT_2 == null) {
				pstmt_tOracleOutput_1.setNull(35,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(35, row1.UD_TEXT_2);
			}
	
			if (row1.UD_TEXT_3 == null) {
				pstmt_tOracleOutput_1.setNull(36,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(36, row1.UD_TEXT_3);
			}
	
			if (row1.UD_TEXT_4 == null) {
				pstmt_tOracleOutput_1.setNull(37,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(37, row1.UD_TEXT_4);
			}
	
			if (row1.UD_TEXT_5 == null) {
				pstmt_tOracleOutput_1.setNull(38,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(38, row1.UD_TEXT_5);
			}
	
			if (row1.UD_TEXT_6 == null) {
				pstmt_tOracleOutput_1.setNull(39,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(39, row1.UD_TEXT_6);
			}
	
			if (row1.UD_TEXT_7 == null) {
				pstmt_tOracleOutput_1.setNull(40,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(40, row1.UD_TEXT_7);
			}
	
			if (row1.UD_TEXT_8 == null) {
				pstmt_tOracleOutput_1.setNull(41,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(41, row1.UD_TEXT_8);
			}
	
			if (row1.UD_TEXT_9 == null) {
				pstmt_tOracleOutput_1.setNull(42,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(42, row1.UD_TEXT_9);
			}
	
			if (row1.UD_TEXT_10 == null) {
				pstmt_tOracleOutput_1.setNull(43,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(43, row1.UD_TEXT_10);
			}
	
			if (row1.UD_TEXT_11 == null) {
				pstmt_tOracleOutput_1.setNull(44,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(44, row1.UD_TEXT_11);
			}
	
			if (row1.UD_TEXT_12 == null) {
				pstmt_tOracleOutput_1.setNull(45,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(45, row1.UD_TEXT_12);
			}
	
			if (row1.UD_DATE_1 != null) {
				pstmt_tOracleOutput_1.setObject(46,new java.sql.Timestamp(row1.UD_DATE_1.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(46,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_2 != null) {
				pstmt_tOracleOutput_1.setObject(47,new java.sql.Timestamp(row1.UD_DATE_2.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(47,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_3 != null) {
				pstmt_tOracleOutput_1.setObject(48,new java.sql.Timestamp(row1.UD_DATE_3.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(48,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_4 != null) {
				pstmt_tOracleOutput_1.setObject(49,new java.sql.Timestamp(row1.UD_DATE_4.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(49,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_5 != null) {
				pstmt_tOracleOutput_1.setObject(50,new java.sql.Timestamp(row1.UD_DATE_5.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(50,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_6 != null) {
				pstmt_tOracleOutput_1.setObject(51,new java.sql.Timestamp(row1.UD_DATE_6.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(51,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_7 != null) {
				pstmt_tOracleOutput_1.setObject(52,new java.sql.Timestamp(row1.UD_DATE_7.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(52,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_8 != null) {
				pstmt_tOracleOutput_1.setObject(53,new java.sql.Timestamp(row1.UD_DATE_8.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(53,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_9 != null) {
				pstmt_tOracleOutput_1.setObject(54,new java.sql.Timestamp(row1.UD_DATE_9.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(54,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_10 != null) {
				pstmt_tOracleOutput_1.setObject(55,new java.sql.Timestamp(row1.UD_DATE_10.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(55,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_11 != null) {
				pstmt_tOracleOutput_1.setObject(56,new java.sql.Timestamp(row1.UD_DATE_11.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(56,java.sql.Types.DATE);
			}
	
			if (row1.UD_DATE_12 != null) {
				pstmt_tOracleOutput_1.setObject(57,new java.sql.Timestamp(row1.UD_DATE_12.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(57,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(58,row1.UD_NUMBER_1);
	
			pstmt_tOracleOutput_1.setBigDecimal(59,row1.UD_NUMBER_2);
	
			pstmt_tOracleOutput_1.setBigDecimal(60,row1.UD_NUMBER_3);
	
			pstmt_tOracleOutput_1.setBigDecimal(61,row1.UD_NUMBER_4);
	
			pstmt_tOracleOutput_1.setBigDecimal(62,row1.UD_NUMBER_5);
	
			pstmt_tOracleOutput_1.setBigDecimal(63,row1.UD_NUMBER_6);
	
			pstmt_tOracleOutput_1.setBigDecimal(64,row1.UD_NUMBER_7);
	
			pstmt_tOracleOutput_1.setBigDecimal(65,row1.UD_NUMBER_8);
	
			pstmt_tOracleOutput_1.setBigDecimal(66,row1.UD_NUMBER_9);
	
			pstmt_tOracleOutput_1.setBigDecimal(67,row1.UD_NUMBER_10);
	
			pstmt_tOracleOutput_1.setBigDecimal(68,row1.UD_NUMBER_11);
	
			pstmt_tOracleOutput_1.setBigDecimal(69,row1.UD_NUMBER_12);
	
			if (row1.DELETED != null) {
				pstmt_tOracleOutput_1.setObject(70,new java.sql.Timestamp(row1.DELETED.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(70,java.sql.Types.DATE);
			}
	
			if (row1.DUE_SOON != null) {
				pstmt_tOracleOutput_1.setObject(71,
						new java.sql.Timestamp(row1.DUE_SOON.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(71,java.sql.Types.DATE);
			}
	
			if (row1.GLOBAL_NUM == null) {
				pstmt_tOracleOutput_1.setNull(72,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(72, row1.GLOBAL_NUM);
			}
	
			if (row1.PRIORITY_DATE_ASSESSED != null) {
				pstmt_tOracleOutput_1.setObject(73,new java.sql.Timestamp(row1.PRIORITY_DATE_ASSESSED.getTime()),java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(73,java.sql.Types.DATE);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(74,row1.LAM_ASSESS_DONE);
	
			if (row1.E2B_WW_NUMBER == null) {
				pstmt_tOracleOutput_1.setNull(75,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(75,row1.E2B_WW_NUMBER);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(76,row1.WORKLIST_OWNER_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(77, row1.SUSAR);
	
			if (row1.LAST_UPDATE_EVENT != null) {
				pstmt_tOracleOutput_1.setObject(78,new java.sql.Timestamp(row1.LAST_UPDATE_EVENT.getTime()),java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(78,java.sql.Types.DATE);
			}
	
			if (row1.INITIAL_JUSTIFICATION == null) {
				pstmt_tOracleOutput_1.setNull(79,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(79,row1.INITIAL_JUSTIFICATION);
			}
	
			if (row1.FORCE_SOON != null) {
				pstmt_tOracleOutput_1.setObject(80,new java.sql.Timestamp(row1.FORCE_SOON.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(80,java.sql.Types.DATE);
			}
	
			if (row1.DUE_SOON_J != null) {
				pstmt_tOracleOutput_1.setObject(81,new java.sql.Timestamp(row1.DUE_SOON_J.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(81,java.sql.Types.DATE);
			}
	
			if (row1.FOLLOWUP_DATE_J != null) {
				pstmt_tOracleOutput_1.setObject(82,new java.sql.Timestamp(row1.FOLLOWUP_DATE_J.getTime()), java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(82,java.sql.Types.DATE);
			}
	
			if (row1.INIT_REPT_DATE_J != null) {
				pstmt_tOracleOutput_1.setObject(83,new java.sql.Timestamp(row1.INIT_REPT_DATE_J.getTime()),java.sql.Types.DATE);
			} else {
				pstmt_tOracleOutput_1.setNull(83,java.sql.Types.DATE);
			}
	
			if (row1.JUST_INIT_REPT_DATE_J == null) {
				pstmt_tOracleOutput_1.setNull(84,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(84,row1.JUST_INIT_REPT_DATE_J);
			}
	
			if (row1.UD_TEXT_1_J == null) {
				pstmt_tOracleOutput_1.setNull(85,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(85,row1.UD_TEXT_1_J);
			}
	
			if (row1.UD_TEXT_2_J == null) {
				pstmt_tOracleOutput_1.setNull(86,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(86,row1.UD_TEXT_2_J);
			}
	
			if (row1.UD_TEXT_3_J == null) {
				pstmt_tOracleOutput_1.setNull(87,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(87,row1.UD_TEXT_3_J);
			}
	
			if (row1.UD_TEXT_4_J == null) {
				pstmt_tOracleOutput_1.setNull(88,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(88,row1.UD_TEXT_4_J);
			}
	
			if (row1.UD_TEXT_5_J == null) {
				pstmt_tOracleOutput_1.setNull(89,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(89,row1.UD_TEXT_5_J);
			}
	
			if (row1.UD_TEXT_6_J == null) {
				pstmt_tOracleOutput_1.setNull(90,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(90,row1.UD_TEXT_6_J);
			}
	
			if (row1.UD_TEXT_7_J == null) {
				pstmt_tOracleOutput_1.setNull(91,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(91,row1.UD_TEXT_7_J);
			}
	
			if (row1.UD_TEXT_8_J == null) {
				pstmt_tOracleOutput_1.setNull(92,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(92,row1.UD_TEXT_8_J);
			}
	
			if (row1.UD_TEXT_9_J == null) {
				pstmt_tOracleOutput_1.setNull(93,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(93,row1.UD_TEXT_9_J);
			}
	
			if (row1.UD_TEXT_10_J == null) {
				pstmt_tOracleOutput_1.setNull(94,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(94,row1.UD_TEXT_10_J);
			}
	
			if (row1.UD_TEXT_11_J == null) {
				pstmt_tOracleOutput_1.setNull(95,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(95,row1.UD_TEXT_11_J);
			}
	
			if (row1.UD_TEXT_12_J == null) {
				pstmt_tOracleOutput_1.setNull(96,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(96,row1.UD_TEXT_12_J);
			}
	
			if (row1.INITIAL_JUSTIFICATION_J == null) {
				pstmt_tOracleOutput_1.setNull(97,java.sql.Types.VARCHAR);
			} else {
				pstmt_tOracleOutput_1.setString(97,row1.INITIAL_JUSTIFICATION_J);
			}
	
			pstmt_tOracleOutput_1.setBigDecimal(98,row1.LOCK_STATUS_ID);
	
			pstmt_tOracleOutput_1.setBigDecimal(99,row1.MEDICALLY_CONFIRM);
	
			pstmt_tOracleOutput_1.setBigDecimal(100,row1.ENTERPRISE_ID);
	
						
			try{
				int i=pstmt_tOracleOutput_1.executeUpdate();
				//System.out.println(i+" records inserted");  
				
				//pstmt_tOracleOutput_1.close();
				
			}catch(java.sql.SQLException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		
	}catch (java.lang.Exception e) {

		e.printStackTrace();

		//throw te;
	} catch (java.lang.Error error) {

		throw error;
	}
		//System.out.println("Successfully inserted into target -> updateTargetDb");
		
	}
	
	//Loop process
	public void tOracleInput_1Process()
	{
		System.out.println("Started consumer..");
		
		Consumer<String, row1Struct> consumer = initKafkaConsumer();
		      
	    //print the topic name
	    System.out.println("Subscribed to topic " + "Durga-Topic");
		
			
	    java.sql.PreparedStatement pstmt_tOracleOutput_2 = null; 
	    pstmt_tOracleOutput_2 = prepareTargetdb();
		int i =0;	
	      try {
    		  while (true) { //make it to ture to run in infinite loop
    			  
    			
    		    ConsumerRecords<String, row1Struct> records = consumer.poll(2); //make it to 500 if needed to consume at once
    		    
    		    if(pstmt_tOracleOutput_2==null){
    		    	pstmt_tOracleOutput_2 = prepareTargetdb();
    		    }
    		    for (ConsumerRecord<String, row1Struct> record : records){
    		      System.out.println("Getting from Kafka:"+record.offset() + ": " + record.value());
    		      
    		     // row1Struct row1 = new row1Struct();
    		     // row1=record.value();
    		      kafkapoc.row1Struct row1 = kafkapoc.row1Struct.class.cast(record.value());
    		      updateTargetDb(pstmt_tOracleOutput_2,row1);
    		      i++;
    		      System.out.println(i +" Record inserted");
    		    } 
    		    
    		   /* try{
    		    	pstmt_tOracleOutput_1.close();
    		    }
    		    catch(SQLException e){
    		    	e.printStackTrace();
    		    }*/
    		    consumer.commitSync();
    		  }
    		  
    		} finally {
    		  consumer.close();
    		}
	      
	      
	}
	
	

}
