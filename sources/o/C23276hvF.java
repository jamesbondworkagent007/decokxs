package o;

import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.dex.trade.order.ui.OrdersPagerFragment;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23276hvF extends AbstractC43215rlA implements InterfaceC9772bbr {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9772bbr
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9772bbr
    public int OLrzqt() {
        return C23274hvD.Fragment.DWgRXt;
    }

    @Override // o.InterfaceC9772bbr
    public androidx.fragment.app.Fragment KWHzl() {
        return DexHomeFragment.Activity.newInstance$default(DexHomeFragment.Companion, "default_trade", null, null, false, 14, null);
    }

    @Override // o.InterfaceC9772bbr
    public AbstractC58185ywX<java.lang.Boolean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.InterfaceC9772bbr
    public java.lang.Object AEQbTJ(@NotNull DexFeature dexFeature, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.EZpvd(dexFeature));
    }

    @Override // o.InterfaceC9772bbr
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull DexFeature dexFeature, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.copydefault(context, dexFeature));
    }

    @Override // o.InterfaceC9772bbr
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.KWHzl(str));
    }

    @Override // o.InterfaceC9772bbr
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C19676gLe.OLrzqt(str);
    }

    @Override // o.InterfaceC9772bbr
    public androidx.fragment.app.Fragment EZpvd() {
        return new gRC();
    }

    @Override // o.InterfaceC9772bbr
    public androidx.fragment.app.Fragment copydefault() {
        return C19979gWk.Companion.copydefault();
    }

    @Override // o.InterfaceC9772bbr
    public androidx.fragment.app.Fragment copydefault(java.lang.String str) {
        return OrdersPagerFragment.Companion.KWHzl(true, str, true);
    }
}
