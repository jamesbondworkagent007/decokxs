package com.okinc.wallet.core.sign.nostr;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class NostrMessageEvent {
    private final String content;
    private final Long created_at;
    private final String id;
    private final Long kind;
    private final String pubkey;
    private final List<List<String>> tags;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE)), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NostrMessageEvent() {
        this((Long) null, (List) null, (String) null, (Long) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.wallet.core.sign.nostr.NostrMessageEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NostrMessageEvent copy$default(NostrMessageEvent nostrMessageEvent, Long l, List list, String str, Long l2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = nostrMessageEvent.kind;
        }
        if ((i & 2) != 0) {
            list = nostrMessageEvent.tags;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = nostrMessageEvent.content;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            l2 = nostrMessageEvent.created_at;
        }
        Long l3 = l2;
        if ((i & 16) != 0) {
            str2 = nostrMessageEvent.pubkey;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = nostrMessageEvent.id;
        }
        return nostrMessageEvent.copy(l, list2, str4, l3, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component2() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.created_at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NostrMessageEvent copy(Long l, List<? extends List<String>> list, String str, Long l2, String str2, String str3) {
        return new NostrMessageEvent(l, list, str, l2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NostrMessageEvent)) {
            return false;
        }
        NostrMessageEvent nostrMessageEvent = (NostrMessageEvent) obj;
        return Intrinsics.EZpvd(this.kind, nostrMessageEvent.kind) && Intrinsics.EZpvd(this.tags, nostrMessageEvent.tags) && Intrinsics.EZpvd((Object) this.content, (Object) nostrMessageEvent.content) && Intrinsics.EZpvd(this.created_at, nostrMessageEvent.created_at) && Intrinsics.EZpvd((Object) this.pubkey, (Object) nostrMessageEvent.pubkey) && Intrinsics.EZpvd((Object) this.id, (Object) nostrMessageEvent.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreated_at() {
        return this.created_at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getKind() {
        return this.kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubkey() {
        return this.pubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.kind;
        int iHashCode = l == null ? 0 : l.hashCode();
        List<List<String>> list = this.tags;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.content;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Long l2 = this.created_at;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.pubkey;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.id;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NostrMessageEvent(kind=" + this.kind + ", tags=" + this.tags + ", content=" + this.content + ", created_at=" + this.created_at + ", pubkey=" + this.pubkey + ", id=" + this.id + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.nostr.NostrMessageEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NostrMessageEvent> serializer() {
            return NostrMessageEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NostrMessageEvent(int i, Long l, List list, String str, Long l2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.kind = null;
        } else {
            this.kind = l;
        }
        if ((i & 2) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 8) == 0) {
            this.created_at = null;
        } else {
            this.created_at = l2;
        }
        if ((i & 16) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str2;
        }
        if ((i & 32) == 0) {
            this.id = null;
        } else {
            this.id = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(NostrMessageEvent nostrMessageEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nostrMessageEvent.kind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, nostrMessageEvent.kind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || nostrMessageEvent.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], nostrMessageEvent.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || nostrMessageEvent.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, nostrMessageEvent.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || nostrMessageEvent.created_at != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, nostrMessageEvent.created_at);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || nostrMessageEvent.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, nostrMessageEvent.pubkey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && nostrMessageEvent.id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, nostrMessageEvent.id);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public NostrMessageEvent(Long l, List<? extends List<String>> list, String str, Long l2, String str2, String str3) {
        this.kind = l;
        this.tags = list;
        this.content = str;
        this.created_at = l2;
        this.pubkey = str2;
        this.id = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Long, java.util.List<? extends java.util.List<java.lang.String>>, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.wallet.core.sign.nostr.NostrMessageEvent.<init>(java.lang.Long, java.util.List, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NostrMessageEvent(Long l, List list, String str, Long l2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
