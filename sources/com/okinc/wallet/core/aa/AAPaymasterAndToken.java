package com.okinc.wallet.core.aa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAPaymasterAndToken {
    private String businessId;
    private int mode;
    private String paymaster;
    private String token;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAPaymasterAndToken copy$default(AAPaymasterAndToken aAPaymasterAndToken, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aAPaymasterAndToken.paymaster;
        }
        if ((i2 & 2) != 0) {
            i = aAPaymasterAndToken.mode;
        }
        if ((i2 & 4) != 0) {
            str2 = aAPaymasterAndToken.businessId;
        }
        if ((i2 & 8) != 0) {
            str3 = aAPaymasterAndToken.token;
        }
        return aAPaymasterAndToken.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.businessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAPaymasterAndToken copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AAPaymasterAndToken(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAPaymasterAndToken)) {
            return false;
        }
        AAPaymasterAndToken aAPaymasterAndToken = (AAPaymasterAndToken) obj;
        return Intrinsics.EZpvd((Object) this.paymaster, (Object) aAPaymasterAndToken.paymaster) && this.mode == aAPaymasterAndToken.mode && Intrinsics.EZpvd((Object) this.businessId, (Object) aAPaymasterAndToken.businessId) && Intrinsics.EZpvd((Object) this.token, (Object) aAPaymasterAndToken.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.paymaster.hashCode() * 31) + Integer.hashCode(this.mode)) * 31) + this.businessId.hashCode()) * 31) + this.token.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBusinessId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(int i) {
        this.mode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymaster(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAPaymasterAndToken(paymaster=" + this.paymaster + ", mode=" + this.mode + ", businessId=" + this.businessId + ", token=" + this.token + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAPaymasterAndToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAPaymasterAndToken> serializer() {
            return AAPaymasterAndToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAPaymasterAndToken(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, AAPaymasterAndToken$$serializer.INSTANCE.getDescriptor());
        }
        this.paymaster = str;
        if ((i & 2) == 0) {
            this.mode = 1;
        } else {
            this.mode = i2;
        }
        if ((i & 4) == 0) {
            this.businessId = "0";
        } else {
            this.businessId = str2;
        }
        this.token = str3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAPaymasterAndToken aAPaymasterAndToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aAPaymasterAndToken.paymaster);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAPaymasterAndToken.mode != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, aAPaymasterAndToken.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aAPaymasterAndToken.businessId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aAPaymasterAndToken.businessId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aAPaymasterAndToken.token);
    }

    public AAPaymasterAndToken(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.paymaster = str;
        this.mode = i;
        this.businessId = str2;
        this.token = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.wallet.core.aa.AAPaymasterAndToken.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAPaymasterAndToken(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? "0" : str2, str3);
    }
}
