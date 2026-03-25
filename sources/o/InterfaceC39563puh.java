package o;

import androidx.lifecycle.LifecycleOwner;
import com.google.gson.JsonObject;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.CompareCandlesItem;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.OptionCoolState;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.puh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC39563puh {

    /* JADX INFO: renamed from: o.puh$Application */
    public interface Application extends LifecycleOwner {
        void AEQbTJ(@NotNull MarketTopInfo marketTopInfo);

        void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList);

        void AYXKKw(@NotNull java.util.List<? extends oLY> list);

        void AhwBna(@NotNull java.util.List<? extends oLY> list);

        void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList);

        void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list);

        void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean);

        void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list);

        void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList);

        void KWHzl(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str);

        void ODXsMY();

        void OLrzqt(@NotNull DrawingDataBean drawingDataBean);

        void OLrzqt(@NotNull java.util.ArrayList<PriceWarningItemBean> arrayList);

        void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list);

        void RKDWNf();

        void copydefault(@NotNull java.util.ArrayList<MarketCoinInfo> arrayList);

        void copydefault(@NotNull java.util.List<? extends oLY> list);

        void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list);

        void gwTjWJ();

        void valueOf();

        void valueOf(@NotNull java.util.List<? extends oLY> list);

        void values(@NotNull java.lang.String str);

        /* JADX INFO: renamed from: o.puh$Application$Application, reason: collision with other inner class name */
        public static final class C0921Application {
            public static void EZpvd(@NotNull Application application) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull Application application, @NotNull KlineSpotAverageBean klineSpotAverageBean) {
                Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull Application application, @NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull Application application, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull Application application, @NotNull java.util.List<? extends oLY> list) {
                Intrinsics.checkNotNullParameter(list, "");
            }

            public static /* synthetic */ void uploadDrawingDataCallBack$default(Application application, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDrawingDataCallBack");
                }
                if ((i & 8) != 0) {
                    str = "0";
                }
                application.KWHzl(z, z2, z3, str);
            }
        }
    }

    /* JADX INFO: renamed from: o.puh$StateListAnimator */
    public interface StateListAnimator extends InterfaceC46879tfW {
        java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super KlineActiveListData> continuation);

        java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super java.util.ArrayList<KlineStartTimeVo>> continuation);

        void AEQbTJ();

        void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner);

        void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull JsonObject jsonObject, boolean z, boolean z2);

        void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

        void AEQbTJ(@NotNull MarketCoinInfo marketCoinInfo);

        void AEQbTJ(AbstractC54531xLw abstractC54531xLw);

        void EZpvd();

        void EZpvd(int i, @NotNull android.content.Context context);

        void EZpvd(@NotNull LifecycleOwner lifecycleOwner, int i, boolean z, boolean z2, Function1<? super java.lang.Boolean, Unit> function1);

        void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull KlineFormulaData klineFormulaData, int i, boolean z, Function1<? super java.lang.Boolean, Unit> function1);

        void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2);

        void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z);

        void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<IndicatorDataReq> arrayList);

        java.lang.Object KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull Continuation<? super java.util.ArrayList<OptionCoolState>> continuation);

        java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.util.ArrayList<KLineEventBean>> continuation);

        void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull IndicatorDataReq indicatorDataReq);

        void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

        void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, Function1<? super java.lang.String, Unit> function1);

        void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList, int i, boolean z, Function1<? super java.util.ArrayList<CompareCandlesItem>, Unit> function1);

        void KWHzl(@NotNull java.lang.String str);

        boolean KWHzl();

        void OLrzqt();

        void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, int i, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList);

        void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList, int i, @NotNull java.lang.String str);

        void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, boolean z);

        java.lang.Object copydefault(java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.Integer num, @NotNull Continuation<? super java.util.ArrayList<KlineFlashVo>> continuation);

        void copydefault();

        void copydefault(@NotNull LifecycleOwner lifecycleOwner);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, int i, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull JsonObject jsonObject, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Function1<? super java.lang.String, Unit> function1);

        void copydefault(@NotNull LifecycleOwner lifecycleOwner, boolean z);

        /* JADX INFO: renamed from: o.puh$StateListAnimator$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.puh$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void loadKline$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, int i, boolean z, boolean z2, Function1 function1, int i2, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadKline");
                }
                if ((i2 & 8) != 0) {
                    z2 = true;
                }
                boolean z3 = z2;
                if ((i2 & 16) != 0) {
                    function1 = null;
                }
                stateListAnimator.EZpvd(lifecycleOwner, i, z, z3, (Function1<? super java.lang.Boolean, Unit>) function1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.puh$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void loadFormulaKline$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, KlineFormulaData klineFormulaData, int i, boolean z, Function1 function1, int i2, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFormulaKline");
                }
                if ((i2 & 16) != 0) {
                    function1 = null;
                }
                stateListAnimator.EZpvd(lifecycleOwner, klineFormulaData, i, z, (Function1<? super java.lang.Boolean, Unit>) function1);
            }

            public static /* synthetic */ void loadCumulativeCost$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadCumulativeCost");
                }
                if ((i2 & 16) != 0) {
                    z = true;
                }
                stateListAnimator.EZpvd(lifecycleOwner, str, str2, i, z);
            }

            public static /* synthetic */ void loadTradePosition$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, boolean z, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTradePosition");
                }
                if ((i & 2) != 0) {
                    z = true;
                }
                stateListAnimator.copydefault(lifecycleOwner, z);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.puh$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void requestOriginData$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, java.lang.String str, JsonObject jsonObject, Function2 function2, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOriginData");
                }
                if ((i & 8) != 0) {
                    function2 = null;
                }
                stateListAnimator.copydefault(lifecycleOwner, str, jsonObject, (Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
            }

            public static /* synthetic */ void loadOpenOrder$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, boolean z, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadOpenOrder");
                }
                if ((i & 2) != 0) {
                    z = true;
                }
                stateListAnimator.OLrzqt(lifecycleOwner, z);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.puh$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void getHistoryMarketCandles$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Function1 function1, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryMarketCandles");
                }
                if ((i & 16) != 0) {
                    z = false;
                }
                boolean z2 = z;
                if ((i & 32) != 0) {
                    function1 = null;
                }
                stateListAnimator.copydefault(lifecycleOwner, str, str2, str3, z2, (Function1<? super java.lang.String, Unit>) function1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.puh$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void getRightHistoryMarketCandles$default(StateListAnimator stateListAnimator, LifecycleOwner lifecycleOwner, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRightHistoryMarketCandles");
                }
                if ((i & 16) != 0) {
                    function1 = null;
                }
                stateListAnimator.KWHzl(lifecycleOwner, str, str2, str3, (Function1<? super java.lang.String, Unit>) function1);
            }

            public static /* synthetic */ java.lang.Object getKlineActiveList$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
                if (obj == null) {
                    return stateListAnimator.AEQbTJ(str, str2, str3, str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? 20 : num2, continuation);
                }
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineActiveList");
            }

            public static /* synthetic */ java.lang.Object getKlineContentFlashData$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineContentFlashData");
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                java.lang.String str4 = str3;
                if ((i & 16) != 0) {
                    num = 20;
                }
                return stateListAnimator.copydefault(str, str2, z, str4, num, (Continuation<? super java.util.ArrayList<KlineFlashVo>>) continuation);
            }
        }
    }
}
