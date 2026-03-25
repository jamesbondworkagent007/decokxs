package com.okinc.wallet.core.sign.cosmos;

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
public final class CosmosSignedTx {
    private String signature;
    private String tx;
    private String txHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignedTx() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignedTx copy$default(CosmosSignedTx cosmosSignedTx, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosSignedTx.tx;
        }
        if ((i & 2) != 0) {
            str2 = cosmosSignedTx.signature;
        }
        if ((i & 4) != 0) {
            str3 = cosmosSignedTx.txHash;
        }
        return cosmosSignedTx.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignedTx copy(String str, String str2, String str3) {
        return new CosmosSignedTx(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignedTx)) {
            return false;
        }
        CosmosSignedTx cosmosSignedTx = (CosmosSignedTx) obj;
        return Intrinsics.EZpvd((Object) this.tx, (Object) cosmosSignedTx.tx) && Intrinsics.EZpvd((Object) this.signature, (Object) cosmosSignedTx.signature) && Intrinsics.EZpvd((Object) this.txHash, (Object) cosmosSignedTx.txHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
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
        String str2 = this.signature;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.txHash;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
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
        return "CosmosSignedTx(tx=" + this.tx + ", signature=" + this.signature + ", txHash=" + this.txHash + ")";
    }

    public /* synthetic */ CosmosSignedTx(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tx = null;
        } else {
            this.tx = str;
        }
        if ((i & 2) == 0) {
            this.signature = null;
        } else {
            this.signature = str2;
        }
        if ((i & 4) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CosmosSignedTx cosmosSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cosmosSignedTx.tx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cosmosSignedTx.tx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cosmosSignedTx.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cosmosSignedTx.signature);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && cosmosSignedTx.txHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cosmosSignedTx.txHash);
    }

    public CosmosSignedTx(String str, String str2, String str3) {
        this.tx = str;
        this.signature = str2;
        this.txHash = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:141) call: com.okinc.wallet.core.sign.cosmos.CosmosSignedTx.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignedTx(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cosmos.CosmosSignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CosmosSignedTx> serializer() {
            return CosmosSignedTx$$serializer.INSTANCE;
        }

        public final CosmosSignedTx EZpvd(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((CosmosSignedTx) C54907xZt.OLrzqt(CosmosSignedTx.Companion.serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            CosmosSignedTx cosmosSignedTx = new CosmosSignedTx((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = cosmosSignedTx;
            }
            return (CosmosSignedTx) objM7377constructorimpl;
        }
    }
}
