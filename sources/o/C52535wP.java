package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C52535wP implements InterfaceC52616wS {
    public final java.lang.String KWHzl;
    public final InterfaceC57843yq OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 o.yq) A[MD:(java.lang.String, o.yq):void (m)] call: o.wP.<init>(java.lang.String, o.yq):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C52535wP(java.lang.String str, InterfaceC57843yq interfaceC57843yq, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-Jh0Pmzk$default, reason: not valid java name */
    public static /* synthetic */ C52535wP m8781copyJh0Pmzk$default(C52535wP c52535wP, java.lang.String str, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c52535wP.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC57843yq = c52535wP.OLrzqt;
        }
        return c52535wP.copydefault(str, interfaceC57843yq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52616wS
    public InterfaceC57843yq OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52616wS
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52535wP copydefault(@NotNull java.lang.String str, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C52535wP(str, interfaceC57843yq, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52535wP)) {
            return false;
        }
        C52535wP c52535wP = (C52535wP) obj;
        return C52643wT.copydefault(this.KWHzl, c52535wP.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c52535wP.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (C52643wT.KWHzl(this.KWHzl) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AuthOptionImpl(schemeId=" + ((java.lang.Object) C52643wT.AEQbTJ(this.KWHzl)) + ", attributes=" + this.OLrzqt + ')';
    }

    public C52535wP(java.lang.String str, InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.KWHzl = str;
        this.OLrzqt = interfaceC57843yq;
    }
}
