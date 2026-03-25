package com.okinc.business.defi.wallet.passkey.common.ws.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Stage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int status;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Stage copy$default(Stage stage, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = stage.type;
        }
        if ((i3 & 2) != 0) {
            i2 = stage.status;
        }
        return stage.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stage copy(int i, int i2) {
        return new Stage(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stage)) {
            return false;
        }
        Stage stage = (Stage) obj;
        return this.type == stage.type && this.status == stage.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Stage(type=" + this.type + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.ws.bean.Stage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Stage> serializer() {
            return Stage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Stage(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Stage$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.status = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Stage stage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, stage.type);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, stage.status);
    }

    public Stage(int i, int i2) {
        this.type = i;
        this.status = i2;
    }
}
