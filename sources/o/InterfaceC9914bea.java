package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeProcessInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9914bea extends InterfaceC43217rlC {
    void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull EscapeProcessInput escapeProcessInput, @NotNull Function1<? super EscapeResult, Unit> function1);

    void copydefault(@NotNull android.app.Activity activity, @NotNull EscapeStatusInput escapeStatusInput);
}
