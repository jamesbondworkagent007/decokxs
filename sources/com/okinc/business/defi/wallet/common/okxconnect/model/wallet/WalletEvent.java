package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$$serializer;
import com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C15940eaY;
import o.C15941eaZ;
import o.C15996ebb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = C15941eaZ.class)
public interface WalletEvent {
    public static final Companion Companion = Companion.OLrzqt;

    String getMethod();

    String getRequestId();

    public static final class Companion {
        public static final /* synthetic */ Companion OLrzqt = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<WalletEvent> serializer() {
            return C15941eaZ.OLrzqt;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Serializable
    public static final class ConnectSuccess implements WalletEvent {
        private final String method;
        private final Payload payload;
        private final String requestId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConnectSuccess copy$default(ConnectSuccess connectSuccess, String str, String str2, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectSuccess.requestId;
            }
            if ((i & 2) != 0) {
                str2 = connectSuccess.method;
            }
            if ((i & 4) != 0) {
                payload = connectSuccess.payload;
            }
            return connectSuccess.copy(str, str2, payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Payload component3() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectSuccess copy(@NotNull String str, @NotNull String str2, @NotNull Payload payload) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(payload, "");
            return new ConnectSuccess(str, str2, payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectSuccess)) {
                return false;
            }
            ConnectSuccess connectSuccess = (ConnectSuccess) obj;
            return Intrinsics.EZpvd((Object) this.requestId, (Object) connectSuccess.requestId) && Intrinsics.EZpvd((Object) this.method, (Object) connectSuccess.method) && Intrinsics.EZpvd(this.payload, connectSuccess.payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Payload getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.requestId.hashCode() * 31) + this.method.hashCode()) * 31) + this.payload.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectSuccess(requestId=" + this.requestId + ", method=" + this.method + ", payload=" + this.payload + ")";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConnectSuccess> serializer() {
                return WalletEvent$ConnectSuccess$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConnectSuccess(int i, String str, String str2, Payload payload, SerializationConstructorMarker serializationConstructorMarker) {
            if (5 != (i & 5)) {
                PluginExceptionsKt.throwMissingFieldException(i, 5, WalletEvent$ConnectSuccess$$serializer.INSTANCE.getDescriptor());
            }
            this.requestId = str;
            if ((i & 2) == 0) {
                this.method = "connect";
            } else {
                this.method = str2;
            }
            this.payload = payload;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectSuccess connectSuccess, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, connectSuccess.getRequestId());
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) connectSuccess.getMethod(), (Object) "connect")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, connectSuccess.getMethod());
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE, connectSuccess.payload);
        }

        public ConnectSuccess(@NotNull String str, @NotNull String str2, @NotNull Payload payload) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(payload, "");
            this.requestId = str;
            this.method = str2;
            this.payload = payload;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("connect") : (r2v0 java.lang.String))
  (r3v0 com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload):void (m)] (LINE:33) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload):void type: THIS */
        public /* synthetic */ ConnectSuccess(String str, String str2, Payload payload, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "connect" : str2, payload);
        }

        /* JADX INFO: loaded from: classes18.dex */
        @Serializable
        public static final class Payload {
            private final List<Response> responses;
            private final WalletInfo wallet;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(C15940eaY.OLrzqt), null};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Payload copy$default(Payload payload, List list, WalletInfo walletInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = payload.responses;
                }
                if ((i & 2) != 0) {
                    walletInfo = payload.wallet;
                }
                return payload.copy(list, walletInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Response> component1() {
                return this.responses;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WalletInfo component2() {
                return this.wallet;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Payload copy(@NotNull List<? extends Response> list, @NotNull WalletInfo walletInfo) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(walletInfo, "");
                return new Payload(list, walletInfo);
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
                return Intrinsics.EZpvd(this.responses, payload.responses) && Intrinsics.EZpvd(this.wallet, payload.wallet);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Response> getResponses() {
                return this.responses;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WalletInfo getWallet() {
                return this.wallet;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.responses.hashCode() * 31) + this.wallet.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Payload(responses=" + this.responses + ", wallet=" + this.wallet + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Payload> serializer() {
                    return WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Payload(int i, List list, WalletInfo walletInfo, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, WalletEvent$ConnectSuccess$Payload$$serializer.INSTANCE.getDescriptor());
                }
                this.responses = list;
                this.wallet = walletInfo;
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Payload payload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], payload.responses);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WalletInfo$$serializer.INSTANCE, payload.wallet);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response> */
            /* JADX WARN: Multi-variable type inference failed */
            public Payload(@NotNull List<? extends Response> list, @NotNull WalletInfo walletInfo) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(walletInfo, "");
                this.responses = list;
                this.wallet = walletInfo;
            }

            /* JADX INFO: loaded from: classes14.dex */
            @Serializable(with = C15940eaY.class)
            public interface Response {
                public static final Companion Companion = Companion.OLrzqt;

                String getName();

                boolean isErrorResponse();

                boolean isUserReject();

                /* JADX INFO: loaded from: classes18.dex */
                public static final class Companion {
                    public static final /* synthetic */ Companion OLrzqt = new Companion();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    public final KSerializer<Response> serializer() {
                        return C15940eaY.OLrzqt;
                    }
                }

                /* JADX INFO: loaded from: classes18.dex */
                public static final class Activity {
                    public static boolean KWHzl(@NotNull Response response) {
                        return response instanceof Error;
                    }

                    public static boolean OLrzqt(@NotNull Response response) {
                        return (response instanceof Error) && ((Error) response).getError().getCode() == OKXConnectException.ErrorType.USER_REJECTED.getCode();
                    }
                }

                @Serializable
                public static final class TonAddress implements Response {
                    public static final int $stable = 0;
                    private final String address;
                    private final String name;
                    private final TonNetwork network;
                    private final String publicKey;
                    private final String walletStateInit;
                    public static final Companion Companion = new Companion(null);
                    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork", TonNetwork.values(), new String[]{"-239", "-3"}, new Annotation[][]{null, null}, null), null, null};

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ TonAddress copy$default(TonAddress tonAddress, String str, String str2, TonNetwork tonNetwork, String str3, String str4, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = tonAddress.name;
                        }
                        if ((i & 2) != 0) {
                            str2 = tonAddress.address;
                        }
                        String str5 = str2;
                        if ((i & 4) != 0) {
                            tonNetwork = tonAddress.network;
                        }
                        TonNetwork tonNetwork2 = tonNetwork;
                        if ((i & 8) != 0) {
                            str3 = tonAddress.walletStateInit;
                        }
                        String str6 = str3;
                        if ((i & 16) != 0) {
                            str4 = tonAddress.publicKey;
                        }
                        return tonAddress.copy(str, str5, tonNetwork2, str6, str4);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.address;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonNetwork component3() {
                        return this.network;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component4() {
                        return this.walletStateInit;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component5() {
                        return this.publicKey;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonAddress copy(@NotNull String str, @NotNull String str2, @NotNull TonNetwork tonNetwork, @NotNull String str3, @NotNull String str4) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(tonNetwork, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(str4, "");
                        return new TonAddress(str, str2, tonNetwork, str3, str4);
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
                        return Intrinsics.EZpvd((Object) this.name, (Object) tonAddress.name) && Intrinsics.EZpvd((Object) this.address, (Object) tonAddress.address) && this.network == tonAddress.network && Intrinsics.EZpvd((Object) this.walletStateInit, (Object) tonAddress.walletStateInit) && Intrinsics.EZpvd((Object) this.publicKey, (Object) tonAddress.publicKey);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getAddress() {
                        return this.address;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public String getName() {
                        return this.name;
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
                        return (((((((this.name.hashCode() * 31) + this.address.hashCode()) * 31) + this.network.hashCode()) * 31) + this.walletStateInit.hashCode()) * 31) + this.publicKey.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "TonAddress(name=" + this.name + ", address=" + this.address + ", network=" + this.network + ", walletStateInit=" + this.walletStateInit + ", publicKey=" + this.publicKey + ")";
                    }

                    /* JADX INFO: loaded from: classes18.dex */
                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonAddress.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<TonAddress> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Response$TonAddress$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ TonAddress(int i, String str, String str2, TonNetwork tonNetwork, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                        if (30 != (i & 30)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 30, WalletEvent$ConnectSuccess$Payload$Response$TonAddress$$serializer.INSTANCE.getDescriptor());
                        }
                        if ((i & 1) == 0) {
                            this.name = "ton_addr";
                        } else {
                            this.name = str;
                        }
                        this.address = str2;
                        this.network = tonNetwork;
                        this.walletStateInit = str3;
                        this.publicKey = str4;
                    }

                    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonAddress tonAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tonAddress.getName(), (Object) "ton_addr")) {
                            compositeEncoder.encodeStringElement(serialDescriptor, 0, tonAddress.getName());
                        }
                        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonAddress.address);
                        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tonAddress.network);
                        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonAddress.walletStateInit);
                        compositeEncoder.encodeStringElement(serialDescriptor, 4, tonAddress.publicKey);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isErrorResponse() {
                        return Activity.KWHzl(this);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isUserReject() {
                        return Activity.OLrzqt(this);
                    }

                    public TonAddress(@NotNull String str, @NotNull String str2, @NotNull TonNetwork tonNetwork, @NotNull String str3, @NotNull String str4) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(tonNetwork, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(str4, "");
                        this.name = str;
                        this.address = str2;
                        this.network = tonNetwork;
                        this.walletStateInit = str3;
                        this.publicKey = str4;
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("ton_addr") : (r7v0 java.lang.String))
  (r8v0 java.lang.String)
  (r9v0 com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonAddress.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork, java.lang.String, java.lang.String):void type: THIS */
                    public /* synthetic */ TonAddress(String str, String str2, TonNetwork tonNetwork, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "ton_addr" : str, str2, tonNetwork, str3, str4);
                    }
                }

                @Serializable
                public static final class TonProof implements Response {
                    public static final int $stable = 0;
                    public static final Companion Companion = new Companion(null);
                    private final String name;
                    private final Proof proof;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ TonProof copy$default(TonProof tonProof, String str, Proof proof, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = tonProof.name;
                        }
                        if ((i & 2) != 0) {
                            proof = tonProof.proof;
                        }
                        return tonProof.copy(str, proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Proof component2() {
                        return this.proof;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TonProof copy(@NotNull String str, @NotNull Proof proof) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(proof, "");
                        return new TonProof(str, proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TonProof)) {
                            return false;
                        }
                        TonProof tonProof = (TonProof) obj;
                        return Intrinsics.EZpvd((Object) this.name, (Object) tonProof.name) && Intrinsics.EZpvd(this.proof, tonProof.proof);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public String getName() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Proof getProof() {
                        return this.proof;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (this.name.hashCode() * 31) + this.proof.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "TonProof(name=" + this.name + ", proof=" + this.proof + ")";
                    }

                    public /* synthetic */ TonProof(int i, String str, Proof proof, SerializationConstructorMarker serializationConstructorMarker) {
                        if (2 != (i & 2)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 2, WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer.INSTANCE.getDescriptor());
                        }
                        if ((i & 1) == 0) {
                            this.name = "ton_proof";
                        } else {
                            this.name = str;
                        }
                        this.proof = proof;
                    }

                    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonProof tonProof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tonProof.getName(), (Object) "ton_proof")) {
                            compositeEncoder.encodeStringElement(serialDescriptor, 0, tonProof.getName());
                        }
                        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE, tonProof.proof);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isErrorResponse() {
                        return Activity.KWHzl(this);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isUserReject() {
                        return Activity.OLrzqt(this);
                    }

                    public TonProof(@NotNull String str, @NotNull Proof proof) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(proof, "");
                        this.name = str;
                        this.proof = proof;
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("ton_proof") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof)
 A[MD:(java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof):void (m)] (LINE:66) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof.<init>(java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof):void type: THIS */
                    public /* synthetic */ TonProof(String str, Proof proof, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "ton_proof" : str, proof);
                    }

                    /* JADX INFO: loaded from: classes18.dex */
                    @Serializable
                    public static final class Proof {
                        public static final int $stable = 0;
                        public static final Companion Companion = new Companion(null);
                        private final Domain domain;
                        private final String payload;
                        private final String signature;
                        private final long timestamp;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Proof copy$default(Proof proof, Domain domain, long j, String str, String str2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                domain = proof.domain;
                            }
                            if ((i & 2) != 0) {
                                j = proof.timestamp;
                            }
                            long j2 = j;
                            if ((i & 4) != 0) {
                                str = proof.payload;
                            }
                            String str3 = str;
                            if ((i & 8) != 0) {
                                str2 = proof.signature;
                            }
                            return proof.copy(domain, j2, str3, str2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Domain component1() {
                            return this.domain;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final long component2() {
                            return this.timestamp;
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
                        public final Proof copy(@NotNull Domain domain, long j, @NotNull String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(domain, "");
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            return new Proof(domain, j, str, str2);
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
                            return Intrinsics.EZpvd(this.domain, proof.domain) && this.timestamp == proof.timestamp && Intrinsics.EZpvd((Object) this.payload, (Object) proof.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) proof.signature);
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
                            return (((((this.domain.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.payload.hashCode()) * 31) + this.signature.hashCode();
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public String toString() {
                            return "Proof(domain=" + this.domain + ", timestamp=" + this.timestamp + ", payload=" + this.payload + ", signature=" + this.signature + ")";
                        }

                        public static final class Companion {
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            private Companion() {
                            }

                            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Companion.<init>():void type: THIS */
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Proof> serializer() {
                                return WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE;
                            }
                        }

                        public /* synthetic */ Proof(int i, Domain domain, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                            if (15 != (i & 15)) {
                                PluginExceptionsKt.throwMissingFieldException(i, 15, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE.getDescriptor());
                            }
                            this.domain = domain;
                            this.timestamp = j;
                            this.payload = str;
                            this.signature = str2;
                        }

                        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Proof proof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE, proof.domain);
                            compositeEncoder.encodeLongElement(serialDescriptor, 1, proof.timestamp);
                            compositeEncoder.encodeStringElement(serialDescriptor, 2, proof.payload);
                            compositeEncoder.encodeStringElement(serialDescriptor, 3, proof.signature);
                        }

                        public Proof(@NotNull Domain domain, long j, @NotNull String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(domain, "");
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            this.domain = domain;
                            this.timestamp = j;
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

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain.Companion.<init>():void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Domain> serializer() {
                                    return WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE;
                                }
                            }

                            public /* synthetic */ Domain(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
                                if (3 != (i & 3)) {
                                    PluginExceptionsKt.throwMissingFieldException(i, 3, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE.getDescriptor());
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
                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<TonProof> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer.INSTANCE;
                        }

                        public final TonProof KWHzl(@NotNull TonProofReply tonProofReply) {
                            Intrinsics.checkNotNullParameter(tonProofReply, "");
                            return new TonProof((String) null, new Proof(new Proof.Domain(tonProofReply.getProof().getDomain().getLengthBytes(), tonProofReply.getProof().getDomain().getValue()), tonProofReply.getProof().getTimestamp(), tonProofReply.getProof().getPayload(), tonProofReply.getProof().getSignature()), 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        }
                    }
                }

                /* JADX INFO: loaded from: classes18.dex */
                @Serializable
                public static final class Accounts implements Response {
                    private final List<Account> accounts;
                    private final List<ConnectRequestMethodResponse> connectRequestMethodResponses;
                    private final String name;
                    private final String walletName;
                    public static final Companion Companion = new Companion(null);
                    public static final int $stable = 8;
                    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer.INSTANCE), null, new ArrayListSerializer(C15996ebb.copydefault)};

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts */
                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Accounts copy$default(Accounts accounts, String str, List list, String str2, List list2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = accounts.name;
                        }
                        if ((i & 2) != 0) {
                            list = accounts.accounts;
                        }
                        if ((i & 4) != 0) {
                            str2 = accounts.walletName;
                        }
                        if ((i & 8) != 0) {
                            list2 = accounts.connectRequestMethodResponses;
                        }
                        return accounts.copy(str, list, str2, list2);
                    }

                    @SerialName("connectRequestMethods")
                    public static /* synthetic */ void getConnectRequestMethodResponses$annotations() {
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<Account> component2() {
                        return this.accounts;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component3() {
                        return this.walletName;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<ConnectRequestMethodResponse> component4() {
                        return this.connectRequestMethodResponses;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Accounts copy(@NotNull String str, @NotNull List<Account> list, @NotNull String str2, List<? extends ConnectRequestMethodResponse> list2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(list, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        return new Accounts(str, list, str2, list2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Accounts)) {
                            return false;
                        }
                        Accounts accounts = (Accounts) obj;
                        return Intrinsics.EZpvd((Object) this.name, (Object) accounts.name) && Intrinsics.EZpvd(this.accounts, accounts.accounts) && Intrinsics.EZpvd((Object) this.walletName, (Object) accounts.walletName) && Intrinsics.EZpvd(this.connectRequestMethodResponses, accounts.connectRequestMethodResponses);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<Account> getAccounts() {
                        return this.accounts;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<ConnectRequestMethodResponse> getConnectRequestMethodResponses() {
                        return this.connectRequestMethodResponses;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public String getName() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getWalletName() {
                        return this.walletName;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        int iHashCode = this.name.hashCode();
                        int iHashCode2 = this.accounts.hashCode();
                        int iHashCode3 = this.walletName.hashCode();
                        List<ConnectRequestMethodResponse> list = this.connectRequestMethodResponses;
                        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "Accounts(name=" + this.name + ", accounts=" + this.accounts + ", walletName=" + this.walletName + ", connectRequestMethodResponses=" + this.connectRequestMethodResponses + ")";
                    }

                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Accounts> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Response$Accounts$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ Accounts(int i, String str, List list, String str2, List list2, SerializationConstructorMarker serializationConstructorMarker) {
                        if (14 != (i & 14)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 14, WalletEvent$ConnectSuccess$Payload$Response$Accounts$$serializer.INSTANCE.getDescriptor());
                        }
                        if ((i & 1) == 0) {
                            this.name = "requestAccounts";
                        } else {
                            this.name = str;
                        }
                        this.accounts = list;
                        this.walletName = str2;
                        this.connectRequestMethodResponses = list2;
                    }

                    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Accounts accounts, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accounts.getName(), (Object) "requestAccounts")) {
                            compositeEncoder.encodeStringElement(serialDescriptor, 0, accounts.getName());
                        }
                        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], accounts.accounts);
                        compositeEncoder.encodeStringElement(serialDescriptor, 2, accounts.walletName);
                        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], accounts.connectRequestMethodResponses);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isErrorResponse() {
                        return Activity.KWHzl(this);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isUserReject() {
                        return Activity.OLrzqt(this);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse> */
                    /* JADX WARN: Multi-variable type inference failed */
                    public Accounts(@NotNull String str, @NotNull List<Account> list, @NotNull String str2, List<? extends ConnectRequestMethodResponse> list2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(list, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.name = str;
                        this.accounts = list;
                        this.walletName = str2;
                        this.connectRequestMethodResponses = list2;
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("requestAccounts") : (r1v0 java.lang.String))
  (r2v0 java.util.List)
  (r3v0 java.lang.String)
  (r4v0 java.util.List)
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account>, java.lang.String, java.util.List<? extends com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse>):void (m)] (LINE:105) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.<init>(java.lang.String, java.util.List, java.lang.String, java.util.List):void type: THIS */
                    public /* synthetic */ Accounts(String str, List list, String str2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "requestAccounts" : str, list, str2, list2);
                    }

                    @Serializable
                    public static final class Account {
                        private static final KSerializer<Object>[] $childSerializers;
                        private final List<String> addresses;
                        private final Map<String, Response> data;
                        private final Map<String, JsonObject> extra;
                        private final List<String> methods;
                        private final String namespace;
                        public static final Companion Companion = new Companion(null);
                        public static final int $stable = 8;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account */
                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ Account copy$default(Account account, String str, List list, List list2, Map map, Map map2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = account.namespace;
                            }
                            if ((i & 2) != 0) {
                                list = account.addresses;
                            }
                            List list3 = list;
                            if ((i & 4) != 0) {
                                list2 = account.methods;
                            }
                            List list4 = list2;
                            if ((i & 8) != 0) {
                                map = account.data;
                            }
                            Map map3 = map;
                            if ((i & 16) != 0) {
                                map2 = account.extra;
                            }
                            return account.copy(str, list3, list4, map3, map2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component1() {
                            return this.namespace;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final List<String> component2() {
                            return this.addresses;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final List<String> component3() {
                            return this.methods;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Map<String, Response> component4() {
                            return this.data;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Map<String, JsonObject> component5() {
                            return this.extra;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Account copy(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2, Map<String, ? extends Response> map, Map<String, JsonObject> map2) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(list, "");
                            Intrinsics.checkNotNullParameter(list2, "");
                            return new Account(str, list, list2, map, map2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Account)) {
                                return false;
                            }
                            Account account = (Account) obj;
                            return Intrinsics.EZpvd((Object) this.namespace, (Object) account.namespace) && Intrinsics.EZpvd(this.addresses, account.addresses) && Intrinsics.EZpvd(this.methods, account.methods) && Intrinsics.EZpvd(this.data, account.data) && Intrinsics.EZpvd(this.extra, account.extra);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final List<String> getAddresses() {
                            return this.addresses;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Map<String, Response> getData() {
                            return this.data;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Map<String, JsonObject> getExtra() {
                            return this.extra;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final List<String> getMethods() {
                            return this.methods;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getNamespace() {
                            return this.namespace;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public int hashCode() {
                            int iHashCode = this.namespace.hashCode();
                            int iHashCode2 = this.addresses.hashCode();
                            int iHashCode3 = this.methods.hashCode();
                            Map<String, Response> map = this.data;
                            int iHashCode4 = map == null ? 0 : map.hashCode();
                            Map<String, JsonObject> map2 = this.extra;
                            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map2 != null ? map2.hashCode() : 0);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public String toString() {
                            return "Account(namespace=" + this.namespace + ", addresses=" + this.addresses + ", methods=" + this.methods + ", data=" + this.data + ", extra=" + this.extra + ")";
                        }

                        public static final class Companion {
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            private Companion() {
                            }

                            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.Companion.<init>():void type: THIS */
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Account> serializer() {
                                return WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer.INSTANCE;
                            }
                        }

                        static {
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, C15940eaY.OLrzqt), new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE))};
                        }

                        public /* synthetic */ Account(int i, String str, List list, List list2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
                            if (7 != (i & 7)) {
                                PluginExceptionsKt.throwMissingFieldException(i, 7, WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer.INSTANCE.getDescriptor());
                            }
                            this.namespace = str;
                            this.addresses = list;
                            this.methods = list2;
                            if ((i & 8) == 0) {
                                this.data = null;
                            } else {
                                this.data = map;
                            }
                            if ((i & 16) == 0) {
                                this.extra = null;
                            } else {
                                this.extra = map2;
                            }
                        }

                        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Account account, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                            KSerializer<Object>[] kSerializerArr = $childSerializers;
                            compositeEncoder.encodeStringElement(serialDescriptor, 0, account.namespace);
                            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], account.addresses);
                            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], account.methods);
                            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || account.data != null) {
                                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], account.data);
                            }
                            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && account.extra == null) {
                                return;
                            }
                            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], account.extra);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response> */
                        /* JADX WARN: Multi-variable type inference failed */
                        public Account(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2, Map<String, ? extends Response> map, Map<String, JsonObject> map2) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(list, "");
                            Intrinsics.checkNotNullParameter(list2, "");
                            this.namespace = str;
                            this.addresses = list;
                            this.methods = list2;
                            this.data = map;
                            this.extra = map2;
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.util.List)
  (r10v0 java.util.List)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r11v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r12v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response>, java.util.Map<java.lang.String, kotlinx.serialization.json.JsonObject>):void (m)] (LINE:114) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.<init>(java.lang.String, java.util.List, java.util.List, java.util.Map, java.util.Map):void type: THIS */
                        public /* synthetic */ Account(String str, List list, List list2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this(str, list, list2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : map2);
                        }
                    }

                    @Serializable(with = C15996ebb.class)
                    public interface ConnectRequestMethodResponse {
                        public static final Companion Companion = Companion.AEQbTJ;

                        String getChainId();

                        String getMethod();

                        public static final class Companion {
                            public static final /* synthetic */ Companion AEQbTJ = new Companion();

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            private Companion() {
                            }

                            public final KSerializer<ConnectRequestMethodResponse> serializer() {
                                return C15996ebb.copydefault;
                            }
                        }

                        @Serializable
                        public static final class Success implements ConnectRequestMethodResponse {
                            public static final int $stable = 0;
                            public static final Companion Companion = new Companion(null);
                            private final String chainId;
                            private final String method;
                            private final String result;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
                                if ((i & 1) != 0) {
                                    str = success.method;
                                }
                                if ((i & 2) != 0) {
                                    str2 = success.chainId;
                                }
                                if ((i & 4) != 0) {
                                    str3 = success.result;
                                }
                                return success.copy(str, str2, str3);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component1() {
                                return this.method;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component2() {
                                return this.chainId;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component3() {
                                return this.result;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final Success copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                Intrinsics.checkNotNullParameter(str3, "");
                                return new Success(str, str2, str3);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof Success)) {
                                    return false;
                                }
                                Success success = (Success) obj;
                                return Intrinsics.EZpvd((Object) this.method, (Object) success.method) && Intrinsics.EZpvd((Object) this.chainId, (Object) success.chainId) && Intrinsics.EZpvd((Object) this.result, (Object) success.result);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse
                            public String getChainId() {
                                return this.chainId;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse
                            public String getMethod() {
                                return this.method;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String getResult() {
                                return this.result;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public int hashCode() {
                                return (((this.method.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.result.hashCode();
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public String toString() {
                                return "Success(method=" + this.method + ", chainId=" + this.chainId + ", result=" + this.result + ")";
                            }

                            public static final class Companion {
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                private Companion() {
                                }

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Success.Companion.<init>():void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Success> serializer() {
                                    return WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Success$$serializer.INSTANCE;
                                }
                            }

                            public /* synthetic */ Success(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                                if (7 != (i & 7)) {
                                    PluginExceptionsKt.throwMissingFieldException(i, 7, WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Success$$serializer.INSTANCE.getDescriptor());
                                }
                                this.method = str;
                                this.chainId = str2;
                                this.result = str3;
                            }

                            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Success success, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                                compositeEncoder.encodeStringElement(serialDescriptor, 0, success.getMethod());
                                compositeEncoder.encodeStringElement(serialDescriptor, 1, success.getChainId());
                                compositeEncoder.encodeStringElement(serialDescriptor, 2, success.result);
                            }

                            public Success(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                Intrinsics.checkNotNullParameter(str3, "");
                                this.method = str;
                                this.chainId = str2;
                                this.result = str3;
                            }
                        }

                        @Serializable
                        public static final class Error implements ConnectRequestMethodResponse {
                            public static final int $stable = 0;
                            public static final Companion Companion = new Companion(null);
                            private final String chainId;
                            private final OKXConnectException error;
                            private final String method;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public static /* synthetic */ Error copy$default(Error error, String str, String str2, OKXConnectException oKXConnectException, int i, Object obj) {
                                if ((i & 1) != 0) {
                                    str = error.method;
                                }
                                if ((i & 2) != 0) {
                                    str2 = error.chainId;
                                }
                                if ((i & 4) != 0) {
                                    oKXConnectException = error.error;
                                }
                                return error.copy(str, str2, oKXConnectException);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component1() {
                                return this.method;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component2() {
                                return this.chainId;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final OKXConnectException component3() {
                                return this.error;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final Error copy(@NotNull String str, @NotNull String str2, @NotNull OKXConnectException oKXConnectException) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                Intrinsics.checkNotNullParameter(oKXConnectException, "");
                                return new Error(str, str2, oKXConnectException);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof Error)) {
                                    return false;
                                }
                                Error error = (Error) obj;
                                return Intrinsics.EZpvd((Object) this.method, (Object) error.method) && Intrinsics.EZpvd((Object) this.chainId, (Object) error.chainId) && Intrinsics.EZpvd(this.error, error.error);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse
                            public String getChainId() {
                                return this.chainId;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final OKXConnectException getError() {
                                return this.error;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse
                            public String getMethod() {
                                return this.method;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public int hashCode() {
                                return (((this.method.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.error.hashCode();
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public String toString() {
                                return "Error(method=" + this.method + ", chainId=" + this.chainId + ", error=" + this.error + ")";
                            }

                            public static final class Companion {
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                private Companion() {
                                }

                                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error.Companion.<init>():void type: THIS */
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Error> serializer() {
                                    return WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer.INSTANCE;
                                }
                            }

                            public /* synthetic */ Error(int i, String str, String str2, OKXConnectException oKXConnectException, SerializationConstructorMarker serializationConstructorMarker) {
                                if (7 != (i & 7)) {
                                    PluginExceptionsKt.throwMissingFieldException(i, 7, WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer.INSTANCE.getDescriptor());
                                }
                                this.method = str;
                                this.chainId = str2;
                                this.error = oKXConnectException;
                            }

                            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Error error, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                                compositeEncoder.encodeStringElement(serialDescriptor, 0, error.getMethod());
                                compositeEncoder.encodeStringElement(serialDescriptor, 1, error.getChainId());
                                compositeEncoder.encodeSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, error.error);
                            }

                            public Error(@NotNull String str, @NotNull String str2, @NotNull OKXConnectException oKXConnectException) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                Intrinsics.checkNotNullParameter(oKXConnectException, "");
                                this.method = str;
                                this.chainId = str2;
                                this.error = oKXConnectException;
                            }
                        }
                    }
                }

                @Serializable
                public static final class Error implements Response {
                    public static final int $stable = 0;
                    public static final Companion Companion = new Companion(null);
                    private final OKXConnectException error;
                    private final String name;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ Error copy$default(Error error, String str, OKXConnectException oKXConnectException, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = error.name;
                        }
                        if ((i & 2) != 0) {
                            oKXConnectException = error.error;
                        }
                        return error.copy(str, oKXConnectException);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final OKXConnectException component2() {
                        return this.error;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Error copy(@NotNull String str, @NotNull OKXConnectException oKXConnectException) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(oKXConnectException, "");
                        return new Error(str, oKXConnectException);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Error)) {
                            return false;
                        }
                        Error error = (Error) obj;
                        return Intrinsics.EZpvd((Object) this.name, (Object) error.name) && Intrinsics.EZpvd(this.error, error.error);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final OKXConnectException getError() {
                        return this.error;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public String getName() {
                        return this.name;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (this.name.hashCode() * 31) + this.error.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "Error(name=" + this.name + ", error=" + this.error + ")";
                    }

                    /* JADX INFO: loaded from: classes18.dex */
                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Error.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Error> serializer() {
                            return WalletEvent$ConnectSuccess$Payload$Response$Error$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ Error(int i, String str, OKXConnectException oKXConnectException, SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 3, WalletEvent$ConnectSuccess$Payload$Response$Error$$serializer.INSTANCE.getDescriptor());
                        }
                        this.name = str;
                        this.error = oKXConnectException;
                    }

                    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Error error, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        compositeEncoder.encodeStringElement(serialDescriptor, 0, error.getName());
                        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, OKXConnectException$$serializer.INSTANCE, error.error);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isErrorResponse() {
                        return Activity.KWHzl(this);
                    }

                    @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response
                    public boolean isUserReject() {
                        return Activity.OLrzqt(this);
                    }

                    public Error(@NotNull String str, @NotNull OKXConnectException oKXConnectException) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(oKXConnectException, "");
                        this.name = str;
                        this.error = oKXConnectException;
                    }
                }
            }
        }
    }

    @Serializable
    public static final class ConnectError implements WalletEvent {
        private final String method;
        private final OKXConnectException payload;
        private final String requestId;
        private final WalletInfo walletInfo;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ConnectError() {
            this((String) null, (String) null, (OKXConnectException) null, (WalletInfo) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConnectError copy$default(ConnectError connectError, String str, String str2, OKXConnectException oKXConnectException, WalletInfo walletInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectError.requestId;
            }
            if ((i & 2) != 0) {
                str2 = connectError.method;
            }
            if ((i & 4) != 0) {
                oKXConnectException = connectError.payload;
            }
            if ((i & 8) != 0) {
                walletInfo = connectError.walletInfo;
            }
            return connectError.copy(str, str2, oKXConnectException, walletInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKXConnectException component3() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletInfo component4() {
            return this.walletInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectError copy(@NotNull String str, @NotNull String str2, OKXConnectException oKXConnectException, @NotNull WalletInfo walletInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(walletInfo, "");
            return new ConnectError(str, str2, oKXConnectException, walletInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectError)) {
                return false;
            }
            ConnectError connectError = (ConnectError) obj;
            return Intrinsics.EZpvd((Object) this.requestId, (Object) connectError.requestId) && Intrinsics.EZpvd((Object) this.method, (Object) connectError.method) && Intrinsics.EZpvd(this.payload, connectError.payload) && Intrinsics.EZpvd(this.walletInfo, connectError.walletInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKXConnectException getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletInfo getWalletInfo() {
            return this.walletInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.requestId.hashCode();
            int iHashCode2 = this.method.hashCode();
            OKXConnectException oKXConnectException = this.payload;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (oKXConnectException == null ? 0 : oKXConnectException.hashCode())) * 31) + this.walletInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectError(requestId=" + this.requestId + ", method=" + this.method + ", payload=" + this.payload + ", walletInfo=" + this.walletInfo + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectError.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConnectError> serializer() {
                return WalletEvent$ConnectError$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConnectError(int i, String str, String str2, OKXConnectException oKXConnectException, WalletInfo walletInfo, SerializationConstructorMarker serializationConstructorMarker) {
            this.requestId = (i & 1) == 0 ? String.valueOf(System.currentTimeMillis()) : str;
            if ((i & 2) == 0) {
                this.method = "connect_error";
            } else {
                this.method = str2;
            }
            if ((i & 4) == 0) {
                this.payload = null;
            } else {
                this.payload = oKXConnectException;
            }
            if ((i & 8) == 0) {
                this.walletInfo = new WalletInfo((String) null, (String) null, (String) null, 0, (JsonObject) null, 15, (DefaultConstructorMarker) null);
            } else {
                this.walletInfo = walletInfo;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectError connectError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) connectError.getRequestId(), (Object) String.valueOf(System.currentTimeMillis()))) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, connectError.getRequestId());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) connectError.getMethod(), (Object) "connect_error")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, connectError.getMethod());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || connectError.payload != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, connectError.payload);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(connectError.walletInfo, new WalletInfo((String) null, (String) null, (String) null, 0, (JsonObject) null, 15, (DefaultConstructorMarker) null))) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, WalletInfo$$serializer.INSTANCE, connectError.walletInfo);
        }

        public ConnectError(@NotNull String str, @NotNull String str2, OKXConnectException oKXConnectException, @NotNull WalletInfo walletInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(walletInfo, "");
            this.requestId = str;
            this.method = str2;
            this.payload = oKXConnectException;
            this.walletInfo = walletInfo;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE 
  (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:159))
 STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:159)) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("connect_error") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException) : (r11v0 com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException))
  (wrap:com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo:0x0026: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:kotlinx.serialization.json.JsonObject:?: CAST (kotlinx.serialization.json.JsonObject) (null kotlinx.serialization.json.JsonObject))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlinx.serialization.json.JsonObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:162) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlinx.serialization.json.JsonObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo):void (m)] (LINE:158) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectError.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException, com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo):void type: THIS */
        public /* synthetic */ ConnectError(String str, String str2, OKXConnectException oKXConnectException, WalletInfo walletInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 2) != 0 ? "connect_error" : str2, (i & 4) != 0 ? null : oKXConnectException, (i & 8) != 0 ? new WalletInfo((String) null, (String) null, (String) null, 0, (JsonObject) null, 15, (DefaultConstructorMarker) null) : walletInfo);
        }
    }

    @Serializable
    public static final class Disconnect implements WalletEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String method;
        private final String requestId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Disconnect() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.Disconnect.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Disconnect> serializer() {
                return WalletEvent$Disconnect$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Disconnect(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.requestId = (i & 1) == 0 ? String.valueOf(System.currentTimeMillis()) : str;
            if ((i & 2) == 0) {
                this.method = "disconnect";
            } else {
                this.method = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Disconnect disconnect, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) disconnect.getRequestId(), (Object) String.valueOf(System.currentTimeMillis()))) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, disconnect.getRequestId());
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) disconnect.getMethod(), (Object) "disconnect")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 1, disconnect.getMethod());
        }

        public Disconnect(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.requestId = str;
            this.method = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE 
  (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:168))
 STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:168)) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("disconnect") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:167) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.Disconnect.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Disconnect(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 2) != 0 ? "disconnect" : str2);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Serializable
    public static final class SessionConnecting implements WalletEvent {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String method;
        private final String requestId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SessionConnecting() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.SessionConnecting.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SessionConnecting> serializer() {
                return WalletEvent$SessionConnecting$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SessionConnecting(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.requestId = (i & 1) == 0 ? String.valueOf(System.currentTimeMillis()) : str;
            if ((i & 2) == 0) {
                this.method = "session_connecting";
            } else {
                this.method = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SessionConnecting sessionConnecting, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sessionConnecting.getRequestId(), (Object) String.valueOf(System.currentTimeMillis()))) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, sessionConnecting.getRequestId());
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) sessionConnecting.getMethod(), (Object) "session_connecting")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 1, sessionConnecting.getMethod());
        }

        public SessionConnecting(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.requestId = str;
            this.method = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE 
  (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:175))
 STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:175)) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("session_connecting") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:174) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.SessionConnecting.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SessionConnecting(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 2) != 0 ? "session_connecting" : str2);
        }
    }
}
