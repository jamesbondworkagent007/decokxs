package com.okinc.unify_trade.message;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.api.subscribe.TradeNotifyMessage;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.message.TradeMessagePresenter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.AbstractC58247yxg;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54428xIa;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C54799xVt;
import o.C54819xWm;
import o.C55688xof;
import o.C56132xwz;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.C57656ymY;
import o.C58266yxz;
import o.C59449zhJ;
import o.InterfaceC54581xNr;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.pUU;
import o.xBU;
import o.xHY;
import o.xKK;
import o.xMR;
import o.xUW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeMessagePresenter implements xHY {
    public InterfaceC58217yxC AEQbTJ;
    public final xBU EZpvd = new xBU();
    public Observer<TradeNotifyMessage> copydefault;

    public static final void OLrzqt(View view) {
    }

    @Override // o.xHY
    public void KWHzl() {
        Observer<TradeNotifyMessage> observer = new Observer() { // from class: o.xIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                TradeMessagePresenter.EZpvd(this.KWHzl, (TradeNotifyMessage) obj);
            }
        };
        this.copydefault = observer;
        this.EZpvd.AEQbTJ().observeForever(observer);
        xKK.Activity.execute$default(this.EZpvd, 0L, 1, null);
    }

    public static final void EZpvd(TradeMessagePresenter tradeMessagePresenter, TradeNotifyMessage tradeNotifyMessage) {
        tradeMessagePresenter.AkhnZx(tradeNotifyMessage);
    }

    @Override // o.xHY
    public void EZpvd() {
        Observer<TradeNotifyMessage> observer = this.copydefault;
        if (observer != null) {
            this.EZpvd.AEQbTJ().setValue(null);
            this.EZpvd.AEQbTJ().removeObserver(observer);
        }
        this.EZpvd.copydefault();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void AkhnZx(TradeNotifyMessage tradeNotifyMessage) {
        final StateListAnimator stateListAnimatorAhwBna;
        pUU.KWHzl("TradeMessagePresenter", String.valueOf(tradeNotifyMessage));
        if (tradeNotifyMessage == null) {
            return;
        }
        String messageType = tradeNotifyMessage.getMessageType();
        if (Intrinsics.EZpvd((Object) messageType, (Object) MessageType.REDUCE_ONLY_CANCEL_ORDER.getValue())) {
            stateListAnimatorAhwBna = gEmmrt(tradeNotifyMessage);
        } else if (Intrinsics.EZpvd((Object) messageType, (Object) MessageType.MARGIN_CLOSE_LIMIT_CANCEL_ORDER.getValue()) || Intrinsics.EZpvd((Object) messageType, (Object) MessageType.MATCHER_CHECK_PRICE_FAILED_CANCEL_ORDER.getValue())) {
            stateListAnimatorAhwBna = AhwBna(tradeNotifyMessage);
        } else if (Intrinsics.EZpvd((Object) messageType, (Object) MessageType.FOK_LIMIT_CANCEL_ORDER.getValue())) {
            stateListAnimatorAhwBna = djBIcL(tradeNotifyMessage);
        } else {
            if (!Intrinsics.EZpvd((Object) messageType, (Object) MessageType.IOC_LIMIT_CANCEL_ORDER.getValue())) {
                if (Intrinsics.EZpvd((Object) messageType, (Object) MessageType.ADJUST_LEVER_REFRESH_ORDER.getValue())) {
                    Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                    FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
                    if (fragmentActivity == null) {
                        return;
                    }
                    ((C56132xwz) new ViewModelProvider(fragmentActivity).get(C56132xwz.class)).KWHzl().KWHzl("");
                    return;
                }
                return;
            }
            stateListAnimatorAhwBna = AYXKKw(tradeNotifyMessage);
        }
        if (C54819xWm.KWHzl().AEQbTJ() == null) {
            return;
        }
        C57656ymY.OLrzqt.valueOf();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgDelay = AbstractC58247yxg.just(1).delay(500L, TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeMessagePresenter.OLrzqt(stateListAnimatorAhwBna, (java.lang.Integer) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgDelay.subscribe(new InterfaceC58227yxM() { // from class: o.xId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TradeMessagePresenter.AEQbTJ(function1, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(StateListAnimator stateListAnimator, Integer num) {
        C54428xIa.AEQbTJ.copydefault(stateListAnimator.AEQbTJ(), stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), false, new View.OnClickListener() { // from class: o.xIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                TradeMessagePresenter.OLrzqt(view);
            }
        });
        return Unit.INSTANCE;
    }

    public final StateListAnimator AhwBna(TradeNotifyMessage tradeNotifyMessage) {
        String strOLrzqt = OLrzqt(tradeNotifyMessage);
        copydefault(tradeNotifyMessage);
        return new StateListAnimator(C33069mpW.copydefault(C55688xof.Application.addOnReportDrawnListener, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instrument", strOLrzqt), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, valueOf(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, KWHzl(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ""), C56390yDp.OLrzqt("unit", ""), C56390yDp.OLrzqt("type", ""))), C33070mpX.AYXKKw(C55688xof.Application.get), 5);
    }

    public final StateListAnimator djBIcL(TradeNotifyMessage tradeNotifyMessage) {
        String strValueOf = valueOf(tradeNotifyMessage);
        String strKWHzl = KWHzl(tradeNotifyMessage);
        return new StateListAnimator(C33069mpW.copydefault(C55688xof.Application.postWhenReportersAreDone, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instrument", OLrzqt(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, strValueOf), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strKWHzl), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, copydefault(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ""), C56390yDp.OLrzqt("unit", ""), C56390yDp.OLrzqt("type", ""))), C33070mpX.AYXKKw(C55688xof.Application.R), 5);
    }

    public static final boolean AEQbTJ(TradeNotifyMessage tradeNotifyMessage) {
        return C33129mqd.OLrzqt(tradeNotifyMessage.getFillSz(), "0");
    }

    public final StateListAnimator AYXKKw(TradeNotifyMessage tradeNotifyMessage) {
        String strCopydefault;
        String strAYXKKw;
        String strValueOf = valueOf(tradeNotifyMessage);
        String strKWHzl = KWHzl(tradeNotifyMessage);
        String strOLrzqt = OLrzqt(tradeNotifyMessage);
        String strCopydefault2 = copydefault(tradeNotifyMessage);
        if (AEQbTJ(tradeNotifyMessage)) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.reportRunnablelambda2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instrument", strOLrzqt), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, strValueOf), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strKWHzl), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, strCopydefault2), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ""), C56390yDp.OLrzqt("unit", ""), C56390yDp.OLrzqt("type", "")));
        } else {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.fullyDrawnReported, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instrument", strOLrzqt), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, strValueOf), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strKWHzl), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, strCopydefault2), C56390yDp.OLrzqt("filledAmount", EZpvd(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ""), C56390yDp.OLrzqt("unit", ""), C56390yDp.OLrzqt("type", "")));
        }
        if (AEQbTJ(tradeNotifyMessage)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.Rid);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner1);
        }
        return new StateListAnimator(strCopydefault, strAYXKKw, 5);
    }

    public final StateListAnimator gEmmrt(TradeNotifyMessage tradeNotifyMessage) {
        return new StateListAnimator(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsTakeVideo, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instrument", OLrzqt(tradeNotifyMessage)), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, copydefault(tradeNotifyMessage)), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, valueOf(tradeNotifyMessage)), C56390yDp.OLrzqt("unit", ""), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, KWHzl(tradeNotifyMessage)), C56390yDp.OLrzqt("type", ""), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ""))), C33070mpX.AYXKKw(C55688xof.Application.AnimRes), 5);
    }

    public final boolean DbNXlk(TradeNotifyMessage tradeNotifyMessage) {
        String tgtCcy = tradeNotifyMessage.getTgtCcy();
        if (tgtCcy == null || tgtCcy.length() == 0) {
            return C59449zhJ.gEmmrt(tradeNotifyMessage.getSide(), "buy", true);
        }
        return Intrinsics.EZpvd((Object) tradeNotifyMessage.getTgtCcy(), (Object) "quote_ccy");
    }

    public final boolean values(TradeNotifyMessage tradeNotifyMessage) {
        return DbNXlk(tradeNotifyMessage) & CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) yDY.gEmmrt("SPOT", "MARGIN")), tradeNotifyMessage.getInstType()) & fetchVPNInfo(tradeNotifyMessage);
    }

    public final boolean fetchVPNInfo(TradeNotifyMessage tradeNotifyMessage) {
        return C33129mqd.OLrzqt(tradeNotifyMessage.getPx(), "0");
    }

    public final String KWHzl(TradeNotifyMessage tradeNotifyMessage) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument suggestedInstrument$default;
        String strAEQbTJ;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAEQbTJ;
        String upperCase;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAEQbTJ2;
        String quoteSymbol;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        String safeString$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            String instType = tradeNotifyMessage.getInstType();
            if (instType == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            String instType2 = tradeNotifyMessage.getInstType();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, instType2 == null ? "" : instType2, tradeNotifyMessage.getInstId(), null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            xUW xuw = xUW.KWHzl;
            String instId = tradeNotifyMessage.getInstId();
            if (instId == null) {
                instId = "";
            }
            strAEQbTJ = xuw.AEQbTJ(instId);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (!values(tradeNotifyMessage)) {
            if (abstractC54531xLwOLrzqt != null) {
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null);
            } else {
                c54571xNhCreateTradeConverterWithIndex$default = null;
            }
            if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                String px = tradeNotifyMessage.getPx();
                if (px == null) {
                    px = "";
                }
                c54571xNhCreateTradeConverterWithIndex$default.AhwBna(px);
            }
            if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                String sz = tradeNotifyMessage.getSz();
                c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(sz != null ? sz : "");
            } else {
                c54536xMLDjBIcL = null;
            }
            if (c54536xMLDjBIcL != null && (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) != null && (c54536xMLDjBIcL2 = c54536xMLIsConnected.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) != null && (c54536xMLAEQbTJ = c54536xMLFetchVPNInfo.AEQbTJ()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null);
            }
        } else if (abstractC54531xLwOLrzqt != null) {
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
                upperCase = null;
            } else {
                upperCase = quoteSymbol.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, upperCase);
            if (c54571xNhAhwBna != null) {
                String sz2 = tradeNotifyMessage.getSz();
                C54536xML c54536xMLDjBIcL4 = c54571xNhAhwBna.djBIcL(sz2 != null ? sz2 : "");
                if (c54536xMLDjBIcL4 != null && (c54536xMLIsConnected2 = c54536xMLDjBIcL4.isConnected()) != null && (c54536xMLDjBIcL3 = c54536xMLIsConnected2.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL3.fetchVPNInfo()) != null && (c54536xMLAEQbTJ2 = c54536xMLFetchVPNInfo2.AEQbTJ()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ2, false, 1, null);
                }
            }
        }
        return safeString$default == null ? "--" : safeString$default;
    }

    public final String EZpvd(TradeNotifyMessage tradeNotifyMessage) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument suggestedInstrument$default;
        String strAEQbTJ;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            String instType = tradeNotifyMessage.getInstType();
            if (instType == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            String instType2 = tradeNotifyMessage.getInstType();
            String str = instType2 == null ? "" : instType2;
            String instId = tradeNotifyMessage.getInstId();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str, instId == null ? "" : instId, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            xUW xuw = xUW.KWHzl;
            String instId2 = tradeNotifyMessage.getInstId();
            if (instId2 == null) {
                instId2 = "";
            }
            strAEQbTJ = xuw.AEQbTJ(instId2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null);
        }
        if (c54571xNhCreateTradeConverterWithIndex$default != null) {
            String px = tradeNotifyMessage.getPx();
            if (px == null) {
                px = "";
            }
            c54571xNhCreateTradeConverterWithIndex$default.AhwBna(px);
        }
        if (c54571xNhCreateTradeConverterWithIndex$default == null) {
            return "";
        }
        String fillSz = tradeNotifyMessage.getFillSz();
        if (fillSz == null) {
            fillSz = "";
        }
        String strGEmmrt = c54571xNhCreateTradeConverterWithIndex$default.gEmmrt(fillSz);
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public final String valueOf(TradeNotifyMessage tradeNotifyMessage) {
        return C33070mpX.AYXKKw(Intrinsics.EZpvd((Object) tradeNotifyMessage.getSide(), (Object) "buy") ? C55688xof.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA : C55688xof.Application.lambdaexecute0);
    }

    public final String copydefault(TradeNotifyMessage tradeNotifyMessage) {
        if (C33129mqd.AEQbTJ(tradeNotifyMessage.getPx(), 0)) {
            xMR xmr = xMR.copydefault;
            String px = tradeNotifyMessage.getPx();
            if (px == null) {
                px = "";
            }
            return xmr.copydefault(px);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.onDraw);
    }

    public final String OLrzqt(TradeNotifyMessage tradeNotifyMessage) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (tradeNotifyMessage == null) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentValueOf = null;
        if (interfaceC54581xNrOLrzqt != null) {
            String instType = tradeNotifyMessage.getInstType();
            if (instType == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            String instId = tradeNotifyMessage.getInstId();
            if (instId == null) {
                instId = "";
            }
            bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
        }
        return bizInstrumentValueOf == null ? "" : C54799xVt.AEQbTJ.OLrzqt(bizInstrumentValueOf);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MessageType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MessageType[] $VALUES;
        private final String value;
        public static final MessageType REDUCE_ONLY_CANCEL_ORDER = new MessageType("REDUCE_ONLY_CANCEL_ORDER", 0, "1");
        public static final MessageType MARGIN_CLOSE_LIMIT_CANCEL_ORDER = new MessageType("MARGIN_CLOSE_LIMIT_CANCEL_ORDER", 1, "2");
        public static final MessageType MATCHER_CHECK_PRICE_FAILED_CANCEL_ORDER = new MessageType("MATCHER_CHECK_PRICE_FAILED_CANCEL_ORDER", 2, "3");
        public static final MessageType FOK_LIMIT_CANCEL_ORDER = new MessageType("FOK_LIMIT_CANCEL_ORDER", 3, "4");
        public static final MessageType IOC_LIMIT_CANCEL_ORDER = new MessageType("IOC_LIMIT_CANCEL_ORDER", 4, "5");
        public static final MessageType ADJUST_LEVER_REFRESH_ORDER = new MessageType("ADJUST_LEVER_REFRESH_ORDER", 5, OrderDetailListItem.SLIP_OUT);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MessageType[] $values() {
            return new MessageType[]{REDUCE_ONLY_CANCEL_ORDER, MARGIN_CLOSE_LIMIT_CANCEL_ORDER, MATCHER_CHECK_PRICE_FAILED_CANCEL_ORDER, FOK_LIMIT_CANCEL_ORDER, IOC_LIMIT_CANCEL_ORDER, ADJUST_LEVER_REFRESH_ORDER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MessageType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private MessageType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            MessageType[] messageTypeArr$values = $values();
            $VALUES = messageTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(messageTypeArr$values);
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final int OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            if ((i2 & 4) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(str, str2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MessageInfo(message=" + this.AEQbTJ + ", title=" + this.copydefault + ", messageState=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.OLrzqt = i;
        }
    }
}
