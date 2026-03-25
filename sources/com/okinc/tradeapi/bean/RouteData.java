package com.okinc.tradeapi.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RouteData implements Serializable, Parcelable {
    public static final String FROM_PAGE_SESSION = "fromPageSession";
    public static final String FROM_PAGE_SOURCE = "fromPageSource";
    public static final String FROM_PAGE_SUB_SOURCE = "fromPageSubSource";
    public static final String TRADE_FUTURES_TYPE = "FUTURES";
    public static final String TRADE_MARGIN_TYPE = "MARGIN";
    public static final String TRADE_OPTION_TYPE = "OPTION";
    public static final String TRADE_SPOT_TYPE = "SPOT";
    public static final String TRADE_SWAP_TYPE = "SWAP";
    private String activityId;
    private String advanceOrdType;
    private String algoIndexId;
    private ArrayList<AttachAlgoOrder> attachAlgoOrds;
    private Integer bizType;
    private String bizTypeStr;
    private Bundle botParams;
    private String bottomListFlag;
    private Integer bsType;
    private String chainIndex;
    private String channel;
    private String channelDetails;
    private String detailAction;
    private Bundle e2eParams;
    private String fromPage;
    private String fromPageSession;
    private String fromPageSource;
    private String fromPageSubSource;
    private String id;
    private String instFamily;
    private String instId;
    private Boolean isCurrentBizChecked;
    private Boolean isSlideToBottomTitle;
    private Boolean isSpotLeadTrade;
    private String level;
    private String mInstType;
    private Bundle optionParams;
    private String optionType;
    private String ordPx;
    private String ordType;
    private String order;
    private final String path;
    private String posSide;
    private String px;
    private String recommendId;
    private String side;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String squareType;
    private String strategyType;
    private String sz;
    private String tabIndex;
    private String tag;
    private String title;
    private String tokenAddress;
    private String tokenName;
    private String tpOrdKind;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String triggerPx;
    private String triggerPxType;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RouteData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RouteData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteData createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string11;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string11;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(AttachAlgoOrder.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RouteData(string, string2, string3, numValueOf, string4, string5, string6, string7, string8, string9, numValueOf2, string10, str, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, arrayList, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readBundle(RouteData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readBundle(RouteData.class.getClassLoader()), parcel.readBundle(RouteData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteData[] newArray(int i) {
            return new RouteData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bottomListFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.bsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AttachAlgoOrder> component28() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component29() {
        return this.isSlideToBottomTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component30() {
        return this.isCurrentBizChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component31() {
        return this.isSpotLeadTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.optionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component33() {
        return this.optionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.tabIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.squareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.detailAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.algoIndexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.fromPageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.fromPageSubSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.fromPageSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.channelDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component49() {
        return this.e2eParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component50() {
        return this.botParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bizTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteData copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, ArrayList<AttachAlgoOrder> arrayList, Boolean bool, Boolean bool2, Boolean bool3, String str26, Bundle bundle, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Bundle bundle2, Bundle bundle3, String str42, String str43) {
        return new RouteData(str, str2, str3, num, str4, str5, str6, str7, str8, str9, num2, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, arrayList, bool, bool2, bool3, str26, bundle, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, bundle2, bundle3, str42, str43);
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
        if (!(obj instanceof RouteData)) {
            return false;
        }
        RouteData routeData = (RouteData) obj;
        return Intrinsics.EZpvd((Object) this.path, (Object) routeData.path) && Intrinsics.EZpvd((Object) this.strategyType, (Object) routeData.strategyType) && Intrinsics.EZpvd((Object) this.instId, (Object) routeData.instId) && Intrinsics.EZpvd(this.bizType, routeData.bizType) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) routeData.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) routeData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenName, (Object) routeData.tokenName) && Intrinsics.EZpvd((Object) this.bizTypeStr, (Object) routeData.bizTypeStr) && Intrinsics.EZpvd((Object) this.fromPage, (Object) routeData.fromPage) && Intrinsics.EZpvd((Object) this.bottomListFlag, (Object) routeData.bottomListFlag) && Intrinsics.EZpvd(this.bsType, routeData.bsType) && Intrinsics.EZpvd((Object) this.ordType, (Object) routeData.ordType) && Intrinsics.EZpvd((Object) this.px, (Object) routeData.px) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) routeData.triggerPx) && Intrinsics.EZpvd((Object) this.triggerPxType, (Object) routeData.triggerPxType) && Intrinsics.EZpvd((Object) this.ordPx, (Object) routeData.ordPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) routeData.slOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) routeData.slTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) routeData.slTriggerPxType) && Intrinsics.EZpvd((Object) this.tpOrdKind, (Object) routeData.tpOrdKind) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) routeData.tpOrdPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) routeData.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) routeData.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.posSide, (Object) routeData.posSide) && Intrinsics.EZpvd((Object) this.side, (Object) routeData.side) && Intrinsics.EZpvd((Object) this.sz, (Object) routeData.sz) && Intrinsics.EZpvd((Object) this.level, (Object) routeData.level) && Intrinsics.EZpvd(this.attachAlgoOrds, routeData.attachAlgoOrds) && Intrinsics.EZpvd(this.isSlideToBottomTitle, routeData.isSlideToBottomTitle) && Intrinsics.EZpvd(this.isCurrentBizChecked, routeData.isCurrentBizChecked) && Intrinsics.EZpvd(this.isSpotLeadTrade, routeData.isSpotLeadTrade) && Intrinsics.EZpvd((Object) this.optionType, (Object) routeData.optionType) && Intrinsics.EZpvd(this.optionParams, routeData.optionParams) && Intrinsics.EZpvd((Object) this.id, (Object) routeData.id) && Intrinsics.EZpvd((Object) this.tabIndex, (Object) routeData.tabIndex) && Intrinsics.EZpvd((Object) this.order, (Object) routeData.order) && Intrinsics.EZpvd((Object) this.instFamily, (Object) routeData.instFamily) && Intrinsics.EZpvd((Object) this.squareType, (Object) routeData.squareType) && Intrinsics.EZpvd((Object) this.detailAction, (Object) routeData.detailAction) && Intrinsics.EZpvd((Object) this.recommendId, (Object) routeData.recommendId) && Intrinsics.EZpvd((Object) this.algoIndexId, (Object) routeData.algoIndexId) && Intrinsics.EZpvd((Object) this.title, (Object) routeData.title) && Intrinsics.EZpvd((Object) this.channel, (Object) routeData.channel) && Intrinsics.EZpvd((Object) this.fromPageSource, (Object) routeData.fromPageSource) && Intrinsics.EZpvd((Object) this.fromPageSubSource, (Object) routeData.fromPageSubSource) && Intrinsics.EZpvd((Object) this.fromPageSession, (Object) routeData.fromPageSession) && Intrinsics.EZpvd((Object) this.channelDetails, (Object) routeData.channelDetails) && Intrinsics.EZpvd((Object) this.activityId, (Object) routeData.activityId) && Intrinsics.EZpvd(this.e2eParams, routeData.e2eParams) && Intrinsics.EZpvd(this.botParams, routeData.botParams) && Intrinsics.EZpvd((Object) this.advanceOrdType, (Object) routeData.advanceOrdType) && Intrinsics.EZpvd((Object) this.tag, (Object) routeData.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdvanceOrdType() {
        return this.advanceOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoIndexId() {
        return this.algoIndexId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AttachAlgoOrder> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizTypeStr() {
        return this.bizTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getBotParams() {
        return this.botParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBottomListFlag() {
        return this.bottomListFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBsType() {
        return this.bsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelDetails() {
        return this.channelDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailAction() {
        return this.detailAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getE2eParams() {
        return this.e2eParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPage() {
        return this.fromPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPageSession() {
        return this.fromPageSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPageSource() {
        return this.fromPageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPageSubSource() {
        return this.fromPageSubSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMInstType() {
        return this.mInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getOptionParams() {
        return this.optionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionType() {
        return this.optionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdPx() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendId() {
        return this.recommendId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSquareType() {
        return this.squareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabIndex() {
        return this.tabIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdKind() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.path;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.strategyType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.bizType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.chainIndex;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenAddress;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bizTypeStr;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.fromPage;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.bottomListFlag;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        Integer num2 = this.bsType;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        String str10 = this.ordType;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.px;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.triggerPx;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.triggerPxType;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.ordPx;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.slOrdPx;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.slTriggerPx;
        int iHashCode18 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.slTriggerPxType;
        int iHashCode19 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.tpOrdKind;
        int iHashCode20 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.tpOrdPx;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.tpTriggerPx;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.tpTriggerPxType;
        int iHashCode23 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.posSide;
        int iHashCode24 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.side;
        int iHashCode25 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.sz;
        int iHashCode26 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.level;
        int iHashCode27 = str25 == null ? 0 : str25.hashCode();
        ArrayList<AttachAlgoOrder> arrayList = this.attachAlgoOrds;
        int iHashCode28 = arrayList == null ? 0 : arrayList.hashCode();
        Boolean bool = this.isSlideToBottomTitle;
        int iHashCode29 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isCurrentBizChecked;
        int iHashCode30 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isSpotLeadTrade;
        int iHashCode31 = bool3 == null ? 0 : bool3.hashCode();
        String str26 = this.optionType;
        int iHashCode32 = str26 == null ? 0 : str26.hashCode();
        Bundle bundle = this.optionParams;
        int iHashCode33 = bundle == null ? 0 : bundle.hashCode();
        String str27 = this.id;
        int iHashCode34 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.tabIndex;
        int iHashCode35 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.order;
        int iHashCode36 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.instFamily;
        int iHashCode37 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.squareType;
        int iHashCode38 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.detailAction;
        int iHashCode39 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.recommendId;
        int iHashCode40 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.algoIndexId;
        int iHashCode41 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.title;
        int iHashCode42 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.channel;
        int iHashCode43 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.fromPageSource;
        int iHashCode44 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.fromPageSubSource;
        int iHashCode45 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.fromPageSession;
        int iHashCode46 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.channelDetails;
        int iHashCode47 = str40 == null ? 0 : str40.hashCode();
        String str41 = this.activityId;
        int iHashCode48 = str41 == null ? 0 : str41.hashCode();
        Bundle bundle2 = this.e2eParams;
        int iHashCode49 = bundle2 == null ? 0 : bundle2.hashCode();
        Bundle bundle3 = this.botParams;
        int iHashCode50 = bundle3 == null ? 0 : bundle3.hashCode();
        String str42 = this.advanceOrdType;
        int iHashCode51 = str42 == null ? 0 : str42.hashCode();
        String str43 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + (str43 == null ? 0 : str43.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCurrentBizChecked() {
        return this.isCurrentBizChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSlideToBottomTitle() {
        return this.isSlideToBottomTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSpotLeadTrade() {
        return this.isSpotLeadTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityId(String str) {
        this.activityId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdvanceOrdType(String str) {
        this.advanceOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoIndexId(String str) {
        this.algoIndexId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(ArrayList<AttachAlgoOrder> arrayList) {
        this.attachAlgoOrds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizTypeStr(String str) {
        this.bizTypeStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotParams(Bundle bundle) {
        this.botParams = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomListFlag(String str) {
        this.bottomListFlag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsType(Integer num) {
        this.bsType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(String str) {
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannel(String str) {
        this.channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelDetails(String str) {
        this.channelDetails = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentBizChecked(Boolean bool) {
        this.isCurrentBizChecked = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailAction(String str) {
        this.detailAction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setE2eParams(Bundle bundle) {
        this.e2eParams = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromPage(String str) {
        this.fromPage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromPageSession(String str) {
        this.fromPageSession = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromPageSource(String str) {
        this.fromPageSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromPageSubSource(String str) {
        this.fromPageSubSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(String str) {
        this.level = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMInstType(String str) {
        this.mInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptionParams(Bundle bundle) {
        this.optionParams = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptionType(String str) {
        this.optionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdPx(String str) {
        this.ordPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrder(String str) {
        this.order = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendId(String str) {
        this.recommendId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlideToBottomTitle(Boolean bool) {
        this.isSlideToBottomTitle = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotLeadTrade(Boolean bool) {
        this.isSpotLeadTrade = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSquareType(String str) {
        this.squareType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyType(String str) {
        this.strategyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabIndex(String str) {
        this.tabIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdKind(String str) {
        this.tpOrdKind = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RouteData(path=" + this.path + ", strategyType=" + this.strategyType + ", instId=" + this.instId + ", bizType=" + this.bizType + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenName=" + this.tokenName + ", bizTypeStr=" + this.bizTypeStr + ", fromPage=" + this.fromPage + ", bottomListFlag=" + this.bottomListFlag + ", bsType=" + this.bsType + ", ordType=" + this.ordType + ", px=" + this.px + ", triggerPx=" + this.triggerPx + ", triggerPxType=" + this.triggerPxType + ", ordPx=" + this.ordPx + ", slOrdPx=" + this.slOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slTriggerPxType=" + this.slTriggerPxType + ", tpOrdKind=" + this.tpOrdKind + ", tpOrdPx=" + this.tpOrdPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", posSide=" + this.posSide + ", side=" + this.side + ", sz=" + this.sz + ", level=" + this.level + ", attachAlgoOrds=" + this.attachAlgoOrds + ", isSlideToBottomTitle=" + this.isSlideToBottomTitle + ", isCurrentBizChecked=" + this.isCurrentBizChecked + ", isSpotLeadTrade=" + this.isSpotLeadTrade + ", optionType=" + this.optionType + ", optionParams=" + this.optionParams + ", id=" + this.id + ", tabIndex=" + this.tabIndex + ", order=" + this.order + ", instFamily=" + this.instFamily + ", squareType=" + this.squareType + ", detailAction=" + this.detailAction + ", recommendId=" + this.recommendId + ", algoIndexId=" + this.algoIndexId + ", title=" + this.title + ", channel=" + this.channel + ", fromPageSource=" + this.fromPageSource + ", fromPageSubSource=" + this.fromPageSubSource + ", fromPageSession=" + this.fromPageSession + ", channelDetails=" + this.channelDetails + ", activityId=" + this.activityId + ", e2eParams=" + this.e2eParams + ", botParams=" + this.botParams + ", advanceOrdType=" + this.advanceOrdType + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.path);
        parcel.writeString(this.strategyType);
        parcel.writeString(this.instId);
        Integer num = this.bizType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.bizTypeStr);
        parcel.writeString(this.fromPage);
        parcel.writeString(this.bottomListFlag);
        Integer num2 = this.bsType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.ordType);
        parcel.writeString(this.px);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.triggerPxType);
        parcel.writeString(this.ordPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.tpOrdKind);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.posSide);
        parcel.writeString(this.side);
        parcel.writeString(this.sz);
        parcel.writeString(this.level);
        ArrayList<AttachAlgoOrder> arrayList = this.attachAlgoOrds;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AttachAlgoOrder> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isSlideToBottomTitle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isCurrentBizChecked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isSpotLeadTrade;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.optionType);
        parcel.writeBundle(this.optionParams);
        parcel.writeString(this.id);
        parcel.writeString(this.tabIndex);
        parcel.writeString(this.order);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.squareType);
        parcel.writeString(this.detailAction);
        parcel.writeString(this.recommendId);
        parcel.writeString(this.algoIndexId);
        parcel.writeString(this.title);
        parcel.writeString(this.channel);
        parcel.writeString(this.fromPageSource);
        parcel.writeString(this.fromPageSubSource);
        parcel.writeString(this.fromPageSession);
        parcel.writeString(this.channelDetails);
        parcel.writeString(this.activityId);
        parcel.writeBundle(this.e2eParams);
        parcel.writeBundle(this.botParams);
        parcel.writeString(this.advanceOrdType);
        parcel.writeString(this.tag);
    }

    public RouteData(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, ArrayList<AttachAlgoOrder> arrayList, Boolean bool, Boolean bool2, Boolean bool3, String str26, Bundle bundle, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Bundle bundle2, Bundle bundle3, String str42, String str43) {
        this.path = str;
        this.strategyType = str2;
        this.instId = str3;
        this.bizType = num;
        this.chainIndex = str4;
        this.tokenAddress = str5;
        this.tokenName = str6;
        this.bizTypeStr = str7;
        this.fromPage = str8;
        this.bottomListFlag = str9;
        this.bsType = num2;
        this.ordType = str10;
        this.px = str11;
        this.triggerPx = str12;
        this.triggerPxType = str13;
        this.ordPx = str14;
        this.slOrdPx = str15;
        this.slTriggerPx = str16;
        this.slTriggerPxType = str17;
        this.tpOrdKind = str18;
        this.tpOrdPx = str19;
        this.tpTriggerPx = str20;
        this.tpTriggerPxType = str21;
        this.posSide = str22;
        this.side = str23;
        this.sz = str24;
        this.level = str25;
        this.attachAlgoOrds = arrayList;
        this.isSlideToBottomTitle = bool;
        this.isCurrentBizChecked = bool2;
        this.isSpotLeadTrade = bool3;
        this.optionType = str26;
        this.optionParams = bundle;
        this.id = str27;
        this.tabIndex = str28;
        this.order = str29;
        this.instFamily = str30;
        this.squareType = str31;
        this.detailAction = str32;
        this.recommendId = str33;
        this.algoIndexId = str34;
        this.title = str35;
        this.channel = str36;
        this.fromPageSource = str37;
        this.fromPageSubSource = str38;
        this.fromPageSession = str39;
        this.channelDetails = str40;
        this.activityId = str41;
        this.e2eParams = bundle2;
        this.botParams = bundle3;
        this.advanceOrdType = str42;
        this.tag = str43;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0254: CONSTRUCTOR 
  (r52v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r104v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r104v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r104v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r55v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r104v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r104v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r104v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r104v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r104v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r104v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004c: ARITH (r104v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r62v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r104v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r104v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r104v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r104v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r104v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r104v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r104v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r104v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r104v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r104v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r104v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r104v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r104v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r104v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r104v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r104v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r104v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r79v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0106: ARITH (r104v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r80v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0111: ARITH (r104v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r81v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x011c: ARITH (r104v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r82v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r104v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x012f: ARITH (r105v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r84v0 android.os.Bundle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0138: ARITH (r105v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r105v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014a: ARITH (r105v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0153: ARITH (r105v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015c: ARITH (r105v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0165: ARITH (r105v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r90v0 java.lang.String))
  (wrap:java.lang.String:0x0178: TERNARY null = ((wrap:int:0x0170: ARITH (r105v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:java.lang.String:0x0182: TERNARY null = ((wrap:int:0x017a: ARITH (r105v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r92v0 java.lang.String))
  (wrap:java.lang.String:0x018c: TERNARY null = ((wrap:int:0x0184: ARITH (r105v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.String:0x0196: TERNARY null = ((wrap:int:0x018e: ARITH (r105v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r94v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0198: ARITH (r105v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r95v0 java.lang.String))
  (wrap:java.lang.String:0x01aa: TERNARY null = ((wrap:int:0x01a2: ARITH (r105v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r96v0 java.lang.String))
  (wrap:java.lang.String:0x01b4: TERNARY null = ((wrap:int:0x01ac: ARITH (r105v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r105v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01be: ARITH (r105v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r99v0 java.lang.String))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x01c7: ARITH (r105v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r100v0 android.os.Bundle))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x01d0: ARITH (r105v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r101v0 android.os.Bundle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d9: ARITH (r105v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e2: ARITH (r105v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r103v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder>, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, android.os.Bundle, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.tradeapi.bean.RouteData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, android.os.Bundle, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RouteData(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, String str26, Bundle bundle, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, Bundle bundle2, Bundle bundle3, String str42, String str43, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? null : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i & 67108864) != 0 ? null : str25, (i & 134217728) != 0 ? null : arrayList, (i & 268435456) != 0 ? null : bool, (i & 536870912) != 0 ? null : bool2, (i & 1073741824) != 0 ? null : bool3, (i & Integer.MIN_VALUE) != 0 ? null : str26, (i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? null : str27, (i2 & 4) != 0 ? null : str28, (i2 & 8) != 0 ? null : str29, (i2 & 16) != 0 ? null : str30, (i2 & 32) != 0 ? null : str31, (i2 & 64) != 0 ? null : str32, (i2 & 128) != 0 ? null : str33, (i2 & 256) != 0 ? null : str34, (i2 & 512) != 0 ? null : str35, (i2 & 1024) != 0 ? null : str36, (i2 & 2048) != 0 ? null : str37, (i2 & 4096) != 0 ? null : str38, (i2 & 8192) != 0 ? null : str39, (i2 & 16384) != 0 ? null : str40, (i2 & 32768) != 0 ? null : str41, (i2 & 65536) != 0 ? null : bundle2, (i2 & 131072) != 0 ? null : bundle3, (i2 & 262144) != 0 ? null : str42, (i2 & 524288) != 0 ? null : str43);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.RouteData.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String OLrzqt(Integer num) {
            if (num == null || num.intValue() != 0) {
                if (num != null && num.intValue() == 1) {
                    return "MARGIN";
                }
                if (num != null && num.intValue() == 2) {
                    return "SWAP";
                }
                if (num != null && num.intValue() == 3) {
                    return "FUTURES";
                }
                if (num != null && num.intValue() == 4) {
                    return "OPTION";
                }
                if (num != null && num.intValue() == 5) {
                    return "CEDEFI";
                }
            }
            return "SPOT";
        }
    }

    public final String getInstType() {
        Integer num = this.bizType;
        if (num == null && this.mInstType == null) {
            return null;
        }
        String str = this.mInstType;
        if (str != null) {
            Intrinsics.copydefault((Object) str);
            return str;
        }
        return Companion.OLrzqt(num);
    }
}
