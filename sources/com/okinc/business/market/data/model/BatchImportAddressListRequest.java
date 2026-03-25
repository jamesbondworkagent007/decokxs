package com.okinc.business.market.data.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BatchImportAddressListRequest {
    public final List<BatchImportAddressData> addressList;
    public final int groupId;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BatchImportAddressData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.BatchImportAddressListRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchImportAddressListRequest copy$default(BatchImportAddressListRequest batchImportAddressListRequest, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = batchImportAddressListRequest.walletAddress;
        }
        if ((i2 & 2) != 0) {
            i = batchImportAddressListRequest.groupId;
        }
        if ((i2 & 4) != 0) {
            list = batchImportAddressListRequest.addressList;
        }
        return batchImportAddressListRequest.OLrzqt(str, i, (List<BatchImportAddressData>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchImportAddressListRequest OLrzqt(@NotNull String str, int i, @NotNull List<BatchImportAddressData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchImportAddressListRequest(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchImportAddressListRequest)) {
            return false;
        }
        BatchImportAddressListRequest batchImportAddressListRequest = (BatchImportAddressListRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) batchImportAddressListRequest.walletAddress) && this.groupId == batchImportAddressListRequest.groupId && Intrinsics.EZpvd(this.addressList, batchImportAddressListRequest.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletAddress.hashCode() * 31) + Integer.hashCode(this.groupId)) * 31) + this.addressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchImportAddressListRequest(walletAddress=" + this.walletAddress + ", groupId=" + this.groupId + ", addressList=" + this.addressList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BatchImportAddressListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchImportAddressListRequest> serializer() {
            return BatchImportAddressListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchImportAddressListRequest(int i, String str, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BatchImportAddressListRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.groupId = i2;
        this.addressList = list;
    }

    public static final /* synthetic */ void OLrzqt(BatchImportAddressListRequest batchImportAddressListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchImportAddressListRequest.walletAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, batchImportAddressListRequest.groupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], batchImportAddressListRequest.addressList);
    }

    public BatchImportAddressListRequest(@NotNull String str, int i, @NotNull List<BatchImportAddressData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.groupId = i;
        this.addressList = list;
    }
}
