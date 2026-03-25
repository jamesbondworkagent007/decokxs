package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CreateMpcResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final String mpcId;
    private final boolean pass;
    private final int step;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateMpcResponse copy$default(CreateMpcResponse createMpcResponse, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createMpcResponse.mpcId;
        }
        if ((i2 & 2) != 0) {
            str2 = createMpcResponse.data;
        }
        if ((i2 & 4) != 0) {
            i = createMpcResponse.step;
        }
        if ((i2 & 8) != 0) {
            z = createMpcResponse.pass;
        }
        return createMpcResponse.copy(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateMpcResponse copy(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CreateMpcResponse(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateMpcResponse)) {
            return false;
        }
        CreateMpcResponse createMpcResponse = (CreateMpcResponse) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) createMpcResponse.mpcId) && Intrinsics.EZpvd((Object) this.data, (Object) createMpcResponse.data) && this.step == createMpcResponse.step && this.pass == createMpcResponse.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPass() {
        return this.pass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mpcId.hashCode() * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.step)) * 31) + Boolean.hashCode(this.pass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateMpcResponse(mpcId=" + this.mpcId + ", data=" + this.data + ", step=" + this.step + ", pass=" + this.pass + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CreateMpcResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateMpcResponse> serializer() {
            return CreateMpcResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateMpcResponse(int i, String str, String str2, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CreateMpcResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.data = str2;
        this.step = i2;
        this.pass = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CreateMpcResponse createMpcResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createMpcResponse.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, createMpcResponse.data);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, createMpcResponse.step);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, createMpcResponse.pass);
    }

    public CreateMpcResponse(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mpcId = str;
        this.data = str2;
        this.step = i;
        this.pass = z;
    }
}
