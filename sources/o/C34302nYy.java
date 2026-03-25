package o;

import com.okinc.okimcore.model.im.OKInformationNotificationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34302nYy extends AbstractC34301nYx<OKInformationNotificationMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKInformationNotificationMessage> KWHzl() {
        return OKInformationNotificationMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKInformationNotificationMessage oKInformationNotificationMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKInformationNotificationMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return oKInformationNotificationMessage.getMessage();
    }

    @Override // o.AbstractC34301nYx
    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull OKInformationNotificationMessage oKInformationNotificationMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKInformationNotificationMessage, "");
        super.OLrzqt(ogy, c35254nrp, oKInformationNotificationMessage);
        ((nLO) ogy.copydefault()).copydefault.setText(oKInformationNotificationMessage.getMessage());
    }
}
