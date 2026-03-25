package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CopyObjectRequest extends OSSRequest {
    private String destinationBucketName;
    private String destinationKey;
    private Date modifiedSinceConstraint;
    private ObjectMetadata newObjectMetadata;
    private String serverSideEncryption;
    private String sourceBucketName;
    private String sourceKey;
    private Date unmodifiedSinceConstraint;
    private List<String> matchingETagConstraints = new ArrayList();
    private List<String> nonmatchingEtagConstraints = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDestinationKey() {
        return this.destinationKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getMatchingETagConstraints() {
        return this.matchingETagConstraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getModifiedSinceConstraint() {
        return this.modifiedSinceConstraint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata getNewObjectMetadata() {
        return this.newObjectMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getNonmatchingEtagConstraints() {
        return this.nonmatchingEtagConstraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSourceKey() {
        return this.sourceKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getUnmodifiedSinceConstraint() {
        return this.unmodifiedSinceConstraint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDestinationBucketName(String str) {
        this.destinationBucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDestinationKey(String str) {
        this.destinationKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setModifiedSinceConstraint(Date date) {
        this.modifiedSinceConstraint = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNewObjectMetadata(ObjectMetadata objectMetadata) {
        this.newObjectMetadata = objectMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setServerSideEncryption(String str) {
        this.serverSideEncryption = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSourceBucketName(String str) {
        this.sourceBucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSourceKey(String str) {
        this.sourceKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUnmodifiedSinceConstraint(Date date) {
        this.unmodifiedSinceConstraint = date;
    }

    public CopyObjectRequest(String str, String str2, String str3, String str4) {
        setSourceBucketName(str);
        setSourceKey(str2);
        setDestinationBucketName(str3);
        setDestinationKey(str4);
    }

    public void setMatchingETagConstraints(List<String> list) {
        this.matchingETagConstraints.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.matchingETagConstraints.addAll(list);
    }

    public void clearMatchingETagConstraints() {
        this.matchingETagConstraints.clear();
    }

    public void setNonmatchingETagConstraints(List<String> list) {
        this.nonmatchingEtagConstraints.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.nonmatchingEtagConstraints.addAll(list);
    }

    public void clearNonmatchingETagConstraints() {
        this.nonmatchingEtagConstraints.clear();
    }
}
