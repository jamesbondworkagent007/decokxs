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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class InvestUniv3RedeemPromptInformation implements Parcelable {
    private final InvestTipInfoVo exceptionTip;
    private final InvestTipInfoVo pendingFeeTip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3RedeemPromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3RedeemPromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemPromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUniv3RedeemPromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemPromptInformation[] newArray(int i) {
            return new InvestUniv3RedeemPromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3RedeemPromptInformation() {
        this((InvestTipInfoVo) null, (InvestTipInfoVo) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3RedeemPromptInformation copy$default(InvestUniv3RedeemPromptInformation investUniv3RedeemPromptInformation, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, int i, Object obj) {
        if ((i & 1) != 0) {
            investTipInfoVo = investUniv3RedeemPromptInformation.pendingFeeTip;
        }
        if ((i & 2) != 0) {
            investTipInfoVo2 = investUniv3RedeemPromptInformation.exceptionTip;
        }
        return investUniv3RedeemPromptInformation.copy(investTipInfoVo, investTipInfoVo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.pendingFeeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component2() {
        return this.exceptionTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemPromptInformation copy(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2) {
        return new InvestUniv3RedeemPromptInformation(investTipInfoVo, investTipInfoVo2);
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
        if (!(obj instanceof InvestUniv3RedeemPromptInformation)) {
            return false;
        }
        InvestUniv3RedeemPromptInformation investUniv3RedeemPromptInformation = (InvestUniv3RedeemPromptInformation) obj;
        return Intrinsics.EZpvd(this.pendingFeeTip, investUniv3RedeemPromptInformation.pendingFeeTip) && Intrinsics.EZpvd(this.exceptionTip, investUniv3RedeemPromptInformation.exceptionTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getExceptionTip() {
        return this.exceptionTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPendingFeeTip() {
        return this.pendingFeeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.pendingFeeTip;
        int iHashCode = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.exceptionTip;
        return (iHashCode * 31) + (investTipInfoVo2 != null ? investTipInfoVo2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RedeemPromptInformation(pendingFeeTip=" + this.pendingFeeTip + ", exceptionTip=" + this.exceptionTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.pendingFeeTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo2 = this.exceptionTip;
        if (investTipInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemPromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RedeemPromptInformation> serializer() {
            return InvestUniv3RedeemPromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3RedeemPromptInformation(int i, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pendingFeeTip = null;
        } else {
            this.pendingFeeTip = investTipInfoVo;
        }
        if ((i & 2) == 0) {
            this.exceptionTip = null;
        } else {
            this.exceptionTip = investTipInfoVo2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RedeemPromptInformation investUniv3RedeemPromptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3RedeemPromptInformation.pendingFeeTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investUniv3RedeemPromptInformation.pendingFeeTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && investUniv3RedeemPromptInformation.exceptionTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investUniv3RedeemPromptInformation.exceptionTip);
    }

    public InvestUniv3RedeemPromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2) {
        this.pendingFeeTip = investTipInfoVo;
        this.exceptionTip = investTipInfoVo2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r2v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r3v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:88) call: com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemPromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestUniv3RedeemPromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo, (i & 2) != 0 ? null : investTipInfoVo2);
    }
}
