package o;

import com.okinc.im.usecase.banner.ObserveUnblockRelationBannerUseCase$execute$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35757oCo {
    public final C35863oGm AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final oCI copydefault;

    @yCM
    public C35757oCo(@NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = oci;
        this.AEQbTJ = c35863oGm;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<C36562odM> AEQbTJ(java.lang.String str) {
        return FlowKt.flowOn(FlowKt.combine(this.copydefault.KWHzl(str), this.AEQbTJ.EZpvd(str), new ObserveUnblockRelationBannerUseCase$execute$1(null)), this.OLrzqt);
    }
}
