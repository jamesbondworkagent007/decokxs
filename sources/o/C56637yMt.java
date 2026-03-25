package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import o.C56929yXo;
import o.yMB;

/* JADX INFO: renamed from: o.yMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56637yMt {
    public static final C56637yMt EZpvd = new C56637yMt();
    public static final java.util.Set<C56929yXo> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C56929yXo> EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C56929yXo> copydefault() {
        return KWHzl;
    }

    private C56637yMt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=5] */
    static {
        java.util.Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(yMB.copydefault((PrimitiveType) it.next()));
        }
        java.util.List listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C56933yXs>) CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C56933yXs>) CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C56933yXs>) arrayList, yMB.Application.DCJXGO.djBIcL()), yMB.Application.copydefault.djBIcL()), yMB.Application.valueOf.djBIcL());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
        java.util.Iterator it2 = listCopydefault.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(actionBar.KWHzl((C56933yXs) it2.next()));
        }
        KWHzl = linkedHashSet;
    }
}
