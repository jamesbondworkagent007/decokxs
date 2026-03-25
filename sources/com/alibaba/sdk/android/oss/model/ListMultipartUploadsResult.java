package com.alibaba.sdk.android.oss.model;

import android.util.Xml;
import androidx.compose.material3.TextFieldImplKt;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes14.dex */
public class ListMultipartUploadsResult extends OSSResult {
    private String bucketName;
    private String delimiter;
    private boolean isTruncated;
    private String keyMarker;
    private int maxUploads;
    private String nextKeyMarker;
    private String nextUploadIdMarker;
    private String prefix;
    private String uploadIdMarker;
    private List<MultipartUpload> multipartUploads = new ArrayList();
    private List<String> commonPrefixes = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDelimiter() {
        return this.delimiter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxUploads() {
        return this.maxUploads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<MultipartUpload> getMultipartUploads() {
        return this.multipartUploads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextUploadIdMarker() {
        return this.nextUploadIdMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isTruncated() {
        return this.isTruncated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKeyMarker(String str) {
        this.keyMarker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxUploads(int i) {
        this.maxUploads = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNextKeyMarker(String str) {
        this.nextKeyMarker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNextUploadIdMarker(String str) {
        this.nextUploadIdMarker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrefix(String str) {
        this.prefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTruncated(boolean z) {
        this.isTruncated = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadIdMarker(String str) {
        this.uploadIdMarker = str;
    }

    public void setMultipartUploads(List<MultipartUpload> list) {
        this.multipartUploads.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.multipartUploads.addAll(list);
    }

    public void addMultipartUpload(MultipartUpload multipartUpload) {
        this.multipartUploads.add(multipartUpload);
    }

    public void setCommonPrefixes(List<String> list) {
        this.commonPrefixes.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.commonPrefixes.addAll(list);
    }

    public void addCommonPrefix(String str) {
        this.commonPrefixes.add(str);
    }

    public ListMultipartUploadsResult parseData(ResponseMessage responseMessage) throws Exception {
        ArrayList arrayList = new ArrayList();
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(responseMessage.getContent(), "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        MultipartUpload multipartUpload = null;
        boolean z = false;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Bucket".equals(name)) {
                    setBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("Delimiter".equals(name)) {
                    setDelimiter(xmlPullParserNewPullParser.nextText());
                } else if (TextFieldImplKt.PrefixId.equals(name)) {
                    if (z) {
                        String strNextText = xmlPullParserNewPullParser.nextText();
                        if (!OSSUtils.isEmptyString(strNextText)) {
                            addCommonPrefix(strNextText);
                        }
                    } else {
                        setPrefix(xmlPullParserNewPullParser.nextText());
                    }
                } else if ("MaxUploads".equals(name)) {
                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText2)) {
                        setMaxUploads(Integer.valueOf(strNextText2).intValue());
                    }
                } else if ("IsTruncated".equals(name)) {
                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText3)) {
                        setTruncated(Boolean.valueOf(strNextText3).booleanValue());
                    }
                } else if ("KeyMarker".equals(name)) {
                    setKeyMarker(xmlPullParserNewPullParser.nextText());
                } else if ("UploadIdMarker".equals(name)) {
                    setUploadIdMarker(xmlPullParserNewPullParser.nextText());
                } else if ("NextKeyMarker".equals(name)) {
                    setNextKeyMarker(xmlPullParserNewPullParser.nextText());
                } else if ("NextUploadIdMarker".equals(name)) {
                    setNextUploadIdMarker(xmlPullParserNewPullParser.nextText());
                } else if ("Upload".equals(name)) {
                    multipartUpload = new MultipartUpload();
                } else if ("Key".equals(name)) {
                    multipartUpload.setKey(xmlPullParserNewPullParser.nextText());
                } else if ("UploadId".equals(name)) {
                    multipartUpload.setUploadId(xmlPullParserNewPullParser.nextText());
                } else if ("Initiated".equals(name)) {
                    multipartUpload.setInitiated(DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText()));
                } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name)) {
                    multipartUpload.setStorageClass(xmlPullParserNewPullParser.nextText());
                } else if ("CommonPrefixes".equals(name)) {
                    z = true;
                }
            } else if (eventType == 3) {
                if ("Upload".equals(xmlPullParserNewPullParser.getName())) {
                    arrayList.add(multipartUpload);
                } else if ("CommonPrefixes".equals(xmlPullParserNewPullParser.getName())) {
                    z = false;
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        if (arrayList.size() > 0) {
            setMultipartUploads(arrayList);
        }
        return this;
    }
}
