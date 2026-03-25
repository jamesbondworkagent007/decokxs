package com.okinc.unify_trade.biz;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MarketLendingData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avgBorrowAmt;
    private final String avgBorrowAmtInUSD;
    private final String avgRate;
    private final String currencyId;
    private final String currencyName;
    private final String estimatedRate;
    private final String preRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketLendingData copy$default(MarketLendingData marketLendingData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketLendingData.avgBorrowAmt;
        }
        if ((i & 2) != 0) {
            str2 = marketLendingData.avgBorrowAmtInUSD;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = marketLendingData.avgRate;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = marketLendingData.currencyId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = marketLendingData.currencyName;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = marketLendingData.estimatedRate;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = marketLendingData.preRate;
        }
        return marketLendingData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avgBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avgBorrowAmtInUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estimatedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.preRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketLendingData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MarketLendingData(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLendingData)) {
            return false;
        }
        MarketLendingData marketLendingData = (MarketLendingData) obj;
        return Intrinsics.EZpvd((Object) this.avgBorrowAmt, (Object) marketLendingData.avgBorrowAmt) && Intrinsics.EZpvd((Object) this.avgBorrowAmtInUSD, (Object) marketLendingData.avgBorrowAmtInUSD) && Intrinsics.EZpvd((Object) this.avgRate, (Object) marketLendingData.avgRate) && Intrinsics.EZpvd((Object) this.currencyId, (Object) marketLendingData.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) marketLendingData.currencyName) && Intrinsics.EZpvd((Object) this.estimatedRate, (Object) marketLendingData.estimatedRate) && Intrinsics.EZpvd((Object) this.preRate, (Object) marketLendingData.preRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgBorrowAmt() {
        return this.avgBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgBorrowAmtInUSD() {
        return this.avgBorrowAmtInUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgRate() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedRate() {
        return this.estimatedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreRate() {
        return this.preRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.avgBorrowAmt.hashCode() * 31) + this.avgBorrowAmtInUSD.hashCode()) * 31) + this.avgRate.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.currencyName.hashCode()) * 31) + this.estimatedRate.hashCode()) * 31) + this.preRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketLendingData(avgBorrowAmt=" + this.avgBorrowAmt + ", avgBorrowAmtInUSD=" + this.avgBorrowAmtInUSD + ", avgRate=" + this.avgRate + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", estimatedRate=" + this.estimatedRate + ", preRate=" + this.preRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarketLendingData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketLendingData> serializer() {
            return MarketLendingData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketLendingData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (111 != (i & WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY)) {
            PluginExceptionsKt.throwMissingFieldException(i, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, MarketLendingData$$serializer.INSTANCE.getDescriptor());
        }
        this.avgBorrowAmt = str;
        this.avgBorrowAmtInUSD = str2;
        this.avgRate = str3;
        this.currencyId = str4;
        if ((i & 16) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str5;
        }
        this.estimatedRate = str6;
        this.preRate = str7;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarketLendingData marketLendingData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, marketLendingData.avgBorrowAmt);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, marketLendingData.avgBorrowAmtInUSD);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketLendingData.avgRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, marketLendingData.currencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketLendingData.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketLendingData.currencyName);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, marketLendingData.estimatedRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, marketLendingData.preRate);
    }

    public MarketLendingData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.avgBorrowAmt = str;
        this.avgBorrowAmtInUSD = str2;
        this.avgRate = str3;
        this.currencyId = str4;
        this.currencyName = str5;
        this.estimatedRate = str6;
        this.preRate = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:253) call: com.okinc.unify_trade.biz.MarketLendingData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketLendingData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, str6, str7);
    }
}
