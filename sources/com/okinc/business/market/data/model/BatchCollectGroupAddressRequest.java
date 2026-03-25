package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BatchCollectGroupAddressRequest {
    public final String collectAddress;
    public final List<Integer> groupIdList;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.BatchCollectGroupAddressRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchCollectGroupAddressRequest copy$default(BatchCollectGroupAddressRequest batchCollectGroupAddressRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchCollectGroupAddressRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = batchCollectGroupAddressRequest.collectAddress;
        }
        if ((i & 4) != 0) {
            list = batchCollectGroupAddressRequest.groupIdList;
        }
        return batchCollectGroupAddressRequest.OLrzqt(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchCollectGroupAddressRequest OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchCollectGroupAddressRequest(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchCollectGroupAddressRequest)) {
            return false;
        }
        BatchCollectGroupAddressRequest batchCollectGroupAddressRequest = (BatchCollectGroupAddressRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) batchCollectGroupAddressRequest.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) batchCollectGroupAddressRequest.collectAddress) && Intrinsics.EZpvd(this.groupIdList, batchCollectGroupAddressRequest.groupIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + this.groupIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchCollectGroupAddressRequest(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", groupIdList=" + this.groupIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BatchCollectGroupAddressRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchCollectGroupAddressRequest> serializer() {
            return BatchCollectGroupAddressRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchCollectGroupAddressRequest(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BatchCollectGroupAddressRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddress = str2;
        this.groupIdList = list;
    }

    public static final /* synthetic */ void KWHzl(BatchCollectGroupAddressRequest batchCollectGroupAddressRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchCollectGroupAddressRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, batchCollectGroupAddressRequest.collectAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], batchCollectGroupAddressRequest.groupIdList);
    }

    public BatchCollectGroupAddressRequest(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.groupIdList = list;
    }
}
