package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.features.holders.ui.TokenHoldersUtilsKt$showTagFilterBottomSheet$1;
import com.okinc.business.market.features.holders.ui.TokenHoldersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26294jZc {
    public static final void OLrzqt(@NotNull jYS jys, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(jys, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity fragmentActivityRequireActivity = jys.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, fragmentActivityRequireActivity, str, null, null, null, null, null, "dex", 96, null);
    }

    public static final void AEQbTJ(@NotNull final jYS jys, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(jys, "");
        Intrinsics.checkNotNullParameter(str, "");
        hSF.Companion.copydefault(str, jys.valueOf().AYXKKw(), new Function1() { // from class: o.jZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26294jZc.copydefault(jys, (java.lang.String) obj);
            }
        }).show(jys.getChildFragmentManager(), "javaClass");
    }

    public static final Unit copydefault(jYS jys, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TokenHoldersViewModel.updateFilter$default(jys.AYXKKw(), str, null, 2, null);
        jYS.setTokenFilter$default(jys, null, str.length() == 0 ? yDY.AhwBna() : C56402yEa.EZpvd(str), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull jYS jys, @NotNull java.util.List<C26211jWa> list, @NotNull C26211jWa c26211jWa) {
        Intrinsics.checkNotNullParameter(jys, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        LifecycleOwner viewLifecycleOwner = jys.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TokenHoldersUtilsKt$showTagFilterBottomSheet$1(list, c26211jWa, jys, null), 3, null);
    }
}
