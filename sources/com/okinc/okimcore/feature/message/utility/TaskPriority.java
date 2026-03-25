package com.okinc.okimcore.feature.message.utility;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TaskPriority {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TaskPriority[] $VALUES;
    private final int value;
    public static final TaskPriority HIGH = new TaskPriority(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0, 0);
    public static final TaskPriority MEDIUM = new TaskPriority(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1, 1);
    public static final TaskPriority LOW = new TaskPriority(VerifyDAppDomainUrlResponse.LEVEL_LOW, 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TaskPriority[] $values() {
        return new TaskPriority[]{HIGH, MEDIUM, LOW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TaskPriority> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TaskPriority(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TaskPriority[] taskPriorityArr$values = $values();
        $VALUES = taskPriorityArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(taskPriorityArr$values);
    }

    public static TaskPriority valueOf(String str) {
        return (TaskPriority) Enum.valueOf(TaskPriority.class, str);
    }

    public static TaskPriority[] values() {
        return (TaskPriority[]) $VALUES.clone();
    }
}
