package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.market.common.MarketHttpApi;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.ITradeExtKt$createMarginDataSource$1;
import com.okinc.unify_trade.ITradeExtKt$createOptionDataSource$1;
import com.okinc.unify_trade.ITradeExtKt$createPremarketDataSource$1;
import com.okinc.unify_trade.ITradeExtKt$createSpotDataSource$1;
import com.okinc.unify_trade.ITradeExtKt$createSpotDataSourceWithRepo$1;
import com.okinc.unify_trade.ITradeExtKt$createSwapFutureCombineDataSource$1;
import com.okinc.unify_trade.ITradeExtKt$createWatchListSource$1;
import com.okinc.unify_trade.ITradeExtKt$ensureInit$1;
import com.okinc.unify_trade.ITradeExtKt$ensureInit$2;
import com.okinc.unify_trade.ITradeExtKt$tryToInitTradeGroupList$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CategoryRespData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xnE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55608xnE {
    public static final void AEQbTJ(InterfaceC54581xNr interfaceC54581xNr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:26:0x008c, B:28:0x0090, B:30:0x009e, B:31:0x00ab, B:32:0x00d2, B:22:0x006e), top: B:39:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:26:0x008c, B:28:0x0090, B:30:0x009e, B:31:0x00ab, B:32:0x00d2, B:22:0x006e), top: B:39:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, java.lang.Boolean bool, boolean z, boolean z2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createSpotDataSource$1 iTradeExtKt$createSpotDataSource$1;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2;
        java.lang.Boolean bool2;
        java.lang.Object objEZpvd;
        boolean z3;
        boolean z4;
        AbstractC54531xLw abstractC54531xLw;
        InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNr;
        final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData3 = mutableLiveData;
        if (continuation instanceof ITradeExtKt$createSpotDataSource$1) {
            iTradeExtKt$createSpotDataSource$1 = (ITradeExtKt$createSpotDataSource$1) continuation;
            int i = iTradeExtKt$createSpotDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createSpotDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createSpotDataSource$1 = new ITradeExtKt$createSpotDataSource$1(continuation);
            }
        }
        java.lang.Object obj = iTradeExtKt$createSpotDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createSpotDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AEQbTJ(interfaceC54581xNr);
            if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr2, null, 1, null)) {
                mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                return Unit.INSTANCE;
            }
            try {
                iTradeExtKt$createSpotDataSource$1.L$0 = interfaceC54581xNr2;
                bool2 = bool;
                iTradeExtKt$createSpotDataSource$1.L$1 = bool2;
                iTradeExtKt$createSpotDataSource$1.L$2 = mutableLiveData3;
                iTradeExtKt$createSpotDataSource$1.Z$0 = z;
                iTradeExtKt$createSpotDataSource$1.Z$1 = z2;
                iTradeExtKt$createSpotDataSource$1.label = 1;
                objEZpvd = interfaceC54581xNr2.EZpvd("SPOT", iTradeExtKt$createSpotDataSource$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                z3 = z;
                z4 = z2;
                abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
                if (abstractC54531xLw == null) {
                }
            } catch (java.lang.Exception e) {
                e = e;
                mutableLiveData2 = mutableLiveData3;
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, e));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = iTradeExtKt$createSpotDataSource$1.Z$1;
            boolean z6 = iTradeExtKt$createSpotDataSource$1.Z$0;
            mutableLiveData2 = (MutableLiveData) iTradeExtKt$createSpotDataSource$1.L$2;
            java.lang.Boolean bool3 = (java.lang.Boolean) iTradeExtKt$createSpotDataSource$1.L$1;
            InterfaceC54581xNr interfaceC54581xNr3 = (InterfaceC54581xNr) iTradeExtKt$createSpotDataSource$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                z4 = z5;
                z3 = z6;
                interfaceC54581xNr2 = interfaceC54581xNr3;
                mutableLiveData3 = mutableLiveData2;
                objEZpvd = obj;
                bool2 = bool3;
                abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
                if (abstractC54531xLw == null) {
                    java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(abstractC54531xLw.EZpvd());
                    if (listQfsBiF.isEmpty()) {
                        mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                    } else {
                        Intrinsics.copydefault(listQfsBiF, "");
                        final xQJ xqj = new xQJ((java.util.ArrayList) listQfsBiF, interfaceC54581xNr2.djBIcL(), interfaceC54581xNr2.iwGUEr(), false, mutableLiveData3, z3, z4, null, 128, null);
                        xqj.KWHzl(bool2, new Function1() { // from class: o.xnL
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return C55608xnE.AEQbTJ(mutableLiveData3, xqj, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, e));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object createSpotDataSource$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.Boolean bool, boolean z, boolean z2, MutableLiveData mutableLiveData, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return OLrzqt(interfaceC54581xNr, bool, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (MutableLiveData<SourceResp<AbstractC54646xQb>>) mutableLiveData, (Continuation<? super Unit>) continuation);
    }

    public static final Unit AEQbTJ(MutableLiveData mutableLiveData, xQJ xqj, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            xqj.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.TRUE, xqj, null));
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull InterfaceC54581xNr interfaceC54581xNr, java.lang.Boolean bool, boolean z, boolean z2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull CoroutineScope coroutineScope, @NotNull qTI qti, @NotNull qTT qtt, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(qti, "");
        Intrinsics.checkNotNullParameter(qtt, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NavOptPhase1", str + " -> create createSpotDataSourceWithRepo");
        AEQbTJ(interfaceC54581xNr);
        if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr, null, 1, null)) {
            mutableLiveData.postValue(new SourceResp<>(java.lang.Boolean.FALSE, null, null));
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ITradeExtKt$createSpotDataSourceWithRepo$1(interfaceC54581xNr, mutableLiveData, z, z2, coroutineScope, qti, qtt, str, bool, null), 3, null);
        } catch (java.lang.Exception e) {
            mutableLiveData.postValue(new SourceResp<>(java.lang.Boolean.FALSE, null, e));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xQJ.init$default(o.xQJ, java.lang.Boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createMarginDataSource$1 iTradeExtKt$createMarginDataSource$1;
        InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNr;
        final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2 = mutableLiveData;
        if (continuation instanceof ITradeExtKt$createMarginDataSource$1) {
            iTradeExtKt$createMarginDataSource$1 = (ITradeExtKt$createMarginDataSource$1) continuation;
            int i = iTradeExtKt$createMarginDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createMarginDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createMarginDataSource$1 = new ITradeExtKt$createMarginDataSource$1(continuation);
            }
        }
        java.lang.Object objEZpvd = iTradeExtKt$createMarginDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createMarginDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AEQbTJ(interfaceC54581xNr);
            if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr2, null, 1, null)) {
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                return Unit.INSTANCE;
            }
            iTradeExtKt$createMarginDataSource$1.L$0 = interfaceC54581xNr2;
            iTradeExtKt$createMarginDataSource$1.L$1 = mutableLiveData2;
            iTradeExtKt$createMarginDataSource$1.label = 1;
            objEZpvd = interfaceC54581xNr2.EZpvd("MARGIN", iTradeExtKt$createMarginDataSource$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData3 = (MutableLiveData) iTradeExtKt$createMarginDataSource$1.L$1;
            InterfaceC54581xNr interfaceC54581xNr3 = (InterfaceC54581xNr) iTradeExtKt$createMarginDataSource$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            mutableLiveData2 = mutableLiveData3;
            interfaceC54581xNr2 = interfaceC54581xNr3;
        }
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw != null) {
            java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(abstractC54531xLw.EZpvd());
            if (listQfsBiF.isEmpty()) {
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
            } else {
                Intrinsics.copydefault(listQfsBiF, "");
                final xQJ xqj = new xQJ((java.util.ArrayList) listQfsBiF, interfaceC54581xNr2.djBIcL(), interfaceC54581xNr2.iwGUEr(), true, mutableLiveData2, false, false, null, 192, null);
                xQJ.init$default(xqj, null, new Function1() { // from class: o.xnQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55608xnE.OLrzqt(mutableLiveData2, xqj, ((java.lang.Boolean) obj).booleanValue());
                    }
                }, 1, null);
            }
        } else {
            mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MutableLiveData mutableLiveData, xQJ xqj, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            xqj.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.TRUE, xqj, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v14, resolved type: ? super com.okinc.unify_trade.biz.BizInstrument */
    /* JADX DEBUG: Multi-variable search result rejected for r8v10, resolved type: ? super com.okinc.unify_trade.biz.BizInstrument */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull InterfaceC54581xNr interfaceC54581xNr, boolean z, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull CoroutineScope coroutineScope, qTI qti, qTT qtt, @NotNull Function1<? super BizInstrument, java.lang.Boolean> function1, @NotNull java.lang.String str, boolean z2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createSwapFutureCombineDataSource$1 iTradeExtKt$createSwapFutureCombineDataSource$1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        CoroutineScope coroutineScope2;
        qTI qti2;
        qTT qtt2;
        Function1<? super BizInstrument, java.lang.Boolean> function12;
        boolean z3;
        boolean z4;
        final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2;
        InterfaceC54581xNr interfaceC54581xNr2;
        qTI qti3;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        AbstractC54531xLw abstractC54531xLw;
        InterfaceC54581xNr interfaceC54581xNr3;
        Function1<? super BizInstrument, java.lang.Boolean> function13;
        qTI qti4;
        boolean z5;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData3;
        AbstractC54531xLw abstractC54531xLw2;
        boolean z6;
        CoroutineScope coroutineScope3;
        java.lang.String str2;
        Function1<? super BizInstrument, java.lang.Boolean> function14;
        final java.lang.String str3 = str;
        if (continuation instanceof ITradeExtKt$createSwapFutureCombineDataSource$1) {
            iTradeExtKt$createSwapFutureCombineDataSource$1 = (ITradeExtKt$createSwapFutureCombineDataSource$1) continuation;
            int i = iTradeExtKt$createSwapFutureCombineDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createSwapFutureCombineDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createSwapFutureCombineDataSource$1 = new ITradeExtKt$createSwapFutureCombineDataSource$1(continuation);
            }
        }
        java.lang.Object obj = iTradeExtKt$createSwapFutureCombineDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createSwapFutureCombineDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("NavOptPhase1", str3 + " -> create createSwapFutureCombineDataSource");
            AEQbTJ(interfaceC54581xNr);
            if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr, null, 1, null)) {
                mutableLiveData.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                return Unit.INSTANCE;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SWAP") : null;
            if ((abstractC54531xLwOLrzqt == null || !AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null)) && abstractC54531xLwOLrzqt != null) {
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$0 = interfaceC54581xNr;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$1 = mutableLiveData;
                coroutineScope2 = coroutineScope;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$2 = coroutineScope2;
                qti2 = qti;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$3 = qti2;
                qtt2 = qtt;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$4 = qtt2;
                function12 = function1;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$5 = function12;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$6 = str3;
                iTradeExtKt$createSwapFutureCombineDataSource$1.L$7 = abstractC54531xLwOLrzqt;
                z3 = z;
                iTradeExtKt$createSwapFutureCombineDataSource$1.Z$0 = z3;
                z4 = z2;
                iTradeExtKt$createSwapFutureCombineDataSource$1.Z$1 = z4;
                iTradeExtKt$createSwapFutureCombineDataSource$1.label = 1;
                if (copydefault(abstractC54531xLwOLrzqt, iTradeExtKt$createSwapFutureCombineDataSource$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                z3 = z;
                coroutineScope2 = coroutineScope;
                qti2 = qti;
                qtt2 = qtt;
                function12 = function1;
                z4 = z2;
            }
            mutableLiveData2 = mutableLiveData;
            qTI qti5 = qti2;
            interfaceC54581xNr2 = interfaceC54581xNr;
            qti3 = qti5;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z5 = iTradeExtKt$createSwapFutureCombineDataSource$1.Z$1;
                z6 = iTradeExtKt$createSwapFutureCombineDataSource$1.Z$0;
                abstractC54531xLw2 = (AbstractC54531xLw) iTradeExtKt$createSwapFutureCombineDataSource$1.L$8;
                abstractC54531xLw = (AbstractC54531xLw) iTradeExtKt$createSwapFutureCombineDataSource$1.L$7;
                str2 = (java.lang.String) iTradeExtKt$createSwapFutureCombineDataSource$1.L$6;
                function13 = (Function1) iTradeExtKt$createSwapFutureCombineDataSource$1.L$5;
                qtt2 = (qTT) iTradeExtKt$createSwapFutureCombineDataSource$1.L$4;
                qti4 = (qTI) iTradeExtKt$createSwapFutureCombineDataSource$1.L$3;
                coroutineScope3 = (CoroutineScope) iTradeExtKt$createSwapFutureCombineDataSource$1.L$2;
                mutableLiveData3 = (MutableLiveData) iTradeExtKt$createSwapFutureCombineDataSource$1.L$1;
                interfaceC54581xNr3 = (InterfaceC54581xNr) iTradeExtKt$createSwapFutureCombineDataSource$1.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC54531xLwOLrzqt = abstractC54531xLw;
                mutableLiveData2 = mutableLiveData3;
                z4 = z5;
                function14 = function13;
                interfaceC54581xNr2 = interfaceC54581xNr3;
                CoroutineScope coroutineScope4 = coroutineScope3;
                z3 = z6;
                abstractC54531xLwOLrzqt2 = abstractC54531xLw2;
                str3 = str2;
                coroutineScope2 = coroutineScope4;
                if (abstractC54531xLwOLrzqt != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null) && abstractC54531xLwOLrzqt2 != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt2, false, 1, null)) {
                    java.util.List<BizInstrument> listAhwBna = !z4 ? yDY.AhwBna() : abstractC54531xLwOLrzqt.uzCIH();
                    java.util.List<BizInstrument> listAhwBna2 = !z4 ? yDY.AhwBna() : abstractC54531xLwOLrzqt2.uzCIH();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listAhwBna) {
                        if (function14.invoke(obj2).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) queryBizList$default(abstractC54531xLwOLrzqt, false, 1, null));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : listDjBIcL) {
                        if (function14.invoke(obj3).booleanValue()) {
                            arrayList2.add(obj3);
                        }
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : listAhwBna2) {
                        if (function14.invoke(obj4).booleanValue()) {
                            arrayList4.add(obj4);
                        }
                    }
                    java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList4, (java.lang.Iterable) queryBizList$default(abstractC54531xLwOLrzqt2, false, 1, null));
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : listDjBIcL2) {
                        if (function14.invoke(obj5).booleanValue()) {
                            arrayList5.add(obj5);
                        }
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList5);
                    if (arrayList3.isEmpty() && arrayList6.isEmpty()) {
                        mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), new xRD(new java.util.ArrayList(), new java.util.ArrayList(), interfaceC54581xNr2.djBIcL(), mutableLiveData2, z3, coroutineScope2, qti4, qtt2, str3), null));
                    } else {
                        final xRD xrd = new xRD(arrayList3, arrayList6, interfaceC54581xNr2.djBIcL(), mutableLiveData2, z3, coroutineScope2, qti4, qtt2, str3);
                        xrd.EZpvd(new Function1() { // from class: o.xnG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                return C55608xnE.EZpvd(str3, mutableLiveData2, xrd, ((java.lang.Boolean) obj6).booleanValue());
                            }
                        });
                    }
                } else {
                    mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                }
                return Unit.INSTANCE;
            }
            boolean z7 = iTradeExtKt$createSwapFutureCombineDataSource$1.Z$1;
            boolean z8 = iTradeExtKt$createSwapFutureCombineDataSource$1.Z$0;
            AbstractC54531xLw abstractC54531xLw3 = (AbstractC54531xLw) iTradeExtKt$createSwapFutureCombineDataSource$1.L$7;
            java.lang.String str4 = (java.lang.String) iTradeExtKt$createSwapFutureCombineDataSource$1.L$6;
            Function1<? super BizInstrument, java.lang.Boolean> function15 = (Function1) iTradeExtKt$createSwapFutureCombineDataSource$1.L$5;
            qTT qtt3 = (qTT) iTradeExtKt$createSwapFutureCombineDataSource$1.L$4;
            qTI qti6 = (qTI) iTradeExtKt$createSwapFutureCombineDataSource$1.L$3;
            CoroutineScope coroutineScope5 = (CoroutineScope) iTradeExtKt$createSwapFutureCombineDataSource$1.L$2;
            mutableLiveData2 = (MutableLiveData) iTradeExtKt$createSwapFutureCombineDataSource$1.L$1;
            interfaceC54581xNr2 = (InterfaceC54581xNr) iTradeExtKt$createSwapFutureCombineDataSource$1.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC54531xLwOLrzqt = abstractC54531xLw3;
            str3 = str4;
            coroutineScope2 = coroutineScope5;
            z4 = z7;
            qti3 = qti6;
            z3 = z8;
            function12 = function15;
            qtt2 = qtt3;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt("FUTURES") : null;
        if ((abstractC54531xLwOLrzqt2 == null || !AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt2, false, 1, null)) && abstractC54531xLwOLrzqt2 != null) {
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$0 = interfaceC54581xNr2;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$1 = mutableLiveData2;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$2 = coroutineScope2;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$3 = qti3;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$4 = qtt2;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$5 = function12;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$6 = str3;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$7 = abstractC54531xLwOLrzqt;
            iTradeExtKt$createSwapFutureCombineDataSource$1.L$8 = abstractC54531xLwOLrzqt2;
            iTradeExtKt$createSwapFutureCombineDataSource$1.Z$0 = z3;
            iTradeExtKt$createSwapFutureCombineDataSource$1.Z$1 = z4;
            iTradeExtKt$createSwapFutureCombineDataSource$1.label = 2;
            if (copydefault(abstractC54531xLwOLrzqt2, iTradeExtKt$createSwapFutureCombineDataSource$1) == objCopydefault) {
                return objCopydefault;
            }
            abstractC54531xLw = abstractC54531xLwOLrzqt;
            interfaceC54581xNr3 = interfaceC54581xNr2;
            function13 = function12;
            qti4 = qti3;
            z5 = z4;
            mutableLiveData3 = mutableLiveData2;
            java.lang.String str5 = str3;
            abstractC54531xLw2 = abstractC54531xLwOLrzqt2;
            z6 = z3;
            coroutineScope3 = coroutineScope2;
            str2 = str5;
            abstractC54531xLwOLrzqt = abstractC54531xLw;
            mutableLiveData2 = mutableLiveData3;
            z4 = z5;
            function14 = function13;
            interfaceC54581xNr2 = interfaceC54581xNr3;
            CoroutineScope coroutineScope42 = coroutineScope3;
            z3 = z6;
            abstractC54531xLwOLrzqt2 = abstractC54531xLw2;
            str3 = str2;
            coroutineScope2 = coroutineScope42;
            if (abstractC54531xLwOLrzqt != null) {
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
            }
            return Unit.INSTANCE;
        }
        Function1<? super BizInstrument, java.lang.Boolean> function16 = function12;
        qti4 = qti3;
        function14 = function16;
        if (abstractC54531xLwOLrzqt != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, MutableLiveData mutableLiveData, xRD xrd, boolean z) {
        pUU.KWHzl("NavOptPhase1", str + " -> SwapSourceByRepo init callback");
        if (!mutableLiveData.hasActiveObservers()) {
            xrd.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.TRUE, xrd, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull CoroutineScope coroutineScope, qTI qti, qTT qtt, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createPremarketDataSource$1 iTradeExtKt$createPremarketDataSource$1;
        Function1 function1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        CoroutineScope coroutineScope2;
        qTI qti2;
        qTT qtt2;
        boolean z2;
        CoroutineScope coroutineScope3;
        qTI qti3;
        boolean z3;
        Function1 function12;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2;
        AbstractC54531xLw abstractC54531xLw;
        qTT qtt3;
        InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNr;
        final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData3 = mutableLiveData;
        if (continuation instanceof ITradeExtKt$createPremarketDataSource$1) {
            iTradeExtKt$createPremarketDataSource$1 = (ITradeExtKt$createPremarketDataSource$1) continuation;
            int i = iTradeExtKt$createPremarketDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createPremarketDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createPremarketDataSource$1 = new ITradeExtKt$createPremarketDataSource$1(continuation);
            }
        }
        java.lang.Object obj = iTradeExtKt$createPremarketDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createPremarketDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AEQbTJ(interfaceC54581xNr);
            function1 = new Function1() { // from class: o.xnO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C55608xnE.AEQbTJ(mutableLiveData3, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr2, null, 1, null)) {
                function1.invoke(C56443yFo.KWHzl(false));
                return Unit.INSTANCE;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("FUTURES")) == null) {
                function1.invoke(C56443yFo.KWHzl(false));
                return Unit.INSTANCE;
            }
            if (!AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null)) {
                iTradeExtKt$createPremarketDataSource$1.L$0 = interfaceC54581xNr2;
                iTradeExtKt$createPremarketDataSource$1.L$1 = mutableLiveData3;
                coroutineScope3 = coroutineScope;
                iTradeExtKt$createPremarketDataSource$1.L$2 = coroutineScope3;
                qti3 = qti;
                iTradeExtKt$createPremarketDataSource$1.L$3 = qti3;
                iTradeExtKt$createPremarketDataSource$1.L$4 = qtt;
                iTradeExtKt$createPremarketDataSource$1.L$5 = function1;
                iTradeExtKt$createPremarketDataSource$1.L$6 = abstractC54531xLwOLrzqt;
                z3 = z;
                iTradeExtKt$createPremarketDataSource$1.Z$0 = z3;
                iTradeExtKt$createPremarketDataSource$1.label = 1;
                if (copydefault(abstractC54531xLwOLrzqt, iTradeExtKt$createPremarketDataSource$1) == objCopydefault) {
                    return objCopydefault;
                }
                function12 = function1;
                mutableLiveData2 = mutableLiveData3;
                abstractC54531xLw = abstractC54531xLwOLrzqt;
                qtt3 = qtt;
            } else {
                coroutineScope2 = coroutineScope;
                qti2 = qti;
                qtt2 = qtt;
                z2 = z;
                if (!AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null)) {
                    java.util.List<BizInstrument> listUzCIH = abstractC54531xLwOLrzqt.uzCIH();
                    if (listUzCIH.isEmpty()) {
                        function1.invoke(C56443yFo.KWHzl(true));
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        Intrinsics.copydefault(listUzCIH, "");
                        final xRD xrd = new xRD(arrayList, (java.util.ArrayList) listUzCIH, interfaceC54581xNr2.djBIcL(), mutableLiveData3, z2, coroutineScope2, qti2, qtt2, null, 256, null);
                        xrd.EZpvd(new Function1() { // from class: o.xnS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return C55608xnE.copydefault(mutableLiveData3, xrd, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    C43296rmc.KWHzl("MarketTradeCore", "createPremarketDataSource: futureBiz is not init");
                    function1.invoke(C56443yFo.KWHzl(false));
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = iTradeExtKt$createPremarketDataSource$1.Z$0;
            abstractC54531xLw = (AbstractC54531xLw) iTradeExtKt$createPremarketDataSource$1.L$6;
            function12 = (Function1) iTradeExtKt$createPremarketDataSource$1.L$5;
            qtt3 = (qTT) iTradeExtKt$createPremarketDataSource$1.L$4;
            qTI qti4 = (qTI) iTradeExtKt$createPremarketDataSource$1.L$3;
            CoroutineScope coroutineScope4 = (CoroutineScope) iTradeExtKt$createPremarketDataSource$1.L$2;
            mutableLiveData2 = (MutableLiveData) iTradeExtKt$createPremarketDataSource$1.L$1;
            InterfaceC54581xNr interfaceC54581xNr3 = (InterfaceC54581xNr) iTradeExtKt$createPremarketDataSource$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z3 = z4;
            interfaceC54581xNr2 = interfaceC54581xNr3;
            qti3 = qti4;
            coroutineScope3 = coroutineScope4;
        }
        function1 = function12;
        qtt2 = qtt3;
        coroutineScope2 = coroutineScope3;
        qti2 = qti3;
        z2 = z3;
        abstractC54531xLwOLrzqt = abstractC54531xLw;
        mutableLiveData3 = mutableLiveData2;
        if (!AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null)) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MutableLiveData mutableLiveData, boolean z) {
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), null, null));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MutableLiveData mutableLiveData, xRD xrd, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            xrd.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.TRUE, xrd, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: Exception -> 0x00ff, TryCatch #0 {Exception -> 0x00ff, blocks: (B:26:0x009e, B:28:0x00a2, B:30:0x00ac, B:34:0x00bd, B:36:0x00e9, B:35:0x00d6, B:37:0x00f2, B:22:0x0083), top: B:44:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ff, blocks: (B:26:0x009e, B:28:0x00a2, B:30:0x00ac, B:34:0x00bd, B:36:0x00e9, B:35:0x00d6, B:37:0x00f2, B:22:0x0083), top: B:44:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, boolean z, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, @NotNull java.lang.String str, boolean z2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createOptionDataSource$1 iTradeExtKt$createOptionDataSource$1;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2;
        boolean z3;
        boolean z4;
        AbstractC54531xLw abstractC54531xLw;
        final C54651xQg c54651xQg;
        InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNr;
        final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData3 = mutableLiveData;
        final java.lang.String str2 = str;
        if (continuation instanceof ITradeExtKt$createOptionDataSource$1) {
            iTradeExtKt$createOptionDataSource$1 = (ITradeExtKt$createOptionDataSource$1) continuation;
            int i = iTradeExtKt$createOptionDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createOptionDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createOptionDataSource$1 = new ITradeExtKt$createOptionDataSource$1(continuation);
            }
        }
        java.lang.Object obj = iTradeExtKt$createOptionDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createOptionDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("NavOptPhase1", str2 + " -> create createOptionDataSource");
            AEQbTJ(interfaceC54581xNr);
            if (!InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNr2, null, 1, null)) {
                mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                return Unit.INSTANCE;
            }
            try {
                iTradeExtKt$createOptionDataSource$1.L$0 = interfaceC54581xNr2;
                iTradeExtKt$createOptionDataSource$1.L$1 = mutableLiveData3;
                iTradeExtKt$createOptionDataSource$1.L$2 = str2;
                iTradeExtKt$createOptionDataSource$1.Z$0 = z;
                z3 = z2;
                iTradeExtKt$createOptionDataSource$1.Z$1 = z3;
                iTradeExtKt$createOptionDataSource$1.label = 1;
                java.lang.Object objEZpvd = interfaceC54581xNr2.EZpvd("OPTION", iTradeExtKt$createOptionDataSource$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                z4 = z;
                obj = objEZpvd;
                abstractC54531xLw = (AbstractC54531xLw) obj;
                if (abstractC54531xLw == null) {
                }
            } catch (java.lang.Exception e) {
                e = e;
                mutableLiveData2 = mutableLiveData3;
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, e));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = iTradeExtKt$createOptionDataSource$1.Z$1;
            boolean z6 = iTradeExtKt$createOptionDataSource$1.Z$0;
            str2 = (java.lang.String) iTradeExtKt$createOptionDataSource$1.L$2;
            mutableLiveData2 = (MutableLiveData) iTradeExtKt$createOptionDataSource$1.L$1;
            InterfaceC54581xNr interfaceC54581xNr3 = (InterfaceC54581xNr) iTradeExtKt$createOptionDataSource$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                z3 = z5;
                z4 = z6;
                interfaceC54581xNr2 = interfaceC54581xNr3;
                mutableLiveData3 = mutableLiveData2;
                abstractC54531xLw = (AbstractC54531xLw) obj;
                if (abstractC54531xLw == null) {
                    java.util.ArrayList<BizInstrument> arrayListEZpvd = abstractC54531xLw.EZpvd();
                    if (arrayListEZpvd.isEmpty()) {
                        mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                    } else {
                        if (z3) {
                            Intrinsics.copydefault(arrayListEZpvd, "");
                            c54651xQg = new xQF(arrayListEZpvd, interfaceC54581xNr2.djBIcL(), mutableLiveData3, z4, str2);
                        } else {
                            Intrinsics.copydefault(arrayListEZpvd, "");
                            c54651xQg = new C54651xQg(arrayListEZpvd, interfaceC54581xNr2.djBIcL(), mutableLiveData3, z4, null, 16, null);
                        }
                        c54651xQg.OLrzqt(new Function1() { // from class: o.xnN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return C55608xnE.OLrzqt(mutableLiveData3, c54651xQg, str2, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        });
                    }
                } else {
                    mutableLiveData3.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                mutableLiveData2.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, e));
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object createOptionDataSource$default(InterfaceC54581xNr interfaceC54581xNr, boolean z, MutableLiveData mutableLiveData, java.lang.String str, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
        boolean z3 = (i & 1) != 0 ? false : z;
        if ((i & 4) != 0) {
            str = "unknown";
        }
        return OLrzqt(interfaceC54581xNr, z3, (MutableLiveData<SourceResp<AbstractC54646xQb>>) mutableLiveData, str, (i & 8) != 0 ? false : z2, (Continuation<? super Unit>) continuation);
    }

    public static final Unit OLrzqt(MutableLiveData mutableLiveData, C54651xQg c54651xQg, java.lang.String str, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            c54651xQg.valueOf();
        }
        pUU.KWHzl("NavOptPhase1", str + " -> createOptionDataSource init callback");
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.TRUE, c54651xQg, null));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final MutableLiveData<SourceResp<xRH>> mutableLiveData, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AEQbTJ(interfaceC54581xNr);
        if (!interfaceC54581xNr.AEQbTJ(new xNE())) {
            mutableLiveData.postValue(new SourceResp<>(java.lang.Boolean.FALSE, null, null));
        } else {
            final xRM xrm = new xRM(str, str2, mutableLiveData);
            xrm.OLrzqt(new Function2() { // from class: o.xnR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C55608xnE.OLrzqt(mutableLiveData, xrm, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(MutableLiveData mutableLiveData, xRM xrm, boolean z, java.lang.Exception exc) {
        if (!mutableLiveData.hasActiveObservers()) {
            xrm.gEmmrt();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), xrm, exc));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void createTradeSearchLoader$default(InterfaceC54581xNr interfaceC54581xNr, MutableLiveData mutableLiveData, Function1 function1, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        copydefault(interfaceC54581xNr, mutableLiveData, function1, z, z2);
    }

    public static final void copydefault(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull MutableLiveData<xRQ> mutableLiveData, Function1<? super BizInstrument, java.lang.Boolean> function1, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        AEQbTJ(interfaceC54581xNr);
        C54712xSn c54712xSn = new C54712xSn();
        c54712xSn.EZpvd(function1);
        java.util.ArrayList<java.lang.String> arrayListEjfBZ = interfaceC54581xNr.ejfBZ();
        if (arrayListEjfBZ != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEjfBZ) {
                if (!Intrinsics.EZpvd(obj, (java.lang.Object) "MARGIN")) {
                    arrayList.add(obj);
                }
            }
            c54712xSn.EZpvd(arrayList, mutableLiveData, z, z2);
        }
    }

    public static /* synthetic */ void createTradeSearchLoader$default(InterfaceC54581xNr interfaceC54581xNr, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        EZpvd(interfaceC54581xNr, (MutableLiveData<xRQ>) mutableLiveData, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xRQ.init$default(o.xRQ, java.util.List, androidx.lifecycle.MutableLiveData, boolean, boolean, int, java.lang.Object):void */
    public static final void EZpvd(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull MutableLiveData<xRQ> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        AEQbTJ(interfaceC54581xNr);
        C54712xSn c54712xSn = new C54712xSn();
        java.util.ArrayList<java.lang.String> arrayListEjfBZ = interfaceC54581xNr.ejfBZ();
        if (arrayListEjfBZ != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEjfBZ) {
                if (!Intrinsics.EZpvd(obj, (java.lang.Object) "MARGIN")) {
                    arrayList.add(obj);
                }
            }
            xRQ.init$default(c54712xSn, arrayList, mutableLiveData, z, false, 8, null);
        }
    }

    public static /* synthetic */ void createTradeSearchLoader$default(InterfaceC54581xNr interfaceC54581xNr, java.lang.String str, MutableLiveData mutableLiveData, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        EZpvd(interfaceC54581xNr, str, (MutableLiveData<xRQ>) mutableLiveData, z);
    }

    public static final void EZpvd(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull java.lang.String str, @NotNull MutableLiveData<xRQ> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        AEQbTJ(interfaceC54581xNr);
        xRQ.init$default(new C54712xSn(), C56402yEa.EZpvd(str), mutableLiveData, false, z, 4, null);
    }

    public static /* synthetic */ void createCoinsDataSource$default(InterfaceC54581xNr interfaceC54581xNr, boolean z, MutableLiveData mutableLiveData, java.lang.String str, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 1) != 0 ? false : z;
        if ((i & 4) != 0) {
            str = "unknown";
        }
        OLrzqt(interfaceC54581xNr, z4, (MutableLiveData<SourceResp<java.lang.Object>>) mutableLiveData, str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public static final void OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, boolean z, @NotNull final MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, @NotNull final java.lang.String str, boolean z2, boolean z3) {
        java.util.ArrayList<TradeCoinInfo> arrayList;
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("ITrade", str + " -> create CoinsDataSource");
        AEQbTJ(interfaceC54581xNr);
        C56084xwD fieldNames = interfaceC54581xNr.getFieldNames();
        if (fieldNames == null || (arrayList = fieldNames.KWHzl()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        final C54637xPt c54637xPt = new C54637xPt(arrayList, mutableLiveData, null, str, z2, z3, 4, null);
        c54637xPt.OLrzqt(new Function1() { // from class: o.xnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55608xnE.AEQbTJ(str, mutableLiveData, c54637xPt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, MutableLiveData mutableLiveData, C54637xPt c54637xPt, boolean z) {
        pUU.EZpvd("ITrade", str + " -> init CoinsDataSource callback");
        if (!mutableLiveData.hasActiveObservers()) {
            c54637xPt.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), c54637xPt, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void createCoinsDataForMarket$default(InterfaceC54581xNr interfaceC54581xNr, LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData, qTI qti, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        OLrzqt(interfaceC54581xNr, lifecycleOwner, (MutableLiveData<SourceResp<java.lang.Object>>) mutableLiveData, qti, str);
    }

    public static final void OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull LifecycleOwner lifecycleOwner, @NotNull final MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, @NotNull qTI qti, java.lang.String str) {
        java.util.ArrayList<TradeCoinInfo> arrayList;
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(qti, "");
        AEQbTJ(interfaceC54581xNr);
        C56084xwD fieldNames = interfaceC54581xNr.getFieldNames();
        if (fieldNames == null || (arrayList = fieldNames.KWHzl()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        final C54640xPw c54640xPw = new C54640xPw(arrayList, mutableLiveData, lifecycleOwner, qti, str);
        c54640xPw.OLrzqt(new Function1() { // from class: o.xnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55608xnE.AEQbTJ(mutableLiveData, c54640xPw, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(MutableLiveData mutableLiveData, C54640xPw c54640xPw, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            c54640xPw.valueOf();
        }
        mutableLiveData.postValue(new SourceResp(java.lang.Boolean.valueOf(z), c54640xPw, null));
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt() {
        return ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:25:0x006d, B:27:0x0073, B:31:0x007c, B:33:0x0087, B:35:0x00a2, B:34:0x0095, B:36:0x00ab, B:21:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:25:0x006d, B:27:0x0073, B:31:0x007c, B:33:0x0087, B:35:0x00a2, B:34:0x0095, B:36:0x00ab, B:21:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull MutableLiveData<SourceResp<xTS>> mutableLiveData, @NotNull C54588xNy c54588xNy, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$createWatchListSource$1 iTradeExtKt$createWatchListSource$1;
        final MutableLiveData<SourceResp<xTS>> mutableLiveData2;
        xNF xnf;
        boolean z2;
        java.lang.Object objM7386unboximpl;
        if (continuation instanceof ITradeExtKt$createWatchListSource$1) {
            iTradeExtKt$createWatchListSource$1 = (ITradeExtKt$createWatchListSource$1) continuation;
            int i = iTradeExtKt$createWatchListSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$createWatchListSource$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$createWatchListSource$1 = new ITradeExtKt$createWatchListSource$1(continuation);
            }
        }
        ITradeExtKt$createWatchListSource$1 iTradeExtKt$createWatchListSource$12 = iTradeExtKt$createWatchListSource$1;
        java.lang.Object obj = iTradeExtKt$createWatchListSource$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$createWatchListSource$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("WatchListInit", "start init OKTrade  Data ");
            try {
                xnf = new xNF();
                mutableLiveData2 = mutableLiveData;
            } catch (java.lang.Exception e) {
                e = e;
                mutableLiveData2 = mutableLiveData;
            }
            try {
                iTradeExtKt$createWatchListSource$12.L$0 = mutableLiveData2;
                iTradeExtKt$createWatchListSource$12.Z$0 = z;
                iTradeExtKt$createWatchListSource$12.label = 1;
                java.lang.Object objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, xnf, iTradeExtKt$createWatchListSource$12, 1, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                z2 = z;
                objM7386unboximpl = objM8790ensureInitialize0E7RQCE$default;
                if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                EZpvd(mutableLiveData2, false, (xTS) null, e);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = iTradeExtKt$createWatchListSource$12.Z$0;
            MutableLiveData<SourceResp<xTS>> mutableLiveData3 = (MutableLiveData) iTradeExtKt$createWatchListSource$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                z2 = z3;
                mutableLiveData2 = mutableLiveData3;
                if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    EZpvd(mutableLiveData2, false, (xTS) null, (java.lang.Exception) null);
                } else {
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    if (objM7386unboximpl != null) {
                        pUU.KWHzl("WatchListInit", " init OKTrade  success ");
                        final xTS xug = isLogin$default(null, 1, null) ? new xUG(null, null, null, z2, null, 22, null) : new C54771xUs(null, null, null, z2, null, 22, null);
                        xug.KWHzl(new Function2() { // from class: o.xnI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return C55608xnE.KWHzl(mutableLiveData2, xug, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.Exception) obj3);
                            }
                        });
                    }
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                mutableLiveData2 = mutableLiveData3;
                EZpvd(mutableLiveData2, false, (xTS) null, e);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object createWatchListSource$default(InterfaceC54577xNn interfaceC54577xNn, MutableLiveData mutableLiveData, C54588xNy c54588xNy, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c54588xNy = new xNF();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return OLrzqt(interfaceC54577xNn, (MutableLiveData<SourceResp<xTS>>) mutableLiveData, c54588xNy, z, (Continuation<? super Unit>) continuation);
    }

    public static final Unit KWHzl(MutableLiveData mutableLiveData, xTS xts, boolean z, java.lang.Exception exc) {
        if (!mutableLiveData.hasActiveObservers()) {
            xts.valueOf();
        }
        if (z) {
            EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, true, xts, (java.lang.Exception) null);
        } else {
            EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, false, (xTS) null, exc);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object quickWatchDataSource$default(MutableLiveData mutableLiveData, boolean z, Function1 function1, Function1 function12, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return OLrzqt((MutableLiveData<SourceResp<xTS>>) mutableLiveData, z, function1, function12, (Continuation<? super Unit>) continuation);
    }

    public static final <R> java.lang.Object OLrzqt(@NotNull final MutableLiveData<SourceResp<xTS>> mutableLiveData, boolean z, @NotNull Function1<? super java.util.List<? extends MarketDataSource>, ? extends java.util.List<? extends R>> function1, @NotNull Function1<? super java.util.List<? extends R>, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        pUU.KWHzl("WatchListInit", " quickWatchDataSource  start ");
        final xTS xug = isLogin$default(null, 1, null) ? new xUG(new C54760xUh(mutableLiveData), null, null, z, null, 22, null) : new C54771xUs(new C54760xUh(mutableLiveData), null, null, z, null, 22, null);
        xug.AEQbTJ((Function1) function1, (Function1) function12);
        xug.KWHzl(new Function2() { // from class: o.xnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55608xnE.AEQbTJ(mutableLiveData, xug, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Exception) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MutableLiveData mutableLiveData, xTS xts, boolean z, java.lang.Exception exc) {
        if (!mutableLiveData.hasActiveObservers()) {
            xts.valueOf();
        }
        if (z) {
            EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, true, xts, (java.lang.Exception) null);
        } else {
            EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, false, (xTS) null, exc);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull MutableLiveData<SourceResp<xTS>> mutableLiveData, boolean z, xTS xts, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (!mutableLiveData.hasActiveObservers() && xts != null) {
            xts.valueOf();
        }
        mutableLiveData.postValue(new SourceResp<>(java.lang.Boolean.valueOf(z), xts, exc));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xNn.ActionBar.ensureInitialize-0E7RQCE$default(o.xNn, boolean, o.xNy, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull LifecycleOwner lifecycleOwner, @NotNull Continuation<? super InterfaceC54581xNr> continuation) throws java.lang.Throwable {
        ITradeExtKt$ensureInit$1 iTradeExtKt$ensureInit$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof ITradeExtKt$ensureInit$1) {
            iTradeExtKt$ensureInit$1 = (ITradeExtKt$ensureInit$1) continuation;
            int i = iTradeExtKt$ensureInit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$ensureInit$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$ensureInit$1 = new ITradeExtKt$ensureInit$1(continuation);
            }
        }
        ITradeExtKt$ensureInit$1 iTradeExtKt$ensureInit$12 = iTradeExtKt$ensureInit$1;
        java.lang.Object obj = iTradeExtKt$ensureInit$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$ensureInit$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iTradeExtKt$ensureInit$12.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, iTradeExtKt$ensureInit$12, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            return null;
        }
        return objM8790ensureInitialize0E7RQCE$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull Continuation<? super InterfaceC54581xNr> continuation) throws java.lang.Throwable {
        ITradeExtKt$ensureInit$2 iTradeExtKt$ensureInit$2;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof ITradeExtKt$ensureInit$2) {
            iTradeExtKt$ensureInit$2 = (ITradeExtKt$ensureInit$2) continuation;
            int i = iTradeExtKt$ensureInit$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$ensureInit$2.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$ensureInit$2 = new ITradeExtKt$ensureInit$2(continuation);
            }
        }
        ITradeExtKt$ensureInit$2 iTradeExtKt$ensureInit$22 = iTradeExtKt$ensureInit$2;
        java.lang.Object obj = iTradeExtKt$ensureInit$22.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$ensureInit$22.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iTradeExtKt$ensureInit$22.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, iTradeExtKt$ensureInit$22, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            return null;
        }
        return objM8790ensureInitialize0E7RQCE$default;
    }

    public static /* synthetic */ boolean isLogin$default(android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return copydefault(context);
    }

    public static final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().values();
    }

    public static final boolean copydefault() {
        return !(((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ() != null ? Intrinsics.EZpvd(r0.valueOf(), java.lang.Boolean.FALSE) : false);
    }

    public static final boolean AEQbTJ() {
        return !(((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ() != null ? Intrinsics.EZpvd(r0.gEmmrt(), java.lang.Boolean.FALSE) : false);
    }

    public static final boolean EZpvd() {
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        if (xndAEQbTJ != null) {
            return Intrinsics.EZpvd(xndAEQbTJ.values(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public static final java.lang.Object copydefault(@NotNull AbstractC54531xLw abstractC54531xLw, @NotNull Continuation<? super Unit> continuation) {
        if (AbstractC54531xLw.isInitFun$default(abstractC54531xLw, false, 1, null)) {
            return Unit.INSTANCE;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return Unit.INSTANCE;
        }
        java.lang.Object objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(abstractC54531xLw.AYXKKw(), (Continuation<? super AbstractC54531xLw>) continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull InterfaceC54581xNr interfaceC54581xNr, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ITradeExtKt$tryToInitTradeGroupList$1 iTradeExtKt$tryToInitTradeGroupList$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        Unit unit;
        java.util.List<TradeGroupData> listKWHzl;
        if (continuation instanceof ITradeExtKt$tryToInitTradeGroupList$1) {
            iTradeExtKt$tryToInitTradeGroupList$1 = (ITradeExtKt$tryToInitTradeGroupList$1) continuation;
            int i = iTradeExtKt$tryToInitTradeGroupList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iTradeExtKt$tryToInitTradeGroupList$1.label = i - Integer.MIN_VALUE;
            } else {
                iTradeExtKt$tryToInitTradeGroupList$1 = new ITradeExtKt$tryToInitTradeGroupList$1(continuation);
            }
        }
        java.lang.Object categoryList = iTradeExtKt$tryToInitTradeGroupList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iTradeExtKt$tryToInitTradeGroupList$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(categoryList);
            Result.Application application2 = Result.Companion;
            pUU.EZpvd("MarketTradeCore", "tryToInitTradeGroupList() called suspend");
            java.util.ArrayList<TradeGroupData> arrayListUzCIH = interfaceC54581xNr.uzCIH();
            if (arrayListUzCIH != null && !arrayListUzCIH.isEmpty()) {
                pUU.KWHzl("MarketTradeCore", "tryToInitTradeGroupList: data is Ready");
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null && z) {
                    throw thM7380exceptionOrNullimpl;
                }
                return Unit.INSTANCE;
            }
            pUU.KWHzl("MarketTradeCore", "tryToInitTradeGroupList: try get Data from net");
            MarketHttpApi marketHttpApi = (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
            iTradeExtKt$tryToInitTradeGroupList$1.L$0 = interfaceC54581xNr;
            iTradeExtKt$tryToInitTradeGroupList$1.Z$0 = z;
            iTradeExtKt$tryToInitTradeGroupList$1.label = 1;
            categoryList = marketHttpApi.getCategoryList("18", iTradeExtKt$tryToInitTradeGroupList$1);
            if (categoryList == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = iTradeExtKt$tryToInitTradeGroupList$1.Z$0;
            interfaceC54581xNr = (InterfaceC54581xNr) iTradeExtKt$tryToInitTradeGroupList$1.L$0;
            C56391yDq.AEQbTJ(categoryList);
        }
        java.util.List list = (java.util.List) ((ResponseData) categoryList).getData();
        if (list == null || (listKWHzl = KWHzl((java.util.List<CategoryRespData>) list)) == null) {
            unit = null;
        } else {
            interfaceC54581xNr.OLrzqt(new java.util.ArrayList<>(listKWHzl));
            unit = Unit.INSTANCE;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object tryToInitTradeGroupList$default(InterfaceC54581xNr interfaceC54581xNr, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return KWHzl(interfaceC54581xNr, z, (Continuation<? super Unit>) continuation);
    }

    public static final void KWHzl(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.EZpvd("MarketTradeCore", "tryToInitTradeGroupList() called");
        java.util.ArrayList<TradeGroupData> arrayListUzCIH = interfaceC54581xNr.uzCIH();
        if (arrayListUzCIH == null || arrayListUzCIH.isEmpty()) {
            pUU.KWHzl("MarketTradeCore", "tryToInitTradeGroupList: try get Data from net");
            new C54452xIy().copydefault("18", new StateListAnimator(interfaceC54581xNr, function1));
        } else {
            pUU.KWHzl("MarketTradeCore", "tryToInitTradeGroupList: data is Ready");
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o.xnE$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends TradeGroupData>> {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;
        public final /* synthetic */ InterfaceC54581xNr OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(InterfaceC54581xNr interfaceC54581xNr, Function1<? super java.lang.Boolean, Unit> function1) {
            this.OLrzqt = interfaceC54581xNr;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TradeGroupData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TradeGroupData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TradeGroupData> list, java.lang.Exception exc) {
            if (z) {
                InterfaceC54581xNr interfaceC54581xNr = this.OLrzqt;
                if (list == null) {
                    list = yDY.AhwBna();
                }
                interfaceC54581xNr.OLrzqt(new java.util.ArrayList<>(list));
                this.KWHzl.invoke(java.lang.Boolean.TRUE);
                return;
            }
            this.KWHzl.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final java.util.List<TradeGroupData> KWHzl(java.util.List<CategoryRespData> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CategoryRespData categoryRespData : list) {
            arrayList.add(new TradeGroupData(categoryRespData.getCode(), categoryRespData.getMessage(), categoryRespData.getType(), categoryRespData.isNew(), false, 16, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public static final java.util.List<BizInstrument> EZpvd(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        java.util.Collection collectionAhwBna;
        java.lang.Iterable iterableAhwBna;
        java.util.ArrayList arrayList;
        java.lang.Object next;
        java.util.List<BizInstrument> listAhwBna;
        java.util.List<BizInstrument> listUzCIH;
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNr.OLrzqt("FUTURES");
            if (abstractC54531xLwOLrzqt != null) {
                abstractC54531xLwOLrzqt.iwGUEr();
            }
            return (abstractC54531xLwOLrzqt == null || (listUzCIH = abstractC54531xLwOLrzqt.uzCIH()) == null) ? yDY.AhwBna() : listUzCIH;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapIwGUEr = interfaceC54581xNr.iwGUEr();
            java.util.Set<Map.Entry<java.lang.String, java.util.List<java.lang.String>>> setEntrySet = mapIwGUEr.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            java.util.Iterator<T> it = setEntrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((java.util.List) ((Map.Entry) next).getValue()).contains(str2)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            java.lang.String str3 = entry != null ? (java.lang.String) entry.getKey() : null;
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNr.OLrzqt("SPOT");
            if (abstractC54531xLwOLrzqt2 != null) {
                abstractC54531xLwOLrzqt2.iwGUEr();
            }
            if (abstractC54531xLwOLrzqt2 == null || (listAhwBna = abstractC54531xLwOLrzqt2.EZpvd()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            if (str3 == null) {
                return listAhwBna;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listAhwBna) {
                BizInstrument bizInstrument = (BizInstrument) obj;
                java.util.List<java.lang.String> list = mapIwGUEr.get(str3);
                if (list != null && list.contains(bizInstrument.getQuoteSymbol())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
            AbstractC54531xLw abstractC54531xLwOLrzqt3 = interfaceC54581xNr.OLrzqt("FUTURES");
            AbstractC54531xLw abstractC54531xLwOLrzqt4 = interfaceC54581xNr.OLrzqt("SWAP");
            if (abstractC54531xLwOLrzqt3 != null && abstractC54531xLwOLrzqt3.iwGUEr() && abstractC54531xLwOLrzqt4 != null) {
                abstractC54531xLwOLrzqt4.iwGUEr();
            }
            if (abstractC54531xLwOLrzqt4 == null || (collectionAhwBna = abstractC54531xLwOLrzqt4.EZpvd()) == null) {
                collectionAhwBna = yDY.AhwBna();
            }
            if (abstractC54531xLwOLrzqt3 == null || (iterableAhwBna = abstractC54531xLwOLrzqt3.EZpvd()) == null) {
                iterableAhwBna = yDY.AhwBna();
            }
            java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL(collectionAhwBna, iterableAhwBna);
            if (C59449zhJ.OLrzqt((java.lang.CharSequence) str2, (java.lang.CharSequence) "USD", true)) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listDjBIcL) {
                    if (C59449zhJ.OLrzqt((java.lang.CharSequence) ((BizInstrument) obj2).getQuoteSymbol(), (java.lang.CharSequence) "USD", true)) {
                        arrayList3.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (java.lang.Object obj3 : arrayList3) {
                    java.lang.String tradeSymbol = ((BizInstrument) obj3).getTradeSymbol();
                    java.lang.Object arrayList4 = linkedHashMap.get(tradeSymbol);
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                        linkedHashMap.put(tradeSymbol, arrayList4);
                    }
                    ((java.util.List) arrayList4).add(obj3);
                }
                java.util.Set setEntrySet2 = linkedHashMap.entrySet();
                arrayList = new java.util.ArrayList();
                java.util.Iterator it2 = setEntrySet2.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll((java.util.Collection) ((Map.Entry) it2.next()).getValue());
                }
            } else {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj4 : listDjBIcL) {
                    if (C59449zhJ.OLrzqt((java.lang.CharSequence) ((BizInstrument) obj4).getQuoteSymbol(), (java.lang.CharSequence) str2, true)) {
                        arrayList.add(obj4);
                    }
                }
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    public static final java.util.List<BizInstrument> AEQbTJ(@NotNull AbstractC54531xLw abstractC54531xLw) {
        Intrinsics.checkNotNullParameter(abstractC54531xLw, "");
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        return (xndAEQbTJ == null || !xndAEQbTJ.fJNWhG()) ? yDY.AhwBna() : abstractC54531xLw.uzCIH();
    }

    public static /* synthetic */ java.util.List queryBizList$default(AbstractC54531xLw abstractC54531xLw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(abstractC54531xLw, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<BizInstrument> copydefault(@NotNull AbstractC54531xLw abstractC54531xLw, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(abstractC54531xLw, "");
        if ((abstractC54531xLw instanceof xLL) || (abstractC54531xLw instanceof xLJ)) {
            return abstractC54531xLw.EZpvd();
        }
        xND xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ();
        if (xndAEQbTJ != null) {
            z2 = xndAEQbTJ.fJNWhG();
        }
        return (z2 && z) ? abstractC54531xLw.EZpvd() : abstractC54531xLw.AhwBna();
    }
}
