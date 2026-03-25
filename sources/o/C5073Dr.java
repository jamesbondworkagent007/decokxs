package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5073Dr<Request, Response> implements CG<Request, Response> {
    public final InterfaceC5075Dt<Request, Response> AEQbTJ;
    public final CG<Request, Response> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Dr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5073Dr copy$default(C5073Dr c5073Dr, CG cg, InterfaceC5075Dt interfaceC5075Dt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cg = c5073Dr.OLrzqt;
        }
        if ((i & 2) != 0) {
            interfaceC5075Dt = c5073Dr.AEQbTJ;
        }
        return c5073Dr.AEQbTJ(cg, interfaceC5075Dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5073Dr<Request, Response> AEQbTJ(@NotNull CG<? super Request, ? extends Response> cg, @NotNull InterfaceC5075Dt<Request, Response> interfaceC5075Dt) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(interfaceC5075Dt, "");
        return new C5073Dr<>(cg, interfaceC5075Dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5073Dr)) {
            return false;
        }
        C5073Dr c5073Dr = (C5073Dr) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c5073Dr.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c5073Dr.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DecoratedHandler(handler=" + this.OLrzqt + ", with=" + this.AEQbTJ + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super Request, ? extends Response> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5073Dr(@NotNull CG<? super Request, ? extends Response> cg, @NotNull InterfaceC5075Dt<Request, Response> interfaceC5075Dt) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(interfaceC5075Dt, "");
        this.OLrzqt = cg;
        this.AEQbTJ = interfaceC5075Dt;
    }

    @Override // o.CG
    public java.lang.Object OLrzqt(Request request, @NotNull Continuation<? super Response> continuation) {
        return this.AEQbTJ.EZpvd(request, this.OLrzqt, continuation);
    }
}
