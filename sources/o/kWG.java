package o;

import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.ApproveDataParam;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MultiApproveInfoParam;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$approveConfirm$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$checkApproveStatusGroup$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$handleApproveCallBack$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$needBatchApprove$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.transaction.MemeMarketApproveUseCase$startApproveContractInteraction$1;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWG {
    public final kKG AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC28282kVq KWHzl;
    public final kVV OLrzqt;
    public final C28315kWw copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.APPROVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public kWG(@NotNull kKG kkg, @NotNull InterfaceC28282kVq interfaceC28282kVq, @NotNull C28315kWw c28315kWw, @NotNull kVV kvv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(interfaceC28282kVq, "");
        Intrinsics.checkNotNullParameter(c28315kWw, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = kkg;
        this.KWHzl = interfaceC28282kVq;
        this.copydefault = c28315kWw;
        this.OLrzqt = kvv;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=4] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull TradeStatePool tradeStatePool, @NotNull java.lang.String str6, boolean z, @NotNull Function1<? super ApproveStatusGroup, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$1 memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1;
        java.lang.String strEZpvd;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object obj;
        TradeStatePool tradeStatePool2;
        Function1<? super ApproveStatusGroup, Unit> function12;
        java.lang.String str9;
        kWG kwg;
        java.lang.String str10;
        boolean z2;
        java.lang.String str11;
        java.lang.String str12;
        Function1<? super ApproveStatusGroup, Unit> function13;
        java.lang.String str13;
        TradeStatePool tradeStatePool3;
        java.lang.String str14;
        java.lang.String str15;
        kWG kwg2;
        java.lang.String str16;
        java.lang.String str17;
        Function1<? super ApproveStatusGroup, Unit> function14;
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo;
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo2;
        java.lang.Object objM7386unboximpl;
        java.util.Map map;
        java.lang.Object objEZpvd;
        Function1<? super ApproveStatusGroup, Unit> function15;
        androidx.collection.LruCache lruCache;
        TradeStatePool tradeStatePool4;
        java.util.Map map2;
        java.lang.String str18;
        kWG kwg3;
        java.lang.Object obj2;
        Function1<? super ApproveStatusGroup, Unit> function16;
        TradeStatePool tradeStatePool5;
        if (continuation instanceof MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$1) {
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1 = (MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$1) continuation;
            int i = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1 = new MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
            strEZpvd = interfaceC9738bbJValueOf != null ? this.AEQbTJ.EZpvd(interfaceC9738bbJValueOf, str) : null;
            if (strEZpvd == null || strEZpvd.length() == 0) {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                function1.invoke(new ApproveStatusGroup(false, ApproveStatus.APPROVED, "115792089237316195423570985008687907853269984665640564039457584007913129639935", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 104, (DefaultConstructorMarker) null));
                return Unit.INSTANCE;
            }
            InterfaceC28282kVq interfaceC28282kVq = this.KWHzl;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = this;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = str;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = str2;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = str3;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = str4;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = str5;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = tradeStatePool;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = str6;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = function1;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = strEZpvd;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0 = z;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 1;
            java.lang.Object objCopydefault2 = interfaceC28282kVq.copydefault(str, str2, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            str7 = str4;
            str8 = str2;
            obj = objCopydefault2;
            tradeStatePool2 = tradeStatePool;
            function12 = function1;
            str9 = str6;
            kwg = this;
            str10 = str;
            z2 = z;
            str11 = str3;
            str12 = str5;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    function14 = (Function1) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    function14.invoke((ApproveStatusGroup) objWithContext);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2;
                        function16 = (Function1) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1;
                        tradeStatePool5 = (TradeStatePool) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0;
                        C56391yDq.AEQbTJ(objWithContext);
                        function16.invoke((ApproveStatusGroup) objWithContext);
                        objM7386unboximpl = obj2;
                        tradeStatePool3 = tradeStatePool5;
                        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                            tradeStatePool3.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                        }
                        Result.m7376boximpl(objM7386unboximpl);
                        return Unit.INSTANCE;
                    }
                    z2 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0;
                    lruCache = (androidx.collection.LruCache) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9;
                    java.util.Map map3 = (java.util.Map) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8;
                    java.lang.Object obj3 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7;
                    Function1<? super ApproveStatusGroup, Unit> function17 = (Function1) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6;
                    str13 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5;
                    tradeStatePool4 = (TradeStatePool) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4;
                    java.lang.String str19 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3;
                    str18 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2;
                    java.lang.String str20 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1;
                    kwg3 = (kWG) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    objM7386unboximpl = obj3;
                    map2 = map3;
                    function15 = function17;
                    str14 = str19;
                    str16 = str20;
                    lruCache.put(objWithContext, map2);
                    DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo3 = (DeFiPlatformTokenApprovalInfo) map2.get(str13);
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = tradeStatePool4;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = function15;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = objM7386unboximpl;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 5;
                    objWithContext = kwg3.copydefault(tradeStatePool4, deFiPlatformTokenApprovalInfo3, str18, str14, str16, z2, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
                    if (objWithContext != objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM7386unboximpl;
                    function16 = function15;
                    tradeStatePool5 = tradeStatePool4;
                    function16.invoke((ApproveStatusGroup) objWithContext);
                    objM7386unboximpl = obj2;
                    tradeStatePool3 = tradeStatePool5;
                    if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                    }
                    Result.m7376boximpl(objM7386unboximpl);
                    return Unit.INSTANCE;
                }
                z2 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0;
                function13 = (Function1) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7;
                java.lang.String str21 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6;
                tradeStatePool3 = (TradeStatePool) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5;
                str14 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4;
                str15 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3;
                str17 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2;
                str16 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1;
                kwg2 = (kWG) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                str13 = str21;
                objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl) && (map = (java.util.Map) ((AbstractC43419rot) objM7386unboximpl).copydefault()) != null) {
                    androidx.collection.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> lruCacheEZpvd = kwg2.KWHzl.EZpvd();
                    InterfaceC28282kVq interfaceC28282kVq2 = kwg2.KWHzl;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = kwg2;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = str16;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = str15;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = str14;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = tradeStatePool3;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = str13;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = function13;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = objM7386unboximpl;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = map;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = lruCacheEZpvd;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0 = z2;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 4;
                    objEZpvd = interfaceC28282kVq2.EZpvd(str16, str17, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    function15 = function13;
                    lruCache = lruCacheEZpvd;
                    objWithContext = objEZpvd;
                    tradeStatePool4 = tradeStatePool3;
                    map2 = map;
                    kWG kwg4 = kwg2;
                    str18 = str15;
                    kwg3 = kwg4;
                    lruCache.put(objWithContext, map2);
                    DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo32 = (DeFiPlatformTokenApprovalInfo) map2.get(str13);
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = tradeStatePool4;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = function15;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = objM7386unboximpl;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = null;
                    memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 5;
                    objWithContext = kwg3.copydefault(tradeStatePool4, deFiPlatformTokenApprovalInfo32, str18, str14, str16, z2, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
                    if (objWithContext != objCopydefault) {
                    }
                }
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                }
                Result.m7376boximpl(objM7386unboximpl);
                return Unit.INSTANCE;
            }
            z2 = memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0;
            java.lang.String str22 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9;
            function12 = (Function1) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8;
            str9 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7;
            tradeStatePool2 = (TradeStatePool) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6;
            str12 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5;
            str7 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4;
            str11 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3;
            str8 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2;
            str10 = (java.lang.String) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1;
            kwg = (kWG) memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            strEZpvd = str22;
            obj = objWithContext;
        }
        java.util.Map map4 = (java.util.Map) obj;
        java.lang.String status = (map4 == null || (deFiPlatformTokenApprovalInfo2 = (DeFiPlatformTokenApprovalInfo) map4.get(str9)) == null) ? null : deFiPlatformTokenApprovalInfo2.getStatus();
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.APPROVING.getType()) || Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.CANCEL_APPROVING.getType())) {
            kwg.OLrzqt();
        }
        if (C23311hvo.copydefault(str10, (map4 == null || (deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) map4.get(str9)) == null) ? null : deFiPlatformTokenApprovalInfo.getTokenContractAddress(), str8)) {
            if (map4 != null) {
                DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo4 = (DeFiPlatformTokenApprovalInfo) map4.get(str9);
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = function12;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = map4;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = null;
                memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 2;
                objWithContext = kwg.copydefault(tradeStatePool2, deFiPlatformTokenApprovalInfo4, str7, str12, str10, z2, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                function14 = function12;
                function14.invoke((ApproveStatusGroup) objWithContext);
            }
            return Unit.INSTANCE;
        }
        CoroutineDispatcher coroutineDispatcher = kwg.EZpvd;
        MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1 memeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1 = new MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1(null, kwg, strEZpvd, str10, str8, str11);
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = kwg;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = str10;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = str8;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = str7;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = str12;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = tradeStatePool2;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = str9;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = function12;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = null;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = null;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0 = z2;
        memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        function13 = function12;
        java.lang.String str23 = str8;
        str13 = str9;
        tradeStatePool3 = tradeStatePool2;
        str14 = str12;
        str15 = str7;
        kwg2 = kwg;
        str16 = str10;
        str17 = str23;
        objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            androidx.collection.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> lruCacheEZpvd2 = kwg2.KWHzl.EZpvd();
            InterfaceC28282kVq interfaceC28282kVq22 = kwg2.KWHzl;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$0 = kwg2;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$1 = str16;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$2 = str15;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$3 = str14;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$4 = tradeStatePool3;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$5 = str13;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$6 = function13;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$7 = objM7386unboximpl;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$8 = map;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.L$9 = lruCacheEZpvd2;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.Z$0 = z2;
            memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1.label = 4;
            objEZpvd = interfaceC28282kVq22.EZpvd(str16, str17, memeMarketApproveUseCase$getSingleApproveAllowanceStatus$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
        }
        Result.m7376boximpl(objM7386unboximpl);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(TradeStatePool tradeStatePool, DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Continuation<? super ApproveStatusGroup> continuation) throws java.lang.Throwable {
        MemeMarketApproveUseCase$checkApproveStatusGroup$1 memeMarketApproveUseCase$checkApproveStatusGroup$1;
        SwapState swapState;
        ApproveStatus approveStatus;
        java.lang.Object objOLrzqt;
        TradeStatePool tradeStatePool2 = tradeStatePool;
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo2 = deFiPlatformTokenApprovalInfo;
        if (continuation instanceof MemeMarketApproveUseCase$checkApproveStatusGroup$1) {
            memeMarketApproveUseCase$checkApproveStatusGroup$1 = (MemeMarketApproveUseCase$checkApproveStatusGroup$1) continuation;
            int i = memeMarketApproveUseCase$checkApproveStatusGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$checkApproveStatusGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$checkApproveStatusGroup$1 = new MemeMarketApproveUseCase$checkApproveStatusGroup$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt2 = memeMarketApproveUseCase$checkApproveStatusGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveUseCase$checkApproveStatusGroup$1.label;
        boolean zOLrzqt = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt2);
            java.lang.String status = deFiPlatformTokenApprovalInfo2 != null ? deFiPlatformTokenApprovalInfo.getStatus() : null;
            ApproveStatus approveStatus2 = ApproveStatus.APPROVING;
            if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus2.getType())) {
                tradeStatePool2.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVING, true, false));
                return new ApproveStatusGroup(false, approveStatus2, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), deFiPlatformTokenApprovalInfo.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
            ApproveStatus approveStatus3 = ApproveStatus.CANCEL_APPROVING;
            if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus3.getType())) {
                tradeStatePool2.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.CANCEL_APPROVING, true, false));
                return new ApproveStatusGroup(false, approveStatus3, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), true, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
            ApproveStatus approveStatus4 = ApproveStatus.APPROVED;
            if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus4.getType())) {
                if (C23313hvq.valueOf(str2, C56443yFo.AEQbTJ(0))) {
                    zOLrzqt = true;
                } else if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                    zOLrzqt = C23313hvq.OLrzqt(str2, ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(deFiPlatformTokenApprovalInfo.getAmount(), C33129mqd.AhwBna(str)));
                }
                if (deFiPlatformTokenApprovalInfo2.isApprovedAndNeedCancelApprove(str2, str)) {
                    swapState = SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
                } else {
                    swapState = zOLrzqt ? SwapState.APPROVE : SwapState.APPROVE_SUCCESS;
                }
                if (deFiPlatformTokenApprovalInfo2.isApprovedAndNeedCancelApprove(str2, str)) {
                    approveStatus = ApproveStatus.APPROVED_NEED_CANCEL_APPROVE;
                } else {
                    approveStatus = zOLrzqt ? ApproveStatus.UN_APPROVE : approveStatus4;
                }
                if (zOLrzqt) {
                    if (swapState != SwapState.APPROVED_AND_NEED_CANCEL_APPROVE) {
                        memeMarketApproveUseCase$checkApproveStatusGroup$1.L$0 = tradeStatePool2;
                        memeMarketApproveUseCase$checkApproveStatusGroup$1.L$1 = deFiPlatformTokenApprovalInfo2;
                        memeMarketApproveUseCase$checkApproveStatusGroup$1.L$2 = swapState;
                        memeMarketApproveUseCase$checkApproveStatusGroup$1.L$3 = approveStatus;
                        memeMarketApproveUseCase$checkApproveStatusGroup$1.label = 1;
                        objOLrzqt = OLrzqt(z, str3, memeMarketApproveUseCase$checkApproveStatusGroup$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
                        }
                    }
                } else {
                    tradeStatePool2.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                    return new ApproveStatusGroup(false, approveStatus, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), deFiPlatformTokenApprovalInfo.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
                }
            } else {
                memeMarketApproveUseCase$checkApproveStatusGroup$1.L$0 = tradeStatePool2;
                memeMarketApproveUseCase$checkApproveStatusGroup$1.L$1 = deFiPlatformTokenApprovalInfo2;
                memeMarketApproveUseCase$checkApproveStatusGroup$1.label = 2;
                objOLrzqt2 = OLrzqt(z, str3, memeMarketApproveUseCase$checkApproveStatusGroup$1);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                if (!((java.lang.Boolean) objOLrzqt2).booleanValue()) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo3 = (DeFiPlatformTokenApprovalInfo) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$1;
                TradeStatePool tradeStatePool3 = (TradeStatePool) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt2);
                deFiPlatformTokenApprovalInfo2 = deFiPlatformTokenApprovalInfo3;
                tradeStatePool2 = tradeStatePool3;
                if (!((java.lang.Boolean) objOLrzqt2).booleanValue()) {
                    ApproveStatus approveStatus5 = ApproveStatus.APPROVE_AND_SWAP;
                    return new ApproveStatusGroup(false, approveStatus5, "", approveStatus5.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
                }
                tradeStatePool2.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE, true, false));
                ApproveStatus approveStatus6 = ApproveStatus.UN_APPROVE;
                java.lang.String amount = deFiPlatformTokenApprovalInfo2 != null ? deFiPlatformTokenApprovalInfo2.getAmount() : null;
                java.lang.String str4 = amount == null ? "" : amount;
                java.lang.String type = deFiPlatformTokenApprovalInfo2 != null ? deFiPlatformTokenApprovalInfo2.getType() : null;
                return new ApproveStatusGroup(true, approveStatus6, str4, type == null ? "" : type, deFiPlatformTokenApprovalInfo2 != null && deFiPlatformTokenApprovalInfo2.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
            ApproveStatus approveStatus7 = (ApproveStatus) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$3;
            SwapState swapState2 = (SwapState) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$2;
            DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo4 = (DeFiPlatformTokenApprovalInfo) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$1;
            TradeStatePool tradeStatePool4 = (TradeStatePool) memeMarketApproveUseCase$checkApproveStatusGroup$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
            approveStatus = approveStatus7;
            tradeStatePool2 = tradeStatePool4;
            objOLrzqt = objOLrzqt2;
            swapState = swapState2;
            deFiPlatformTokenApprovalInfo2 = deFiPlatformTokenApprovalInfo4;
            if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
                ApproveStatus approveStatus8 = ApproveStatus.APPROVE_AND_SWAP;
                return new ApproveStatusGroup(false, approveStatus8, "", approveStatus8.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
        }
        ApproveStatus approveStatus9 = approveStatus;
        tradeStatePool2.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, swapState, true, false));
        return new ApproveStatusGroup(true, approveStatus9, deFiPlatformTokenApprovalInfo2.getAmount(), deFiPlatformTokenApprovalInfo2.getType(), deFiPlatformTokenApprovalInfo2.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, java.lang.String str, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MemeMarketApproveUseCase$needBatchApprove$1 memeMarketApproveUseCase$needBatchApprove$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof MemeMarketApproveUseCase$needBatchApprove$1) {
            memeMarketApproveUseCase$needBatchApprove$1 = (MemeMarketApproveUseCase$needBatchApprove$1) continuation;
            int i = memeMarketApproveUseCase$needBatchApprove$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$needBatchApprove$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$needBatchApprove$1 = new MemeMarketApproveUseCase$needBatchApprove$1(this, continuation);
            }
        }
        java.lang.Object obj = memeMarketApproveUseCase$needBatchApprove$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveUseCase$needBatchApprove$1.label;
        boolean z2 = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!z) {
                return C56443yFo.KWHzl(false);
            }
            kVV kvv = this.OLrzqt;
            memeMarketApproveUseCase$needBatchApprove$1.L$0 = str;
            memeMarketApproveUseCase$needBatchApprove$1.label = 1;
            objKWHzl = kvv.KWHzl(memeMarketApproveUseCase$needBatchApprove$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) memeMarketApproveUseCase$needBatchApprove$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        java.lang.Object obj2 = null;
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        java.util.List list = (java.util.List) objKWHzl;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                    obj2 = next;
                    break;
                }
            }
            DefiChainInfo defiChainInfo = (DefiChainInfo) obj2;
            if (defiChainInfo != null && defiChainInfo.getSupportBatchBroadcast()) {
                z2 = true;
            }
        }
        return C56443yFo.KWHzl(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AbstractC32996moC abstractC32996moC, @NotNull SwapState swapState, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Function1<? super android.os.Bundle, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemeMarketApproveUseCase$approveConfirm$1 memeMarketApproveUseCase$approveConfirm$1;
        java.lang.String str7;
        java.lang.String str8;
        AbstractC32996moC abstractC32996moC2;
        java.lang.String str9;
        Function1<? super android.os.Bundle, Unit> function12;
        InterfaceC9738bbJ interfaceC9738bbJ;
        java.lang.String str10;
        kWG kwg;
        AbstractC43419rot abstractC43419rot;
        int i;
        boolean zIsEvm;
        java.lang.String str11 = str;
        if (continuation instanceof MemeMarketApproveUseCase$approveConfirm$1) {
            memeMarketApproveUseCase$approveConfirm$1 = (MemeMarketApproveUseCase$approveConfirm$1) continuation;
            int i2 = memeMarketApproveUseCase$approveConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$approveConfirm$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$approveConfirm$1 = new MemeMarketApproveUseCase$approveConfirm$1(this, continuation);
            }
        }
        MemeMarketApproveUseCase$approveConfirm$1 memeMarketApproveUseCase$approveConfirm$12 = memeMarketApproveUseCase$approveConfirm$1;
        java.lang.Object objAEQbTJ = memeMarketApproveUseCase$approveConfirm$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeMarketApproveUseCase$approveConfirm$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            int i4 = TaskDescription.EZpvd[swapState.ordinal()];
            if (i4 == 1 || i4 == 2) {
                C25352ivB.startVibrator$default(0L, 1, null);
                InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
                if (interfaceC9738bbJValueOf != null) {
                    java.lang.String strEZpvd = this.AEQbTJ.EZpvd(interfaceC9738bbJValueOf, str11);
                    InterfaceC28282kVq interfaceC28282kVq = this.KWHzl;
                    memeMarketApproveUseCase$approveConfirm$12.L$0 = this;
                    memeMarketApproveUseCase$approveConfirm$12.L$1 = str11;
                    memeMarketApproveUseCase$approveConfirm$12.L$2 = str2;
                    memeMarketApproveUseCase$approveConfirm$12.L$3 = str3;
                    memeMarketApproveUseCase$approveConfirm$12.L$4 = abstractC32996moC;
                    memeMarketApproveUseCase$approveConfirm$12.L$5 = str4;
                    memeMarketApproveUseCase$approveConfirm$12.L$6 = function1;
                    memeMarketApproveUseCase$approveConfirm$12.L$7 = interfaceC9738bbJValueOf;
                    memeMarketApproveUseCase$approveConfirm$12.L$8 = strEZpvd;
                    memeMarketApproveUseCase$approveConfirm$12.label = 1;
                    objAEQbTJ = interfaceC28282kVq.AEQbTJ(strEZpvd, str2, str, str3, str5, str6, memeMarketApproveUseCase$approveConfirm$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    str7 = str2;
                    str8 = str3;
                    abstractC32996moC2 = abstractC32996moC;
                    str9 = str4;
                    function12 = function1;
                    interfaceC9738bbJ = interfaceC9738bbJValueOf;
                    str10 = strEZpvd;
                    kwg = this;
                    abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            }
        } else if (i3 == 1) {
            str10 = (java.lang.String) memeMarketApproveUseCase$approveConfirm$12.L$8;
            interfaceC9738bbJ = (InterfaceC9738bbJ) memeMarketApproveUseCase$approveConfirm$12.L$7;
            function12 = (Function1) memeMarketApproveUseCase$approveConfirm$12.L$6;
            str9 = (java.lang.String) memeMarketApproveUseCase$approveConfirm$12.L$5;
            abstractC32996moC2 = (AbstractC32996moC) memeMarketApproveUseCase$approveConfirm$12.L$4;
            str8 = (java.lang.String) memeMarketApproveUseCase$approveConfirm$12.L$3;
            str7 = (java.lang.String) memeMarketApproveUseCase$approveConfirm$12.L$2;
            str11 = (java.lang.String) memeMarketApproveUseCase$approveConfirm$12.L$1;
            kwg = (kWG) memeMarketApproveUseCase$approveConfirm$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                DefiChainInfo defiChainInfoAEQbTJ = kwg.OLrzqt.AEQbTJ(str11);
                java.lang.String network = defiChainInfoAEQbTJ != null ? defiChainInfoAEQbTJ.getNetwork() : null;
                if (network == null) {
                    network = "";
                }
                java.lang.String str12 = network;
                if (defiChainInfoAEQbTJ != null) {
                    zIsEvm = defiChainInfoAEQbTJ.isEvm();
                    i = 2;
                } else {
                    i = 2;
                    zIsEvm = true;
                }
                ApproveSwapData approveSwapData = new ApproveSwapData(str11, str12, ApproveUnsignedData.getSignDataJson$default(approveUnsignedData, zIsEvm, null, i, null), interfaceC9738bbJ.DbNXlk(), new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null), approveUnsignedData.getId(), approveUnsignedData.getDexContractAddress(), false, (UnsignedSwapData) null, (java.lang.String) null, FaceDetector.NUM_BOXES, (DefaultConstructorMarker) null);
                memeMarketApproveUseCase$approveConfirm$12.L$0 = abstractC43419rot;
                memeMarketApproveUseCase$approveConfirm$12.L$1 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$2 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$3 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$4 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$5 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$6 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$7 = null;
                memeMarketApproveUseCase$approveConfirm$12.L$8 = null;
                memeMarketApproveUseCase$approveConfirm$12.label = 2;
                if (kwg.AEQbTJ(abstractC32996moC2, approveSwapData, str10, str7, str8, str9, function12, memeMarketApproveUseCase$approveConfirm$12) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(androidx.fragment.app.Fragment fragment, ApproveSwapData approveSwapData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1<? super android.os.Bundle, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemeMarketApproveUseCase$startApproveContractInteraction$1 memeMarketApproveUseCase$startApproveContractInteraction$1;
        InterfaceC9854bdT interfaceC9854bdT;
        java.lang.String str5;
        java.lang.String str6;
        InterfaceC9854bdT interfaceC9854bdT2;
        FragmentActivity fragmentActivity;
        java.lang.String str7;
        java.lang.String str8;
        final Function1<? super android.os.Bundle, Unit> function12;
        java.lang.Object obj;
        kWG kwg;
        ApproveSwapData approveSwapData2 = approveSwapData;
        if (continuation instanceof MemeMarketApproveUseCase$startApproveContractInteraction$1) {
            memeMarketApproveUseCase$startApproveContractInteraction$1 = (MemeMarketApproveUseCase$startApproveContractInteraction$1) continuation;
            int i = memeMarketApproveUseCase$startApproveContractInteraction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$startApproveContractInteraction$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$startApproveContractInteraction$1 = new MemeMarketApproveUseCase$startApproveContractInteraction$1(this, continuation);
            }
        }
        java.lang.Object obj2 = memeMarketApproveUseCase$startApproveContractInteraction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveUseCase$startApproveContractInteraction$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null && (interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class)) != null) {
                kKG kkg = this.AEQbTJ;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$0 = this;
                str5 = str;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$1 = str5;
                str6 = str2;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$2 = str6;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$3 = str3;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$4 = str4;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$5 = function1;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$6 = activity;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$7 = approveSwapData2;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$8 = approveSwapData2;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$9 = interfaceC9854bdT;
                memeMarketApproveUseCase$startApproveContractInteraction$1.L$10 = interfaceC9854bdT;
                memeMarketApproveUseCase$startApproveContractInteraction$1.label = 1;
                java.lang.Object objAEQbTJ = kkg.AEQbTJ(memeMarketApproveUseCase$startApproveContractInteraction$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC9854bdT2 = interfaceC9854bdT;
                fragmentActivity = activity;
                str7 = str3;
                str8 = str4;
                function12 = function1;
                obj = objAEQbTJ;
                kwg = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC9854bdT interfaceC9854bdT3 = (InterfaceC9854bdT) memeMarketApproveUseCase$startApproveContractInteraction$1.L$10;
        ApproveSwapData approveSwapData3 = (ApproveSwapData) memeMarketApproveUseCase$startApproveContractInteraction$1.L$8;
        FragmentActivity fragmentActivity2 = (FragmentActivity) memeMarketApproveUseCase$startApproveContractInteraction$1.L$6;
        function12 = (Function1) memeMarketApproveUseCase$startApproveContractInteraction$1.L$5;
        java.lang.String str9 = (java.lang.String) memeMarketApproveUseCase$startApproveContractInteraction$1.L$4;
        java.lang.String str10 = (java.lang.String) memeMarketApproveUseCase$startApproveContractInteraction$1.L$3;
        java.lang.String str11 = (java.lang.String) memeMarketApproveUseCase$startApproveContractInteraction$1.L$2;
        java.lang.String str12 = (java.lang.String) memeMarketApproveUseCase$startApproveContractInteraction$1.L$1;
        kwg = (kWG) memeMarketApproveUseCase$startApproveContractInteraction$1.L$0;
        C56391yDq.AEQbTJ(obj2);
        fragmentActivity = fragmentActivity2;
        str8 = str9;
        str5 = str12;
        obj = obj2;
        str7 = str10;
        str6 = str11;
        interfaceC9854bdT2 = interfaceC9854bdT3;
        approveSwapData2 = approveSwapData3;
        java.lang.String str13 = (java.lang.String) obj;
        java.lang.String chainId = approveSwapData2.getChainId();
        PlatformItem platForm = approveSwapData2.getPlatForm();
        java.lang.String jsonData = approveSwapData2.getJsonData();
        java.lang.String orderId = approveSwapData2.getOrderId();
        java.lang.String dexContractAddress = approveSwapData2.getDexContractAddress();
        UnsignedSwapData unSingedCallData = approveSwapData2.getUnSingedCallData();
        final kWG kwg2 = kwg;
        final ApproveSwapData approveSwapData4 = approveSwapData2;
        final java.lang.String str14 = str6;
        final java.lang.String str15 = str5;
        final java.lang.String str16 = str7;
        interfaceC9854bdT2.AEQbTJ(fragmentActivity, new DappInteractionArgs(str13, null, chainId, platForm, jsonData, null, "dex", C56443yFo.AEQbTJ(3), null, null, dexContractAddress, str8, false, true, orderId, true, null, null, null, null, null, null, null, null, DappInteractionArgs.Companion.ShowStyle.NORMAL, null, C56443yFo.AEQbTJ(1), unSingedCallData != null ? unSingedCallData.getBizLoad() : null, null, null, null, null, -218168574, null), new Function1() { // from class: o.kWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return kWG.EZpvd(function12, (android.os.Bundle) obj3);
            }
        }, new Function1() { // from class: o.kWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return kWG.AEQbTJ(this.AEQbTJ, approveSwapData4, str14, str15, str16, (NewCallbackBean) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, android.os.Bundle bundle) {
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX AEQbTJ(kWG kwg, ApproveSwapData approveSwapData, java.lang.String str, java.lang.String str2, java.lang.String str3, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = kwg.copydefault.EZpvd(newCallbackBean.getBody(), approveSwapData.getChainId(), str);
        if (pairEZpvd.getFirst() == null || pairEZpvd.getSecond().length() == 0) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-1, null, null, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 54, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return kwg.copydefault.EZpvd(newCallbackBean.getHeaderMap(), new SwapApproveInfoReq(new ApproveDataParam(approveSwapData.getChainId(), str2, str, str3, ""), new MultiApproveInfoParam(approveSwapData.getOrderId(), approveSwapData.getChainId(), pairEZpvd.getSecond(), pairEZpvd.getFirst(), "0")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(android.os.Bundle bundle, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull TradeStatePool tradeStatePool, @NotNull java.lang.String str6, boolean z, @NotNull Function1<? super ApproveStatusGroup, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemeMarketApproveUseCase$handleApproveCallBack$1 memeMarketApproveUseCase$handleApproveCallBack$1;
        boolean z2;
        TradeStatePool tradeStatePool2;
        java.lang.String str7;
        Function1<? super ApproveStatusGroup, Unit> function12;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        kWG kwg;
        java.lang.String str11;
        java.lang.String str12;
        if (continuation instanceof MemeMarketApproveUseCase$handleApproveCallBack$1) {
            memeMarketApproveUseCase$handleApproveCallBack$1 = (MemeMarketApproveUseCase$handleApproveCallBack$1) continuation;
            int i = memeMarketApproveUseCase$handleApproveCallBack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveUseCase$handleApproveCallBack$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveUseCase$handleApproveCallBack$1 = new MemeMarketApproveUseCase$handleApproveCallBack$1(this, continuation);
            }
        }
        java.lang.Object obj = memeMarketApproveUseCase$handleApproveCallBack$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveUseCase$handleApproveCallBack$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.Integer numAEQbTJ = bundle != null ? C56443yFo.AEQbTJ(bundle.getInt("result")) : null;
            if (numAEQbTJ == null || numAEQbTJ.intValue() != -1) {
                return Unit.INSTANCE;
            }
            InterfaceC28282kVq interfaceC28282kVq = this.KWHzl;
            java.lang.String type = ApproveStatus.APPROVING.getType();
            memeMarketApproveUseCase$handleApproveCallBack$1.L$0 = this;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$1 = str;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$2 = str2;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$3 = str3;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$4 = str4;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$5 = str5;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$6 = tradeStatePool;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$7 = str6;
            memeMarketApproveUseCase$handleApproveCallBack$1.L$8 = function1;
            z2 = z;
            memeMarketApproveUseCase$handleApproveCallBack$1.Z$0 = z2;
            memeMarketApproveUseCase$handleApproveCallBack$1.label = 1;
            if (interfaceC28282kVq.AEQbTJ(str, str2, type, str6, memeMarketApproveUseCase$handleApproveCallBack$1) == objCopydefault) {
                return objCopydefault;
            }
            tradeStatePool2 = tradeStatePool;
            str7 = str6;
            function12 = function1;
            str8 = str3;
            str9 = str4;
            str10 = str5;
            kwg = this;
            str11 = str;
            str12 = str2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            boolean z3 = memeMarketApproveUseCase$handleApproveCallBack$1.Z$0;
            function12 = (Function1) memeMarketApproveUseCase$handleApproveCallBack$1.L$8;
            str7 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$7;
            tradeStatePool2 = (TradeStatePool) memeMarketApproveUseCase$handleApproveCallBack$1.L$6;
            str10 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$5;
            str9 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$4;
            str8 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$3;
            str12 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$2;
            str11 = (java.lang.String) memeMarketApproveUseCase$handleApproveCallBack$1.L$1;
            kwg = (kWG) memeMarketApproveUseCase$handleApproveCallBack$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z2 = z3;
        }
        memeMarketApproveUseCase$handleApproveCallBack$1.L$0 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$1 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$2 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$3 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$4 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$5 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$6 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$7 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.L$8 = null;
        memeMarketApproveUseCase$handleApproveCallBack$1.label = 2;
        if (kwg.AEQbTJ(str11, str12, str8, str9, str10, tradeStatePool2, str7, z2, function12, memeMarketApproveUseCase$handleApproveCallBack$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        this.KWHzl.AEQbTJ();
    }
}
