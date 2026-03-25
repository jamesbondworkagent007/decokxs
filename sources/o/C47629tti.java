package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.input.topic.TopicViewModel$filter$1;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47629tti extends ViewModel {
    public final StateFlow<C47627ttg> EZpvd;
    public final MutableStateFlow<C47627ttg> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C47627ttg> OLrzqt() {
        return this.EZpvd;
    }

    public C47629tti() {
        MutableStateFlow<C47627ttg> MutableStateFlow = StateFlowKt.MutableStateFlow(new C47627ttg(new java.util.ArrayList(), new java.util.ArrayList()));
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str, this.OLrzqt.getValue().AEQbTJ());
    }

    public final void copydefault(@NotNull java.util.List<PublisherTopicInfo> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str, list);
    }

    private final void OLrzqt(java.lang.String str, java.util.List<PublisherTopicInfo> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TopicViewModel$filter$1(str, list, this, null), 3, null);
    }

    public final void KWHzl(@NotNull java.util.List<PublisherTopicInfo> list) {
        C47627ttg value;
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<C47627ttg> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.OLrzqt(list, list)));
    }
}
