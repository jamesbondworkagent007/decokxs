package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.androidx.viewmodel.dsl.ScopeSetExtKt$viewModel$1;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.ztj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60007ztj {
    public static /* synthetic */ C59976ztE viewModel$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        Intrinsics.checkNotNullParameter(c60065zuo, "");
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

    public static /* synthetic */ C59976ztE viewModel$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        Intrinsics.checkNotNullParameter(c60065zuo, "");
        Intrinsics.OLrzqt();
        ScopeSetExtKt$viewModel$1 scopeSetExtKt$viewModel$1 = ScopeSetExtKt$viewModel$1.INSTANCE;
        C59991ztT c59991ztTCopydefault = c60065zuo.copydefault();
        InterfaceC59997ztZ interfaceC59997ztZAEQbTJ = c60065zuo.AEQbTJ();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(interfaceC59997ztZAEQbTJ, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, scopeSetExtKt$viewModel$1, kind, listAhwBna));
        c59991ztTCopydefault.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztTCopydefault, c59981ztJ);
    }
}
