package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class FinancialData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String balance;
    private final boolean canInvoice;
    private final boolean canInvoiceDeposit;
    private final boolean canInvoiceWithdraw;
    private final boolean canWithdrawAddress;
    private final boolean canWithdrawInternal;
    private final String currency;
    private final String currencyId;
    private final String currencySymbol;
    private final String fullName;
    private final String icon;
    private final boolean isCashCurrency;
    private final boolean isFavorite;
    private final boolean isTimeCurrency;
    private final String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isCashCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isTimeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.canInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.canInvoiceWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.canWithdrawAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinancialData copy(@NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z6, boolean z7, boolean z8, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new FinancialData(str, z, z2, z3, z4, z5, str2, str3, str4, str5, str6, z6, z7, z8, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialData)) {
            return false;
        }
        FinancialData financialData = (FinancialData) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) financialData.balance) && this.canInvoice == financialData.canInvoice && this.canInvoiceDeposit == financialData.canInvoiceDeposit && this.canInvoiceWithdraw == financialData.canInvoiceWithdraw && this.canWithdrawAddress == financialData.canWithdrawAddress && this.canWithdrawInternal == financialData.canWithdrawInternal && Intrinsics.EZpvd((Object) this.currency, (Object) financialData.currency) && Intrinsics.EZpvd((Object) this.currencyId, (Object) financialData.currencyId) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) financialData.currencySymbol) && Intrinsics.EZpvd((Object) this.fullName, (Object) financialData.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) financialData.icon) && this.isCashCurrency == financialData.isCashCurrency && this.isFavorite == financialData.isFavorite && this.isTimeCurrency == financialData.isTimeCurrency && Intrinsics.EZpvd((Object) this.valuation, (Object) financialData.valuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanInvoice() {
        return this.canInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanInvoiceDeposit() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanInvoiceWithdraw() {
        return this.canInvoiceWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdrawAddress() {
        return this.canWithdrawAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdrawInternal() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.balance.hashCode() * 31) + Boolean.hashCode(this.canInvoice)) * 31) + Boolean.hashCode(this.canInvoiceDeposit)) * 31) + Boolean.hashCode(this.canInvoiceWithdraw)) * 31) + Boolean.hashCode(this.canWithdrawAddress)) * 31) + Boolean.hashCode(this.canWithdrawInternal)) * 31) + this.currency.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.isCashCurrency)) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.isTimeCurrency)) * 31) + this.valuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCashCurrency() {
        return this.isCashCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFavorite() {
        return this.isFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTimeCurrency() {
        return this.isTimeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FinancialData(balance=" + this.balance + ", canInvoice=" + this.canInvoice + ", canInvoiceDeposit=" + this.canInvoiceDeposit + ", canInvoiceWithdraw=" + this.canInvoiceWithdraw + ", canWithdrawAddress=" + this.canWithdrawAddress + ", canWithdrawInternal=" + this.canWithdrawInternal + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", currencySymbol=" + this.currencySymbol + ", fullName=" + this.fullName + ", icon=" + this.icon + ", isCashCurrency=" + this.isCashCurrency + ", isFavorite=" + this.isFavorite + ", isTimeCurrency=" + this.isTimeCurrency + ", valuation=" + this.valuation + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FinancialData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialData> serializer() {
            return FinancialData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialData(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, String str5, String str6, boolean z6, boolean z7, boolean z8, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, FinancialData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.balance = "";
        } else {
            this.balance = str;
        }
        if ((i & 2) == 0) {
            this.canInvoice = false;
        } else {
            this.canInvoice = z;
        }
        if ((i & 4) == 0) {
            this.canInvoiceDeposit = false;
        } else {
            this.canInvoiceDeposit = z2;
        }
        if ((i & 8) == 0) {
            this.canInvoiceWithdraw = false;
        } else {
            this.canInvoiceWithdraw = z3;
        }
        if ((i & 16) == 0) {
            this.canWithdrawAddress = false;
        } else {
            this.canWithdrawAddress = z4;
        }
        if ((i & 32) == 0) {
            this.canWithdrawInternal = false;
        } else {
            this.canWithdrawInternal = z5;
        }
        if ((i & 64) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
        this.currencyId = str3;
        if ((i & 256) == 0) {
            this.currencySymbol = "";
        } else {
            this.currencySymbol = str4;
        }
        if ((i & 512) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str5;
        }
        if ((i & 1024) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i & 2048) == 0) {
            this.isCashCurrency = false;
        } else {
            this.isCashCurrency = z6;
        }
        if ((i & 4096) == 0) {
            this.isFavorite = false;
        } else {
            this.isFavorite = z7;
        }
        if ((i & 8192) == 0) {
            this.isTimeCurrency = false;
        } else {
            this.isTimeCurrency = z8;
        }
        if ((i & 16384) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FinancialData financialData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) financialData.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, financialData.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || financialData.canInvoice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, financialData.canInvoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || financialData.canInvoiceDeposit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, financialData.canInvoiceDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || financialData.canInvoiceWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, financialData.canInvoiceWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || financialData.canWithdrawAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, financialData.canWithdrawAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || financialData.canWithdrawInternal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, financialData.canWithdrawInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) financialData.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, financialData.currency);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, financialData.currencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) financialData.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, financialData.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) financialData.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, financialData.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) financialData.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, financialData.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || financialData.isCashCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, financialData.isCashCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || financialData.isFavorite) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, financialData.isFavorite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || financialData.isTimeCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, financialData.isTimeCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) financialData.valuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, financialData.valuation);
    }

    public FinancialData(@NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z6, boolean z7, boolean z8, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.balance = str;
        this.canInvoice = z;
        this.canInvoiceDeposit = z2;
        this.canInvoiceWithdraw = z3;
        this.canWithdrawAddress = z4;
        this.canWithdrawInternal = z5;
        this.currency = str2;
        this.currencyId = str3;
        this.currencySymbol = str4;
        this.fullName = str5;
        this.icon = str6;
        this.isCashCurrency = z6;
        this.isFavorite = z7;
        this.isTimeCurrency = z8;
        this.valuation = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0066: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
 A[MD:(java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:220) call: com.okinc.unify_trade.biz.FinancialData.<init>(java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ FinancialData(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, String str5, String str6, boolean z6, boolean z7, boolean z8, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? "" : str2, str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? false : z7, (i & 8192) != 0 ? false : z8, (i & 16384) != 0 ? "" : str7);
    }
}
