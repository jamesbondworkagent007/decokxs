package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.planet.biz_performance.data.ProfileChartDto;
import com.okinc.planet.biz_performance.data.ProfileChartDto$$serializer;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes$$serializer;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
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
import o.C46411tTi;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetBasicUserInfoResp implements Parcelable {
    public final String authorId;
    public final List<String> badgeList;
    public final String bio;
    public final String competitionUrl;
    public List<UserProfileCopyTradingRes> copyTradingData;
    public String countryId;
    public final PlanetProfileCountryInfoDto countryInfo;
    public final String countryName;
    public final String curveStatTime;
    public final String enNickName;
    public final boolean followStatus;
    public final String followStatusV2;
    public final String followeeCount;
    public final String followerCount;
    public final List<PlanetProfileGroupInfo> groupInfoList;
    public final String liveStatus;
    public final String liveStreamTab;
    public final List<ProfileChartDto> metricCurve;
    public final String nickName;
    public final String officialStatus;
    public final int orbitLevel;
    public final int orbiterPlusStatus;
    public final String originalPortrait;
    public final String portrait;
    public final String publicStatus;
    public final String roleType;
    public final String shareCode;
    public final boolean showCountryTag;
    public final String signalRoleType;
    public final String sourceUrl;
    public final String spotTradingRoleType;
    public final String strategyRoleType;
    public final String targetId;
    public final PlanetTier tier;
    public final String translatedBio;
    public final String twitterFolloweeCount;
    public final String twitterFollowerCount;
    public final String twitterHandleName;
    public final String uid;
    public final String uniqueName;
    public final String userType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlanetBasicUserInfoResp> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(PlanetProfileGroupInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, new ArrayListSerializer(ProfileChartDto$$serializer.INSTANCE), new ArrayListSerializer(UserProfileCopyTradingRes$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PlanetBasicUserInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBasicUserInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<PlanetNumericString> creator = PlanetNumericString.CREATOR;
            String strAEQbTJ = creator.createFromParcel(parcel).AEQbTJ();
            String strAEQbTJ2 = creator.createFromParcel(parcel).AEQbTJ();
            String strAEQbTJ3 = creator.createFromParcel(parcel).AEQbTJ();
            String strAEQbTJ4 = creator.createFromParcel(parcel).AEQbTJ();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            PlanetTier planetTierCreateFromParcel = parcel.readInt() == 0 ? null : PlanetTier.CREATOR.createFromParcel(parcel);
            String string21 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            PlanetProfileCountryInfoDto planetProfileCountryInfoDtoCreateFromParcel = parcel.readInt() != 0 ? PlanetProfileCountryInfoDto.CREATOR.createFromParcel(parcel) : null;
            int i = parcel.readInt();
            boolean z3 = z;
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(PlanetProfileGroupInfo.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            String string22 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList2.add(ProfileChartDto.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            int i7 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList3.add(UserProfileCopyTradingRes.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            return new PlanetBasicUserInfoResp(string, string2, strAEQbTJ, strAEQbTJ2, strAEQbTJ3, strAEQbTJ4, arrayListCreateStringArrayList, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z3, string16, string17, string18, string19, string20, planetTierCreateFromParcel, string21, z2, planetProfileCountryInfoDtoCreateFromParcel, arrayList, string22, i3, i4, string23, string24, string25, string26, string27, arrayList2, arrayList3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBasicUserInfoResp[] newArray(int i) {
            return new PlanetBasicUserInfoResp[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.util.List)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 boolean)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 com.okinc.planet.biz_userprofile.data.PlanetTier)
  (r30v0 java.lang.String)
  (r31v0 boolean)
  (r32v0 com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto)
  (r33v0 java.util.List)
  (r34v0 java.lang.String)
  (r35v0 int)
  (r36v0 int)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.util.List)
  (r43v0 java.util.List)
  (r44v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PlanetBasicUserInfoResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, List list2, String str26, int i3, int i4, String str27, String str28, String str29, String str30, String str31, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, z, str20, str21, str22, str23, str24, planetTier, str25, z2, planetProfileCountryInfoDto, list2, str26, i3, i4, str27, str28, str29, str30, str31, list3, list4, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.util.List)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 boolean)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 com.okinc.planet.biz_userprofile.data.PlanetTier)
  (r28v0 java.lang.String)
  (r29v0 boolean)
  (r30v0 com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto)
  (r31v0 java.util.List)
  (r32v0 java.lang.String)
  (r33v0 int)
  (r34v0 int)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.util.List)
  (r41v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List<com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo>, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_performance.data.ProfileChartDto>, java.util.List<com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes>):void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PlanetBasicUserInfoResp(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, List list2, String str26, int i, int i2, String str27, String str28, String str29, String str30, String str31, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, z, str20, str21, str22, str23, str24, planetTier, str25, z2, planetProfileCountryInfoDto, list2, str26, i, i2, str27, str28, str29, str30, str31, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBasicUserInfoResp AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z, String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, @NotNull List<PlanetProfileGroupInfo> list2, @NotNull String str26, int i, int i2, @NotNull String str27, @NotNull String str28, String str29, String str30, String str31, @NotNull List<ProfileChartDto> list3, @NotNull List<UserProfileCopyTradingRes> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new PlanetBasicUserInfoResp(str, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, z, str20, str21, str22, str23, str24, planetTier, str25, z2, planetProfileCountryInfoDto, list2, str26, i, i2, str27, str28, str29, str30, str31, list3, list4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserProfileCopyTradingRes> AYXKKw() {
        return this.copyTradingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.curveStatTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.followStatusV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfileChartDto> AuCTel() {
        return this.metricCurve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.spotTradingRoleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.sourceUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AwvSrB() {
        return this.translatedBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetTier AxsJAY() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.twitterFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.followeeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.badgeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ORxRYg() {
        return this.twitterHandleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OcIXYQ() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QKVWgx() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QOLQEE() {
        return this.uniqueName;
    }

    public final boolean QfsBiF() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileCountryInfoDto djBIcL() {
        return this.countryInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PlanetProfileGroupInfo> ejfBZ() {
        return this.groupInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetBasicUserInfoResp)) {
            return false;
        }
        PlanetBasicUserInfoResp planetBasicUserInfoResp = (PlanetBasicUserInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) planetBasicUserInfoResp.authorId) && Intrinsics.EZpvd((Object) this.bio, (Object) planetBasicUserInfoResp.bio) && PlanetNumericString.EZpvd(this.followerCount, planetBasicUserInfoResp.followerCount) && PlanetNumericString.EZpvd(this.followeeCount, planetBasicUserInfoResp.followeeCount) && PlanetNumericString.EZpvd(this.twitterFollowerCount, planetBasicUserInfoResp.twitterFollowerCount) && PlanetNumericString.EZpvd(this.twitterFolloweeCount, planetBasicUserInfoResp.twitterFolloweeCount) && Intrinsics.EZpvd(this.badgeList, planetBasicUserInfoResp.badgeList) && Intrinsics.EZpvd((Object) this.sourceUrl, (Object) planetBasicUserInfoResp.sourceUrl) && Intrinsics.EZpvd((Object) this.officialStatus, (Object) planetBasicUserInfoResp.officialStatus) && Intrinsics.EZpvd((Object) this.userType, (Object) planetBasicUserInfoResp.userType) && Intrinsics.EZpvd((Object) this.uid, (Object) planetBasicUserInfoResp.uid) && Intrinsics.EZpvd((Object) this.countryId, (Object) planetBasicUserInfoResp.countryId) && Intrinsics.EZpvd((Object) this.nickName, (Object) planetBasicUserInfoResp.nickName) && Intrinsics.EZpvd((Object) this.enNickName, (Object) planetBasicUserInfoResp.enNickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) planetBasicUserInfoResp.portrait) && Intrinsics.EZpvd((Object) this.originalPortrait, (Object) planetBasicUserInfoResp.originalPortrait) && Intrinsics.EZpvd((Object) this.roleType, (Object) planetBasicUserInfoResp.roleType) && Intrinsics.EZpvd((Object) this.targetId, (Object) planetBasicUserInfoResp.targetId) && Intrinsics.EZpvd((Object) this.uniqueName, (Object) planetBasicUserInfoResp.uniqueName) && Intrinsics.EZpvd((Object) this.publicStatus, (Object) planetBasicUserInfoResp.publicStatus) && this.followStatus == planetBasicUserInfoResp.followStatus && Intrinsics.EZpvd((Object) this.followStatusV2, (Object) planetBasicUserInfoResp.followStatusV2) && Intrinsics.EZpvd((Object) this.strategyRoleType, (Object) planetBasicUserInfoResp.strategyRoleType) && Intrinsics.EZpvd((Object) this.signalRoleType, (Object) planetBasicUserInfoResp.signalRoleType) && Intrinsics.EZpvd((Object) this.spotTradingRoleType, (Object) planetBasicUserInfoResp.spotTradingRoleType) && Intrinsics.EZpvd((Object) this.translatedBio, (Object) planetBasicUserInfoResp.translatedBio) && Intrinsics.EZpvd(this.tier, planetBasicUserInfoResp.tier) && Intrinsics.EZpvd((Object) this.countryName, (Object) planetBasicUserInfoResp.countryName) && this.showCountryTag == planetBasicUserInfoResp.showCountryTag && Intrinsics.EZpvd(this.countryInfo, planetBasicUserInfoResp.countryInfo) && Intrinsics.EZpvd(this.groupInfoList, planetBasicUserInfoResp.groupInfoList) && Intrinsics.EZpvd((Object) this.competitionUrl, (Object) planetBasicUserInfoResp.competitionUrl) && this.orbitLevel == planetBasicUserInfoResp.orbitLevel && this.orbiterPlusStatus == planetBasicUserInfoResp.orbiterPlusStatus && Intrinsics.EZpvd((Object) this.twitterHandleName, (Object) planetBasicUserInfoResp.twitterHandleName) && Intrinsics.EZpvd((Object) this.curveStatTime, (Object) planetBasicUserInfoResp.curveStatTime) && Intrinsics.EZpvd((Object) this.liveStatus, (Object) planetBasicUserInfoResp.liveStatus) && Intrinsics.EZpvd((Object) this.liveStreamTab, (Object) planetBasicUserInfoResp.liveStreamTab) && Intrinsics.EZpvd((Object) this.shareCode, (Object) planetBasicUserInfoResp.shareCode) && Intrinsics.EZpvd(this.metricCurve, planetBasicUserInfoResp.metricCurve) && Intrinsics.EZpvd(this.copyTradingData, planetBasicUserInfoResp.copyTradingData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.liveStreamTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.liveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gHZMYf() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.officialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.publicStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.authorId.hashCode();
        int iHashCode2 = this.bio.hashCode();
        int iEZpvd = PlanetNumericString.EZpvd(this.followerCount);
        int iEZpvd2 = PlanetNumericString.EZpvd(this.followeeCount);
        int iEZpvd3 = PlanetNumericString.EZpvd(this.twitterFollowerCount);
        int iEZpvd4 = PlanetNumericString.EZpvd(this.twitterFolloweeCount);
        int iHashCode3 = this.badgeList.hashCode();
        int iHashCode4 = this.sourceUrl.hashCode();
        int iHashCode5 = this.officialStatus.hashCode();
        int iHashCode6 = this.userType.hashCode();
        int iHashCode7 = this.uid.hashCode();
        int iHashCode8 = this.countryId.hashCode();
        int iHashCode9 = this.nickName.hashCode();
        int iHashCode10 = this.enNickName.hashCode();
        int iHashCode11 = this.portrait.hashCode();
        int iHashCode12 = this.originalPortrait.hashCode();
        int iHashCode13 = this.roleType.hashCode();
        int iHashCode14 = this.targetId.hashCode();
        int iHashCode15 = this.uniqueName.hashCode();
        int iHashCode16 = this.publicStatus.hashCode();
        int iHashCode17 = Boolean.hashCode(this.followStatus);
        String str = this.followStatusV2;
        int iHashCode18 = str == null ? 0 : str.hashCode();
        int iHashCode19 = this.strategyRoleType.hashCode();
        int iHashCode20 = this.signalRoleType.hashCode();
        int iHashCode21 = this.spotTradingRoleType.hashCode();
        String str2 = this.translatedBio;
        int iHashCode22 = str2 == null ? 0 : str2.hashCode();
        PlanetTier planetTier = this.tier;
        int iHashCode23 = planetTier == null ? 0 : planetTier.hashCode();
        String str3 = this.countryName;
        int iHashCode24 = str3 == null ? 0 : str3.hashCode();
        int iHashCode25 = Boolean.hashCode(this.showCountryTag);
        PlanetProfileCountryInfoDto planetProfileCountryInfoDto = this.countryInfo;
        int iHashCode26 = planetProfileCountryInfoDto == null ? 0 : planetProfileCountryInfoDto.hashCode();
        int iHashCode27 = this.groupInfoList.hashCode();
        int iHashCode28 = this.competitionUrl.hashCode();
        int iHashCode29 = Integer.hashCode(this.orbitLevel);
        int iHashCode30 = Integer.hashCode(this.orbiterPlusStatus);
        int iHashCode31 = this.twitterHandleName.hashCode();
        int iHashCode32 = this.curveStatTime.hashCode();
        String str4 = this.liveStatus;
        int iHashCode33 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.liveStreamTab;
        int iHashCode34 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.shareCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iEZpvd) * 31) + iEZpvd2) * 31) + iEZpvd3) * 31) + iEZpvd4) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.metricCurve.hashCode()) * 31) + this.copyTradingData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.originalPortrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.strategyRoleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetBasicUserInfoResp(authorId=" + this.authorId + ", bio=" + this.bio + ", followerCount=" + PlanetNumericString.copydefault(this.followerCount) + ", followeeCount=" + PlanetNumericString.copydefault(this.followeeCount) + ", twitterFollowerCount=" + PlanetNumericString.copydefault(this.twitterFollowerCount) + ", twitterFolloweeCount=" + PlanetNumericString.copydefault(this.twitterFolloweeCount) + ", badgeList=" + this.badgeList + ", sourceUrl=" + this.sourceUrl + ", officialStatus=" + this.officialStatus + ", userType=" + this.userType + ", uid=" + this.uid + ", countryId=" + this.countryId + ", nickName=" + this.nickName + ", enNickName=" + this.enNickName + ", portrait=" + this.portrait + ", originalPortrait=" + this.originalPortrait + ", roleType=" + this.roleType + ", targetId=" + this.targetId + ", uniqueName=" + this.uniqueName + ", publicStatus=" + this.publicStatus + ", followStatus=" + this.followStatus + ", followStatusV2=" + this.followStatusV2 + ", strategyRoleType=" + this.strategyRoleType + ", signalRoleType=" + this.signalRoleType + ", spotTradingRoleType=" + this.spotTradingRoleType + ", translatedBio=" + this.translatedBio + ", tier=" + this.tier + ", countryName=" + this.countryName + ", showCountryTag=" + this.showCountryTag + ", countryInfo=" + this.countryInfo + ", groupInfoList=" + this.groupInfoList + ", competitionUrl=" + this.competitionUrl + ", orbitLevel=" + this.orbitLevel + ", orbiterPlusStatus=" + this.orbiterPlusStatus + ", twitterHandleName=" + this.twitterHandleName + ", curveStatTime=" + this.curveStatTime + ", liveStatus=" + this.liveStatus + ", liveStreamTab=" + this.liveStreamTab + ", shareCode=" + this.shareCode + ", metricCurve=" + this.metricCurve + ", copyTradingData=" + this.copyTradingData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int uzCIH() {
        return this.orbitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.competitionUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.followStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.bio);
        PlanetNumericString.AEQbTJ(this.followerCount, parcel, i);
        PlanetNumericString.AEQbTJ(this.followeeCount, parcel, i);
        PlanetNumericString.AEQbTJ(this.twitterFollowerCount, parcel, i);
        PlanetNumericString.AEQbTJ(this.twitterFolloweeCount, parcel, i);
        parcel.writeStringList(this.badgeList);
        parcel.writeString(this.sourceUrl);
        parcel.writeString(this.officialStatus);
        parcel.writeString(this.userType);
        parcel.writeString(this.uid);
        parcel.writeString(this.countryId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.enNickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.originalPortrait);
        parcel.writeString(this.roleType);
        parcel.writeString(this.targetId);
        parcel.writeString(this.uniqueName);
        parcel.writeString(this.publicStatus);
        parcel.writeInt(this.followStatus ? 1 : 0);
        parcel.writeString(this.followStatusV2);
        parcel.writeString(this.strategyRoleType);
        parcel.writeString(this.signalRoleType);
        parcel.writeString(this.spotTradingRoleType);
        parcel.writeString(this.translatedBio);
        PlanetTier planetTier = this.tier;
        if (planetTier == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            planetTier.writeToParcel(parcel, i);
        }
        parcel.writeString(this.countryName);
        parcel.writeInt(this.showCountryTag ? 1 : 0);
        PlanetProfileCountryInfoDto planetProfileCountryInfoDto = this.countryInfo;
        if (planetProfileCountryInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            planetProfileCountryInfoDto.writeToParcel(parcel, i);
        }
        List<PlanetProfileGroupInfo> list = this.groupInfoList;
        parcel.writeInt(list.size());
        Iterator<PlanetProfileGroupInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.competitionUrl);
        parcel.writeInt(this.orbitLevel);
        parcel.writeInt(this.orbiterPlusStatus);
        parcel.writeString(this.twitterHandleName);
        parcel.writeString(this.curveStatTime);
        parcel.writeString(this.liveStatus);
        parcel.writeString(this.liveStreamTab);
        parcel.writeString(this.shareCode);
        List<ProfileChartDto> list2 = this.metricCurve;
        parcel.writeInt(list2.size());
        Iterator<ProfileChartDto> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<UserProfileCopyTradingRes> list3 = this.copyTradingData;
        parcel.writeInt(list3.size());
        Iterator<UserProfileCopyTradingRes> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.roleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.signalRoleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zuBGHE() {
        return this.twitterFolloweeCount;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetBasicUserInfoResp> serializer() {
            return PlanetBasicUserInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetBasicUserInfoResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, List list2, String str26, int i3, int i4, String str27, String str28, String str29, String str30, String str31, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authorId = "";
        } else {
            this.authorId = str;
        }
        if ((i & 2) == 0) {
            this.bio = "";
        } else {
            this.bio = str2;
        }
        this.followerCount = (i & 4) == 0 ? PlanetNumericString.Companion.EZpvd() : str3;
        this.followeeCount = (i & 8) == 0 ? PlanetNumericString.Companion.EZpvd() : str4;
        this.twitterFollowerCount = (i & 16) == 0 ? PlanetNumericString.Companion.EZpvd() : str5;
        this.twitterFolloweeCount = (i & 32) == 0 ? PlanetNumericString.Companion.EZpvd() : str6;
        this.badgeList = (i & 64) == 0 ? yDY.AhwBna() : list;
        if ((i & 128) == 0) {
            this.sourceUrl = "";
        } else {
            this.sourceUrl = str7;
        }
        if ((i & 256) == 0) {
            this.officialStatus = "";
        } else {
            this.officialStatus = str8;
        }
        if ((i & 512) == 0) {
            this.userType = "";
        } else {
            this.userType = str9;
        }
        if ((i & 1024) == 0) {
            this.uid = "";
        } else {
            this.uid = str10;
        }
        if ((i & 2048) == 0) {
            this.countryId = "";
        } else {
            this.countryId = str11;
        }
        if ((i & 4096) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str12;
        }
        if ((i & 8192) == 0) {
            this.enNickName = "";
        } else {
            this.enNickName = str13;
        }
        if ((i & 16384) == 0) {
            this.portrait = "";
        } else {
            this.portrait = str14;
        }
        if ((32768 & i) == 0) {
            this.originalPortrait = "";
        } else {
            this.originalPortrait = str15;
        }
        if ((65536 & i) == 0) {
            this.roleType = "";
        } else {
            this.roleType = str16;
        }
        if ((131072 & i) == 0) {
            this.targetId = "";
        } else {
            this.targetId = str17;
        }
        if ((262144 & i) == 0) {
            this.uniqueName = "";
        } else {
            this.uniqueName = str18;
        }
        if ((524288 & i) == 0) {
            this.publicStatus = "";
        } else {
            this.publicStatus = str19;
        }
        if ((1048576 & i) == 0) {
            this.followStatus = false;
        } else {
            this.followStatus = z;
        }
        if ((2097152 & i) == 0) {
            this.followStatusV2 = null;
        } else {
            this.followStatusV2 = str20;
        }
        if ((4194304 & i) == 0) {
            this.strategyRoleType = "";
        } else {
            this.strategyRoleType = str21;
        }
        if ((8388608 & i) == 0) {
            this.signalRoleType = "";
        } else {
            this.signalRoleType = str22;
        }
        if ((16777216 & i) == 0) {
            this.spotTradingRoleType = "";
        } else {
            this.spotTradingRoleType = str23;
        }
        if ((33554432 & i) == 0) {
            this.translatedBio = "";
        } else {
            this.translatedBio = str24;
        }
        if ((67108864 & i) == 0) {
            this.tier = null;
        } else {
            this.tier = planetTier;
        }
        if ((134217728 & i) == 0) {
            this.countryName = "";
        } else {
            this.countryName = str25;
        }
        if ((268435456 & i) == 0) {
            this.showCountryTag = false;
        } else {
            this.showCountryTag = z2;
        }
        this.countryInfo = (536870912 & i) == 0 ? PlanetProfileCountryInfoDto.Companion.EZpvd() : planetProfileCountryInfoDto;
        this.groupInfoList = (1073741824 & i) == 0 ? yDY.AhwBna() : list2;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.competitionUrl = "";
        } else {
            this.competitionUrl = str26;
        }
        if ((i2 & 1) == 0) {
            this.orbitLevel = 0;
        } else {
            this.orbitLevel = i3;
        }
        if ((i2 & 2) == 0) {
            this.orbiterPlusStatus = 0;
        } else {
            this.orbiterPlusStatus = i4;
        }
        if ((i2 & 4) == 0) {
            this.twitterHandleName = "";
        } else {
            this.twitterHandleName = str27;
        }
        if ((i2 & 8) == 0) {
            this.curveStatTime = "";
        } else {
            this.curveStatTime = str28;
        }
        if ((i2 & 16) == 0) {
            this.liveStatus = null;
        } else {
            this.liveStatus = str29;
        }
        if ((i2 & 32) == 0) {
            this.liveStreamTab = null;
        } else {
            this.liveStreamTab = str30;
        }
        if ((i2 & 64) == 0) {
            this.shareCode = null;
        } else {
            this.shareCode = str31;
        }
        this.metricCurve = (i2 & 128) == 0 ? yDY.AhwBna() : list3;
        this.copyTradingData = (i2 & 256) == 0 ? yDY.AhwBna() : list4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [14=10] */
    public static final /* synthetic */ void copydefault(PlanetBasicUserInfoResp planetBasicUserInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.authorId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, planetBasicUserInfoResp.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.bio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, planetBasicUserInfoResp.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !PlanetNumericString.EZpvd(planetBasicUserInfoResp.followerCount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(planetBasicUserInfoResp.followerCount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !PlanetNumericString.EZpvd(planetBasicUserInfoResp.followeeCount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(planetBasicUserInfoResp.followeeCount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !PlanetNumericString.EZpvd(planetBasicUserInfoResp.twitterFollowerCount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(planetBasicUserInfoResp.twitterFollowerCount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !PlanetNumericString.EZpvd(planetBasicUserInfoResp.twitterFolloweeCount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(planetBasicUserInfoResp.twitterFolloweeCount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(planetBasicUserInfoResp.badgeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], planetBasicUserInfoResp.badgeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.sourceUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, planetBasicUserInfoResp.sourceUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.officialStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, planetBasicUserInfoResp.officialStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.userType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, planetBasicUserInfoResp.userType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.uid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, planetBasicUserInfoResp.uid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.countryId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, planetBasicUserInfoResp.countryId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, planetBasicUserInfoResp.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.enNickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, planetBasicUserInfoResp.enNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.portrait, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, planetBasicUserInfoResp.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.originalPortrait, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, planetBasicUserInfoResp.originalPortrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.roleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, planetBasicUserInfoResp.roleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.targetId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, planetBasicUserInfoResp.targetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.uniqueName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, planetBasicUserInfoResp.uniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.publicStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, planetBasicUserInfoResp.publicStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || planetBasicUserInfoResp.followStatus) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, C46411tTi.OLrzqt, Boolean.valueOf(planetBasicUserInfoResp.followStatus));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || planetBasicUserInfoResp.followStatusV2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, planetBasicUserInfoResp.followStatusV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.strategyRoleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, planetBasicUserInfoResp.strategyRoleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.signalRoleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, planetBasicUserInfoResp.signalRoleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.spotTradingRoleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, planetBasicUserInfoResp.spotTradingRoleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.translatedBio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, planetBasicUserInfoResp.translatedBio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || planetBasicUserInfoResp.tier != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, PlanetTier$$serializer.INSTANCE, planetBasicUserInfoResp.tier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.countryName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, planetBasicUserInfoResp.countryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || planetBasicUserInfoResp.showCountryTag) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 28, C46411tTi.OLrzqt, Boolean.valueOf(planetBasicUserInfoResp.showCountryTag));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd(planetBasicUserInfoResp.countryInfo, PlanetProfileCountryInfoDto.Companion.EZpvd())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, PlanetProfileCountryInfoDto$$serializer.INSTANCE, planetBasicUserInfoResp.countryInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd(planetBasicUserInfoResp.groupInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 30, kSerializerArr[30], planetBasicUserInfoResp.groupInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.competitionUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, planetBasicUserInfoResp.competitionUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || planetBasicUserInfoResp.orbitLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 32, planetBasicUserInfoResp.orbitLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || planetBasicUserInfoResp.orbiterPlusStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, planetBasicUserInfoResp.orbiterPlusStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.twitterHandleName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, planetBasicUserInfoResp.twitterHandleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) planetBasicUserInfoResp.curveStatTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, planetBasicUserInfoResp.curveStatTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || planetBasicUserInfoResp.liveStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, planetBasicUserInfoResp.liveStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || planetBasicUserInfoResp.liveStreamTab != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, planetBasicUserInfoResp.liveStreamTab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || planetBasicUserInfoResp.shareCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, planetBasicUserInfoResp.shareCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd(planetBasicUserInfoResp.metricCurve, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 39, kSerializerArr[39], planetBasicUserInfoResp.metricCurve);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) && Intrinsics.EZpvd(planetBasicUserInfoResp.copyTradingData, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 40, kSerializerArr[40], planetBasicUserInfoResp.copyTradingData);
    }

    public PlanetBasicUserInfoResp(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, List<PlanetProfileGroupInfo> list2, String str26, int i, int i2, String str27, String str28, String str29, String str30, String str31, List<ProfileChartDto> list3, List<UserProfileCopyTradingRes> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.authorId = str;
        this.bio = str2;
        this.followerCount = str3;
        this.followeeCount = str4;
        this.twitterFollowerCount = str5;
        this.twitterFolloweeCount = str6;
        this.badgeList = list;
        this.sourceUrl = str7;
        this.officialStatus = str8;
        this.userType = str9;
        this.uid = str10;
        this.countryId = str11;
        this.nickName = str12;
        this.enNickName = str13;
        this.portrait = str14;
        this.originalPortrait = str15;
        this.roleType = str16;
        this.targetId = str17;
        this.uniqueName = str18;
        this.publicStatus = str19;
        this.followStatus = z;
        this.followStatusV2 = str20;
        this.strategyRoleType = str21;
        this.signalRoleType = str22;
        this.spotTradingRoleType = str23;
        this.translatedBio = str24;
        this.tier = planetTier;
        this.countryName = str25;
        this.showCountryTag = z2;
        this.countryInfo = planetProfileCountryInfoDto;
        this.groupInfoList = list2;
        this.competitionUrl = str26;
        this.orbitLevel = i;
        this.orbiterPlusStatus = i2;
        this.twitterHandleName = str27;
        this.curveStatTime = str28;
        this.liveStatus = str29;
        this.liveStreamTab = str30;
        this.shareCode = str31;
        this.metricCurve = list3;
        this.copyTradingData = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x020c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r83v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r83v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r83v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x001a: SGET  A[WRAPPED] (LINE:19) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:19)) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r83v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0027: SGET  A[WRAPPED] (LINE:20) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:20)) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r83v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0034: SGET  A[WRAPPED] (LINE:22) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:22)) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r83v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0041: SGET  A[WRAPPED] (LINE:24) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:24)) : (r47v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r83v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r48v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r83v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r83v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r83v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r83v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r83v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r83v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:0x0090: TERNARY null = ((wrap:int:0x0087: ARITH (r83v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r83v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r83v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r83v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r83v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r83v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r83v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r83v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r62v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r83v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r83v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r83v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r83v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0110: ARITH (r83v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:com.okinc.planet.biz_userprofile.data.PlanetTier:?: TERNARY null = ((wrap:int:0x011b: ARITH (r83v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_userprofile.data.PlanetTier) : (r68v0 com.okinc.planet.biz_userprofile.data.PlanetTier))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0126: ARITH (r83v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0131: ARITH (r83v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? false : (r70v0 boolean))
  (wrap:com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto:?: TERNARY null = ((wrap:int:0x013c: ARITH (r83v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0142: INVOKE 
  (wrap:com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto$Companion:0x0140: SGET  A[WRAPPED] (LINE:52) com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto.Companion com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto$Companion)
 VIRTUAL call: com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto.Companion.EZpvd():com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto A[MD:():com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto (m), WRAPPED] (LINE:52)) : (r71v0 com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x014b: ARITH (r83v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x014f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:53)) : (r72v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0158: ARITH (r83v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0161: ARITH (r84v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r74v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x016a: ARITH (r84v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r75v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0171: ARITH (r84v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017a: ARITH (r84v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0183: ARITH (r84v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x018c: ARITH (r84v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0195: ARITH (r84v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r80v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x019e: ARITH (r84v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01a2: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:66)) : (r81v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01a9: ARITH (r84v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01ad: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:67)) : (r82v0 java.util.List))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:16) call: com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTier, java.lang.String, boolean, com.okinc.planet.biz_userprofile.data.PlanetProfileCountryInfoDto, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ PlanetBasicUserInfoResp(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, PlanetTier planetTier, String str25, boolean z2, PlanetProfileCountryInfoDto planetProfileCountryInfoDto, List list2, String str26, int i, int i2, String str27, String str28, String str29, String str30, String str31, List list3, List list4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? PlanetNumericString.Companion.EZpvd() : str3, (i3 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : str4, (i3 & 16) != 0 ? PlanetNumericString.Companion.EZpvd() : str5, (i3 & 32) != 0 ? PlanetNumericString.Companion.EZpvd() : str6, (i3 & 64) != 0 ? yDY.AhwBna() : list, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? "" : str8, (i3 & 512) != 0 ? "" : str9, (i3 & 1024) != 0 ? "" : str10, (i3 & 2048) != 0 ? "" : str11, (i3 & 4096) != 0 ? "" : str12, (i3 & 8192) != 0 ? "" : str13, (i3 & 16384) != 0 ? "" : str14, (i3 & 32768) != 0 ? "" : str15, (i3 & 65536) != 0 ? "" : str16, (i3 & 131072) != 0 ? "" : str17, (i3 & 262144) != 0 ? "" : str18, (i3 & 524288) != 0 ? "" : str19, (i3 & 1048576) != 0 ? false : z, (i3 & 2097152) != 0 ? null : str20, (i3 & 4194304) != 0 ? "" : str21, (i3 & 8388608) != 0 ? "" : str22, (i3 & 16777216) != 0 ? "" : str23, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i3 & 67108864) != 0 ? null : planetTier, (i3 & 134217728) != 0 ? "" : str25, (i3 & 268435456) != 0 ? false : z2, (i3 & 536870912) != 0 ? PlanetProfileCountryInfoDto.Companion.EZpvd() : planetProfileCountryInfoDto, (i3 & 1073741824) != 0 ? yDY.AhwBna() : list2, (i3 & Integer.MIN_VALUE) != 0 ? "" : str26, (i4 & 1) != 0 ? 0 : i, (i4 & 2) == 0 ? i2 : 0, (i4 & 4) != 0 ? "" : str27, (i4 & 8) != 0 ? "" : str28, (i4 & 16) != 0 ? null : str29, (i4 & 32) != 0 ? null : str30, (i4 & 64) == 0 ? str31 : null, (i4 & 128) != 0 ? yDY.AhwBna() : list3, (i4 & 256) != 0 ? yDY.AhwBna() : list4, null);
    }

    public final List<PlanetTradeTypes> AEQbTJ() {
        List listOLrzqt = C56402yEa.OLrzqt();
        if (aKErDB()) {
            listOLrzqt.add(PlanetTradeTypes.Swap);
        }
        if (Intrinsics.EZpvd((Object) this.spotTradingRoleType, (Object) PlanetRoleType.LeadTrader.getValue())) {
            listOLrzqt.add(PlanetTradeTypes.Spot);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final boolean aKErDB() {
        return Intrinsics.EZpvd((Object) this.roleType, (Object) PlanetRoleType.LeadTrader.getValue());
    }

    public final boolean QVAiDq() {
        return Intrinsics.EZpvd((Object) this.publicStatus, (Object) "2");
    }

    public final boolean UeEOUB() {
        return Intrinsics.EZpvd((Object) this.signalRoleType, (Object) PlanetRoleType.LeadTrader.getValue());
    }

    public final boolean dNCPSb() {
        return Intrinsics.EZpvd((Object) this.strategyRoleType, (Object) PlanetRoleType.LeadTrader.getValue());
    }

    public final boolean djSkpj() {
        return Intrinsics.EZpvd((Object) this.spotTradingRoleType, (Object) PlanetRoleType.LeadTrader.getValue());
    }

    public final boolean RJOkX() {
        return aKErDB() || djSkpj() || dNCPSb() || UeEOUB();
    }

    public final PlanetBioContent gEmmrt() {
        return new PlanetBioContent(this.bio, this.translatedBio);
    }

    public final boolean QbewEr() {
        return OrbitStatus.Companion.AEQbTJ(Integer.valueOf(this.orbitLevel)).isOrbiter();
    }

    public final boolean QUSxYX() {
        return OrbitStatus.Companion.AEQbTJ(Integer.valueOf(this.orbitLevel)).isOrbitPlus();
    }

    public final boolean RcXXUw() {
        return this.orbiterPlusStatus == 1 && OrbitStatus.Companion.AEQbTJ(Integer.valueOf(this.orbitLevel)).isBasicOrbiter();
    }
}
