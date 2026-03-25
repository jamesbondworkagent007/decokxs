package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34300nYw<T extends OKGroupNotificationMessage> extends AbstractC35702oAn<T, nLO> {
    public final void AEQbTJ(oGY<nLO> ogy, C35254nrp c35254nrp) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull T t) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(t, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.dvImUD;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<nLO>) ogy, c35254nrp);
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    @Override // o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl(ogy, c35254nrp);
        nLO nlo = (nLO) ogy.copydefault();
        int adapterPosition = ogy.getAdapterPosition();
        android.widget.TextView textView = nlo.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(adapterPosition, c35254nrp, textView);
        android.widget.LinearLayout linearLayout = ((nLO) ogy.copydefault()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.widget.TextView textView2 = ((nLO) ogy.copydefault()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        OLrzqt(linearLayout, textView2, c35254nrp);
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        Intrinsics.copydefault(content, "");
        AEQbTJ(ogy, c35254nrp, (OKGroupNotificationMessage) content);
        AEQbTJ(ogy, c35254nrp);
    }
}
