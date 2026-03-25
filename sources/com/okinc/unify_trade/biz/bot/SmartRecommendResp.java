package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SmartRecommendResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String algoId;
    private final String algoOrdType;
    private final String avatar;
    private final String cTime;
    private final List<String> ccy;
    private final String copyType;
    private final String description;
    private List<BotRecommendDetailItem> detailItems;
    private final String direction;
    private final String followerAssets;
    private final String followerCount;
    private final String id;
    private final boolean includeIncompleteBacktest;
    private final String instId;
    private final String instType;
    private final List<String> label;
    private final String leverage;
    private final String maxDrawdown;
    private final String pTime;
    private final String pnlRatio;
    private final List<ProfitHistory> profitHistory;
    private final String profitSharingRatio;
    private final List<ProfitTimeRange> profitTimeRange;
    private final String recommendId;
    private String recommendTitle;
    private final String status;
    private final String stgyName;
    private final StgyParam stgyParam;
    private final String summary;
    private final String tag;
    private final String traderUniqueName;
    private final String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartRecommendResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartRecommendResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartRecommendResp createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string11;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i);
                str = string11;
                int i2 = 0;
                while (i2 != i) {
                    arrayList6.add(ProfitHistory.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i3);
                arrayList2 = arrayList;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList7.add(ProfitTimeRange.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList3 = arrayList7;
            }
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            StgyParam stgyParamCreateFromParcel = parcel.readInt() == 0 ? null : StgyParam.CREATOR.createFromParcel(parcel);
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i5);
                arrayList4 = arrayList3;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList8.add(BotRecommendDetailItem.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList5 = arrayList8;
            }
            return new SmartRecommendResp(string, string2, string3, arrayListCreateStringArrayList, string4, string5, string6, string7, string8, string9, string10, arrayListCreateStringArrayList2, str, string12, string13, string14, arrayList2, arrayList4, string15, string16, stgyParamCreateFromParcel, string17, string18, string19, string20, arrayList5, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartRecommendResp[] newArray(int i) {
            return new SmartRecommendResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartRecommendResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfitHistory> component17() {
        return this.profitHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfitTimeRange> component18() {
        return this.profitTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgyParam component21() {
        return this.stgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.recommendTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotRecommendDetailItem> component26() {
        return this.detailItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.includeIncompleteBacktest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartRecommendResp copy(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list2, String str11, String str12, String str13, String str14, List<ProfitHistory> list3, List<ProfitTimeRange> list4, String str15, String str16, StgyParam stgyParam, String str17, String str18, String str19, String str20, List<BotRecommendDetailItem> list5, String str21, String str22, String str23, String str24, String str25, boolean z) {
        return new SmartRecommendResp(str, str2, str3, list, str4, str5, str6, str7, str8, str9, str10, list2, str11, str12, str13, str14, list3, list4, str15, str16, stgyParam, str17, str18, str19, str20, list5, str21, str22, str23, str24, str25, z);
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
        if (!(obj instanceof SmartRecommendResp)) {
            return false;
        }
        SmartRecommendResp smartRecommendResp = (SmartRecommendResp) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) smartRecommendResp.algoId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) smartRecommendResp.algoOrdType) && Intrinsics.EZpvd((Object) this.cTime, (Object) smartRecommendResp.cTime) && Intrinsics.EZpvd(this.ccy, smartRecommendResp.ccy) && Intrinsics.EZpvd((Object) this.description, (Object) smartRecommendResp.description) && Intrinsics.EZpvd((Object) this.direction, (Object) smartRecommendResp.direction) && Intrinsics.EZpvd((Object) this.followerCount, (Object) smartRecommendResp.followerCount) && Intrinsics.EZpvd((Object) this.id, (Object) smartRecommendResp.id) && Intrinsics.EZpvd((Object) this.recommendId, (Object) smartRecommendResp.recommendId) && Intrinsics.EZpvd((Object) this.instId, (Object) smartRecommendResp.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) smartRecommendResp.instType) && Intrinsics.EZpvd(this.label, smartRecommendResp.label) && Intrinsics.EZpvd((Object) this.leverage, (Object) smartRecommendResp.leverage) && Intrinsics.EZpvd((Object) this.maxDrawdown, (Object) smartRecommendResp.maxDrawdown) && Intrinsics.EZpvd((Object) this.pTime, (Object) smartRecommendResp.pTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) smartRecommendResp.pnlRatio) && Intrinsics.EZpvd(this.profitHistory, smartRecommendResp.profitHistory) && Intrinsics.EZpvd(this.profitTimeRange, smartRecommendResp.profitTimeRange) && Intrinsics.EZpvd((Object) this.status, (Object) smartRecommendResp.status) && Intrinsics.EZpvd((Object) this.stgyName, (Object) smartRecommendResp.stgyName) && Intrinsics.EZpvd(this.stgyParam, smartRecommendResp.stgyParam) && Intrinsics.EZpvd((Object) this.summary, (Object) smartRecommendResp.summary) && Intrinsics.EZpvd((Object) this.tag, (Object) smartRecommendResp.tag) && Intrinsics.EZpvd((Object) this.username, (Object) smartRecommendResp.username) && Intrinsics.EZpvd((Object) this.recommendTitle, (Object) smartRecommendResp.recommendTitle) && Intrinsics.EZpvd(this.detailItems, smartRecommendResp.detailItems) && Intrinsics.EZpvd((Object) this.traderUniqueName, (Object) smartRecommendResp.traderUniqueName) && Intrinsics.EZpvd((Object) this.avatar, (Object) smartRecommendResp.avatar) && Intrinsics.EZpvd((Object) this.copyType, (Object) smartRecommendResp.copyType) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) smartRecommendResp.profitSharingRatio) && Intrinsics.EZpvd((Object) this.followerAssets, (Object) smartRecommendResp.followerAssets) && this.includeIncompleteBacktest == smartRecommendResp.includeIncompleteBacktest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyType() {
        return this.copyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotRecommendDetailItem> getDetailItems() {
        return this.detailItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerAssets() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIncludeIncompleteBacktest() {
        return this.includeIncompleteBacktest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfitHistory> getProfitHistory() {
        return this.profitHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProfitTimeRange> getProfitTimeRange() {
        return this.profitTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendId() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendTitle() {
        return this.recommendTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgyParam getStgyParam() {
        return this.stgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderUniqueName() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.algoOrdType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.ccy;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str4 = this.description;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.direction;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.followerCount;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.id;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.recommendId;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.instId;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.instType;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        List<String> list2 = this.label;
        int iHashCode12 = list2 == null ? 0 : list2.hashCode();
        String str11 = this.leverage;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.maxDrawdown;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.pTime;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.pnlRatio;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        List<ProfitHistory> list3 = this.profitHistory;
        int iHashCode17 = list3 == null ? 0 : list3.hashCode();
        List<ProfitTimeRange> list4 = this.profitTimeRange;
        int iHashCode18 = list4 == null ? 0 : list4.hashCode();
        String str15 = this.status;
        int iHashCode19 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.stgyName;
        int iHashCode20 = str16 == null ? 0 : str16.hashCode();
        StgyParam stgyParam = this.stgyParam;
        int iHashCode21 = stgyParam == null ? 0 : stgyParam.hashCode();
        String str17 = this.summary;
        int iHashCode22 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.tag;
        int iHashCode23 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.username;
        int iHashCode24 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.recommendTitle;
        int iHashCode25 = str20 == null ? 0 : str20.hashCode();
        List<BotRecommendDetailItem> list5 = this.detailItems;
        int iHashCode26 = list5 == null ? 0 : list5.hashCode();
        String str21 = this.traderUniqueName;
        int iHashCode27 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.avatar;
        int iHashCode28 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.copyType;
        int iHashCode29 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.profitSharingRatio;
        int iHashCode30 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.followerAssets;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str25 == null ? 0 : str25.hashCode())) * 31) + Boolean.hashCode(this.includeIncompleteBacktest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailItems(List<BotRecommendDetailItem> list) {
        this.detailItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendTitle(String str) {
        this.recommendTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartRecommendResp(algoId=" + this.algoId + ", algoOrdType=" + this.algoOrdType + ", cTime=" + this.cTime + ", ccy=" + this.ccy + ", description=" + this.description + ", direction=" + this.direction + ", followerCount=" + this.followerCount + ", id=" + this.id + ", recommendId=" + this.recommendId + ", instId=" + this.instId + ", instType=" + this.instType + ", label=" + this.label + ", leverage=" + this.leverage + ", maxDrawdown=" + this.maxDrawdown + ", pTime=" + this.pTime + ", pnlRatio=" + this.pnlRatio + ", profitHistory=" + this.profitHistory + ", profitTimeRange=" + this.profitTimeRange + ", status=" + this.status + ", stgyName=" + this.stgyName + ", stgyParam=" + this.stgyParam + ", summary=" + this.summary + ", tag=" + this.tag + ", username=" + this.username + ", recommendTitle=" + this.recommendTitle + ", detailItems=" + this.detailItems + ", traderUniqueName=" + this.traderUniqueName + ", avatar=" + this.avatar + ", copyType=" + this.copyType + ", profitSharingRatio=" + this.profitSharingRatio + ", followerAssets=" + this.followerAssets + ", includeIncompleteBacktest=" + this.includeIncompleteBacktest + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.cTime);
        parcel.writeStringList(this.ccy);
        parcel.writeString(this.description);
        parcel.writeString(this.direction);
        parcel.writeString(this.followerCount);
        parcel.writeString(this.id);
        parcel.writeString(this.recommendId);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeStringList(this.label);
        parcel.writeString(this.leverage);
        parcel.writeString(this.maxDrawdown);
        parcel.writeString(this.pTime);
        parcel.writeString(this.pnlRatio);
        List<ProfitHistory> list = this.profitHistory;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ProfitHistory> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<ProfitTimeRange> list2 = this.profitTimeRange;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ProfitTimeRange> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.status);
        parcel.writeString(this.stgyName);
        StgyParam stgyParam = this.stgyParam;
        if (stgyParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stgyParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.summary);
        parcel.writeString(this.tag);
        parcel.writeString(this.username);
        parcel.writeString(this.recommendTitle);
        List<BotRecommendDetailItem> list3 = this.detailItems;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<BotRecommendDetailItem> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.traderUniqueName);
        parcel.writeString(this.avatar);
        parcel.writeString(this.copyType);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.followerAssets);
        parcel.writeInt(this.includeIncompleteBacktest ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SmartRecommendResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartRecommendResp> serializer() {
            return SmartRecommendResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, new ArrayListSerializer(ProfitHistory$$serializer.INSTANCE), new ArrayListSerializer(ProfitTimeRange$$serializer.INSTANCE), null, null, null, null, null, null, null, new ArrayListSerializer(BotRecommendDetailItem$$serializer.INSTANCE), null, null, null, null, null, null};
    }

    public /* synthetic */ SmartRecommendResp(int i, int i2, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list2, String str11, String str12, String str13, String str14, List list3, List list4, String str15, String str16, StgyParam stgyParam, String str17, String str18, String str19, String str20, List list5, String str21, String str22, String str23, String str24, String str25, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.algoOrdType = null;
        } else {
            this.algoOrdType = str2;
        }
        if ((i & 4) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str3;
        }
        if ((i & 8) == 0) {
            this.ccy = null;
        } else {
            this.ccy = list;
        }
        if ((i & 16) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 32) == 0) {
            this.direction = null;
        } else {
            this.direction = str5;
        }
        if ((i & 64) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str6;
        }
        if ((i & 128) == 0) {
            this.id = null;
        } else {
            this.id = str7;
        }
        if ((i & 256) == 0) {
            this.recommendId = null;
        } else {
            this.recommendId = str8;
        }
        if ((i & 512) == 0) {
            this.instId = null;
        } else {
            this.instId = str9;
        }
        if ((i & 1024) == 0) {
            this.instType = null;
        } else {
            this.instType = str10;
        }
        if ((i & 2048) == 0) {
            this.label = null;
        } else {
            this.label = list2;
        }
        if ((i & 4096) == 0) {
            this.leverage = null;
        } else {
            this.leverage = str11;
        }
        if ((i & 8192) == 0) {
            this.maxDrawdown = null;
        } else {
            this.maxDrawdown = str12;
        }
        if ((i & 16384) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str13;
        }
        if ((32768 & i) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str14;
        }
        if ((65536 & i) == 0) {
            this.profitHistory = null;
        } else {
            this.profitHistory = list3;
        }
        if ((131072 & i) == 0) {
            this.profitTimeRange = null;
        } else {
            this.profitTimeRange = list4;
        }
        if ((262144 & i) == 0) {
            this.status = null;
        } else {
            this.status = str15;
        }
        if ((524288 & i) == 0) {
            this.stgyName = null;
        } else {
            this.stgyName = str16;
        }
        if ((1048576 & i) == 0) {
            this.stgyParam = null;
        } else {
            this.stgyParam = stgyParam;
        }
        if ((2097152 & i) == 0) {
            this.summary = null;
        } else {
            this.summary = str17;
        }
        if ((4194304 & i) == 0) {
            this.tag = null;
        } else {
            this.tag = str18;
        }
        if ((8388608 & i) == 0) {
            this.username = null;
        } else {
            this.username = str19;
        }
        if ((16777216 & i) == 0) {
            this.recommendTitle = null;
        } else {
            this.recommendTitle = str20;
        }
        if ((33554432 & i) == 0) {
            this.detailItems = null;
        } else {
            this.detailItems = list5;
        }
        if ((67108864 & i) == 0) {
            this.traderUniqueName = null;
        } else {
            this.traderUniqueName = str21;
        }
        if ((134217728 & i) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str22;
        }
        if ((268435456 & i) == 0) {
            this.copyType = null;
        } else {
            this.copyType = str23;
        }
        if ((536870912 & i) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str24;
        }
        if ((1073741824 & i) == 0) {
            this.followerAssets = null;
        } else {
            this.followerAssets = str25;
        }
        this.includeIncompleteBacktest = (i & Integer.MIN_VALUE) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartRecommendResp smartRecommendResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartRecommendResp.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartRecommendResp.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartRecommendResp.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartRecommendResp.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartRecommendResp.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartRecommendResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartRecommendResp.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], smartRecommendResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartRecommendResp.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, smartRecommendResp.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || smartRecommendResp.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, smartRecommendResp.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || smartRecommendResp.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, smartRecommendResp.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || smartRecommendResp.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, smartRecommendResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || smartRecommendResp.recommendId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, smartRecommendResp.recommendId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || smartRecommendResp.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, smartRecommendResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || smartRecommendResp.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, smartRecommendResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || smartRecommendResp.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], smartRecommendResp.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || smartRecommendResp.leverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, smartRecommendResp.leverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || smartRecommendResp.maxDrawdown != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, smartRecommendResp.maxDrawdown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || smartRecommendResp.pTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, smartRecommendResp.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || smartRecommendResp.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, smartRecommendResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || smartRecommendResp.profitHistory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], smartRecommendResp.profitHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || smartRecommendResp.profitTimeRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], smartRecommendResp.profitTimeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || smartRecommendResp.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, smartRecommendResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || smartRecommendResp.stgyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, smartRecommendResp.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || smartRecommendResp.stgyParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StgyParam$$serializer.INSTANCE, smartRecommendResp.stgyParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || smartRecommendResp.summary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, smartRecommendResp.summary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || smartRecommendResp.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, smartRecommendResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || smartRecommendResp.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, smartRecommendResp.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || smartRecommendResp.recommendTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, smartRecommendResp.recommendTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || smartRecommendResp.detailItems != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, kSerializerArr[25], smartRecommendResp.detailItems);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || smartRecommendResp.traderUniqueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, smartRecommendResp.traderUniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || smartRecommendResp.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, smartRecommendResp.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || smartRecommendResp.copyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, smartRecommendResp.copyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || smartRecommendResp.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, smartRecommendResp.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || smartRecommendResp.followerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, smartRecommendResp.followerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || smartRecommendResp.includeIncompleteBacktest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, smartRecommendResp.includeIncompleteBacktest);
        }
    }

    public SmartRecommendResp(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list2, String str11, String str12, String str13, String str14, List<ProfitHistory> list3, List<ProfitTimeRange> list4, String str15, String str16, StgyParam stgyParam, String str17, String str18, String str19, String str20, List<BotRecommendDetailItem> list5, String str21, String str22, String str23, String str24, String str25, boolean z) {
        this.algoId = str;
        this.algoOrdType = str2;
        this.cTime = str3;
        this.ccy = list;
        this.description = str4;
        this.direction = str5;
        this.followerCount = str6;
        this.id = str7;
        this.recommendId = str8;
        this.instId = str9;
        this.instType = str10;
        this.label = list2;
        this.leverage = str11;
        this.maxDrawdown = str12;
        this.pTime = str13;
        this.pnlRatio = str14;
        this.profitHistory = list3;
        this.profitTimeRange = list4;
        this.status = str15;
        this.stgyName = str16;
        this.stgyParam = stgyParam;
        this.summary = str17;
        this.tag = str18;
        this.username = str19;
        this.recommendTitle = str20;
        this.detailItems = list5;
        this.traderUniqueName = str21;
        this.avatar = str22;
        this.copyType = str23;
        this.profitSharingRatio = str24;
        this.followerAssets = str25;
        this.includeIncompleteBacktest = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0177: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r37v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005a: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r45v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0088: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r50v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0093: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r51v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.StgyParam:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.StgyParam) : (r54v0 com.okinc.unify_trade.biz.bot.StgyParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r59v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r66v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x012d: ARITH (r66v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.ProfitHistory>, java.util.List<com.okinc.unify_trade.biz.bot.ProfitTimeRange>, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.StgyParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.BotRecommendDetailItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:17) call: com.okinc.unify_trade.biz.bot.SmartRecommendResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.StgyParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SmartRecommendResp(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list2, String str11, String str12, String str13, String str14, List list3, List list4, String str15, String str16, StgyParam stgyParam, String str17, String str18, String str19, String str20, List list5, String str21, String str22, String str23, String str24, String str25, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : list3, (i & 131072) != 0 ? null : list4, (i & 262144) != 0 ? null : str15, (i & 524288) != 0 ? null : str16, (i & 1048576) != 0 ? null : stgyParam, (i & 2097152) != 0 ? null : str17, (i & 4194304) != 0 ? null : str18, (i & 8388608) != 0 ? null : str19, (i & 16777216) != 0 ? null : str20, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : list5, (i & 67108864) != 0 ? null : str21, (i & 134217728) != 0 ? null : str22, (i & 268435456) != 0 ? null : str23, (i & 536870912) != 0 ? null : str24, (i & 1073741824) != 0 ? null : str25, (i & Integer.MIN_VALUE) != 0 ? false : z);
    }

    public final boolean isEnable() {
        return (Intrinsics.EZpvd((Object) this.status, (Object) "stopping") || Intrinsics.EZpvd((Object) this.status, (Object) "stopped")) ? false : true;
    }
}
