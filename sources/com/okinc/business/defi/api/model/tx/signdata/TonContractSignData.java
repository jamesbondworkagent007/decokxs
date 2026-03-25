package com.okinc.business.defi.api.model.tx.signdata;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TonContractSignData extends ContractSignData {
    private final List<Payload> params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TonContractSignData$Payload$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TonContractSignData copy$default(TonContractSignData tonContractSignData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tonContractSignData.params;
        }
        return tonContractSignData.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Payload> component1() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonContractSignData copy(@NotNull List<Payload> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TonContractSignData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TonContractSignData) && Intrinsics.EZpvd(this.params, ((TonContractSignData) obj).params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Payload> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonContractSignData(params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonContractSignData> serializer() {
            return TonContractSignData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TonContractSignData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TonContractSignData$$serializer.INSTANCE.getDescriptor());
        }
        this.params = list;
    }

    @Serializable
    public static final class Payload {
        private final String from;
        private final List<Message> messages;
        private final String network;
        private final Long valid_until;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TonContractSignData$Message$$serializer.INSTANCE), null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Payload() {
            this((List) null, (Long) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData$Payload */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, List list, Long l, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = payload.messages;
            }
            if ((i & 2) != 0) {
                l = payload.valid_until;
            }
            if ((i & 4) != 0) {
                str = payload.from;
            }
            if ((i & 8) != 0) {
                str2 = payload.network;
            }
            return payload.copy(list, l, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Message> component1() {
            return this.messages;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
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
        public final Payload copy(List<Message> list, Long l, String str, String str2) {
            return new Payload(list, l, str, str2);
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
            return Intrinsics.EZpvd(this.messages, payload.messages) && Intrinsics.EZpvd(this.valid_until, payload.valid_until) && Intrinsics.EZpvd((Object) this.from, (Object) payload.from) && Intrinsics.EZpvd((Object) this.network, (Object) payload.network);
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
        public final Long getValid_until() {
            return this.valid_until;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<Message> list = this.messages;
            int iHashCode = list == null ? 0 : list.hashCode();
            Long l = this.valid_until;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            String str = this.from;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.network;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Payload(messages=" + this.messages + ", valid_until=" + this.valid_until + ", from=" + this.from + ", network=" + this.network + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData.Payload.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Payload> serializer() {
                return TonContractSignData$Payload$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Payload(int i, List list, Long l, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.messages = null;
            } else {
                this.messages = list;
            }
            if ((i & 2) == 0) {
                this.valid_until = null;
            } else {
                this.valid_until = l;
            }
            if ((i & 4) == 0) {
                this.from = null;
            } else {
                this.from = str;
            }
            if ((i & 8) == 0) {
                this.network = null;
            } else {
                this.network = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Payload payload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || payload.messages != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], payload.messages);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || payload.valid_until != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, payload.valid_until);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || payload.from != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, payload.from);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && payload.network == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, payload.network);
        }

        public Payload(List<Message> list, Long l, String str, String str2) {
            this.messages = list;
            this.valid_until = l;
            this.from = str;
            this.network = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.TonContractSignData$Message>, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:428) call: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData.Payload.<init>(java.util.List, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Payload(List list, Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonContractSignData(@NotNull List<Payload> list) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.params = list;
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
        public Message() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

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
        public final Message copy(String str, String str2, String str3, String str4) {
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
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.amount;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.payload;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.stateInit;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Message(address=" + this.address + ", amount=" + this.amount + ", payload=" + this.payload + ", stateInit=" + this.stateInit + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData.Message.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Message> serializer() {
                return TonContractSignData$Message$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Message(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.amount = null;
            } else {
                this.amount = str2;
            }
            if ((i & 4) == 0) {
                this.payload = null;
            } else {
                this.payload = str3;
            }
            if ((i & 8) == 0) {
                this.stateInit = null;
            } else {
                this.stateInit = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Message message, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || message.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, message.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || message.amount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, message.amount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || message.payload != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, message.payload);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && message.stateInit == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, message.stateInit);
        }

        public Message(String str, String str2, String str3, String str4) {
            this.address = str;
            this.amount = str2;
            this.payload = str3;
            this.stateInit = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:437) call: com.okinc.business.defi.api.model.tx.signdata.TonContractSignData.Message.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Message(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }
}
