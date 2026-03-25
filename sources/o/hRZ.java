package o;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hRZ implements InterfaceC21944hSc {
    public static final hRZ OLrzqt = new hRZ();
    public static java.lang.String AEQbTJ = "";
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(int i) {
        if (i == 3) {
            return "3m";
        }
        if (i != 5) {
            if (i == -5) {
                return "5s";
            }
            if (i == 0) {
                return "1s";
            }
            if (i == 1) {
                return "1m";
            }
            switch (i) {
                case -30:
                    return "30s";
                case -15:
                    return "15s";
                case 5:
                    break;
                case 15:
                    return "15m";
                case 30:
                    return "30m";
                case 60:
                    return "1H";
                case 120:
                    return "2H";
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    return "4H";
                case 360:
                    return "6Hutc";
                case 720:
                    return "12Hutc";
                case 1440:
                    return "1Dutc";
                case 2880:
                    return "2Dutc";
                case 4320:
                    return "3Dutc";
                case 7200:
                    return "5Dutc";
                case 10080:
                    return "1Wutc";
                case 44640:
                    return "1Mutc";
                case 133920:
                    return "3Mutc";
                default:
                    return "";
            }
        }
        return "5m";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ = str;
    }

    private hRZ() {
    }

    @Override // o.InterfaceC21944hSc
    public void OLrzqt(@NotNull C36250oUv c36250oUv, pGY pgy, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(false);
            chartViewOutSideConfigAkhnZx.setHideTradeDrawingLine(false);
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
            if (z) {
                chartViewOutSideConfigAkhnZx.initKlineOffset(0.0f);
            }
            chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(C21952hSk.copydefault.AYXKKw());
        }
        c36250oUv.QOLQEE();
        android.content.Context context = c36250oUv.getContext();
        if (context != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx2 != null) {
                chartViewOutSideConfigAkhnZx2.setMPositiveColor(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx3 != null) {
                chartViewOutSideConfigAkhnZx3.setMNegativeColor(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null));
            }
        }
        c36250oUv.setPriceFractionDigits(4);
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx4 != null) {
            chartViewOutSideConfigAkhnZx4.setMMaxEfficientDigits(4);
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx5 != null) {
            chartViewOutSideConfigAkhnZx5.setAmountDisplaySymbol(str3);
        }
        c36250oUv.setCoinVol(0);
        c36250oUv.setFutures(false);
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        c36250oUv.setCurrentDataSource(OLrzqt(c36250oUv, str, str2));
        oUJ.KWHzl.OLrzqt(AEQbTJ, "SPOT");
        EZpvd(c36250oUv);
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx6 = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx6 != null) {
            java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
            if (num != null && num.intValue() == 0) {
                chartViewOutSideConfigAkhnZx6.setMOrdinateType(0);
            } else {
                chartViewOutSideConfigAkhnZx6.setMOrdinateType(1);
            }
            chartViewOutSideConfigAkhnZx6.setMCandlestickType(0);
            chartViewOutSideConfigAkhnZx6.setMChartPosition(SPUtils.getInt("chart_position", 1).intValue());
            chartViewOutSideConfigAkhnZx6.setMShowVolume(templateSettingWlaJM.hasVolumeIndicator());
            chartViewOutSideConfigAkhnZx6.setMKlineAbstractType(1);
            if (chartViewOutSideConfigAkhnZx6.getMShowVolume()) {
                c36250oUv.fZBcTu();
            }
        }
        copydefault(c36250oUv);
        if (templateSettingWlaJM.getMainIndicatorNames() != null && pgy != null) {
            pgy.setMainIndicatorSelect();
        }
        if (pgy != null) {
            java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
            pgy.setSideIndicators(sideIndicatorNames);
        }
        if (z) {
            c36250oUv.AwvSrB();
        }
    }

    public java.lang.String copydefault(@NotNull TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        java.lang.String timeKLine = timeIntervalItem.getTimeKLine();
        if (timeIntervalItem.timeInterval < 360) {
            return timeKLine;
        }
        return timeKLine + "utc";
    }

    public TimeIntervalItem KWHzl(int i) {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.lang.Object obj = null;
        if (interfaceC39509ptgDjBIcL == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null) {
            return null;
        }
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((TimeIntervalItem) next).timeInterval == i) {
                obj = next;
                break;
            }
        }
        return (TimeIntervalItem) obj;
    }

    public void EZpvd(C36250oUv c36250oUv) {
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                if (c36250oUv != null) {
                    c36250oUv.djBIcL("dark");
                    return;
                }
                return;
            } else {
                if (c36250oUv != null) {
                    c36250oUv.djBIcL("light");
                    return;
                }
                return;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (c36250oUv != null) {
                c36250oUv.djBIcL("dark");
            }
        } else if (c36250oUv != null) {
            c36250oUv.djBIcL("light");
        }
    }

    public void AEQbTJ(C36250oUv c36250oUv) {
        int iEZpvd = C33492mxV.EZpvd();
        AppCompatDelegate.setDefaultNightMode(iEZpvd);
        if (iEZpvd != -1) {
            if (iEZpvd != 1) {
                if (iEZpvd == 2 && c36250oUv != null) {
                    c36250oUv.djBIcL("dark");
                }
            } else if (c36250oUv != null) {
                c36250oUv.djBIcL("light");
            }
        } else if (C33492mxV.OLrzqt()) {
            if (c36250oUv != null) {
                c36250oUv.djBIcL("dark");
            }
        } else if (c36250oUv != null) {
            c36250oUv.djBIcL("light");
        }
        OLrzqt(c36250oUv);
    }

    public final void copydefault(C36250oUv c36250oUv) {
        TemplateSetting templateSettingWlaJM;
        java.util.HashMap<java.lang.String, oWN> timelines;
        oWN own;
        if (c36250oUv == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        if (templateSettingWlaJM.getSPTimeInterval() < 0 && templateSettingWlaJM.getSPTimeInterval() > -5) {
            c36250oUv.setChartStyle(1);
            return;
        }
        int timelineScale = templateSettingWlaJM.getTimelineScale();
        int i = oWN.AEQbTJ;
        if (timelineScale < i) {
            if (c36250oUv.AkhnZx().isColumnChart()) {
                ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
                if (chartViewOutSideConfigAkhnZx != null && (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) != null && (own = timelines.get(c36250oUv.fIwbmz())) != null) {
                    own.OLrzqt(i);
                }
                c36250oUv.setChartStyle(0);
                return;
            }
            c36250oUv.setChartStyle(2);
            return;
        }
        c36250oUv.setChartStyle(0);
    }

    public final void KWHzl(@NotNull C36250oUv c36250oUv, @NotNull MarketTypeSelect marketTypeSelect, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (marketTypeSelect.getGroup() == 0) {
            boolean z = (templateSettingWlaJM.getSPTimeInterval() == -1 || templateSettingWlaJM.getSPTimeInterval() == -2) ? false : true;
            if (marketTypeSelect.isSelect()) {
                if (z) {
                    c36250oUv.setMainIndicator(marketTypeSelect.getSelectTypeName());
                    return;
                }
                return;
            } else if (z && Intrinsics.EZpvd((java.lang.Object) marketTypeSelect.getSelectTypeName(), (java.lang.Object) "VOLUME")) {
                c36250oUv.dNCPSb();
                return;
            } else {
                c36250oUv.OLrzqt(marketTypeSelect.getSelectTypeName());
                return;
            }
        }
        if (marketTypeSelect.isSelect()) {
            int size = templateSettingWlaJM.getSideIndicatorNames().size();
            templateSettingWlaJM.addSideIndicator(marketTypeSelect.getSelectTypeName());
            c36250oUv.copydefault(marketTypeSelect.getSelectTypeName());
            if (size < 4) {
                function1.invoke(java.lang.Integer.valueOf(C36246oUr.copydefault().accept()));
                c36250oUv.setMinimumHeight(c36250oUv.getMinimumHeight() + C36246oUr.copydefault().accept());
                return;
            }
            return;
        }
        templateSettingWlaJM.removeSideIndicator(marketTypeSelect.getSelectTypeName());
        c36250oUv.gEmmrt(marketTypeSelect.getSelectTypeName());
        function1.invoke(java.lang.Integer.valueOf(-C36246oUr.copydefault().accept()));
        c36250oUv.setMinimumHeight(c36250oUv.getMinimumHeight() - C36246oUr.copydefault().accept());
    }

    public final void copydefault(@NotNull C36250oUv c36250oUv, @NotNull MarketTypeSelect marketTypeSelect, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        Intrinsics.checkNotNullParameter(function0, "");
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        boolean z = (templateSettingWlaJM.getSPTimeInterval() == -1 || templateSettingWlaJM.getSPTimeInterval() == -2) ? false : true;
        if (marketTypeSelect.getGroup() == 0) {
            if (z) {
                c36250oUv.setMainIndicator(marketTypeSelect.getSelectTypeName());
                return;
            }
            return;
        }
        if (marketTypeSelect.isSelect()) {
            templateSettingWlaJM.addSideIndicator(marketTypeSelect.getSelectTypeName());
            c36250oUv.copydefault(marketTypeSelect.getSelectTypeName());
            int size = templateSettingWlaJM.getSideIndicatorNames().size();
            if (size > 1) {
                if (size < 4) {
                    c36250oUv.setMinimumHeight(c36250oUv.getMinimumHeight() + C36246oUr.copydefault().aKErDB());
                } else if (size == 4) {
                    c36250oUv.setMinimumHeight(i + (C36246oUr.copydefault().aKErDB() * 3));
                }
                function0.invoke();
                return;
            }
            c36250oUv.setMinimumHeight(i);
            return;
        }
        templateSettingWlaJM.removeSideIndicator(marketTypeSelect.getSelectTypeName());
        c36250oUv.gEmmrt(marketTypeSelect.getSelectTypeName());
        if (templateSettingWlaJM.getSideIndicatorNames().size() > 1) {
            c36250oUv.setMinimumHeight(c36250oUv.getMinimumHeight() - C36246oUr.copydefault().aKErDB());
            function0.invoke();
        } else {
            c36250oUv.setMinimumHeight(i);
        }
    }

    public final void OLrzqt(C36250oUv c36250oUv) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        if (c36250oUv != null) {
            c36250oUv.invalidate();
        }
    }

    public final void KWHzl(C36250oUv c36250oUv, @NotNull java.lang.String str, C36312oXc c36312oXc) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        com.okinc.kline.library.data.DataSource dataSource;
        Intrinsics.checkNotNullParameter(str, "");
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null && (dataSource = mapEjfBZ.get(c36250oUv.fIwbmz())) != null) {
            dataSource.KWHzl();
        }
        if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null) {
            c36312oXc.EZpvd(c36312oXc.zLjUOn);
        }
        if (c36250oUv != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx2 != null) {
                chartViewOutSideConfigAkhnZx2.setMKlineCurrentOffset(chartViewOutSideConfigAkhnZx2.getMKlineInitOffset());
                chartViewOutSideConfigAkhnZx2.setMKlineLastOffset(chartViewOutSideConfigAkhnZx2.getMKlineInitOffset());
            }
            c36250oUv.setCurrentDataSource(str);
        }
    }

    public final void OLrzqt(C36250oUv c36250oUv, C36312oXc c36312oXc, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        com.okinc.kline.library.data.DataSource dataSource;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null && (dataSource = mapEjfBZ.get(c36250oUv.fIwbmz())) != null) {
            dataSource.KWHzl();
        }
        if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null) {
            c36312oXc.EZpvd(c36312oXc.zLjUOn);
        }
        if (c36250oUv != null) {
            c36250oUv.setCurrentDataSource(OLrzqt(c36250oUv, str, str2));
        }
    }

    public final java.lang.String OLrzqt(C36250oUv c36250oUv, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "dex_market_kline_tag" + str + str2 + JwtUtilsKt.JWT_DELIMITER + ((c36250oUv == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? null : java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()));
    }

    public final void OLrzqt(C36250oUv c36250oUv, @NotNull TimeIntervalItem timeIntervalItem, C36312oXc c36312oXc, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (c36250oUv != null) {
            c36250oUv.RcXXUw();
            TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
            Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
            int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
            int i = timeIntervalItem.timeInterval;
            if (sPTimeInterval == i) {
                return;
            }
            templateSettingWlaJM.putTimeInterval(i);
            hRZ hrz = OLrzqt;
            hrz.KWHzl(c36250oUv, hrz.OLrzqt(c36250oUv, str, str2), c36312oXc);
            c36250oUv.setCurrentDataSource(hrz.OLrzqt(c36250oUv, str, str2));
            if (templateSettingWlaJM.getSPTimeInterval() < 0 && templateSettingWlaJM.getSPTimeInterval() > -5) {
                c36250oUv.setChartStyle(1);
            } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
                c36250oUv.setChartStyle(2);
            } else {
                c36250oUv.setChartStyle(0);
            }
        }
    }

    public final void EZpvd(@NotNull C36250oUv c36250oUv, @NotNull TimeIntervalItem timeIntervalItem, C36312oXc c36312oXc, pGX pgx, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        c36250oUv.RcXXUw();
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        int i = timeIntervalItem.timeInterval;
        if (sPTimeInterval == i) {
            return;
        }
        templateSettingWlaJM.putTimeInterval(i);
        function0.invoke();
        OLrzqt(c36250oUv, c36312oXc, str, str2);
        c36250oUv.setCurrentDataSource(OLrzqt(c36250oUv, str, str2));
        if (templateSettingWlaJM.getSPTimeInterval() < 0 && templateSettingWlaJM.getSPTimeInterval() > -5) {
            c36250oUv.setChartStyle(1);
        } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
            c36250oUv.setChartStyle(2);
        } else {
            c36250oUv.setChartStyle(0);
        }
        c36250oUv.wlaJM().putTimeInterval(timeIntervalItem.timeInterval);
        if (pgx != null) {
            pgx.setData();
        }
        function02.invoke();
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, final C36250oUv c36250oUv, final pGX pgx, final C36312oXc c36312oXc, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, @NotNull final Function1<? super TimeIntervalItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35979oKu interfaceC35979oKuAEQbTJ = ((oKA) C43251rlk.copydefault(oKA.class)).AEQbTJ(z);
        interfaceC35979oKuAEQbTJ.OLrzqt(new Function1() { // from class: o.hSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hRZ.OLrzqt(c36250oUv, function1, pgx, z, c36312oXc, str, str2, (MarketTypeSelect) obj);
            }
        });
        interfaceC35979oKuAEQbTJ.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.hSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                hRZ.EZpvd(pgx, z, dialogInterface);
            }
        });
        java.lang.String simpleName = hQM.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        interfaceC35979oKuAEQbTJ.EZpvd(fragmentManager, simpleName);
    }

    public static final Unit OLrzqt(C36250oUv c36250oUv, Function1 function1, pGX pgx, boolean z, C36312oXc c36312oXc, java.lang.String str, java.lang.String str2, MarketTypeSelect marketTypeSelect) {
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        java.lang.Object data = marketTypeSelect.getData();
        TimeIntervalItem timeIntervalItem = data instanceof TimeIntervalItem ? (TimeIntervalItem) data : null;
        if (timeIntervalItem != null) {
            if (c36250oUv != null) {
                OLrzqt.OLrzqt(c36250oUv, timeIntervalItem, c36312oXc, str, str2);
            }
            function1.invoke(timeIntervalItem);
            if (c36250oUv != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
            }
            if (pgx != null) {
                pgx.setData(z);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(pGX pgx, boolean z, android.content.DialogInterface dialogInterface) {
        if (pgx != null) {
            pgx.setData(z);
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, final C36250oUv c36250oUv, final pGX pgx, final pGY pgy, final boolean z, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC35973oKo interfaceC35973oKoCopydefault = (c36250oUv == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null || templateSettingWlaJM.getSideIndicatorNames() == null) ? null : ((oKA) C43251rlk.copydefault(oKA.class)).copydefault();
        if (interfaceC35973oKoCopydefault != null) {
            interfaceC35973oKoCopydefault.AEQbTJ(new Function1() { // from class: o.hSb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hRZ.KWHzl(c36250oUv, function1, pgy, (MarketTypeSelect) obj);
                }
            });
        }
        if (interfaceC35973oKoCopydefault != null) {
            interfaceC35973oKoCopydefault.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.hSa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    hRZ.OLrzqt(pgx, z, dialogInterface);
                }
            });
        }
        if (interfaceC35973oKoCopydefault != null) {
            java.lang.String simpleName = hQM.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            interfaceC35973oKoCopydefault.EZpvd(fragmentManager, simpleName);
        }
    }

    public static final Unit KWHzl(C36250oUv c36250oUv, Function1 function1, pGY pgy, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        OLrzqt.KWHzl(c36250oUv, marketTypeSelect, (Function1<? super java.lang.Integer, Unit>) function1);
        if (marketTypeSelect.getGroup() != 0) {
            java.util.ArrayList<java.lang.String> sideIndicatorNames = c36250oUv.wlaJM().getSideIndicatorNames();
            if (sideIndicatorNames != null && pgy != null) {
                pgy.setSideIndicators(sideIndicatorNames);
            }
        } else if (pgy != null) {
            pgy.setMainIndicatorSelect();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(pGX pgx, boolean z, android.content.DialogInterface dialogInterface) {
        if (pgx != null) {
            pgx.setData(z);
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
