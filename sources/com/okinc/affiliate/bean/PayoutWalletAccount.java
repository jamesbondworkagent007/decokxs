package com.okinc.affiliate.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class PayoutWalletAccount implements Parcelable {
    private boolean isCurrentPayoutWallet;
    private boolean isSelected;
    private String payoutWalletAddress;
    private String userName;
    private String walletAccountAddress;
    private String walletAccountIcon;
    private String walletAccountId;
    private String walletAccountName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PayoutWalletAccount> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PayoutWalletAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayoutWalletAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PayoutWalletAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayoutWalletAccount[] newArray(int i) {
            return new PayoutWalletAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PayoutWalletAccount() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletAccountIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.walletAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayoutWalletAccount copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new PayoutWalletAccount(str, str2, str3, str4, str5, str6, z, z2);
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
        if (!(obj instanceof PayoutWalletAccount)) {
            return false;
        }
        PayoutWalletAccount payoutWalletAccount = (PayoutWalletAccount) obj;
        return Intrinsics.EZpvd((Object) this.userName, (Object) payoutWalletAccount.userName) && Intrinsics.EZpvd((Object) this.walletAccountId, (Object) payoutWalletAccount.walletAccountId) && Intrinsics.EZpvd((Object) this.walletAccountIcon, (Object) payoutWalletAccount.walletAccountIcon) && Intrinsics.EZpvd((Object) this.walletAccountAddress, (Object) payoutWalletAccount.walletAccountAddress) && Intrinsics.EZpvd((Object) this.walletAccountName, (Object) payoutWalletAccount.walletAccountName) && Intrinsics.EZpvd((Object) this.payoutWalletAddress, (Object) payoutWalletAccount.payoutWalletAddress) && this.isSelected == payoutWalletAccount.isSelected && this.isCurrentPayoutWallet == payoutWalletAccount.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayoutWalletAddress() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountAddress() {
        return this.walletAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountIcon() {
        return this.walletAccountIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountId() {
        return this.walletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountName() {
        return this.walletAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.userName.hashCode() * 31) + this.walletAccountId.hashCode()) * 31) + this.walletAccountIcon.hashCode()) * 31) + this.walletAccountAddress.hashCode()) * 31) + this.walletAccountName.hashCode()) * 31) + this.payoutWalletAddress.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isCurrentPayoutWallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentPayoutWallet() {
        return this.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPayoutWallet(boolean z) {
        this.isCurrentPayoutWallet = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayoutWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payoutWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccountAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAccountAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccountIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAccountIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAccountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayoutWalletAccount(userName=" + this.userName + ", walletAccountId=" + this.walletAccountId + ", walletAccountIcon=" + this.walletAccountIcon + ", walletAccountAddress=" + this.walletAccountAddress + ", walletAccountName=" + this.walletAccountName + ", payoutWalletAddress=" + this.payoutWalletAddress + ", isSelected=" + this.isSelected + ", isCurrentPayoutWallet=" + this.isCurrentPayoutWallet + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userName);
        parcel.writeString(this.walletAccountId);
        parcel.writeString(this.walletAccountIcon);
        parcel.writeString(this.walletAccountAddress);
        parcel.writeString(this.walletAccountName);
        parcel.writeString(this.payoutWalletAddress);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isCurrentPayoutWallet ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.affiliate.bean.PayoutWalletAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PayoutWalletAccount> serializer() {
            return PayoutWalletAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayoutWalletAccount(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userName = "";
        } else {
            this.userName = str;
        }
        if ((i & 2) == 0) {
            this.walletAccountId = "";
        } else {
            this.walletAccountId = str2;
        }
        if ((i & 4) == 0) {
            this.walletAccountIcon = "";
        } else {
            this.walletAccountIcon = str3;
        }
        if ((i & 8) == 0) {
            this.walletAccountAddress = "";
        } else {
            this.walletAccountAddress = str4;
        }
        if ((i & 16) == 0) {
            this.walletAccountName = "";
        } else {
            this.walletAccountName = str5;
        }
        if ((i & 32) == 0) {
            this.payoutWalletAddress = "";
        } else {
            this.payoutWalletAddress = str6;
        }
        if ((i & 64) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
        if ((i & 128) == 0) {
            this.isCurrentPayoutWallet = false;
        } else {
            this.isCurrentPayoutWallet = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAffiliate_affiliate_api(PayoutWalletAccount payoutWalletAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) payoutWalletAccount.userName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, payoutWalletAccount.userName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) payoutWalletAccount.walletAccountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, payoutWalletAccount.walletAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) payoutWalletAccount.walletAccountIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, payoutWalletAccount.walletAccountIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) payoutWalletAccount.walletAccountAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, payoutWalletAccount.walletAccountAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) payoutWalletAccount.walletAccountName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, payoutWalletAccount.walletAccountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) payoutWalletAccount.payoutWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, payoutWalletAccount.payoutWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || payoutWalletAccount.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, payoutWalletAccount.isSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || payoutWalletAccount.isCurrentPayoutWallet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, payoutWalletAccount.isCurrentPayoutWallet);
        }
    }

    public PayoutWalletAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.userName = str;
        this.walletAccountId = str2;
        this.walletAccountIcon = str3;
        this.walletAccountAddress = str4;
        this.walletAccountName = str5;
        this.payoutWalletAddress = str6;
        this.isSelected = z;
        this.isCurrentPayoutWallet = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:12) call: com.okinc.affiliate.bean.PayoutWalletAccount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ PayoutWalletAccount(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }
}
