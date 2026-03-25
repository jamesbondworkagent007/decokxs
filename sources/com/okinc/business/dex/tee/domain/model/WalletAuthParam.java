package com.okinc.business.dex.tee.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletAuthParam implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final String address;
    private final String chainId;
    private final String command;
    private final String signMsg;
    private final String signature;
    private final String teeId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WalletAuthParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletAuthParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAuthParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletAuthParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAuthParam[] newArray(int i) {
            return new WalletAuthParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAuthParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletAuthParam copy$default(WalletAuthParam walletAuthParam, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAuthParam.signMsg;
        }
        if ((i & 2) != 0) {
            str2 = walletAuthParam.signature;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = walletAuthParam.accountId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = walletAuthParam.address;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = walletAuthParam.teeId;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = walletAuthParam.chainId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = walletAuthParam.command;
        }
        return walletAuthParam.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAuthParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new WalletAuthParam(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof WalletAuthParam)) {
            return false;
        }
        WalletAuthParam walletAuthParam = (WalletAuthParam) obj;
        return Intrinsics.EZpvd((Object) this.signMsg, (Object) walletAuthParam.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) walletAuthParam.signature) && Intrinsics.EZpvd((Object) this.accountId, (Object) walletAuthParam.accountId) && Intrinsics.EZpvd((Object) this.address, (Object) walletAuthParam.address) && Intrinsics.EZpvd((Object) this.teeId, (Object) walletAuthParam.teeId) && Intrinsics.EZpvd((Object) this.chainId, (Object) walletAuthParam.chainId) && Intrinsics.EZpvd((Object) this.command, (Object) walletAuthParam.command);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMsg() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.signMsg.hashCode() * 31) + this.signature.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.address.hashCode()) * 31) + this.teeId.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.command.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAuthParam(signMsg=" + this.signMsg + ", signature=" + this.signature + ", accountId=" + this.accountId + ", address=" + this.address + ", teeId=" + this.teeId + ", chainId=" + this.chainId + ", command=" + this.command + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signMsg);
        parcel.writeString(this.signature);
        parcel.writeString(this.accountId);
        parcel.writeString(this.address);
        parcel.writeString(this.teeId);
        parcel.writeString(this.chainId);
        parcel.writeString(this.command);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.WalletAuthParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAuthParam> serializer() {
            return WalletAuthParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAuthParam(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signMsg = "";
        } else {
            this.signMsg = str;
        }
        if ((i & 2) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
        if ((i & 4) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str3;
        }
        if ((i & 8) == 0) {
            this.address = "";
        } else {
            this.address = str4;
        }
        if ((i & 16) == 0) {
            this.teeId = "";
        } else {
            this.teeId = str5;
        }
        if ((i & 32) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str6;
        }
        if ((i & 64) == 0) {
            this.command = "";
        } else {
            this.command = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(WalletAuthParam walletAuthParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletAuthParam.signMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, walletAuthParam.signMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletAuthParam.signature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletAuthParam.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletAuthParam.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, walletAuthParam.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) walletAuthParam.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, walletAuthParam.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) walletAuthParam.teeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, walletAuthParam.teeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) walletAuthParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, walletAuthParam.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) walletAuthParam.command, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, walletAuthParam.command);
    }

    public WalletAuthParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.signMsg = str;
        this.signature = str2;
        this.accountId = str3;
        this.address = str4;
        this.teeId = str5;
        this.chainId = str6;
        this.command = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63) call: com.okinc.business.dex.tee.domain.model.WalletAuthParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletAuthParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
