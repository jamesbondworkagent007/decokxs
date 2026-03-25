package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ApproveStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ApproveStatus[] $VALUES;
    public static final TaskDescription Companion;
    private final String type;
    public static final ApproveStatus APPROVING = new ApproveStatus("APPROVING", 0, "2");
    public static final ApproveStatus APPROVED = new ApproveStatus("APPROVED", 1, "1");
    public static final ApproveStatus UN_APPROVE = new ApproveStatus("UN_APPROVE", 2, "0");
    public static final ApproveStatus APPROVE_AND_SWAP = new ApproveStatus("APPROVE_AND_SWAP", 3, "4");
    public static final ApproveStatus APPROVE_FAIL = new ApproveStatus("APPROVE_FAIL", 4, MultiTransferSignData.DEFAULT_INTERVAL);
    public static final ApproveStatus CANCEL_APPROVING = new ApproveStatus("CANCEL_APPROVING", 5, "3");
    public static final ApproveStatus APPROVED_NEED_CANCEL_APPROVE = new ApproveStatus("APPROVED_NEED_CANCEL_APPROVE", 6, "100");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ApproveStatus[] $values() {
        return new ApproveStatus[]{APPROVING, APPROVED, UN_APPROVE, APPROVE_AND_SWAP, APPROVE_FAIL, CANCEL_APPROVING, APPROVED_NEED_CANCEL_APPROVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ApproveStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private ApproveStatus(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        ApproveStatus[] approveStatusArr$values = $values();
        $VALUES = approveStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(approveStatusArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static ApproveStatus valueOf(String str) {
        return (ApproveStatus) Enum.valueOf(ApproveStatus.class, str);
    }

    public static ApproveStatus[] values() {
        return (ApproveStatus[]) $VALUES.clone();
    }
}
