package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47186tlL {
    public final java.util.Set<C47190tlP> EZpvd;
    public final java.util.List<C47193tlS> KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47186tlL() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C47193tlS> OLrzqt() {
        return this.KWHzl;
    }

    public C47186tlL(int i) {
        this.copydefault = i;
        this.KWHzl = new java.util.ArrayList();
        this.EZpvd = new LinkedHashSet();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:6) call: o.tlL.<init>(int):void type: THIS */
    public /* synthetic */ C47186tlL(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    public final void EZpvd(@NotNull C47190tlP c47190tlP, double d, double d2) {
        Intrinsics.checkNotNullParameter(c47190tlP, "");
        if (this.EZpvd.contains(c47190tlP)) {
            return;
        }
        C47193tlS c47193tlS = new C47193tlS(c47190tlP, d, d2);
        if (this.KWHzl.size() < this.copydefault) {
            this.KWHzl.add(c47193tlS);
            this.EZpvd.add(c47190tlP);
            java.util.List<C47193tlS> list = this.KWHzl;
            if (list.size() > 1) {
                C56407yEf.copydefault(list, new TaskDescription());
                return;
            }
            return;
        }
        if (((C47193tlS) CollectionsKt___CollectionsKt.AubY(this.KWHzl)).KWHzl() < c47193tlS.KWHzl()) {
            this.EZpvd.remove(((C47193tlS) CollectionsKt___CollectionsKt.AubY(this.KWHzl)).copydefault());
            this.KWHzl.set(this.copydefault - 1, c47193tlS);
            this.EZpvd.add(c47190tlP);
            java.util.List<C47193tlS> list2 = this.KWHzl;
            if (list2.size() > 1) {
                C56407yEf.copydefault(list2, new Application());
            }
        }
    }

    /* JADX INFO: renamed from: o.tlL$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((C47193tlS) t2).KWHzl()), java.lang.Double.valueOf(((C47193tlS) t).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: o.tlL$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((C47193tlS) t2).KWHzl()), java.lang.Double.valueOf(((C47193tlS) t).KWHzl()));
        }
    }
}
