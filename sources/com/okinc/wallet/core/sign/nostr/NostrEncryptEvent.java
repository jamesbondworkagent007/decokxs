package com.okinc.wallet.core.sign.nostr;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class NostrEncryptEvent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String iv;
    private final String pub_key;
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NostrEncryptEvent() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NostrEncryptEvent copy$default(NostrEncryptEvent nostrEncryptEvent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nostrEncryptEvent.pub_key;
        }
        if ((i & 2) != 0) {
            str2 = nostrEncryptEvent.text;
        }
        if ((i & 4) != 0) {
            str3 = nostrEncryptEvent.iv;
        }
        return nostrEncryptEvent.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pub_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NostrEncryptEvent copy(String str, String str2, String str3) {
        return new NostrEncryptEvent(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NostrEncryptEvent)) {
            return false;
        }
        NostrEncryptEvent nostrEncryptEvent = (NostrEncryptEvent) obj;
        return Intrinsics.EZpvd((Object) this.pub_key, (Object) nostrEncryptEvent.pub_key) && Intrinsics.EZpvd((Object) this.text, (Object) nostrEncryptEvent.text) && Intrinsics.EZpvd((Object) this.iv, (Object) nostrEncryptEvent.iv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIv() {
        return this.iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPub_key() {
        return this.pub_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.pub_key;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.text;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iv;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NostrEncryptEvent(pub_key=" + this.pub_key + ", text=" + this.text + ", iv=" + this.iv + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.nostr.NostrEncryptEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NostrEncryptEvent> serializer() {
            return NostrEncryptEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NostrEncryptEvent(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pub_key = null;
        } else {
            this.pub_key = str;
        }
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.iv = null;
        } else {
            this.iv = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(NostrEncryptEvent nostrEncryptEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nostrEncryptEvent.pub_key != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, nostrEncryptEvent.pub_key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || nostrEncryptEvent.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, nostrEncryptEvent.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && nostrEncryptEvent.iv == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, nostrEncryptEvent.iv);
    }

    public NostrEncryptEvent(String str, String str2, String str3) {
        this.pub_key = str;
        this.text = str2;
        this.iv = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.wallet.core.sign.nostr.NostrEncryptEvent.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NostrEncryptEvent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
