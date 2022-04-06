/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The AuditComplianceEventInfo is a POJO class extends AviRestResource that used for creating
 * AuditComplianceEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditComplianceEventInfo  {
    @JsonProperty("cluster_uuid")
    private String clusterUuid = null;

    @JsonProperty("core_archive")
    private String coreArchive = null;

    @JsonProperty("detailed_reason")
    private String detailedReason = null;

    @JsonProperty("event_generated_by_se")
    private Boolean eventGeneratedBySe = null;

    @JsonProperty("fingerprint")
    private String fingerprint = null;

    @JsonProperty("location")
    private String location = null;

    @JsonProperty("node")
    private String node = null;

    @JsonProperty("patch_version")
    private String patchVersion = null;

    @JsonProperty("process_name")
    private String processName = null;

    @JsonProperty("protocol")
    private String protocol = null;

    @JsonProperty("result")
    private String result = null;

    @JsonProperty("se_uuid")
    private String seUuid = null;

    @JsonProperty("subjects")
    private List<ACSubjectInfo> subjects = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("user_identities")
    private List<ACUserIdentity> userIdentities = null;

    @JsonProperty("version")
    private String version = null;



    /**
     * This is the getter method this will return the attribute value.
     * Cluster uuid used for controller event.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterUuid
     */
    public String getClusterUuid() {
        return clusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster uuid used for controller event.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterUuid set the clusterUuid.
     */
    public void setClusterUuid(String  clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of core archive.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return coreArchive
     */
    public String getCoreArchive() {
        return coreArchive;
    }

    /**
     * This is the setter method to the attribute.
     * Name of core archive.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param coreArchive set the coreArchive.
     */
    public void setCoreArchive(String  coreArchive) {
        this.coreArchive = coreArchive;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Detailed report of the audit event.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return detailedReason
     */
    public String getDetailedReason() {
        return detailedReason;
    }

    /**
     * This is the setter method to the attribute.
     * Detailed report of the audit event.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param detailedReason set the detailedReason.
     */
    public void setDetailedReason(String  detailedReason) {
        this.detailedReason = detailedReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set the flag if event is generated by se.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventGeneratedBySe
     */
    public Boolean getEventGeneratedBySe() {
        return eventGeneratedBySe;
    }

    /**
     * This is the setter method to the attribute.
     * Set the flag if event is generated by se.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventGeneratedBySe set the eventGeneratedBySe.
     */
    public void setEventGeneratedBySe(Boolean  eventGeneratedBySe) {
        this.eventGeneratedBySe = eventGeneratedBySe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fingerprint extracted from the stacktrace.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Fingerprint extracted from the stacktrace.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fingerprint set the fingerprint.
     */
    public void setFingerprint(String  fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Information identifying physical location for audit event (e.g.
     * Santa clara (usa), bengaluru (india)).
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * This is the setter method to the attribute.
     * Information identifying physical location for audit event (e.g.
     * Santa clara (usa), bengaluru (india)).
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param location set the location.
     */
    public void setLocation(String  location) {
        this.location = location;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Node on which crash is generated.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return node
     */
    public String getNode() {
        return node;
    }

    /**
     * This is the setter method to the attribute.
     * Node on which crash is generated.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param node set the node.
     */
    public void setNode(String  node) {
        this.node = node;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Patch version of node.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchVersion
     */
    public String getPatchVersion() {
        return patchVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Patch version of node.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchVersion set the patchVersion.
     */
    public void setPatchVersion(String  patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Crashed core process name.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * This is the setter method to the attribute.
     * Crashed core process name.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param processName set the processName.
     */
    public void setProcessName(String  processName) {
        this.processName = processName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Protocol used for communication to the external entity.
     * Enum options - SSH1_0, TLS1_2, HTTPS1_0, HTTP_PLAIN_TEXT, HTTPS_INSECURE, SSH2_0.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Protocol used for communication to the external entity.
     * Enum options - SSH1_0, TLS1_2, HTTPS1_0, HTTP_PLAIN_TEXT, HTTPS_INSECURE, SSH2_0.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(String  protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Summarized failure of the transaction (e.g.
     * Invalid request, expired certificate).
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * This is the setter method to the attribute.
     * Summarized failure of the transaction (e.g.
     * Invalid request, expired certificate).
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param result set the result.
     */
    public void setResult(String  result) {
        this.result = result;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine uuid used for service engine event.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine uuid used for service engine event.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Subjects of audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subjects
     */
    public List<ACSubjectInfo> getSubjects() {
        return subjects;
    }

    /**
     * This is the setter method. this will set the subjects
     * Subjects of audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subjects
     */
    public void setSubjects(List<ACSubjectInfo>  subjects) {
        this.subjects = subjects;
    }

    /**
     * This is the setter method this will set the subjects
     * Subjects of audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subjects
     */
    public AuditComplianceEventInfo addSubjectsItem(ACSubjectInfo subjectsItem) {
      if (this.subjects == null) {
        this.subjects = new ArrayList<ACSubjectInfo>();
      }
      this.subjects.add(subjectsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of audit event.
     * Enum options - AUDIT_INVALID_CREDENTIALS, AUDIT_NAME_RESOLUTION_ERROR, AUDIT_DIAL_X509_ERROR, AUDIT_CORE_GENERATED,
     * AUDIT_SECURE_KEY_EXCHANGE_BAD_REQUEST_FORMAT, AUDIT_SECURE_KEY_EXCHANGE_BAD_CLIENT_TYPE, AUDIT_SECURE_KEY_EXCHANGE_FIELD_NOT_FOUND,
     * AUDIT_SECURE_KEY_EXCHANGE_BAD_FIELD_VALUE, AUDIT_SECURE_KEY_EXCHANGE_INVALID_AUTHORIZATION, AUDIT_SECURE_KEY_EXCHANGE_INTERNAL_ERROR,
     * AUDIT_SECURE_KEY_EXCHANGE_CERTIFICATE_VERIFY_ERROR, AUDIT_SECURE_KEY_EXCHANGE_RESPONSE_ERROR.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of audit event.
     * Enum options - AUDIT_INVALID_CREDENTIALS, AUDIT_NAME_RESOLUTION_ERROR, AUDIT_DIAL_X509_ERROR, AUDIT_CORE_GENERATED,
     * AUDIT_SECURE_KEY_EXCHANGE_BAD_REQUEST_FORMAT, AUDIT_SECURE_KEY_EXCHANGE_BAD_CLIENT_TYPE, AUDIT_SECURE_KEY_EXCHANGE_FIELD_NOT_FOUND,
     * AUDIT_SECURE_KEY_EXCHANGE_BAD_FIELD_VALUE, AUDIT_SECURE_KEY_EXCHANGE_INVALID_AUTHORIZATION, AUDIT_SECURE_KEY_EXCHANGE_INTERNAL_ERROR,
     * AUDIT_SECURE_KEY_EXCHANGE_CERTIFICATE_VERIFY_ERROR, AUDIT_SECURE_KEY_EXCHANGE_RESPONSE_ERROR.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of users (username etc) related to the audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userIdentities
     */
    public List<ACUserIdentity> getUserIdentities() {
        return userIdentities;
    }

    /**
     * This is the setter method. this will set the userIdentities
     * List of users (username etc) related to the audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userIdentities
     */
    public void setUserIdentities(List<ACUserIdentity>  userIdentities) {
        this.userIdentities = userIdentities;
    }

    /**
     * This is the setter method this will set the userIdentities
     * List of users (username etc) related to the audit event.
     * Field introduced in 20.1.3.
     * Minimum of 1 items required.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userIdentities
     */
    public AuditComplianceEventInfo addUserIdentitiesItem(ACUserIdentity userIdentitiesItem) {
      if (this.userIdentities == null) {
        this.userIdentities = new ArrayList<ACUserIdentity>();
      }
      this.userIdentities.add(userIdentitiesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version tag of node.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Version tag of node.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AuditComplianceEventInfo objAuditComplianceEventInfo = (AuditComplianceEventInfo) o;
      return   Objects.equals(this.type, objAuditComplianceEventInfo.type)&&
  Objects.equals(this.location, objAuditComplianceEventInfo.location)&&
  Objects.equals(this.result, objAuditComplianceEventInfo.result)&&
  Objects.equals(this.userIdentities, objAuditComplianceEventInfo.userIdentities)&&
  Objects.equals(this.protocol, objAuditComplianceEventInfo.protocol)&&
  Objects.equals(this.subjects, objAuditComplianceEventInfo.subjects)&&
  Objects.equals(this.detailedReason, objAuditComplianceEventInfo.detailedReason)&&
  Objects.equals(this.processName, objAuditComplianceEventInfo.processName)&&
  Objects.equals(this.node, objAuditComplianceEventInfo.node)&&
  Objects.equals(this.clusterUuid, objAuditComplianceEventInfo.clusterUuid)&&
  Objects.equals(this.seUuid, objAuditComplianceEventInfo.seUuid)&&
  Objects.equals(this.version, objAuditComplianceEventInfo.version)&&
  Objects.equals(this.patchVersion, objAuditComplianceEventInfo.patchVersion)&&
  Objects.equals(this.eventGeneratedBySe, objAuditComplianceEventInfo.eventGeneratedBySe)&&
  Objects.equals(this.fingerprint, objAuditComplianceEventInfo.fingerprint)&&
  Objects.equals(this.coreArchive, objAuditComplianceEventInfo.coreArchive);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuditComplianceEventInfo {\n");
                  sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
                        sb.append("    coreArchive: ").append(toIndentedString(coreArchive)).append("\n");
                        sb.append("    detailedReason: ").append(toIndentedString(detailedReason)).append("\n");
                        sb.append("    eventGeneratedBySe: ").append(toIndentedString(eventGeneratedBySe)).append("\n");
                        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
                        sb.append("    location: ").append(toIndentedString(location)).append("\n");
                        sb.append("    node: ").append(toIndentedString(node)).append("\n");
                        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
                        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    result: ").append(toIndentedString(result)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
                        sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    userIdentities: ").append(toIndentedString(userIdentities)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
