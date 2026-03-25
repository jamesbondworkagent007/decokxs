package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C54907xZt;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class HPKEInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String AD;
    private final String ciphertext;
    private final String encapsulatedKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HPKEInfoData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HPKEInfoData copy$default(HPKEInfoData hPKEInfoData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hPKEInfoData.AD;
        }
        if ((i & 2) != 0) {
            str2 = hPKEInfoData.encapsulatedKey;
        }
        if ((i & 4) != 0) {
            str3 = hPKEInfoData.ciphertext;
        }
        return hPKEInfoData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.AD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encapsulatedKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ciphertext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEInfoData copy(String str, String str2, String str3) {
        return new HPKEInfoData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HPKEInfoData)) {
            return false;
        }
        HPKEInfoData hPKEInfoData = (HPKEInfoData) obj;
        return Intrinsics.EZpvd((Object) this.AD, (Object) hPKEInfoData.AD) && Intrinsics.EZpvd((Object) this.encapsulatedKey, (Object) hPKEInfoData.encapsulatedKey) && Intrinsics.EZpvd((Object) this.ciphertext, (Object) hPKEInfoData.ciphertext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAD() {
        return this.AD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCiphertext() {
        return this.ciphertext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.AD;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.encapsulatedKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ciphertext;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HPKEInfoData(AD=" + this.AD + ", encapsulatedKey=" + this.encapsulatedKey + ", ciphertext=" + this.ciphertext + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HPKEInfoData> serializer() {
            return HPKEInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HPKEInfoData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.AD = null;
        } else {
            this.AD = str;
        }
        if ((i & 2) == 0) {
            this.encapsulatedKey = null;
        } else {
            this.encapsulatedKey = str2;
        }
        if ((i & 4) == 0) {
            this.ciphertext = null;
        } else {
            this.ciphertext = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(HPKEInfoData hPKEInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || hPKEInfoData.AD != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, hPKEInfoData.AD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || hPKEInfoData.encapsulatedKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, hPKEInfoData.encapsulatedKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && hPKEInfoData.ciphertext == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, hPKEInfoData.ciphertext);
    }

    public HPKEInfoData(String str, String str2, String str3) {
        this.AD = str;
        this.encapsulatedKey = str2;
        this.ciphertext = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HPKEInfoData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String toJson() {
        return C54907xZt.encodeToString$default(Companion.serializer(), this, false, 2, null);
    }
}
