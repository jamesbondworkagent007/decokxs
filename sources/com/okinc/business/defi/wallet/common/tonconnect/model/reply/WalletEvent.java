package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply;
import com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import o.C32979mnm;
import o.C34703nhO;
import o.C56392yDr;
import o.C56402yEa;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@JsonClassDiscriminator(discriminator = "event")
@Serializable
public abstract class WalletEvent {
    public static final int $stable = 0;
    private final long id;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ect
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WalletEvent._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.<init>(long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WalletEvent(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) WalletEvent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WalletEvent> serializer() {
            return EZpvd();
        }
    }

    public /* synthetic */ WalletEvent(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = System.currentTimeMillis();
        } else {
            this.id = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent", C56524yIo.AEQbTJ(WalletEvent.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(ConnectError.class), C56524yIo.AEQbTJ(ConnectSuccess.class), C56524yIo.AEQbTJ(Disconnect.class)}, new KSerializer[]{WalletEvent$ConnectError$$serializer.INSTANCE, WalletEvent$ConnectSuccess$$serializer.INSTANCE, WalletEvent$Disconnect$$serializer.INSTANCE}, new Annotation[]{new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.ActionBar("event")});
    }

    public static final /* synthetic */ void write$Self(WalletEvent walletEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && walletEvent.id == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 0, walletEvent.id);
    }

    private WalletEvent(long j) {
        this.id = j;
    }

    @Serializable
    @SerialName("connect")
    public static final class ConnectSuccess extends WalletEvent {
        private final Payload payload;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConnectSuccess copy$default(ConnectSuccess connectSuccess, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                payload = connectSuccess.payload;
            }
            return connectSuccess.copy(payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Payload component1() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectSuccess copy(@NotNull Payload payload) {
            Intrinsics.checkNotNullParameter(payload, "");
            return new ConnectSuccess(payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectSuccess) && Intrinsics.EZpvd(this.payload, ((ConnectSuccess) obj).payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Payload getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.payload.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectSuccess(payload=" + this.payload + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConnectSuccess> serializer() {
                return WalletEvent$ConnectSuccess$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConnectSuccess(int i, long j, Payload payload, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, j, serializationConstructorMarker);
            if (2 != (i & 2)) {
                PluginExceptionsKt.throwMissingFieldException(i, 2, WalletEvent$ConnectSuccess$$serializer.INSTANCE.getDescriptor());
            }
            this.payload = payload;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectSuccess connectSuccess, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            WalletEvent.write$Self(connectSuccess, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE, connectSuccess.payload);
        }

        @Serializable
        public static final class Payload {
            private final Device device;
            private final List<Item> items;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(new SealedClassSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item", C56524yIo.AEQbTJ(Item.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Item.TonAddress.class), C56524yIo.AEQbTJ(Item.TonProof.class)}, new KSerializer[]{WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.INSTANCE, WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer.INSTANCE}, new Annotation[]{new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.ActionBar("name")})), null};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Payload copy$default(Payload payload, List list, Device device, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = payload.items;
                }
                if ((i & 2) != 0) {
                    device = payload.device;
                }
                return payload.copy(list, device);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Item> component1() {
                return this.items;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Device component2() {
                return this.device;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Payload copy(@NotNull List<? extends Item> list, @NotNull Device device) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(device, "");
                return new Payload(list, device);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Payload)) {
                    return false;
                }
                Payload payload = (Payload) obj;
                return Intrinsics.EZpvd(this.items, payload.items) && Intrinsics.EZpvd(this.device, payload.device);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Device getDevice() {
                return this.device;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Item> getItems() {
                return this.items;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.items.hashCode() * 31) + this.device.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Payload(items=" + this.items + ", device=" + this.device + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Payload> serializer() {
                    return WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Payload(int i, List list, Device device, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE.getDescriptor());
                }
                this.items = list;
                if ((i & 2) == 0) {
                    this.device = new Device((String) null, (String) null, (String) null, 0, (List) null, 31, (DefaultConstructorMarker) null);
                } else {
                    this.device = device;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Payload payload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], payload.items);
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(payload.device, new Device((String) null, (String) null, (String) null, 0, (List) null, 31, (DefaultConstructorMarker) null))) {
                    return;
                }
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Device$$serializer.INSTANCE, payload.device);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Item> */
            /* JADX WARN: Multi-variable type inference failed */
            public Payload(@NotNull List<? extends Item> list, @NotNull Device device) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(device, "");
                this.items = list;
                this.device = device;
            }

            @Serializable
            @JsonClassDiscriminator(discriminator = "name")
            public interface Item {
                public static final Companion Companion = Companion.KWHzl;

                public static final class Companion {
                    public static final /* synthetic */ Companion KWHzl = new Companion();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    public final KSerializer<Item> serializer() {
                        return new SealedClassSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item", C56524yIo.AEQbTJ(Item.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(TonAddress.class), C56524yIo.AEQbTJ(TonProof.class)}, new KSerializer[]{WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.INSTANCE, WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer.INSTANCE}, new Annotation[]{new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.ActionBar("name")});
                    }
                }

                @Serializable
                @SerialName("ton_addr")
                public static final class TonAddress implements Item {
                    public static final int $stable = 0;
                    private final String address;
                    private final TonNetwork network;
                    private final String publicKey;
                    private final String walletStateInit;
                    public static final Companion Companion = new Companion(null);
                    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork", TonNetwork.values(), new String[]{"-239", "-3"}, new Annotation[][]{null, null}, null), null, null};

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ TonAddress copy$default(TonAddress tonAddress, String str, TonNetwork tonNetwork, String str2, String str3, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = tonAddress.address;
                        }
                        if ((i & 2) != 0) {
                            tonNetwork = tonAddress.network;
                        }
                        if ((i & 4) != 0) {
                            str2 = tonAddress.walletStateInit;
                        }
                        if ((i & 8) != 0) {
                            str3 = tonAddress.publicKey;
                        }
                        return tonAddress.copy(str, tonNetwork, str2, str3);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.address;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonNetwork component2() {
                        return this.network;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component3() {
                        return this.walletStateInit;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component4() {
                        return this.publicKey;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonAddress copy(@NotNull String str, @NotNull TonNetwork tonNetwork, @NotNull String str2, @NotNull String str3) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(tonNetwork, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        return new TonAddress(str, tonNetwork, str2, str3);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TonAddress)) {
                            return false;
                        }
                        TonAddress tonAddress = (TonAddress) obj;
                        return Intrinsics.EZpvd((Object) this.address, (Object) tonAddress.address) && this.network == tonAddress.network && Intrinsics.EZpvd((Object) this.walletStateInit, (Object) tonAddress.walletStateInit) && Intrinsics.EZpvd((Object) this.publicKey, (Object) tonAddress.publicKey);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getAddress() {
                        return this.address;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonNetwork getNetwork() {
                        return this.network;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getPublicKey() {
                        return this.publicKey;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getWalletStateInit() {
                        return this.walletStateInit;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (((((this.address.hashCode() * 31) + this.network.hashCode()) * 31) + this.walletStateInit.hashCode()) * 31) + this.publicKey.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "TonAddress(address=" + this.address + ", network=" + this.network + ", walletStateInit=" + this.walletStateInit + ", publicKey=" + this.publicKey + ")";
                    }

                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item.TonAddress.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<TonAddress> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ TonAddress(int i, String str, TonNetwork tonNetwork, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                        if (15 != (i & 15)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 15, WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.INSTANCE.getDescriptor());
                        }
                        this.address = str;
                        this.network = tonNetwork;
                        this.walletStateInit = str2;
                        this.publicKey = str3;
                    }

                    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonAddress tonAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonAddress.address);
                        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], tonAddress.network);
                        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonAddress.walletStateInit);
                        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonAddress.publicKey);
                    }

                    public TonAddress(@NotNull String str, @NotNull TonNetwork tonNetwork, @NotNull String str2, @NotNull String str3) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(tonNetwork, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        this.address = str;
                        this.network = tonNetwork;
                        this.walletStateInit = str2;
                        this.publicKey = str3;
                    }
                }

                @Serializable
                @SerialName("ton_proof")
                public static final class TonProof implements Item {
                    public static final int $stable = 0;
                    public static final Companion Companion = new Companion(null);
                    private final Proof proof;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ TonProof copy$default(TonProof tonProof, Proof proof, int i, Object obj) {
                        if ((i & 1) != 0) {
                            proof = tonProof.proof;
                        }
                        return tonProof.copy(proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Proof component1() {
                        return this.proof;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonProof copy(@NotNull Proof proof) {
                        Intrinsics.checkNotNullParameter(proof, "");
                        return new TonProof(proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof TonProof) && Intrinsics.EZpvd(this.proof, ((TonProof) obj).proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Proof getProof() {
                        return this.proof;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return this.proof.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "TonProof(proof=" + this.proof + ")";
                    }

                    public /* synthetic */ TonProof(int i, Proof proof, SerializationConstructorMarker serializationConstructorMarker) {
                        if (1 != (i & 1)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 1, WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer.INSTANCE.getDescriptor());
                        }
                        this.proof = proof;
                    }

                    public TonProof(@NotNull Proof proof) {
                        Intrinsics.checkNotNullParameter(proof, "");
                        this.proof = proof;
                    }

                    @Serializable
                    public static final class Proof {
                        public static final int $stable = 0;
                        public static final Companion Companion = new Companion(null);
                        private final Domain domain;
                        private final String payload;
                        private final String signature;
                        private final long timestamp;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Proof copy$default(Proof proof, long j, Domain domain, String str, String str2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                j = proof.timestamp;
                            }
                            long j2 = j;
                            if ((i & 2) != 0) {
                                domain = proof.domain;
                            }
                            Domain domain2 = domain;
                            if ((i & 4) != 0) {
                                str = proof.payload;
                            }
                            String str3 = str;
                            if ((i & 8) != 0) {
                                str2 = proof.signature;
                            }
                            return proof.copy(j2, domain2, str3, str2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final long component1() {
                            return this.timestamp;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Domain component2() {
                            return this.domain;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component3() {
                            return this.payload;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component4() {
                            return this.signature;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Proof copy(long j, @NotNull Domain domain, String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(domain, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            return new Proof(j, domain, str, str2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Proof)) {
                                return false;
                            }
                            Proof proof = (Proof) obj;
                            return this.timestamp == proof.timestamp && Intrinsics.EZpvd(this.domain, proof.domain) && Intrinsics.EZpvd((Object) this.payload, (Object) proof.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) proof.signature);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Domain getDomain() {
                            return this.domain;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getPayload() {
                            return this.payload;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getSignature() {
                            return this.signature;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final long getTimestamp() {
                            return this.timestamp;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public int hashCode() {
                            int iHashCode = Long.hashCode(this.timestamp);
                            int iHashCode2 = this.domain.hashCode();
                            String str = this.payload;
                            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.signature.hashCode();
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public String toString() {
                            return "Proof(timestamp=" + this.timestamp + ", domain=" + this.domain + ", payload=" + this.payload + ", signature=" + this.signature + ")";
                        }

                        public static final class Companion {
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            private Companion() {
                            }

                            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Companion.<init>():void type: THIS */
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Proof> serializer() {
                                return WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE;
                            }
                        }

                        public /* synthetic */ Proof(int i, long j, Domain domain, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                            if (15 != (i & 15)) {
                                PluginExceptionsKt.throwMissingFieldException(i, 15, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE.getDescriptor());
                            }
                            this.timestamp = j;
                            this.domain = domain;
                            this.payload = str;
                            this.signature = str2;
                        }

                        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Proof proof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                            compositeEncoder.encodeLongElement(serialDescriptor, 0, proof.timestamp);
                            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE, proof.domain);
                            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, proof.payload);
                            compositeEncoder.encodeStringElement(serialDescriptor, 3, proof.signature);
                        }

                        public Proof(long j, @NotNull Domain domain, String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(domain, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            this.timestamp = j;
                            this.domain = domain;
                            this.payload = str;
                            this.signature = str2;
                        }

                        @Serializable
                        public static final class Domain {
                            public static final int $stable = 0;
                            public static final Companion Companion = new Companion(null);
                            private final int lengthBytes;
                            private final String value;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public static /* synthetic */ Domain copy$default(Domain domain, int i, String str, int i2, Object obj) {
                                if ((i2 & 1) != 0) {
                                    i = domain.lengthBytes;
                                }
                                if ((i2 & 2) != 0) {
                                    str = domain.value;
                                }
                                return domain.copy(i, str);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final int component1() {
                                return this.lengthBytes;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component2() {
                                return this.value;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final Domain copy(int i, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "");
                                return new Domain(i, str);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof Domain)) {
                                    return false;
                                }
                                Domain domain = (Domain) obj;
                                return this.lengthBytes == domain.lengthBytes && Intrinsics.EZpvd((Object) this.value, (Object) domain.value);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final int getLengthBytes() {
                                return this.lengthBytes;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String getValue() {
                                return this.value;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public int hashCode() {
                                return (Integer.hashCode(this.lengthBytes) * 31) + this.value.hashCode();
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public String toString() {
                                return "Domain(lengthBytes=" + this.lengthBytes + ", value=" + this.value + ")";
                            }

                            public static final class Companion {
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                private Companion() {
                                }

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain.Companion.<init>():void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Domain> serializer() {
                                    return WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE;
                                }
                            }

                            public /* synthetic */ Domain(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
                                if (3 != (i & 3)) {
                                    PluginExceptionsKt.throwMissingFieldException(i, 3, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE.getDescriptor());
                                }
                                this.lengthBytes = i2;
                                this.value = str;
                            }

                            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Domain domain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                                compositeEncoder.encodeIntElement(serialDescriptor, 0, domain.lengthBytes);
                                compositeEncoder.encodeStringElement(serialDescriptor, 1, domain.value);
                            }

                            public Domain(int i, @NotNull String str) {
                                Intrinsics.checkNotNullParameter(str, "");
                                this.lengthBytes = i;
                                this.value = str;
                            }
                        }
                    }

                    public static final class Companion {
                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item.TonProof.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<TonProof> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer.INSTANCE;
                        }

                        public final TonProof OLrzqt(@NotNull TonProofReply tonProofReply) {
                            Intrinsics.checkNotNullParameter(tonProofReply, "");
                            return new TonProof(new Proof(tonProofReply.getProof().getTimestamp(), new Proof.Domain(tonProofReply.getProof().getDomain().getLengthBytes(), tonProofReply.getProof().getDomain().getValue()), tonProofReply.getProof().getPayload(), tonProofReply.getProof().getSignature()));
                        }
                    }
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r9v0 java.util.List)
  (wrap:com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device:0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:30) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Device.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device))
 A[MD:(java.util.List<? extends com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Item>, com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device):void (m)] (LINE:28) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.<init>(java.util.List, com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device):void type: THIS */
            public /* synthetic */ Payload(List list, Device device, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? new Device((String) null, (String) null, (String) null, 0, (List) null, 31, (DefaultConstructorMarker) null) : device);
            }

            @Serializable
            public static final class Device {
                private final String appName;
                private final String appVersion;
                private final List<String> features;
                private final int maxProtocolVersion;
                private final String platform;
                public static final Companion Companion = new Companion(null);
                public static final int $stable = 8;
                private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public Device() {
                    this((String) null, (String) null, (String) null, 0, (List) null, 31, (DefaultConstructorMarker) null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Device */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, int i, List list, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = device.appName;
                    }
                    if ((i2 & 2) != 0) {
                        str2 = device.appVersion;
                    }
                    String str4 = str2;
                    if ((i2 & 4) != 0) {
                        str3 = device.platform;
                    }
                    String str5 = str3;
                    if ((i2 & 8) != 0) {
                        i = device.maxProtocolVersion;
                    }
                    int i3 = i;
                    if ((i2 & 16) != 0) {
                        list = device.features;
                    }
                    return device.copy(str, str4, str5, i3, list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.appName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.appVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.platform;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int component4() {
                    return this.maxProtocolVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component5() {
                    return this.features;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Device copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<String> list) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    return new Device(str, str2, str3, i, list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Device)) {
                        return false;
                    }
                    Device device = (Device) obj;
                    return Intrinsics.EZpvd((Object) this.appName, (Object) device.appName) && Intrinsics.EZpvd((Object) this.appVersion, (Object) device.appVersion) && Intrinsics.EZpvd((Object) this.platform, (Object) device.platform) && this.maxProtocolVersion == device.maxProtocolVersion && Intrinsics.EZpvd(this.features, device.features);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getAppName() {
                    return this.appName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getAppVersion() {
                    return this.appVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getFeatures() {
                    return this.features;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int getMaxProtocolVersion() {
                    return this.maxProtocolVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPlatform() {
                    return this.platform;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((((((this.appName.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.maxProtocolVersion)) * 31) + this.features.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Device(appName=" + this.appName + ", appVersion=" + this.appVersion + ", platform=" + this.platform + ", maxProtocolVersion=" + this.maxProtocolVersion + ", features=" + this.features + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Device.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Device> serializer() {
                        return WalletEvent$ConnectSuccess$Payload$Device$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Device(int i, String str, String str2, String str3, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        if (C34703nhO.copydefault()) {
                            str = "okxWallet";
                        } else {
                            str = C34703nhO.AEQbTJ() ? "okxTonWalletTr" : "okxTonWallet";
                        }
                    }
                    this.appName = str;
                    if ((i & 2) == 0) {
                        this.appVersion = C32979mnm.EZpvd.EZpvd();
                    } else {
                        this.appVersion = str2;
                    }
                    if ((i & 4) == 0) {
                        this.platform = "android";
                    } else {
                        this.platform = str3;
                    }
                    if ((i & 8) == 0) {
                        this.maxProtocolVersion = 2;
                    } else {
                        this.maxProtocolVersion = i2;
                    }
                    if ((i & 16) == 0) {
                        this.features = C56402yEa.EZpvd("SendTransaction");
                    } else {
                        this.features = list;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [86=4] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Device device, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
                        compositeEncoder.encodeStringElement(serialDescriptor, 0, device.appName);
                    } else {
                        if (!Intrinsics.EZpvd((Object) device.appName, (Object) (C34703nhO.copydefault() ? "okxWallet" : C34703nhO.AEQbTJ() ? "okxTonWalletTr" : "okxTonWallet"))) {
                        }
                    }
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) device.appVersion, (Object) C32979mnm.EZpvd.EZpvd())) {
                        compositeEncoder.encodeStringElement(serialDescriptor, 1, device.appVersion);
                    }
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) device.platform, (Object) "android")) {
                        compositeEncoder.encodeStringElement(serialDescriptor, 2, device.platform);
                    }
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || device.maxProtocolVersion != 2) {
                        compositeEncoder.encodeIntElement(serialDescriptor, 3, device.maxProtocolVersion);
                    }
                    if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(device.features, C56402yEa.EZpvd("SendTransaction"))) {
                        return;
                    }
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], device.features);
                }

                public Device(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<String> list) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    this.appName = str;
                    this.appVersion = str2;
                    this.platform = str3;
                    this.maxProtocolVersion = i;
                    this.features = list;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ Device(String str, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i2 & 1) != 0) {
                        if (C34703nhO.copydefault()) {
                            str = "okxWallet";
                        } else {
                            str = C34703nhO.AEQbTJ() ? "okxTonWalletTr" : "okxTonWallet";
                        }
                    }
                    this(str, (i2 & 2) != 0 ? C32979mnm.EZpvd.EZpvd() : str2, (i2 & 4) != 0 ? "android" : str3, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? C56402yEa.EZpvd("SendTransaction") : list);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectSuccess(@NotNull Payload payload) {
            super(0L, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(payload, "");
            this.payload = payload;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:18)) : (r1v0 long))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(long, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:17) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.<init>(long, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ WalletEvent(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j, null);
    }

    @Serializable
    @SerialName("connect_error")
    public static final class ConnectError extends WalletEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final ErrorInfo payload;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ConnectError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConnectError copy$default(ConnectError connectError, ErrorInfo errorInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                errorInfo = connectError.payload;
            }
            return connectError.copy(errorInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorInfo component1() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectError copy(ErrorInfo errorInfo) {
            return new ConnectError(errorInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectError) && Intrinsics.EZpvd(this.payload, ((ConnectError) obj).payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorInfo getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ErrorInfo errorInfo = this.payload;
            if (errorInfo == null) {
                return 0;
            }
            return errorInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectError(payload=" + this.payload + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectError.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConnectError> serializer() {
                return WalletEvent$ConnectError$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConnectError(int i, long j, ErrorInfo errorInfo, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, j, serializationConstructorMarker);
            if ((i & 2) == 0) {
                this.payload = null;
            } else {
                this.payload = errorInfo;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectError connectError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            WalletEvent.write$Self(connectError, compositeEncoder, serialDescriptor);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && connectError.payload == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, connectError.payload);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo) : (r1v0 com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo))
 A[MD:(com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo):void (m)] (LINE:105) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectError.<init>(com.okinc.business.defi.wallet.common.tonconnect.model.reply.ErrorInfo):void type: THIS */
        public /* synthetic */ ConnectError(ErrorInfo errorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : errorInfo);
        }

        public ConnectError(ErrorInfo errorInfo) {
            super(0L, 1, (DefaultConstructorMarker) null);
            this.payload = errorInfo;
        }
    }

    @Serializable
    @SerialName("disconnect")
    public static final class Disconnect extends WalletEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.Disconnect.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Disconnect> serializer() {
                return WalletEvent$Disconnect$$serializer.INSTANCE;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 long), (r4v0 kotlinx.serialization.internal.SerializationConstructorMarker) A[MD:(int, long, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:109) call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.<init>(int, long, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
        public /* synthetic */ Disconnect(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, j, serializationConstructorMarker);
        }

        public Disconnect() {
            super(0L, 1, (DefaultConstructorMarker) null);
        }
    }
}
