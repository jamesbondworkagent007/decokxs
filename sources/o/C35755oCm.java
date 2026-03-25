package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.banner.ObserveVerifyIdentityBannerUseCase$execute$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35755oCm {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final oCI AEQbTJ;
    public final C35863oGm AYXKKw;
    public final oFJ EZpvd;
    public final oDG KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35755oCm(@NotNull oCI oci, @NotNull oFJ ofj, @NotNull C35863oGm c35863oGm, @NotNull oDG odg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(odg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = oci;
        this.EZpvd = ofj;
        this.AYXKKw = c35863oGm;
        this.KWHzl = odg;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oCm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final Flow<C36565odP> EZpvd(@NotNull java.lang.String str, IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.combine(this.AEQbTJ.KWHzl(str), this.AYXKKw.EZpvd(str), this.KWHzl.AEQbTJ(str), new ObserveVerifyIdentityBannerUseCase$execute$1(this, iMPageType, str, null)), this.OLrzqt);
    }
}
