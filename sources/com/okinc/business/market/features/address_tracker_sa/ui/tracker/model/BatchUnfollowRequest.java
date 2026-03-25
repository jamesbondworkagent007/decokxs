package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BatchUnfollowRequest {
    public final List<String> collectAddressList;
    public final Long groupId;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchUnfollowRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchUnfollowRequest copy$default(BatchUnfollowRequest batchUnfollowRequest, String str, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchUnfollowRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            list = batchUnfollowRequest.collectAddressList;
        }
        if ((i & 4) != 0) {
            l = batchUnfollowRequest.groupId;
        }
        return batchUnfollowRequest.EZpvd(str, list, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchUnfollowRequest EZpvd(@NotNull String str, @NotNull List<String> list, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchUnfollowRequest(str, list, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchUnfollowRequest)) {
            return false;
        }
        BatchUnfollowRequest batchUnfollowRequest = (BatchUnfollowRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) batchUnfollowRequest.walletAddress) && Intrinsics.EZpvd(this.collectAddressList, batchUnfollowRequest.collectAddressList) && Intrinsics.EZpvd(this.groupId, batchUnfollowRequest.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletAddress.hashCode();
        int iHashCode2 = this.collectAddressList.hashCode();
        Long l = this.groupId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchUnfollowRequest(walletAddress=" + this.walletAddress + ", collectAddressList=" + this.collectAddressList + ", groupId=" + this.groupId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchUnfollowRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchUnfollowRequest> serializer() {
            return BatchUnfollowRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchUnfollowRequest(int i, String str, List list, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BatchUnfollowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddressList = list;
        this.groupId = l;
    }

    public static final /* synthetic */ void copydefault(BatchUnfollowRequest batchUnfollowRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchUnfollowRequest.walletAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], batchUnfollowRequest.collectAddressList);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, batchUnfollowRequest.groupId);
    }

    public BatchUnfollowRequest(@NotNull String str, @NotNull List<String> list, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.collectAddressList = list;
        this.groupId = l;
    }
}
