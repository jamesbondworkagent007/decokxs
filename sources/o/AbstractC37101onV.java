package o;

import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC37101onV<C extends OKMessageContent> extends oAE<C, nLR> {
    public final int EZpvd = C35399nuc.Dialog.hlkKmr;
    public final java.lang.Integer OLrzqt = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44111sDt, nLR> oac, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        android.widget.TextView textView = ((nLR) oac.EZpvd()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(c35254nrp, textView);
    }
}
