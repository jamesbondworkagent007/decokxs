package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.vibes.ui.VibesActivityParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.jGI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19690gLs extends AbstractC43215rlA implements InterfaceC25629jAm {
    @Override // o.InterfaceC25629jAm
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TokenInfoForAlert tokenInfoForAlert, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        jGI jgiNewInstance$default = jGI.TaskDescription.newInstance$default(jGI.Companion, tokenInfoForAlert, null, 2, null);
        jgiNewInstance$default.EZpvd(new Function1() { // from class: o.gLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19690gLs.KWHzl(function0, (AlertUiItem) obj);
            }
        });
        jgiNewInstance$default.show(fragmentManager, "Web3NewOrModifyAlertFragment");
    }

    public static final Unit KWHzl(Function0 function0, AlertUiItem alertUiItem) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC25629jAm
    public void EZpvd(@NotNull android.content.Context context, @NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) jHH.class);
        intent.putExtra("token_info_for_alert", tokenInfoForAlert);
        context.startActivity(intent);
    }

    @Override // o.InterfaceC25629jAm
    public void copydefault(@NotNull android.content.Context context, @NotNull VibesActivityParams vibesActivityParams) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(vibesActivityParams, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC27733kBi.class);
        intent.putExtra("analysis_params", vibesActivityParams);
        context.startActivity(intent);
    }

    @Override // o.InterfaceC25629jAm
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C28385kZl c28385kZl, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c28385kZl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        kZX.Companion.EZpvd(fragmentManager, c28385kZl, function1);
    }
}
