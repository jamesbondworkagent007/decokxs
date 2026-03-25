package com.okinc.business.dex.market.common;

import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.IdRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DexFragmentNavigator {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final int EZpvd;
    public final FragmentManager KWHzl;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    public DexFragmentNavigator(@NotNull FragmentManager fragmentManager, @IdRes int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = fragmentManager;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    public final Fragment AEQbTJ() {
        List<Fragment> fragments = this.KWHzl.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        int size = fragments.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            Fragment fragment = fragments.get(size);
            if (fragment.isAdded() && fragment.getId() == this.EZpvd && !fragment.isHidden()) {
                return fragment;
            }
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

    public static final class Activity {
        public final boolean AEQbTJ;
        public final int AhwBna;
        public final TransactionMode EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final boolean copydefault;
        public final int gEmmrt;
        public final List<Pair<View, String>> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0, 0, 0, 0, false, false, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Pair<View, String>> AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(i, i2, i3, i4, z, z2, transactionMode, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMode KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt && this.AhwBna == activity.AhwBna && this.gEmmrt == activity.gEmmrt && this.copydefault == activity.copydefault && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd && Intrinsics.EZpvd(this.valueOf, activity.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Options(enterAnim=" + this.KWHzl + ", exitAnim=" + this.OLrzqt + ", popEnterAnim=" + this.AhwBna + ", popExitAnim=" + this.gEmmrt + ", addToBackStack=" + this.copydefault + ", allowStateLoss=" + this.AEQbTJ + ", mode=" + this.EZpvd + ", sharedElements=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = i;
            this.OLrzqt = i2;
            this.AhwBna = i3;
            this.gEmmrt = i4;
            this.copydefault = z;
            this.AEQbTJ = z2;
            this.EZpvd = transactionMode;
            this.valueOf = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.wXj.Application.isConnected int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] o.wXj.Application.values int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] o.wXj.Application.DbNXlk int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] o.wXj.Application.AuCTel int) : (r12v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode:?: TERNARY null = ((wrap:int:0x0030: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: SGET  A[WRAPPED] (LINE:51) com.okinc.business.dex.market.common.DexFragmentNavigator.TransactionMode.ADD_SHOW_HIDE com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode) : (r15v0 com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0038: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r16v0 java.util.List))
 A[MD:(int, int, int, int, boolean, boolean, com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode, java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>>):void (m)] (LINE:44) call: com.okinc.business.dex.market.common.DexFragmentNavigator.Activity.<init>(int, int, int, int, boolean, boolean, com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode, java.util.List):void type: THIS */
        public /* synthetic */ Activity(int i, int i2, int i3, int i4, boolean z, boolean z2, TransactionMode transactionMode, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? C52761wXj.Application.isConnected : i, (i5 & 2) != 0 ? C52761wXj.Application.values : i2, (i5 & 4) != 0 ? C52761wXj.Application.DbNXlk : i3, (i5 & 8) != 0 ? C52761wXj.Application.AuCTel : i4, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? TransactionMode.ADD_SHOW_HIDE : transactionMode, (i5 & 128) != 0 ? yDY.AhwBna() : list);
        }
    }

    public final void EZpvd(@NotNull Fragment fragment, @NotNull String str, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        int i = ActionBar.OLrzqt[activity.KWHzl().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentTransaction fragmentTransactionKWHzl = KWHzl(activity);
            Fragment fragmentAEQbTJ = AEQbTJ();
            if (fragmentAEQbTJ != null) {
                fragmentTransactionKWHzl.hide(fragmentAEQbTJ);
                fragmentTransactionKWHzl.setMaxLifecycle(fragmentAEQbTJ, Lifecycle.State.STARTED);
            }
            Fragment fragmentFindFragmentByTag = this.KWHzl.findFragmentByTag(str);
            if (fragmentFindFragmentByTag == null) {
                fragmentTransactionKWHzl.add(this.EZpvd, fragment, str);
            } else {
                fragmentTransactionKWHzl.show(fragmentFindFragmentByTag);
            }
            if (fragmentFindFragmentByTag != null) {
                fragment = fragmentFindFragmentByTag;
            }
            fragmentTransactionKWHzl.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
            fragmentTransactionKWHzl.setPrimaryNavigationFragment(fragment);
            if (activity.EZpvd()) {
                fragmentTransactionKWHzl.addToBackStack(str);
            }
            OLrzqt(fragmentTransactionKWHzl, activity.copydefault());
            return;
        }
        FragmentTransaction fragmentTransactionKWHzl2 = KWHzl(activity);
        fragmentTransactionKWHzl2.replace(this.EZpvd, fragment, str);
        fragmentTransactionKWHzl2.setPrimaryNavigationFragment(fragment);
        List<Fragment> fragments = this.KWHzl.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        if ((fragments instanceof Collection) && fragments.isEmpty()) {
            z = false;
        } else {
            for (Fragment fragment2 : fragments) {
                if (fragment2.isAdded() && fragment2.getId() == this.EZpvd) {
                    break;
                }
            }
            z = false;
        }
        if (activity.EZpvd() && z) {
            fragmentTransactionKWHzl2.addToBackStack(str);
        }
        OLrzqt(fragmentTransactionKWHzl2, activity.copydefault());
    }

    public final void KWHzl(@NotNull Fragment fragment, @NotNull String str, boolean z, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (z) {
            copydefault();
        }
        int i = ActionBar.OLrzqt[activity.KWHzl().ordinal()];
        boolean z2 = true;
        if (i == 1) {
            FragmentTransaction fragmentTransactionKWHzl = KWHzl(activity);
            fragmentTransactionKWHzl.replace(this.EZpvd, fragment, str);
            fragmentTransactionKWHzl.setPrimaryNavigationFragment(fragment);
            List<Fragment> fragments = this.KWHzl.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            if ((fragments instanceof Collection) && fragments.isEmpty()) {
                z2 = false;
            } else {
                for (Fragment fragment2 : fragments) {
                    if (fragment2.isAdded() && fragment2.getId() == this.EZpvd) {
                        break;
                    }
                }
                z2 = false;
            }
            if (activity.EZpvd() && z2) {
                fragmentTransactionKWHzl.addToBackStack(str);
            }
            OLrzqt(fragmentTransactionKWHzl, activity.copydefault());
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentTransaction fragmentTransactionKWHzl2 = KWHzl(activity);
        List<Fragment> fragments2 = this.KWHzl.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "");
        for (Fragment fragment3 : fragments2) {
            if (fragment3.isAdded() && fragment3.getId() == this.EZpvd && !fragment3.isHidden()) {
                fragmentTransactionKWHzl2.hide(fragment3);
                fragmentTransactionKWHzl2.setMaxLifecycle(fragment3, Lifecycle.State.STARTED);
            }
        }
        Fragment fragmentFindFragmentByTag = this.KWHzl.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null) {
            fragmentTransactionKWHzl2.add(this.EZpvd, fragment, str);
        } else {
            fragmentTransactionKWHzl2.show(fragmentFindFragmentByTag);
        }
        if (fragmentFindFragmentByTag != null) {
            fragment = fragmentFindFragmentByTag;
        }
        fragmentTransactionKWHzl2.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
        fragmentTransactionKWHzl2.setPrimaryNavigationFragment(fragment);
        if (activity.EZpvd()) {
            fragmentTransactionKWHzl2.addToBackStack(str);
        }
        OLrzqt(fragmentTransactionKWHzl2, activity.copydefault());
    }

    public final boolean KWHzl() {
        if (this.KWHzl.getBackStackEntryCount() <= 0) {
            return false;
        }
        this.KWHzl.popBackStack();
        return true;
    }

    public static /* synthetic */ boolean popTo$default(DexFragmentNavigator dexFragmentNavigator, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dexFragmentNavigator.EZpvd(str, z);
    }

    public final boolean EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.KWHzl.getBackStackEntryCount() == 0) {
            return false;
        }
        this.KWHzl.popBackStack(str, z ? 1 : 0);
        return true;
    }

    public final boolean EZpvd() {
        return KWHzl();
    }

    public final void copydefault() {
        if (this.KWHzl.getBackStackEntryCount() == 0) {
            return;
        }
        FragmentManager.BackStackEntry backStackEntryAt = this.KWHzl.getBackStackEntryAt(0);
        Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "");
        this.KWHzl.popBackStackImmediate(backStackEntryAt.getId(), 1);
    }

    public final FragmentTransaction KWHzl(Activity activity) {
        FragmentTransaction fragmentTransactionBeginTransaction = this.KWHzl.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        List<Pair<View, String>> listAhwBna = activity.AhwBna();
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : listAhwBna) {
            if (ViewCompat.getTransitionName((View) ((Pair) obj).getFirst()) != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            fragmentTransactionBeginTransaction.setCustomAnimations(activity.OLrzqt(), activity.AEQbTJ(), activity.AYXKKw(), activity.gEmmrt());
        }
        for (Pair pair : arrayList) {
            fragmentTransactionBeginTransaction.addSharedElement((View) pair.component1(), (String) pair.component2());
        }
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        return fragmentTransactionBeginTransaction;
    }

    public final void OLrzqt(FragmentTransaction fragmentTransaction, boolean z) {
        if (z) {
            fragmentTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransaction.commit();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.market.common.DexFragmentNavigator.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final DexFragmentNavigator copydefault(@NotNull Fragment fragment, @IdRes int i) {
            Intrinsics.checkNotNullParameter(fragment, "");
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            return new DexFragmentNavigator(childFragmentManager, i);
        }
    }
}
