package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59372zfm extends C59367zfh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59372zfm(@NotNull ErrorScopeKind errorScopeKind, @NotNull java.lang.String... strArr) {
        super(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullParameter(errorScopeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
    }

    @Override // o.C59367zfh, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        throw new java.lang.IllegalStateException(KWHzl() + ", required name: " + c56935yXu);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXu;Lo/yQV;)Ljava/util/Collection; */
    @Override // o.C59367zfh, o.InterfaceC59098zad
    /* JADX INFO: renamed from: AYXKKw */
    public java.util.Set<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        throw new java.lang.IllegalStateException(KWHzl() + ", required name: " + c56935yXu);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yXu;Lo/yQV;)Ljava/util/Collection; */
    @Override // o.C59367zfh, o.InterfaceC59098zad, o.InterfaceC59101zag
    /* JADX INFO: renamed from: KWHzl */
    public java.util.Set<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        throw new java.lang.IllegalStateException(KWHzl() + ", required name: " + c56935yXu);
    }

    @Override // o.C59367zfh, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        throw new java.lang.IllegalStateException(KWHzl());
    }

    @Override // o.C59367zfh, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        throw new java.lang.IllegalStateException();
    }

    @Override // o.C59367zfh, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        throw new java.lang.IllegalStateException();
    }

    @Override // o.C59367zfh, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        throw new java.lang.IllegalStateException();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yXu;Lo/yQV;)V */
    @Override // o.C59367zfh, o.InterfaceC59101zag
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public java.lang.Void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        throw new java.lang.IllegalStateException();
    }

    @Override // o.C59367zfh
    public java.lang.String toString() {
        return "ThrowingScope{" + KWHzl() + AbstractJsonLexerKt.END_OBJ;
    }
}
