package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.conversation.message.provider.LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1;
import com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBL extends oAE<OKLiveModeratorInvitationMessage, nMM> {
    public final java.lang.Integer EZpvd = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int KWHzl = C35399nuc.Dialog.DTg;

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
    public java.lang.Class<OKLiveModeratorInvitationMessage> KWHzl() {
        return OKLiveModeratorInvitationMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        OLrzqt((oAC<AbstractC44111sDt, nMM>) oac, c35254nrp, (OKLiveModeratorInvitationMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKLiveModeratorInvitationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.newSession) + "] " + context.getString(C35399nuc.LoaderManager.extraCommand);
    }

    public void OLrzqt(@NotNull oAC<AbstractC44111sDt, nMM> oac, @NotNull C35254nrp c35254nrp, @NotNull OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKLiveModeratorInvitationMessage, "");
        super.copydefault(oac, c35254nrp, oKLiveModeratorInvitationMessage);
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        ((nMM) oac.EZpvd()).copydefault.setTextColor(ContextCompat.getColor(((nMM) oac.EZpvd()).copydefault.getContext(), C52761wXj.Activity.DCUTEIddSDPG));
        ((nMM) oac.EZpvd()).AEQbTJ.setTextColor(ContextCompat.getColor(((nMM) oac.EZpvd()).copydefault.getContext(), C52761wXj.Activity.fdOvFl));
        android.view.View root = ((nMM) oac.EZpvd()).getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r4) * 0.65f);
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
        C52794wYp c52794wYp = ((nMM) oac.EZpvd()).EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, oKLiveModeratorInvitationMessage));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ OKLiveModeratorInvitationMessage AEQbTJ;
        public final /* synthetic */ nBL KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nBL nbl, OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = nbl;
            this.AEQbTJ = oKLiveModeratorInvitationMessage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl.DbNXlk()), null, null, new LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1((C52794wYp) this.copydefault, this.AEQbTJ, null), 3, null);
            }
        }
    }
}
