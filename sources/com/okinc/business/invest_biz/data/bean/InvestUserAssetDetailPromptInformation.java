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
public final class InvestUserAssetDetailPromptInformation implements Parcelable {
    private final InvestTipInfoVo claimTipInfo;
    private final InvestTipInfoVo investmentNameTip;
    private final InvestTipInfoVo totalValueTip;
    private final InvestTipInfoVo underInvestmentNameTip;
    private final InvestTipInfoVo userAssetTip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserAssetDetailPromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserAssetDetailPromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailPromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUserAssetDetailPromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailPromptInformation[] newArray(int i) {
            return new InvestUserAssetDetailPromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserAssetDetailPromptInformation() {
        this((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUserAssetDetailPromptInformation copy$default(InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, int i, Object obj) {
        if ((i & 1) != 0) {
            investTipInfoVo = investUserAssetDetailPromptInformation.investmentNameTip;
        }
        if ((i & 2) != 0) {
            investTipInfoVo2 = investUserAssetDetailPromptInformation.totalValueTip;
        }
        InvestTipInfoVo investTipInfoVo6 = investTipInfoVo2;
        if ((i & 4) != 0) {
            investTipInfoVo3 = investUserAssetDetailPromptInformation.userAssetTip;
        }
        InvestTipInfoVo investTipInfoVo7 = investTipInfoVo3;
        if ((i & 8) != 0) {
            investTipInfoVo4 = investUserAssetDetailPromptInformation.underInvestmentNameTip;
        }
        InvestTipInfoVo investTipInfoVo8 = investTipInfoVo4;
        if ((i & 16) != 0) {
            investTipInfoVo5 = investUserAssetDetailPromptInformation.claimTipInfo;
        }
        return investUserAssetDetailPromptInformation.copy(investTipInfoVo, investTipInfoVo6, investTipInfoVo7, investTipInfoVo8, investTipInfoVo5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.investmentNameTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component2() {
        return this.totalValueTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component3() {
        return this.userAssetTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component4() {
        return this.underInvestmentNameTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component5() {
        return this.claimTipInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailPromptInformation copy(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5) {
        return new InvestUserAssetDetailPromptInformation(investTipInfoVo, investTipInfoVo2, investTipInfoVo3, investTipInfoVo4, investTipInfoVo5);
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
        if (!(obj instanceof InvestUserAssetDetailPromptInformation)) {
            return false;
        }
        InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation = (InvestUserAssetDetailPromptInformation) obj;
        return Intrinsics.EZpvd(this.investmentNameTip, investUserAssetDetailPromptInformation.investmentNameTip) && Intrinsics.EZpvd(this.totalValueTip, investUserAssetDetailPromptInformation.totalValueTip) && Intrinsics.EZpvd(this.userAssetTip, investUserAssetDetailPromptInformation.userAssetTip) && Intrinsics.EZpvd(this.underInvestmentNameTip, investUserAssetDetailPromptInformation.underInvestmentNameTip) && Intrinsics.EZpvd(this.claimTipInfo, investUserAssetDetailPromptInformation.claimTipInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getClaimTipInfo() {
        return this.claimTipInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getInvestmentNameTip() {
        return this.investmentNameTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTotalValueTip() {
        return this.totalValueTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getUnderInvestmentNameTip() {
        return this.underInvestmentNameTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getUserAssetTip() {
        return this.userAssetTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.investmentNameTip;
        int iHashCode = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.totalValueTip;
        int iHashCode2 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestTipInfoVo investTipInfoVo3 = this.userAssetTip;
        int iHashCode3 = investTipInfoVo3 == null ? 0 : investTipInfoVo3.hashCode();
        InvestTipInfoVo investTipInfoVo4 = this.underInvestmentNameTip;
        int iHashCode4 = investTipInfoVo4 == null ? 0 : investTipInfoVo4.hashCode();
        InvestTipInfoVo investTipInfoVo5 = this.claimTipInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (investTipInfoVo5 != null ? investTipInfoVo5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserAssetDetailPromptInformation(investmentNameTip=" + this.investmentNameTip + ", totalValueTip=" + this.totalValueTip + ", userAssetTip=" + this.userAssetTip + ", underInvestmentNameTip=" + this.underInvestmentNameTip + ", claimTipInfo=" + this.claimTipInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.investmentNameTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo2 = this.totalValueTip;
        if (investTipInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo2.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo3 = this.userAssetTip;
        if (investTipInfoVo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo3.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo4 = this.underInvestmentNameTip;
        if (investTipInfoVo4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo4.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo5 = this.claimTipInfo;
        if (investTipInfoVo5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo5.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserAssetDetailPromptInformation> serializer() {
            return InvestUserAssetDetailPromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserAssetDetailPromptInformation(int i, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentNameTip = null;
        } else {
            this.investmentNameTip = investTipInfoVo;
        }
        if ((i & 2) == 0) {
            this.totalValueTip = null;
        } else {
            this.totalValueTip = investTipInfoVo2;
        }
        if ((i & 4) == 0) {
            this.userAssetTip = null;
        } else {
            this.userAssetTip = investTipInfoVo3;
        }
        if ((i & 8) == 0) {
            this.underInvestmentNameTip = null;
        } else {
            this.underInvestmentNameTip = investTipInfoVo4;
        }
        if ((i & 16) == 0) {
            this.claimTipInfo = null;
        } else {
            this.claimTipInfo = investTipInfoVo5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserAssetDetailPromptInformation.investmentNameTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailPromptInformation.investmentNameTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserAssetDetailPromptInformation.totalValueTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailPromptInformation.totalValueTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserAssetDetailPromptInformation.userAssetTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailPromptInformation.userAssetTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserAssetDetailPromptInformation.underInvestmentNameTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailPromptInformation.underInvestmentNameTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investUserAssetDetailPromptInformation.claimTipInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailPromptInformation.claimTipInfo);
    }

    public InvestUserAssetDetailPromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5) {
        this.investmentNameTip = investTipInfoVo;
        this.totalValueTip = investTipInfoVo2;
        this.userAssetTip = investTipInfoVo3;
        this.underInvestmentNameTip = investTipInfoVo4;
        this.claimTipInfo = investTipInfoVo5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r5v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r6v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r7v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r8v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r9v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:274) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestUserAssetDetailPromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo, (i & 2) != 0 ? null : investTipInfoVo2, (i & 4) != 0 ? null : investTipInfoVo3, (i & 8) != 0 ? null : investTipInfoVo4, (i & 16) != 0 ? null : investTipInfoVo5);
    }
}
