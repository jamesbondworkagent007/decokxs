package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BannerConfigData {
    public final List<String> chainList;
    public final String description;
    public final String id;
    public final String title;
    public final List<BannerTokenInfoData> tokenList;
    public final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(BannerTokenInfoData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerConfigData() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.data.model.BannerConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerConfigData copy$default(BannerConfigData bannerConfigData, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerConfigData.id;
        }
        if ((i & 2) != 0) {
            str2 = bannerConfigData.url;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bannerConfigData.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bannerConfigData.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = bannerConfigData.chainList;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = bannerConfigData.tokenList;
        }
        return bannerConfigData.AEQbTJ(str, str5, str6, str7, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerConfigData AEQbTJ(String str, String str2, String str3, String str4, List<String> list, List<BannerTokenInfoData> list2) {
        return new BannerConfigData(str, str2, str3, str4, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerConfigData)) {
            return false;
        }
        BannerConfigData bannerConfigData = (BannerConfigData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) bannerConfigData.id) && Intrinsics.EZpvd((Object) this.url, (Object) bannerConfigData.url) && Intrinsics.EZpvd((Object) this.title, (Object) bannerConfigData.title) && Intrinsics.EZpvd((Object) this.description, (Object) bannerConfigData.description) && Intrinsics.EZpvd(this.chainList, bannerConfigData.chainList) && Intrinsics.EZpvd(this.tokenList, bannerConfigData.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.description;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.chainList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<BannerTokenInfoData> list2 = this.tokenList;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerConfigData(id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", description=" + this.description + ", chainList=" + this.chainList + ", tokenList=" + this.tokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BannerTokenInfoData> valueOf() {
        return this.tokenList;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BannerConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerConfigData> serializer() {
            return BannerConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerConfigData(int i, String str, String str2, String str3, String str4, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.chainList = yDY.AhwBna();
        } else {
            this.chainList = list;
        }
        if ((i & 32) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(BannerConfigData bannerConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerConfigData.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bannerConfigData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bannerConfigData.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bannerConfigData.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bannerConfigData.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bannerConfigData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bannerConfigData.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bannerConfigData.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(bannerConfigData.chainList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], bannerConfigData.chainList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(bannerConfigData.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], bannerConfigData.tokenList);
    }

    public BannerConfigData(String str, String str2, String str3, String str4, List<String> list, List<BannerTokenInfoData> list2) {
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.description = str4;
        this.chainList = list;
        this.tokenList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:0x0024: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0029: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.data.model.BannerTokenInfoData>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.BannerConfigData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ BannerConfigData(String str, String str2, String str3, String str4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? yDY.AhwBna() : list2);
    }
}
