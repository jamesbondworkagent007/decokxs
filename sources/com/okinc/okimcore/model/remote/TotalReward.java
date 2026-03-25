package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TotalReward {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean isFiatRewardValuationCurrency;
    private final String rewardType;
    private final Double rewardValuation;
    private final String rewardValuationCurrency;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TotalReward() {
        this((String) null, (Double) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TotalReward copy$default(TotalReward totalReward, String str, Double d, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = totalReward.rewardType;
        }
        if ((i & 2) != 0) {
            d = totalReward.rewardValuation;
        }
        if ((i & 4) != 0) {
            str2 = totalReward.rewardValuationCurrency;
        }
        if ((i & 8) != 0) {
            bool = totalReward.isFiatRewardValuationCurrency;
        }
        return totalReward.copy(str, d, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component2() {
        return this.rewardValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rewardValuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isFiatRewardValuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TotalReward copy(String str, Double d, String str2, Boolean bool) {
        return new TotalReward(str, d, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalReward)) {
            return false;
        }
        TotalReward totalReward = (TotalReward) obj;
        return Intrinsics.EZpvd((Object) this.rewardType, (Object) totalReward.rewardType) && Intrinsics.EZpvd(this.rewardValuation, totalReward.rewardValuation) && Intrinsics.EZpvd((Object) this.rewardValuationCurrency, (Object) totalReward.rewardValuationCurrency) && Intrinsics.EZpvd(this.isFiatRewardValuationCurrency, totalReward.isFiatRewardValuationCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRewardValuation() {
        return this.rewardValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardValuationCurrency() {
        return this.rewardValuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rewardType;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.rewardValuation;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str2 = this.rewardValuationCurrency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isFiatRewardValuationCurrency;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFiatRewardValuationCurrency() {
        return this.isFiatRewardValuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TotalReward(rewardType=" + this.rewardType + ", rewardValuation=" + this.rewardValuation + ", rewardValuationCurrency=" + this.rewardValuationCurrency + ", isFiatRewardValuationCurrency=" + this.isFiatRewardValuationCurrency + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.TotalReward.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TotalReward> serializer() {
            return TotalReward$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TotalReward(int i, String str, Double d, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rewardType = null;
        } else {
            this.rewardType = str;
        }
        if ((i & 2) == 0) {
            this.rewardValuation = null;
        } else {
            this.rewardValuation = d;
        }
        if ((i & 4) == 0) {
            this.rewardValuationCurrency = null;
        } else {
            this.rewardValuationCurrency = str2;
        }
        if ((i & 8) == 0) {
            this.isFiatRewardValuationCurrency = null;
        } else {
            this.isFiatRewardValuationCurrency = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(TotalReward totalReward, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || totalReward.rewardType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, totalReward.rewardType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || totalReward.rewardValuation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.INSTANCE, totalReward.rewardValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || totalReward.rewardValuationCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, totalReward.rewardValuationCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && totalReward.isFiatRewardValuationCurrency == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, totalReward.isFiatRewardValuationCurrency);
    }

    public TotalReward(String str, Double d, String str2, Boolean bool) {
        this.rewardType = str;
        this.rewardValuation = d;
        this.rewardValuationCurrency = str2;
        this.isFiatRewardValuationCurrency = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r3v0 java.lang.Double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Double, java.lang.String, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.okimcore.model.remote.TotalReward.<init>(java.lang.String, java.lang.Double, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TotalReward(String str, Double d, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
