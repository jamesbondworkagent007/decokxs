package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.cruilib.view.viewmodel.OKCRHeaderViewModel$onBackNavigation$1;
import kotlin.Unit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.mJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31944mJs extends ViewModel {
    public final MutableSharedFlow<Unit> copydefault = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Unit> EZpvd() {
        return this.copydefault;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKCRHeaderViewModel$onBackNavigation$1(this, null), 3, null);
    }
}
