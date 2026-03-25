package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.input.token.TokenViewModel$filter$1;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47621tta extends ViewModel {
    public final MutableStateFlow<C47566tsY> EZpvd;
    public final StateFlow<C47566tsY> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C47566tsY> EZpvd() {
        return this.KWHzl;
    }

    public C47621tta() {
        MutableStateFlow<C47566tsY> MutableStateFlow = StateFlowKt.MutableStateFlow(new C47566tsY(new java.util.ArrayList(), new java.util.ArrayList()));
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str, this.EZpvd.getValue().EZpvd());
    }

    public final void KWHzl(@NotNull java.util.List<PublisherTokenInfo> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str, list);
    }

    public final void copydefault(java.lang.String str, java.util.List<PublisherTokenInfo> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenViewModel$filter$1(str, list, this, null), 3, null);
    }

    public final void KWHzl(@NotNull java.util.List<PublisherTokenInfo> list) {
        C47566tsY value;
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<C47566tsY> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copydefault(list, list)));
    }
}
