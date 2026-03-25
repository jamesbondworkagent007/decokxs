package o;

import com.okinc.core.arch.data.StatefulData;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.platforms.SharePlatform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48929ueu extends AbstractC32952mnL<java.util.List<? extends SharePlatform>> {
    public ShareConfig copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        this.copydefault = shareConfig;
    }

    public C48929ueu(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        this.copydefault = shareConfig;
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        return copydefault(this.copydefault, j);
    }

    public final InterfaceC58217yxC copydefault(ShareConfig shareConfig, final long j) {
        C49067uhZ.AEQbTJ.AEQbTJ();
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) C49129uii.AEQbTJ.OLrzqt(shareConfig));
        final Function1 function1 = new Function1() { // from class: o.uey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48929ueu.KWHzl(this.OLrzqt, j, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ueD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48929ueu.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ueC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48929ueu.OLrzqt(this.EZpvd, j, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ueB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48929ueu.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C48929ueu c48929ueu, long j, java.util.List list) {
        c48929ueu.EZpvd(StatefulData.Companion.EZpvd(list), j);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C48929ueu c48929ueu, long j, java.lang.Throwable th) {
        StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
        Intrinsics.copydefault(th);
        c48929ueu.EZpvd(StatefulData.StateListAnimator.error$default(stateListAnimator, th, null, 2, null), j);
        return Unit.INSTANCE;
    }
}
