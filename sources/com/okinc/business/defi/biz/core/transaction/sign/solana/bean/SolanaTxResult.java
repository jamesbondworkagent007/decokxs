package com.okinc.business.defi.biz.core.transaction.sign.solana.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SolanaTxResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String encodeStr;
    private final String encodeTransactionStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolanaTxResult() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolanaTxResult copy$default(SolanaTxResult solanaTxResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaTxResult.encodeStr;
        }
        if ((i & 2) != 0) {
            str2 = solanaTxResult.encodeTransactionStr;
        }
        return solanaTxResult.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.encodeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encodeTransactionStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaTxResult copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SolanaTxResult(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaTxResult)) {
            return false;
        }
        SolanaTxResult solanaTxResult = (SolanaTxResult) obj;
        return Intrinsics.EZpvd((Object) this.encodeStr, (Object) solanaTxResult.encodeStr) && Intrinsics.EZpvd((Object) this.encodeTransactionStr, (Object) solanaTxResult.encodeTransactionStr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncodeStr() {
        return this.encodeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncodeTransactionStr() {
        return this.encodeTransactionStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.encodeStr.hashCode() * 31) + this.encodeTransactionStr.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolanaTxResult(encodeStr=" + this.encodeStr + ", encodeTransactionStr=" + this.encodeTransactionStr + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolanaTxResult> serializer() {
            return SolanaTxResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SolanaTxResult(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.encodeStr = "";
        } else {
            this.encodeStr = str;
        }
        if ((i & 2) == 0) {
            this.encodeTransactionStr = "";
        } else {
            this.encodeTransactionStr = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SolanaTxResult solanaTxResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) solanaTxResult.encodeStr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, solanaTxResult.encodeStr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) solanaTxResult.encodeTransactionStr, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, solanaTxResult.encodeTransactionStr);
    }

    public SolanaTxResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.encodeStr = str;
        this.encodeTransactionStr = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SolanaTxResult(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
