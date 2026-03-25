package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsTransactionProgress implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AssetsTransactionProgress> CREATOR = new Creator();

    @SerializedName(OtcExtraKeys.AMOUNT)
    private final String amount;

    @SerializedName("category")
    private final Category category;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("fiatTransactionId")
    private final String fiatTransactionId;

    @SerializedName("fiatFlag")
    private final Boolean isFiat;

    @SerializedName("smartAccountTransferId")
    private final String smartAccountTransferId;

    @SerializedName("status")
    private final String status;

    @SerializedName("timestamp")
    private final Long timestamp;

    @SerializedName("transactionId")
    private final Integer transactionId;

    @SerializedName("type")
    private final TransactionType type;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Deposit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.SmartAccountTransfer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final class Creator implements Parcelable.Creator<AssetsTransactionProgress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsTransactionProgress createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            TransactionType transactionTypeValueOf = parcel.readInt() == 0 ? null : TransactionType.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AssetsTransactionProgress(string, string2, transactionTypeValueOf, numValueOf, string3, string4, lValueOf, boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : Category.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsTransactionProgress[] newArray(int i) {
            return new AssetsTransactionProgress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Category component10() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.smartAccountTransferId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fiatTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsTransactionProgress copy(String str, String str2, TransactionType transactionType, Integer num, String str3, String str4, Long l, Boolean bool, String str5, Category category, String str6) {
        return new AssetsTransactionProgress(str, str2, transactionType, num, str3, str4, l, bool, str5, category, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetsTransactionProgress)) {
            return false;
        }
        AssetsTransactionProgress assetsTransactionProgress = (AssetsTransactionProgress) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) assetsTransactionProgress.amount) && Intrinsics.EZpvd((Object) this.currency, (Object) assetsTransactionProgress.currency) && this.type == assetsTransactionProgress.type && Intrinsics.EZpvd(this.transactionId, assetsTransactionProgress.transactionId) && Intrinsics.EZpvd((Object) this.desc, (Object) assetsTransactionProgress.desc) && Intrinsics.EZpvd((Object) this.status, (Object) assetsTransactionProgress.status) && Intrinsics.EZpvd(this.timestamp, assetsTransactionProgress.timestamp) && Intrinsics.EZpvd(this.isFiat, assetsTransactionProgress.isFiat) && Intrinsics.EZpvd((Object) this.fiatTransactionId, (Object) assetsTransactionProgress.fiatTransactionId) && this.category == assetsTransactionProgress.category && Intrinsics.EZpvd((Object) this.smartAccountTransferId, (Object) assetsTransactionProgress.smartAccountTransferId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Category getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatTransactionId() {
        return this.fiatTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmartAccountTransferId() {
        return this.smartAccountTransferId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        TransactionType transactionType = this.type;
        int iHashCode3 = transactionType == null ? 0 : transactionType.hashCode();
        Integer num = this.transactionId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.desc;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.status;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Long l = this.timestamp;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Boolean bool = this.isFiat;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str5 = this.fiatTransactionId;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        Category category = this.category;
        int iHashCode10 = category == null ? 0 : category.hashCode();
        String str6 = this.smartAccountTransferId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFiat() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsTransactionProgress(amount=" + this.amount + ", currency=" + this.currency + ", type=" + this.type + ", transactionId=" + this.transactionId + ", desc=" + this.desc + ", status=" + this.status + ", timestamp=" + this.timestamp + ", isFiat=" + this.isFiat + ", fiatTransactionId=" + this.fiatTransactionId + ", category=" + this.category + ", smartAccountTransferId=" + this.smartAccountTransferId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.currency);
        TransactionType transactionType = this.type;
        if (transactionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(transactionType.name());
        }
        Integer num = this.transactionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.desc);
        parcel.writeString(this.status);
        Long l = this.timestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isFiat;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.fiatTransactionId);
        Category category = this.category;
        if (category == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(category.name());
        }
        parcel.writeString(this.smartAccountTransferId);
    }

    public AssetsTransactionProgress(String str, String str2, TransactionType transactionType, Integer num, String str3, String str4, Long l, Boolean bool, String str5, Category category, String str6) {
        this.amount = str;
        this.currency = str2;
        this.type = transactionType;
        this.transactionId = num;
        this.desc = str3;
        this.status = str4;
        this.timestamp = l;
        this.isFiat = bool;
        this.fiatTransactionId = str5;
        this.category = category;
        this.smartAccountTransferId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.TransactionType:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.TransactionType) : (r18v0 com.okinc.assets.backend.api.model.TransactionType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (r23v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.Category:?: TERNARY null = ((wrap:int:0x0043: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.Category) : (r25v0 com.okinc.assets.backend.api.model.Category))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.TransactionType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, com.okinc.assets.backend.api.model.Category, java.lang.String):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.AssetsTransactionProgress.<init>(java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.TransactionType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, com.okinc.assets.backend.api.model.Category, java.lang.String):void type: THIS */
    public /* synthetic */ AssetsTransactionProgress(String str, String str2, TransactionType transactionType, Integer num, String str3, String str4, Long l, Boolean bool, String str5, Category category, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : transactionType, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l, bool, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : category, (i & 1024) != 0 ? null : str6);
    }

    public final ProgressStatus getProgressStatus() {
        TransactionType transactionType = this.type;
        int i = transactionType == null ? -1 : ActionBar.EZpvd[transactionType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return ProgressStatus.Companion.KWHzl(this.status);
        }
        if (i == 2) {
            return ProgressStatus.Companion.OLrzqt(this.status);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ProgressStatus.Companion.copydefault(this.status);
    }
}
