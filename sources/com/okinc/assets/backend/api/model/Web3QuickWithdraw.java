package com.okinc.assets.backend.api.model;

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
public final class Web3QuickWithdraw implements Parcelable {
    public static final int $stable = 0;
    private final boolean firstWithdraw;
    private final boolean skipAuthLimitExceeded;
    private final int skipAuthLimitUSD;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Web3QuickWithdraw> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Web3QuickWithdraw> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3QuickWithdraw createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3QuickWithdraw(parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3QuickWithdraw[] newArray(int i) {
            return new Web3QuickWithdraw[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3QuickWithdraw() {
        this(false, 0, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Web3QuickWithdraw copy$default(Web3QuickWithdraw web3QuickWithdraw, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = web3QuickWithdraw.skipAuthLimitExceeded;
        }
        if ((i2 & 2) != 0) {
            i = web3QuickWithdraw.skipAuthLimitUSD;
        }
        if ((i2 & 4) != 0) {
            z2 = web3QuickWithdraw.firstWithdraw;
        }
        return web3QuickWithdraw.copy(z, i, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.skipAuthLimitExceeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.skipAuthLimitUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.firstWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3QuickWithdraw copy(boolean z, int i, boolean z2) {
        return new Web3QuickWithdraw(z, i, z2);
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
        if (!(obj instanceof Web3QuickWithdraw)) {
            return false;
        }
        Web3QuickWithdraw web3QuickWithdraw = (Web3QuickWithdraw) obj;
        return this.skipAuthLimitExceeded == web3QuickWithdraw.skipAuthLimitExceeded && this.skipAuthLimitUSD == web3QuickWithdraw.skipAuthLimitUSD && this.firstWithdraw == web3QuickWithdraw.firstWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFirstWithdraw() {
        return this.firstWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSkipAuthLimitExceeded() {
        return this.skipAuthLimitExceeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSkipAuthLimitUSD() {
        return this.skipAuthLimitUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.skipAuthLimitExceeded) * 31) + Integer.hashCode(this.skipAuthLimitUSD)) * 31) + Boolean.hashCode(this.firstWithdraw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3QuickWithdraw(skipAuthLimitExceeded=" + this.skipAuthLimitExceeded + ", skipAuthLimitUSD=" + this.skipAuthLimitUSD + ", firstWithdraw=" + this.firstWithdraw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.skipAuthLimitExceeded ? 1 : 0);
        parcel.writeInt(this.skipAuthLimitUSD);
        parcel.writeInt(this.firstWithdraw ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.Web3QuickWithdraw.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3QuickWithdraw> serializer() {
            return Web3QuickWithdraw$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3QuickWithdraw(int i, boolean z, int i2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.skipAuthLimitExceeded = false;
        } else {
            this.skipAuthLimitExceeded = z;
        }
        if ((i & 2) == 0) {
            this.skipAuthLimitUSD = 0;
        } else {
            this.skipAuthLimitUSD = i2;
        }
        if ((i & 4) == 0) {
            this.firstWithdraw = false;
        } else {
            this.firstWithdraw = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(Web3QuickWithdraw web3QuickWithdraw, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || web3QuickWithdraw.skipAuthLimitExceeded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, web3QuickWithdraw.skipAuthLimitExceeded);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || web3QuickWithdraw.skipAuthLimitUSD != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, web3QuickWithdraw.skipAuthLimitUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || web3QuickWithdraw.firstWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, web3QuickWithdraw.firstWithdraw);
        }
    }

    public Web3QuickWithdraw(boolean z, int i, boolean z2) {
        this.skipAuthLimitExceeded = z;
        this.skipAuthLimitUSD = i;
        this.firstWithdraw = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, int, boolean):void (m)] (LINE:121) call: com.okinc.assets.backend.api.model.Web3QuickWithdraw.<init>(boolean, int, boolean):void type: THIS */
    public /* synthetic */ Web3QuickWithdraw(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z2);
    }
}
