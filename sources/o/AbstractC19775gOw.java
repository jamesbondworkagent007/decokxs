package o;

import androidx.lifecycle.Observer;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19775gOw extends C23404hxb {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public hDH EZpvd;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gOE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC19775gOw.copydefault(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gOC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(AbstractC19775gOw.AEQbTJ(this.KWHzl));
        }
    });

    /* JADX INFO: renamed from: o.gOw$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public abstract AbstractC19760gOh AEQbTJ(boolean z);

    public abstract void KWHzl(ExpireTimeData expireTimeData);

    public abstract gOB OLrzqt(@NotNull java.lang.String str);

    public abstract gOJ OLrzqt();

    /* JADX INFO: renamed from: o.gOw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gOw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String copydefault(AbstractC19775gOw abstractC19775gOw) {
        android.os.Bundle arguments = abstractC19775gOw.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("id") : null;
        return string == null ? "" : string;
    }

    private final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean AEQbTJ(AbstractC19775gOw abstractC19775gOw) {
        android.os.Bundle arguments = abstractC19775gOw.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("data");
        }
        return false;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hDH hdhEZpvd = hDH.EZpvd(layoutInflater, viewGroup, false);
        this.EZpvd = hdhEZpvd;
        if (hdhEZpvd != null) {
            return hdhEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl();
        OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19775gOw.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        OLrzqt().KWHzl().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19775gOw.EZpvd(this.KWHzl, (ExpireTimeData) obj);
            }
        }));
        OLrzqt().AEQbTJ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19775gOw.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(AbstractC19775gOw abstractC19775gOw, java.lang.Boolean bool) {
        abstractC19775gOw.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC19775gOw abstractC19775gOw, ExpireTimeData expireTimeData) {
        if (!Intrinsics.EZpvd(expireTimeData, ExpireTimeData.Companion.OLrzqt())) {
            abstractC19775gOw.KWHzl(expireTimeData);
        }
        abstractC19775gOw.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC19775gOw abstractC19775gOw, kotlin.Pair pair) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = abstractC19775gOw.getChildFragmentManager().findFragmentByTag("LIMIT_CUSTOM_DATE_DIALOG_FRAGMENT");
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = abstractC19775gOw.AEQbTJ(abstractC19775gOw.AEQbTJ());
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = abstractC19775gOw.getChildFragmentManager().findFragmentByTag("LIMIT_EXPIRE_DIALOG_FRAGMENT_TAG");
        if (fragmentFindFragmentByTag2 == null) {
            return Unit.INSTANCE;
        }
        if (fragmentFindFragmentByTag instanceof AbstractC19760gOh) {
            ((AbstractC19760gOh) fragmentFindFragmentByTag).copydefault(((java.lang.Number) pair.getSecond()).intValue());
        }
        abstractC19775gOw.getChildFragmentManager().beginTransaction().hide(fragmentFindFragmentByTag2).show(fragmentFindFragmentByTag).commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        AbstractC19760gOh abstractC19760gOhAEQbTJ = AEQbTJ(AEQbTJ());
        gOB gobOLrzqt = OLrzqt(EZpvd());
        hDH hdh = this.EZpvd;
        int id = 0;
        fragmentTransactionBeginTransaction.replace((hdh == null || (frameLayout2 = hdh.KWHzl) == null) ? 0 : frameLayout2.getId(), gobOLrzqt, "LIMIT_EXPIRE_DIALOG_FRAGMENT_TAG");
        hDH hdh2 = this.EZpvd;
        if (hdh2 != null && (frameLayout = hdh2.KWHzl) != null) {
            id = frameLayout.getId();
        }
        fragmentTransactionBeginTransaction.add(id, abstractC19760gOhAEQbTJ, "LIMIT_CUSTOM_DATE_DIALOG_FRAGMENT");
        if (!AEQbTJ()) {
            fragmentTransactionBeginTransaction.hide(abstractC19760gOhAEQbTJ);
        } else {
            fragmentTransactionBeginTransaction.hide(gobOLrzqt);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final void copydefault() {
        android.widget.FrameLayout frameLayout;
        if (AEQbTJ()) {
            dismissAllowingStateLoss();
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("LIMIT_CUSTOM_DATE_DIALOG_FRAGMENT");
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = AEQbTJ(AEQbTJ());
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("LIMIT_EXPIRE_DIALOG_FRAGMENT_TAG");
        if (!fragmentFindFragmentByTag.isAdded()) {
            hDH hdh = this.EZpvd;
            fragmentTransactionBeginTransaction.add((hdh == null || (frameLayout = hdh.KWHzl) == null) ? 0 : frameLayout.getId(), fragmentFindFragmentByTag, "LIMIT_CUSTOM_DATE_DIALOG_FRAGMENT");
        }
        fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag);
        if (fragmentFindFragmentByTag2 != null) {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd = null;
    }
}
