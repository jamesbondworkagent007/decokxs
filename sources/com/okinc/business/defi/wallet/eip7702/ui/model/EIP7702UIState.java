package com.okinc.business.defi.wallet.eip7702.ui.model;

import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public interface EIP7702UIState {

    public static final class Activity implements EIP7702UIState {
        public final String AEQbTJ;
        public final EIP7702ChainStatusResp.ChainStatusItem EZpvd;
        public final long KWHzl;
        public final String OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, long j, long j2, EIP7702ChainStatusResp.ChainStatusItem chainStatusItem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                j = activity.copydefault;
            }
            long j3 = j;
            if ((i & 8) != 0) {
                j2 = activity.KWHzl;
            }
            long j4 = j2;
            if ((i & 16) != 0) {
                chainStatusItem = activity.EZpvd;
            }
            return activity.EZpvd(str, str3, j3, j4, chainStatusItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EIP7702ChainStatusResp.ChainStatusItem AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull EIP7702ChainStatusResp.ChainStatusItem chainStatusItem) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(chainStatusItem, "");
            return new Activity(str, str2, j, j2, chainStatusItem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && this.copydefault == activity.copydefault && this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + Long.hashCode(this.copydefault)) * 31) + Long.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EIP7702Network(logo=" + this.OLrzqt + ", chainName=" + this.AEQbTJ + ", generalChainId=" + this.copydefault + ", realEvmChainId=" + this.KWHzl + ", chainStatusItem=" + this.EZpvd + ")";
        }

        public Activity(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull EIP7702ChainStatusResp.ChainStatusItem chainStatusItem) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(chainStatusItem, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.copydefault = j;
            this.KWHzl = j2;
            this.EZpvd = chainStatusItem;
        }
    }

    public static final class UnavailableWallet implements EIP7702UIState {
        public final Status EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnavailableWallet copy$default(UnavailableWallet unavailableWallet, Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                status = unavailableWallet.EZpvd;
            }
            return unavailableWallet.EZpvd(status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnavailableWallet EZpvd(@NotNull Status status) {
            Intrinsics.checkNotNullParameter(status, "");
            return new UnavailableWallet(status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnavailableWallet) && this.EZpvd == ((UnavailableWallet) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnavailableWallet(status=" + this.EZpvd + ")";
        }

        public UnavailableWallet(@NotNull Status status) {
            Intrinsics.checkNotNullParameter(status, "");
            this.EZpvd = status;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Status {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status ALL_WALLETS_UNAVAILABLE = new Status("ALL_WALLETS_UNAVAILABLE", 0);
            public static final Status CURRENT_WALLET_IS_EVM_TRACKING = new Status("CURRENT_WALLET_IS_EVM_TRACKING", 1);
            public static final Status CURRENT_WALLET_IS_UNAVAILABLE = new Status("CURRENT_WALLET_IS_UNAVAILABLE", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Status[] $values() {
                return new Status[]{ALL_WALLETS_UNAVAILABLE, CURRENT_WALLET_IS_EVM_TRACKING, CURRENT_WALLET_IS_UNAVAILABLE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    public static final class Application implements EIP7702UIState {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }
    }

    public static final class StateListAnimator implements EIP7702UIState {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
