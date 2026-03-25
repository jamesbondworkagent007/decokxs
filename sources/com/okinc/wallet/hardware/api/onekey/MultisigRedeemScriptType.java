package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MultisigRedeemScriptType {
    private final List<Long> address_n;
    private final long m;
    private final List<HDNodeType> nodes;
    private final List<HDNodePathType> pubkeys;
    private final List<String> signatures;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HDNodePathType$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(HDNodeType$$serializer.INSTANCE), new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAddress_n() {
        return this.address_n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getM() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HDNodeType> getNodes() {
        return this.nodes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HDNodePathType> getPubkeys() {
        return this.pubkeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatures() {
        return this.signatures;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultisigRedeemScriptType> serializer() {
            return MultisigRedeemScriptType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultisigRedeemScriptType(int i, List list, List list2, long j, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MultisigRedeemScriptType$$serializer.INSTANCE.getDescriptor());
        }
        this.pubkeys = list;
        this.signatures = list2;
        this.m = j;
        if ((i & 8) == 0) {
            this.nodes = null;
        } else {
            this.nodes = list3;
        }
        if ((i & 16) == 0) {
            this.address_n = null;
        } else {
            this.address_n = list4;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(MultisigRedeemScriptType multisigRedeemScriptType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], multisigRedeemScriptType.pubkeys);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], multisigRedeemScriptType.signatures);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, multisigRedeemScriptType.m);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || multisigRedeemScriptType.nodes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], multisigRedeemScriptType.nodes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && multisigRedeemScriptType.address_n == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], multisigRedeemScriptType.address_n);
    }

    public MultisigRedeemScriptType(@NotNull List<HDNodePathType> list, @NotNull List<String> list2, long j, List<HDNodeType> list3, List<Long> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.pubkeys = list;
        this.signatures = list2;
        this.m = j;
        this.nodes = list3;
        this.address_n = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 java.util.List)
  (r11v0 java.util.List)
  (r12v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
 A[MD:(java.util.List<com.okinc.wallet.hardware.api.onekey.HDNodePathType>, java.util.List<java.lang.String>, long, java.util.List<com.okinc.wallet.hardware.api.onekey.HDNodeType>, java.util.List<java.lang.Long>):void (m)] (LINE:247) call: com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType.<init>(java.util.List, java.util.List, long, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ MultisigRedeemScriptType(List list, List list2, long j, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
