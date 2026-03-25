package com.okinc.cedefi.data;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OKTDexEmailState implements Parcelable {
    public static final int $stable = 0;
    private final boolean isValidEmail;
    private final boolean noEmail;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKTDexEmailState> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKTDexEmailState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexEmailState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTDexEmailState(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTDexEmailState[] newArray(int i) {
            return new OKTDexEmailState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public OKTDexEmailState() {
        boolean z = false;
        this(z, z, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKTDexEmailState copy$default(OKTDexEmailState oKTDexEmailState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = oKTDexEmailState.isValidEmail;
        }
        if ((i & 2) != 0) {
            z2 = oKTDexEmailState.noEmail;
        }
        return oKTDexEmailState.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexEmailState copy(boolean z, boolean z2) {
        return new OKTDexEmailState(z, z2);
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
        if (!(obj instanceof OKTDexEmailState)) {
            return false;
        }
        OKTDexEmailState oKTDexEmailState = (OKTDexEmailState) obj;
        return this.isValidEmail == oKTDexEmailState.isValidEmail && this.noEmail == oKTDexEmailState.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNoEmail() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.isValidEmail) * 31) + Boolean.hashCode(this.noEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValidEmail() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexEmailState(isValidEmail=" + this.isValidEmail + ", noEmail=" + this.noEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isValidEmail ? 1 : 0);
        parcel.writeInt(this.noEmail ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cedefi.data.OKTDexEmailState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexEmailState> serializer() {
            return OKTDexEmailState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTDexEmailState(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        this.isValidEmail = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.noEmail = false;
        } else {
            this.noEmail = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(OKTDexEmailState oKTDexEmailState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !oKTDexEmailState.isValidEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, oKTDexEmailState.isValidEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKTDexEmailState.noEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, oKTDexEmailState.noEmail);
        }
    }

    public OKTDexEmailState(boolean z, boolean z2) {
        this.isValidEmail = z;
        this.noEmail = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:11) call: com.okinc.cedefi.data.OKTDexEmailState.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ OKTDexEmailState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }
}
