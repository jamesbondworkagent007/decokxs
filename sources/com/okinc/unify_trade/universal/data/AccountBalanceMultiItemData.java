package com.okinc.unify_trade.universal.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountBalanceMultiItemData {
    public static final int $stable = 8;
    private boolean isShowInformationIcon;
    private boolean isShowMoreArrow;
    private boolean isShowUnderLine;
    private final String subText;
    private final String subTitle;
    private final int subTitleColor;
    private String subTitleTipType;
    private String text;
    private int textColor;
    private final String title;
    private String titleTipType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isShowInformationIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isShowMoreArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.subTitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.titleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subTitleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalanceMultiItemData copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, int i2, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AccountBalanceMultiItemData(str, str2, i, str3, str4, z, str5, str6, i2, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalanceMultiItemData)) {
            return false;
        }
        AccountBalanceMultiItemData accountBalanceMultiItemData = (AccountBalanceMultiItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) accountBalanceMultiItemData.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) accountBalanceMultiItemData.subTitle) && this.subTitleColor == accountBalanceMultiItemData.subTitleColor && Intrinsics.EZpvd((Object) this.text, (Object) accountBalanceMultiItemData.text) && Intrinsics.EZpvd((Object) this.subText, (Object) accountBalanceMultiItemData.subText) && this.isShowUnderLine == accountBalanceMultiItemData.isShowUnderLine && Intrinsics.EZpvd((Object) this.titleTipType, (Object) accountBalanceMultiItemData.titleTipType) && Intrinsics.EZpvd((Object) this.subTitleTipType, (Object) accountBalanceMultiItemData.subTitleTipType) && this.textColor == accountBalanceMultiItemData.textColor && this.isShowInformationIcon == accountBalanceMultiItemData.isShowInformationIcon && this.isShowMoreArrow == accountBalanceMultiItemData.isShowMoreArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubTitleColor() {
        return this.subTitleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitleTipType() {
        return this.subTitleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleTipType() {
        return this.titleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + Integer.hashCode(this.subTitleColor)) * 31) + this.text.hashCode()) * 31) + this.subText.hashCode()) * 31) + Boolean.hashCode(this.isShowUnderLine)) * 31) + this.titleTipType.hashCode()) * 31) + this.subTitleTipType.hashCode()) * 31) + Integer.hashCode(this.textColor)) * 31) + Boolean.hashCode(this.isShowInformationIcon)) * 31) + Boolean.hashCode(this.isShowMoreArrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowInformationIcon() {
        return this.isShowInformationIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowMoreArrow() {
        return this.isShowMoreArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowUnderLine() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowInformationIcon(boolean z) {
        this.isShowInformationIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowMoreArrow(boolean z) {
        this.isShowMoreArrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnderLine(boolean z) {
        this.isShowUnderLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTitleTipType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTitleTipType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextColor(int i) {
        this.textColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleTipType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleTipType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBalanceMultiItemData(title=" + this.title + ", subTitle=" + this.subTitle + ", subTitleColor=" + this.subTitleColor + ", text=" + this.text + ", subText=" + this.subText + ", isShowUnderLine=" + this.isShowUnderLine + ", titleTipType=" + this.titleTipType + ", subTitleTipType=" + this.subTitleTipType + ", textColor=" + this.textColor + ", isShowInformationIcon=" + this.isShowInformationIcon + ", isShowMoreArrow=" + this.isShowMoreArrow + ")";
    }

    public AccountBalanceMultiItemData(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, int i2, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.title = str;
        this.subTitle = str2;
        this.subTitleColor = i;
        this.text = str3;
        this.subText = str4;
        this.isShowUnderLine = z;
        this.titleTipType = str5;
        this.subTitleTipType = str6;
        this.textColor = i2;
        this.isShowInformationIcon = z2;
        this.isShowMoreArrow = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, boolean):void (m)] (LINE:21) call: com.okinc.unify_trade.universal.data.AccountBalanceMultiItemData.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, boolean):void type: THIS */
    public /* synthetic */ AccountBalanceMultiItemData(String str, String str2, int i, String str3, String str4, boolean z, String str5, String str6, int i2, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? "" : str5, (i3 & 128) == 0 ? str6 : "", (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? false : z2, (i3 & 1024) == 0 ? z3 : false);
    }
}
