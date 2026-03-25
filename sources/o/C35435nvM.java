package o;

import com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastHitMaxSendMessageLimitSystemMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35435nvM extends AbstractC35702oAn<BroadcastHitMaxSendMessageLimitSystemMessage, AbstractC33938nLk> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<BroadcastHitMaxSendMessageLimitSystemMessage> KWHzl() {
        return BroadcastHitMaxSendMessageLimitSystemMessage.class;
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
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull BroadcastHitMaxSendMessageLimitSystemMessage broadcastHitMaxSendMessageLimitSystemMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(broadcastHitMaxSendMessageLimitSystemMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C33069mpW.getFormattedString$default(context, C35399nuc.LoaderManager.dNCPSb, (java.util.Map) null, 2, (java.lang.Object) null);
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
        textView2.setText(KWHzl(context, (BroadcastHitMaxSendMessageLimitSystemMessage) content, c35254nrp.OLrzqt()));
    }
}
