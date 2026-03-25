package com.okinc.planet.biz_userprofile.data;

import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData;
import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PlanetProfileShareBean {
    public final String bio;
    public final String enNickName;
    public final String followerCount;
    public final String likes;
    public final String nickName;
    public final String originalPortrait;
    public final String pnlRatio;
    public final String portrait;
    public final String postCount;
    public final String qrCodeUrl;
    public final String serverTime;
    public final ArrayList<HistoryTotalPnlData> yieldCurve;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(HistoryTotalPnlData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetProfileShareBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HistoryTotalPnlData> DbNXlk() {
        return this.yieldCurve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileShareBean EZpvd(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList<HistoryTotalPnlData> arrayList) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PlanetProfileShareBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.likes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.postCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetProfileShareBean)) {
            return false;
        }
        PlanetProfileShareBean planetProfileShareBean = (PlanetProfileShareBean) obj;
        return Intrinsics.EZpvd((Object) this.portrait, (Object) planetProfileShareBean.portrait) && Intrinsics.EZpvd((Object) this.bio, (Object) planetProfileShareBean.bio) && Intrinsics.EZpvd((Object) this.originalPortrait, (Object) planetProfileShareBean.originalPortrait) && Intrinsics.EZpvd((Object) this.nickName, (Object) planetProfileShareBean.nickName) && Intrinsics.EZpvd((Object) this.enNickName, (Object) planetProfileShareBean.enNickName) && Intrinsics.EZpvd((Object) this.qrCodeUrl, (Object) planetProfileShareBean.qrCodeUrl) && Intrinsics.EZpvd((Object) this.followerCount, (Object) planetProfileShareBean.followerCount) && Intrinsics.EZpvd((Object) this.postCount, (Object) planetProfileShareBean.postCount) && Intrinsics.EZpvd((Object) this.likes, (Object) planetProfileShareBean.likes) && Intrinsics.EZpvd((Object) this.serverTime, (Object) planetProfileShareBean.serverTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) planetProfileShareBean.pnlRatio) && Intrinsics.EZpvd(this.yieldCurve, planetProfileShareBean.yieldCurve);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.originalPortrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.portrait;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.bio.hashCode();
        int iHashCode3 = this.originalPortrait.hashCode();
        int iHashCode4 = this.nickName.hashCode();
        int iHashCode5 = this.enNickName.hashCode();
        String str2 = this.qrCodeUrl;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.followerCount;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.postCount;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.likes;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.serverTime;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pnlRatio;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        ArrayList<HistoryTotalPnlData> arrayList = this.yieldCurve;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetProfileShareBean(portrait=" + this.portrait + ", bio=" + this.bio + ", originalPortrait=" + this.originalPortrait + ", nickName=" + this.nickName + ", enNickName=" + this.enNickName + ", qrCodeUrl=" + this.qrCodeUrl + ", followerCount=" + this.followerCount + ", postCount=" + this.postCount + ", likes=" + this.likes + ", serverTime=" + this.serverTime + ", pnlRatio=" + this.pnlRatio + ", yieldCurve=" + this.yieldCurve + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.qrCodeUrl;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetProfileShareBean> serializer() {
            return PlanetProfileShareBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetProfileShareBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str;
        }
        if ((i & 2) == 0) {
            this.bio = "";
        } else {
            this.bio = str2;
        }
        if ((i & 4) == 0) {
            this.originalPortrait = "";
        } else {
            this.originalPortrait = str3;
        }
        if ((i & 8) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str4;
        }
        if ((i & 16) == 0) {
            this.enNickName = "";
        } else {
            this.enNickName = str5;
        }
        if ((i & 32) == 0) {
            this.qrCodeUrl = null;
        } else {
            this.qrCodeUrl = str6;
        }
        if ((i & 64) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str7;
        }
        if ((i & 128) == 0) {
            this.postCount = null;
        } else {
            this.postCount = str8;
        }
        if ((i & 256) == 0) {
            this.likes = null;
        } else {
            this.likes = str9;
        }
        if ((i & 512) == 0) {
            this.serverTime = null;
        } else {
            this.serverTime = str10;
        }
        if ((i & 1024) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str11;
        }
        if ((i & 2048) == 0) {
            this.yieldCurve = null;
        } else {
            this.yieldCurve = arrayList;
        }
    }

    public static final /* synthetic */ void copydefault(PlanetProfileShareBean planetProfileShareBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || planetProfileShareBean.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, planetProfileShareBean.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) planetProfileShareBean.bio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, planetProfileShareBean.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) planetProfileShareBean.originalPortrait, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, planetProfileShareBean.originalPortrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) planetProfileShareBean.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, planetProfileShareBean.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) planetProfileShareBean.enNickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, planetProfileShareBean.enNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || planetProfileShareBean.qrCodeUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, planetProfileShareBean.qrCodeUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || planetProfileShareBean.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, planetProfileShareBean.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || planetProfileShareBean.postCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, planetProfileShareBean.postCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || planetProfileShareBean.likes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, planetProfileShareBean.likes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || planetProfileShareBean.serverTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, planetProfileShareBean.serverTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || planetProfileShareBean.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, planetProfileShareBean.pnlRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && planetProfileShareBean.yieldCurve == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], planetProfileShareBean.yieldCurve);
    }

    public PlanetProfileShareBean(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList<HistoryTotalPnlData> arrayList) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.portrait = str;
        this.bio = str2;
        this.originalPortrait = str3;
        this.nickName = str4;
        this.enNickName = str5;
        this.qrCodeUrl = str6;
        this.followerCount = str7;
        this.postCount = str8;
        this.likes = str9;
        this.serverTime = str10;
        this.pnlRatio = str11;
        this.yieldCurve = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData>):void (m)] (LINE:8) call: com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ PlanetProfileShareBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? arrayList : null);
    }
}
