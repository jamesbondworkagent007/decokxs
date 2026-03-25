package o;

import com.okinc.okimcore.model.biz.GroupMuteInfo;
import com.okinc.okimcore.model.biz.GroupMuteInfoNtfMessage;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34303nYz extends AbstractC34301nYx<GroupMuteInfoNtfMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<GroupMuteInfoNtfMessage> KWHzl() {
        return GroupMuteInfoNtfMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull GroupMuteInfoNtfMessage groupMuteInfoNtfMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(groupMuteInfoNtfMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(context, groupMuteInfoNtfMessage.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/oGY;Lo/nrp;Lcom/okinc/okimcore/model/im/OKInformationNotificationMessage;)V */
    @Override // o.AbstractC34301nYx
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull GroupMuteInfoNtfMessage groupMuteInfoNtfMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(groupMuteInfoNtfMessage, "");
        super.OLrzqt(ogy, c35254nrp, groupMuteInfoNtfMessage);
        nLO nlo = (nLO) ogy.copydefault();
        GroupMuteInfo groupMuteInfoAEQbTJ = groupMuteInfoNtfMessage.AEQbTJ();
        android.widget.TextView textView = nlo.copydefault;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(KWHzl(context, groupMuteInfoAEQbTJ));
    }

    public final java.lang.CharSequence KWHzl(android.content.Context context, GroupMuteInfo groupMuteInfo) {
        if (groupMuteInfo.isMute()) {
            java.lang.String string = context.getString(C35399nuc.LoaderManager.getDefaultCipherSuites);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String string2 = context.getString(C35399nuc.LoaderManager.iqeXgQ);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }
}
