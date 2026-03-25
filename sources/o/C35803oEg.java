package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35803oEg {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.oEg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @yCM
    public C35803oEg() {
    }

    public final boolean AEQbTJ(int i, @NotNull OKMessage oKMessage, @NotNull java.util.List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(list, "");
        OKMessage oKMessage2 = (OKMessage) CollectionsKt___CollectionsKt.AkhnZx(list, i - 1);
        java.lang.String targetId = oKMessage.getTargetId();
        long seq = oKMessage.getSeq();
        pUU.EZpvd("GetIsShowTimeInterval", "[" + targetId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + seq + "] currentMessageSentTime=" + oKMessage.getSentTime());
        pUU.EZpvd("GetIsShowTimeInterval", "[" + targetId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + seq + "] previousMessageSentTime=" + (oKMessage2 != null ? java.lang.Long.valueOf(oKMessage2.getSentTime()) : null));
        boolean zOLrzqt = nDD.OLrzqt.OLrzqt(oKMessage2, oKMessage);
        pUU.EZpvd("GetIsShowTimeInterval", "[" + targetId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + seq + "] isFirstMessageOfToday=" + zOLrzqt);
        return zOLrzqt;
    }
}
