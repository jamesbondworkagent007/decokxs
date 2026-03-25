package com.okinc.okex.center.bean.enums;

import com.okinc.okex.center.bean.enums.ContextualScenario;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44822seF;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44822seF.class)
public final class ContextualScenario {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContextualScenario[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;
    public static final ContextualScenario TransactionListDepositEmpty = new ContextualScenario("TransactionListDepositEmpty", 0, "transaction_list_deposit_empty");
    public static final ContextualScenario TransactionListP2PEmpty = new ContextualScenario("TransactionListP2PEmpty", 1, "transaction_list_p2p_empty");
    public static final ContextualScenario TransactionListWithdrawEmpty = new ContextualScenario("TransactionListWithdrawEmpty", 2, "transaction_list_withdraw_empty");
    public static final ContextualScenario TransactionDepositCompleted = new ContextualScenario("TransactionDepositCompleted", 3, "transaction_deposit_completed");
    public static final ContextualScenario TransactionDepositUntradable = new ContextualScenario("TransactionDepositUntradable", 4, "transaction_deposit_untradable");
    public static final ContextualScenario TransactionP2PCancelledPaymentTimeout = new ContextualScenario("TransactionP2PCancelledPaymentTimeout", 5, "transaction_p2p_cancelled_payment_timeout");
    public static final ContextualScenario TransactionDepositUnfinished = new ContextualScenario("TransactionDepositUnfinished", 6, "transaction_deposit_unfinished");
    public static final ContextualScenario TransactionDepositErrorBelowMinimumBtc = new ContextualScenario("TransactionDepositErrorBelowMinimumBtc", 7, "transaction_deposit_error_below_minimum_btc");
    public static final ContextualScenario TransactionDepositErrorBelowMinimumNonBtc = new ContextualScenario("TransactionDepositErrorBelowMinimumNonBtc", 8, "transaction_deposit_error_below_minimum_non_btc");
    public static final ContextualScenario TransactionDepositErrorMissingTagMemo = new ContextualScenario("TransactionDepositErrorMissingTagMemo", 9, "transaction_deposit_error_missing_tag_memo");
    public static final ContextualScenario TransactionDepositErrorNonOkxTransaction = new ContextualScenario("TransactionDepositErrorNonOkxTransaction", 10, "transaction_deposit_error_non_okx_transaction");
    public static final ContextualScenario TransactionDepositErrorIncorrectAddress = new ContextualScenario("TransactionDepositErrorIncorrectAddress", 11, "transaction_deposit_error_incorrect_address");
    public static final ContextualScenario TransactionDepositErrorNonSupportedToken = new ContextualScenario("TransactionDepositErrorNonSupportedToken", 12, "transaction_deposit_error_non_supported_token");
    public static final ContextualScenario Unknown = new ContextualScenario("Unknown", 13, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContextualScenario[] $values() {
        return new ContextualScenario[]{TransactionListDepositEmpty, TransactionListP2PEmpty, TransactionListWithdrawEmpty, TransactionDepositCompleted, TransactionDepositUntradable, TransactionP2PCancelledPaymentTimeout, TransactionDepositUnfinished, TransactionDepositErrorBelowMinimumBtc, TransactionDepositErrorBelowMinimumNonBtc, TransactionDepositErrorMissingTagMemo, TransactionDepositErrorNonOkxTransaction, TransactionDepositErrorIncorrectAddress, TransactionDepositErrorNonSupportedToken, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContextualScenario> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.ContextualScenario.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) ContextualScenario.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ContextualScenario> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44822seF();
    }

    private ContextualScenario(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ContextualScenario[] contextualScenarioArr$values = $values();
        $VALUES = contextualScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contextualScenarioArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ContextualScenario._init_$_anonymous_();
            }
        });
    }

    public static ContextualScenario valueOf(String str) {
        return (ContextualScenario) Enum.valueOf(ContextualScenario.class, str);
    }

    public static ContextualScenario[] values() {
        return (ContextualScenario[]) $VALUES.clone();
    }
}
