package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexui.main.swap.history.detail.widget.appbar.data.AppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hXK extends ConstraintLayout {
    public final C21631hGn EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.hXK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hXK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXK(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21631hGn c21631hGnEZpvd = C21631hGn.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21631hGnEZpvd, "");
        this.EZpvd = c21631hGnEZpvd;
        c21631hGnEZpvd.copydefault.setImageResource(KWHzl(context));
        if (!isInEditMode()) {
            setPadding(getPaddingLeft(), C33570myu.gEmmrt(context), getPaddingRight(), getPaddingBottom());
        }
        AppCompatImageView appCompatImageView = c21631hGnEZpvd.copydefault;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, context, this));
        c21631hGnEZpvd.OLrzqt.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.hXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                hXK.KWHzl(this.OLrzqt, context, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    public static final void KWHzl(hXK hxk, android.content.Context context, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width = hxk.getWidth();
        int iMax = java.lang.Math.max(hxk.EZpvd.KWHzl.getWidth(), hxk.EZpvd.OLrzqt.getWidth());
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        hXQ hxq = hxk.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(hxq, "");
        ViewGroup.LayoutParams layoutParams = hxq.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = (width - (iMax * 2)) - iOLrzqt;
            hxq.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setOrderState(@NotNull AppBarState appBarState) {
        Intrinsics.checkNotNullParameter(appBarState, "");
        hXJ hxj = this.EZpvd.EZpvd;
        int i = 8;
        if (KWHzl(appBarState)) {
            if (!appBarState.isLimit()) {
                this.EZpvd.AYXKKw.setVisibility(8);
            }
            i = 0;
        }
        hxj.setVisibility(i);
        if (!KWHzl(appBarState)) {
            this.EZpvd.EZpvd.KWHzl();
        }
        this.EZpvd.AYXKKw.setState(appBarState.getState(), appBarState.isLimit());
    }

    public final void setCountDown(long j, long j2) {
        hXJ hxj = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(hxj, "");
        hxj.setVisibility(0);
        this.EZpvd.EZpvd.setCountDownEstimatedTime(C33129mqd.valueOf(C23313hvq.mulCheckS$default(java.lang.Long.valueOf(j), 1000, null, null, null, 14, null)), j2);
    }

    public final void OLrzqt() {
        hXQ hxq = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(hxq, "");
        hxq.setVisibility(0);
        hXJ hxj = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(hxj, "");
        hxj.setVisibility(8);
    }

    public final void AEQbTJ() {
        this.EZpvd.EZpvd.KWHzl();
    }

    public final void setCountDownListener(Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
        this.EZpvd.EZpvd.setOnCountDownFinish(function2);
    }

    public final void setCountDownListener(Function1<? super java.lang.String, Unit> function1) {
        this.EZpvd.EZpvd.setOnCountDownFinish(function1);
    }

    public final void EZpvd(android.content.Context context) {
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).onBackPressed();
        } else if (context instanceof android.content.ContextWrapper) {
            android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            EZpvd(baseContext);
        }
    }

    public final int KWHzl(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.QVsKAR, typedValue, true);
        return typedValue.resourceId;
    }

    public final boolean KWHzl(AppBarState appBarState) {
        return appBarState.isLimit() ? Intrinsics.EZpvd((java.lang.Object) appBarState.getState(), (java.lang.Object) "20") : Intrinsics.EZpvd((java.lang.Object) appBarState.getState(), (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) appBarState.getState(), (java.lang.Object) "-4");
    }

    public final void copydefault() {
        hXQ hxq = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(hxq, "");
        hxq.setVisibility(0);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ hXK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.content.Context context, hXK hxk) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = context;
            this.copydefault = hxk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.KWHzl;
                java.lang.Object systemService = this.EZpvd.getSystemService("input_method");
                Intrinsics.copydefault(systemService, "");
                ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(appCompatImageView.getWindowToken(), 0);
                this.copydefault.EZpvd(this.EZpvd);
            }
        }
    }
}
