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
public final class MPCBtcMessage {
    private final String address;
    private final String message;
    private final String publicKey;
    private final List<String> signatureList;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.wallet.core.sign.utxo.MPCBtcMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MPCBtcMessage copy$default(MPCBtcMessage mPCBtcMessage, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPCBtcMessage.message;
        }
        if ((i & 2) != 0) {
            str2 = mPCBtcMessage.type;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = mPCBtcMessage.address;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = mPCBtcMessage.publicKey;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = mPCBtcMessage.signatureList;
        }
        return mPCBtcMessage.copy(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCBtcMessage copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MPCBtcMessage(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPCBtcMessage)) {
            return false;
        }
        MPCBtcMessage mPCBtcMessage = (MPCBtcMessage) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) mPCBtcMessage.message) && Intrinsics.EZpvd((Object) this.type, (Object) mPCBtcMessage.type) && Intrinsics.EZpvd((Object) this.address, (Object) mPCBtcMessage.address) && Intrinsics.EZpvd((Object) this.publicKey, (Object) mPCBtcMessage.publicKey) && Intrinsics.EZpvd(this.signatureList, mPCBtcMessage.signatureList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
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
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.message.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.address.hashCode();
        int iHashCode4 = this.publicKey.hashCode();
        List<String> list = this.signatureList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPCBtcMessage(message=" + this.message + ", type=" + this.type + ", address=" + this.address + ", publicKey=" + this.publicKey + ", signatureList=" + this.signatureList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.MPCBtcMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPCBtcMessage> serializer() {
            return MPCBtcMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPCBtcMessage(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, MPCBtcMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.message = str;
        this.type = str2;
        this.address = str3;
        this.publicKey = str4;
        if ((i & 16) == 0) {
            this.signatureList = null;
        } else {
            this.signatureList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(MPCBtcMessage mPCBtcMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, mPCBtcMessage.message);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, mPCBtcMessage.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, mPCBtcMessage.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, mPCBtcMessage.publicKey);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && mPCBtcMessage.signatureList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], mPCBtcMessage.signatureList);
    }

    public MPCBtcMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.message = str;
        this.type = str2;
        this.address = str3;
        this.publicKey = str4;
        this.signatureList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:86) call: com.okinc.wallet.core.sign.utxo.MPCBtcMessage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MPCBtcMessage(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : list);
    }
}
