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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CancelSpotDcaOrderBody implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String ordId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CancelSpotDcaOrderBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CancelSpotDcaOrderBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelSpotDcaOrderBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CancelSpotDcaOrderBody(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelSpotDcaOrderBody[] newArray(int i) {
            return new CancelSpotDcaOrderBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CancelSpotDcaOrderBody copy$default(CancelSpotDcaOrderBody cancelSpotDcaOrderBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelSpotDcaOrderBody.algoId;
        }
        if ((i & 2) != 0) {
            str2 = cancelSpotDcaOrderBody.ordId;
        }
        return cancelSpotDcaOrderBody.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelSpotDcaOrderBody copy(String str, String str2) {
        return new CancelSpotDcaOrderBody(str, str2);
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
        if (!(obj instanceof CancelSpotDcaOrderBody)) {
            return false;
        }
        CancelSpotDcaOrderBody cancelSpotDcaOrderBody = (CancelSpotDcaOrderBody) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) cancelSpotDcaOrderBody.algoId) && Intrinsics.EZpvd((Object) this.ordId, (Object) cancelSpotDcaOrderBody.ordId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ordId;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CancelSpotDcaOrderBody(algoId=" + this.algoId + ", ordId=" + this.ordId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.ordId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CancelSpotDcaOrderBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CancelSpotDcaOrderBody> serializer() {
            return CancelSpotDcaOrderBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CancelSpotDcaOrderBody(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CancelSpotDcaOrderBody$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.ordId = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CancelSpotDcaOrderBody cancelSpotDcaOrderBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, cancelSpotDcaOrderBody.algoId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, cancelSpotDcaOrderBody.ordId);
    }

    public CancelSpotDcaOrderBody(String str, String str2) {
        this.algoId = str;
        this.ordId = str2;
    }
}
