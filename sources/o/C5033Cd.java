package o;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5033Cd {
    public java.lang.String KWHzl;
    public java.lang.String gEmmrt;
    public FZ copydefault = FZ.AYXKKw.OLrzqt();
    public SpanKind OLrzqt = SpanKind.CLIENT;
    public InterfaceC57843yq AEQbTJ = C58108yv.copydefault();
    public BT EZpvd = BT.copydefault.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpanKind KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FZ OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull BT bt) {
        Intrinsics.checkNotNullParameter(bt, "");
        this.EZpvd = bt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull FZ fz) {
        Intrinsics.checkNotNullParameter(fz, "");
        this.copydefault = fz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.AEQbTJ = interfaceC57843yq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BT copydefault() {
        return this.EZpvd;
    }
}
