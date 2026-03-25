package com.okinc.wallet.core.keypair;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeyPairParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean inputEncrypted;
    private final String language;
    private final String mnemonic;
    private final String prvKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeyPairParams copy$default(KeyPairParams keyPairParams, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyPairParams.mnemonic;
        }
        if ((i & 2) != 0) {
            str2 = keyPairParams.language;
        }
        if ((i & 4) != 0) {
            str3 = keyPairParams.prvKey;
        }
        if ((i & 8) != 0) {
            z = keyPairParams.inputEncrypted;
        }
        return keyPairParams.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.inputEncrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyPairParams copy(String str, String str2, String str3, boolean z) {
        return new KeyPairParams(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPairParams)) {
            return false;
        }
        KeyPairParams keyPairParams = (KeyPairParams) obj;
        return Intrinsics.EZpvd((Object) this.mnemonic, (Object) keyPairParams.mnemonic) && Intrinsics.EZpvd((Object) this.language, (Object) keyPairParams.language) && Intrinsics.EZpvd((Object) this.prvKey, (Object) keyPairParams.prvKey) && this.inputEncrypted == keyPairParams.inputEncrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInputEncrypted() {
        return this.inputEncrypted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMnemonic() {
        return this.mnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrvKey() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mnemonic;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.language;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.prvKey;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.inputEncrypted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeyPairParams(mnemonic=" + this.mnemonic + ", language=" + this.language + ", prvKey=" + this.prvKey + ", inputEncrypted=" + this.inputEncrypted + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.keypair.KeyPairParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeyPairParams> serializer() {
            return KeyPairParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeyPairParams(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, KeyPairParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.mnemonic = null;
        } else {
            this.mnemonic = str;
        }
        if ((i & 2) == 0) {
            this.language = null;
        } else {
            this.language = str2;
        }
        if ((i & 4) == 0) {
            this.prvKey = null;
        } else {
            this.prvKey = str3;
        }
        this.inputEncrypted = z;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(KeyPairParams keyPairParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || keyPairParams.mnemonic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, keyPairParams.mnemonic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || keyPairParams.language != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, keyPairParams.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || keyPairParams.prvKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, keyPairParams.prvKey);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, keyPairParams.inputEncrypted);
    }

    public KeyPairParams(String str, String str2, String str3, boolean z) {
        this.mnemonic = str;
        this.language = str2;
        this.prvKey = str3;
        this.inputEncrypted = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (r5v0 boolean)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:28) call: com.okinc.wallet.core.keypair.KeyPairParams.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ KeyPairParams(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z);
    }
}
