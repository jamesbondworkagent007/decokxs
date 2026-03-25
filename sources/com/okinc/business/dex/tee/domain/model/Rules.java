package com.okinc.business.dex.tee.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Rules implements Parcelable {
    public static final int $stable = 0;
    public static final int SELL_TYPE_STOP_LOSS = 2;
    public static final int SELL_TYPE_TAKE_PROFIT = 1;
    private final String changeScale;
    private final String sellScale;
    private final int sellType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Rules> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Rules> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rules createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Rules(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rules[] newArray(int i) {
            return new Rules[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rules() {
        this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Rules copy$default(Rules rules, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rules.sellType;
        }
        if ((i2 & 2) != 0) {
            str = rules.changeScale;
        }
        if ((i2 & 4) != 0) {
            str2 = rules.sellScale;
        }
        return rules.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.changeScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sellScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rules copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Rules(i, str, str2);
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
        if (!(obj instanceof Rules)) {
            return false;
        }
        Rules rules = (Rules) obj;
        return this.sellType == rules.sellType && Intrinsics.EZpvd((Object) this.changeScale, (Object) rules.changeScale) && Intrinsics.EZpvd((Object) this.sellScale, (Object) rules.sellScale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeScale() {
        return this.changeScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellScale() {
        return this.sellScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSellType() {
        return this.sellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.sellType) * 31) + this.changeScale.hashCode()) * 31) + this.sellScale.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Rules(sellType=" + this.sellType + ", changeScale=" + this.changeScale + ", sellScale=" + this.sellScale + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sellType);
        parcel.writeString(this.changeScale);
        parcel.writeString(this.sellScale);
    }

    public /* synthetic */ Rules(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.sellType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.changeScale = "";
        } else {
            this.changeScale = str;
        }
        if ((i & 4) == 0) {
            this.sellScale = "";
        } else {
            this.sellScale = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(Rules rules, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rules.sellType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, rules.sellType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rules.changeScale, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rules.changeScale);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) rules.sellScale, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rules.sellScale);
    }

    public Rules(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sellType = i;
        this.changeScale = str;
        this.sellScale = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:90) call: com.okinc.business.dex.tee.domain.model.Rules.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Rules(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.Rules.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Rules> serializer() {
            return Rules$$serializer.INSTANCE;
        }
    }
}
