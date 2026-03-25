package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKRedPacketMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBR extends oAA<OKRedPacketMessage, nMR> {
    public final java.lang.Integer EZpvd = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int KWHzl = C35399nuc.Dialog.zSsVtY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKRedPacketMessage> KWHzl() {
        return OKRedPacketMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        OLrzqt((oAC<AbstractC44112sDu, nMR>) oac, c35254nrp, (OKRedPacketMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKRedPacketMessage oKRedPacketMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C33725nDn.AEQbTJ.OLrzqt(context, oKRedPacketMessage, oKMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding; */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public nMR OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C33725nDn.AEQbTJ.KWHzl((nMR) super.OLrzqt(layoutInflater, viewGroup));
    }

    public void OLrzqt(@NotNull oAC<AbstractC44112sDu, nMR> oac, @NotNull C35254nrp c35254nrp, @NotNull OKRedPacketMessage oKRedPacketMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        super.copydefault(oac, c35254nrp, oKRedPacketMessage);
        C33725nDn.AEQbTJ.AEQbTJ(oac, c35254nrp, oKRedPacketMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKRedPacketMessage oKRedPacketMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        C33725nDn.AEQbTJ.KWHzl(oKRedPacketMessage, C35334ntP.KWHzl(view), c35254nrp.OLrzqt().getTargetId());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKRedPacketMessage oKRedPacketMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRedPacketMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return C33725nDn.AEQbTJ.EZpvd(view, i, c35254nrp, oKRedPacketMessage);
    }
}
