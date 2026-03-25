package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33723nDl extends oAE<OKHQVoiceMessage, AbstractC33994nNm> {
    public final java.lang.Integer KWHzl = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int copydefault = C35399nuc.Dialog.YqksP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKHQVoiceMessage> KWHzl() {
        return OKHQVoiceMessage.class;
    }

    @Override // o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44111sDt, AbstractC33994nNm>) oac, c35254nrp, (OKHQVoiceMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKHQVoiceMessage oKHQVoiceMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.ZAwExL) + "]";
    }

    public void AEQbTJ(@NotNull oAC<AbstractC44111sDt, AbstractC33994nNm> oac, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        super.copydefault(oac, c35254nrp, oKHQVoiceMessage);
        OLrzqt(oac, oKHQVoiceMessage, c35254nrp);
        pUU.KWHzl("VoiceMessage", "onBindReceiveMessage->duration:" + c35254nrp.fetchVPNInfo() + " progress:" + c35254nrp.valueOf());
    }

    public final void OLrzqt(oAC<AbstractC44111sDt, AbstractC33994nNm> oac, OKHQVoiceMessage oKHQVoiceMessage, C35254nrp c35254nrp) {
        android.graphics.drawable.Drawable drawable;
        AbstractC33994nNm abstractC33994nNm = (AbstractC33994nNm) oac.EZpvd();
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        java.lang.Integer numDjBIcL = c35254nrp.djBIcL();
        if (numDjBIcL != null) {
            drawable = ContextCompat.getDrawable(abstractC33994nNm.getRoot().getContext(), numDjBIcL.intValue());
        } else {
            drawable = null;
        }
        AppCompatTextView appCompatTextView = abstractC33994nNm.AEQbTJ;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        appCompatTextView.setCompoundDrawablePadding(C55298xhM.dp2px$default(6.0f, null, 1, null));
        abstractC33994nNm.AEQbTJ.setText(c35254nrp.AYXKKw());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        super.copydefault(view, i, c35254nrp, oKHQVoiceMessage);
        Function1<OKMessage, Unit> function1FJNWhG = fJNWhG();
        if (function1FJNWhG != null) {
            function1FJNWhG.invoke(c35254nrp.OLrzqt());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKHQVoiceMessage oKHQVoiceMessage, @NotNull ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKHQVoiceMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() != 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C44157sFk.EZpvd(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuReplyAction());
        }
        if (copydefault(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuRecallAction());
        }
        if (!C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            return true;
        }
        AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
        if (abstractC44111sDt == null || (linearLayoutCompat = abstractC44111sDt.AhwBna) == null || (yhoAuCTel = AuCTel()) == null) {
            return true;
        }
        yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
        return true;
    }
}
