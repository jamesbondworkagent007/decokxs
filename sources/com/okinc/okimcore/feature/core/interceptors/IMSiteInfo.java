package com.okinc.okimcore.feature.core.interceptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class IMSiteInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String domain;
    private final String userSite;
    private final String wsDexDomain;
    private final String wsDomain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IMSiteInfo() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMSiteInfo copy$default(IMSiteInfo iMSiteInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMSiteInfo.userSite;
        }
        if ((i & 2) != 0) {
            str2 = iMSiteInfo.domain;
        }
        if ((i & 4) != 0) {
            str3 = iMSiteInfo.wsDomain;
        }
        if ((i & 8) != 0) {
            str4 = iMSiteInfo.wsDexDomain;
        }
        return iMSiteInfo.copy(str, str2, str3, str4);
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
    public final IMSiteInfo copy(String str, String str2, String str3, String str4) {
        return new IMSiteInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMSiteInfo)) {
            return false;
        }
        IMSiteInfo iMSiteInfo = (IMSiteInfo) obj;
        return Intrinsics.EZpvd((Object) this.userSite, (Object) iMSiteInfo.userSite) && Intrinsics.EZpvd((Object) this.domain, (Object) iMSiteInfo.domain) && Intrinsics.EZpvd((Object) this.wsDomain, (Object) iMSiteInfo.wsDomain) && Intrinsics.EZpvd((Object) this.wsDexDomain, (Object) iMSiteInfo.wsDexDomain);
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
        return "IMSiteInfo(userSite=" + this.userSite + ", domain=" + this.domain + ", wsDomain=" + this.wsDomain + ", wsDexDomain=" + this.wsDexDomain + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.core.interceptors.IMSiteInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMSiteInfo> serializer() {
            return IMSiteInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMSiteInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(IMSiteInfo iMSiteInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || iMSiteInfo.userSite != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, iMSiteInfo.userSite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || iMSiteInfo.domain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iMSiteInfo.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || iMSiteInfo.wsDomain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, iMSiteInfo.wsDomain);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && iMSiteInfo.wsDexDomain == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, iMSiteInfo.wsDexDomain);
    }

    public IMSiteInfo(String str, String str2, String str3, String str4) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.feature.core.interceptors.IMSiteInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IMSiteInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
