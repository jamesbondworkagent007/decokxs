package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59368zfi implements InterfaceC59315zei {
    public final java.lang.String[] AEQbTJ;
    public final ErrorTypeKind EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorTypeKind AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59315zei
    public InterfaceC59315zei AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    @Override // o.InterfaceC59315zei
    public boolean gEmmrt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.KWHzl;
    }

    public C59368zfi(@NotNull ErrorTypeKind errorTypeKind, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.EZpvd = errorTypeKind;
        this.AEQbTJ = strArr;
        java.lang.String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        java.lang.String debugMessage = errorTypeKind.getDebugMessage();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String str2 = java.lang.String.format(debugText, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        this.KWHzl = str2;
    }

    public final java.lang.String EZpvd(int i) {
        return this.AEQbTJ[i];
    }

    @Override // o.InterfaceC59315zei
    public java.util.List<InterfaceC56691yOt> copydefault() {
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59315zei
    public java.util.Collection<AbstractC59233zdF> bV_() {
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: KWHzl */
    public InterfaceC56663yNs OLrzqt() {
        return C59370zfk.AEQbTJ.OLrzqt();
    }

    @Override // o.InterfaceC59315zei
    public AbstractC56640yMw bU_() {
        return C56638yMu.copydefault.copydefault();
    }
}
