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
public final class InvestGasPriceConfig implements Parcelable {
    private String estimateGasFee;
    private final InvestSlippageConfig investSlippage;
    private final NetworkFee networkFee;
    private SwapSlippageConfig swapSlippage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestGasPriceConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestGasPriceConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestGasPriceConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestGasPriceConfig(parcel.readInt() == 0 ? null : InvestSlippageConfig.CREATOR.createFromParcel(parcel), NetworkFee.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? SwapSlippageConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestGasPriceConfig[] newArray(int i) {
            return new InvestGasPriceConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestGasPriceConfig() {
        this((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestGasPriceConfig copy$default(InvestGasPriceConfig investGasPriceConfig, InvestSlippageConfig investSlippageConfig, NetworkFee networkFee, String str, SwapSlippageConfig swapSlippageConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            investSlippageConfig = investGasPriceConfig.investSlippage;
        }
        if ((i & 2) != 0) {
            networkFee = investGasPriceConfig.networkFee;
        }
        if ((i & 4) != 0) {
            str = investGasPriceConfig.estimateGasFee;
        }
        if ((i & 8) != 0) {
            swapSlippageConfig = investGasPriceConfig.swapSlippage;
        }
        return investGasPriceConfig.copy(investSlippageConfig, networkFee, str, swapSlippageConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSlippageConfig component1() {
        return this.investSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee component2() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapSlippageConfig component4() {
        return this.swapSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGasPriceConfig copy(InvestSlippageConfig investSlippageConfig, @NotNull NetworkFee networkFee, @NotNull String str, SwapSlippageConfig swapSlippageConfig) {
        Intrinsics.checkNotNullParameter(networkFee, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestGasPriceConfig(investSlippageConfig, networkFee, str, swapSlippageConfig);
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
        if (!(obj instanceof InvestGasPriceConfig)) {
            return false;
        }
        InvestGasPriceConfig investGasPriceConfig = (InvestGasPriceConfig) obj;
        return Intrinsics.EZpvd(this.investSlippage, investGasPriceConfig.investSlippage) && Intrinsics.EZpvd(this.networkFee, investGasPriceConfig.networkFee) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investGasPriceConfig.estimateGasFee) && Intrinsics.EZpvd(this.swapSlippage, investGasPriceConfig.swapSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateGasFee() {
        return this.estimateGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSlippageConfig getInvestSlippage() {
        return this.investSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapSlippageConfig getSwapSlippage() {
        return this.swapSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestSlippageConfig investSlippageConfig = this.investSlippage;
        int iHashCode = investSlippageConfig == null ? 0 : investSlippageConfig.hashCode();
        int iHashCode2 = this.networkFee.hashCode();
        int iHashCode3 = this.estimateGasFee.hashCode();
        SwapSlippageConfig swapSlippageConfig = this.swapSlippage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (swapSlippageConfig != null ? swapSlippageConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateGasFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapSlippage(SwapSlippageConfig swapSlippageConfig) {
        this.swapSlippage = swapSlippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestGasPriceConfig(investSlippage=" + this.investSlippage + ", networkFee=" + this.networkFee + ", estimateGasFee=" + this.estimateGasFee + ", swapSlippage=" + this.swapSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestSlippageConfig investSlippageConfig = this.investSlippage;
        if (investSlippageConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investSlippageConfig.writeToParcel(parcel, i);
        }
        this.networkFee.writeToParcel(parcel, i);
        parcel.writeString(this.estimateGasFee);
        SwapSlippageConfig swapSlippageConfig = this.swapSlippage;
        if (swapSlippageConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            swapSlippageConfig.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestGasPriceConfig> serializer() {
            return InvestGasPriceConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestGasPriceConfig(int i, InvestSlippageConfig investSlippageConfig, NetworkFee networkFee, String str, SwapSlippageConfig swapSlippageConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investSlippage = null;
        } else {
            this.investSlippage = investSlippageConfig;
        }
        this.networkFee = (i & 2) == 0 ? new NetworkFee((NetworkGear) null, (String) null, (String) null, (String) null, (NetworkGear) null, (String) null, (NetworkGear) null, (String) null, false, false, (String) null, (String) null, 4095, (DefaultConstructorMarker) null) : networkFee;
        this.estimateGasFee = (i & 4) == 0 ? "" : str;
        if ((i & 8) == 0) {
            this.swapSlippage = null;
        } else {
            this.swapSlippage = swapSlippageConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestGasPriceConfig investGasPriceConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investGasPriceConfig.investSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestSlippageConfig$$serializer.INSTANCE, investGasPriceConfig.investSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investGasPriceConfig.networkFee, new NetworkFee((NetworkGear) null, (String) null, (String) null, (String) null, (NetworkGear) null, (String) null, (NetworkGear) null, (String) null, false, false, (String) null, (String) null, 4095, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, NetworkFee$$serializer.INSTANCE, investGasPriceConfig.networkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investGasPriceConfig.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investGasPriceConfig.estimateGasFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investGasPriceConfig.swapSlippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, SwapSlippageConfig$$serializer.INSTANCE, investGasPriceConfig.swapSlippage);
    }

    public InvestGasPriceConfig(InvestSlippageConfig investSlippageConfig, @NotNull NetworkFee networkFee, @NotNull String str, SwapSlippageConfig swapSlippageConfig) {
        Intrinsics.checkNotNullParameter(networkFee, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.investSlippage = investSlippageConfig;
        this.networkFee = networkFee;
        this.estimateGasFee = str;
        this.swapSlippage = swapSlippageConfig;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestGasPriceConfig(com.okinc.business.invest_biz.data.bean.InvestSlippageConfig r19, com.okinc.business.invest_biz.data.bean.NetworkFee r20, java.lang.String r21, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r18 = this;
            r0 = r23 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L9
        L7:
            r0 = r19
        L9:
            r2 = r23 & 2
            if (r2 == 0) goto L24
            com.okinc.business.invest_biz.data.bean.NetworkFee r2 = new com.okinc.business.invest_biz.data.bean.NetworkFee
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L26
        L24:
            r2 = r20
        L26:
            r3 = r23 & 4
            if (r3 == 0) goto L2d
            java.lang.String r3 = ""
            goto L2f
        L2d:
            r3 = r21
        L2f:
            r4 = r23 & 8
            if (r4 == 0) goto L36
            r4 = r18
            goto L3a
        L36:
            r4 = r18
            r1 = r22
        L3a:
            r4.<init>(r0, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig.<init>(com.okinc.business.invest_biz.data.bean.InvestSlippageConfig, com.okinc.business.invest_biz.data.bean.NetworkFee, java.lang.String, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final NetworkGear getAverageGear() {
        return this.networkFee.getAverageGear();
    }
}
