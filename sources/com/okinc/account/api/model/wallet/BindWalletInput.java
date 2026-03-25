package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BindWalletInput implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BindWalletInput> CREATOR = new Creator();
    private final Integer addressType;
    private final Long chainIndex;
    private final EntryPoint entryPoint;
    private final WalletAccount prefilledWalletAccount;
    private final WalletAccount walletAccount;
    private final Integer withdrawLimit;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<BindWalletInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindWalletInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BindWalletInput(parcel.readInt() == 0 ? null : WalletAccount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), EntryPoint.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WalletAccount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindWalletInput[] newArray(int i) {
            return new BindWalletInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BindWalletInput copy$default(BindWalletInput bindWalletInput, WalletAccount walletAccount, Integer num, Long l, Integer num2, EntryPoint entryPoint, WalletAccount walletAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            walletAccount = bindWalletInput.walletAccount;
        }
        if ((i & 2) != 0) {
            num = bindWalletInput.withdrawLimit;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            l = bindWalletInput.chainIndex;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num2 = bindWalletInput.addressType;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            entryPoint = bindWalletInput.entryPoint;
        }
        EntryPoint entryPoint2 = entryPoint;
        if ((i & 32) != 0) {
            walletAccount2 = bindWalletInput.prefilledWalletAccount;
        }
        return bindWalletInput.copy(walletAccount, num3, l2, num4, entryPoint2, walletAccount2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount component1() {
        return this.walletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntryPoint component5() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount component6() {
        return this.prefilledWalletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInput copy(WalletAccount walletAccount, Integer num, Long l, Integer num2, @NotNull EntryPoint entryPoint, WalletAccount walletAccount2) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        return new BindWalletInput(walletAccount, num, l, num2, entryPoint, walletAccount2);
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
        if (!(obj instanceof BindWalletInput)) {
            return false;
        }
        BindWalletInput bindWalletInput = (BindWalletInput) obj;
        return Intrinsics.EZpvd(this.walletAccount, bindWalletInput.walletAccount) && Intrinsics.EZpvd(this.withdrawLimit, bindWalletInput.withdrawLimit) && Intrinsics.EZpvd(this.chainIndex, bindWalletInput.chainIndex) && Intrinsics.EZpvd(this.addressType, bindWalletInput.addressType) && this.entryPoint == bindWalletInput.entryPoint && Intrinsics.EZpvd(this.prefilledWalletAccount, bindWalletInput.prefilledWalletAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount getPrefilledWalletAccount() {
        return this.prefilledWalletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount getWalletAccount() {
        return this.walletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWithdrawLimit() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        WalletAccount walletAccount = this.walletAccount;
        int iHashCode = walletAccount == null ? 0 : walletAccount.hashCode();
        Integer num = this.withdrawLimit;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Long l = this.chainIndex;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num2 = this.addressType;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        int iHashCode5 = this.entryPoint.hashCode();
        WalletAccount walletAccount2 = this.prefilledWalletAccount;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (walletAccount2 != null ? walletAccount2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindWalletInput(walletAccount=" + this.walletAccount + ", withdrawLimit=" + this.withdrawLimit + ", chainIndex=" + this.chainIndex + ", addressType=" + this.addressType + ", entryPoint=" + this.entryPoint + ", prefilledWalletAccount=" + this.prefilledWalletAccount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        WalletAccount walletAccount = this.walletAccount;
        if (walletAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletAccount.writeToParcel(parcel, i);
        }
        Integer num = this.withdrawLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.addressType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        this.entryPoint.writeToParcel(parcel, i);
        WalletAccount walletAccount2 = this.prefilledWalletAccount;
        if (walletAccount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletAccount2.writeToParcel(parcel, i);
        }
    }

    public BindWalletInput(WalletAccount walletAccount, Integer num, Long l, Integer num2, @NotNull EntryPoint entryPoint, WalletAccount walletAccount2) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        this.walletAccount = walletAccount;
        this.withdrawLimit = num;
        this.chainIndex = l;
        this.addressType = num2;
        this.entryPoint = entryPoint;
        this.prefilledWalletAccount = walletAccount2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 com.okinc.account.api.model.wallet.WalletAccount)
  (r11v0 java.lang.Integer)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (r14v0 com.okinc.account.api.model.wallet.BindWalletInput$EntryPoint)
  (wrap:com.okinc.account.api.model.wallet.WalletAccount:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.wallet.WalletAccount) : (r15v0 com.okinc.account.api.model.wallet.WalletAccount))
 A[MD:(com.okinc.account.api.model.wallet.WalletAccount, java.lang.Integer, java.lang.Long, java.lang.Integer, com.okinc.account.api.model.wallet.BindWalletInput$EntryPoint, com.okinc.account.api.model.wallet.WalletAccount):void (m)] (LINE:7) call: com.okinc.account.api.model.wallet.BindWalletInput.<init>(com.okinc.account.api.model.wallet.WalletAccount, java.lang.Integer, java.lang.Long, java.lang.Integer, com.okinc.account.api.model.wallet.BindWalletInput$EntryPoint, com.okinc.account.api.model.wallet.WalletAccount):void type: THIS */
    public /* synthetic */ BindWalletInput(WalletAccount walletAccount, Integer num, Long l, Integer num2, EntryPoint entryPoint, WalletAccount walletAccount2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(walletAccount, num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num2, entryPoint, (i & 32) != 0 ? null : walletAccount2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class EntryPoint implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final Parcelable.Creator<EntryPoint> CREATOR;
        private final String value;
        public static final EntryPoint WALLET_DEFAULT = new EntryPoint("WALLET_DEFAULT", 0, "wallet_default");
        public static final EntryPoint WALLET_DEPOSIT = new EntryPoint("WALLET_DEPOSIT", 1, "wallet_deposit");
        public static final EntryPoint CEFI_DEFAULT = new EntryPoint("CEFI_DEFAULT", 2, "cefi_default");
        public static final EntryPoint CEFI_WITHDRAW = new EntryPoint("CEFI_WITHDRAW", 3, "cefi_withdraw");
        public static final EntryPoint INVITE_LINK = new EntryPoint("INVITE_LINK", 4, "invite_link");
        public static final EntryPoint AFFILIATE = new EntryPoint("AFFILIATE", 5, "affiliate");

        public static final class Creator implements Parcelable.Creator<EntryPoint> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EntryPoint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EntryPoint.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EntryPoint[] newArray(int i) {
                return new EntryPoint[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{WALLET_DEFAULT, WALLET_DEPOSIT, CEFI_DEFAULT, CEFI_WITHDRAW, INVITE_LINK, AFFILIATE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private EntryPoint(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(entryPointArr$values);
            CREATOR = new Creator();
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
