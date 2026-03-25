package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57518yjt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class TransactionInfoRowBean {
    public static final int $stable = 8;
    private Function1<? super C57518yjt, Unit> clickCallback;
    private CharSequence infoTag;
    private Function0<Unit> infoTagClickCallback;
    private Integer infoTagIcon;
    private Integer infoTagPaint;
    private boolean infoTagShowIcon;
    private Integer infoTagStyle;
    private CharSequence infoValue;
    private Integer infoValueColor;
    private Object rightIcon;
    private Drawable rightIconDefault;
    private boolean showArrow;
    private String title;
    private Function0<Unit> titleClickCallback;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionInfoRowBean() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, false, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component10() {
        return this.infoTagClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component11() {
        return this.rightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component12() {
        return this.rightIconDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.showArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.yjt, kotlin.Unit>, kotlin.jvm.functions.Function1<o.yjt, kotlin.Unit> */
    public final Function1<C57518yjt, Unit> component14() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component2() {
        return this.titleClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.infoValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.infoValueColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component5() {
        return this.infoTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.infoTagStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.infoTagIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.infoTagShowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.infoTagPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfoRowBean copy(@NotNull String str, Function0<Unit> function0, @NotNull CharSequence charSequence, Integer num, @NotNull CharSequence charSequence2, Integer num2, Integer num3, boolean z, Integer num4, Function0<Unit> function02, Object obj, Drawable drawable, boolean z2, Function1<? super C57518yjt, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return new TransactionInfoRowBean(str, function0, charSequence, num, charSequence2, num2, num3, z, num4, function02, obj, drawable, z2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionInfoRowBean)) {
            return false;
        }
        TransactionInfoRowBean transactionInfoRowBean = (TransactionInfoRowBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) transactionInfoRowBean.title) && Intrinsics.EZpvd(this.titleClickCallback, transactionInfoRowBean.titleClickCallback) && Intrinsics.EZpvd(this.infoValue, transactionInfoRowBean.infoValue) && Intrinsics.EZpvd(this.infoValueColor, transactionInfoRowBean.infoValueColor) && Intrinsics.EZpvd(this.infoTag, transactionInfoRowBean.infoTag) && Intrinsics.EZpvd(this.infoTagStyle, transactionInfoRowBean.infoTagStyle) && Intrinsics.EZpvd(this.infoTagIcon, transactionInfoRowBean.infoTagIcon) && this.infoTagShowIcon == transactionInfoRowBean.infoTagShowIcon && Intrinsics.EZpvd(this.infoTagPaint, transactionInfoRowBean.infoTagPaint) && Intrinsics.EZpvd(this.infoTagClickCallback, transactionInfoRowBean.infoTagClickCallback) && Intrinsics.EZpvd(this.rightIcon, transactionInfoRowBean.rightIcon) && Intrinsics.EZpvd(this.rightIconDefault, transactionInfoRowBean.rightIconDefault) && this.showArrow == transactionInfoRowBean.showArrow && Intrinsics.EZpvd(this.clickCallback, transactionInfoRowBean.clickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.yjt, kotlin.Unit>, kotlin.jvm.functions.Function1<o.yjt, kotlin.Unit> */
    public final Function1<C57518yjt, Unit> getClickCallback() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getInfoTag() {
        return this.infoTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getInfoTagClickCallback() {
        return this.infoTagClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInfoTagIcon() {
        return this.infoTagIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInfoTagPaint() {
        return this.infoTagPaint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInfoTagShowIcon() {
        return this.infoTagShowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInfoTagStyle() {
        return this.infoTagStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getInfoValue() {
        return this.infoValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInfoValueColor() {
        return this.infoValueColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getRightIcon() {
        return this.rightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getRightIconDefault() {
        return this.rightIconDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowArrow() {
        return this.showArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getTitleClickCallback() {
        return this.titleClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        Function0<Unit> function0 = this.titleClickCallback;
        int iHashCode2 = function0 == null ? 0 : function0.hashCode();
        int iHashCode3 = this.infoValue.hashCode();
        Integer num = this.infoValueColor;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.infoTag.hashCode();
        Integer num2 = this.infoTagStyle;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.infoTagIcon;
        int iHashCode7 = num3 == null ? 0 : num3.hashCode();
        int iHashCode8 = Boolean.hashCode(this.infoTagShowIcon);
        Integer num4 = this.infoTagPaint;
        int iHashCode9 = num4 == null ? 0 : num4.hashCode();
        Function0<Unit> function02 = this.infoTagClickCallback;
        int iHashCode10 = function02 == null ? 0 : function02.hashCode();
        Object obj = this.rightIcon;
        int iHashCode11 = obj == null ? 0 : obj.hashCode();
        Drawable drawable = this.rightIconDefault;
        int iHashCode12 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode13 = Boolean.hashCode(this.showArrow);
        Function1<? super C57518yjt, Unit> function1 = this.clickCallback;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function1<? super C57518yjt, Unit> function1) {
        this.clickCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTag(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.infoTag = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTagClickCallback(Function0<Unit> function0) {
        this.infoTagClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTagIcon(Integer num) {
        this.infoTagIcon = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTagPaint(Integer num) {
        this.infoTagPaint = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTagShowIcon(boolean z) {
        this.infoTagShowIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoTagStyle(Integer num) {
        this.infoTagStyle = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoValue(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.infoValue = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoValueColor(Integer num) {
        this.infoValueColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightIcon(Object obj) {
        this.rightIcon = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightIconDefault(Drawable drawable) {
        this.rightIconDefault = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowArrow(boolean z) {
        this.showArrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleClickCallback(Function0<Unit> function0) {
        this.titleClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.title;
        Function0<Unit> function0 = this.titleClickCallback;
        CharSequence charSequence = this.infoValue;
        Integer num = this.infoValueColor;
        CharSequence charSequence2 = this.infoTag;
        return "TransactionInfoRowBean(title=" + str + ", titleClickCallback=" + function0 + ", infoValue=" + ((Object) charSequence) + ", infoValueColor=" + num + ", infoTag=" + ((Object) charSequence2) + ", infoTagStyle=" + this.infoTagStyle + ", infoTagIcon=" + this.infoTagIcon + ", infoTagShowIcon=" + this.infoTagShowIcon + ", infoTagPaint=" + this.infoTagPaint + ", infoTagClickCallback=" + this.infoTagClickCallback + ", rightIcon=" + this.rightIcon + ", rightIconDefault=" + this.rightIconDefault + ", showArrow=" + this.showArrow + ", clickCallback=" + this.clickCallback + ")";
    }

    public TransactionInfoRowBean(@NotNull String str, Function0<Unit> function0, @NotNull CharSequence charSequence, Integer num, @NotNull CharSequence charSequence2, Integer num2, Integer num3, boolean z, Integer num4, Function0<Unit> function02, Object obj, Drawable drawable, boolean z2, Function1<? super C57518yjt, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.title = str;
        this.titleClickCallback = function0;
        this.infoValue = charSequence;
        this.infoValueColor = num;
        this.infoTag = charSequence2;
        this.infoTagStyle = num2;
        this.infoTagIcon = num3;
        this.infoTagShowIcon = z;
        this.infoTagPaint = num4;
        this.infoTagClickCallback = function02;
        this.rightIcon = obj;
        this.rightIconDefault = drawable;
        this.showArrow = z2;
        this.clickCallback = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r18v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0015: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.CharSequence))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r20v0 java.lang.Integer))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.CharSequence) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0034: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x004d: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r26v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0055: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r27v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x005d: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r28v0 android.graphics.drawable.Drawable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : false)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x006c: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 kotlin.jvm.functions.Function1) : (null kotlin.jvm.functions.Function1))
 A[MD:(java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.CharSequence, java.lang.Integer, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, boolean, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.Object, android.graphics.drawable.Drawable, boolean, kotlin.jvm.functions.Function1<? super o.yjt, kotlin.Unit>):void (m)] (LINE:312) call: com.okinc.web3Uilib.bean.TransactionInfoRowBean.<init>(java.lang.String, kotlin.jvm.functions.Function0, java.lang.CharSequence, java.lang.Integer, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, boolean, java.lang.Integer, kotlin.jvm.functions.Function0, java.lang.Object, android.graphics.drawable.Drawable, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ TransactionInfoRowBean(String str, Function0 function0, CharSequence charSequence, Integer num, CharSequence charSequence2, Integer num2, Integer num3, boolean z, Integer num4, Function0 function02, Object obj, Drawable drawable, boolean z2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? "" : charSequence, (i & 8) != 0 ? null : num, (i & 16) == 0 ? charSequence2 : "", (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : function02, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : drawable, (i & 4096) == 0 ? z2 : false, (i & 8192) == 0 ? function1 : null);
    }
}
