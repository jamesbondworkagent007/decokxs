package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56803ySx implements ySA {
    public final yTT AEQbTJ;
    public final java.util.Map<C56935yXu, InterfaceC56841yUh> EZpvd;
    public final Function1<InterfaceC56836yUc, java.lang.Boolean> KWHzl;
    public final Function1<InterfaceC56835yUb, java.lang.Boolean> OLrzqt;
    public final java.util.Map<C56935yXu, yTW> copydefault;
    public final java.util.Map<C56935yXu, java.util.List<InterfaceC56835yUb>> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.yUc, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56803ySx(@NotNull yTT ytt, @NotNull Function1<? super InterfaceC56836yUc, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(ytt, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = ytt;
        this.KWHzl = function1;
        ySB ysb = new ySB(this);
        this.OLrzqt = ysb;
        Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(ytt.values()), ysb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : sequenceDbNXlk) {
            C56935yXu c56935yXuFIwbmz = ((InterfaceC56835yUb) obj).fIwbmz();
            java.lang.Object arrayList = linkedHashMap.get(c56935yXuFIwbmz);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(c56935yXuFIwbmz, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.valueOf = linkedHashMap;
        Sequence sequenceDbNXlk2 = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(this.AEQbTJ.AhwBna()), this.KWHzl);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (java.lang.Object obj2 : sequenceDbNXlk2) {
            linkedHashMap2.put(((yTW) obj2).fIwbmz(), obj2);
        }
        this.copydefault = linkedHashMap2;
        java.util.Collection<InterfaceC56841yUh> collectionFARcdN = this.AEQbTJ.fARcdN();
        Function1<InterfaceC56836yUc, java.lang.Boolean> function12 = this.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : collectionFARcdN) {
            if (function12.invoke((InterfaceC56836yUc) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
        for (java.lang.Object obj4 : arrayList2) {
            linkedHashMap3.put(((InterfaceC56841yUh) obj4).fIwbmz(), obj4);
        }
        this.EZpvd = linkedHashMap3;
    }

    public static final boolean EZpvd(C56803ySx c56803ySx, InterfaceC56835yUb interfaceC56835yUb) {
        Intrinsics.checkNotNullParameter(interfaceC56835yUb, "");
        return c56803ySx.KWHzl.invoke(interfaceC56835yUb).booleanValue() && !C56837yUd.copydefault((InterfaceC56836yUc) interfaceC56835yUb);
    }

    @Override // o.ySA
    public java.util.Collection<InterfaceC56835yUb> copydefault(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.util.List<InterfaceC56835yUb> list = this.valueOf.get(c56935yXu);
        return list != null ? list : yDY.AhwBna();
    }

    @Override // o.ySA
    public java.util.Set<C56935yXu> KWHzl() {
        Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(this.AEQbTJ.values()), this.OLrzqt);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator it = sequenceDbNXlk.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC56835yUb) it.next()).fIwbmz());
        }
        return linkedHashSet;
    }

    @Override // o.ySA
    public yTW OLrzqt(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return this.copydefault.get(c56935yXu);
    }

    @Override // o.ySA
    public java.util.Set<C56935yXu> copydefault() {
        Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(this.AEQbTJ.AhwBna()), this.KWHzl);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator it = sequenceDbNXlk.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((yTW) it.next()).fIwbmz());
        }
        return linkedHashSet;
    }

    @Override // o.ySA
    public java.util.Set<C56935yXu> EZpvd() {
        return this.EZpvd.keySet();
    }

    @Override // o.ySA
    public InterfaceC56841yUh AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return this.EZpvd.get(c56935yXu);
    }
}
