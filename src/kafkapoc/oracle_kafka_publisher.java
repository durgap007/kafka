package kafkapoc;

import java.sql.SQLException;


import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import kafkapoc.oracle_db_link.row1Struct;

public class oracle_kafka_publisher {
	
	//Starting point of the publisher
	public static void main(String[] args){
		
		System.out.println("Started oracle-kafka publisher ..");
		oracle_kafka_publisher okp = new oracle_kafka_publisher();
		
		
		
		try{
			
			row1Struct row1 = new row1Struct();
			
			java.sql.Connection conn_tOracleOutput_1 = null;
			int tos_count_tOracleOutput_1 = 0;
			//Initialize DB
			java.sql.Statement pstmt_tOracleInput_1 = okp.prepareSourcedb();
			//Initialize Kafka
			Producer<String,row1Struct> producer = okp.initKafkaPublisher();
			
			
			try  {
				
				okp.publishSourceDb(pstmt_tOracleInput_1, producer);
				//producer.send(new ProducerRecord<String,row1Struct>("Durga-Topic",row1));
				   System.out.println("Message " + row1.toString() + " sent !!");
				} catch (Exception e) {
				   e.printStackTrace();
				}			
					
		}
		catch (java.lang.Exception e) {

			e.printStackTrace();

		} catch (java.lang.Error error) {

			throw error;
		}
		
		System.out.println("Successfully published");		
		
		
	}
	
