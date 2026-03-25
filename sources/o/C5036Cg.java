package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5036Cg implements InterfaceC5180Hu<C5036Cg> {
    public final DL.Application AEQbTJ;
    public zP EZpvd;
    public HttpMethod KWHzl;
    public final C58509zF OLrzqt;
    public final C58617zJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58617zJ AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58509zF AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpMethod EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(zPVar, "");
        this.EZpvd = zPVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zP KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull HttpMethod httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "");
        this.KWHzl = httpMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DL.Application djBIcL() {
        return this.AEQbTJ;
    }

    public C5036Cg(HttpMethod httpMethod, DL.Application application, C58617zJ c58617zJ, zP zPVar, C58509zF c58509zF) {
        this.KWHzl = httpMethod;
        this.AEQbTJ = application;
        this.copydefault = c58617zJ;
        this.EZpvd = zPVar;
        this.OLrzqt = c58509zF;
    }

    public C5036Cg() {
        this(HttpMethod.GET, new DL.Application(), new C58617zJ(), zP.StateListAnimator.KWHzl, new C58509zF());
    }

    public final InterfaceC5037Ch copydefault() {
        return C5043Cn.copydefault(this.KWHzl, this.AEQbTJ.KWHzl(), this.copydefault.AEQbTJ() ? InterfaceC58725zN.AEQbTJ.EZpvd() : this.copydefault.AYXKKw(), this.EZpvd, this.OLrzqt.AEQbTJ() ? InterfaceC58536zG.copydefault.OLrzqt() : this.OLrzqt.djBIcL());
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Ljava/lang/Object; */
    @Override // o.InterfaceC5180Hu
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C5036Cg gEmmrt() {
        return new C5036Cg(this.KWHzl, this.AEQbTJ.gEmmrt(), this.copydefault.gEmmrt(), this.EZpvd, this.OLrzqt.gEmmrt());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HttpRequestBuilder(method=" + this.KWHzl + ", url=" + this.AEQbTJ + ", headers=" + this.copydefault + ", body=" + this.EZpvd + ", trailingHeaders=" + this.OLrzqt + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
