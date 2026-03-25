package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17775fRv {
    public final java.lang.String AEQbTJ(int i) {
        return C33069mpW.copydefault(C13754dXa.FragmentManager.ActionBarDrawerToggleToolbarCompatDelegate, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.String.valueOf(i))));
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C13754dXa.FragmentManager.ActionBarDrawerToggleDelegateProvider, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", str)));
    }

    public final java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActionBarDrawerToggleFrameworkActionBarDelegate);
    }

    public final java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.onClick);
    }

    public final java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActionBarDrawerToggleDelegate);
    }

    public final java.lang.String EZpvd() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getActionBarThemedContext);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        android.content.Context applicationContext = C9678baC.Companion.AEQbTJ().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return c14392dkb.OLrzqt(applicationContext, str);
    }

    public final java.lang.String OLrzqt() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.toggle);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33069mpW.copydefault(C13754dXa.FragmentManager.sFt, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt("num", str2)));
    }
}
