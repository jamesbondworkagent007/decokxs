package o;

import com.okinc.okimcore.model.im.AllowGroupPrivateChatMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYC extends AbstractC34300nYw<AllowGroupPrivateChatMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<AllowGroupPrivateChatMessage> KWHzl() {
        return AllowGroupPrivateChatMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* bridge */ /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        AEQbTJ((oGY<nLO>) ogy, c35254nrp, (AllowGroupPrivateChatMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull AllowGroupPrivateChatMessage allowGroupPrivateChatMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(allowGroupPrivateChatMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return AEQbTJ(context, allowGroupPrivateChatMessage);
    }

    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull AllowGroupPrivateChatMessage allowGroupPrivateChatMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(allowGroupPrivateChatMessage, "");
        super.AEQbTJ(ogy, c35254nrp, allowGroupPrivateChatMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(AEQbTJ(context, allowGroupPrivateChatMessage));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence AEQbTJ(android.content.Context context, AllowGroupPrivateChatMessage allowGroupPrivateChatMessage) {
        java.lang.String operatorId;
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        java.lang.String string;
        GroupSystemMessageInfo notifyInfo = allowGroupPrivateChatMessage.getNotifyInfo();
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
                    if (allowGroupPrivateChatMessage.isEnabled()) {
                        string = context.getString(C35399nuc.LoaderManager.DaTmkG);
                    } else {
                        string = context.getString(C35399nuc.LoaderManager.invokespecialsiEkQe);
                    }
                }
                if (string != null) {
                }
            }
        }
        int i = allowGroupPrivateChatMessage.isEnabled() ? C35399nuc.LoaderManager.DPHOMC : C35399nuc.LoaderManager.ROgMPW;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(resources, "");
        GroupSystemMessageInfo notifyInfo2 = allowGroupPrivateChatMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = allowGroupPrivateChatMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = allowGroupPrivateChatMessage.getNotifyInfo();
            java.lang.String strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
            if (strCopydefault != null) {
                str = strCopydefault;
            }
        } else {
            str = displayName$default;
        }
        return C33069mpW.copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("admin", str)));
    }
}
