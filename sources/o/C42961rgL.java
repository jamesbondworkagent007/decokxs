package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import com.okinc.okmarket.home.CardQuoteFragment;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42961rgL extends ConstraintLayout {
    public androidx.fragment.app.Fragment EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public androidx.fragment.app.Fragment OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42961rgL(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.rgL.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C42961rgL(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42961rgL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View.inflate(context, qZH.ActionBar.gkZNMa, this);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42961rgL.OLrzqt();
            }
        });
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String OLrzqt() {
        return "MarketQuote" + java.lang.System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        java.lang.Object objM7377constructorimpl;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.util.List<androidx.fragment.app.Fragment> fragments;
        java.lang.Object next;
        super.onAttachedToWindow();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (AbstractC43061riF) ((androidx.fragment.app.Fragment) objM7377constructorimpl);
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
        this.OLrzqt = fragment;
        if (fragment == null) {
            android.content.Context context2 = getContext();
            FragmentActivity fragmentActivity2 = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
            if (fragmentActivity2 != null) {
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(CardQuoteFragment.class);
                androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                return;
            }
            return;
        }
        if (fragment != null) {
            java.util.List<androidx.fragment.app.Fragment> fragments2 = fragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : fragments2) {
                if (((androidx.fragment.app.Fragment) obj) instanceof CardQuoteFragment) {
                    arrayList.add(obj);
                }
            }
            androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (fragment3 != null) {
                androidx.fragment.app.Fragment fragment4 = Intrinsics.EZpvd(fragment3, this.EZpvd) ^ true ? fragment3 : null;
                if (fragment4 != null) {
                    fragment.getChildFragmentManager().beginTransaction().remove(fragment4).commitNow();
                }
            }
            if (this.EZpvd == null) {
                CardQuoteFragment cardQuoteFragment = new CardQuoteFragment();
                this.EZpvd = cardQuoteFragment;
                fragment.getChildFragmentManager().beginTransaction().add(qZH.StateListAnimator.setLocationManually, cardQuoteFragment, cardQuoteFragment.getTag()).commitAllowingStateLoss();
            }
        }
    }

    public final void AEQbTJ() {
        androidx.fragment.app.Fragment fragment = this.EZpvd;
        CardQuoteFragment cardQuoteFragment = fragment instanceof CardQuoteFragment ? (CardQuoteFragment) fragment : null;
        if (cardQuoteFragment != null) {
            cardQuoteFragment.valueOf();
        }
    }
}
