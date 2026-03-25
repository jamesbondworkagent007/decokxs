package com.okinc.web3Uilib.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RiskPageInfoBean {
    public static final int $stable = 8;
    private String firstPrimaryBtnContent;
    private String firstSecondaryBtnContent;
    private CharSequence firstSubTitle;
    private String firstTitle;
    private CharSequence fristSubTitleClickableText;
    private boolean isShowSinglePage;
    private final String reportTitle;
    private String secondPrimaryBtnContent;
    private String secondSecondaryBtnContent;
    private CharSequence secondSubTitle;
    private String secondTitle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.firstTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.reportTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isShowSinglePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.firstSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.fristSubTitleClickableText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.firstPrimaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.firstSecondaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.secondTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component7() {
        return this.secondSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.secondPrimaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.secondSecondaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskPageInfoBean copy(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull CharSequence charSequence3, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new RiskPageInfoBean(str, charSequence, charSequence2, str2, str3, str4, charSequence3, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskPageInfoBean)) {
            return false;
        }
        RiskPageInfoBean riskPageInfoBean = (RiskPageInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.firstTitle, (Object) riskPageInfoBean.firstTitle) && Intrinsics.EZpvd(this.firstSubTitle, riskPageInfoBean.firstSubTitle) && Intrinsics.EZpvd(this.fristSubTitleClickableText, riskPageInfoBean.fristSubTitleClickableText) && Intrinsics.EZpvd((Object) this.firstPrimaryBtnContent, (Object) riskPageInfoBean.firstPrimaryBtnContent) && Intrinsics.EZpvd((Object) this.firstSecondaryBtnContent, (Object) riskPageInfoBean.firstSecondaryBtnContent) && Intrinsics.EZpvd((Object) this.secondTitle, (Object) riskPageInfoBean.secondTitle) && Intrinsics.EZpvd(this.secondSubTitle, riskPageInfoBean.secondSubTitle) && Intrinsics.EZpvd((Object) this.secondPrimaryBtnContent, (Object) riskPageInfoBean.secondPrimaryBtnContent) && Intrinsics.EZpvd((Object) this.secondSecondaryBtnContent, (Object) riskPageInfoBean.secondSecondaryBtnContent) && Intrinsics.EZpvd((Object) this.reportTitle, (Object) riskPageInfoBean.reportTitle) && this.isShowSinglePage == riskPageInfoBean.isShowSinglePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstPrimaryBtnContent() {
        return this.firstPrimaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstSecondaryBtnContent() {
        return this.firstSecondaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getFirstSubTitle() {
        return this.firstSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstTitle() {
        return this.firstTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getFristSubTitleClickableText() {
        return this.fristSubTitleClickableText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportTitle() {
        return this.reportTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondPrimaryBtnContent() {
        return this.secondPrimaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondSecondaryBtnContent() {
        return this.secondSecondaryBtnContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSecondSubTitle() {
        return this.secondSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.firstTitle.hashCode() * 31) + this.firstSubTitle.hashCode()) * 31) + this.fristSubTitleClickableText.hashCode()) * 31) + this.firstPrimaryBtnContent.hashCode()) * 31) + this.firstSecondaryBtnContent.hashCode()) * 31) + this.secondTitle.hashCode()) * 31) + this.secondSubTitle.hashCode()) * 31) + this.secondPrimaryBtnContent.hashCode()) * 31) + this.secondSecondaryBtnContent.hashCode()) * 31) + this.reportTitle.hashCode()) * 31) + Boolean.hashCode(this.isShowSinglePage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSinglePage() {
        return this.isShowSinglePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstPrimaryBtnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.firstPrimaryBtnContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstSecondaryBtnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.firstSecondaryBtnContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstSubTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.firstSubTitle = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.firstTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFristSubTitleClickableText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.fristSubTitleClickableText = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondPrimaryBtnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondPrimaryBtnContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondSecondaryBtnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondSecondaryBtnContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondSubTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.secondSubTitle = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSinglePage(boolean z) {
        this.isShowSinglePage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.firstTitle;
        CharSequence charSequence = this.firstSubTitle;
        CharSequence charSequence2 = this.fristSubTitleClickableText;
        String str2 = this.firstPrimaryBtnContent;
        String str3 = this.firstSecondaryBtnContent;
        String str4 = this.secondTitle;
        CharSequence charSequence3 = this.secondSubTitle;
        return "RiskPageInfoBean(firstTitle=" + str + ", firstSubTitle=" + ((Object) charSequence) + ", fristSubTitleClickableText=" + ((Object) charSequence2) + ", firstPrimaryBtnContent=" + str2 + ", firstSecondaryBtnContent=" + str3 + ", secondTitle=" + str4 + ", secondSubTitle=" + ((Object) charSequence3) + ", secondPrimaryBtnContent=" + this.secondPrimaryBtnContent + ", secondSecondaryBtnContent=" + this.secondSecondaryBtnContent + ", reportTitle=" + this.reportTitle + ", isShowSinglePage=" + this.isShowSinglePage + ")";
    }

    public RiskPageInfoBean(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull CharSequence charSequence3, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.firstTitle = str;
        this.firstSubTitle = charSequence;
        this.fristSubTitleClickableText = charSequence2;
        this.firstPrimaryBtnContent = str2;
        this.firstSecondaryBtnContent = str3;
        this.secondTitle = str4;
        this.secondSubTitle = charSequence3;
        this.secondPrimaryBtnContent = str5;
        this.secondSecondaryBtnContent = str6;
        this.reportTitle = str7;
        this.isShowSinglePage = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.CharSequence)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.CharSequence))
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:6) call: com.okinc.web3Uilib.bean.RiskPageInfoBean.<init>(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RiskPageInfoBean(String str, CharSequence charSequence, CharSequence charSequence2, String str2, String str3, String str4, CharSequence charSequence3, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i & 4) != 0 ? "" : charSequence2, str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : charSequence3, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? false : z);
    }
}
