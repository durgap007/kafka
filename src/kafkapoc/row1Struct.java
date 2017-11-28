package kafkapoc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Date;

//import kafkapoc.oracle_db_link.row1Struct;

public class row1Struct 
{
	final static byte[] commonByteArrayLock_DURGA_BD_ETL_oracle_db_link = new byte[0];
	static byte[] commonByteArray_DURGA_BD_ETL_oracle_db_link = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
	protected static final int PRIME = 31;
	protected int hashCode = DEFAULT_HASHCODE;
	public boolean hashCodeDirty = true;
	
	private final static String utf8Charset = "UTF-8";

	public String loopKey;

	public BigDecimal CASE_ID;

	public BigDecimal getCASE_ID() {
		return this.CASE_ID;
	}

	public String CASE_NUM;

	public String getCASE_NUM() {
		return this.CASE_NUM;
	}

	public BigDecimal REV;

	public BigDecimal getREV() {
		return this.REV;
	}

	public BigDecimal WORKFLOW_SEQ_NUM;

	public BigDecimal getWORKFLOW_SEQ_NUM() {
		return this.WORKFLOW_SEQ_NUM;
	}

	public BigDecimal LAST_WORKFLOW_SEQ_NUM;

	public BigDecimal getLAST_WORKFLOW_SEQ_NUM() {
		return this.LAST_WORKFLOW_SEQ_NUM;
	}

	public java.util.Date CREATE_TIME;

	public java.util.Date getCREATE_TIME() {
		return this.CREATE_TIME;
	}

	public java.util.Date INIT_REPT_DATE;

	public java.util.Date getINIT_REPT_DATE() {
		return this.INIT_REPT_DATE;
	}

	public BigDecimal USER_ID;

	public BigDecimal getUSER_ID() {
		return this.USER_ID;
	}

	public java.util.Date LAST_UPDATE_TIME;

	public java.util.Date getLAST_UPDATE_TIME() {
		return this.LAST_UPDATE_TIME;
	}

	public BigDecimal LAST_UPDATE_USER_ID;

	public BigDecimal getLAST_UPDATE_USER_ID() {
		return this.LAST_UPDATE_USER_ID;
	}

	public BigDecimal REQUIRES_FOLLOWUP;

	public BigDecimal getREQUIRES_FOLLOWUP() {
		return this.REQUIRES_FOLLOWUP;
	}

	public java.util.Date FOLLOWUP_DATE;

	public java.util.Date getFOLLOWUP_DATE() {
		return this.FOLLOWUP_DATE;
	}

	public BigDecimal OWNER_ID;

	public BigDecimal getOWNER_ID() {
		return this.OWNER_ID;
	}

	public BigDecimal STATE_ID;

	public BigDecimal getSTATE_ID() {
		return this.STATE_ID;
	}

	public BigDecimal COUNTRY_ID;

	public BigDecimal getCOUNTRY_ID() {
		return this.COUNTRY_ID;
	}

	public BigDecimal LANG_ID;

	public BigDecimal getLANG_ID() {
		return this.LANG_ID;
	}

	public BigDecimal PRIORITY;

	public BigDecimal getPRIORITY() {
		return this.PRIORITY;
	}

	public BigDecimal SITE_ID;

	public BigDecimal getSITE_ID() {
		return this.SITE_ID;
	}

	public BigDecimal SERIOUSNESS;

	public BigDecimal getSERIOUSNESS() {
		return this.SERIOUSNESS;
	}

	public BigDecimal RPT_TYPE_ID;

	public BigDecimal getRPT_TYPE_ID() {
		return this.RPT_TYPE_ID;
	}

	public BigDecimal LAST_STATE_ID;

	public BigDecimal getLAST_STATE_ID() {
		return this.LAST_STATE_ID;
	}

	public BigDecimal ASSESSMENT_NEEDED;

	public BigDecimal getASSESSMENT_NEEDED() {
		return this.ASSESSMENT_NEEDED;
	}

	public BigDecimal PRIORITY_OVERRIDE;

	public BigDecimal getPRIORITY_OVERRIDE() {
		return this.PRIORITY_OVERRIDE;
	}

	public String SID;

	public String getSID() {
		return this.SID;
	}

	public java.util.Date SAFETY_DATE;

	public java.util.Date getSAFETY_DATE() {
		return this.SAFETY_DATE;
	}

	public java.util.Date NORMAL_TIME;

	public java.util.Date getNORMAL_TIME() {
		return this.NORMAL_TIME;
	}

	public java.util.Date MAX_TIME;

	public java.util.Date getMAX_TIME() {
		return this.MAX_TIME;
	}

	public BigDecimal REPORT_SCHEDULING;

	public BigDecimal getREPORT_SCHEDULING() {
		return this.REPORT_SCHEDULING;
	}

	public BigDecimal PRIORITY_ASSESSMENT;

	public BigDecimal getPRIORITY_ASSESSMENT() {
		return this.PRIORITY_ASSESSMENT;
	}

	public BigDecimal CLOSE_USER_ID;

	public BigDecimal getCLOSE_USER_ID() {
		return this.CLOSE_USER_ID;
	}

	public java.util.Date CLOSE_DATE;

	public java.util.Date getCLOSE_DATE() {
		return this.CLOSE_DATE;
	}

	public String CLOSE_NOTES;

	public String getCLOSE_NOTES() {
		return this.CLOSE_NOTES;
	}

	public java.util.Date DATE_LOCKED;

	public java.util.Date getDATE_LOCKED() {
		return this.DATE_LOCKED;
	}

	public String UD_TEXT_1;

	public String getUD_TEXT_1() {
		return this.UD_TEXT_1;
	}

	public String UD_TEXT_2;

	public String getUD_TEXT_2() {
		return this.UD_TEXT_2;
	}

	public String UD_TEXT_3;

	public String getUD_TEXT_3() {
		return this.UD_TEXT_3;
	}

	public String UD_TEXT_4;

