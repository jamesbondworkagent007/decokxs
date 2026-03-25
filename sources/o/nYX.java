package o;

import com.okinc.im.imui.group.messages.recallnotification.RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYX extends oAO<OKRecallNotificationMessage> {
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

    @Override // o.oAO, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44111sDt, AbstractC44117sDz>) oac, c35254nrp, (OKRecallNotificationMessage) oKMessageContent);
    }

    @Override // o.oAO, o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKRecallNotificationMessage oKRecallNotificationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return nYY.KWHzl.EZpvd(context, oKMessage);
    }

    public void AEQbTJ(@NotNull oAC<AbstractC44111sDt, AbstractC44117sDz> oac, @NotNull C35254nrp c35254nrp, @NotNull OKRecallNotificationMessage oKRecallNotificationMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
        super.copydefault(oac, c35254nrp, oKRecallNotificationMessage);
        android.view.View root = ((AbstractC44117sDz) oac.EZpvd()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AEQbTJ(c35254nrp, root);
        AbstractC44117sDz abstractC44117sDz = (AbstractC44117sDz) oac.EZpvd();
        oHK ohk = abstractC44117sDz.EZpvd;
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context = abstractC44117sDz.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ohk.setTextColor(C33070mpX.OLrzqt(i, context));
        AEQbTJ(oac, new RecallNotificationReceiveMessageViewProvider$onBindMessageContentView$2$1(oac, c35254nrp, abstractC44117sDz, null));
    }
}
