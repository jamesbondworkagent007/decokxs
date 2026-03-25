package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeTokensLogoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String network;
    public final String networkBigLogo;
    public final String networkLogo;
    public final String nightNetworkLogo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTokensLogoData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeTokensLogoData copy$default(HomeTokensLogoData homeTokensLogoData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeTokensLogoData.network;
        }
        if ((i & 2) != 0) {
            str2 = homeTokensLogoData.networkLogo;
        }
        if ((i & 4) != 0) {
            str3 = homeTokensLogoData.networkBigLogo;
        }
        if ((i & 8) != 0) {
            str4 = homeTokensLogoData.nightNetworkLogo;
        }
        return homeTokensLogoData.OLrzqt(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTokensLogoData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new HomeTokensLogoData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTokensLogoData)) {
            return false;
        }
        HomeTokensLogoData homeTokensLogoData = (HomeTokensLogoData) obj;
        return Intrinsics.EZpvd((Object) this.network, (Object) homeTokensLogoData.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) homeTokensLogoData.networkLogo) && Intrinsics.EZpvd((Object) this.networkBigLogo, (Object) homeTokensLogoData.networkBigLogo) && Intrinsics.EZpvd((Object) this.nightNetworkLogo, (Object) homeTokensLogoData.nightNetworkLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.network.hashCode() * 31) + this.networkLogo.hashCode()) * 31) + this.networkBigLogo.hashCode()) * 31) + this.nightNetworkLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTokensLogoData(network=" + this.network + ", networkLogo=" + this.networkLogo + ", networkBigLogo=" + this.networkBigLogo + ", nightNetworkLogo=" + this.nightNetworkLogo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeTokensLogoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTokensLogoData> serializer() {
            return HomeTokensLogoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTokensLogoData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.network = "";
        } else {
            this.network = str;
        }
        if ((i & 2) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str2;
        }
        if ((i & 4) == 0) {
            this.networkBigLogo = "";
        } else {
            this.networkBigLogo = str3;
        }
        if ((i & 8) == 0) {
            this.nightNetworkLogo = "";
        } else {
            this.nightNetworkLogo = str4;
        }
    }

    public static final /* synthetic */ void KWHzl(HomeTokensLogoData homeTokensLogoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeTokensLogoData.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeTokensLogoData.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeTokensLogoData.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeTokensLogoData.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeTokensLogoData.networkBigLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, homeTokensLogoData.networkBigLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) homeTokensLogoData.nightNetworkLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, homeTokensLogoData.nightNetworkLogo);
    }

    public HomeTokensLogoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.network = str;
        this.networkLogo = str2;
        this.networkBigLogo = str3;
        this.nightNetworkLogo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:564) call: com.okinc.business.invest_biz.data.bean.HomeTokensLogoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTokensLogoData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
