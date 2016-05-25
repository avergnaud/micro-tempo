//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.05.25 à 01:55:32 PM CEST 
//


package com.catamania.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * GENERE PAR XJC
 * D:\dt\jdk1.8.0_60\bin\xjc -d src -p com.catamania.model jira_tempo.xsd
 * 
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="worklog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="worklog_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="issue_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="issue_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="work_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="staff_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billing_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billing_attributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activity_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="work_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="parent_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="reporter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="external_tstamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="external_hours" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="external_result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hash_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="date_from" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date_to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number_of_worklogs" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diffOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorsOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="validOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addBillingInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addIssueSummary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addIssueDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="duration_ms" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="headerOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addIssueDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addParentIssue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addUserDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addWorklogDetails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="issueKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="projectKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "worklog"
})
@XmlRootElement(name = "worklogs")
public class Worklogs {

    protected List<Worklogs.Worklog> worklog;
    @XmlAttribute(name = "date_from")
    protected String dateFrom;
    @XmlAttribute(name = "date_to")
    protected String dateTo;
    @XmlAttribute(name = "number_of_worklogs")
    protected Byte numberOfWorklogs;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "diffOnly")
    protected String diffOnly;
    @XmlAttribute(name = "errorsOnly")
    protected String errorsOnly;
    @XmlAttribute(name = "validOnly")
    protected String validOnly;
    @XmlAttribute(name = "addBillingInfo")
    protected String addBillingInfo;
    @XmlAttribute(name = "addIssueSummary")
    protected String addIssueSummary;
    @XmlAttribute(name = "addIssueDescription")
    protected String addIssueDescription;
    @XmlAttribute(name = "duration_ms")
    protected Byte durationMs;
    @XmlAttribute(name = "headerOnly")
    protected String headerOnly;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "addIssueDetails")
    protected String addIssueDetails;
    @XmlAttribute(name = "addParentIssue")
    protected String addParentIssue;
    @XmlAttribute(name = "addUserDetails")
    protected String addUserDetails;
    @XmlAttribute(name = "addWorklogDetails")
    protected String addWorklogDetails;
    @XmlAttribute(name = "billingKey")
    protected String billingKey;
    @XmlAttribute(name = "issueKey")
    protected String issueKey;
    @XmlAttribute(name = "projectKey")
    protected String projectKey;
    @XmlAttribute(name = "addApprovalStatus")
    protected String addApprovalStatus;

    /**
     * Gets the value of the worklog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worklog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorklog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Worklogs.Worklog }
     * 
     * 
     */
    public List<Worklogs.Worklog> getWorklog() {
        if (worklog == null) {
            worklog = new ArrayList<Worklogs.Worklog>();
        }
        return this.worklog;
    }

    /**
     * Obtient la valeur de la propriété dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Définit la valeur de la propriété dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Obtient la valeur de la propriété dateTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Définit la valeur de la propriété dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfWorklogs.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNumberOfWorklogs() {
        return numberOfWorklogs;
    }

    /**
     * Définit la valeur de la propriété numberOfWorklogs.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNumberOfWorklogs(Byte value) {
        this.numberOfWorklogs = value;
    }

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtient la valeur de la propriété diffOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffOnly() {
        return diffOnly;
    }

    /**
     * Définit la valeur de la propriété diffOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffOnly(String value) {
        this.diffOnly = value;
    }

    /**
     * Obtient la valeur de la propriété errorsOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorsOnly() {
        return errorsOnly;
    }

    /**
     * Définit la valeur de la propriété errorsOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorsOnly(String value) {
        this.errorsOnly = value;
    }

    /**
     * Obtient la valeur de la propriété validOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidOnly() {
        return validOnly;
    }

    /**
     * Définit la valeur de la propriété validOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidOnly(String value) {
        this.validOnly = value;
    }

    /**
     * Obtient la valeur de la propriété addBillingInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddBillingInfo() {
        return addBillingInfo;
    }

    /**
     * Définit la valeur de la propriété addBillingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddBillingInfo(String value) {
        this.addBillingInfo = value;
    }

    /**
     * Obtient la valeur de la propriété addIssueSummary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddIssueSummary() {
        return addIssueSummary;
    }

    /**
     * Définit la valeur de la propriété addIssueSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddIssueSummary(String value) {
        this.addIssueSummary = value;
    }

    /**
     * Obtient la valeur de la propriété addIssueDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddIssueDescription() {
        return addIssueDescription;
    }

    /**
     * Définit la valeur de la propriété addIssueDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddIssueDescription(String value) {
        this.addIssueDescription = value;
    }

    /**
     * Obtient la valeur de la propriété durationMs.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDurationMs() {
        return durationMs;
    }

    /**
     * Définit la valeur de la propriété durationMs.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDurationMs(Byte value) {
        this.durationMs = value;
    }

    /**
     * Obtient la valeur de la propriété headerOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderOnly() {
        return headerOnly;
    }

    /**
     * Définit la valeur de la propriété headerOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderOnly(String value) {
        this.headerOnly = value;
    }

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété addIssueDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddIssueDetails() {
        return addIssueDetails;
    }

    /**
     * Définit la valeur de la propriété addIssueDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddIssueDetails(String value) {
        this.addIssueDetails = value;
    }

    /**
     * Obtient la valeur de la propriété addParentIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddParentIssue() {
        return addParentIssue;
    }

    /**
     * Définit la valeur de la propriété addParentIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddParentIssue(String value) {
        this.addParentIssue = value;
    }

    /**
     * Obtient la valeur de la propriété addUserDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddUserDetails() {
        return addUserDetails;
    }

    /**
     * Définit la valeur de la propriété addUserDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddUserDetails(String value) {
        this.addUserDetails = value;
    }

    /**
     * Obtient la valeur de la propriété addWorklogDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddWorklogDetails() {
        return addWorklogDetails;
    }

    /**
     * Définit la valeur de la propriété addWorklogDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddWorklogDetails(String value) {
        this.addWorklogDetails = value;
    }

    /**
     * Obtient la valeur de la propriété billingKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingKey() {
        return billingKey;
    }

    /**
     * Définit la valeur de la propriété billingKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingKey(String value) {
        this.billingKey = value;
    }

    /**
     * Obtient la valeur de la propriété issueKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueKey() {
        return issueKey;
    }

    /**
     * Définit la valeur de la propriété issueKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueKey(String value) {
        this.issueKey = value;
    }

    /**
     * Obtient la valeur de la propriété projectKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * Définit la valeur de la propriété projectKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectKey(String value) {
        this.projectKey = value;
    }

    /**
     * Obtient la valeur de la propriété addApprovalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddApprovalStatus() {
        return addApprovalStatus;
    }

    /**
     * Définit la valeur de la propriété addApprovalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddApprovalStatus(String value) {
        this.addApprovalStatus = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="worklog_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="issue_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="issue_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="work_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="staff_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billing_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billing_attributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activity_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="work_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="parent_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="reporter" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="external_tstamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="external_hours" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="external_result" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hash_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "worklogId",
        "issueId",
        "issueKey",
        "hours",
        "workDate",
        "username",
        "staffId",
        "billingKey",
        "billingAttributes",
        "activityId",
        "activityName",
        "workDescription",
        "parentKey",
        "reporter",
        "externalId",
        "externalTstamp",
        "externalHours",
        "externalResult",
        "hashValue"
    })
    public static class Worklog {

        @XmlElement(name = "worklog_id")
        protected short worklogId;
        @XmlElement(name = "issue_id")
        protected short issueId;
        @XmlElement(name = "issue_key", required = true)
        protected String issueKey;
        protected float hours;
        @XmlElement(name = "work_date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar workDate;
        @XmlElement(required = true)
        protected String username;
        @XmlElement(name = "staff_id", required = true)
        protected String staffId;
        @XmlElement(name = "billing_key", required = true)
        protected String billingKey;
        @XmlElement(name = "billing_attributes", required = true)
        protected String billingAttributes;
        @XmlElement(name = "activity_id", required = true)
        protected String activityId;
        @XmlElement(name = "activity_name", required = true)
        protected String activityName;
        @XmlElement(name = "work_description", required = true)
        protected String workDescription;
        @XmlElement(name = "parent_key", required = true)
        protected String parentKey;
        @XmlElement(required = true)
        protected String reporter;
        @XmlElement(name = "external_id", required = true)
        protected String externalId;
        @XmlElement(name = "external_tstamp", required = true)
        protected String externalTstamp;
        @XmlElement(name = "external_hours")
        protected float externalHours;
        @XmlElement(name = "external_result", required = true)
        protected String externalResult;
        @XmlElement(name = "hash_value", required = true)
        protected String hashValue;

        /**
         * Obtient la valeur de la propriété worklogId.
         * 
         */
        public short getWorklogId() {
            return worklogId;
        }

        /**
         * Définit la valeur de la propriété worklogId.
         * 
         */
        public void setWorklogId(short value) {
            this.worklogId = value;
        }

        /**
         * Obtient la valeur de la propriété issueId.
         * 
         */
        public short getIssueId() {
            return issueId;
        }

        /**
         * Définit la valeur de la propriété issueId.
         * 
         */
        public void setIssueId(short value) {
            this.issueId = value;
        }

        /**
         * Obtient la valeur de la propriété issueKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssueKey() {
            return issueKey;
        }

        /**
         * Définit la valeur de la propriété issueKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssueKey(String value) {
            this.issueKey = value;
        }

        /**
         * Obtient la valeur de la propriété hours.
         * 
         */
        public float getHours() {
            return hours;
        }

        /**
         * Définit la valeur de la propriété hours.
         * 
         */
        public void setHours(float value) {
            this.hours = value;
        }

        /**
         * Obtient la valeur de la propriété workDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getWorkDate() {
            return workDate;
        }

        /**
         * Définit la valeur de la propriété workDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setWorkDate(XMLGregorianCalendar value) {
            this.workDate = value;
        }

        /**
         * Obtient la valeur de la propriété username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Définit la valeur de la propriété username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Obtient la valeur de la propriété staffId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffId() {
            return staffId;
        }

        /**
         * Définit la valeur de la propriété staffId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffId(String value) {
            this.staffId = value;
        }

        /**
         * Obtient la valeur de la propriété billingKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingKey() {
            return billingKey;
        }

        /**
         * Définit la valeur de la propriété billingKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingKey(String value) {
            this.billingKey = value;
        }

        /**
         * Obtient la valeur de la propriété billingAttributes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingAttributes() {
            return billingAttributes;
        }

        /**
         * Définit la valeur de la propriété billingAttributes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingAttributes(String value) {
            this.billingAttributes = value;
        }

        /**
         * Obtient la valeur de la propriété activityId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityId() {
            return activityId;
        }

        /**
         * Définit la valeur de la propriété activityId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityId(String value) {
            this.activityId = value;
        }

        /**
         * Obtient la valeur de la propriété activityName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityName() {
            return activityName;
        }

        /**
         * Définit la valeur de la propriété activityName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityName(String value) {
            this.activityName = value;
        }

        /**
         * Obtient la valeur de la propriété workDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkDescription() {
            return workDescription;
        }

        /**
         * Définit la valeur de la propriété workDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkDescription(String value) {
            this.workDescription = value;
        }

        /**
         * Obtient la valeur de la propriété parentKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentKey() {
            return parentKey;
        }

        /**
         * Définit la valeur de la propriété parentKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentKey(String value) {
            this.parentKey = value;
        }

        /**
         * Obtient la valeur de la propriété reporter.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReporter() {
            return reporter;
        }

        /**
         * Définit la valeur de la propriété reporter.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReporter(String value) {
            this.reporter = value;
        }

        /**
         * Obtient la valeur de la propriété externalId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Définit la valeur de la propriété externalId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

        /**
         * Obtient la valeur de la propriété externalTstamp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalTstamp() {
            return externalTstamp;
        }

        /**
         * Définit la valeur de la propriété externalTstamp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalTstamp(String value) {
            this.externalTstamp = value;
        }

        /**
         * Obtient la valeur de la propriété externalHours.
         * 
         */
        public float getExternalHours() {
            return externalHours;
        }

        /**
         * Définit la valeur de la propriété externalHours.
         * 
         */
        public void setExternalHours(float value) {
            this.externalHours = value;
        }

        /**
         * Obtient la valeur de la propriété externalResult.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalResult() {
            return externalResult;
        }

        /**
         * Définit la valeur de la propriété externalResult.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalResult(String value) {
            this.externalResult = value;
        }

        /**
         * Obtient la valeur de la propriété hashValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHashValue() {
            return hashValue;
        }

        /**
         * Définit la valeur de la propriété hashValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHashValue(String value) {
            this.hashValue = value;
        }

    }

}
