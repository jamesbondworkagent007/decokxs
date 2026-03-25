package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42952rgC extends ConstraintLayout {
    public float AEQbTJ;
    public float EZpvd;
    public androidx.fragment.app.Fragment KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42952rgC(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestPaddingBottom(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestPaddingTop(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.rgC.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C42952rgC(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42952rgC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View.inflate(context, qZH.ActionBar.dHguZz, this);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42952rgC.KWHzl();
            }
        });
        this.AEQbTJ = 32.0f;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String KWHzl() {
        return "BoostCard" + java.lang.System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.util.List<androidx.fragment.app.Fragment> fragments;
        java.lang.Object next;
        java.lang.Object next2;
        super.onAttachedToWindow();
        try {
            Result.Application application = Result.Companion;
            try {
                objM7377constructorimpl2 = Result.m7377constructorimpl(ViewKt.findFragment(this));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj = null;
            obj = null;
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = null;
            }
            androidx.fragment.app.Fragment fragment = (AbstractC43061riF) ((androidx.fragment.app.Fragment) objM7377constructorimpl2);
            if (fragment == null) {
                android.content.Context context = getContext();
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
                    fragment = null;
                } else {
                    java.util.Iterator<T> it = fragments.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) next;
                        if ((fragment2 instanceof AbstractC43061riF) && ((AbstractC43061riF) fragment2).isResumed()) {
                            break;
                        }
                    }
                    fragment = (androidx.fragment.app.Fragment) next;
                }
            }
            this.KWHzl = fragment;
            if (fragment == null) {
                android.content.Context context2 = getContext();
                FragmentActivity fragmentActivity2 = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
                if (fragmentActivity2 != null) {
                    pUU.KWHzl("MarketBoostBanner", "try to add card to activity");
                    InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(pZN.class);
                    androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    obj = (pZN) C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, supportFragmentManager2, qZH.StateListAnimator.config, null, null, AEQbTJ(), 12, null);
                }
            } else if (fragment != null) {
                java.util.List<androidx.fragment.app.Fragment> fragments2 = fragment.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "");
                java.util.Iterator<T> it2 = fragments2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (((androidx.fragment.app.Fragment) next2) instanceof pZN) {
                            break;
                        }
                    }
                }
                androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) next2;
                if (fragment3 != null) {
                    androidx.fragment.app.Fragment fragment4 = Intrinsics.EZpvd(fragment3, this.copydefault) ^ true ? fragment3 : null;
                    if (fragment4 != null) {
                        pUU.KWHzl("MarketBoostBanner", "try to remove card");
                        fragment.getChildFragmentManager().beginTransaction().remove(fragment4).commitNowAllowingStateLoss();
                        pUU.KWHzl("MarketBoostBanner", "try to remove card success");
                    }
                }
                if (this.copydefault == null) {
                    pZN pzn = new pZN();
                    this.copydefault = pzn;
                    pUU.KWHzl("MarketBoostBanner", "try to add card");
                    fragment.getChildFragmentManager().beginTransaction().add(qZH.StateListAnimator.config, pzn, pzn.getTag()).commitAllowingStateLoss();
                    pUU.KWHzl("MarketBoostBanner", "try to add card");
                }
                obj = Unit.INSTANCE;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
        } catch (java.lang.Throwable th2) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("MarketBoostBanner", "OKMarketBoostCardView onAttachedToWindow error:" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
    }

    public final void EZpvd() {
        androidx.fragment.app.Fragment fragment = this.copydefault;
        pZN pzn = fragment instanceof pZN ? (pZN) fragment : null;
        if (pzn != null) {
            pzn.OLrzqt();
        }
    }

    public final void OLrzqt(float f, float f2) {
        this.AEQbTJ = f;
        this.EZpvd = f2;
        setPadding(getPaddingLeft(), C55298xhM.dp2px$default(f, null, 1, null), getPaddingRight(), C55298xhM.dp2px$default(f2, null, 1, null));
    }

    public final void OLrzqt() {
        setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
    }

    public final void AhwBna() {
        setPadding(getPaddingLeft(), C55298xhM.dp2px$default(this.AEQbTJ, null, 1, null), getPaddingRight(), C55298xhM.dp2px$default(this.EZpvd, null, 1, null));
    }
}
