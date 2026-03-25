package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RequestForQuoteResp implements Parcelable {
    private String code;
    private String id;
    private String message;
    private RequestForQuoteBean quote;
    private String reqId;
    private String responseTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RequestForQuoteResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RequestForQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RequestForQuoteResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RequestForQuoteBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestForQuoteResp[] newArray(int i) {
            return new RequestForQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequestForQuoteResp() {
        this((String) null, (String) null, (String) null, (RequestForQuoteBean) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RequestForQuoteResp copy$default(RequestForQuoteResp requestForQuoteResp, String str, String str2, String str3, RequestForQuoteBean requestForQuoteBean, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestForQuoteResp.code;
        }
        if ((i & 2) != 0) {
            str2 = requestForQuoteResp.id;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = requestForQuoteResp.message;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            requestForQuoteBean = requestForQuoteResp.quote;
        }
        RequestForQuoteBean requestForQuoteBean2 = requestForQuoteBean;
        if ((i & 16) != 0) {
            str4 = requestForQuoteResp.reqId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = requestForQuoteResp.responseTime;
        }
        return requestForQuoteResp.copy(str, str6, str7, requestForQuoteBean2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestForQuoteBean component4() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.responseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestForQuoteResp copy(String str, String str2, String str3, RequestForQuoteBean requestForQuoteBean, String str4, String str5) {
        return new RequestForQuoteResp(str, str2, str3, requestForQuoteBean, str4, str5);
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
        if (!(obj instanceof RequestForQuoteResp)) {
            return false;
        }
        RequestForQuoteResp requestForQuoteResp = (RequestForQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) requestForQuoteResp.code) && Intrinsics.EZpvd((Object) this.id, (Object) requestForQuoteResp.id) && Intrinsics.EZpvd((Object) this.message, (Object) requestForQuoteResp.message) && Intrinsics.EZpvd(this.quote, requestForQuoteResp.quote) && Intrinsics.EZpvd((Object) this.reqId, (Object) requestForQuoteResp.reqId) && Intrinsics.EZpvd((Object) this.responseTime, (Object) requestForQuoteResp.responseTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestForQuoteBean getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseTime() {
        return this.responseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.message;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        RequestForQuoteBean requestForQuoteBean = this.quote;
        int iHashCode4 = requestForQuoteBean == null ? 0 : requestForQuoteBean.hashCode();
        String str4 = this.reqId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.responseTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(String str) {
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuote(RequestForQuoteBean requestForQuoteBean) {
        this.quote = requestForQuoteBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReqId(String str) {
        this.reqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseTime(String str) {
        this.responseTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RequestForQuoteResp(code=" + this.code + ", id=" + this.id + ", message=" + this.message + ", quote=" + this.quote + ", reqId=" + this.reqId + ", responseTime=" + this.responseTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.id);
        parcel.writeString(this.message);
        RequestForQuoteBean requestForQuoteBean = this.quote;
        if (requestForQuoteBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            requestForQuoteBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reqId);
        parcel.writeString(this.responseTime);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RequestForQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RequestForQuoteResp> serializer() {
            return RequestForQuoteResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RequestForQuoteResp(int i, String str, String str2, String str3, RequestForQuoteBean requestForQuoteBean, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & 8) == 0) {
            this.quote = null;
        } else {
            this.quote = requestForQuoteBean;
        }
        if ((i & 16) == 0) {
            this.reqId = null;
        } else {
            this.reqId = str4;
        }
        if ((i & 32) == 0) {
            this.responseTime = null;
        } else {
            this.responseTime = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RequestForQuoteResp requestForQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || requestForQuoteResp.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, requestForQuoteResp.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || requestForQuoteResp.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, requestForQuoteResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || requestForQuoteResp.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, requestForQuoteResp.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || requestForQuoteResp.quote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RequestForQuoteBean$$serializer.INSTANCE, requestForQuoteResp.quote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || requestForQuoteResp.reqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, requestForQuoteResp.reqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && requestForQuoteResp.responseTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, requestForQuoteResp.responseTime);
    }

    public RequestForQuoteResp(String str, String str2, String str3, RequestForQuoteBean requestForQuoteBean, String str4, String str5) {
        this.code = str;
        this.id = str2;
        this.message = str3;
        this.quote = requestForQuoteBean;
        this.reqId = str4;
        this.responseTime = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.RequestForQuoteBean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.RequestForQuoteBean) : (r9v0 com.okinc.unify_trade.biz.RequestForQuoteBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.RequestForQuoteBean, java.lang.String, java.lang.String):void (m)] (LINE:130) call: com.okinc.unify_trade.biz.RequestForQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.RequestForQuoteBean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RequestForQuoteResp(String str, String str2, String str3, RequestForQuoteBean requestForQuoteBean, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : requestForQuoteBean, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
