package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYA extends AbstractC34300nYw<OKGroupNotificationMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKGroupNotificationMessage> KWHzl() {
        return OKGroupNotificationMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGroupNotificationMessage oKGroupNotificationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGroupNotificationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "unknown GroupNotificationMessage:" + oKGroupNotificationMessage.getClass().getSimpleName();
    }

    @Override // o.AbstractC34300nYw
    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull OKGroupNotificationMessage oKGroupNotificationMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupNotificationMessage, "");
        super.AEQbTJ(ogy, c35254nrp, oKGroupNotificationMessage);
        ((nLO) ogy.copydefault()).copydefault.setText("unknown GroupNotificationMessage:" + oKGroupNotificationMessage.getClass().getSimpleName());
    }
}
