package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56482yH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56563yK<T> implements InterfaceC56482yH<T> {
    public final boolean EZpvd;
    public final java.util.Map<java.lang.String, java.util.List<T>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56563yK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56482yH
    public boolean KWHzl() {
        return this.EZpvd;
    }

    public C56563yK(boolean z, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<? extends T>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = z;
        java.util.Map<java.lang.String, java.util.List<T>> mapEZpvd = EZpvd(map);
        if (KWHzl()) {
            C57949ys c57949ys = new C57949ys();
            c57949ys.putAll(mapEZpvd);
            mapEZpvd = c57949ys;
        }
        this.KWHzl = mapEZpvd;
    }

    @Override // o.InterfaceC56482yH
    public void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.util.List<? extends T>, Unit> function2) {
        InterfaceC56482yH.Application.OLrzqt(this, function2);
    }

    @Override // o.InterfaceC56482yH
    public T copydefault(@NotNull java.lang.String str) {
        return (T) InterfaceC56482yH.Application.KWHzl(this, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0009: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:72)) : (r2v0 java.util.Map))
 A[MD:(boolean, java.util.Map<java.lang.String, ? extends java.util.List<? extends T>>):void (m)] (LINE:70) call: o.yK.<init>(boolean, java.util.Map):void type: THIS */
    public /* synthetic */ C56563yK(boolean z, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }

    @Override // o.InterfaceC56482yH
    public java.util.List<T> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(str);
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<java.lang.String> OLrzqt() {
        return this.KWHzl.keySet();
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<Map.Entry<java.lang.String, java.util.List<T>>> AEQbTJ() {
        return this.KWHzl.entrySet();
    }

    @Override // o.InterfaceC56482yH
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.containsKey(str);
    }

    @Override // o.InterfaceC56482yH
    public boolean EZpvd() {
        return this.KWHzl.isEmpty();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterfaceC56482yH)) {
            return false;
        }
        InterfaceC56482yH interfaceC56482yH = (InterfaceC56482yH) obj;
        if (KWHzl() != interfaceC56482yH.KWHzl()) {
            return false;
        }
        java.util.Set<java.lang.String> setOLrzqt = OLrzqt();
        if (setOLrzqt.size() != interfaceC56482yH.OLrzqt().size()) {
            return false;
        }
        java.util.Set<java.lang.String> set = setOLrzqt;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            for (java.lang.String str : set) {
                if (!Intrinsics.EZpvd(KWHzl(str), interfaceC56482yH.KWHzl(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final java.util.Map<java.lang.String, java.util.List<T>> EZpvd(java.util.Map<java.lang.String, ? extends java.util.List<? extends T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh((java.util.List) entry.getValue()));
        }
        return linkedHashMap;
    }
}
