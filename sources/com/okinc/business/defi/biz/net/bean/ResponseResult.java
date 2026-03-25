package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ResponseResult<T extends Parcelable> implements Parcelable {
    private static final SerialDescriptor $cachedDescriptor;
    private int code;
    private List<? extends T> data;
    private String detailMsg;
    private String error_code;
    private String error_message;
    private String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResponseResult<?>> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ResponseResult<?>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseResult<?> createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(parcel.readParcelable(ResponseResult.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new ResponseResult<>(i, string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseResult<?>[] newArray(int i) {
            return new ResponseResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.ResponseResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseResult copy$default(ResponseResult responseResult, int i, String str, String str2, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseResult.code;
        }
        if ((i2 & 2) != 0) {
            str = responseResult.msg;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = responseResult.error_code;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = responseResult.error_message;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = responseResult.detailMsg;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            list = responseResult.data;
        }
        return responseResult.copy(i, str5, str6, str7, str8, list);
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
    public final List<T> component6() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseResult<T> copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ResponseResult<>(i, str, str2, str3, str4, list);
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
        if (!(obj instanceof ResponseResult)) {
            return false;
        }
        ResponseResult responseResult = (ResponseResult) obj;
        return this.code == responseResult.code && Intrinsics.EZpvd((Object) this.msg, (Object) responseResult.msg) && Intrinsics.EZpvd((Object) this.error_code, (Object) responseResult.error_code) && Intrinsics.EZpvd((Object) this.error_message, (Object) responseResult.error_message) && Intrinsics.EZpvd((Object) this.detailMsg, (Object) responseResult.detailMsg) && Intrinsics.EZpvd(this.data, responseResult.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> getData() {
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
        List<? extends T> list = this.data;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(int i) {
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(List<? extends T> list) {
        this.data = list;
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
        return "ResponseResult(code=" + this.code + ", msg=" + this.msg + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ", detailMsg=" + this.detailMsg + ", data=" + this.data + ")";
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
        List<? extends T> list = this.data;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ResponseResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<ResponseResult<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new ResponseResult$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.ResponseResult", null, 6);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.addElement("detailMsg", true);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ ResponseResult(int i, int i2, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.data = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ResponseResult responseResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || responseResult.code != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, responseResult.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) responseResult.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, responseResult.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) responseResult.error_code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, responseResult.error_code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) responseResult.error_message, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, responseResult.error_message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) responseResult.detailMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, responseResult.detailMsg);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, new ArrayListSerializer(kSerializer), responseResult.data);
    }

    public ResponseResult(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.code = i;
        this.msg = str;
        this.error_code = str2;
        this.error_message = str3;
        this.detailMsg = str4;
        this.data = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (r13v0 java.util.List)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends T extends android.os.Parcelable>):void (m)] (LINE:700) call: com.okinc.business.defi.biz.net.bean.ResponseResult.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ResponseResult(int i, String str, String str2, String str3, String str4, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, list);
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
