package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class GetTrackingAddressListResponse {
    public final List<TrackingAddressData> addresses;
    public final String devId;
    public final boolean hasNext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TrackingAddressData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetTrackingAddressListResponse() {
        this((String) null, (List) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.GetTrackingAddressListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTrackingAddressListResponse copy$default(GetTrackingAddressListResponse getTrackingAddressListResponse, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTrackingAddressListResponse.devId;
        }
        if ((i & 2) != 0) {
            list = getTrackingAddressListResponse.addresses;
        }
        if ((i & 4) != 0) {
            z = getTrackingAddressListResponse.hasNext;
        }
        return getTrackingAddressListResponse.EZpvd(str, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetTrackingAddressListResponse EZpvd(@NotNull String str, @NotNull List<TrackingAddressData> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GetTrackingAddressListResponse(str, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrackingAddressData> KWHzl() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.devId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTrackingAddressListResponse)) {
            return false;
        }
        GetTrackingAddressListResponse getTrackingAddressListResponse = (GetTrackingAddressListResponse) obj;
        return Intrinsics.EZpvd((Object) this.devId, (Object) getTrackingAddressListResponse.devId) && Intrinsics.EZpvd(this.addresses, getTrackingAddressListResponse.addresses) && this.hasNext == getTrackingAddressListResponse.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.devId.hashCode() * 31) + this.addresses.hashCode()) * 31) + Boolean.hashCode(this.hasNext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetTrackingAddressListResponse(devId=" + this.devId + ", addresses=" + this.addresses + ", hasNext=" + this.hasNext + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.GetTrackingAddressListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetTrackingAddressListResponse> serializer() {
            return GetTrackingAddressListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetTrackingAddressListResponse(int i, String str, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.devId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.addresses = yDY.AhwBna();
        } else {
            this.addresses = list;
        }
        if ((i & 4) == 0) {
            this.hasNext = false;
        } else {
            this.hasNext = z;
        }
    }

    public static final /* synthetic */ void AEQbTJ(GetTrackingAddressListResponse getTrackingAddressListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getTrackingAddressListResponse.devId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, getTrackingAddressListResponse.devId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(getTrackingAddressListResponse.addresses, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], getTrackingAddressListResponse.addresses);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getTrackingAddressListResponse.hasNext) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, getTrackingAddressListResponse.hasNext);
        }
    }

    public GetTrackingAddressListResponse(@NotNull String str, @NotNull List<TrackingAddressData> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.devId = str;
        this.addresses = list;
        this.hasNext = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.data.model.TrackingAddressData>, boolean):void (m)] (LINE:7) call: com.okinc.business.market.data.model.GetTrackingAddressListResponse.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ GetTrackingAddressListResponse(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z);
    }
}
