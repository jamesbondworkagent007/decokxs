package com.okinc.business.dex.trade.copytrading.home.data;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class StrategyStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyStatus[] $VALUES;
    public static final TaskDescription Companion;
    private final boolean isTerminalState;
    private final int status;
    public static final StrategyStatus Pause = new StrategyStatus("Pause", 0, 0, false);
    public static final StrategyStatus Active = new StrategyStatus("Active", 1, 1, false);
    public static final StrategyStatus Delete = new StrategyStatus("Delete", 2, 2, true);
    public static final StrategyStatus Done = new StrategyStatus("Done", 3, 3, true);
    public static final StrategyStatus SystemSuspended = new StrategyStatus("SystemSuspended", 4, 4, false);
    public static final StrategyStatus Expired = new StrategyStatus("Expired", 5, 5, true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyStatus[] $values() {
        return new StrategyStatus[]{Pause, Active, Delete, Done, SystemSuspended, Expired};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTerminalState() {
        return this.isTerminalState;
    }

    private StrategyStatus(String str, int i, int i2, boolean z) {
        this.status = i2;
        this.isTerminalState = z;
    }

    static {
        StrategyStatus[] strategyStatusArr$values = $values();
        $VALUES = strategyStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyStatusArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final StrategyStatus KWHzl(int i) {
            StrategyStatus next;
            Iterator<StrategyStatus> it = StrategyStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getStatus() == i) {
                    break;
                }
            }
            StrategyStatus strategyStatus = next;
            if (strategyStatus != null) {
                return strategyStatus;
            }
            return (StrategyStatus) C31200lpY.copydefault(StrategyStatus.Pause, "unsupported status: " + i);
        }
    }

    public static StrategyStatus valueOf(String str) {
        return (StrategyStatus) Enum.valueOf(StrategyStatus.class, str);
    }

    public static StrategyStatus[] values() {
        return (StrategyStatus[]) $VALUES.clone();
    }
}
