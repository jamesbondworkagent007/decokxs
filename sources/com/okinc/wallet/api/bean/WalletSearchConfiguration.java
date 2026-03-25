package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class WalletSearchConfiguration implements Parcelable {
    public static final int $stable = 0;
    private final DisplayOptions displayOptions;
    private final boolean showBanner;
    private final String source;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WalletSearchConfiguration> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletSearchConfiguration> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSearchConfiguration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletSearchConfiguration(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : DisplayOptions.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSearchConfiguration[] newArray(int i) {
            return new WalletSearchConfiguration[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletSearchConfiguration() {
        this(false, (String) null, (DisplayOptions) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSearchConfiguration copy$default(WalletSearchConfiguration walletSearchConfiguration, boolean z, String str, DisplayOptions displayOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            z = walletSearchConfiguration.showBanner;
        }
        if ((i & 2) != 0) {
            str = walletSearchConfiguration.source;
        }
        if ((i & 4) != 0) {
            displayOptions = walletSearchConfiguration.displayOptions;
        }
        return walletSearchConfiguration.copy(z, str, displayOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayOptions component3() {
        return this.displayOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchConfiguration copy(boolean z, String str, DisplayOptions displayOptions) {
        return new WalletSearchConfiguration(z, str, displayOptions);
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
        if (!(obj instanceof WalletSearchConfiguration)) {
            return false;
        }
        WalletSearchConfiguration walletSearchConfiguration = (WalletSearchConfiguration) obj;
        return this.showBanner == walletSearchConfiguration.showBanner && Intrinsics.EZpvd((Object) this.source, (Object) walletSearchConfiguration.source) && Intrinsics.EZpvd(this.displayOptions, walletSearchConfiguration.displayOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowBanner() {
        return this.showBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showBanner);
        String str = this.source;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        DisplayOptions displayOptions = this.displayOptions;
        return (((iHashCode * 31) + iHashCode2) * 31) + (displayOptions != null ? displayOptions.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchConfiguration(showBanner=" + this.showBanner + ", source=" + this.source + ", displayOptions=" + this.displayOptions + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.showBanner ? 1 : 0);
        parcel.writeString(this.source);
        DisplayOptions displayOptions = this.displayOptions;
        if (displayOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayOptions.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.WalletSearchConfiguration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletSearchConfiguration> serializer() {
            return WalletSearchConfiguration$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletSearchConfiguration(int i, boolean z, String str, DisplayOptions displayOptions, SerializationConstructorMarker serializationConstructorMarker) {
        this.showBanner = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
        if ((i & 4) == 0) {
            this.displayOptions = null;
        } else {
            this.displayOptions = displayOptions;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(WalletSearchConfiguration walletSearchConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletSearchConfiguration.showBanner) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, walletSearchConfiguration.showBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletSearchConfiguration.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletSearchConfiguration.source);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && walletSearchConfiguration.displayOptions == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, WalletSearchConfiguration$DisplayOptions$$serializer.INSTANCE, walletSearchConfiguration.displayOptions);
    }

    public WalletSearchConfiguration(boolean z, String str, DisplayOptions displayOptions) {
        this.showBanner = z;
        this.source = str;
        this.displayOptions = displayOptions;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.wallet.api.bean.WalletSearchConfiguration$DisplayOptions:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.api.bean.WalletSearchConfiguration$DisplayOptions) : (r4v0 com.okinc.wallet.api.bean.WalletSearchConfiguration$DisplayOptions))
 A[MD:(boolean, java.lang.String, com.okinc.wallet.api.bean.WalletSearchConfiguration$DisplayOptions):void (m)] (LINE:18) call: com.okinc.wallet.api.bean.WalletSearchConfiguration.<init>(boolean, java.lang.String, com.okinc.wallet.api.bean.WalletSearchConfiguration$DisplayOptions):void type: THIS */
    public /* synthetic */ WalletSearchConfiguration(boolean z, String str, DisplayOptions displayOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayOptions);
    }

    @Serializable
    public static final class DisplayOptions implements Parcelable {
        public static final int $stable = 0;
        private final String searchBarTransitionName;
        private final boolean showStatusBar;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DisplayOptions> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DisplayOptions> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DisplayOptions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DisplayOptions(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DisplayOptions[] newArray(int i) {
                return new DisplayOptions[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DisplayOptions() {
            this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DisplayOptions copy$default(DisplayOptions displayOptions, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = displayOptions.searchBarTransitionName;
            }
            if ((i & 2) != 0) {
                z = displayOptions.showStatusBar;
            }
            return displayOptions.copy(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.searchBarTransitionName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.showStatusBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DisplayOptions copy(String str, boolean z) {
            return new DisplayOptions(str, z);
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
            if (!(obj instanceof DisplayOptions)) {
                return false;
            }
            DisplayOptions displayOptions = (DisplayOptions) obj;
            return Intrinsics.EZpvd((Object) this.searchBarTransitionName, (Object) displayOptions.searchBarTransitionName) && this.showStatusBar == displayOptions.showStatusBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSearchBarTransitionName() {
            return this.searchBarTransitionName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowStatusBar() {
            return this.showStatusBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.searchBarTransitionName;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.showStatusBar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DisplayOptions(searchBarTransitionName=" + this.searchBarTransitionName + ", showStatusBar=" + this.showStatusBar + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.searchBarTransitionName);
            parcel.writeInt(this.showStatusBar ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.WalletSearchConfiguration.DisplayOptions.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DisplayOptions> serializer() {
                return WalletSearchConfiguration$DisplayOptions$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DisplayOptions(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.searchBarTransitionName = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.showStatusBar = false;
            } else {
                this.showStatusBar = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(DisplayOptions displayOptions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || displayOptions.searchBarTransitionName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, displayOptions.searchBarTransitionName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || displayOptions.showStatusBar) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, displayOptions.showStatusBar);
            }
        }

        public DisplayOptions(String str, boolean z) {
            this.searchBarTransitionName = str;
            this.showStatusBar = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:26) call: com.okinc.wallet.api.bean.WalletSearchConfiguration.DisplayOptions.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ DisplayOptions(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
        }
    }
}
