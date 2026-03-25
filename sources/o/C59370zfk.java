package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59370zfk {
    public static final AbstractC59233zdF AYXKKw;
    public static final C59361zfb KWHzl;
    public static final java.util.Set<InterfaceC56676yOe> OLrzqt;
    public static final InterfaceC56676yOe copydefault;
    public static final AbstractC59233zdF djBIcL;
    public static final C59370zfk AEQbTJ = new C59370zfk();
    public static final yNP EZpvd = C59365zff.copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<InterfaceC56676yOe> AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59233zdF EZpvd() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59233zdF KWHzl() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59361zfb OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yNP copydefault() {
        return EZpvd;
    }

    private C59370zfk() {
    }

    static {
        java.lang.String str = java.lang.String.format(ErrorEntity.ERROR_CLASS.getDebugText(), java.util.Arrays.copyOf(new java.lang.Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        C56935yXu c56935yXuCopydefault = C56935yXu.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
        KWHzl = new C59361zfb(c56935yXuCopydefault);
        AYXKKw = EZpvd(ErrorTypeKind.CYCLIC_SUPERTYPES, new java.lang.String[0]);
        djBIcL = EZpvd(ErrorTypeKind.ERROR_PROPERTY_TYPE, new java.lang.String[0]);
        C59364zfe c59364zfe = new C59364zfe();
        copydefault = c59364zfe;
        OLrzqt = yED.AEQbTJ(c59364zfe);
    }

    public static final C59367zfh OLrzqt(@NotNull ErrorScopeKind errorScopeKind, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorScopeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return copydefault(errorScopeKind, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final C59367zfh copydefault(@NotNull ErrorScopeKind errorScopeKind, boolean z, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorScopeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return z ? new C59372zfm(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) : new C59367zfh(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final C59366zfg EZpvd(@NotNull ErrorTypeKind errorTypeKind, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return AEQbTJ.KWHzl(errorTypeKind, yDY.AhwBna(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final C59366zfg KWHzl(@NotNull ErrorTypeKind errorTypeKind, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return AEQbTJ(errorTypeKind, yDY.AhwBna(), interfaceC59315zei, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final C59366zfg KWHzl(@NotNull ErrorTypeKind errorTypeKind, @NotNull java.util.List<? extends InterfaceC59317zek> list, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return AEQbTJ(errorTypeKind, list, AEQbTJ(errorTypeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final C59366zfg AEQbTJ(@NotNull ErrorTypeKind errorTypeKind, @NotNull java.util.List<? extends InterfaceC59317zek> list, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return new C59366zfg(interfaceC59315zei, OLrzqt(ErrorScopeKind.ERROR_TYPE_SCOPE, interfaceC59315zei.toString()), errorTypeKind, list, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final C59368zfi AEQbTJ(@NotNull ErrorTypeKind errorTypeKind, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return new C59368zfi(errorTypeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean KWHzl(InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu != null) {
            C59370zfk c59370zfk = AEQbTJ;
            if (c59370zfk.OLrzqt(interfaceC56665yNu) || c59370zfk.OLrzqt(interfaceC56665yNu.AuCTel()) || interfaceC56665yNu == EZpvd) {
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(InterfaceC56665yNu interfaceC56665yNu) {
        return interfaceC56665yNu instanceof C59361zfb;
    }

    public static final boolean KWHzl(AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            return false;
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        return (interfaceC59315zeiDjBIcL instanceof C59368zfi) && ((C59368zfi) interfaceC59315zeiDjBIcL).AEQbTJ() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public final java.lang.String OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        C59336zfC.AYXKKw(abstractC59233zdF);
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        Intrinsics.copydefault(interfaceC59315zeiDjBIcL, "");
        return ((C59368zfi) interfaceC59315zeiDjBIcL).EZpvd(0);
    }
}
