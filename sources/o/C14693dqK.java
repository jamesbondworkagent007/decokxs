package o;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C14693dqK extends C55008xbo {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14693dqK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14693dqK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.spnCvw int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.dqK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14693dqK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.spnCvw : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14693dqK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setInterceptEvent(true);
        }
        C55009xbp c55009xbpFIwbmz2 = fIwbmz();
        if (c55009xbpFIwbmz2 != null) {
            C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz2, C52761wXj.TaskDescription.OJuSTm, C55298xhM.OLrzqt(24, context), C55298xhM.OLrzqt(24, context), 0, 8, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.copydefault();
        }
    }

    public final void setOnContentViewClickListener(@NotNull Function1<? super C14693dqK, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setOnClickListener(new ActionBar(c55009xbpFIwbmz, 1000L, function1, this));
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        setState(1);
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int i = C52761wXj.TaskDescription.OxVOHk;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(24, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz, i, iOLrzqt, C55298xhM.OLrzqt(24, context2), 0, 8, null);
        }
        dialogFragment.show(fragmentManager, "OKSelectDropdownView");
        fragmentManager.registerFragmentLifecycleCallbacks(new Application(fragmentManager, dialogFragment, this), false);
    }

    /* JADX INFO: renamed from: o.dqK$Application */
    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ androidx.fragment.app.FragmentManager AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.DialogFragment EZpvd;
        public final /* synthetic */ C14693dqK OLrzqt;

        public Application(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.DialogFragment dialogFragment, C14693dqK c14693dqK) {
            this.AEQbTJ = fragmentManager;
            this.EZpvd = dialogFragment;
            this.OLrzqt = c14693dqK;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            this.AEQbTJ.unregisterFragmentLifecycleCallbacks(this);
            if (Intrinsics.EZpvd(this.EZpvd, fragment)) {
                C55009xbp c55009xbpFIwbmz = this.OLrzqt.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz, C52761wXj.TaskDescription.OJuSTm, 0, 0, 0, 14, null);
                }
                C55009xbp c55009xbpFIwbmz2 = this.OLrzqt.fIwbmz();
                if (c55009xbpFIwbmz2 != null) {
                    c55009xbpFIwbmz2.copydefault();
                }
                if (this.OLrzqt.zLjUOn()) {
                    this.OLrzqt.setState(2);
                } else {
                    this.OLrzqt.setState(0);
                }
            }
        }
    }

    public final void setSelectionText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(str);
        }
    }

    public static /* synthetic */ void setStartIconWithIntrinsicBounds$default(C14693dqK c14693dqK, android.graphics.drawable.Drawable drawable, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            android.content.Context context = c14693dqK.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55298xhM.KWHzl(8.0f, context);
        }
        c14693dqK.setStartIconWithIntrinsicBounds(drawable, i);
    }

    public final void setStartIconWithIntrinsicBounds(@NotNull android.graphics.drawable.Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "");
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            c55001xbhAkhnZx.setCompoundDrawablePadding(i);
        }
    }

    public final void KWHzl() {
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setCompoundDrawablesRelative(null, null, null, null);
        }
    }

    public final void copydefault() {
        C54957xaq c54957xaqAEQbTJ;
        android.widget.LinearLayout linearLayout;
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) == null || (linearLayout = c54957xaqAEQbTJ.KWHzl) == null) {
            return;
        }
        linearLayout.setVisibility(4);
    }

    /* JADX INFO: renamed from: o.dqK$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C14693dqK AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, C14693dqK c14693dqK) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = function1;
            this.AEQbTJ = c14693dqK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke(this.AEQbTJ);
            }
        }
    }
}
