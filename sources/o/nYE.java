package o;

import com.okinc.okimcore.model.im.AddContactMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYE extends AbstractC34300nYw<AddContactMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<AddContactMessage> KWHzl() {
        return AddContactMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull AddContactMessage addContactMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(addContactMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return AEQbTJ(context, addContactMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oGY;Lo/nrp;Lcom/okinc/okimcore/model/other/OKGroupNotificationMessage;)V */
    @Override // o.AbstractC34300nYw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull AddContactMessage addContactMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(addContactMessage, "");
        super.AEQbTJ(ogy, c35254nrp, addContactMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(AEQbTJ(context, addContactMessage));
    }

    public final java.lang.CharSequence AEQbTJ(android.content.Context context, AddContactMessage addContactMessage) {
        java.lang.String operatorId;
        java.lang.String strCopydefault;
        java.util.Map mapEZpvd;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        GroupSystemMessageInfo notifyInfo = addContactMessage.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        int i = z ? C35399nuc.LoaderManager.QKVWgx : C35399nuc.LoaderManager.AxsJAY;
        if (z) {
            mapEZpvd = C56424yEw.KWHzl();
        } else {
            boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
            GroupSystemMessageInfo notifyInfo2 = addContactMessage.getNotifyInfo();
            if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
                GroupSystemMessageInfo notifyInfo3 = addContactMessage.getNotifyInfo();
                java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
                GroupSystemMessageInfo notifyInfo4 = addContactMessage.getNotifyInfo();
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
