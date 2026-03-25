package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BtcSignRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String from;
    private final String signStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BtcSignRequest() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BtcSignRequest copy$default(BtcSignRequest btcSignRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = btcSignRequest.signStr;
        }
        if ((i & 2) != 0) {
            str2 = btcSignRequest.from;
        }
        return btcSignRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcSignRequest copy(String str, String str2) {
        return new BtcSignRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BtcSignRequest)) {
            return false;
        }
        BtcSignRequest btcSignRequest = (BtcSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.signStr, (Object) btcSignRequest.signStr) && Intrinsics.EZpvd((Object) this.from, (Object) btcSignRequest.from);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignStr() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signStr;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.from;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcSignRequest(signStr=" + this.signStr + ", from=" + this.from + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BtcSignRequest> serializer() {
            return BtcSignRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BtcSignRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signStr = null;
        } else {
            this.signStr = str;
        }
        if ((i & 2) == 0) {
            this.from = null;
        } else {
            this.from = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BtcSignRequest btcSignRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || btcSignRequest.signStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, btcSignRequest.signStr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && btcSignRequest.from == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, btcSignRequest.from);
    }

    public BtcSignRequest(String str, String str2) {
        this.signStr = str;
        this.from = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BtcSignRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
