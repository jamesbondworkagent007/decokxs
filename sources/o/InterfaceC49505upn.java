package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.tradelite.bean.OrderBeanData;
import com.okinc.tradelite.bean.TradeProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49505upn extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void EZpvd(@NotNull FragmentActivity fragmentActivity);

    java.lang.Object KWHzl(@NotNull android.app.Activity activity, @NotNull TradeProductId tradeProductId, @NotNull Continuation<? super java.lang.Boolean> continuation);

    android.view.View OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03);

    void OLrzqt(@NotNull android.app.Activity activity, int i);

    android.view.View copydefault(@NotNull android.content.Context context);

    InterfaceC49506upo copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull android.view.ViewGroup viewGroup, @NotNull Function0<java.lang.String> function0, Function1<? super java.lang.Double, Unit> function1, Function0<Unit> function02);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull OrderBeanData orderBeanData);
}
