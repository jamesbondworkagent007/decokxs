package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetMarkMessageReadRequest implements Parcelable {
    public static final int $stable = 0;
    private final int eventSourceType;
    private final Long markMaxMsgId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlanetMarkMessageReadRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlanetMarkMessageReadRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetMarkMessageReadRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetMarkMessageReadRequest(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetMarkMessageReadRequest[] newArray(int i) {
            return new PlanetMarkMessageReadRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetMarkMessageReadRequest() {
        this(0, (Long) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetMarkMessageReadRequest copy$default(PlanetMarkMessageReadRequest planetMarkMessageReadRequest, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = planetMarkMessageReadRequest.eventSourceType;
        }
        if ((i2 & 2) != 0) {
            l = planetMarkMessageReadRequest.markMaxMsgId;
        }
        return planetMarkMessageReadRequest.copy(i, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.markMaxMsgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetMarkMessageReadRequest copy(int i, Long l) {
        return new PlanetMarkMessageReadRequest(i, l);
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
        if (!(obj instanceof PlanetMarkMessageReadRequest)) {
            return false;
        }
        PlanetMarkMessageReadRequest planetMarkMessageReadRequest = (PlanetMarkMessageReadRequest) obj;
        return this.eventSourceType == planetMarkMessageReadRequest.eventSourceType && Intrinsics.EZpvd(this.markMaxMsgId, planetMarkMessageReadRequest.markMaxMsgId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventSourceType() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMarkMaxMsgId() {
        return this.markMaxMsgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.eventSourceType);
        Long l = this.markMaxMsgId;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetMarkMessageReadRequest(eventSourceType=" + this.eventSourceType + ", markMaxMsgId=" + this.markMaxMsgId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.eventSourceType);
        Long l = this.markMaxMsgId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetMarkMessageReadRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetMarkMessageReadRequest> serializer() {
            return PlanetMarkMessageReadRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetMarkMessageReadRequest(int i, int i2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        this.eventSourceType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.markMaxMsgId = null;
        } else {
            this.markMaxMsgId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(PlanetMarkMessageReadRequest planetMarkMessageReadRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || planetMarkMessageReadRequest.eventSourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, planetMarkMessageReadRequest.eventSourceType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && planetMarkMessageReadRequest.markMaxMsgId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, planetMarkMessageReadRequest.markMaxMsgId);
    }

    public PlanetMarkMessageReadRequest(int i, Long l) {
        this.eventSourceType = i;
        this.markMaxMsgId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
 A[MD:(int, java.lang.Long):void (m)] (LINE:11) call: com.okinc.planet.biz_userprofile.data.PlanetMarkMessageReadRequest.<init>(int, java.lang.Long):void type: THIS */
    public /* synthetic */ PlanetMarkMessageReadRequest(int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : l);
    }
}
