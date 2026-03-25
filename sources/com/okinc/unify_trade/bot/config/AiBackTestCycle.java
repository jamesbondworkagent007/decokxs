package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AiBackTestCycle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AiBackTestCycle[] $VALUES;
    public static final Application Companion;
    private final int desc;
    private final String mode;
    private final String number;
    private final int showMode;
    public static final AiBackTestCycle DUR_7 = new AiBackTestCycle("DUR_7", 0, "7D", C55688xof.Application.addSubscription, C55688xof.Application.sendRequest, "7");
    public static final AiBackTestCycle DUR_30 = new AiBackTestCycle("DUR_30", 1, "30D", C55688xof.Application.getMediaItem, C55688xof.Application.registerCallbackMessenger, "30");
    public static final AiBackTestCycle DUR_180 = new AiBackTestCycle("DUR_180", 2, "180D", C55688xof.Application.newArray, C55688xof.Application.MediaBrowserCompatServiceBinderWrapper, "180");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AiBackTestCycle[] $values() {
        return new AiBackTestCycle[]{DUR_7, DUR_30, DUR_180};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AiBackTestCycle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNumber() {
        return this.number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private AiBackTestCycle(String str, @StringRes int i, @StringRes String str2, int i2, int i3, String str3) {
        this.mode = str2;
        this.showMode = i2;
        this.desc = i3;
        this.number = str3;
    }

    static {
        AiBackTestCycle[] aiBackTestCycleArr$values = $values();
        $VALUES = aiBackTestCycleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aiBackTestCycleArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.AiBackTestCycle.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static AiBackTestCycle valueOf(String str) {
        return (AiBackTestCycle) Enum.valueOf(AiBackTestCycle.class, str);
    }

    public static AiBackTestCycle[] values() {
        return (AiBackTestCycle[]) $VALUES.clone();
    }
}
