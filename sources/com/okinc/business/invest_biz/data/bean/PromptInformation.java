package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PromptInformation implements Parcelable {
    private final InvestTipInfoVo assetsTip;
    private final InvestTipInfoVo estDailyYieldTip;
    private final InvestTipInfoVo exceptionTip;
    private final InvestTipInfoVo inputHintTip;
    private final InvestTipInfoVo investmentInfoTip;
    private final InvestTipInfoVo payWithTokenTip;
    private final InvestTipInfoVo pendingFeeTip;
    private final InvestTipInfoVo receiveTip;
    private final InvestTipInfoVo redeemAllTip;
    private final InvestTipInfoVo xrc20RedeemTip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptInformation[] newArray(int i) {
            return new PromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PromptInformation() {
        this((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("assetsTip")
    public static /* synthetic */ void getAssetsTip$annotations() {
    }

    @SerialName("estDailyYieldTip ")
    public static /* synthetic */ void getEstDailyYieldTip$annotations() {
    }

    @SerialName("exceptionTip")
    public static /* synthetic */ void getExceptionTip$annotations() {
    }

    @SerialName("inputHintTip")
    public static /* synthetic */ void getInputHintTip$annotations() {
    }

    @SerialName("investmentInfoTip")
    public static /* synthetic */ void getInvestmentInfoTip$annotations() {
    }

    @SerialName("payWithTokenTip")
    public static /* synthetic */ void getPayWithTokenTip$annotations() {
    }

    @SerialName("pendingFeeTip")
    public static /* synthetic */ void getPendingFeeTip$annotations() {
    }

    @SerialName("receiveTip")
    public static /* synthetic */ void getReceiveTip$annotations() {
    }

    @SerialName("redeemAllTip")
    public static /* synthetic */ void getRedeemAllTip$annotations() {
    }

    @SerialName("xrc20RedeemTip")
    public static /* synthetic */ void getXrc20RedeemTip$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.exceptionTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component10() {
        return this.inputHintTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component2() {
        return this.investmentInfoTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component3() {
        return this.estDailyYieldTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component4() {
        return this.redeemAllTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component5() {
        return this.receiveTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component6() {
        return this.assetsTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component7() {
        return this.payWithTokenTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component8() {
        return this.pendingFeeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component9() {
        return this.xrc20RedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation copy(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, InvestTipInfoVo investTipInfoVo6, InvestTipInfoVo investTipInfoVo7, InvestTipInfoVo investTipInfoVo8, InvestTipInfoVo investTipInfoVo9, InvestTipInfoVo investTipInfoVo10) {
        return new PromptInformation(investTipInfoVo, investTipInfoVo2, investTipInfoVo3, investTipInfoVo4, investTipInfoVo5, investTipInfoVo6, investTipInfoVo7, investTipInfoVo8, investTipInfoVo9, investTipInfoVo10);
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
        if (!(obj instanceof PromptInformation)) {
            return false;
        }
        PromptInformation promptInformation = (PromptInformation) obj;
        return Intrinsics.EZpvd(this.exceptionTip, promptInformation.exceptionTip) && Intrinsics.EZpvd(this.investmentInfoTip, promptInformation.investmentInfoTip) && Intrinsics.EZpvd(this.estDailyYieldTip, promptInformation.estDailyYieldTip) && Intrinsics.EZpvd(this.redeemAllTip, promptInformation.redeemAllTip) && Intrinsics.EZpvd(this.receiveTip, promptInformation.receiveTip) && Intrinsics.EZpvd(this.assetsTip, promptInformation.assetsTip) && Intrinsics.EZpvd(this.payWithTokenTip, promptInformation.payWithTokenTip) && Intrinsics.EZpvd(this.pendingFeeTip, promptInformation.pendingFeeTip) && Intrinsics.EZpvd(this.xrc20RedeemTip, promptInformation.xrc20RedeemTip) && Intrinsics.EZpvd(this.inputHintTip, promptInformation.inputHintTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getAssetsTip() {
        return this.assetsTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getEstDailyYieldTip() {
        return this.estDailyYieldTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getExceptionTip() {
        return this.exceptionTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getInputHintTip() {
        return this.inputHintTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getInvestmentInfoTip() {
        return this.investmentInfoTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPayWithTokenTip() {
        return this.payWithTokenTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPendingFeeTip() {
        return this.pendingFeeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getReceiveTip() {
        return this.receiveTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getRedeemAllTip() {
        return this.redeemAllTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getXrc20RedeemTip() {
        return this.xrc20RedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.exceptionTip;
        int iHashCode = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.investmentInfoTip;
        int iHashCode2 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestTipInfoVo investTipInfoVo3 = this.estDailyYieldTip;
        int iHashCode3 = investTipInfoVo3 == null ? 0 : investTipInfoVo3.hashCode();
        InvestTipInfoVo investTipInfoVo4 = this.redeemAllTip;
        int iHashCode4 = investTipInfoVo4 == null ? 0 : investTipInfoVo4.hashCode();
        InvestTipInfoVo investTipInfoVo5 = this.receiveTip;
        int iHashCode5 = investTipInfoVo5 == null ? 0 : investTipInfoVo5.hashCode();
        InvestTipInfoVo investTipInfoVo6 = this.assetsTip;
        int iHashCode6 = investTipInfoVo6 == null ? 0 : investTipInfoVo6.hashCode();
        InvestTipInfoVo investTipInfoVo7 = this.payWithTokenTip;
        int iHashCode7 = investTipInfoVo7 == null ? 0 : investTipInfoVo7.hashCode();
        InvestTipInfoVo investTipInfoVo8 = this.pendingFeeTip;
        int iHashCode8 = investTipInfoVo8 == null ? 0 : investTipInfoVo8.hashCode();
        InvestTipInfoVo investTipInfoVo9 = this.xrc20RedeemTip;
        int iHashCode9 = investTipInfoVo9 == null ? 0 : investTipInfoVo9.hashCode();
        InvestTipInfoVo investTipInfoVo10 = this.inputHintTip;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (investTipInfoVo10 != null ? investTipInfoVo10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PromptInformation(exceptionTip=" + this.exceptionTip + ", investmentInfoTip=" + this.investmentInfoTip + ", estDailyYieldTip=" + this.estDailyYieldTip + ", redeemAllTip=" + this.redeemAllTip + ", receiveTip=" + this.receiveTip + ", assetsTip=" + this.assetsTip + ", payWithTokenTip=" + this.payWithTokenTip + ", pendingFeeTip=" + this.pendingFeeTip + ", xrc20RedeemTip=" + this.xrc20RedeemTip + ", inputHintTip=" + this.inputHintTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.exceptionTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo2 = this.investmentInfoTip;
        if (investTipInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo2.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo3 = this.estDailyYieldTip;
        if (investTipInfoVo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo3.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo4 = this.redeemAllTip;
        if (investTipInfoVo4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo4.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo5 = this.receiveTip;
        if (investTipInfoVo5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo5.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo6 = this.assetsTip;
        if (investTipInfoVo6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo6.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo7 = this.payWithTokenTip;
        if (investTipInfoVo7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo7.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo8 = this.pendingFeeTip;
        if (investTipInfoVo8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo8.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo9 = this.xrc20RedeemTip;
        if (investTipInfoVo9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo9.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo10 = this.inputHintTip;
        if (investTipInfoVo10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo10.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.PromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PromptInformation> serializer() {
            return PromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PromptInformation(int i, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, InvestTipInfoVo investTipInfoVo6, InvestTipInfoVo investTipInfoVo7, InvestTipInfoVo investTipInfoVo8, InvestTipInfoVo investTipInfoVo9, InvestTipInfoVo investTipInfoVo10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.exceptionTip = null;
        } else {
            this.exceptionTip = investTipInfoVo;
        }
        if ((i & 2) == 0) {
            this.investmentInfoTip = null;
        } else {
            this.investmentInfoTip = investTipInfoVo2;
        }
        if ((i & 4) == 0) {
            this.estDailyYieldTip = null;
        } else {
            this.estDailyYieldTip = investTipInfoVo3;
        }
        if ((i & 8) == 0) {
            this.redeemAllTip = null;
        } else {
            this.redeemAllTip = investTipInfoVo4;
        }
        if ((i & 16) == 0) {
            this.receiveTip = null;
        } else {
            this.receiveTip = investTipInfoVo5;
        }
        if ((i & 32) == 0) {
            this.assetsTip = null;
        } else {
            this.assetsTip = investTipInfoVo6;
        }
        if ((i & 64) == 0) {
            this.payWithTokenTip = null;
        } else {
            this.payWithTokenTip = investTipInfoVo7;
        }
        if ((i & 128) == 0) {
            this.pendingFeeTip = null;
        } else {
            this.pendingFeeTip = investTipInfoVo8;
        }
        if ((i & 256) == 0) {
            this.xrc20RedeemTip = null;
        } else {
            this.xrc20RedeemTip = investTipInfoVo9;
        }
        if ((i & 512) == 0) {
            this.inputHintTip = null;
        } else {
            this.inputHintTip = investTipInfoVo10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(PromptInformation promptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || promptInformation.exceptionTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.exceptionTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || promptInformation.investmentInfoTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.investmentInfoTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || promptInformation.estDailyYieldTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.estDailyYieldTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || promptInformation.redeemAllTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.redeemAllTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || promptInformation.receiveTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.receiveTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || promptInformation.assetsTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.assetsTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || promptInformation.payWithTokenTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.payWithTokenTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || promptInformation.pendingFeeTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.pendingFeeTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || promptInformation.xrc20RedeemTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.xrc20RedeemTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && promptInformation.inputHintTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, InvestTipInfoVo$$serializer.INSTANCE, promptInformation.inputHintTip);
    }

    public PromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, InvestTipInfoVo investTipInfoVo6, InvestTipInfoVo investTipInfoVo7, InvestTipInfoVo investTipInfoVo8, InvestTipInfoVo investTipInfoVo9, InvestTipInfoVo investTipInfoVo10) {
        this.exceptionTip = investTipInfoVo;
        this.investmentInfoTip = investTipInfoVo2;
        this.estDailyYieldTip = investTipInfoVo3;
        this.redeemAllTip = investTipInfoVo4;
        this.receiveTip = investTipInfoVo5;
        this.assetsTip = investTipInfoVo6;
        this.payWithTokenTip = investTipInfoVo7;
        this.pendingFeeTip = investTipInfoVo8;
        this.xrc20RedeemTip = investTipInfoVo9;
        this.inputHintTip = investTipInfoVo10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r12v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r13v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r14v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r15v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r16v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r17v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r18v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r19v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r20v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:98) call: com.okinc.business.invest_biz.data.bean.PromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ PromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, InvestTipInfoVo investTipInfoVo4, InvestTipInfoVo investTipInfoVo5, InvestTipInfoVo investTipInfoVo6, InvestTipInfoVo investTipInfoVo7, InvestTipInfoVo investTipInfoVo8, InvestTipInfoVo investTipInfoVo9, InvestTipInfoVo investTipInfoVo10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo, (i & 2) != 0 ? null : investTipInfoVo2, (i & 4) != 0 ? null : investTipInfoVo3, (i & 8) != 0 ? null : investTipInfoVo4, (i & 16) != 0 ? null : investTipInfoVo5, (i & 32) != 0 ? null : investTipInfoVo6, (i & 64) != 0 ? null : investTipInfoVo7, (i & 128) != 0 ? null : investTipInfoVo8, (i & 256) != 0 ? null : investTipInfoVo9, (i & 512) == 0 ? investTipInfoVo10 : null);
    }
}
