package o;

import com.okinc.im.imui.group.messages.recallnotification.RecallNotificationSendMessageViewProvider$onBindMessageContentView$2$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYW extends oAT<OKRecallNotificationMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKRecallNotificationMessage> KWHzl() {
        return OKRecallNotificationMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs, o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    @Override // o.oAT, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44112sDu, AbstractC44115sDx>) oac, c35254nrp, (OKRecallNotificationMessage) oKMessageContent);
    }

    @Override // o.oAT, o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.SEND);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKRecallNotificationMessage oKRecallNotificationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return nYY.KWHzl.EZpvd(context, oKMessage);
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, AbstractC44115sDx> oac, @NotNull C35254nrp c35254nrp, @NotNull OKRecallNotificationMessage oKRecallNotificationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
        super.copydefault(oac, c35254nrp, oKRecallNotificationMessage);
        android.view.View root = ((AbstractC44115sDx) oac.EZpvd()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AEQbTJ(c35254nrp, root);
        AbstractC44115sDx abstractC44115sDx = (AbstractC44115sDx) oac.EZpvd();
        oHK ohk = abstractC44115sDx.copydefault;
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = abstractC44115sDx.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ohk.setTextColor(C33070mpX.OLrzqt(i, context));
        AEQbTJ(oac, new RecallNotificationSendMessageViewProvider$onBindMessageContentView$2$1(oac, c35254nrp, abstractC44115sDx, null));
    }
}
