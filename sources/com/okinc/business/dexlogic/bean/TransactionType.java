package com.okinc.business.dexlogic.bean;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TransactionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final Activity Companion;
    private final int type;
    public static final TransactionType Buy = new TransactionType("Buy", 0, 0);
    public static final TransactionType Sell = new TransactionType("Sell", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{Buy, Sell};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private TransactionType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TransactionType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TransactionType copydefault(int i) {
            TransactionType next;
            Iterator<TransactionType> it = TransactionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getType() == i) {
                    break;
                }
            }
            TransactionType transactionType = next;
            return transactionType == null ? TransactionType.Buy : transactionType;
        }
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
