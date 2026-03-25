package com.okinc.business.market.data.model.watchlist;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerGroupSortingRequest {
    public final List<Integer> groupIdList;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerGroupSortingRequest() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.watchlist.TrackerGroupSortingRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackerGroupSortingRequest copy$default(TrackerGroupSortingRequest trackerGroupSortingRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackerGroupSortingRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            list = trackerGroupSortingRequest.groupIdList;
        }
        return trackerGroupSortingRequest.KWHzl(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerGroupSortingRequest KWHzl(@NotNull String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TrackerGroupSortingRequest(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerGroupSortingRequest)) {
            return false;
        }
        TrackerGroupSortingRequest trackerGroupSortingRequest = (TrackerGroupSortingRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackerGroupSortingRequest.walletAddress) && Intrinsics.EZpvd(this.groupIdList, trackerGroupSortingRequest.groupIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletAddress.hashCode() * 31) + this.groupIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerGroupSortingRequest(walletAddress=" + this.walletAddress + ", groupIdList=" + this.groupIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.TrackerGroupSortingRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerGroupSortingRequest> serializer() {
            return TrackerGroupSortingRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerGroupSortingRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.walletAddress = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.groupIdList = yDY.AhwBna();
        } else {
            this.groupIdList = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(TrackerGroupSortingRequest trackerGroupSortingRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackerGroupSortingRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerGroupSortingRequest.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(trackerGroupSortingRequest.groupIdList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trackerGroupSortingRequest.groupIdList);
    }

    public TrackerGroupSortingRequest(@NotNull String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.groupIdList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:17) call: com.okinc.business.market.data.model.watchlist.TrackerGroupSortingRequest.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TrackerGroupSortingRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
