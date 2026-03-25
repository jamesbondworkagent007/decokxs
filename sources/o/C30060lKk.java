package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewStubProxy;
import androidx.viewbinding.ViewBinding;
import com.okinc.buysell.ui.otcagent.initmessage.OtcAgentGetQuoteMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30060lKk extends oAT<OtcAgentGetQuoteMessageContent> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(otcAgentGetQuoteMessageContent, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OtcAgentGetQuoteMessageContent> KWHzl() {
        return OtcAgentGetQuoteMessageContent.class;
    }

    @Override // o.oAT, o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    @Override // o.AbstractC35707oAs
    public boolean bg_() {
        return true;
    }

    @Override // o.oAT, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44112sDu, AbstractC44115sDx>) oac, c35254nrp, (OtcAgentGetQuoteMessageContent) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(otcAgentGetQuoteMessageContent, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return otcAgentGetQuoteMessageContent.getGetQuoteMessage();
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, AbstractC44115sDx> oac, @NotNull C35254nrp c35254nrp, @NotNull OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(otcAgentGetQuoteMessageContent, "");
        super.copydefault(oac, c35254nrp, otcAgentGetQuoteMessageContent);
        android.content.Context context = oac.itemView.getContext();
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        oac.copydefault().AYXKKw.setGravity(8388611);
        oHK ohk = ((AbstractC44115sDx) oac.EZpvd()).copydefault;
        ohk.setNormalTextColor(ContextCompat.getColor(context, C52761wXj.Activity.zblBkD));
        ohk.setText(ohk.OLrzqt(otcAgentGetQuoteMessageContent.getGetQuoteMessage()));
        ViewStubProxy viewStubProxy = ((AbstractC44115sDx) oac.EZpvd()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        C33131mqf.EZpvd(viewStubProxy);
    }
}
