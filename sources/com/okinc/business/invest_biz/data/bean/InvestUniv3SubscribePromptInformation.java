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
public final class InvestUniv3SubscribePromptInformation implements Parcelable {
    private final InvestTipInfoVo estDailyYieldTip;
    private final InvestTipInfoVo positionNotInRangeTip;
    private final InvestTipInfoVo priceRangeTip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3SubscribePromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3SubscribePromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribePromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUniv3SubscribePromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribePromptInformation[] newArray(int i) {
            return new InvestUniv3SubscribePromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3SubscribePromptInformation() {
        this((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3SubscribePromptInformation copy$default(InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, int i, Object obj) {
        if ((i & 1) != 0) {
            investTipInfoVo = investUniv3SubscribePromptInformation.estDailyYieldTip;
        }
        if ((i & 2) != 0) {
            investTipInfoVo2 = investUniv3SubscribePromptInformation.positionNotInRangeTip;
        }
        if ((i & 4) != 0) {
            investTipInfoVo3 = investUniv3SubscribePromptInformation.priceRangeTip;
        }
        return investUniv3SubscribePromptInformation.copy(investTipInfoVo, investTipInfoVo2, investTipInfoVo3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.estDailyYieldTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component2() {
        return this.positionNotInRangeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component3() {
        return this.priceRangeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribePromptInformation copy(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3) {
        return new InvestUniv3SubscribePromptInformation(investTipInfoVo, investTipInfoVo2, investTipInfoVo3);
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
        if (!(obj instanceof InvestUniv3SubscribePromptInformation)) {
            return false;
        }
        InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation = (InvestUniv3SubscribePromptInformation) obj;
        return Intrinsics.EZpvd(this.estDailyYieldTip, investUniv3SubscribePromptInformation.estDailyYieldTip) && Intrinsics.EZpvd(this.positionNotInRangeTip, investUniv3SubscribePromptInformation.positionNotInRangeTip) && Intrinsics.EZpvd(this.priceRangeTip, investUniv3SubscribePromptInformation.priceRangeTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getEstDailyYieldTip() {
        return this.estDailyYieldTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPositionNotInRangeTip() {
        return this.positionNotInRangeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPriceRangeTip() {
        return this.priceRangeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.estDailyYieldTip;
        int iHashCode = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        InvestTipInfoVo investTipInfoVo2 = this.positionNotInRangeTip;
        int iHashCode2 = investTipInfoVo2 == null ? 0 : investTipInfoVo2.hashCode();
        InvestTipInfoVo investTipInfoVo3 = this.priceRangeTip;
        return (((iHashCode * 31) + iHashCode2) * 31) + (investTipInfoVo3 != null ? investTipInfoVo3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribePromptInformation(estDailyYieldTip=" + this.estDailyYieldTip + ", positionNotInRangeTip=" + this.positionNotInRangeTip + ", priceRangeTip=" + this.priceRangeTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.estDailyYieldTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo2 = this.positionNotInRangeTip;
        if (investTipInfoVo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo2.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo3 = this.priceRangeTip;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribePromptInformation> serializer() {
            return InvestUniv3SubscribePromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3SubscribePromptInformation(int i, InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estDailyYieldTip = null;
        } else {
            this.estDailyYieldTip = investTipInfoVo;
        }
        if ((i & 2) == 0) {
            this.positionNotInRangeTip = null;
        } else {
            this.positionNotInRangeTip = investTipInfoVo2;
        }
        if ((i & 4) == 0) {
            this.priceRangeTip = null;
        } else {
            this.priceRangeTip = investTipInfoVo3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3SubscribePromptInformation.estDailyYieldTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investUniv3SubscribePromptInformation.estDailyYieldTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUniv3SubscribePromptInformation.positionNotInRangeTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestTipInfoVo$$serializer.INSTANCE, investUniv3SubscribePromptInformation.positionNotInRangeTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investUniv3SubscribePromptInformation.priceRangeTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestTipInfoVo$$serializer.INSTANCE, investUniv3SubscribePromptInformation.priceRangeTip);
    }

    public InvestUniv3SubscribePromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3) {
        this.estDailyYieldTip = investTipInfoVo;
        this.positionNotInRangeTip = investTipInfoVo2;
        this.priceRangeTip = investTipInfoVo3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r2v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r3v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r4v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:137) call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestUniv3SubscribePromptInformation(InvestTipInfoVo investTipInfoVo, InvestTipInfoVo investTipInfoVo2, InvestTipInfoVo investTipInfoVo3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo, (i & 2) != 0 ? null : investTipInfoVo2, (i & 4) != 0 ? null : investTipInfoVo3);
    }
}
