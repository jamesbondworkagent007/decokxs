package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class CreateBucketRequest extends OSSRequest {
    public static final String TAB_LOCATIONCONSTRAINT = "LocationConstraint";
    public static final String TAB_STORAGECLASS = "StorageClass";
    private CannedAccessControlList bucketACL;
    private String bucketName;
    private StorageClass bucketStorageClass = StorageClass.Standard;
    private String locationConstraint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CannedAccessControlList getBucketACL() {
        return this.bucketACL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StorageClass getBucketStorageClass() {
        return this.bucketStorageClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getLocationConstraint() {
        return this.locationConstraint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketACL(CannedAccessControlList cannedAccessControlList) {
        this.bucketACL = cannedAccessControlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketStorageClass(StorageClass storageClass) {
        this.bucketStorageClass = storageClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public void setLocationConstraint(String str) {
        this.locationConstraint = str;
    }

    public CreateBucketRequest(String str) {
        setBucketName(str);
    }
}
