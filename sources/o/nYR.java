package o;

import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.TransferGroupOwnershipMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYR extends AbstractC34300nYw<TransferGroupOwnershipMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<TransferGroupOwnershipMessage> KWHzl() {
        return TransferGroupOwnershipMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (TransferGroupOwnershipMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull TransferGroupOwnershipMessage transferGroupOwnershipMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transferGroupOwnershipMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return copydefault(context, transferGroupOwnershipMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull TransferGroupOwnershipMessage transferGroupOwnershipMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(transferGroupOwnershipMessage, "");
        super.AEQbTJ(ogy, c35254nrp, transferGroupOwnershipMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.content.Context context = nlo.copydefault.getContext();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.copydefault(context);
        textView.setText(copydefault(context, transferGroupOwnershipMessage));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence copydefault(android.content.Context context, TransferGroupOwnershipMessage transferGroupOwnershipMessage) {
        boolean z;
        GroupSystemMessageInfo notifyInfo = transferGroupOwnershipMessage.getNotifyInfo();
        if (notifyInfo == null) {
            return "";
        }
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        java.lang.String operatorId = notifyInfo.getOperatorId();
        if (operatorId != null) {
            z = C44157sFk.KWHzl(operatorId);
        }
        java.util.List<java.lang.String> targetUserIds = notifyInfo.getTargetUserIds();
        if (targetUserIds != null && !targetUserIds.isEmpty()) {
            java.util.Iterator<T> it = targetUserIds.iterator();
            while (it.hasNext()) {
                if (C44157sFk.KWHzl((java.lang.String) it.next())) {
                    android.content.res.Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    return C33069mpW.copydefault(resources, C35399nuc.LoaderManager.setLocationManually, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("owner", OLrzqt(notifyInfo, zOLrzqt))));
                }
            }
        }
        if (z) {
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(sNV.copydefault(notifyInfo.getTargetUserDisplayList()), ", ", null, null, 0, null, null, 62, null);
            android.content.res.Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            return C33069mpW.copydefault(resources2, C35399nuc.LoaderManager.aUsmxb, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strJoinToString$default)));
        }
        java.lang.String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(sNV.copydefault(notifyInfo.getTargetUserDisplayList()), ", ", null, null, 0, null, null, 62, null);
        java.lang.String strOLrzqt = OLrzqt(notifyInfo, zOLrzqt);
        android.content.res.Resources resources3 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        return C33069mpW.copydefault(resources3, C35399nuc.LoaderManager.dmfpNf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("userA", strOLrzqt), C56390yDp.OLrzqt("userB", strJoinToString$default2)));
    }

    public static final java.lang.String OLrzqt(GroupSystemMessageInfo groupSystemMessageInfo, boolean z) {
        java.lang.String operatorId = groupSystemMessageInfo.getOperatorId();
        if (operatorId != null) {
            RelationInfo relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId);
            java.lang.String displayName$default = relationInfoKWHzl != null ? C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null) : null;
            if (displayName$default != null) {
                return displayName$default;
            }
        }
        java.lang.String strCopydefault = sNV.copydefault(z, groupSystemMessageInfo.getOperatorNickname(), groupSystemMessageInfo.getOperatorEnNickname());
        return strCopydefault == null ? "" : strCopydefault;
    }
}
