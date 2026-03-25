package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InstrumentActiveInfo implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("active")
    private final int active;

    @SerializedName("ruleId")
    private final long ruleId;

    @SerializedName("sourceType")
    private final int sourceType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InstrumentActiveInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<InstrumentActiveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentActiveInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InstrumentActiveInfo(parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentActiveInfo[] newArray(int i) {
            return new InstrumentActiveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InstrumentActiveInfo copy$default(InstrumentActiveInfo instrumentActiveInfo, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = instrumentActiveInfo.ruleId;
        }
        if ((i3 & 2) != 0) {
            i = instrumentActiveInfo.active;
        }
        if ((i3 & 4) != 0) {
            i2 = instrumentActiveInfo.sourceType;
        }
        return instrumentActiveInfo.copy(j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstrumentActiveInfo copy(long j, int i, int i2) {
        return new InstrumentActiveInfo(j, i, i2);
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
        if (!(obj instanceof InstrumentActiveInfo)) {
            return false;
        }
        InstrumentActiveInfo instrumentActiveInfo = (InstrumentActiveInfo) obj;
        return this.ruleId == instrumentActiveInfo.ruleId && this.active == instrumentActiveInfo.active && this.sourceType == instrumentActiveInfo.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActive() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.ruleId) * 31) + Integer.hashCode(this.active)) * 31) + Integer.hashCode(this.sourceType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstrumentActiveInfo(ruleId=" + this.ruleId + ", active=" + this.active + ", sourceType=" + this.sourceType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.ruleId);
        parcel.writeInt(this.active);
        parcel.writeInt(this.sourceType);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.InstrumentActiveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstrumentActiveInfo> serializer() {
            return InstrumentActiveInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstrumentActiveInfo(int i, long j, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InstrumentActiveInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.ruleId = j;
        this.active = i2;
        this.sourceType = i3;
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(InstrumentActiveInfo instrumentActiveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, instrumentActiveInfo.ruleId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, instrumentActiveInfo.active);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, instrumentActiveInfo.sourceType);
    }

    public InstrumentActiveInfo(long j, int i, int i2) {
        this.ruleId = j;
        this.active = i;
        this.sourceType = i2;
    }
}
