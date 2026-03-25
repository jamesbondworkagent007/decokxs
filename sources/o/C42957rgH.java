package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42957rgH extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public WeakReference<qBY> KWHzl;
    public WeakReference<androidx.fragment.app.Fragment> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42957rgH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:16) call: o.rgH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C42957rgH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42957rgH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View.inflate(context, qZH.ActionBar.hfdhUn, this);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42957rgH.EZpvd();
            }
        });
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String EZpvd() {
        return "SearchWidget" + java.lang.System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        java.lang.Object objM7377constructorimpl;
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
        java.lang.Object obj = (AbstractC43061riF) ((androidx.fragment.app.Fragment) objM7377constructorimpl);
        if (obj == null) {
            android.content.Context context = getContext();
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
            if (supportFragmentManager == null || (fragments = supportFragmentManager.getFragments()) == null) {
                obj = null;
            } else {
                java.util.Iterator<T> it = fragments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
                    if ((fragment instanceof AbstractC43061riF) && ((AbstractC43061riF) fragment).isResumed()) {
                        break;
                    }
                }
                obj = (androidx.fragment.app.Fragment) next;
            }
        }
        WeakReference<androidx.fragment.app.Fragment> weakReference = obj != null ? new WeakReference<>(obj) : null;
        this.copydefault = weakReference;
        androidx.fragment.app.Fragment fragment2 = weakReference != null ? weakReference.get() : null;
        if (fragment2 == null) {
            android.content.Context context2 = getContext();
            FragmentActivity fragmentActivity2 = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
            if (fragmentActivity2 != null) {
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(qBY.class);
                androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                qBY qby = (qBY) C33062mpP.findOrReplaceFragment$default(interfaceC56551yJoAEQbTJ, supportFragmentManager2, qZH.StateListAnimator.HJWChPDXdlte, null, null, KWHzl(), 12, null);
                this.KWHzl = new WeakReference<>(qby instanceof qBY ? qby : null);
                return;
            }
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.util.List<androidx.fragment.app.Fragment> fragments2 = childFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "");
        java.util.ArrayList<qBY> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : fragments2) {
            if (obj2 instanceof qBY) {
                arrayList.add(obj2);
            }
        }
        for (qBY qby2 : arrayList) {
            WeakReference<qBY> weakReference2 = this.KWHzl;
            if (!Intrinsics.EZpvd(qby2, weakReference2 != null ? weakReference2.get() : null)) {
                childFragmentManager.beginTransaction().remove(qby2).commitNowAllowingStateLoss();
            }
        }
        WeakReference<qBY> weakReference3 = this.KWHzl;
        if ((weakReference3 != null ? weakReference3.get() : null) == null) {
            qBY qby3 = new qBY();
            childFragmentManager.beginTransaction().add(qZH.StateListAnimator.HJWChPDXdlte, qby3, KWHzl()).commitAllowingStateLoss();
            this.KWHzl = new WeakReference<>(qby3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.fragment.app.Fragment fragment;
        super.onDetachedFromWindow();
        WeakReference<androidx.fragment.app.Fragment> weakReference = this.copydefault;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(qBY.class);
            androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C33062mpP.copydefault(interfaceC56551yJoAEQbTJ, childFragmentManager, KWHzl());
        }
        this.KWHzl = null;
        this.copydefault = null;
    }
}
