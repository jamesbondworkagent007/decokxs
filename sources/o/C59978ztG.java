package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C60067zuq;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.ztG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59978ztG<T> {
    public C59979ztH<T> AEQbTJ;
    public InterfaceC59997ztZ AYXKKw;
    public boolean EZpvd;
    public final Kind KWHzl;
    public final Function2<C60060zuj, C60053zuc, T> OLrzqt;
    public final InterfaceC56551yJo<?> copydefault;
    public final InterfaceC59997ztZ djBIcL;
    public java.util.List<? extends InterfaceC56551yJo<?>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ztG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C59978ztG copy$default(C59978ztG c59978ztG, InterfaceC59997ztZ interfaceC59997ztZ, InterfaceC56551yJo interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ2, Function2 function2, Kind kind, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = c59978ztG.djBIcL;
        }
        if ((i & 2) != 0) {
            interfaceC56551yJo = c59978ztG.copydefault;
        }
        InterfaceC56551yJo interfaceC56551yJo2 = interfaceC56551yJo;
        if ((i & 4) != 0) {
            interfaceC59997ztZ2 = c59978ztG.AYXKKw;
        }
        InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ2;
        if ((i & 8) != 0) {
            function2 = c59978ztG.OLrzqt;
        }
        Function2 function22 = function2;
        if ((i & 16) != 0) {
            kind = c59978ztG.KWHzl;
        }
        Kind kind2 = kind;
        if ((i & 32) != 0) {
            list = c59978ztG.valueOf;
        }
        return c59978ztG.AEQbTJ(interfaceC59997ztZ, interfaceC56551yJo2, interfaceC59997ztZ3, function22, kind2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<C60060zuj, C60053zuc, T> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59978ztG<T> AEQbTJ(@NotNull InterfaceC59997ztZ interfaceC59997ztZ, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ2, @NotNull Function2<? super C60060zuj, ? super C60053zuc, ? extends T> function2, @NotNull Kind kind, @NotNull java.util.List<? extends InterfaceC56551yJo<?>> list) {
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C59978ztG<>(interfaceC59997ztZ, interfaceC56551yJo, interfaceC59997ztZ2, function2, kind, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56551yJo<?> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<? extends InterfaceC56551yJo<?>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59979ztH<T> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59997ztZ OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59997ztZ copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.yJo<?>>, java.util.List<o.yJo<?>> */
    public final java.util.List<InterfaceC56551yJo<?>> valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super o.zuj, ? super o.zuc, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59978ztG(@NotNull InterfaceC59997ztZ interfaceC59997ztZ, @NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ2, @NotNull Function2<? super C60060zuj, ? super C60053zuc, ? extends T> function2, @NotNull Kind kind, @NotNull java.util.List<? extends InterfaceC56551yJo<?>> list) {
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = interfaceC59997ztZ;
        this.copydefault = interfaceC56551yJo;
        this.AYXKKw = interfaceC59997ztZ2;
        this.OLrzqt = function2;
        this.KWHzl = kind;
        this.valueOf = list;
        this.AEQbTJ = new C59979ztH<>(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string = this.KWHzl.toString();
        java.lang.String str3 = '\'' + C60067zuq.KWHzl(this.copydefault) + '\'';
        java.lang.String str4 = "";
        if (this.AYXKKw != null) {
            str = ",qualifier:" + this.AYXKKw;
            if (str == null) {
                str = "";
            }
        }
        if (Intrinsics.EZpvd(this.djBIcL, C60059zui.KWHzl.KWHzl())) {
            str2 = "";
        } else {
            str2 = ",scope:" + this.djBIcL;
        }
        if (!this.valueOf.isEmpty()) {
            str4 = ",binds:" + CollectionsKt___CollectionsKt.joinToString$default(this.valueOf, ",", null, null, 0, null, new Function1<InterfaceC56551yJo<?>, java.lang.CharSequence>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
                    Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
                    return C60067zuq.KWHzl(interfaceC56551yJo);
                }
            }, 30, null);
        }
        return AbstractJsonLexerKt.BEGIN_LIST + string + AbstractJsonLexerKt.COLON + str3 + str + str2 + str4 + AbstractJsonLexerKt.END_LIST;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        Intrinsics.copydefault(obj, "");
        C59978ztG c59978ztG = (C59978ztG) obj;
        return Intrinsics.EZpvd(this.copydefault, c59978ztG.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c59978ztG.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c59978ztG.djBIcL);
    }

    public int hashCode() {
        InterfaceC59997ztZ interfaceC59997ztZ = this.AYXKKw;
        return ((((interfaceC59997ztZ != null ? interfaceC59997ztZ.hashCode() : 0) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
    }
}
