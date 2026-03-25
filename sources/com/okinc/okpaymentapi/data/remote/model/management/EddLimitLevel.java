package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class EddLimitLevel implements Parcelable {
    public static final int $stable = 0;
    private final boolean allowIncreaseLimit;
    private final int currentLimitLevel;
    private final int maxLimitLevel;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EddLimitLevel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EddLimitLevel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EddLimitLevel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EddLimitLevel(parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EddLimitLevel[] newArray(int i) {
            return new EddLimitLevel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EddLimitLevel() {
        this(0, false, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EddLimitLevel copy$default(EddLimitLevel eddLimitLevel, int i, boolean z, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = eddLimitLevel.maxLimitLevel;
        }
        if ((i3 & 2) != 0) {
            z = eddLimitLevel.allowIncreaseLimit;
        }
        if ((i3 & 4) != 0) {
            i2 = eddLimitLevel.currentLimitLevel;
        }
        if ((i3 & 8) != 0) {
            str = eddLimitLevel.status;
        }
        return eddLimitLevel.copy(i, z, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.allowIncreaseLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.currentLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EddLimitLevel copy(int i, boolean z, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EddLimitLevel(i, z, i2, str);
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
        if (!(obj instanceof EddLimitLevel)) {
            return false;
        }
        EddLimitLevel eddLimitLevel = (EddLimitLevel) obj;
        return this.maxLimitLevel == eddLimitLevel.maxLimitLevel && this.allowIncreaseLimit == eddLimitLevel.allowIncreaseLimit && this.currentLimitLevel == eddLimitLevel.currentLimitLevel && Intrinsics.EZpvd((Object) this.status, (Object) eddLimitLevel.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowIncreaseLimit() {
        return this.allowIncreaseLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentLimitLevel() {
        return this.currentLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxLimitLevel() {
        return this.maxLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.maxLimitLevel) * 31) + Boolean.hashCode(this.allowIncreaseLimit)) * 31) + Integer.hashCode(this.currentLimitLevel)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EddLimitLevel(maxLimitLevel=" + this.maxLimitLevel + ", allowIncreaseLimit=" + this.allowIncreaseLimit + ", currentLimitLevel=" + this.currentLimitLevel + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.maxLimitLevel);
        parcel.writeInt(this.allowIncreaseLimit ? 1 : 0);
        parcel.writeInt(this.currentLimitLevel);
        parcel.writeString(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.EddLimitLevel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EddLimitLevel> serializer() {
            return EddLimitLevel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EddLimitLevel(int i, int i2, boolean z, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.maxLimitLevel = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.allowIncreaseLimit = false;
        } else {
            this.allowIncreaseLimit = z;
        }
        if ((i & 4) == 0) {
            this.currentLimitLevel = 1;
        } else {
            this.currentLimitLevel = i3;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(EddLimitLevel eddLimitLevel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eddLimitLevel.maxLimitLevel != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, eddLimitLevel.maxLimitLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eddLimitLevel.allowIncreaseLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, eddLimitLevel.allowIncreaseLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eddLimitLevel.currentLimitLevel != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, eddLimitLevel.currentLimitLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) eddLimitLevel.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eddLimitLevel.status);
    }

    public EddLimitLevel(int i, boolean z, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxLimitLevel = i;
        this.allowIncreaseLimit = z;
        this.currentLimitLevel = i2;
        this.status = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, boolean, int, java.lang.String):void (m)] (LINE:303) call: com.okinc.okpaymentapi.data.remote.model.management.EddLimitLevel.<init>(int, boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ EddLimitLevel(int i, boolean z, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? "" : str);
    }
}
