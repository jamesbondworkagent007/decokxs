package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKPayMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBP extends oAA<OKPayMessage, nML> {
    public final java.lang.Integer AEQbTJ = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.DGUQLIekVPG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKPayMessage> KWHzl() {
        return OKPayMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44112sDu, nML>) oac, c35254nrp, (OKPayMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKPayMessage oKPayMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKPayMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C33726nDo.EZpvd.OLrzqt(context, oKPayMessage, oKMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding; */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public nML OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C33726nDo.EZpvd.KWHzl((nML) super.OLrzqt(layoutInflater, viewGroup));
    }

    public void AEQbTJ(@NotNull oAC<AbstractC44112sDu, nML> oac, @NotNull C35254nrp c35254nrp, @NotNull OKPayMessage oKPayMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKPayMessage, "");
        super.copydefault(oac, c35254nrp, oKPayMessage);
        C33726nDo.EZpvd.copydefault(oac, c35254nrp, oKPayMessage, OKMessage.MessageDirection.SEND);
        android.widget.LinearLayout linearLayout = ((nML) oac.EZpvd()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AEQbTJ(c35254nrp, linearLayout);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKPayMessage oKPayMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKPayMessage, "");
        C33726nDo c33726nDo = C33726nDo.EZpvd;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c33726nDo.AEQbTJ(context, c35254nrp.OLrzqt(), oKPayMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKPayMessage oKPayMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKPayMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return C33726nDo.EZpvd.OLrzqt(view, i, c35254nrp, oKPayMessage);
    }
}
