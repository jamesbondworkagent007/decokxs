package com.okinc.okmarket.home.data.po;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OkpData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String href;
    private final String iconDark;
    private final String iconLight;
    private final Integer okpId;
    private final String subtitle;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkpData() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OkpData copy$default(OkpData okpData, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = okpData.okpId;
        }
        if ((i & 2) != 0) {
            str = okpData.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = okpData.subtitle;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = okpData.href;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = okpData.iconLight;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = okpData.iconDark;
        }
        return okpData.copy(num, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.okpId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkpData copy(Integer num, String str, String str2, String str3, String str4, String str5) {
        return new OkpData(num, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OkpData)) {
            return false;
        }
        OkpData okpData = (OkpData) obj;
        return Intrinsics.EZpvd(this.okpId, okpData.okpId) && Intrinsics.EZpvd((Object) this.title, (Object) okpData.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) okpData.subtitle) && Intrinsics.EZpvd((Object) this.href, (Object) okpData.href) && Intrinsics.EZpvd((Object) this.iconLight, (Object) okpData.iconLight) && Intrinsics.EZpvd((Object) this.iconDark, (Object) okpData.iconDark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHref() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconLight() {
        return this.iconLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOkpId() {
        return this.okpId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.okpId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.href;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconLight;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iconDark;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkpData(okpId=" + this.okpId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", href=" + this.href + ", iconLight=" + this.iconLight + ", iconDark=" + this.iconDark + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.data.po.OkpData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkpData> serializer() {
            return OkpData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkpData(int i, Integer num, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.okpId = null;
        } else {
            this.okpId = num;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 8) == 0) {
            this.href = null;
        } else {
            this.href = str3;
        }
        if ((i & 16) == 0) {
            this.iconLight = null;
        } else {
            this.iconLight = str4;
        }
        if ((i & 32) == 0) {
            this.iconDark = null;
        } else {
            this.iconDark = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(OkpData okpData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || okpData.okpId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, okpData.okpId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || okpData.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, okpData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || okpData.subtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, okpData.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || okpData.href != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, okpData.href);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || okpData.iconLight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, okpData.iconLight);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && okpData.iconDark == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, okpData.iconDark);
    }

    public OkpData(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.okpId = num;
        this.title = str;
        this.subtitle = str2;
        this.href = str3;
        this.iconLight = str4;
        this.iconDark = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.okmarket.home.data.po.OkpData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OkpData(Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
