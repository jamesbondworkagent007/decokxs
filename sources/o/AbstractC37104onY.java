package o;

import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC37104onY<C extends OKMessageContent> extends oAA<C, nLW> {
    public final int AEQbTJ = C35399nuc.Dialog.gmHjFq;
    public final java.lang.Integer copydefault = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44112sDu, nLW> oac, @NotNull C35254nrp c35254nrp, @NotNull C c) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(c, "");
        super.copydefault(oac, c35254nrp, c);
        android.widget.TextView textView = ((nLW) oac.EZpvd()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(c35254nrp, textView);
    }
}
