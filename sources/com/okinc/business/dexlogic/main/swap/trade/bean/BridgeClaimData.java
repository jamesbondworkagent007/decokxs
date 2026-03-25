package com.okinc.business.dexlogic.main.swap.trade.bean;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BridgeClaimData {
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final NotificationType copydefault;
    public final String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeClaimData copy$default(BridgeClaimData bridgeClaimData, String str, String str2, String str3, String str4, String str5, NotificationType notificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeClaimData.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = bridgeClaimData.AEQbTJ;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bridgeClaimData.OLrzqt;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bridgeClaimData.KWHzl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bridgeClaimData.djBIcL;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            notificationType = bridgeClaimData.copydefault;
        }
        return bridgeClaimData.AEQbTJ(str, str6, str7, str8, str9, notificationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationType AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeClaimData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        return new BridgeClaimData(str, str2, str3, str4, str5, notificationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeClaimData)) {
            return false;
        }
        BridgeClaimData bridgeClaimData = (BridgeClaimData) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) bridgeClaimData.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bridgeClaimData.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bridgeClaimData.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) bridgeClaimData.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) bridgeClaimData.djBIcL) && this.copydefault == bridgeClaimData.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeClaimData(toChainName=" + this.EZpvd + ", toTokenSymbol=" + this.AEQbTJ + ", toTokenFormattedAmount=" + this.OLrzqt + ", orderId=" + this.KWHzl + ", userWalletAddress=" + this.djBIcL + ", notificationType=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    public BridgeClaimData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.KWHzl = str4;
        this.djBIcL = str5;
        this.copydefault = notificationType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NotificationType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final NotificationType BRIDGE_READY_TO_CLAIM = new NotificationType("BRIDGE_READY_TO_CLAIM", 0);
        public static final NotificationType BRIDGE_CLAIM_SUCCESS = new NotificationType("BRIDGE_CLAIM_SUCCESS", 1);
        public static final NotificationType BRIDGE_CLAIM_FAIL = new NotificationType("BRIDGE_CLAIM_FAIL", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ NotificationType[] $values() {
            return new NotificationType[]{BRIDGE_READY_TO_CLAIM, BRIDGE_CLAIM_SUCCESS, BRIDGE_CLAIM_FAIL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<NotificationType> getEntries() {
            return $ENTRIES;
        }

        private NotificationType(String str, int i) {
        }

        static {
            NotificationType[] notificationTypeArr$values = $values();
            $VALUES = notificationTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(notificationTypeArr$values);
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }
}
