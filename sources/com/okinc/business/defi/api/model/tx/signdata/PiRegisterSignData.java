package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PiRegisterSignData extends ContractSignData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long coinId;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PiRegisterSignData copy$default(PiRegisterSignData piRegisterSignData, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = piRegisterSignData.coinId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = piRegisterSignData.tokenSymbol;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = piRegisterSignData.tokenAddress;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = piRegisterSignData.tokenLogo;
        }
        return piRegisterSignData.copy(j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PiRegisterSignData copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PiRegisterSignData(j, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiRegisterSignData)) {
            return false;
        }
        PiRegisterSignData piRegisterSignData = (PiRegisterSignData) obj;
        return this.coinId == piRegisterSignData.coinId && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) piRegisterSignData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) piRegisterSignData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) piRegisterSignData.tokenLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.coinId) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiRegisterSignData(coinId=" + this.coinId + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.PiRegisterSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PiRegisterSignData> serializer() {
            return PiRegisterSignData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PiRegisterSignData(int i, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PiRegisterSignData$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        if ((i & 2) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str;
        }
        if ((i & 4) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 8) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(PiRegisterSignData piRegisterSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, piRegisterSignData.coinId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) piRegisterSignData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, piRegisterSignData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) piRegisterSignData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, piRegisterSignData.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) piRegisterSignData.tokenLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, piRegisterSignData.tokenLogo);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:447) call: com.okinc.business.defi.api.model.tx.signdata.PiRegisterSignData.<init>(long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PiRegisterSignData(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiRegisterSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.coinId = j;
        this.tokenSymbol = str;
        this.tokenAddress = str2;
        this.tokenLogo = str3;
    }
}
