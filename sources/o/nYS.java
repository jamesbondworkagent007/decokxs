package o;

import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.StartGroupVoiceCallMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYS extends AbstractC34300nYw<StartGroupVoiceCallMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<StartGroupVoiceCallMessage> KWHzl() {
        return StartGroupVoiceCallMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (StartGroupVoiceCallMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull StartGroupVoiceCallMessage startGroupVoiceCallMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(startGroupVoiceCallMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return AEQbTJ(context, startGroupVoiceCallMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull StartGroupVoiceCallMessage startGroupVoiceCallMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(startGroupVoiceCallMessage, "");
        super.AEQbTJ(ogy, c35254nrp, startGroupVoiceCallMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(AEQbTJ(context, startGroupVoiceCallMessage));
    }

    public final java.lang.CharSequence AEQbTJ(android.content.Context context, StartGroupVoiceCallMessage startGroupVoiceCallMessage) {
        java.lang.String operatorId;
        java.lang.String strCopydefault;
        java.util.Map mapEZpvd;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        GroupSystemMessageInfo notifyInfo = startGroupVoiceCallMessage.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        int i = z ? C35399nuc.LoaderManager.aJZHYI : C35399nuc.LoaderManager.DrNnAm;
        if (z) {
            mapEZpvd = C56424yEw.KWHzl();
        } else {
            boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
            GroupSystemMessageInfo notifyInfo2 = startGroupVoiceCallMessage.getNotifyInfo();
            if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
                GroupSystemMessageInfo notifyInfo3 = startGroupVoiceCallMessage.getNotifyInfo();
                java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
                GroupSystemMessageInfo notifyInfo4 = startGroupVoiceCallMessage.getNotifyInfo();
                strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
            }
            mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strCopydefault));
        }
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return C33069mpW.copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapEZpvd);
    }
}
