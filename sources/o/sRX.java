package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.tracking.InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRX {
    public static CoroutineScope copydefault;
    public static final sRX OLrzqt = new sRX();
    public static final int KWHzl = 8;

    private sRX() {
    }

    public final CoroutineScope AEQbTJ() {
        CoroutineScope coroutineScope = copydefault;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        copydefault = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    public final void copydefault(@NotNull java.lang.String str, long j, long j2, long j3, int i, long j4, long j5, long j6) {
        Intrinsics.checkNotNullParameter(str, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_Message_SyncMessage_Success");
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("full_url", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(java.lang.Long.valueOf(j2))), C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(java.lang.Long.valueOf(j3))), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j4))), C56390yDp.OLrzqt("attr_4", C33129mqd.gEmmrt(java.lang.Long.valueOf(j5))), C56390yDp.OLrzqt("attr_5", C33129mqd.gEmmrt(java.lang.Long.valueOf(j6))), C56390yDp.OLrzqt("type", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_Message_SyncMessage_Failed");
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(str2))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void KWHzl(int i, long j, long j2, long j3, long j4, java.lang.Integer num, java.lang.Integer num2) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_OfflineSync_Success");
        kotlin.Pair[] pairArr = new kotlin.Pair[7];
        pairArr[0] = C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
        pairArr[1] = C56390yDp.OLrzqt("isAppDebuggable", C33129mqd.gEmmrt(java.lang.Long.valueOf(j2)));
        pairArr[2] = C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(java.lang.Long.valueOf(j3)));
        pairArr[3] = C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j4)));
        pairArr[4] = C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)));
        pairArr[5] = C56390yDp.OLrzqt("attr_3", num != null ? C33129mqd.gEmmrt(num) : null);
        pairArr[6] = C56390yDp.OLrzqt("attr_4", num2 != null ? C33129mqd.gEmmrt(num2) : null);
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(pairArr));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void OLrzqt(int i, long j) {
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_OfflineSync_Batch_Success");
        eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("IMChat_OfflineSync_Failed");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(str))));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }

    public final void copydefault(@NotNull C44484sRn c44484sRn, @NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        if (sPQ.copydefault(wSSendMessageDetailData.getContentType())) {
            BuildersKt__Builders_commonKt.launch$default(AEQbTJ(), sDN.copydefault.copydefault(), null, new InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1(wSSendMessageDetailData, c44484sRn, null), 2, null);
        }
    }
}
