package o;

import aws.smithy.kotlin.runtime.collections.ReadThroughCache$get$1;
import aws.smithy.kotlin.runtime.collections.ReadThroughCache$invalidate$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C56401yE<K, V> {
    public final java.util.Map<K, HA<V>> AEQbTJ;
    public C5173Hn EZpvd;
    public final InterfaceC5168Hi KWHzl;
    public final Mutex OLrzqt;
    public final long copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(K k, @NotNull Function2<? super K, ? super Continuation<? super HA<V>>, ? extends java.lang.Object> function2, @NotNull Continuation<? super V> continuation) throws java.lang.Throwable {
        ReadThroughCache$get$1 readThroughCache$get$1;
        Mutex mutex;
        C56401yE<K, V> c56401yE;
        java.lang.Throwable th;
        C56401yE<K, V> c56401yE2;
        java.lang.Object obj;
        Mutex mutex2;
        java.lang.Object objKWHzl;
        if (continuation instanceof ReadThroughCache$get$1) {
            readThroughCache$get$1 = (ReadThroughCache$get$1) continuation;
            int i = readThroughCache$get$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                readThroughCache$get$1.label = i - Integer.MIN_VALUE;
            } else {
                readThroughCache$get$1 = new ReadThroughCache$get$1(this, continuation);
            }
        }
        java.lang.Object obj2 = readThroughCache$get$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = readThroughCache$get$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                mutex = this.OLrzqt;
                readThroughCache$get$1.L$0 = this;
                readThroughCache$get$1.L$1 = k;
                readThroughCache$get$1.L$2 = function2;
                readThroughCache$get$1.L$3 = mutex;
                readThroughCache$get$1.label = 1;
                if (mutex.lock(null, readThroughCache$get$1) == objCopydefault) {
                    return objCopydefault;
                }
                c56401yE = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) readThroughCache$get$1.L$2;
                    obj = readThroughCache$get$1.L$1;
                    c56401yE2 = (C56401yE) readThroughCache$get$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj2);
                        c56401yE2.AEQbTJ.put((K) obj, (HA) obj2);
                        java.lang.Object objKWHzl2 = ((HA) obj2).KWHzl();
                        mutex = mutex2;
                        objKWHzl = objKWHzl2;
                        mutex.unlock(null);
                        return objKWHzl;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) readThroughCache$get$1.L$3;
                function2 = (Function2) readThroughCache$get$1.L$2;
                java.lang.Object obj3 = readThroughCache$get$1.L$1;
                c56401yE = (C56401yE) readThroughCache$get$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                mutex = mutex3;
                k = (java.lang.Object) obj3;
            }
            if (c56401yE.KWHzl.EZpvd().compareTo(c56401yE.EZpvd) > 0) {
                c56401yE.EZpvd();
            }
            HA<V> ha = c56401yE.AEQbTJ.get(k);
            if (ha != null && !c56401yE.EZpvd(ha)) {
                objKWHzl = ha.KWHzl();
                mutex.unlock(null);
                return objKWHzl;
            }
            readThroughCache$get$1.L$0 = c56401yE;
            readThroughCache$get$1.L$1 = k;
            readThroughCache$get$1.L$2 = mutex;
            readThroughCache$get$1.L$3 = null;
            readThroughCache$get$1.label = 2;
            java.lang.Object objInvoke = function2.invoke(k, readThroughCache$get$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            c56401yE2 = c56401yE;
            obj = k;
            mutex2 = mutex;
            obj2 = objInvoke;
            c56401yE2.AEQbTJ.put((K) obj, (HA) obj2);
            java.lang.Object objKWHzl22 = ((HA) obj2).KWHzl();
            mutex = mutex2;
            objKWHzl = objKWHzl22;
            mutex.unlock(null);
            return objKWHzl;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(K k, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReadThroughCache$invalidate$1 readThroughCache$invalidate$1;
        Mutex mutex;
        C56401yE<K, V> c56401yE;
        if (continuation instanceof ReadThroughCache$invalidate$1) {
            readThroughCache$invalidate$1 = (ReadThroughCache$invalidate$1) continuation;
            int i = readThroughCache$invalidate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                readThroughCache$invalidate$1.label = i - Integer.MIN_VALUE;
            } else {
                readThroughCache$invalidate$1 = new ReadThroughCache$invalidate$1(this, continuation);
            }
        }
        java.lang.Object obj = readThroughCache$invalidate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = readThroughCache$invalidate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.OLrzqt;
            readThroughCache$invalidate$1.L$0 = this;
            readThroughCache$invalidate$1.L$1 = k;
            readThroughCache$invalidate$1.L$2 = mutex;
            readThroughCache$invalidate$1.label = 1;
            if (mutex.lock(null, readThroughCache$invalidate$1) == objCopydefault) {
                return objCopydefault;
            }
            c56401yE = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) readThroughCache$invalidate$1.L$2;
            java.lang.Object obj2 = readThroughCache$invalidate$1.L$1;
            c56401yE = (C56401yE) readThroughCache$invalidate$1.L$0;
            C56391yDq.AEQbTJ(obj);
            mutex = mutex2;
            k = (K) obj2;
        }
        try {
            c56401yE.AEQbTJ.remove(k);
            if (c56401yE.KWHzl.EZpvd().compareTo(c56401yE.EZpvd) > 0) {
                c56401yE.EZpvd();
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    public final boolean EZpvd(HA<?> ha) {
        return this.KWHzl.EZpvd().compareTo(ha.OLrzqt()) >= 0;
    }

    public final void EZpvd() {
        java.util.Iterator<Map.Entry<K, HA<V>>> it = this.AEQbTJ.entrySet().iterator();
        while (it.hasNext()) {
            if (EZpvd(it.next().getValue())) {
                it.remove();
            }
        }
        this.EZpvd = this.KWHzl.EZpvd().copydefault(this.copydefault);
    }
}