	public String getUD_TEXT_4() {
		return this.UD_TEXT_4;
	}

	public String UD_TEXT_5;

	public String getUD_TEXT_5() {
		return this.UD_TEXT_5;
	}

	public String UD_TEXT_6;

	public String getUD_TEXT_6() {
		return this.UD_TEXT_6;
	}

	public String UD_TEXT_7;

	public String getUD_TEXT_7() {
		return this.UD_TEXT_7;
	}

	public String UD_TEXT_8;

	public String getUD_TEXT_8() {
		return this.UD_TEXT_8;
	}

	public String UD_TEXT_9;

	public String getUD_TEXT_9() {
		return this.UD_TEXT_9;
	}

	public String UD_TEXT_10;

	public String getUD_TEXT_10() {
		return this.UD_TEXT_10;
	}

	public String UD_TEXT_11;

	public String getUD_TEXT_11() {
		return this.UD_TEXT_11;
	}

	public String UD_TEXT_12;

	public String getUD_TEXT_12() {
		return this.UD_TEXT_12;
	}

	public java.util.Date UD_DATE_1;

	public java.util.Date getUD_DATE_1() {
		return this.UD_DATE_1;
	}

	public java.util.Date UD_DATE_2;

	public java.util.Date getUD_DATE_2() {
		return this.UD_DATE_2;
	}

	public java.util.Date UD_DATE_3;

	public java.util.Date getUD_DATE_3() {
		return this.UD_DATE_3;
	}

	public java.util.Date UD_DATE_4;

	public java.util.Date getUD_DATE_4() {
		return this.UD_DATE_4;
	}

	public java.util.Date UD_DATE_5;

	public java.util.Date getUD_DATE_5() {
		return this.UD_DATE_5;
	}

	public java.util.Date UD_DATE_6;

	public java.util.Date getUD_DATE_6() {
		return this.UD_DATE_6;
	}

	public java.util.Date UD_DATE_7;

	public java.util.Date getUD_DATE_7() {
		return this.UD_DATE_7;
	}

	public java.util.Date UD_DATE_8;

	public java.util.Date getUD_DATE_8() {
		return this.UD_DATE_8;
	}

	public java.util.Date UD_DATE_9;

	public java.util.Date getUD_DATE_9() {
		return this.UD_DATE_9;
	}

	public java.util.Date UD_DATE_10;

	public java.util.Date getUD_DATE_10() {
		return this.UD_DATE_10;
	}

	public java.util.Date UD_DATE_11;

	public java.util.Date getUD_DATE_11() {
		return this.UD_DATE_11;
	}

	public java.util.Date UD_DATE_12;

	public java.util.Date getUD_DATE_12() {
		return this.UD_DATE_12;
	}

	public BigDecimal UD_NUMBER_1;

	public BigDecimal getUD_NUMBER_1() {
		return this.UD_NUMBER_1;
	}

	public BigDecimal UD_NUMBER_2;

	public BigDecimal getUD_NUMBER_2() {
		return this.UD_NUMBER_2;
	}

	public BigDecimal UD_NUMBER_3;

	public BigDecimal getUD_NUMBER_3() {
		return this.UD_NUMBER_3;
	}

	public BigDecimal UD_NUMBER_4;

	public BigDecimal getUD_NUMBER_4() {
		return this.UD_NUMBER_4;
	}

	public BigDecimal UD_NUMBER_5;

	public BigDecimal getUD_NUMBER_5() {
		return this.UD_NUMBER_5;
	}

	public BigDecimal UD_NUMBER_6;

	public BigDecimal getUD_NUMBER_6() {
		return this.UD_NUMBER_6;
	}

	public BigDecimal UD_NUMBER_7;

	public BigDecimal getUD_NUMBER_7() {
		return this.UD_NUMBER_7;
	}

	public BigDecimal UD_NUMBER_8;

	public BigDecimal getUD_NUMBER_8() {
		return this.UD_NUMBER_8;
	}

	public BigDecimal UD_NUMBER_9;

	public BigDecimal getUD_NUMBER_9() {
		return this.UD_NUMBER_9;
	}

	public BigDecimal UD_NUMBER_10;

	public BigDecimal getUD_NUMBER_10() {
		return this.UD_NUMBER_10;
	}

	public BigDecimal UD_NUMBER_11;

	public BigDecimal getUD_NUMBER_11() {
		return this.UD_NUMBER_11;
	}

	public BigDecimal UD_NUMBER_12;

	public BigDecimal getUD_NUMBER_12() {
		return this.UD_NUMBER_12;
	}

	public java.util.Date DELETED;

	public java.util.Date getDELETED() {
		return this.DELETED;
	}

	public java.util.Date DUE_SOON;

	public java.util.Date getDUE_SOON() {
		return this.DUE_SOON;
	}

	public String GLOBAL_NUM;

	public String getGLOBAL_NUM() {
		return this.GLOBAL_NUM;
	}

	public java.util.Date PRIORITY_DATE_ASSESSED;

	public java.util.Date getPRIORITY_DATE_ASSESSED() {
		return this.PRIORITY_DATE_ASSESSED;
	}

	public BigDecimal LAM_ASSESS_DONE;

	public BigDecimal getLAM_ASSESS_DONE() {
		return this.LAM_ASSESS_DONE;
	}

	public String E2B_WW_NUMBER;

	public String getE2B_WW_NUMBER() {
		return this.E2B_WW_NUMBER;
	}

	public BigDecimal WORKLIST_OWNER_ID;

	public BigDecimal getWORKLIST_OWNER_ID() {
		return this.WORKLIST_OWNER_ID;
	}

	public BigDecimal SUSAR;

	public BigDecimal getSUSAR() {
		return this.SUSAR;
	}

	public java.util.Date LAST_UPDATE_EVENT;

	public java.util.Date getLAST_UPDATE_EVENT() {
		return this.LAST_UPDATE_EVENT;
	}

