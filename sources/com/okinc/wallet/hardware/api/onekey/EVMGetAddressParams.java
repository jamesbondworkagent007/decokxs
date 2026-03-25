package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMGetAddressParams {
    private final Integer chainId;
    private final Path path;
    private final Boolean showOnOneKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Serializable(with = C56996yaA.class)
    public static /* synthetic */ void getPath$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Path getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowOnOneKey() {
        return this.showOnOneKey;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMGetAddressParams> serializer() {
            return EVMGetAddressParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMGetAddressParams(int i, Path path, Boolean bool, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EVMGetAddressParams$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        if ((i & 2) == 0) {
            this.showOnOneKey = null;
        } else {
            this.showOnOneKey = bool;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(EVMGetAddressParams eVMGetAddressParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, eVMGetAddressParams.path);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eVMGetAddressParams.showOnOneKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, eVMGetAddressParams.showOnOneKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && eVMGetAddressParams.chainId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, eVMGetAddressParams.chainId);
    }

    private EVMGetAddressParams(Path path, Boolean bool, Integer num) {
        this.path = path;
        this.showOnOneKey = bool;
        this.chainId = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.wallet.hardware.api.onekey.Path)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(com.okinc.wallet.hardware.api.onekey.Path, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:10) call: com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams.<init>(com.okinc.wallet.hardware.api.onekey.Path, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ EVMGetAddressParams(Path path, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:15) call: com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams.<init>(java.lang.String, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ EVMGetAddressParams(String str, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMGetAddressParams(@NotNull String str, Boolean bool, Integer num) {
        this(new Path(str), bool, num);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List<java.lang.Long>:?: CAST (java.util.List<java.lang.Long>) (r2v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.util.List<java.lang.Long>, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:21) call: com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams.<init>(java.util.List, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ EVMGetAddressParams(List list, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Long>) list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVMGetAddressParams(@NotNull List<Long> list, Boolean bool, Integer num) {
        this(new Path(list), bool, num);
        Intrinsics.checkNotNullParameter(list, "");
    }
}
