package o;

import com.okinc.im.imui.group.messages.recallnotification.RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nYY {
    public static final nYY KWHzl = new nYY();

    private nYY() {
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, @NotNull OKMessage oKMessage) {
        InterfaceC35180nqU interfaceC35180nqU;
        java.lang.String strKWHzl;
        java.lang.String strCopydefault;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if ((content instanceof OKRecallNotificationMessage ? (OKRecallNotificationMessage) content : null) == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return null;
        }
        interfaceC35180nqU.AEQbTJ().copydefault();
        sKH skhCopydefault = interfaceC35180nqU.copydefault();
        java.lang.Boolean boolKWHzl = C44169sFw.KWHzl(oKMessage);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolKWHzl, bool)) {
            strKWHzl = context.getString(C35399nuc.LoaderManager.zCTncp);
        } else if (Intrinsics.EZpvd(C44169sFw.EZpvd(oKMessage), bool)) {
            strKWHzl = context.getString(C35399nuc.LoaderManager.ZNPcth);
        } else {
            C44461sQr c44461sQr = (C44461sQr) BuildersKt.runBlocking(Dispatchers.getIO(), new RecallNotificationDisplayTextHelper$getDisplayText$1$contactInfo$1(skhCopydefault, oKMessage, null));
            if (c44461sQr != null && (strCopydefault = C37683oyU.copydefault(c44461sQr)) != null) {
                str = strCopydefault;
            }
            strKWHzl = C33069mpW.KWHzl(context, C35399nuc.LoaderManager.onStatusChanged, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str)));
        }
        return strKWHzl;
    }
}
