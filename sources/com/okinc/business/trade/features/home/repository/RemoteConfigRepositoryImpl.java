package com.okinc.business.trade.features.home.repository;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC28246kUh;
import o.InterfaceC56445yFq;
import o.kYC;
import o.kYD;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.DexStrategyBizMode;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteConfigRepositoryImpl implements kYD {
    public final ArrayList<DefiChainInfo> AEQbTJ;
    public final kYC AhwBna;
    public final InterfaceC28246kUh EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final HashMap<ChainCacheType, List<DefiChainInfo>> OLrzqt;
    public BridgeForceUpdateState copydefault;
    public SingleForceUpdateState gEmmrt;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexStrategyBizMode.values().length];
            try {
                iArr[DexStrategyBizMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DexStrategyBizMode.COPY_TRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public RemoteConfigRepositoryImpl(@NotNull InterfaceC28246kUh interfaceC28246kUh, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC28246kUh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.EZpvd = interfaceC28246kUh;
        this.KWHzl = coroutineDispatcher;
        this.AhwBna = kyc;
        this.OLrzqt = new HashMap<>();
        this.AEQbTJ = new ArrayList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:31:0x0074), top: B:43:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object copydefault(@NotNull Continuation<? super AbstractC43419rot<SingleForceUpdateState, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$checkAppForceUpdate$1 remoteConfigRepositoryImpl$checkAppForceUpdate$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        Object actionBar2;
        if (continuation instanceof RemoteConfigRepositoryImpl$checkAppForceUpdate$1) {
            remoteConfigRepositoryImpl$checkAppForceUpdate$1 = (RemoteConfigRepositoryImpl$checkAppForceUpdate$1) continuation;
            int i = remoteConfigRepositoryImpl$checkAppForceUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$checkAppForceUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$checkAppForceUpdate$1 = new RemoteConfigRepositoryImpl$checkAppForceUpdate$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$checkAppForceUpdate$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$checkAppForceUpdate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            SingleForceUpdateState singleForceUpdateState = this.gEmmrt;
            if (singleForceUpdateState != null) {
                return new AbstractC43419rot.StateListAnimator(singleForceUpdateState);
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1 remoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$checkAppForceUpdate$1.L$0 = this;
                remoteConfigRepositoryImpl$checkAppForceUpdate$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$checkAppForceUpdate$$inlined$getApiResult$1, remoteConfigRepositoryImpl$checkAppForceUpdate$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                    remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                    actionBar = actionBar2;
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$checkAppForceUpdate$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar2 = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                actionBar = actionBar2;
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            return actionBar;
        }
        remoteConfigRepositoryImpl.gEmmrt = (SingleForceUpdateState) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:31:0x0074), top: B:43:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<BridgeForceUpdateState, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1 remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        Object actionBar2;
        if (continuation instanceof RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1) {
            remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1 = (RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1) continuation;
            int i = remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1 = new RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            BridgeForceUpdateState bridgeForceUpdateState = this.copydefault;
            if (bridgeForceUpdateState != null) {
                return new AbstractC43419rot.StateListAnimator(bridgeForceUpdateState);
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$$inlined$getApiResult$1 remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$checkAppForceUpdateForBridge$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.L$0 = this;
                remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$$inlined$getApiResult$1, remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                    remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                    actionBar = actionBar2;
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$checkAppForceUpdateForBridge$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar2 = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                actionBar = actionBar2;
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            return actionBar;
        }
        remoteConfigRepositoryImpl.copydefault = (BridgeForceUpdateState) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x0063, B:29:0x006b, B:31:0x0071, B:32:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AhwBna(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getSingleChainList$1 remoteConfigRepositoryImpl$getSingleChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getSingleChainList$1) {
            remoteConfigRepositoryImpl$getSingleChainList$1 = (RemoteConfigRepositoryImpl$getSingleChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getSingleChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getSingleChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getSingleChainList$1 = new RemoteConfigRepositoryImpl$getSingleChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getSingleChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getSingleChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!valueOf().isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(valueOf());
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getSingleChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getSingleChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getSingleChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getSingleChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getSingleChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getSingleChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getSingleChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getSingleChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            remoteConfigRepositoryImpl2.OLrzqt.put(ChainCacheType.Market, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x005f, B:29:0x0067, B:31:0x006d, B:32:0x007a), top: B:56:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object valueOf(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getMemeChainList$1 remoteConfigRepositoryImpl$getMemeChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        AbstractC43419rot actionBar;
        Object actionBar2;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getMemeChainList$1) {
            remoteConfigRepositoryImpl$getMemeChainList$1 = (RemoteConfigRepositoryImpl$getMemeChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getMemeChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getMemeChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getMemeChainList$1 = new RemoteConfigRepositoryImpl$getMemeChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getMemeChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getMemeChainList$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getMemeChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            C56391yDq.AEQbTJ(objWithContext);
            if (!this.AEQbTJ.isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(this.AEQbTJ);
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getMemeChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getMemeChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getMemeChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getMemeChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getMemeChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getMemeChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getMemeChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DefiChainInfo) obj).getSupportMemeMode()) {
                    arrayList.add(obj);
                }
            }
            actionBar2 = new AbstractC43419rot.StateListAnimator(arrayList);
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        if (actionBar2 instanceof AbstractC43419rot.StateListAnimator) {
            List list2 = (List) ((AbstractC43419rot.StateListAnimator) actionBar2).KWHzl();
            remoteConfigRepositoryImpl2.AEQbTJ.clear();
            remoteConfigRepositoryImpl2.AEQbTJ.addAll(list2);
        }
        return actionBar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x0063, B:29:0x006b, B:31:0x0071, B:32:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object djBIcL(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getLimitChainList$1 remoteConfigRepositoryImpl$getLimitChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getLimitChainList$1) {
            remoteConfigRepositoryImpl$getLimitChainList$1 = (RemoteConfigRepositoryImpl$getLimitChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getLimitChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getLimitChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getLimitChainList$1 = new RemoteConfigRepositoryImpl$getLimitChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getLimitChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getLimitChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!KWHzl().isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(KWHzl());
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getLimitChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getLimitChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getLimitChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getLimitChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getLimitChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getLimitChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getLimitChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getLimitChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            remoteConfigRepositoryImpl2.OLrzqt.put(ChainCacheType.Limit, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object gEmmrt(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1 remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1;
        if (continuation instanceof RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1) {
            remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1 = (RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1) continuation;
            int i = remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1 = new RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getCopyTradingChainListByAccount$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getCopyTradingChainListByAccount$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x0063, B:29:0x006b, B:31:0x0071, B:32:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getCopyTradingChainList$1 remoteConfigRepositoryImpl$getCopyTradingChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getCopyTradingChainList$1) {
            remoteConfigRepositoryImpl$getCopyTradingChainList$1 = (RemoteConfigRepositoryImpl$getCopyTradingChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getCopyTradingChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getCopyTradingChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getCopyTradingChainList$1 = new RemoteConfigRepositoryImpl$getCopyTradingChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getCopyTradingChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getCopyTradingChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!OLrzqt().isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(OLrzqt());
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getCopyTradingChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getCopyTradingChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getCopyTradingChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getCopyTradingChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getCopyTradingChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getCopyTradingChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getCopyTradingChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getCopyTradingChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            remoteConfigRepositoryImpl2.OLrzqt.put(ChainCacheType.CopyTrading, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x0063, B:29:0x006b, B:31:0x0071, B:32:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getBridgeChainList$1 remoteConfigRepositoryImpl$getBridgeChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getBridgeChainList$1) {
            remoteConfigRepositoryImpl$getBridgeChainList$1 = (RemoteConfigRepositoryImpl$getBridgeChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getBridgeChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getBridgeChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getBridgeChainList$1 = new RemoteConfigRepositoryImpl$getBridgeChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getBridgeChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getBridgeChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!AEQbTJ().isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(AEQbTJ());
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getBridgeChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getBridgeChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getBridgeChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getBridgeChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getBridgeChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getBridgeChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getBridgeChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getBridgeChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            remoteConfigRepositoryImpl2.OLrzqt.put(ChainCacheType.Bridge, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:27:0x0063, B:29:0x006b, B:31:0x0071, B:32:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kYD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>> continuation) throws Throwable {
        RemoteConfigRepositoryImpl$getAllSupportChainList$1 remoteConfigRepositoryImpl$getAllSupportChainList$1;
        Exception exc;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl;
        RemoteConfigRepositoryImpl remoteConfigRepositoryImpl2;
        Object actionBar;
        ResponseData responseData;
        if (continuation instanceof RemoteConfigRepositoryImpl$getAllSupportChainList$1) {
            remoteConfigRepositoryImpl$getAllSupportChainList$1 = (RemoteConfigRepositoryImpl$getAllSupportChainList$1) continuation;
            int i = remoteConfigRepositoryImpl$getAllSupportChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteConfigRepositoryImpl$getAllSupportChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                remoteConfigRepositoryImpl$getAllSupportChainList$1 = new RemoteConfigRepositoryImpl$getAllSupportChainList$1(this, continuation);
            }
        }
        Object objWithContext = remoteConfigRepositoryImpl$getAllSupportChainList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = remoteConfigRepositoryImpl$getAllSupportChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!copydefault().isEmpty()) {
                return new AbstractC43419rot.StateListAnimator(copydefault());
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            try {
                RemoteConfigRepositoryImpl$getAllSupportChainList$$inlined$getApiResult$1 remoteConfigRepositoryImpl$getAllSupportChainList$$inlined$getApiResult$1 = new RemoteConfigRepositoryImpl$getAllSupportChainList$$inlined$getApiResult$1(null, this);
                remoteConfigRepositoryImpl$getAllSupportChainList$1.L$0 = this;
                remoteConfigRepositoryImpl$getAllSupportChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, remoteConfigRepositoryImpl$getAllSupportChainList$$inlined$getApiResult$1, remoteConfigRepositoryImpl$getAllSupportChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                remoteConfigRepositoryImpl2 = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e) {
                exc = e;
                remoteConfigRepositoryImpl = this;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteConfigRepositoryImpl2 = (RemoteConfigRepositoryImpl) remoteConfigRepositoryImpl$getAllSupportChainList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                }
            } catch (Exception e2) {
                exc = e2;
                remoteConfigRepositoryImpl = remoteConfigRepositoryImpl2;
                remoteConfigRepositoryImpl2 = remoteConfigRepositoryImpl;
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, exc, 7, null));
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            remoteConfigRepositoryImpl2.OLrzqt.put(ChainCacheType.All, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        return actionBar;
    }

    @Override // o.kYD
    public List<DefiChainInfo> copydefault() {
        List<DefiChainInfo> list = this.OLrzqt.get(ChainCacheType.All);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.kYD
    public List<DefiChainInfo> valueOf() {
        List<DefiChainInfo> list = this.OLrzqt.get(ChainCacheType.Market);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.kYD
    public List<DefiChainInfo> KWHzl() {
        List<DefiChainInfo> list = this.OLrzqt.get(ChainCacheType.Limit);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.kYD
    public List<DefiChainInfo> OLrzqt() {
        List<DefiChainInfo> list = this.OLrzqt.get(ChainCacheType.CopyTrading);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.kYD
    public List<DefiChainInfo> AEQbTJ() {
        List<DefiChainInfo> list = this.OLrzqt.get(ChainCacheType.Bridge);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.kYD
    public List<DefiChainInfo> gEmmrt() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AEQbTJ);
    }

    @Override // o.kYD
    public void AEQbTJ(@NotNull List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.put(ChainCacheType.Market, list);
    }

    @Override // o.kYD
    public void copydefault(@NotNull List<DefiChainInfo> list, @NotNull DexStrategyBizMode dexStrategyBizMode) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(dexStrategyBizMode, "");
        int i = ActionBar.copydefault[dexStrategyBizMode.ordinal()];
        if (i == 1) {
            this.OLrzqt.put(ChainCacheType.Limit, list);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.OLrzqt.put(ChainCacheType.CopyTrading, list);
        }
    }

    @Override // o.kYD
    public void OLrzqt(@NotNull List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.put(ChainCacheType.Bridge, list);
    }

    @Override // o.kYD
    public void copydefault(@NotNull List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
    }

    @Override // o.kYD
    public void EZpvd() {
        this.gEmmrt = null;
        this.copydefault = null;
        this.OLrzqt.clear();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChainCacheType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ChainCacheType[] $VALUES;
        public static final ChainCacheType Market = new ChainCacheType("Market", 0);
        public static final ChainCacheType Limit = new ChainCacheType("Limit", 1);
        public static final ChainCacheType Bridge = new ChainCacheType("Bridge", 2);
        public static final ChainCacheType All = new ChainCacheType("All", 3);
        public static final ChainCacheType CopyTrading = new ChainCacheType("CopyTrading", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ChainCacheType[] $values() {
            return new ChainCacheType[]{Market, Limit, Bridge, All, CopyTrading};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ChainCacheType> getEntries() {
            return $ENTRIES;
        }

        private ChainCacheType(String str, int i) {
        }

        static {
            ChainCacheType[] chainCacheTypeArr$values = $values();
            $VALUES = chainCacheTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(chainCacheTypeArr$values);
        }

        public static ChainCacheType valueOf(String str) {
            return (ChainCacheType) Enum.valueOf(ChainCacheType.class, str);
        }

        public static ChainCacheType[] values() {
            return (ChainCacheType[]) $VALUES.clone();
        }
    }
}
