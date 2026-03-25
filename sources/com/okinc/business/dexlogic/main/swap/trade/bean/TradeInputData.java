package com.okinc.business.dexlogic.main.swap.trade.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TradeInputData {
    public static final int $stable = 8;
    private FromToBalance balance;
    private ImageTextData coinData;
    private EditTextData editData;
    private boolean isFrom;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeInputData copy$default(TradeInputData tradeInputData, FromToBalance fromToBalance, ImageTextData imageTextData, EditTextData editTextData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fromToBalance = tradeInputData.balance;
        }
        if ((i & 2) != 0) {
            imageTextData = tradeInputData.coinData;
        }
        if ((i & 4) != 0) {
            editTextData = tradeInputData.editData;
        }
        if ((i & 8) != 0) {
            z = tradeInputData.isFrom;
        }
        return tradeInputData.copy(fromToBalance, imageTextData, editTextData, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromToBalance component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextData component2() {
        return this.coinData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTextData component3() {
        return this.editData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInputData copy(@NotNull FromToBalance fromToBalance, @NotNull ImageTextData imageTextData, @NotNull EditTextData editTextData, boolean z) {
        Intrinsics.checkNotNullParameter(fromToBalance, "");
        Intrinsics.checkNotNullParameter(imageTextData, "");
        Intrinsics.checkNotNullParameter(editTextData, "");
        return new TradeInputData(fromToBalance, imageTextData, editTextData, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeInputData)) {
            return false;
        }
        TradeInputData tradeInputData = (TradeInputData) obj;
        return Intrinsics.EZpvd(this.balance, tradeInputData.balance) && Intrinsics.EZpvd(this.coinData, tradeInputData.coinData) && Intrinsics.EZpvd(this.editData, tradeInputData.editData) && this.isFrom == tradeInputData.isFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromToBalance getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageTextData getCoinData() {
        return this.coinData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTextData getEditData() {
        return this.editData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.balance.hashCode() * 31) + this.coinData.hashCode()) * 31) + this.editData.hashCode()) * 31) + Boolean.hashCode(this.isFrom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFrom() {
        return this.isFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull FromToBalance fromToBalance) {
        Intrinsics.checkNotNullParameter(fromToBalance, "");
        this.balance = fromToBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinData(@NotNull ImageTextData imageTextData) {
        Intrinsics.checkNotNullParameter(imageTextData, "");
        this.coinData = imageTextData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditData(@NotNull EditTextData editTextData) {
        Intrinsics.checkNotNullParameter(editTextData, "");
        this.editData = editTextData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(boolean z) {
        this.isFrom = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeInputData(balance=" + this.balance + ", coinData=" + this.coinData + ", editData=" + this.editData + ", isFrom=" + this.isFrom + ")";
    }

    public TradeInputData(@NotNull FromToBalance fromToBalance, @NotNull ImageTextData imageTextData, @NotNull EditTextData editTextData, boolean z) {
        Intrinsics.checkNotNullParameter(fromToBalance, "");
        Intrinsics.checkNotNullParameter(imageTextData, "");
        Intrinsics.checkNotNullParameter(editTextData, "");
        this.balance = fromToBalance;
        this.coinData = imageTextData;
        this.editData = editTextData;
        this.isFrom = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance)
  (r2v0 com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData)
  (r3v0 com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance, com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData, com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData, boolean):void (m)] (LINE:97) call: com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData.<init>(com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance, com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData, com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData, boolean):void type: THIS */
    public /* synthetic */ TradeInputData(FromToBalance fromToBalance, ImageTextData imageTextData, EditTextData editTextData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fromToBalance, imageTextData, editTextData, (i & 8) != 0 ? true : z);
    }
}
