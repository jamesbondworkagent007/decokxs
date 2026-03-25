package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SegmentOrderRequest implements Parcelable {
    private final List<SegmentOrderDetailsRequest> details;
    private final String instId;
    private final String ordType;
    private final String posSide;
    private final boolean reduceOnly;
    private final String side;
    private final String tdMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SegmentOrderRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(SegmentOrderDetailsRequest$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SegmentOrderRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SegmentOrderDetailsRequest.CREATOR.createFromParcel(parcel));
            }
            return new SegmentOrderRequest(string, string2, string3, string4, z, string5, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegmentOrderRequest[] newArray(int i) {
            return new SegmentOrderRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.SegmentOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentOrderRequest copy$default(SegmentOrderRequest segmentOrderRequest, String str, String str2, String str3, String str4, boolean z, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentOrderRequest.instId;
        }
        if ((i & 2) != 0) {
            str2 = segmentOrderRequest.tdMode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = segmentOrderRequest.side;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = segmentOrderRequest.ordType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = segmentOrderRequest.reduceOnly;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = segmentOrderRequest.posSide;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            list = segmentOrderRequest.details;
        }
        return segmentOrderRequest.copy(str, str6, str7, str8, z2, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SegmentOrderDetailsRequest> component7() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegmentOrderRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, String str5, @NotNull List<SegmentOrderDetailsRequest> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SegmentOrderRequest(str, str2, str3, str4, z, str5, list);
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
        if (!(obj instanceof SegmentOrderRequest)) {
            return false;
        }
        SegmentOrderRequest segmentOrderRequest = (SegmentOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) segmentOrderRequest.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) segmentOrderRequest.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) segmentOrderRequest.side) && Intrinsics.EZpvd((Object) this.ordType, (Object) segmentOrderRequest.ordType) && this.reduceOnly == segmentOrderRequest.reduceOnly && Intrinsics.EZpvd((Object) this.posSide, (Object) segmentOrderRequest.posSide) && Intrinsics.EZpvd(this.details, segmentOrderRequest.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SegmentOrderDetailsRequest> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.tdMode.hashCode();
        int iHashCode3 = this.side.hashCode();
        int iHashCode4 = this.ordType.hashCode();
        int iHashCode5 = Boolean.hashCode(this.reduceOnly);
        String str = this.posSide;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SegmentOrderRequest(instId=" + this.instId + ", tdMode=" + this.tdMode + ", side=" + this.side + ", ordType=" + this.ordType + ", reduceOnly=" + this.reduceOnly + ", posSide=" + this.posSide + ", details=" + this.details + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.side);
        parcel.writeString(this.ordType);
        parcel.writeInt(this.reduceOnly ? 1 : 0);
        parcel.writeString(this.posSide);
        List<SegmentOrderDetailsRequest> list = this.details;
        parcel.writeInt(list.size());
        Iterator<SegmentOrderDetailsRequest> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SegmentOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SegmentOrderRequest> serializer() {
            return SegmentOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SegmentOrderRequest(int i, String str, String str2, String str3, String str4, boolean z, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, SegmentOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.ordType = str4;
        this.reduceOnly = z;
        this.posSide = str5;
        this.details = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SegmentOrderRequest segmentOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, segmentOrderRequest.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, segmentOrderRequest.tdMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, segmentOrderRequest.side);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, segmentOrderRequest.ordType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, segmentOrderRequest.reduceOnly);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, segmentOrderRequest.posSide);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], segmentOrderRequest.details);
    }

    public SegmentOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, String str5, @NotNull List<SegmentOrderDetailsRequest> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.instId = str;
        this.tdMode = str2;
        this.side = str3;
        this.ordType = str4;
        this.reduceOnly = z;
        this.posSide = str5;
        this.details = list;
    }
}
