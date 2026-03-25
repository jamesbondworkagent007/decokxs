package o;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5485To implements java.lang.Runnable, java.lang.Comparable<AbstractRunnableC5485To> {
    public static final ActionBar Companion = new ActionBar(null);
    public final CopyOnWriteArrayList<AbstractRunnableC5485To> AEQbTJ;
    public int AYXKKw;
    public final boolean AhwBna;
    public final java.util.List<InterfaceC5488Tr> DbNXlk;
    public long KWHzl;
    public C5479Ti OLrzqt;
    public final CopyOnWriteArraySet<AbstractRunnableC5485To> copydefault;
    public InterfaceC5488Tr djBIcL;
    public final java.lang.String gEmmrt;
    public int valueOf;

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<AbstractRunnableC5485To> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C5479Ti c5479Ti) {
        Intrinsics.EZpvd((java.lang.Object) c5479Ti, "");
        this.OLrzqt = c5479Ti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String[] OLrzqt(@NotNull java.lang.String[] strArr) {
        Intrinsics.EZpvd((java.lang.Object) strArr, "");
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArraySet<AbstractRunnableC5485To> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    public AbstractRunnableC5485To(@NotNull java.lang.String str, boolean z) {
        Intrinsics.EZpvd((java.lang.Object) str, "");
        this.gEmmrt = str;
        this.AhwBna = z;
        this.AEQbTJ = new CopyOnWriteArrayList<>();
        this.copydefault = new CopyOnWriteArraySet<>();
        this.DbNXlk = new java.util.ArrayList();
        this.djBIcL = new C5477Tg();
        this.valueOf = 0;
        if (!(!android.text.TextUtils.isEmpty(str))) {
            throw new java.lang.IllegalArgumentException("task's mId can't be empty".toString());
        }
        this.AYXKKw = 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:22) call: o.To.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AbstractRunnableC5485To(java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final C5479Ti AEQbTJ() {
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        return c5479Ti;
    }

    public void fetchVPNInfo() {
        synchronized (this) {
            if (this.AYXKKw != 0) {
                throw new java.lang.RuntimeException("can no run task " + this.gEmmrt + " again!");
            }
            AkhnZx();
            this.KWHzl = java.lang.System.currentTimeMillis();
            C5479Ti c5479Ti = this.OLrzqt;
            if (c5479Ti == null) {
                Intrinsics.gEmmrt("");
            }
            c5479Ti.AEQbTJ(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        if (c5479Ti.EZpvd()) {
            android.os.Trace.beginSection(this.gEmmrt);
        }
        DbNXlk();
        AEQbTJ(this.gEmmrt);
        isConnected();
        CopyOnWriteArrayList<AbstractRunnableC5485To> copyOnWriteArrayList = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(copyOnWriteArrayList, 10));
        java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractRunnableC5485To) it.next()).gEmmrt);
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array != null) {
            copydefault(OLrzqt((java.lang.String[]) array));
            valueOf();
            values();
            C5479Ti c5479Ti2 = this.OLrzqt;
            if (c5479Ti2 == null) {
                Intrinsics.gEmmrt("");
            }
            if (c5479Ti2.EZpvd()) {
                android.os.Trace.endSection();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void AkhnZx() {
        this.AYXKKw = 1;
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        c5479Ti.EZpvd(this);
        C5479Ti c5479Ti2 = this.OLrzqt;
        if (c5479Ti2 == null) {
            Intrinsics.gEmmrt("");
        }
        if (c5479Ti2.EZpvd()) {
            InterfaceC5488Tr interfaceC5488Tr = this.djBIcL;
            if (interfaceC5488Tr == null) {
                Intrinsics.KWHzl();
            }
            interfaceC5488Tr.KWHzl(this);
        }
        java.util.Iterator<InterfaceC5488Tr> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            it.next().KWHzl(this);
        }
    }

    public final void DbNXlk() {
        this.AYXKKw = 2;
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        c5479Ti.EZpvd(this);
        C5479Ti c5479Ti2 = this.OLrzqt;
        if (c5479Ti2 == null) {
            Intrinsics.gEmmrt("");
        }
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        Intrinsics.AEQbTJ(threadCurrentThread, "");
        java.lang.String name = threadCurrentThread.getName();
        Intrinsics.AEQbTJ(name, "");
        c5479Ti2.AEQbTJ(this, name);
        C5479Ti c5479Ti3 = this.OLrzqt;
        if (c5479Ti3 == null) {
            Intrinsics.gEmmrt("");
        }
        if (c5479Ti3.EZpvd()) {
            InterfaceC5488Tr interfaceC5488Tr = this.djBIcL;
            if (interfaceC5488Tr == null) {
                Intrinsics.KWHzl();
            }
            interfaceC5488Tr.OLrzqt(this);
        }
        java.util.Iterator<InterfaceC5488Tr> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(this);
        }
    }

    public final void isConnected() {
        this.AYXKKw = 3;
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        c5479Ti.EZpvd(this);
        C5479Ti c5479Ti2 = this.OLrzqt;
        if (c5479Ti2 == null) {
            Intrinsics.gEmmrt("");
        }
        if (c5479Ti2.EZpvd()) {
            InterfaceC5488Tr interfaceC5488Tr = this.djBIcL;
            if (interfaceC5488Tr == null) {
                Intrinsics.KWHzl();
            }
            interfaceC5488Tr.AEQbTJ(this);
        }
        java.util.Iterator<InterfaceC5488Tr> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(this);
        }
    }

    public final java.util.Set<java.lang.String> OLrzqt() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<AbstractRunnableC5485To> it = this.copydefault.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().gEmmrt);
        }
        return hashSet;
    }

    public void KWHzl(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        if (abstractRunnableC5485To != this) {
            if (abstractRunnableC5485To instanceof C5489Ts) {
                abstractRunnableC5485To = ((C5489Ts) abstractRunnableC5485To).fJNWhG();
            }
            this.AEQbTJ.add(abstractRunnableC5485To);
            abstractRunnableC5485To.copydefault(this);
        }
    }

    public void copydefault(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        if (abstractRunnableC5485To != this) {
            if (abstractRunnableC5485To instanceof C5489Ts) {
                abstractRunnableC5485To = ((C5489Ts) abstractRunnableC5485To).AuCTel();
            }
            this.copydefault.add(abstractRunnableC5485To);
            if (abstractRunnableC5485To.AEQbTJ.contains(this)) {
                return;
            }
            abstractRunnableC5485To.AEQbTJ.add(this);
        }
    }

    public void EZpvd(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        if (abstractRunnableC5485To != this) {
            if (abstractRunnableC5485To instanceof C5489Ts) {
                abstractRunnableC5485To = ((C5489Ts) abstractRunnableC5485To).AuCTel();
            }
            this.copydefault.remove(abstractRunnableC5485To);
            if (abstractRunnableC5485To.AEQbTJ.contains(this)) {
                abstractRunnableC5485To.AEQbTJ.remove(this);
            }
        }
    }

    public final void gEmmrt(AbstractRunnableC5485To abstractRunnableC5485To) {
        EZpvd(abstractRunnableC5485To);
        if (this.copydefault.isEmpty()) {
            java.util.Iterator<AbstractRunnableC5485To> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                it.next().gEmmrt(this);
            }
            C5479Ti c5479Ti = this.OLrzqt;
            if (c5479Ti == null) {
                Intrinsics.gEmmrt("");
            }
            c5479Ti.AEQbTJ(this.gEmmrt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        return C5490Tt.copydefault(this, abstractRunnableC5485To);
    }

    public final void valueOf() {
        if ((!(this instanceof C5487Tq) || ((C5487Tq) this).fJNWhG()) && (!this.AEQbTJ.isEmpty())) {
            if (this.AEQbTJ.size() > 1) {
                java.lang.Object[] array = this.AEQbTJ.toArray(new AbstractRunnableC5485To[0]);
                if (array != null) {
                    AbstractRunnableC5485To[] abstractRunnableC5485ToArr = (AbstractRunnableC5485To[]) array;
                    C5479Ti c5479Ti = this.OLrzqt;
                    if (c5479Ti == null) {
                        Intrinsics.gEmmrt("");
                    }
                    java.util.Arrays.sort(abstractRunnableC5485ToArr, c5479Ti.copydefault());
                    int length = abstractRunnableC5485ToArr.length;
                    for (int i = 0; i < length; i++) {
                        this.AEQbTJ.set(i, abstractRunnableC5485ToArr[i]);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            java.util.Iterator<AbstractRunnableC5485To> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                it.next().AEQbTJ(this);
            }
        }
    }

    public final void AEQbTJ(AbstractRunnableC5485To abstractRunnableC5485To) {
        synchronized (this) {
            if (this.copydefault.isEmpty()) {
                return;
            }
            this.copydefault.remove(abstractRunnableC5485To);
            if (this.copydefault.isEmpty()) {
                fetchVPNInfo();
            }
        }
    }

    public void values() {
        this.AYXKKw = 4;
        C5479Ti c5479Ti = this.OLrzqt;
        if (c5479Ti == null) {
            Intrinsics.gEmmrt("");
        }
        c5479Ti.EZpvd(this);
        C5479Ti c5479Ti2 = this.OLrzqt;
        if (c5479Ti2 == null) {
            Intrinsics.gEmmrt("");
        }
        c5479Ti2.AEQbTJ(this.gEmmrt);
        C5479Ti c5479Ti3 = this.OLrzqt;
        if (c5479Ti3 == null) {
            Intrinsics.gEmmrt("");
        }
        C5486Tp c5486TpKWHzl = c5479Ti3.KWHzl(this.gEmmrt);
        if (c5486TpKWHzl != null) {
            c5486TpKWHzl.EZpvd();
        }
        this.copydefault.clear();
        this.AEQbTJ.clear();
        C5479Ti c5479Ti4 = this.OLrzqt;
        if (c5479Ti4 == null) {
            Intrinsics.gEmmrt("");
        }
        if (c5479Ti4.EZpvd()) {
            InterfaceC5488Tr interfaceC5488Tr = this.djBIcL;
            if (interfaceC5488Tr != null) {
                interfaceC5488Tr.EZpvd(this);
            }
            this.djBIcL = null;
        }
        java.util.Iterator<InterfaceC5488Tr> it = this.DbNXlk.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(this);
        }
        this.DbNXlk.clear();
    }

    /* JADX INFO: renamed from: o.To$ActionBar */
    public static final class ActionBar {
        private ActionBar() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:285) call: o.To.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void copydefault(java.lang.String[] strArr) {
        CopyOnWriteArrayList<AbstractRunnableC5485To> copyOnWriteArrayList = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList) {
            if (!yDV.valueOf(strArr, ((AbstractRunnableC5485To) obj).gEmmrt)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5485To) it.next()).gEmmrt(this);
        }
    }
}
