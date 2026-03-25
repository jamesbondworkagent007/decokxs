package o;

import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41310qoR {

    /* JADX INFO: renamed from: o.qoR$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CountDownType.SHOW_EXPECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final boolean AEQbTJ(@NotNull final C40492qXw c40492qXw, CountDownInfo countDownInfo, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c40492qXw, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CountDownType showType = null;
        if (countDownInfo != null) {
            CountDownInfo countDownInfo2 = (!countDownInfo.countDownTimeExpire() || countDownInfo.getShowType() == CountDownType.SHOW_EXPECT) ? countDownInfo : null;
            if (countDownInfo2 != null) {
                showType = countDownInfo2.getShowType();
            }
        }
        int i = showType == null ? -1 : Activity.AEQbTJ[showType.ordinal()];
        if (i == 1) {
            c40492qXw.setVisibility(0);
            c40492qXw.setDeadlineTime(showType, C33070mpX.AYXKKw(C27618jyb.AEQbTJ(countDownInfo)), C33129mqd.valueOf(countDownInfo.getOnlineTime()), new Function1() { // from class: o.qoP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C41310qoR.EZpvd(str, str2, c40492qXw, ((java.lang.Long) obj).longValue());
                }
            });
        } else if (i != 2) {
            java.lang.String strAEQbTJ = ((InterfaceC44589sZl) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC44589sZl.class)).DrNnAm().AEQbTJ(str, str2);
            if (yDY.gEmmrt("CALL_AUCTION", "PRE_QUOTE").contains(strAEQbTJ)) {
                c40492qXw.setVisibility(0);
                C40492qXw.setDeadlineTime$default(c40492qXw, CountDownType.SHOW_EXPECT, C55527xld.OLrzqt(strAEQbTJ), 0L, null, 8, null);
            } else {
                c40492qXw.setVisibility(8);
                C40492qXw.setDeadlineTime$default(c40492qXw, showType, null, 0L, null, 8, null);
            }
        } else {
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c40492qXw, showType, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
        }
        return c40492qXw.getVisibility() == 0;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, C40492qXw c40492qXw, long j) {
        RxBus.KWHzl("WATCH_COUNT_DOWN_EVENT");
        java.lang.String strAEQbTJ = ((InterfaceC44589sZl) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC44589sZl.class)).DrNnAm().AEQbTJ(str, str2);
        if (yDY.gEmmrt("CALL_AUCTION", "PRE_QUOTE").contains(strAEQbTJ)) {
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c40492qXw, CountDownType.SHOW_EXPECT, C55527xld.OLrzqt(strAEQbTJ), 0L, null, 8, null);
        }
        return Unit.INSTANCE;
    }
}
