package o;

import aws.smithy.kotlin.runtime.io.middleware.Phase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5032Cc<Request, Response> {
    public BD KWHzl;
    public final Phase<BP<Request>, Response> OLrzqt = new Phase<>();
    public final Phase<BP<C5036Cg>, Response> AEQbTJ = new Phase<>();
    public final Phase<BP<C5036Cg>, Response> copydefault = new Phase<>();
    public final Phase<BP<C5036Cg>, C58859zS> djBIcL = new Phase<>();
    public BK EZpvd = BK.EZpvd.OLrzqt();
    public DW gEmmrt = new DY(null, 1, 0 == true ? 1 : 0);
    public InterfaceC5093El<? super Response> valueOf = C5092Ek.KWHzl.KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BD AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull BK bk) {
        Intrinsics.checkNotNullParameter(bk, "");
        this.EZpvd = bk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC5093El<? super Response> interfaceC5093El) {
        Intrinsics.checkNotNullParameter(interfaceC5093El, "");
        this.valueOf = interfaceC5093El;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BK EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Phase<BP<C5036Cg>, Response> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Phase<BP<Request>, Response> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(BD bd) {
        this.KWHzl = bd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull DW dw) {
        Intrinsics.checkNotNullParameter(dw, "");
        this.gEmmrt = dw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Phase<BP<C5036Cg>, Response> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Phase<BP<C5036Cg>, C58859zS> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5093El<Response> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DW valueOf() {
        return this.gEmmrt;
    }
}
