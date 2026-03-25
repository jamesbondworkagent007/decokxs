package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cTO extends AbstractC43215rlA implements InterfaceC54838xXe {
    public final C14396dkf copydefault = new C14396dkf();

    @Override // o.InterfaceC54838xXe
    public void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Function1<? super C9697baV, Unit> function1) {
        InterfaceC14389dkY interfaceC14389dkYAhwBna;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (i == 1) {
            this.copydefault.EZpvd(fragmentActivity, str, str2, str3, function1);
        } else if (i == 2 && (interfaceC14389dkYAhwBna = ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).AhwBna(fragmentActivity)) != null) {
            interfaceC14389dkYAhwBna.EZpvd(fragmentActivity, str, str2, str3, function1);
        }
    }

    public static final Unit KWHzl(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54838xXe
    public void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, int i, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        InterfaceC14389dkY interfaceC14389dkYAhwBna;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (i == 1) {
            this.copydefault.copydefault(fragmentActivity, str, new Function1() { // from class: o.cTM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cTO.KWHzl(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else if (i == 2 && (interfaceC14389dkYAhwBna = ((InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class)).AhwBna(fragmentActivity)) != null) {
            interfaceC14389dkYAhwBna.OLrzqt(fragmentActivity, str, new Function1() { // from class: o.cTP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cTO.OLrzqt(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54838xXe
    public void OLrzqt(FragmentActivity fragmentActivity, int i, @NotNull Function1<? super java.util.List<HDWalletCloudBackupBean>, Unit> function1) {
        InterfaceC14389dkY interfaceC14389dkYAhwBna;
        Intrinsics.checkNotNullParameter(function1, "");
        if (i == 1) {
            this.copydefault.AEQbTJ(fragmentActivity, function1);
            return;
        }
        if (i != 2) {
            return;
        }
        InterfaceC54843xXj interfaceC54843xXj = (InterfaceC54843xXj) C43251rlk.copydefault(InterfaceC54843xXj.class);
        if (fragmentActivity == null || (interfaceC14389dkYAhwBna = interfaceC54843xXj.AhwBna(fragmentActivity)) == null) {
            return;
        }
        interfaceC14389dkYAhwBna.AEQbTJ(fragmentActivity, function1);
    }
}
