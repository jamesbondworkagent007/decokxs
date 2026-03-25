package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.vibes.ui.VibesActivityParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25629jAm extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TokenInfoForAlert tokenInfoForAlert, Function0<Unit> function0);

    void EZpvd(@NotNull android.content.Context context, @NotNull TokenInfoForAlert tokenInfoForAlert);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C28385kZl c28385kZl, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1);

    void copydefault(@NotNull android.content.Context context, @NotNull VibesActivityParams vibesActivityParams);
}
