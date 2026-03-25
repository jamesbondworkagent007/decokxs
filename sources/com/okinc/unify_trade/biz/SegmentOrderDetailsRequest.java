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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SegmentOrderDetailsRequest implements Parcelable {
    public static final int $stable = 0;
    private final String px;
    private final String sz;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SegmentOrderDetailsRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SegmentOrderDetailsRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderDetailsRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SegmentOrderDetailsRequest(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderDetailsRequest[] newArray(int i) {
            return new SegmentOrderDetailsRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SegmentOrderDetailsRequest copy$default(SegmentOrderDetailsRequest segmentOrderDetailsRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentOrderDetailsRequest.px;
        }
        if ((i & 2) != 0) {
            str2 = segmentOrderDetailsRequest.sz;
        }
        return segmentOrderDetailsRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegmentOrderDetailsRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SegmentOrderDetailsRequest(str, str2);
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
        if (!(obj instanceof SegmentOrderDetailsRequest)) {
            return false;
        }
        SegmentOrderDetailsRequest segmentOrderDetailsRequest = (SegmentOrderDetailsRequest) obj;
        return Intrinsics.EZpvd((Object) this.px, (Object) segmentOrderDetailsRequest.px) && Intrinsics.EZpvd((Object) this.sz, (Object) segmentOrderDetailsRequest.sz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.px.hashCode() * 31) + this.sz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SegmentOrderDetailsRequest(px=" + this.px + ", sz=" + this.sz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SegmentOrderDetailsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SegmentOrderDetailsRequest> serializer() {
            return SegmentOrderDetailsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SegmentOrderDetailsRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SegmentOrderDetailsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.px = str;
        this.sz = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SegmentOrderDetailsRequest segmentOrderDetailsRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, segmentOrderDetailsRequest.px);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, segmentOrderDetailsRequest.sz);
    }

    public SegmentOrderDetailsRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.px = str;
        this.sz = str2;
    }
}
