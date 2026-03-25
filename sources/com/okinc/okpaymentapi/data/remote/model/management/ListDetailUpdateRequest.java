package com.okinc.okpaymentapi.data.remote.model.management;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ListDetailUpdateRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String planId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ListDetailUpdateRequest copy$default(ListDetailUpdateRequest listDetailUpdateRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listDetailUpdateRequest.planId;
        }
        if ((i & 2) != 0) {
            str2 = listDetailUpdateRequest.status;
        }
        return listDetailUpdateRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListDetailUpdateRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ListDetailUpdateRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailUpdateRequest)) {
            return false;
        }
        ListDetailUpdateRequest listDetailUpdateRequest = (ListDetailUpdateRequest) obj;
        return Intrinsics.EZpvd((Object) this.planId, (Object) listDetailUpdateRequest.planId) && Intrinsics.EZpvd((Object) this.status, (Object) listDetailUpdateRequest.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.planId.hashCode() * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListDetailUpdateRequest(planId=" + this.planId + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ListDetailUpdateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListDetailUpdateRequest> serializer() {
            return ListDetailUpdateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListDetailUpdateRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ListDetailUpdateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.status = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ListDetailUpdateRequest listDetailUpdateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, listDetailUpdateRequest.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, listDetailUpdateRequest.status);
    }

    public ListDetailUpdateRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.planId = str;
        this.status = str2;
    }
}
