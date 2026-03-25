package o;

import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.Kind;
import org.koin.dsl.ScopeSetExtKt$factory$1;
import org.koin.dsl.ScopeSetExtKt$scoped$1;

/* JADX INFO: renamed from: o.zur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60068zur {
    public static /* synthetic */ C59976ztE scoped$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(c60065zuo, "");
        Intrinsics.OLrzqt();
        ScopeSetExtKt$scoped$1 scopeSetExtKt$scoped$1 = ScopeSetExtKt$scoped$1.INSTANCE;
        InterfaceC59997ztZ interfaceC59997ztZAEQbTJ = c60065zuo.AEQbTJ();
        Kind kind = Kind.Scoped;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59989ztR c59989ztR = new C59989ztR(new C59978ztG(interfaceC59997ztZAEQbTJ, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, scopeSetExtKt$scoped$1, kind, listAhwBna));
        c60065zuo.copydefault().KWHzl(c59989ztR);
        return new C59976ztE(c60065zuo.copydefault(), c59989ztR);
    }

    public static /* synthetic */ C59976ztE factory$default(C60065zuo c60065zuo, InterfaceC59997ztZ interfaceC59997ztZ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        Intrinsics.checkNotNullParameter(c60065zuo, "");
        Intrinsics.OLrzqt();
        ScopeSetExtKt$factory$1 scopeSetExtKt$factory$1 = ScopeSetExtKt$factory$1.INSTANCE;
        C59991ztT c59991ztTCopydefault = c60065zuo.copydefault();
        InterfaceC59997ztZ interfaceC59997ztZAEQbTJ = c60065zuo.AEQbTJ();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(interfaceC59997ztZAEQbTJ, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, scopeSetExtKt$factory$1, kind, listAhwBna));
        c59991ztTCopydefault.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztTCopydefault, c59981ztJ);
    }
}
