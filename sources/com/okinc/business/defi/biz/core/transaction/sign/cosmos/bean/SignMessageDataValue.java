package com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SignMessageDataValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final String signer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignMessageDataValue() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignMessageDataValue copy$default(SignMessageDataValue signMessageDataValue, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signMessageDataValue.signer;
        }
        if ((i & 2) != 0) {
            str2 = signMessageDataValue.data;
        }
        return signMessageDataValue.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignMessageDataValue copy(String str, String str2) {
        return new SignMessageDataValue(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignMessageDataValue)) {
            return false;
        }
        SignMessageDataValue signMessageDataValue = (SignMessageDataValue) obj;
        return Intrinsics.EZpvd((Object) this.signer, (Object) signMessageDataValue.signer) && Intrinsics.EZpvd((Object) this.data, (Object) signMessageDataValue.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSigner() {
        return this.signer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.data;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignMessageDataValue(signer=" + this.signer + ", data=" + this.data + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignMessageDataValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignMessageDataValue> serializer() {
            return SignMessageDataValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignMessageDataValue(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signer = null;
        } else {
            this.signer = str;
        }
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignMessageDataValue signMessageDataValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signMessageDataValue.signer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signMessageDataValue.signer);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && signMessageDataValue.data == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signMessageDataValue.data);
    }

    public SignMessageDataValue(String str, String str2) {
        this.signer = str;
        this.data = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:53) call: com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignMessageDataValue.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignMessageDataValue(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
