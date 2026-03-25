package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MPBotBannerCard {
    private String algoIndexId;
    private String annualizedRate;
    private String instId;
    private String instType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPBotBannerCard() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MPBotBannerCard copy$default(MPBotBannerCard mPBotBannerCard, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPBotBannerCard.instId;
        }
        if ((i & 2) != 0) {
            str2 = mPBotBannerCard.instType;
        }
        if ((i & 4) != 0) {
            str3 = mPBotBannerCard.annualizedRate;
        }
        if ((i & 8) != 0) {
            str4 = mPBotBannerCard.algoIndexId;
        }
        return mPBotBannerCard.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.algoIndexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerCard copy(String str, String str2, String str3, String str4) {
        return new MPBotBannerCard(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPBotBannerCard)) {
            return false;
        }
        MPBotBannerCard mPBotBannerCard = (MPBotBannerCard) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) mPBotBannerCard.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) mPBotBannerCard.instType) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) mPBotBannerCard.annualizedRate) && Intrinsics.EZpvd((Object) this.algoIndexId, (Object) mPBotBannerCard.algoIndexId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoIndexId() {
        return this.algoIndexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.annualizedRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.algoIndexId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoIndexId(String str) {
        this.algoIndexId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPBotBannerCard(instId=" + this.instId + ", instType=" + this.instType + ", annualizedRate=" + this.annualizedRate + ", algoIndexId=" + this.algoIndexId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MPBotBannerCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPBotBannerCard> serializer() {
            return MPBotBannerCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPBotBannerCard(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = null;
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str3;
        }
        if ((i & 8) == 0) {
            this.algoIndexId = null;
        } else {
            this.algoIndexId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MPBotBannerCard mPBotBannerCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mPBotBannerCard.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mPBotBannerCard.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mPBotBannerCard.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mPBotBannerCard.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mPBotBannerCard.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mPBotBannerCard.annualizedRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && mPBotBannerCard.algoIndexId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, mPBotBannerCard.algoIndexId);
    }

    public MPBotBannerCard(String str, String str2, String str3, String str4) {
        this.instId = str;
        this.instType = str2;
        this.annualizedRate = str3;
        this.algoIndexId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2887) call: com.okinc.unify_trade.biz.MPBotBannerCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MPBotBannerCard(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
