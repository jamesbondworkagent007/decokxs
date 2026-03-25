package com.okinc.unify_trade.bot.dcd.config;

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
public final class DcdOptionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DcdOptionType[] $VALUES;
    public static final TaskDescription Companion;
    private final int desc;
    private final String mode;
    public static final DcdOptionType PUT = new DcdOptionType("PUT", 0, "PUT", C55688xof.Application.DQzvGN);
    public static final DcdOptionType CALL = new DcdOptionType("CALL", 1, "CALL", C55688xof.Application.DQYQgr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DcdOptionType[] $values() {
        return new DcdOptionType[]{PUT, CALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DcdOptionType> getEntries() {
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

    private DcdOptionType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        DcdOptionType[] dcdOptionTypeArr$values = $values();
        $VALUES = dcdOptionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dcdOptionTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.dcd.config.DcdOptionType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String AEQbTJ(String str) {
            DcdOptionType dcdOptionType;
            String strAYXKKw;
            DcdOptionType[] dcdOptionTypeArrValues = DcdOptionType.values();
            int length = dcdOptionTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dcdOptionType = null;
                    break;
                }
                dcdOptionType = dcdOptionTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) dcdOptionType.getMode(), (Object) str)) {
                    break;
                }
                i++;
            }
            return (dcdOptionType == null || (strAYXKKw = C33070mpX.AYXKKw(dcdOptionType.getDesc())) == null) ? "" : strAYXKKw;
        }
    }

    public static DcdOptionType valueOf(String str) {
        return (DcdOptionType) Enum.valueOf(DcdOptionType.class, str);
    }

    public static DcdOptionType[] values() {
        return (DcdOptionType[]) $VALUES.clone();
    }
}
