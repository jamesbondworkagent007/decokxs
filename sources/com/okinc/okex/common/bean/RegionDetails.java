package com.okinc.okex.common.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RegionDetails {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String domain;
    private final String userSite;
    private final String wsDexDomain;
    private final String wsDomain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegionDetails() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegionDetails copy$default(RegionDetails regionDetails, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionDetails.userSite;
        }
        if ((i & 2) != 0) {
            str2 = regionDetails.domain;
        }
        if ((i & 4) != 0) {
            str3 = regionDetails.wsDomain;
        }
        if ((i & 8) != 0) {
            str4 = regionDetails.wsDexDomain;
        }
        return regionDetails.copy(str, str2, str3, str4);
    }

    @SerialName("domain")
    public static /* synthetic */ void getDomain$annotations() {
    }

    @SerialName("userSite")
    public static /* synthetic */ void getUserSite$annotations() {
    }

    @SerialName("wsDexDomain")
    public static /* synthetic */ void getWsDexDomain$annotations() {
    }

    @SerialName("wsDomain")
    public static /* synthetic */ void getWsDomain$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.wsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.wsDexDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegionDetails copy(String str, String str2, String str3, String str4) {
        return new RegionDetails(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionDetails)) {
            return false;
        }
        RegionDetails regionDetails = (RegionDetails) obj;
        return Intrinsics.EZpvd((Object) this.userSite, (Object) regionDetails.userSite) && Intrinsics.EZpvd((Object) this.domain, (Object) regionDetails.domain) && Intrinsics.EZpvd((Object) this.wsDomain, (Object) regionDetails.wsDomain) && Intrinsics.EZpvd((Object) this.wsDexDomain, (Object) regionDetails.wsDexDomain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSite() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsDexDomain() {
        return this.wsDexDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsDomain() {
        return this.wsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.userSite;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.domain;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.wsDomain;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.wsDexDomain;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegionDetails(userSite=" + this.userSite + ", domain=" + this.domain + ", wsDomain=" + this.wsDomain + ", wsDexDomain=" + this.wsDexDomain + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.RegionDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RegionDetails> serializer() {
            return RegionDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegionDetails(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userSite = null;
        } else {
            this.userSite = str;
        }
        if ((i & 2) == 0) {
            this.domain = null;
        } else {
            this.domain = str2;
        }
        if ((i & 4) == 0) {
            this.wsDomain = null;
        } else {
            this.wsDomain = str3;
        }
        if ((i & 8) == 0) {
            this.wsDexDomain = null;
        } else {
            this.wsDexDomain = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RegionDetails regionDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || regionDetails.userSite != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, regionDetails.userSite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || regionDetails.domain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, regionDetails.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || regionDetails.wsDomain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, regionDetails.wsDomain);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && regionDetails.wsDexDomain == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, regionDetails.wsDexDomain);
    }

    public RegionDetails(String str, String str2, String str3, String str4) {
        this.userSite = str;
        this.domain = str2;
        this.wsDomain = str3;
        this.wsDexDomain = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.okex.common.bean.RegionDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RegionDetails(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
