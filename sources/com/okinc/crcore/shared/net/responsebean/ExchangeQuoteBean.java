package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ExchangeQuoteResponseBean;
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
public final class ExchangeQuoteBean implements Parcelable {
    public static final int $stable = 0;
    private final String askPx;
    private final String bidPx;
    private final EstimateBalanceUsageBean estimateBalanceUsage;
    private final String quoteId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExchangeQuoteBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeQuoteBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EstimateBalanceUsageBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeQuoteBean[] newArray(int i) {
            return new ExchangeQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeQuoteBean() {
        this((String) null, (String) null, (String) null, (EstimateBalanceUsageBean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeQuoteBean copy$default(ExchangeQuoteBean exchangeQuoteBean, String str, String str2, String str3, EstimateBalanceUsageBean estimateBalanceUsageBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeQuoteBean.askPx;
        }
        if ((i & 2) != 0) {
            str2 = exchangeQuoteBean.bidPx;
        }
        if ((i & 4) != 0) {
            str3 = exchangeQuoteBean.quoteId;
        }
        if ((i & 8) != 0) {
            estimateBalanceUsageBean = exchangeQuoteBean.estimateBalanceUsage;
        }
        return exchangeQuoteBean.copy(str, str2, str3, estimateBalanceUsageBean);
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
    public final EstimateBalanceUsageBean component4() {
        return this.estimateBalanceUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeQuoteBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, EstimateBalanceUsageBean estimateBalanceUsageBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExchangeQuoteBean(str, str2, str3, estimateBalanceUsageBean);
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
        if (!(obj instanceof ExchangeQuoteBean)) {
            return false;
        }
        ExchangeQuoteBean exchangeQuoteBean = (ExchangeQuoteBean) obj;
        return Intrinsics.EZpvd((Object) this.askPx, (Object) exchangeQuoteBean.askPx) && Intrinsics.EZpvd((Object) this.bidPx, (Object) exchangeQuoteBean.bidPx) && Intrinsics.EZpvd((Object) this.quoteId, (Object) exchangeQuoteBean.quoteId) && Intrinsics.EZpvd(this.estimateBalanceUsage, exchangeQuoteBean.estimateBalanceUsage);
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
    public final EstimateBalanceUsageBean getEstimateBalanceUsage() {
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
        EstimateBalanceUsageBean estimateBalanceUsageBean = this.estimateBalanceUsage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (estimateBalanceUsageBean == null ? 0 : estimateBalanceUsageBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeQuoteBean(askPx=" + this.askPx + ", bidPx=" + this.bidPx + ", quoteId=" + this.quoteId + ", estimateBalanceUsage=" + this.estimateBalanceUsage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.askPx);
        parcel.writeString(this.bidPx);
        parcel.writeString(this.quoteId);
        EstimateBalanceUsageBean estimateBalanceUsageBean = this.estimateBalanceUsage;
        if (estimateBalanceUsageBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimateBalanceUsageBean.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExchangeQuoteBean(int i, String str, String str2, String str3, EstimateBalanceUsageBean estimateBalanceUsageBean, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.estimateBalanceUsage = estimateBalanceUsageBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ExchangeQuoteBean exchangeQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) exchangeQuoteBean.askPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeQuoteBean.askPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) exchangeQuoteBean.bidPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeQuoteBean.bidPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) exchangeQuoteBean.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, exchangeQuoteBean.quoteId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && exchangeQuoteBean.estimateBalanceUsage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, EstimateBalanceUsageBean$$serializer.INSTANCE, exchangeQuoteBean.estimateBalanceUsage);
    }

    public ExchangeQuoteBean(@NotNull String str, @NotNull String str2, @NotNull String str3, EstimateBalanceUsageBean estimateBalanceUsageBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.askPx = str;
        this.bidPx = str2;
        this.quoteId = str3;
        this.estimateBalanceUsage = estimateBalanceUsageBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.crcore.shared.net.responsebean.EstimateBalanceUsageBean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.EstimateBalanceUsageBean) : (r5v0 com.okinc.crcore.shared.net.responsebean.EstimateBalanceUsageBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.EstimateBalanceUsageBean):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.ExchangeQuoteBean.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.EstimateBalanceUsageBean):void type: THIS */
    public /* synthetic */ ExchangeQuoteBean(String str, String str2, String str3, EstimateBalanceUsageBean estimateBalanceUsageBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : estimateBalanceUsageBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.ExchangeQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExchangeQuoteBean> serializer() {
            return ExchangeQuoteBean$$serializer.INSTANCE;
        }

        public final ExchangeQuoteBean OLrzqt(@NotNull ExchangeQuoteResponseBean exchangeQuoteResponseBean) {
            Intrinsics.checkNotNullParameter(exchangeQuoteResponseBean, "");
            String askPx = exchangeQuoteResponseBean.getAskPx();
            String bidPx = exchangeQuoteResponseBean.getBidPx();
            String quoteId = exchangeQuoteResponseBean.getQuoteId();
            EstimateBalanceUsageResponseBean estimateBalanceUsage = exchangeQuoteResponseBean.getEstimateBalanceUsage();
            return new ExchangeQuoteBean(askPx, bidPx, quoteId, estimateBalanceUsage != null ? EstimateBalanceUsageBean.Companion.OLrzqt(estimateBalanceUsage) : null);
        }
    }
}
