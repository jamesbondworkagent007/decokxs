package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.zuo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60065zuo {
    public final C59991ztT KWHzl;
    public final InterfaceC59997ztZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59997ztZ AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59991ztT copydefault() {
        return this.KWHzl;
    }

    public static /* synthetic */ C59976ztE scoped$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        InterfaceC59997ztZ interfaceC59997ztZAEQbTJ = c60065zuo.AEQbTJ();
        Kind kind = Kind.Scoped;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59989ztR c59989ztR = new C59989ztR(new C59978ztG(interfaceC59997ztZAEQbTJ, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function2, kind, listAhwBna));
        c60065zuo.copydefault().KWHzl(c59989ztR);
        return new C59976ztE(c60065zuo.copydefault(), c59989ztR);
    }

    public static /* synthetic */ C59976ztE factory$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        Intrinsics.checkNotNullParameter(function2, "");
        C59991ztT c59991ztTCopydefault = c60065zuo.copydefault();
        InterfaceC59997ztZ interfaceC59997ztZAEQbTJ = c60065zuo.AEQbTJ();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(interfaceC59997ztZAEQbTJ, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, function2, kind, listAhwBna));
        c59991ztTCopydefault.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztTCopydefault, c59981ztJ);
    }
}
