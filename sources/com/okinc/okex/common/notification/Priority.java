package com.okinc.okex.common.notification;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C45310snQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable(with = C45310snQ.class)
public final class Priority {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    public static final Companion Companion;
    private final int priority;
    public static final Priority PRIORITY_00 = new Priority("PRIORITY_00", 0, -1);
    public static final Priority PRIORITY_0 = new Priority("PRIORITY_0", 1, 0);
    public static final Priority PRIORITY_1 = new Priority("PRIORITY_1", 2, 1);
    public static final Priority PRIORITY_2 = new Priority("PRIORITY_2", 3, 2);
    public static final Priority PRIORITY_3 = new Priority("PRIORITY_3", 4, 3);
    public static final Priority PRIORITY_4 = new Priority("PRIORITY_4", 5, 4);
    public static final Priority UNKNOWN = new Priority("UNKNOWN", 6, 999);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{PRIORITY_00, PRIORITY_0, PRIORITY_1, PRIORITY_2, PRIORITY_3, PRIORITY_4, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Priority> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriority() {
        return this.priority;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.notification.Priority.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Priority> serializer() {
            return C45310snQ.copydefault;
        }
    }

    private Priority(String str, int i, int i2) {
        this.priority = i2;
    }

    static {
        Priority[] priorityArr$values = $values();
        $VALUES = priorityArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(priorityArr$values);
        Companion = new Companion(null);
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }
}
