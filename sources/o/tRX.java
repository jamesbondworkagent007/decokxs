package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.market.common.constants.ExperienceRouteConst;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.biz_plugin.ChartTimeframeConfig;
import com.okinc.planet.biz_plugin.future.data.FilteredOrderPoints;
import com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata;
import com.okinc.planet.biz_plugin.spot.data.PluginSpotMetadata;
import com.okinc.planet.biz_userprofile.data.PlanetFollowRequest;
import com.okinc.planet.biz_userprofile.data.PlanetMarkMessageReadRequest;
import com.okinc.planet.deeplink.DeepLinkMapper;
import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.impl.OKPlanetImpl$checkOtherUserOrbiterRole$1;
import com.okinc.planet.impl.OKPlanetImpl$followUser$1;
import com.okinc.planet.impl.OKPlanetImpl$markOrbitNotificationMsgAsRead$1;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.planet.utils.IMUtils;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import com.okinc.planet_api.PluginChartTimeframeConfig;
import com.okinc.planet_api.model.DefiFeedParams;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import com.okinc.planet_api.model.SimpleResp;
import com.okinc.planet_api.model.WSMessageData;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC43419rot;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRX extends AbstractC43215rlA implements tWL {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tRY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tRX.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tRV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tRX.OLrzqt();
        }
    });

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tRX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final InterfaceC47278tmy AkhnZx() {
        return (InterfaceC47278tmy) this.KWHzl.getValue();
    }

    public static final InterfaceC47278tmy AEQbTJ() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((TradeHisPositionHisOrderPlanetBean) t).getTimestamp())), java.lang.Long.valueOf(C33129mqd.valueOf(((TradeHisPositionHisOrderPlanetBean) t2).getTimestamp())));
        }
    }

    public final tQP AYXKKw() {
        return (tQP) this.copydefault.getValue();
    }

    public static final tQP OLrzqt() {
        return tPF.copydefault.aJFbMH();
    }

    public final boolean valueOf() {
        return AkhnZx().fJNWhG();
    }

    @Override // o.tWL
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C43056riA c43056riA = C43056riA.AEQbTJ;
        ExperienceRouteConst.MiniAppRoute miniAppRoute = ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL;
        c43056riA.copydefault(context, "market", miniAppRoute.getUrl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("contentId", str), C56390yDp.OLrzqt("refererCommentId", str2), C56390yDp.OLrzqt("refererReplyRootId", str3), C56390yDp.OLrzqt("fromPage", str4), C56390yDp.OLrzqt("minversion", miniAppRoute.getMinAppVersion())));
    }

    @Override // o.tWL
    public java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        DeepLinkMapper deepLinkMapper = DeepLinkMapper.MAIN_FEED;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(deepLinkMapper.getOld(), deepLinkMapper.getNew());
        DeepLinkMapper deepLinkMapper2 = DeepLinkMapper.PERSONAL_HOMEPAGE;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(deepLinkMapper2.getOld(), deepLinkMapper2.getNew());
        DeepLinkMapper deepLinkMapper3 = DeepLinkMapper.COPY_PERSONAL_HOMEPAGE;
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(deepLinkMapper3.getOld(), deepLinkMapper3.getNew());
        DeepLinkMapper deepLinkMapper4 = DeepLinkMapper.PROFILE_BIO;
        return C56424yEw.AYXKKw(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(deepLinkMapper4.getOld(), deepLinkMapper4.getNew()));
    }

    @Override // o.tWL
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/planet/chat");
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/planet", bundle);
    }

    @Override // o.tWL
    public boolean AhwBna() {
        if (C33216msK.KWHzl.KWHzl() && !valueOf()) {
            IMUtils iMUtils = IMUtils.KWHzl;
            if ((iMUtils.OLrzqt() || iMUtils.copydefault() || iMUtils.EZpvd()) && !((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz() && ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.tWL
    public boolean values() {
        if (C33216msK.KWHzl.KWHzl() && !valueOf()) {
            IMUtils iMUtils = IMUtils.KWHzl;
            if (iMUtils.OLrzqt() || iMUtils.copydefault() || iMUtils.EZpvd()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.tWL
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C46447tUr.openMyPlanetUserProfilePage$default(C46447tUr.KWHzl, context, str, str2, null, 8, null);
    }

    @Override // o.tWL
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C46447tUr.openPlanetUserProfilePage$default(C46447tUr.KWHzl, context, str, str2, str3, str4, str5, null, null, 192, null);
    }

    @Override // o.tWL
    public void KWHzl(@NotNull android.content.Context context, PlanetNotificationCategory planetNotificationCategory) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC47950tzl.Companion.OLrzqt(context, planetNotificationCategory);
    }

    @Override // o.tWL
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC47944tzf.Companion.OLrzqt(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.tWL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, java.lang.Long l, @NotNull Continuation<? super SimpleResp> continuation) throws java.lang.Throwable {
        OKPlanetImpl$markOrbitNotificationMsgAsRead$1 oKPlanetImpl$markOrbitNotificationMsgAsRead$1;
        AbstractC43419rot actionBar;
        java.lang.String strAYXKKw = "";
        if (continuation instanceof OKPlanetImpl$markOrbitNotificationMsgAsRead$1) {
            oKPlanetImpl$markOrbitNotificationMsgAsRead$1 = (OKPlanetImpl$markOrbitNotificationMsgAsRead$1) continuation;
            int i2 = oKPlanetImpl$markOrbitNotificationMsgAsRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oKPlanetImpl$markOrbitNotificationMsgAsRead$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oKPlanetImpl$markOrbitNotificationMsgAsRead$1 = new OKPlanetImpl$markOrbitNotificationMsgAsRead$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = oKPlanetImpl$markOrbitNotificationMsgAsRead$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = oKPlanetImpl$markOrbitNotificationMsgAsRead$1.label;
        boolean z = true;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                tQP tqpAYXKKw = AYXKKw();
                PlanetMarkMessageReadRequest planetMarkMessageReadRequest = new PlanetMarkMessageReadRequest(i, l);
                oKPlanetImpl$markOrbitNotificationMsgAsRead$1.L$0 = "";
                oKPlanetImpl$markOrbitNotificationMsgAsRead$1.label = 1;
                objCopydefault = tqpAYXKKw.copydefault(planetMarkMessageReadRequest, (Continuation<? super ResponseData<java.lang.Object>>) oKPlanetImpl$markOrbitNotificationMsgAsRead$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strAYXKKw = (java.lang.String) oKPlanetImpl$markOrbitNotificationMsgAsRead$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            try {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            } catch (OKServerException e) {
                strAYXKKw = C33129mqd.gEmmrt(e.getMessage());
                z = false;
            } catch (java.lang.Exception unused) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.WS);
                z = false;
            }
        }
        actionBar.AEQbTJ();
        return new SimpleResp(z, strAYXKKw);
    }

    @Override // o.tWL
    public Flow<WSMessageData> gEmmrt() {
        return C46418tTp.Companion.AhwBna();
    }

    @Override // o.tWL
    public PluginChartTimeframeConfig EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ChartTimeframeConfig chartTimeframeConfigOLrzqt = tBO.copydefault.OLrzqt(j, C33129mqd.valueOf(str), C33129mqd.valueOf(str2));
        return new PluginChartTimeframeConfig(chartTimeframeConfigOLrzqt.getIntervalMinutes().getValue(), chartTimeframeConfigOLrzqt.getApproximateDataPoints(), chartTimeframeConfigOLrzqt.getStartTimestamp(), chartTimeframeConfigOLrzqt.getEndTimestamp());
    }

    @Override // o.tWL
    public PluginChartTimeframeConfig OLrzqt(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ChartTimeframeConfig chartTimeframeConfigCopydefault = tBO.copydefault.copydefault(j, C33129mqd.valueOf(str));
        return new PluginChartTimeframeConfig(chartTimeframeConfigCopydefault.getIntervalMinutes().getValue(), chartTimeframeConfigCopydefault.getApproximateDataPoints(), chartTimeframeConfigCopydefault.getStartTimestamp(), chartTimeframeConfigCopydefault.getEndTimestamp());
    }

    @Override // o.tWL
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        TradeAssetPlanetBean tradeAssetPlanetBean = obj instanceof TradeAssetPlanetBean ? (TradeAssetPlanetBean) obj : null;
        if (tradeAssetPlanetBean == null) {
            pUU.copydefault("OKPlanetImpl", "getPlanetSpotPluginMetaData: Invalid spotInfo type. Expected TradeAssetPlanetBean, got " + obj.getClass().getSimpleName());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof TradeTickerChartEntry) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty() && (!list.isEmpty())) {
            pUU.copydefault("OKPlanetImpl", "getPlanetSpotPluginMetaData: chartTicker contains no valid TradeTickerChartEntry. Received " + list.size() + " items");
        }
        return new PluginSpotMetadata((java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, arrayList, tradeAssetPlanetBean, (java.lang.String) null, 77, (DefaultConstructorMarker) null).getInJsonString();
    }

    @Override // o.tWL
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull PlanetFutureTypeEnum planetFutureTypeEnum, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.util.List<? extends java.lang.Object> list2) {
        TradeHisPositionPlanetBean tradeHisPositionPlanetBean;
        TradePositionPlanetBean tradePositionPlanetBean;
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetFutureTypeEnum, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (planetFutureTypeEnum == PlanetFutureTypeEnum.CURRENT) {
            TradePositionPlanetBean tradePositionPlanetBean2 = obj instanceof TradePositionPlanetBean ? (TradePositionPlanetBean) obj : null;
            if (tradePositionPlanetBean2 == null) {
                pUU.copydefault("OKPlanetImpl", "getPlanetFuturesPluginMetaData: Invalid futuresInfo type for CURRENT. Expected TradePositionPlanetBean, got " + obj.getClass().getSimpleName());
            }
            tradePositionPlanetBean = tradePositionPlanetBean2;
            tradeHisPositionPlanetBean = null;
        } else {
            TradeHisPositionPlanetBean tradeHisPositionPlanetBean2 = obj instanceof TradeHisPositionPlanetBean ? (TradeHisPositionPlanetBean) obj : null;
            if (tradeHisPositionPlanetBean2 == null) {
                pUU.copydefault("OKPlanetImpl", "getPlanetFuturesPluginMetaData: Invalid futuresInfo type for HISTORY. Expected TradeHisPositionPlanetBean, got " + obj.getClass().getSimpleName());
            }
            tradeHisPositionPlanetBean = tradeHisPositionPlanetBean2;
            tradePositionPlanetBean = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof TradeTickerChartEntry) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty() && (!list.isEmpty())) {
            pUU.copydefault("OKPlanetImpl", "getPlanetFuturesPluginMetaData: chartTicker contains no valid TradeTickerChartEntry. Received " + list.size() + " items");
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list2) {
            if (obj3 instanceof TradeHisPositionHisOrderPlanetBean) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty() && (!list2.isEmpty())) {
            pUU.copydefault("OKPlanetImpl", "getPlanetFuturesPluginMetaData: buySellMarkerList contains no valid TradeHisPositionHisOrderPlanetBean. Received " + list2.size() + " items");
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            FilteredOrderPoints filteredOrderPointsComponent1 = tBN.AEQbTJ.AEQbTJ(arrayList, arrayList2).component1();
            listAhwBna = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) filteredOrderPointsComponent1.getBuyOrders(), (java.lang.Iterable) filteredOrderPointsComponent1.getSellOrders()), new StateListAnimator());
        } else {
            listAhwBna = yDY.AhwBna();
        }
        return new PluginFuturesMetadata((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, planetFutureTypeEnum.getType(), arrayList, listAhwBna, tradePositionPlanetBean, tradeHisPositionPlanetBean, (java.lang.String) null, 519, (DefaultConstructorMarker) null).getInJsonString();
    }

    @Override // o.tWL
    public androidx.fragment.app.Fragment EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        return C47816txJ.Companion.copydefault(str);
    }

    @Override // o.tWL
    public void KWHzl(@NotNull android.content.Context context, @NotNull PlanetProfileSettingsActions planetProfileSettingsActions) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(planetProfileSettingsActions, "");
        context.startActivity(ActivityC46100tHv.Companion.copydefault(context, planetProfileSettingsActions));
    }

    @Override // o.tWL
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C46447tUr.showUserCenterPage$default(C46447tUr.KWHzl, context, str, str2, str3, str4, str5, str6, str7 != null ? str7 : null, str8, str9, null, null, activityResultLauncher, 3072, null);
    }

    @Override // o.tWL
    public boolean EZpvd() {
        return C46388tSm.Companion.KWHzl().AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.tWL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKPlanetImpl$checkOtherUserOrbiterRole$1 oKPlanetImpl$checkOtherUserOrbiterRole$1;
        if (continuation instanceof OKPlanetImpl$checkOtherUserOrbiterRole$1) {
            oKPlanetImpl$checkOtherUserOrbiterRole$1 = (OKPlanetImpl$checkOtherUserOrbiterRole$1) continuation;
            int i = oKPlanetImpl$checkOtherUserOrbiterRole$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKPlanetImpl$checkOtherUserOrbiterRole$1.label = i - Integer.MIN_VALUE;
            } else {
                oKPlanetImpl$checkOtherUserOrbiterRole$1 = new OKPlanetImpl$checkOtherUserOrbiterRole$1(this, continuation);
            }
        }
        OKPlanetImpl$checkOtherUserOrbiterRole$1 oKPlanetImpl$checkOtherUserOrbiterRole$12 = oKPlanetImpl$checkOtherUserOrbiterRole$1;
        java.lang.Object objAEQbTJ = oKPlanetImpl$checkOtherUserOrbiterRole$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKPlanetImpl$checkOtherUserOrbiterRole$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C46447tUr c46447tUr = C46447tUr.KWHzl;
            oKPlanetImpl$checkOtherUserOrbiterRole$12.label = 1;
            objAEQbTJ = c46447tUr.AEQbTJ(str, str2, str3, str4, oKPlanetImpl$checkOtherUserOrbiterRole$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        OrbitSimpleInfo orbitSimpleInfo = (OrbitSimpleInfo) objAEQbTJ;
        return C56443yFo.KWHzl(OrbitStatus.Companion.AEQbTJ(orbitSimpleInfo != null ? orbitSimpleInfo.getOrbitLevel() : null).isOrbiter());
    }

    @Override // o.tWL
    public void OLrzqt(@NotNull FragmentActivity fragmentActivity, android.view.View view, boolean z, Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        tAB.Companion.KWHzl(fragmentActivity, view, z, function1);
    }

    @Override // o.tWL
    public void KWHzl(@NotNull FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        tAI.Companion.copydefault(fragmentActivity, function1);
    }

    @Override // o.tWL
    public AbstractC32996moC copydefault(@NotNull DefiFeedParams defiFeedParams) {
        Intrinsics.checkNotNullParameter(defiFeedParams, "");
        return C47809txC.Companion.copydefault(defiFeedParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0110 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #4 {all -> 0x003d, blocks: (B:12:0x0038, B:58:0x00f5, B:60:0x00fd, B:62:0x0103, B:63:0x0110), top: B:99:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    @Override // o.tWL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, java.lang.String str, java.lang.String str2, PlanetPublisherChannelId planetPublisherChannelId, @NotNull Continuation<? super SimpleResp> continuation) throws java.lang.Throwable {
        OKPlanetImpl$followUser$1 oKPlanetImpl$followUser$1;
        java.lang.String strAYXKKw;
        tRX trx;
        java.lang.String str3;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof OKPlanetImpl$followUser$1) {
            oKPlanetImpl$followUser$1 = (OKPlanetImpl$followUser$1) continuation;
            int i = oKPlanetImpl$followUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKPlanetImpl$followUser$1.label = i - Integer.MIN_VALUE;
            } else {
                oKPlanetImpl$followUser$1 = new OKPlanetImpl$followUser$1(this, continuation);
            }
        }
        OKPlanetImpl$followUser$1 oKPlanetImpl$followUser$12 = oKPlanetImpl$followUser$1;
        java.lang.Object objOLrzqt = oKPlanetImpl$followUser$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKPlanetImpl$followUser$12.label;
        boolean z2 = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!z && C46388tSm.Companion.KWHzl().AYXKKw()) {
                return new SimpleResp(false, C33070mpX.AYXKKw(C47501trL.Fragment.call));
            }
            C46437tUh c46437tUh = C46437tUh.OLrzqt;
            strAYXKKw = "";
            if (!c46437tUh.AEQbTJ() || !z || C46388tSm.Companion.KWHzl().AhwBna()) {
                if (!z || C46388tSm.Companion.KWHzl().valueOf()) {
                    try {
                        java.lang.String str4 = !C33216msK.KWHzl.KWHzl() ? "1" : "0";
                        tQP tqpAYXKKw = AYXKKw();
                        PlanetFollowRequest planetFollowRequest = new PlanetFollowRequest(z, str, str2, planetPublisherChannelId != null ? planetPublisherChannelId.getValue() : null, str4);
                        oKPlanetImpl$followUser$12.L$0 = this;
                        oKPlanetImpl$followUser$12.L$1 = "";
                        oKPlanetImpl$followUser$12.label = 1;
                        objOLrzqt = tqpAYXKKw.OLrzqt(planetFollowRequest, oKPlanetImpl$followUser$12);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        trx = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        str3 = strAYXKKw;
                    }
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    trx = this;
                    str3 = "";
                    responseData = (ResponseData) objOLrzqt;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        actionBar.AEQbTJ();
                        z2 = true;
                    }
                } else {
                    if (c46437tUh.AEQbTJ()) {
                        DbNXlk();
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.WS);
                    }
                    str3 = strAYXKKw;
                }
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                if (activityAEQbTJ != null && (activityAEQbTJ instanceof FragmentActivity)) {
                    OLrzqt((FragmentActivity) activityAEQbTJ, null, true, new Function1() { // from class: o.tRW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return tRX.OLrzqt((kotlin.Pair) obj);
                        }
                    });
                }
                return new SimpleResp(false, "");
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) oKPlanetImpl$followUser$12.L$1;
            trx = (tRX) oKPlanetImpl$followUser$12.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                responseData = (ResponseData) objOLrzqt;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                strAYXKKw = str3;
                try {
                    try {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        str3 = strAYXKKw;
                    } catch (java.lang.Exception unused) {
                        strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.WS);
                        str3 = strAYXKKw;
                    }
                } catch (OKServerException e) {
                    e = e;
                    if (e.getCode() != 52002 || e.getCode() == 52003 || e.getCode() == 50033) {
                        strAYXKKw = C33129mqd.gEmmrt(e.getMessage());
                    } else if (e.getCode() == 50034 && C46437tUh.OLrzqt.AEQbTJ()) {
                        trx.DbNXlk();
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.WS);
                    }
                    str3 = strAYXKKw;
                    return new SimpleResp(z2, str3);
                }
            }
            try {
                actionBar.AEQbTJ();
                z2 = true;
            } catch (OKServerException e2) {
                e = e2;
                strAYXKKw = str3;
                if (e.getCode() != 52002) {
                    strAYXKKw = C33129mqd.gEmmrt(e.getMessage());
                    str3 = strAYXKKw;
                }
            }
        }
        return new SimpleResp(z2, str3);
    }

    public static final Unit OLrzqt(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || !(activityAEQbTJ instanceof FragmentActivity)) {
            return;
        }
        tKX.openProfileEditPage$default(tKX.Companion.OLrzqt(), (FragmentActivity) activityAEQbTJ, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, null, 8, null);
    }

    @Override // o.tWL
    public AbstractC32996moC AEQbTJ(@NotNull java.lang.Object obj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof SearchResultContentPo) {
            return C46084tHf.Companion.copydefault((SearchResultContentPo) obj, str);
        }
        return null;
    }
}
