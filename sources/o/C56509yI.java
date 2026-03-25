package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56509yI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56509yI<T> {
    public final boolean EZpvd;
    public final java.util.Map<java.lang.String, java.util.List<T>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56509yI() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<T>> OLrzqt() {
        return this.KWHzl;
    }

    public C56509yI(boolean z, int i) {
        this.EZpvd = z;
        this.KWHzl = z ? new C57949ys<>() : new LinkedHashMap<>(i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r2v0 int))
 A[MD:(boolean, int):void (m)] (LINE:106) call: o.yI.<init>(boolean, int):void type: THIS */
    public /* synthetic */ C56509yI(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 8 : i);
    }

    public final java.util.List<T> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(str);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.containsKey(str);
    }

    public final java.util.Set<java.lang.String> KWHzl() {
        return this.KWHzl.keySet();
    }

    public final boolean AEQbTJ() {
        return this.KWHzl.isEmpty();
    }

    public final java.util.Set<Map.Entry<java.lang.String, java.util.List<T>>> copydefault() {
        return this.KWHzl.entrySet();
    }

    public final void EZpvd(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<T> listCopydefault = copydefault(str, 1);
        listCopydefault.clear();
        listCopydefault.add(t);
    }

    public final void KWHzl(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.KWHzl.containsKey(str)) {
            return;
        }
        EZpvd(str, t);
    }

    public final T EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<T> listKWHzl = KWHzl(str);
        if (listKWHzl != null) {
            return (T) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
        }
        return null;
    }

    public final void OLrzqt(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str, 1).add(t);
    }

    public final void KWHzl(@NotNull InterfaceC56482yH<T> interfaceC56482yH) {
        Intrinsics.checkNotNullParameter(interfaceC56482yH, "");
        interfaceC56482yH.EZpvd(new Function2<java.lang.String, java.util.List<? extends T>, Unit>(this) { // from class: aws.smithy.kotlin.runtime.collections.ValuesMapBuilder$appendAll$1
            final /* synthetic */ C56509yI<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj) {
                invoke(str, (List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str, @NotNull List<? extends T> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.this$0.EZpvd(str, (Iterable) list);
            }
        });
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Collection collection = iterable instanceof java.util.Collection ? (java.util.Collection) iterable : null;
        java.util.List<T> listCopydefault = copydefault(str, collection != null ? collection.size() : 2);
        java.util.Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            listCopydefault.add(it.next());
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Iterable<? extends T> iterable) {
        java.util.Set setCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.List<T> list = this.KWHzl.get(str);
        if (list == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(list)) == null) {
            setCopydefault = yEE.copydefault();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : iterable) {
            if (!setCopydefault.contains(t)) {
                arrayList.add(t);
            }
        }
        EZpvd(str, (java.lang.Iterable) arrayList);
    }

    public final java.util.List<T> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.remove(str);
    }

    public final void EZpvd() {
        this.KWHzl.clear();
    }

    public final java.util.List<T> copydefault(java.lang.String str, int i) {
        java.util.List<T> list = this.KWHzl.get(str);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        this.KWHzl.put(str, arrayList);
        return arrayList;
    }
}
