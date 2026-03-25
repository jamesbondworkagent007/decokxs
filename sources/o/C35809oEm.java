package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.Calendar;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35809oEm {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.oEm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @yCM
    public C35809oEm() {
    }

    public final boolean EZpvd(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        calendar.setTimeInMillis(j2);
        return calendar.get(1) == i && calendar.get(6) == i2;
    }

    public final MessageClusterType AEQbTJ(int i, @NotNull OKMessage oKMessage, @NotNull java.util.List<OKMessage> list) {
        boolean z;
        boolean zEZpvd;
        OKMessageContent content;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String targetId = oKMessage.getTargetId();
        long seq = oKMessage.getSeq();
        OKMessage oKMessage2 = (OKMessage) CollectionsKt___CollectionsKt.AkhnZx(list, i - 1);
        boolean z2 = oKMessage2 != null;
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        java.lang.String senderUserId2 = oKMessage2 != null ? oKMessage2.getSenderUserId() : null;
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) senderUserId2, (java.lang.Object) senderUserId);
        long sentTime = oKMessage.getSentTime();
        java.lang.Long lValueOf = oKMessage2 != null ? java.lang.Long.valueOf(oKMessage2.getSentTime()) : null;
        boolean z3 = lValueOf != null && sentTime - lValueOf.longValue() <= 120000;
        if (lValueOf == null) {
            z = z3;
            zEZpvd = false;
        } else {
            z = z3;
            zEZpvd = EZpvd(sentTime, lValueOf.longValue());
        }
        OKMessageContent content2 = oKMessage.getContent();
        boolean zKWHzl = content2 != null ? C44169sFw.KWHzl(content2) : false;
        boolean zOLrzqt = (oKMessage2 == null || (content = oKMessage2.getContent()) == null) ? false : C44170sFx.OLrzqt(content);
        OKMessageContent content3 = oKMessage.getContent();
        boolean zOLrzqt2 = content3 != null ? C44170sFx.OLrzqt(content3) : false;
        int size = list.size();
        boolean z4 = zKWHzl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z5 = zOLrzqt2;
        sb.append("[");
        sb.append(targetId);
        sb.append("][");
        sb.append(i);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(seq);
        sb.append("]: messageListSize=");
        sb.append(size);
        sb.append(", hasPreviousMessage=");
        sb.append(z2);
        sb.append(", isPreviousMessageSameSender=");
        sb.append(zEZpvd2);
        sb.append(", currentMessageSender=");
        sb.append(senderUserId);
        sb.append(", previousMessageSender=");
        sb.append(senderUserId2);
        sb.append(", previousMessageSendTime=");
        sb.append(lValueOf);
        sb.append(", currentMessageSendTime=");
        sb.append(sentTime);
        sb.append(", currentMessageSendTime=");
        sb.append(sentTime);
        sb.append(", isPreviousMessageSentWithinTwoMinutes=");
        boolean z6 = z;
        sb.append(z6);
        sb.append(", isSameDayWithPreviousMessage=");
        sb.append(zEZpvd);
        sb.append(", isPreviousMessageSystemMessage=");
        sb.append(zOLrzqt);
        sb.append(", isCurrentMessageSystemMessage=");
        sb.append(z5);
        pUU.EZpvd("GetMessageClusterType", sb.toString());
        if (!z2) {
            return MessageClusterType.First;
        }
        if (!zEZpvd) {
            return MessageClusterType.First;
        }
        if (!zEZpvd2) {
            return MessageClusterType.First;
        }
        if (!z6) {
            return MessageClusterType.First;
        }
        if (zOLrzqt) {
            return MessageClusterType.First;
        }
        if (z5) {
            return MessageClusterType.First;
        }
        if (z4) {
            return MessageClusterType.RECALLED;
        }
        return MessageClusterType.Middle;
    }
}
