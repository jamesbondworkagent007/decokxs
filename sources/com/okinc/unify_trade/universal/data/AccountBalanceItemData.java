package com.okinc.unify_trade.universal.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountBalanceItemData {
    public static final int $stable = 8;
    private boolean isShowUnderLine;
    private final String limitTip;
    private int marginTop;
    private final String text;
    private String tipType;
    private final String title;
    private final int titleColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountBalanceItemData copy$default(AccountBalanceItemData accountBalanceItemData, String str, String str2, boolean z, String str3, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = accountBalanceItemData.title;
        }
        if ((i3 & 2) != 0) {
            str2 = accountBalanceItemData.text;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            z = accountBalanceItemData.isShowUnderLine;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            str3 = accountBalanceItemData.tipType;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i = accountBalanceItemData.marginTop;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = accountBalanceItemData.titleColor;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            str4 = accountBalanceItemData.limitTip;
        }
        return accountBalanceItemData.copy(str, str5, z2, str6, i4, i5, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.limitTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalanceItemData copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, int i2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AccountBalanceItemData(str, str2, z, str3, i, i2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalanceItemData)) {
            return false;
        }
        AccountBalanceItemData accountBalanceItemData = (AccountBalanceItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) accountBalanceItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) accountBalanceItemData.text) && this.isShowUnderLine == accountBalanceItemData.isShowUnderLine && Intrinsics.EZpvd((Object) this.tipType, (Object) accountBalanceItemData.tipType) && this.marginTop == accountBalanceItemData.marginTop && this.titleColor == accountBalanceItemData.titleColor && Intrinsics.EZpvd((Object) this.limitTip, (Object) accountBalanceItemData.limitTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitTip() {
        return this.limitTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginTop() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipType() {
        return this.tipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleColor() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.isShowUnderLine)) * 31) + this.tipType.hashCode()) * 31) + Integer.hashCode(this.marginTop)) * 31) + Integer.hashCode(this.titleColor)) * 31) + this.limitTip.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowUnderLine() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnderLine(boolean z) {
        this.isShowUnderLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tipType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBalanceItemData(title=" + this.title + ", text=" + this.text + ", isShowUnderLine=" + this.isShowUnderLine + ", tipType=" + this.tipType + ", marginTop=" + this.marginTop + ", titleColor=" + this.titleColor + ", limitTip=" + this.limitTip + ")";
    }

    public AccountBalanceItemData(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, int i2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.text = str2;
        this.isShowUnderLine = z;
        this.tipType = str3;
        this.marginTop = i;
        this.titleColor = i2;
        this.limitTip = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String):void (m)] (LINE:10) call: com.okinc.unify_trade.universal.data.AccountBalanceItemData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ AccountBalanceItemData(String str, String str2, boolean z, String str3, int i, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str4);
    }
}
