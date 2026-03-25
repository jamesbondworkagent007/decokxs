package o;

import com.okinc.im.usecase.pluginlist.ObservePluginDataConfigUseCase$execute$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35852oGb {
    public final oCI AEQbTJ;
    public final oDI EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C35863oGm copydefault;

    @yCM
    public C35852oGb(@NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull oDI odi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = oci;
        this.copydefault = c35863oGm;
        this.EZpvd = odi;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<C35287nsV> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.combine(this.AEQbTJ.KWHzl(str), this.copydefault.EZpvd(str), this.EZpvd.AEQbTJ(str), new ObservePluginDataConfigUseCase$execute$1(null)), this.OLrzqt);
    }
}
