package o;

import com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8223ayg {
    void AEQbTJ(@NotNull Function0<Unit> function0);

    void KWHzl(@NotNull GoToWithdrawFromWalletResultContractArgs goToWithdrawFromWalletResultContractArgs);

    /* JADX INFO: renamed from: o.ayg$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.ayg$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final int copydefault = AbstractActivityC33041mov.$stable;
            public final AbstractActivityC33041mov OLrzqt;

            public StateListAnimator(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
                Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
                this.OLrzqt = abstractActivityC33041mov;
            }
        }

        /* JADX INFO: renamed from: o.ayg$ActionBar$Activity */
        public static final class Activity implements ActionBar {
            public final androidx.fragment.app.DialogFragment KWHzl;

            public Activity(@NotNull androidx.fragment.app.DialogFragment dialogFragment) {
                Intrinsics.checkNotNullParameter(dialogFragment, "");
                this.KWHzl = dialogFragment;
            }
        }
    }
}
