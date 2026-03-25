package com.okinc.business.market.features.address_tracker.repo;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BatchEnableOrDisableNotificationRequest {
    public final List<String> monitorAddressList;
    public final int operationType;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker.repo.BatchEnableOrDisableNotificationRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchEnableOrDisableNotificationRequest copy$default(BatchEnableOrDisableNotificationRequest batchEnableOrDisableNotificationRequest, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = batchEnableOrDisableNotificationRequest.walletAddress;
        }
        if ((i2 & 2) != 0) {
            list = batchEnableOrDisableNotificationRequest.monitorAddressList;
        }
        if ((i2 & 4) != 0) {
            i = batchEnableOrDisableNotificationRequest.operationType;
        }
        return batchEnableOrDisableNotificationRequest.copydefault(str, list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchEnableOrDisableNotificationRequest copydefault(@NotNull String str, @NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchEnableOrDisableNotificationRequest(str, list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchEnableOrDisableNotificationRequest)) {
            return false;
        }
        BatchEnableOrDisableNotificationRequest batchEnableOrDisableNotificationRequest = (BatchEnableOrDisableNotificationRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) batchEnableOrDisableNotificationRequest.walletAddress) && Intrinsics.EZpvd(this.monitorAddressList, batchEnableOrDisableNotificationRequest.monitorAddressList) && this.operationType == batchEnableOrDisableNotificationRequest.operationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletAddress.hashCode() * 31) + this.monitorAddressList.hashCode()) * 31) + Integer.hashCode(this.operationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchEnableOrDisableNotificationRequest(walletAddress=" + this.walletAddress + ", monitorAddressList=" + this.monitorAddressList + ", operationType=" + this.operationType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.repo.BatchEnableOrDisableNotificationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchEnableOrDisableNotificationRequest> serializer() {
            return BatchEnableOrDisableNotificationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchEnableOrDisableNotificationRequest(int i, String str, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BatchEnableOrDisableNotificationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.monitorAddressList = list;
        this.operationType = i2;
    }

    public static final /* synthetic */ void AEQbTJ(BatchEnableOrDisableNotificationRequest batchEnableOrDisableNotificationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchEnableOrDisableNotificationRequest.walletAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], batchEnableOrDisableNotificationRequest.monitorAddressList);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, batchEnableOrDisableNotificationRequest.operationType);
    }

    public BatchEnableOrDisableNotificationRequest(@NotNull String str, @NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.monitorAddressList = list;
        this.operationType = i;
    }
}
