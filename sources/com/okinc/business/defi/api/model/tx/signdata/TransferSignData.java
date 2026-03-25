package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class TransferSignData extends BaseTransferSignData {
    public static final int $stable = 8;
    private String currencyIsoCode;
    private String depositLimit;
    private String fromAddress;
    private boolean isTransferAmount;
    private boolean isXLayerPrefixToAddress;
    private String memo;
    private String okexAccount;
    private String toAddress;
    private String toAddressName;
    private String transferAmount;
    private String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyIsoCode() {
        return this.currencyIsoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositLimit() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddressName() {
        return this.toAddressName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTransferAmount() {
        return this.isTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isXLayerPrefixToAddress() {
        return this.isXLayerPrefixToAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyIsoCode(String str) {
        this.currencyIsoCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFromAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexAccount(String str) {
        this.okexAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddressName(String str) {
        this.toAddressName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTransferAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transferAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferAmount(boolean z) {
        this.isTransferAmount = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setXLayerPrefixToAddress(boolean z) {
        this.isXLayerPrefixToAddress = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r11v0 long)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.business.defi.api.model.tx.signdata.TransferSignData.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransferSignData(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        super(j, false, 2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fromAddress = str;
        this.toAddress = str2;
        this.transferAmount = str3;
        this.currencyIsoCode = str4;
        this.memo = str5;
        this.isTransferAmount = true;
        this.valuation = "0";
        this.depositLimit = "0";
    }

    public String toString() {
        return "TransferSignData(coinId=" + getCoinId() + ", fromAddress='" + getFromAddress() + "', toAddress='" + getToAddress() + "', transferAmount='" + getTransferAmount() + "', currencyIsoCode=" + this.currencyIsoCode + ", isTransferMaxAmount=" + isTransferMaxAmount() + ")";
    }
}