	public String INITIAL_JUSTIFICATION;

	public String getINITIAL_JUSTIFICATION() {
		return this.INITIAL_JUSTIFICATION;
	}

	public java.util.Date FORCE_SOON;

	public java.util.Date getFORCE_SOON() {
		return this.FORCE_SOON;
	}

	public java.util.Date DUE_SOON_J;

	public java.util.Date getDUE_SOON_J() {
		return this.DUE_SOON_J;
	}

	public java.util.Date FOLLOWUP_DATE_J;

	public java.util.Date getFOLLOWUP_DATE_J() {
		return this.FOLLOWUP_DATE_J;
	}

	public java.util.Date INIT_REPT_DATE_J;

	public java.util.Date getINIT_REPT_DATE_J() {
		return this.INIT_REPT_DATE_J;
	}

	public String JUST_INIT_REPT_DATE_J;

	public String getJUST_INIT_REPT_DATE_J() {
		return this.JUST_INIT_REPT_DATE_J;
	}

	public String UD_TEXT_1_J;

	public String getUD_TEXT_1_J() {
		return this.UD_TEXT_1_J;
	}

	public String UD_TEXT_2_J;

	public String getUD_TEXT_2_J() {
		return this.UD_TEXT_2_J;
	}

	public String UD_TEXT_3_J;

	public String getUD_TEXT_3_J() {
		return this.UD_TEXT_3_J;
	}

	public String UD_TEXT_4_J;

	public String getUD_TEXT_4_J() {
		return this.UD_TEXT_4_J;
	}

	public String UD_TEXT_5_J;

	public String getUD_TEXT_5_J() {
		return this.UD_TEXT_5_J;
	}

	public String UD_TEXT_6_J;

	public String getUD_TEXT_6_J() {
		return this.UD_TEXT_6_J;
	}

	public String UD_TEXT_7_J;

	public String getUD_TEXT_7_J() {
		return this.UD_TEXT_7_J;
	}

	public String UD_TEXT_8_J;

	public String getUD_TEXT_8_J() {
		return this.UD_TEXT_8_J;
	}

	public String UD_TEXT_9_J;

	public String getUD_TEXT_9_J() {
		return this.UD_TEXT_9_J;
	}

	public String UD_TEXT_10_J;

	public String getUD_TEXT_10_J() {
		return this.UD_TEXT_10_J;
	}

	public String UD_TEXT_11_J;

	public String getUD_TEXT_11_J() {
		return this.UD_TEXT_11_J;
	}

	public String UD_TEXT_12_J;

	public String getUD_TEXT_12_J() {
		return this.UD_TEXT_12_J;
	}

	public String INITIAL_JUSTIFICATION_J;

	public String getINITIAL_JUSTIFICATION_J() {
		return this.INITIAL_JUSTIFICATION_J;
	}

	public BigDecimal LOCK_STATUS_ID;

	public BigDecimal getLOCK_STATUS_ID() {
		return this.LOCK_STATUS_ID;
	}

	public BigDecimal MEDICALLY_CONFIRM;

	public BigDecimal getMEDICALLY_CONFIRM() {
		return this.MEDICALLY_CONFIRM;
	}

	public BigDecimal ENTERPRISE_ID;

	public BigDecimal getENTERPRISE_ID() {
		return this.ENTERPRISE_ID;
	}

	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;

			result = prime
					* result
					+ ((this.CASE_ID == null) ? 0 : this.CASE_ID.hashCode());

			this.hashCode = result;
			this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final row1Struct other = (row1Struct) obj;

		if (this.CASE_ID == null) {
			if (other.CASE_ID != null)
				return false;

		} else if (!this.CASE_ID.equals(other.CASE_ID))

			return false;

