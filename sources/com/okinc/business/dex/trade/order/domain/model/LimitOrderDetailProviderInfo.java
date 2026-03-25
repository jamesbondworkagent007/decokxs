package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LimitOrderDetailProviderInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String provider;
    private final String providerLogo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderDetailProviderInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderDetailProviderInfo copy$default(LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderDetailProviderInfo.providerLogo;
        }
        if ((i & 2) != 0) {
            str2 = limitOrderDetailProviderInfo.provider;
        }
        return limitOrderDetailProviderInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.providerLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.provider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailProviderInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LimitOrderDetailProviderInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderDetailProviderInfo)) {
            return false;
        }
        LimitOrderDetailProviderInfo limitOrderDetailProviderInfo = (LimitOrderDetailProviderInfo) obj;
        return Intrinsics.EZpvd((Object) this.providerLogo, (Object) limitOrderDetailProviderInfo.providerLogo) && Intrinsics.EZpvd((Object) this.provider, (Object) limitOrderDetailProviderInfo.provider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderLogo() {
        return this.providerLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.providerLogo.hashCode() * 31) + this.provider.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderDetailProviderInfo(providerLogo=" + this.providerLogo + ", provider=" + this.provider + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailProviderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderDetailProviderInfo> serializer() {
            return LimitOrderDetailProviderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderDetailProviderInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.providerLogo = "";
        } else {
            this.providerLogo = str;
        }
        if ((i & 2) == 0) {
            this.provider = "";
        } else {
            this.provider = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderDetailProviderInfo limitOrderDetailProviderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitOrderDetailProviderInfo.providerLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitOrderDetailProviderInfo.providerLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) limitOrderDetailProviderInfo.provider, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, limitOrderDetailProviderInfo.provider);
    }

    public LimitOrderDetailProviderInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.providerLogo = str;
        this.provider = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:283) call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailProviderInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderDetailProviderInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
