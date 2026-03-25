package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.cedefi.create.viewmodel.CreatePasskeyWalletViewModel$loadCreateAccount$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17560fJw extends AbstractC33073mpa {
    public final C17554fJq AEQbTJ;
    public final MutableSharedFlow<InterfaceC49371unL<PasskeyAccountData>> EZpvd;
    public final SharedFlow<InterfaceC49371unL<PasskeyAccountData>> OLrzqt;
    public Job copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC49371unL<PasskeyAccountData>> copydefault() {
        return this.OLrzqt;
    }

    public C17560fJw(@NotNull C17554fJq c17554fJq) {
        Intrinsics.checkNotNullParameter(c17554fJq, "");
        this.AEQbTJ = c17554fJq;
        MutableSharedFlow<InterfaceC49371unL<PasskeyAccountData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
    }

    public final void AEQbTJ() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreatePasskeyWalletViewModel$loadCreateAccount$1(this, null), 3, null);
    }
}
