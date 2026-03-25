package com.okinc.business.market.features.meme.filter.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C28666kfA;
import o.C28667kfB;
import o.C28714kfw;
import o.C28717kfz;
import o.InterfaceC28693kfb;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<C28717kfz> AEQbTJ;
    public final MutableStateFlow<C28717kfz> AYXKKw;
    public final MutableStateFlow<List<C28714kfw>> AhwBna;
    public final MutableStateFlow<C28717kfz> AkhnZx;
    public final StateFlow<C28717kfz> AuCTel;
    public final CoroutineDispatcher AuCTelauCTel;
    public boolean AubY;
    public String AwvSrB;
    public String AxsJAY;
    public final StateFlow<C28717kfz> DTwDnp;
    public final MutableStateFlow<C28666kfA> DbNXlk;
    public final MutableStateFlow<C28717kfz> EZpvd;
    public final MutableStateFlow<C28717kfz> KWHzl;
    public final MutableStateFlow<C28717kfz> OLrzqt;
    public final StateFlow<C28717kfz> ORxRYg;
    public final StateFlow<C28717kfz> OcIXYQ;
    public final StateFlow<C28666kfA> QKVWgx;
    public final StateFlow<C28717kfz> QOLQEE;
    public final StateFlow<C28717kfz> QUSxYX;
    public final SavedStateHandle QVAiDq;
    public List<String> QbewEr;
    public final StateFlow<C28717kfz> QfsBiF;
    public final StateFlow<List<String>> RJOkX;
    public final MutableStateFlow<C28717kfz> copydefault;
    public final Map<String, Job> dNCPSb;
    public final MutableStateFlow<C28717kfz> djBIcL;
    public final StateFlow<C28667kfB> djSkpj;
    public final MutableStateFlow<C28667kfB> ejfBZ;
    public final MutableStateFlow<C28717kfz> fARcdN;
    public final MutableStateFlow<C28717kfz> fIwbmz;
    public final MutableStateFlow<List<String>> fJNWhG;
    public final MutableStateFlow<C28717kfz> fetchVPNInfo;
    public final MutableStateFlow<C28717kfz> gEmmrt;
    public final InterfaceC28693kfb gHZMYf;
    public final StateFlow<C28717kfz> getFieldNames;
    public final StateFlow<C28717kfz> getNewProxyInstance;
    public final StateFlow<C28717kfz> hDKMBd;
    public final MutableStateFlow<C28717kfz> isConnected;
    public final StateFlow<C28717kfz> iwGUEr;
    public final StateFlow<C28717kfz> sSMYrx;
    public final StateFlow<C28717kfz> uzCIH;
    public final MutableStateFlow<C28717kfz> valueOf;
    public final MutableStateFlow<C28717kfz> values;
    public final StateFlow<C28717kfz> wlaJM;
    public MemeFilter zLjUOn;
    public final StateFlow<List<C28714kfw>> zsXlph;
    public final StateFlow<C28717kfz> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> AEQbTJ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> AhwBna() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> AkhnZx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> AuCTel() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> DbNXlk() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> EZpvd() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> KWHzl() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> OLrzqt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> copydefault() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> ejfBZ() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> fARcdN() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28666kfA> fIwbmz() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> fJNWhG() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> fetchVPNInfo() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C28714kfw>> gEmmrt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28667kfB> getFieldNames() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> isConnected() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<String>> iwGUEr() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> uzCIH() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28717kfz> valueOf() {
        return this.uzCIH;
    }

    @yCM
    public MemeFilterViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC28693kfb interfaceC28693kfb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC28693kfb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.QVAiDq = savedStateHandle;
        this.gHZMYf = interfaceC28693kfb;
        this.AuCTelauCTel = coroutineDispatcher;
        MutableStateFlow<C28717kfz> MutableStateFlow = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.valueOf = MutableStateFlow;
        this.wlaJM = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C28717kfz> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.copydefault = MutableStateFlow2;
        this.hDKMBd = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<C28717kfz> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.KWHzl = MutableStateFlow3;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C28717kfz> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.djBIcL = MutableStateFlow4;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<C28717kfz> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.OLrzqt = MutableStateFlow5;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<C28717kfz> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.AEQbTJ = MutableStateFlow6;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<C28717kfz> MutableStateFlow7 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.EZpvd = MutableStateFlow7;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<C28717kfz> MutableStateFlow8 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.AYXKKw = MutableStateFlow8;
        this.sSMYrx = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<C28717kfz> MutableStateFlow9 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.AkhnZx = MutableStateFlow9;
        this.DTwDnp = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<C28717kfz> MutableStateFlow10 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.fetchVPNInfo = MutableStateFlow10;
        this.QOLQEE = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<C28717kfz> MutableStateFlow11 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.fARcdN = MutableStateFlow11;
        this.QUSxYX = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<C28717kfz> MutableStateFlow12 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.values = MutableStateFlow12;
        this.ORxRYg = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<C28666kfA> MutableStateFlow13 = StateFlowKt.MutableStateFlow(new C28666kfA(null, null, 3, null));
        this.DbNXlk = MutableStateFlow13;
        this.QKVWgx = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<C28717kfz> MutableStateFlow14 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.fIwbmz = MutableStateFlow14;
        this.QfsBiF = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<C28717kfz> MutableStateFlow15 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.gEmmrt = MutableStateFlow15;
        this.zuBGHE = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<C28717kfz> MutableStateFlow16 = StateFlowKt.MutableStateFlow(new C28717kfz(null, null, false, 7, null));
        this.isConnected = MutableStateFlow16;
        this.OcIXYQ = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow<C28667kfB> MutableStateFlow17 = StateFlowKt.MutableStateFlow(new C28667kfB(0, false, 3, null));
        this.ejfBZ = MutableStateFlow17;
        this.djSkpj = FlowKt.asStateFlow(MutableStateFlow17);
        this.AxsJAY = "";
        this.AwvSrB = "";
        MutableStateFlow<List<String>> MutableStateFlow18 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.fJNWhG = MutableStateFlow18;
        this.RJOkX = FlowKt.asStateFlow(MutableStateFlow18);
        this.dNCPSb = new LinkedHashMap();
        MutableStateFlow<List<C28714kfw>> MutableStateFlow19 = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow19;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow19);
        this.QbewEr = yDY.AhwBna();
    }

    public final MemeFilterParams hDKMBd() {
        return (MemeFilterParams) this.QVAiDq.get("key.meme_filter_params");
    }

    public final void OLrzqt(MemeFilterParams memeFilterParams) {
        MemeProtocolFilterUiData memeProtocolFilterUiDataEZpvd;
        if (memeFilterParams != null) {
            this.zLjUOn = memeFilterParams.copydefault();
            MemeFilter memeFilterKWHzl = memeFilterParams.KWHzl();
            if (memeFilterKWHzl != null) {
                KWHzl(memeFilterKWHzl);
            }
            MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParamsEZpvd = memeFilterParams.EZpvd();
            List<String> listOLrzqt = (memeProtocolFilterBottomSheetParamsEZpvd == null || (memeProtocolFilterUiDataEZpvd = memeProtocolFilterBottomSheetParamsEZpvd.EZpvd()) == null) ? null : memeProtocolFilterUiDataEZpvd.OLrzqt();
            if (listOLrzqt == null) {
                listOLrzqt = yDY.AhwBna();
            }
            this.QbewEr = listOLrzqt;
        }
        djBIcL();
    }

    public final void KWHzl(MemeFilter memeFilter) {
        MutableStateFlow<C28717kfz> mutableStateFlow = this.valueOf;
        C28717kfz.Application application = C28717kfz.Companion;
        mutableStateFlow.setValue(application.copydefault(memeFilter.getTop10HoldingMin(), memeFilter.getTop10HoldingMax()));
        this.copydefault.setValue(application.copydefault(memeFilter.getDevHoldingMin(), memeFilter.getDevHoldingMax()));
        this.KWHzl.setValue(application.copydefault(memeFilter.getInsiderMin(), memeFilter.getInsiderMax()));
        this.djBIcL.setValue(application.copydefault(memeFilter.getSniperMin(), memeFilter.getSniperMax()));
        this.OLrzqt.setValue(application.copydefault(memeFilter.getBundleMin(), memeFilter.getBundleMax()));
        this.AEQbTJ.setValue(application.copydefault(memeFilter.getFreshHoldMin(), memeFilter.getFreshHoldMax()));
        this.EZpvd.setValue(application.copydefault(memeFilter.getPhishHoldMin(), memeFilter.getPhishHoldMax()));
        this.AYXKKw.setValue(application.copydefault(memeFilter.getBondingMin(), memeFilter.getBondingMax()));
        this.AkhnZx.setValue(application.copydefault(memeFilter.getMigratedTokensMin(), memeFilter.getMigratedTokensMax()));
        this.fetchVPNInfo.setValue(application.copydefault(memeFilter.getMarketCapMin(), memeFilter.getMarketCapMax()));
        this.fARcdN.setValue(application.copydefault(memeFilter.getVolumeMin(), memeFilter.getVolumeMax()));
        this.values.setValue(application.copydefault(memeFilter.getHoldersMin(), memeFilter.getHoldersMax()));
        this.DbNXlk.setValue(new C28666kfA(memeFilter.getTokenAgeUnit(), application.copydefault(memeFilter.getTokenAgeMin(), memeFilter.getTokenAgeMax())));
        this.fIwbmz.setValue(application.copydefault(memeFilter.getTransactionsMin(), memeFilter.getTransactionsMax()));
        this.gEmmrt.setValue(application.copydefault(memeFilter.getBuyMin(), memeFilter.getBuyMax()));
        this.isConnected.setValue(application.copydefault(memeFilter.getSellMin(), memeFilter.getSellMax()));
        this.AxsJAY = memeFilter.getKeyword();
        this.AwvSrB = memeFilter.getKeywordExclude();
        this.fJNWhG.setValue(memeFilter.getSelectedSocialData());
        zLjUOn();
    }

    public final void DbNXlk(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("top10Holding", str, str2, this.valueOf);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("devHolding", str, str2, this.copydefault);
    }

    public final void AhwBna(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("insider", str, str2, this.KWHzl);
    }

    public final void fetchVPNInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("sniper", str, str2, this.djBIcL);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("bundle", str, str2, this.OLrzqt);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("freshHold", str, str2, this.AEQbTJ);
    }

    public final void gEmmrt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("phishHold", str, str2, this.EZpvd);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("bonding", str, str2, this.AYXKKw);
    }

    public final void AYXKKw(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("migratedTokens", str, str2, this.AkhnZx);
    }

    public final void valueOf(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("marketCap", str, str2, this.fetchVPNInfo);
    }

    public final void values(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("volume", str, str2, this.fARcdN);
    }

    public final void djBIcL(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("holders", str, str2, this.values);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull TokenAgeType tokenAgeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Job job = this.dNCPSb.get("tokenAge");
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        MutableStateFlow<C28666kfA> mutableStateFlow = this.DbNXlk;
        mutableStateFlow.setValue(new C28666kfA(tokenAgeType, new C28717kfz(str, str2, mutableStateFlow.getValue().KWHzl().copydefault())));
        this.dNCPSb.put("tokenAge", C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new MemeFilterViewModel$updateTokenAge$1(str, str2, this, tokenAgeType, null), 2, null));
    }

    public final void AkhnZx(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("transactions", str, str2, this.fIwbmz);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("buy", str, str2, this.gEmmrt);
    }

    public final void isConnected(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd("sell", str, str2, this.isConnected);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AxsJAY = StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
        zLjUOn();
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AwvSrB = StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
        zLjUOn();
    }

    public final void AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fJNWhG.setValue(list);
        zLjUOn();
    }

    public final void EZpvd(String str, String str2, String str3, MutableStateFlow<C28717kfz> mutableStateFlow) {
        Job job = this.dNCPSb.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        mutableStateFlow.setValue(new C28717kfz(str2, str3, mutableStateFlow.getValue().copydefault()));
        mutableStateFlow.setValue(C28717kfz.Companion.copydefault(str2, str3));
        zLjUOn();
    }

    public final void zLjUOn() {
        MemeFilter memeFilterCopydefault;
        int i = 0;
        List listGEmmrt = yDY.gEmmrt(this.valueOf.getValue(), this.copydefault.getValue(), this.KWHzl.getValue(), this.djBIcL.getValue(), this.OLrzqt.getValue(), this.AEQbTJ.getValue(), this.EZpvd.getValue(), this.AYXKKw.getValue(), this.AkhnZx.getValue(), this.fetchVPNInfo.getValue(), this.fARcdN.getValue(), this.values.getValue(), this.DbNXlk.getValue().KWHzl(), this.fIwbmz.getValue(), this.gEmmrt.getValue(), this.isConnected.getValue());
        if (!(listGEmmrt instanceof Collection) || !listGEmmrt.isEmpty()) {
            Iterator it = listGEmmrt.iterator();
            while (it.hasNext()) {
                if (((C28717kfz) it.next()).copydefault() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        MemeFilter memeFilterValues = values();
        MemeFilterParams memeFilterParamsHDKMBd = hDKMBd();
        if (memeFilterParamsHDKMBd == null || (memeFilterCopydefault = memeFilterParamsHDKMBd.KWHzl()) == null) {
            MemeFilterParams memeFilterParamsHDKMBd2 = hDKMBd();
            memeFilterCopydefault = memeFilterParamsHDKMBd2 != null ? memeFilterParamsHDKMBd2.copydefault() : null;
            if (memeFilterCopydefault == null) {
                memeFilterCopydefault = new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null);
            }
        }
        this.ejfBZ.setValue(new C28667kfB(i, !Intrinsics.EZpvd(memeFilterValues, memeFilterCopydefault)));
    }

    public final void getNewProxyInstance() {
        MemeFilter memeFilter = this.zLjUOn;
        if (memeFilter == null) {
            memeFilter = new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null);
        }
        KWHzl(memeFilter);
    }

    public final MemeFilter values() {
        return new MemeFilter(this.valueOf.getValue().AEQbTJ(), this.valueOf.getValue().EZpvd(), this.copydefault.getValue().AEQbTJ(), this.copydefault.getValue().EZpvd(), this.KWHzl.getValue().AEQbTJ(), this.KWHzl.getValue().EZpvd(), this.djBIcL.getValue().AEQbTJ(), this.djBIcL.getValue().EZpvd(), this.OLrzqt.getValue().AEQbTJ(), this.OLrzqt.getValue().EZpvd(), this.AEQbTJ.getValue().AEQbTJ(), this.AEQbTJ.getValue().EZpvd(), this.EZpvd.getValue().AEQbTJ(), this.EZpvd.getValue().EZpvd(), this.AYXKKw.getValue().AEQbTJ(), this.AYXKKw.getValue().EZpvd(), this.AkhnZx.getValue().AEQbTJ(), this.AkhnZx.getValue().EZpvd(), this.fetchVPNInfo.getValue().AEQbTJ(), this.fetchVPNInfo.getValue().EZpvd(), this.fARcdN.getValue().AEQbTJ(), this.fARcdN.getValue().EZpvd(), this.values.getValue().AEQbTJ(), this.values.getValue().EZpvd(), this.DbNXlk.getValue().KWHzl().AEQbTJ(), this.DbNXlk.getValue().KWHzl().EZpvd(), this.DbNXlk.getValue().copydefault(), this.fIwbmz.getValue().AEQbTJ(), this.fIwbmz.getValue().EZpvd(), this.gEmmrt.getValue().AEQbTJ(), this.gEmmrt.getValue().EZpvd(), this.isConnected.getValue().AEQbTJ(), this.isConnected.getValue().EZpvd(), this.AxsJAY, this.AwvSrB, this.RJOkX.getValue(), 0, 0, 16, (DefaultConstructorMarker) null);
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AuCTelauCTel, null, new MemeFilterViewModel$getBlacklist$1(this, null), 2, null);
    }

    public final void EZpvd(@NotNull C28714kfw c28714kfw) {
        Intrinsics.checkNotNullParameter(c28714kfw, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AuCTelauCTel, null, new MemeFilterViewModel$removeFromBlackList$1(this, c28714kfw, null), 2, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Iterator<T> it = this.dNCPSb.values().iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.dNCPSb.clear();
    }
}
