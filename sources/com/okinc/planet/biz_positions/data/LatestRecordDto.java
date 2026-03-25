package com.okinc.planet.biz_positions.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName$$serializer;
import com.okinc.planet.format.InstId;
import com.okinc.planet.format.InstId$$serializer;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C46417tTo;
import o.tQX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LatestRecordDto implements Parcelable, tQX.Application {
    public static final int $stable = 0;
    private final String alias;
    private final String avgPx;
    private final String baseName;
    private final long cTime;
    private final String fillTime;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String lever;
    private final String nickName;
    private final String ordId;
    private final String ordType;
    private final String posSide;
    private final String px;
    private final String quoteName;
    private final String side;
    private final String sz;
    private final String tradeQuoteCcy;
    private final long uTime;
    private final String uly;
    private final String uniqueName;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LatestRecordDto> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<LatestRecordDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestRecordDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<PlanetNumericString> creator = PlanetNumericString.CREATOR;
            return new LatestRecordDto(creator.createFromParcel(parcel).AEQbTJ(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readString(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readString(), parcel.readLong(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readString(), InstId.CREATOR.createFromParcel(parcel).OLrzqt(), parcel.readString(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), creator.createFromParcel(parcel).AEQbTJ(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), PlanetUniqueName.CREATOR.createFromParcel(parcel).EZpvd(), parcel.readString(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestRecordDto[] newArray(int i) {
            return new LatestRecordDto[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 long)
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
  (r21v0 long)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_positions.data.LatestRecordDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LatestRecordDto(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j2, String str18, String str19, String str20, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, j, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, j2, str18, str19, str20, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 long)
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
  (r20v0 long)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_positions.data.LatestRecordDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LatestRecordDto(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j2, String str18, String str19, String str20, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, j2, str18, str19, str20);
    }

    @Serializable(with = C46417tTo.class)
    public static /* synthetic */ void getCTime$annotations() {
    }

    @Serializable(with = C46417tTo.class)
    public static /* synthetic */ void getUTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component1-8XBoXJE, reason: not valid java name */
    public final String m6976component18XBoXJE() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component11-8XBoXJE, reason: not valid java name */
    public final String m6977component118XBoXJE() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component16-8XBoXJE, reason: not valid java name */
    public final String m6978component168XBoXJE() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component19() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component2-8XBoXJE, reason: not valid java name */
    public final String m6979component28XBoXJE() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component21-zDyZU5o, reason: not valid java name */
    public final String m6980component21zDyZU5o() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component4-8XBoXJE, reason: not valid java name */
    public final String m6981component48XBoXJE() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component7-8XBoXJE, reason: not valid java name */
    public final String m6982component78XBoXJE() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component9-y_k7uyA, reason: not valid java name */
    public final String m6983component9y_k7uyA() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-_J7Igcc, reason: not valid java name */
    public final LatestRecordDto m6984copy_J7Igcc(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, long j2, @NotNull String str18, @NotNull String str19, String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        return new LatestRecordDto(str, str2, str3, str4, str5, j, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, j2, str18, str19, str20, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestRecordDto)) {
            return false;
        }
        LatestRecordDto latestRecordDto = (LatestRecordDto) obj;
        return PlanetNumericString.EZpvd(this.value, latestRecordDto.value) && PlanetNumericString.EZpvd(this.sz, latestRecordDto.sz) && Intrinsics.EZpvd((Object) this.alias, (Object) latestRecordDto.alias) && PlanetNumericString.EZpvd(this.avgPx, latestRecordDto.avgPx) && Intrinsics.EZpvd((Object) this.baseName, (Object) latestRecordDto.baseName) && this.cTime == latestRecordDto.cTime && PlanetNumericString.EZpvd(this.fillTime, latestRecordDto.fillTime) && Intrinsics.EZpvd((Object) this.instFamily, (Object) latestRecordDto.instFamily) && InstId.copydefault(this.instId, latestRecordDto.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) latestRecordDto.instType) && PlanetNumericString.EZpvd(this.lever, latestRecordDto.lever) && Intrinsics.EZpvd((Object) this.nickName, (Object) latestRecordDto.nickName) && Intrinsics.EZpvd((Object) this.ordId, (Object) latestRecordDto.ordId) && Intrinsics.EZpvd((Object) this.ordType, (Object) latestRecordDto.ordType) && Intrinsics.EZpvd((Object) this.posSide, (Object) latestRecordDto.posSide) && PlanetNumericString.EZpvd(this.px, latestRecordDto.px) && Intrinsics.EZpvd((Object) this.quoteName, (Object) latestRecordDto.quoteName) && Intrinsics.EZpvd((Object) this.side, (Object) latestRecordDto.side) && this.uTime == latestRecordDto.uTime && Intrinsics.EZpvd((Object) this.uly, (Object) latestRecordDto.uly) && PlanetUniqueName.KWHzl(this.uniqueName, latestRecordDto.uniqueName) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) latestRecordDto.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getAvgPx-8XBoXJE, reason: not valid java name */
    public final String m6985getAvgPx8XBoXJE() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseName() {
        return this.baseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getFillTime-8XBoXJE, reason: not valid java name */
    public final String m6986getFillTime8XBoXJE() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getInstId-y_k7uyA, reason: not valid java name */
    public final String m6987getInstIdy_k7uyA() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLever-8XBoXJE, reason: not valid java name */
    public final String m6988getLever8XBoXJE() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tQX.Application
    public String getPaginationId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getPx-8XBoXJE, reason: not valid java name */
    public final String m6989getPx8XBoXJE() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteName() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getSz-8XBoXJE, reason: not valid java name */
    public final String m6990getSz8XBoXJE() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getUniqueName-zDyZU5o, reason: not valid java name */
    public final String m6991getUniqueNamezDyZU5o() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getValue-8XBoXJE, reason: not valid java name */
    public final String m6992getValue8XBoXJE() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iEZpvd = PlanetNumericString.EZpvd(this.value);
        int iEZpvd2 = PlanetNumericString.EZpvd(this.sz);
        int iHashCode = this.alias.hashCode();
        int iEZpvd3 = PlanetNumericString.EZpvd(this.avgPx);
        int iHashCode2 = this.baseName.hashCode();
        int iHashCode3 = Long.hashCode(this.cTime);
        int iEZpvd4 = PlanetNumericString.EZpvd(this.fillTime);
        int iHashCode4 = this.instFamily.hashCode();
        int iOLrzqt = InstId.OLrzqt(this.instId);
        int iHashCode5 = this.instType.hashCode();
        int iEZpvd5 = PlanetNumericString.EZpvd(this.lever);
        int iHashCode6 = this.nickName.hashCode();
        int iHashCode7 = this.ordId.hashCode();
        int iHashCode8 = this.ordType.hashCode();
        int iHashCode9 = this.posSide.hashCode();
        int iEZpvd6 = PlanetNumericString.EZpvd(this.px);
        int iHashCode10 = this.quoteName.hashCode();
        int iHashCode11 = this.side.hashCode();
        int iHashCode12 = Long.hashCode(this.uTime);
        int iHashCode13 = this.uly.hashCode();
        int iOLrzqt2 = PlanetUniqueName.OLrzqt(this.uniqueName);
        String str = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((((((((((((((((((iEZpvd * 31) + iEZpvd2) * 31) + iHashCode) * 31) + iEZpvd3) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iEZpvd4) * 31) + iHashCode4) * 31) + iOLrzqt) * 31) + iHashCode5) * 31) + iEZpvd5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iEZpvd6) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iOLrzqt2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LatestRecordDto(value=" + PlanetNumericString.copydefault(this.value) + ", sz=" + PlanetNumericString.copydefault(this.sz) + ", alias=" + this.alias + ", avgPx=" + PlanetNumericString.copydefault(this.avgPx) + ", baseName=" + this.baseName + ", cTime=" + this.cTime + ", fillTime=" + PlanetNumericString.copydefault(this.fillTime) + ", instFamily=" + this.instFamily + ", instId=" + InstId.AEQbTJ(this.instId) + ", instType=" + this.instType + ", lever=" + PlanetNumericString.copydefault(this.lever) + ", nickName=" + this.nickName + ", ordId=" + this.ordId + ", ordType=" + this.ordType + ", posSide=" + this.posSide + ", px=" + PlanetNumericString.copydefault(this.px) + ", quoteName=" + this.quoteName + ", side=" + this.side + ", uTime=" + this.uTime + ", uly=" + this.uly + ", uniqueName=" + PlanetUniqueName.copydefault(this.uniqueName) + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PlanetNumericString.AEQbTJ(this.value, parcel, i);
        PlanetNumericString.AEQbTJ(this.sz, parcel, i);
        parcel.writeString(this.alias);
        PlanetNumericString.AEQbTJ(this.avgPx, parcel, i);
        parcel.writeString(this.baseName);
        parcel.writeLong(this.cTime);
        PlanetNumericString.AEQbTJ(this.fillTime, parcel, i);
        parcel.writeString(this.instFamily);
        InstId.KWHzl(this.instId, parcel, i);
        parcel.writeString(this.instType);
        PlanetNumericString.AEQbTJ(this.lever, parcel, i);
        parcel.writeString(this.nickName);
        parcel.writeString(this.ordId);
        parcel.writeString(this.ordType);
        parcel.writeString(this.posSide);
        PlanetNumericString.AEQbTJ(this.px, parcel, i);
        parcel.writeString(this.quoteName);
        parcel.writeString(this.side);
        parcel.writeLong(this.uTime);
        parcel.writeString(this.uly);
        PlanetUniqueName.OLrzqt(this.uniqueName, parcel, i);
        parcel.writeString(this.tradeQuoteCcy);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.LatestRecordDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LatestRecordDto> serializer() {
            return LatestRecordDto$$serializer.INSTANCE;
        }
    }

    private /* synthetic */ LatestRecordDto(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j2, String str18, String str19, String str20, SerializationConstructorMarker serializationConstructorMarker) {
        this.value = (i & 1) == 0 ? PlanetNumericString.Companion.EZpvd() : str;
        this.sz = (i & 2) == 0 ? PlanetNumericString.Companion.EZpvd() : str2;
        if ((i & 4) == 0) {
            this.alias = "";
        } else {
            this.alias = str3;
        }
        this.avgPx = (i & 8) == 0 ? PlanetNumericString.Companion.EZpvd() : str4;
        if ((i & 16) == 0) {
            this.baseName = "";
        } else {
            this.baseName = str5;
        }
        if ((i & 32) == 0) {
            this.cTime = 0L;
        } else {
            this.cTime = j;
        }
        this.fillTime = (i & 64) == 0 ? PlanetNumericString.Companion.EZpvd() : str6;
        if ((i & 128) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str7;
        }
        this.instId = (i & 256) == 0 ? InstId.Companion.KWHzl() : str8;
        if ((i & 512) == 0) {
            this.instType = "";
        } else {
            this.instType = str9;
        }
        this.lever = (i & 1024) == 0 ? PlanetNumericString.Companion.EZpvd() : str10;
        if ((i & 2048) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str11;
        }
        if ((i & 4096) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str12;
        }
        if ((i & 8192) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str13;
        }
        if ((i & 16384) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str14;
        }
        this.px = (32768 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str15;
        if ((65536 & i) == 0) {
            this.quoteName = "";
        } else {
            this.quoteName = str16;
        }
        if ((131072 & i) == 0) {
            this.side = "";
        } else {
            this.side = str17;
        }
        this.uTime = (262144 & i) != 0 ? j2 : 0L;
        if ((524288 & i) == 0) {
            this.uly = "";
        } else {
            this.uly = str18;
        }
        this.uniqueName = (1048576 & i) == 0 ? PlanetUniqueName.Companion.AEQbTJ() : str19;
        if ((i & 2097152) == 0) {
            this.tradeQuoteCcy = "";
        } else {
            this.tradeQuoteCcy = str20;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [14=9] */
    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(LatestRecordDto latestRecordDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !PlanetNumericString.EZpvd(latestRecordDto.value, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.value));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !PlanetNumericString.EZpvd(latestRecordDto.sz, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.sz));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) latestRecordDto.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, latestRecordDto.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !PlanetNumericString.EZpvd(latestRecordDto.avgPx, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.avgPx));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) latestRecordDto.baseName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, latestRecordDto.baseName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || latestRecordDto.cTime != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, C46417tTo.KWHzl, Long.valueOf(latestRecordDto.cTime));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !PlanetNumericString.EZpvd(latestRecordDto.fillTime, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.fillTime));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) latestRecordDto.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, latestRecordDto.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !InstId.copydefault(latestRecordDto.instId, InstId.Companion.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, InstId$$serializer.INSTANCE, InstId.copydefault(latestRecordDto.instId));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) latestRecordDto.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, latestRecordDto.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !PlanetNumericString.EZpvd(latestRecordDto.lever, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.lever));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) latestRecordDto.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, latestRecordDto.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) latestRecordDto.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, latestRecordDto.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) latestRecordDto.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, latestRecordDto.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) latestRecordDto.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, latestRecordDto.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !PlanetNumericString.EZpvd(latestRecordDto.px, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(latestRecordDto.px));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) latestRecordDto.quoteName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, latestRecordDto.quoteName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) latestRecordDto.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, latestRecordDto.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || latestRecordDto.uTime != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, C46417tTo.KWHzl, Long.valueOf(latestRecordDto.uTime));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) latestRecordDto.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, latestRecordDto.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !PlanetUniqueName.KWHzl(latestRecordDto.uniqueName, PlanetUniqueName.Companion.AEQbTJ())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, PlanetUniqueName$$serializer.INSTANCE, PlanetUniqueName.EZpvd(latestRecordDto.uniqueName));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) latestRecordDto.tradeQuoteCcy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, latestRecordDto.tradeQuoteCcy);
    }

    private LatestRecordDto(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j2, String str18, String str19, String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
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
        this.value = str;
        this.sz = str2;
        this.alias = str3;
        this.avgPx = str4;
        this.baseName = str5;
        this.cTime = j;
        this.fillTime = str6;
        this.instFamily = str7;
        this.instId = str8;
        this.instType = str9;
        this.lever = str10;
        this.nickName = str11;
        this.ordId = str12;
        this.ordType = str13;
        this.posSide = str14;
        this.px = str15;
        this.quoteName = str16;
        this.side = str17;
        this.uTime = j2;
        this.uly = str18;
        this.uniqueName = str19;
        this.tradeQuoteCcy = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0129: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0006: SGET  A[WRAPPED] (LINE:18) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:18)) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0013: SGET  A[WRAPPED] (LINE:19) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:19)) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x002a: SGET  A[WRAPPED] (LINE:21) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:21)) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0048: SGET  A[WRAPPED] (LINE:25) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:25)) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: INVOKE 
  (wrap:com.okinc.planet.format.InstId$Companion:0x005d: SGET  A[WRAPPED] (LINE:27) com.okinc.planet.format.InstId.Companion com.okinc.planet.format.InstId$Companion)
 VIRTUAL call: com.okinc.planet.format.InstId.Companion.KWHzl():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:27)) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0072: SGET  A[WRAPPED] (LINE:29) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:29)) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0096: TERNARY null = ((wrap:int:0x008d: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00aa: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00a8: SGET  A[WRAPPED] (LINE:34) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:34)) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e5: INVOKE 
  (wrap:com.okinc.planet.biz_userprofile.data.PlanetUniqueName$Companion:0x00e3: SGET  A[WRAPPED] (LINE:40) com.okinc.planet.biz_userprofile.data.PlanetUniqueName.Companion com.okinc.planet.biz_userprofile.data.PlanetUniqueName$Companion)
 VIRTUAL call: com.okinc.planet.biz_userprofile.data.PlanetUniqueName.Companion.AEQbTJ():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:40)) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:17) call: com.okinc.planet.biz_positions.data.LatestRecordDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ LatestRecordDto(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j2, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PlanetNumericString.Companion.EZpvd() : str, (i & 2) != 0 ? PlanetNumericString.Companion.EZpvd() : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? PlanetNumericString.Companion.EZpvd() : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? InstId.Companion.KWHzl() : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? PlanetNumericString.Companion.EZpvd() : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? PlanetNumericString.Companion.EZpvd() : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? 0L : j2, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? PlanetUniqueName.Companion.AEQbTJ() : str19, (i & 2097152) != 0 ? "" : str20, null);
    }

    public final String takeNonBlankTradeQuoteCcy() {
        String str = this.tradeQuoteCcy;
        if (str == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
            return null;
        }
        return str;
    }
}
