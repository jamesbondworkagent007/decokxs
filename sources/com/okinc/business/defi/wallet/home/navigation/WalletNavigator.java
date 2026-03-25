package com.okinc.business.defi.wallet.home.navigation;

import android.view.View;
import androidx.annotation.AnimRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletNavigator {

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    FragmentManager EZpvd();

    Fragment KWHzl();

    void KWHzl(@NotNull Fragment fragment, @NotNull String str, @NotNull Application application);

    int OLrzqt();

    void OLrzqt(@NotNull Fragment fragment, @NotNull String str, @NotNull Application application);

    boolean OLrzqt(@NotNull String str, boolean z, boolean z2);

    void copydefault(@NotNull Fragment fragment, @NotNull String str, @NotNull Application application);

    boolean copydefault(boolean z);

    public static final class Activity {
        public static /* synthetic */ void push$default(WalletNavigator walletNavigator, Fragment fragment, String str, Application application, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: push");
            }
            walletNavigator.OLrzqt(fragment, (i & 2) != 0 ? fragment.getClass().getName() : str, (i & 4) != 0 ? new Application(0, 0, 0, 0, false, false, null, null, 255, null) : application);
        }

        public static void OLrzqt(@NotNull WalletNavigator walletNavigator, @NotNull Fragment fragment, @NotNull String str, @NotNull Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            int i = TaskDescription.KWHzl[application.EZpvd().ordinal()];
            if (i == 1) {
                walletNavigator.KWHzl(fragment, str, application);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                walletNavigator.copydefault(fragment, str, application);
            }
        }

        public static void copydefault(@NotNull WalletNavigator walletNavigator, @NotNull Fragment fragment, @NotNull String str, @NotNull Application application) {
            Object objM7377constructorimpl;
            int iCommit;
            Object objM7377constructorimpl2;
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            try {
                Result.Application application2 = Result.Companion;
                FragmentTransaction fragmentTransactionBeginTransaction = walletNavigator.EZpvd().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                if (application.AYXKKw().isEmpty()) {
                    fragmentTransactionBeginTransaction.setCustomAnimations(application.copydefault(), application.OLrzqt(), application.gEmmrt(), application.valueOf());
                }
                Iterator<T> it = application.AYXKKw().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    View view = (View) pair.component1();
                    String str2 = (String) pair.component2();
                    try {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(fragmentTransactionBeginTransaction.addSharedElement(view, str2));
                    } catch (Throwable th) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("WalletNavigator", "Failed to add shared element: " + str2, thM7380exceptionOrNullimpl);
                    }
                }
                Fragment fragmentKWHzl = walletNavigator.KWHzl();
                if (fragmentKWHzl != null) {
                    fragmentTransactionBeginTransaction.hide(fragmentKWHzl);
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentKWHzl, Lifecycle.State.STARTED);
                }
                Fragment fragmentFindFragmentByTag = walletNavigator.EZpvd().findFragmentByTag(str);
                if (fragmentFindFragmentByTag == null) {
                    fragmentTransactionBeginTransaction.add(walletNavigator.OLrzqt(), fragment, str);
                } else {
                    fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag);
                }
                if (fragmentFindFragmentByTag != null) {
                    fragment = fragmentFindFragmentByTag;
                }
                fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
                fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragment);
                if (application.AEQbTJ()) {
                    fragmentTransactionBeginTransaction.addToBackStack(str);
                }
                fragmentTransactionBeginTransaction.setReorderingAllowed(true);
                if (application.KWHzl()) {
                    iCommit = fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                } else {
                    iCommit = fragmentTransactionBeginTransaction.commit();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Integer.valueOf(iCommit));
            } catch (Throwable th2) {
                Result.Application application5 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("WalletNavigator", "Failed to push fragment with tag: " + str, thM7380exceptionOrNullimpl2);
            }
        }

        public static void AEQbTJ(@NotNull WalletNavigator walletNavigator, @NotNull Fragment fragment, @NotNull String str, @NotNull Application application) {
            Object objM7377constructorimpl;
            boolean z;
            int iCommit;
            Object objM7377constructorimpl2;
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            try {
                Result.Application application2 = Result.Companion;
                FragmentTransaction fragmentTransactionBeginTransaction = walletNavigator.EZpvd().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                if (application.AYXKKw().isEmpty()) {
                    fragmentTransactionBeginTransaction.setCustomAnimations(application.copydefault(), application.OLrzqt(), application.gEmmrt(), application.valueOf());
                }
                Iterator<T> it = application.AYXKKw().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    View view = (View) pair.component1();
                    String str2 = (String) pair.component2();
                    try {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(fragmentTransactionBeginTransaction.addSharedElement(view, str2));
                    } catch (Throwable th) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("WalletNavigator", "Failed to add shared element: " + str2, thM7380exceptionOrNullimpl);
                    }
                }
                fragmentTransactionBeginTransaction.replace(walletNavigator.OLrzqt(), fragment, str);
                fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragment);
                List<Fragment> fragments = walletNavigator.EZpvd().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                if (!(fragments instanceof Collection) || !fragments.isEmpty()) {
                    for (Fragment fragment2 : fragments) {
                        if (fragment2.isAdded() && fragment2.getId() == walletNavigator.OLrzqt()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (application.AEQbTJ() && z) {
                    fragmentTransactionBeginTransaction.addToBackStack(str);
                }
                fragmentTransactionBeginTransaction.setReorderingAllowed(true);
                if (application.KWHzl()) {
                    iCommit = fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                } else {
                    iCommit = fragmentTransactionBeginTransaction.commit();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Integer.valueOf(iCommit));
            } catch (Throwable th2) {
                Result.Application application5 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("WalletNavigator", "Failed to replace fragment with tag: " + str, thM7380exceptionOrNullimpl2);
            }
        }

        public static /* synthetic */ boolean pop$default(WalletNavigator walletNavigator, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pop");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return walletNavigator.copydefault(z);
        }

        public static boolean KWHzl(@NotNull WalletNavigator walletNavigator, boolean z) {
            Object objM7377constructorimpl;
            boolean zPopBackStackImmediate;
            if (walletNavigator.EZpvd().getBackStackEntryCount() <= 0) {
                return false;
            }
            try {
                Result.Application application = Result.Companion;
                if (z) {
                    zPopBackStackImmediate = walletNavigator.EZpvd().popBackStackImmediate();
                } else {
                    walletNavigator.EZpvd().popBackStack();
                    zPopBackStackImmediate = true;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(zPopBackStackImmediate));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletNavigator", "Failed to pop fragment", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM7377constructorimpl).booleanValue();
        }

        public static /* synthetic */ boolean popTo$default(WalletNavigator walletNavigator, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popTo");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return walletNavigator.OLrzqt(str, z, z2);
        }

        public static boolean KWHzl(@NotNull WalletNavigator walletNavigator, @NotNull String str, boolean z, boolean z2) {
            Object objM7377constructorimpl;
            boolean zPopBackStackImmediate;
            Intrinsics.checkNotNullParameter(str, "");
            if (walletNavigator.EZpvd().getBackStackEntryCount() == 0) {
                return false;
            }
            try {
                Result.Application application = Result.Companion;
                if (z2) {
                    zPopBackStackImmediate = walletNavigator.EZpvd().popBackStackImmediate(str, z ? 1 : 0);
                } else {
                    walletNavigator.EZpvd().popBackStack(str, z ? 1 : 0);
                    zPopBackStackImmediate = true;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(zPopBackStackImmediate));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletNavigator", "Failed to popTo fragment with tag: " + str, thM7380exceptionOrNullimpl);
                objM7377constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM7377constructorimpl).booleanValue();
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0013 */
        public static Fragment KWHzl(@NotNull WalletNavigator walletNavigator) {
            List<Fragment> fragments = walletNavigator.EZpvd().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            int size = fragments.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return null;
                }
                Fragment fragment = fragments.get(size);
                if (fragment.isAdded() && fragment.getId() == walletNavigator.OLrzqt() && !fragment.isHidden()) {
                    return fragment;
                }
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

    public static final class Application {
        public final TransactionMode AEQbTJ;
        public final boolean EZpvd;
        public final int KWHzl;
        public final boolean OLrzqt;
        public final int copydefault;
        public final List<Pair<View, String>> djBIcL;
        public final int gEmmrt;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0, 0, 0, 0, false, false, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Pair<View, String>> AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMode EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(i, i2, i3, i4, z, z2, transactionMode, list);
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
            return this.KWHzl == application.KWHzl && this.copydefault == application.copydefault && this.gEmmrt == application.gEmmrt && this.valueOf == application.valueOf && this.OLrzqt == application.OLrzqt && this.EZpvd == application.EZpvd && this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd(this.djBIcL, application.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Options(enterAnim=" + this.KWHzl + ", exitAnim=" + this.copydefault + ", popEnterAnim=" + this.gEmmrt + ", popExitAnim=" + this.valueOf + ", addToBackStack=" + this.OLrzqt + ", allowStateLoss=" + this.EZpvd + ", mode=" + this.AEQbTJ + ", sharedElements=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4, boolean z, boolean z2, @NotNull TransactionMode transactionMode, @NotNull List<? extends Pair<? extends View, String>> list) {
            Intrinsics.checkNotNullParameter(transactionMode, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = i;
            this.copydefault = i2;
            this.gEmmrt = i3;
            this.valueOf = i4;
            this.OLrzqt = z;
            this.EZpvd = z2;
            this.AEQbTJ = transactionMode;
            this.djBIcL = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.wXj.Application.isConnected int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] o.wXj.Application.AuCTel int) : (r12v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 boolean) : false)
  (wrap:com.okinc.business.defi.wallet.home.navigation.WalletNavigator$TransactionMode:?: TERNARY null = ((wrap:int:0x002e: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: SGET  A[WRAPPED] (LINE:200) com.okinc.business.defi.wallet.home.navigation.WalletNavigator.TransactionMode.ADD_SHOW_HIDE com.okinc.business.defi.wallet.home.navigation.WalletNavigator$TransactionMode) : (r15v0 com.okinc.business.defi.wallet.home.navigation.WalletNavigator$TransactionMode))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:201)) : (r16v0 java.util.List))
 A[MD:(int, int, int, int, boolean, boolean, com.okinc.business.defi.wallet.home.navigation.WalletNavigator$TransactionMode, java.util.List<? extends kotlin.Pair<? extends android.view.View, java.lang.String>>):void (m)] (LINE:193) call: com.okinc.business.defi.wallet.home.navigation.WalletNavigator.Application.<init>(int, int, int, int, boolean, boolean, com.okinc.business.defi.wallet.home.navigation.WalletNavigator$TransactionMode, java.util.List):void type: THIS */
        public /* synthetic */ Application(int i, int i2, int i3, int i4, boolean z, boolean z2, TransactionMode transactionMode, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? C52761wXj.Application.isConnected : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? C52761wXj.Application.AuCTel : i4, (i5 & 16) != 0 ? true : z, (i5 & 32) == 0 ? z2 : false, (i5 & 64) != 0 ? TransactionMode.ADD_SHOW_HIDE : transactionMode, (i5 & 128) != 0 ? yDY.AhwBna() : list);
        }
    }
}
