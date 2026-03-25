package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yTI extends AbstractC59272zds implements InterfaceC59243zdP {
    public yTI(AbstractC59242zdO abstractC59242zdO, AbstractC59242zdO abstractC59242zdO2, boolean z) {
        super(abstractC59242zdO, abstractC59242zdO2);
        if (z) {
            return;
        }
        InterfaceC59284zeD.OLrzqt.copydefault(abstractC59242zdO, abstractC59242zdO2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yTI(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        this(abstractC59242zdO, abstractC59242zdO2, false);
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
    }

    @Override // o.AbstractC59272zds
    public AbstractC59242zdO EZpvd() {
        return valueOf();
    }

    @Override // o.AbstractC59272zds, o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        InterfaceC56663yNs interfaceC56663yNsKWHzl = djBIcL().KWHzl();
        C59320zen c59320zen = null;
        byte b = 0;
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsKWHzl : null;
        if (interfaceC56658yNn == null) {
            throw new java.lang.IllegalStateException(("Incorrect classifier: " + djBIcL().KWHzl()).toString());
        }
        InterfaceC59098zad interfaceC59098zadCopydefault = interfaceC56658yNn.copydefault(new yTB(c59320zen, 1, b == true ? 1 : 0));
        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadCopydefault, "");
        return interfaceC59098zadCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yTI AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new yTI(valueOf().AEQbTJ(c59308zeb), AYXKKw().AEQbTJ(c59308zeb));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yTI AEQbTJ(boolean z) {
        return new yTI(valueOf().AEQbTJ(z), AYXKKw().AEQbTJ(z));
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) StringsKt__StringsKt.KWHzl(str2, (java.lang.CharSequence) "out ")) || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "*");
    }

    public static final java.util.List<java.lang.String> copydefault(yXX yxx, AbstractC59233zdF abstractC59233zdF) {
        java.util.List<InterfaceC59317zek> listBY_ = abstractC59233zdF.bY_();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listBY_, 10));
        java.util.Iterator<T> it = listBY_.iterator();
        while (it.hasNext()) {
            arrayList.add(yxx.OLrzqt((InterfaceC59317zek) it.next()));
        }
        return arrayList;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '<', false, 2, (java.lang.Object) null)) {
            return str;
        }
        return StringsKt__StringsKt.substringBefore$default(str, '<', (java.lang.String) null, 2, (java.lang.Object) null) + '<' + str2 + '>' + StringsKt__StringsKt.substringAfterLast$default(str, '>', (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC59272zds
    public java.lang.String OLrzqt(@NotNull yXX yxx, @NotNull InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(yxx, "");
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        java.lang.String strKWHzl = yxx.KWHzl(valueOf());
        java.lang.String strKWHzl2 = yxx.KWHzl(AYXKKw());
        if (interfaceC56959yYr.djBIcL()) {
            return "raw (" + strKWHzl + ".." + strKWHzl2 + ')';
        }
        if (AYXKKw().bY_().isEmpty()) {
            return yxx.OLrzqt(strKWHzl, strKWHzl2, C59336zfC.copydefault((AbstractC59233zdF) this));
        }
        java.util.List<java.lang.String> listCopydefault = copydefault(yxx, valueOf());
        java.util.List<java.lang.String> listCopydefault2 = copydefault(yxx, AYXKKw());
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listCopydefault, ", ", null, null, 0, null, yTG.OLrzqt, 30, null);
        java.util.List<kotlin.Pair> listValues = CollectionsKt___CollectionsKt.values(listCopydefault, listCopydefault2);
        if ((listValues instanceof java.util.Collection) && listValues.isEmpty()) {
            strKWHzl2 = copydefault(strKWHzl2, strJoinToString$default);
        } else {
            for (kotlin.Pair pair : listValues) {
                if (!OLrzqt((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond())) {
                    break;
                }
            }
            strKWHzl2 = copydefault(strKWHzl2, strJoinToString$default);
        }
        java.lang.String strCopydefault = copydefault(strKWHzl, strJoinToString$default);
        return Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) strKWHzl2) ? strCopydefault : yxx.OLrzqt(strCopydefault, strKWHzl2, C59336zfC.copydefault((AbstractC59233zdF) this));
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "(raw) " + str;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC59272zds KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(valueOf());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ2 = abstractC59287zeG.AEQbTJ(AYXKKw());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ2, "");
        return new yTI((AbstractC59242zdO) abstractC59233zdFAEQbTJ, (AbstractC59242zdO) abstractC59233zdFAEQbTJ2, true);
    }
}
