package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import aws.smithy.kotlin.runtime.util.CachedValue$getOrLoad$1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5182Hw<T> implements java.io.Closeable {
    public volatile /* synthetic */ java.lang.Object AEQbTJ;
    public volatile /* synthetic */ int AYXKKw;
    public final InterfaceC5168Hi KWHzl;
    public final long OLrzqt;
    public HA<T> djBIcL;
    public final Semaphore valueOf;
    public static final /* synthetic */ AtomicReferenceFieldUpdater copydefault = AtomicReferenceFieldUpdater.newUpdater(C5182Hw.class, java.lang.Object.class, "AEQbTJ");
    public static final /* synthetic */ AtomicIntegerFieldUpdater EZpvd = AtomicIntegerFieldUpdater.newUpdater(C5182Hw.class, "AYXKKw");

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HA), (r2v0 long), (r4v0 o.Hi) A[MD:(o.HA<T>, long, o.Hi):void (m)] call: o.Hw.<init>(o.HA, long, o.Hi):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5182Hw(HA ha, long j, InterfaceC5168Hi interfaceC5168Hi, DefaultConstructorMarker defaultConstructorMarker) {
        this(ha, j, interfaceC5168Hi);
    }

    public C5182Hw(HA<T> ha, long j, InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.djBIcL = ha;
        this.OLrzqt = j;
        this.KWHzl = interfaceC5168Hi;
        this.valueOf = SemaphoreKt.Semaphore$default(1, 0, 2, null);
        this.AEQbTJ = this.djBIcL;
        this.AYXKKw = 0;
    }

    public final HA<T> KWHzl() {
        return (HA) this.AEQbTJ;
    }

    public final boolean EZpvd(HA<T> ha) {
        return this.KWHzl.EZpvd().compareTo(ha.OLrzqt().KWHzl(this.OLrzqt)) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:37:0x0097, B:39:0x009d, B:41:0x00a5, B:44:0x00ad, B:45:0x00b8, B:46:0x00b9, B:47:0x00c2), top: B:54:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:37:0x0097, B:39:0x009d, B:41:0x00a5, B:44:0x00ad, B:45:0x00b8, B:46:0x00b9, B:47:0x00c2), top: B:54:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Function1<? super Continuation<? super HA<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        CachedValue$getOrLoad$1 cachedValue$getOrLoad$1;
        Semaphore semaphore;
        C5182Hw<T> c5182Hw;
        Semaphore semaphore2;
        C5182Hw<T> c5182Hw2;
        HA<T> ha;
        if (continuation instanceof CachedValue$getOrLoad$1) {
            cachedValue$getOrLoad$1 = (CachedValue$getOrLoad$1) continuation;
            int i = cachedValue$getOrLoad$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cachedValue$getOrLoad$1.label = i - Integer.MIN_VALUE;
            } else {
                cachedValue$getOrLoad$1 = new CachedValue$getOrLoad$1(this, continuation);
            }
        }
        java.lang.Object obj = cachedValue$getOrLoad$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cachedValue$getOrLoad$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                semaphore = this.valueOf;
                cachedValue$getOrLoad$1.L$0 = this;
                cachedValue$getOrLoad$1.L$1 = function1;
                cachedValue$getOrLoad$1.L$2 = semaphore;
                cachedValue$getOrLoad$1.label = 1;
                if (semaphore.acquire(cachedValue$getOrLoad$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5182Hw = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ha = (HA) cachedValue$getOrLoad$1.L$2;
                    semaphore2 = (Semaphore) cachedValue$getOrLoad$1.L$1;
                    c5182Hw2 = (C5182Hw) cachedValue$getOrLoad$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        HA ha2 = (HA) obj;
                        if (c5182Hw2.AYXKKw == 0) {
                            throw new java.lang.IllegalStateException("value is closed".toString());
                        }
                        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(copydefault, c5182Hw2, ha, ha2)) {
                            throw new java.lang.IllegalStateException("value changed during getOrLoad".toString());
                        }
                        java.lang.Object objKWHzl = ha2.KWHzl();
                        semaphore2.release();
                        return objKWHzl;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        semaphore = semaphore2;
                        semaphore.release();
                        throw th;
                    }
                }
                Semaphore semaphore3 = (Semaphore) cachedValue$getOrLoad$1.L$2;
                Function1<? super Continuation<? super HA<T>>, ? extends java.lang.Object> function12 = (Function1) cachedValue$getOrLoad$1.L$1;
                c5182Hw = (C5182Hw) cachedValue$getOrLoad$1.L$0;
                C56391yDq.AEQbTJ(obj);
                semaphore = semaphore3;
                function1 = function12;
            }
            if (c5182Hw.AYXKKw != 0) {
                throw new java.lang.IllegalStateException("value is closed".toString());
            }
            HA<T> haKWHzl = c5182Hw.KWHzl();
            if (haKWHzl != null && !c5182Hw.EZpvd(haKWHzl)) {
                T tKWHzl = haKWHzl.KWHzl();
                semaphore.release();
                return tKWHzl;
            }
            cachedValue$getOrLoad$1.L$0 = c5182Hw;
            cachedValue$getOrLoad$1.L$1 = semaphore;
            cachedValue$getOrLoad$1.L$2 = haKWHzl;
            cachedValue$getOrLoad$1.label = 2;
            java.lang.Object objInvoke = function1.invoke(cachedValue$getOrLoad$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            semaphore2 = semaphore;
            c5182Hw2 = c5182Hw;
            obj = objInvoke;
            ha = haKWHzl;
            HA ha22 = (HA) obj;
            if (c5182Hw2.AYXKKw == 0) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            semaphore.release();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.lang.Object obj;
        if (EZpvd.compareAndSet(this, 0, 1)) {
            do {
                obj = this.AEQbTJ;
            } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(copydefault, this, obj, null));
        }
    }
}
