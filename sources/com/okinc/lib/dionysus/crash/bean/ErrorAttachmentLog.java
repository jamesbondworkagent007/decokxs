package com.okinc.lib.dionysus.crash.bean;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ErrorAttachmentLog extends AbstractLog {
    static final Charset CHARSET = Charset.forName(C.UTF8_NAME);
    public static final String CONTENT_TYPE_TEXT_PLAIN = "text/plain";
    public static final String TYPE = "errorAttachment";
    private String contentType;
    private byte[] data;
    private UUID errorId;
    private String fileName;
    private UUID id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UUID getErrorId() {
        return this.errorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UUID getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setContentType(String str) {
        this.contentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setErrorId(UUID uuid) {
        this.errorId = uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFileName(String str) {
        this.fileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(UUID uuid) {
        this.id = uuid;
    }

    public static ErrorAttachmentLog attachmentWithText(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return attachmentWithBinary(str.getBytes(CHARSET), str2, "text/plain");
    }

    public static ErrorAttachmentLog attachmentWithBinary(byte[] bArr, String str, String str2) {
        ErrorAttachmentLog errorAttachmentLog = new ErrorAttachmentLog();
        errorAttachmentLog.setData(bArr);
        errorAttachmentLog.setId(UUID.randomUUID());
        errorAttachmentLog.setFileName(str);
        errorAttachmentLog.setContentType(str2);
        return errorAttachmentLog;
    }

    public boolean isValid() {
        return (getId() == null || getErrorId() == null || getContentType() == null || getData() == null) ? false : true;
    }

    public String toString() {
        return "ErrorAttachmentLog{id=" + this.id + ", errorId=" + this.errorId + ", contentType='" + this.contentType + "', fileName='" + this.fileName + "', data=" + Arrays.toString(this.data) + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorAttachmentLog errorAttachmentLog = (ErrorAttachmentLog) obj;
        return Objects.equals(this.id, errorAttachmentLog.id) && Objects.equals(this.errorId, errorAttachmentLog.errorId) && Objects.equals(this.contentType, errorAttachmentLog.contentType) && Objects.equals(this.fileName, errorAttachmentLog.fileName) && Arrays.equals(this.data, errorAttachmentLog.data);
    }

    public int hashCode() {
        return (Objects.hash(this.id, this.errorId, this.contentType, this.fileName) * 31) + Arrays.hashCode(this.data);
    }
}
