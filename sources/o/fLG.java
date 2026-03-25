package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyConfirmViewModel$selectWalletCheck$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fLG extends AbstractC33073mpa {
    public final StateFlow<Activity> AEQbTJ;
    public final MutableStateFlow<Activity> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> OLrzqt() {
        return this.AEQbTJ;
    }

    public fLG() {
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyConfirmViewModel$selectWalletCheck$1(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Activity {
            public ActionBar() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends Activity {
            public StateListAnimator() {
                super(null);
            }
        }
    }
}
