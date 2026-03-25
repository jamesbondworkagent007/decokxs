package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59367zfh implements InterfaceC59098zad {
    public final java.lang.String EZpvd;
    public final ErrorScopeKind copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
    }

    public C59367zfh(@NotNull ErrorScopeKind errorScopeKind, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorScopeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.copydefault = errorScopeKind;
        java.lang.String debugMessage = errorScopeKind.getDebugMessage();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "");
        this.EZpvd = str;
    }

    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.lang.String str = java.lang.String.format(ErrorEntity.ERROR_CLASS.getDebugText(), java.util.Arrays.copyOf(new java.lang.Object[]{c56935yXu}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        C56935yXu c56935yXuCopydefault = C56935yXu.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
        return new C59361zfb(c56935yXuCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXu;Lo/yQV;)Ljava/util/Collection; */
    @Override // o.InterfaceC59098zad
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public java.util.Set<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return C59370zfk.AEQbTJ.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yXu;Lo/yQV;)Ljava/util/Collection; */
    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.Set<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yED.AEQbTJ(new C59305zeY(C59370zfk.AEQbTJ.OLrzqt()));
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return yEE.copydefault();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return yEE.copydefault();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return yEE.copydefault();
    }

    public java.lang.String toString() {
        return "ErrorScope{" + this.EZpvd + AbstractJsonLexerKt.END_OBJ;
    }
}
