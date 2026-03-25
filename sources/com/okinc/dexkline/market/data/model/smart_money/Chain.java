package com.okinc.dexkline.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Chain {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int chainId;
    public final String chainLogo;
    public final String chainName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Chain() {
        this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Chain copy$default(Chain chain, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chain.chainId;
        }
        if ((i2 & 2) != 0) {
            str = chain.chainLogo;
        }
        if ((i2 & 4) != 0) {
            str2 = chain.chainName;
        }
        return chain.EZpvd(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Chain EZpvd(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Chain(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chain)) {
            return false;
        }
        Chain chain = (Chain) obj;
        return this.chainId == chain.chainId && Intrinsics.EZpvd((Object) this.chainLogo, (Object) chain.chainLogo) && Intrinsics.EZpvd((Object) this.chainName, (Object) chain.chainName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.chainId) * 31) + this.chainLogo.hashCode()) * 31) + this.chainName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Chain(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", chainName=" + this.chainName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.smart_money.Chain.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Chain> serializer() {
            return Chain$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Chain(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
    }

    public static final /* synthetic */ void copydefault(Chain chain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chain.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, chain.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chain.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chain.chainLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) chain.chainName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, chain.chainName);
    }

    public Chain(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = i;
        this.chainLogo = str;
        this.chainName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.dexkline.market.data.model.smart_money.Chain.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Chain(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
