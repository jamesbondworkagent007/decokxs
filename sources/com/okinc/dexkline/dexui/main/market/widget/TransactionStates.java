package com.okinc.dexkline.dexui.main.market.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class TransactionStates {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionStates[] $VALUES;
    public static final ActionBar Companion;
    public static final TransactionStates NO_TRANSACTION = new TransactionStates("NO_TRANSACTION", 0);
    public static final TransactionStates SINGLE_TRANSACTION = new TransactionStates("SINGLE_TRANSACTION", 1);
    public static final TransactionStates DOUBLE_TRANSACTION = new TransactionStates("DOUBLE_TRANSACTION", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionStates[] $values() {
        return new TransactionStates[]{NO_TRANSACTION, SINGLE_TRANSACTION, DOUBLE_TRANSACTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionStates> getEntries() {
        return $ENTRIES;
    }

    private TransactionStates(String str, int i) {
    }

    static {
        TransactionStates[] transactionStatesArr$values = $values();
        $VALUES = transactionStatesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionStatesArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexui.main.market.widget.TransactionStates.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TransactionStates OLrzqt(float f, float f2) {
            if (f == 0.0f && f2 == 0.0f) {
                return TransactionStates.NO_TRANSACTION;
            }
            if (f == 0.0f || f2 == 0.0f) {
                return TransactionStates.SINGLE_TRANSACTION;
            }
            return TransactionStates.DOUBLE_TRANSACTION;
        }
    }

    public static TransactionStates valueOf(String str) {
        return (TransactionStates) Enum.valueOf(TransactionStates.class, str);
    }

    public static TransactionStates[] values() {
        return (TransactionStates[]) $VALUES.clone();
    }
}
