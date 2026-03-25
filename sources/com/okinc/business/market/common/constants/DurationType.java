package com.okinc.business.market.common.constants;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerialName;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DurationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DurationType[] $VALUES;
    public static final TaskDescription Companion;
    private final int titleResId;
    private final String value;

    @SerialName("1")
    public static final DurationType ONE_DAY = new DurationType("ONE_DAY", 0, "1", C23274hvD.Fragment.DuQ);

    @SerialName("2")
    public static final DurationType THREE_DAYS = new DurationType("THREE_DAYS", 1, "2", C23274hvD.Fragment.sSi);

    @SerialName("3")
    public static final DurationType SEVEN_DAYS = new DurationType("SEVEN_DAYS", 2, "3", C23274hvD.Fragment.ZGRCNj);

    @SerialName("4")
    public static final DurationType ONE_MONTH = new DurationType("ONE_MONTH", 3, "4", C23274hvD.Fragment.ZGRCNj);

    @SerialName("5")
    public static final DurationType THREE_MONTH = new DurationType("THREE_MONTH", 4, "5", C23274hvD.Fragment.ZGRCNj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DurationType[] $values() {
        return new DurationType[]{ONE_DAY, THREE_DAYS, SEVEN_DAYS, ONE_MONTH, THREE_MONTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DurationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private DurationType(String str, @StringRes int i, String str2, int i2) {
        this.value = str2;
        this.titleResId = i2;
    }

    static {
        DurationType[] durationTypeArr$values = $values();
        $VALUES = durationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(durationTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.DurationType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static DurationType valueOf(String str) {
        return (DurationType) Enum.valueOf(DurationType.class, str);
    }

    public static DurationType[] values() {
        return (DurationType[]) $VALUES.clone();
    }
}
