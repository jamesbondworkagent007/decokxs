package com.okinc.account.api.model.wallet;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface BindWalletPreCheckResult {

    public static final class Success implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }

    public static final class NeedLogin implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        public static final NeedLogin INSTANCE = new NeedLogin();

        private NeedLogin() {
        }
    }

    public static final class NeedSwitchMainAccount implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        public static final NeedSwitchMainAccount INSTANCE = new NeedSwitchMainAccount();

        private NeedSwitchMainAccount() {
        }
    }

    public static final class NeedAddWallet implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        public static final NeedAddWallet INSTANCE = new NeedAddWallet();

        private NeedAddWallet() {
        }
    }

    public static final class NeedKYC implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        public static final NeedKYC INSTANCE = new NeedKYC();

        private NeedKYC() {
        }
    }

    public static final class ReachedMaxAccLimit implements BindWalletPreCheckResult {
        public static final int $stable = 0;
        private final String maxCapacity;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ReachedMaxAccLimit copy$default(ReachedMaxAccLimit reachedMaxAccLimit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reachedMaxAccLimit.maxCapacity;
            }
            return reachedMaxAccLimit.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.maxCapacity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReachedMaxAccLimit copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ReachedMaxAccLimit(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReachedMaxAccLimit) && Intrinsics.EZpvd((Object) this.maxCapacity, (Object) ((ReachedMaxAccLimit) obj).maxCapacity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxCapacity() {
            return this.maxCapacity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.maxCapacity.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReachedMaxAccLimit(maxCapacity=" + this.maxCapacity + ")";
        }

        public ReachedMaxAccLimit(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.maxCapacity = str;
        }
    }
}
