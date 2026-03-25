package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BTCGetAddressParams {
    private final String coin;
    private final MultisigRedeemScriptType multisig;
    private final Path path;
    private final String scriptType;
    private final Boolean showOnOneKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Serializable(with = C56996yaA.class)
    public static /* synthetic */ void getPath$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultisigRedeemScriptType getMultisig() {
        return this.multisig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Path getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScriptType() {
        return this.scriptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowOnOneKey() {
        return this.showOnOneKey;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BTCGetAddressParams> serializer() {
            return BTCGetAddressParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BTCGetAddressParams(int i, Path path, String str, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BTCGetAddressParams$$serializer.INSTANCE.getDescriptor());
        }
        this.path = path;
        if ((i & 2) == 0) {
            this.coin = null;
        } else {
            this.coin = str;
        }
        if ((i & 4) == 0) {
            this.showOnOneKey = null;
        } else {
            this.showOnOneKey = bool;
        }
        if ((i & 8) == 0) {
            this.multisig = null;
        } else {
            this.multisig = multisigRedeemScriptType;
        }
        if ((i & 16) == 0) {
            this.scriptType = null;
        } else {
            this.scriptType = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(BTCGetAddressParams bTCGetAddressParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, bTCGetAddressParams.path);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bTCGetAddressParams.coin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bTCGetAddressParams.coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bTCGetAddressParams.showOnOneKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bTCGetAddressParams.showOnOneKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bTCGetAddressParams.multisig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, MultisigRedeemScriptType$$serializer.INSTANCE, bTCGetAddressParams.multisig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && bTCGetAddressParams.scriptType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bTCGetAddressParams.scriptType);
    }

    private BTCGetAddressParams(Path path, String str, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str2) {
        this.path = path;
        this.coin = str;
        this.showOnOneKey = bool;
        this.multisig = multisigRedeemScriptType;
        this.scriptType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.wallet.hardware.api.onekey.Path)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r11v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(com.okinc.wallet.hardware.api.onekey.Path, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void (m)] (LINE:8) call: com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams.<init>(com.okinc.wallet.hardware.api.onekey.Path, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void type: THIS */
    public /* synthetic */ BTCGetAddressParams(Path path, String str, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : multisigRedeemScriptType, (i & 16) != 0 ? null : str2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r11v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void (m)] (LINE:15) call: com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams.<init>(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void type: THIS */
    public /* synthetic */ BTCGetAddressParams(String str, String str2, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : multisigRedeemScriptType, (i & 16) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BTCGetAddressParams(@NotNull String str, String str2, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str3) {
        this(new Path(str), str2, bool, multisigRedeemScriptType, str3);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.util.List<java.lang.Long>:?: CAST (java.util.List<java.lang.Long>) (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType) : (r11v0 com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Long>, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void (m)] (LINE:29) call: com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams.<init>(java.util.List, java.lang.String, java.lang.Boolean, com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType, java.lang.String):void type: THIS */
    public /* synthetic */ BTCGetAddressParams(List list, String str, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Long>) list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : multisigRedeemScriptType, (i & 16) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BTCGetAddressParams(@NotNull List<Long> list, String str, Boolean bool, MultisigRedeemScriptType multisigRedeemScriptType, String str2) {
        this(new Path(list), str, bool, multisigRedeemScriptType, str2);
        Intrinsics.checkNotNullParameter(list, "");
    }
}