		return true;
	}

	public void copyDataTo(row1Struct other) {

		other.CASE_ID = this.CASE_ID;
		other.CASE_NUM = this.CASE_NUM;
		other.REV = this.REV;
		other.WORKFLOW_SEQ_NUM = this.WORKFLOW_SEQ_NUM;
		other.LAST_WORKFLOW_SEQ_NUM = this.LAST_WORKFLOW_SEQ_NUM;
		other.CREATE_TIME = this.CREATE_TIME;
		other.INIT_REPT_DATE = this.INIT_REPT_DATE;
		other.USER_ID = this.USER_ID;
		other.LAST_UPDATE_TIME = this.LAST_UPDATE_TIME;
		other.LAST_UPDATE_USER_ID = this.LAST_UPDATE_USER_ID;
		other.REQUIRES_FOLLOWUP = this.REQUIRES_FOLLOWUP;
		other.FOLLOWUP_DATE = this.FOLLOWUP_DATE;
		other.OWNER_ID = this.OWNER_ID;
		other.STATE_ID = this.STATE_ID;
		other.COUNTRY_ID = this.COUNTRY_ID;
		other.LANG_ID = this.LANG_ID;
		other.PRIORITY = this.PRIORITY;
		other.SITE_ID = this.SITE_ID;
		other.SERIOUSNESS = this.SERIOUSNESS;
		other.RPT_TYPE_ID = this.RPT_TYPE_ID;
		other.LAST_STATE_ID = this.LAST_STATE_ID;
		other.ASSESSMENT_NEEDED = this.ASSESSMENT_NEEDED;
		other.PRIORITY_OVERRIDE = this.PRIORITY_OVERRIDE;
		other.SID = this.SID;
		other.SAFETY_DATE = this.SAFETY_DATE;
		other.NORMAL_TIME = this.NORMAL_TIME;
		other.MAX_TIME = this.MAX_TIME;
		other.REPORT_SCHEDULING = this.REPORT_SCHEDULING;
		other.PRIORITY_ASSESSMENT = this.PRIORITY_ASSESSMENT;
		other.CLOSE_USER_ID = this.CLOSE_USER_ID;
		other.CLOSE_DATE = this.CLOSE_DATE;
		other.CLOSE_NOTES = this.CLOSE_NOTES;
		other.DATE_LOCKED = this.DATE_LOCKED;
		other.UD_TEXT_1 = this.UD_TEXT_1;
		other.UD_TEXT_2 = this.UD_TEXT_2;
		other.UD_TEXT_3 = this.UD_TEXT_3;
		other.UD_TEXT_4 = this.UD_TEXT_4;
		other.UD_TEXT_5 = this.UD_TEXT_5;
		other.UD_TEXT_6 = this.UD_TEXT_6;
		other.UD_TEXT_7 = this.UD_TEXT_7;
		other.UD_TEXT_8 = this.UD_TEXT_8;
		other.UD_TEXT_9 = this.UD_TEXT_9;
		other.UD_TEXT_10 = this.UD_TEXT_10;
		other.UD_TEXT_11 = this.UD_TEXT_11;
		other.UD_TEXT_12 = this.UD_TEXT_12;
		other.UD_DATE_1 = this.UD_DATE_1;
		other.UD_DATE_2 = this.UD_DATE_2;
		other.UD_DATE_3 = this.UD_DATE_3;
		other.UD_DATE_4 = this.UD_DATE_4;
		other.UD_DATE_5 = this.UD_DATE_5;
		other.UD_DATE_6 = this.UD_DATE_6;
		other.UD_DATE_7 = this.UD_DATE_7;
		other.UD_DATE_8 = this.UD_DATE_8;
		other.UD_DATE_9 = this.UD_DATE_9;
		other.UD_DATE_10 = this.UD_DATE_10;
		other.UD_DATE_11 = this.UD_DATE_11;
		other.UD_DATE_12 = this.UD_DATE_12;
		other.UD_NUMBER_1 = this.UD_NUMBER_1;
		other.UD_NUMBER_2 = this.UD_NUMBER_2;
		other.UD_NUMBER_3 = this.UD_NUMBER_3;
		other.UD_NUMBER_4 = this.UD_NUMBER_4;
		other.UD_NUMBER_5 = this.UD_NUMBER_5;
		other.UD_NUMBER_6 = this.UD_NUMBER_6;
		other.UD_NUMBER_7 = this.UD_NUMBER_7;
		other.UD_NUMBER_8 = this.UD_NUMBER_8;
		other.UD_NUMBER_9 = this.UD_NUMBER_9;
		other.UD_NUMBER_10 = this.UD_NUMBER_10;
		other.UD_NUMBER_11 = this.UD_NUMBER_11;
		other.UD_NUMBER_12 = this.UD_NUMBER_12;
		other.DELETED = this.DELETED;
		other.DUE_SOON = this.DUE_SOON;
		other.GLOBAL_NUM = this.GLOBAL_NUM;
		other.PRIORITY_DATE_ASSESSED = this.PRIORITY_DATE_ASSESSED;
		other.LAM_ASSESS_DONE = this.LAM_ASSESS_DONE;
		other.E2B_WW_NUMBER = this.E2B_WW_NUMBER;
		other.WORKLIST_OWNER_ID = this.WORKLIST_OWNER_ID;
		other.SUSAR = this.SUSAR;
		other.LAST_UPDATE_EVENT = this.LAST_UPDATE_EVENT;
		other.INITIAL_JUSTIFICATION = this.INITIAL_JUSTIFICATION;
		other.FORCE_SOON = this.FORCE_SOON;
		other.DUE_SOON_J = this.DUE_SOON_J;
		other.FOLLOWUP_DATE_J = this.FOLLOWUP_DATE_J;
		other.INIT_REPT_DATE_J = this.INIT_REPT_DATE_J;
		other.JUST_INIT_REPT_DATE_J = this.JUST_INIT_REPT_DATE_J;
		other.UD_TEXT_1_J = this.UD_TEXT_1_J;
		other.UD_TEXT_2_J = this.UD_TEXT_2_J;
		other.UD_TEXT_3_J = this.UD_TEXT_3_J;
		other.UD_TEXT_4_J = this.UD_TEXT_4_J;
		other.UD_TEXT_5_J = this.UD_TEXT_5_J;
		other.UD_TEXT_6_J = this.UD_TEXT_6_J;
		other.UD_TEXT_7_J = this.UD_TEXT_7_J;
		other.UD_TEXT_8_J = this.UD_TEXT_8_J;
		other.UD_TEXT_9_J = this.UD_TEXT_9_J;
		other.UD_TEXT_10_J = this.UD_TEXT_10_J;
		other.UD_TEXT_11_J = this.UD_TEXT_11_J;
		other.UD_TEXT_12_J = this.UD_TEXT_12_J;
		other.INITIAL_JUSTIFICATION_J = this.INITIAL_JUSTIFICATION_J;
		other.LOCK_STATUS_ID = this.LOCK_STATUS_ID;
		other.MEDICALLY_CONFIRM = this.MEDICALLY_CONFIRM;
		other.ENTERPRISE_ID = this.ENTERPRISE_ID;

	}

	public void copyKeysDataTo(row1Struct other) {

		other.CASE_ID = this.CASE_ID;

	}

	private String readString(ObjectInputStream dis) throws IOException {
		String strReturn = null;
		int length = 0;
		length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if (length > commonByteArray_DURGA_BD_ETL_oracle_db_link.length) {
				if (length < 1024
						&& commonByteArray_DURGA_BD_ETL_oracle_db_link.length == 0) {
					commonByteArray_DURGA_BD_ETL_oracle_db_link = new byte[1024];
				} else {
					commonByteArray_DURGA_BD_ETL_oracle_db_link = new byte[2 * length];
				}
			}
			dis.readFully(commonByteArray_DURGA_BD_ETL_oracle_db_link, 0,
					length);
			strReturn = new String(
					commonByteArray_DURGA_BD_ETL_oracle_db_link, 0, length,
					utf8Charset);
		}
		return strReturn;
	}

	private void writeString(String str, ObjectOutputStream dos)
			throws IOException {
		if (str == null) {
			dos.writeInt(-1);
		} else {
			byte[] byteArray = str.getBytes(utf8Charset);
			dos.writeInt(byteArray.length);
			dos.write(byteArray);
		}
	}

	private java.util.Date readDate(ObjectInputStream dis)
			throws IOException {
		java.util.Date dateReturn = null;
		int length = 0;
		length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
			dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, ObjectOutputStream dos)
			throws IOException {
		if (date1 == null) {
			dos.writeByte(-1);
		} else {
			dos.writeByte(0);
			dos.writeLong(date1.getTime());
		}
	}

	public void readData(ObjectInputStream dis) {
		
		System.out.println("Stream Object::"+dis.toString());

		synchronized (commonByteArrayLock_DURGA_BD_ETL_oracle_db_link) {

			try {

				int length = 0;

				this.CASE_ID = (BigDecimal) dis.readObject();

				this.CASE_NUM = readString(dis);

				this.REV = (BigDecimal) dis.readObject();

				this.WORKFLOW_SEQ_NUM = (BigDecimal) dis.readObject();

				this.LAST_WORKFLOW_SEQ_NUM = (BigDecimal) dis.readObject();

				this.CREATE_TIME = readDate(dis);

				this.INIT_REPT_DATE = readDate(dis);

				this.USER_ID = (BigDecimal) dis.readObject();

				this.LAST_UPDATE_TIME = readDate(dis);

				this.LAST_UPDATE_USER_ID = (BigDecimal) dis.readObject();

				this.REQUIRES_FOLLOWUP = (BigDecimal) dis.readObject();

				this.FOLLOWUP_DATE = readDate(dis);

				this.OWNER_ID = (BigDecimal) dis.readObject();

				this.STATE_ID = (BigDecimal) dis.readObject();

				this.COUNTRY_ID = (BigDecimal) dis.readObject();

				this.LANG_ID = (BigDecimal) dis.readObject();

				this.PRIORITY = (BigDecimal) dis.readObject();

				this.SITE_ID = (BigDecimal) dis.readObject();

				this.SERIOUSNESS = (BigDecimal) dis.readObject();

				this.RPT_TYPE_ID = (BigDecimal) dis.readObject();

				this.LAST_STATE_ID = (BigDecimal) dis.readObject();

				this.ASSESSMENT_NEEDED = (BigDecimal) dis.readObject();

				this.PRIORITY_OVERRIDE = (BigDecimal) dis.readObject();

				this.SID = readString(dis);

				this.SAFETY_DATE = readDate(dis);

				this.NORMAL_TIME = readDate(dis);

				this.MAX_TIME = readDate(dis);

				this.REPORT_SCHEDULING = (BigDecimal) dis.readObject();

				this.PRIORITY_ASSESSMENT = (BigDecimal) dis.readObject();

				this.CLOSE_USER_ID = (BigDecimal) dis.readObject();

				this.CLOSE_DATE = readDate(dis);

				this.CLOSE_NOTES = readString(dis);

				this.DATE_LOCKED = readDate(dis);

				this.UD_TEXT_1 = readString(dis);

				this.UD_TEXT_2 = readString(dis);

				this.UD_TEXT_3 = readString(dis);

				this.UD_TEXT_4 = readString(dis);

				this.UD_TEXT_5 = readString(dis);

				this.UD_TEXT_6 = readString(dis);

				this.UD_TEXT_7 = readString(dis);

				this.UD_TEXT_8 = readString(dis);

				this.UD_TEXT_9 = readString(dis);

				this.UD_TEXT_10 = readString(dis);

				this.UD_TEXT_11 = readString(dis);

				this.UD_TEXT_12 = readString(dis);

				this.UD_DATE_1 = readDate(dis);

				this.UD_DATE_2 = readDate(dis);

				this.UD_DATE_3 = readDate(dis);

				this.UD_DATE_4 = readDate(dis);

				this.UD_DATE_5 = readDate(dis);

				this.UD_DATE_6 = readDate(dis);

				this.UD_DATE_7 = readDate(dis);

				this.UD_DATE_8 = readDate(dis);

				this.UD_DATE_9 = readDate(dis);

				this.UD_DATE_10 = readDate(dis);

				this.UD_DATE_11 = readDate(dis);

				this.UD_DATE_12 = readDate(dis);

				this.UD_NUMBER_1 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_2 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_3 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_4 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_5 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_6 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_7 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_8 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_9 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_10 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_11 = (BigDecimal) dis.readObject();

				this.UD_NUMBER_12 = (BigDecimal) dis.readObject();

				this.DELETED = readDate(dis);

				this.DUE_SOON = readDate(dis);

				this.GLOBAL_NUM = readString(dis);

				this.PRIORITY_DATE_ASSESSED = readDate(dis);

				this.LAM_ASSESS_DONE = (BigDecimal) dis.readObject();

				this.E2B_WW_NUMBER = readString(dis);

				this.WORKLIST_OWNER_ID = (BigDecimal) dis.readObject();

				this.SUSAR = (BigDecimal) dis.readObject();

				this.LAST_UPDATE_EVENT = readDate(dis);

				this.INITIAL_JUSTIFICATION = readString(dis);

				this.FORCE_SOON = readDate(dis);

				this.DUE_SOON_J = readDate(dis);

				this.FOLLOWUP_DATE_J = readDate(dis);

				this.INIT_REPT_DATE_J = readDate(dis);

				this.JUST_INIT_REPT_DATE_J = readString(dis);

				this.UD_TEXT_1_J = readString(dis);

				this.UD_TEXT_2_J = readString(dis);

				this.UD_TEXT_3_J = readString(dis);

				this.UD_TEXT_4_J = readString(dis);

				this.UD_TEXT_5_J = readString(dis);

				this.UD_TEXT_6_J = readString(dis);

				this.UD_TEXT_7_J = readString(dis);

				this.UD_TEXT_8_J = readString(dis);

				this.UD_TEXT_9_J = readString(dis);

				this.UD_TEXT_10_J = readString(dis);

				this.UD_TEXT_11_J = readString(dis);

				this.UD_TEXT_12_J = readString(dis);

				this.INITIAL_JUSTIFICATION_J = readString(dis);

				this.LOCK_STATUS_ID = (BigDecimal) dis.readObject();

				this.MEDICALLY_CONFIRM = (BigDecimal) dis.readObject();

				this.ENTERPRISE_ID = (BigDecimal) dis.readObject();

			} catch (IOException e) {
				throw new RuntimeException(e);

			} catch (ClassNotFoundException eCNFE) {
				throw new RuntimeException(eCNFE);

			}

		}

	}

	public void writeData(ObjectOutputStream dos) {
		try {

			// BigDecimal

			dos.writeObject(this.CASE_ID);

			// String

			writeString(this.CASE_NUM, dos);

			// BigDecimal

			dos.writeObject(this.REV);

			// BigDecimal

			dos.writeObject(this.WORKFLOW_SEQ_NUM);

			// BigDecimal

			dos.writeObject(this.LAST_WORKFLOW_SEQ_NUM);

			// java.util.Date

			writeDate(this.CREATE_TIME, dos);

			// java.util.Date

			writeDate(this.INIT_REPT_DATE, dos);

			// BigDecimal

			dos.writeObject(this.USER_ID);

			// java.util.Date

			writeDate(this.LAST_UPDATE_TIME, dos);

			// BigDecimal

			dos.writeObject(this.LAST_UPDATE_USER_ID);

			// BigDecimal

			dos.writeObject(this.REQUIRES_FOLLOWUP);

			// java.util.Date

			writeDate(this.FOLLOWUP_DATE, dos);

			// BigDecimal

			dos.writeObject(this.OWNER_ID);

			// BigDecimal

			dos.writeObject(this.STATE_ID);

			// BigDecimal

			dos.writeObject(this.COUNTRY_ID);

			// BigDecimal

			dos.writeObject(this.LANG_ID);

			// BigDecimal

			dos.writeObject(this.PRIORITY);

			// BigDecimal

			dos.writeObject(this.SITE_ID);

			// BigDecimal

			dos.writeObject(this.SERIOUSNESS);

			// BigDecimal

			dos.writeObject(this.RPT_TYPE_ID);

			// BigDecimal

			dos.writeObject(this.LAST_STATE_ID);

			// BigDecimal

			dos.writeObject(this.ASSESSMENT_NEEDED);

			// BigDecimal

			dos.writeObject(this.PRIORITY_OVERRIDE);

			// String

			writeString(this.SID, dos);

			// java.util.Date

			writeDate(this.SAFETY_DATE, dos);

			// java.util.Date

			writeDate(this.NORMAL_TIME, dos);

			// java.util.Date

			writeDate(this.MAX_TIME, dos);

			// BigDecimal

			dos.writeObject(this.REPORT_SCHEDULING);

			// BigDecimal

			dos.writeObject(this.PRIORITY_ASSESSMENT);

			// BigDecimal

			dos.writeObject(this.CLOSE_USER_ID);

			// java.util.Date

			writeDate(this.CLOSE_DATE, dos);

			// String

			writeString(this.CLOSE_NOTES, dos);

			// java.util.Date

			writeDate(this.DATE_LOCKED, dos);

			// String

			writeString(this.UD_TEXT_1, dos);

			// String

			writeString(this.UD_TEXT_2, dos);

			// String

			writeString(this.UD_TEXT_3, dos);

			// String

			writeString(this.UD_TEXT_4, dos);

			// String

			writeString(this.UD_TEXT_5, dos);

			// String

			writeString(this.UD_TEXT_6, dos);

			// String

			writeString(this.UD_TEXT_7, dos);

			// String

			writeString(this.UD_TEXT_8, dos);

			// String

			writeString(this.UD_TEXT_9, dos);

			// String

			writeString(this.UD_TEXT_10, dos);

			// String

			writeString(this.UD_TEXT_11, dos);

			// String

			writeString(this.UD_TEXT_12, dos);

			// java.util.Date

			writeDate(this.UD_DATE_1, dos);

			// java.util.Date

			writeDate(this.UD_DATE_2, dos);

			// java.util.Date

			writeDate(this.UD_DATE_3, dos);

			// java.util.Date

			writeDate(this.UD_DATE_4, dos);

			// java.util.Date

			writeDate(this.UD_DATE_5, dos);

			// java.util.Date

			writeDate(this.UD_DATE_6, dos);

			// java.util.Date

			writeDate(this.UD_DATE_7, dos);

			// java.util.Date

			writeDate(this.UD_DATE_8, dos);

			// java.util.Date

			writeDate(this.UD_DATE_9, dos);

			// java.util.Date

			writeDate(this.UD_DATE_10, dos);

			// java.util.Date

			writeDate(this.UD_DATE_11, dos);

			// java.util.Date

			writeDate(this.UD_DATE_12, dos);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_1);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_2);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_3);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_4);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_5);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_6);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_7);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_8);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_9);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_10);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_11);

			// BigDecimal

			dos.writeObject(this.UD_NUMBER_12);

			// java.util.Date

			writeDate(this.DELETED, dos);

			// java.util.Date

			writeDate(this.DUE_SOON, dos);

			// String

			writeString(this.GLOBAL_NUM, dos);

			// java.util.Date

			writeDate(this.PRIORITY_DATE_ASSESSED, dos);

			// BigDecimal

			dos.writeObject(this.LAM_ASSESS_DONE);

			// String

			writeString(this.E2B_WW_NUMBER, dos);

			// BigDecimal

			dos.writeObject(this.WORKLIST_OWNER_ID);

			// BigDecimal

			dos.writeObject(this.SUSAR);

			// java.util.Date

			writeDate(this.LAST_UPDATE_EVENT, dos);

			// String

			writeString(this.INITIAL_JUSTIFICATION, dos);

			// java.util.Date

			writeDate(this.FORCE_SOON, dos);

			// java.util.Date

			writeDate(this.DUE_SOON_J, dos);

			// java.util.Date

			writeDate(this.FOLLOWUP_DATE_J, dos);

			// java.util.Date

			writeDate(this.INIT_REPT_DATE_J, dos);

			// String

			writeString(this.JUST_INIT_REPT_DATE_J, dos);

			// String

			writeString(this.UD_TEXT_1_J, dos);

			// String

			writeString(this.UD_TEXT_2_J, dos);

			// String

			writeString(this.UD_TEXT_3_J, dos);

			// String

			writeString(this.UD_TEXT_4_J, dos);

			// String

			writeString(this.UD_TEXT_5_J, dos);

			// String

			writeString(this.UD_TEXT_6_J, dos);

			// String

			writeString(this.UD_TEXT_7_J, dos);

			// String

			writeString(this.UD_TEXT_8_J, dos);

			// String

			writeString(this.UD_TEXT_9_J, dos);

			// String

			writeString(this.UD_TEXT_10_J, dos);

			// String

			writeString(this.UD_TEXT_11_J, dos);

			// String

			writeString(this.UD_TEXT_12_J, dos);

			// String

			writeString(this.INITIAL_JUSTIFICATION_J, dos);

			// BigDecimal

			dos.writeObject(this.LOCK_STATUS_ID);

			// BigDecimal

			dos.writeObject(this.MEDICALLY_CONFIRM);

			// BigDecimal

			dos.writeObject(this.ENTERPRISE_ID);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Override public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CASE_ID=" + String.valueOf(CASE_ID));
		sb.append(",CASE_NUM=" + CASE_NUM);
		sb.append(",REV=" + String.valueOf(REV));
		sb.append(",WORKFLOW_SEQ_NUM=" + String.valueOf(WORKFLOW_SEQ_NUM));
		sb.append(",LAST_WORKFLOW_SEQ_NUM="
				+ String.valueOf(LAST_WORKFLOW_SEQ_NUM));
		sb.append(",CREATE_TIME=" + String.valueOf(CREATE_TIME));
		sb.append(",INIT_REPT_DATE=" + String.valueOf(INIT_REPT_DATE));
		sb.append(",USER_ID=" + String.valueOf(USER_ID));
		sb.append(",LAST_UPDATE_TIME=" + String.valueOf(LAST_UPDATE_TIME));
		sb.append(",LAST_UPDATE_USER_ID="
				+ String.valueOf(LAST_UPDATE_USER_ID));
		sb.append(",REQUIRES_FOLLOWUP=" + String.valueOf(REQUIRES_FOLLOWUP));
		sb.append(",FOLLOWUP_DATE=" + String.valueOf(FOLLOWUP_DATE));
		sb.append(",OWNER_ID=" + String.valueOf(OWNER_ID));
		sb.append(",STATE_ID=" + String.valueOf(STATE_ID));
		sb.append(",COUNTRY_ID=" + String.valueOf(COUNTRY_ID));
		sb.append(",LANG_ID=" + String.valueOf(LANG_ID));
		sb.append(",PRIORITY=" + String.valueOf(PRIORITY));
		sb.append(",SITE_ID=" + String.valueOf(SITE_ID));
		sb.append(",SERIOUSNESS=" + String.valueOf(SERIOUSNESS));
		sb.append(",RPT_TYPE_ID=" + String.valueOf(RPT_TYPE_ID));
		sb.append(",LAST_STATE_ID=" + String.valueOf(LAST_STATE_ID));
		sb.append(",ASSESSMENT_NEEDED=" + String.valueOf(ASSESSMENT_NEEDED));
		sb.append(",PRIORITY_OVERRIDE=" + String.valueOf(PRIORITY_OVERRIDE));
		sb.append(",SID=" + SID);
		sb.append(",SAFETY_DATE=" + String.valueOf(SAFETY_DATE));
		sb.append(",NORMAL_TIME=" + String.valueOf(NORMAL_TIME));
		sb.append(",MAX_TIME=" + String.valueOf(MAX_TIME));
		sb.append(",REPORT_SCHEDULING=" + String.valueOf(REPORT_SCHEDULING));
		sb.append(",PRIORITY_ASSESSMENT="
				+ String.valueOf(PRIORITY_ASSESSMENT));
		sb.append(",CLOSE_USER_ID=" + String.valueOf(CLOSE_USER_ID));
		sb.append(",CLOSE_DATE=" + String.valueOf(CLOSE_DATE));
		sb.append(",CLOSE_NOTES=" + CLOSE_NOTES);
		sb.append(",DATE_LOCKED=" + String.valueOf(DATE_LOCKED));
		sb.append(",UD_TEXT_1=" + UD_TEXT_1);
		sb.append(",UD_TEXT_2=" + UD_TEXT_2);
		sb.append(",UD_TEXT_3=" + UD_TEXT_3);
		sb.append(",UD_TEXT_4=" + UD_TEXT_4);
		sb.append(",UD_TEXT_5=" + UD_TEXT_5);
		sb.append(",UD_TEXT_6=" + UD_TEXT_6);
		sb.append(",UD_TEXT_7=" + UD_TEXT_7);
		sb.append(",UD_TEXT_8=" + UD_TEXT_8);
		sb.append(",UD_TEXT_9=" + UD_TEXT_9);
		sb.append(",UD_TEXT_10=" + UD_TEXT_10);
		sb.append(",UD_TEXT_11=" + UD_TEXT_11);
		sb.append(",UD_TEXT_12=" + UD_TEXT_12);
		sb.append(",UD_DATE_1=" + String.valueOf(UD_DATE_1));
		sb.append(",UD_DATE_2=" + String.valueOf(UD_DATE_2));
		sb.append(",UD_DATE_3=" + String.valueOf(UD_DATE_3));
		sb.append(",UD_DATE_4=" + String.valueOf(UD_DATE_4));
		sb.append(",UD_DATE_5=" + String.valueOf(UD_DATE_5));
		sb.append(",UD_DATE_6=" + String.valueOf(UD_DATE_6));
		sb.append(",UD_DATE_7=" + String.valueOf(UD_DATE_7));
		sb.append(",UD_DATE_8=" + String.valueOf(UD_DATE_8));
		sb.append(",UD_DATE_9=" + String.valueOf(UD_DATE_9));
		sb.append(",UD_DATE_10=" + String.valueOf(UD_DATE_10));
		sb.append(",UD_DATE_11=" + String.valueOf(UD_DATE_11));
		sb.append(",UD_DATE_12=" + String.valueOf(UD_DATE_12));
		sb.append(",UD_NUMBER_1=" + String.valueOf(UD_NUMBER_1));
		sb.append(",UD_NUMBER_2=" + String.valueOf(UD_NUMBER_2));
		sb.append(",UD_NUMBER_3=" + String.valueOf(UD_NUMBER_3));
		sb.append(",UD_NUMBER_4=" + String.valueOf(UD_NUMBER_4));
		sb.append(",UD_NUMBER_5=" + String.valueOf(UD_NUMBER_5));
		sb.append(",UD_NUMBER_6=" + String.valueOf(UD_NUMBER_6));
		sb.append(",UD_NUMBER_7=" + String.valueOf(UD_NUMBER_7));
		sb.append(",UD_NUMBER_8=" + String.valueOf(UD_NUMBER_8));
		sb.append(",UD_NUMBER_9=" + String.valueOf(UD_NUMBER_9));
		sb.append(",UD_NUMBER_10=" + String.valueOf(UD_NUMBER_10));
		sb.append(",UD_NUMBER_11=" + String.valueOf(UD_NUMBER_11));
		sb.append(",UD_NUMBER_12=" + String.valueOf(UD_NUMBER_12));
		sb.append(",DELETED=" + String.valueOf(DELETED));
		sb.append(",DUE_SOON=" + String.valueOf(DUE_SOON));
		sb.append(",GLOBAL_NUM=" + GLOBAL_NUM);
		sb.append(",PRIORITY_DATE_ASSESSED="
				+ String.valueOf(PRIORITY_DATE_ASSESSED));
		sb.append(",LAM_ASSESS_DONE=" + String.valueOf(LAM_ASSESS_DONE));
		sb.append(",E2B_WW_NUMBER=" + E2B_WW_NUMBER);
		sb.append(",WORKLIST_OWNER_ID=" + String.valueOf(WORKLIST_OWNER_ID));
		sb.append(",SUSAR=" + String.valueOf(SUSAR));
		sb.append(",LAST_UPDATE_EVENT=" + String.valueOf(LAST_UPDATE_EVENT));
		sb.append(",INITIAL_JUSTIFICATION=" + INITIAL_JUSTIFICATION);
		sb.append(",FORCE_SOON=" + String.valueOf(FORCE_SOON));
		sb.append(",DUE_SOON_J=" + String.valueOf(DUE_SOON_J));
		sb.append(",FOLLOWUP_DATE_J=" + String.valueOf(FOLLOWUP_DATE_J));
		sb.append(",INIT_REPT_DATE_J=" + String.valueOf(INIT_REPT_DATE_J));
		sb.append(",JUST_INIT_REPT_DATE_J=" + JUST_INIT_REPT_DATE_J);
		sb.append(",UD_TEXT_1_J=" + UD_TEXT_1_J);
		sb.append(",UD_TEXT_2_J=" + UD_TEXT_2_J);
		sb.append(",UD_TEXT_3_J=" + UD_TEXT_3_J);
		sb.append(",UD_TEXT_4_J=" + UD_TEXT_4_J);
		sb.append(",UD_TEXT_5_J=" + UD_TEXT_5_J);
		sb.append(",UD_TEXT_6_J=" + UD_TEXT_6_J);
		sb.append(",UD_TEXT_7_J=" + UD_TEXT_7_J);
		sb.append(",UD_TEXT_8_J=" + UD_TEXT_8_J);
		sb.append(",UD_TEXT_9_J=" + UD_TEXT_9_J);
		sb.append(",UD_TEXT_10_J=" + UD_TEXT_10_J);
		sb.append(",UD_TEXT_11_J=" + UD_TEXT_11_J);
		sb.append(",UD_TEXT_12_J=" + UD_TEXT_12_J);
		sb.append(",INITIAL_JUSTIFICATION_J=" + INITIAL_JUSTIFICATION_J);
		sb.append(",LOCK_STATUS_ID=" + String.valueOf(LOCK_STATUS_ID));
		sb.append(",MEDICALLY_CONFIRM=" + String.valueOf(MEDICALLY_CONFIRM));
		sb.append(",ENTERPRISE_ID=" + String.valueOf(ENTERPRISE_ID));
		sb.append("]");

		return sb.toString();
	}

	/**
	 * Compare keys
	 */
	public int compareTo(row1Struct other) {

		int returnValue = -1;

		returnValue = checkNullsAndCompare(this.CASE_ID, other.CASE_ID);
		if (returnValue != 0) {
			return returnValue;
		}

		return returnValue;
	}

	private int checkNullsAndCompare(Object object1, Object object2) {
		int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
			returnValue = ((Comparable) object1).compareTo(object2);
		} else if (object1 != null && object2 != null) {
			returnValue = compareStrings(object1.toString(),
					object2.toString());
		} else if (object1 == null && object2 != null) {
			returnValue = 1;
		} else if (object1 != null && object2 == null) {
			returnValue = -1;
		} else {
			returnValue = 0;
		}

		return returnValue;
	}

	private int compareStrings(String string1, String string2) {
		return string1.compareTo(string2);
	}

}
