package com.okinc.business.defi.wallet.common.tonconnect.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppManifest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String iconUrl;
    private final String name;
    private final String privacyPolicyUrl;
    private final String termsOfUseUrl;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DAppManifest copy$default(DAppManifest dAppManifest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAppManifest.url;
        }
        if ((i & 2) != 0) {
            str2 = dAppManifest.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dAppManifest.iconUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dAppManifest.termsOfUseUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dAppManifest.privacyPolicyUrl;
        }
        return dAppManifest.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.termsOfUseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.privacyPolicyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppManifest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DAppManifest(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppManifest)) {
            return false;
        }
        DAppManifest dAppManifest = (DAppManifest) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) dAppManifest.url) && Intrinsics.EZpvd((Object) this.name, (Object) dAppManifest.name) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) dAppManifest.iconUrl) && Intrinsics.EZpvd((Object) this.termsOfUseUrl, (Object) dAppManifest.termsOfUseUrl) && Intrinsics.EZpvd((Object) this.privacyPolicyUrl, (Object) dAppManifest.privacyPolicyUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTermsOfUseUrl() {
        return this.termsOfUseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.url.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.iconUrl.hashCode();
        String str = this.termsOfUseUrl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.privacyPolicyUrl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppManifest(url=" + this.url + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", termsOfUseUrl=" + this.termsOfUseUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppManifest> serializer() {
            return DAppManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppManifest(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DAppManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.name = str2;
        this.iconUrl = str3;
        if ((i & 8) == 0) {
            this.termsOfUseUrl = null;
        } else {
            this.termsOfUseUrl = str4;
        }
        if ((i & 16) == 0) {
            this.privacyPolicyUrl = null;
        } else {
            this.privacyPolicyUrl = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppManifest dAppManifest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppManifest.url);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppManifest.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppManifest.iconUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dAppManifest.termsOfUseUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dAppManifest.termsOfUseUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dAppManifest.privacyPolicyUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dAppManifest.privacyPolicyUrl);
    }

    public DAppManifest(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.url = str;
        this.name = str2;
        this.iconUrl = str3;
        this.termsOfUseUrl = str4;
        this.privacyPolicyUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DAppManifest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
