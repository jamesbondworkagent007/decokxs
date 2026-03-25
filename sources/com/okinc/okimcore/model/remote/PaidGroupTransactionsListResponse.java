package com.okinc.okimcore.model.remote;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PaidGroupTransactionsListResponse {
    private final boolean hasOlderRecords;
    private final List<PaidGroupTransactionHistoryDetail> items;
    private final int retrievedCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PaidGroupTransactionHistoryDetail$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaidGroupTransactionsListResponse copy$default(PaidGroupTransactionsListResponse paidGroupTransactionsListResponse, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paidGroupTransactionsListResponse.retrievedCount;
        }
        if ((i2 & 2) != 0) {
            list = paidGroupTransactionsListResponse.items;
        }
        if ((i2 & 4) != 0) {
            z = paidGroupTransactionsListResponse.hasOlderRecords;
        }
        return paidGroupTransactionsListResponse.copy(i, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.retrievedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaidGroupTransactionHistoryDetail> component2() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasOlderRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupTransactionsListResponse copy(int i, @NotNull List<PaidGroupTransactionHistoryDetail> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PaidGroupTransactionsListResponse(i, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidGroupTransactionsListResponse)) {
            return false;
        }
        PaidGroupTransactionsListResponse paidGroupTransactionsListResponse = (PaidGroupTransactionsListResponse) obj;
        return this.retrievedCount == paidGroupTransactionsListResponse.retrievedCount && Intrinsics.EZpvd(this.items, paidGroupTransactionsListResponse.items) && this.hasOlderRecords == paidGroupTransactionsListResponse.hasOlderRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasOlderRecords() {
        return this.hasOlderRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaidGroupTransactionHistoryDetail> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRetrievedCount() {
        return this.retrievedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.retrievedCount) * 31) + this.items.hashCode()) * 31) + Boolean.hashCode(this.hasOlderRecords);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaidGroupTransactionsListResponse(retrievedCount=" + this.retrievedCount + ", items=" + this.items + ", hasOlderRecords=" + this.hasOlderRecords + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaidGroupTransactionsListResponse> serializer() {
            return PaidGroupTransactionsListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaidGroupTransactionsListResponse(int i, int i2, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PaidGroupTransactionsListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.retrievedCount = i2;
        this.items = list;
        this.hasOlderRecords = z;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupTransactionsListResponse paidGroupTransactionsListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, paidGroupTransactionsListResponse.retrievedCount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], paidGroupTransactionsListResponse.items);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, paidGroupTransactionsListResponse.hasOlderRecords);
    }

    public PaidGroupTransactionsListResponse(int i, @NotNull List<PaidGroupTransactionHistoryDetail> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.retrievedCount = i;
        this.items = list;
        this.hasOlderRecords = z;
    }
}
