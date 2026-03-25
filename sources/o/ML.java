package o;

import com.amplitude.id.IdentityUpdateType;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.MI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ML implements MI {
    public final MJ AEQbTJ;
    public MF EZpvd;
    public final ReentrantReadWriteLock KWHzl;
    public boolean OLrzqt;
    public final java.util.Set<MK> copydefault;
    public final java.lang.Object gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.MI
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    public ML(@NotNull MJ mj) {
        Intrinsics.checkNotNullParameter(mj, "");
        this.AEQbTJ = mj;
        this.KWHzl = new ReentrantReadWriteLock(true);
        this.EZpvd = new MF(null, null, 3, null);
        this.gEmmrt = new java.lang.Object();
        this.copydefault = new LinkedHashSet();
        AEQbTJ(mj.copydefault(), IdentityUpdateType.Initialized);
    }

    public static final class TaskDescription implements MI.ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public final /* synthetic */ ML KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.MI.ActionBar
        public MI.ActionBar AEQbTJ(java.lang.String str) {
            this.AEQbTJ = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.MI.ActionBar
        public MI.ActionBar KWHzl(java.lang.String str) {
            this.EZpvd = str;
            return this;
        }

        public TaskDescription(MF mf, ML ml) {
            this.KWHzl = ml;
            this.EZpvd = mf.EZpvd();
            this.AEQbTJ = mf.OLrzqt();
        }

        @Override // o.MI.ActionBar
        public void AEQbTJ() {
            MI.setIdentity$default(this.KWHzl, new MF(this.EZpvd, this.AEQbTJ), null, 2, null);
        }
    }

    @Override // o.MI
    public MI.ActionBar EZpvd() {
        return new TaskDescription(KWHzl(), this);
    }

    /* JADX DEBUG: Incorrect finally slice size: {[IF, INVOKE, ARITH, INVOKE, INVOKE, INVOKE] complete}, expected: {[IF, INVOKE, ARITH, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // o.MI
    public void AEQbTJ(@NotNull MF mf, @NotNull IdentityUpdateType identityUpdateType) {
        java.util.Set<MK> setOqFWZa;
        Intrinsics.checkNotNullParameter(mf, "");
        Intrinsics.checkNotNullParameter(identityUpdateType, "");
        MF mfKWHzl = KWHzl();
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
            this.EZpvd = mf;
            if (identityUpdateType == IdentityUpdateType.Initialized) {
                this.OLrzqt = true;
            }
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (Intrinsics.EZpvd(mf, mfKWHzl)) {
                return;
            }
            synchronized (this.gEmmrt) {
                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.copydefault);
            }
            if (identityUpdateType != IdentityUpdateType.Initialized) {
                if (!Intrinsics.EZpvd((java.lang.Object) mf.EZpvd(), (java.lang.Object) mfKWHzl.EZpvd())) {
                    this.AEQbTJ.EZpvd(mf.EZpvd());
                }
                if (!Intrinsics.EZpvd((java.lang.Object) mf.OLrzqt(), (java.lang.Object) mfKWHzl.OLrzqt())) {
                    this.AEQbTJ.copydefault(mf.OLrzqt());
                }
            }
            for (MK mk : setOqFWZa) {
                if (!Intrinsics.EZpvd((java.lang.Object) mf.EZpvd(), (java.lang.Object) mfKWHzl.EZpvd())) {
                    mk.copydefault(mf.EZpvd());
                }
                if (!Intrinsics.EZpvd((java.lang.Object) mf.OLrzqt(), (java.lang.Object) mfKWHzl.OLrzqt())) {
                    mk.EZpvd(mf.OLrzqt());
                }
                mk.EZpvd(mf, identityUpdateType);
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

    @Override // o.MI
    public MF KWHzl() {
        ReentrantReadWriteLock.ReadLock lock = this.KWHzl.readLock();
        lock.lock();
        try {
            return this.EZpvd;
        } finally {
            lock.unlock();
        }
    }

    @Override // o.MI
    public void copydefault(@NotNull MK mk) {
        Intrinsics.checkNotNullParameter(mk, "");
        synchronized (this.gEmmrt) {
            this.copydefault.add(mk);
        }
    }
}
