package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TransferAssetInfoBean {
    public static final int $stable = 8;
    private boolean changed;
    private Drawable defaultIcon;
    private int direction;
    private Object iconRes;
    private int iconRoundedRadius;
    private String subContent;
    private String subtitleTagContent;
    private String titleContent;
    private String titleSymbol;
    private String titleTagContent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferAssetInfoBean() {
        this(null, null, 0, 0, null, null, null, null, null, false, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component1() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.changed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component2() {
        return this.defaultIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.iconRoundedRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.titleContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.titleSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.titleTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.subtitleTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferAssetInfoBean copy(Object obj, Drawable drawable, int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TransferAssetInfoBean(obj, drawable, i, i2, str, str2, str3, str4, str5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAssetInfoBean)) {
            return false;
        }
        TransferAssetInfoBean transferAssetInfoBean = (TransferAssetInfoBean) obj;
        return Intrinsics.EZpvd(this.iconRes, transferAssetInfoBean.iconRes) && Intrinsics.EZpvd(this.defaultIcon, transferAssetInfoBean.defaultIcon) && this.iconRoundedRadius == transferAssetInfoBean.iconRoundedRadius && this.direction == transferAssetInfoBean.direction && Intrinsics.EZpvd((Object) this.titleContent, (Object) transferAssetInfoBean.titleContent) && Intrinsics.EZpvd((Object) this.titleSymbol, (Object) transferAssetInfoBean.titleSymbol) && Intrinsics.EZpvd((Object) this.titleTagContent, (Object) transferAssetInfoBean.titleTagContent) && Intrinsics.EZpvd((Object) this.subContent, (Object) transferAssetInfoBean.subContent) && Intrinsics.EZpvd((Object) this.subtitleTagContent, (Object) transferAssetInfoBean.subtitleTagContent) && this.changed == transferAssetInfoBean.changed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChanged() {
        return this.changed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getDefaultIcon() {
        return this.defaultIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getIconRes() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconRoundedRadius() {
        return this.iconRoundedRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubContent() {
        return this.subContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitleTagContent() {
        return this.subtitleTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleContent() {
        return this.titleContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleSymbol() {
        return this.titleSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleTagContent() {
        return this.titleTagContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Object obj = this.iconRes;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Drawable drawable = this.defaultIcon;
        return (((((((((((((((((iHashCode * 31) + (drawable != null ? drawable.hashCode() : 0)) * 31) + Integer.hashCode(this.iconRoundedRadius)) * 31) + Integer.hashCode(this.direction)) * 31) + this.titleContent.hashCode()) * 31) + this.titleSymbol.hashCode()) * 31) + this.titleTagContent.hashCode()) * 31) + this.subContent.hashCode()) * 31) + this.subtitleTagContent.hashCode()) * 31) + Boolean.hashCode(this.changed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChanged(boolean z) {
        this.changed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultIcon(Drawable drawable) {
        this.defaultIcon = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(int i) {
        this.direction = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconRes(Object obj) {
        this.iconRes = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconRoundedRadius(int i) {
        this.iconRoundedRadius = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitleTagContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subtitleTagContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleTagContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleTagContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferAssetInfoBean(iconRes=" + this.iconRes + ", defaultIcon=" + this.defaultIcon + ", iconRoundedRadius=" + this.iconRoundedRadius + ", direction=" + this.direction + ", titleContent=" + this.titleContent + ", titleSymbol=" + this.titleSymbol + ", titleTagContent=" + this.titleTagContent + ", subContent=" + this.subContent + ", subtitleTagContent=" + this.subtitleTagContent + ", changed=" + this.changed + ")";
    }

    public TransferAssetInfoBean(Object obj, Drawable drawable, int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.iconRes = obj;
        this.defaultIcon = drawable;
        this.iconRoundedRadius = i;
        this.direction = i2;
        this.titleContent = str;
        this.titleSymbol = str2;
        this.titleTagContent = str3;
        this.subContent = str4;
        this.subtitleTagContent = str5;
        this.changed = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006a: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r13v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r14v0 android.graphics.drawable.Drawable))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE (16.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:140)) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:137) call: com.okinc.web3Uilib.bean.TransferAssetInfoBean.<init>(java.lang.Object, android.graphics.drawable.Drawable, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TransferAssetInfoBean(Object obj, Drawable drawable, int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : obj, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? C55298xhM.dp2px$default(16.0f, null, 1, null) : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) == 0 ? str5 : "", (i3 & 512) == 0 ? z : false);
    }
}
