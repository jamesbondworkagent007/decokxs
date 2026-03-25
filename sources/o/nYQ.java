package o;

import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.UpdateGroupAvatarMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYQ extends AbstractC34300nYw<UpdateGroupAvatarMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<UpdateGroupAvatarMessage> KWHzl() {
        return UpdateGroupAvatarMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (UpdateGroupAvatarMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull UpdateGroupAvatarMessage updateGroupAvatarMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(updateGroupAvatarMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return AEQbTJ(context, updateGroupAvatarMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull UpdateGroupAvatarMessage updateGroupAvatarMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(updateGroupAvatarMessage, "");
        super.AEQbTJ(ogy, c35254nrp, updateGroupAvatarMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(AEQbTJ(context, updateGroupAvatarMessage));
    }

    public final java.lang.CharSequence AEQbTJ(android.content.Context context, UpdateGroupAvatarMessage updateGroupAvatarMessage) {
        java.lang.String strCopydefault;
        java.lang.String operatorId;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        GroupSystemMessageInfo notifyInfo = updateGroupAvatarMessage.getNotifyInfo();
        GroupSystemMessageInfo notifyInfo2 = updateGroupAvatarMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            strCopydefault = sNV.copydefault(zOLrzqt, notifyInfo != null ? notifyInfo.getOperatorNickname() : null, notifyInfo != null ? notifyInfo.getOperatorEnNickname() : null);
        }
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        java.lang.String formattedString$default = C33069mpW.getFormattedString$default(resources, C35399nuc.LoaderManager.hrNTAI, (java.util.Map) null, 2, (java.lang.Object) null);
        android.content.res.Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        int i = C35399nuc.LoaderManager.OBJEWx;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        java.lang.String strCopydefault2 = C33069mpW.copydefault(resources2, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strCopydefault)));
        GroupSystemMessageInfo notifyInfo3 = updateGroupAvatarMessage.getNotifyInfo();
        if (notifyInfo3 != null && (operatorId = notifyInfo3.getOperatorId()) != null) {
            if ((C44157sFk.KWHzl(operatorId) ? operatorId : null) != null && formattedString$default != null) {
                return formattedString$default;
            }
        }
        return strCopydefault2;
    }
}
