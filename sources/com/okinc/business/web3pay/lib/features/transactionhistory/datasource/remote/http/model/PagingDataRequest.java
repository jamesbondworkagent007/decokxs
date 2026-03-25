package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PagingDataRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cursor;
    private final int limit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PagingDataRequest copy$default(PagingDataRequest pagingDataRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pagingDataRequest.cursor;
        }
        if ((i2 & 2) != 0) {
            i = pagingDataRequest.limit;
        }
        return pagingDataRequest.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PagingDataRequest copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PagingDataRequest(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingDataRequest)) {
            return false;
        }
        PagingDataRequest pagingDataRequest = (PagingDataRequest) obj;
        return Intrinsics.EZpvd((Object) this.cursor, (Object) pagingDataRequest.cursor) && this.limit == pagingDataRequest.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.cursor.hashCode() * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PagingDataRequest(cursor=" + this.cursor + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PagingDataRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PagingDataRequest> serializer() {
            return PagingDataRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PagingDataRequest(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PagingDataRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.cursor = str;
        this.limit = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PagingDataRequest pagingDataRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pagingDataRequest.cursor);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, pagingDataRequest.limit);
    }

    public PagingDataRequest(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cursor = str;
        this.limit = i;
    }
}
