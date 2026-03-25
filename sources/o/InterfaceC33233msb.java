package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC33233msb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33233msb extends InterfaceC43217rlC {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2);

    androidx.fragment.app.Fragment AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum);

    boolean AEQbTJ();

    boolean AEQbTJ(@NotNull AbstractC33240msi abstractC33240msi);

    boolean EZpvd();

    java.lang.Object KWHzl(@NotNull AbstractC33240msi abstractC33240msi, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation);

    StateFlow<AbstractC33240msi> KWHzl();

    java.lang.Object copydefault(@NotNull AbstractC33240msi abstractC33240msi, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.util.List<AbstractC33240msi> copydefault();

    /* JADX INFO: renamed from: o.msb$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object switchLiteSubMode$default(InterfaceC33233msb interfaceC33233msb, AbstractC33240msi abstractC33240msi, android.content.Context context, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchLiteSubMode");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            return interfaceC33233msb.KWHzl(abstractC33240msi, context, bundle, continuation);
        }

        public static Unit copydefault(int i, int i2) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.msb */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.view.View getAppModeSwitchView$default(InterfaceC33233msb interfaceC33233msb, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppModeSwitchView");
            }
            if ((i & 16) != 0) {
                function2 = new Function2() { // from class: o.msk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return InterfaceC33233msb.ActionBar.copydefault(((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                    }
                };
            }
            return interfaceC33233msb.AEQbTJ(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
        }
    }

    /* JADX INFO: renamed from: o.msb$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
