package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57523yjy extends ConstraintLayout {
    public final C57450yie AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57523yjy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57523yjy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.yjy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57523yjy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57523yjy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57450yie c57450yieKWHzl = C57450yie.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57450yieKWHzl, "");
        this.AEQbTJ = c57450yieKWHzl;
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX INFO: renamed from: o.yjy$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public final android.graphics.drawable.Drawable AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.Object AhwBna;
        public final boolean EZpvd;
        public final java.lang.Object KWHzl;
        public final java.lang.String OLrzqt;
        public final Function0<Unit> copydefault;
        public final android.graphics.drawable.Drawable djBIcL;
        public final java.lang.Object gEmmrt;
        public final android.graphics.drawable.Drawable valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, java.lang.Object obj2, android.graphics.drawable.Drawable drawable2, java.lang.Object obj3, android.graphics.drawable.Drawable drawable3, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, str2, obj, drawable, z, obj2, drawable2, obj3, drawable3, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && this.EZpvd == actionBar.EZpvd && Intrinsics.EZpvd(this.AhwBna, actionBar.AhwBna) && Intrinsics.EZpvd(this.valueOf, actionBar.valueOf) && Intrinsics.EZpvd(this.gEmmrt, actionBar.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, actionBar.djBIcL) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            java.lang.String str = this.OLrzqt;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.KWHzl;
            int iHashCode3 = obj == null ? 0 : obj.hashCode();
            android.graphics.drawable.Drawable drawable = this.AEQbTJ;
            int iHashCode4 = drawable == null ? 0 : drawable.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.Object obj2 = this.AhwBna;
            int iHashCode6 = obj2 == null ? 0 : obj2.hashCode();
            android.graphics.drawable.Drawable drawable2 = this.valueOf;
            int iHashCode7 = drawable2 == null ? 0 : drawable2.hashCode();
            java.lang.Object obj3 = this.gEmmrt;
            int iHashCode8 = obj3 == null ? 0 : obj3.hashCode();
            android.graphics.drawable.Drawable drawable3 = this.djBIcL;
            int iHashCode9 = drawable3 == null ? 0 : drawable3.hashCode();
            Function0<Unit> function0 = this.copydefault;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkInfoBean(title=" + this.AYXKKw + ", networkName=" + this.OLrzqt + ", networkIcon=" + this.KWHzl + ", networkIconDefault=" + this.AEQbTJ + ", showArrow=" + this.EZpvd + ", sourceNetworkIcon=" + this.AhwBna + ", sourceNetworkIconDefault=" + this.valueOf + ", targetNetworkIcon=" + this.gEmmrt + ", targetNetworkIconDefault=" + this.djBIcL + ", clickCallback=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable valueOf() {
            return this.djBIcL;
        }

        public ActionBar(@NotNull java.lang.String str, java.lang.String str2, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, java.lang.Object obj2, android.graphics.drawable.Drawable drawable2, java.lang.Object obj3, android.graphics.drawable.Drawable drawable3, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = str;
            this.OLrzqt = str2;
            this.KWHzl = obj;
            this.AEQbTJ = drawable;
            this.EZpvd = z;
            this.AhwBna = obj2;
            this.valueOf = drawable2;
            this.gEmmrt = obj3;
            this.djBIcL = drawable3;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r13v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r14v0 android.graphics.drawable.Drawable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001f: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r16v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0027: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r17v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r18v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r19v0 android.graphics.drawable.Drawable))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x003f: ARITH (r21v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r20v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, java.lang.Object, android.graphics.drawable.Drawable, boolean, java.lang.Object, android.graphics.drawable.Drawable, java.lang.Object, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:33) call: o.yjy.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.Object, android.graphics.drawable.Drawable, boolean, java.lang.Object, android.graphics.drawable.Drawable, java.lang.Object, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.Object obj, android.graphics.drawable.Drawable drawable, boolean z, java.lang.Object obj2, android.graphics.drawable.Drawable drawable2, java.lang.Object obj3, android.graphics.drawable.Drawable drawable3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : obj2, (i & 64) != 0 ? null : drawable2, (i & 128) != 0 ? null : obj3, (i & 256) != 0 ? null : drawable3, (i & 512) == 0 ? function0 : null);
        }
    }

    public final void setData(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ.values.setText(actionBar.AYXKKw());
        if (actionBar.OLrzqt() != null) {
            EZpvd(actionBar);
        } else {
            copydefault(actionBar);
        }
        EZpvd(actionBar.AEQbTJ());
    }

    public final void EZpvd(ActionBar actionBar) {
        android.widget.LinearLayout linearLayout = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.widget.LinearLayout linearLayout2 = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        this.AEQbTJ.valueOf.setText(actionBar.OLrzqt());
        android.widget.TextView textView = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strOLrzqt = actionBar.OLrzqt();
        textView.setVisibility((strOLrzqt == null || strOLrzqt.length() <= 0) ? 8 : 0);
        AppCompatImageView appCompatImageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        setNetworkIcon(appCompatImageView, actionBar.KWHzl(), actionBar.copydefault());
        AppCompatImageView appCompatImageView2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(actionBar.EZpvd() ? 0 : 8);
    }

    public final void copydefault(ActionBar actionBar) {
        android.widget.LinearLayout linearLayout = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        AppCompatImageView appCompatImageView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        setNetworkIcon(appCompatImageView, actionBar.gEmmrt(), actionBar.djBIcL());
        AppCompatImageView appCompatImageView2 = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        setNetworkIcon(appCompatImageView2, actionBar.AhwBna(), actionBar.valueOf());
        AppCompatImageView appCompatImageView3 = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        appCompatImageView3.setVisibility(actionBar.EZpvd() ? 0 : 8);
    }

    public final void setNetworkIcon(android.widget.ImageView imageView, java.lang.Object obj, android.graphics.drawable.Drawable drawable) {
        if (obj != null || drawable != null) {
            imageView.setVisibility(0);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView);
            if (obj == null) {
                obj = drawable;
            }
            Intrinsics.copydefault(componentCallbacks2C5333NrKWHzl.KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).gEmmrt().EZpvd(imageView));
            return;
        }
        imageView.setVisibility(8);
    }

    private final void EZpvd(Function0<Unit> function0) {
        if (function0 == null) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            setOnClickListener(new TaskDescription(this, 1000L, function0));
        }
    }

    /* JADX INFO: renamed from: o.yjy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
