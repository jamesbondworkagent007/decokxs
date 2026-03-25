package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class FactionInfo implements Parcelable {
    public static final int FACTION_TYPE_APTOS = 5;
    public static final int FACTION_TYPE_BITCOIN = 6;
    public static final int FACTION_TYPE_COSMOS = 2;
    public static final int FACTION_TYPE_EVM = 1;
    public static final int FACTION_TYPE_SOL = 4;
    private FactionInfoExtData extData;
    private int factionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FactionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FactionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FactionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FactionInfo(parcel.readInt(), parcel.readInt() == 0 ? null : FactionInfoExtData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FactionInfo[] newArray(int i) {
            return new FactionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FactionInfo() {
        this(0, (FactionInfoExtData) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FactionInfo copy$default(FactionInfo factionInfo, int i, FactionInfoExtData factionInfoExtData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = factionInfo.factionType;
        }
        if ((i2 & 2) != 0) {
            factionInfoExtData = factionInfo.extData;
        }
        return factionInfo.copy(i, factionInfoExtData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.factionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfoExtData component2() {
        return this.extData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfo copy(int i, FactionInfoExtData factionInfoExtData) {
        return new FactionInfo(i, factionInfoExtData);
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
        if (!(obj instanceof FactionInfo)) {
            return false;
        }
        FactionInfo factionInfo = (FactionInfo) obj;
        return this.factionType == factionInfo.factionType && Intrinsics.EZpvd(this.extData, factionInfo.extData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfoExtData getExtData() {
        return this.extData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFactionType() {
        return this.factionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.factionType);
        FactionInfoExtData factionInfoExtData = this.extData;
        return (iHashCode * 31) + (factionInfoExtData == null ? 0 : factionInfoExtData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAptos() {
        return this.factionType == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBitcoin() {
        return this.factionType == 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCosmos() {
        return this.factionType == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEVM() {
        return this.factionType == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNotFaction() {
        return this.factionType == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSVM() {
        return this.factionType == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtData(FactionInfoExtData factionInfoExtData) {
        this.extData = factionInfoExtData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactionType(int i) {
        this.factionType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FactionInfo(factionType=" + this.factionType + ", extData=" + this.extData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.factionType);
        FactionInfoExtData factionInfoExtData = this.extData;
        if (factionInfoExtData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            factionInfoExtData.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FactionInfo(int i, int i2, FactionInfoExtData factionInfoExtData, SerializationConstructorMarker serializationConstructorMarker) {
        this.factionType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.extData = null;
        } else {
            this.extData = factionInfoExtData;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FactionInfo factionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || factionInfo.factionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, factionInfo.factionType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && factionInfo.extData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, FactionInfoExtData$$serializer.INSTANCE, factionInfo.extData);
    }

    public FactionInfo(int i, FactionInfoExtData factionInfoExtData) {
        this.factionType = i;
        this.extData = factionInfoExtData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:com.okinc.business.defi.biz.net.bean.FactionInfoExtData:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.FactionInfoExtData) : (r2v0 com.okinc.business.defi.biz.net.bean.FactionInfoExtData))
 A[MD:(int, com.okinc.business.defi.biz.net.bean.FactionInfoExtData):void (m)] (LINE:101) call: com.okinc.business.defi.biz.net.bean.FactionInfo.<init>(int, com.okinc.business.defi.biz.net.bean.FactionInfoExtData):void type: THIS */
    public /* synthetic */ FactionInfo(int i, FactionInfoExtData factionInfoExtData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : factionInfoExtData);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.FactionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FactionInfo> serializer() {
            return FactionInfo$$serializer.INSTANCE;
        }
    }

    public final String getAddressHrp() {
        FactionInfoExtData factionInfoExtData;
        if (!isCosmos() || (factionInfoExtData = this.extData) == null) {
            return null;
        }
        return factionInfoExtData.getCosmosPrefix();
    }
}
