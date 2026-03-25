package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TransactionAssetInfoBean {
    public static final int $stable = 8;
    private List<AssetSimpleDataBean> assetDataList;
    private int autoFoldCount;
    private String foldText;
    private String subTitle;
    private String title;
    private Function0<Unit> titleClickCallback;
    private String unfoldText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionAssetInfoBean() {
        this(null, 0, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.web3Uilib.bean.TransactionAssetInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionAssetInfoBean copy$default(TransactionAssetInfoBean transactionAssetInfoBean, List list, int i, String str, String str2, String str3, String str4, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = transactionAssetInfoBean.assetDataList;
        }
        if ((i2 & 2) != 0) {
            i = transactionAssetInfoBean.autoFoldCount;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = transactionAssetInfoBean.unfoldText;
        }
        String str5 = str;
        if ((i2 & 8) != 0) {
            str2 = transactionAssetInfoBean.foldText;
        }
        String str6 = str2;
        if ((i2 & 16) != 0) {
            str3 = transactionAssetInfoBean.title;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = transactionAssetInfoBean.subTitle;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            function0 = transactionAssetInfoBean.titleClickCallback;
        }
        return transactionAssetInfoBean.copy(list, i3, str5, str6, str7, str8, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetSimpleDataBean> component1() {
        return this.assetDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.autoFoldCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unfoldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.foldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.title;
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
    public final TransactionAssetInfoBean copy(List<AssetSimpleDataBean> list, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TransactionAssetInfoBean(list, i, str, str2, str3, str4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionAssetInfoBean)) {
            return false;
        }
        TransactionAssetInfoBean transactionAssetInfoBean = (TransactionAssetInfoBean) obj;
        return Intrinsics.EZpvd(this.assetDataList, transactionAssetInfoBean.assetDataList) && this.autoFoldCount == transactionAssetInfoBean.autoFoldCount && Intrinsics.EZpvd((Object) this.unfoldText, (Object) transactionAssetInfoBean.unfoldText) && Intrinsics.EZpvd((Object) this.foldText, (Object) transactionAssetInfoBean.foldText) && Intrinsics.EZpvd((Object) this.title, (Object) transactionAssetInfoBean.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) transactionAssetInfoBean.subTitle) && Intrinsics.EZpvd(this.titleClickCallback, transactionAssetInfoBean.titleClickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetSimpleDataBean> getAssetDataList() {
        return this.assetDataList;
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
    public final String getSubTitle() {
        return this.subTitle;
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
    public final String getUnfoldText() {
        return this.unfoldText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<AssetSimpleDataBean> list = this.assetDataList;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = Integer.hashCode(this.autoFoldCount);
        int iHashCode3 = this.unfoldText.hashCode();
        int iHashCode4 = this.foldText.hashCode();
        int iHashCode5 = this.title.hashCode();
        int iHashCode6 = this.subTitle.hashCode();
        Function0<Unit> function0 = this.titleClickCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetDataList(List<AssetSimpleDataBean> list) {
        this.assetDataList = list;
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
    public final void setSubTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTitle = str;
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
    public final void setUnfoldText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unfoldText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionAssetInfoBean(assetDataList=" + this.assetDataList + ", autoFoldCount=" + this.autoFoldCount + ", unfoldText=" + this.unfoldText + ", foldText=" + this.foldText + ", title=" + this.title + ", subTitle=" + this.subTitle + ", titleClickCallback=" + this.titleClickCallback + ")";
    }

    public TransactionAssetInfoBean(List<AssetSimpleDataBean> list, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.assetDataList = list;
        this.autoFoldCount = i;
        this.unfoldText = str;
        this.foldText = str2;
        this.title = str3;
        this.subTitle = str4;
        this.titleClickCallback = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
 A[MD:(java.util.List<com.okinc.web3Uilib.bean.TransactionAssetInfoBean$AssetSimpleDataBean>, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:115) call: com.okinc.web3Uilib.bean.TransactionAssetInfoBean.<init>(java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionAssetInfoBean(List list, int i, String str, String str2, String str3, String str4, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : function0);
    }

    public static final class AssetSimpleDataBean {
        public static final int $stable = 8;
        private Drawable mainDefaultIcon;
        private Object mainIconImgRes;
        private CharSequence numContent;
        private CharSequence subTitleContent;
        private Function0<Unit> titleIconCallback;
        private Drawable titleIconDrawable;
        private CharSequence unitContent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssetSimpleDataBean() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.web3Uilib.bean.TransactionAssetInfoBean$AssetSimpleDataBean */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssetSimpleDataBean copy$default(AssetSimpleDataBean assetSimpleDataBean, Object obj, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable2, Function0 function0, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = assetSimpleDataBean.mainIconImgRes;
            }
            if ((i & 2) != 0) {
                drawable = assetSimpleDataBean.mainDefaultIcon;
            }
            Drawable drawable3 = drawable;
            if ((i & 4) != 0) {
                charSequence = assetSimpleDataBean.numContent;
            }
            CharSequence charSequence4 = charSequence;
            if ((i & 8) != 0) {
                charSequence2 = assetSimpleDataBean.unitContent;
            }
            CharSequence charSequence5 = charSequence2;
            if ((i & 16) != 0) {
                charSequence3 = assetSimpleDataBean.subTitleContent;
            }
            CharSequence charSequence6 = charSequence3;
            if ((i & 32) != 0) {
                drawable2 = assetSimpleDataBean.titleIconDrawable;
            }
            Drawable drawable4 = drawable2;
            if ((i & 64) != 0) {
                function0 = assetSimpleDataBean.titleIconCallback;
            }
            return assetSimpleDataBean.copy(obj, drawable3, charSequence4, charSequence5, charSequence6, drawable4, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object component1() {
            return this.mainIconImgRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component2() {
            return this.mainDefaultIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component3() {
            return this.numContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component4() {
            return this.unitContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component5() {
            return this.subTitleContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Drawable component6() {
            return this.titleIconDrawable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> component7() {
            return this.titleIconCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetSimpleDataBean copy(Object obj, Drawable drawable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, Drawable drawable2, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            return new AssetSimpleDataBean(obj, drawable, charSequence, charSequence2, charSequence3, drawable2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetSimpleDataBean)) {
                return false;
            }
            AssetSimpleDataBean assetSimpleDataBean = (AssetSimpleDataBean) obj;
            return Intrinsics.EZpvd(this.mainIconImgRes, assetSimpleDataBean.mainIconImgRes) && Intrinsics.EZpvd(this.mainDefaultIcon, assetSimpleDataBean.mainDefaultIcon) && Intrinsics.EZpvd(this.numContent, assetSimpleDataBean.numContent) && Intrinsics.EZpvd(this.unitContent, assetSimpleDataBean.unitContent) && Intrinsics.EZpvd(this.subTitleContent, assetSimpleDataBean.subTitleContent) && Intrinsics.EZpvd(this.titleIconDrawable, assetSimpleDataBean.titleIconDrawable) && Intrinsics.EZpvd(this.titleIconCallback, assetSimpleDataBean.titleIconCallback);
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
        public final CharSequence getNumContent() {
            return this.numContent;
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
        public final CharSequence getUnitContent() {
            return this.unitContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Object obj = this.mainIconImgRes;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Drawable drawable = this.mainDefaultIcon;
            int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
            int iHashCode3 = this.numContent.hashCode();
            int iHashCode4 = this.unitContent.hashCode();
            int iHashCode5 = this.subTitleContent.hashCode();
            Drawable drawable2 = this.titleIconDrawable;
            int iHashCode6 = drawable2 == null ? 0 : drawable2.hashCode();
            Function0<Unit> function0 = this.titleIconCallback;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function0 != null ? function0.hashCode() : 0);
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
        public final void setNumContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.numContent = charSequence;
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
        public final void setUnitContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.unitContent = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            Object obj = this.mainIconImgRes;
            Drawable drawable = this.mainDefaultIcon;
            CharSequence charSequence = this.numContent;
            CharSequence charSequence2 = this.unitContent;
            CharSequence charSequence3 = this.subTitleContent;
            return "AssetSimpleDataBean(mainIconImgRes=" + obj + ", mainDefaultIcon=" + drawable + ", numContent=" + ((Object) charSequence) + ", unitContent=" + ((Object) charSequence2) + ", subTitleContent=" + ((Object) charSequence3) + ", titleIconDrawable=" + this.titleIconDrawable + ", titleIconCallback=" + this.titleIconCallback + ")";
        }

        public AssetSimpleDataBean(Object obj, Drawable drawable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, Drawable drawable2, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            this.mainIconImgRes = obj;
            this.mainDefaultIcon = drawable;
            this.numContent = charSequence;
            this.unitContent = charSequence2;
            this.subTitleContent = charSequence3;
            this.titleIconDrawable = drawable2;
            this.titleIconCallback = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r7v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r8v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.CharSequence))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r12v0 android.graphics.drawable.Drawable))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:125) call: com.okinc.web3Uilib.bean.TransactionAssetInfoBean.AssetSimpleDataBean.<init>(java.lang.Object, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ AssetSimpleDataBean(Object obj, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : charSequence, (i & 8) != 0 ? "" : charSequence2, (i & 16) != 0 ? "" : charSequence3, (i & 32) != 0 ? null : drawable2, (i & 64) != 0 ? null : function0);
        }
    }
}
