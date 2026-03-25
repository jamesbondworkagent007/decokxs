package com.okinc.business.dex.trade.core.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6BatchTxItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String callDataOut;
    private final String orderId;
    private final String signedTx;
    private final String transactionHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6BatchTxItem copy$default(V6BatchTxItem v6BatchTxItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v6BatchTxItem.orderId;
        }
        if ((i & 2) != 0) {
            str2 = v6BatchTxItem.signedTx;
        }
        if ((i & 4) != 0) {
            str3 = v6BatchTxItem.callDataOut;
        }
        if ((i & 8) != 0) {
            str4 = v6BatchTxItem.transactionHash;
        }
        return v6BatchTxItem.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.callDataOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BatchTxItem copy(@NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new V6BatchTxItem(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6BatchTxItem)) {
            return false;
        }
        V6BatchTxItem v6BatchTxItem = (V6BatchTxItem) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) v6BatchTxItem.orderId) && Intrinsics.EZpvd((Object) this.signedTx, (Object) v6BatchTxItem.signedTx) && Intrinsics.EZpvd((Object) this.callDataOut, (Object) v6BatchTxItem.callDataOut) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) v6BatchTxItem.transactionHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallDataOut() {
        return this.callDataOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        String str = this.signedTx;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.callDataOut;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.transactionHash;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BatchTxItem(orderId=" + this.orderId + ", signedTx=" + this.signedTx + ", callDataOut=" + this.callDataOut + ", transactionHash=" + this.transactionHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BatchTxItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BatchTxItem> serializer() {
            return V6BatchTxItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BatchTxItem(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, V6BatchTxItem$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        if ((i & 2) == 0) {
            this.signedTx = null;
        } else {
            this.signedTx = str2;
        }
        if ((i & 4) == 0) {
            this.callDataOut = null;
        } else {
            this.callDataOut = str3;
        }
        if ((i & 8) == 0) {
            this.transactionHash = null;
        } else {
            this.transactionHash = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BatchTxItem v6BatchTxItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, v6BatchTxItem.orderId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6BatchTxItem.signedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, v6BatchTxItem.signedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || v6BatchTxItem.callDataOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, v6BatchTxItem.callDataOut);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && v6BatchTxItem.transactionHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, v6BatchTxItem.transactionHash);
    }

    public V6BatchTxItem(@NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
        this.signedTx = str2;
        this.callDataOut = str3;
        this.transactionHash = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:61) call: com.okinc.business.dex.trade.core.domain.model.V6BatchTxItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ V6BatchTxItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
