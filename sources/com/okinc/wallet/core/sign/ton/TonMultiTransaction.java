package com.okinc.wallet.core.sign.ton;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TonMultiTransaction {
    private final String from;
    private final List<Message> messages;
    private final String network;
    private final String nonce;
    private final String pubKey;
    private final long valid_until;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TonMultiTransaction$Message$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.wallet.core.sign.ton.TonMultiTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TonMultiTransaction copy$default(TonMultiTransaction tonMultiTransaction, List list, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tonMultiTransaction.messages;
        }
        if ((i & 2) != 0) {
            j = tonMultiTransaction.valid_until;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = tonMultiTransaction.from;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = tonMultiTransaction.network;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = tonMultiTransaction.pubKey;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = tonMultiTransaction.nonce;
        }
        return tonMultiTransaction.copy(list, j2, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Message> component1() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.valid_until;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonMultiTransaction copy(@NotNull List<Message> list, long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TonMultiTransaction(list, j, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonMultiTransaction)) {
            return false;
        }
        TonMultiTransaction tonMultiTransaction = (TonMultiTransaction) obj;
        return Intrinsics.EZpvd(this.messages, tonMultiTransaction.messages) && this.valid_until == tonMultiTransaction.valid_until && Intrinsics.EZpvd((Object) this.from, (Object) tonMultiTransaction.from) && Intrinsics.EZpvd((Object) this.network, (Object) tonMultiTransaction.network) && Intrinsics.EZpvd((Object) this.pubKey, (Object) tonMultiTransaction.pubKey) && Intrinsics.EZpvd((Object) this.nonce, (Object) tonMultiTransaction.nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Message> getMessages() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getValid_until() {
        return this.valid_until;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.messages.hashCode() * 31) + Long.hashCode(this.valid_until)) * 31) + this.from.hashCode()) * 31) + this.network.hashCode()) * 31) + this.pubKey.hashCode()) * 31) + this.nonce.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonMultiTransaction(messages=" + this.messages + ", valid_until=" + this.valid_until + ", from=" + this.from + ", network=" + this.network + ", pubKey=" + this.pubKey + ", nonce=" + this.nonce + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonMultiTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonMultiTransaction> serializer() {
            return TonMultiTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonMultiTransaction(int i, List list, long j, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, TonMultiTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.messages = list;
        this.valid_until = j;
        this.from = str;
        this.network = str2;
        this.pubKey = str3;
        this.nonce = str4;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonMultiTransaction tonMultiTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], tonMultiTransaction.messages);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, tonMultiTransaction.valid_until);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonMultiTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonMultiTransaction.network);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tonMultiTransaction.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tonMultiTransaction.nonce);
    }

    public TonMultiTransaction(@NotNull List<Message> list, long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.messages = list;
        this.valid_until = j;
        this.from = str;
        this.network = str2;
        this.pubKey = str3;
        this.nonce = str4;
    }

    @Serializable
    public static final class Message {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final String amount;
        private final String payload;
        private final String stateInit;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = message.address;
            }
            if ((i & 2) != 0) {
                str2 = message.amount;
            }
            if ((i & 4) != 0) {
                str3 = message.payload;
            }
            if ((i & 8) != 0) {
                str4 = message.stateInit;
            }
            return message.copy(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.stateInit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Message copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Message(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) message.address) && Intrinsics.EZpvd((Object) this.amount, (Object) message.amount) && Intrinsics.EZpvd((Object) this.payload, (Object) message.payload) && Intrinsics.EZpvd((Object) this.stateInit, (Object) message.stateInit);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStateInit() {
            return this.stateInit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.address.hashCode() * 31) + this.amount.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.stateInit.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Message(address=" + this.address + ", amount=" + this.amount + ", payload=" + this.payload + ", stateInit=" + this.stateInit + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonMultiTransaction.Message.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Message> serializer() {
                return TonMultiTransaction$Message$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Message(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, TonMultiTransaction$Message$$serializer.INSTANCE.getDescriptor());
            }
            this.address = str;
            this.amount = str2;
            this.payload = str3;
            this.stateInit = str4;
        }

        public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(Message message, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, message.address);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, message.amount);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, message.payload);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, message.stateInit);
        }

        public Message(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.address = str;
            this.amount = str2;
            this.payload = str3;
            this.stateInit = str4;
        }
    }
}
