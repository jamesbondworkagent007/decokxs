package o;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.tradingbot.impl.TradingBotApiImpl$isForbiddenBot$1;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.PendingOrderLine;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48039uCs extends AbstractC43215rlA implements uBU {
    @Override // o.uBU
    public AbstractC32996moC KWHzl(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C51861vux.Companion.AEQbTJ(z, str);
    }

    @Override // o.uBU
    public AbstractC32996moC AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C51834vuW.Companion.copydefault(str, z, str2, z2);
    }

    @Override // o.uBU
    public AbstractC32996moC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return wLP.Companion.OLrzqt(str, str2);
    }

    @Override // o.uBU
    public void KWHzl(AbstractC32996moC abstractC32996moC, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        wLP wlp = abstractC32996moC instanceof wLP ? (wLP) abstractC32996moC : null;
        if (wlp != null) {
            wlp.KWHzl(str, str2);
        }
    }

    @Override // o.uBU
    public AbstractC32996moC AEQbTJ(boolean z, boolean z2, android.os.Bundle bundle, boolean z3) {
        return C51039vfW.Companion.copydefault(z, z2, bundle, z3);
    }

    @Override // o.uBU
    public void EZpvd(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(botTradeData, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String str = map.get(AppsFlyerProperties.CHANNEL);
        java.lang.String str2 = map.get("activity_id");
        C56058xve.Companion.copydefault().KWHzl(str == null ? "" : str, (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : map.get("channel_details"), (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : str2, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        ActivityC52122vzt.Companion.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : map, (244 & 8) != 0 ? null : "nmp", (244 & 16) != 0 ? null : num, (244 & 32) != 0 ? null : str, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
    }

    @Override // o.uBU
    public PendingOrderLine copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56068xvo.copydefault.OLrzqt(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // o.uBU
    public AbstractC54505xKx<?, ?> EZpvd(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C52375wJb.Companion.copydefault(i, str);
    }

    @Override // o.uBU
    public void copydefault(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(botTradeData, "");
        ActivityC52122vzt.Companion.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : map, (244 & 8) != 0 ? null : str, (244 & 16) != 0 ? null : num, (244 & 32) != 0 ? null : str2, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
    }

    @Override // o.uBU
    public InterfaceC49420uoH AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) ? "grid" : "contract_grid"), (java.lang.Object) "grid") ? new vRY() : new C50297vJe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.uBU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) throws java.lang.Throwable {
        TradingBotApiImpl$isForbiddenBot$1 tradingBotApiImpl$isForbiddenBot$1;
        java.util.ArrayList arrayList;
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        xOR xorCopydefault2;
        if (continuation instanceof TradingBotApiImpl$isForbiddenBot$1) {
            tradingBotApiImpl$isForbiddenBot$1 = (TradingBotApiImpl$isForbiddenBot$1) continuation;
            int i = tradingBotApiImpl$isForbiddenBot$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingBotApiImpl$isForbiddenBot$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingBotApiImpl$isForbiddenBot$1 = new TradingBotApiImpl$isForbiddenBot$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = tradingBotApiImpl$isForbiddenBot$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingBotApiImpl$isForbiddenBot$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                str = (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) ? "grid" : "contract_grid";
                uLO uloAEQbTJ = uLO.Companion.AEQbTJ();
                Unit unit = Unit.INSTANCE;
                tradingBotApiImpl$isForbiddenBot$1.L$0 = str;
                tradingBotApiImpl$isForbiddenBot$1.label = 1;
                objOLrzqt = uloAEQbTJ.OLrzqt(unit, (Continuation<? super BotCategoryConfig>) tradingBotApiImpl$isForbiddenBot$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) tradingBotApiImpl$isForbiddenBot$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            BotCategoryConfig botCategoryConfig = (BotCategoryConfig) objOLrzqt;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault != null && (xorCopydefault2 = interfaceC54581xNrCopydefault.copydefault()) != null) {
                xorCopydefault2.OLrzqt(botCategoryConfig.getStrategy());
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault2 == null || (xorCopydefault = interfaceC54581xNrCopydefault2.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OrderCategory) it.next()).getStrategyType());
                }
            }
            return new kotlin.Pair(C56443yFo.KWHzl((arrayList == null || arrayList.contains(str)) ? false : true), str);
        } catch (java.lang.Exception unused) {
            return new kotlin.Pair(C56443yFo.KWHzl(true), str);
        }
    }

    @Override // o.uBU
    public void AEQbTJ(Function1<? super MarketArbCoinInfo, Unit> function1, final Function1<? super java.lang.Boolean, Unit> function12, androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        if (fragmentManager != null) {
            C54085wxh c54085wxhOLrzqt = C54085wxh.Companion.OLrzqt(function1, z);
            c54085wxhOLrzqt.EZpvd(new Function1() { // from class: o.uCw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C48039uCs.AEQbTJ(function12, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            c54085wxhOLrzqt.show(fragmentManager, "ArbitrageSearchDialogFragment");
        }
    }

    public static final Unit AEQbTJ(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/wXX; */
    @Override // o.uBU
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52946wcH copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C52946wcH.Companion.copydefault(str, str2, str3, str4, str5, z, str6, str7, str8, str9, str10);
    }

    @Override // o.uBU
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C53659wpf.Companion.KWHzl().KWHzl(str, continuation);
    }
}
