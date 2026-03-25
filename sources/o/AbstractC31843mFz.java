package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.cruilib.compose.ui.BaseCRComposeFragmentViewModel$onEvent$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC31843mFz<ViewState, ViewEvent> extends C31943mJr {
    public final Flow<ViewEvent> AEQbTJ;
    public final MutableSharedFlow<ViewEvent> OLrzqt;

    public AbstractC31843mFz() {
        MutableSharedFlow<ViewEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
    }

    public final void onEvent(@NotNull ViewEvent viewevent) {
        Intrinsics.checkNotNullParameter(viewevent, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseCRComposeFragmentViewModel$onEvent$1(this, viewevent, null), 3, null);
    }
}
