package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.Calendar;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nDD {
    public static final nDD OLrzqt = new nDD();

    private nDD() {
    }

    public final java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, OKMessage oKMessage, @NotNull OKMessage oKMessage2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMessage2, "");
        if (OLrzqt(oKMessage, oKMessage2)) {
            return copydefault(context, AEQbTJ(oKMessage2));
        }
        return null;
    }

    public final boolean OLrzqt(OKMessage oKMessage, @NotNull OKMessage oKMessage2) {
        Intrinsics.checkNotNullParameter(oKMessage2, "");
        if (oKMessage != null) {
            if (EZpvd(AEQbTJ(oKMessage), AEQbTJ(oKMessage2))) {
                return false;
            }
        }
        return true;
    }

    public final long AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return oKMessage.getSentTime();
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.System.currentTimeMillis();
        Date date = new Date(j);
        if (android.text.format.DateUtils.isToday(j)) {
            return pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
        if (KWHzl(j)) {
            java.lang.String string = context.getResources().getString(C35399nuc.LoaderManager.OYuSWK);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string + " " + pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
        if (EZpvd(j)) {
            return android.text.format.DateUtils.formatDateTime(context, j, 524290) + " " + pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
        if (OLrzqt(j)) {
            return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.DcMfJK, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("date", pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_STANDARD_MD, null, null, 6, null)), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null))));
        }
        return C33069mpW.KWHzl(context, C35399nuc.LoaderManager.DcMfJK, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("date", pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null)), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null))));
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        Date date = new Date(j);
        if (android.text.format.DateUtils.isToday(j)) {
            java.lang.String string = context.getResources().getString(C35399nuc.LoaderManager.DuQ);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (KWHzl(j)) {
            java.lang.String string2 = context.getResources().getString(C35399nuc.LoaderManager.OYuSWK);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        if (!EZpvd(j)) {
            return OLrzqt(j) ? pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null) : pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        }
        java.lang.String dateTime = android.text.format.DateUtils.formatDateTime(context, j, 524290);
        Intrinsics.checkNotNullExpressionValue(dateTime, "");
        return dateTime;
    }

    public final boolean KWHzl(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, -1);
        return i == calendar2.get(1) && i2 == calendar2.get(2) && i3 == calendar2.get(5);
    }

    public final boolean EZpvd(long j) {
        android.text.format.Time time = new android.text.format.Time();
        time.set(j);
        int weekNumber = time.getWeekNumber();
        time.set(java.lang.System.currentTimeMillis());
        return weekNumber == time.getWeekNumber();
    }

    public final boolean OLrzqt(long j) {
        android.text.format.Time time = new android.text.format.Time();
        time.set(j);
        int i = time.year;
        time.set(java.lang.System.currentTimeMillis());
        return i == time.year;
    }

    public final java.lang.String copydefault(long j) {
        long j2 = 1000;
        long j3 = (j / j2) + ((long) (j % j2 > 0 ? 1 : 0));
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        return j5 + ":" + (j6 < 10 ? "0" : "") + j6;
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.System.currentTimeMillis();
        Date date = new Date(j);
        if (android.text.format.DateUtils.isToday(j)) {
            return pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
        if (KWHzl(j)) {
            java.lang.String string = context.getResources().getString(C35399nuc.LoaderManager.OYuSWK);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return java.lang.String.valueOf(string);
        }
        if (!EZpvd(j)) {
            return OLrzqt(j) ? pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null) : pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        }
        java.lang.String dateTime = android.text.format.DateUtils.formatDateTime(context, j, 524290);
        Intrinsics.checkNotNullExpressionValue(dateTime, "");
        return dateTime;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String dateTime = android.text.format.DateUtils.formatDateTime(context, j, 524417);
        Intrinsics.checkNotNullExpressionValue(dateTime, "");
        return dateTime;
    }

    public final boolean EZpvd(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        calendar.setTimeInMillis(j2);
        return calendar.get(1) == i && calendar.get(6) == i2;
    }

    public final boolean EZpvd(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            return C44157sFk.KWHzl(senderUserId);
        }
        return false;
    }

    public final java.lang.Long AEQbTJ(@NotNull OKConversation oKConversation) {
        java.lang.Object startMsgSeq;
        Intrinsics.checkNotNullParameter(oKConversation, "");
        if (C33129mqd.valueOf(oKConversation.getStartMsgSeq()) == 0) {
            startMsgSeq = 1;
        } else {
            startMsgSeq = oKConversation.getStartMsgSeq();
        }
        if (startMsgSeq != null) {
            return java.lang.Long.valueOf(C33129mqd.valueOf(startMsgSeq));
        }
        return null;
    }

    public final java.lang.Long EZpvd(@NotNull OKConversation oKConversation, @NotNull java.util.List<OKMessage> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String lastReadMsgSeq = oKConversation.getLastReadMsgSeq();
        java.lang.Long lValueOf = lastReadMsgSeq != null ? java.lang.Long.valueOf(C33129mqd.valueOf(lastReadMsgSeq)) : null;
        int unreadMessageCount = oKConversation.getUnreadMessageCount();
        java.lang.Long lAEQbTJ = AEQbTJ(oKConversation);
        OKMessage oKMessageEZpvd = EZpvd(list);
        java.lang.Long lValueOf2 = oKMessageEZpvd != null ? java.lang.Long.valueOf(oKMessageEZpvd.getSeq()) : null;
        if (unreadMessageCount == 0 || lValueOf == null || lValueOf2 == null) {
            return null;
        }
        if (Intrinsics.EZpvd(lAEQbTJ, lValueOf2)) {
            return lAEQbTJ;
        }
        if (lValueOf.longValue() < lValueOf2.longValue()) {
            return null;
        }
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OKMessage oKMessage = (OKMessage) next;
            if (oKMessage.getSeq() > C33129mqd.valueOf(lValueOf) && !Intrinsics.EZpvd((java.lang.Object) oKMessage.getSenderUserId(), (java.lang.Object) strKWHzl)) {
                break;
            }
        }
        OKMessage oKMessage2 = (OKMessage) next;
        if (oKMessage2 != null) {
            return java.lang.Long.valueOf(oKMessage2.getSeq());
        }
        return null;
    }

    public final java.lang.Long KWHzl(@NotNull java.util.List<OKMessage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OKMessage oKMessage = (OKMessage) CollectionsKt___CollectionsKt.wlaJM(list);
        if (oKMessage == null || !OLrzqt.EZpvd(oKMessage)) {
            return null;
        }
        return java.lang.Long.valueOf(oKMessage.getSeq());
    }

    public final OKMessage EZpvd(@NotNull java.util.List<OKMessage> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OKMessage oKMessage = (OKMessage) next;
            if (oKMessage.getSeq() > 0 && oKMessage.getSentStatus() != OKMessage.SentStatus.FAILED) {
                break;
            }
        }
        return (OKMessage) next;
    }

    public final OKMessage copydefault(@NotNull java.util.List<OKMessage> list) {
        OKMessage oKMessagePrevious;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ListIterator<OKMessage> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                oKMessagePrevious = null;
                break;
            }
            oKMessagePrevious = listIterator.previous();
            OKMessage oKMessage = oKMessagePrevious;
            if (oKMessage.getSeq() > 0 && oKMessage.getSentStatus() != OKMessage.SentStatus.FAILED) {
                break;
            }
        }
        return oKMessagePrevious;
    }

    public final boolean KWHzl(@NotNull OKMessage oKMessage, @NotNull java.util.List<C35254nrp> list) {
        java.lang.String clientMessageId;
        C35254nrp c35254nrpPrevious;
        OKMessage oKMessageOLrzqt;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ListIterator<C35254nrp> listIterator = list.listIterator(list.size());
        while (true) {
            clientMessageId = null;
            if (!listIterator.hasPrevious()) {
                c35254nrpPrevious = null;
                break;
            }
            c35254nrpPrevious = listIterator.previous();
            if (c35254nrpPrevious.OLrzqt().getSentStatus() != OKMessage.SentStatus.FAILED) {
                break;
            }
        }
        C35254nrp c35254nrp = c35254nrpPrevious;
        java.lang.String clientMessageId2 = oKMessage.getClientMessageId();
        if (c35254nrp != null && (oKMessageOLrzqt = c35254nrp.OLrzqt()) != null) {
            clientMessageId = oKMessageOLrzqt.getClientMessageId();
        }
        return Intrinsics.EZpvd((java.lang.Object) clientMessageId2, (java.lang.Object) clientMessageId);
    }
}
