package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C57044yaw;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class HDNodePathType {
    private final List<Long> address_n;
    private final NodeType node;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.wallet.hardware.api.onekey.HDNodePathType$NodeType), (r2v0 java.util.List) A[MD:(com.okinc.wallet.hardware.api.onekey.HDNodePathType$NodeType, java.util.List<java.lang.Long>):void (m)] call: com.okinc.wallet.hardware.api.onekey.HDNodePathType.<init>(com.okinc.wallet.hardware.api.onekey.HDNodePathType$NodeType, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HDNodePathType(NodeType nodeType, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(nodeType, list);
    }

    @Serializable(with = C57044yaw.class)
    public static /* synthetic */ void getNode$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAddress_n() {
        return this.address_n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NodeType getNode() {
        return this.node;
    }

    public /* synthetic */ HDNodePathType(int i, NodeType nodeType, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, HDNodePathType$$serializer.INSTANCE.getDescriptor());
        }
        this.node = nodeType;
        this.address_n = list;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(HDNodePathType hDNodePathType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C57044yaw.OLrzqt, hDNodePathType.node);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], hDNodePathType.address_n);
    }

    private HDNodePathType(NodeType nodeType, List<Long> list) {
        this.node = nodeType;
        this.address_n = list;
    }

    @Serializable
    public static final class NodeType {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String string;
        public final HDNodeType typed;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NodeType() {
            this((String) null, (HDNodeType) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.HDNodePathType.NodeType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<NodeType> serializer() {
                return HDNodePathType$NodeType$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NodeType(int i, String str, HDNodeType hDNodeType, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.string = null;
            } else {
                this.string = str;
            }
            if ((i & 2) == 0) {
                this.typed = null;
            } else {
                this.typed = hDNodeType;
            }
        }

        public static final /* synthetic */ void OLrzqt(NodeType nodeType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nodeType.string != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, nodeType.string);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && nodeType.typed == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, HDNodeType$$serializer.INSTANCE, nodeType.typed);
        }

        public NodeType(String str, HDNodeType hDNodeType) {
            this.string = str;
            this.typed = hDNodeType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.wallet.hardware.api.onekey.HDNodeType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.HDNodeType) : (r3v0 com.okinc.wallet.hardware.api.onekey.HDNodeType))
 A[MD:(java.lang.String, com.okinc.wallet.hardware.api.onekey.HDNodeType):void (m)] (LINE:283) call: com.okinc.wallet.hardware.api.onekey.HDNodePathType.NodeType.<init>(java.lang.String, com.okinc.wallet.hardware.api.onekey.HDNodeType):void type: THIS */
        public /* synthetic */ NodeType(String str, HDNodeType hDNodeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hDNodeType);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.HDNodePathType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HDNodePathType> serializer() {
            return HDNodePathType$$serializer.INSTANCE;
        }
    }
}
