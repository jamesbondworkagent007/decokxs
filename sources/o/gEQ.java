package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.tx.history.viewmodel.DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.Point;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gEQ extends ViewModel {
    public final MutableStateFlow<Point<java.lang.Boolean>> AEQbTJ;
    public final StateFlow<Point<java.lang.Boolean>> EZpvd;
    public final C13934dbu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<java.lang.Boolean>> copydefault() {
        return this.EZpvd;
    }

    public gEQ(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c13934dbu;
        MutableStateFlow<Point<java.lang.Boolean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = MutableStateFlow;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(new Point.StateListAnimator(null, 1, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1(this, str, null), 3, null);
    }
}
