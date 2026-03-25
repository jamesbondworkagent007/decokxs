package o;

import androidx.collection.ArrayMapKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28924kju {
    public static final C28924kju OLrzqt = new C28924kju();

    private C28924kju() {
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
        if (fieldNames == null) {
            return "--";
        }
        long jLongValue = j - fieldNames.longValue();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(jLongValue);
        long minutes = timeUnit.toMinutes(jLongValue);
        long hours = timeUnit.toHours(jLongValue);
        long days = timeUnit.toDays(jLongValue);
        long j2 = 60;
        long j3 = seconds / j2;
        if (seconds % j2 > 0) {
            j3++;
        }
        long j4 = minutes / j2;
        if (minutes % j2 > 0) {
            j4++;
        }
        if (jLongValue % java.util.concurrent.TimeUnit.DAYS.toMillis(1L) > 0) {
            days++;
        }
        if (seconds <= 60) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageServiceStubProxy), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", 1)));
        }
        if (minutes < 60) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageServiceStubProxy), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.Long.valueOf(j3))));
        }
        if (hours < 24) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageServiceStub), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.Long.valueOf(j4))));
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageService), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.Long.valueOf(days))));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
        if (fieldNames == null) {
            return "--";
        }
        long jLongValue = j - fieldNames.longValue();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(jLongValue);
        long minutes = timeUnit.toMinutes(jLongValue);
        long hours = timeUnit.toHours(jLongValue);
        long days = timeUnit.toDays(jLongValue);
        long j2 = 30;
        long j3 = days / j2;
        long j4 = 12;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        long j7 = 60;
        long j8 = seconds / j7;
        if (seconds % j7 > 0) {
            j8++;
        }
        long j9 = minutes / j7;
        if (minutes % j7 > 0) {
            j9++;
        }
        long j10 = 24;
        long j11 = hours / j10;
        if (hours % j10 > 0) {
            j11++;
        }
        long j12 = days % j2 > 0 ? j3 + 1 : j3;
        if (seconds < 60) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.areNotificationsEnabled), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(seconds))));
        }
        if (minutes < 60) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageServiceStubProxy), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j8))));
        }
        if (hours < 24) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageServiceStub), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j9))));
        }
        if (days < 30) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.IPostMessageService), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j11))));
        }
        if (j3 <= 12) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.onExtraCallback), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j12))));
        }
        if (j6 == 0) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityCallbackDefault), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j5))));
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityCallbackDefault), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", java.lang.String.valueOf(j5)), C56390yDp.OLrzqt("value2", java.lang.String.valueOf(j6))));
    }
}
