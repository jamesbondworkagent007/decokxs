package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import aws.smithy.kotlin.runtime.io.ClosedWriteChannelException;
import aws.smithy.kotlin.runtime.io.RealSdkByteChannel$awaitBytesToRead$1;
import aws.smithy.kotlin.runtime.io.RealSdkByteChannel$awaitBytesToWrite$1;
import aws.smithy.kotlin.runtime.io.RealSdkByteChannel$awaitFreeSpace$1;
import aws.smithy.kotlin.runtime.io.RealSdkByteChannel$read$1;
import aws.smithy.kotlin.runtime.io.RealSdkByteChannel$write$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CL implements CN {
    public volatile /* synthetic */ int AYXKKw;
    public final CQ AhwBna;
    public volatile /* synthetic */ java.lang.Object copydefault;
    public volatile /* synthetic */ long djBIcL;
    public final C5059Dd fetchVPNInfo;
    public final boolean gEmmrt;
    public final C5064Di isConnected;
    public volatile /* synthetic */ int valueOf;
    public final java.lang.Object values;
    public static final /* synthetic */ AtomicIntegerFieldUpdater EZpvd = AtomicIntegerFieldUpdater.newUpdater(CL.class, "AYXKKw");
    public static final /* synthetic */ AtomicIntegerFieldUpdater AEQbTJ = AtomicIntegerFieldUpdater.newUpdater(CL.class, "valueOf");
    public static final /* synthetic */ AtomicReferenceFieldUpdater KWHzl = AtomicReferenceFieldUpdater.newUpdater(CL.class, java.lang.Object.class, "copydefault");
    public static final /* synthetic */ AtomicLongFieldUpdater OLrzqt = AtomicLongFieldUpdater.newUpdater(CL.class, "djBIcL");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.copydefault != null;
    }

    public CL(boolean z, int i) {
        this.gEmmrt = z;
        this.values = new java.lang.Object();
        this.AhwBna = new CQ();
        this.isConnected = new C5064Di(i);
        this.AYXKKw = 0;
        this.valueOf = 0;
        this.copydefault = null;
        this.djBIcL = 0L;
        this.fetchVPNInfo = new C5059Dd();
    }

    @Override // o.CN, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CN.ActionBar.copydefault(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CL(@NotNull byte[] bArr, int i, int i2) {
        this(true, i2);
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i2 > AYXKKw()) {
            throw new java.lang.IllegalArgumentException("Initial contents overflow maximum channel capacity".toString());
        }
        this.AhwBna.OLrzqt(bArr, i, i2);
        KWHzl(i2);
        close();
    }

    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        C5054Cy c5054Cy = (C5054Cy) this.copydefault;
        if (c5054Cy != null) {
            return c5054Cy.OLrzqt();
        }
        return null;
    }

    @Override // o.CS
    public boolean KWHzl() {
        return EZpvd() != null || (gEmmrt() && AEQbTJ() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealSdkByteChannel$awaitBytesToRead$1 realSdkByteChannel$awaitBytesToRead$1;
        final CL cl;
        if (continuation instanceof RealSdkByteChannel$awaitBytesToRead$1) {
            realSdkByteChannel$awaitBytesToRead$1 = (RealSdkByteChannel$awaitBytesToRead$1) continuation;
            int i2 = realSdkByteChannel$awaitBytesToRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realSdkByteChannel$awaitBytesToRead$1.label = i2 - Integer.MIN_VALUE;
            } else {
                realSdkByteChannel$awaitBytesToRead$1 = new RealSdkByteChannel$awaitBytesToRead$1(this, continuation);
            }
        }
        java.lang.Object obj = realSdkByteChannel$awaitBytesToRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = realSdkByteChannel$awaitBytesToRead$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            cl = this;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = realSdkByteChannel$awaitBytesToRead$1.I$0;
            cl = (CL) realSdkByteChannel$awaitBytesToRead$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (cl.AEQbTJ() < i && !cl.KWHzl()) {
            C5059Dd c5059Dd = cl.fetchVPNInfo;
            Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.io.RealSdkByteChannel$awaitBytesToRead$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(this.this$0.AEQbTJ() < i && !this.this$0.KWHzl());
                }
            };
            realSdkByteChannel$awaitBytesToRead$1.L$0 = cl;
            realSdkByteChannel$awaitBytesToRead$1.I$0 = i;
            realSdkByteChannel$awaitBytesToRead$1.label = 1;
            if (c5059Dd.EZpvd(function0, realSdkByteChannel$awaitBytesToRead$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(final int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealSdkByteChannel$awaitBytesToWrite$1 realSdkByteChannel$awaitBytesToWrite$1;
        final CL cl;
        if (continuation instanceof RealSdkByteChannel$awaitBytesToWrite$1) {
            realSdkByteChannel$awaitBytesToWrite$1 = (RealSdkByteChannel$awaitBytesToWrite$1) continuation;
            int i2 = realSdkByteChannel$awaitBytesToWrite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realSdkByteChannel$awaitBytesToWrite$1.label = i2 - Integer.MIN_VALUE;
            } else {
                realSdkByteChannel$awaitBytesToWrite$1 = new RealSdkByteChannel$awaitBytesToWrite$1(this, continuation);
            }
        }
        java.lang.Object obj = realSdkByteChannel$awaitBytesToWrite$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = realSdkByteChannel$awaitBytesToWrite$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            cl = this;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = realSdkByteChannel$awaitBytesToWrite$1.I$0;
            cl = (CL) realSdkByteChannel$awaitBytesToWrite$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (cl.AYXKKw() < i && !cl.gEmmrt()) {
            if (!cl.valueOf()) {
                C5059Dd c5059Dd = cl.fetchVPNInfo;
                Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.io.RealSdkByteChannel$awaitBytesToWrite$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(this.this$0.AYXKKw() < i && !this.this$0.gEmmrt());
                    }
                };
                realSdkByteChannel$awaitBytesToWrite$1.L$0 = cl;
                realSdkByteChannel$awaitBytesToWrite$1.I$0 = i;
                realSdkByteChannel$awaitBytesToWrite$1.label = 1;
                if (c5059Dd.EZpvd(function0, realSdkByteChannel$awaitBytesToWrite$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealSdkByteChannel$awaitFreeSpace$1 realSdkByteChannel$awaitFreeSpace$1;
        CL cl;
        if (continuation instanceof RealSdkByteChannel$awaitFreeSpace$1) {
            realSdkByteChannel$awaitFreeSpace$1 = (RealSdkByteChannel$awaitFreeSpace$1) continuation;
            int i = realSdkByteChannel$awaitFreeSpace$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realSdkByteChannel$awaitFreeSpace$1.label = i - Integer.MIN_VALUE;
            } else {
                realSdkByteChannel$awaitFreeSpace$1 = new RealSdkByteChannel$awaitFreeSpace$1(this, continuation);
            }
        }
        java.lang.Object obj = realSdkByteChannel$awaitFreeSpace$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realSdkByteChannel$awaitFreeSpace$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AhwBna();
            realSdkByteChannel$awaitFreeSpace$1.L$0 = this;
            realSdkByteChannel$awaitFreeSpace$1.label = 1;
            if (OLrzqt(1, realSdkByteChannel$awaitFreeSpace$1) == objCopydefault) {
                return objCopydefault;
            }
            cl = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cl = (CL) realSdkByteChannel$awaitFreeSpace$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        cl.OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #2 {all -> 0x009a, blocks: (B:35:0x0087, B:37:0x0090, B:43:0x009e, B:44:0x00a9, B:46:0x00b1, B:49:0x00b6, B:53:0x00c5, B:54:0x00c6, B:45:0x00aa), top: B:67:0x0087, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        RealSdkByteChannel$read$1 realSdkByteChannel$read$1;
        CL cl;
        CL cl2;
        CL cl3;
        if (continuation instanceof RealSdkByteChannel$read$1) {
            realSdkByteChannel$read$1 = (RealSdkByteChannel$read$1) continuation;
            int i = realSdkByteChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realSdkByteChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                realSdkByteChannel$read$1 = new RealSdkByteChannel$read$1(this, continuation);
            }
        }
        java.lang.Object obj = realSdkByteChannel$read$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realSdkByteChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(("Read limit must be >= 0, was " + j).toString());
            }
            copydefault();
            if (KWHzl()) {
                return C56443yFo.KWHzl(-1L);
            }
            if (j == 0) {
                return C56443yFo.KWHzl(0L);
            }
            try {
                if (EZpvd.compareAndSet(this, 0, 1)) {
                    if (AEQbTJ() == 0) {
                        realSdkByteChannel$read$1.L$0 = this;
                        realSdkByteChannel$read$1.L$1 = cq;
                        realSdkByteChannel$read$1.L$2 = this;
                        realSdkByteChannel$read$1.J$0 = j;
                        realSdkByteChannel$read$1.label = 1;
                        if (EZpvd(1, realSdkByteChannel$read$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        cl2 = this;
                        cl3 = cl2;
                        cl3.copydefault();
                        if (cl3.KWHzl()) {
                        }
                    } else {
                        cl2 = this;
                        cl3 = cl2;
                    }
                } else {
                    throw new java.lang.IllegalStateException("Read operation already in progress".toString());
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cl = this;
                EZpvd.compareAndSet(cl, 1, 0);
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = realSdkByteChannel$read$1.J$0;
            cl = (CL) realSdkByteChannel$read$1.L$2;
            CQ cq2 = (CQ) realSdkByteChannel$read$1.L$1;
            cl3 = (CL) realSdkByteChannel$read$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                cl2 = cl;
                j = j2;
                cq = cq2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                EZpvd.compareAndSet(cl, 1, 0);
                throw th;
            }
            try {
                cl3.copydefault();
                if (cl3.KWHzl()) {
                    java.lang.Long lKWHzl = C56443yFo.KWHzl(-1L);
                    EZpvd.compareAndSet(cl2, 1, 0);
                    return lKWHzl;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                cl = cl2;
                EZpvd.compareAndSet(cl, 1, 0);
                throw th;
            }
        }
        long jMin = java.lang.Math.min(cl3.AEQbTJ(), j);
        synchronized (cl3.values) {
            cq.AEQbTJ(cl3.AhwBna, jMin);
            Unit unit = Unit.INSTANCE;
        }
        if (jMin >= 0) {
            cl2.AEQbTJ((int) jMin);
        }
        EZpvd.compareAndSet(cl2, 1, 0);
        return C56443yFo.KWHzl(jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #2 {all -> 0x0045, blocks: (B:12:0x0041, B:25:0x006d, B:27:0x0075, B:29:0x007b, B:46:0x00c5, B:47:0x00d0), top: B:57:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008c -> B:33:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0096 -> B:55:0x0099). Please report as a decompilation issue!!! */
    @Override // o.CT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        RealSdkByteChannel$write$1 realSdkByteChannel$write$1;
        CL cl;
        Ref.LongRef longRef;
        CQ cq2;
        CL cl2;
        CL cl3;
        RealSdkByteChannel$write$1 realSdkByteChannel$write$12;
        Ref.LongRef longRef2;
        if (continuation instanceof RealSdkByteChannel$write$1) {
            realSdkByteChannel$write$1 = (RealSdkByteChannel$write$1) continuation;
            int i = realSdkByteChannel$write$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realSdkByteChannel$write$1.label = i - Integer.MIN_VALUE;
                cl = this;
            } else {
                cl = this;
                realSdkByteChannel$write$1 = new RealSdkByteChannel$write$1(cl, continuation);
            }
        }
        java.lang.Object obj = realSdkByteChannel$write$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = realSdkByteChannel$write$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OLrzqt();
            if (j == 0) {
                return Unit.INSTANCE;
            }
            longRef = new Ref.LongRef();
            longRef.element = j;
            cq2 = cq;
            cl2 = cl;
            if (longRef.element <= 0) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cl2 = (CL) realSdkByteChannel$write$1.L$3;
            Ref.LongRef longRef3 = (Ref.LongRef) realSdkByteChannel$write$1.L$2;
            CQ cq3 = (CQ) realSdkByteChannel$write$1.L$1;
            CL cl4 = (CL) realSdkByteChannel$write$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                cl3 = cl2;
                cl2 = cl4;
                RealSdkByteChannel$write$1 realSdkByteChannel$write$13 = realSdkByteChannel$write$1;
                longRef2 = longRef3;
                cq2 = cq3;
                realSdkByteChannel$write$12 = realSdkByteChannel$write$13;
            } catch (java.lang.Throwable th) {
                th = th;
                cl3 = cl2;
                AEQbTJ.compareAndSet(cl3, 1, 0);
                throw th;
            }
            try {
                long jMin = java.lang.Math.min(cl2.AYXKKw(), longRef2.element);
                synchronized (cl2.values) {
                    cl2.AhwBna.AEQbTJ(cq2, jMin);
                    Unit unit = Unit.INSTANCE;
                }
                longRef2.element -= jMin;
                cl3.KWHzl((int) jMin);
                AEQbTJ.compareAndSet(cl3, 1, 0);
                longRef = longRef2;
                realSdkByteChannel$write$1 = realSdkByteChannel$write$12;
                if (longRef.element <= 0) {
                    return Unit.INSTANCE;
                }
                if (AEQbTJ.compareAndSet(cl2, 0, 1)) {
                    if (cl2.AYXKKw() == 0) {
                        realSdkByteChannel$write$1.L$0 = cl2;
                        realSdkByteChannel$write$1.L$1 = cq2;
                        realSdkByteChannel$write$1.L$2 = longRef;
                        realSdkByteChannel$write$1.L$3 = cl2;
                        realSdkByteChannel$write$1.label = 1;
                        if (cl2.EZpvd(realSdkByteChannel$write$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        cq3 = cq2;
                        cl4 = cl2;
                        longRef3 = longRef;
                        cl3 = cl2;
                        cl2 = cl4;
                        RealSdkByteChannel$write$1 realSdkByteChannel$write$132 = realSdkByteChannel$write$1;
                        longRef2 = longRef3;
                        cq2 = cq3;
                        realSdkByteChannel$write$12 = realSdkByteChannel$write$132;
                        long jMin2 = java.lang.Math.min(cl2.AYXKKw(), longRef2.element);
                        synchronized (cl2.values) {
                        }
                    } else {
                        realSdkByteChannel$write$12 = realSdkByteChannel$write$1;
                        longRef2 = longRef;
                        cl3 = cl2;
                        long jMin22 = java.lang.Math.min(cl2.AYXKKw(), longRef2.element);
                        synchronized (cl2.values) {
                        }
                    }
                } else {
                    throw new java.lang.IllegalStateException("Write operation already in progress".toString());
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                AEQbTJ.compareAndSet(cl3, 1, 0);
                throw th;
            }
        }
    }

    public final void copydefault() throws java.lang.Throwable {
        java.lang.Throwable thEZpvd = EZpvd();
        if (thEZpvd != null) {
            throw thEZpvd;
        }
    }

    public final void OLrzqt() throws java.lang.Throwable {
        if (gEmmrt()) {
            java.lang.Throwable thEZpvd = EZpvd();
            if (thEZpvd != null) {
                throw thEZpvd;
            }
            throw new ClosedWriteChannelException("Channel " + this + " is already closed");
        }
    }

    public final void KWHzl(int i) {
        this.isConnected.OLrzqt(i);
        OLrzqt.getAndAdd(this, i);
        if (djBIcL() || AYXKKw() == 0) {
            AhwBna();
        }
    }

    public final void AEQbTJ(int i) {
        this.isConnected.EZpvd(i);
        this.fetchVPNInfo.KWHzl();
    }

    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) {
        if (gEmmrt()) {
            return false;
        }
        if (th == null) {
            th = new CancellationException("Channel cancelled");
        }
        return copydefault(th);
    }

    public void AhwBna() {
        valueOf();
    }

    @Override // o.CT
    public boolean copydefault(java.lang.Throwable th) {
        if (gEmmrt()) {
            return false;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(KWHzl, this, null, th == null ? CP.OLrzqt : new C5054Cy(th))) {
            return false;
        }
        if (th == null) {
            AhwBna();
            return true;
        }
        this.fetchVPNInfo.AEQbTJ(th);
        return true;
    }

    @Override // o.CT
    public int AYXKKw() {
        return this.isConnected.OLrzqt;
    }

    @Override // o.CS
    public int AEQbTJ() {
        return this.isConnected.copydefault;
    }

    public final boolean valueOf() {
        if (this.isConnected.AhwBna == 0) {
            this.fetchVPNInfo.KWHzl();
            return false;
        }
        this.isConnected.OLrzqt();
        this.fetchVPNInfo.KWHzl();
        return true;
    }
}
