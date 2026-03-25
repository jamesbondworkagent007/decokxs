package com.okinc.network.okg.response;

import com.google.gson.annotations.SerializedName;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ResponseData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final int CODE_ERROR = -1;
    public static final int CODE_SUCCEED = 0;
    private boolean _cIsFromCache;
    private final int code;
    private final T data;
    private final String detailMsg;

    @SerializedName(EopTrackEvent.KEY_ERROR_MESSAGE)
    private final String errorMsg;
    private final String error_code;
    private final String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResponseData() {
        this(0, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.network.okg.response.ResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseData copy$default(ResponseData responseData, int i, String str, String str2, String str3, Object obj, String str4, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = responseData.code;
        }
        if ((i2 & 2) != 0) {
            str = responseData.msg;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = responseData.detailMsg;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = responseData.errorMsg;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            obj = responseData.data;
        }
        Object obj3 = obj;
        if ((i2 & 32) != 0) {
            str4 = responseData.error_code;
        }
        return responseData.copy(i, str5, str6, str7, obj3, str4);
    }

    @SerialName(EopTrackEvent.KEY_ERROR_MESSAGE)
    public static /* synthetic */ void getErrorMsg$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component5() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseData<T> copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, T t, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ResponseData<>(i, str, str2, str3, t, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseData)) {
            return false;
        }
        ResponseData responseData = (ResponseData) obj;
        return this.code == responseData.code && Intrinsics.EZpvd((Object) this.msg, (Object) responseData.msg) && Intrinsics.EZpvd((Object) this.detailMsg, (Object) responseData.detailMsg) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) responseData.errorMsg) && Intrinsics.EZpvd(this.data, responseData.data) && Intrinsics.EZpvd((Object) this.error_code, (Object) responseData.error_code);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailMsg() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean get_cIsFromCache$OKNetwork_network() {
        return this._cIsFromCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        int iHashCode2 = this.msg.hashCode();
        int iHashCode3 = this.detailMsg.hashCode();
        int iHashCode4 = this.errorMsg.hashCode();
        T t = this.data;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (t == null ? 0 : t.hashCode())) * 31) + this.error_code.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromCache() {
        return this._cIsFromCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_cIsFromCache$OKNetwork_network(boolean z) {
        this._cIsFromCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResponseData(code=" + this.code + ", msg=" + this.msg + ", detailMsg=" + this.detailMsg + ", errorMsg=" + this.errorMsg + ", data=" + this.data + ", error_code=" + this.error_code + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ResponseData(int i, int i2, String str, String str2, String str3, Object obj, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.code = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
        if ((i & 4) == 0) {
            this.detailMsg = "";
        } else {
            this.detailMsg = str2;
        }
        if ((i & 8) == 0) {
            this.errorMsg = "";
        } else {
            this.errorMsg = str3;
        }
        if ((i & 16) == 0) {
            this.data = null;
        } else {
            this.data = obj;
        }
        if ((i & 32) == 0) {
            this.error_code = "";
        } else {
            this.error_code = str4;
        }
        if ((i & 64) == 0) {
            this._cIsFromCache = false;
        } else {
            this._cIsFromCache = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(ResponseData responseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || responseData.code != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, responseData.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) responseData.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, responseData.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) responseData.detailMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, responseData.detailMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) responseData.errorMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, responseData.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || responseData.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializer, responseData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) responseData.error_code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, responseData.error_code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || responseData._cIsFromCache) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, responseData._cIsFromCache);
        }
    }

    public ResponseData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, T t, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.code = i;
        this.msg = str;
        this.detailMsg = str2;
        this.errorMsg = str3;
        this.data = t;
        this.error_code = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.Object:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, T, java.lang.String):void (m)] (LINE:15) call: com.okinc.network.okg.response.ResponseData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String):void type: THIS */
    public /* synthetic */ ResponseData(int i, String str, String str2, String str3, Object obj, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : obj, (i2 & 32) == 0 ? str4 : "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.Object:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r10v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, T, java.lang.String, boolean):void (m)] (LINE:27) call: com.okinc.network.okg.response.ResponseData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ResponseData(int i, String str, String str2, String str3, Object obj, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : obj, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponseData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, T t, @NotNull String str4, boolean z) {
        this(i, str, str2, str3, t, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this._cIsFromCache = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.response.ResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> KSerializer<ResponseData<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new ResponseData$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.network.okg.response.ResponseData", null, 7);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement("detailMsg", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement("_cIsFromCache", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public final boolean isSucceed() {
        return getCode() == 0;
    }

    public final boolean isDataValid() {
        return getData() != null;
    }

    public final boolean isSucceedAndDataValid() {
        return getCode() == 0 && getData() != null;
    }
}
