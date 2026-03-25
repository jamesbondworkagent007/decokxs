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
public final class SegmentOrderResponse implements Parcelable {
    public static final int $stable = 0;
    private final String clOrdId;
    private final String ordId;
    private final String sCode;
    private final String sMsg;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SegmentOrderResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SegmentOrderResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SegmentOrderResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderResponse[] newArray(int i) {
            return new SegmentOrderResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SegmentOrderResponse copy$default(SegmentOrderResponse segmentOrderResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentOrderResponse.clOrdId;
        }
        if ((i & 2) != 0) {
            str2 = segmentOrderResponse.ordId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = segmentOrderResponse.tag;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = segmentOrderResponse.sCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = segmentOrderResponse.sMsg;
        }
        return segmentOrderResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegmentOrderResponse copy(String str, String str2, String str3, String str4, String str5) {
        return new SegmentOrderResponse(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SegmentOrderResponse)) {
            return false;
        }
        SegmentOrderResponse segmentOrderResponse = (SegmentOrderResponse) obj;
        return Intrinsics.EZpvd((Object) this.clOrdId, (Object) segmentOrderResponse.clOrdId) && Intrinsics.EZpvd((Object) this.ordId, (Object) segmentOrderResponse.ordId) && Intrinsics.EZpvd((Object) this.tag, (Object) segmentOrderResponse.tag) && Intrinsics.EZpvd((Object) this.sCode, (Object) segmentOrderResponse.sCode) && Intrinsics.EZpvd((Object) this.sMsg, (Object) segmentOrderResponse.sMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClOrdId() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.clOrdId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ordId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sCode;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sMsg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SegmentOrderResponse(clOrdId=" + this.clOrdId + ", ordId=" + this.ordId + ", tag=" + this.tag + ", sCode=" + this.sCode + ", sMsg=" + this.sMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.clOrdId);
        parcel.writeString(this.ordId);
        parcel.writeString(this.tag);
        parcel.writeString(this.sCode);
        parcel.writeString(this.sMsg);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SegmentOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SegmentOrderResponse> serializer() {
            return SegmentOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SegmentOrderResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SegmentOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.clOrdId = str;
        this.ordId = str2;
        this.tag = str3;
        this.sCode = str4;
        this.sMsg = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SegmentOrderResponse segmentOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, segmentOrderResponse.clOrdId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, segmentOrderResponse.ordId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, segmentOrderResponse.tag);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, segmentOrderResponse.sCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, segmentOrderResponse.sMsg);
    }

    public SegmentOrderResponse(String str, String str2, String str3, String str4, String str5) {
        this.clOrdId = str;
        this.ordId = str2;
        this.tag = str3;
        this.sCode = str4;
        this.sMsg = str5;
    }
}
