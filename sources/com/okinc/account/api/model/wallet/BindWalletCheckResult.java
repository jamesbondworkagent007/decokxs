package com.okinc.account.api.model.wallet;

/* JADX INFO: loaded from: classes14.dex */
public interface BindWalletCheckResult {

    /* JADX INFO: loaded from: classes22.dex */
    public static final class AbleToBind implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final AbleToBind INSTANCE = new AbleToBind();

        private AbleToBind() {
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class AlreadyBound implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final AlreadyBound INSTANCE = new AlreadyBound();

        private AlreadyBound() {
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class ReactiveBinding implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final ReactiveBinding INSTANCE = new ReactiveBinding();

        private ReactiveBinding() {
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class ChangeBinding implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final ChangeBinding INSTANCE = new ChangeBinding();

        private ChangeBinding() {
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class WalletTypeNotSupported implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final WalletTypeNotSupported INSTANCE = new WalletTypeNotSupported();

        private WalletTypeNotSupported() {
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class BoundPayoutWallet implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final BoundPayoutWallet INSTANCE = new BoundPayoutWallet();

        private BoundPayoutWallet() {
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class UnknownError implements BindWalletCheckResult {
        public static final int $stable = 0;
        public static final UnknownError INSTANCE = new UnknownError();

        private UnknownError() {
        }
    }
}
