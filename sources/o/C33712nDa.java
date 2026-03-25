package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKTradingStartCompetitionMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33712nDa extends nAF<OKTradingStartCompetitionMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKTradingStartCompetitionMessage> KWHzl() {
        return OKTradingStartCompetitionMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.DTeKQX;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.nAF, o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<AbstractC34017nOi>) ogy, c35254nrp);
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKTradingStartCompetitionMessage oKTradingStartCompetitionMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKTradingStartCompetitionMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return AEQbTJ();
    }

    @Override // o.nAF, o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<AbstractC34017nOi> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl(ogy, c35254nrp);
        android.widget.TextView textView = ((AbstractC34017nOi) ogy.copydefault()).copydefault;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(AEQbTJ());
    }

    private final java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hlXVux);
    }
}
