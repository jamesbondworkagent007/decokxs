package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.im.widgets.GroupInviteType;
import com.okinc.okimcore.model.im.OKGroupInvitationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYN extends oAA<OKGroupInvitationMessage, AbstractC33974nMt> {
    public final int copydefault = C35399nuc.Dialog.zhUgOk;
    public final int KWHzl = C35342ntX.AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKGroupInvitationMessage> KWHzl() {
        return OKGroupInvitationMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44112sDu, AbstractC33974nMt>) oac, c35254nrp, (OKGroupInvitationMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGroupInvitationMessage oKGroupInvitationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGroupInvitationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = C33070mpX.AYXKKw(C35399nuc.LoaderManager.WFXFk);
        objArr[1] = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OStAOF);
        java.lang.String groupName = oKGroupInvitationMessage.getGroupName();
        if (groupName == null) {
            groupName = "";
        }
        objArr[2] = groupName;
        java.lang.String str = java.lang.String.format("%s %s %s", java.util.Arrays.copyOf(objArr, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, AbstractC33974nMt> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGroupInvitationMessage oKGroupInvitationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupInvitationMessage, "");
        super.copydefault(oac, c35254nrp, oKGroupInvitationMessage);
        AbstractC33974nMt abstractC33974nMt = (AbstractC33974nMt) oac.EZpvd();
        android.view.View root = abstractC33974nMt.getRoot();
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
        ConstraintLayout constraintLayout = ((AbstractC33974nMt) oac.EZpvd()).copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(c35254nrp, constraintLayout);
        abstractC33974nMt.djBIcL.setText(oKGroupInvitationMessage.getGroupName());
        java.lang.String groupAvatar = oKGroupInvitationMessage.getGroupAvatar();
        if (groupAvatar != null) {
            C35893oHp c35893oHp = abstractC33974nMt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.AEQbTJ(c35893oHp, groupAvatar, GroupInviteType.GROUP_INVITE_SEND);
        }
        C52794wYp c52794wYp = abstractC33974nMt.EZpvd;
        Intrinsics.copydefault(c52794wYp);
        C37716ozA.AEQbTJ(c52794wYp);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, oKGroupInvitationMessage));
    }

    private final boolean KWHzl(C35254nrp c35254nrp, ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        if (getFieldNames() && c35254nrp.KWHzl() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(new MenuInfoAction());
            AbstractC44112sDu abstractC44112sDu = viewBinding instanceof AbstractC44112sDu ? (AbstractC44112sDu) viewBinding : null;
            if (abstractC44112sDu != null && (linearLayoutCompat = abstractC44112sDu.AhwBna) != null && (yhoAuCTel = AuCTel()) != null) {
                yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGroupInvitationMessage oKGroupInvitationMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupInvitationMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return KWHzl(c35254nrp, viewBinding);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ OKGroupInvitationMessage OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, OKGroupInvitationMessage oKGroupInvitationMessage) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = oKGroupInvitationMessage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                RxBus.AEQbTJ(new C33734nDw(this.OLrzqt.getGroupId(), true, this.OLrzqt.getInvitationId()));
            }
        }
    }
}
