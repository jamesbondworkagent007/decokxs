package o;

import com.amplitude.experiment.VariantSource;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LQ implements LT {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final LF EZpvd;
    public final java.lang.String KWHzl;
    public final VariantSource OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public final java.util.Map<java.lang.String, java.lang.Object> djBIcL;
    public final LP valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.LT
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.LT
    public LP copydefault() {
        return this.valueOf;
    }

    public LQ(@NotNull LF lf, @NotNull java.lang.String str, @NotNull LP lp, @NotNull VariantSource variantSource) {
        Intrinsics.checkNotNullParameter(lf, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lp, "");
        Intrinsics.checkNotNullParameter(variantSource, "");
        this.EZpvd = lf;
        this.AEQbTJ = str;
        this.valueOf = lp;
        this.OLrzqt = variantSource;
        this.KWHzl = "[Experiment] Exposure";
        this.copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, EZpvd()), C56390yDp.OLrzqt("variant", copydefault().copydefault), C56390yDp.OLrzqt("source", variantSource.toString()));
        this.djBIcL = C56423yEv.EZpvd(C56390yDp.OLrzqt("[Experiment] " + EZpvd(), copydefault().copydefault));
        this.AYXKKw = "[Experiment] " + EZpvd();
    }
}
