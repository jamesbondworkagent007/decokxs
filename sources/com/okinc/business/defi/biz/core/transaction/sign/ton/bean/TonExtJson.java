package com.okinc.business.defi.biz.core.transaction.sign.ton.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonExtJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean isClaim;
    private final String nonce;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonExtJson copy$default(TonExtJson tonExtJson, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonExtJson.nonce;
        }
        if ((i & 2) != 0) {
            bool = tonExtJson.isClaim;
        }
        return tonExtJson.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonExtJson copy(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TonExtJson(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonExtJson)) {
            return false;
        }
        TonExtJson tonExtJson = (TonExtJson) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) tonExtJson.nonce) && Intrinsics.EZpvd(this.isClaim, tonExtJson.isClaim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.nonce.hashCode();
        Boolean bool = this.isClaim;
        return (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isClaim() {
        return this.isClaim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonExtJson(nonce=" + this.nonce + ", isClaim=" + this.isClaim + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonExtJson.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonExtJson> serializer() {
            return TonExtJson$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonExtJson(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TonExtJson$$serializer.INSTANCE.getDescriptor());
        }
        this.nonce = str;
        if ((i & 2) == 0) {
            this.isClaim = null;
        } else {
            this.isClaim = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonExtJson tonExtJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonExtJson.nonce);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && tonExtJson.isClaim == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, tonExtJson.isClaim);
    }

    public TonExtJson(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
        this.isClaim = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean):void (m)] (LINE:27) call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonExtJson.<init>(java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TonExtJson(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
