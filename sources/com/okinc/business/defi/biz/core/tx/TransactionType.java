package com.okinc.business.defi.biz.core.tx;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class TransactionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final TaskDescription Companion;
    public static final TransactionType TypeTransfer = new TransactionType("TypeTransfer", 0);
    public static final TransactionType TypeRegister = new TransactionType("TypeRegister", 1);
    public static final TransactionType TypeInscribe = new TransactionType("TypeInscribe", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{TypeTransfer, TypeRegister, TypeInscribe};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    private TransactionType(String str, int i) {
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.TransactionType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TransactionType copydefault(int i) {
            if (i == 0) {
                return TransactionType.TypeTransfer;
            }
            if (i == 1) {
                return TransactionType.TypeRegister;
            }
            if (i == 2) {
                return TransactionType.TypeInscribe;
            }
            return TransactionType.TypeTransfer;
        }
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
