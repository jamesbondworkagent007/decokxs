package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5119Fl {
    public static final FA.Application OLrzqt(C5127Ft c5127Ft, java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ;
        if (str != null && (pairAEQbTJ = AEQbTJ(str)) != null) {
            java.lang.String strComponent1 = pairAEQbTJ.component1();
            java.lang.String strComponent2 = pairAEQbTJ.component2();
            if (c5127Ft != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) strComponent2, (java.lang.Object) c5127Ft.OLrzqt())) {
                    strComponent2 = null;
                }
                return new FA.Application(strComponent1, strComponent2);
            }
            if (strComponent2 != null) {
                return new FA.Application(strComponent1, strComponent2);
            }
            return new FA.Application(strComponent1, null, 2, null);
        }
        throw new DeserializationException("Unable to parse qualified name from " + str);
    }

    public static final java.util.Set<FA.Application> AEQbTJ(@NotNull C5101Et c5101Et, C5127Ft c5127Ft) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set setAEQbTJ = yED.AEQbTJ(toQualifiedName$default(c5101Et, null, 1, null));
        java.util.Set<InterfaceC5096Eo> setAEQbTJ2 = c5101Et.AEQbTJ();
        java.util.ArrayList<InterfaceC5096Eo> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setAEQbTJ2) {
            if (((InterfaceC5096Eo) obj).getClass() == C5113Ff.class) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InterfaceC5096Eo interfaceC5096Eo : arrayList) {
            if (interfaceC5096Eo == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.XmlAliasName");
            }
            arrayList2.add((C5113Ff) interfaceC5096Eo);
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(setOqFWZa, 10));
        java.util.Iterator it = setOqFWZa.iterator();
        while (it.hasNext()) {
            arrayList3.add(OLrzqt(c5127Ft, ((C5113Ff) it.next()).AEQbTJ()));
        }
        return yEJ.KWHzl(setAEQbTJ, arrayList3);
    }

    public static final boolean EZpvd(@NotNull C5101Et c5101Et, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set qualifiedNames$default = toQualifiedNames$default(c5101Et, null, 1, null);
        if (!(qualifiedNames$default instanceof java.util.Collection) || !qualifiedNames$default.isEmpty()) {
            java.util.Iterator it = qualifiedNames$default.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FA.Application) it.next()).OLrzqt(), (java.lang.Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void KWHzl(@NotNull C5101Et c5101Et, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set qualifiedNames$default = toQualifiedNames$default(c5101Et, null, 1, null);
        if (EZpvd(c5101Et, str)) {
            return;
        }
        throw new DeserializationException("Expected beginning element named " + CollectionsKt___CollectionsKt.joinToString$default(qualifiedNames$default, " or ", null, null, 0, null, null, 62, null) + " but found " + str);
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (KWHzl(str)) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null);
            return C56390yDp.OLrzqt((java.lang.String) listSplit$default.get(1), (java.lang.String) listSplit$default.get(0));
        }
        return C56390yDp.OLrzqt(str, null);
    }

    public static final boolean AEQbTJ(@NotNull C5098Eq c5098Eq) {
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        java.util.List<C5101Et> listOLrzqt = c5098Eq.OLrzqt();
        if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                java.util.Set<InterfaceC5096Eo> setAEQbTJ = ((C5101Et) it.next()).AEQbTJ();
                if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
                    java.util.Iterator<T> it2 = setAEQbTJ.iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC5096Eo) it2.next()) instanceof C5112Fe) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final FA.Application OLrzqt(@NotNull C5101Et c5101Et, C5127Ft c5127Ft) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == C5128Fu.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5128Fu)) {
            interfaceC5096Eo = null;
        }
        C5128Fu c5128Fu = (C5128Fu) interfaceC5096Eo;
        return OLrzqt(c5127Ft, c5128Fu != null ? c5128Fu.AEQbTJ() : null);
    }

    public static /* synthetic */ FA.Application toQualifiedName$default(C5101Et c5101Et, C5127Ft c5127Ft, int i, java.lang.Object obj) {
        java.lang.Object next;
        if ((i & 1) != 0) {
            java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                    break;
                }
            }
            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
            c5127Ft = (C5127Ft) (interfaceC5096Eo instanceof C5127Ft ? interfaceC5096Eo : null);
        }
        return OLrzqt(c5101Et, c5127Ft);
    }

    public static /* synthetic */ java.util.Set toQualifiedNames$default(C5101Et c5101Et, C5127Ft c5127Ft, int i, java.lang.Object obj) {
        java.lang.Object next;
        if ((i & 1) != 0) {
            java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                    break;
                }
            }
            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
            c5127Ft = (C5127Ft) (interfaceC5096Eo instanceof C5127Ft ? interfaceC5096Eo : null);
        }
        return AEQbTJ(c5101Et, c5127Ft);
    }

    public static final C5128Fu OLrzqt(@NotNull C5101Et c5101Et) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == C5128Fu.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (interfaceC5096Eo == null) {
            throw new java.lang.IllegalArgumentException(("Expected to find trait " + C56524yIo.AEQbTJ(C5128Fu.class) + " in " + c5101Et + " but was not present.").toString());
        }
        return (C5128Fu) interfaceC5096Eo;
    }

    public static final java.lang.String copydefault(@NotNull C5101Et c5101Et) {
        java.lang.Object next;
        java.lang.String strCopydefault;
        java.lang.Object next2;
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5115Fh) {
                    java.util.Iterator<T> it2 = c5101Et.AEQbTJ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((InterfaceC5096Eo) next).getClass() == C5115Fh.class) {
                            break;
                        }
                    }
                    InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
                    C5115Fh c5115Fh = (C5115Fh) (interfaceC5096Eo instanceof C5115Fh ? interfaceC5096Eo : null);
                    return (c5115Fh == null || (strCopydefault = c5115Fh.copydefault()) == null) ? C5115Fh.OLrzqt.OLrzqt().copydefault() : strCopydefault;
                }
            }
        }
        java.util.Set<InterfaceC5096Eo> setAEQbTJ2 = c5101Et.AEQbTJ();
        if (!(setAEQbTJ2 instanceof java.util.Collection) || !setAEQbTJ2.isEmpty()) {
            java.util.Iterator<T> it3 = setAEQbTJ2.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC5096Eo) it3.next()) instanceof C5125Fr) {
                    java.util.Iterator<T> it4 = c5101Et.AEQbTJ().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        if (((InterfaceC5096Eo) next2).getClass() == C5125Fr.class) {
                            break;
                        }
                    }
                    InterfaceC5096Eo interfaceC5096Eo2 = (InterfaceC5096Eo) next2;
                    C5125Fr c5125Fr = (C5125Fr) (interfaceC5096Eo2 instanceof C5125Fr ? interfaceC5096Eo2 : null);
                    return (c5125Fr == null || (strKWHzl = c5125Fr.KWHzl()) == null) ? C5125Fr.EZpvd.KWHzl().KWHzl() : strKWHzl;
                }
            }
        }
        java.util.Iterator<T> it5 = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            java.lang.Object next3 = it5.next();
            if (((InterfaceC5096Eo) next3).getClass() == C5128Fu.class) {
                obj = next3;
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo3 = (InterfaceC5096Eo) obj;
        if (interfaceC5096Eo3 != null) {
            return ((C5128Fu) interfaceC5096Eo3).AEQbTJ();
        }
        throw new java.lang.IllegalArgumentException(("Expected to find trait " + C56524yIo.AEQbTJ(C5128Fu.class) + " in " + c5101Et + " but was not present.").toString());
    }
}
