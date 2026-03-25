package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressAllAssetToken;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.ChainAssetBean;
import com.okinc.business.defi.biz.net.bean.WalletAssetSummaryBean;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C14687dqE;
import o.C33129mqd;
import o.C54862xYb;
import o.C54880xYt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWT;
import o.eWW;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetViewModel$loadAddressAssetInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ List<Long> $chainIndexes;
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ boolean $manuallyRefresh;
    final /* synthetic */ boolean $needCalculateChain;
    final /* synthetic */ int $page;
    final /* synthetic */ boolean $singleChain;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ AddressProfileAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetViewModel$loadAddressAssetInformation$1(AddressProfileAssetViewModel addressProfileAssetViewModel, String str, List<Long> list, boolean z, int i, boolean z2, boolean z3, boolean z4, Continuation<? super AddressProfileAssetViewModel$loadAddressAssetInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetViewModel;
        this.$address = str;
        this.$chainIndexes = list;
        this.$forceRefresh = z;
        this.$page = i;
        this.$needCalculateChain = z2;
        this.$singleChain = z3;
        this.$manuallyRefresh = z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetViewModel$loadAddressAssetInformation$1(this.this$0, this.$address, this.$chainIndexes, this.$forceRefresh, this.$page, this.$needCalculateChain, this.$singleChain, this.$manuallyRefresh, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetViewModel$loadAddressAssetInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        AbstractC43419rot abstractC43419rot;
        boolean z;
        boolean z2;
        AddressProfileAssetViewModel addressProfileAssetViewModel;
        List<Long> list;
        AbstractC43419rot abstractC43419rot2;
        AddressAllAssetResponse addressAllAssetResponse;
        AbstractC43419rot abstractC43419rot3;
        int total;
        int pageSize;
        WalletAssetSummaryBean walletAssetSummary;
        String tokenTotalCurrencyAmount;
        BigDecimal bigDecimal;
        String strConvertToString$default;
        MutableSharedFlow<eWT> mutableSharedFlowEjfBZ;
        eWT ewt;
        AbstractC43419rot abstractC43419rot4;
        AddressProfileAssetViewModel addressProfileAssetViewModel2;
        MutableSharedFlow<List<AddressTokenAsset>> mutableSharedFlowIsConnected;
        AddressAllAssetToken tokens;
        List<AddressTokenAsset> listAhwBna;
        MutableSharedFlow<Boolean> mutableSharedFlowValues;
        Boolean boolKWHzl;
        AbstractC43419rot abstractC43419rot5;
        boolean z3;
        AddressProfileAssetViewModel addressProfileAssetViewModel3;
        AbstractC43419rot abstractC43419rot6;
        AddressProfileAssetViewModel addressProfileAssetViewModel4;
        MutableSharedFlow<List<AddressTokenAsset>> mutableSharedFlowIsConnected2;
        List<AddressTokenAsset> listAhwBna2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                eWW eww = this.this$0.djBIcL;
                String str = this.$address;
                List<Long> list2 = this.$chainIndexes;
                boolean z4 = this.$forceRefresh;
                int i = this.$page;
                int i2 = this.this$0.fJNWhG;
                this.label = 1;
                objEZpvd = eww.EZpvd(str, list2, false, z4, i, i2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objEZpvd;
                z = this.$needCalculateChain;
                AddressProfileAssetViewModel addressProfileAssetViewModel5 = this.this$0;
                z2 = this.$singleChain;
                List<Long> list3 = this.$chainIndexes;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    AddressAllAssetResponse addressAllAssetResponse2 = (AddressAllAssetResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    if (z) {
                        addressProfileAssetViewModel5.AEQbTJ().clear();
                    }
                    MutableSharedFlow<Boolean> mutableSharedFlowAhwBna = addressProfileAssetViewModel5.AhwBna();
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.L$0 = abstractC43419rot;
                    this.L$1 = addressProfileAssetViewModel5;
                    this.L$2 = list3;
                    this.L$3 = abstractC43419rot;
                    this.L$4 = addressAllAssetResponse2;
                    this.Z$0 = z;
                    this.Z$1 = z2;
                    this.label = 2;
                    if (mutableSharedFlowAhwBna.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    addressProfileAssetViewModel = addressProfileAssetViewModel5;
                    list = list3;
                    abstractC43419rot2 = abstractC43419rot;
                    addressAllAssetResponse = addressAllAssetResponse2;
                    abstractC43419rot3 = abstractC43419rot2;
                    AddressAllAssetToken tokens2 = addressAllAssetResponse.getTokens();
                    total = tokens2 == null ? tokens2.getTotal() : 1;
                    AddressAllAssetToken tokens3 = addressAllAssetResponse.getTokens();
                    pageSize = tokens3 == null ? tokens3.getPageSize() : 1;
                    addressProfileAssetViewModel.wlaJM = total / pageSize;
                    if (total % pageSize > 0) {
                        addressProfileAssetViewModel.wlaJM++;
                    }
                    AddressAllAssetToken tokens4 = addressAllAssetResponse.getTokens();
                    addressProfileAssetViewModel.copydefault(tokens4 == null ? tokens4.getCurrentPage() : 1);
                    if (z) {
                        List<ChainAssetBean> chainAssets = addressAllAssetResponse.getChainAssets();
                        if (chainAssets == null) {
                            chainAssets = yDY.AhwBna();
                        }
                        addressProfileAssetViewModel.KWHzl((List<ChainAssetBean>) chainAssets);
                    }
                    walletAssetSummary = addressAllAssetResponse.getWalletAssetSummary();
                    if (walletAssetSummary != null || (tokenTotalCurrencyAmount = walletAssetSummary.getTokenTotalCurrencyAmount()) == null) {
                        tokenTotalCurrencyAmount = "0";
                    }
                    if (!addressProfileAssetViewModel.zuBGHE.copydefault()) {
                        bigDecimal = z2 ? addressProfileAssetViewModel.OLrzqt(addressAllAssetResponse, z, (List<Long>) list) : addressProfileAssetViewModel.OLrzqt(addressAllAssetResponse, z, (List<Long>) null);
                    } else {
                        bigDecimal = new BigDecimal("0");
                    }
                    BigDecimal bigDecimalAEQbTJ = addressProfileAssetViewModel.AEQbTJ(addressAllAssetResponse, z);
                    if (!C14687dqE.OLrzqt.isConnected()) {
                        strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(tokenTotalCurrencyAmount, bigDecimal), false, null, null, 7, null);
                    } else {
                        strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(tokenTotalCurrencyAmount, bigDecimal), bigDecimalAEQbTJ), false, null, null, 7, null);
                    }
                    String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(strConvertToString$default, addressProfileAssetViewModel.sSMYrx.copydefault(), true, addressProfileAssetViewModel.AwvSrB.copydefault(tokenTotalCurrencyAmount), false, 8, null);
                    mutableSharedFlowEjfBZ = addressProfileAssetViewModel.ejfBZ();
                    ewt = new eWT(C33129mqd.EZpvd(tokenTotalCurrencyAmount), bigDecimalAEQbTJ, bigDecimal, valuationFromAsset$default);
                    this.L$0 = abstractC43419rot3;
                    this.L$1 = addressProfileAssetViewModel;
                    this.L$2 = abstractC43419rot2;
                    this.L$3 = addressAllAssetResponse;
                    this.L$4 = null;
                    this.label = 3;
                    if (mutableSharedFlowEjfBZ.emit(ewt, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot4 = abstractC43419rot2;
                    addressProfileAssetViewModel2 = addressProfileAssetViewModel;
                    mutableSharedFlowIsConnected = addressProfileAssetViewModel2.isConnected();
                    tokens = addressAllAssetResponse.getTokens();
                    if (tokens != null || (listAhwBna = tokens.getTokenlist()) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    this.L$0 = abstractC43419rot3;
                    this.L$1 = addressProfileAssetViewModel2;
                    this.L$2 = abstractC43419rot4;
                    this.L$3 = null;
                    this.label = 4;
                    if (mutableSharedFlowIsConnected.emit(listAhwBna, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = abstractC43419rot3;
                    mutableSharedFlowValues = addressProfileAssetViewModel2.values();
                    boolKWHzl = C56443yFo.KWHzl(addressProfileAssetViewModel2.AYXKKw() < addressProfileAssetViewModel2.wlaJM);
                    this.L$0 = abstractC43419rot;
                    this.L$1 = abstractC43419rot4;
                    this.L$2 = null;
                    this.label = 5;
                    if (mutableSharedFlowValues.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                AddressProfileAssetViewModel addressProfileAssetViewModel6 = this.this$0;
                boolean z5 = this.$manuallyRefresh;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableSharedFlow<Boolean> mutableSharedFlowAhwBna2 = addressProfileAssetViewModel6.AhwBna();
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.L$0 = addressProfileAssetViewModel6;
                    this.L$1 = abstractC43419rot;
                    this.Z$0 = z5;
                    this.label = 6;
                    if (mutableSharedFlowAhwBna2.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot5 = abstractC43419rot;
                    z3 = z5;
                    addressProfileAssetViewModel3 = addressProfileAssetViewModel6;
                    if (!z3) {
                        MutableSharedFlow<eWT> mutableSharedFlowEjfBZ2 = addressProfileAssetViewModel3.ejfBZ();
                        eWT ewt2 = new eWT(null, null, null, addressProfileAssetViewModel3.fARcdN, 7, null);
                        this.L$0 = addressProfileAssetViewModel3;
                        this.L$1 = abstractC43419rot5;
                        this.label = 7;
                        if (mutableSharedFlowEjfBZ2.emit(ewt2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC43419rot6 = abstractC43419rot5;
                        addressProfileAssetViewModel4 = addressProfileAssetViewModel3;
                        mutableSharedFlowIsConnected2 = addressProfileAssetViewModel4.isConnected();
                        listAhwBna2 = yDY.AhwBna();
                        this.L$0 = abstractC43419rot6;
                        this.L$1 = null;
                        this.label = 8;
                        if (mutableSharedFlowIsConnected2.emit(listAhwBna2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                abstractC43419rot = (AbstractC43419rot) objEZpvd;
                z = this.$needCalculateChain;
                AddressProfileAssetViewModel addressProfileAssetViewModel52 = this.this$0;
                z2 = this.$singleChain;
                List<Long> list32 = this.$chainIndexes;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                AddressProfileAssetViewModel addressProfileAssetViewModel62 = this.this$0;
                boolean z52 = this.$manuallyRefresh;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 2:
                boolean z6 = this.Z$1;
                z = this.Z$0;
                AddressAllAssetResponse addressAllAssetResponse3 = (AddressAllAssetResponse) this.L$4;
                AbstractC43419rot abstractC43419rot7 = (AbstractC43419rot) this.L$3;
                List<Long> list4 = (List) this.L$2;
                AddressProfileAssetViewModel addressProfileAssetViewModel7 = (AddressProfileAssetViewModel) this.L$1;
                AbstractC43419rot abstractC43419rot8 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z2 = z6;
                addressAllAssetResponse = addressAllAssetResponse3;
                abstractC43419rot2 = abstractC43419rot7;
                abstractC43419rot3 = abstractC43419rot8;
                addressProfileAssetViewModel = addressProfileAssetViewModel7;
                list = list4;
                AddressAllAssetToken tokens22 = addressAllAssetResponse.getTokens();
                if (tokens22 == null) {
                }
                AddressAllAssetToken tokens32 = addressAllAssetResponse.getTokens();
                if (tokens32 == null) {
                }
                addressProfileAssetViewModel.wlaJM = total / pageSize;
                if (total % pageSize > 0) {
                }
                AddressAllAssetToken tokens42 = addressAllAssetResponse.getTokens();
                addressProfileAssetViewModel.copydefault(tokens42 == null ? tokens42.getCurrentPage() : 1);
                if (z) {
                }
                walletAssetSummary = addressAllAssetResponse.getWalletAssetSummary();
                if (walletAssetSummary != null) {
                    tokenTotalCurrencyAmount = "0";
                    if (!addressProfileAssetViewModel.zuBGHE.copydefault()) {
                    }
                    BigDecimal bigDecimalAEQbTJ2 = addressProfileAssetViewModel.AEQbTJ(addressAllAssetResponse, z);
                    if (!C14687dqE.OLrzqt.isConnected()) {
                    }
                    String valuationFromAsset$default2 = C54880xYt.formatValuationFromAsset$default(strConvertToString$default, addressProfileAssetViewModel.sSMYrx.copydefault(), true, addressProfileAssetViewModel.AwvSrB.copydefault(tokenTotalCurrencyAmount), false, 8, null);
                    mutableSharedFlowEjfBZ = addressProfileAssetViewModel.ejfBZ();
                    ewt = new eWT(C33129mqd.EZpvd(tokenTotalCurrencyAmount), bigDecimalAEQbTJ2, bigDecimal, valuationFromAsset$default2);
                    this.L$0 = abstractC43419rot3;
                    this.L$1 = addressProfileAssetViewModel;
                    this.L$2 = abstractC43419rot2;
                    this.L$3 = addressAllAssetResponse;
                    this.L$4 = null;
                    this.label = 3;
                    if (mutableSharedFlowEjfBZ.emit(ewt, this) != objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 3:
                addressAllAssetResponse = (AddressAllAssetResponse) this.L$3;
                abstractC43419rot4 = (AbstractC43419rot) this.L$2;
                addressProfileAssetViewModel2 = (AddressProfileAssetViewModel) this.L$1;
                abstractC43419rot3 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowIsConnected = addressProfileAssetViewModel2.isConnected();
                tokens = addressAllAssetResponse.getTokens();
                if (tokens != null) {
                    listAhwBna = yDY.AhwBna();
                    this.L$0 = abstractC43419rot3;
                    this.L$1 = addressProfileAssetViewModel2;
                    this.L$2 = abstractC43419rot4;
                    this.L$3 = null;
                    this.label = 4;
                    if (mutableSharedFlowIsConnected.emit(listAhwBna, this) != objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC43419rot abstractC43419rot9 = (AbstractC43419rot) this.L$2;
                AddressProfileAssetViewModel addressProfileAssetViewModel8 = (AddressProfileAssetViewModel) this.L$1;
                AbstractC43419rot abstractC43419rot10 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot4 = abstractC43419rot9;
                abstractC43419rot = abstractC43419rot10;
                addressProfileAssetViewModel2 = addressProfileAssetViewModel8;
                mutableSharedFlowValues = addressProfileAssetViewModel2.values();
                boolKWHzl = C56443yFo.KWHzl(addressProfileAssetViewModel2.AYXKKw() < addressProfileAssetViewModel2.wlaJM);
                this.L$0 = abstractC43419rot;
                this.L$1 = abstractC43419rot4;
                this.L$2 = null;
                this.label = 5;
                if (mutableSharedFlowValues.emit(boolKWHzl, this) == objCopydefault) {
                }
                AddressProfileAssetViewModel addressProfileAssetViewModel622 = this.this$0;
                boolean z522 = this.$manuallyRefresh;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 5:
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                AddressProfileAssetViewModel addressProfileAssetViewModel6222 = this.this$0;
                boolean z5222 = this.$manuallyRefresh;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 6:
                z3 = this.Z$0;
                abstractC43419rot5 = (AbstractC43419rot) this.L$1;
                addressProfileAssetViewModel3 = (AddressProfileAssetViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!z3) {
                }
                return Unit.INSTANCE;
            case 7:
                abstractC43419rot6 = (AbstractC43419rot) this.L$1;
                addressProfileAssetViewModel4 = (AddressProfileAssetViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowIsConnected2 = addressProfileAssetViewModel4.isConnected();
                listAhwBna2 = yDY.AhwBna();
                this.L$0 = abstractC43419rot6;
                this.L$1 = null;
                this.label = 8;
                if (mutableSharedFlowIsConnected2.emit(listAhwBna2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
