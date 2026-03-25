package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InsufficientReward {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String contractClaimableReward;
    public final String rewardTokenAddress;
    public final String rewardTokenSymbol;
    public final String userRewardBalance;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InsufficientReward() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InsufficientReward copy$default(InsufficientReward insufficientReward, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insufficientReward.contractClaimableReward;
        }
        if ((i & 2) != 0) {
            str2 = insufficientReward.rewardTokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = insufficientReward.rewardTokenSymbol;
        }
        if ((i & 8) != 0) {
            str4 = insufficientReward.userRewardBalance;
        }
        return insufficientReward.KWHzl(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.contractClaimableReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InsufficientReward KWHzl(String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InsufficientReward(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.userRewardBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.rewardTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.rewardTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsufficientReward)) {
            return false;
        }
        InsufficientReward insufficientReward = (InsufficientReward) obj;
        return Intrinsics.EZpvd((Object) this.contractClaimableReward, (Object) insufficientReward.contractClaimableReward) && Intrinsics.EZpvd((Object) this.rewardTokenAddress, (Object) insufficientReward.rewardTokenAddress) && Intrinsics.EZpvd((Object) this.rewardTokenSymbol, (Object) insufficientReward.rewardTokenSymbol) && Intrinsics.EZpvd((Object) this.userRewardBalance, (Object) insufficientReward.userRewardBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.contractClaimableReward;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rewardTokenAddress;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.rewardTokenSymbol.hashCode()) * 31) + this.userRewardBalance.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InsufficientReward(contractClaimableReward=" + this.contractClaimableReward + ", rewardTokenAddress=" + this.rewardTokenAddress + ", rewardTokenSymbol=" + this.rewardTokenSymbol + ", userRewardBalance=" + this.userRewardBalance + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InsufficientReward.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InsufficientReward> serializer() {
            return InsufficientReward$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InsufficientReward(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contractClaimableReward = "";
        } else {
            this.contractClaimableReward = str;
        }
        if ((i & 2) == 0) {
            this.rewardTokenAddress = "";
        } else {
            this.rewardTokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.rewardTokenSymbol = "";
        } else {
            this.rewardTokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.userRewardBalance = "";
        } else {
            this.userRewardBalance = str4;
        }
    }

    public static final /* synthetic */ void OLrzqt(InsufficientReward insufficientReward, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) insufficientReward.contractClaimableReward, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, insufficientReward.contractClaimableReward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) insufficientReward.rewardTokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, insufficientReward.rewardTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) insufficientReward.rewardTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, insufficientReward.rewardTokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) insufficientReward.userRewardBalance, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, insufficientReward.userRewardBalance);
    }

    public InsufficientReward(String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.contractClaimableReward = str;
        this.rewardTokenAddress = str2;
        this.rewardTokenSymbol = str3;
        this.userRewardBalance = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1041) call: com.okinc.business.invest_biz.data.bean.InsufficientReward.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InsufficientReward(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
