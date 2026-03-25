package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.tokenlist.domain.model.TabType;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$addTokenToSubscribe$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$handleTokenListData$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$loadCollectionGroups$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$loadTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$signalFavoriteListChange$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListContentViewModel$updateFavoriteTokens$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC28383kZj;
import o.InterfaceC28386kZm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.law, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30429law extends AbstractC33073mpa {
    public final MutableStateFlow<InterfaceC28383kZj> AEQbTJ;
    public java.lang.String AYXKKw;
    public final C28388kZo AhwBna;
    public final C29712kyn AkhnZx;
    public TradingBizType AuCTel;
    public boolean DbNXlk;
    public final MutableStateFlow<InterfaceC28386kZm> EZpvd;
    public java.lang.String KWHzl;
    public final StateFlow<InterfaceC28383kZj> OLrzqt;
    public final C28391kZr copydefault;
    public java.lang.String djBIcL;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public DexMultiTokenInfoBean fIwbmz;
    public final StateFlow<InterfaceC28386kZm> fJNWhG;
    public java.lang.String fetchVPNInfo;
    public final C26109jSg gEmmrt;
    public final kKG hDKMBd;
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>> isConnected;
    public java.lang.String iwGUEr;
    public final C27770kCs uzCIH;
    public final C28394kZu valueOf;
    public final C28398kZy values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28386kZm> AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.fIwbmz = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.DbNXlk ? this.AYXKKw : this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull TradingBizType tradingBizType, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(tradingBizType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AuCTel = tradingBizType;
        this.ejfBZ = z;
        this.AYXKKw = str;
        this.fARcdN = str2;
        this.DbNXlk = z2;
        this.djBIcL = str3;
        this.iwGUEr = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28383kZj> copydefault() {
        return this.OLrzqt;
    }

    public C30429law(@NotNull C28394kZu c28394kZu, @NotNull C28398kZy c28398kZy, @NotNull C28388kZo c28388kZo, @NotNull C27770kCs c27770kCs, @NotNull C26109jSg c26109jSg, @NotNull C28391kZr c28391kZr, @NotNull kKG kkg, @NotNull C29712kyn c29712kyn) {
        Intrinsics.checkNotNullParameter(c28394kZu, "");
        Intrinsics.checkNotNullParameter(c28398kZy, "");
        Intrinsics.checkNotNullParameter(c28388kZo, "");
        Intrinsics.checkNotNullParameter(c27770kCs, "");
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        Intrinsics.checkNotNullParameter(c28391kZr, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        this.valueOf = c28394kZu;
        this.values = c28398kZy;
        this.AhwBna = c28388kZo;
        this.uzCIH = c27770kCs;
        this.gEmmrt = c26109jSg;
        this.copydefault = c28391kZr;
        this.hDKMBd = kkg;
        this.AkhnZx = c29712kyn;
        this.AuCTel = TradingBizType.AdvancedMarket;
        this.AYXKKw = "";
        this.fARcdN = "";
        this.DbNXlk = true;
        this.djBIcL = "";
        this.ejfBZ = true;
        this.KWHzl = "";
        MutableStateFlow<InterfaceC28386kZm> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28386kZm.Dialog.AEQbTJ);
        this.EZpvd = MutableStateFlow;
        MutableStateFlow<InterfaceC28383kZj> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC28383kZj.Activity.copydefault);
        this.AEQbTJ = MutableStateFlow2;
        this.isConnected = new java.util.HashMap<>();
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final boolean valueOf() {
        return Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "chain_id_collection");
    }

    public final boolean KWHzl() {
        return Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "chain_id_all_network");
    }

    public final void djBIcL() {
        if (valueOf()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenListContentViewModel$loadCollectionGroups$1(this, null), 3, null);
        } else {
            this.AEQbTJ.setValue(InterfaceC28383kZj.ActionBar.copydefault);
        }
    }

    public static /* synthetic */ void loadTokenList$default(C30429law c30429law, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c30429law.OLrzqt(str, z);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (valueOf() && !AYXKKw()) {
            this.EZpvd.setValue(InterfaceC28386kZm.TaskDescription.EZpvd);
            return;
        }
        this.KWHzl = str;
        java.lang.String strOLrzqt = OLrzqt(str);
        if (!this.isConnected.containsKey(strOLrzqt)) {
            if (z) {
                this.EZpvd.setValue(InterfaceC28386kZm.Activity.EZpvd);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenListContentViewModel$loadTokenList$1(this, str, null), 3, null);
            return;
        }
        java.util.List<java.lang.Object> listAhwBna = this.isConnected.get(strOLrzqt);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (listAhwBna.isEmpty()) {
            this.EZpvd.setValue(new InterfaceC28386kZm.ActionBar(str.length() > 0));
        } else {
            this.EZpvd.setValue(new InterfaceC28386kZm.Application(listAhwBna, str.length() > 0));
        }
    }

    public final boolean AYXKKw() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.hDKMBd.valueOf();
        return (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.QfsBiF() || interfaceC9738bbJValueOf.zsXlph()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x013b -> B:52:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0145 -> B:55:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01c7 -> B:61:0x01d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<ChainTokensData> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TokenListContentViewModel$handleTokenListData$1 tokenListContentViewModel$handleTokenListData$1;
        TabType tabType;
        C30429law c30429law;
        java.util.Iterator it;
        TabType tabType2;
        TokenListContentViewModel$handleTokenListData$1 tokenListContentViewModel$handleTokenListData$12;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        if (continuation instanceof TokenListContentViewModel$handleTokenListData$1) {
            tokenListContentViewModel$handleTokenListData$1 = (TokenListContentViewModel$handleTokenListData$1) continuation;
            int i = tokenListContentViewModel$handleTokenListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenListContentViewModel$handleTokenListData$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenListContentViewModel$handleTokenListData$1 = new TokenListContentViewModel$handleTokenListData$1(this, continuation);
            }
        }
        java.lang.Object obj = tokenListContentViewModel$handleTokenListData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenListContentViewModel$handleTokenListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = list.iterator();
            int size = 0;
            while (it2.hasNext()) {
                java.util.List<DexMultiTokenInfoBean> tokenList = ((ChainTokensData) it2.next()).getTokenList();
                size += tokenList != null ? tokenList.size() : 0;
            }
            if (size == 0) {
                this.isConnected.put(OLrzqt(str), yDY.AhwBna());
                this.EZpvd.setValue(new InterfaceC28386kZm.ActionBar(str.length() > 0));
                return Unit.INSTANCE;
            }
            java.lang.String str3 = this.DbNXlk ? this.AYXKKw : this.fARcdN;
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "chain_id_collection")) {
                tabType = TabType.Collection;
            } else if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "chain_id_all_network")) {
                tabType = TabType.All;
            } else {
                tabType = TabType.SingleChain;
            }
            c30429law = this;
            it = list.iterator();
            tabType2 = tabType;
            tokenListContentViewModel$handleTokenListData$12 = tokenListContentViewModel$handleTokenListData$1;
            arrayList = arrayList2;
            str2 = str;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = tokenListContentViewModel$handleTokenListData$1.Z$0;
            java.util.Iterator it3 = (java.util.Iterator) tokenListContentViewModel$handleTokenListData$1.L$13;
            java.util.Collection collection = (java.util.Collection) tokenListContentViewModel$handleTokenListData$1.L$12;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) tokenListContentViewModel$handleTokenListData$1.L$11;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) tokenListContentViewModel$handleTokenListData$1.L$10;
            TabType tabType3 = (TabType) tokenListContentViewModel$handleTokenListData$1.L$9;
            java.lang.String str4 = (java.lang.String) tokenListContentViewModel$handleTokenListData$1.L$8;
            java.lang.String str5 = (java.lang.String) tokenListContentViewModel$handleTokenListData$1.L$7;
            java.util.Iterator it4 = (java.util.Iterator) tokenListContentViewModel$handleTokenListData$1.L$6;
            ChainTokensData chainTokensData = (ChainTokensData) tokenListContentViewModel$handleTokenListData$1.L$5;
            java.util.Iterator it5 = (java.util.Iterator) tokenListContentViewModel$handleTokenListData$1.L$4;
            TabType tabType4 = (TabType) tokenListContentViewModel$handleTokenListData$1.L$3;
            java.util.ArrayList arrayList4 = (java.util.ArrayList) tokenListContentViewModel$handleTokenListData$1.L$2;
            java.lang.String str6 = (java.lang.String) tokenListContentViewModel$handleTokenListData$1.L$1;
            C30429law c30429law2 = (C30429law) tokenListContentViewModel$handleTokenListData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            java.util.ArrayList arrayList5 = arrayList3;
            java.lang.String str7 = str4;
            ChainTokensData chainTokensData2 = chainTokensData;
            C30429law c30429law3 = c30429law2;
            TabType tabType5 = tabType4;
            java.util.Collection arrayList6 = collection;
            TabType tabType6 = tabType3;
            boolean z2 = z;
            TokenListContentViewModel$handleTokenListData$1 tokenListContentViewModel$handleTokenListData$13 = tokenListContentViewModel$handleTokenListData$1;
            arrayList = arrayList4;
            java.util.Iterator it6 = it5;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = dexMultiTokenInfoBean;
            java.lang.String str8 = str5;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objM7386unboximpl;
            if (tagWrapper != null) {
                arrayList6.add(tagWrapper);
            }
            java.lang.Object obj2 = objCopydefault;
            java.util.Iterator it7 = it4;
            C30429law c30429law4 = c30429law3;
            str2 = str6;
            ChainTokensData chainTokensData3 = chainTokensData2;
            if (it3.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it3.next();
                boolean z3 = z2;
                C29712kyn c29712kyn = c30429law4.AkhnZx;
                tokenListContentViewModel$handleTokenListData$13.L$0 = c30429law4;
                tokenListContentViewModel$handleTokenListData$13.L$1 = str2;
                tokenListContentViewModel$handleTokenListData$13.L$2 = arrayList;
                tokenListContentViewModel$handleTokenListData$13.L$3 = tabType5;
                tokenListContentViewModel$handleTokenListData$13.L$4 = it6;
                tokenListContentViewModel$handleTokenListData$13.L$5 = chainTokensData3;
                tokenListContentViewModel$handleTokenListData$13.L$6 = it7;
                tokenListContentViewModel$handleTokenListData$13.L$7 = str8;
                tokenListContentViewModel$handleTokenListData$13.L$8 = str7;
                tokenListContentViewModel$handleTokenListData$13.L$9 = tabType6;
                tokenListContentViewModel$handleTokenListData$13.L$10 = dexMultiTokenInfoBean2;
                tokenListContentViewModel$handleTokenListData$13.L$11 = arrayList5;
                tokenListContentViewModel$handleTokenListData$13.L$12 = arrayList6;
                tokenListContentViewModel$handleTokenListData$13.L$13 = it3;
                java.lang.String str9 = str2;
                tokenListContentViewModel$handleTokenListData$13.Z$0 = z3;
                java.util.Iterator it8 = it7;
                tokenListContentViewModel$handleTokenListData$13.label = 1;
                java.lang.Object objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, tokenListContentViewModel$handleTokenListData$13);
                objCopydefault = obj2;
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str6 = str9;
                chainTokensData2 = chainTokensData3;
                c30429law3 = c30429law4;
                it4 = it8;
                z2 = z3;
                objM7386unboximpl = objEZpvd;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objM7386unboximpl;
                if (tagWrapper2 != null) {
                }
                java.lang.Object obj22 = objCopydefault;
                java.util.Iterator it72 = it4;
                C30429law c30429law42 = c30429law3;
                str2 = str6;
                ChainTokensData chainTokensData32 = chainTokensData2;
                if (it3.hasNext()) {
                    java.util.Iterator it9 = it72;
                    objCopydefault = obj22;
                    arrayList5.add(new C28375kZb(dexMultiTokenInfoBean2, z2, tabType6, str7, str8, (java.util.List) arrayList6));
                    java.util.Iterator it10 = it9;
                    str2 = str2;
                    tokenListContentViewModel$handleTokenListData$12 = tokenListContentViewModel$handleTokenListData$13;
                    tabType2 = tabType5;
                    it = it6;
                    c30429law = c30429law42;
                    ChainTokensData chainTokensData4 = chainTokensData32;
                    if (!it10.hasNext()) {
                        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) it10.next();
                        boolean clickable = chainTokensData4.getClickable();
                        java.lang.String clickableMsg = chainTokensData4.getClickableMsg();
                        java.util.List<CompactTagData> t = dexMultiTokenInfoBean3.getT();
                        arrayList5 = arrayList;
                        obj22 = objCopydefault;
                        chainTokensData32 = chainTokensData4;
                        it72 = it10;
                        str7 = clickableMsg;
                        tabType6 = tabType2;
                        tabType5 = tabType6;
                        dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
                        str8 = str2;
                        tokenListContentViewModel$handleTokenListData$13 = tokenListContentViewModel$handleTokenListData$12;
                        arrayList6 = new java.util.ArrayList();
                        c30429law42 = c30429law;
                        it3 = t.iterator();
                        it6 = it;
                        z2 = clickable;
                        if (it3.hasNext()) {
                        }
                    } else if (it.hasNext()) {
                        chainTokensData4 = (ChainTokensData) it.next();
                        java.util.List<DexMultiTokenInfoBean> tokenList2 = chainTokensData4.getTokenList();
                        if (tokenList2 == null) {
                            tokenList2 = yDY.AhwBna();
                        }
                        if (chainTokensData4.getText().length() > 0 && (!tokenList2.isEmpty())) {
                            arrayList.add(new C28384kZk(chainTokensData4.getText()));
                        }
                        it10 = tokenList2.iterator();
                        if (!it10.hasNext()) {
                        }
                    } else {
                        c30429law.isConnected.put(c30429law.OLrzqt(str2), arrayList);
                        c30429law.EZpvd.setValue(new InterfaceC28386kZm.Application(arrayList, str2.length() > 0));
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
        OLrzqt("", true);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (!valueOf() || str.length() != 0) {
            return str;
        }
        java.lang.String str2 = this.fetchVPNInfo;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull FavoriteAction favoriteAction, @NotNull java.util.List<HomeToken> list, @NotNull java.util.List<java.lang.Integer> list2, @NotNull java.util.List<java.lang.Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        TokenListContentViewModel$updateFavoriteTokens$1 tokenListContentViewModel$updateFavoriteTokens$1;
        if (continuation instanceof TokenListContentViewModel$updateFavoriteTokens$1) {
            tokenListContentViewModel$updateFavoriteTokens$1 = (TokenListContentViewModel$updateFavoriteTokens$1) continuation;
            int i = tokenListContentViewModel$updateFavoriteTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenListContentViewModel$updateFavoriteTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenListContentViewModel$updateFavoriteTokens$1 = new TokenListContentViewModel$updateFavoriteTokens$1(this, continuation);
            }
        }
        TokenListContentViewModel$updateFavoriteTokens$1 tokenListContentViewModel$updateFavoriteTokens$12 = tokenListContentViewModel$updateFavoriteTokens$1;
        java.lang.Object obj = tokenListContentViewModel$updateFavoriteTokens$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenListContentViewModel$updateFavoriteTokens$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27770kCs c27770kCs = this.uzCIH;
        tokenListContentViewModel$updateFavoriteTokens$12.label = 1;
        java.lang.Object objEZpvd = c27770kCs.EZpvd(favoriteAction, list, list2, list3, tokenListContentViewModel$updateFavoriteTokens$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.law */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: updateFavoriteTokens-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8680updateFavoriteTokensyxL6bBk$default(C30429law c30429law, FavoriteAction favoriteAction, java.util.List list, java.util.List list2, java.util.List list3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        java.util.List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return c30429law.KWHzl(favoriteAction, list, list4, list3, continuation);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenListContentViewModel$signalFavoriteListChange$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (valueOf() || KWHzl() || Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) dexMultiTokenInfoBean.getChainId())) {
            this.isConnected.clear();
            OLrzqt(this.KWHzl, false);
        }
    }

    public final void gEmmrt() {
        OLrzqt(this.KWHzl, true);
    }

    public final Flow<kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean>> KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (dexMultiTokenInfoBean.isCustomCoin() || dexMultiTokenInfoBean.isSubscribeCoin()) {
            return FlowKt.flowOf(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, dexMultiTokenInfoBean));
        }
        return FlowKt.flow(new TokenListContentViewModel$addTokenToSubscribe$1(this, dexMultiTokenInfoBean, null));
    }
}
