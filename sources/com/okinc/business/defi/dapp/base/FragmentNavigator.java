package com.okinc.business.defi.dapp.base;

import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14834dst;
import o.C52761wXj;
import o.C56405yEd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentNavigator {
    public final FragmentManager EZpvd;
    public final Integer KWHzl;
    public final String OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionMode.values().length];
            try {
                iArr[TransactionMode.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionMode.ADD_SHOW_HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public FragmentNavigator(@NotNull FragmentManager fragmentManager, @IdRes Integer num) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd = fragmentManager;
        this.KWHzl = num;
        this.OLrzqt = "FragmentNavigator";
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    public final Fragment OLrzqt() {
        try {
            List<Fragment> fragments = this.EZpvd.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            int size = fragments.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return null;
                }
                Fragment fragment = fragments.get(size);
                if (fragment.isAdded()) {
                    int id = fragment.getId();
                    Integer num = this.KWHzl;
                    if (num != null && id == num.intValue() && !fragment.isHidden()) {
                        return fragment;
                    }
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransactionMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TransactionMode[] $VALUES;
        public static final TransactionMode REPLACE = new TransactionMode("REPLACE", 0);
        public static final TransactionMode ADD_SHOW_HIDE = new TransactionMode("ADD_SHOW_HIDE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TransactionMode[] $values() {
            return new TransactionMode[]{REPLACE, ADD_SHOW_HIDE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TransactionMode> getEntries() {
            return $ENTRIES;
        }

        private TransactionMode(String str, int i) {
        }

        static {
            TransactionMode[] transactionModeArr$values = $values();
            $VALUES = transactionModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(transactionModeArr$values);
        }

        public static TransactionMode valueOf(String str) {
            return (TransactionMode) Enum.valueOf(TransactionMode.class, str);
        }

        public static TransactionMode[] values() {
            return (TransactionMode[]) $VALUES.clone();
        }
    }

    public static final class Application {
        public final int AEQbTJ;
        public final int AYXKKw;
        public final TransactionMode AhwBna;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final int copydefault;
        public final List<Pair<View, String>> djBIcL;
        public final int gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0, 0, 0, 0, false, false, null, null, false, false, 1023, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(i, i2, i3, i4, z, z2, transactionMode, list, z3, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMode AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.AEQbTJ == application.AEQbTJ && this.copydefault == application.copydefault && this.gEmmrt == application.gEmmrt && this.AYXKKw == application.AYXKKw && this.EZpvd == application.EZpvd && this.OLrzqt == application.OLrzqt && this.AhwBna == application.AhwBna && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && this.valueOf == application.valueOf && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((Integer.hashCode(this.AEQbTJ) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Options(enterAnim=" + this.AEQbTJ + ", exitAnim=" + this.copydefault + ", popEnterAnim=" + this.gEmmrt + ", popExitAnim=" + this.AYXKKw + ", addToBackStack=" + this.EZpvd + ", allowStateLoss=" + this.OLrzqt + ", mode=" + this.AhwBna + ", sharedElements=" + this.djBIcL + ", showPreviousFragment=" + this.valueOf + ", closeRootFragment=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Pair<View, String>> valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = i;
            this.copydefault = i2;
            this.gEmmrt = i3;
            this.AYXKKw = i4;
            this.EZpvd = z;
            this.OLrzqt = z2;
            this.AhwBna = transactionMode;
            this.djBIcL = list;
            this.valueOf = z3;
            this.KWHzl = z4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0068: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.wXj.Application.isConnected int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] o.wXj.Application.values int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] o.wXj.Application.DbNXlk int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] o.wXj.Application.AuCTel int) : (r15v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:com.okinc.business.defi.dapp.base.FragmentNavigator$TransactionMode:?: TERNARY null = ((wrap:int:0x0033: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: SGET  A[WRAPPED] (LINE:56) com.okinc.business.defi.dapp.base.FragmentNavigator.TransactionMode.ADD_SHOW_HIDE com.okinc.business.defi.dapp.base.FragmentNavigator$TransactionMode) : (r18v0 com.okinc.business.defi.dapp.base.FragmentNavigator$TransactionMode))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:57)) : (r19v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : true)
 A[MD:(int, int, int, int, boolean, boolean, com.okinc.business.defi.dapp.base.FragmentNavigator$TransactionMode, java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>>, boolean, boolean):void (m)] (LINE:49) call: com.okinc.business.defi.dapp.base.FragmentNavigator.Application.<init>(int, int, int, int, boolean, boolean, com.okinc.business.defi.dapp.base.FragmentNavigator$TransactionMode, java.util.List, boolean, boolean):void type: THIS */
        public /* synthetic */ Application(int i, int i2, int i3, int i4, boolean z, boolean z2, TransactionMode transactionMode, List list, boolean z3, boolean z4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? C52761wXj.Application.isConnected : i, (i5 & 2) != 0 ? C52761wXj.Application.values : i2, (i5 & 4) != 0 ? C52761wXj.Application.DbNXlk : i3, (i5 & 8) != 0 ? C52761wXj.Application.AuCTel : i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? true : z2, (i5 & 64) != 0 ? TransactionMode.ADD_SHOW_HIDE : transactionMode, (i5 & 128) != 0 ? yDY.AhwBna() : list, (i5 & 256) != 0 ? true : z3, (i5 & 512) == 0 ? z4 : true);
        }
    }

    public static /* synthetic */ boolean push$default(FragmentNavigator fragmentNavigator, Fragment fragment, String str, Application application, int i, Object obj) {
        Fragment fragment2;
        Application application2;
        String name = (i & 2) != 0 ? fragment.getClass().getName() : str;
        if ((i & 4) != 0) {
            application2 = new Application(0, 0, 0, 0, false, false, null, null, false, false, 1023, null);
            fragment2 = fragment;
        } else {
            fragment2 = fragment;
            application2 = application;
        }
        return fragmentNavigator.OLrzqt(fragment2, name, application2);
    }

    public final boolean OLrzqt(@NotNull Fragment fragment, @NotNull String str, @NotNull Application application) {
        boolean z;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        if (this.EZpvd.isDestroyed() || this.KWHzl == null) {
            return false;
        }
        try {
            int i = ActionBar.AEQbTJ[application.AhwBna().ordinal()];
            if (i == 1) {
                FragmentTransaction fragmentTransactionKWHzl = KWHzl(application);
                fragmentTransactionKWHzl.replace(this.KWHzl.intValue(), fragment, str);
                fragmentTransactionKWHzl.setPrimaryNavigationFragment(fragment);
                List<Fragment> fragments = this.EZpvd.getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                if (!(fragments instanceof Collection) || !fragments.isEmpty()) {
                    for (Fragment fragment2 : fragments) {
                        if (fragment2.isAdded() && !fragment2.isDetached()) {
                            int id = fragment2.getId();
                            Integer num = this.KWHzl;
                            if (num != null && id == num.intValue()) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (application.copydefault() && z) {
                    fragmentTransactionKWHzl.addToBackStack(str);
                }
                OLrzqt(fragmentTransactionKWHzl, application.AEQbTJ());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                FragmentTransaction fragmentTransactionKWHzl2 = KWHzl(application);
                Fragment fragmentOLrzqt = OLrzqt();
                if (fragmentOLrzqt != null && fragmentOLrzqt.isAdded() && !fragmentOLrzqt.isDetached()) {
                    fragmentTransactionKWHzl2.hide(fragmentOLrzqt);
                    fragmentTransactionKWHzl2.setMaxLifecycle(fragmentOLrzqt, Lifecycle.State.STARTED);
                }
                fragmentTransactionKWHzl2.add(this.KWHzl.intValue(), fragment, str);
                fragmentTransactionKWHzl2.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
                if (application.copydefault()) {
                    fragmentTransactionKWHzl2.addToBackStack(str);
                }
                OLrzqt(fragmentTransactionKWHzl2, application.AEQbTJ());
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean popTo$default(FragmentNavigator fragmentNavigator, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fragmentNavigator.EZpvd(str, z);
    }

    public final boolean EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.EZpvd.getBackStackEntryCount() == 0) {
            return false;
        }
        this.EZpvd.popBackStack(str, z ? 1 : 0);
        return true;
    }

    public static /* synthetic */ boolean popTo$default(FragmentNavigator fragmentNavigator, Class cls, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fragmentNavigator.KWHzl(cls, z);
    }

    public final boolean KWHzl(@NotNull Class<? extends Fragment> cls, boolean z) {
        Intrinsics.checkNotNullParameter(cls, "");
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return EZpvd(name, z);
    }

    public final FragmentTransaction KWHzl(Application application) {
        try {
            FragmentTransaction fragmentTransactionBeginTransaction = this.EZpvd.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            if (application != null) {
                if (application.valueOf().isEmpty()) {
                    fragmentTransactionBeginTransaction.setCustomAnimations(application.KWHzl(), application.OLrzqt(), application.gEmmrt(), application.AYXKKw());
                }
                Iterator<T> it = application.valueOf().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    try {
                        Intrinsics.copydefault(fragmentTransactionBeginTransaction.addSharedElement((View) pair.component1(), (String) pair.component2()));
                    } catch (Exception unused) {
                    }
                }
            }
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            return fragmentTransactionBeginTransaction;
        } catch (Exception e) {
            throw new IllegalStateException("Failed to create transaction", e);
        }
    }

    public final void OLrzqt(FragmentTransaction fragmentTransaction, boolean z) {
        try {
            if (z) {
                fragmentTransaction.commitAllowingStateLoss();
            } else {
                fragmentTransaction.commit();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean OLrzqt(@NotNull Fragment fragment, Application application) {
        Object next;
        Intrinsics.checkNotNullParameter(fragment, "");
        if (!fragment.isAdded()) {
            return false;
        }
        try {
            FragmentTransaction fragmentTransactionKWHzl = KWHzl(application);
            List<Fragment> fragments = this.EZpvd.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            Iterator it = C56405yEd.zLjUOn(fragments).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Fragment fragment2 = (Fragment) next;
                if (fragment2.isAdded() && !Intrinsics.EZpvd(fragment2, fragment)) {
                    break;
                }
            }
            Fragment fragment3 = (Fragment) next;
            Fragment parentFragment = fragment.getParentFragment();
            if ((parentFragment instanceof C14834dst) && ((C14834dst) parentFragment).getChildFragmentManager().getFragments().size() <= 1 && application != null && application.EZpvd()) {
                ((C14834dst) parentFragment).EZpvd(application);
            } else {
                fragmentTransactionKWHzl.remove(fragment);
                if (application != null && application.djBIcL() && fragment3 != null) {
                    fragmentTransactionKWHzl.show(fragment3);
                    fragmentTransactionKWHzl.setMaxLifecycle(fragment3, Lifecycle.State.RESUMED);
                }
            }
            OLrzqt(fragmentTransactionKWHzl, application != null ? application.AEQbTJ() : false);
            return true;
        } catch (Exception e) {
            pUU.copydefault(this.OLrzqt, "closeFragment occur some error: " + e.getMessage());
            return false;
        }
    }

    public static /* synthetic */ boolean closeAllFragments$default(FragmentNavigator fragmentNavigator, Application application, int i, Object obj) {
        if ((i & 1) != 0) {
            application = null;
        }
        return fragmentNavigator.OLrzqt(application);
    }

    public final boolean OLrzqt(Application application) {
        try {
            FragmentTransaction fragmentTransactionKWHzl = KWHzl(application);
            List<Fragment> fragments = this.EZpvd.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            for (Fragment fragment : fragments) {
                if (fragment.isAdded()) {
                    fragmentTransactionKWHzl.remove(fragment);
                }
            }
            OLrzqt(fragmentTransactionKWHzl, application != null ? application.AEQbTJ() : true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.base.FragmentNavigator.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ FragmentNavigator from$default(StateListAnimator stateListAnimator, FragmentManager fragmentManager, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return stateListAnimator.EZpvd(fragmentManager, num);
        }

        public final FragmentNavigator EZpvd(@NotNull FragmentManager fragmentManager, @IdRes Integer num) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            return new FragmentNavigator(fragmentManager, num);
        }
    }
}
