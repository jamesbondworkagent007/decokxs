package o;

import androidx.camera.video.AudioStats;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.AccountDetailData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xEZ extends xGQ<AccountBalanceData> {
    public AccountBalanceData AEQbTJ;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public AbstractC55657xoA KWHzl;
    public final C56161xxb OLrzqt;
    public final java.util.List<AbstractC55657xoA> copydefault;
    public AbstractC57556yke djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xEZ(@NotNull java.lang.String str, AbstractC55657xoA abstractC55657xoA) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.KWHzl = abstractC55657xoA;
        this.valueOf = "TradeMmrWsTask";
        this.OLrzqt = new C56161xxb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.copydefault = arrayList;
        this.EZpvd = new LinkedBlockingDeque<>();
        EZpvd();
        arrayList.add(this.KWHzl);
    }

    public final void EZpvd() {
        C56161xxb c56161xxb = this.OLrzqt;
        AbstractC55657xoA abstractC55657xoA = this.KWHzl;
        c56161xxb.OLrzqt(abstractC55657xoA != null ? abstractC55657xoA.OLrzqt() : null);
        c56161xxb.KWHzl(new Function1() { // from class: o.xFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEZ.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56161xxb, 0L, 1, null);
    }

    public static final Unit EZpvd(xEZ xez, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xez.AEQbTJ((ResponseData<java.util.List<AccountBalanceData>>) responseData);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ResponseData<java.util.List<AccountBalanceData>> responseData) {
        java.util.List<AccountBalanceData> data = responseData.getData();
        AccountBalanceData accountBalanceData = data != null ? (AccountBalanceData) CollectionsKt___CollectionsKt.firstOrNull(data) : null;
        this.AEQbTJ = accountBalanceData;
        if (accountBalanceData != null) {
            AbstractC55657xoA abstractC55657xoA = this.KWHzl;
            if (abstractC55657xoA != null) {
                Intrinsics.copydefault(accountBalanceData);
                abstractC55657xoA.AEQbTJ(accountBalanceData, "http", java.lang.Boolean.TRUE);
            }
        } else {
            AbstractC55657xoA abstractC55657xoA2 = this.KWHzl;
            if (abstractC55657xoA2 != null) {
                abstractC55657xoA2.AEQbTJ(new AccountBalanceData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1048575, (DefaultConstructorMarker) null), "http", java.lang.Boolean.FALSE);
            }
        }
        djBIcL();
    }

    private final void djBIcL() {
        AbstractC55657xoA abstractC55657xoA = this.KWHzl;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, MTAnalysisConstants.Account.KEY_ACCOUNT, new WsArgV5(MTAnalysisConstants.Account.KEY_ACCOUNT, null, null, null, abstractC55657xoA != null ? abstractC55657xoA.OLrzqt() : null, null, null, null, 238, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    public final void KWHzl(@NotNull AbstractC55657xoA abstractC55657xoA) {
        Intrinsics.checkNotNullParameter(abstractC55657xoA, "");
        AccountBalanceData accountBalanceData = this.AEQbTJ;
        if (accountBalanceData != null) {
            abstractC55657xoA.AEQbTJ(accountBalanceData, "WebSocket", java.lang.Boolean.TRUE);
        }
        this.copydefault.add(abstractC55657xoA);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.valueOf, "----------ACCOUNT > onMessage " + (str.length() > 0));
        OLrzqt(true);
        this.EZpvd.add(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AccountBalanceData bD_() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.EZpvd.isEmpty()) {
            arrayList.add(this.EZpvd.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            AccountBalanceData accountBalanceDataEZpvd = AccountBalanceData.Companion.EZpvd((java.lang.String) next);
            if (accountBalanceDataEZpvd != null) {
                copydefault(accountBalanceDataEZpvd);
            }
        }
        return this.AEQbTJ;
    }

    public final void copydefault(AccountBalanceData accountBalanceData) {
        AccountBalanceData accountBalanceData2;
        java.util.ArrayList<AccountDetailData> details;
        AccountBalanceData accountBalanceData3 = this.AEQbTJ;
        if (accountBalanceData3 == null) {
            this.AEQbTJ = accountBalanceData;
            return;
        }
        if (accountBalanceData3 != null) {
            accountBalanceData3.updateTotal(accountBalanceData);
        }
        java.util.ArrayList<AccountDetailData> details2 = accountBalanceData.getDetails();
        if (details2 != null) {
            for (AccountDetailData accountDetailData : details2) {
                if (!OLrzqt(accountDetailData) && AEQbTJ(accountDetailData) && (accountBalanceData2 = this.AEQbTJ) != null && (details = accountBalanceData2.getDetails()) != null) {
                    details.add(accountDetailData);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull AccountBalanceData accountBalanceData) {
        Intrinsics.checkNotNullParameter(accountBalanceData, "");
        for (AbstractC55657xoA abstractC55657xoA : this.copydefault) {
            if (abstractC55657xoA != null) {
                abstractC55657xoA.AEQbTJ(accountBalanceData, "WebSocket", java.lang.Boolean.TRUE);
            }
        }
    }

    public final boolean OLrzqt(AccountDetailData accountDetailData) {
        java.util.ArrayList<AccountDetailData> details;
        java.util.ArrayList<AccountDetailData> details2;
        AccountBalanceData accountBalanceData = this.AEQbTJ;
        if (accountBalanceData == null || (details = accountBalanceData.getDetails()) == null) {
            return false;
        }
        int i = 0;
        for (java.lang.Object obj : details) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AccountDetailData accountDetailData2 = (AccountDetailData) obj;
            if (Intrinsics.EZpvd((java.lang.Object) accountDetailData.getCcy(), (java.lang.Object) accountDetailData2.getCcy()) && !AEQbTJ(accountDetailData)) {
                AccountBalanceData accountBalanceData2 = this.AEQbTJ;
                if (accountBalanceData2 != null && (details2 = accountBalanceData2.getDetails()) != null) {
                    details2.remove(i);
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) accountDetailData.getCcy(), (java.lang.Object) accountDetailData2.getCcy())) {
                AccountBalanceData accountBalanceData3 = this.AEQbTJ;
                java.util.ArrayList<AccountDetailData> details3 = accountBalanceData3 != null ? accountBalanceData3.getDetails() : null;
                Intrinsics.copydefault(details3);
                details3.set(i, accountDetailData);
            } else {
                i++;
            }
            return true;
        }
        return false;
    }

    public final boolean AEQbTJ(AccountDetailData accountDetailData) {
        return (C33129mqd.AEQbTJ(accountDetailData.getEq()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(accountDetailData.getAvailEq()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(accountDetailData.getAvailBal()) == AudioStats.AUDIO_AMPLITUDE_NONE) ? false : true;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55657xoA)) {
            java.util.Iterator<AbstractC55657xoA> it = this.copydefault.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC55657xoA next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AhwBna() : null), (java.lang.Object) ((AbstractC55657xoA) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1 && Intrinsics.EZpvd(this.copydefault.remove(i), this.KWHzl)) {
                this.KWHzl = null;
            }
            if (this.copydefault.size() == 0) {
                KWHzl();
                return true;
            }
        }
        return false;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd(MTAnalysisConstants.Account.KEY_ACCOUNT, this.djBIcL);
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

    private final void AEQbTJ(ResponseData<java.util.List<AccountBalanceData>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            OLrzqt(responseData);
            return;
        }
        AbstractC55657xoA abstractC55657xoA = this.KWHzl;
        if (abstractC55657xoA != null) {
            abstractC55657xoA.AEQbTJ(new AccountBalanceData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1048575, (DefaultConstructorMarker) null), "http", java.lang.Boolean.FALSE);
        }
    }
}
