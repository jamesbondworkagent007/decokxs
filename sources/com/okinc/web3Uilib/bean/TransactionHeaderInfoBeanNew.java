package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TransactionHeaderInfoBeanNew {
    public static final int $stable = 8;
    private int autoFoldCount;
    private String foldText;
    private List<HeaderSimpleDataBeanNew> headerDataList;
    private Drawable headerIcon;
    private Function0<Unit> headerIconCallback;
    private String headerTitle;
    private boolean isShowHeaderIcon;
    private String unfoldText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionHeaderInfoBeanNew() {
        this(null, null, false, null, null, 0, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HeaderSimpleDataBeanNew> component2() {
        return this.headerDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isShowHeaderIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component4() {
        return this.headerIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component5() {
        return this.headerIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.autoFoldCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unfoldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.foldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionHeaderInfoBeanNew copy(@NotNull String str, List<HeaderSimpleDataBeanNew> list, boolean z, Drawable drawable, Function0<Unit> function0, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TransactionHeaderInfoBeanNew(str, list, z, drawable, function0, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionHeaderInfoBeanNew)) {
            return false;
        }
        TransactionHeaderInfoBeanNew transactionHeaderInfoBeanNew = (TransactionHeaderInfoBeanNew) obj;
        return Intrinsics.EZpvd((Object) this.headerTitle, (Object) transactionHeaderInfoBeanNew.headerTitle) && Intrinsics.EZpvd(this.headerDataList, transactionHeaderInfoBeanNew.headerDataList) && this.isShowHeaderIcon == transactionHeaderInfoBeanNew.isShowHeaderIcon && Intrinsics.EZpvd(this.headerIcon, transactionHeaderInfoBeanNew.headerIcon) && Intrinsics.EZpvd(this.headerIconCallback, transactionHeaderInfoBeanNew.headerIconCallback) && this.autoFoldCount == transactionHeaderInfoBeanNew.autoFoldCount && Intrinsics.EZpvd((Object) this.unfoldText, (Object) transactionHeaderInfoBeanNew.unfoldText) && Intrinsics.EZpvd((Object) this.foldText, (Object) transactionHeaderInfoBeanNew.foldText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAutoFoldCount() {
        return this.autoFoldCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFoldText() {
        return this.foldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HeaderSimpleDataBeanNew> getHeaderDataList() {
        return this.headerDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getHeaderIconCallback() {
        return this.headerIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnfoldText() {
        return this.unfoldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.headerTitle.hashCode();
        List<HeaderSimpleDataBeanNew> list = this.headerDataList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isShowHeaderIcon);
        Drawable drawable = this.headerIcon;
        int iHashCode4 = drawable == null ? 0 : drawable.hashCode();
        Function0<Unit> function0 = this.headerIconCallback;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0)) * 31) + Integer.hashCode(this.autoFoldCount)) * 31) + this.unfoldText.hashCode()) * 31) + this.foldText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowHeaderIcon() {
        return this.isShowHeaderIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoFoldCount(int i) {
        this.autoFoldCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFoldText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.foldText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderDataList(List<HeaderSimpleDataBeanNew> list) {
        this.headerDataList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderIcon(Drawable drawable) {
        this.headerIcon = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderIconCallback(Function0<Unit> function0) {
        this.headerIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.headerTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowHeaderIcon(boolean z) {
        this.isShowHeaderIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnfoldText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unfoldText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionHeaderInfoBeanNew(headerTitle=" + this.headerTitle + ", headerDataList=" + this.headerDataList + ", isShowHeaderIcon=" + this.isShowHeaderIcon + ", headerIcon=" + this.headerIcon + ", headerIconCallback=" + this.headerIconCallback + ", autoFoldCount=" + this.autoFoldCount + ", unfoldText=" + this.unfoldText + ", foldText=" + this.foldText + ")";
    }

    public TransactionHeaderInfoBeanNew(@NotNull String str, List<HeaderSimpleDataBeanNew> list, boolean z, Drawable drawable, Function0<Unit> function0, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.headerTitle = str;
        this.headerDataList = list;
        this.isShowHeaderIcon = z;
        this.headerIcon = drawable;
        this.headerIconCallback = function0;
        this.autoFoldCount = i;
        this.unfoldText = str2;
        this.foldText = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r13v0 android.graphics.drawable.Drawable))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.util.List<com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew>, boolean, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, java.lang.String):void (m)] (LINE:82) call: com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew.<init>(java.lang.String, java.util.List, boolean, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionHeaderInfoBeanNew(String str, List list, boolean z, Drawable drawable, Function0 function0, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : drawable, (i2 & 16) == 0 ? function0 : null, (i2 & 32) != 0 ? 3 : i, (i2 & 64) != 0 ? "" : str2, (i2 & 128) == 0 ? str3 : "");
    }

    public static final class HeaderSimpleDataBeanNew {
        public static final int $stable = 8;
        private String arrowText;
        private boolean isUseDefaultNumUnitStyle;
        private Function1<? super HeaderSimpleDataBeanNew, Unit> itemClickCallback;
        private Drawable mainDefaultIcon;
        private Object mainIconImgRes;
        private int mainIconRoundedRadius;
        private CharSequence numContent;
        private int showTagOrBtn;
        private Drawable subDefaultIcon;
        private Object subIconImgRes;
        private int subIconRoundedRadius;
        private Function0<Unit> subTitleClickCallback;
        private CharSequence subTitleContent;
        private Function0<Unit> titleIconCallback;
        private Drawable titleIconDrawable;
        private CharSequence titleTagContent;
        private CharSequence unitContent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public HeaderSimpleDataBeanNew() {
            this(0, 0, null, null, null, null, null, null, false, null, null, null, 0, null, null, null, null, 131071, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.mainIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component10() {
            return this.subTitleContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component11() {
            return this.titleIconDrawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component12() {
            return this.titleTagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component13() {
            return this.showTagOrBtn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component14() {
            return this.titleIconCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component15() {
            return this.subTitleClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew, kotlin.Unit> */
        public final Function1<HeaderSimpleDataBeanNew, Unit> component16() {
            return this.itemClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.arrowText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.subIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component3() {
            return this.mainIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component4() {
            return this.subIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component5() {
            return this.mainDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component6() {
            return this.subDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component7() {
            return this.numContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component8() {
            return this.unitContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isUseDefaultNumUnitStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeaderSimpleDataBeanNew copy(int i, int i2, Object obj, Object obj2, Drawable drawable, Drawable drawable2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, @NotNull CharSequence charSequence3, Drawable drawable3, @NotNull CharSequence charSequence4, int i3, Function0<Unit> function0, Function0<Unit> function02, Function1<? super HeaderSimpleDataBeanNew, Unit> function1, String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            return new HeaderSimpleDataBeanNew(i, i2, obj, obj2, drawable, drawable2, charSequence, charSequence2, z, charSequence3, drawable3, charSequence4, i3, function0, function02, function1, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderSimpleDataBeanNew)) {
                return false;
            }
            HeaderSimpleDataBeanNew headerSimpleDataBeanNew = (HeaderSimpleDataBeanNew) obj;
            return this.mainIconRoundedRadius == headerSimpleDataBeanNew.mainIconRoundedRadius && this.subIconRoundedRadius == headerSimpleDataBeanNew.subIconRoundedRadius && Intrinsics.EZpvd(this.mainIconImgRes, headerSimpleDataBeanNew.mainIconImgRes) && Intrinsics.EZpvd(this.subIconImgRes, headerSimpleDataBeanNew.subIconImgRes) && Intrinsics.EZpvd(this.mainDefaultIcon, headerSimpleDataBeanNew.mainDefaultIcon) && Intrinsics.EZpvd(this.subDefaultIcon, headerSimpleDataBeanNew.subDefaultIcon) && Intrinsics.EZpvd(this.numContent, headerSimpleDataBeanNew.numContent) && Intrinsics.EZpvd(this.unitContent, headerSimpleDataBeanNew.unitContent) && this.isUseDefaultNumUnitStyle == headerSimpleDataBeanNew.isUseDefaultNumUnitStyle && Intrinsics.EZpvd(this.subTitleContent, headerSimpleDataBeanNew.subTitleContent) && Intrinsics.EZpvd(this.titleIconDrawable, headerSimpleDataBeanNew.titleIconDrawable) && Intrinsics.EZpvd(this.titleTagContent, headerSimpleDataBeanNew.titleTagContent) && this.showTagOrBtn == headerSimpleDataBeanNew.showTagOrBtn && Intrinsics.EZpvd(this.titleIconCallback, headerSimpleDataBeanNew.titleIconCallback) && Intrinsics.EZpvd(this.subTitleClickCallback, headerSimpleDataBeanNew.subTitleClickCallback) && Intrinsics.EZpvd(this.itemClickCallback, headerSimpleDataBeanNew.itemClickCallback) && Intrinsics.EZpvd((Object) this.arrowText, (Object) headerSimpleDataBeanNew.arrowText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getArrowText() {
            return this.arrowText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew, kotlin.Unit> */
        public final Function1<HeaderSimpleDataBeanNew, Unit> getItemClickCallback() {
            return this.itemClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable getMainDefaultIcon() {
            return this.mainDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getMainIconImgRes() {
            return this.mainIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMainIconRoundedRadius() {
            return this.mainIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getNumContent() {
            return this.numContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getShowTagOrBtn() {
            return this.showTagOrBtn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable getSubDefaultIcon() {
            return this.subDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object getSubIconImgRes() {
            return this.subIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSubIconRoundedRadius() {
            return this.subIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> getSubTitleClickCallback() {
            return this.subTitleClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getSubTitleContent() {
            return this.subTitleContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> getTitleIconCallback() {
            return this.titleIconCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable getTitleIconDrawable() {
            return this.titleIconDrawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getTitleTagContent() {
            return this.titleTagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getUnitContent() {
            return this.unitContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.mainIconRoundedRadius);
            int iHashCode2 = Integer.hashCode(this.subIconRoundedRadius);
            Object obj = this.mainIconImgRes;
            int iHashCode3 = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.subIconImgRes;
            int iHashCode4 = obj2 == null ? 0 : obj2.hashCode();
            Drawable drawable = this.mainDefaultIcon;
            int iHashCode5 = drawable == null ? 0 : drawable.hashCode();
            Drawable drawable2 = this.subDefaultIcon;
            int iHashCode6 = drawable2 == null ? 0 : drawable2.hashCode();
            int iHashCode7 = this.numContent.hashCode();
            int iHashCode8 = this.unitContent.hashCode();
            int iHashCode9 = Boolean.hashCode(this.isUseDefaultNumUnitStyle);
            int iHashCode10 = this.subTitleContent.hashCode();
            Drawable drawable3 = this.titleIconDrawable;
            int iHashCode11 = drawable3 == null ? 0 : drawable3.hashCode();
            int iHashCode12 = this.titleTagContent.hashCode();
            int iHashCode13 = Integer.hashCode(this.showTagOrBtn);
            Function0<Unit> function0 = this.titleIconCallback;
            int iHashCode14 = function0 == null ? 0 : function0.hashCode();
            Function0<Unit> function02 = this.subTitleClickCallback;
            int iHashCode15 = function02 == null ? 0 : function02.hashCode();
            Function1<? super HeaderSimpleDataBeanNew, Unit> function1 = this.itemClickCallback;
            int iHashCode16 = function1 == null ? 0 : function1.hashCode();
            String str = this.arrowText;
            return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isUseDefaultNumUnitStyle() {
            return this.isUseDefaultNumUnitStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setArrowText(String str) {
            this.arrowText = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setItemClickCallback(Function1<? super HeaderSimpleDataBeanNew, Unit> function1) {
            this.itemClickCallback = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMainDefaultIcon(Drawable drawable) {
            this.mainDefaultIcon = drawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMainIconImgRes(Object obj) {
            this.mainIconImgRes = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMainIconRoundedRadius(int i) {
            this.mainIconRoundedRadius = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNumContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.numContent = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowTagOrBtn(int i) {
            this.showTagOrBtn = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubDefaultIcon(Drawable drawable) {
            this.subDefaultIcon = drawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubIconImgRes(Object obj) {
            this.subIconImgRes = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubIconRoundedRadius(int i) {
            this.subIconRoundedRadius = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubTitleClickCallback(Function0<Unit> function0) {
            this.subTitleClickCallback = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSubTitleContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.subTitleContent = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitleIconCallback(Function0<Unit> function0) {
            this.titleIconCallback = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitleIconDrawable(Drawable drawable) {
            this.titleIconDrawable = drawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitleTagContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.titleTagContent = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUnitContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.unitContent = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUseDefaultNumUnitStyle(boolean z) {
            this.isUseDefaultNumUnitStyle = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            int i = this.mainIconRoundedRadius;
            int i2 = this.subIconRoundedRadius;
            Object obj = this.mainIconImgRes;
            Object obj2 = this.subIconImgRes;
            Drawable drawable = this.mainDefaultIcon;
            Drawable drawable2 = this.subDefaultIcon;
            CharSequence charSequence = this.numContent;
            CharSequence charSequence2 = this.unitContent;
            boolean z = this.isUseDefaultNumUnitStyle;
            CharSequence charSequence3 = this.subTitleContent;
            Drawable drawable3 = this.titleIconDrawable;
            CharSequence charSequence4 = this.titleTagContent;
            return "HeaderSimpleDataBeanNew(mainIconRoundedRadius=" + i + ", subIconRoundedRadius=" + i2 + ", mainIconImgRes=" + obj + ", subIconImgRes=" + obj2 + ", mainDefaultIcon=" + drawable + ", subDefaultIcon=" + drawable2 + ", numContent=" + ((Object) charSequence) + ", unitContent=" + ((Object) charSequence2) + ", isUseDefaultNumUnitStyle=" + z + ", subTitleContent=" + ((Object) charSequence3) + ", titleIconDrawable=" + drawable3 + ", titleTagContent=" + ((Object) charSequence4) + ", showTagOrBtn=" + this.showTagOrBtn + ", titleIconCallback=" + this.titleIconCallback + ", subTitleClickCallback=" + this.subTitleClickCallback + ", itemClickCallback=" + this.itemClickCallback + ", arrowText=" + this.arrowText + ")";
        }

        public HeaderSimpleDataBeanNew(int i, int i2, Object obj, Object obj2, Drawable drawable, Drawable drawable2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, @NotNull CharSequence charSequence3, Drawable drawable3, @NotNull CharSequence charSequence4, int i3, Function0<Unit> function0, Function0<Unit> function02, Function1<? super HeaderSimpleDataBeanNew, Unit> function1, String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            this.mainIconRoundedRadius = i;
            this.subIconRoundedRadius = i2;
            this.mainIconImgRes = obj;
            this.subIconImgRes = obj2;
            this.mainDefaultIcon = drawable;
            this.subDefaultIcon = drawable2;
            this.numContent = charSequence;
            this.unitContent = charSequence2;
            this.isUseDefaultNumUnitStyle = z;
            this.subTitleContent = charSequence3;
            this.titleIconDrawable = drawable3;
            this.titleTagContent = charSequence4;
            this.showTagOrBtn = i3;
            this.titleIconCallback = function0;
            this.subTitleClickCallback = function02;
            this.itemClickCallback = function1;
            this.arrowText = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE (16.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:94)) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: INVOKE (8.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:95)) : (r20v0 int))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001e: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r21v0 java.lang.Object))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0026: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r22v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x002e: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r23v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0036: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r24v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x003e: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0048: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.CharSequence))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r36v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r27v0 boolean) : true)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0057: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.CharSequence))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x005f: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r29v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0067: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.CharSequence) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006e: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r31v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r32v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x007e: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r33v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0089: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r34v0 kotlin.jvm.functions.Function1))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(int, int, java.lang.Object, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, boolean, java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.CharSequence, int, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew$HeaderSimpleDataBeanNew, kotlin.Unit>, java.lang.String):void (m)] (LINE:93) call: com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew.<init>(int, int, java.lang.Object, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, boolean, java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.CharSequence, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String):void type: THIS */
        public /* synthetic */ HeaderSimpleDataBeanNew(int i, int i2, Object obj, Object obj2, Drawable drawable, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, Drawable drawable3, CharSequence charSequence4, int i3, Function0 function0, Function0 function02, Function1 function1, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? C55298xhM.dp2px$default(16.0f, null, 1, null) : i, (i4 & 2) != 0 ? C55298xhM.dp2px$default(8.0f, null, 1, null) : i2, (i4 & 4) != 0 ? null : obj, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : drawable, (i4 & 32) != 0 ? null : drawable2, (i4 & 64) != 0 ? "" : charSequence, (i4 & 128) != 0 ? "" : charSequence2, (i4 & 256) == 0 ? z : true, (i4 & 512) != 0 ? "" : charSequence3, (i4 & 1024) != 0 ? null : drawable3, (i4 & 2048) == 0 ? charSequence4 : "", (i4 & 4096) != 0 ? 2 : i3, (i4 & 8192) != 0 ? null : function0, (i4 & 16384) != 0 ? null : function02, (i4 & 32768) != 0 ? null : function1, (i4 & 65536) != 0 ? null : str);
        }
    }
}
