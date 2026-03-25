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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SupportCustomCoinChain implements Parcelable {
    private long coinId;
    private boolean enableGas;
    private String imageUrl;
    private String name;
    private String shortName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportCustomCoinChain> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SupportCustomCoinChain> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCustomCoinChain createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportCustomCoinChain(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCustomCoinChain[] newArray(int i) {
            return new SupportCustomCoinChain[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCustomCoinChain() {
        this((String) null, (String) null, (String) null, false, 0L, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportCustomCoinChain copy$default(SupportCustomCoinChain supportCustomCoinChain, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportCustomCoinChain.name;
        }
        if ((i & 2) != 0) {
            str2 = supportCustomCoinChain.imageUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = supportCustomCoinChain.shortName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = supportCustomCoinChain.enableGas;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j = supportCustomCoinChain.coinId;
        }
        return supportCustomCoinChain.copy(str, str4, str5, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shortName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.enableGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCustomCoinChain copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportCustomCoinChain(str, str2, str3, z, j);
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
        if (!(obj instanceof SupportCustomCoinChain)) {
            return false;
        }
        SupportCustomCoinChain supportCustomCoinChain = (SupportCustomCoinChain) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) supportCustomCoinChain.name) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) supportCustomCoinChain.imageUrl) && Intrinsics.EZpvd((Object) this.shortName, (Object) supportCustomCoinChain.shortName) && this.enableGas == supportCustomCoinChain.enableGas && this.coinId == supportCustomCoinChain.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableGas() {
        return this.enableGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.shortName.hashCode()) * 31) + Boolean.hashCode(this.enableGas)) * 31) + Long.hashCode(this.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableGas(boolean z) {
        this.enableGas = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCustomCoinChain(name=" + this.name + ", imageUrl=" + this.imageUrl + ", shortName=" + this.shortName + ", enableGas=" + this.enableGas + ", coinId=" + this.coinId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.shortName);
        parcel.writeInt(this.enableGas ? 1 : 0);
        parcel.writeLong(this.coinId);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SupportCustomCoinChain.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportCustomCoinChain> serializer() {
            return SupportCustomCoinChain$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportCustomCoinChain(int i, String str, String str2, String str3, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.shortName = "";
        } else {
            this.shortName = str3;
        }
        if ((i & 8) == 0) {
            this.enableGas = false;
        } else {
            this.enableGas = z;
        }
        if ((i & 16) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SupportCustomCoinChain supportCustomCoinChain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportCustomCoinChain.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportCustomCoinChain.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) supportCustomCoinChain.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, supportCustomCoinChain.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) supportCustomCoinChain.shortName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, supportCustomCoinChain.shortName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportCustomCoinChain.enableGas) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, supportCustomCoinChain.enableGas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && supportCustomCoinChain.coinId == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 4, supportCustomCoinChain.coinId);
    }

    public SupportCustomCoinChain(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.imageUrl = str2;
        this.shortName = str3;
        this.enableGas = z;
        this.coinId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, long):void (m)] (LINE:147) call: com.okinc.business.defi.biz.net.bean.SupportCustomCoinChain.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, long):void type: THIS */
    public /* synthetic */ SupportCustomCoinChain(String str, String str2, String str3, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j);
    }
}
