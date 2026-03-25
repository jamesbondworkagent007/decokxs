package com.okinc.web3Uilib.bean;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TransactionDappInfoBean {
    public static final int $stable = 8;
    private Object mainIcon;
    private Drawable mainIconDefault;
    private Object subIcon;
    private String subTitle;
    private String title;
    private Object titleIcon;
    private Function0<Unit> titleIconCallback;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionDappInfoBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.web3Uilib.bean.TransactionDappInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionDappInfoBean copy$default(TransactionDappInfoBean transactionDappInfoBean, Object obj, Drawable drawable, Object obj2, String str, String str2, Object obj3, Function0 function0, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = transactionDappInfoBean.mainIcon;
        }
        if ((i & 2) != 0) {
            drawable = transactionDappInfoBean.mainIconDefault;
        }
        Drawable drawable2 = drawable;
        if ((i & 4) != 0) {
            obj2 = transactionDappInfoBean.subIcon;
        }
        Object obj5 = obj2;
        if ((i & 8) != 0) {
            str = transactionDappInfoBean.title;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = transactionDappInfoBean.subTitle;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            obj3 = transactionDappInfoBean.titleIcon;
        }
        Object obj6 = obj3;
        if ((i & 64) != 0) {
            function0 = transactionDappInfoBean.titleIconCallback;
        }
        return transactionDappInfoBean.copy(obj, drawable2, obj5, str3, str4, obj6, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component1() {
        return this.mainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component2() {
        return this.mainIconDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component3() {
        return this.subIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.titleIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component7() {
        return this.titleIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionDappInfoBean copy(Object obj, Drawable drawable, Object obj2, @NotNull String str, @NotNull String str2, Object obj3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionDappInfoBean(obj, drawable, obj2, str, str2, obj3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionDappInfoBean)) {
            return false;
        }
        TransactionDappInfoBean transactionDappInfoBean = (TransactionDappInfoBean) obj;
        return Intrinsics.EZpvd(this.mainIcon, transactionDappInfoBean.mainIcon) && Intrinsics.EZpvd(this.mainIconDefault, transactionDappInfoBean.mainIconDefault) && Intrinsics.EZpvd(this.subIcon, transactionDappInfoBean.subIcon) && Intrinsics.EZpvd((Object) this.title, (Object) transactionDappInfoBean.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) transactionDappInfoBean.subTitle) && Intrinsics.EZpvd(this.titleIcon, transactionDappInfoBean.titleIcon) && Intrinsics.EZpvd(this.titleIconCallback, transactionDappInfoBean.titleIconCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getMainIcon() {
        return this.mainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getMainIconDefault() {
        return this.mainIconDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getSubIcon() {
        return this.subIcon;
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
    public final Object getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getTitleIconCallback() {
        return this.titleIconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Object obj = this.mainIcon;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Drawable drawable = this.mainIconDefault;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        Object obj2 = this.subIcon;
        int iHashCode3 = obj2 == null ? 0 : obj2.hashCode();
        int iHashCode4 = this.title.hashCode();
        int iHashCode5 = this.subTitle.hashCode();
        Object obj3 = this.titleIcon;
        int iHashCode6 = obj3 == null ? 0 : obj3.hashCode();
        Function0<Unit> function0 = this.titleIconCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainIcon(Object obj) {
        this.mainIcon = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainIconDefault(Drawable drawable) {
        this.mainIconDefault = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubIcon(Object obj) {
        this.subIcon = obj;
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
    public final void setTitleIcon(Object obj) {
        this.titleIcon = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleIconCallback(Function0<Unit> function0) {
        this.titleIconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionDappInfoBean(mainIcon=" + this.mainIcon + ", mainIconDefault=" + this.mainIconDefault + ", subIcon=" + this.subIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", titleIcon=" + this.titleIcon + ", titleIconCallback=" + this.titleIconCallback + ")";
    }

    public TransactionDappInfoBean(Object obj, Drawable drawable, Object obj2, @NotNull String str, @NotNull String str2, Object obj3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mainIcon = obj;
        this.mainIconDefault = drawable;
        this.subIcon = obj2;
        this.title = str;
        this.subTitle = str2;
        this.titleIcon = obj3;
        this.titleIconCallback = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r7v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r8v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r12v0 java.lang.Object))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:24) call: com.okinc.web3Uilib.bean.TransactionDappInfoBean.<init>(java.lang.Object, android.graphics.drawable.Drawable, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionDappInfoBean(Object obj, Drawable drawable, Object obj2, String str, String str2, Object obj3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : obj3, (i & 64) != 0 ? null : function0);
    }
}
