package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.banner.ObserveStrangerRelationBannerUseCase$execute$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35758oCp {
    public final oCI AEQbTJ;
    public final oFJ KWHzl;
    public final C35863oGm OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35758oCp(@NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = oci;
        this.OLrzqt = c35863oGm;
        this.KWHzl = ofj;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<C36557odH> OLrzqt(java.lang.String str, IMPageType iMPageType, boolean z) {
        return FlowKt.flowOn(FlowKt.combine(this.AEQbTJ.KWHzl(str), this.OLrzqt.EZpvd(str), new ObserveStrangerRelationBannerUseCase$execute$1(this, iMPageType, z, null)), this.copydefault);
    }
}
