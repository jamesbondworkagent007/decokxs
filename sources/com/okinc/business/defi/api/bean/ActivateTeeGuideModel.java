package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ActivateTeeGuideModel implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final int addressIndex;
    private final int bcakTo;
    private final int from;
    private final boolean isNeedToCreateNewAccount;
    private final String pathSource;
    private final String rootWalletId;
    private final boolean showSelectWalletEntry;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ActivateTeeGuideModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActivateTeeGuideModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateTeeGuideModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ActivateTeeGuideModel(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivateTeeGuideModel[] newArray(int i) {
            return new ActivateTeeGuideModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showSelectWalletEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isNeedToCreateNewAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.bcakTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pathSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTeeGuideModel copy(@NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2, int i3, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ActivateTeeGuideModel(str, z, z2, str2, i, i2, i3, str3);
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
        if (!(obj instanceof ActivateTeeGuideModel)) {
            return false;
        }
        ActivateTeeGuideModel activateTeeGuideModel = (ActivateTeeGuideModel) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) activateTeeGuideModel.accountId) && this.showSelectWalletEntry == activateTeeGuideModel.showSelectWalletEntry && this.isNeedToCreateNewAccount == activateTeeGuideModel.isNeedToCreateNewAccount && Intrinsics.EZpvd((Object) this.rootWalletId, (Object) activateTeeGuideModel.rootWalletId) && this.addressIndex == activateTeeGuideModel.addressIndex && this.from == activateTeeGuideModel.from && this.bcakTo == activateTeeGuideModel.bcakTo && Intrinsics.EZpvd((Object) this.pathSource, (Object) activateTeeGuideModel.pathSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBcakTo() {
        return this.bcakTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPathSource() {
        return this.pathSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootWalletId() {
        return this.rootWalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSelectWalletEntry() {
        return this.showSelectWalletEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.accountId.hashCode() * 31) + Boolean.hashCode(this.showSelectWalletEntry)) * 31) + Boolean.hashCode(this.isNeedToCreateNewAccount)) * 31) + this.rootWalletId.hashCode()) * 31) + Integer.hashCode(this.addressIndex)) * 31) + Integer.hashCode(this.from)) * 31) + Integer.hashCode(this.bcakTo)) * 31) + this.pathSource.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedToCreateNewAccount() {
        return this.isNeedToCreateNewAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTeeGuideModel(accountId=" + this.accountId + ", showSelectWalletEntry=" + this.showSelectWalletEntry + ", isNeedToCreateNewAccount=" + this.isNeedToCreateNewAccount + ", rootWalletId=" + this.rootWalletId + ", addressIndex=" + this.addressIndex + ", from=" + this.from + ", bcakTo=" + this.bcakTo + ", pathSource=" + this.pathSource + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeInt(this.showSelectWalletEntry ? 1 : 0);
        parcel.writeInt(this.isNeedToCreateNewAccount ? 1 : 0);
        parcel.writeString(this.rootWalletId);
        parcel.writeInt(this.addressIndex);
        parcel.writeInt(this.from);
        parcel.writeInt(this.bcakTo);
        parcel.writeString(this.pathSource);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.ActivateTeeGuideModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivateTeeGuideModel> serializer() {
            return ActivateTeeGuideModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivateTeeGuideModel(int i, String str, boolean z, boolean z2, String str2, int i2, int i3, int i4, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (129 != (i & 129)) {
            PluginExceptionsKt.throwMissingFieldException(i, 129, ActivateTeeGuideModel$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        if ((i & 2) == 0) {
            this.showSelectWalletEntry = false;
        } else {
            this.showSelectWalletEntry = z;
        }
        if ((i & 4) == 0) {
            this.isNeedToCreateNewAccount = false;
        } else {
            this.isNeedToCreateNewAccount = z2;
        }
        if ((i & 8) == 0) {
            this.rootWalletId = "";
        } else {
            this.rootWalletId = str2;
        }
        if ((i & 16) == 0) {
            this.addressIndex = 0;
        } else {
            this.addressIndex = i2;
        }
        if ((i & 32) == 0) {
            this.from = 0;
        } else {
            this.from = i3;
        }
        if ((i & 64) == 0) {
            this.bcakTo = 0;
        } else {
            this.bcakTo = i4;
        }
        this.pathSource = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(ActivateTeeGuideModel activateTeeGuideModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, activateTeeGuideModel.accountId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || activateTeeGuideModel.showSelectWalletEntry) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, activateTeeGuideModel.showSelectWalletEntry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || activateTeeGuideModel.isNeedToCreateNewAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, activateTeeGuideModel.isNeedToCreateNewAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) activateTeeGuideModel.rootWalletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, activateTeeGuideModel.rootWalletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || activateTeeGuideModel.addressIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, activateTeeGuideModel.addressIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || activateTeeGuideModel.from != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, activateTeeGuideModel.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || activateTeeGuideModel.bcakTo != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, activateTeeGuideModel.bcakTo);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, activateTeeGuideModel.pathSource);
    }

    public ActivateTeeGuideModel(@NotNull String str, boolean z, boolean z2, @NotNull String str2, int i, int i2, int i3, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.showSelectWalletEntry = z;
        this.isNeedToCreateNewAccount = z2;
        this.rootWalletId = str2;
        this.addressIndex = i;
        this.from = i2;
        this.bcakTo = i3;
        this.pathSource = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (r19v0 java.lang.String)
 A[MD:(java.lang.String, boolean, boolean, java.lang.String, int, int, int, java.lang.String):void (m)] (LINE:17) call: com.okinc.business.defi.api.bean.ActivateTeeGuideModel.<init>(java.lang.String, boolean, boolean, java.lang.String, int, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ ActivateTeeGuideModel(String str, boolean z, boolean z2, String str2, int i, int i2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, str3);
    }
}
