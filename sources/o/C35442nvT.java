package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastWelcomeSystemMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35442nvT extends AbstractC35702oAn<BroadcastWelcomeSystemMessage, AbstractC33938nLk> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<BroadcastWelcomeSystemMessage> KWHzl() {
        return BroadcastWelcomeSystemMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.RKcVTr;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<AbstractC33938nLk>) ogy, c35254nrp);
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull BroadcastWelcomeSystemMessage broadcastWelcomeSystemMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(broadcastWelcomeSystemMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.Integer numEZpvd = broadcastWelcomeSystemMessage.EZpvd();
        int iIntValue = numEZpvd != null ? numEZpvd.intValue() : 0;
        java.util.List<java.lang.String> listCopydefault = broadcastWelcomeSystemMessage.copydefault();
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        java.util.List<java.lang.String> list = listCopydefault;
        if (iIntValue <= 5) {
            return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.UeEOUB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("users", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, list.size() - 1), ", ", null, null, 0, null, null, 62, null)), C56390yDp.OLrzqt("user", (java.lang.String) CollectionsKt___CollectionsKt.AubY(list))));
        }
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.aKErDB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("users", CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null)), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iIntValue - 5)), null, 1, null))));
    }

    @Override // o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<AbstractC33938nLk> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl((oGY) ogy, c35254nrp);
        AbstractC33938nLk abstractC33938nLk = (AbstractC33938nLk) ogy.copydefault();
        int bindingAdapterPosition = ogy.getBindingAdapterPosition();
        android.widget.TextView textView = abstractC33938nLk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(bindingAdapterPosition, c35254nrp, textView);
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        Intrinsics.copydefault(content, "");
        android.widget.TextView textView2 = ((AbstractC33938nLk) ogy.copydefault()).copydefault;
        android.content.Context context = ogy.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView2.setText(KWHzl(context, (BroadcastWelcomeSystemMessage) content, c35254nrp.OLrzqt()));
    }
}
