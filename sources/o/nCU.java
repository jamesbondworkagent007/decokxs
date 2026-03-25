package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewStubProxy;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.TextSendMessageViewProvider$longPressAction$1;
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
public final class nCU extends oAT<OKTextMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKTextMessage> KWHzl() {
        return OKTextMessage.class;
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
        KWHzl((oAC<AbstractC44112sDu, AbstractC44115sDx>) oac, c35254nrp, (OKTextMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public float bl_() {
        return zLjUOn();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKTextMessage oKTextMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String aliasedContent = oKTextMessage.getAliasedContent();
        return aliasedContent == null ? "" : aliasedContent;
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, AbstractC44115sDx> oac, @NotNull final C35254nrp c35254nrp, @NotNull OKTextMessage oKTextMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        super.copydefault(oac, c35254nrp, oKTextMessage);
        android.content.Context context = oac.itemView.getContext();
        LinearLayoutCompat linearLayoutCompat = oac.copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        AEQbTJ(c35254nrp, linearLayoutCompat);
        oac.copydefault().AYXKKw.setGravity(8388611);
        oHK ohk = ((AbstractC44115sDx) oac.EZpvd()).copydefault;
        ohk.setNormalTextColor(ContextCompat.getColor(context, C52761wXj.Activity.zblBkD));
        ohk.setIMStyle(new Function1() { // from class: o.nCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nCU.AEQbTJ(this.AEQbTJ, c35254nrp, (java.lang.String) obj);
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
            EZpvd((AbstractC44115sDx) oac.EZpvd(), oKTextMessage);
            return;
        }
        ViewStubProxy viewStubProxy = ((AbstractC44115sDx) oac.EZpvd()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        C33131mqf.EZpvd(viewStubProxy);
    }

    public static final Unit AEQbTJ(nCU ncu, C35254nrp c35254nrp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        new IMEventTracker().OLrzqt(LifecycleOwnerKt.getLifecycleScope(ncu.DbNXlk()), c35254nrp.OLrzqt().getTargetId(), str, IMEventTracker.LinkLocation.Message, c35254nrp.OLrzqt().getSenderUserId());
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractC44115sDx abstractC44115sDx, OKTextMessage oKTextMessage) {
        ViewStubProxy viewStubProxy = abstractC44115sDx.EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        sDA sda = (sDA) C33131mqf.OLrzqt(viewStubProxy);
        ViewStubProxy viewStubProxy2 = abstractC44115sDx.EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
        C33131mqf.KWHzl(viewStubProxy2);
        android.content.Context context = abstractC44115sDx.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int maxBubbleWidth$default = AbstractC35707oAs.getMaxBubbleWidth$default(this, context, 0, 2, null);
        android.view.View root = sda.getRoot();
        ConstraintLayout constraintLayout = root instanceof ConstraintLayout ? (ConstraintLayout) root : null;
        if (constraintLayout != null) {
            constraintLayout.setMaxWidth(maxBubbleWidth$default);
        }
        nDC.AEQbTJ.AEQbTJ(sda, oKTextMessage, false);
        sda.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return nCU.OLrzqt(abstractC44115sDx, view);
            }
        });
    }

    public static final boolean OLrzqt(AbstractC44115sDx abstractC44115sDx, android.view.View view) {
        abstractC44115sDx.getRoot().performLongClick();
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKTextMessage oKTextMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        copydefault(viewBinding, c35254nrp);
        return true;
    }

    private final void copydefault(ViewBinding viewBinding, C35254nrp c35254nrp) {
        if (getFieldNames()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new TextSendMessageViewProvider$longPressAction$1(c35254nrp, this, viewBinding, null), 3, null);
        }
    }
}
