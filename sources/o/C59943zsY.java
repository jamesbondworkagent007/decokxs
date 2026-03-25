package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.androidx.fragment.dsl.ModuleExtKt$fragment$1;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.zsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59943zsY {
    public static /* synthetic */ C59976ztE fragment$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztT, c59981ztJ);
    }

    public static /* synthetic */ C59976ztE fragment$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.OLrzqt();
        ModuleExtKt$fragment$1 moduleExtKt$fragment$1 = ModuleExtKt$fragment$1.INSTANCE;
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, moduleExtKt$fragment$1, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztT, c59981ztJ);
    }
}
