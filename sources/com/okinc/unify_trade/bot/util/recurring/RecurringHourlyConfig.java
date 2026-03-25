package com.okinc.unify_trade.bot.util.recurring;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.xMR;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class RecurringHourlyConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecurringHourlyConfig[] $VALUES;
    public static final ActionBar Companion;
    private final String frequency;
    private final int index;
    public static final RecurringHourlyConfig SINGLE = new RecurringHourlyConfig("SINGLE", 0, 0, "1");
    public static final RecurringHourlyConfig FOUR = new RecurringHourlyConfig("FOUR", 1, 1, "4");
    public static final RecurringHourlyConfig EIGHT = new RecurringHourlyConfig("EIGHT", 2, 2, "8");
    public static final RecurringHourlyConfig TWELVE = new RecurringHourlyConfig("TWELVE", 3, 3, "12");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecurringHourlyConfig[] $values() {
        return new RecurringHourlyConfig[]{SINGLE, FOUR, EIGHT, TWELVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecurringHourlyConfig> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    private RecurringHourlyConfig(String str, int i, int i2, String str2) {
        this.index = i2;
        this.frequency = str2;
    }

    static {
        RecurringHourlyConfig[] recurringHourlyConfigArr$values = $values();
        $VALUES = recurringHourlyConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recurringHourlyConfigArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String AEQbTJ(int i) {
            RecurringHourlyConfig recurringHourlyConfig;
            String frequency;
            RecurringHourlyConfig[] recurringHourlyConfigArrValues = RecurringHourlyConfig.values();
            int length = recurringHourlyConfigArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    recurringHourlyConfig = null;
                    break;
                }
                recurringHourlyConfig = recurringHourlyConfigArrValues[i2];
                if (C33129mqd.OLrzqt(Integer.valueOf(recurringHourlyConfig.getIndex()), Integer.valueOf(i))) {
                    break;
                }
                i2++;
            }
            return (recurringHourlyConfig == null || (frequency = recurringHourlyConfig.getFrequency()) == null) ? "1" : frequency;
        }

        public final int OLrzqt(String str) {
            RecurringHourlyConfig recurringHourlyConfig;
            RecurringHourlyConfig[] recurringHourlyConfigArrValues = RecurringHourlyConfig.values();
            int length = recurringHourlyConfigArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    recurringHourlyConfig = null;
                    break;
                }
                recurringHourlyConfig = recurringHourlyConfigArrValues[i];
                if (Intrinsics.EZpvd((Object) recurringHourlyConfig.getFrequency(), (Object) str)) {
                    break;
                }
                i++;
            }
            if (recurringHourlyConfig != null) {
                return recurringHourlyConfig.getIndex();
            }
            return 0;
        }

        public final String EZpvd(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 49) {
                    return iHashCode != 52 ? C33069mpW.copydefault(C55688xof.Application.create, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(str)))) : C33069mpW.copydefault(C55688xof.Application.create, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(str))));
                }
                if (str.equals("1")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow11);
                }
            }
            return C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow11);
        }
    }

    public static RecurringHourlyConfig valueOf(String str) {
        return (RecurringHourlyConfig) Enum.valueOf(RecurringHourlyConfig.class, str);
    }

    public static RecurringHourlyConfig[] values() {
        return (RecurringHourlyConfig[]) $VALUES.clone();
    }
}
