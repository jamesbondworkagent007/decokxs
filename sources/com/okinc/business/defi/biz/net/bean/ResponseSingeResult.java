package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ResponseSingeResult<T extends Parcelable> implements Parcelable {
    private static final SerialDescriptor $cachedDescriptor;
    private int code;
    private final T data;
    private String detailMsg;
    private String error_code;
    private String error_message;
    private String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResponseSingeResult<?>> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ResponseSingeResult<?>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseSingeResult<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ResponseSingeResult<>(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(ResponseSingeResult.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseSingeResult<?>[] newArray(int i) {
            return new ResponseSingeResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.ResponseSingeResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseSingeResult copy$default(ResponseSingeResult responseSingeResult, int i, String str, String str2, String str3, String str4, Parcelable parcelable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseSingeResult.code;
        }
        if ((i2 & 2) != 0) {
            str = responseSingeResult.msg;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = responseSingeResult.error_code;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = responseSingeResult.error_message;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = responseSingeResult.detailMsg;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            parcelable = responseSingeResult.data;
        }
        return responseSingeResult.copy(i, str5, str6, str7, str8, parcelable);
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
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.error_message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component6() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseSingeResult<T> copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ResponseSingeResult<>(i, str, str2, str3, str4, t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseSingeResult)) {
            return false;
        }
        ResponseSingeResult responseSingeResult = (ResponseSingeResult) obj;
        return this.code == responseSingeResult.code && Intrinsics.EZpvd((Object) this.msg, (Object) responseSingeResult.msg) && Intrinsics.EZpvd((Object) this.error_code, (Object) responseSingeResult.error_code) && Intrinsics.EZpvd((Object) this.error_message, (Object) responseSingeResult.error_message) && Intrinsics.EZpvd((Object) this.detailMsg, (Object) responseSingeResult.detailMsg) && Intrinsics.EZpvd(this.data, responseSingeResult.data);
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
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        int iHashCode2 = this.msg.hashCode();
        int iHashCode3 = this.error_code.hashCode();
        int iHashCode4 = this.error_message.hashCode();
        int iHashCode5 = this.detailMsg.hashCode();
        T t = this.data;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (t == null ? 0 : t.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(int i) {
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.detailMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError_code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.error_code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError_message(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.error_message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResponseSingeResult(code=" + this.code + ", msg=" + this.msg + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ", detailMsg=" + this.detailMsg + ", data=" + this.data + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.code);
        parcel.writeString(this.msg);
        parcel.writeString(this.error_code);
        parcel.writeString(this.error_message);
        parcel.writeString(this.detailMsg);
        parcel.writeParcelable(this.data, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ResponseSingeResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<ResponseSingeResult<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new ResponseSingeResult$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.ResponseSingeResult", null, 6);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.addElement("detailMsg", true);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.os.Parcelable */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ResponseSingeResult(int i, int i2, String str, String str2, String str3, String str4, Parcelable parcelable, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, $cachedDescriptor);
        }
        this.code = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
        if ((i & 4) == 0) {
            this.error_code = "";
        } else {
            this.error_code = str2;
        }
        if ((i & 8) == 0) {
            this.error_message = "";
        } else {
            this.error_message = str3;
        }
        if ((i & 16) == 0) {
            this.detailMsg = "";
        } else {
            this.detailMsg = str4;
        }
        this.data = parcelable;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ResponseSingeResult responseSingeResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || responseSingeResult.code != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, responseSingeResult.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) responseSingeResult.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, responseSingeResult.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) responseSingeResult.error_code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, responseSingeResult.error_code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) responseSingeResult.error_message, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, responseSingeResult.error_message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) responseSingeResult.detailMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, responseSingeResult.detailMsg);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializer, responseSingeResult.data);
    }

    public ResponseSingeResult(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.code = i;
        this.msg = str;
        this.error_code = str2;
        this.error_message = str3;
        this.detailMsg = str4;
        this.data = t;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (r13v0 android.os.Parcelable)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, T extends android.os.Parcelable):void (m)] (LINE:287) call: com.okinc.business.defi.biz.net.bean.ResponseSingeResult.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Parcelable):void type: THIS */
    public /* synthetic */ ResponseSingeResult(int i, String str, String str2, String str3, String str4, Parcelable parcelable, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, parcelable);
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
