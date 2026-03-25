package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PendingClaimOrderResponse {
    private final String nextCursor;
    private final List<PendingClaimOrderApiModel> orderList;
    private final String total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(PendingClaimOrderApiModel$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingClaimOrderResponse copy$default(PendingClaimOrderResponse pendingClaimOrderResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingClaimOrderResponse.nextCursor;
        }
        if ((i & 2) != 0) {
            str2 = pendingClaimOrderResponse.total;
        }
        if ((i & 4) != 0) {
            list = pendingClaimOrderResponse.orderList;
        }
        return pendingClaimOrderResponse.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PendingClaimOrderApiModel> component3() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderResponse copy(@NotNull String str, @NotNull String str2, @NotNull List<PendingClaimOrderApiModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PendingClaimOrderResponse(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingClaimOrderResponse)) {
            return false;
        }
        PendingClaimOrderResponse pendingClaimOrderResponse = (PendingClaimOrderResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) pendingClaimOrderResponse.nextCursor) && Intrinsics.EZpvd((Object) this.total, (Object) pendingClaimOrderResponse.total) && Intrinsics.EZpvd(this.orderList, pendingClaimOrderResponse.orderList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<PendingClaimOrderApiModel> getOrderList() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.nextCursor.hashCode() * 31) + this.total.hashCode()) * 31) + this.orderList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PendingClaimOrderResponse(nextCursor=" + this.nextCursor + ", total=" + this.total + ", orderList=" + this.orderList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PendingClaimOrderResponse> serializer() {
            return PendingClaimOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PendingClaimOrderResponse(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PendingClaimOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.nextCursor = str;
        this.total = str2;
        this.orderList = list;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PendingClaimOrderResponse pendingClaimOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pendingClaimOrderResponse.getNextCursor());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pendingClaimOrderResponse.total);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], pendingClaimOrderResponse.getOrderList());
    }

    public PendingClaimOrderResponse(@NotNull String str, @NotNull String str2, @NotNull List<PendingClaimOrderApiModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.nextCursor = str;
        this.total = str2;
        this.orderList = list;
    }
}
