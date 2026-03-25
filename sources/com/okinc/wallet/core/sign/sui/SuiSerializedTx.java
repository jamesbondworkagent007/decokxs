package com.okinc.wallet.core.sign.sui;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
final class SuiSerializedTx {
    private String request_type;
    private List<String> signatures;
    private String tx_bytes;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.sui.SuiSerializedTx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuiSerializedTx copy$default(SuiSerializedTx suiSerializedTx, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiSerializedTx.tx_bytes;
        }
        if ((i & 2) != 0) {
            list = suiSerializedTx.signatures;
        }
        if ((i & 4) != 0) {
            str2 = suiSerializedTx.request_type;
        }
        return suiSerializedTx.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.request_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiSerializedTx copy(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SuiSerializedTx(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiSerializedTx)) {
            return false;
        }
        SuiSerializedTx suiSerializedTx = (SuiSerializedTx) obj;
        return Intrinsics.EZpvd((Object) this.tx_bytes, (Object) suiSerializedTx.tx_bytes) && Intrinsics.EZpvd(this.signatures, suiSerializedTx.signatures) && Intrinsics.EZpvd((Object) this.request_type, (Object) suiSerializedTx.request_type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequest_type() {
        return this.request_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatures() {
        return this.signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTx_bytes() {
        return this.tx_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tx_bytes.hashCode() * 31) + this.signatures.hashCode()) * 31) + this.request_type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequest_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.request_type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatures(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.signatures = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTx_bytes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tx_bytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiSerializedTx(tx_bytes=" + this.tx_bytes + ", signatures=" + this.signatures + ", request_type=" + this.request_type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.sui.SuiSerializedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiSerializedTx> serializer() {
            return SuiSerializedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiSerializedTx(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SuiSerializedTx$$serializer.INSTANCE.getDescriptor());
        }
        this.tx_bytes = str;
        this.signatures = list;
        this.request_type = str2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SuiSerializedTx suiSerializedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, suiSerializedTx.tx_bytes);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], suiSerializedTx.signatures);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, suiSerializedTx.request_type);
    }

    public SuiSerializedTx(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tx_bytes = str;
        this.signatures = list;
        this.request_type = str2;
    }
}
