package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.DappSupportCheck;
import com.okinc.wallet.api.bean.DappSupportCheck$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletSelectDappCustomParams implements Parcelable {
    private String category;
    private String dappId;
    private DappSupportCheck dappSupportCheck;
    private String dappUrl;
    private boolean isDappBtc;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletSelectDappCustomParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletSelectDappCustomParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSelectDappCustomParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletSelectDappCustomParams(parcel.readString(), parcel.readString(), parcel.readString(), (DappSupportCheck) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSelectDappCustomParams[] newArray(int i) {
            return new WalletSelectDappCustomParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletSelectDappCustomParams() {
        this((String) null, (String) null, (String) null, (DappSupportCheck) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSelectDappCustomParams copy$default(WalletSelectDappCustomParams walletSelectDappCustomParams, String str, String str2, String str3, DappSupportCheck dappSupportCheck, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSelectDappCustomParams.dappUrl;
        }
        if ((i & 2) != 0) {
            str2 = walletSelectDappCustomParams.dappId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = walletSelectDappCustomParams.category;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dappSupportCheck = walletSelectDappCustomParams.dappSupportCheck;
        }
        DappSupportCheck dappSupportCheck2 = dappSupportCheck;
        if ((i & 16) != 0) {
            z = walletSelectDappCustomParams.isDappBtc;
        }
        return walletSelectDappCustomParams.copy(str, str4, str5, dappSupportCheck2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSupportCheck component4() {
        return this.dappSupportCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isDappBtc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectDappCustomParams copy(String str, String str2, String str3, DappSupportCheck dappSupportCheck, boolean z) {
        return new WalletSelectDappCustomParams(str, str2, str3, dappSupportCheck, z);
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
        if (!(obj instanceof WalletSelectDappCustomParams)) {
            return false;
        }
        WalletSelectDappCustomParams walletSelectDappCustomParams = (WalletSelectDappCustomParams) obj;
        return Intrinsics.EZpvd((Object) this.dappUrl, (Object) walletSelectDappCustomParams.dappUrl) && Intrinsics.EZpvd((Object) this.dappId, (Object) walletSelectDappCustomParams.dappId) && Intrinsics.EZpvd((Object) this.category, (Object) walletSelectDappCustomParams.category) && Intrinsics.EZpvd(this.dappSupportCheck, walletSelectDappCustomParams.dappSupportCheck) && this.isDappBtc == walletSelectDappCustomParams.isDappBtc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappId() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSupportCheck getDappSupportCheck() {
        return this.dappSupportCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappUrl() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.dappUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dappId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.category;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        DappSupportCheck dappSupportCheck = this.dappSupportCheck;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (dappSupportCheck != null ? dappSupportCheck.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDappBtc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDappBtc() {
        return this.isDappBtc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(String str) {
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappBtc(boolean z) {
        this.isDappBtc = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappId(String str) {
        this.dappId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappSupportCheck(DappSupportCheck dappSupportCheck) {
        this.dappSupportCheck = dappSupportCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappUrl(String str) {
        this.dappUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSelectDappCustomParams(dappUrl=" + this.dappUrl + ", dappId=" + this.dappId + ", category=" + this.category + ", dappSupportCheck=" + this.dappSupportCheck + ", isDappBtc=" + this.isDappBtc + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dappUrl);
        parcel.writeString(this.dappId);
        parcel.writeString(this.category);
        parcel.writeSerializable(this.dappSupportCheck);
        parcel.writeInt(this.isDappBtc ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletSelectDappCustomParams> serializer() {
            return WalletSelectDappCustomParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletSelectDappCustomParams(int i, String str, String str2, String str3, DappSupportCheck dappSupportCheck, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dappUrl = null;
        } else {
            this.dappUrl = str;
        }
        if ((i & 2) == 0) {
            this.dappId = null;
        } else {
            this.dappId = str2;
        }
        if ((i & 4) == 0) {
            this.category = null;
        } else {
            this.category = str3;
        }
        if ((i & 8) == 0) {
            this.dappSupportCheck = null;
        } else {
            this.dappSupportCheck = dappSupportCheck;
        }
        if ((i & 16) == 0) {
            this.isDappBtc = false;
        } else {
            this.isDappBtc = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(WalletSelectDappCustomParams walletSelectDappCustomParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletSelectDappCustomParams.dappUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletSelectDappCustomParams.dappUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletSelectDappCustomParams.dappId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletSelectDappCustomParams.dappId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletSelectDappCustomParams.category != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletSelectDappCustomParams.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletSelectDappCustomParams.dappSupportCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DappSupportCheck$$serializer.INSTANCE, walletSelectDappCustomParams.dappSupportCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletSelectDappCustomParams.isDappBtc) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, walletSelectDappCustomParams.isDappBtc);
        }
    }

    public WalletSelectDappCustomParams(String str, String str2, String str3, DappSupportCheck dappSupportCheck, boolean z) {
        this.dappUrl = str;
        this.dappId = str2;
        this.category = str3;
        this.dappSupportCheck = dappSupportCheck;
        this.isDappBtc = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:com.okinc.wallet.api.bean.DappSupportCheck:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 com.okinc.wallet.api.bean.DappSupportCheck) : (null com.okinc.wallet.api.bean.DappSupportCheck))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.DappSupportCheck, boolean):void (m)] (LINE:223) call: com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.DappSupportCheck, boolean):void type: THIS */
    public /* synthetic */ WalletSelectDappCustomParams(String str, String str2, String str3, DappSupportCheck dappSupportCheck, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? dappSupportCheck : null, (i & 16) != 0 ? false : z);
    }
}
