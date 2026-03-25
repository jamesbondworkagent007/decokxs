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
public final class ListDetailUpdate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String planId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ListDetailUpdate copy$default(ListDetailUpdate listDetailUpdate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listDetailUpdate.planId;
        }
        if ((i & 2) != 0) {
            str2 = listDetailUpdate.status;
        }
        return listDetailUpdate.copy(str, str2);
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
    public final ListDetailUpdate copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ListDetailUpdate(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailUpdate)) {
            return false;
        }
        ListDetailUpdate listDetailUpdate = (ListDetailUpdate) obj;
        return Intrinsics.EZpvd((Object) this.planId, (Object) listDetailUpdate.planId) && Intrinsics.EZpvd((Object) this.status, (Object) listDetailUpdate.status);
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
        return "ListDetailUpdate(planId=" + this.planId + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ListDetailUpdate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListDetailUpdate> serializer() {
            return ListDetailUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListDetailUpdate(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ListDetailUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.status = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ListDetailUpdate listDetailUpdate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, listDetailUpdate.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, listDetailUpdate.status);
    }

    public ListDetailUpdate(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.planId = str;
        this.status = str2;
    }
}
