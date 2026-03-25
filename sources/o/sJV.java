package o;

import com.okinc.okimcore.model.biz.AbsOKInformationNotificationMessage;
import com.okinc.okimcore.model.im.OKInformationNotificationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.InfoNtfExtraData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJV {
    public static final sJV OLrzqt = new sJV();
    public static final java.util.HashMap<java.lang.Integer, java.lang.Class<? extends AbsOKInformationNotificationMessage<?>>> AEQbTJ = new java.util.HashMap<>();
    public static final int EZpvd = 8;

    private sJV() {
    }

    public final void KWHzl(int i, @NotNull java.lang.Class<? extends AbsOKInformationNotificationMessage<?>> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        AEQbTJ.put(java.lang.Integer.valueOf(i), cls);
    }

    public final void OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKInformationNotificationMessage) {
            OKInformationNotificationMessage oKInformationNotificationMessage = (OKInformationNotificationMessage) content;
            InfoNtfExtraData infoNtfExtraDataOLrzqt = C44463sQt.OLrzqt(oKInformationNotificationMessage.getExtra());
            AbsOKInformationNotificationMessage absOKInformationNotificationMessage = null;
            java.lang.Class<? extends AbsOKInformationNotificationMessage<?>> cls = infoNtfExtraDataOLrzqt != null ? AEQbTJ.get(java.lang.Integer.valueOf(infoNtfExtraDataOLrzqt.getBizType())) : null;
            if (cls != null) {
                try {
                    absOKInformationNotificationMessage = (AbsOKInformationNotificationMessage) C44170sFx.OLrzqt((OKInformationNotificationMessage) content, cls);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                if (absOKInformationNotificationMessage != null) {
                    oKMessage.setContent(absOKInformationNotificationMessage);
                    return;
                }
                return;
            }
            java.lang.Integer numValueOf = infoNtfExtraDataOLrzqt != null ? java.lang.Integer.valueOf(infoNtfExtraDataOLrzqt.getBizType()) : null;
            pUU.copydefault("InfoNtfMessage", "unknown infoNtfMessage's bizType:" + numValueOf + "  extra:" + oKInformationNotificationMessage.getExtra());
        }
    }
}