	public void publishSourceDb(java.sql.Statement stmt,Producer<String,row1Struct> producer){
		
		java.sql.Statement stmt_tOracleInput_1 = stmt;
		java.sql.ResultSet rs_tOracleInput_1 = null;
		
		String dbquery_tOracleInput_1 = "SELECT \n  ARGUS_APP.CASE_MASTER.CASE_ID, \n  ARGUS_APP.CASE_MASTER.CASE_NUM, \n  ARGUS_APP.CASE_MASTER.REV, \n  ARGUS_APP.CASE_MASTER.WORKFLOW_SEQ_NUM, \n  ARGUS_APP.CASE_MASTER.LAST_WORKFLOW_SEQ_NUM, \n  ARGUS_APP.CASE_MASTER.CREATE_TIME, \n  ARGUS_APP.CASE_MASTER.INIT_REPT_DATE, \n  ARGUS_APP.CASE_MASTER.\"USER_ID\", \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_TIME, \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_USER_ID, \n  ARGUS_APP.CASE_MASTER.REQUIRES_FOLLOWUP, \n  ARGUS_APP.CASE_MASTER.FOLLOWUP_DATE, \n  ARGUS_APP.CASE_MASTER.OWNER_ID, \n  ARGUS_APP.CASE_MASTER.STATE_ID, \n  ARGUS_APP.CASE_MASTER.COUNTRY_ID, \n  ARGUS_APP.CASE_MASTER.LANG_ID, \n  ARGUS_APP.CASE_MASTER.PRIORITY, \n  ARGUS_APP.CASE_MASTER.SITE_ID, \n  ARGUS_APP.CASE_MASTER.SERIOUSNESS, \n  ARGUS_APP.CASE_MASTER.RPT_TYPE_ID, \n  ARGUS_APP.CASE_MASTER.LAST_STATE_ID, \n  ARGUS_APP.CASE_MASTER.ASSESSMENT_NEEDED, \n  ARGUS_APP.CASE_MASTER.PRIORITY_OVERRIDE, \n  ARGUS_APP.CASE_MASTER.SID, \n  ARGUS_APP.CASE_MASTER.SAFETY_DATE, \n  ARGUS_APP.CASE_MASTER.NORMAL_TIME, \n  ARGUS_APP.CASE_MASTER.MAX_TIME, \n  ARGUS_APP.CASE_MASTER.REPORT_SCHEDULING, \n  ARGUS_APP.CASE_MASTER.PRIORITY_ASSESSMENT, \n  ARGUS_APP.CASE_MASTER.CLOSE_USER_ID, \n  ARGUS_APP.CASE_MASTER.CLOSE_DATE, \n  ARGUS_APP.CASE_MASTER.CLOSE_NOTES, \n  ARGUS_APP.CASE_MASTER.DATE_LOCKED, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_1, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_2, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_3, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_4, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_5, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_6, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_7, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_8, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_9, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_10, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_11, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_12, \n  ARGUS_APP.CASE_MASTER.UD_DATE_1, \n  ARGUS_APP.CASE_MASTER.UD_DATE_2, \n  ARGUS_APP.CASE_MASTER.UD_DATE_3, \n  ARGUS_APP.CASE_MASTER.UD_DATE_4, \n  ARGUS_APP.CASE_MASTER.UD_DATE_5, \n  ARGUS_APP.CASE_MASTER.UD_DATE_6, \n  ARGUS_APP.CASE_MASTER.UD_DATE_7, \n  ARGUS_APP.CASE_MASTER.UD_DATE_8, \n  ARGUS_APP.CASE_MASTER.UD_DATE_9, \n  ARGUS_APP.CASE_MASTER.UD_DATE_10, \n  ARGUS_APP.CASE_MASTER.UD_DATE_11, \n  ARGUS_APP.CASE_MASTER.UD_DATE_12, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_1, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_2, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_3, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_4, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_5, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_6, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_7, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_8, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_9, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_10, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_11, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_12, \n  ARGUS_APP.CASE_MASTER.DELETED, \n  ARGUS_APP.CASE_MASTER.DUE_SOON, \n  ARGUS_APP.CASE_MASTER.GLOBAL_NUM, \n  ARGUS_APP.CASE_MASTER.PRIORITY_DATE_ASSESSED, \n  ARGUS_APP.CASE_MASTER.LAM_ASSESS_DONE, \n  ARGUS_APP.CASE_MASTER.E2B_WW_NUMBER, \n  ARGUS_APP.CASE_MASTER.WORKLIST_OWNER_ID, \n  ARGUS_APP.CASE_MASTER.SUSAR, \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_EVENT, \n  ARGUS_APP.CASE_MASTER.INITIAL_JUSTIFICATION, \n  ARGUS_APP.CASE_MASTER.FORCE_SOON, \n  ARGUS_APP.CASE_MASTER.DUE_SOON_J, \n  ARGUS_APP.CASE_MASTER.FOLLOWUP_DATE_J, \n  ARGUS_APP.CASE_MASTER.INIT_REPT_DATE_J, \n  ARGUS_APP.CASE_MASTER.JUST_INIT_REPT_DATE_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_1_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_2_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_3_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_4_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_5_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_6_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_7_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_8_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_9_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_10_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_11_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_12_J, \n  ARGUS_APP.CASE_MASTER.INITIAL_JUSTIFICATION_J, \n  ARGUS_APP.CASE_MASTER.LOCK_STATUS_ID, \n  ARGUS_APP.CASE_MASTER.MEDICALLY_CONFIRM, \n  ARGUS_APP.CASE_MASTER.ENTERPRISE_ID\n"+
				"FROM ARGUS_APP.CASE_MASTER WHERE ROWNUM < 11"; //take only 10 records for testing purpose

		int nb_line_tOracleInput_1 = 0;
		row1Struct row1 = new row1Struct();
		
		try {
			rs_tOracleInput_1 = stmt_tOracleInput_1.executeQuery(dbquery_tOracleInput_1);
			
			java.sql.ResultSetMetaData rsmd_tOracleInput_1 = rs_tOracleInput_1.getMetaData();
			int colQtyInRs_tOracleInput_1 = rsmd_tOracleInput_1.getColumnCount();

			String tmpContent_tOracleInput_1 = null;

			while (rs_tOracleInput_1.next()) {
				
				nb_line_tOracleInput_1++;

				if (colQtyInRs_tOracleInput_1 < 1) {
					row1.CASE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(1) != null) {
						row1.CASE_ID = rs_tOracleInput_1.getBigDecimal(1);
					} else {

						throw new RuntimeException("Null value in non-Nullable column");
					}
				}
				if (colQtyInRs_tOracleInput_1 < 2) {
					row1.CASE_NUM = null;
				} else {

					row1.CASE_NUM = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 2, false);
				}
				if (colQtyInRs_tOracleInput_1 < 3) {
					row1.REV = null;
				} else {

					if (rs_tOracleInput_1.getObject(3) != null) {
						row1.REV = rs_tOracleInput_1.getBigDecimal(3);
					} else {

						row1.REV = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 4) {
					row1.WORKFLOW_SEQ_NUM = null;
				} else {

					if (rs_tOracleInput_1.getObject(4) != null) {
						row1.WORKFLOW_SEQ_NUM = rs_tOracleInput_1.getBigDecimal(4);
					} else {

						row1.WORKFLOW_SEQ_NUM = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 5) {
					row1.LAST_WORKFLOW_SEQ_NUM = null;
				} else {

					if (rs_tOracleInput_1.getObject(5) != null) {
						row1.LAST_WORKFLOW_SEQ_NUM = rs_tOracleInput_1.getBigDecimal(5);
					} else {

						row1.LAST_WORKFLOW_SEQ_NUM = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 6) {
					row1.CREATE_TIME = null;
				} else {

					row1.CREATE_TIME = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 6);
				}
				if (colQtyInRs_tOracleInput_1 < 7) {
					row1.INIT_REPT_DATE = null;
				} else {

					row1.INIT_REPT_DATE = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 7);
				}
				if (colQtyInRs_tOracleInput_1 < 8) {
					row1.USER_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(8) != null) {
						row1.USER_ID = rs_tOracleInput_1.getBigDecimal(8);
					} else {

						row1.USER_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 9) {
					row1.LAST_UPDATE_TIME = null;
				} else {

					row1.LAST_UPDATE_TIME = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 9);
				}
				if (colQtyInRs_tOracleInput_1 < 10) {
					row1.LAST_UPDATE_USER_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(10) != null) {
						row1.LAST_UPDATE_USER_ID = rs_tOracleInput_1.getBigDecimal(10);
					} else {

						throw new RuntimeException(
								"Null value in non-Nullable column");
					}
				}
				if (colQtyInRs_tOracleInput_1 < 11) {
					row1.REQUIRES_FOLLOWUP = null;
				} else {

					if (rs_tOracleInput_1.getObject(11) != null) {
						row1.REQUIRES_FOLLOWUP = rs_tOracleInput_1.getBigDecimal(11);
					} else {

						throw new RuntimeException(
								"Null value in non-Nullable column");
					}
				}
				if (colQtyInRs_tOracleInput_1 < 12) {
					row1.FOLLOWUP_DATE = null;
				} else {

					row1.FOLLOWUP_DATE = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 12);
				}
				if (colQtyInRs_tOracleInput_1 < 13) {
					row1.OWNER_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(13) != null) {
						row1.OWNER_ID = rs_tOracleInput_1.getBigDecimal(13);
					} else {

						row1.OWNER_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 14) {
					row1.STATE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(14) != null) {
						row1.STATE_ID = rs_tOracleInput_1.getBigDecimal(14);
					} else {

						row1.STATE_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 15) {
					row1.COUNTRY_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(15) != null) {
						row1.COUNTRY_ID = rs_tOracleInput_1.getBigDecimal(15);
					} else {

						row1.COUNTRY_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 16) {
					row1.LANG_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(16) != null) {
						row1.LANG_ID = rs_tOracleInput_1.getBigDecimal(16);
					} else {

						row1.LANG_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 17) {
					row1.PRIORITY = null;
				} else {

					if (rs_tOracleInput_1.getObject(17) != null) {
						row1.PRIORITY = rs_tOracleInput_1.getBigDecimal(17);
					} else {

						row1.PRIORITY = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 18) {
					row1.SITE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(18) != null) {
						row1.SITE_ID = rs_tOracleInput_1.getBigDecimal(18);
					} else {

						row1.SITE_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 19) {
					row1.SERIOUSNESS = null;
				} else {

					if (rs_tOracleInput_1.getObject(19) != null) {
						row1.SERIOUSNESS = rs_tOracleInput_1.getBigDecimal(19);
					} else {

						row1.SERIOUSNESS = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 20) {
					row1.RPT_TYPE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(20) != null) {
						row1.RPT_TYPE_ID = rs_tOracleInput_1.getBigDecimal(20);
					} else {

						row1.RPT_TYPE_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 21) {
					row1.LAST_STATE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(21) != null) {
						row1.LAST_STATE_ID = rs_tOracleInput_1.getBigDecimal(21);
					} else {

						row1.LAST_STATE_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 22) {
					row1.ASSESSMENT_NEEDED = null;
				} else {

					if (rs_tOracleInput_1.getObject(22) != null) {
						row1.ASSESSMENT_NEEDED = rs_tOracleInput_1.getBigDecimal(22);
					} else {

						row1.ASSESSMENT_NEEDED = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 23) {
					row1.PRIORITY_OVERRIDE = null;
				} else {

					if (rs_tOracleInput_1.getObject(23) != null) {
						row1.PRIORITY_OVERRIDE = rs_tOracleInput_1.getBigDecimal(23);
					} else {

						row1.PRIORITY_OVERRIDE = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 24) {
					row1.SID = null;
				} else {

					row1.SID = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 24, false);
				}
				if (colQtyInRs_tOracleInput_1 < 25) {
					row1.SAFETY_DATE = null;
				} else {

					row1.SAFETY_DATE = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 25);
				}
				if (colQtyInRs_tOracleInput_1 < 26) {
					row1.NORMAL_TIME = null;
				} else {

					row1.NORMAL_TIME = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 26);
				}
				if (colQtyInRs_tOracleInput_1 < 27) {
					row1.MAX_TIME = null;
				} else {

					row1.MAX_TIME = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 27);
				}
				if (colQtyInRs_tOracleInput_1 < 28) {
					row1.REPORT_SCHEDULING = null;
				} else {

					if (rs_tOracleInput_1.getObject(28) != null) {
						row1.REPORT_SCHEDULING = rs_tOracleInput_1.getBigDecimal(28);
					} else {

						row1.REPORT_SCHEDULING = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 29) {
					row1.PRIORITY_ASSESSMENT = null;
				} else {

					if (rs_tOracleInput_1.getObject(29) != null) {
						row1.PRIORITY_ASSESSMENT = rs_tOracleInput_1.getBigDecimal(29);
					} else {

						row1.PRIORITY_ASSESSMENT = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 30) {
					row1.CLOSE_USER_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(30) != null) {
						row1.CLOSE_USER_ID = rs_tOracleInput_1.getBigDecimal(30);
					} else {

						row1.CLOSE_USER_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 31) {
					row1.CLOSE_DATE = null;
				} else {

					row1.CLOSE_DATE = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 31);
				}
				if (colQtyInRs_tOracleInput_1 < 32) {
					row1.CLOSE_NOTES = null;
				} else {

					row1.CLOSE_NOTES = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 32, false);
				}
				if (colQtyInRs_tOracleInput_1 < 33) {
					row1.DATE_LOCKED = null;
				} else {

					row1.DATE_LOCKED = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 33);
				}
				if (colQtyInRs_tOracleInput_1 < 34) {
					row1.UD_TEXT_1 = null;
				} else {

					row1.UD_TEXT_1 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 34, false);
				}
				if (colQtyInRs_tOracleInput_1 < 35) {
					row1.UD_TEXT_2 = null;
				} else {

					row1.UD_TEXT_2 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 35, false);
				}
				if (colQtyInRs_tOracleInput_1 < 36) {
					row1.UD_TEXT_3 = null;
				} else {

					row1.UD_TEXT_3 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 36, false);
				}
				if (colQtyInRs_tOracleInput_1 < 37) {
					row1.UD_TEXT_4 = null;
				} else {

					row1.UD_TEXT_4 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 37, false);
				}
				if (colQtyInRs_tOracleInput_1 < 38) {
					row1.UD_TEXT_5 = null;
				} else {

					row1.UD_TEXT_5 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 38, false);
				}
				if (colQtyInRs_tOracleInput_1 < 39) {
					row1.UD_TEXT_6 = null;
				} else {

					row1.UD_TEXT_6 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 39, false);
				}
				if (colQtyInRs_tOracleInput_1 < 40) {
					row1.UD_TEXT_7 = null;
				} else {

					row1.UD_TEXT_7 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 40, false);
				}
				if (colQtyInRs_tOracleInput_1 < 41) {
					row1.UD_TEXT_8 = null;
				} else {

					row1.UD_TEXT_8 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 41, false);
				}
				if (colQtyInRs_tOracleInput_1 < 42) {
					row1.UD_TEXT_9 = null;
				} else {

					row1.UD_TEXT_9 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 42, false);
				}
				if (colQtyInRs_tOracleInput_1 < 43) {
					row1.UD_TEXT_10 = null;
				} else {

					row1.UD_TEXT_10 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 43, false);
				}
				if (colQtyInRs_tOracleInput_1 < 44) {
					row1.UD_TEXT_11 = null;
				} else {

					row1.UD_TEXT_11 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 44, false);
				}
				if (colQtyInRs_tOracleInput_1 < 45) {
					row1.UD_TEXT_12 = null;
				} else {

					row1.UD_TEXT_12 = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 45, false);
				}
				if (colQtyInRs_tOracleInput_1 < 46) {
					row1.UD_DATE_1 = null;
				} else {

					row1.UD_DATE_1 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 46);
				}
				if (colQtyInRs_tOracleInput_1 < 47) {
					row1.UD_DATE_2 = null;
				} else {

					row1.UD_DATE_2 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 47);
				}
				if (colQtyInRs_tOracleInput_1 < 48) {
					row1.UD_DATE_3 = null;
				} else {

					row1.UD_DATE_3 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 48);
				}
				if (colQtyInRs_tOracleInput_1 < 49) {
					row1.UD_DATE_4 = null;
				} else {

					row1.UD_DATE_4 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 49);
				}
				if (colQtyInRs_tOracleInput_1 < 50) {
					row1.UD_DATE_5 = null;
				} else {

					row1.UD_DATE_5 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 50);
				}
				if (colQtyInRs_tOracleInput_1 < 51) {
					row1.UD_DATE_6 = null;
				} else {

					row1.UD_DATE_6 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 51);
				}
				if (colQtyInRs_tOracleInput_1 < 52) {
					row1.UD_DATE_7 = null;
				} else {

					row1.UD_DATE_7 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 52);
				}
				if (colQtyInRs_tOracleInput_1 < 53) {
					row1.UD_DATE_8 = null;
				} else {

					row1.UD_DATE_8 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 53);
				}
				if (colQtyInRs_tOracleInput_1 < 54) {
					row1.UD_DATE_9 = null;
				} else {

					row1.UD_DATE_9 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 54);
				}
				if (colQtyInRs_tOracleInput_1 < 55) {
					row1.UD_DATE_10 = null;
				} else {

					row1.UD_DATE_10 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 55);
				}
				if (colQtyInRs_tOracleInput_1 < 56) {
					row1.UD_DATE_11 = null;
				} else {

					row1.UD_DATE_11 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 56);
				}
				if (colQtyInRs_tOracleInput_1 < 57) {
					row1.UD_DATE_12 = null;
				} else {

					row1.UD_DATE_12 = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 57);
				}
				if (colQtyInRs_tOracleInput_1 < 58) {
					row1.UD_NUMBER_1 = null;
				} else {

					if (rs_tOracleInput_1.getObject(58) != null) {
						row1.UD_NUMBER_1 = rs_tOracleInput_1.getBigDecimal(58);
					} else {

						row1.UD_NUMBER_1 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 59) {
					row1.UD_NUMBER_2 = null;
				} else {

					if (rs_tOracleInput_1.getObject(59) != null) {
						row1.UD_NUMBER_2 = rs_tOracleInput_1.getBigDecimal(59);
					} else {

						row1.UD_NUMBER_2 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 60) {
					row1.UD_NUMBER_3 = null;
				} else {

					if (rs_tOracleInput_1.getObject(60) != null) {
						row1.UD_NUMBER_3 = rs_tOracleInput_1.getBigDecimal(60);
					} else {

						row1.UD_NUMBER_3 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 61) {
					row1.UD_NUMBER_4 = null;
				} else {

					if (rs_tOracleInput_1.getObject(61) != null) {
						row1.UD_NUMBER_4 = rs_tOracleInput_1.getBigDecimal(61);
					} else {

						row1.UD_NUMBER_4 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 62) {
					row1.UD_NUMBER_5 = null;
				} else {

					if (rs_tOracleInput_1.getObject(62) != null) {
						row1.UD_NUMBER_5 = rs_tOracleInput_1.getBigDecimal(62);
					} else {

						row1.UD_NUMBER_5 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 63) {
					row1.UD_NUMBER_6 = null;
				} else {

					if (rs_tOracleInput_1.getObject(63) != null) {
						row1.UD_NUMBER_6 = rs_tOracleInput_1.getBigDecimal(63);
					} else {

						row1.UD_NUMBER_6 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 64) {
					row1.UD_NUMBER_7 = null;
				} else {

					if (rs_tOracleInput_1.getObject(64) != null) {
						row1.UD_NUMBER_7 = rs_tOracleInput_1.getBigDecimal(64);
					} else {

						row1.UD_NUMBER_7 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 65) {
					row1.UD_NUMBER_8 = null;
				} else {

					if (rs_tOracleInput_1.getObject(65) != null) {
						row1.UD_NUMBER_8 = rs_tOracleInput_1.getBigDecimal(65);
					} else {

						row1.UD_NUMBER_8 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 66) {
					row1.UD_NUMBER_9 = null;
				} else {

					if (rs_tOracleInput_1.getObject(66) != null) {
						row1.UD_NUMBER_9 = rs_tOracleInput_1.getBigDecimal(66);
					} else {

						row1.UD_NUMBER_9 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 67) {
					row1.UD_NUMBER_10 = null;
				} else {

					if (rs_tOracleInput_1.getObject(67) != null) {
						row1.UD_NUMBER_10 = rs_tOracleInput_1.getBigDecimal(67);
					} else {

						row1.UD_NUMBER_10 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 68) {
					row1.UD_NUMBER_11 = null;
				} else {

					if (rs_tOracleInput_1.getObject(68) != null) {
						row1.UD_NUMBER_11 = rs_tOracleInput_1.getBigDecimal(68);
					} else {

						row1.UD_NUMBER_11 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 69) {
					row1.UD_NUMBER_12 = null;
				} else {

					if (rs_tOracleInput_1.getObject(69) != null) {
						row1.UD_NUMBER_12 = rs_tOracleInput_1.getBigDecimal(69);
					} else {

						row1.UD_NUMBER_12 = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 70) {
					row1.DELETED = null;
				} else {

					row1.DELETED = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 70);
				}
				if (colQtyInRs_tOracleInput_1 < 71) {
					row1.DUE_SOON = null;
				} else {

					row1.DUE_SOON = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 71);
				}
				if (colQtyInRs_tOracleInput_1 < 72) {
					row1.GLOBAL_NUM = null;
				} else {

					row1.GLOBAL_NUM = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 72, false);
				}
				if (colQtyInRs_tOracleInput_1 < 73) {
					row1.PRIORITY_DATE_ASSESSED = null;
				} else {

					row1.PRIORITY_DATE_ASSESSED = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 73);
				}
				if (colQtyInRs_tOracleInput_1 < 74) {
					row1.LAM_ASSESS_DONE = null;
				} else {

					if (rs_tOracleInput_1.getObject(74) != null) {
						row1.LAM_ASSESS_DONE = rs_tOracleInput_1.getBigDecimal(74);
					} else {

						throw new RuntimeException(
								"Null value in non-Nullable column");
					}
				}
				if (colQtyInRs_tOracleInput_1 < 75) {
					row1.E2B_WW_NUMBER = null;
				} else {

					row1.E2B_WW_NUMBER = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 75, false);
				}
				if (colQtyInRs_tOracleInput_1 < 76) {
					row1.WORKLIST_OWNER_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(76) != null) {
						row1.WORKLIST_OWNER_ID = rs_tOracleInput_1.getBigDecimal(76);
					} else {

						row1.WORKLIST_OWNER_ID = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 77) {
					row1.SUSAR = null;
				} else {

					if (rs_tOracleInput_1.getObject(77) != null) {
						row1.SUSAR = rs_tOracleInput_1.getBigDecimal(77);
					} else {

						row1.SUSAR = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 78) {
					row1.LAST_UPDATE_EVENT = null;
				} else {

					row1.LAST_UPDATE_EVENT = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 78);
				}
				if (colQtyInRs_tOracleInput_1 < 79) {
					row1.INITIAL_JUSTIFICATION = null;
				} else {

					row1.INITIAL_JUSTIFICATION = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 79, false);
				}
				if (colQtyInRs_tOracleInput_1 < 80) {
					row1.FORCE_SOON = null;
				} else {

					row1.FORCE_SOON = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 80);
				}
				if (colQtyInRs_tOracleInput_1 < 81) {
					row1.DUE_SOON_J = null;
				} else {

					row1.DUE_SOON_J = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 81);
				}
				if (colQtyInRs_tOracleInput_1 < 82) {
					row1.FOLLOWUP_DATE_J = null;
				} else {

					row1.FOLLOWUP_DATE_J = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 82);
				}
				if (colQtyInRs_tOracleInput_1 < 83) {
					row1.INIT_REPT_DATE_J = null;
				} else {

					row1.INIT_REPT_DATE_J = routines.system.JDBCUtil.getDate(rs_tOracleInput_1, 83);
				}
				if (colQtyInRs_tOracleInput_1 < 84) {
					row1.JUST_INIT_REPT_DATE_J = null;
				} else {

					row1.JUST_INIT_REPT_DATE_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 84, false);
				}
				if (colQtyInRs_tOracleInput_1 < 85) {
					row1.UD_TEXT_1_J = null;
				} else {

					row1.UD_TEXT_1_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 85, false);
				}
				if (colQtyInRs_tOracleInput_1 < 86) {
					row1.UD_TEXT_2_J = null;
				} else {

					row1.UD_TEXT_2_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 86, false);
				}
				if (colQtyInRs_tOracleInput_1 < 87) {
					row1.UD_TEXT_3_J = null;
				} else {

					row1.UD_TEXT_3_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 87, false);
				}
				if (colQtyInRs_tOracleInput_1 < 88) {
					row1.UD_TEXT_4_J = null;
				} else {

					row1.UD_TEXT_4_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 88, false);
				}
				if (colQtyInRs_tOracleInput_1 < 89) {
					row1.UD_TEXT_5_J = null;
				} else {

					row1.UD_TEXT_5_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 89, false);
				}
				if (colQtyInRs_tOracleInput_1 < 90) {
					row1.UD_TEXT_6_J = null;
				} else {

					row1.UD_TEXT_6_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 90, false);
				}
				if (colQtyInRs_tOracleInput_1 < 91) {
					row1.UD_TEXT_7_J = null;
				} else {

					row1.UD_TEXT_7_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 91, false);
				}
				if (colQtyInRs_tOracleInput_1 < 92) {
					row1.UD_TEXT_8_J = null;
				} else {

					row1.UD_TEXT_8_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 92, false);
				}
				if (colQtyInRs_tOracleInput_1 < 93) {
					row1.UD_TEXT_9_J = null;
				} else {

					row1.UD_TEXT_9_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 93, false);
				}
				if (colQtyInRs_tOracleInput_1 < 94) {
					row1.UD_TEXT_10_J = null;
				} else {

					row1.UD_TEXT_10_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 94, false);
				}
				if (colQtyInRs_tOracleInput_1 < 95) {
					row1.UD_TEXT_11_J = null;
				} else {

					row1.UD_TEXT_11_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 95, false);
				}
				if (colQtyInRs_tOracleInput_1 < 96) {
					row1.UD_TEXT_12_J = null;
				} else {

					row1.UD_TEXT_12_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 96, false);
				}
				if (colQtyInRs_tOracleInput_1 < 97) {
					row1.INITIAL_JUSTIFICATION_J = null;
				} else {

					row1.INITIAL_JUSTIFICATION_J = routines.system.JDBCUtil.getString(rs_tOracleInput_1, 97, false);
				}
				if (colQtyInRs_tOracleInput_1 < 98) {
					row1.LOCK_STATUS_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(98) != null) {
						row1.LOCK_STATUS_ID = rs_tOracleInput_1.getBigDecimal(98);
					} else {

						throw new RuntimeException(
								"Null value in non-Nullable column");
					}
				}
				if (colQtyInRs_tOracleInput_1 < 99) {
					row1.MEDICALLY_CONFIRM = null;
				} else {

					if (rs_tOracleInput_1.getObject(99) != null) {
						row1.MEDICALLY_CONFIRM = rs_tOracleInput_1.getBigDecimal(99);
					} else {

						row1.MEDICALLY_CONFIRM = null;
					}
				}
				if (colQtyInRs_tOracleInput_1 < 100) {
					row1.ENTERPRISE_ID = null;
				} else {

					if (rs_tOracleInput_1.getObject(100) != null) {
						row1.ENTERPRISE_ID = rs_tOracleInput_1.getBigDecimal(100);
					} else {

						throw new RuntimeException(
								"Null value in non-Nullable column");
					}
				}
				
				//Publishing DB records to Kafka
				producer.send(new ProducerRecord<String,row1Struct>("Durga-Topic",row1));
			}
		}catch(SQLException e){			
			e.printStackTrace();
		}catch(Exception e){
			e.getMessage();
		}
	}
	
	public java.sql.Statement prepareSourcedb()
	{
		
	
		int nb_line_tOracleInput_1 = 0;
		row1Struct row1 = new row1Struct();

		java.sql.Connection conn_tOracleInput_1 = null;
		String driverClass_tOracleInput_1 = "oracle.jdbc.OracleDriver";
		try{
			java.lang.Class.forName(driverClass_tOracleInput_1);
		}catch(ClassNotFoundException e){
			e.getException();
		}

		String url_tOracleInput_1 = null;
		java.sql.Statement stmt_tOracleInput_1=null;
		
		url_tOracleInput_1 = "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host="+ "10.100.6.163"+ ")(port="+ "1521"+ "))(connect_data=(service_name=" + "ARGS81" + ")))";

		String dbUser_tOracleInput_1 = "ARGUS_APP";

		final String decryptedPassword_tOracleInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("1af4e9f8682bfdbd");

		String dbPwd_tOracleInput_1 = decryptedPassword_tOracleInput_1;
		
		//String dbquery_tOracleInput_1 = "SELECT \n  ARGUS_APP.CASE_MASTER.CASE_ID, \n  ARGUS_APP.CASE_MASTER.CASE_NUM, \n  ARGUS_APP.CASE_MASTER.REV, \n  ARGUS_APP.CASE_MASTER.WORKFLOW_SEQ_NUM, \n  ARGUS_APP.CASE_MASTER.LAST_WORKFLOW_SEQ_NUM, \n  ARGUS_APP.CASE_MASTER.CREATE_TIME, \n  ARGUS_APP.CASE_MASTER.INIT_REPT_DATE, \n  ARGUS_APP.CASE_MASTER.\"USER_ID\", \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_TIME, \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_USER_ID, \n  ARGUS_APP.CASE_MASTER.REQUIRES_FOLLOWUP, \n  ARGUS_APP.CASE_MASTER.FOLLOWUP_DATE, \n  ARGUS_APP.CASE_MASTER.OWNER_ID, \n  ARGUS_APP.CASE_MASTER.STATE_ID, \n  ARGUS_APP.CASE_MASTER.COUNTRY_ID, \n  ARGUS_APP.CASE_MASTER.LANG_ID, \n  ARGUS_APP.CASE_MASTER.PRIORITY, \n  ARGUS_APP.CASE_MASTER.SITE_ID, \n  ARGUS_APP.CASE_MASTER.SERIOUSNESS, \n  ARGUS_APP.CASE_MASTER.RPT_TYPE_ID, \n  ARGUS_APP.CASE_MASTER.LAST_STATE_ID, \n  ARGUS_APP.CASE_MASTER.ASSESSMENT_NEEDED, \n  ARGUS_APP.CASE_MASTER.PRIORITY_OVERRIDE, \n  ARGUS_APP.CASE_MASTER.SID, \n  ARGUS_APP.CASE_MASTER.SAFETY_DATE, \n  ARGUS_APP.CASE_MASTER.NORMAL_TIME, \n  ARGUS_APP.CASE_MASTER.MAX_TIME, \n  ARGUS_APP.CASE_MASTER.REPORT_SCHEDULING, \n  ARGUS_APP.CASE_MASTER.PRIORITY_ASSESSMENT, \n  ARGUS_APP.CASE_MASTER.CLOSE_USER_ID, \n  ARGUS_APP.CASE_MASTER.CLOSE_DATE, \n  ARGUS_APP.CASE_MASTER.CLOSE_NOTES, \n  ARGUS_APP.CASE_MASTER.DATE_LOCKED, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_1, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_2, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_3, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_4, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_5, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_6, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_7, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_8, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_9, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_10, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_11, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_12, \n  ARGUS_APP.CASE_MASTER.UD_DATE_1, \n  ARGUS_APP.CASE_MASTER.UD_DATE_2, \n  ARGUS_APP.CASE_MASTER.UD_DATE_3, \n  ARGUS_APP.CASE_MASTER.UD_DATE_4, \n  ARGUS_APP.CASE_MASTER.UD_DATE_5, \n  ARGUS_APP.CASE_MASTER.UD_DATE_6, \n  ARGUS_APP.CASE_MASTER.UD_DATE_7, \n  ARGUS_APP.CASE_MASTER.UD_DATE_8, \n  ARGUS_APP.CASE_MASTER.UD_DATE_9, \n  ARGUS_APP.CASE_MASTER.UD_DATE_10, \n  ARGUS_APP.CASE_MASTER.UD_DATE_11, \n  ARGUS_APP.CASE_MASTER.UD_DATE_12, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_1, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_2, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_3, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_4, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_5, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_6, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_7, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_8, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_9, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_10, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_11, \n  ARGUS_APP.CASE_MASTER.UD_NUMBER_12, \n  ARGUS_APP.CASE_MASTER.DELETED, \n  ARGUS_APP.CASE_MASTER.DUE_SOON, \n  ARGUS_APP.CASE_MASTER.GLOBAL_NUM, \n  ARGUS_APP.CASE_MASTER.PRIORITY_DATE_ASSESSED, \n  ARGUS_APP.CASE_MASTER.LAM_ASSESS_DONE, \n  ARGUS_APP.CASE_MASTER.E2B_WW_NUMBER, \n  ARGUS_APP.CASE_MASTER.WORKLIST_OWNER_ID, \n  ARGUS_APP.CASE_MASTER.SUSAR, \n  ARGUS_APP.CASE_MASTER.LAST_UPDATE_EVENT, \n  ARGUS_APP.CASE_MASTER.INITIAL_JUSTIFICATION, \n  ARGUS_APP.CASE_MASTER.FORCE_SOON, \n  ARGUS_APP.CASE_MASTER.DUE_SOON_J, \n  ARGUS_APP.CASE_MASTER.FOLLOWUP_DATE_J, \n  ARGUS_APP.CASE_MASTER.INIT_REPT_DATE_J, \n  ARGUS_APP.CASE_MASTER.JUST_INIT_REPT_DATE_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_1_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_2_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_3_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_4_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_5_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_6_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_7_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_8_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_9_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_10_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_11_J, \n  ARGUS_APP.CASE_MASTER.UD_TEXT_12_J, \n  ARGUS_APP.CASE_MASTER.INITIAL_JUSTIFICATION_J, \n  ARGUS_APP.CASE_MASTER.LOCK_STATUS_ID, \n  ARGUS_APP.CASE_MASTER.MEDICALLY_CONFIRM, \n  ARGUS_APP.CASE_MASTER.ENTERPRISE_ID\n"+
		//		"FROM ARGUS_APP.CASE_MASTER WHERE ROWNUM < 11"; //take only 10 records for testing purpose

		try{
			conn_tOracleInput_1 = java.sql.DriverManager.getConnection(url_tOracleInput_1, dbUser_tOracleInput_1,dbPwd_tOracleInput_1);	
			stmt_tOracleInput_1 = conn_tOracleInput_1.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return stmt_tOracleInput_1;
	}
		
		
	
	
	public Producer<String, row1Struct> initKafkaPublisher()
	{
		
		System.out.println("Started..");
	    String topicName = "Durga-Topic";//args[0].toString();
	     
	    // create instance for properties to access producer configs   
	    Properties props = new Properties();
	    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
	    props.put(ProducerConfig.CLIENT_ID_CONFIG, "KafkapocProducer");
	    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
	   // props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
	    
	    props.put("value.serializer", "kafkapoc.row1StructSerializer");
	    
	    Producer<String, row1Struct> producer = new KafkaProducer<String, row1Struct>(props);
	    return producer;
	    
	}
	


	

}
