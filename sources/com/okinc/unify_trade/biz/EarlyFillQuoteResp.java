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
public final class EarlyFillQuoteResp implements Parcelable {
    private String code;
    private EarlyFillQuoteBean earlyFillQuote;
    private String id;
    private String message;
    private String reqId;
    private String responseTime;
    private String tradeId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarlyFillQuoteResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<EarlyFillQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillQuoteResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarlyFillQuoteResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EarlyFillQuoteBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillQuoteResp[] newArray(int i) {
            return new EarlyFillQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyFillQuoteResp() {
        this((String) null, (String) null, (String) null, (EarlyFillQuoteBean) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarlyFillQuoteResp copy$default(EarlyFillQuoteResp earlyFillQuoteResp, String str, String str2, String str3, EarlyFillQuoteBean earlyFillQuoteBean, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyFillQuoteResp.code;
        }
        if ((i & 2) != 0) {
            str2 = earlyFillQuoteResp.id;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = earlyFillQuoteResp.message;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            earlyFillQuoteBean = earlyFillQuoteResp.earlyFillQuote;
        }
        EarlyFillQuoteBean earlyFillQuoteBean2 = earlyFillQuoteBean;
        if ((i & 16) != 0) {
            str4 = earlyFillQuoteResp.reqId;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = earlyFillQuoteResp.responseTime;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = earlyFillQuoteResp.tradeId;
        }
        return earlyFillQuoteResp.copy(str, str7, str8, earlyFillQuoteBean2, str9, str10, str6);
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
    public final EarlyFillQuoteBean component4() {
        return this.earlyFillQuote;
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
    public final String component7() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyFillQuoteResp copy(String str, String str2, String str3, EarlyFillQuoteBean earlyFillQuoteBean, String str4, String str5, String str6) {
        return new EarlyFillQuoteResp(str, str2, str3, earlyFillQuoteBean, str4, str5, str6);
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
        if (!(obj instanceof EarlyFillQuoteResp)) {
            return false;
        }
        EarlyFillQuoteResp earlyFillQuoteResp = (EarlyFillQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) earlyFillQuoteResp.code) && Intrinsics.EZpvd((Object) this.id, (Object) earlyFillQuoteResp.id) && Intrinsics.EZpvd((Object) this.message, (Object) earlyFillQuoteResp.message) && Intrinsics.EZpvd(this.earlyFillQuote, earlyFillQuoteResp.earlyFillQuote) && Intrinsics.EZpvd((Object) this.reqId, (Object) earlyFillQuoteResp.reqId) && Intrinsics.EZpvd((Object) this.responseTime, (Object) earlyFillQuoteResp.responseTime) && Intrinsics.EZpvd((Object) this.tradeId, (Object) earlyFillQuoteResp.tradeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyFillQuoteBean getEarlyFillQuote() {
        return this.earlyFillQuote;
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
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseTime() {
        return this.responseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.message;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        EarlyFillQuoteBean earlyFillQuoteBean = this.earlyFillQuote;
        int iHashCode4 = earlyFillQuoteBean == null ? 0 : earlyFillQuoteBean.hashCode();
        String str4 = this.reqId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.responseTime;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tradeId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillQuote(EarlyFillQuoteBean earlyFillQuoteBean) {
        this.earlyFillQuote = earlyFillQuoteBean;
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
    public final void setReqId(String str) {
        this.reqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseTime(String str) {
        this.responseTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(String str) {
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyFillQuoteResp(code=" + this.code + ", id=" + this.id + ", message=" + this.message + ", earlyFillQuote=" + this.earlyFillQuote + ", reqId=" + this.reqId + ", responseTime=" + this.responseTime + ", tradeId=" + this.tradeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.id);
        parcel.writeString(this.message);
        EarlyFillQuoteBean earlyFillQuoteBean = this.earlyFillQuote;
        if (earlyFillQuoteBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earlyFillQuoteBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reqId);
        parcel.writeString(this.responseTime);
        parcel.writeString(this.tradeId);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EarlyFillQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyFillQuoteResp> serializer() {
            return EarlyFillQuoteResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyFillQuoteResp(int i, String str, String str2, String str3, EarlyFillQuoteBean earlyFillQuoteBean, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.earlyFillQuote = null;
        } else {
            this.earlyFillQuote = earlyFillQuoteBean;
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
        if ((i & 64) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarlyFillQuoteResp earlyFillQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earlyFillQuoteResp.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, earlyFillQuoteResp.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earlyFillQuoteResp.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, earlyFillQuoteResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earlyFillQuoteResp.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, earlyFillQuoteResp.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earlyFillQuoteResp.earlyFillQuote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, EarlyFillQuoteBean$$serializer.INSTANCE, earlyFillQuoteResp.earlyFillQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || earlyFillQuoteResp.reqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, earlyFillQuoteResp.reqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || earlyFillQuoteResp.responseTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, earlyFillQuoteResp.responseTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && earlyFillQuoteResp.tradeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, earlyFillQuoteResp.tradeId);
    }

    public EarlyFillQuoteResp(String str, String str2, String str3, EarlyFillQuoteBean earlyFillQuoteBean, String str4, String str5, String str6) {
        this.code = str;
        this.id = str2;
        this.message = str3;
        this.earlyFillQuote = earlyFillQuoteBean;
        this.reqId = str4;
        this.responseTime = str5;
        this.tradeId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.EarlyFillQuoteBean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EarlyFillQuoteBean) : (r10v0 com.okinc.unify_trade.biz.EarlyFillQuoteBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EarlyFillQuoteBean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:334) call: com.okinc.unify_trade.biz.EarlyFillQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EarlyFillQuoteBean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EarlyFillQuoteResp(String str, String str2, String str3, EarlyFillQuoteBean earlyFillQuoteBean, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : earlyFillQuoteBean, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
