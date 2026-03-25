package com.okinc.business.market.features.address_tracker.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackingAddressAlias {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String addressAlias;
    private final String addressAliasColorHex;
    private final String collectAddress;
    private final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackingAddressAlias() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackingAddressAlias copy$default(TrackingAddressAlias trackingAddressAlias, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingAddressAlias.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = trackingAddressAlias.collectAddress;
        }
        if ((i & 4) != 0) {
            str3 = trackingAddressAlias.addressAlias;
        }
        if ((i & 8) != 0) {
            str4 = trackingAddressAlias.addressAliasColorHex;
        }
        return trackingAddressAlias.copy(str, str2, str3, str4);
    }

    @SerialName("addressAlias")
    public static /* synthetic */ void getAddressAlias$annotations() {
    }

    @SerialName("addressAliasColor")
    public static /* synthetic */ void getAddressAliasColorHex$annotations() {
    }

    @SerialName("collectAddress")
    public static /* synthetic */ void getCollectAddress$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.collectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.addressAliasColorHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackingAddressAlias copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TrackingAddressAlias(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingAddressAlias)) {
            return false;
        }
        TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) trackingAddressAlias.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) trackingAddressAlias.collectAddress) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) trackingAddressAlias.addressAlias) && Intrinsics.EZpvd((Object) this.addressAliasColorHex, (Object) trackingAddressAlias.addressAliasColorHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressAlias() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressAliasColorHex() {
        return this.addressAliasColorHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollectAddress() {
        return this.collectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + this.addressAlias.hashCode()) * 31) + this.addressAliasColorHex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackingAddressAlias(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", addressAlias=" + this.addressAlias + ", addressAliasColorHex=" + this.addressAliasColorHex + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackingAddressAlias> serializer() {
            return TrackingAddressAlias$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackingAddressAlias(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 2) == 0) {
            this.collectAddress = "";
        } else {
            this.collectAddress = str2;
        }
        if ((i & 4) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str3;
        }
        if ((i & 8) == 0) {
            this.addressAliasColorHex = "";
        } else {
            this.addressAliasColorHex = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TrackingAddressAlias trackingAddressAlias, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) trackingAddressAlias.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingAddressAlias.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) trackingAddressAlias.collectAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, trackingAddressAlias.collectAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) trackingAddressAlias.addressAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackingAddressAlias.addressAlias);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) trackingAddressAlias.addressAliasColorHex, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, trackingAddressAlias.addressAliasColorHex);
    }

    public TrackingAddressAlias(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.addressAlias = str3;
        this.addressAliasColorHex = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrackingAddressAlias(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
