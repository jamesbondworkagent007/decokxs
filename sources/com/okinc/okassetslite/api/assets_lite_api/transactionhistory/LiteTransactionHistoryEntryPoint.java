package com.okinc.okassetslite.api.assets_lite_api.transactionhistory;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LiteTransactionHistoryEntryPoint implements Serializable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.LiteTransactionHistoryEntryPoint.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LiteTransactionHistoryEntryPoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class BuySell extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final BuySell INSTANCE = new BuySell();

        private BuySell() {
            super(null);
        }
    }

    private LiteTransactionHistoryEntryPoint() {
    }

    public static final class Portfolio extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final Portfolio INSTANCE = new Portfolio();

        private Portfolio() {
            super(null);
        }
    }

    public static final class PortfolioPendingTransaction extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final PortfolioPendingTransaction INSTANCE = new PortfolioPendingTransaction();

        private PortfolioPendingTransaction() {
            super(null);
        }
    }

    public static final class YourAccount extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final YourAccount INSTANCE = new YourAccount();

        private YourAccount() {
            super(null);
        }
    }

    public static final class P2PReminder extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final P2PReminder INSTANCE = new P2PReminder();

        private P2PReminder() {
            super(null);
        }
    }

    public static final class Withdrawal extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final Withdrawal INSTANCE = new Withdrawal();

        private Withdrawal() {
            super(null);
        }
    }

    public static final class ProDepositWithdrawal extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final ProDepositWithdrawal INSTANCE = new ProDepositWithdrawal();

        private ProDepositWithdrawal() {
            super(null);
        }
    }

    public static final class Web3Pay extends LiteTransactionHistoryEntryPoint {
        public static final int $stable = 0;
        public static final Web3Pay INSTANCE = new Web3Pay();

        private Web3Pay() {
            super(null);
        }
    }
}
