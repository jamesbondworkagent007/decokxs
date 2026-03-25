package o;

import android.view.ViewGroup;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tCm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45956tCm implements tWX {
    public static final Activity Companion = new Activity(null);
    public final PlanetPublisherPluginType AEQbTJ = PlanetPublisherPluginType.FUTURES;

    @Override // o.tWX
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tWX
    public PlanetPublisherPluginType EZpvd() {
        return this.AEQbTJ;
    }

    @Override // o.tWX
    public boolean KWHzl() {
        return true;
    }

    @Override // o.tWX
    public boolean OLrzqt() {
        return true;
    }

    /* JADX INFO: renamed from: o.tCm$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tCm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.tWX
    public java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.AYXKKw(C47501trL.Fragment.invokespecialhOMIpD);
    }

    @Override // o.tWX
    public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja);
    }

    @Override // o.tWX
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        tWV twv;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        try {
            Result.Application application = Result.Companion;
            PluginFuturesMetadata pluginFuturesMetadataCopydefault = PluginFuturesMetadata.Companion.copydefault(str);
            if (Intrinsics.EZpvd((java.lang.Object) pluginFuturesMetadataCopydefault.getFuturesType(), (java.lang.Object) PlanetFutureTypeEnum.CURRENT.getType())) {
                TradePositionPlanetBean futuresCurrentInfo = pluginFuturesMetadataCopydefault.getFuturesCurrentInfo();
                if (futuresCurrentInfo != null) {
                    PluginFuturesMetadata pluginFuturesMetadataCopy = pluginFuturesMetadataCopydefault.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? pluginFuturesMetadataCopydefault.coinName : futuresCurrentInfo.getInstName(), (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? pluginFuturesMetadataCopydefault.pnl : futuresCurrentInfo.getPnl(), (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? pluginFuturesMetadataCopydefault.pnlRatio : futuresCurrentInfo.getPnlRate(), (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? pluginFuturesMetadataCopydefault.pluginDataTime : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? pluginFuturesMetadataCopydefault.futuresType : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? pluginFuturesMetadataCopydefault.chartTicker : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? pluginFuturesMetadataCopydefault.chartMarker : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? pluginFuturesMetadataCopydefault.futuresCurrentInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? pluginFuturesMetadataCopydefault.futuresHistoryInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? pluginFuturesMetadataCopydefault.displayType : null);
                    C45971tDa c45971tDa = new C45971tDa(context, null, 0, 6, null);
                    c45971tDa.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    java.lang.String pluginDataTime = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime == null) {
                        pluginDataTime = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    java.lang.String str2 = pluginDataTime;
                    java.util.List<TradeTickerChartEntry> chartTicker = pluginFuturesMetadataCopy.getChartTicker();
                    if (chartTicker == null) {
                        chartTicker = yDY.AhwBna();
                    }
                    java.util.List<TradeTickerChartEntry> list = chartTicker;
                    java.util.List<TradeHisPositionHisOrderPlanetBean> chartMarker = pluginFuturesMetadataCopy.getChartMarker();
                    if (chartMarker == null) {
                        chartMarker = yDY.AhwBna();
                    }
                    FuturePositionBean futurePositionBean = new FuturePositionBean(futuresCurrentInfo, true, str2, (java.util.List) list, (java.util.List) chartMarker, false, 32, (DefaultConstructorMarker) null);
                    FutureCustomizeType.Companion companion = FutureCustomizeType.Companion;
                    c45971tDa.KWHzl(futurePositionBean, companion.KWHzl(pluginFuturesMetadataCopy.getDisplayType()), planetPublisherPluginPreviewType);
                    pUU.EZpvd("PlanetPluginMetaData", "futurePosition=" + pluginFuturesMetadataCopy.getInJsonString());
                    java.lang.String deepLink = futuresCurrentInfo.getDeepLink();
                    java.lang.String inJsonString = pluginFuturesMetadataCopy.getInJsonString();
                    java.lang.String pluginDataTime2 = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime2 == null) {
                        pluginDataTime2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    twv = new tWV(c45971tDa, deepLink, inJsonString, pluginDataTime2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("plugin_type", new C46511tXa("perp_position", true)), C56390yDp.OLrzqt("plugin_token", new C46511tXa(futuresCurrentInfo.getInstName(), false)), C56390yDp.OLrzqt("plugin_option_pnl", new C46511tXa(companion.KWHzl(pluginFuturesMetadataCopy.getDisplayType()).getTrack(), true))));
                } else {
                    android.view.View view = new android.view.View(context);
                    java.lang.String inJsonString2 = pluginFuturesMetadataCopydefault.getInJsonString();
                    java.lang.String pluginDataTime3 = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime3 == null) {
                        pluginDataTime3 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    twv = new tWV(view, "", inJsonString2, pluginDataTime3, null, 16, null);
                }
            } else {
                TradeHisPositionPlanetBean futuresHistoryInfo = pluginFuturesMetadataCopydefault.getFuturesHistoryInfo();
                if (futuresHistoryInfo != null) {
                    PluginFuturesMetadata pluginFuturesMetadataCopy2 = pluginFuturesMetadataCopydefault.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? pluginFuturesMetadataCopydefault.coinName : futuresHistoryInfo.getInstName(), (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? pluginFuturesMetadataCopydefault.pnl : futuresHistoryInfo.getPnl(), (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? pluginFuturesMetadataCopydefault.pnlRatio : futuresHistoryInfo.getPnlRate(), (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? pluginFuturesMetadataCopydefault.pluginDataTime : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? pluginFuturesMetadataCopydefault.futuresType : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? pluginFuturesMetadataCopydefault.chartTicker : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? pluginFuturesMetadataCopydefault.chartMarker : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? pluginFuturesMetadataCopydefault.futuresCurrentInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? pluginFuturesMetadataCopydefault.futuresHistoryInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? pluginFuturesMetadataCopydefault.displayType : null);
                    tCD tcd = new tCD(context, null, 0, 6, null);
                    tcd.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    java.lang.String pluginDataTime4 = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime4 == null) {
                        pluginDataTime4 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    java.lang.String str3 = pluginDataTime4;
                    java.util.List<TradeTickerChartEntry> chartTicker2 = pluginFuturesMetadataCopy2.getChartTicker();
                    if (chartTicker2 == null) {
                        chartTicker2 = yDY.AhwBna();
                    }
                    java.util.List<TradeTickerChartEntry> list2 = chartTicker2;
                    java.util.List<TradeHisPositionHisOrderPlanetBean> chartMarker2 = pluginFuturesMetadataCopy2.getChartMarker();
                    if (chartMarker2 == null) {
                        chartMarker2 = yDY.AhwBna();
                    }
                    FutureHistoryBean futureHistoryBean = new FutureHistoryBean(futuresHistoryInfo, true, str3, (java.util.List) list2, (java.util.List) chartMarker2, false, 32, (DefaultConstructorMarker) null);
                    FutureCustomizeType.Companion companion2 = FutureCustomizeType.Companion;
                    tcd.KWHzl(futureHistoryBean, companion2.KWHzl(pluginFuturesMetadataCopy2.getDisplayType()), planetPublisherPluginPreviewType);
                    tcd.setExpanded(true, false, futureHistoryBean.getTradeHisPositionPlanetBean().getPnlRiseFall());
                    pUU.EZpvd("PlanetPluginMetaData", "futureHistory=" + pluginFuturesMetadataCopy2.getInJsonString());
                    java.lang.String deepLink2 = futuresHistoryInfo.getDeepLink();
                    java.lang.String inJsonString3 = pluginFuturesMetadataCopy2.getInJsonString();
                    java.lang.String pluginDataTime5 = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime5 == null) {
                        pluginDataTime5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    twv = new tWV(tcd, deepLink2, inJsonString3, pluginDataTime5, C56424yEw.gEmmrt(C56390yDp.OLrzqt("plugin_type", new C46511tXa("historical_perp", true)), C56390yDp.OLrzqt("plugin_token", new C46511tXa(futuresHistoryInfo.getInstName(), false)), C56390yDp.OLrzqt("plugin_option_pnl", new C46511tXa(companion2.KWHzl(pluginFuturesMetadataCopy2.getDisplayType()).getTrack(), true))));
                } else {
                    android.view.View view2 = new android.view.View(context);
                    java.lang.String inJsonString4 = pluginFuturesMetadataCopydefault.getInJsonString();
                    java.lang.String pluginDataTime6 = pluginFuturesMetadataCopydefault.getPluginDataTime();
                    if (pluginDataTime6 == null) {
                        pluginDataTime6 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    }
                    twv = new tWV(view2, "", inJsonString4, pluginDataTime6, null, 16, null);
                }
            }
            return Result.m7377constructorimpl(twv);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.tWX
    public void OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final tWW tww) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tww, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(tCW.Companion.OLrzqt(fragmentManager, new Function1() { // from class: o.tCp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45956tCm.AEQbTJ(tww, (PluginFuturesMetadata) obj);
                }
            }));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("FuturesPlanetPluginRegister", "Failed to show FuturePluginContainerBottomSheet", thM7380exceptionOrNullimpl);
            tww.AEQbTJ(C33070mpX.AYXKKw(C47501trL.Fragment.profile));
        }
    }

    public static final Unit AEQbTJ(tWW tww, PluginFuturesMetadata pluginFuturesMetadata) {
        Intrinsics.checkNotNullParameter(pluginFuturesMetadata, "");
        java.lang.String inJsonString = pluginFuturesMetadata.getInJsonString();
        pUU.EZpvd("FuturesPlanetPluginRegister", inJsonString);
        tww.copydefault(inJsonString);
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final tWW tww) {
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tww, "");
        JsonElement toJsonElement = C43284rmQ.KWHzl().parseToJsonElement(str);
        FutureCustomizeType.Companion companion = FutureCustomizeType.Companion;
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((java.lang.Object) "displayType");
        FutureCustomizeType futureCustomizeTypeKWHzl = companion.KWHzl((jsonElement == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive2));
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((java.lang.Object) "futuresType");
        final java.lang.String contentOrNull = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        C32866mlf.onEvent$default("Feeds_Mid_PluginCardEdit_Click", (TrackChannel[]) null, new Function1() { // from class: o.tCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45956tCm.copydefault(contentOrNull, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C45965tCv.Companion.copydefault(fragmentManager, futureCustomizeTypeKWHzl, new Function1() { // from class: o.tCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45956tCm.copydefault(str, tww, contentOrNull, (FutureCustomizeType) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "current") ? "futures_position" : "historical_futures", true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, tWW tww, final java.lang.String str2, final FutureCustomizeType futureCustomizeType) {
        Intrinsics.checkNotNullParameter(futureCustomizeType, "");
        C32866mlf.onEvent$default("Feeds_Btm_PluginCardEditConfirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.tCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45956tCm.AEQbTJ(str2, futureCustomizeType, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        PluginFuturesMetadata pluginFuturesMetadata = (PluginFuturesMetadata) C43284rmQ.KWHzl().decodeFromString(PluginFuturesMetadata.Companion.serializer(), str);
        tww.copydefault(pluginFuturesMetadata.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? pluginFuturesMetadata.coinName : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? pluginFuturesMetadata.pnl : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? pluginFuturesMetadata.pnlRatio : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? pluginFuturesMetadata.pluginDataTime : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? pluginFuturesMetadata.futuresType : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? pluginFuturesMetadata.chartTicker : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? pluginFuturesMetadata.chartMarker : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? pluginFuturesMetadata.futuresCurrentInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? pluginFuturesMetadata.futuresHistoryInfo : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? pluginFuturesMetadata.displayType : futureCustomizeType.getValue()).getInJsonString());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, FutureCustomizeType futureCustomizeType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "current") ? "futures_position" : "historical_futures", true);
        eventParamsList.put("plugin_option_pnl", futureCustomizeType.getTrack(), true);
        eventParamsList.put("plugin_option_bot_share_parameters", "non_bot", true);
        eventParamsList.put("plugin_option_chart_interval", "non_chart", true);
        eventParamsList.put("plugin_option_chart_datapoint", "non_chart", true);
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void AEQbTJ(@NotNull java.lang.String str) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(C43284rmQ.KWHzl().parseToJsonElement(str)).get((java.lang.Object) "futuresType");
        final java.lang.String contentOrNull = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        C32866mlf.onEvent$default("Feeds_Btm_PluginCardDelete_Click", (TrackChannel[]) null, new Function1() { // from class: o.tCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45956tCm.OLrzqt(contentOrNull, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "current") ? "futures_position" : "historical_futures", true);
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void EZpvd(@NotNull final android.content.Context context, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWU twu) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(twu, "");
        try {
            twu.AEQbTJ(C45994tDx.Companion.OLrzqt(twu, new Function1() { // from class: o.tCt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45956tCm.EZpvd(this.KWHzl, context, fragmentManager, (tWW) obj);
                }
            }));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("FuturesPlanetPluginRegister", "Failed to create FutureQuicklyFragment shortcut", e);
            twu.copydefault("Failed to create shortcut: " + e.getMessage());
        }
    }

    public static final Unit EZpvd(C45956tCm c45956tCm, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, tWW tww) {
        Intrinsics.checkNotNullParameter(tww, "");
        c45956tCm.OLrzqt(context, fragmentManager, tww);
        return Unit.INSTANCE;
    }
}
