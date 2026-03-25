package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCI {
    public final CoroutineDispatcher KWHzl;
    public final sGF OLrzqt;

    @yCM
    public oCI(@NotNull sGF sgf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sgf;
        this.KWHzl = coroutineDispatcher;
    }

    public final Flow<OKConversation> KWHzl(java.lang.String str) {
        Flow<OKConversation> flowFlowOf;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            flowFlowOf = FlowKt.flowOf((java.lang.Object) null);
        } else {
            flowFlowOf = this.OLrzqt.copydefault(str);
        }
        return FlowKt.flowOn(flowFlowOf, this.KWHzl);
    }
}
