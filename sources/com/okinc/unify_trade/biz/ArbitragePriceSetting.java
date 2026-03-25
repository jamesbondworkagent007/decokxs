package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ArbitragePriceSetting implements Parcelable {
    private Boolean automaticTracking;
    private Integer makerRange;
    private String ordType;
    private String pauseThreshold;
    private Boolean pauseTracking;
    private Integer takerRange;
    private Integer timeInterval;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitragePriceSetting> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ArbitragePriceSetting> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitragePriceSetting createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new ArbitragePriceSetting();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitragePriceSetting[] newArray(int i) {
            return new ArbitragePriceSetting[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutomaticTracking() {
        return this.automaticTracking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMakerRange() {
        return this.makerRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPauseThreshold() {
        return this.pauseThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPauseTracking() {
        return this.pauseTracking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTakerRange() {
        return this.takerRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutomaticTracking(Boolean bool) {
        this.automaticTracking = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMakerRange(Integer num) {
        this.makerRange = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPauseThreshold(String str) {
        this.pauseThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPauseTracking(Boolean bool) {
        this.pauseTracking = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTakerRange(Integer num) {
        this.takerRange = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeInterval(Integer num) {
        this.timeInterval = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitragePriceSetting.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitragePriceSetting> serializer() {
            return ArbitragePriceSetting$$serializer.INSTANCE;
        }
    }

    public ArbitragePriceSetting() {
    }

    public /* synthetic */ ArbitragePriceSetting(int i, String str, Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ordType = null;
        } else {
            this.ordType = str;
        }
        if ((i & 2) == 0) {
            this.takerRange = null;
        } else {
            this.takerRange = num;
        }
        if ((i & 4) == 0) {
            this.makerRange = null;
        } else {
            this.makerRange = num2;
        }
        if ((i & 8) == 0) {
            this.automaticTracking = null;
        } else {
            this.automaticTracking = bool;
        }
        if ((i & 16) == 0) {
            this.timeInterval = null;
        } else {
            this.timeInterval = num3;
        }
        if ((i & 32) == 0) {
            this.pauseTracking = null;
        } else {
            this.pauseTracking = bool2;
        }
        if ((i & 64) == 0) {
            this.pauseThreshold = null;
        } else {
            this.pauseThreshold = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitragePriceSetting arbitragePriceSetting, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitragePriceSetting.ordType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbitragePriceSetting.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitragePriceSetting.takerRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, arbitragePriceSetting.takerRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitragePriceSetting.makerRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, arbitragePriceSetting.makerRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitragePriceSetting.automaticTracking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, arbitragePriceSetting.automaticTracking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitragePriceSetting.timeInterval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, arbitragePriceSetting.timeInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || arbitragePriceSetting.pauseTracking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, arbitragePriceSetting.pauseTracking);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && arbitragePriceSetting.pauseThreshold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, arbitragePriceSetting.pauseThreshold);
    }

    public final boolean dataChanged(Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, String str) {
        return (Intrinsics.EZpvd(this.takerRange, num) && Intrinsics.EZpvd(this.makerRange, num2) && Intrinsics.EZpvd(this.automaticTracking, bool) && Intrinsics.EZpvd(this.timeInterval, num3) && Intrinsics.EZpvd(this.pauseTracking, bool2) && Intrinsics.EZpvd((Object) this.pauseThreshold, (Object) str)) ? false : true;
    }
}
