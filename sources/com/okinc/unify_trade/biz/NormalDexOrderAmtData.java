package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NormalDexOrderAmtData {
    private String dexPendingLimitOrderNum;
    private String dexPendingMarketOrderNum;
    private String dexPendingOrderNum;
    private String dexTPSLPendingOrderNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NormalDexOrderAmtData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NormalDexOrderAmtData copy$default(NormalDexOrderAmtData normalDexOrderAmtData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = normalDexOrderAmtData.dexPendingOrderNum;
        }
        if ((i & 2) != 0) {
            str2 = normalDexOrderAmtData.dexPendingMarketOrderNum;
        }
        if ((i & 4) != 0) {
            str3 = normalDexOrderAmtData.dexPendingLimitOrderNum;
        }
        if ((i & 8) != 0) {
            str4 = normalDexOrderAmtData.dexTPSLPendingOrderNum;
        }
        return normalDexOrderAmtData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dexPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dexPendingMarketOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dexPendingLimitOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dexTPSLPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NormalDexOrderAmtData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new NormalDexOrderAmtData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalDexOrderAmtData)) {
            return false;
        }
        NormalDexOrderAmtData normalDexOrderAmtData = (NormalDexOrderAmtData) obj;
        return Intrinsics.EZpvd((Object) this.dexPendingOrderNum, (Object) normalDexOrderAmtData.dexPendingOrderNum) && Intrinsics.EZpvd((Object) this.dexPendingMarketOrderNum, (Object) normalDexOrderAmtData.dexPendingMarketOrderNum) && Intrinsics.EZpvd((Object) this.dexPendingLimitOrderNum, (Object) normalDexOrderAmtData.dexPendingLimitOrderNum) && Intrinsics.EZpvd((Object) this.dexTPSLPendingOrderNum, (Object) normalDexOrderAmtData.dexTPSLPendingOrderNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexPendingLimitOrderNum() {
        return this.dexPendingLimitOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexPendingMarketOrderNum() {
        return this.dexPendingMarketOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexPendingOrderNum() {
        return this.dexPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexTPSLPendingOrderNum() {
        return this.dexTPSLPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.dexPendingOrderNum.hashCode() * 31) + this.dexPendingMarketOrderNum.hashCode()) * 31) + this.dexPendingLimitOrderNum.hashCode()) * 31) + this.dexTPSLPendingOrderNum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexPendingLimitOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexPendingLimitOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexPendingMarketOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexPendingMarketOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexPendingOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexPendingOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexTPSLPendingOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexTPSLPendingOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NormalDexOrderAmtData(dexPendingOrderNum=" + this.dexPendingOrderNum + ", dexPendingMarketOrderNum=" + this.dexPendingMarketOrderNum + ", dexPendingLimitOrderNum=" + this.dexPendingLimitOrderNum + ", dexTPSLPendingOrderNum=" + this.dexTPSLPendingOrderNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.NormalDexOrderAmtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NormalDexOrderAmtData> serializer() {
            return NormalDexOrderAmtData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NormalDexOrderAmtData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dexPendingOrderNum = "0";
        } else {
            this.dexPendingOrderNum = str;
        }
        if ((i & 2) == 0) {
            this.dexPendingMarketOrderNum = "0";
        } else {
            this.dexPendingMarketOrderNum = str2;
        }
        if ((i & 4) == 0) {
            this.dexPendingLimitOrderNum = "0";
        } else {
            this.dexPendingLimitOrderNum = str3;
        }
        if ((i & 8) == 0) {
            this.dexTPSLPendingOrderNum = "0";
        } else {
            this.dexTPSLPendingOrderNum = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(NormalDexOrderAmtData normalDexOrderAmtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) normalDexOrderAmtData.dexPendingOrderNum, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, normalDexOrderAmtData.dexPendingOrderNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) normalDexOrderAmtData.dexPendingMarketOrderNum, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, normalDexOrderAmtData.dexPendingMarketOrderNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) normalDexOrderAmtData.dexPendingLimitOrderNum, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, normalDexOrderAmtData.dexPendingLimitOrderNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) normalDexOrderAmtData.dexTPSLPendingOrderNum, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, normalDexOrderAmtData.dexTPSLPendingOrderNum);
    }

    public NormalDexOrderAmtData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.dexPendingOrderNum = str;
        this.dexPendingMarketOrderNum = str2;
        this.dexPendingLimitOrderNum = str3;
        this.dexTPSLPendingOrderNum = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2606) call: com.okinc.unify_trade.biz.NormalDexOrderAmtData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NormalDexOrderAmtData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? "0" : str4);
    }
}
