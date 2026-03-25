package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CurrentWalletNotSupportedMode implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CurrentWalletNotSupportedMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CurrentWalletNotSupportedMode() {
    }

    public static final class BusinessNotSupported extends CurrentWalletNotSupportedMode {
        public static final Parcelable.Creator<BusinessNotSupported> CREATOR = new Creator();
        public final WalletOrAccountNotSupportedType OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<BusinessNotSupported> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BusinessNotSupported createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BusinessNotSupported(WalletOrAccountNotSupportedType.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BusinessNotSupported[] newArray(int i) {
                return new BusinessNotSupported[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BusinessNotSupported copy$default(BusinessNotSupported businessNotSupported, WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                walletOrAccountNotSupportedType = businessNotSupported.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = businessNotSupported.copydefault;
            }
            return businessNotSupported.AEQbTJ(walletOrAccountNotSupportedType, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BusinessNotSupported AEQbTJ(@NotNull WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(walletOrAccountNotSupportedType, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new BusinessNotSupported(walletOrAccountNotSupportedType, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletOrAccountNotSupportedType copydefault() {
            return this.OLrzqt;
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
            if (!(obj instanceof BusinessNotSupported)) {
                return false;
            }
            BusinessNotSupported businessNotSupported = (BusinessNotSupported) obj;
            return this.OLrzqt == businessNotSupported.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) businessNotSupported.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BusinessNotSupported(notSupportedType=" + this.OLrzqt + ", businessName=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessNotSupported(@NotNull WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(walletOrAccountNotSupportedType, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = walletOrAccountNotSupportedType;
            this.copydefault = str;
        }
    }

    public static final class NetworkNotSupported extends CurrentWalletNotSupportedMode {
        public static final Parcelable.Creator<NetworkNotSupported> CREATOR = new Creator();
        public final String KWHzl;
        public final WalletOrAccountNotSupportedType OLrzqt;

        public static final class Creator implements Parcelable.Creator<NetworkNotSupported> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkNotSupported createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NetworkNotSupported(WalletOrAccountNotSupportedType.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkNotSupported[] newArray(int i) {
                return new NetworkNotSupported[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NetworkNotSupported copy$default(NetworkNotSupported networkNotSupported, WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                walletOrAccountNotSupportedType = networkNotSupported.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = networkNotSupported.KWHzl;
            }
            return networkNotSupported.KWHzl(walletOrAccountNotSupportedType, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletOrAccountNotSupportedType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkNotSupported KWHzl(@NotNull WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(walletOrAccountNotSupportedType, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new NetworkNotSupported(walletOrAccountNotSupportedType, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
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
            if (!(obj instanceof NetworkNotSupported)) {
                return false;
            }
            NetworkNotSupported networkNotSupported = (NetworkNotSupported) obj;
            return this.OLrzqt == networkNotSupported.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) networkNotSupported.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NetworkNotSupported(notSupportedType=" + this.OLrzqt + ", chainName=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkNotSupported(@NotNull WalletOrAccountNotSupportedType walletOrAccountNotSupportedType, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(walletOrAccountNotSupportedType, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = walletOrAccountNotSupportedType;
            this.KWHzl = str;
        }
    }

    public static final class NetworkNotSupportedForWalletType extends CurrentWalletNotSupportedMode {
        public static final Parcelable.Creator<NetworkNotSupportedForWalletType> CREATOR = new Creator();
        public final int EZpvd;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<NetworkNotSupportedForWalletType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkNotSupportedForWalletType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NetworkNotSupportedForWalletType(parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkNotSupportedForWalletType[] newArray(int i) {
                return new NetworkNotSupportedForWalletType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NetworkNotSupportedForWalletType copy$default(NetworkNotSupportedForWalletType networkNotSupportedForWalletType, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = networkNotSupportedForWalletType.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str = networkNotSupportedForWalletType.copydefault;
            }
            return networkNotSupportedForWalletType.OLrzqt(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkNotSupportedForWalletType OLrzqt(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NetworkNotSupportedForWalletType(i, str);
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
            if (!(obj instanceof NetworkNotSupportedForWalletType)) {
                return false;
            }
            NetworkNotSupportedForWalletType networkNotSupportedForWalletType = (NetworkNotSupportedForWalletType) obj;
            return this.EZpvd == networkNotSupportedForWalletType.EZpvd && Intrinsics.EZpvd((Object) this.copydefault, (Object) networkNotSupportedForWalletType.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NetworkNotSupportedForWalletType(walletType=" + this.EZpvd + ", chainName=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd);
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkNotSupportedForWalletType(int i, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = i;
            this.copydefault = str;
        }
    }

    public static final class CustomSubtitle extends CurrentWalletNotSupportedMode {
        public static final Parcelable.Creator<CustomSubtitle> CREATOR = new Creator();
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<CustomSubtitle> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomSubtitle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CustomSubtitle(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomSubtitle[] newArray(int i) {
                return new CustomSubtitle[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CustomSubtitle copy$default(CustomSubtitle customSubtitle, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customSubtitle.KWHzl;
            }
            return customSubtitle.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomSubtitle OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CustomSubtitle(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
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
            return (obj instanceof CustomSubtitle) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((CustomSubtitle) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CustomSubtitle(subtitle=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomSubtitle(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WalletOrAccountNotSupportedType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WalletOrAccountNotSupportedType[] $VALUES;
        public static final Parcelable.Creator<WalletOrAccountNotSupportedType> CREATOR;
        public static final WalletOrAccountNotSupportedType MPCWallet = new WalletOrAccountNotSupportedType("MPCWallet", 0);
        public static final WalletOrAccountNotSupportedType PrivateKeyWallet = new WalletOrAccountNotSupportedType("PrivateKeyWallet", 1);
        public static final WalletOrAccountNotSupportedType HardwareWallet = new WalletOrAccountNotSupportedType("HardwareWallet", 2);
        public static final WalletOrAccountNotSupportedType AASmartAccount = new WalletOrAccountNotSupportedType("AASmartAccount", 3);

        public static final class Creator implements Parcelable.Creator<WalletOrAccountNotSupportedType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletOrAccountNotSupportedType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return WalletOrAccountNotSupportedType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletOrAccountNotSupportedType[] newArray(int i) {
                return new WalletOrAccountNotSupportedType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WalletOrAccountNotSupportedType[] $values() {
            return new WalletOrAccountNotSupportedType[]{MPCWallet, PrivateKeyWallet, HardwareWallet, AASmartAccount};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WalletOrAccountNotSupportedType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private WalletOrAccountNotSupportedType(String str, int i) {
        }

        static {
            WalletOrAccountNotSupportedType[] walletOrAccountNotSupportedTypeArr$values = $values();
            $VALUES = walletOrAccountNotSupportedTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(walletOrAccountNotSupportedTypeArr$values);
            CREATOR = new Creator();
        }

        public static WalletOrAccountNotSupportedType valueOf(String str) {
            return (WalletOrAccountNotSupportedType) Enum.valueOf(WalletOrAccountNotSupportedType.class, str);
        }

        public static WalletOrAccountNotSupportedType[] values() {
            return (WalletOrAccountNotSupportedType[]) $VALUES.clone();
        }
    }
}
