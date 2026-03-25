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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LimitPreset implements Parcelable {
    public static final int $stable = 0;
    private final Preset buyPreset;
    private final String presetType;
    private final Preset sellPreset;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LimitPreset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitPreset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitPreset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitPreset(parcel.readString(), parcel.readInt() == 0 ? null : Preset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Preset.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitPreset[] newArray(int i) {
            return new LimitPreset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitPreset() {
        this((String) null, (Preset) null, (Preset) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitPreset copy$default(LimitPreset limitPreset, String str, Preset preset, Preset preset2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitPreset.presetType;
        }
        if ((i & 2) != 0) {
            preset = limitPreset.buyPreset;
        }
        if ((i & 4) != 0) {
            preset2 = limitPreset.sellPreset;
        }
        return limitPreset.copy(str, preset, preset2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset component2() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset component3() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPreset copy(String str, Preset preset, Preset preset2) {
        return new LimitPreset(str, preset, preset2);
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
        if (!(obj instanceof LimitPreset)) {
            return false;
        }
        LimitPreset limitPreset = (LimitPreset) obj;
        return Intrinsics.EZpvd((Object) this.presetType, (Object) limitPreset.presetType) && Intrinsics.EZpvd(this.buyPreset, limitPreset.buyPreset) && Intrinsics.EZpvd(this.sellPreset, limitPreset.sellPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPresetType() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.presetType;
        int iHashCode = str == null ? 0 : str.hashCode();
        Preset preset = this.buyPreset;
        int iHashCode2 = preset == null ? 0 : preset.hashCode();
        Preset preset2 = this.sellPreset;
        return (((iHashCode * 31) + iHashCode2) * 31) + (preset2 != null ? preset2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitPreset(presetType=" + this.presetType + ", buyPreset=" + this.buyPreset + ", sellPreset=" + this.sellPreset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.presetType);
        Preset preset = this.buyPreset;
        if (preset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preset.writeToParcel(parcel, i);
        }
        Preset preset2 = this.sellPreset;
        if (preset2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preset2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.LimitPreset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitPreset> serializer() {
            return LimitPreset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitPreset(int i, String str, Preset preset, Preset preset2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.presetType = null;
        } else {
            this.presetType = str;
        }
        if ((i & 2) == 0) {
            this.buyPreset = null;
        } else {
            this.buyPreset = preset;
        }
        if ((i & 4) == 0) {
            this.sellPreset = null;
        } else {
            this.sellPreset = preset2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitPreset limitPreset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || limitPreset.presetType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, limitPreset.presetType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || limitPreset.buyPreset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Preset$$serializer.INSTANCE, limitPreset.buyPreset);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && limitPreset.sellPreset == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Preset$$serializer.INSTANCE, limitPreset.sellPreset);
    }

    public LimitPreset(String str, Preset preset, Preset preset2) {
        this.presetType = str;
        this.buyPreset = preset;
        this.sellPreset = preset2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.Preset:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Preset) : (r3v0 com.okinc.business.dex.tee.domain.model.Preset))
  (wrap:com.okinc.business.dex.tee.domain.model.Preset:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Preset) : (r4v0 com.okinc.business.dex.tee.domain.model.Preset))
 A[MD:(java.lang.String, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dex.tee.domain.model.Preset):void (m)] (LINE:52) call: com.okinc.business.dex.tee.domain.model.LimitPreset.<init>(java.lang.String, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dex.tee.domain.model.Preset):void type: THIS */
    public /* synthetic */ LimitPreset(String str, Preset preset, Preset preset2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : preset, (i & 4) != 0 ? null : preset2);
    }
}
