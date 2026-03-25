package o;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5215Jd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212Ja implements InterfaceC5215Jd {
    public final ReentrantReadWriteLock KWHzl = new ReentrantReadWriteLock(true);
    public C5213Jb OLrzqt = new C5213Jb(null, null, null, 7, null);
    public final java.lang.Object EZpvd = new java.lang.Object();
    public final java.util.Set<Function1<C5213Jb, Unit>> copydefault = new LinkedHashSet();

    /* JADX INFO: renamed from: o.Ja$Application */
    public static final class Application implements InterfaceC5215Jd.Application {
        public java.lang.String AEQbTJ;
        public final /* synthetic */ C5213Jb EZpvd;
        public java.util.Map<java.lang.String, ? extends java.lang.Object> KWHzl;
        public final /* synthetic */ C5212Ja OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5215Jd.Application
        public InterfaceC5215Jd.Application EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5215Jd.Application
        public InterfaceC5215Jd.Application copydefault(java.lang.String str) {
            this.copydefault = str;
            return this;
        }

        public Application(C5213Jb c5213Jb, C5212Ja c5212Ja) {
            this.EZpvd = c5213Jb;
            this.OLrzqt = c5212Ja;
            this.AEQbTJ = c5213Jb.OLrzqt();
            this.copydefault = c5213Jb.KWHzl();
            this.KWHzl = c5213Jb.AEQbTJ();
        }

        @Override // o.InterfaceC5215Jd.Application
        public InterfaceC5215Jd.Application copydefault(@NotNull java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            java.util.Map<java.lang.String, ? extends java.lang.Object> mapIsConnected = C56424yEw.isConnected(this.KWHzl);
            for (Map.Entry<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.Map<java.lang.String, ? extends java.lang.Object> value = entry.getValue();
                int iHashCode = key.hashCode();
                if (iHashCode != 1186238) {
                    if (iHashCode != 146417720) {
                        if (iHashCode == 1142092165 && key.equals("$unset")) {
                            java.util.Iterator<Map.Entry<java.lang.String, ? extends java.lang.Object>> it = value.entrySet().iterator();
                            while (it.hasNext()) {
                                mapIsConnected.remove(it.next().getKey());
                            }
                        }
                    } else if (key.equals("$clearAll")) {
                        mapIsConnected.clear();
                    }
                } else if (key.equals("$set")) {
                    mapIsConnected.putAll(value);
                }
            }
            this.KWHzl = mapIsConnected;
            return this;
        }

        @Override // o.InterfaceC5215Jd.Application
        public void copydefault() {
            this.OLrzqt.OLrzqt(new C5213Jb(this.AEQbTJ, this.copydefault, this.KWHzl));
        }
    }

    @Override // o.InterfaceC5215Jd
    public InterfaceC5215Jd.Application copydefault() {
        return new Application(AEQbTJ(), this);
    }

    /* JADX DEBUG: Incorrect finally slice size: {[IF, INVOKE, ARITH, INVOKE, INVOKE, INVOKE] complete}, expected: {[IF, INVOKE, ARITH, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // o.InterfaceC5215Jd
    public void OLrzqt(@NotNull C5213Jb c5213Jb) {
        java.util.Set setOqFWZa;
        Intrinsics.checkNotNullParameter(c5213Jb, "");
        C5213Jb c5213JbAEQbTJ = AEQbTJ();
        ReentrantReadWriteLock reentrantReadWriteLock = this.KWHzl;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.OLrzqt = c5213Jb;
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (Intrinsics.EZpvd(c5213Jb, c5213JbAEQbTJ)) {
                return;
            }
            synchronized (this.EZpvd) {
                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.copydefault);
            }
            java.util.Iterator it = setOqFWZa.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(c5213Jb);
            }
        } catch (java.lang.Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // o.InterfaceC5215Jd
    public C5213Jb AEQbTJ() {
        ReentrantReadWriteLock.ReadLock lock = this.KWHzl.readLock();
        lock.lock();
        try {
            return this.OLrzqt;
        } finally {
            lock.unlock();
        }
    }

    @Override // o.InterfaceC5215Jd
    public void EZpvd(@NotNull Function1<? super C5213Jb, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (this.EZpvd) {
            this.copydefault.add(function1);
        }
    }

    @Override // o.InterfaceC5215Jd
    public void copydefault(@NotNull Function1<? super C5213Jb, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (this.EZpvd) {
            this.copydefault.remove(function1);
        }
    }
}
