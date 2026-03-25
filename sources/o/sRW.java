package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.tracking.MessagesUseCaseTracking$trackWhenSendMessageSuccess$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRW {
    public static CoroutineScope AEQbTJ;
    public static final sRW KWHzl = new sRW();
    public static final int copydefault = 8;

    private sRW() {
    }

    public final CoroutineScope copydefault() {
        CoroutineScope coroutineScope = AEQbTJ;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        AEQbTJ = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    public final void AEQbTJ(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity, @NotNull java.util.List<InHouseIMMessageEntity> list, long j, long j2, long j3, int i, long j4, int i2) {
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        OKConversation oKConversationOLrzqt = C44169sFw.OLrzqt(inHouseIMConversationEntity);
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_Message_LoadMessage");
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(oKConversationOLrzqt.getConversationType().getTypeName())), C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(oKConversationOLrzqt.getTargetId())), C56390yDp.OLrzqt("isAppDebuggable", C33129mqd.gEmmrt(oKConversationOLrzqt.getConversationTitle())), C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(java.lang.Integer.valueOf(list.size()))), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j4))), C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("attr_3", C33129mqd.gEmmrt(java.lang.Long.valueOf(j2))), C56390yDp.OLrzqt("attr_4", C33129mqd.gEmmrt(java.lang.Long.valueOf(j3))), C56390yDp.OLrzqt("attr_5", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))), C56390yDp.OLrzqt("full_url", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public static /* synthetic */ void trackWhenSendMessageSuccess$default(sRW srw, C44484sRn c44484sRn, java.lang.String str, InHouseIMMessageEntity inHouseIMMessageEntity, java.lang.Long l, C44485sRo c44485sRo, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            c44485sRo = null;
        }
        srw.AEQbTJ(c44484sRn, str, inHouseIMMessageEntity, l, c44485sRo);
    }

    public final void AEQbTJ(@NotNull C44484sRn c44484sRn, @NotNull java.lang.String str, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity, java.lang.Long l, C44485sRo c44485sRo) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (sPQ.copydefault(InHouseIMContentType.Companion.AEQbTJ(java.lang.Integer.valueOf(inHouseIMMessageEntity.getContentType())))) {
            BuildersKt__Builders_commonKt.launch$default(copydefault(), sDN.copydefault.copydefault(), null, new MessagesUseCaseTracking$trackWhenSendMessageSuccess$1(l, c44484sRn, inHouseIMMessageEntity, c44485sRo, str, null), 2, null);
        }
    }

    public final void KWHzl(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        Intrinsics.checkNotNullParameter(th, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("[In-House] Send message fail");
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("totalTime", inHouseIMMessageEntity.getChannelId()), C56390yDp.OLrzqt("path", java.lang.String.valueOf(th.getMessage()))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }
}
