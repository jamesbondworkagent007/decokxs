package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail;
import com.okinc.unify_trade.biz.subscribe.AccountSummaryBalanceDetail;
import com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54350xFd extends xGQ<WsAccountSummaryData> {
    public WsAccountSummaryData AEQbTJ;
    public final java.lang.String AhwBna;
    public final C56163xxd EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public final java.util.List<AbstractC55708xoz> OLrzqt;
    public AbstractC55708xoz copydefault;
    public AbstractC57556yke djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX INFO: renamed from: o.xFd$ActionBar */
    public static final class ActionBar extends TypeToken<java.util.List<? extends AccountSummaryBalanceDetail>> {
    }

    /* JADX INFO: renamed from: o.xFd$Activity */
    public static final class Activity extends TypeToken<AccountSummaryAccountDetail> {
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public C54350xFd(@NotNull java.lang.String str, AbstractC55708xoz abstractC55708xoz) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.copydefault = abstractC55708xoz;
        this.AhwBna = "TradeAccountSummaryWsTask";
        this.EZpvd = new C56163xxd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.OLrzqt = arrayList;
        this.KWHzl = new LinkedBlockingDeque<>();
        arrayList.add(this.copydefault);
        copydefault();
    }

    public static final Unit AEQbTJ(C54350xFd c54350xFd, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c54350xFd.copydefault((ResponseData<java.util.List<WsAccountSummaryData>>) responseData);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C56163xxd c56163xxd = this.EZpvd;
        c56163xxd.KWHzl(new Function1() { // from class: o.xFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54350xFd.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56163xxd, 0L, 1, null);
    }

    private final void valueOf() {
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "account-summary", new WsArgV5("account-summary", null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    public final void copydefault(@NotNull AbstractC55708xoz abstractC55708xoz) {
        Intrinsics.checkNotNullParameter(abstractC55708xoz, "");
        WsAccountSummaryData wsAccountSummaryData = this.AEQbTJ;
        if (wsAccountSummaryData != null) {
            abstractC55708xoz.AEQbTJ(wsAccountSummaryData, "WebSocket", java.lang.Boolean.TRUE);
        }
        this.OLrzqt.add(abstractC55708xoz);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.AhwBna, "----------ACCOUNT_SUMMARY > onMessage " + (str.length() > 0));
        OLrzqt(true);
        this.KWHzl.add(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public WsAccountSummaryData bD_() {
        WsAccountSummaryData wsAccountSummaryData;
        WsAccountSummaryData wsAccountSummaryData2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            JsonObject asJsonObject = JsonParser.parseString((java.lang.String) next).getAsJsonObject();
            java.lang.String asString = asJsonObject.get("type").getAsString();
            if (this.AEQbTJ != null) {
                if (Intrinsics.EZpvd((java.lang.Object) asString, (java.lang.Object) MTAnalysisConstants.Account.KEY_ACCOUNT)) {
                    xVJ xvj = xVJ.KWHzl;
                    JsonElement jsonElement = asJsonObject.get("accountDetails");
                    Intrinsics.checkNotNullExpressionValue(jsonElement, "");
                    java.lang.String strEZpvd = C33488mxR.EZpvd(jsonElement);
                    java.lang.reflect.Type type = new Activity().getType();
                    Intrinsics.copydefault(type);
                    AccountSummaryAccountDetail accountSummaryAccountDetail = (AccountSummaryAccountDetail) xvj.OLrzqt(strEZpvd, type, true);
                    if (accountSummaryAccountDetail != null && (wsAccountSummaryData = this.AEQbTJ) != null) {
                        wsAccountSummaryData.setAccountDetails(accountSummaryAccountDetail);
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) asString, (java.lang.Object) "balance")) {
                    xVJ xvj2 = xVJ.KWHzl;
                    JsonElement jsonElement2 = asJsonObject.get("balanceDetails");
                    Intrinsics.checkNotNullExpressionValue(jsonElement2, "");
                    java.lang.String strEZpvd2 = C33488mxR.EZpvd(jsonElement2);
                    java.lang.reflect.Type type2 = new ActionBar().getType();
                    Intrinsics.copydefault(type2);
                    java.util.List<AccountSummaryBalanceDetail> list = (java.util.List) xvj2.OLrzqt(strEZpvd2, type2, true);
                    if (list != null && (wsAccountSummaryData2 = this.AEQbTJ) != null) {
                        wsAccountSummaryData2.setBalanceDetails(list);
                    }
                }
            }
        }
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull WsAccountSummaryData wsAccountSummaryData) {
        Intrinsics.checkNotNullParameter(wsAccountSummaryData, "");
        for (AbstractC55708xoz abstractC55708xoz : this.OLrzqt) {
            if (abstractC55708xoz != null) {
                abstractC55708xoz.AEQbTJ(wsAccountSummaryData, "WebSocket", java.lang.Boolean.TRUE);
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55708xoz)) {
            java.util.Iterator<AbstractC55708xoz> it = this.OLrzqt.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC55708xoz next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AhwBna() : null), (java.lang.Object) ((AbstractC55708xoz) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1 && Intrinsics.EZpvd(this.OLrzqt.remove(i), this.copydefault)) {
                this.copydefault = null;
            }
            if (this.OLrzqt.size() == 0) {
                KWHzl();
                return true;
            }
        }
        return false;
    }

    private final void KWHzl() {
        C54407xHg.Companion.EZpvd("account-summary", this.djBIcL);
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.djBIcL = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }

    private final void copydefault(ResponseData<java.util.List<WsAccountSummaryData>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<WsAccountSummaryData> data = responseData.getData();
            WsAccountSummaryData wsAccountSummaryData = data != null ? (WsAccountSummaryData) CollectionsKt___CollectionsKt.firstOrNull(data) : null;
            this.AEQbTJ = wsAccountSummaryData;
            if (wsAccountSummaryData != null) {
                for (AbstractC55708xoz abstractC55708xoz : this.OLrzqt) {
                    if (abstractC55708xoz != null) {
                        WsAccountSummaryData wsAccountSummaryData2 = this.AEQbTJ;
                        Intrinsics.copydefault(wsAccountSummaryData2);
                        abstractC55708xoz.AEQbTJ(wsAccountSummaryData2, "http", java.lang.Boolean.TRUE);
                    }
                }
            } else {
                for (AbstractC55708xoz abstractC55708xoz2 : this.OLrzqt) {
                    if (abstractC55708xoz2 != null) {
                        abstractC55708xoz2.AEQbTJ(new WsAccountSummaryData((java.util.List) null, (AccountSummaryAccountDetail) null, (java.util.List) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null), "http", java.lang.Boolean.FALSE);
                    }
                }
            }
            valueOf();
            return;
        }
        for (AbstractC55708xoz abstractC55708xoz3 : this.OLrzqt) {
            if (abstractC55708xoz3 != null) {
                abstractC55708xoz3.AEQbTJ(new WsAccountSummaryData((java.util.List) null, (AccountSummaryAccountDetail) null, (java.util.List) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null), "http", java.lang.Boolean.FALSE);
            }
        }
    }
}
