package o;

import com.okinc.im.usecase.message.ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35818oEv {
    public final CoroutineDispatcher AEQbTJ;
    public final C35811oEo EZpvd;
    public final C35805oEi KWHzl;
    public final C35812oEp OLrzqt;

    @yCM
    public C35818oEv(@NotNull C35812oEp c35812oEp, @NotNull C35811oEo c35811oEo, @NotNull C35805oEi c35805oEi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35812oEp, "");
        Intrinsics.checkNotNullParameter(c35811oEo, "");
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c35812oEp;
        this.EZpvd = c35811oEo;
        this.KWHzl = c35805oEi;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final Flow<OKMessage> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.transformLatest(this.OLrzqt.KWHzl(str), new ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1(null, this, str)), this.AEQbTJ);
    }
}
