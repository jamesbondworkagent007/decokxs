package com.okinc.wallet.core.sign.utxo;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MPCRawPsbtTx {
    private final String psbtStr;
    private final String publicKey;
    private final List<String> signatureList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MPCRawPsbtTx copy$default(MPCRawPsbtTx mPCRawPsbtTx, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPCRawPsbtTx.psbtStr;
        }
        if ((i & 2) != 0) {
            str2 = mPCRawPsbtTx.publicKey;
        }
        if ((i & 4) != 0) {
            list = mPCRawPsbtTx.signatureList;
        }
        return mPCRawPsbtTx.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.psbtStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCRawPsbtTx copy(@NotNull String str, @NotNull String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MPCRawPsbtTx(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPCRawPsbtTx)) {
            return false;
        }
        MPCRawPsbtTx mPCRawPsbtTx = (MPCRawPsbtTx) obj;
        return Intrinsics.EZpvd((Object) this.psbtStr, (Object) mPCRawPsbtTx.psbtStr) && Intrinsics.EZpvd((Object) this.publicKey, (Object) mPCRawPsbtTx.publicKey) && Intrinsics.EZpvd(this.signatureList, mPCRawPsbtTx.signatureList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtStr() {
        return this.psbtStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureList() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.psbtStr.hashCode();
        int iHashCode2 = this.publicKey.hashCode();
        List<String> list = this.signatureList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPCRawPsbtTx(psbtStr=" + this.psbtStr + ", publicKey=" + this.publicKey + ", signatureList=" + this.signatureList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPCRawPsbtTx> serializer() {
            return MPCRawPsbtTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPCRawPsbtTx(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MPCRawPsbtTx$$serializer.INSTANCE.getDescriptor());
        }
        this.psbtStr = str;
        this.publicKey = str2;
        if ((i & 4) == 0) {
            this.signatureList = null;
        } else {
            this.signatureList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(MPCRawPsbtTx mPCRawPsbtTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mPCRawPsbtTx.psbtStr);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, mPCRawPsbtTx.publicKey);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mPCRawPsbtTx.signatureList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], mPCRawPsbtTx.signatureList);
    }

    public MPCRawPsbtTx(@NotNull String str, @NotNull String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.psbtStr = str;
        this.publicKey = str2;
        this.signatureList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:121) call: com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MPCRawPsbtTx(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
