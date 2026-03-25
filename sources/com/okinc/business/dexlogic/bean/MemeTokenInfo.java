package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MemeTokenInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isRenounced;
    private final String marketCap;
    private final String poolLiquidity;
    private final String price;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeTokenInfo copy$default(MemeTokenInfo memeTokenInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeTokenInfo.price;
        }
        if ((i & 2) != 0) {
            str2 = memeTokenInfo.poolLiquidity;
        }
        if ((i & 4) != 0) {
            str3 = memeTokenInfo.marketCap;
        }
        if ((i & 8) != 0) {
            str4 = memeTokenInfo.isRenounced;
        }
        return memeTokenInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.poolLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isRenounced;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTokenInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MemeTokenInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeTokenInfo)) {
            return false;
        }
        MemeTokenInfo memeTokenInfo = (MemeTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) memeTokenInfo.price) && Intrinsics.EZpvd((Object) this.poolLiquidity, (Object) memeTokenInfo.poolLiquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) memeTokenInfo.marketCap) && Intrinsics.EZpvd((Object) this.isRenounced, (Object) memeTokenInfo.isRenounced);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolLiquidity() {
        return this.poolLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.price.hashCode() * 31) + this.poolLiquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.isRenounced.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isRenounced() {
        return this.isRenounced;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeTokenInfo(price=" + this.price + ", poolLiquidity=" + this.poolLiquidity + ", marketCap=" + this.marketCap + ", isRenounced=" + this.isRenounced + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeTokenInfo> serializer() {
            return MemeTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeTokenInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, MemeTokenInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 2) == 0) {
            this.poolLiquidity = "";
        } else {
            this.poolLiquidity = str2;
        }
        if ((i & 4) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str3;
        }
        this.isRenounced = str4;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeTokenInfo memeTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeTokenInfo.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeTokenInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeTokenInfo.poolLiquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeTokenInfo.poolLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeTokenInfo.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeTokenInfo.marketCap);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, memeTokenInfo.isRenounced);
    }

    public MemeTokenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.price = str;
        this.poolLiquidity = str2;
        this.marketCap = str3;
        this.isRenounced = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (r5v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:172) call: com.okinc.business.dexlogic.bean.MemeTokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeTokenInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4);
    }
}
