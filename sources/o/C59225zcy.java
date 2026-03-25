package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59225zcy implements InterfaceC59178zcD {
    public final Lock EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59225zcy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Lock copydefault() {
        return this.EZpvd;
    }

    public C59225zcy(@NotNull Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "");
        this.EZpvd = lock;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.concurrent.locks.Lock:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.locks.Lock:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:46) call: java.util.concurrent.locks.ReentrantLock.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.concurrent.locks.Lock))
 A[MD:(java.util.concurrent.locks.Lock):void (m)] (LINE:46) call: o.zcy.<init>(java.util.concurrent.locks.Lock):void type: THIS */
    public /* synthetic */ C59225zcy(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }

    @Override // o.InterfaceC59178zcD
    public void EZpvd() {
        this.EZpvd.lock();
    }

    @Override // o.InterfaceC59178zcD
    public void AEQbTJ() {
        this.EZpvd.unlock();
    }
}
