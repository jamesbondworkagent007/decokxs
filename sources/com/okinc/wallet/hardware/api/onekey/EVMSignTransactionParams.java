package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMSignTransactionParams {
    private final Path path;
    private final EVMTransaction transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Serializable(with = C56996yaA.class)
    public static /* synthetic */ void getPath$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Path getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVMTransaction getTransaction() {
        return this.transaction;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMSignTransactionParams> serializer() {
            return EVMSignTransactionParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMSignTransactionParams(int i, Path path, EVMTransaction eVMTransaction, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EVMSignTransactionParams$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        this.transaction = eVMTransaction;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(EVMSignTransactionParams eVMSignTransactionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, eVMSignTransactionParams.path);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, EVMTransaction$$serializer.INSTANCE, eVMSignTransactionParams.transaction);
    }

    private EVMSignTransactionParams(Path path, EVMTransaction eVMTransaction) {
        this.path = path;
        this.transaction = eVMTransaction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMSignTransactionParams(@NotNull String str, @NotNull EVMTransaction eVMTransaction) {
        this(new Path(str), eVMTransaction);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eVMTransaction, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMSignTransactionParams(@NotNull List<Long> list, @NotNull EVMTransaction eVMTransaction) {
        this(new Path(list), eVMTransaction);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(eVMTransaction, "");
    }
}
