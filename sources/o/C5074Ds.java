package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5074Ds<Request, Response> implements InterfaceC5075Dt<Request, Response> {
    public final yHO<Request, CG<? super Request, ? extends Response>, Continuation<? super Response>, java.lang.Object> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Ds */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5074Ds copy$default(C5074Ds c5074Ds, yHO yho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            yho = c5074Ds.EZpvd;
        }
        return c5074Ds.AEQbTJ(yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5074Ds<Request, Response> AEQbTJ(@NotNull yHO<? super Request, ? super CG<? super Request, ? extends Response>, ? super Continuation<? super Response>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        return new C5074Ds<>(yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5074Ds) && Intrinsics.EZpvd(this.EZpvd, ((C5074Ds) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MiddlewareLambda(fn=" + this.EZpvd + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super Request, ? super o.CG<? super Request, ? extends Response>, ? super kotlin.coroutines.Continuation<? super Response>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5074Ds(@NotNull yHO<? super Request, ? super CG<? super Request, ? extends Response>, ? super Continuation<? super Response>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.EZpvd = yho;
    }

    @Override // o.InterfaceC5075Dt
    public <H extends CG<? super Request, ? extends Response>> java.lang.Object EZpvd(Request request, @NotNull H h, @NotNull Continuation<? super Response> continuation) {
        return this.EZpvd.invoke(request, h, continuation);
    }
}
