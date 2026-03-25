package o;

import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: renamed from: o.yxD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58218yxD {
    private C58218yxD() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static java.lang.RuntimeException OLrzqt(java.lang.Throwable th) {
        throw ExceptionHelper.AEQbTJ(th);
    }

    public static void AEQbTJ(java.lang.Throwable th) {
        if (th instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th);
        }
        if (th instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th);
        }
        if (th instanceof java.lang.LinkageError) {
            throw ((java.lang.LinkageError) th);
        }
    }
}
