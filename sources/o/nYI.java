package o;

import com.okinc.okimcore.model.im.CreateGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYI extends AbstractC34300nYw<CreateGroupMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<CreateGroupMessage> KWHzl() {
        return CreateGroupMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (CreateGroupMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull CreateGroupMessage createGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(context, createGroupMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull CreateGroupMessage createGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(createGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, createGroupMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(KWHzl(context, createGroupMessage));
    }

    public final java.lang.CharSequence KWHzl(android.content.Context context, CreateGroupMessage createGroupMessage) {
        java.lang.String operatorId;
        java.lang.String strCopydefault;
        java.util.Map mapGEmmrt;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        GroupSystemMessageInfo notifyInfo = createGroupMessage.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        int i = z ? C35399nuc.LoaderManager.OFhtUX : C35399nuc.LoaderManager.OmJATG;
        if (z) {
            mapGEmmrt = C56423yEv.EZpvd(C56390yDp.OLrzqt("group", createGroupMessage.getGroupName()));
        } else {
            boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            GroupSystemMessageInfo notifyInfo2 = createGroupMessage.getNotifyInfo();
            if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
                GroupSystemMessageInfo notifyInfo3 = createGroupMessage.getNotifyInfo();
                java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
                GroupSystemMessageInfo notifyInfo4 = createGroupMessage.getNotifyInfo();
                strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
            }
            pairArr[0] = C56390yDp.OLrzqt("name1", strCopydefault);
            pairArr[1] = C56390yDp.OLrzqt("name2", createGroupMessage.getGroupName());
            mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        }
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return C33069mpW.copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt);
    }
}
