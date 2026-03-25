package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class IceBergAggressiveType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IceBergAggressiveType[] $VALUES;
    public static final TaskDescription Companion;
    private final int desc;
    private final String mode;
    public static final IceBergAggressiveType RADICAL = new IceBergAggressiveType("RADICAL", 0, "radical", C55688xof.Application.getButton);
    public static final IceBergAggressiveType MID = new IceBergAggressiveType("MID", 1, "mid", C55688xof.Application.installContent);
    public static final IceBergAggressiveType CONSERVATIVE = new IceBergAggressiveType("CONSERVATIVE", 2, "conservative", C55688xof.Application.getListView);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IceBergAggressiveType[] $values() {
        return new IceBergAggressiveType[]{RADICAL, MID, CONSERVATIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IceBergAggressiveType> getEntries() {
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

    private IceBergAggressiveType(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        IceBergAggressiveType[] iceBergAggressiveTypeArr$values = $values();
        $VALUES = iceBergAggressiveTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iceBergAggressiveTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.IceBergAggressiveType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static IceBergAggressiveType valueOf(String str) {
        return (IceBergAggressiveType) Enum.valueOf(IceBergAggressiveType.class, str);
    }

    public static IceBergAggressiveType[] values() {
        return (IceBergAggressiveType[]) $VALUES.clone();
    }
}
