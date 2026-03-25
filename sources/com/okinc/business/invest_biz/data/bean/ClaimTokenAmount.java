package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ClaimTokenAmount {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String rewardCoinAmount;
    public final String rewardTokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClaimTokenAmount() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClaimTokenAmount copy$default(ClaimTokenAmount claimTokenAmount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimTokenAmount.rewardCoinAmount;
        }
        if ((i & 2) != 0) {
            str2 = claimTokenAmount.rewardTokenAddress;
        }
        return claimTokenAmount.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimTokenAmount OLrzqt(String str, String str2) {
        return new ClaimTokenAmount(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimTokenAmount)) {
            return false;
        }
        ClaimTokenAmount claimTokenAmount = (ClaimTokenAmount) obj;
        return Intrinsics.EZpvd((Object) this.rewardCoinAmount, (Object) claimTokenAmount.rewardCoinAmount) && Intrinsics.EZpvd((Object) this.rewardTokenAddress, (Object) claimTokenAmount.rewardTokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rewardCoinAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rewardTokenAddress;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClaimTokenAmount(rewardCoinAmount=" + this.rewardCoinAmount + ", rewardTokenAddress=" + this.rewardTokenAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.ClaimTokenAmount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ClaimTokenAmount> serializer() {
            return ClaimTokenAmount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClaimTokenAmount(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rewardCoinAmount = "";
        } else {
            this.rewardCoinAmount = str;
        }
        if ((i & 2) == 0) {
            this.rewardTokenAddress = "";
        } else {
            this.rewardTokenAddress = str2;
        }
    }

    public static final /* synthetic */ void KWHzl(ClaimTokenAmount claimTokenAmount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) claimTokenAmount.rewardCoinAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, claimTokenAmount.rewardCoinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) claimTokenAmount.rewardTokenAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, claimTokenAmount.rewardTokenAddress);
    }

    public ClaimTokenAmount(String str, String str2) {
        this.rewardCoinAmount = str;
        this.rewardTokenAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:1019) call: com.okinc.business.invest_biz.data.bean.ClaimTokenAmount.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ClaimTokenAmount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
