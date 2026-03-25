package com.okinc.business.defi.wallet.common.tonconnect.model.request;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppRequest {
    private final String id;
    private final String method;
    private final List<String> params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DAppRequest copy$default(DAppRequest dAppRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAppRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = dAppRequest.method;
        }
        if ((i & 4) != 0) {
            list = dAppRequest.params;
        }
        return dAppRequest.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppRequest copy(@NotNull String str, @NotNull String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DAppRequest(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppRequest)) {
            return false;
        }
        DAppRequest dAppRequest = (DAppRequest) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) dAppRequest.id) && Intrinsics.EZpvd((Object) this.method, (Object) dAppRequest.method) && Intrinsics.EZpvd(this.params, dAppRequest.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.method.hashCode();
        List<String> list = this.params;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppRequest> serializer() {
            return DAppRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppRequest(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DAppRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.method = str2;
        if ((i & 4) == 0) {
            this.params = null;
        } else {
            this.params = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppRequest dAppRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppRequest.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppRequest.method);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && dAppRequest.params == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], dAppRequest.params);
    }

    public DAppRequest(@NotNull String str, @NotNull String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.method = str2;
        this.params = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:8) call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppRequest.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DAppRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }

    public final boolean isDisconnect() {
        return Intrinsics.EZpvd((Object) this.method, (Object) "disconnect");
    }

    public final boolean isTransaction() {
        return Intrinsics.EZpvd((Object) this.method, (Object) "sendTransaction");
    }

    public final String getTransactionRequestParams() {
        return "{\"params\": " + this.params + " }";
    }
}
