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
public final class InvestUserAssetDetailClaimPromptInformation implements Parcelable {
    private final InvestTipInfoVo claimTipInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserAssetDetailClaimPromptInformation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserAssetDetailClaimPromptInformation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailClaimPromptInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUserAssetDetailClaimPromptInformation(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailClaimPromptInformation[] newArray(int i) {
            return new InvestUserAssetDetailClaimPromptInformation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserAssetDetailClaimPromptInformation() {
        this((InvestTipInfoVo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUserAssetDetailClaimPromptInformation copy$default(InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, InvestTipInfoVo investTipInfoVo, int i, Object obj) {
        if ((i & 1) != 0) {
            investTipInfoVo = investUserAssetDetailClaimPromptInformation.claimTipInfo;
        }
        return investUserAssetDetailClaimPromptInformation.copy(investTipInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component1() {
        return this.claimTipInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailClaimPromptInformation copy(InvestTipInfoVo investTipInfoVo) {
        return new InvestUserAssetDetailClaimPromptInformation(investTipInfoVo);
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
        return (obj instanceof InvestUserAssetDetailClaimPromptInformation) && Intrinsics.EZpvd(this.claimTipInfo, ((InvestUserAssetDetailClaimPromptInformation) obj).claimTipInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getClaimTipInfo() {
        return this.claimTipInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTipInfoVo investTipInfoVo = this.claimTipInfo;
        if (investTipInfoVo == null) {
            return 0;
        }
        return investTipInfoVo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserAssetDetailClaimPromptInformation(claimTipInfo=" + this.claimTipInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTipInfoVo investTipInfoVo = this.claimTipInfo;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserAssetDetailClaimPromptInformation> serializer() {
            return InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserAssetDetailClaimPromptInformation(int i, InvestTipInfoVo investTipInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.claimTipInfo = null;
        } else {
            this.claimTipInfo = investTipInfoVo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && investUserAssetDetailClaimPromptInformation.claimTipInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investUserAssetDetailClaimPromptInformation.claimTipInfo);
    }

    public InvestUserAssetDetailClaimPromptInformation(InvestTipInfoVo investTipInfoVo) {
        this.claimTipInfo = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r1v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:176) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestUserAssetDetailClaimPromptInformation(InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTipInfoVo);
    }
}
