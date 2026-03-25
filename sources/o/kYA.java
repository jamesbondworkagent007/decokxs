package o;

import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$addCheckToken$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$addCheckToken$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeCollectionGroups$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeCollectionGroups$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeCollectionTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeCollectionTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getBridgeTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleAllNetworkTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleAllNetworkTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleCollectionGroups$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleCollectionGroups$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleCollectionTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleCollectionTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleTokenListByChain$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$getSingleTokenListByChain$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$searchBridgeTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$searchBridgeTokenList$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$searchSingleTokenList$$inlined$getApiResult$1;
import com.okinc.business.trade.features.home.tokenlist.data.repo.DynamicTokenListRepository$searchSingleTokenList$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kYA {
    public final InterfaceC28370kYx AEQbTJ;
    public final InterfaceC23233huP KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final kYC copydefault;

    public kYA(@NotNull InterfaceC23233huP interfaceC23233huP, @NotNull InterfaceC28370kYx interfaceC28370kYx, @NotNull kYC kyc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23233huP, "");
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23233huP;
        this.AEQbTJ = interfaceC28370kYx;
        this.copydefault = kyc;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C28379kZf c28379kZf, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getBridgeTokenList$1 dynamicTokenListRepository$getBridgeTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$getBridgeTokenList$1) {
            dynamicTokenListRepository$getBridgeTokenList$1 = (DynamicTokenListRepository$getBridgeTokenList$1) continuation;
            int i = dynamicTokenListRepository$getBridgeTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getBridgeTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getBridgeTokenList$1 = new DynamicTokenListRepository$getBridgeTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getBridgeTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getBridgeTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1(null, this, c28379kZf);
                dynamicTokenListRepository$getBridgeTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$getBridgeTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C28381kZh c28381kZh, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$searchBridgeTokenList$1 dynamicTokenListRepository$searchBridgeTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$searchBridgeTokenList$1) {
            dynamicTokenListRepository$searchBridgeTokenList$1 = (DynamicTokenListRepository$searchBridgeTokenList$1) continuation;
            int i = dynamicTokenListRepository$searchBridgeTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$searchBridgeTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$searchBridgeTokenList$1 = new DynamicTokenListRepository$searchBridgeTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$searchBridgeTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$searchBridgeTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$searchBridgeTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$searchBridgeTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$searchBridgeTokenList$$inlined$getApiResult$1(null, this, c28381kZh);
                dynamicTokenListRepository$searchBridgeTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$searchBridgeTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$searchBridgeTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C28380kZg c28380kZg, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getBridgeCollectionTokenList$1 dynamicTokenListRepository$getBridgeCollectionTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$getBridgeCollectionTokenList$1) {
            dynamicTokenListRepository$getBridgeCollectionTokenList$1 = (DynamicTokenListRepository$getBridgeCollectionTokenList$1) continuation;
            int i = dynamicTokenListRepository$getBridgeCollectionTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getBridgeCollectionTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getBridgeCollectionTokenList$1 = new DynamicTokenListRepository$getBridgeCollectionTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getBridgeCollectionTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getBridgeCollectionTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getBridgeCollectionTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$getBridgeCollectionTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$getBridgeCollectionTokenList$$inlined$getApiResult$1(null, this, c28380kZg);
                dynamicTokenListRepository$getBridgeCollectionTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getBridgeCollectionTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$getBridgeCollectionTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CommonGroupData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getBridgeCollectionGroups$1 dynamicTokenListRepository$getBridgeCollectionGroups$1;
        if (continuation instanceof DynamicTokenListRepository$getBridgeCollectionGroups$1) {
            dynamicTokenListRepository$getBridgeCollectionGroups$1 = (DynamicTokenListRepository$getBridgeCollectionGroups$1) continuation;
            int i = dynamicTokenListRepository$getBridgeCollectionGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getBridgeCollectionGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getBridgeCollectionGroups$1 = new DynamicTokenListRepository$getBridgeCollectionGroups$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getBridgeCollectionGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getBridgeCollectionGroups$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getBridgeCollectionGroups$$inlined$getApiResult$1 dynamicTokenListRepository$getBridgeCollectionGroups$$inlined$getApiResult$1 = new DynamicTokenListRepository$getBridgeCollectionGroups$$inlined$getApiResult$1(null, this, str, str2);
                dynamicTokenListRepository$getBridgeCollectionGroups$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getBridgeCollectionGroups$$inlined$getApiResult$1, dynamicTokenListRepository$getBridgeCollectionGroups$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C28382kZi c28382kZi, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getSingleAllNetworkTokenList$1 dynamicTokenListRepository$getSingleAllNetworkTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$getSingleAllNetworkTokenList$1) {
            dynamicTokenListRepository$getSingleAllNetworkTokenList$1 = (DynamicTokenListRepository$getSingleAllNetworkTokenList$1) continuation;
            int i = dynamicTokenListRepository$getSingleAllNetworkTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getSingleAllNetworkTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getSingleAllNetworkTokenList$1 = new DynamicTokenListRepository$getSingleAllNetworkTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getSingleAllNetworkTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getSingleAllNetworkTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.copydefault.AEQbTJ();
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getSingleAllNetworkTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$getSingleAllNetworkTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$getSingleAllNetworkTokenList$$inlined$getApiResult$1(null, this, c28382kZi, oKWalletHiddenSmallAssetTokenModelAEQbTJ);
                dynamicTokenListRepository$getSingleAllNetworkTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getSingleAllNetworkTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$getSingleAllNetworkTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C28382kZi c28382kZi, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getSingleTokenListByChain$1 dynamicTokenListRepository$getSingleTokenListByChain$1;
        if (continuation instanceof DynamicTokenListRepository$getSingleTokenListByChain$1) {
            dynamicTokenListRepository$getSingleTokenListByChain$1 = (DynamicTokenListRepository$getSingleTokenListByChain$1) continuation;
            int i = dynamicTokenListRepository$getSingleTokenListByChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getSingleTokenListByChain$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getSingleTokenListByChain$1 = new DynamicTokenListRepository$getSingleTokenListByChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getSingleTokenListByChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getSingleTokenListByChain$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.copydefault.AEQbTJ();
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getSingleTokenListByChain$$inlined$getApiResult$1 dynamicTokenListRepository$getSingleTokenListByChain$$inlined$getApiResult$1 = new DynamicTokenListRepository$getSingleTokenListByChain$$inlined$getApiResult$1(null, this, c28382kZi, oKWalletHiddenSmallAssetTokenModelAEQbTJ);
                dynamicTokenListRepository$getSingleTokenListByChain$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getSingleTokenListByChain$$inlined$getApiResult$1, dynamicTokenListRepository$getSingleTokenListByChain$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C28382kZi c28382kZi, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$searchSingleTokenList$1 dynamicTokenListRepository$searchSingleTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$searchSingleTokenList$1) {
            dynamicTokenListRepository$searchSingleTokenList$1 = (DynamicTokenListRepository$searchSingleTokenList$1) continuation;
            int i = dynamicTokenListRepository$searchSingleTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$searchSingleTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$searchSingleTokenList$1 = new DynamicTokenListRepository$searchSingleTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$searchSingleTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$searchSingleTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$searchSingleTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$searchSingleTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$searchSingleTokenList$$inlined$getApiResult$1(null, this, c28382kZi);
                dynamicTokenListRepository$searchSingleTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$searchSingleTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$searchSingleTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C28382kZi c28382kZi, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getSingleCollectionTokenList$1 dynamicTokenListRepository$getSingleCollectionTokenList$1;
        if (continuation instanceof DynamicTokenListRepository$getSingleCollectionTokenList$1) {
            dynamicTokenListRepository$getSingleCollectionTokenList$1 = (DynamicTokenListRepository$getSingleCollectionTokenList$1) continuation;
            int i = dynamicTokenListRepository$getSingleCollectionTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getSingleCollectionTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getSingleCollectionTokenList$1 = new DynamicTokenListRepository$getSingleCollectionTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getSingleCollectionTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getSingleCollectionTokenList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getSingleCollectionTokenList$$inlined$getApiResult$1 dynamicTokenListRepository$getSingleCollectionTokenList$$inlined$getApiResult$1 = new DynamicTokenListRepository$getSingleCollectionTokenList$$inlined$getApiResult$1(null, this, c28382kZi);
                dynamicTokenListRepository$getSingleCollectionTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getSingleCollectionTokenList$$inlined$getApiResult$1, dynamicTokenListRepository$getSingleCollectionTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CommonGroupData>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$getSingleCollectionGroups$1 dynamicTokenListRepository$getSingleCollectionGroups$1;
        if (continuation instanceof DynamicTokenListRepository$getSingleCollectionGroups$1) {
            dynamicTokenListRepository$getSingleCollectionGroups$1 = (DynamicTokenListRepository$getSingleCollectionGroups$1) continuation;
            int i = dynamicTokenListRepository$getSingleCollectionGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$getSingleCollectionGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$getSingleCollectionGroups$1 = new DynamicTokenListRepository$getSingleCollectionGroups$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$getSingleCollectionGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$getSingleCollectionGroups$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$getSingleCollectionGroups$$inlined$getApiResult$1 dynamicTokenListRepository$getSingleCollectionGroups$$inlined$getApiResult$1 = new DynamicTokenListRepository$getSingleCollectionGroups$$inlined$getApiResult$1(null, this, str, str2);
                dynamicTokenListRepository$getSingleCollectionGroups$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$getSingleCollectionGroups$$inlined$getApiResult$1, dynamicTokenListRepository$getSingleCollectionGroups$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) throws java.lang.Throwable {
        DynamicTokenListRepository$addCheckToken$1 dynamicTokenListRepository$addCheckToken$1;
        if (continuation instanceof DynamicTokenListRepository$addCheckToken$1) {
            dynamicTokenListRepository$addCheckToken$1 = (DynamicTokenListRepository$addCheckToken$1) continuation;
            int i = dynamicTokenListRepository$addCheckToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dynamicTokenListRepository$addCheckToken$1.label = i - Integer.MIN_VALUE;
            } else {
                dynamicTokenListRepository$addCheckToken$1 = new DynamicTokenListRepository$addCheckToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dynamicTokenListRepository$addCheckToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dynamicTokenListRepository$addCheckToken$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                DynamicTokenListRepository$addCheckToken$$inlined$getApiResult$1 dynamicTokenListRepository$addCheckToken$$inlined$getApiResult$1 = new DynamicTokenListRepository$addCheckToken$$inlined$getApiResult$1(null, this, dexMultiTokenDetailReq);
                dynamicTokenListRepository$addCheckToken$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dynamicTokenListRepository$addCheckToken$$inlined$getApiResult$1, dynamicTokenListRepository$addCheckToken$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    public final java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final void EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.copydefault(list);
    }
}
