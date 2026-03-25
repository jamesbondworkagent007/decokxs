package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBN extends oAA<OKLiveModeratorInvitationMessage, nMK> {
    public final java.lang.Integer copydefault = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int KWHzl = C35399nuc.Dialog.DGUQLIdZmdUa;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKLiveModeratorInvitationMessage> KWHzl() {
        return OKLiveModeratorInvitationMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44112sDu, nMK>) oac, c35254nrp, (OKLiveModeratorInvitationMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKLiveModeratorInvitationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.newSession) + "] " + context.getString(C35399nuc.LoaderManager.extraCommand);
    }

    public void AEQbTJ(@NotNull oAC<AbstractC44112sDu, nMK> oac, @NotNull C35254nrp c35254nrp, @NotNull OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKLiveModeratorInvitationMessage, "");
        super.copydefault(oac, c35254nrp, oKLiveModeratorInvitationMessage);
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        ((nMK) oac.EZpvd()).EZpvd.setTextColor(ContextCompat.getColor(((nMK) oac.EZpvd()).EZpvd.getContext(), C52761wXj.Activity.WS));
        ((nMK) oac.EZpvd()).copydefault.setTextColor(ContextCompat.getColor(((nMK) oac.EZpvd()).EZpvd.getContext(), C52761wXj.Activity.zblBkD));
        android.view.View root = ((nMK) oac.EZpvd()).getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r2) * 0.65f);
            int iDp2px$default = C55298xhM.dp2px$default(280.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(210.0f, null, 1, null);
            if (iEZpvd >= iDp2px$default) {
                iEZpvd = iDp2px$default;
            } else if (iEZpvd <= iDp2px$default2) {
                iEZpvd = iDp2px$default2;
            }
            layoutParams.width = iEZpvd;
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
    }
}
