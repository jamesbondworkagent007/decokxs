package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TransactionTopHeaderInfoBean {
    public static final int $stable = 8;
    private Drawable mainDefaultIcon;
    private Object mainIcon;
    private String subChildTitle;
    private String subTitle;
    private CharSequence title;
    private Object titleIcon;
    private Function0<Unit> titleIconCallback;
    private String titleSecondaryLine;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionTopHeaderInfoBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component1() {
        return this.mainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component2() {
        return this.mainDefaultIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.titleIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component5() {
        return this.titleIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.subChildTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.titleSecondaryLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionTopHeaderInfoBean copy(Object obj, Drawable drawable, @NotNull CharSequence charSequence, Object obj2, Function0<Unit> function0, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TransactionTopHeaderInfoBean(obj, drawable, charSequence, obj2, function0, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionTopHeaderInfoBean)) {
            return false;
        }
        TransactionTopHeaderInfoBean transactionTopHeaderInfoBean = (TransactionTopHeaderInfoBean) obj;
        return Intrinsics.EZpvd(this.mainIcon, transactionTopHeaderInfoBean.mainIcon) && Intrinsics.EZpvd(this.mainDefaultIcon, transactionTopHeaderInfoBean.mainDefaultIcon) && Intrinsics.EZpvd(this.title, transactionTopHeaderInfoBean.title) && Intrinsics.EZpvd(this.titleIcon, transactionTopHeaderInfoBean.titleIcon) && Intrinsics.EZpvd(this.titleIconCallback, transactionTopHeaderInfoBean.titleIconCallback) && Intrinsics.EZpvd((Object) this.subTitle, (Object) transactionTopHeaderInfoBean.subTitle) && Intrinsics.EZpvd((Object) this.subChildTitle, (Object) transactionTopHeaderInfoBean.subChildTitle) && Intrinsics.EZpvd((Object) this.titleSecondaryLine, (Object) transactionTopHeaderInfoBean.titleSecondaryLine);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getMainDefaultIcon() {
        return this.mainDefaultIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getMainIcon() {
        return this.mainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubChildTitle() {
        return this.subChildTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getTitleIconCallback() {
        return this.titleIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleSecondaryLine() {
        return this.titleSecondaryLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Object obj = this.mainIcon;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Drawable drawable = this.mainDefaultIcon;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode3 = this.title.hashCode();
        Object obj2 = this.titleIcon;
        int iHashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Function0<Unit> function0 = this.titleIconCallback;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0)) * 31) + this.subTitle.hashCode()) * 31) + this.subChildTitle.hashCode()) * 31) + this.titleSecondaryLine.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainDefaultIcon(Drawable drawable) {
        this.mainDefaultIcon = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainIcon(Object obj) {
        this.mainIcon = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubChildTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subChildTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.title = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleIcon(Object obj) {
        this.titleIcon = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleIconCallback(Function0<Unit> function0) {
        this.titleIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleSecondaryLine(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleSecondaryLine = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        Object obj = this.mainIcon;
        Drawable drawable = this.mainDefaultIcon;
        CharSequence charSequence = this.title;
        return "TransactionTopHeaderInfoBean(mainIcon=" + obj + ", mainDefaultIcon=" + drawable + ", title=" + ((Object) charSequence) + ", titleIcon=" + this.titleIcon + ", titleIconCallback=" + this.titleIconCallback + ", subTitle=" + this.subTitle + ", subChildTitle=" + this.subChildTitle + ", titleSecondaryLine=" + this.titleSecondaryLine + ")";
    }

    public TransactionTopHeaderInfoBean(Object obj, Drawable drawable, @NotNull CharSequence charSequence, Object obj2, Function0<Unit> function0, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.mainIcon = obj;
        this.mainDefaultIcon = drawable;
        this.title = charSequence;
        this.titleIcon = obj2;
        this.titleIconCallback = function0;
        this.subTitle = str;
        this.subChildTitle = str2;
        this.titleSecondaryLine = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r10v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.CharSequence))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r13v0 java.lang.Object))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean.<init>(java.lang.Object, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionTopHeaderInfoBean(Object obj, Drawable drawable, CharSequence charSequence, Object obj2, Function0 function0, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : charSequence, (i & 8) != 0 ? null : obj2, (i & 16) == 0 ? function0 : null, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) == 0 ? str3 : "");
    }
}
