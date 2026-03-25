package o;

import com.okinc.okimcore.model.im.AllowGeneratingInvitationQrCodeGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYD extends AbstractC34300nYw<AllowGeneratingInvitationQrCodeGroupMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<AllowGeneratingInvitationQrCodeGroupMessage> KWHzl() {
        return AllowGeneratingInvitationQrCodeGroupMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        EZpvd((oGY<nLO>) ogy, c35254nrp, (AllowGeneratingInvitationQrCodeGroupMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull AllowGeneratingInvitationQrCodeGroupMessage allowGeneratingInvitationQrCodeGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(allowGeneratingInvitationQrCodeGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(context, allowGeneratingInvitationQrCodeGroupMessage);
    }

    public void EZpvd(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull AllowGeneratingInvitationQrCodeGroupMessage allowGeneratingInvitationQrCodeGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(allowGeneratingInvitationQrCodeGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, allowGeneratingInvitationQrCodeGroupMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(KWHzl(context, allowGeneratingInvitationQrCodeGroupMessage));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence KWHzl(android.content.Context context, AllowGeneratingInvitationQrCodeGroupMessage allowGeneratingInvitationQrCodeGroupMessage) {
        java.lang.String operatorId;
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        java.lang.String string;
        GroupSystemMessageInfo notifyInfo = allowGeneratingInvitationQrCodeGroupMessage.getNotifyInfo();
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
                    if (allowGeneratingInvitationQrCodeGroupMessage.isEnabled()) {
                        string = context.getString(C35399nuc.LoaderManager.getValue);
                    } else {
                        string = context.getString(C35399nuc.LoaderManager.GQzpsZgQzpsZ);
                    }
                }
                if (string != null) {
                }
            }
        }
        int i = allowGeneratingInvitationQrCodeGroupMessage.isEnabled() ? C35399nuc.LoaderManager.GcnicV : C35399nuc.LoaderManager.GQzpsZsQwTVT;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(resources, "");
        GroupSystemMessageInfo notifyInfo2 = allowGeneratingInvitationQrCodeGroupMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = allowGeneratingInvitationQrCodeGroupMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = allowGeneratingInvitationQrCodeGroupMessage.getNotifyInfo();
            java.lang.String strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
            if (strCopydefault != null) {
                str = strCopydefault;
            }
        } else {
            str = displayName$default;
        }
        return C33069mpW.copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", str)));
    }
}
