package o;

import com.okinc.okimcore.model.im.DisableGroupChatMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYJ extends AbstractC34300nYw<DisableGroupChatMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<DisableGroupChatMessage> KWHzl() {
        return DisableGroupChatMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* bridge */ /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        AEQbTJ((oGY<nLO>) ogy, c35254nrp, (DisableGroupChatMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull DisableGroupChatMessage disableGroupChatMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(disableGroupChatMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return OLrzqt(context, disableGroupChatMessage);
    }

    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull DisableGroupChatMessage disableGroupChatMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(disableGroupChatMessage, "");
        super.AEQbTJ(ogy, c35254nrp, disableGroupChatMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(OLrzqt(context, disableGroupChatMessage));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence OLrzqt(android.content.Context context, DisableGroupChatMessage disableGroupChatMessage) {
        java.lang.String operatorId;
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        java.lang.String string;
        GroupSystemMessageInfo notifyInfo = disableGroupChatMessage.getNotifyInfo();
        if (notifyInfo != null) {
            java.lang.String operatorId2 = notifyInfo.getOperatorId();
            if (operatorId2 == null) {
                string = null;
                if (string != null) {
                    return string;
                }
            } else {
                if (!C44157sFk.KWHzl(operatorId2)) {
                    operatorId2 = null;
                }
                if (operatorId2 != null) {
                    if (disableGroupChatMessage.isDisable()) {
                        string = context.getString(C35399nuc.LoaderManager.fqaWRL);
                    } else {
                        string = context.getString(C35399nuc.LoaderManager.DuR);
                    }
                }
                if (string != null) {
                }
            }
        }
        int i = disableGroupChatMessage.isDisable() ? C35399nuc.LoaderManager.QHmsKR : C35399nuc.LoaderManager.hBpjJd;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(resources, "");
        GroupSystemMessageInfo notifyInfo2 = disableGroupChatMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = disableGroupChatMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = disableGroupChatMessage.getNotifyInfo();
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
