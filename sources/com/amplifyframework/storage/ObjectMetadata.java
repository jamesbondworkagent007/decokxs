package com.amplifyframework.storage;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C59449zhJ;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ObjectMetadata {
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_MD5 = "Content-MD5";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final Companion Companion = new Companion(null);
    public static final String REDIRECT_LOCATION = "x-amz-website-redirect-location";
    public static final String REQUESTER_PAYS_HEADER = "x-amz-request-payer";
    public static final String S3_TAGGING = "x-amz-tagging";
    public static final String SERVER_SIDE_ENCRYPTION = "x-amz-server-side-encryption";
    public static final String SERVER_SIDE_ENCRYPTION_KMS_KEY_ID = "x-amz-server-side-encryption-aws-kms-key-id";
    public static final String STORAGE_CLASS = "x-amz-storage-class";
    private Date expirationTime;
    private String expirationTimeRuleId;
    private Date httpExpiresDate;
    private Map<String, Object> metaData;
    private Boolean ongoingRestore;
    private Date restoreExpirationTime;
    private Map<String, String> userMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map) {
        this(map, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2) {
        this(map, map2, null, null, null, null, null, 124, null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date) {
        this(map, map2, date, null, null, null, null, 120, null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date, Date date2) {
        this(map, map2, date, date2, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date, Date date2, String str) {
        this(map, map2, date, date2, str, null, null, 96, null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date, Date date2, String str, Boolean bool) {
        this(map, map2, date, date2, str, bool, null, 64, null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.amplifyframework.storage.ObjectMetadata */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ObjectMetadata copy$default(ObjectMetadata objectMetadata, Map map, Map map2, Date date, Date date2, String str, Boolean bool, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = objectMetadata.userMetadata;
        }
        if ((i & 2) != 0) {
            map2 = objectMetadata.metaData;
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            date = objectMetadata.httpExpiresDate;
        }
        Date date4 = date;
        if ((i & 8) != 0) {
            date2 = objectMetadata.expirationTime;
        }
        Date date5 = date2;
        if ((i & 16) != 0) {
            str = objectMetadata.expirationTimeRuleId;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            bool = objectMetadata.ongoingRestore;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            date3 = objectMetadata.restoreExpirationTime;
        }
        return objectMetadata.copy(map, map3, date4, date5, str2, bool2, date3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.userMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> component2() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component3() {
        return this.httpExpiresDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component4() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expirationTimeRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.ongoingRestore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component7() {
        return this.restoreExpirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ObjectMetadata copy(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date, Date date2, String str, Boolean bool, Date date3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new ObjectMetadata(map, map2, date, date2, str, bool, date3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectMetadata)) {
            return false;
        }
        ObjectMetadata objectMetadata = (ObjectMetadata) obj;
        return Intrinsics.EZpvd(this.userMetadata, objectMetadata.userMetadata) && Intrinsics.EZpvd(this.metaData, objectMetadata.metaData) && Intrinsics.EZpvd(this.httpExpiresDate, objectMetadata.httpExpiresDate) && Intrinsics.EZpvd(this.expirationTime, objectMetadata.expirationTime) && Intrinsics.EZpvd((Object) this.expirationTimeRuleId, (Object) objectMetadata.expirationTimeRuleId) && Intrinsics.EZpvd(this.ongoingRestore, objectMetadata.ongoingRestore) && Intrinsics.EZpvd(this.restoreExpirationTime, objectMetadata.restoreExpirationTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpirationTimeRuleId() {
        return this.expirationTimeRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getHttpExpiresDate() {
        return this.httpExpiresDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getMetaData() {
        return this.metaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOngoingRestore() {
        return this.ongoingRestore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getRestoreExpirationTime() {
        return this.restoreExpirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.userMetadata.hashCode();
        int iHashCode2 = this.metaData.hashCode();
        Date date = this.httpExpiresDate;
        int iHashCode3 = date == null ? 0 : date.hashCode();
        Date date2 = this.expirationTime;
        int iHashCode4 = date2 == null ? 0 : date2.hashCode();
        String str = this.expirationTimeRuleId;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool = this.ongoingRestore;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Date date3 = this.restoreExpirationTime;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (date3 != null ? date3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpirationTime(Date date) {
        this.expirationTime = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpirationTimeRuleId(String str) {
        this.expirationTimeRuleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHttpExpiresDate(Date date) {
        this.httpExpiresDate = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMetaData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.metaData = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOngoingRestore(Boolean bool) {
        this.ongoingRestore = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRestoreExpirationTime(Date date) {
        this.restoreExpirationTime = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserMetadata(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.userMetadata = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ObjectMetadata(userMetadata=" + this.userMetadata + ", metaData=" + this.metaData + ", httpExpiresDate=" + this.httpExpiresDate + ", expirationTime=" + this.expirationTime + ", expirationTimeRuleId=" + this.expirationTimeRuleId + ", ongoingRestore=" + this.ongoingRestore + ", restoreExpirationTime=" + this.restoreExpirationTime + ")";
    }

    public ObjectMetadata(@NotNull Map<String, String> map, @NotNull Map<String, Object> map2, Date date, Date date2, String str, Boolean bool, Date date3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.userMetadata = map;
        this.metaData = map2;
        this.httpExpiresDate = date;
        this.expirationTime = date2;
        this.expirationTimeRuleId = str;
        this.ongoingRestore = bool;
        this.restoreExpirationTime = date3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: CONSTRUCTOR 
  (wrap:java.util.Comparator:0x0008: INVOKE (wrap:o.yIt:0x0006: SGET  A[WRAPPED] o.yIt.KWHzl o.yIt) STATIC call: o.zhJ.copydefault(o.yIt):java.util.Comparator A[MD:(o.yIt):java.util.Comparator<java.lang.String> (m), WRAPPED])
 A[MD:(java.util.Comparator<? super K>):void (c), WRAPPED] (LINE:36) call: java.util.TreeMap.<init>(java.util.Comparator):void type: CONSTRUCTOR) : (r9v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (wrap:java.util.Comparator:0x0019: INVOKE (wrap:o.yIt:0x0017: SGET  A[WRAPPED] o.yIt.KWHzl o.yIt) STATIC call: o.zhJ.copydefault(o.yIt):java.util.Comparator A[MD:(o.yIt):java.util.Comparator<java.lang.String> (m), WRAPPED])
 A[MD:(java.util.Comparator<? super K>):void (c), WRAPPED] (LINE:37) call: java.util.TreeMap.<init>(java.util.Comparator):void type: CONSTRUCTOR) : (r10v0 java.util.Map))
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0022: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r11v0 java.util.Date))
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x002a: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r12v0 java.util.Date))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0040: ARITH (r16v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.util.Date) : (null java.util.Date))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.Object>, java.util.Date, java.util.Date, java.lang.String, java.lang.Boolean, java.util.Date):void (m)] (LINE:35) call: com.amplifyframework.storage.ObjectMetadata.<init>(java.util.Map, java.util.Map, java.util.Date, java.util.Date, java.lang.String, java.lang.Boolean, java.util.Date):void type: THIS */
    public /* synthetic */ ObjectMetadata(Map map, Map map2, Date date, Date date2, String str, Boolean bool, Date date3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TreeMap(C59449zhJ.copydefault(C56529yIt.KWHzl)) : map, (i & 2) != 0 ? new TreeMap(C59449zhJ.copydefault(C56529yIt.KWHzl)) : map2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : date2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) == 0 ? date3 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.storage.ObjectMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
