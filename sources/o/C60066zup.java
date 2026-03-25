package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.Kind;
import org.koin.dsl.ModuleExtKt$factory$1;
import org.koin.dsl.ModuleExtKt$single$1;

/* JADX INFO: renamed from: o.zup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60066zup {
    public static /* synthetic */ C59976ztE single$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.OLrzqt();
        ModuleExtKt$single$1 moduleExtKt$single$1 = ModuleExtKt$single$1.INSTANCE;
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Singleton;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, moduleExtKt$single$1, kind, listAhwBna));
        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
        if (z || c59991ztT.OLrzqt()) {
            c59991ztT.KWHzl(c59990ztS);
        }
        return new C59976ztE(c59991ztT, c59990ztS);
    }

    public static /* synthetic */ C59976ztE factory$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.OLrzqt();
        ModuleExtKt$factory$1 moduleExtKt$factory$1 = ModuleExtKt$factory$1.INSTANCE;
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, moduleExtKt$factory$1, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztT, c59981ztJ);
    }
}
