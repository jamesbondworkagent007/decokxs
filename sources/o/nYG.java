package o;

import com.okinc.okimcore.model.im.ConvertPrivateToPublicGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYG extends AbstractC34300nYw<ConvertPrivateToPublicGroupMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<ConvertPrivateToPublicGroupMessage> KWHzl() {
        return ConvertPrivateToPublicGroupMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (ConvertPrivateToPublicGroupMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull ConvertPrivateToPublicGroupMessage convertPrivateToPublicGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(convertPrivateToPublicGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(context, convertPrivateToPublicGroupMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull ConvertPrivateToPublicGroupMessage convertPrivateToPublicGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(convertPrivateToPublicGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, convertPrivateToPublicGroupMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(KWHzl(context, convertPrivateToPublicGroupMessage));
    }

    public final java.lang.CharSequence KWHzl(android.content.Context context, ConvertPrivateToPublicGroupMessage convertPrivateToPublicGroupMessage) {
        java.lang.Boolean boolValueOf;
        java.lang.String operatorId;
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        GroupSystemMessageInfo notifyInfo = convertPrivateToPublicGroupMessage.getNotifyInfo();
        if (notifyInfo != null) {
            java.lang.String operatorId2 = notifyInfo.getOperatorId();
            if (operatorId2 == null || !C44157sFk.KWHzl(operatorId2)) {
                operatorId2 = null;
            }
            boolValueOf = java.lang.Boolean.valueOf(operatorId2 != null);
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.UkCIYP);
        }
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        android.content.res.Resources resources = context.getResources();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int i = C35399nuc.LoaderManager.QVMIlxQVMIlx;
        GroupSystemMessageInfo notifyInfo2 = convertPrivateToPublicGroupMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = convertPrivateToPublicGroupMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = convertPrivateToPublicGroupMessage.getNotifyInfo();
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
