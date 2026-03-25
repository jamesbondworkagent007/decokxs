package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewStubProxy;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.TextReceiveMessageViewProvider$longPressAction$1;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCN extends oAO<OKTextMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKTextMessage> KWHzl() {
        return OKTextMessage.class;
    }

    @Override // o.oAO, o.AbstractC35707oAs
    public boolean bf_() {
        return true;
    }

    @Override // o.oAO, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        EZpvd((oAC<AbstractC44111sDt, AbstractC44117sDz>) oac, c35254nrp, (OKTextMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public float bl_() {
        return zLjUOn();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKTextMessage oKTextMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String aliasedContent = oKTextMessage.getAliasedContent();
        return aliasedContent == null ? "" : aliasedContent;
    }

    public void EZpvd(@NotNull oAC<AbstractC44111sDt, AbstractC44117sDz> oac, @NotNull final C35254nrp c35254nrp, @NotNull OKTextMessage oKTextMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        super.copydefault(oac, c35254nrp, oKTextMessage);
        android.content.Context context = oac.itemView.getContext();
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        oHK ohk = ((AbstractC44117sDz) oac.EZpvd()).EZpvd;
        ohk.setNormalTextColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        ohk.setIMStyle(new Function1() { // from class: o.nCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nCN.KWHzl(this.KWHzl, c35254nrp, (java.lang.String) obj);
            }
        });
        java.lang.String strEZpvd = c35254nrp.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            java.lang.String aliasedContent = oKTextMessage.getAliasedContent();
            if (aliasedContent == null) {
                aliasedContent = "";
            }
            android.text.SpannableString spannableStringOLrzqt = ohk.OLrzqt(aliasedContent);
            Intrinsics.copydefault(context);
            ohk.setText(C37683oyU.setupHighlightBgSpanStyle$default(spannableStringOLrzqt, context, strEZpvd, C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr), null, 8, null));
        } else {
            java.lang.String aliasedContent2 = oKTextMessage.getAliasedContent();
            if (aliasedContent2 == null) {
                aliasedContent2 = "";
            }
            ohk.setText(ohk.OLrzqt(aliasedContent2));
        }
        if (oKTextMessage.getSiteMeta() != null) {
            OLrzqt((AbstractC44117sDz) oac.EZpvd(), oKTextMessage);
            return;
        }
        ViewStubProxy viewStubProxy = ((AbstractC44117sDz) oac.EZpvd()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        C33131mqf.EZpvd(viewStubProxy);
    }

    public static final Unit KWHzl(nCN ncn, C35254nrp c35254nrp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        new IMEventTracker().OLrzqt(LifecycleOwnerKt.getLifecycleScope(ncn.DbNXlk()), c35254nrp.OLrzqt().getTargetId(), str, IMEventTracker.LinkLocation.Message, c35254nrp.OLrzqt().getSenderUserId());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final AbstractC44117sDz abstractC44117sDz, OKTextMessage oKTextMessage) {
        ViewStubProxy viewStubProxy = abstractC44117sDz.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        sDA sda = (sDA) C33131mqf.OLrzqt(viewStubProxy);
        ViewStubProxy viewStubProxy2 = abstractC44117sDz.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
        C33131mqf.KWHzl(viewStubProxy2);
        android.content.Context context = abstractC44117sDz.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int maxBubbleWidth$default = AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null);
        android.view.View root = sda.getRoot();
        ConstraintLayout constraintLayout = root instanceof ConstraintLayout ? (ConstraintLayout) root : null;
        if (constraintLayout != null) {
            constraintLayout.setMaxWidth(maxBubbleWidth$default);
        }
        nDC.AEQbTJ.AEQbTJ(sda, oKTextMessage, true);
        sda.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return nCN.copydefault(abstractC44117sDz, view);
            }
        });
    }

    public static final boolean copydefault(AbstractC44117sDz abstractC44117sDz, android.view.View view) {
        abstractC44117sDz.getRoot().performLongClick();
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKTextMessage oKTextMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        KWHzl(viewBinding, c35254nrp);
        return true;
    }

    private final void KWHzl(ViewBinding viewBinding, C35254nrp c35254nrp) {
        if (getFieldNames()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new TextReceiveMessageViewProvider$longPressAction$1(c35254nrp, this, viewBinding, null), 3, null);
        }
    }
}
