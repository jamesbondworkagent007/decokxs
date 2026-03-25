package com.okinc.business.trade.features.home.ui.meme.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class FeeOption implements Parcelable {
    private final int feeLevel;
    private String feeValue;
    private boolean selected;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeeOption> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FeeOption> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FeeOption(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeOption[] newArray(int i) {
            return new FeeOption[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeeOption() {
        this(0, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FeeOption copy$default(FeeOption feeOption, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = feeOption.feeLevel;
        }
        if ((i2 & 2) != 0) {
            str = feeOption.feeValue;
        }
        if ((i2 & 4) != 0) {
            z = feeOption.selected;
        }
        return feeOption.copy(i, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeOption copy(int i, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FeeOption(i, str, z);
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
        if (!(obj instanceof FeeOption)) {
            return false;
        }
        FeeOption feeOption = (FeeOption) obj;
        return this.feeLevel == feeOption.feeLevel && Intrinsics.EZpvd((Object) this.feeValue, (Object) feeOption.feeValue) && this.selected == feeOption.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeLevel() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.feeLevel) * 31) + this.feeValue.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeeOption(feeLevel=" + this.feeLevel + ", feeValue=" + this.feeValue + ", selected=" + this.selected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.feeLevel);
        parcel.writeString(this.feeValue);
        parcel.writeInt(this.selected ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.FeeOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeeOption> serializer() {
            return FeeOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeeOption(int i, int i2, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.feeLevel = 0;
        } else {
            this.feeLevel = i2;
        }
        if ((i & 2) == 0) {
            this.feeValue = "";
        } else {
            this.feeValue = str;
        }
        if ((i & 4) == 0) {
            this.selected = false;
        } else {
            this.selected = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(FeeOption feeOption, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || feeOption.feeLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, feeOption.feeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) feeOption.feeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, feeOption.feeValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || feeOption.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, feeOption.selected);
        }
    }

    public FeeOption(int i, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeLevel = i;
        this.feeValue = str;
        this.selected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, java.lang.String, boolean):void (m)] (LINE:90) call: com.okinc.business.trade.features.home.ui.meme.data.FeeOption.<init>(int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ FeeOption(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z);
    }
}
