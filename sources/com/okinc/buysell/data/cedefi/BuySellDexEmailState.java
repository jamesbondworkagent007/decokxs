package com.okinc.buysell.data.cedefi;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BuySellDexEmailState implements Parcelable {
    public static final int $stable = 0;
    private final boolean isValidEmail;
    private final boolean noEmail;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BuySellDexEmailState> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BuySellDexEmailState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellDexEmailState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellDexEmailState(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellDexEmailState[] newArray(int i) {
            return new BuySellDexEmailState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public BuySellDexEmailState() {
        boolean z = false;
        this(z, z, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellDexEmailState copy$default(BuySellDexEmailState buySellDexEmailState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buySellDexEmailState.isValidEmail;
        }
        if ((i & 2) != 0) {
            z2 = buySellDexEmailState.noEmail;
        }
        return buySellDexEmailState.copy(z, z2);
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
    public final BuySellDexEmailState copy(boolean z, boolean z2) {
        return new BuySellDexEmailState(z, z2);
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
        if (!(obj instanceof BuySellDexEmailState)) {
            return false;
        }
        BuySellDexEmailState buySellDexEmailState = (BuySellDexEmailState) obj;
        return this.isValidEmail == buySellDexEmailState.isValidEmail && this.noEmail == buySellDexEmailState.noEmail;
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
        return "BuySellDexEmailState(isValidEmail=" + this.isValidEmail + ", noEmail=" + this.noEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isValidEmail ? 1 : 0);
        parcel.writeInt(this.noEmail ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.cedefi.BuySellDexEmailState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuySellDexEmailState> serializer() {
            return BuySellDexEmailState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuySellDexEmailState(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        this.isValidEmail = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.noEmail = false;
        } else {
            this.noEmail = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(BuySellDexEmailState buySellDexEmailState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !buySellDexEmailState.isValidEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, buySellDexEmailState.isValidEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buySellDexEmailState.noEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, buySellDexEmailState.noEmail);
        }
    }

    public BuySellDexEmailState(boolean z, boolean z2) {
        this.isValidEmail = z;
        this.noEmail = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:11) call: com.okinc.buysell.data.cedefi.BuySellDexEmailState.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ BuySellDexEmailState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }
}
