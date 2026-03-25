package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50539vSd {

    /* JADX INFO: renamed from: o.vSd$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final C50546vSk copydefault(java.lang.String str, InterfaceC56538yJb<java.lang.String> interfaceC56538yJb) {
        return new C50546vSk(C33129mqd.copydefault(str, interfaceC56538yJb.getStart()), C33129mqd.valueOf(str, interfaceC56538yJb.getEndInclusive()));
    }

    public static final kotlin.Pair<C50546vSk, C50546vSk> KWHzl(@NotNull EarnType earnType, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2) {
        Intrinsics.checkNotNullParameter(earnType, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
        int i = TaskDescription.OLrzqt[earnType.ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC56538yJb.getStart()) ? null : copydefault(C33129mqd.divS$default(interfaceC56538yJb.getStart(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null), interfaceC56538yJb2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC56538yJb.getEndInclusive()) ? null : copydefault(C33129mqd.divS$default(interfaceC56538yJb.getEndInclusive(), java.lang.Double.valueOf(100.0d), null, null, null, 14, null), interfaceC56538yJb2));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC56538yJb.getStart()) ? null : copydefault((java.lang.String) interfaceC56538yJb.getStart(), interfaceC56538yJb2), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC56538yJb.getEndInclusive()) ? null : copydefault((java.lang.String) interfaceC56538yJb.getEndInclusive(), interfaceC56538yJb2));
    }

    public static final InterfaceC56538yJb<java.lang.String> copydefault(@NotNull EarnType earnType, @NotNull SmartEarnConfig smartEarnConfig, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb) {
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbEZpvd;
        Intrinsics.checkNotNullParameter(earnType, "");
        Intrinsics.checkNotNullParameter(smartEarnConfig, "");
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        java.lang.String str = (java.lang.String) interfaceC56538yJb.getStart();
        java.lang.String str2 = (java.lang.String) interfaceC56538yJb.getEndInclusive();
        boolean z = false;
        boolean z2 = C33129mqd.copydefault(str2, C33129mqd.mulS$default(str, smartEarnConfig.getDistanceLimit(), null, null, null, 14, null)) && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) smartEarnConfig.getWideDistanceLimit()) || C33129mqd.gEmmrt(str2, C33129mqd.mulS$default(str, smartEarnConfig.getWideDistanceLimit(), null, null, null, 14, null)));
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) smartEarnConfig.getWideDistanceLimit())) && C33129mqd.copydefault(str2, C33129mqd.mulS$default(str, smartEarnConfig.getWideDistanceLimit(), null, null, null, 14, null))) {
            z = true;
        }
        if (z2) {
            int i = TaskDescription.OLrzqt[earnType.ordinal()];
            if (i == 1) {
                interfaceC56538yJbEZpvd = C56547yJk.EZpvd(smartEarnConfig.getMinRangeLimit(), smartEarnConfig.getMaxRangeLimit());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String strSubS$default = C33129mqd.subS$default(interfaceC56538yJb.getEndInclusive(), interfaceC56538yJb.getStart(), null, null, null, 14, null);
                interfaceC56538yJbEZpvd = C56547yJk.EZpvd(C33129mqd.mulS$default(smartEarnConfig.getMinRangeLimit(), strSubS$default, null, null, null, 14, null), C33129mqd.mulS$default(smartEarnConfig.getMaxRangeLimit(), strSubS$default, null, null, null, 14, null));
            }
        } else if (z) {
            int i2 = TaskDescription.OLrzqt[earnType.ordinal()];
            if (i2 == 1) {
                interfaceC56538yJbEZpvd = C56547yJk.EZpvd(smartEarnConfig.getWideMinRangeLimit(), smartEarnConfig.getWideMaxRangeLimit());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String strSubS$default2 = C33129mqd.subS$default(interfaceC56538yJb.getEndInclusive(), interfaceC56538yJb.getStart(), null, null, null, 14, null);
                interfaceC56538yJbEZpvd = C56547yJk.EZpvd(C33129mqd.mulS$default(smartEarnConfig.getWideMinRangeLimit(), strSubS$default2, null, null, null, 14, null), C33129mqd.mulS$default(smartEarnConfig.getWideMaxRangeLimit(), strSubS$default2, null, null, null, 14, null));
            }
        } else {
            interfaceC56538yJbEZpvd = C56547yJk.EZpvd(MultiTransferSignData.DEFAULT_INTERVAL, MultiTransferSignData.DEFAULT_INTERVAL);
        }
        pUU.KWHzl("SmartEarn", " EarnType: " + earnType + ", gridRange: " + interfaceC56538yJb + ", isNarrowGrid: " + z2 + ", isWideGrid: " + z + ", wideDistanceLimit: " + smartEarnConfig.getWideDistanceLimit() + ", Result range: " + interfaceC56538yJbEZpvd);
        return interfaceC56538yJbEZpvd;
    }
}
