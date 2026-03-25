package o;

import com.google.gson.Gson;
import com.okinc.network.engine.bean.EngineBean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: renamed from: o.rmC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43270rmC {
    public static EngineBean AEQbTJ;
    public static final C43270rmC OLrzqt = new C43270rmC();
    public static final ReentrantReadWriteLock EZpvd = new ReentrantReadWriteLock();
    public static final int copydefault = 8;

    private C43270rmC() {
    }

    public final EngineBean KWHzl() {
        ReentrantReadWriteLock.ReadLock lock = EZpvd.readLock();
        lock.lock();
        try {
            return AEQbTJ;
        } finally {
            lock.unlock();
        }
    }

    public final void EZpvd(EngineBean engineBean) {
        ReentrantReadWriteLock reentrantReadWriteLock = EZpvd;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            AEQbTJ = engineBean;
            Unit unit = Unit.INSTANCE;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final boolean EZpvd(java.lang.Object obj) {
        EngineBean engineBean;
        if (obj != null) {
            try {
                engineBean = obj.toString().length() == 0 ? null : (EngineBean) new Gson().fromJson(obj.toString(), EngineBean.class);
            } catch (java.lang.Throwable th) {
                pUU.KWHzl("RuleEngineConfig", "RuleEngineConfig update " + th);
                return false;
            }
        }
        EZpvd(engineBean);
        return true;
    }
}
