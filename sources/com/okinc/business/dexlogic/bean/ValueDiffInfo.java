package com.okinc.business.dexlogic.bean;

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
public final class ValueDiffInfo implements Parcelable {
    public static final int $stable = 0;
    private final String diffPercent;
    private final String diffValue;
    private final boolean showValueDiffWarn;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ValueDiffInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ValueDiffInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValueDiffInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ValueDiffInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValueDiffInfo[] newArray(int i) {
            return new ValueDiffInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValueDiffInfo() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValueDiffInfo copy$default(ValueDiffInfo valueDiffInfo, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = valueDiffInfo.showValueDiffWarn;
        }
        if ((i & 2) != 0) {
            str = valueDiffInfo.diffValue;
        }
        if ((i & 4) != 0) {
            str2 = valueDiffInfo.diffPercent;
        }
        return valueDiffInfo.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showValueDiffWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.diffValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.diffPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValueDiffInfo copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ValueDiffInfo(z, str, str2);
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
        if (!(obj instanceof ValueDiffInfo)) {
            return false;
        }
        ValueDiffInfo valueDiffInfo = (ValueDiffInfo) obj;
        return this.showValueDiffWarn == valueDiffInfo.showValueDiffWarn && Intrinsics.EZpvd((Object) this.diffValue, (Object) valueDiffInfo.diffValue) && Intrinsics.EZpvd((Object) this.diffPercent, (Object) valueDiffInfo.diffPercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffPercent() {
        return this.diffPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiffValue() {
        return this.diffValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowValueDiffWarn() {
        return this.showValueDiffWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.showValueDiffWarn) * 31) + this.diffValue.hashCode()) * 31) + this.diffPercent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValueDiffInfo(showValueDiffWarn=" + this.showValueDiffWarn + ", diffValue=" + this.diffValue + ", diffPercent=" + this.diffPercent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.showValueDiffWarn ? 1 : 0);
        parcel.writeString(this.diffValue);
        parcel.writeString(this.diffPercent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ValueDiffInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValueDiffInfo> serializer() {
            return ValueDiffInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValueDiffInfo(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.showValueDiffWarn = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.diffValue = "";
        } else {
            this.diffValue = str;
        }
        if ((i & 4) == 0) {
            this.diffPercent = "";
        } else {
            this.diffPercent = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ValueDiffInfo valueDiffInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || valueDiffInfo.showValueDiffWarn) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, valueDiffInfo.showValueDiffWarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) valueDiffInfo.diffValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, valueDiffInfo.diffValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) valueDiffInfo.diffPercent, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, valueDiffInfo.diffPercent);
    }

    public ValueDiffInfo(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.showValueDiffWarn = z;
        this.diffValue = str;
        this.diffPercent = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:108) call: com.okinc.business.dexlogic.bean.ValueDiffInfo.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ValueDiffInfo(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
