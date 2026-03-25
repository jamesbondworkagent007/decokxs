package o;

import android.view.View;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.PositionAddTpslBean;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.unify_trade.calculator.tpslprofit.SpTips;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37928pFx {
    public final java.lang.String KWHzl = "OKKLINE";
    public final java.lang.String EZpvd = "buy";

    public final void EZpvd(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final KlineOpenOrderBean klineOpenOrderBean, @NotNull final TradeAllOrderApi tradeAllOrderApi, final boolean z, final boolean z2, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        TradeAllOrderApi tradeAllOrderApiUpdateOriginOrderData$default;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineOpenOrderBean.getPrice()) && C33129mqd.valueOf(klineOpenOrderBean.getPrice(), 0)) {
            function1.invoke(1);
            if (z) {
                EZpvd(klineOpenOrderBean, tradeAllOrderApi);
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.fVjYLc), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                return;
            }
            if (z2) {
                OLrzqt(klineOpenOrderBean, tradeAllOrderApi);
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.fVjYLc), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Limit")) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.fVjYLc), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.QnnRaN), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            }
            AEQbTJ(klineOpenOrderBean, tradeAllOrderApi);
            return;
        }
        TradeAllOrderApi tradeAllOrderApi2 = (TradeAllOrderApi) C37881pEd.copydefault(tradeAllOrderApi);
        if (z) {
            tradeAllOrderApiUpdateOriginOrderData$default = KWHzl(klineOpenOrderBean, tradeAllOrderApi);
        } else if (z2) {
            tradeAllOrderApiUpdateOriginOrderData$default = copydefault(klineOpenOrderBean, tradeAllOrderApi);
        } else {
            tradeAllOrderApiUpdateOriginOrderData$default = updateOriginOrderData$default(this, klineOpenOrderBean, tradeAllOrderApi, false, 4, null);
        }
        TradeAllOrderApi tradeAllOrderApi3 = tradeAllOrderApiUpdateOriginOrderData$default;
        if (tradeAllOrderApi3 != null) {
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(context, fragmentManager, tradeAllOrderApi3, tradeAllOrderApi2, new Function1() { // from class: o.pFB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37928pFx.EZpvd(z, z2, this, klineOpenOrderBean, tradeAllOrderApi, function1, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(boolean z, boolean z2, C37928pFx c37928pFx, KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi, Function1 function1, int i) {
        if (z || z2) {
            c37928pFx.OLrzqt(i);
        } else {
            c37928pFx.EZpvd(i);
        }
        if (i != 2) {
            if (z) {
                c37928pFx.EZpvd(klineOpenOrderBean, tradeAllOrderApi);
            } else if (z2) {
                c37928pFx.OLrzqt(klineOpenOrderBean, tradeAllOrderApi);
            } else {
                c37928pFx.AEQbTJ(klineOpenOrderBean, tradeAllOrderApi);
            }
        }
        function1.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.lang.Object next;
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        java.util.Iterator<T> it = listGasjUx.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((KlineOpenOrderBean) next).isCopyOrder()) {
                    break;
                }
            }
        }
        KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) next;
        if (klineOpenOrderBean != null) {
            C36246oUr.copydefault().gasjUx().remove(klineOpenOrderBean);
        }
    }

    public final void OLrzqt(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi) {
        try {
            EZpvd(klineOpenOrderBean);
            copydefault(tradeAllOrderApi);
            C36246oUr.copydefault().gasjUx().get(klineOpenOrderBean.getOriginPos()).setHaveSL(false);
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "SLOrderDragFailed-->" + e.getMessage());
        }
    }

    public final void EZpvd(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi) {
        try {
            EZpvd(klineOpenOrderBean);
            OLrzqt(tradeAllOrderApi);
            C36246oUr.copydefault().gasjUx().get(klineOpenOrderBean.getOriginPos()).setHaveTP(false);
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "TPOrderDragFailed-->" + e.getMessage());
        }
    }

    public final void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi) {
        klineOpenOrderBean.setPrice(klineOpenOrderBean.getOldPrice());
        KWHzl(klineOpenOrderBean, tradeAllOrderApi, true);
        klineOpenOrderBean.setShowDragCircle(false);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull final KlineOpenOrderBean klineOpenOrderBean, @NotNull final TradeAllOrderApi tradeAllOrderApi, @NotNull final java.lang.Object obj, @NotNull final android.app.Activity activity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C35964oKf.Fragment.Dfv);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.fGT), new View.OnClickListener() { // from class: o.pFG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C37928pFx.OLrzqt(this.EZpvd, klineOpenOrderBean, tradeAllOrderApi, obj, activity, viewOnClickListenerC54939xaY, function1, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.QUSxYX), (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        } catch (java.lang.Exception e) {
            pUU.copydefault("showCancelOrderDialog 显示撤销订单弹框", java.lang.String.valueOf(e.getMessage()));
        }
    }

    public static final void OLrzqt(C37928pFx c37928pFx, KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi, java.lang.Object obj, android.app.Activity activity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final Function1 function1, android.view.View view) {
        c37928pFx.EZpvd(klineOpenOrderBean, tradeAllOrderApi, obj, activity, new Function1() { // from class: o.pFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C37928pFx.copydefault(function1, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit copydefault(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull KlineOpenOrderBean klineOpenOrderBean, @NotNull TradeAllOrderApi tradeAllOrderApi, @NotNull java.lang.Object obj, @NotNull android.app.Activity activity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (klineOpenOrderBean.isMainOrder()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrtType(), (java.lang.Object) "oco") && !Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderInstType(), (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderInstType(), (java.lang.Object) "MARGIN")) {
                if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
                    ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).OLrzqt((BizTradeStrategyInfo) tradeAllOrderApi, new Function2() { // from class: o.pFK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return C37928pFx.AkhnZx(this.AEQbTJ, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                        }
                    });
                    return;
                } else {
                    ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).AEQbTJ((BizTradeStrategyInfo) tradeAllOrderApi, new Function2() { // from class: o.pFM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return C37928pFx.DbNXlk(this.copydefault, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                        }
                    });
                    return;
                }
            }
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).AEQbTJ(tradeAllOrderApi, obj, new Function2() { // from class: o.pFv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C37928pFx.AYXKKw(this.copydefault, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            }, activity);
            return;
        }
        TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
        if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
            if (new C37928pFx().AEQbTJ(tradeOrderData)) {
                ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).OLrzqt(tradeOrderData, new Function2() { // from class: o.pFC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return C37928pFx.djBIcL(this.copydefault, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                    }
                });
                return;
            } else {
                ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).AEQbTJ(tradeOrderData, new Function2() { // from class: o.pFz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return C37928pFx.AhwBna(this.AEQbTJ, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                    }
                });
                return;
            }
        }
        if (new C37928pFx().AEQbTJ(tradeOrderData)) {
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(tradeOrderData, new Function2() { // from class: o.pFA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C37928pFx.isConnected(this.KWHzl, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            });
        } else {
            ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).copydefault(tradeOrderData, new Function2() { // from class: o.pFy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C37928pFx.values(this.KWHzl, function1, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            });
        }
    }

    public static final Unit AkhnZx(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit values(C37928pFx c37928pFx, Function1 function1, boolean z, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        c37928pFx.copydefault(z, str);
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showClosePositionDialog$default(C37928pFx c37928pFx, TradePositionManager.PositionItem positionItem, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c37928pFx.AEQbTJ(positionItem, fragmentManager, str, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public final void AEQbTJ(@NotNull TradePositionManager.PositionItem positionItem, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(positionItem, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(fragmentManager, positionItem, "", str, new Function1() { // from class: o.pFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37928pFx.KWHzl(function1, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TradePositionManager.PositionItem positionItem, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(positionItem, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(fragmentManager, context, positionItem, new Function1() { // from class: o.pFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37928pFx.OLrzqt((StrategyMoveOrderReq) obj);
            }
        }, new Function0() { // from class: o.pFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37928pFx.KWHzl();
            }
        }, new Function1() { // from class: o.pFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37928pFx.copydefault(function1, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit OLrzqt(StrategyMoveOrderReq strategyMoveOrderReq) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull final KlineOpenOrderBean klineOpenOrderBean, @NotNull TradePositionManager.PositionItem positionItem, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        PositionAddTpslBean positionAddTpslBean;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(positionItem, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineOpenOrderBean.getPrice()) && C33129mqd.valueOf(klineOpenOrderBean.getPrice(), 0)) {
            function1.invoke(1);
            EZpvd(klineOpenOrderBean);
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.fVjYLc), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (z) {
            java.lang.String price = klineOpenOrderBean.getPrice();
            java.lang.String price2 = klineOpenOrderBean.getPrice();
            positionAddTpslBean = new PositionAddTpslBean(price, "", "", price2 == null || price2.length() == 0);
        } else {
            java.lang.String price3 = klineOpenOrderBean.getPrice();
            java.lang.String price4 = klineOpenOrderBean.getPrice();
            positionAddTpslBean = new PositionAddTpslBean("", price3, "", price4 == null || price4.length() == 0);
        }
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragmentManager, positionItem, positionAddTpslBean, new Function1() { // from class: o.pFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37928pFx.copydefault(function1, this, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit copydefault(Function1 function1, C37928pFx c37928pFx, KlineOpenOrderBean klineOpenOrderBean, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        c37928pFx.OLrzqt(i);
        c37928pFx.EZpvd(klineOpenOrderBean);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull BizInstrument bizInstrument, @NotNull final KlineOpenOrderBean klineOpenOrderBean, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull TradeType tradeType, final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineOpenOrderBean.getPrice()) && C33129mqd.valueOf(klineOpenOrderBean.getPrice(), 0)) {
            if (function1 != null) {
                function1.invoke(1);
            }
            EZpvd(klineOpenOrderBean);
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C35964oKf.Fragment.fVjYLc), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).EZpvd(fragmentManager, bizInstrument, str, str2, str3, str4, tradeType, new Function1() { // from class: o.pFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37928pFx.EZpvd(function1, this, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, C37928pFx c37928pFx, KlineOpenOrderBean klineOpenOrderBean, int i) {
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        c37928pFx.OLrzqt(i);
        c37928pFx.EZpvd(klineOpenOrderBean);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeType tradeType, Function1<? super java.lang.Integer, Unit> function1, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        ((InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class)).KWHzl(fragmentManager, bizInstrument, str, str2, tradeType, function1, z);
    }

    public final void copydefault(boolean z, java.lang.String str) {
        if (z) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.OqhRBMiKdSzF), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    public final void EZpvd(int i) {
        if (i == 2) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.DpxfQh), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    public final void OLrzqt(int i) {
        if (i == 2) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.dNxZaP), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    public final void EZpvd(KlineOpenOrderBean klineOpenOrderBean) {
        C36246oUr.copydefault().gasjUx().remove(klineOpenOrderBean);
    }

    public final void EZpvd(boolean z, TradeOrderStopParam tradeOrderStopParam, KlineOpenOrderBean klineOpenOrderBean) {
        if (z) {
            tradeOrderStopParam.setTpTriggerPx(klineOpenOrderBean.getUPrice());
            tradeOrderStopParam.setTpOrdPx(MultiTransferSignData.DEFAULT_INTERVAL);
        } else {
            tradeOrderStopParam.setSlTriggerPx(klineOpenOrderBean.getUPrice());
            tradeOrderStopParam.setSlOrdPx(MultiTransferSignData.DEFAULT_INTERVAL);
        }
        tradeOrderStopParam.setTpOrdKind("condition");
    }

    public final void OLrzqt(TradeAllOrderApi tradeAllOrderApi) {
        try {
            Intrinsics.copydefault(tradeAllOrderApi, "");
            TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
            if (C33129mqd.KWHzl((java.util.Collection) tradeOrderData.getAttachAlgoOrds())) {
                java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
                Intrinsics.copydefault(attachAlgoOrds);
                TradeOrderStopParam tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AuCTelauCTel(attachAlgoOrds);
                tradeOrderStopParam.setTpTriggerPx(null);
                tradeOrderStopParam.setTpOrdPx(null);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("refreshOrderDataTPCancel TP拖拽取消", java.lang.String.valueOf(e.getMessage()));
        }
    }

    public final void copydefault(TradeAllOrderApi tradeAllOrderApi) {
        try {
            Intrinsics.copydefault(tradeAllOrderApi, "");
            TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
            if (C33129mqd.KWHzl((java.util.Collection) tradeOrderData.getAttachAlgoOrds())) {
                java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
                Intrinsics.copydefault(attachAlgoOrds);
                TradeOrderStopParam tradeOrderStopParam = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AuCTelauCTel(attachAlgoOrds);
                tradeOrderStopParam.setSlTriggerPx(null);
                tradeOrderStopParam.setSlOrdPx(null);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("refreshOrderDataSLCancel SL拖拽取消", java.lang.String.valueOf(e.getMessage()));
        }
    }

    public static /* synthetic */ TradeAllOrderApi updateOriginOrderData$default(C37928pFx c37928pFx, KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c37928pFx.KWHzl(klineOpenOrderBean, tradeAllOrderApi, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0187 */
    /* JADX DEBUG: Type inference failed for r0v16. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r0v22. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.okinc.unify_trade.biz.subscribe.TradeOrderData] */
    public final TradeAllOrderApi KWHzl(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi, boolean z) {
        java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds;
        try {
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrtType(), (java.lang.Object) "oco") || Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrtType(), (java.lang.Object) "conditional") || Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrtType(), (java.lang.Object) "move_order_stop") || Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrtType(), (java.lang.Object) "trigger")) {
                Intrinsics.copydefault((java.lang.Object) tradeAllOrderApi, "");
                tradeAllOrderApi = (TradeStrategyOrderData) tradeAllOrderApi;
                if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
                    tradeAllOrderApi.setTpTriggerPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                } else {
                    tradeAllOrderApi.setSlTriggerPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                }
            } else {
                Intrinsics.copydefault((java.lang.Object) tradeAllOrderApi, "");
                tradeAllOrderApi = (TradeOrderData) tradeAllOrderApi;
                if (klineOpenOrderBean.isMainOrder()) {
                    tradeAllOrderApi.setPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                } else if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
                    java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds2 = tradeAllOrderApi.getAttachAlgoOrds();
                    if (attachAlgoOrds2 != null) {
                        for (TradeOrderStopParam tradeOrderStopParam : attachAlgoOrds2) {
                            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getAttachAlgoId(), (java.lang.Object) klineOpenOrderBean.getAttachAlgoId())) {
                                pUU.KWHzl(this.KWHzl, "updateOriginOrderData--> isReset = " + z + " tradeOrderData.tpOrdKind = " + tradeOrderStopParam.getTpOrdKind() + " dragOrderBean.uPrice = " + klineOpenOrderBean.getUPrice() + " dragOrderBean.oldPrice = " + klineOpenOrderBean.getOldPrice() + " ");
                                if (Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam.getTpOrdKind(), (java.lang.Object) "limit")) {
                                    tradeOrderStopParam.setTpOrdPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                                } else {
                                    tradeOrderStopParam.setTpTriggerPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                                }
                            }
                        }
                    }
                } else if ((Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Limit")) && (attachAlgoOrds = tradeAllOrderApi.getAttachAlgoOrds()) != null) {
                    for (TradeOrderStopParam tradeOrderStopParam2 : attachAlgoOrds) {
                        if (Intrinsics.EZpvd((java.lang.Object) tradeOrderStopParam2.getAttachAlgoId(), (java.lang.Object) klineOpenOrderBean.getAttachAlgoId())) {
                            tradeOrderStopParam2.setSlTriggerPx(z ? klineOpenOrderBean.getOldPrice() : klineOpenOrderBean.getUPrice());
                        }
                    }
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("updateOriginOrderData 更新原始订单数据--", java.lang.String.valueOf(e.getMessage()));
        }
        return tradeAllOrderApi;
    }

    public final TradeOrderData copydefault(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi) {
        TradeOrderData tradeOrderData;
        try {
            Intrinsics.copydefault(tradeAllOrderApi, "");
            tradeOrderData = (TradeOrderData) tradeAllOrderApi;
            try {
                java.util.ArrayList<TradeOrderStopParam> arrayList = new java.util.ArrayList<>();
                java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
                if (attachAlgoOrds == null || attachAlgoOrds.isEmpty()) {
                    TradeOrderStopParam tradeOrderStopParam = new TradeOrderStopParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 65535, (DefaultConstructorMarker) null);
                    try {
                        EZpvd(false, tradeOrderStopParam, klineOpenOrderBean);
                        arrayList.add(tradeOrderStopParam);
                        tradeOrderData.setAttachAlgoOrds(arrayList);
                    } catch (java.lang.Exception e) {
                        e = e;
                        pUU.copydefault("updateOriginOrderDataByTP TP拖拽--更新原始订单数据", java.lang.String.valueOf(e.getMessage()));
                    }
                } else {
                    java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds2 = tradeOrderData.getAttachAlgoOrds();
                    Intrinsics.copydefault(attachAlgoOrds2);
                    TradeOrderStopParam tradeOrderStopParam2 = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AuCTelauCTel(attachAlgoOrds2);
                    tradeOrderStopParam2.setSlTriggerPx(klineOpenOrderBean.getUPrice());
                    tradeOrderStopParam2.setSlOrdPx(MultiTransferSignData.DEFAULT_INTERVAL);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            tradeOrderData = null;
        }
        return tradeOrderData;
    }

    public final TradeOrderData KWHzl(KlineOpenOrderBean klineOpenOrderBean, TradeAllOrderApi tradeAllOrderApi) {
        TradeOrderData tradeOrderData;
        try {
            Intrinsics.copydefault(tradeAllOrderApi, "");
            tradeOrderData = (TradeOrderData) tradeAllOrderApi;
            try {
                java.util.ArrayList<TradeOrderStopParam> arrayList = new java.util.ArrayList<>();
                java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
                if (attachAlgoOrds == null || attachAlgoOrds.isEmpty()) {
                    TradeOrderStopParam tradeOrderStopParam = new TradeOrderStopParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 65535, (DefaultConstructorMarker) null);
                    try {
                        EZpvd(true, tradeOrderStopParam, klineOpenOrderBean);
                        arrayList.add(tradeOrderStopParam);
                        tradeOrderData.setAttachAlgoOrds(arrayList);
                    } catch (java.lang.Exception e) {
                        e = e;
                        pUU.copydefault("updateOriginOrderDataByTP TP拖拽--更新原始订单数据", java.lang.String.valueOf(e.getMessage()));
                    }
                } else {
                    java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds2 = tradeOrderData.getAttachAlgoOrds();
                    Intrinsics.copydefault(attachAlgoOrds2);
                    TradeOrderStopParam tradeOrderStopParam2 = (TradeOrderStopParam) CollectionsKt___CollectionsKt.AuCTelauCTel(attachAlgoOrds2);
                    tradeOrderStopParam2.setTpTriggerPx(klineOpenOrderBean.getUPrice());
                    tradeOrderStopParam2.setTpOrdPx(MultiTransferSignData.DEFAULT_INTERVAL);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            tradeOrderData = null;
        }
        return tradeOrderData;
    }

    public final boolean AEQbTJ(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        if (C33129mqd.KWHzl((java.util.Collection) tradeOrderData.getAttachAlgoOrds())) {
            java.util.ArrayList<TradeOrderStopParam> attachAlgoOrds = tradeOrderData.getAttachAlgoOrds();
            Intrinsics.copydefault(attachAlgoOrds);
            if (attachAlgoOrds.size() > 1) {
                return true;
            }
        }
        return false;
    }

    public final void OLrzqt(@NotNull KlineOpenOrderBean klineOpenOrderBean, @NotNull InterfaceC55726xpQ interfaceC55726xpQ, @NotNull java.lang.String str, boolean z) {
        java.lang.String strKWHzl;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strKWHzl2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(interfaceC55726xpQ, "");
        Intrinsics.checkNotNullParameter(str, "");
        C56115xwi c56115xwi = new C56115xwi();
        java.lang.String orderInstType = interfaceC55726xpQ.getOrderInstType();
        java.lang.String orderInstId = interfaceC55726xpQ.getOrderInstId();
        java.lang.String strKWHzl3 = KWHzl(interfaceC55726xpQ);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(interfaceC55726xpQ.getOrderInstType())) == null || (strKWHzl = KWHzl(abstractC54531xLwOLrzqt2, interfaceC55726xpQ.getOrderInstId(), klineOpenOrderBean.getPrice())) == null) {
            strKWHzl = "";
        }
        java.lang.String amountNoSign = klineOpenOrderBean.isMultipleOrder() ? klineOpenOrderBean.getAmountNoSign() : copydefault(interfaceC55726xpQ);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        SpTips spTipsEZpvd = c56115xwi.EZpvd(orderInstType, orderInstId, "limit", strKWHzl3, strKWHzl, amountNoSign, (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(interfaceC55726xpQ.getOrderInstType())) == null || (strKWHzl2 = KWHzl(abstractC54531xLwOLrzqt, interfaceC55726xpQ.getOrderInstId(), str)) == null) ? "" : strKWHzl2, true, interfaceC55726xpQ.getOrderTdMode(), false, OLrzqt(interfaceC55726xpQ), null, null, null, (131072 & 16384) != 0 ? null : AEQbTJ(interfaceC55726xpQ), (32768 & 131072) != 0 ? false : z, (65536 & 131072) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE, (131072 & 131072) != 0 ? "" : null);
        java.lang.String pnl = spTipsEZpvd.getPnl();
        if (pnl == null) {
            pnl = "";
        }
        klineOpenOrderBean.setPnl(pnl);
        java.lang.String pnlRatio = spTipsEZpvd.getPnlRatio();
        klineOpenOrderBean.setPnlRatio(pnlRatio != null ? pnlRatio : "");
    }

    public final java.lang.String AEQbTJ(InterfaceC55726xpQ interfaceC55726xpQ) {
        if (interfaceC55726xpQ instanceof TradeOrderData) {
            return ((TradeOrderData) interfaceC55726xpQ).getLever();
        }
        return interfaceC55726xpQ instanceof BizTradeStrategyInfo ? interfaceC55726xpQ.getOrderLever() : "";
    }

    public final java.lang.String OLrzqt(InterfaceC55726xpQ interfaceC55726xpQ) {
        if (interfaceC55726xpQ instanceof TradeOrderData) {
            return ((TradeOrderData) interfaceC55726xpQ).getPnlCcy();
        }
        return interfaceC55726xpQ instanceof BizTradeStrategyInfo ? interfaceC55726xpQ.getOrderCcy() : "";
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xwi.calculateByPrice$default(o.xwi, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, java.lang.String, int, java.lang.Object):com.okinc.unify_trade.calculator.tpslprofit.SpTips */
    /* JADX DEBUG: Class process forced to load method for inline: o.xwk.getProfitLossEarn$default(o.xwk, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):kotlin.Pair */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull KlineOpenOrderBean klineOpenOrderBean, @NotNull TradePositionManager.PositionItem positionItem, @NotNull java.lang.String str, boolean z) {
        java.lang.String price;
        java.lang.String slOrdPx;
        java.lang.String str2;
        java.lang.String strKWHzl;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strKWHzl2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String tpOrdPx;
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(positionItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getTpOrdPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || (tpOrdPx = klineOpenOrderBean.getTpOrdPx()) == null || tpOrdPx.length() == 0) {
                price = klineOpenOrderBean.getPrice();
                if (price == null) {
                    str2 = "";
                }
            } else {
                price = klineOpenOrderBean.getTpOrdPx();
            }
            str2 = price;
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getSlOrdPx(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || (slOrdPx = klineOpenOrderBean.getSlOrdPx()) == null || slOrdPx.length() == 0) {
                price = klineOpenOrderBean.getPrice();
                if (price == null) {
                }
            } else {
                price = klineOpenOrderBean.getSlOrdPx();
            }
            str2 = price;
        }
        if (Intrinsics.EZpvd((java.lang.Object) positionItem.getInstType(), (java.lang.Object) oLT.isConnected())) {
            double dAbs = java.lang.Math.abs(C33129mqd.AEQbTJ(C33129mqd.addS$default(positionItem.getLiab(), positionItem.getInterest(), null, null, null, 14, null)));
            C56117xwk c56117xwk = C56117xwk.copydefault;
            java.lang.String instType = positionItem.getInstType();
            if (instType == null) {
                instType = "";
            }
            java.lang.String instId = positionItem.getInstId();
            java.lang.String str3 = instId == null ? "" : instId;
            java.lang.String side = positionItem.getSide();
            if (side == null) {
                side = "";
            }
            java.lang.String instType2 = positionItem.getInstType();
            if (instType2 == null) {
                instType2 = "";
            }
            java.lang.String strCopydefault = copydefault(side, instType2);
            java.lang.String orderSize = C33129mqd.AEQbTJ(klineOpenOrderBean.getOrderSize(), 0) ? klineOpenOrderBean.getOrderSize() : positionItem.getPos();
            java.lang.String avgPx = positionItem.getAvgPx();
            java.lang.String str4 = avgPx == null ? "" : avgPx;
            java.lang.String marginModel = positionItem.getMarginModel();
            klineOpenOrderBean.setPnl((java.lang.String) c56117xwk.EZpvd(instType, str3, "limit", strCopydefault, str2, orderSize, str4, true, (16384 & 256) != 0 ? true : true, (16384 & 512) != 0 ? "" : marginModel != null ? marginModel : "", (16384 & 1024) != 0 ? "" : positionItem.getCcy(), (16384 & 2048) != 0 ? "" : positionItem.getMargin(), (16384 & 4096) != 0 ? "" : C33129mqd.formatS$default(java.lang.Double.valueOf(dAbs), null, null, null, 7, null), (16384 & 8192) != 0 ? "" : positionItem.getPos(), (16384 & 16384) != 0 ? "" : null).getFirst());
            if (klineOpenOrderBean.isTemp()) {
                klineOpenOrderBean.setOrdType(C37932pGa.AEQbTJ.AEQbTJ(klineOpenOrderBean.getPrice(), copydefault(positionItem)) ? "TP_Limit" : "SL_Limit");
                return;
            }
            return;
        }
        C56115xwi c56115xwi = new C56115xwi();
        java.lang.String instType3 = positionItem.getInstType();
        java.lang.String instId2 = positionItem.getInstId();
        java.lang.String strAEQbTJ = AEQbTJ(positionItem);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(positionItem.getInstType())) == null || (strKWHzl = KWHzl(abstractC54531xLwOLrzqt2, positionItem.getInstId(), str2)) == null) {
            strKWHzl = "";
        }
        java.lang.String orderSize2 = C33129mqd.AEQbTJ(klineOpenOrderBean.getOrderSize(), 0) ? klineOpenOrderBean.getOrderSize() : C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.abs(C33129mqd.djBIcL(positionItem.getPos()))));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        SpTips spTipsEZpvd = c56115xwi.EZpvd(instType3, instId2, "limit", strAEQbTJ, strKWHzl, orderSize2, (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(positionItem.getInstType())) == null || (strKWHzl2 = KWHzl(abstractC54531xLwOLrzqt, positionItem.getInstId(), str)) == null) ? "" : strKWHzl2, true, "", true, null, null, null, null, (131072 & 16384) != 0 ? null : positionItem.getLever(), (32768 & 131072) != 0 ? false : z, (65536 & 131072) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE, (131072 & 131072) != 0 ? "" : null);
        java.lang.String pnl = spTipsEZpvd.getPnl();
        if (pnl == null) {
            pnl = "";
        }
        klineOpenOrderBean.setPnl(pnl);
        java.lang.String pnlRatio = spTipsEZpvd.getPnlRatio();
        klineOpenOrderBean.setPnlRatio(pnlRatio != null ? pnlRatio : "");
        if (klineOpenOrderBean.isTemp()) {
            klineOpenOrderBean.setOrdType(C37932pGa.AEQbTJ.AEQbTJ(klineOpenOrderBean.getPrice(), EZpvd(positionItem)) ? "TP_Limit" : "SL_Limit");
        }
    }

    public final java.lang.String AEQbTJ(TradePositionManager.PositionItem positionItem) {
        return EZpvd(positionItem) ? "sell" : "buy";
    }

    public final boolean EZpvd(TradePositionManager.PositionItem positionItem) {
        return (StringsKt__StringsKt.contains$default((java.lang.CharSequence) positionItem.getPos(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) || Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) pDK.OLrzqt)) ? false : true;
    }

    public final boolean copydefault(TradePositionManager.PositionItem positionItem) {
        return Intrinsics.EZpvd((java.lang.Object) positionItem.getSide(), (java.lang.Object) this.EZpvd);
    }

    public final java.lang.String copydefault(InterfaceC55726xpQ interfaceC55726xpQ) {
        if (interfaceC55726xpQ instanceof TradeOrderData) {
            return ((TradeOrderData) interfaceC55726xpQ).getSz();
        }
        return interfaceC55726xpQ instanceof BizTradeStrategyInfo ? interfaceC55726xpQ.getOrderSz() : "";
    }

    public final java.lang.String KWHzl(InterfaceC55726xpQ interfaceC55726xpQ) {
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC55726xpQ.getOrderInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) interfaceC55726xpQ.getOrderInstType(), (java.lang.Object) "MARGIN")) {
            return interfaceC55726xpQ.getOrderSide();
        }
        if (interfaceC55726xpQ instanceof TradeOrderData) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((TradeOrderData) interfaceC55726xpQ).getSide(), (java.lang.Object) "buy")) {
                return "buy";
            }
        } else {
            if (!(interfaceC55726xpQ instanceof BizTradeStrategyInfo)) {
                return "";
            }
            if (!Intrinsics.EZpvd((java.lang.Object) interfaceC55726xpQ.getOrderSide(), (java.lang.Object) "buy")) {
                return "buy";
            }
        }
        return "sell";
    }

    public final java.lang.String KWHzl(@NotNull AbstractC54531xLw abstractC54531xLw, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String instFamily;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(abstractC54531xLw, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(str);
        if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str3 = instFamily;
        }
        return abstractC54531xLw.gEmmrt(str3).valueOf(str2);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends InterfaceC39510pth> list, @NotNull java.util.List<? extends TradePositionManager.PositionItem> list2, java.util.List<KlineOpenOrderBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (list3 == null) {
            list3 = C36246oUr.copydefault().gasjUx();
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) obj;
            if (list3 != null) {
                for (KlineOpenOrderBean klineOpenOrderBean : list3) {
                    if (C37932pGa.AEQbTJ.KWHzl(klineOpenOrderBean, interfaceC39510pth)) {
                        boolean z = true;
                        klineOpenOrderBean.setCostConnect(true);
                        klineOpenOrderBean.setCostPos(i);
                        TradePositionManager.PositionItem positionItem = list2.get(interfaceC39510pth.getIndex());
                        java.lang.String avgPx = interfaceC39510pth.getAvgPx();
                        if (!Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") && !Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit")) {
                            z = false;
                        }
                        OLrzqt(klineOpenOrderBean, positionItem, avgPx, z);
                    }
                }
            }
            i++;
        }
    }

    public final KlineOpenOrderBean copydefault(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        java.util.Iterator<T> it = listGasjUx.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((KlineOpenOrderBean) next).getOrdId(), (java.lang.Object) str)) {
                break;
            }
        }
        return (KlineOpenOrderBean) next;
    }

    public final InterfaceC39510pth AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
        Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
        java.util.Iterator<T> it = listDCUTEI.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC39510pth) next).getPosId(), (java.lang.Object) str)) {
                break;
            }
        }
        InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) next;
        if (interfaceC39510pth != null) {
            interfaceC39510pth.setSelected(true);
        }
        if (interfaceC39510pth != null) {
            interfaceC39510pth.setShowSolid(true);
        }
        if (interfaceC39510pth != null) {
            interfaceC39510pth.setLiqSelected(true);
        }
        if (interfaceC39510pth != null) {
            interfaceC39510pth.setBeSelected(true);
        }
        return interfaceC39510pth;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return !EZpvd(str2) ? str : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy") ? "sell" : "buy";
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES");
    }

    public final void KWHzl(int i) {
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listGasjUx, i);
        if (klineOpenOrderBean != null) {
            klineOpenOrderBean.setChangePrice(false);
        }
    }

    public final void copydefault(int i) {
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listGasjUx, i);
        if (klineOpenOrderBean != null) {
            klineOpenOrderBean.setPrice(klineOpenOrderBean.getOldPrice());
        }
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get("ds0");
        if (dataSource != null) {
            return C33129mqd.gEmmrt(str, dataSource.gEmmrt() >= 1 ? C33129mqd.gEmmrt(java.lang.Double.valueOf(dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault())) : "");
        }
        return true;
    }
}
