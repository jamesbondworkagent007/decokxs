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
public final class PriceLockerTradeResp implements Parcelable {
    private String id;
    private String reqId;
    private PriceLockerTradeBean trade;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerTradeResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PriceLockerTradeResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerTradeResp(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PriceLockerTradeBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradeResp[] newArray(int i) {
            return new PriceLockerTradeResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerTradeResp() {
        this((String) null, (String) null, (PriceLockerTradeBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceLockerTradeResp copy$default(PriceLockerTradeResp priceLockerTradeResp, String str, String str2, PriceLockerTradeBean priceLockerTradeBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceLockerTradeResp.id;
        }
        if ((i & 2) != 0) {
            str2 = priceLockerTradeResp.reqId;
        }
        if ((i & 4) != 0) {
            priceLockerTradeBean = priceLockerTradeResp.trade;
        }
        return priceLockerTradeResp.copy(str, str2, priceLockerTradeBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean component3() {
        return this.trade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeResp copy(String str, String str2, PriceLockerTradeBean priceLockerTradeBean) {
        return new PriceLockerTradeResp(str, str2, priceLockerTradeBean);
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
        if (!(obj instanceof PriceLockerTradeResp)) {
            return false;
        }
        PriceLockerTradeResp priceLockerTradeResp = (PriceLockerTradeResp) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) priceLockerTradeResp.id) && Intrinsics.EZpvd((Object) this.reqId, (Object) priceLockerTradeResp.reqId) && Intrinsics.EZpvd(this.trade, priceLockerTradeResp.trade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradeBean getTrade() {
        return this.trade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.reqId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        PriceLockerTradeBean priceLockerTradeBean = this.trade;
        return (((iHashCode * 31) + iHashCode2) * 31) + (priceLockerTradeBean != null ? priceLockerTradeBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReqId(String str) {
        this.reqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrade(PriceLockerTradeBean priceLockerTradeBean) {
        this.trade = priceLockerTradeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerTradeResp(id=" + this.id + ", reqId=" + this.reqId + ", trade=" + this.trade + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.reqId);
        PriceLockerTradeBean priceLockerTradeBean = this.trade;
        if (priceLockerTradeBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceLockerTradeBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerTradeResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerTradeResp> serializer() {
            return PriceLockerTradeResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerTradeResp(int i, String str, String str2, PriceLockerTradeBean priceLockerTradeBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.reqId = null;
        } else {
            this.reqId = str2;
        }
        if ((i & 4) == 0) {
            this.trade = null;
        } else {
            this.trade = priceLockerTradeBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerTradeResp priceLockerTradeResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerTradeResp.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerTradeResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerTradeResp.reqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerTradeResp.reqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && priceLockerTradeResp.trade == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PriceLockerTradeBean$$serializer.INSTANCE, priceLockerTradeResp.trade);
    }

    public PriceLockerTradeResp(String str, String str2, PriceLockerTradeBean priceLockerTradeBean) {
        this.id = str;
        this.reqId = str2;
        this.trade = priceLockerTradeBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.PriceLockerTradeBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.PriceLockerTradeBean) : (r4v0 com.okinc.unify_trade.biz.PriceLockerTradeBean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PriceLockerTradeBean):void (m)] (LINE:200) call: com.okinc.unify_trade.biz.PriceLockerTradeResp.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.PriceLockerTradeBean):void type: THIS */
    public /* synthetic */ PriceLockerTradeResp(String str, String str2, PriceLockerTradeBean priceLockerTradeBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : priceLockerTradeBean);
    }
}
