package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.vibes.ui.VibesActivityParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25632jAp {
    public static final C25632jAp KWHzl = new C25632jAp();

    private C25632jAp() {
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C28385kZl c28385kZl, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c28385kZl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC25629jAm) C43251rlk.copydefault(InterfaceC25629jAm.class)).KWHzl(fragmentManager, c28385kZl, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jAp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openCreateAlertBottomSheet$default(C25632jAp c25632jAp, androidx.fragment.app.FragmentManager fragmentManager, TokenInfoForAlert tokenInfoForAlert, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c25632jAp.OLrzqt(fragmentManager, tokenInfoForAlert, function0);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TokenInfoForAlert tokenInfoForAlert, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        ((InterfaceC25629jAm) C43251rlk.copydefault(InterfaceC25629jAm.class)).AEQbTJ(fragmentManager, tokenInfoForAlert, function0);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        ((InterfaceC25629jAm) C43251rlk.copydefault(InterfaceC25629jAm.class)).EZpvd(context, tokenInfoForAlert);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull VibesActivityParams vibesActivityParams) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(vibesActivityParams, "");
        ((InterfaceC25629jAm) C43251rlk.copydefault(InterfaceC25629jAm.class)).copydefault(context, vibesActivityParams);
    }
}
