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
public final class EarlyFillResp implements Parcelable {
    private String reqId;
    private String responseTime;
    private PriceLockerTradeBean trade;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarlyFillResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<EarlyFillResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarlyFillResp(parcel.readInt() == 0 ? null : PriceLockerTradeBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillResp[] newArray(int i) {
            return new EarlyFillResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyFillResp() {
        this((PriceLockerTradeBean) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarlyFillResp copy$default(EarlyFillResp earlyFillResp, PriceLockerTradeBean priceLockerTradeBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            priceLockerTradeBean = earlyFillResp.trade;
        }
        if ((i & 2) != 0) {
            str = earlyFillResp.reqId;
        }
        if ((i & 4) != 0) {
            str2 = earlyFillResp.responseTime;
        }
        return earlyFillResp.copy(priceLockerTradeBean, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean component1() {
        return this.trade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.responseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyFillResp copy(PriceLockerTradeBean priceLockerTradeBean, String str, String str2) {
        return new EarlyFillResp(priceLockerTradeBean, str, str2);
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
        if (!(obj instanceof EarlyFillResp)) {
            return false;
        }
        EarlyFillResp earlyFillResp = (EarlyFillResp) obj;
        return Intrinsics.EZpvd(this.trade, earlyFillResp.trade) && Intrinsics.EZpvd((Object) this.reqId, (Object) earlyFillResp.reqId) && Intrinsics.EZpvd((Object) this.responseTime, (Object) earlyFillResp.responseTime);
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
    public final PriceLockerTradeBean getTrade() {
        return this.trade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PriceLockerTradeBean priceLockerTradeBean = this.trade;
        int iHashCode = priceLockerTradeBean == null ? 0 : priceLockerTradeBean.hashCode();
        String str = this.reqId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.responseTime;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
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
    public final void setTrade(PriceLockerTradeBean priceLockerTradeBean) {
        this.trade = priceLockerTradeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyFillResp(trade=" + this.trade + ", reqId=" + this.reqId + ", responseTime=" + this.responseTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PriceLockerTradeBean priceLockerTradeBean = this.trade;
        if (priceLockerTradeBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceLockerTradeBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reqId);
        parcel.writeString(this.responseTime);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EarlyFillResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyFillResp> serializer() {
            return EarlyFillResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyFillResp(int i, PriceLockerTradeBean priceLockerTradeBean, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.trade = null;
        } else {
            this.trade = priceLockerTradeBean;
        }
        if ((i & 2) == 0) {
            this.reqId = null;
        } else {
            this.reqId = str;
        }
        if ((i & 4) == 0) {
            this.responseTime = null;
        } else {
            this.responseTime = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarlyFillResp earlyFillResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earlyFillResp.trade != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PriceLockerTradeBean$$serializer.INSTANCE, earlyFillResp.trade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earlyFillResp.reqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, earlyFillResp.reqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && earlyFillResp.responseTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, earlyFillResp.responseTime);
    }

    public EarlyFillResp(PriceLockerTradeBean priceLockerTradeBean, String str, String str2) {
        this.trade = priceLockerTradeBean;
        this.reqId = str;
        this.responseTime = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.PriceLockerTradeBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PriceLockerTradeBean) : (r2v0 com.okinc.unify_trade.biz.PriceLockerTradeBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.PriceLockerTradeBean, java.lang.String, java.lang.String):void (m)] (LINE:386) call: com.okinc.unify_trade.biz.EarlyFillResp.<init>(com.okinc.unify_trade.biz.PriceLockerTradeBean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EarlyFillResp(PriceLockerTradeBean priceLockerTradeBean, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : priceLockerTradeBean, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
