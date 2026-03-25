package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes22.dex */
public final class SubAccountTransferHistory {
    public static final int $stable = 0;
    private final String amount;
    private final long createDate;
    private final String currency;
    private final int currencyId;
    private final String subAccountName;
    private final String targetFrom;
    private final String targetTo;
    private final int type;
    private final String typeStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.typeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.targetFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.targetTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountTransferHistory copy(String str, long j, String str2, int i, String str3, String str4, String str5, String str6, int i2) {
        return new SubAccountTransferHistory(str, j, str2, i, str3, str4, str5, str6, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountTransferHistory)) {
            return false;
        }
        SubAccountTransferHistory subAccountTransferHistory = (SubAccountTransferHistory) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) subAccountTransferHistory.amount) && this.createDate == subAccountTransferHistory.createDate && Intrinsics.EZpvd((Object) this.currency, (Object) subAccountTransferHistory.currency) && this.currencyId == subAccountTransferHistory.currencyId && Intrinsics.EZpvd((Object) this.subAccountName, (Object) subAccountTransferHistory.subAccountName) && Intrinsics.EZpvd((Object) this.typeStr, (Object) subAccountTransferHistory.typeStr) && Intrinsics.EZpvd((Object) this.targetFrom, (Object) subAccountTransferHistory.targetFrom) && Intrinsics.EZpvd((Object) this.targetTo, (Object) subAccountTransferHistory.targetTo) && this.type == subAccountTransferHistory.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAccountName() {
        return this.subAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetFrom() {
        return this.targetFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTo() {
        return this.targetTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeStr() {
        return this.typeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.createDate);
        String str2 = this.currency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Integer.hashCode(this.currencyId);
        String str3 = this.subAccountName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.typeStr;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.targetFrom;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.targetTo;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountTransferHistory(amount=" + this.amount + ", createDate=" + this.createDate + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", subAccountName=" + this.subAccountName + ", typeStr=" + this.typeStr + ", targetFrom=" + this.targetFrom + ", targetTo=" + this.targetTo + ", type=" + this.type + ")";
    }

    public SubAccountTransferHistory(String str, long j, String str2, int i, String str3, String str4, String str5, String str6, int i2) {
        this.amount = str;
        this.createDate = j;
        this.currency = str2;
        this.currencyId = i;
        this.subAccountName = str3;
        this.typeStr = str4;
        this.targetFrom = str5;
        this.targetTo = str6;
        this.type = i2;
    }

    public final TransferType getTypeEnum() throws IllegalArgumentException {
        return TransferType.Companion.EZpvd(this.type);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransferType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TransferType[] $VALUES;
        public static final Activity Companion;
        public static final TransferType MASTER_TO_SUB = new TransferType("MASTER_TO_SUB", 0, 0);
        public static final TransferType SUB_TO_MASTER = new TransferType("SUB_TO_MASTER", 1, 1);
        private final int intValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TransferType[] $values() {
            return new TransferType[]{MASTER_TO_SUB, SUB_TO_MASTER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TransferType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIntValue() {
            return this.intValue;
        }

        private TransferType(String str, int i, int i2) {
            this.intValue = i2;
        }

        static {
            TransferType[] transferTypeArr$values = $values();
            $VALUES = transferTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(transferTypeArr$values);
            Companion = new Activity(null);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.SubAccountTransferHistory.TransferType.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final TransferType EZpvd(int i) throws IllegalArgumentException {
                TransferType transferType;
                TransferType[] transferTypeArrValues = TransferType.values();
                int length = transferTypeArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        transferType = null;
                        break;
                    }
                    transferType = transferTypeArrValues[i2];
                    if (transferType.getIntValue() == i) {
                        break;
                    }
                    i2++;
                }
                if (transferType != null) {
                    return transferType;
                }
                throw new IllegalArgumentException("Unknown type: " + i);
            }
        }

        public static TransferType valueOf(String str) {
            return (TransferType) Enum.valueOf(TransferType.class, str);
        }

        public static TransferType[] values() {
            return (TransferType[]) $VALUES.clone();
        }
    }
}
