package com.okinc.unify_trade.bot.contract_grid.viewModel.tpsl;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.TpSlTypeConfigData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C54301xDi;
import o.C54308xDp;
import o.C55276xgr;
import o.C55779xqQ;
import o.C55780xqR;
import o.C55781xqS;
import o.C55783xqU;
import o.C55784xqV;
import o.C55786xqX;
import o.C55804xqp;
import o.C55850xri;
import o.C55851xrj;
import o.C55853xrl;
import o.C56033xvF;
import o.C56068xvo;
import o.C56156xxW;
import o.C56157xxX;
import o.C56235xyw;
import o.InterfaceC55843xrb;
import o.InterfaceC55873xsE;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotGridTpSlPresenter extends AbsPresenter {
    public InterfaceC55843xrb AEQbTJ;
    public String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGridTpSlPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = "from_create";
    }

    public final void KWHzl(Bundle bundle) {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.copydefault(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(Bundle bundle) {
        String string;
        String string2;
        InterfaceC55843xrb c55781xqS;
        if (bundle == null || (string = bundle.getString("from")) == null) {
            string = "from_create";
        }
        this.KWHzl = string;
        if (bundle == null || (string2 = bundle.getString("bot_type")) == null) {
            string2 = "grid";
        }
        int iHashCode = string2.hashCode();
        if (iHashCode != -1574173039) {
            if (iHashCode == -512749997) {
                if (string2.equals("contract_grid")) {
                    c55781xqS = Intrinsics.EZpvd((Object) this.KWHzl, (Object) "from_create") ? new C55780xqR() : new C55779xqQ();
                } else {
                    c55781xqS = new C55784xqV();
                }
            } else {
                c55781xqS = (iHashCode == 3181382 && string2.equals("grid") && !Intrinsics.EZpvd((Object) this.KWHzl, (Object) "from_create")) ? new C55786xqX() : new C55784xqV();
            }
        } else if (string2.equals("infinite_grid")) {
            c55781xqS = Intrinsics.EZpvd((Object) this.KWHzl, (Object) "from_create") ? new C55781xqS() : new C55783xqU();
        }
        this.AEQbTJ = c55781xqS;
    }

    public final Pair<String, Integer> EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        String strDivS$default = C33129mqd.divS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getInvestment(), null, null, null, 14, null);
        return new Pair<>(C56068xvo.copydefault.copydefault(strDivS$default, true), Integer.valueOf(C56033xvF.OLrzqt((Object) C56033xvF.KWHzl(strDivS$default))));
    }

    public final Pair<String, Integer> copydefault(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        C55786xqX c55786xqX = interfaceC55843xrb instanceof C55786xqX ? (C55786xqX) interfaceC55843xrb : null;
        if (c55786xqX != null) {
            return c55786xqX.EZpvd(strategyDetailsResponse);
        }
        return null;
    }

    public final boolean AEQbTJ(Bundle bundle) {
        if (bundle != null) {
            return bundle.getBoolean("edit_detail");
        }
        return false;
    }

    public final TradeLiveData<C55853xrl> valueOf() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.gEmmrt();
    }

    public final TradeLiveData<SpotGridTpSlConfig> getNewProxyInstance() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        if (interfaceC55873xsE != null) {
            return interfaceC55873xsE.ejfBZ();
        }
        return null;
    }

    public final TradeLiveData<xMJ.Application> iwGUEr() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.AhwBna();
    }

    public final TradeLiveData<List<C56157xxX>> AYXKKw() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).uzCIH();
        }
        if (interfaceC55843xrb instanceof C55783xqU) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55783xqU) interfaceC55843xrb2).fARcdN();
        }
        if (!(interfaceC55843xrb instanceof C55779xqQ)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55779xqQ) interfaceC55843xrb2).ejfBZ();
    }

    public final TradeLiveData<Pair<String, Integer>> DbNXlk() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).zLjUOn();
        }
        if (interfaceC55843xrb instanceof C55783xqU) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55783xqU) interfaceC55843xrb2).uzCIH();
        }
        if (!(interfaceC55843xrb instanceof C55779xqQ)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55779xqQ) interfaceC55843xrb2).uzCIH();
    }

    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> fetchVPNInfo() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        C55786xqX c55786xqX = interfaceC55843xrb instanceof C55786xqX ? (C55786xqX) interfaceC55843xrb : null;
        if (c55786xqX != null) {
            return c55786xqX.AuCTelauCTel();
        }
        return null;
    }

    public final C54308xDp hDKMBd() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).getNewProxyInstance().AYXKKw();
        }
        if (interfaceC55843xrb instanceof C55779xqQ) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55779xqQ) interfaceC55843xrb2).fARcdN().AYXKKw();
        }
        if (!(interfaceC55843xrb instanceof C55783xqU)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55783xqU) interfaceC55843xrb2).ejfBZ().AYXKKw();
    }

    public final C54301xDi AuCTel() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).getNewProxyInstance().DbNXlk();
        }
        if (interfaceC55843xrb instanceof C55779xqQ) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55779xqQ) interfaceC55843xrb2).fARcdN().DbNXlk();
        }
        if (!(interfaceC55843xrb instanceof C55783xqU)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55783xqU) interfaceC55843xrb2).ejfBZ().DbNXlk();
    }

    public final C56235xyw djBIcL() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).getNewProxyInstance().copydefault();
        }
        if (interfaceC55843xrb instanceof C55779xqQ) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55779xqQ) interfaceC55843xrb2).fARcdN().copydefault();
        }
        if (!(interfaceC55843xrb instanceof C55783xqU)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55783xqU) interfaceC55843xrb2).ejfBZ().copydefault();
    }

    public final C56156xxW gEmmrt() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (interfaceC55843xrb instanceof C55786xqX) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            return ((C55786xqX) interfaceC55843xrb2).getNewProxyInstance().AhwBna();
        }
        if (interfaceC55843xrb instanceof C55779xqQ) {
            InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
            if (interfaceC55843xrb4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb4;
            }
            return ((C55779xqQ) interfaceC55843xrb2).fARcdN().AhwBna();
        }
        if (!(interfaceC55843xrb instanceof C55783xqU)) {
            return null;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        return ((C55783xqU) interfaceC55843xrb2).ejfBZ().AhwBna();
    }

    public final HashMap<String, Boolean> isConnected() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.djBIcL();
    }

    public final HashMap<String, String> values() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.AYXKKw();
    }

    public final boolean zuBGHE() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.iwGUEr();
    }

    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.OLrzqt(str);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.AEQbTJ(str);
    }

    public final void AEQbTJ(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.OLrzqt(z, str);
    }

    public final void EZpvd(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.EZpvd(z, str);
    }

    public final boolean AxsJAY() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.getFieldNames();
    }

    public final boolean sSMYrx() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.hDKMBd();
    }

    public final String zsXlph() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.fIwbmz();
    }

    public final String fJNWhG() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.fetchVPNInfo();
    }

    public final C55851xrj wlaJM() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.AuCTel();
    }

    public final C55851xrj fIwbmz() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.values();
    }

    public final void AEQbTJ() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.EZpvd();
    }

    public final void EZpvd() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.KWHzl();
    }

    public final Pair<Boolean, Object> copydefault() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.OLrzqt();
    }

    public final Pair<Boolean, Object> OLrzqt() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.AEQbTJ();
    }

    public final Pair<Boolean, String> KWHzl() {
        Pair<Boolean, String> pairFARcdN;
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        return (interfaceC55873xsE == null || (pairFARcdN = interfaceC55873xsE.fARcdN()) == null) ? new Pair<>(Boolean.TRUE, "") : pairFARcdN;
    }

    public final boolean AhwBna() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        InterfaceC55843xrb interfaceC55843xrb2 = null;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        if (!(interfaceC55843xrb instanceof InterfaceC55873xsE)) {
            InterfaceC55843xrb interfaceC55843xrb3 = this.AEQbTJ;
            if (interfaceC55843xrb3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC55843xrb2 = interfaceC55843xrb3;
            }
            interfaceC55843xrb2.copydefault();
            return true;
        }
        InterfaceC55843xrb interfaceC55843xrb4 = this.AEQbTJ;
        if (interfaceC55843xrb4 == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb4 = null;
        }
        if (!((InterfaceC55873xsE) interfaceC55843xrb4).wlaJM()) {
            return false;
        }
        InterfaceC55843xrb interfaceC55843xrb5 = this.AEQbTJ;
        if (interfaceC55843xrb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC55843xrb2 = interfaceC55843xrb5;
        }
        interfaceC55843xrb2.copydefault();
        return true;
    }

    public final Parcelable fARcdN() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.isConnected();
    }

    public final String AuCTelauCTel() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.fJNWhG();
    }

    public final String ejfBZ() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.AkhnZx();
    }

    public final List<C55276xgr> copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TpSlTypeConfigData[] tpSlTypeConfigDataArrValues = TpSlTypeConfigData.values();
        ArrayList arrayList = new ArrayList(tpSlTypeConfigDataArrValues.length);
        for (TpSlTypeConfigData tpSlTypeConfigData : tpSlTypeConfigDataArrValues) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(tpSlTypeConfigData.getTitle()), tpSlTypeConfigData.getType(), null, Intrinsics.EZpvd((Object) tpSlTypeConfigData.getType(), (Object) str), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final C55850xri uzCIH() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        if (interfaceC55873xsE != null) {
            return interfaceC55873xsE.zsXlph();
        }
        return null;
    }

    public final TpSlTriggerParam zLjUOn() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        if (interfaceC55873xsE != null) {
            return interfaceC55873xsE.AubY();
        }
        return null;
    }

    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.copydefault(str);
    }

    public final Pair<String, Integer> getFieldNames() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.DbNXlk();
    }

    public final String AkhnZx() {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        return interfaceC55843xrb.valueOf();
    }

    public final void OLrzqt(boolean z) {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.copydefault(z);
    }

    public final void AEQbTJ(boolean z) {
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        interfaceC55843xrb.EZpvd(z);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        if (interfaceC55873xsE != null) {
            interfaceC55873xsE.AYXKKw(str);
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC55843xrb interfaceC55843xrb = this.AEQbTJ;
        if (interfaceC55843xrb == null) {
            Intrinsics.gEmmrt("");
            interfaceC55843xrb = null;
        }
        InterfaceC55873xsE interfaceC55873xsE = interfaceC55843xrb instanceof InterfaceC55873xsE ? (InterfaceC55873xsE) interfaceC55843xrb : null;
        if (interfaceC55873xsE != null) {
            interfaceC55873xsE.KWHzl(str);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        C54308xDp c54308xDpHDKMBd = hDKMBd();
        if (c54308xDpHDKMBd != null) {
            arrayList.add(c54308xDpHDKMBd);
        }
        C56235xyw c56235xywDjBIcL = djBIcL();
        if (c56235xywDjBIcL != null) {
            arrayList.add(c56235xywDjBIcL);
        }
        C54301xDi c54301xDiAuCTel = AuCTel();
        if (c54301xDiAuCTel != null) {
            arrayList.add(c54301xDiAuCTel);
        }
        C56156xxW c56156xxWGEmmrt = gEmmrt();
        if (c56156xxWGEmmrt != null) {
            arrayList.add(c56156xxWGEmmrt);
        }
        return arrayList;
    }
}
