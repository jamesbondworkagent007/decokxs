package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.RewardMetadataResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RewardMetadataBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String rewardAmount;
    private final String rewardSettlementCurrency;
    private final String rewardUnit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RewardMetadataBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RewardMetadataBean copy$default(RewardMetadataBean rewardMetadataBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardMetadataBean.rewardAmount;
        }
        if ((i & 2) != 0) {
            str2 = rewardMetadataBean.rewardUnit;
        }
        if ((i & 4) != 0) {
            str3 = rewardMetadataBean.rewardSettlementCurrency;
        }
        return rewardMetadataBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rewardUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rewardSettlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardMetadataBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RewardMetadataBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardMetadataBean)) {
            return false;
        }
        RewardMetadataBean rewardMetadataBean = (RewardMetadataBean) obj;
        return Intrinsics.EZpvd((Object) this.rewardAmount, (Object) rewardMetadataBean.rewardAmount) && Intrinsics.EZpvd((Object) this.rewardUnit, (Object) rewardMetadataBean.rewardUnit) && Intrinsics.EZpvd((Object) this.rewardSettlementCurrency, (Object) rewardMetadataBean.rewardSettlementCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardSettlementCurrency() {
        return this.rewardSettlementCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardUnit() {
        return this.rewardUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.rewardAmount.hashCode() * 31) + this.rewardUnit.hashCode()) * 31) + this.rewardSettlementCurrency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardMetadataBean(rewardAmount=" + this.rewardAmount + ", rewardUnit=" + this.rewardUnit + ", rewardSettlementCurrency=" + this.rewardSettlementCurrency + ")";
    }

    public /* synthetic */ RewardMetadataBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rewardAmount = "";
        } else {
            this.rewardAmount = str;
        }
        if ((i & 2) == 0) {
            this.rewardUnit = "";
        } else {
            this.rewardUnit = str2;
        }
        if ((i & 4) == 0) {
            this.rewardSettlementCurrency = "";
        } else {
            this.rewardSettlementCurrency = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RewardMetadataBean rewardMetadataBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rewardMetadataBean.rewardAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardMetadataBean.rewardAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rewardMetadataBean.rewardUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardMetadataBean.rewardUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) rewardMetadataBean.rewardSettlementCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rewardMetadataBean.rewardSettlementCurrency);
    }

    public RewardMetadataBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.rewardAmount = str;
        this.rewardUnit = str2;
        this.rewardSettlementCurrency = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:219) call: com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RewardMetadataBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.RewardMetadataBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RewardMetadataBean> serializer() {
            return RewardMetadataBean$$serializer.INSTANCE;
        }

        public final RewardMetadataBean OLrzqt(@NotNull RewardMetadataResponseBean rewardMetadataResponseBean) {
            Intrinsics.checkNotNullParameter(rewardMetadataResponseBean, "");
            return new RewardMetadataBean(rewardMetadataResponseBean.getRewardAmount(), rewardMetadataResponseBean.getRewardUnit(), rewardMetadataResponseBean.getRewardSettlementCurrency());
        }
    }
}
