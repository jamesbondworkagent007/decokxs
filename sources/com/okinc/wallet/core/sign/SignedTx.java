package com.okinc.wallet.core.sign;

import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C54907xZt;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SignedTx {
    private String jitoTxHash;
    private String originSignature;
    private String tx;
    private String txHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignedTx() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignedTx copy$default(SignedTx signedTx, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedTx.tx;
        }
        if ((i & 2) != 0) {
            str2 = signedTx.txHash;
        }
        if ((i & 4) != 0) {
            str3 = signedTx.originSignature;
        }
        if ((i & 8) != 0) {
            str4 = signedTx.jitoTxHash;
        }
        return signedTx.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.originSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.jitoTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignedTx copy(String str, String str2, String str3, String str4) {
        return new SignedTx(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignedTx)) {
            return false;
        }
        SignedTx signedTx = (SignedTx) obj;
        return Intrinsics.EZpvd((Object) this.tx, (Object) signedTx.tx) && Intrinsics.EZpvd((Object) this.txHash, (Object) signedTx.txHash) && Intrinsics.EZpvd((Object) this.originSignature, (Object) signedTx.originSignature) && Intrinsics.EZpvd((Object) this.jitoTxHash, (Object) signedTx.jitoTxHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoTxHash() {
        return this.jitoTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginSignature() {
        return this.originSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTx() {
        return this.tx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.originSignature;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.jitoTxHash;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJitoTxHash(String str) {
        this.jitoTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginSignature(String str) {
        this.originSignature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTx(String str) {
        this.tx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignedTx(tx=" + this.tx + ", txHash=" + this.txHash + ", originSignature=" + this.originSignature + ", jitoTxHash=" + this.jitoTxHash + ")";
    }

    public /* synthetic */ SignedTx(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tx = null;
        } else {
            this.tx = str;
        }
        if ((i & 2) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str2;
        }
        if ((i & 4) == 0) {
            this.originSignature = null;
        } else {
            this.originSignature = str3;
        }
        if ((i & 8) == 0) {
            this.jitoTxHash = null;
        } else {
            this.jitoTxHash = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SignedTx signedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signedTx.tx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signedTx.tx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signedTx.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signedTx.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signedTx.originSignature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signedTx.originSignature);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && signedTx.jitoTxHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signedTx.jitoTxHash);
    }

    public SignedTx(String str, String str2, String str3, String str4) {
        this.tx = str;
        this.txHash = str2;
        this.originSignature = str3;
        this.jitoTxHash = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.wallet.core.sign.SignedTx.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignedTx(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.SignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignedTx> serializer() {
            return SignedTx$$serializer.INSTANCE;
        }

        public final SignedTx KWHzl(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((SignedTx) C54907xZt.OLrzqt(SignedTx.Companion.serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            SignedTx signedTx = new SignedTx((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = signedTx;
            }
            return (SignedTx) objM7377constructorimpl;
        }
    }
}
