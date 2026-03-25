package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC18816fpZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19302fyi extends ViewModel {
    public final StateFlow<java.util.List<AbstractC18816fpZ>> AEQbTJ;
    public final MutableStateFlow<java.util.List<AbstractC18816fpZ>> EZpvd;
    public final java.util.List<UnsupportedWalletType> KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<AbstractC18816fpZ>> KWHzl() {
        return this.AEQbTJ;
    }

    public C19302fyi(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        java.lang.Boolean bool = (java.lang.Boolean) savedStateHandle.get("showWatchOnlyWallet");
        this.copydefault = bool != null ? bool.booleanValue() : true;
        java.util.List<UnsupportedWalletType> list = (java.util.List) savedStateHandle.get("UNSUPPORTED_WALLET_TYPES");
        this.KWHzl = list == null ? yDY.AhwBna() : list;
        this.OLrzqt = !r3.contains(UnsupportedWalletType.HardwareWallet);
        MutableStateFlow<java.util.List<AbstractC18816fpZ>> MutableStateFlow = StateFlowKt.MutableStateFlow(AEQbTJ());
        this.EZpvd = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final java.util.List<AbstractC18816fpZ> AEQbTJ() {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (!C14728dqt.KWHzl.OLrzqt()) {
            listOLrzqt.add(new AbstractC18816fpZ.TaskDescription(0, 0, 0, 7, null));
        }
        listOLrzqt.add(new AbstractC18816fpZ.Activity(0, 0, 0, 7, null));
        if (this.OLrzqt) {
            listOLrzqt.add(new AbstractC18816fpZ.ActionBar(0, 0, 0, 7, null));
        }
        if (this.copydefault) {
            listOLrzqt.add(new AbstractC18816fpZ.StateListAnimator(0, 0, 0, 7, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
