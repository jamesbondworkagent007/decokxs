package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60170zxg;
import org.jetbrains.annotations.NotNull;
import uniffi.network.HttpMethod;

/* JADX INFO: renamed from: o.Bbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4343Bbn implements InterfaceC60170zxg {
    public static final int $stable = 8;
    public AbstractC4327BbX AEQbTJ;
    public InterfaceC4400Bcr AYXKKw;
    public java.lang.String AhwBna;
    public java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public C4345Bbp KWHzl;
    public boolean OLrzqt;
    public HttpMethod copydefault;
    public C56396yDv djBIcL;
    public AbstractC4401Bcs gEmmrt;
    public C4393Bck valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 uniffi.network.HttpMethod)
  (r2v0 java.lang.String)
  (r3v0 java.util.Map)
  (r4v0 o.BbX)
  (r5v0 o.yDv)
  (r6v0 o.Bbp)
  (r7v0 o.Bcs)
  (r8v0 boolean)
  (r9v0 o.Bck)
  (r10v0 o.Bcr)
 A[MD:(uniffi.network.HttpMethod, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, o.BbX, o.yDv, o.Bbp, o.Bcs, boolean, o.Bck, o.Bcr):void (m)] call: o.Bbn.<init>(uniffi.network.HttpMethod, java.lang.String, java.util.Map, o.BbX, o.yDv, o.Bbp, o.Bcs, boolean, o.Bck, o.Bcr):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4343Bbn(HttpMethod httpMethod, java.lang.String str, java.util.Map map, AbstractC4327BbX abstractC4327BbX, C56396yDv c56396yDv, C4345Bbp c4345Bbp, AbstractC4401Bcs abstractC4401Bcs, boolean z, C4393Bck c4393Bck, InterfaceC4400Bcr interfaceC4400Bcr, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpMethod, str, map, abstractC4327BbX, c56396yDv, c4345Bbp, abstractC4401Bcs, z, c4393Bck, interfaceC4400Bcr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4343Bbn AEQbTJ(@NotNull HttpMethod httpMethod, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull AbstractC4327BbX abstractC4327BbX, C56396yDv c56396yDv, C4345Bbp c4345Bbp, @NotNull AbstractC4401Bcs abstractC4401Bcs, boolean z, C4393Bck c4393Bck, InterfaceC4400Bcr interfaceC4400Bcr) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(abstractC4327BbX, "");
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        return new C4343Bbn(httpMethod, str, map, abstractC4327BbX, c56396yDv, c4345Bbp, abstractC4401Bcs, z, c4393Bck, interfaceC4400Bcr, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpMethod AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC4400Bcr AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC4327BbX OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4345Bbp copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4393Bck djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4343Bbn)) {
            return false;
        }
        C4343Bbn c4343Bbn = (C4343Bbn) obj;
        return this.copydefault == c4343Bbn.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c4343Bbn.AhwBna) && Intrinsics.EZpvd(this.EZpvd, c4343Bbn.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c4343Bbn.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, c4343Bbn.djBIcL) && Intrinsics.EZpvd(this.KWHzl, c4343Bbn.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, c4343Bbn.gEmmrt) && this.OLrzqt == c4343Bbn.OLrzqt && Intrinsics.EZpvd(this.valueOf, c4343Bbn.valueOf) && Intrinsics.EZpvd(this.AYXKKw, c4343Bbn.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56396yDv gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        C56396yDv c56396yDv = this.djBIcL;
        int iAEQbTJ = c56396yDv == null ? 0 : C56396yDv.AEQbTJ(c56396yDv.OLrzqt());
        C4345Bbp c4345Bbp = this.KWHzl;
        int iHashCode5 = c4345Bbp == null ? 0 : c4345Bbp.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.OLrzqt);
        C4393Bck c4393Bck = this.valueOf;
        int iHashCode8 = c4393Bck == null ? 0 : c4393Bck.hashCode();
        InterfaceC4400Bcr interfaceC4400Bcr = this.AYXKKw;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iAEQbTJ) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (interfaceC4400Bcr != null ? interfaceC4400Bcr.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OkxHttpRequestOptions(method=" + this.copydefault + ", url=" + this.AhwBna + ", headers=" + this.EZpvd + ", body=" + this.AEQbTJ + ", timeoutMs=" + this.djBIcL + ", cache=" + this.KWHzl + ", subDomainStrategy=" + this.gEmmrt + ", ignoreAuthorization=" + this.OLrzqt + ", security=" + this.valueOf + ", uploadProgress=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC4401Bcs valueOf() {
        return this.gEmmrt;
    }

    public C4343Bbn(HttpMethod httpMethod, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, AbstractC4327BbX abstractC4327BbX, C56396yDv c56396yDv, C4345Bbp c4345Bbp, AbstractC4401Bcs abstractC4401Bcs, boolean z, C4393Bck c4393Bck, InterfaceC4400Bcr interfaceC4400Bcr) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(abstractC4327BbX, "");
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        this.copydefault = httpMethod;
        this.AhwBna = str;
        this.EZpvd = map;
        this.AEQbTJ = abstractC4327BbX;
        this.djBIcL = c56396yDv;
        this.KWHzl = c4345Bbp;
        this.gEmmrt = abstractC4401Bcs;
        this.OLrzqt = z;
        this.valueOf = c4393Bck;
        this.AYXKKw = interfaceC4400Bcr;
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        InterfaceC60170zxg.TaskDescription taskDescription = InterfaceC60170zxg.Companion;
        HttpMethod httpMethod = this.copydefault;
        java.lang.String str = this.AhwBna;
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd;
        AbstractC4327BbX abstractC4327BbX = this.AEQbTJ;
        C56396yDv c56396yDv = this.djBIcL;
        C4345Bbp c4345Bbp = this.KWHzl;
        AbstractC4401Bcs abstractC4401Bcs = this.gEmmrt;
        boolean z = this.OLrzqt;
        taskDescription.copydefault(httpMethod, str, map, abstractC4327BbX, c56396yDv, c4345Bbp, abstractC4401Bcs, java.lang.Boolean.valueOf(z), this.valueOf, this.AYXKKw);
    }
}
