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

/* JADX INFO: loaded from: classes17.dex */
public final class TransactionHeaderInfoBean {
    public static final int $stable = 8;
    private List<HeaderSimpleDataBean> headerDataList;
    private Drawable headerIcon;
    private Function0<Unit> headerIconCallback;
    private String headerTitle;
    private boolean isShowHeaderIcon;
    private String subTitle;
    private Function0<Unit> titleClickCallback;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionHeaderInfoBean() {
        this(null, null, false, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.web3Uilib.bean.TransactionHeaderInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionHeaderInfoBean copy$default(TransactionHeaderInfoBean transactionHeaderInfoBean, String str, List list, boolean z, Drawable drawable, Function0 function0, String str2, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionHeaderInfoBean.headerTitle;
        }
        if ((i & 2) != 0) {
            list = transactionHeaderInfoBean.headerDataList;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = transactionHeaderInfoBean.isShowHeaderIcon;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            drawable = transactionHeaderInfoBean.headerIcon;
        }
        Drawable drawable2 = drawable;
        if ((i & 16) != 0) {
            function0 = transactionHeaderInfoBean.headerIconCallback;
        }
        Function0 function03 = function0;
        if ((i & 32) != 0) {
            str2 = transactionHeaderInfoBean.subTitle;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            function02 = transactionHeaderInfoBean.titleClickCallback;
        }
        return transactionHeaderInfoBean.copy(str, list2, z2, drawable2, function03, str3, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HeaderSimpleDataBean> component2() {
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
    public final String component6() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component7() {
        return this.titleClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionHeaderInfoBean copy(@NotNull String str, List<HeaderSimpleDataBean> list, boolean z, Drawable drawable, Function0<Unit> function0, @NotNull String str2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionHeaderInfoBean(str, list, z, drawable, function0, str2, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionHeaderInfoBean)) {
            return false;
        }
        TransactionHeaderInfoBean transactionHeaderInfoBean = (TransactionHeaderInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.headerTitle, (Object) transactionHeaderInfoBean.headerTitle) && Intrinsics.EZpvd(this.headerDataList, transactionHeaderInfoBean.headerDataList) && this.isShowHeaderIcon == transactionHeaderInfoBean.isShowHeaderIcon && Intrinsics.EZpvd(this.headerIcon, transactionHeaderInfoBean.headerIcon) && Intrinsics.EZpvd(this.headerIconCallback, transactionHeaderInfoBean.headerIconCallback) && Intrinsics.EZpvd((Object) this.subTitle, (Object) transactionHeaderInfoBean.subTitle) && Intrinsics.EZpvd(this.titleClickCallback, transactionHeaderInfoBean.titleClickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HeaderSimpleDataBean> getHeaderDataList() {
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
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getTitleClickCallback() {
        return this.titleClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.headerTitle.hashCode();
        List<HeaderSimpleDataBean> list = this.headerDataList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isShowHeaderIcon);
        Drawable drawable = this.headerIcon;
        int iHashCode4 = drawable == null ? 0 : drawable.hashCode();
        Function0<Unit> function0 = this.headerIconCallback;
        int iHashCode5 = function0 == null ? 0 : function0.hashCode();
        int iHashCode6 = this.subTitle.hashCode();
        Function0<Unit> function02 = this.titleClickCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function02 != null ? function02.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowHeaderIcon() {
        return this.isShowHeaderIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderDataList(List<HeaderSimpleDataBean> list) {
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
    public final void setSubTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleClickCallback(Function0<Unit> function0) {
        this.titleClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionHeaderInfoBean(headerTitle=" + this.headerTitle + ", headerDataList=" + this.headerDataList + ", isShowHeaderIcon=" + this.isShowHeaderIcon + ", headerIcon=" + this.headerIcon + ", headerIconCallback=" + this.headerIconCallback + ", subTitle=" + this.subTitle + ", titleClickCallback=" + this.titleClickCallback + ")";
    }

    public TransactionHeaderInfoBean(@NotNull String str, List<HeaderSimpleDataBean> list, boolean z, Drawable drawable, Function0<Unit> function0, @NotNull String str2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.headerTitle = str;
        this.headerDataList = list;
        this.isShowHeaderIcon = z;
        this.headerIcon = drawable;
        this.headerIconCallback = function0;
        this.subTitle = str2;
        this.titleClickCallback = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:boolean:0x0016: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r10v0 android.graphics.drawable.Drawable))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.util.List<com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean>, boolean, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:47) call: com.okinc.web3Uilib.bean.TransactionHeaderInfoBean.<init>(java.lang.String, java.util.List, boolean, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionHeaderInfoBean(String str, List list, boolean z, Drawable drawable, Function0 function0, String str2, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? null : function0, (i & 32) == 0 ? str2 : "", (i & 64) != 0 ? null : function02);
    }

    public static final class HeaderSimpleDataBean {
        public static final int $stable = 8;
        private float arrowAngle;
        private String arrowText;
        private boolean isUseDefaultNumUnitStyle;
        private Function1<? super HeaderSimpleDataBean, Unit> itemClickCallback;
        private Drawable mainDefaultIcon;
        private Object mainIconImgRes;
        private int mainIconRoundedRadius;
        private Function0<Unit> moreClickCallback;
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
        private int viewType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public HeaderSimpleDataBean() {
            this(0, 0.0f, 0, 0, null, null, null, null, null, null, false, null, null, null, 0, null, null, null, null, null, 1048575, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.viewType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component10() {
            return this.unitContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component11() {
            return this.isUseDefaultNumUnitStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component12() {
            return this.subTitleContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component13() {
            return this.titleIconDrawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component14() {
            return this.titleTagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component15() {
            return this.showTagOrBtn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component16() {
            return this.titleIconCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component17() {
            return this.subTitleClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component18() {
            return this.moreClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean, kotlin.Unit> */
        public final Function1<HeaderSimpleDataBean, Unit> component19() {
            return this.itemClickCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float component2() {
            return this.arrowAngle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component20() {
            return this.arrowText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.mainIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.subIconRoundedRadius;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component5() {
            return this.mainIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component6() {
            return this.subIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component7() {
            return this.mainDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component8() {
            return this.subDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component9() {
            return this.numContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeaderSimpleDataBean copy(int i, float f, int i2, int i3, Object obj, Object obj2, Drawable drawable, Drawable drawable2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, @NotNull CharSequence charSequence3, Drawable drawable3, @NotNull CharSequence charSequence4, int i4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super HeaderSimpleDataBean, Unit> function1, String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            return new HeaderSimpleDataBean(i, f, i2, i3, obj, obj2, drawable, drawable2, charSequence, charSequence2, z, charSequence3, drawable3, charSequence4, i4, function0, function02, function03, function1, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderSimpleDataBean)) {
                return false;
            }
            HeaderSimpleDataBean headerSimpleDataBean = (HeaderSimpleDataBean) obj;
            return this.viewType == headerSimpleDataBean.viewType && Float.compare(this.arrowAngle, headerSimpleDataBean.arrowAngle) == 0 && this.mainIconRoundedRadius == headerSimpleDataBean.mainIconRoundedRadius && this.subIconRoundedRadius == headerSimpleDataBean.subIconRoundedRadius && Intrinsics.EZpvd(this.mainIconImgRes, headerSimpleDataBean.mainIconImgRes) && Intrinsics.EZpvd(this.subIconImgRes, headerSimpleDataBean.subIconImgRes) && Intrinsics.EZpvd(this.mainDefaultIcon, headerSimpleDataBean.mainDefaultIcon) && Intrinsics.EZpvd(this.subDefaultIcon, headerSimpleDataBean.subDefaultIcon) && Intrinsics.EZpvd(this.numContent, headerSimpleDataBean.numContent) && Intrinsics.EZpvd(this.unitContent, headerSimpleDataBean.unitContent) && this.isUseDefaultNumUnitStyle == headerSimpleDataBean.isUseDefaultNumUnitStyle && Intrinsics.EZpvd(this.subTitleContent, headerSimpleDataBean.subTitleContent) && Intrinsics.EZpvd(this.titleIconDrawable, headerSimpleDataBean.titleIconDrawable) && Intrinsics.EZpvd(this.titleTagContent, headerSimpleDataBean.titleTagContent) && this.showTagOrBtn == headerSimpleDataBean.showTagOrBtn && Intrinsics.EZpvd(this.titleIconCallback, headerSimpleDataBean.titleIconCallback) && Intrinsics.EZpvd(this.subTitleClickCallback, headerSimpleDataBean.subTitleClickCallback) && Intrinsics.EZpvd(this.moreClickCallback, headerSimpleDataBean.moreClickCallback) && Intrinsics.EZpvd(this.itemClickCallback, headerSimpleDataBean.itemClickCallback) && Intrinsics.EZpvd((Object) this.arrowText, (Object) headerSimpleDataBean.arrowText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getArrowAngle() {
            return this.arrowAngle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getArrowText() {
            return this.arrowText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean, kotlin.Unit> */
        public final Function1<HeaderSimpleDataBean, Unit> getItemClickCallback() {
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
        public final Function0<Unit> getMoreClickCallback() {
            return this.moreClickCallback;
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
        public final int getViewType() {
            return this.viewType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.viewType);
            int iHashCode2 = Float.hashCode(this.arrowAngle);
            int iHashCode3 = Integer.hashCode(this.mainIconRoundedRadius);
            int iHashCode4 = Integer.hashCode(this.subIconRoundedRadius);
            Object obj = this.mainIconImgRes;
            int iHashCode5 = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.subIconImgRes;
            int iHashCode6 = obj2 == null ? 0 : obj2.hashCode();
            Drawable drawable = this.mainDefaultIcon;
            int iHashCode7 = drawable == null ? 0 : drawable.hashCode();
            Drawable drawable2 = this.subDefaultIcon;
            int iHashCode8 = drawable2 == null ? 0 : drawable2.hashCode();
            int iHashCode9 = this.numContent.hashCode();
            int iHashCode10 = this.unitContent.hashCode();
            int iHashCode11 = Boolean.hashCode(this.isUseDefaultNumUnitStyle);
            int iHashCode12 = this.subTitleContent.hashCode();
            Drawable drawable3 = this.titleIconDrawable;
            int iHashCode13 = drawable3 == null ? 0 : drawable3.hashCode();
            int iHashCode14 = this.titleTagContent.hashCode();
            int iHashCode15 = Integer.hashCode(this.showTagOrBtn);
            Function0<Unit> function0 = this.titleIconCallback;
            int iHashCode16 = function0 == null ? 0 : function0.hashCode();
            Function0<Unit> function02 = this.subTitleClickCallback;
            int iHashCode17 = function02 == null ? 0 : function02.hashCode();
            Function0<Unit> function03 = this.moreClickCallback;
            int iHashCode18 = function03 == null ? 0 : function03.hashCode();
            Function1<? super HeaderSimpleDataBean, Unit> function1 = this.itemClickCallback;
            int iHashCode19 = function1 == null ? 0 : function1.hashCode();
            String str = this.arrowText;
            return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isUseDefaultNumUnitStyle() {
            return this.isUseDefaultNumUnitStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setArrowAngle(float f) {
            this.arrowAngle = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setArrowText(String str) {
            this.arrowText = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setItemClickCallback(Function1<? super HeaderSimpleDataBean, Unit> function1) {
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
        public final void setMoreClickCallback(Function0<Unit> function0) {
            this.moreClickCallback = function0;
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
        public final void setViewType(int i) {
            this.viewType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            int i = this.viewType;
            float f = this.arrowAngle;
            int i2 = this.mainIconRoundedRadius;
            int i3 = this.subIconRoundedRadius;
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
            return "HeaderSimpleDataBean(viewType=" + i + ", arrowAngle=" + f + ", mainIconRoundedRadius=" + i2 + ", subIconRoundedRadius=" + i3 + ", mainIconImgRes=" + obj + ", subIconImgRes=" + obj2 + ", mainDefaultIcon=" + drawable + ", subDefaultIcon=" + drawable2 + ", numContent=" + ((Object) charSequence) + ", unitContent=" + ((Object) charSequence2) + ", isUseDefaultNumUnitStyle=" + z + ", subTitleContent=" + ((Object) charSequence3) + ", titleIconDrawable=" + drawable3 + ", titleTagContent=" + ((Object) charSequence4) + ", showTagOrBtn=" + this.showTagOrBtn + ", titleIconCallback=" + this.titleIconCallback + ", subTitleClickCallback=" + this.subTitleClickCallback + ", moreClickCallback=" + this.moreClickCallback + ", itemClickCallback=" + this.itemClickCallback + ", arrowText=" + this.arrowText + ")";
        }

        public HeaderSimpleDataBean(int i, float f, int i2, int i3, Object obj, Object obj2, Drawable drawable, Drawable drawable2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, @NotNull CharSequence charSequence3, Drawable drawable3, @NotNull CharSequence charSequence4, int i4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super HeaderSimpleDataBean, Unit> function1, String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            this.viewType = i;
            this.arrowAngle = f;
            this.mainIconRoundedRadius = i2;
            this.subIconRoundedRadius = i3;
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
            this.showTagOrBtn = i4;
            this.titleIconCallback = function0;
            this.subTitleClickCallback = function02;
            this.moreClickCallback = function03;
            this.itemClickCallback = function1;
            this.arrowText = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e8: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000a: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (180.0f float) : (r23v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE (16.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:60)) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: INVOKE (8.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:61)) : (r25v0 int))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002f: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r26v0 java.lang.Object))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0037: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r27v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x003f: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r28v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0047: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r29v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x004f: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0059: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.CharSequence))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r32v0 boolean) : true)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0068: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.CharSequence))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0070: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r34v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0078: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.CharSequence) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007f: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r36v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x008a: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r37v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0095: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r38v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r39v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r40v0 kotlin.jvm.functions.Function1))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
 A[MD:(int, float, int, int, java.lang.Object, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, boolean, java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.CharSequence, int, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.web3Uilib.bean.TransactionHeaderInfoBean$HeaderSimpleDataBean, kotlin.Unit>, java.lang.String):void (m)] (LINE:57) call: com.okinc.web3Uilib.bean.TransactionHeaderInfoBean.HeaderSimpleDataBean.<init>(int, float, int, int, java.lang.Object, java.lang.Object, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, boolean, java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.CharSequence, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String):void type: THIS */
        public /* synthetic */ HeaderSimpleDataBean(int i, float f, int i2, int i3, Object obj, Object obj2, Drawable drawable, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, Drawable drawable3, CharSequence charSequence4, int i4, Function0 function0, Function0 function02, Function0 function03, Function1 function1, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 180.0f : f, (i5 & 4) != 0 ? C55298xhM.dp2px$default(16.0f, null, 1, null) : i2, (i5 & 8) != 0 ? C55298xhM.dp2px$default(8.0f, null, 1, null) : i3, (i5 & 16) != 0 ? null : obj, (i5 & 32) != 0 ? null : obj2, (i5 & 64) != 0 ? null : drawable, (i5 & 128) != 0 ? null : drawable2, (i5 & 256) != 0 ? "" : charSequence, (i5 & 512) != 0 ? "" : charSequence2, (i5 & 1024) == 0 ? z : true, (i5 & 2048) != 0 ? "" : charSequence3, (i5 & 4096) != 0 ? null : drawable3, (i5 & 8192) == 0 ? charSequence4 : "", (i5 & 16384) != 0 ? 2 : i4, (i5 & 32768) != 0 ? null : function0, (i5 & 65536) != 0 ? null : function02, (i5 & 131072) != 0 ? null : function03, (i5 & 262144) != 0 ? null : function1, (i5 & 524288) != 0 ? null : str);
        }
    }
}
