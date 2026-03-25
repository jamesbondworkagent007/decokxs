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
public final class GridProfitDetailsResponse {
    private String baseExtractAmount;
    private String baseProfit;
    private String baseTotalProfit;
    private String hisExtractAmount;
    private String historyNum;
    private String quoteExtractAmount;
    private String quoteProfit;
    private String quoteTotalPro;
    private String quoteWithdrawableAmount;
    private String reinvestedAmount;
    private String totalProfit;
    private String utilizedAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridProfitDetailsResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.reinvestedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteWithdrawableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.utilizedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.hisExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.historyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteTotalPro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.baseExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quoteExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitDetailsResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new GridProfitDetailsResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridProfitDetailsResponse)) {
            return false;
        }
        GridProfitDetailsResponse gridProfitDetailsResponse = (GridProfitDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.baseProfit, (Object) gridProfitDetailsResponse.baseProfit) && Intrinsics.EZpvd((Object) this.quoteProfit, (Object) gridProfitDetailsResponse.quoteProfit) && Intrinsics.EZpvd((Object) this.hisExtractAmount, (Object) gridProfitDetailsResponse.hisExtractAmount) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) gridProfitDetailsResponse.totalProfit) && Intrinsics.EZpvd((Object) this.historyNum, (Object) gridProfitDetailsResponse.historyNum) && Intrinsics.EZpvd((Object) this.baseTotalProfit, (Object) gridProfitDetailsResponse.baseTotalProfit) && Intrinsics.EZpvd((Object) this.quoteTotalPro, (Object) gridProfitDetailsResponse.quoteTotalPro) && Intrinsics.EZpvd((Object) this.baseExtractAmount, (Object) gridProfitDetailsResponse.baseExtractAmount) && Intrinsics.EZpvd((Object) this.quoteExtractAmount, (Object) gridProfitDetailsResponse.quoteExtractAmount) && Intrinsics.EZpvd((Object) this.reinvestedAmount, (Object) gridProfitDetailsResponse.reinvestedAmount) && Intrinsics.EZpvd((Object) this.quoteWithdrawableAmount, (Object) gridProfitDetailsResponse.quoteWithdrawableAmount) && Intrinsics.EZpvd((Object) this.utilizedAmount, (Object) gridProfitDetailsResponse.utilizedAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseExtractAmount() {
        return this.baseExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseProfit() {
        return this.baseProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseTotalProfit() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHisExtractAmount() {
        return this.hisExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHistoryNum() {
        return this.historyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteExtractAmount() {
        return this.quoteExtractAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteProfit() {
        return this.quoteProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTotalPro() {
        return this.quoteTotalPro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteWithdrawableAmount() {
        return this.quoteWithdrawableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestedAmount() {
        return this.reinvestedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtilizedAmount() {
        return this.utilizedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.baseProfit.hashCode() * 31) + this.quoteProfit.hashCode()) * 31) + this.hisExtractAmount.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + this.historyNum.hashCode()) * 31) + this.baseTotalProfit.hashCode()) * 31) + this.quoteTotalPro.hashCode()) * 31) + this.baseExtractAmount.hashCode()) * 31) + this.quoteExtractAmount.hashCode()) * 31) + this.reinvestedAmount.hashCode()) * 31) + this.quoteWithdrawableAmount.hashCode()) * 31) + this.utilizedAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseExtractAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseExtractAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseTotalProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseTotalProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHisExtractAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hisExtractAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoryNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.historyNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteExtractAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteExtractAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteTotalPro(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteTotalPro = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteWithdrawableAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteWithdrawableAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestedAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reinvestedAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtilizedAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.utilizedAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitDetailsResponse(baseProfit=" + this.baseProfit + ", quoteProfit=" + this.quoteProfit + ", hisExtractAmount=" + this.hisExtractAmount + ", totalProfit=" + this.totalProfit + ", historyNum=" + this.historyNum + ", baseTotalProfit=" + this.baseTotalProfit + ", quoteTotalPro=" + this.quoteTotalPro + ", baseExtractAmount=" + this.baseExtractAmount + ", quoteExtractAmount=" + this.quoteExtractAmount + ", reinvestedAmount=" + this.reinvestedAmount + ", quoteWithdrawableAmount=" + this.quoteWithdrawableAmount + ", utilizedAmount=" + this.utilizedAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitDetailsResponse> serializer() {
            return GridProfitDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitDetailsResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseProfit = "";
        } else {
            this.baseProfit = str;
        }
        if ((i & 2) == 0) {
            this.quoteProfit = "";
        } else {
            this.quoteProfit = str2;
        }
        if ((i & 4) == 0) {
            this.hisExtractAmount = "";
        } else {
            this.hisExtractAmount = str3;
        }
        if ((i & 8) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str4;
        }
        if ((i & 16) == 0) {
            this.historyNum = "";
        } else {
            this.historyNum = str5;
        }
        if ((i & 32) == 0) {
            this.baseTotalProfit = "";
        } else {
            this.baseTotalProfit = str6;
        }
        if ((i & 64) == 0) {
            this.quoteTotalPro = "";
        } else {
            this.quoteTotalPro = str7;
        }
        if ((i & 128) == 0) {
            this.baseExtractAmount = "";
        } else {
            this.baseExtractAmount = str8;
        }
        if ((i & 256) == 0) {
            this.quoteExtractAmount = "";
        } else {
            this.quoteExtractAmount = str9;
        }
        if ((i & 512) == 0) {
            this.reinvestedAmount = "";
        } else {
            this.reinvestedAmount = str10;
        }
        if ((i & 1024) == 0) {
            this.quoteWithdrawableAmount = "";
        } else {
            this.quoteWithdrawableAmount = str11;
        }
        if ((i & 2048) == 0) {
            this.utilizedAmount = "";
        } else {
            this.utilizedAmount = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitDetailsResponse gridProfitDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.baseProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridProfitDetailsResponse.baseProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.quoteProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridProfitDetailsResponse.quoteProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.hisExtractAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridProfitDetailsResponse.hisExtractAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.totalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, gridProfitDetailsResponse.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.historyNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, gridProfitDetailsResponse.historyNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.baseTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, gridProfitDetailsResponse.baseTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.quoteTotalPro, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, gridProfitDetailsResponse.quoteTotalPro);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.baseExtractAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, gridProfitDetailsResponse.baseExtractAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.quoteExtractAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, gridProfitDetailsResponse.quoteExtractAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.reinvestedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, gridProfitDetailsResponse.reinvestedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) gridProfitDetailsResponse.quoteWithdrawableAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, gridProfitDetailsResponse.quoteWithdrawableAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) gridProfitDetailsResponse.utilizedAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, gridProfitDetailsResponse.utilizedAmount);
    }

    public GridProfitDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.baseProfit = str;
        this.quoteProfit = str2;
        this.hisExtractAmount = str3;
        this.totalProfit = str4;
        this.historyNum = str5;
        this.baseTotalProfit = str6;
        this.quoteTotalPro = str7;
        this.baseExtractAmount = str8;
        this.quoteExtractAmount = str9;
        this.reinvestedAmount = str10;
        this.quoteWithdrawableAmount = str11;
        this.utilizedAmount = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1971) call: com.okinc.unify_trade.biz.GridProfitDetailsResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}
