package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ReversePosResponse implements Parcelable {
    public static final int $stable = 0;
    private final String clOrdId;
    private final String instId;
    private final String posSide;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReversePosResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ReversePosResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReversePosResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReversePosResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReversePosResponse[] newArray(int i) {
            return new ReversePosResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReversePosResponse copy$default(ReversePosResponse reversePosResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reversePosResponse.instId;
        }
        if ((i & 2) != 0) {
            str2 = reversePosResponse.posSide;
        }
        if ((i & 4) != 0) {
            str3 = reversePosResponse.clOrdId;
        }
        if ((i & 8) != 0) {
            str4 = reversePosResponse.tag;
        }
        return reversePosResponse.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReversePosResponse copy(String str, String str2, String str3, String str4) {
        return new ReversePosResponse(str, str2, str3, str4);
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
        if (!(obj instanceof ReversePosResponse)) {
            return false;
        }
        ReversePosResponse reversePosResponse = (ReversePosResponse) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) reversePosResponse.instId) && Intrinsics.EZpvd((Object) this.posSide, (Object) reversePosResponse.posSide) && Intrinsics.EZpvd((Object) this.clOrdId, (Object) reversePosResponse.clOrdId) && Intrinsics.EZpvd((Object) this.tag, (Object) reversePosResponse.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClOrdId() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.posSide;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.clOrdId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tag;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReversePosResponse(instId=" + this.instId + ", posSide=" + this.posSide + ", clOrdId=" + this.clOrdId + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.posSide);
        parcel.writeString(this.clOrdId);
        parcel.writeString(this.tag);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ReversePosResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReversePosResponse> serializer() {
            return ReversePosResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReversePosResponse(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ReversePosResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.posSide = str2;
        this.clOrdId = str3;
        this.tag = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ReversePosResponse reversePosResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, reversePosResponse.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, reversePosResponse.posSide);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, reversePosResponse.clOrdId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, reversePosResponse.tag);
    }

    public ReversePosResponse(String str, String str2, String str3, String str4) {
        this.instId = str;
        this.posSide = str2;
        this.clOrdId = str3;
        this.tag = str4;
    }
}
