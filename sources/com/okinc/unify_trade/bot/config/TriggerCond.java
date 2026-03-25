package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TriggerCond {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TriggerCond[] $VALUES;
    public static final Activity Companion;
    private final int desc;
    private final String mode;
    public static final TriggerCond BELOW = new TriggerCond("BELOW", 0, "below", C55688xof.Application.isPlayable);
    public static final TriggerCond ABOVE = new TriggerCond("ABOVE", 1, "above", C55688xof.Application.writeToParcel);
    public static final TriggerCond CROSS = new TriggerCond("CROSS", 2, "cross", C55688xof.Application.MediaBrowserCompatMediaItem1);
    public static final TriggerCond CROSS_DOWN = new TriggerCond("CROSS_DOWN", 3, "cross_down", C55688xof.Application.MediaBrowserCompatSearchResultReceiver);
    public static final TriggerCond CROSS_UP = new TriggerCond("CROSS_UP", 4, "cross_up", C55688xof.Application.onSearchResult);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TriggerCond[] $values() {
        return new TriggerCond[]{BELOW, ABOVE, CROSS, CROSS_DOWN, CROSS_UP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TriggerCond> getEntries() {
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

    private TriggerCond(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        TriggerCond[] triggerCondArr$values = $values();
        $VALUES = triggerCondArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(triggerCondArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.TriggerCond.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TriggerCond AEQbTJ(String str) {
            for (TriggerCond triggerCond : TriggerCond.values()) {
                if (Intrinsics.EZpvd((Object) triggerCond.getMode(), (Object) str)) {
                    return triggerCond;
                }
            }
            return null;
        }

        public final String KWHzl(String str) {
            TriggerCond triggerCond;
            String strAYXKKw;
            TriggerCond[] triggerCondArrValues = TriggerCond.values();
            int length = triggerCondArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    triggerCond = null;
                    break;
                }
                triggerCond = triggerCondArrValues[i];
                if (Intrinsics.EZpvd((Object) triggerCond.getMode(), (Object) str)) {
                    break;
                }
                i++;
            }
            return (triggerCond == null || (strAYXKKw = C33070mpX.AYXKKw(triggerCond.getDesc())) == null) ? "" : strAYXKKw;
        }
    }

    public static TriggerCond valueOf(String str) {
        return (TriggerCond) Enum.valueOf(TriggerCond.class, str);
    }

    public static TriggerCond[] values() {
        return (TriggerCond[]) $VALUES.clone();
    }
}
