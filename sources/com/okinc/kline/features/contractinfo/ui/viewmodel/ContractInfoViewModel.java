package com.okinc.kline.features.contractinfo.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.UserTierData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C36123oQc;
import o.C43251rlk;
import o.C54282xCq;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C56111xwe;
import o.C56131xwy;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC55701xos;
import o.InterfaceC58217yxC;
import o.oPW;
import o.oPY;
import o.xBF;
import o.xBJ;
import o.xIC;
import o.xKK;
import o.xMJ;
import o.xVE;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel extends AbstractC49411unz<C36123oQc> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C54571xNh AEQbTJ;
    public final oPW AYXKKw;
    public boolean AhwBna;
    public final C56111xwe<xMJ.StateListAnimator> AkhnZx;
    public String AuCTel;
    public String DbNXlk;
    public final C54282xCq EZpvd;
    public final C56111xwe<List<TickersData>> KWHzl;
    public List<oPY> copydefault;
    public String djBIcL;
    public String fARcdN;
    public InterfaceC58217yxC fIwbmz;
    public AbstractC54531xLw fetchVPNInfo;
    public String gEmmrt;
    public final xBJ isConnected;
    public BizInstrument valueOf;
    public final xBF values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<TickersData>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<xMJ.StateListAnimator> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public ContractInfoViewModel(@NotNull oPW opw) {
        super(new C36123oQc(null, 1, null));
        Intrinsics.checkNotNullParameter(opw, "");
        this.AYXKKw = opw;
        this.values = new xBF();
        this.isConnected = new xBJ();
        this.EZpvd = new C54282xCq();
        this.gEmmrt = "";
        this.DbNXlk = "";
        this.AuCTel = "";
        this.AkhnZx = new C56111xwe<>();
        this.KWHzl = new C56111xwe<>();
        this.djBIcL = "";
        this.copydefault = yDY.AhwBna();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final InterfaceC54581xNr OLrzqt() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) {
            return null;
        }
        return interfaceC54577xNn.OLrzqt();
    }

    public final void AEQbTJ(MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw) {
        if (marketCoinInfo == null) {
            return;
        }
        this.fetchVPNInfo = abstractC54531xLw;
        this.AhwBna = false;
        this.djBIcL = "";
        this.fARcdN = "";
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContractInfoViewModel$loadContractInfo$1(this, marketCoinInfo, abstractC54531xLw, null), 3, null), "loadContractInfo");
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        copydefault();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContractInfoViewModel$updateMarkPrice$1(this, str, null), 3, null);
    }

    public static /* synthetic */ String fmtMarkPriceWithSign$default(ContractInfoViewModel contractInfoViewModel, String str, BizInstrument bizInstrument, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return contractInfoViewModel.AEQbTJ(str, bizInstrument, z);
    }

    public final String AEQbTJ(String str, BizInstrument bizInstrument, boolean z) {
        AbstractC54531xLw abstractC54531xLw;
        String instFamily;
        if (str.length() == 0 || (abstractC54531xLw = this.fetchVPNInfo) == null) {
            return "--";
        }
        if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
            instFamily = "";
        }
        C54536xML c54536xMLDjBIcL = abstractC54531xLw.gEmmrt(instFamily).KWHzl(str).isConnected().djBIcL();
        if (z) {
            return C54536xML.toSafeString$default(c54536xMLDjBIcL.AkhnZx(), false, 1, null);
        }
        return C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
    }

    public final void AEQbTJ(String str, String str2, String str3) {
        xIC xicGEmmrt;
        if (Intrinsics.EZpvd((Object) str2, (Object) "SPOT")) {
            AEQbTJ(str, str2);
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xicGEmmrt = interfaceC54581xNrOLrzqt.gEmmrt()) == null) {
            return;
        }
        xicGEmmrt.KWHzl(str2, (36 & 2) != 0 ? null : str, (36 & 4) != 0 ? null : null, (36 & 8) != 0 ? null : str3, (36 & 16) != 0 ? null : str3, (36 & 32) != 0 ? null : null, new ActionBar());
    }

    public static final class ActionBar implements InterfaceC55701xos<List<? extends UserTierData>> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, List<UserTierData> list, Exception exc) {
            if (!z || list == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(ContractInfoViewModel.this), null, null, new ContractInfoViewModel$loadLeverage$1$result$1(list, ContractInfoViewModel.this, null), 3, null);
        }
    }

    public final void AEQbTJ(String str, String str2) {
        xBF xbf = this.values;
        xbf.KWHzl(str);
        xbf.EZpvd(xVE.copydefault.EZpvd(str2));
        xbf.OLrzqt("cross");
        xbf.KWHzl(new Function1() { // from class: o.oQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractInfoViewModel.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbf, 0L, 1, null);
    }

    public final void copydefault() {
        if (!this.AhwBna && C33129mqd.OLrzqt((CharSequence) this.djBIcL) && C33129mqd.OLrzqt((CharSequence) this.fARcdN)) {
            this.AhwBna = true;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContractInfoViewModel$calculateAndUpdateOpenInterest$1(this, null), 3, null);
        }
    }

    public final void OLrzqt(String str, String str2) {
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt2.fetchVPNInfo()) == null) {
            return;
        }
        c56131xwyFetchVPNInfo.EZpvd(null, suggestedInstrument$default != null ? suggestedInstrument$default.getUnderlying() : null, new Activity(suggestedInstrument$default));
    }

    public static final class Activity implements InterfaceC55701xos<List<? extends IndexTickersData>> {
        public final /* synthetic */ BizInstrument KWHzl;

        public Activity(BizInstrument bizInstrument) {
            this.KWHzl = bizInstrument;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, List<? extends IndexTickersData> list, Exception exc) {
            EZpvd2(z, (List<IndexTickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, List<IndexTickersData> list, Exception exc) {
            if (z && C33129mqd.KWHzl((Collection) list)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(ContractInfoViewModel.this), null, null, new ContractInfoViewModel$loadUnderlyingIndex$1$result$1(list, this.KWHzl, ContractInfoViewModel.this, null), 3, null);
            }
        }
    }

    public final void copydefault(String str, String str2) {
        this.isConnected.AYXKKw();
        xBJ xbj = this.isConnected;
        xbj.copydefault(str2);
        xbj.EZpvd((String) null);
        xbj.OLrzqt(str);
        xbj.KWHzl(new Function1() { // from class: o.oQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractInfoViewModel.copydefault(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbj, 0L, 1, null);
    }

    public final void OLrzqt(String str) {
        C54282xCq c54282xCq = this.EZpvd;
        c54282xCq.AEQbTJ(this.KWHzl);
        c54282xCq.AuCTel();
        c54282xCq.AEQbTJ(str);
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContractInfoViewModel$update24hVolume$1(str, this, null), 3, null);
    }

    public final void EZpvd(AbstractC54531xLw abstractC54531xLw, String str) {
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        if (abstractC54531xLw != null) {
            if (str == null) {
                str = "";
            }
            c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, str, null, 2, null);
        } else {
            c54571xNhCreateTradeConverterWithIndex$default = null;
        }
        this.AEQbTJ = c54571xNhCreateTradeConverterWithIndex$default;
        this.AuCTel = c54571xNhCreateTradeConverterWithIndex$default != null ? c54571xNhCreateTradeConverterWithIndex$default.OLrzqt() : null;
    }

    @Override // o.AbstractC49411unz, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC58217yxC interfaceC58217yxC = this.fIwbmz;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.values.AYXKKw();
        this.isConnected.AYXKKw();
        this.EZpvd.AYXKKw();
    }

    public final Object AEQbTJ(ContractInfoItemType contractInfoItemType, String str, Continuation<? super Unit> continuation) {
        List<oPY> list = this.copydefault;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (oPY opyCopy$default : list) {
            if (opyCopy$default.copydefault() == contractInfoItemType) {
                opyCopy$default = oPY.copy$default(opyCopy$default, null, null, str, null, 11, null);
            }
            arrayList.add(opyCopy$default);
        }
        this.copydefault = arrayList;
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel$updateItemValue$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C36123oQc) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C36123oQc) obj).copydefault((InterfaceC49371unL) obj2);
            }
        }, new InterfaceC49371unL.Activity(this.copydefault), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public static final Unit EZpvd(ContractInfoViewModel contractInfoViewModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((Collection) responseData.getData())) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(contractInfoViewModel), null, null, new ContractInfoViewModel$loadLeverageForSpotMargin$1$1$1((LeverIntervalData) CollectionsKt___CollectionsKt.AuCTelauCTel((List) data), contractInfoViewModel, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ContractInfoViewModel contractInfoViewModel, ResponseData responseData) {
        List list;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (List) responseData.getData()) != null && (!list.isEmpty())) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(contractInfoViewModel), null, null, new ContractInfoViewModel$loadMarkPrice$1$1$1(responseData, contractInfoViewModel, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
