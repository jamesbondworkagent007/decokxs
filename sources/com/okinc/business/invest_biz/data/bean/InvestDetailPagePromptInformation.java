package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestDetailPagePromptInformation implements Parcelable {
    private final InvestTipInfoVo topBannerTip;
    private final InvestTipInfoVo unableSubscribeTip;
    private final InvestTipInfoVo unableToRedeemTip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestDetailPagePromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestDetailPagePromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetailPagePromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestDetailPagePromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetailPagePromptInformation[] newArray(int i) {
            return new InvestDetailPagePromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestDetailPagePromptInformation() {
        this((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestDetailPagePromptInformation copy$default(InvestDetailPagePromptInformation investDetailPagePromptInformation, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, int i, Object obj) {
        if ((i & 1) != 0) {
            investTipInfoVo = investDetailPagePromptInformation.topBannerTip;
        }
        if ((i & 2) != 0) {
            investTipInfoVo2 = investDetailPagePromptInformation.unableToRedeemTip;
        }
        if ((i & 4) != 0) {
            investTipInfoVo3 = investDetailPagePromptInformation.unableSubscribeTip;
        }
        return investDetailPagePromptInformation.copy(investTipInfoVo, investTipInfoVo2, investTipInfoVo3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.topBannerTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component2() {
        return this.unableToRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component3() {
        return this.unableSubscribeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation copy(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3) {
        return new InvestDetailPagePromptInformation(investTipInfoVo, investTipInfoVo2, investTipInfoVo3);
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
        if (!(obj instanceof InvestDetailPagePromptInformation)) {
            return false;
        }
        InvestDetailPagePromptInformation investDetailPagePromptInformation = (InvestDetailPagePromptInformation) obj;
        return Intrinsics.EZpvd(this.topBannerTip, investDetailPagePromptInformation.topBannerTip) && Intrinsics.EZpvd(this.unableToRedeemTip, investDetailPagePromptInformation.unableToRedeemTip) && Intrinsics.EZpvd(this.unableSubscribeTip, investDetailPagePromptInformation.unableSubscribeTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTopBannerTip() {
        return this.topBannerTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getUnableSubscribeTip() {
        return this.unableSubscribeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getUnableToRedeemTip() {
        return this.unableToRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.topBannerTip;
        int iHashCode = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.unableToRedeemTip;
        int iHashCode2 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestTipInfoVo investTipInfoVo3 = this.unableSubscribeTip;
        return (((iHashCode * 31) + iHashCode2) * 31) + (investTipInfoVo3 != null ? investTipInfoVo3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestDetailPagePromptInformation(topBannerTip=" + this.topBannerTip + ", unableToRedeemTip=" + this.unableToRedeemTip + ", unableSubscribeTip=" + this.unableSubscribeTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.topBannerTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo2 = this.unableToRedeemTip;
        if (investTipInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo2.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo3 = this.unableSubscribeTip;
        if (investTipInfoVo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo3.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestDetailPagePromptInformation> serializer() {
            return InvestDetailPagePromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestDetailPagePromptInformation(int i, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.topBannerTip = null;
        } else {
            this.topBannerTip = investTipInfoVo;
        }
        if ((i & 2) == 0) {
            this.unableToRedeemTip = null;
        } else {
            this.unableToRedeemTip = investTipInfoVo2;
        }
        if ((i & 4) == 0) {
            this.unableSubscribeTip = null;
        } else {
            this.unableSubscribeTip = investTipInfoVo3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestDetailPagePromptInformation investDetailPagePromptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investDetailPagePromptInformation.topBannerTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investDetailPagePromptInformation.topBannerTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investDetailPagePromptInformation.unableToRedeemTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investDetailPagePromptInformation.unableToRedeemTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investDetailPagePromptInformation.unableSubscribeTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investDetailPagePromptInformation.unableSubscribeTip);
    }

    public InvestDetailPagePromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3) {
        this.topBannerTip = investTipInfoVo;
        this.unableToRedeemTip = investTipInfoVo2;
        this.unableSubscribeTip = investTipInfoVo3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r2v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r3v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r4v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:352) call: com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestDetailPagePromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo, (i & 2) != 0 ? null : investTipInfoVo2, (i & 4) != 0 ? null : investTipInfoVo3);
    }
}
