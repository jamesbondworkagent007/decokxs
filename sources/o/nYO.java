package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.widgets.GroupInviteType;
import com.okinc.okimcore.model.im.OKGroupInvitationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYO extends oAE<OKGroupInvitationMessage, AbstractC33975nMu> {
    public final int EZpvd = C35399nuc.Dialog.zYHWMc;
    public final int AEQbTJ = C35342ntX.AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKGroupInvitationMessage> KWHzl() {
        return OKGroupInvitationMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44111sDt, AbstractC33975nMu>) oac, c35254nrp, (OKGroupInvitationMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGroupInvitationMessage oKGroupInvitationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGroupInvitationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = C33070mpX.AYXKKw(C35399nuc.LoaderManager.WFXFk);
        objArr[1] = C33070mpX.AYXKKw(C35399nuc.LoaderManager.GhqvEQ);
        java.lang.String groupName = oKGroupInvitationMessage.getGroupName();
        if (groupName == null) {
            groupName = "";
        }
        objArr[2] = groupName;
        java.lang.String str = java.lang.String.format("%s %s %s", java.util.Arrays.copyOf(objArr, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public void KWHzl(@NotNull oAC<AbstractC44111sDt, AbstractC33975nMu> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGroupInvitationMessage oKGroupInvitationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupInvitationMessage, "");
        super.copydefault(oac, c35254nrp, oKGroupInvitationMessage);
        AbstractC33975nMu abstractC33975nMu = (AbstractC33975nMu) oac.EZpvd();
        android.view.View root = abstractC33975nMu.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r6) * 0.6f);
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
        ConstraintLayout constraintLayout = ((AbstractC33975nMu) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(c35254nrp, constraintLayout);
        abstractC33975nMu.AYXKKw.setText(oKGroupInvitationMessage.getGroupName());
        java.lang.String groupAvatar = oKGroupInvitationMessage.getGroupAvatar();
        if (groupAvatar != null) {
            C35893oHp c35893oHp = abstractC33975nMu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.AEQbTJ(c35893oHp, groupAvatar, GroupInviteType.GROUP_INVITE_RECEIVE);
        }
        C52794wYp c52794wYp = abstractC33975nMu.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, oKGroupInvitationMessage));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ OKGroupInvitationMessage OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, OKGroupInvitationMessage oKGroupInvitationMessage) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = oKGroupInvitationMessage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                RxBus.AEQbTJ(new C33734nDw(this.OLrzqt.getGroupId(), false, this.OLrzqt.getInvitationId()));
            }
        }
    }
}
