package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5042Cm implements InterfaceC5037Ch {
    public final zP AEQbTJ;
    public final HttpMethod EZpvd;
    public final InterfaceC58725zN KWHzl;
    public final InterfaceC58536zG OLrzqt;
    public final DL gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5042Cm copy$default(C5042Cm c5042Cm, HttpMethod httpMethod, DL dl, InterfaceC58725zN interfaceC58725zN, zP zPVar, InterfaceC58536zG interfaceC58536zG, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpMethod = c5042Cm.EZpvd;
        }
        if ((i & 2) != 0) {
            dl = c5042Cm.gEmmrt;
        }
        DL dl2 = dl;
        if ((i & 4) != 0) {
            interfaceC58725zN = c5042Cm.KWHzl;
        }
        InterfaceC58725zN interfaceC58725zN2 = interfaceC58725zN;
        if ((i & 8) != 0) {
            zPVar = c5042Cm.AEQbTJ;
        }
        zP zPVar2 = zPVar;
        if ((i & 16) != 0) {
            interfaceC58536zG = c5042Cm.OLrzqt;
        }
        return c5042Cm.AEQbTJ(httpMethod, dl2, interfaceC58725zN2, zPVar2, interfaceC58536zG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5042Cm AEQbTJ(@NotNull HttpMethod httpMethod, @NotNull DL dl, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(dl, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        return new C5042Cm(httpMethod, dl, interfaceC58725zN, zPVar, interfaceC58536zG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public DL AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public InterfaceC58725zN EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public zP KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public HttpMethod OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public InterfaceC58536zG copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5042Cm)) {
            return false;
        }
        C5042Cm c5042Cm = (C5042Cm) obj;
        return this.EZpvd == c5042Cm.EZpvd && Intrinsics.EZpvd(this.gEmmrt, c5042Cm.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c5042Cm.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c5042Cm.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c5042Cm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RealHttpRequest(method=" + this.EZpvd + ", url=" + this.gEmmrt + ", headers=" + this.KWHzl + ", body=" + this.AEQbTJ + ", trailingHeaders=" + this.OLrzqt + ')';
    }

    public C5042Cm(@NotNull HttpMethod httpMethod, @NotNull DL dl, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(dl, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        this.EZpvd = httpMethod;
        this.gEmmrt = dl;
        this.KWHzl = interfaceC58725zN;
        this.AEQbTJ = zPVar;
        this.OLrzqt = interfaceC58536zG;
    }
}
