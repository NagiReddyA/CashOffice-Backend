package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_RCPT_ALLOCATION_ACQ_LOAN database table.
 * 
 */
@Entity
@Table(name="T_RCPT_ALLOCATION_ACQ_LOAN")
@NamedQuery(name="TRcptAllocationAcqLoan.findAll", query="SELECT t FROM TRcptAllocationAcqLoan t")
public class TRcptAllocationAcqLoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCPT_ALL_ACQ_LOAN_ID")
	private double rcptAllAcqLoanId;

	@Column(name="ALLOCATED_AMOUNT")
	private BigDecimal allocatedAmount;

	@Column(name="APP_ACTIVITY_ID")
	private double appActivityId;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE2")
	private String attribute2;

	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;

	@Column(name="ATTRIBUTE5")
	private String attribute5;

	@Column(name="ATTRIBUTE6")
	private String attribute6;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="LOAN_BALANCE")
	private BigDecimal loanBalance;

	@Column(name="LOAN_TYPE")
	private String loanType;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="POLICY_STATUS")
	private String policyStatus;

	@Column(name="PRODUCT_CODE")
	private int productCode;

	@Column(name="REALLOCATION_ID")
	private double reallocationId;

	@Column(name="REALLOCATION_STATUS")
	private String reallocationStatus;

	//bi-directional many-to-one association to TRcptAllocation
	@ManyToOne
	@JoinColumn(name="RCPT_ALL_ID")
	private TRcptAllocation TRcptAllocation;

	public TRcptAllocationAcqLoan() {
	}

	public double getRcptAllAcqLoanId() {
		return this.rcptAllAcqLoanId;
	}

	public void setRcptAllAcqLoanId(double rcptAllAcqLoanId) {
		this.rcptAllAcqLoanId = rcptAllAcqLoanId;
	}

	public BigDecimal getAllocatedAmount() {
		return this.allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public double getAppActivityId() {
		return this.appActivityId;
	}

	public void setAppActivityId(double appActivityId) {
		this.appActivityId = appActivityId;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public BigDecimal getLoanBalance() {
		return this.loanBalance;
	}

	public void setLoanBalance(BigDecimal loanBalance) {
		this.loanBalance = loanBalance;
	}

	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public int getProductCode() {
		return this.productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public double getReallocationId() {
		return this.reallocationId;
	}

	public void setReallocationId(double reallocationId) {
		this.reallocationId = reallocationId;
	}

	public String getReallocationStatus() {
		return this.reallocationStatus;
	}

	public void setReallocationStatus(String reallocationStatus) {
		this.reallocationStatus = reallocationStatus;
	}

	public TRcptAllocation getTRcptAllocation() {
		return this.TRcptAllocation;
	}

	public void setTRcptAllocation(TRcptAllocation TRcptAllocation) {
		this.TRcptAllocation = TRcptAllocation;
	}

}