package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4868Bu implements BI {
    public final C58617zJ AEQbTJ;
    public final C58617zJ KWHzl;
    public final C58617zJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C4868Bu() {
        this(null, null, null, 7, null);
    }

    public C4868Bu(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull java.util.Map<java.lang.String, java.lang.String> map3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        this.copydefault = new C58617zJ();
        this.AEQbTJ = new C58617zJ();
        this.KWHzl = new C58617zJ();
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            copydefault(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry2 : map2.entrySet()) {
            KWHzl(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry3 : map3.entrySet()) {
            OLrzqt(entry3.getKey(), entry3.getValue());
        }
    }

    @Override // o.BI
    public void copydefault(@NotNull BY<?, ?> by) {
        BI.Activity.KWHzl(this, by);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:17)) : (r1v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000c: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:18)) : (r2v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0014: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:19)) : (r3v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:16) call: o.Bu.<init>(java.util.Map, java.util.Map, java.util.Map):void type: THIS */
    public /* synthetic */ C4868Bu(java.util.Map map, java.util.Map map2, java.util.Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? C56424yEw.KWHzl() : map2, (i & 4) != 0 ? C56424yEw.KWHzl() : map3);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.EZpvd(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC5076Du
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super BP<C5036Cg>> continuation) {
        java.util.Iterator<T> it = this.AEQbTJ.copydefault().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bp.EZpvd().AEQbTJ().EZpvd((java.lang.String) entry.getKey(), (java.lang.Iterable) entry.getValue());
        }
        java.util.Iterator<T> it2 = this.copydefault.copydefault().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            bp.EZpvd().AEQbTJ().EZpvd((java.lang.String) entry2.getKey(), CollectionsKt___CollectionsKt.AubY((java.util.List) entry2.getValue()));
        }
        java.util.Iterator<T> it3 = this.KWHzl.copydefault().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            java.lang.String str = (java.lang.String) entry3.getKey();
            java.util.List list = (java.util.List) entry3.getValue();
            if (!bp.EZpvd().AEQbTJ().AEQbTJ(str)) {
                bp.EZpvd().AEQbTJ().EZpvd(str, CollectionsKt___CollectionsKt.AubY(list));
            }
        }
        return bp;
    }
}
