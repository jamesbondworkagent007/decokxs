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
public final class BatchMigrateRequest {
    public final List<String> collectAddressList;
    public final long sourceGroupId;
    public final List<Long> targetGroupIdList;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchMigrateRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchMigrateRequest copy$default(BatchMigrateRequest batchMigrateRequest, String str, List list, long j, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchMigrateRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            list = batchMigrateRequest.collectAddressList;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            j = batchMigrateRequest.sourceGroupId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            list2 = batchMigrateRequest.targetGroupIdList;
        }
        return batchMigrateRequest.OLrzqt(str, list3, j2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchMigrateRequest OLrzqt(@NotNull String str, @NotNull List<String> list, long j, @NotNull List<Long> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new BatchMigrateRequest(str, list, j, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchMigrateRequest)) {
            return false;
        }
        BatchMigrateRequest batchMigrateRequest = (BatchMigrateRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) batchMigrateRequest.walletAddress) && Intrinsics.EZpvd(this.collectAddressList, batchMigrateRequest.collectAddressList) && this.sourceGroupId == batchMigrateRequest.sourceGroupId && Intrinsics.EZpvd(this.targetGroupIdList, batchMigrateRequest.targetGroupIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.walletAddress.hashCode() * 31) + this.collectAddressList.hashCode()) * 31) + Long.hashCode(this.sourceGroupId)) * 31) + this.targetGroupIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchMigrateRequest(walletAddress=" + this.walletAddress + ", collectAddressList=" + this.collectAddressList + ", sourceGroupId=" + this.sourceGroupId + ", targetGroupIdList=" + this.targetGroupIdList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.BatchMigrateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchMigrateRequest> serializer() {
            return BatchMigrateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchMigrateRequest(int i, String str, List list, long j, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BatchMigrateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddressList = list;
        this.sourceGroupId = j;
        this.targetGroupIdList = list2;
    }

    public static final /* synthetic */ void KWHzl(BatchMigrateRequest batchMigrateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchMigrateRequest.walletAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], batchMigrateRequest.collectAddressList);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, batchMigrateRequest.sourceGroupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], batchMigrateRequest.targetGroupIdList);
    }

    public BatchMigrateRequest(@NotNull String str, @NotNull List<String> list, long j, @NotNull List<Long> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.walletAddress = str;
        this.collectAddressList = list;
        this.sourceGroupId = j;
        this.targetGroupIdList = list2;
    }
}
