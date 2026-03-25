package o;

import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5041Cl implements InterfaceC5039Cj {
    public final HttpStatusCode AEQbTJ;
    public final zP EZpvd;
    public final InterfaceC58725zN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5041Cl copy$default(C5041Cl c5041Cl, HttpStatusCode httpStatusCode, InterfaceC58725zN interfaceC58725zN, zP zPVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpStatusCode = c5041Cl.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interfaceC58725zN = c5041Cl.copydefault;
        }
        if ((i & 4) != 0) {
            zPVar = c5041Cl.EZpvd;
        }
        return c5041Cl.EZpvd(httpStatusCode, interfaceC58725zN, zPVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5039Cj
    public InterfaceC58725zN AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5041Cl EZpvd(@NotNull HttpStatusCode httpStatusCode, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(httpStatusCode, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        return new C5041Cl(httpStatusCode, interfaceC58725zN, zPVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5039Cj
    public zP EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5039Cj
    public HttpStatusCode OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5041Cl)) {
            return false;
        }
        C5041Cl c5041Cl = (C5041Cl) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c5041Cl.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c5041Cl.copydefault) && Intrinsics.EZpvd(this.EZpvd, c5041Cl.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DefaultHttpResponse(status=" + this.AEQbTJ + ", headers=" + this.copydefault + ", body=" + this.EZpvd + ')';
    }

    public C5041Cl(@NotNull HttpStatusCode httpStatusCode, @NotNull InterfaceC58725zN interfaceC58725zN, @NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(httpStatusCode, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        Intrinsics.checkNotNullParameter(zPVar, "");
        this.AEQbTJ = httpStatusCode;
        this.copydefault = interfaceC58725zN;
        this.EZpvd = zPVar;
    }
}
