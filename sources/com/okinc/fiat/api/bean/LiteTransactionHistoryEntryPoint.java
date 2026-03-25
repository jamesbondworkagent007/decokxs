package com.okinc.fiat.api.bean;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LiteTransactionHistoryEntryPoint implements Serializable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.LiteTransactionHistoryEntryPoint.<init>():void type: THIS */
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
}
