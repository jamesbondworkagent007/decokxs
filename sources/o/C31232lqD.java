package o;

import com.okinc.business.web3pay.lib.core.network.ws.BalanceChangeSubResponse;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getAggregatedAsset$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getAssetAll$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getBlockChainTypeBalance$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getOffshoreAssets$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getPayBalance$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$getSingleCoinAsset$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.asset.AssetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1;
import com.okinc.business.web3pay.lib.features.asset.model.AggregatedAsset;
import com.okinc.business.web3pay.lib.features.asset.model.AggregatedAssetRequest;
import com.okinc.business.web3pay.lib.features.asset.model.AssetAll;
import com.okinc.business.web3pay.lib.features.asset.model.CoinAsset;
import com.okinc.business.web3pay.lib.features.asset.model.OffshoreAssets;
import com.okinc.business.web3pay.lib.features.asset.model.PayAsset;
import com.okinc.business.web3pay.lib.features.asset.model.TokenDetail;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31232lqD {
    public final InterfaceC31236lqH EZpvd;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<AssetAll>> continuation) throws java.lang.Throwable {
        AssetRepositoryImpl$getAssetAll$1 assetRepositoryImpl$getAssetAll$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AssetRepositoryImpl$getAssetAll$1) {
            assetRepositoryImpl$getAssetAll$1 = (AssetRepositoryImpl$getAssetAll$1) continuation;
            int i = assetRepositoryImpl$getAssetAll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getAssetAll$1.label = i - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getAssetAll$1 = new AssetRepositoryImpl$getAssetAll$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = assetRepositoryImpl$getAssetAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = assetRepositoryImpl$getAssetAll$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC31236lqH interfaceC31236lqH = this.EZpvd;
                assetRepositoryImpl$getAssetAll$1.label = 1;
                objKWHzl = interfaceC31236lqH.KWHzl(assetRepositoryImpl$getAssetAll$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ResponseData responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, @NotNull Continuation<? super Result<AssetAll>> continuation) throws java.lang.Throwable {
        AssetRepositoryImpl$getBlockChainTypeBalance$1 assetRepositoryImpl$getBlockChainTypeBalance$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof AssetRepositoryImpl$getBlockChainTypeBalance$1) {
            assetRepositoryImpl$getBlockChainTypeBalance$1 = (AssetRepositoryImpl$getBlockChainTypeBalance$1) continuation;
            int i2 = assetRepositoryImpl$getBlockChainTypeBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getBlockChainTypeBalance$1.label = i2 - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getBlockChainTypeBalance$1 = new AssetRepositoryImpl$getBlockChainTypeBalance$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = assetRepositoryImpl$getBlockChainTypeBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = assetRepositoryImpl$getBlockChainTypeBalance$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31236lqH interfaceC31236lqH = this.EZpvd;
                assetRepositoryImpl$getBlockChainTypeBalance$1.label = 1;
                objOLrzqt = interfaceC31236lqH.OLrzqt(i, assetRepositoryImpl$getBlockChainTypeBalance$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: o.lqD$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements Flow<CoinAsset> {
        public static int EZpvd;
        public static int copydefault;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.lqD$Activity$2, reason: invalid class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AssetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1 assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1;
                if (continuation instanceof AssetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1) {
                    assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1 = (AssetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1) continuation;
                    int i = assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1 = new AssetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    BalanceChangeSubResponse balanceChangeSubResponse = (BalanceChangeSubResponse) obj;
                    CoinAsset coinAsset = new CoinAsset(balanceChangeSubResponse.getTokenAmount(), balanceChangeSubResponse.getUsdAmount(), balanceChangeSubResponse.getTokenCoinTypeNo(), (java.lang.String) null, 8, (DefaultConstructorMarker) null);
                    assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(coinAsset, assetRepositoryImpl$subscribeWSPayBalanceInfo$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinAsset> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        public static int copydefault() {
            int i = EZpvd;
            int i2 = i % 6263674;
            EZpvd = i + 1;
            if (i2 != 0) {
                return copydefault;
            }
            int startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
            copydefault = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: o.lqD$TaskDescription */
    public static final class TaskDescription implements Flow<CoinAsset> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.lqD$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                AssetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1 assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1;
                if (continuation instanceof AssetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1) {
                    assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1 = (AssetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1) continuation;
                    int i = assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1 = new AssetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    BalanceChangeSubResponse balanceChangeSubResponse = (BalanceChangeSubResponse) obj;
                    CoinAsset coinAsset = new CoinAsset(balanceChangeSubResponse.getTokenAmount(), balanceChangeSubResponse.getUsdAmount(), balanceChangeSubResponse.getTokenCoinTypeNo(), balanceChangeSubResponse.getDeficitAmount());
                    assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(coinAsset, assetRepositoryImpl$subscribeWSAssetBalanceInfo$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CoinAsset> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<PayAsset>> continuation) throws java.lang.Throwable {
        AssetRepositoryImpl$getPayBalance$1 assetRepositoryImpl$getPayBalance$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AssetRepositoryImpl$getPayBalance$1) {
            assetRepositoryImpl$getPayBalance$1 = (AssetRepositoryImpl$getPayBalance$1) continuation;
            int i = assetRepositoryImpl$getPayBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getPayBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getPayBalance$1 = new AssetRepositoryImpl$getPayBalance$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = assetRepositoryImpl$getPayBalance$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = assetRepositoryImpl$getPayBalance$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31236lqH interfaceC31236lqH = this.EZpvd;
                assetRepositoryImpl$getPayBalance$1.label = 1;
                objCopydefault = interfaceC31236lqH.copydefault(assetRepositoryImpl$getPayBalance$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<AggregatedAsset>> continuation) {
        AssetRepositoryImpl$getAggregatedAsset$1 assetRepositoryImpl$getAggregatedAsset$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof AssetRepositoryImpl$getAggregatedAsset$1) {
            assetRepositoryImpl$getAggregatedAsset$1 = (AssetRepositoryImpl$getAggregatedAsset$1) continuation;
            int i = assetRepositoryImpl$getAggregatedAsset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getAggregatedAsset$1.label = i - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getAggregatedAsset$1 = new AssetRepositoryImpl$getAggregatedAsset$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = assetRepositoryImpl$getAggregatedAsset$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = assetRepositoryImpl$getAggregatedAsset$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC31236lqH interfaceC31236lqH = this.EZpvd;
                AggregatedAssetRequest aggregatedAssetRequest = new AggregatedAssetRequest(list);
                assetRepositoryImpl$getAggregatedAsset$1.label = 1;
                objCopydefault = interfaceC31236lqH.copydefault(aggregatedAssetRequest, assetRepositoryImpl$getAggregatedAsset$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<TokenDetail>> continuation) throws java.lang.Throwable {
        AssetRepositoryImpl$getSingleCoinAsset$1 assetRepositoryImpl$getSingleCoinAsset$1;
        java.lang.Object objCopydefault;
        java.lang.Object next;
        if (continuation instanceof AssetRepositoryImpl$getSingleCoinAsset$1) {
            assetRepositoryImpl$getSingleCoinAsset$1 = (AssetRepositoryImpl$getSingleCoinAsset$1) continuation;
            int i = assetRepositoryImpl$getSingleCoinAsset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getSingleCoinAsset$1.label = i - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getSingleCoinAsset$1 = new AssetRepositoryImpl$getSingleCoinAsset$1(this, continuation);
            }
        }
        java.lang.Object obj = assetRepositoryImpl$getSingleCoinAsset$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = assetRepositoryImpl$getSingleCoinAsset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
            assetRepositoryImpl$getSingleCoinAsset$1.L$0 = str;
            assetRepositoryImpl$getSingleCoinAsset$1.label = 1;
            objCopydefault = copydefault(listEZpvd, assetRepositoryImpl$getSingleCoinAsset$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) assetRepositoryImpl$getSingleCoinAsset$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        java.util.Iterator<T> it = ((AggregatedAsset) objCopydefault).getTokenDetails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TokenDetail) next).getTokenCoinTypeNo(), (java.lang.Object) str)) {
                break;
            }
        }
        TokenDetail tokenDetail = (TokenDetail) next;
        if (tokenDetail != null) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(tokenDetail);
        }
        Result.Application application3 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("tokenDetail is null")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<OffshoreAssets>> continuation) throws java.lang.Throwable {
        AssetRepositoryImpl$getOffshoreAssets$1 assetRepositoryImpl$getOffshoreAssets$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof AssetRepositoryImpl$getOffshoreAssets$1) {
            assetRepositoryImpl$getOffshoreAssets$1 = (AssetRepositoryImpl$getOffshoreAssets$1) continuation;
            int i = assetRepositoryImpl$getOffshoreAssets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assetRepositoryImpl$getOffshoreAssets$1.label = i - Integer.MIN_VALUE;
            } else {
                assetRepositoryImpl$getOffshoreAssets$1 = new AssetRepositoryImpl$getOffshoreAssets$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = assetRepositoryImpl$getOffshoreAssets$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = assetRepositoryImpl$getOffshoreAssets$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC31236lqH interfaceC31236lqH = this.EZpvd;
                assetRepositoryImpl$getOffshoreAssets$1.label = 1;
                objEZpvd = interfaceC31236lqH.EZpvd(assetRepositoryImpl$getOffshoreAssets$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }
}
