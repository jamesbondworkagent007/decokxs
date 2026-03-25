package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class TransactionGeneralInfoBean {
    public static final int $stable = 8;
    private Function0<Unit> actionIconCallback;
    private Drawable actionIconRes;
    private float actionIconSize;
    private Function0<Unit> arrowCallback;
    private Drawable contentIconDefaultRes;
    private Object contentIconRes;
    private Function0<Unit> endActionIconCallback;
    private Drawable endActionIconRes;
    private float endActionIconSize;
    private Function0<Unit> generalContentCallback;
    private CharSequence generalContentInfo;
    private Function0<Unit> headerIconCallback;
    private Drawable headerIconRes;
    private String headerTitle;
    private Function0<Unit> headerTitleUnderLineClick;
    private boolean isShowArrowIcon;
    private boolean showHeaderTitleUnderLine;
    private String tagInfo;
    private TagUIStyle tagUIStyle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionGeneralInfoBean() {
        this(null, false, null, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component10() {
        return this.endActionIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component11() {
        return this.endActionIconSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isShowArrowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component13() {
        return this.arrowCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component14() {
        return this.headerTitleUnderLineClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component15() {
        return this.headerIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component16() {
        return this.actionIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component17() {
        return this.endActionIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagUIStyle component18() {
        return this.tagUIStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component19() {
        return this.generalContentCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showHeaderTitleUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.generalContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component5() {
        return this.headerIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.contentIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component7() {
        return this.contentIconDefaultRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component8() {
        return this.actionIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component9() {
        return this.actionIconSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionGeneralInfoBean copy(@NotNull String str, boolean z, @NotNull CharSequence charSequence, @NotNull String str2, Drawable drawable, Object obj, Drawable drawable2, Drawable drawable3, float f, Drawable drawable4, float f2, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, TagUIStyle tagUIStyle, Function0<Unit> function06) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionGeneralInfoBean(str, z, charSequence, str2, drawable, obj, drawable2, drawable3, f, drawable4, f2, z2, function0, function02, function03, function04, function05, tagUIStyle, function06);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionGeneralInfoBean)) {
            return false;
        }
        TransactionGeneralInfoBean transactionGeneralInfoBean = (TransactionGeneralInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.headerTitle, (Object) transactionGeneralInfoBean.headerTitle) && this.showHeaderTitleUnderLine == transactionGeneralInfoBean.showHeaderTitleUnderLine && Intrinsics.EZpvd(this.generalContentInfo, transactionGeneralInfoBean.generalContentInfo) && Intrinsics.EZpvd((Object) this.tagInfo, (Object) transactionGeneralInfoBean.tagInfo) && Intrinsics.EZpvd(this.headerIconRes, transactionGeneralInfoBean.headerIconRes) && Intrinsics.EZpvd(this.contentIconRes, transactionGeneralInfoBean.contentIconRes) && Intrinsics.EZpvd(this.contentIconDefaultRes, transactionGeneralInfoBean.contentIconDefaultRes) && Intrinsics.EZpvd(this.actionIconRes, transactionGeneralInfoBean.actionIconRes) && Float.compare(this.actionIconSize, transactionGeneralInfoBean.actionIconSize) == 0 && Intrinsics.EZpvd(this.endActionIconRes, transactionGeneralInfoBean.endActionIconRes) && Float.compare(this.endActionIconSize, transactionGeneralInfoBean.endActionIconSize) == 0 && this.isShowArrowIcon == transactionGeneralInfoBean.isShowArrowIcon && Intrinsics.EZpvd(this.arrowCallback, transactionGeneralInfoBean.arrowCallback) && Intrinsics.EZpvd(this.headerTitleUnderLineClick, transactionGeneralInfoBean.headerTitleUnderLineClick) && Intrinsics.EZpvd(this.headerIconCallback, transactionGeneralInfoBean.headerIconCallback) && Intrinsics.EZpvd(this.actionIconCallback, transactionGeneralInfoBean.actionIconCallback) && Intrinsics.EZpvd(this.endActionIconCallback, transactionGeneralInfoBean.endActionIconCallback) && Intrinsics.EZpvd(this.tagUIStyle, transactionGeneralInfoBean.tagUIStyle) && Intrinsics.EZpvd(this.generalContentCallback, transactionGeneralInfoBean.generalContentCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getActionIconCallback() {
        return this.actionIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getActionIconRes() {
        return this.actionIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getActionIconSize() {
        return this.actionIconSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getArrowCallback() {
        return this.arrowCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getContentIconDefaultRes() {
        return this.contentIconDefaultRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getContentIconRes() {
        return this.contentIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getEndActionIconCallback() {
        return this.endActionIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getEndActionIconRes() {
        return this.endActionIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getEndActionIconSize() {
        return this.endActionIconSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getGeneralContentCallback() {
        return this.generalContentCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getGeneralContentInfo() {
        return this.generalContentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getHeaderIconCallback() {
        return this.headerIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getHeaderIconRes() {
        return this.headerIconRes;
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
    public final boolean getShowHeaderTitleUnderLine() {
        return this.showHeaderTitleUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagInfo() {
        return this.tagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagUIStyle getTagUIStyle() {
        return this.tagUIStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.headerTitle.hashCode();
        int iHashCode2 = Boolean.hashCode(this.showHeaderTitleUnderLine);
        int iHashCode3 = this.generalContentInfo.hashCode();
        int iHashCode4 = this.tagInfo.hashCode();
        Drawable drawable = this.headerIconRes;
        int iHashCode5 = drawable == null ? 0 : drawable.hashCode();
        Object obj = this.contentIconRes;
        int iHashCode6 = obj == null ? 0 : obj.hashCode();
        Drawable drawable2 = this.contentIconDefaultRes;
        int iHashCode7 = drawable2 == null ? 0 : drawable2.hashCode();
        Drawable drawable3 = this.actionIconRes;
        int iHashCode8 = drawable3 == null ? 0 : drawable3.hashCode();
        int iHashCode9 = Float.hashCode(this.actionIconSize);
        Drawable drawable4 = this.endActionIconRes;
        int iHashCode10 = drawable4 == null ? 0 : drawable4.hashCode();
        int iHashCode11 = Float.hashCode(this.endActionIconSize);
        int iHashCode12 = Boolean.hashCode(this.isShowArrowIcon);
        Function0<Unit> function0 = this.arrowCallback;
        int iHashCode13 = function0 == null ? 0 : function0.hashCode();
        Function0<Unit> function02 = this.headerTitleUnderLineClick;
        int iHashCode14 = function02 == null ? 0 : function02.hashCode();
        Function0<Unit> function03 = this.headerIconCallback;
        int iHashCode15 = function03 == null ? 0 : function03.hashCode();
        Function0<Unit> function04 = this.actionIconCallback;
        int iHashCode16 = function04 == null ? 0 : function04.hashCode();
        Function0<Unit> function05 = this.endActionIconCallback;
        int iHashCode17 = function05 == null ? 0 : function05.hashCode();
        TagUIStyle tagUIStyle = this.tagUIStyle;
        int iHashCode18 = tagUIStyle == null ? 0 : tagUIStyle.hashCode();
        Function0<Unit> function06 = this.generalContentCallback;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (function06 == null ? 0 : function06.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowArrowIcon() {
        return this.isShowArrowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionIconCallback(Function0<Unit> function0) {
        this.actionIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionIconRes(Drawable drawable) {
        this.actionIconRes = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionIconSize(float f) {
        this.actionIconSize = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArrowCallback(Function0<Unit> function0) {
        this.arrowCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentIconDefaultRes(Drawable drawable) {
        this.contentIconDefaultRes = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentIconRes(Object obj) {
        this.contentIconRes = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndActionIconCallback(Function0<Unit> function0) {
        this.endActionIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndActionIconRes(Drawable drawable) {
        this.endActionIconRes = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndActionIconSize(float f) {
        this.endActionIconSize = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralContentCallback(Function0<Unit> function0) {
        this.generalContentCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralContentInfo(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.generalContentInfo = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderIconCallback(Function0<Unit> function0) {
        this.headerIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderIconRes(Drawable drawable) {
        this.headerIconRes = drawable;
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
    public final void setShowArrowIcon(boolean z) {
        this.isShowArrowIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowHeaderTitleUnderLine(boolean z) {
        this.showHeaderTitleUnderLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tagInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagUIStyle(TagUIStyle tagUIStyle) {
        this.tagUIStyle = tagUIStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.headerTitle;
        boolean z = this.showHeaderTitleUnderLine;
        CharSequence charSequence = this.generalContentInfo;
        return "TransactionGeneralInfoBean(headerTitle=" + str + ", showHeaderTitleUnderLine=" + z + ", generalContentInfo=" + ((Object) charSequence) + ", tagInfo=" + this.tagInfo + ", headerIconRes=" + this.headerIconRes + ", contentIconRes=" + this.contentIconRes + ", contentIconDefaultRes=" + this.contentIconDefaultRes + ", actionIconRes=" + this.actionIconRes + ", actionIconSize=" + this.actionIconSize + ", endActionIconRes=" + this.endActionIconRes + ", endActionIconSize=" + this.endActionIconSize + ", isShowArrowIcon=" + this.isShowArrowIcon + ", arrowCallback=" + this.arrowCallback + ", headerTitleUnderLineClick=" + this.headerTitleUnderLineClick + ", headerIconCallback=" + this.headerIconCallback + ", actionIconCallback=" + this.actionIconCallback + ", endActionIconCallback=" + this.endActionIconCallback + ", tagUIStyle=" + this.tagUIStyle + ", generalContentCallback=" + this.generalContentCallback + ")";
    }

    public TransactionGeneralInfoBean(@NotNull String str, boolean z, @NotNull CharSequence charSequence, @NotNull String str2, Drawable drawable, Object obj, Drawable drawable2, Drawable drawable3, float f, Drawable drawable4, float f2, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, TagUIStyle tagUIStyle, Function0<Unit> function06) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.headerTitle = str;
        this.showHeaderTitleUnderLine = z;
        this.generalContentInfo = charSequence;
        this.tagInfo = str2;
        this.headerIconRes = drawable;
        this.contentIconRes = obj;
        this.contentIconDefaultRes = drawable2;
        this.actionIconRes = drawable3;
        this.actionIconSize = f;
        this.endActionIconRes = drawable4;
        this.endActionIconSize = f2;
        this.isShowArrowIcon = z2;
        this.arrowCallback = function0;
        this.headerTitleUnderLineClick = function02;
        this.headerIconCallback = function03;
        this.actionIconCallback = function04;
        this.endActionIconCallback = function05;
        this.tagUIStyle = tagUIStyle;
        this.generalContentCallback = function06;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0015: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r40v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0024: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r25v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002c: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r26v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0034: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r27v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x003c: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r28v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0044: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r29v0 float))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r30v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r31v0 float) : (0.0f float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r32v0 boolean) : false)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0063: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r33v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x006b: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r34v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0073: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r35v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x007e: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r36v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0089: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r37v0 kotlin.jvm.functions.Function0))
  (wrap:com.okinc.web3Uilib.bean.TransactionGeneralInfoBean$TagUIStyle:?: TERNARY null = ((wrap:int:0x0094: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.web3Uilib.bean.TransactionGeneralInfoBean$TagUIStyle) : (r38v0 com.okinc.web3Uilib.bean.TransactionGeneralInfoBean$TagUIStyle))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x009f: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r39v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, boolean, java.lang.CharSequence, java.lang.String, android.graphics.drawable.Drawable, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, android.graphics.drawable.Drawable, float, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.okinc.web3Uilib.bean.TransactionGeneralInfoBean$TagUIStyle, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:170) call: com.okinc.web3Uilib.bean.TransactionGeneralInfoBean.<init>(java.lang.String, boolean, java.lang.CharSequence, java.lang.String, android.graphics.drawable.Drawable, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, android.graphics.drawable.Drawable, float, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.okinc.web3Uilib.bean.TransactionGeneralInfoBean$TagUIStyle, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionGeneralInfoBean(String str, boolean z, CharSequence charSequence, String str2, Drawable drawable, Object obj, Drawable drawable2, Drawable drawable3, float f, Drawable drawable4, float f2, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, TagUIStyle tagUIStyle, Function0 function06, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : charSequence, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : drawable, (i & 32) != 0 ? null : obj, (i & 64) != 0 ? null : drawable2, (i & 128) != 0 ? null : drawable3, (i & 256) != 0 ? 0.0f : f, (i & 512) != 0 ? null : drawable4, (i & 1024) == 0 ? f2 : 0.0f, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? null : function0, (i & 8192) != 0 ? null : function02, (i & 16384) != 0 ? null : function03, (i & 32768) != 0 ? null : function04, (i & 65536) != 0 ? null : function05, (i & 131072) != 0 ? null : tagUIStyle, (i & 262144) != 0 ? null : function06);
    }

    @Serializable
    public static final class TagUIStyle {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final boolean showIcon;
        private final Integer tagPaint;
        private final Integer tagSize;
        private final Integer tagStyle;
        private final Integer tagType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TagUIStyle() {
            this((Integer) null, (Integer) null, (Integer) null, (Integer) null, false, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TagUIStyle copy$default(TagUIStyle tagUIStyle, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                num = tagUIStyle.tagStyle;
            }
            if ((i & 2) != 0) {
                num2 = tagUIStyle.tagSize;
            }
            Integer num5 = num2;
            if ((i & 4) != 0) {
                num3 = tagUIStyle.tagType;
            }
            Integer num6 = num3;
            if ((i & 8) != 0) {
                num4 = tagUIStyle.tagPaint;
            }
            Integer num7 = num4;
            if ((i & 16) != 0) {
                z = tagUIStyle.showIcon;
            }
            return tagUIStyle.copy(num, num5, num6, num7, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.tagSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.tagType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.tagPaint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component5() {
            return this.showIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TagUIStyle copy(Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
            return new TagUIStyle(num, num2, num3, num4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagUIStyle)) {
                return false;
            }
            TagUIStyle tagUIStyle = (TagUIStyle) obj;
            return Intrinsics.EZpvd(this.tagStyle, tagUIStyle.tagStyle) && Intrinsics.EZpvd(this.tagSize, tagUIStyle.tagSize) && Intrinsics.EZpvd(this.tagType, tagUIStyle.tagType) && Intrinsics.EZpvd(this.tagPaint, tagUIStyle.tagPaint) && this.showIcon == tagUIStyle.showIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowIcon() {
            return this.showIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagPaint() {
            return this.tagPaint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagSize() {
            return this.tagSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagStyle() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagType() {
            return this.tagType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.tagStyle;
            int iHashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.tagSize;
            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.tagType;
            int iHashCode3 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.tagPaint;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0)) * 31) + Boolean.hashCode(this.showIcon);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TagUIStyle(tagStyle=" + this.tagStyle + ", tagSize=" + this.tagSize + ", tagType=" + this.tagType + ", tagPaint=" + this.tagPaint + ", showIcon=" + this.showIcon + ")";
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionGeneralInfoBean.TagUIStyle.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TagUIStyle> serializer() {
                return TransactionGeneralInfoBean$TagUIStyle$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TagUIStyle(int i, Integer num, Integer num2, Integer num3, Integer num4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tagStyle = null;
            } else {
                this.tagStyle = num;
            }
            if ((i & 2) == 0) {
                this.tagSize = null;
            } else {
                this.tagSize = num2;
            }
            if ((i & 4) == 0) {
                this.tagType = null;
            } else {
                this.tagType = num3;
            }
            if ((i & 8) == 0) {
                this.tagPaint = null;
            } else {
                this.tagPaint = num4;
            }
            if ((i & 16) == 0) {
                this.showIcon = false;
            } else {
                this.showIcon = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TagUIStyle tagUIStyle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tagUIStyle.tagStyle != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, tagUIStyle.tagStyle);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tagUIStyle.tagSize != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, tagUIStyle.tagSize);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tagUIStyle.tagType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, tagUIStyle.tagType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tagUIStyle.tagPaint != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, tagUIStyle.tagPaint);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tagUIStyle.showIcon) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 4, tagUIStyle.showIcon);
            }
        }

        public TagUIStyle(Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
            this.tagStyle = num;
            this.tagSize = num2;
            this.tagType = num3;
            this.tagPaint = num4;
            this.showIcon = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void (m)] (LINE:193) call: com.okinc.web3Uilib.bean.TransactionGeneralInfoBean.TagUIStyle.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void type: THIS */
        public /* synthetic */ TagUIStyle(Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) == 0 ? num4 : null, (i & 16) != 0 ? false : z);
        }
    }
}
