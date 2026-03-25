package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TransactionNetworkFeeBean {
    public static final int $stable = 8;
    private CharSequence freeContentInfo;
    private String freeTagContentInfo;
    private boolean hasError;
    private Drawable headerImgDefaultRes;
    private Object headerImgRes;
    private String headerTitle;
    private Function0<Unit> headerTitleUnderLineClick;
    private CharSequence leftContentInfo;
    private String primaryTip;
    private CharSequence rightContentInfo;
    private Function0<Unit> rootClickCallback;
    private Drawable secondTipIcon;
    private CharSequence secondaryTip;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionNetworkFeeBean() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component1() {
        return this.headerImgRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component10() {
        return this.rootClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component12() {
        return this.freeContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.freeTagContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component2() {
        return this.headerImgDefaultRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component4() {
        return this.leftContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component5() {
        return this.rightContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.primaryTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component7() {
        return this.secondTipIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component8() {
        return this.secondaryTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component9() {
        return this.headerTitleUnderLineClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionNetworkFeeBean copy(Object obj, Drawable drawable, @NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str2, Drawable drawable2, @NotNull CharSequence charSequence3, Function0<Unit> function0, Function0<Unit> function02, boolean z, @NotNull CharSequence charSequence4, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TransactionNetworkFeeBean(obj, drawable, str, charSequence, charSequence2, str2, drawable2, charSequence3, function0, function02, z, charSequence4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionNetworkFeeBean)) {
            return false;
        }
        TransactionNetworkFeeBean transactionNetworkFeeBean = (TransactionNetworkFeeBean) obj;
        return Intrinsics.EZpvd(this.headerImgRes, transactionNetworkFeeBean.headerImgRes) && Intrinsics.EZpvd(this.headerImgDefaultRes, transactionNetworkFeeBean.headerImgDefaultRes) && Intrinsics.EZpvd((Object) this.headerTitle, (Object) transactionNetworkFeeBean.headerTitle) && Intrinsics.EZpvd(this.leftContentInfo, transactionNetworkFeeBean.leftContentInfo) && Intrinsics.EZpvd(this.rightContentInfo, transactionNetworkFeeBean.rightContentInfo) && Intrinsics.EZpvd((Object) this.primaryTip, (Object) transactionNetworkFeeBean.primaryTip) && Intrinsics.EZpvd(this.secondTipIcon, transactionNetworkFeeBean.secondTipIcon) && Intrinsics.EZpvd(this.secondaryTip, transactionNetworkFeeBean.secondaryTip) && Intrinsics.EZpvd(this.headerTitleUnderLineClick, transactionNetworkFeeBean.headerTitleUnderLineClick) && Intrinsics.EZpvd(this.rootClickCallback, transactionNetworkFeeBean.rootClickCallback) && this.hasError == transactionNetworkFeeBean.hasError && Intrinsics.EZpvd(this.freeContentInfo, transactionNetworkFeeBean.freeContentInfo) && Intrinsics.EZpvd((Object) this.freeTagContentInfo, (Object) transactionNetworkFeeBean.freeTagContentInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getFreeContentInfo() {
        return this.freeContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeTagContentInfo() {
        return this.freeTagContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getHeaderImgDefaultRes() {
        return this.headerImgDefaultRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getHeaderImgRes() {
        return this.headerImgRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getHeaderTitleUnderLineClick() {
        return this.headerTitleUnderLineClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getLeftContentInfo() {
        return this.leftContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryTip() {
        return this.primaryTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getRightContentInfo() {
        return this.rightContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getRootClickCallback() {
        return this.rootClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getSecondTipIcon() {
        return this.secondTipIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSecondaryTip() {
        return this.secondaryTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Object obj = this.headerImgRes;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Drawable drawable = this.headerImgDefaultRes;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode3 = this.headerTitle.hashCode();
        int iHashCode4 = this.leftContentInfo.hashCode();
        int iHashCode5 = this.rightContentInfo.hashCode();
        int iHashCode6 = this.primaryTip.hashCode();
        Drawable drawable2 = this.secondTipIcon;
        int iHashCode7 = drawable2 == null ? 0 : drawable2.hashCode();
        int iHashCode8 = this.secondaryTip.hashCode();
        Function0<Unit> function0 = this.headerTitleUnderLineClick;
        int iHashCode9 = function0 == null ? 0 : function0.hashCode();
        Function0<Unit> function02 = this.rootClickCallback;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (function02 != null ? function02.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasError)) * 31) + this.freeContentInfo.hashCode()) * 31) + this.freeTagContentInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFreeContentInfo(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.freeContentInfo = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFreeTagContentInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.freeTagContentInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderImgDefaultRes(Drawable drawable) {
        this.headerImgDefaultRes = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderImgRes(Object obj) {
        this.headerImgRes = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.headerTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderTitleUnderLineClick(Function0<Unit> function0) {
        this.headerTitleUnderLineClick = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftContentInfo(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.leftContentInfo = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryTip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.primaryTip = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightContentInfo(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.rightContentInfo = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRootClickCallback(Function0<Unit> function0) {
        this.rootClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondTipIcon(Drawable drawable) {
        this.secondTipIcon = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryTip(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.secondaryTip = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        Object obj = this.headerImgRes;
        Drawable drawable = this.headerImgDefaultRes;
        String str = this.headerTitle;
        CharSequence charSequence = this.leftContentInfo;
        CharSequence charSequence2 = this.rightContentInfo;
        String str2 = this.primaryTip;
        Drawable drawable2 = this.secondTipIcon;
        CharSequence charSequence3 = this.secondaryTip;
        Function0<Unit> function0 = this.headerTitleUnderLineClick;
        Function0<Unit> function02 = this.rootClickCallback;
        boolean z = this.hasError;
        CharSequence charSequence4 = this.freeContentInfo;
        return "TransactionNetworkFeeBean(headerImgRes=" + obj + ", headerImgDefaultRes=" + drawable + ", headerTitle=" + str + ", leftContentInfo=" + ((Object) charSequence) + ", rightContentInfo=" + ((Object) charSequence2) + ", primaryTip=" + str2 + ", secondTipIcon=" + drawable2 + ", secondaryTip=" + ((Object) charSequence3) + ", headerTitleUnderLineClick=" + function0 + ", rootClickCallback=" + function02 + ", hasError=" + z + ", freeContentInfo=" + ((Object) charSequence4) + ", freeTagContentInfo=" + this.freeTagContentInfo + ")";
    }

    public TransactionNetworkFeeBean(Object obj, Drawable drawable, @NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str2, Drawable drawable2, @NotNull CharSequence charSequence3, Function0<Unit> function0, Function0<Unit> function02, boolean z, @NotNull CharSequence charSequence4, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.headerImgRes = obj;
        this.headerImgDefaultRes = drawable;
        this.headerTitle = str;
        this.leftContentInfo = charSequence;
        this.rightContentInfo = charSequence2;
        this.primaryTip = str2;
        this.secondTipIcon = drawable2;
        this.secondaryTip = charSequence3;
        this.headerTitleUnderLineClick = function0;
        this.rootClickCallback = function02;
        this.hasError = z;
        this.freeContentInfo = charSequence4;
        this.freeTagContentInfo = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r15v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r16v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r21v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.CharSequence))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r23v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, android.graphics.drawable.Drawable, java.lang.CharSequence, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, java.lang.CharSequence, java.lang.String):void (m)] (LINE:220) call: com.okinc.web3Uilib.bean.TransactionNetworkFeeBean.<init>(java.lang.Object, android.graphics.drawable.Drawable, java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, android.graphics.drawable.Drawable, java.lang.CharSequence, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.CharSequence, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionNetworkFeeBean(Object obj, Drawable drawable, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Drawable drawable2, CharSequence charSequence3, Function0 function0, Function0 function02, boolean z, CharSequence charSequence4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : charSequence, (i & 16) != 0 ? "" : charSequence2, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? null : drawable2, (i & 128) != 0 ? "" : charSequence3, (i & 256) != 0 ? null : function0, (i & 512) == 0 ? function02 : null, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? "" : charSequence4, (i & 4096) == 0 ? str3 : "");
    }
}
