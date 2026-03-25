package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC33237msf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33237msf extends InterfaceC43217rlC {
    boolean AEQbTJ();

    boolean EZpvd(@NotNull AbstractC33249msr abstractC33249msr);

    java.lang.Object KWHzl(@NotNull AbstractC33249msr abstractC33249msr, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation);

    androidx.fragment.app.Fragment OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum);

    java.lang.Object OLrzqt(@NotNull AbstractC33249msr abstractC33249msr, @NotNull Continuation<? super java.lang.Boolean> continuation);

    StateFlow<AbstractC33249msr> OLrzqt();

    android.view.View copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2);

    boolean copydefault();

    /* JADX INFO: renamed from: o.msf$Activity */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object switchProSubMode$default(InterfaceC33237msf interfaceC33237msf, AbstractC33249msr abstractC33249msr, android.content.Context context, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchProSubMode");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            return interfaceC33237msf.KWHzl(abstractC33249msr, context, bundle, continuation);
        }

        public static Unit EZpvd(int i, int i2) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.msf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.view.View getAppModeSwitchView$default(InterfaceC33237msf interfaceC33237msf, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppModeSwitchView");
            }
            if ((i & 16) != 0) {
                function2 = new Function2() { // from class: o.msd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return InterfaceC33237msf.Activity.EZpvd(((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                    }
                };
            }
            return interfaceC33237msf.copydefault(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
        }
    }
}
