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
public final class SlippageRange implements Parcelable {
    private boolean selected;
    private final int slippageLevel;
    private String slippageValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SlippageRange> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SlippageRange> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SlippageRange(parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageRange[] newArray(int i) {
            return new SlippageRange[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SlippageRange() {
        this(false, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SlippageRange copy$default(SlippageRange slippageRange, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = slippageRange.selected;
        }
        if ((i2 & 2) != 0) {
            i = slippageRange.slippageLevel;
        }
        if ((i2 & 4) != 0) {
            str = slippageRange.slippageValue;
        }
        return slippageRange.copy(z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageRange copy(boolean z, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SlippageRange(z, i, str);
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
        if (!(obj instanceof SlippageRange)) {
            return false;
        }
        SlippageRange slippageRange = (SlippageRange) obj;
        return this.selected == slippageRange.selected && this.slippageLevel == slippageRange.slippageLevel && Intrinsics.EZpvd((Object) this.slippageValue, (Object) slippageRange.slippageValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageLevel() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.selected) * 31) + Integer.hashCode(this.slippageLevel)) * 31) + this.slippageValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippageValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageRange(selected=" + this.selected + ", slippageLevel=" + this.slippageLevel + ", slippageValue=" + this.slippageValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeInt(this.slippageLevel);
        parcel.writeString(this.slippageValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.SlippageRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SlippageRange> serializer() {
            return SlippageRange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SlippageRange(int i, boolean z, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.selected = false;
        } else {
            this.selected = z;
        }
        if ((i & 2) == 0) {
            this.slippageLevel = 0;
        } else {
            this.slippageLevel = i2;
        }
        if ((i & 4) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SlippageRange slippageRange, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || slippageRange.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, slippageRange.selected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || slippageRange.slippageLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, slippageRange.slippageLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) slippageRange.slippageValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, slippageRange.slippageValue);
    }

    public SlippageRange(boolean z, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selected = z;
        this.slippageLevel = i;
        this.slippageValue = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, int, java.lang.String):void (m)] (LINE:142) call: com.okinc.business.trade.features.home.ui.meme.data.SlippageRange.<init>(boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ SlippageRange(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
