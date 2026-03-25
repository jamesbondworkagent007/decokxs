package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5282Ls implements LN {
    public final IZ AEQbTJ;

    public C5282Ls(@NotNull IZ iz) {
        Intrinsics.checkNotNullParameter(iz, "");
        this.AEQbTJ = iz;
    }

    @Override // o.LN
    public void copydefault(@NotNull LH lh) {
        Intrinsics.checkNotNullParameter(lh, "");
        this.AEQbTJ.OLrzqt(new IV("$exposure", C5283Lt.EZpvd(C56424yEw.gEmmrt(C56390yDp.OLrzqt("flag_key", lh.OLrzqt()), C56390yDp.OLrzqt("variant", lh.KWHzl()), C56390yDp.OLrzqt("experiment_key", lh.copydefault()), C56390yDp.OLrzqt(TtmlNode.TAG_METADATA, lh.EZpvd()))), null, 4, null));
    }
}
