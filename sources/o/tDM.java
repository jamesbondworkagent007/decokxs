package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.spot.data.PluginSpotMetadata;
import com.okinc.planet.biz_plugin.spot.data.SpotCustomizeType;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import com.okinc.tradeshare.api.TradeAssetPlanetBean;
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
import o.tWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tDM implements tWX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final PlanetPublisherPluginType copydefault = PlanetPublisherPluginType.SPOT;

    @Override // o.tWX
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tWX
    public PlanetPublisherPluginType EZpvd() {
        return this.copydefault;
    }

    @Override // o.tWX
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.tWX
    public void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull tWU twu) {
        tWX.Activity.copydefault(this, context, fragmentManager, twu);
    }

    @Override // o.tWX
    public boolean KWHzl() {
        return tWX.Activity.AEQbTJ(this);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.tWX
    public java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.AYXKKw(C47501trL.Fragment.invokespecialhlXVux);
    }

    @Override // o.tWX
    public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fdazkH);
    }

    @Override // o.tWX
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        tWV twv;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        try {
            Result.Application application = Result.Companion;
            PluginSpotMetadata pluginSpotMetadataOLrzqt = PluginSpotMetadata.Companion.OLrzqt(str);
            TradeAssetPlanetBean spotInfo = pluginSpotMetadataOLrzqt.getSpotInfo();
            if (spotInfo != null) {
                PluginSpotMetadata pluginSpotMetadataCopy$default = PluginSpotMetadata.copy$default(pluginSpotMetadataOLrzqt, spotInfo.getTokenName(), null, spotInfo.getPnl(), spotInfo.getPnlRate(), null, null, null, 114, null);
                C46001tEd c46001tEd = new C46001tEd(context, null, 0, 6, null);
                c46001tEd.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                java.lang.String pluginDataTime = pluginSpotMetadataOLrzqt.getPluginDataTime();
                if (pluginDataTime == null) {
                    pluginDataTime = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                }
                java.lang.String str3 = pluginDataTime;
                java.util.List<TradeTickerChartEntry> chartTicker = pluginSpotMetadataCopy$default.getChartTicker();
                if (chartTicker == null) {
                    chartTicker = yDY.AhwBna();
                }
                SpotHoldingBean spotHoldingBean = new SpotHoldingBean(spotInfo, true, str3, (java.util.List) chartTicker, false, 16, (DefaultConstructorMarker) null);
                SpotCustomizeType.Companion companion = SpotCustomizeType.Companion;
                c46001tEd.AEQbTJ(spotHoldingBean, companion.EZpvd(pluginSpotMetadataCopy$default.getDisplayType()), planetPublisherPluginPreviewType);
                pUU.EZpvd("PlanetPluginMetaData", "spot=" + pluginSpotMetadataCopy$default.getInJsonString());
                java.lang.String deepLink = spotInfo.getDeepLink();
                if (deepLink != null) {
                    str2 = deepLink;
                }
                java.lang.String inJsonString = pluginSpotMetadataCopy$default.getInJsonString();
                java.lang.String pluginDataTime2 = pluginSpotMetadataOLrzqt.getPluginDataTime();
                if (pluginDataTime2 == null) {
                    pluginDataTime2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                }
                twv = new tWV(c46001tEd, str2, inJsonString, pluginDataTime2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("plugin_type", new C46511tXa("spot_position", true)), C56390yDp.OLrzqt("plugin_token", new C46511tXa(spotInfo.getTokenName(), false)), C56390yDp.OLrzqt("plugin_option_pnl", new C46511tXa(companion.EZpvd(pluginSpotMetadataCopy$default.getDisplayType()).getTrack(), true))));
            } else {
                android.view.View view = new android.view.View(context);
                java.lang.String inJsonString2 = pluginSpotMetadataOLrzqt.getInJsonString();
                java.lang.String pluginDataTime3 = pluginSpotMetadataOLrzqt.getPluginDataTime();
                if (pluginDataTime3 == null) {
                    pluginDataTime3 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                }
                twv = new tWV(view, "", inJsonString2, pluginDataTime3, null, 16, null);
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
            objM7377constructorimpl = Result.m7377constructorimpl(tDW.Companion.copydefault(fragmentManager, new Function1() { // from class: o.tDK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDM.KWHzl(tww, (SpotHoldingBean) obj);
                }
            }));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("SpotPlanetPluginRegister", "Failed to show SpotHoldingsSearchBottomSheet", thM7380exceptionOrNullimpl);
            tww.AEQbTJ(C33070mpX.AYXKKw(C47501trL.Fragment.profile));
        }
    }

    public static final Unit KWHzl(tWW tww, SpotHoldingBean spotHoldingBean) {
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        java.lang.String inJsonString = new PluginSpotMetadata((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, spotHoldingBean.getKlineList(), spotHoldingBean.getTradeAssetPlanetBean(), SpotCustomizeType.Spot_Customize_PnlPercent.getValue(), 15, (DefaultConstructorMarker) null).getInJsonString();
        pUU.EZpvd("zhouzhou", inJsonString);
        tww.copydefault(inJsonString);
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final tWW tww) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tww, "");
        JsonElement toJsonElement = C43284rmQ.KWHzl().parseToJsonElement(str);
        SpotCustomizeType.Companion companion = SpotCustomizeType.Companion;
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((java.lang.Object) "displayType");
        SpotCustomizeType spotCustomizeTypeEZpvd = companion.EZpvd((jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
        C32866mlf.onEvent$default("Feeds_Mid_PluginCardEdit_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDM.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        tDU.Companion.AEQbTJ(fragmentManager, spotCustomizeTypeEZpvd, new Function1() { // from class: o.tDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDM.OLrzqt(str, tww, (SpotCustomizeType) obj);
            }
        });
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "spot_position", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, tWW tww, final SpotCustomizeType spotCustomizeType) {
        Intrinsics.checkNotNullParameter(spotCustomizeType, "");
        C32866mlf.onEvent$default("Feeds_Btm_PluginCardEditConfirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDM.copydefault(spotCustomizeType, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        tww.copydefault(PluginSpotMetadata.copy$default((PluginSpotMetadata) C43284rmQ.KWHzl().decodeFromString(PluginSpotMetadata.Companion.serializer(), str), null, null, null, null, null, null, spotCustomizeType.getValue(), 63, null).getInJsonString());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SpotCustomizeType spotCustomizeType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "spot_position", true);
        eventParamsList.put("plugin_option_pnl", spotCustomizeType.getTrack(), true);
        eventParamsList.put("plugin_option_bot_share_parameters", "non_bot", true);
        eventParamsList.put("plugin_option_chart_interval", "non_chart", true);
        eventParamsList.put("plugin_option_chart_datapoint", "non_chart", true);
        return Unit.INSTANCE;
    }

    @Override // o.tWX
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Feeds_Btm_PluginCardDelete_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDM.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "spot_position", true);
        return Unit.INSTANCE;
    }
}
