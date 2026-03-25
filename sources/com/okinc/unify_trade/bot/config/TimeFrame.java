package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TimeFrame {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimeFrame[] $VALUES;
    public static final Application Companion;
    private final int count;
    private final int desc;
    private final String frame;
    private final String mode;
    public static final TimeFrame THREE_M = new TimeFrame("THREE_M", 0, "3m", 3, "minute", C55688xof.Application.onViewAttachedToWindow);
    public static final TimeFrame FIVE_M = new TimeFrame("FIVE_M", 1, "5m", 5, "minute", C55688xof.Application.onViewAttachedToWindow);
    public static final TimeFrame FIFTEEN_M = new TimeFrame("FIFTEEN_M", 2, "15m", 15, "minute", C55688xof.Application.onViewAttachedToWindow);
    public static final TimeFrame THIRTY_M = new TimeFrame("THIRTY_M", 3, "30m", 30, "minute", C55688xof.Application.onViewAttachedToWindow);
    public static final TimeFrame ONE_H = new TimeFrame("ONE_H", 4, "1H", 1, "hour", C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1);
    public static final TimeFrame FOUR_H = new TimeFrame("FOUR_H", 5, "4H", 4, "hour", C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1);
    public static final TimeFrame ONE_D = new TimeFrame("ONE_D", 6, "1D", 1, MTPushConstants.NotificationTime.KEY_DAYS, C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimeFrame[] $values() {
        return new TimeFrame[]{THREE_M, FIVE_M, FIFTEEN_M, THIRTY_M, ONE_H, FOUR_H, ONE_D};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimeFrame> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrame() {
        return this.frame;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private TimeFrame(String str, int i, String str2, @StringRes int i2, String str3, int i3) {
        this.frame = str2;
        this.count = i2;
        this.mode = str3;
        this.desc = i3;
    }

    static {
        TimeFrame[] timeFrameArr$values = $values();
        $VALUES = timeFrameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timeFrameArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.TimeFrame.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String copydefault(@NotNull String str) {
            TimeFrame timeFrame;
            Intrinsics.checkNotNullParameter(str, "");
            TimeFrame[] timeFrameArrValues = TimeFrame.values();
            int length = timeFrameArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    timeFrame = null;
                    break;
                }
                timeFrame = timeFrameArrValues[i];
                if (Intrinsics.EZpvd((Object) timeFrame.getFrame(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (timeFrame == null) {
                timeFrame = TimeFrame.THREE_M;
            }
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(timeFrame.getDesc()), C56423yEv.EZpvd(C56390yDp.OLrzqt(timeFrame.getMode(), Integer.valueOf(timeFrame.getCount()))));
        }
    }

    public static TimeFrame valueOf(String str) {
        return (TimeFrame) Enum.valueOf(TimeFrame.class, str);
    }

    public static TimeFrame[] values() {
        return (TimeFrame[]) $VALUES.clone();
    }
}
