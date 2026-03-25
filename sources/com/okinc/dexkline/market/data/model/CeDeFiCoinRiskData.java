package com.okinc.dexkline.market.data.model;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CeDeFiCoinRiskData implements Parcelable {
    public static final int $stable = 0;
    public final String chain;
    public final String contractAddress;
    public final int newRiskTotalLevel;
    public final boolean showFeedTab;
    public final boolean verified;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CeDeFiCoinRiskData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CeDeFiCoinRiskData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiCoinRiskData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeDeFiCoinRiskData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiCoinRiskData[] newArray(int i) {
            return new CeDeFiCoinRiskData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDeFiCoinRiskData copy$default(CeDeFiCoinRiskData ceDeFiCoinRiskData, String str, String str2, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ceDeFiCoinRiskData.chain;
        }
        if ((i2 & 2) != 0) {
            str2 = ceDeFiCoinRiskData.contractAddress;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = ceDeFiCoinRiskData.newRiskTotalLevel;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = ceDeFiCoinRiskData.verified;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = ceDeFiCoinRiskData.showFeedTab;
        }
        return ceDeFiCoinRiskData.AEQbTJ(str, str3, i3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDeFiCoinRiskData AEQbTJ(@NotNull String str, @NotNull String str2, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CeDeFiCoinRiskData(str, str2, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.verified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.showFeedTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.newRiskTotalLevel;
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
        if (!(obj instanceof CeDeFiCoinRiskData)) {
            return false;
        }
        CeDeFiCoinRiskData ceDeFiCoinRiskData = (CeDeFiCoinRiskData) obj;
        return Intrinsics.EZpvd((Object) this.chain, (Object) ceDeFiCoinRiskData.chain) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) ceDeFiCoinRiskData.contractAddress) && this.newRiskTotalLevel == ceDeFiCoinRiskData.newRiskTotalLevel && this.verified == ceDeFiCoinRiskData.verified && this.showFeedTab == ceDeFiCoinRiskData.showFeedTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.chain.hashCode() * 31) + this.contractAddress.hashCode()) * 31) + Integer.hashCode(this.newRiskTotalLevel)) * 31) + Boolean.hashCode(this.verified)) * 31) + Boolean.hashCode(this.showFeedTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDeFiCoinRiskData(chain=" + this.chain + ", contractAddress=" + this.contractAddress + ", newRiskTotalLevel=" + this.newRiskTotalLevel + ", verified=" + this.verified + ", showFeedTab=" + this.showFeedTab + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chain);
        parcel.writeString(this.contractAddress);
        parcel.writeInt(this.newRiskTotalLevel);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeInt(this.showFeedTab ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.CeDeFiCoinRiskData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDeFiCoinRiskData> serializer() {
            return CeDeFiCoinRiskData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDeFiCoinRiskData(int i, String str, String str2, int i2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.throwMissingFieldException(i, 28, CeDeFiCoinRiskData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chain = "";
        } else {
            this.chain = str;
        }
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str2;
        }
        this.newRiskTotalLevel = i2;
        this.verified = z;
        this.showFeedTab = z2;
    }

    public static final /* synthetic */ void copydefault(CeDeFiCoinRiskData ceDeFiCoinRiskData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) ceDeFiCoinRiskData.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDeFiCoinRiskData.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) ceDeFiCoinRiskData.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDeFiCoinRiskData.contractAddress);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, ceDeFiCoinRiskData.newRiskTotalLevel);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, ceDeFiCoinRiskData.verified);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, ceDeFiCoinRiskData.showFeedTab);
    }

    public CeDeFiCoinRiskData(@NotNull String str, @NotNull String str2, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chain = str;
        this.contractAddress = str2;
        this.newRiskTotalLevel = i;
        this.verified = z;
        this.showFeedTab = z2;
    }
}
