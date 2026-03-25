package com.okinc.crcore.coreapi.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ExchangeQuoteResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String askPx;
    private final String bidPx;
    private final EstimateBalanceUsageResponseBean estimateBalanceUsage;
    private final String quoteId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExchangeQuoteResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeQuoteResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeQuoteResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EstimateBalanceUsageResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteResponseBean[] newArray(int i) {
            return new ExchangeQuoteResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeQuoteResponseBean() {
        this((String) null, (String) null, (String) null, (EstimateBalanceUsageResponseBean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeQuoteResponseBean copy$default(ExchangeQuoteResponseBean exchangeQuoteResponseBean, String str, String str2, String str3, EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeQuoteResponseBean.askPx;
        }
        if ((i & 2) != 0) {
            str2 = exchangeQuoteResponseBean.bidPx;
        }
        if ((i & 4) != 0) {
            str3 = exchangeQuoteResponseBean.quoteId;
        }
        if ((i & 8) != 0) {
            estimateBalanceUsageResponseBean = exchangeQuoteResponseBean.estimateBalanceUsage;
        }
        return exchangeQuoteResponseBean.copy(str, str2, str3, estimateBalanceUsageResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimateBalanceUsageResponseBean component4() {
        return this.estimateBalanceUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeQuoteResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExchangeQuoteResponseBean(str, str2, str3, estimateBalanceUsageResponseBean);
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
        if (!(obj instanceof ExchangeQuoteResponseBean)) {
            return false;
        }
        ExchangeQuoteResponseBean exchangeQuoteResponseBean = (ExchangeQuoteResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.askPx, (Object) exchangeQuoteResponseBean.askPx) && Intrinsics.EZpvd((Object) this.bidPx, (Object) exchangeQuoteResponseBean.bidPx) && Intrinsics.EZpvd((Object) this.quoteId, (Object) exchangeQuoteResponseBean.quoteId) && Intrinsics.EZpvd(this.estimateBalanceUsage, exchangeQuoteResponseBean.estimateBalanceUsage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskPx() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimateBalanceUsageResponseBean getEstimateBalanceUsage() {
        return this.estimateBalanceUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.askPx.hashCode();
        int iHashCode2 = this.bidPx.hashCode();
        int iHashCode3 = this.quoteId.hashCode();
        EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean = this.estimateBalanceUsage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (estimateBalanceUsageResponseBean == null ? 0 : estimateBalanceUsageResponseBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeQuoteResponseBean(askPx=" + this.askPx + ", bidPx=" + this.bidPx + ", quoteId=" + this.quoteId + ", estimateBalanceUsage=" + this.estimateBalanceUsage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.askPx);
        parcel.writeString(this.bidPx);
        parcel.writeString(this.quoteId);
        EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean = this.estimateBalanceUsage;
        if (estimateBalanceUsageResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimateBalanceUsageResponseBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ExchangeQuoteResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeQuoteResponseBean> serializer() {
            return ExchangeQuoteResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeQuoteResponseBean(int i, String str, String str2, String str3, EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.askPx = "";
        } else {
            this.askPx = str;
        }
        if ((i & 2) == 0) {
            this.bidPx = "";
        } else {
            this.bidPx = str2;
        }
        if ((i & 4) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str3;
        }
        if ((i & 8) == 0) {
            this.estimateBalanceUsage = null;
        } else {
            this.estimateBalanceUsage = estimateBalanceUsageResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ExchangeQuoteResponseBean exchangeQuoteResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeQuoteResponseBean.askPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeQuoteResponseBean.askPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) exchangeQuoteResponseBean.bidPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeQuoteResponseBean.bidPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) exchangeQuoteResponseBean.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, exchangeQuoteResponseBean.quoteId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && exchangeQuoteResponseBean.estimateBalanceUsage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, EstimateBalanceUsageResponseBean$$serializer.INSTANCE, exchangeQuoteResponseBean.estimateBalanceUsage);
    }

    public ExchangeQuoteResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.askPx = str;
        this.bidPx = str2;
        this.quoteId = str3;
        this.estimateBalanceUsage = estimateBalanceUsageResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean) : (r5v0 com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.ExchangeQuoteResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean):void type: THIS */
    public /* synthetic */ ExchangeQuoteResponseBean(String str, String str2, String str3, EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : estimateBalanceUsageResponseBean);
    }
}
