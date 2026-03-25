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
public final class TpslConfig implements Parcelable {
    private final Preset buyPreset;
    private final Preset sellPreset;
    private final SellRule sellRule;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TpslConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TpslConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpslConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TpslConfig(parcel.readInt() == 0 ? null : SellRule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Preset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Preset.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpslConfig[] newArray(int i) {
            return new TpslConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TpslConfig() {
        this((SellRule) null, (Preset) null, (Preset) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TpslConfig copy$default(TpslConfig tpslConfig, SellRule sellRule, Preset preset, Preset preset2, int i, Object obj) {
        if ((i & 1) != 0) {
            sellRule = tpslConfig.sellRule;
        }
        if ((i & 2) != 0) {
            preset = tpslConfig.buyPreset;
        }
        if ((i & 4) != 0) {
            preset2 = tpslConfig.sellPreset;
        }
        return tpslConfig.copy(sellRule, preset, preset2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellRule component1() {
        return this.sellRule;
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
    public final TpslConfig copy(SellRule sellRule, Preset preset, Preset preset2) {
        return new TpslConfig(sellRule, preset, preset2);
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
        if (!(obj instanceof TpslConfig)) {
            return false;
        }
        TpslConfig tpslConfig = (TpslConfig) obj;
        return Intrinsics.EZpvd(this.sellRule, tpslConfig.sellRule) && Intrinsics.EZpvd(this.buyPreset, tpslConfig.buyPreset) && Intrinsics.EZpvd(this.sellPreset, tpslConfig.sellPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellRule getSellRule() {
        return this.sellRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SellRule sellRule = this.sellRule;
        int iHashCode = sellRule == null ? 0 : sellRule.hashCode();
        Preset preset = this.buyPreset;
        int iHashCode2 = preset == null ? 0 : preset.hashCode();
        Preset preset2 = this.sellPreset;
        return (((iHashCode * 31) + iHashCode2) * 31) + (preset2 != null ? preset2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TpslConfig(sellRule=" + this.sellRule + ", buyPreset=" + this.buyPreset + ", sellPreset=" + this.sellPreset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        SellRule sellRule = this.sellRule;
        if (sellRule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellRule.writeToParcel(parcel, i);
        }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.TpslConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TpslConfig> serializer() {
            return TpslConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TpslConfig(int i, SellRule sellRule, Preset preset, Preset preset2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sellRule = null;
        } else {
            this.sellRule = sellRule;
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

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TpslConfig tpslConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tpslConfig.sellRule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, SellRule$$serializer.INSTANCE, tpslConfig.sellRule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tpslConfig.buyPreset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Preset$$serializer.INSTANCE, tpslConfig.buyPreset);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tpslConfig.sellPreset == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Preset$$serializer.INSTANCE, tpslConfig.sellPreset);
    }

    public TpslConfig(SellRule sellRule, Preset preset, Preset preset2) {
        this.sellRule = sellRule;
        this.buyPreset = preset;
        this.sellPreset = preset2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.tee.domain.model.SellRule:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.SellRule) : (r2v0 com.okinc.business.dex.tee.domain.model.SellRule))
  (wrap:com.okinc.business.dex.tee.domain.model.Preset:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Preset) : (r3v0 com.okinc.business.dex.tee.domain.model.Preset))
  (wrap:com.okinc.business.dex.tee.domain.model.Preset:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Preset) : (r4v0 com.okinc.business.dex.tee.domain.model.Preset))
 A[MD:(com.okinc.business.dex.tee.domain.model.SellRule, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dex.tee.domain.model.Preset):void (m)] (LINE:54) call: com.okinc.business.dex.tee.domain.model.TpslConfig.<init>(com.okinc.business.dex.tee.domain.model.SellRule, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dex.tee.domain.model.Preset):void type: THIS */
    public /* synthetic */ TpslConfig(SellRule sellRule, Preset preset, Preset preset2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sellRule, (i & 2) != 0 ? null : preset, (i & 4) != 0 ? null : preset2);
    }
}
