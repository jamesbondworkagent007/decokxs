package o;

import com.okinc.im.usecase.relationinfo.ObserveRelationInfoUseCase$execute$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35862oGl {
    public final InterfaceC44177sGd KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35862oGl(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC44177sGd;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<RelationInfo> KWHzl(java.lang.String str) {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.flow(new ObserveRelationInfoUseCase$execute$1(str, this, null))), this.copydefault);
    }
}
