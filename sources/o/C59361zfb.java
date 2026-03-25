package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59361zfb extends C56706yPh {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.yOW, o.InterfaceC56688yOq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn OLrzqt(@NotNull TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59361zfb(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        C59370zfk c59370zfk = C59370zfk.AEQbTJ;
        yNP ynpCopydefault = c59370zfk.copydefault();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        java.util.List listAhwBna = yDY.AhwBna();
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        super(ynpCopydefault, c56935yXu, modality, classKind, listAhwBna, interfaceC56686yOo, false, LockBasedStorageManager.KWHzl);
        C56707yPi c56707yPiCopydefault = C56707yPi.copydefault(this, yOL.KWHzl.OLrzqt(), true, interfaceC56686yOo);
        c56707yPiCopydefault.AEQbTJ(yDY.AhwBna(), C56669yNy.KWHzl);
        Intrinsics.checkNotNullExpressionValue(c56707yPiCopydefault, "");
        InterfaceC59098zad interfaceC59098zadOLrzqt = C59370zfk.OLrzqt(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, c56707yPiCopydefault.bR_().toString(), "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        c56707yPiCopydefault.EZpvd(new C59366zfg(c59370zfk.AEQbTJ(errorTypeKind, new java.lang.String[0]), interfaceC59098zadOLrzqt, errorTypeKind, null, false, new java.lang.String[0], 24, null));
        OLrzqt(interfaceC59098zadOLrzqt, yED.AEQbTJ(c56707yPiCopydefault), c56707yPiCopydefault);
    }

    @Override // o.yOW, o.AbstractC56722yPx
    public InterfaceC59098zad KWHzl(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59325zes, "");
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return C59370zfk.OLrzqt(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, bR_().toString(), abstractC59325zes.toString());
    }

    @Override // o.C56706yPh
    public java.lang.String toString() {
        java.lang.String strAEQbTJ = bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }
}
