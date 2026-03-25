package o;

import com.okinc.core.ok_app.homepage.pro.MainActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33351mun {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final MainActivity copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
    }

    public void AhwBna() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    public abstract int valueOf();

    public AbstractC33351mun(@NotNull MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "");
        this.copydefault = mainActivity;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC33351mun.djBIcL(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC33351mun.valueOf(this.copydefault);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mut
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC33351mun.AhwBna(this.AEQbTJ);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC33351mun.AYXKKw(this.EZpvd);
            }
        });
    }

    public final C55089xdP OLrzqt() {
        return (C55089xdP) this.EZpvd.getValue();
    }

    public static final C55089xdP djBIcL(AbstractC33351mun abstractC33351mun) {
        C55089xdP c55089xdPDjBIcL = abstractC33351mun.copydefault.djBIcL();
        c55089xdPDjBIcL.setUseArcTopTabBarStyle(false);
        return c55089xdPDjBIcL;
    }

    public final androidx.fragment.app.FragmentManager AEQbTJ() {
        return (androidx.fragment.app.FragmentManager) this.OLrzqt.getValue();
    }

    public static final androidx.fragment.app.FragmentManager valueOf(AbstractC33351mun abstractC33351mun) {
        return abstractC33351mun.copydefault.getSupportFragmentManager();
    }

    public final android.content.Intent copydefault() {
        return (android.content.Intent) this.AEQbTJ.getValue();
    }

    public static final android.content.Intent AhwBna(AbstractC33351mun abstractC33351mun) {
        return abstractC33351mun.copydefault.getIntent();
    }

    public static final InterfaceC47278tmy AYXKKw(AbstractC33351mun abstractC33351mun) {
        java.lang.Object[] objArr = {abstractC33351mun.copydefault};
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        return (InterfaceC47278tmy) MainActivity.copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1669210156, -1669210154, objArr, C9566bXx.OLrzqt(), iOLrzqt2);
    }

    public void AEQbTJ(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        this.KWHzl = bundle.getString("current_tab_tag");
    }

    public void gEmmrt() {
        android.view.Menu menu = OLrzqt().getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "");
            OLrzqt().removeBadge(item.getItemId());
        }
        OLrzqt().AYXKKw();
    }

    public void copydefault(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putString("current_tab_tag", this.KWHzl);
    }

    public void OLrzqt(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        if (this.copydefault.isDestroyed() || this.copydefault.isFinishing()) {
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = AEQbTJ().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        try {
            AEQbTJ().executePendingTransactions();
        } catch (java.lang.Exception unused) {
            pUU.copydefault("MainActivityDelegate", "clearAllFragments executePendingTransactions failed");
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = AEQbTJ().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment.isAdded() && !fragment.isRemoving()) {
                fragmentTransactionBeginTransaction.hide(fragment);
                fragmentTransactionBeginTransaction.remove(fragment);
            }
        }
        fragmentTransactionBeginTransaction.runOnCommit(runnable);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        this.KWHzl = null;
    }

    public final void EZpvd() {
        android.view.Menu menu = OLrzqt().getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "");
            item.setEnabled(false);
        }
        android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> sparseArrayAhwBna = OLrzqt().AhwBna();
        int size2 = sparseArrayAhwBna.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sparseArrayAhwBna.keyAt(i2);
            sparseArrayAhwBna.valueAt(i2).getSecond().setEnabled(false);
        }
        OLrzqt().postDelayed(new java.lang.Runnable() { // from class: o.muq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC33351mun.gEmmrt(this.AEQbTJ);
            }
        }, 100L);
    }

    public static final void gEmmrt(AbstractC33351mun abstractC33351mun) {
        android.view.Menu menu = abstractC33351mun.OLrzqt().getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "");
            item.setEnabled(true);
        }
        android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> sparseArrayAhwBna = abstractC33351mun.OLrzqt().AhwBna();
        int size2 = sparseArrayAhwBna.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sparseArrayAhwBna.keyAt(i2);
            sparseArrayAhwBna.valueAt(i2).getSecond().setEnabled(true);
        }
    }
}
