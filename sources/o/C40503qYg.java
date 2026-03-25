package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40503qYg extends C40499qYc implements qXK {
    public boolean AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public C55113xdn fARcdN;
    public boolean fetchVPNInfo;
    public java.util.Set<android.view.View> isConnected;
    public Application values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40503qYg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40503qYg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEmptyNestedScrollingEnabled(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadingTopMargin(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.qYg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40503qYg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40503qYg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = true;
        this.fetchVPNInfo = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, pVX.FragmentManager.DCJXGO, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.DbNXlk = (int) typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.ffGIBT, C55298xhM.dp$default(0, (android.content.Context) null, 1, (java.lang.Object) null));
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(pVX.FragmentManager.getPostValueLengthLimit, true);
        this.AkhnZx = (int) typedArrayObtainStyledAttributes.getDimension(pVX.FragmentManager.zuWLRA, C55298xhM.dp$default(0, (android.content.Context) null, 1, (java.lang.Object) null));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        AYXKKw();
    }

    public final void setEnableAnimateLayoutChanges(boolean z) {
        this.AhwBna = z;
        AYXKKw();
    }

    public final void AYXKKw() {
        if (this.AhwBna) {
            setLayoutTransition(new android.animation.LayoutTransition());
            android.animation.LayoutTransition layoutTransition = getLayoutTransition();
            if (layoutTransition != null) {
                layoutTransition.setAnimateParentHierarchy(false);
                return;
            }
            return;
        }
        setLayoutTransition(null);
    }

    public void values() {
        KWHzl(true);
    }

    @Override // o.qXK
    public void AEQbTJ(int i, int i2, int i3, int i4, @NotNull Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        java.lang.String str = (numValueOf == null || (strAYXKKw3 = C33070mpX.AYXKKw(numValueOf.intValue())) == null) ? "" : strAYXKKw3;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        java.lang.String str2 = (numValueOf2 == null || (strAYXKKw2 = C33070mpX.AYXKKw(numValueOf2.intValue())) == null) ? "" : strAYXKKw2;
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        AEQbTJ(str, str2, (num == null || (strAYXKKw = C33070mpX.AYXKKw(num.intValue())) == null) ? "" : strAYXKKw, i4, function0);
    }

    public static final void copydefault(C55173xeu c55173xeu, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, final Function0<Unit> function0) {
        c55173xeu.setEmptyTypeImage(i);
        if (str == null) {
            str = "";
        }
        c55173xeu.setTitle(str);
        if (str2 == null) {
            str2 = "";
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        if (str3 == null) {
            str3 = "";
        }
        c55173xeu.setRetry(str3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.qYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40503qYg.copydefault(function0, view);
            }
        });
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final Unit AEQbTJ(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, C55173xeu c55173xeu) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        copydefault(c55173xeu, i, str, str2, str3, function0);
        return Unit.INSTANCE;
    }

    @Override // o.qXK
    public void EZpvd(int i, int i2, int i3, @NotNull Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf == null || (strAYXKKw = C33070mpX.AYXKKw(numValueOf.intValue())) == null) {
            strAYXKKw = "";
        }
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 == null || (strAYXKKw2 = C33070mpX.AYXKKw(numValueOf2.intValue())) == null) {
            strAYXKKw2 = "";
        }
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        if (num != null && (strAYXKKw3 = C33070mpX.AYXKKw(num.intValue())) != null) {
            str = strAYXKKw3;
        }
        copydefault(strAYXKKw, strAYXKKw2, str, function0);
    }

    public static final void AEQbTJ(C55173xeu c55173xeu, java.lang.String str, java.lang.String str2, java.lang.String str3, final Function0<Unit> function0) {
        c55173xeu.setEmptyTypeImage(8);
        if (str == null) {
            str = "";
        }
        c55173xeu.setTitle(str);
        if (str2 == null) {
            str2 = "";
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        if (str3 == null) {
            str3 = "";
        }
        c55173xeu.setRetry(str3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.qYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40503qYg.AEQbTJ(function0, view);
            }
        });
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, C55173xeu c55173xeu) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        AEQbTJ(c55173xeu, str, str2, str3, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(long j, C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.KWHzl(j);
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        Application application = this.values;
        if (application != null) {
            removeView(application);
        }
        C55113xdn c55113xdn = this.fARcdN;
        if (c55113xdn != null) {
            removeView(c55113xdn);
        }
        this.values = null;
        this.fARcdN = null;
        for (android.view.View view : ViewGroupKt.getChildren(this)) {
            java.util.Set<android.view.View> set = this.isConnected;
            if (set == null || !set.contains(view)) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    public final void AEQbTJ(Function1<? super C55113xdn, Unit> function1) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55113xdn c55113xdn = new C55113xdn(context, null, 0, 6, null);
        c55113xdn.setLayoutParams(OLrzqt());
        addView(c55113xdn);
        this.fARcdN = c55113xdn;
        EZpvd(c55113xdn);
        C55113xdn c55113xdn2 = this.fARcdN;
        if (c55113xdn2 != null) {
            c55113xdn2.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        C55113xdn c55113xdn3 = this.fARcdN;
        if (c55113xdn3 != null) {
            function1.invoke(c55113xdn3);
        }
    }

    public final void copydefault(Function1<? super C55173xeu, Unit> function1) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Application application = new Application(context, EZpvd(), valueOf());
        addView(application, 0);
        this.values = application;
        C55173xeu c55173xeuKWHzl = application.KWHzl();
        if (c55173xeuKWHzl != null) {
            function1.invoke(c55173xeuKWHzl);
        }
    }

    public void EZpvd(@NotNull C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.setAnimation(C52761wXj.PendingIntent.isConnected);
    }

    public ConstraintLayout.LayoutParams EZpvd() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.DbNXlk;
        return layoutParams;
    }

    public ConstraintLayout.LayoutParams OLrzqt() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.rightToRight = 0;
        layoutParams.bottomToBottom = 0;
        return layoutParams;
    }

    public final void setContentExcludeViews(@NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        if (this.isConnected == null) {
            this.isConnected = new LinkedHashSet();
        }
        java.util.Set<android.view.View> set = this.isConnected;
        if (set != null) {
            C56406yEe.KWHzl(set, viewArr);
        }
    }

    public final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Set<android.view.View> set = this.isConnected;
        if (set != null) {
            set.remove(view);
        }
    }

    public final C55173xeu gEmmrt() {
        Application application = this.values;
        if (application != null) {
            return application.KWHzl();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.qYg$Application */
    public static final class Application extends NestedScrollView {
        public final C55173xeu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55173xeu KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.content.Context context, @NotNull ConstraintLayout.LayoutParams layoutParams, boolean z) {
            super(context, null, 0);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(layoutParams, "");
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setNestedScrollingEnabled(z);
            C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
            this.copydefault = c55173xeu;
            ConstraintLayout constraintLayout = new ConstraintLayout(context);
            constraintLayout.addView(c55173xeu, layoutParams);
            addView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public void AEQbTJ(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i, @NotNull final Function0<Unit> function0) {
        C55173xeu c55173xeuKWHzl;
        Intrinsics.checkNotNullParameter(function0, "");
        Application application = this.values;
        if (application == null || application.getVisibility() != 0) {
            KWHzl(false);
            copydefault(new Function1() { // from class: o.qYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40503qYg.AEQbTJ(i, str, str2, str3, function0, (C55173xeu) obj);
                }
            });
            return;
        }
        Application application2 = this.values;
        if (application2 == null || (c55173xeuKWHzl = application2.KWHzl()) == null) {
            return;
        }
        copydefault(c55173xeuKWHzl, i, str, str2, str3, function0);
    }

    @Override // o.qXK
    public void copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, @NotNull final Function0<Unit> function0) {
        C55173xeu c55173xeuKWHzl;
        Intrinsics.checkNotNullParameter(function0, "");
        Application application = this.values;
        if (application == null || application.getVisibility() != 0) {
            KWHzl(false);
            copydefault(new Function1() { // from class: o.qYf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40503qYg.OLrzqt(str, str2, str3, function0, (C55173xeu) obj);
                }
            });
            return;
        }
        Application application2 = this.values;
        if (application2 == null || (c55173xeuKWHzl = application2.KWHzl()) == null) {
            return;
        }
        AEQbTJ(c55173xeuKWHzl, str, str2, str3, function0);
    }

    @Override // o.qXK
    public void copydefault(final long j) {
        C55113xdn c55113xdn = this.fARcdN;
        if (c55113xdn == null || c55113xdn.getVisibility() != 0) {
            KWHzl(false);
            AEQbTJ(new Function1() { // from class: o.qYj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40503qYg.copydefault(j, (C55113xdn) obj);
                }
            });
        } else {
            C55113xdn c55113xdn2 = this.fARcdN;
            if (c55113xdn2 != null) {
                c55113xdn2.KWHzl(j);
            }
        }
    }
}
