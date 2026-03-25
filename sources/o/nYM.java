package o;

import com.okinc.okimcore.model.im.DisbandGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYM extends AbstractC34300nYw<DisbandGroupMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<DisbandGroupMessage> KWHzl() {
        return DisbandGroupMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull DisbandGroupMessage disbandGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(disbandGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return copydefault(context, disbandGroupMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oGY;Lo/nrp;Lcom/okinc/okimcore/model/other/OKGroupNotificationMessage;)V */
    @Override // o.AbstractC34300nYw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull DisbandGroupMessage disbandGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(disbandGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, disbandGroupMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(copydefault(context, disbandGroupMessage));
    }

    public final java.lang.CharSequence copydefault(android.content.Context context, DisbandGroupMessage disbandGroupMessage) {
        java.lang.String operatorId;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        GroupSystemMessageInfo notifyInfo = disbandGroupMessage.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        int i = operatorId != null ? C35399nuc.LoaderManager.QCjLjM : C35399nuc.LoaderManager.QkdxfA;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(resources, "");
        GroupSystemMessageInfo notifyInfo2 = disbandGroupMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = disbandGroupMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = disbandGroupMessage.getNotifyInfo();
            java.lang.String strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
            if (strCopydefault != null) {
                str = strCopydefault;
            }
        } else {
            str = displayName$default;
        }
        return C33069mpW.copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", str)));
    }
}
