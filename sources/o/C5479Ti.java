package o;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5479Ti {
    public final C5478Th AYXKKw;
    public boolean copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public final java.lang.Object djBIcL = new java.lang.Object();
    public volatile java.util.List<AbstractRunnableC5485To> valueOf = new java.util.ArrayList();
    public volatile java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public final java.util.Map<java.lang.String, C5486Tp> AhwBna = new java.util.HashMap();
    public final android.os.Handler KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.Comparator<AbstractRunnableC5485To> gEmmrt = TaskDescription.KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Comparator<AbstractRunnableC5485To> copydefault() {
        return this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.Ti$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator<AbstractRunnableC5485To> {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final int compare(AbstractRunnableC5485To abstractRunnableC5485To, AbstractRunnableC5485To abstractRunnableC5485To2) {
            Intrinsics.AEQbTJ(abstractRunnableC5485To, "");
            Intrinsics.AEQbTJ(abstractRunnableC5485To2, "");
            return C5490Tt.copydefault(abstractRunnableC5485To, abstractRunnableC5485To2);
        }
    }

    public C5479Ti(ExecutorService executorService) {
        this.AYXKKw = new C5478Th(executorService);
    }

    public final void AEQbTJ() {
        this.copydefault = false;
        this.EZpvd.clear();
        this.valueOf.clear();
        this.AhwBna.clear();
    }

    public final void EZpvd(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.EZpvd((java.lang.Object) set, "");
        synchronized (this.AEQbTJ) {
            if (!set.isEmpty()) {
                this.EZpvd.addAll(set);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.EZpvd((java.lang.Object) str, "");
        synchronized (this.AEQbTJ) {
            if (!android.text.TextUtils.isEmpty(str)) {
                this.EZpvd.remove(str);
                synchronized (this.djBIcL) {
                    this.djBIcL.notify();
                    Unit unit = Unit.INSTANCE;
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final boolean OLrzqt() {
        boolean zIsEmpty;
        synchronized (this.AEQbTJ) {
            zIsEmpty = this.EZpvd.isEmpty();
        }
        return !zIsEmpty;
    }

    public final void OLrzqt(AbstractRunnableC5485To abstractRunnableC5485To) {
        synchronized (this.OLrzqt) {
            if (!this.valueOf.contains(abstractRunnableC5485To)) {
                this.valueOf.add(abstractRunnableC5485To);
                synchronized (this.djBIcL) {
                    this.djBIcL.notify();
                    Unit unit = Unit.INSTANCE;
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        while (OLrzqt()) {
            synchronized (this.djBIcL) {
                if (this.valueOf.isEmpty()) {
                    this.djBIcL.wait();
                }
                Unit unit = Unit.INSTANCE;
            }
            while (!this.valueOf.isEmpty()) {
                synchronized (this.OLrzqt) {
                    if (!this.valueOf.isEmpty()) {
                        Collections.sort(this.valueOf, this.gEmmrt);
                        AbstractRunnableC5485To abstractRunnableC5485ToRemove = this.valueOf.remove(0);
                        if (abstractRunnableC5485ToRemove != null) {
                            if (OLrzqt()) {
                                abstractRunnableC5485ToRemove.run();
                            } else {
                                this.KWHzl.post(abstractRunnableC5485ToRemove);
                                java.util.Iterator<AbstractRunnableC5485To> it = this.valueOf.iterator();
                                while (it.hasNext()) {
                                    this.KWHzl.post(it.next());
                                }
                                this.valueOf.clear();
                            }
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    public final boolean OLrzqt(java.lang.String str) {
        return this.AhwBna.get(str) != null;
    }

    public final C5486Tp KWHzl(@NotNull java.lang.String str) {
        Intrinsics.EZpvd((java.lang.Object) str, "");
        return this.AhwBna.get(str);
    }

    public final void AEQbTJ(@NotNull AbstractRunnableC5485To abstractRunnableC5485To, @NotNull java.lang.String str) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        Intrinsics.EZpvd((java.lang.Object) str, "");
        C5486Tp c5486Tp = this.AhwBna.get(abstractRunnableC5485To.gEmmrt());
        if (c5486Tp != null) {
            c5486Tp.AEQbTJ(str);
        }
    }

    public final void EZpvd(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        C5486Tp c5486Tp = this.AhwBna.get(abstractRunnableC5485To.gEmmrt());
        if (c5486Tp != null) {
            c5486Tp.EZpvd(abstractRunnableC5485To.AhwBna(), java.lang.System.currentTimeMillis());
        }
    }

    public final void AEQbTJ(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        if (abstractRunnableC5485To.djBIcL()) {
            this.AYXKKw.AEQbTJ().execute(abstractRunnableC5485To);
        } else if (!OLrzqt()) {
            this.KWHzl.post(abstractRunnableC5485To);
        } else {
            OLrzqt(abstractRunnableC5485To);
        }
    }

    public final void copydefault(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        LinkedHashSet<AbstractRunnableC5485To> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(abstractRunnableC5485To);
        AEQbTJ(abstractRunnableC5485To, linkedHashSet);
        java.util.Iterator<java.lang.String> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!OLrzqt(next)) {
                if (this.copydefault) {
                    C5484Tn.KWHzl("ANCHOR_DETAIL", "anchor \"" + next + "\" no found !");
                }
                it.remove();
            } else {
                C5486Tp c5486TpKWHzl = KWHzl(next);
                KWHzl(c5486TpKWHzl != null ? c5486TpKWHzl.KWHzl() : null);
            }
        }
    }

    public final void AEQbTJ(AbstractRunnableC5485To abstractRunnableC5485To, LinkedHashSet<AbstractRunnableC5485To> linkedHashSet) {
        abstractRunnableC5485To.EZpvd(this);
        C5486Tp c5486TpKWHzl = KWHzl(abstractRunnableC5485To.gEmmrt());
        if (c5486TpKWHzl == null) {
            C5486Tp c5486Tp = new C5486Tp(abstractRunnableC5485To);
            if (this.EZpvd.contains(abstractRunnableC5485To.gEmmrt())) {
                c5486Tp.copydefault(true);
            }
            this.AhwBna.put(abstractRunnableC5485To.gEmmrt(), c5486Tp);
        } else if (!c5486TpKWHzl.copydefault(abstractRunnableC5485To)) {
            throw new java.lang.RuntimeException("Multiple different tasks are not allowed to contain the same id (" + abstractRunnableC5485To.gEmmrt() + ")!");
        }
        for (AbstractRunnableC5485To abstractRunnableC5485To2 : abstractRunnableC5485To.EZpvd()) {
            if (linkedHashSet.contains(abstractRunnableC5485To2)) {
                throw new java.lang.RuntimeException("Do not allow dependency graphs to have a loopback！Related task'id is " + abstractRunnableC5485To.gEmmrt() + " !");
            }
            linkedHashSet.add(abstractRunnableC5485To2);
            if (this.copydefault && abstractRunnableC5485To2.EZpvd().isEmpty()) {
                java.util.Iterator<AbstractRunnableC5485To> it = linkedHashSet.iterator();
                Intrinsics.AEQbTJ(it, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (it.hasNext()) {
                    sb.append(it.next().gEmmrt());
                    sb.append(" --> ");
                }
                if (this.copydefault) {
                    java.lang.String strSubstring = sb.substring(0, sb.length() - 5);
                    Intrinsics.AEQbTJ(strSubstring, "");
                    C5484Tn.EZpvd("DEPENDENCE_DETAIL", strSubstring);
                }
            }
            Intrinsics.AEQbTJ(abstractRunnableC5485To2, "");
            AEQbTJ(abstractRunnableC5485To2, linkedHashSet);
            linkedHashSet.remove(abstractRunnableC5485To2);
        }
    }

    public final void KWHzl(AbstractRunnableC5485To abstractRunnableC5485To) {
        if (abstractRunnableC5485To == null) {
            return;
        }
        abstractRunnableC5485To.EZpvd(Integer.MAX_VALUE);
        java.util.Iterator<AbstractRunnableC5485To> it = abstractRunnableC5485To.copydefault().iterator();
        while (it.hasNext()) {
            KWHzl(it.next());
        }
    }
}
