package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.im.usecase.group.members.GetMaxMemberCountUseCase$execute$2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.biz.OkSwapBiz$ensureInitialized$2;
import com.okinc.unify_trade.trade.biz.task.swap.SwapLoaderInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import o.C54268xCc;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLU extends AbstractC54531xLw implements InterfaceC54532xLx {
    private static int AuCTelauCTel = 1;
    public static final Activity Companion;
    public static final int fJNWhG = 8;
    private static int uzCIH = 0;
    private static int zLjUOn = 0;
    private static int zsXlph = 1;
    public final java.util.HashMap<java.lang.String, BizInstrument> AuCTel;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> ejfBZ;
    public final java.util.ArrayList<BizInstrument> fIwbmz;
    public final java.util.HashMap<java.lang.String, IdxConfig> getFieldNames;
    public xMC getNewProxyInstance;
    public final java.util.HashMap<java.lang.String, IdxCcyConfig> hDKMBd;
    public final java.lang.String iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Activity(defaultConstructorMarker);
        int i = zLjUOn + 85;
        AuCTelauCTel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        xLU xlu = (xLU) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        ResponseData responseData = (ResponseData) objArr[3];
        int i = 2 % 2;
        int i2 = uzCIH + 29;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Unit unitKWHzl = KWHzl(str, xlu, function1, responseData);
        int i4 = zsXlph + 71;
        uzCIH = i4 % 128;
        if (i4 % 2 == 0) {
            return unitKWHzl;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit AEQbTJ(xLU xlu, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = uzCIH + 13;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(xlu, function1, responseData);
        int i4 = zsXlph + 95;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object OLrzqt(int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~((~i5) | i7);
        int i9 = ~(i | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i5;
        int i12 = ~(i7 | i5);
        int i13 = i6 + i5 + i4 + (1577873432 * i2) + (977123338 * i3);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i6) - 865599488) + ((-647756440) * i5) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i4) + ((-767557632) * i2) + (1290797056 * i3) + ((-539361280) * i14);
        int i16 = (i6 * (-1177406726)) + 1326046462 + (i5 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i4 * (-1177406223)) + (i2 * 1546282648) + (i3 * (-1884272278)) + (i14 * 70909952);
        int i17 = i15 + (i16 * i16 * 451280896);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? EZpvd(objArr) : AEQbTJ(objArr) : OLrzqt(objArr) : KWHzl(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        xLU xlu = (xLU) objArr[0];
        ResponseData responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        int i2 = uzCIH + 83;
        zsXlph = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            OLrzqt(xlu, responseData);
            obj.hashCode();
            throw null;
        }
        Unit unitOLrzqt = OLrzqt(xlu, responseData);
        int i3 = zsXlph + 115;
        uzCIH = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOLrzqt;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxConfig> DbNXlk() {
        int i = 2 % 2;
        int i2 = zsXlph;
        int i3 = i2 + 1;
        uzCIH = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        java.util.HashMap<java.lang.String, IdxConfig> map = this.getFieldNames;
        int i4 = i2 + 21;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, BizInstrument> djBIcL() {
        int i = 2 % 2;
        int i2 = uzCIH + 115;
        zsXlph = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AuCTel;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String isConnected() {
        int i = 2 % 2;
        int i2 = zsXlph;
        int i3 = i2 + 87;
        uzCIH = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        java.lang.String str = this.iwGUEr;
        int i4 = i2 + 53;
        uzCIH = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> valueOf() {
        int i = 2 % 2;
        int i2 = uzCIH + 53;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = this.fIwbmz;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxCcyConfig> values() {
        int i = 2 % 2;
        int i2 = zsXlph + 121;
        uzCIH = i2 % 128;
        if (i2 % 2 == 0) {
            return this.hDKMBd;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xLU(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
        this.ejfBZ = map;
        this.iwGUEr = "SWAP";
        this.fIwbmz = new java.util.ArrayList<>();
        this.AuCTel = new java.util.HashMap<>();
        this.getFieldNames = new java.util.HashMap<>();
        this.hDKMBd = new java.util.HashMap<>();
        this.getNewProxyInstance = new xMC();
    }

    public static final /* synthetic */ void EZpvd(xLU xlu, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = uzCIH + 21;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
        OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, 302375137, -302375137, new java.lang.Object[]{xlu, responseData});
        int i4 = uzCIH + 59;
        zsXlph = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ xMC KWHzl(xLU xlu) {
        int i = 2 % 2;
        int i2 = uzCIH + 49;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        xMC xmc = xlu.getNewProxyInstance;
        if (i3 != 0) {
            return xmc;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xLU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = uzCIH + 27;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (z || !iwGUEr()) {
            z2 = false;
        } else {
            int i4 = uzCIH + 115;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        }
        boolean zZLjUOn = zLjUOn();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("----------->refreshCurrentBiz ensureInitialized ");
        sb.append(z2);
        sb.append(" -- ");
        sb.append(!zZLjUOn);
        pUU.KWHzl("OkSwapBiz", sb.toString());
        fJNWhG().add(mutableLiveData);
        if (!z) {
            int i6 = uzCIH + 9;
            zsXlph = i6 % 128;
            int i7 = i6 % 2;
            if (iwGUEr()) {
                KWHzl(true, (java.lang.String) null);
                return;
            }
        }
        if (zLjUOn()) {
            return;
        }
        AEQbTJ(true);
        this.getNewProxyInstance.copydefault(new Function1() { // from class: o.xLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.KWHzl, (ResponseData) obj};
                return (Unit) xLU.OLrzqt(GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), 1655190533, -1655190531, objArr);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(xLU xlu, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = uzCIH + 47;
        zsXlph = i2 % 128;
        java.lang.String msg = null;
        if (i2 % 2 == 0) {
            xlu.AEQbTJ(false);
            if (responseData != null) {
                if (responseData.getCode() == 0) {
                    int i3 = uzCIH + 1;
                    zsXlph = i3 % 128;
                    int i4 = i3 % 2;
                    if (responseData.getData() != null) {
                        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
                        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
                        OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, 302375137, -302375137, new java.lang.Object[]{xlu, responseData});
                        xlu.KWHzl(true, (java.lang.String) null);
                    } else {
                        if (responseData != null) {
                            int i5 = uzCIH + 61;
                            zsXlph = i5 % 128;
                            int i6 = i5 % 2;
                            msg = responseData.getMsg();
                        }
                        xlu.KWHzl(false, msg);
                    }
                }
            }
        } else {
            xlu.AEQbTJ(false);
            if (responseData != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = zsXlph + 63;
        uzCIH = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            xLU.this.AEQbTJ(false);
        }
    }

    public static final class TaskDescription implements Function1<ResponseData<SwapLoaderInfo>, Unit> {
        public final /* synthetic */ AtomicBoolean KWHzl;
        public final /* synthetic */ CancellableContinuation<Result<? extends AbstractC54531xLw>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Result<? extends o.xLw>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(AtomicBoolean atomicBoolean, CancellableContinuation<? super Result<? extends AbstractC54531xLw>> cancellableContinuation) {
            this.KWHzl = atomicBoolean;
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<SwapLoaderInfo> responseData) {
            copydefault(responseData);
            return Unit.INSTANCE;
        }

        public final void copydefault(ResponseData<SwapLoaderInfo> responseData) {
            pUU.KWHzl("TradeInstrumentTask-OkSwapBiz", "----->> ensureInitialized refreshData");
            if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                try {
                    xLU.EZpvd(xLU.this, responseData);
                    xLU.this.AEQbTJ(false);
                    xLU.this.KWHzl(true, (java.lang.String) null);
                    if (this.KWHzl.getAndSet(true)) {
                        return;
                    }
                    CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation = this.copydefault;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(xLU.this))));
                    return;
                } catch (java.lang.Throwable th) {
                    xLU.this.AEQbTJ(false);
                    throw th;
                }
            }
            xLU.this.AEQbTJ(false);
            xLU.this.KWHzl(false, responseData != null ? responseData.getMsg() : null);
            if (this.KWHzl.getAndSet(true)) {
                return;
            }
            CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation2 = this.copydefault;
            Result.Application application2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(responseData != null ? responseData.getMsg() : null))))));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [156=4] */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        java.util.List<InstrumentInfo> bizList;
        java.util.ArrayList<IdxCcyConfig> idxCcyConfig;
        TradeConfigData config;
        TradeConfigData config2;
        xLU xlu = (xLU) objArr[0];
        ResponseData responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        int i2 = uzCIH + 101;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        SwapLoaderInfo swapLoaderInfo = (SwapLoaderInfo) responseData.getData();
        if (swapLoaderInfo != null) {
            int i4 = zsXlph + 39;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                bizList = swapLoaderInfo.getBizList();
                int i5 = 98 / 0;
            } else {
                bizList = swapLoaderInfo.getBizList();
            }
        } else {
            bizList = null;
        }
        OLrzqt(GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), -1897070362, 1897070363, new java.lang.Object[]{xlu, bizList});
        SwapLoaderInfo swapLoaderInfo2 = (SwapLoaderInfo) responseData.getData();
        xlu.EZpvd((swapLoaderInfo2 == null || (config2 = swapLoaderInfo2.getConfig()) == null) ? null : config2.getIdxConfig());
        SwapLoaderInfo swapLoaderInfo3 = (SwapLoaderInfo) responseData.getData();
        if (swapLoaderInfo3 == null || (config = swapLoaderInfo3.getConfig()) == null) {
            int i6 = uzCIH + 69;
            zsXlph = i6 % 128;
            int i7 = i6 % 2;
            idxCcyConfig = null;
        } else {
            idxCcyConfig = config.getIdxCcyConfig();
        }
        xlu.AEQbTJ(idxCcyConfig);
        SwapLoaderInfo swapLoaderInfo4 = (SwapLoaderInfo) responseData.getData();
        xlu.AEQbTJ("SWAP", swapLoaderInfo4 != null ? swapLoaderInfo4.getCountDownList() : null);
        xlu.AubY();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument KWHzl(@NotNull java.lang.String str, java.lang.Boolean bool) {
        int i = 2 % 2;
        int i2 = zsXlph + 99;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument = djBIcL().get(str);
        if (bizInstrument == null || !bizInstrument.isPreMarketPair()) {
            return bizInstrument;
        }
        int i4 = zsXlph + 47;
        uzCIH = i4 % 128;
        java.lang.Object obj = null;
        if (i4 % 2 == 0) {
            if (!(!Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE))) {
                return null;
            }
            return bizInstrument;
        }
        Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE);
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [176=4, 191=6] */
    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        xLU xlu = (xLU) objArr[0];
        java.util.List list = (java.util.List) objArr[1];
        int i = 2 % 2;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            xlu.djBIcL().clear();
        }
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int i2 = uzCIH + 85;
                zsXlph = i2 % 128;
                if (i2 % 2 == 0) {
                    C54268xCc.Companion.EZpvd((InstrumentInfo) it.next()).isPreMarketPair();
                    obj.hashCode();
                    throw null;
                }
                InstrumentInfo instrumentInfo = (InstrumentInfo) it.next();
                SwapInstrument swapInstrumentEZpvd = C54268xCc.Companion.EZpvd(instrumentInfo);
                if (swapInstrumentEZpvd.isPreMarketPair() || swapInstrumentEZpvd.isRebasePair()) {
                    if (xlu.getNewProxyInstance().fJNWhG()) {
                        int i3 = uzCIH + 67;
                        zsXlph = i3 % 128;
                        if (i3 % 2 == 0) {
                            swapInstrumentEZpvd.isPreMarketPair();
                            obj.hashCode();
                            throw null;
                        }
                        if (swapInstrumentEZpvd.isPreMarketPair()) {
                            arrayList2.add(swapInstrumentEZpvd);
                        }
                    }
                    if (xlu.getNewProxyInstance().fJNWhG()) {
                        int i4 = uzCIH + 35;
                        zsXlph = i4 % 128;
                        if (i4 % 2 == 0) {
                            swapInstrumentEZpvd.isRebasePair();
                            obj.hashCode();
                            throw null;
                        }
                        if (swapInstrumentEZpvd.isRebasePair()) {
                            arrayList3.add(swapInstrumentEZpvd);
                        }
                    } else {
                        continue;
                    }
                } else {
                    arrayList4.add(swapInstrumentEZpvd);
                }
                arrayList.add(swapInstrumentEZpvd);
                xlu.djBIcL().put(instrumentInfo.getInstId(), swapInstrumentEZpvd);
                xlu.valueOf(swapInstrumentEZpvd);
                xlu.AYXKKw(swapInstrumentEZpvd);
            }
        }
        xlu.KWHzl((java.util.List<? extends BizInstrument>) arrayList2);
        xlu.OLrzqt((java.util.List<? extends BizInstrument>) arrayList3);
        xlu.copydefault(arrayList4);
        xlu.OLrzqt(arrayList);
        return null;
    }

    public final void KWHzl(java.util.List<? extends BizInstrument> list) {
        int i = 2 % 2;
        int i2 = zsXlph + 91;
        uzCIH = i2 % 128;
        if (i2 % 2 == 0) {
            AuCTel().clear();
            AuCTel().addAll(list);
            int i3 = zsXlph + 13;
            uzCIH = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 63 / 0;
                return;
            }
            return;
        }
        AuCTel().clear();
        AuCTel().addAll(list);
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> uzCIH() {
        int i = 2 % 2;
        int i2 = zsXlph + 43;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        java.util.ArrayList<BizInstrument> arrayListAuCTel = AuCTel();
        int i4 = zsXlph + 35;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return arrayListAuCTel;
    }

    public final void OLrzqt(java.util.List<? extends BizInstrument> list) {
        int i = 2 % 2;
        int i2 = uzCIH + 27;
        zsXlph = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            fARcdN().clear();
            fARcdN().addAll(list);
            int i3 = zsXlph + 93;
            uzCIH = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        fARcdN().clear();
        fARcdN().addAll(list);
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> hDKMBd() {
        java.util.ArrayList<BizInstrument> arrayListFARcdN;
        int i = 2 % 2;
        int i2 = uzCIH + 101;
        zsXlph = i2 % 128;
        if (i2 % 2 == 0) {
            arrayListFARcdN = fARcdN();
            int i3 = 72 / 0;
        } else {
            arrayListFARcdN = fARcdN();
        }
        int i4 = zsXlph + 3;
        uzCIH = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayListFARcdN;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void copydefault(java.util.List<? extends BizInstrument> list) {
        int i = 2 % 2;
        int i2 = uzCIH + 33;
        zsXlph = i2 % 128;
        if (i2 % 2 != 0) {
            AkhnZx().clear();
            AkhnZx().addAll(list);
            int i3 = zsXlph + 123;
            uzCIH = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AkhnZx().clear();
        AkhnZx().addAll(list);
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> AhwBna() {
        int i = 2 % 2;
        int i2 = zsXlph + 107;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        java.util.ArrayList<BizInstrument> arrayListAkhnZx = AkhnZx();
        int i4 = zsXlph + 123;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return arrayListAkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = uzCIH + 75;
        zsXlph = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            Intrinsics.checkNotNullParameter(function1, "");
            AEQbTJ(bizInstrument.getInstId(), function1);
            int i3 = 96 / 0;
        } else {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            Intrinsics.checkNotNullParameter(function1, "");
            AEQbTJ(bizInstrument.getInstId(), function1);
        }
        int i4 = zsXlph + 57;
        uzCIH = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("OkSwapBiz", "----------->OkSwapBiz loadBizInfoDetail " + str);
        this.getNewProxyInstance.KWHzl(str, new Function1() { // from class: o.xLS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {str, this, function1, (ResponseData) obj};
                return (Unit) xLU.OLrzqt(GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), 316798993, -316798990, objArr);
            }
        });
        int i2 = uzCIH + 7;
        zsXlph = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(java.lang.String str, xLU xlu, Function1 function1, ResponseData responseData) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        boolean z2 = true;
        if (responseData.getCode() == 0) {
            int i2 = uzCIH + 45;
            zsXlph = i2 % 128;
            if (i2 % 2 == 0) {
                responseData.getData();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            z = responseData.getData() != null;
        }
        pUU.KWHzl("OkSwapBiz", "----------->OkSwapBiz loadBizInfoDetail " + str + " callback isSucceedAndDataValid:" + z);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C54268xCc.ActionBar actionBar = C54268xCc.Companion;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            SwapInstrument swapInstrumentEZpvd = actionBar.EZpvd((InstrumentInfo) data);
            xlu.djBIcL().put(swapInstrumentEZpvd.getInstId(), swapInstrumentEZpvd);
        }
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            z2 = false;
        } else {
            int i3 = zsXlph + 119;
            uzCIH = i3 % 128;
            int i4 = i3 % 2;
        }
        function1.invoke(java.lang.Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function1<ResponseData<InstrumentInfo>, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> EZpvd;
        public final /* synthetic */ AtomicBoolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.copydefault = atomicBoolean;
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<InstrumentInfo> responseData) {
            EZpvd(responseData);
            return Unit.INSTANCE;
        }

        public final void EZpvd(ResponseData<InstrumentInfo> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            pUU.KWHzl("OkSwapBiz", "----------->OkSwapBiz loadBizInfoDetail callback isSucceedAndDataValid:" + (responseData.getCode() == 0 && responseData.getData() != null));
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                C54268xCc.ActionBar actionBar = C54268xCc.Companion;
                InstrumentInfo data = responseData.getData();
                Intrinsics.copydefault(data);
                SwapInstrument swapInstrumentEZpvd = actionBar.EZpvd(data);
                xLU.this.djBIcL().put(swapInstrumentEZpvd.getInstId(), swapInstrumentEZpvd);
            }
            if (this.copydefault.getAndSet(true)) {
                return;
            }
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.EZpvd;
            boolean z = responseData.getCode() == 0 && responseData.getData() != null;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void KWHzl(@NotNull java.util.ArrayList<InstrumentInfo> arrayList) {
        int i = 2 % 2;
        int i2 = zsXlph + 51;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        if (iwGUEr()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it.hasNext()) {
                int i4 = zsXlph + 91;
                uzCIH = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = uzCIH + 59;
            zsXlph = i5 % 128;
            if (i5 % 2 == 0) {
                SwapInstrument swapInstrumentEZpvd = C54268xCc.Companion.EZpvd((InstrumentInfo) it.next());
                valueOf().add(swapInstrumentEZpvd);
                djBIcL().put(swapInstrumentEZpvd.getInstId(), swapInstrumentEZpvd);
                throw null;
            }
            SwapInstrument swapInstrumentEZpvd2 = C54268xCc.Companion.EZpvd((InstrumentInfo) it.next());
            valueOf().add(swapInstrumentEZpvd2);
            djBIcL().put(swapInstrumentEZpvd2.getInstId(), swapInstrumentEZpvd2);
        }
    }

    public static final class Application extends AbstractC55758xpw {
        public Application(java.lang.String str, java.lang.String str2) {
            super(str, str2, "SWAP");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(java.util.List<? extends CountDownInfo> list, java.lang.String str) {
            EZpvd2((java.util.List<CountDownInfo>) list, str);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(java.util.List<CountDownInfo> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("OkSwapBiz", "CountDownBizInfoListener---" + list);
            xLU.this.AEQbTJ("SWAP", list);
            RxBus.KWHzl("NEW_CONTRACT_ONLINE_STATUS_UPDATE");
        }
    }

    public final void AubY() {
        int i = 2 % 2;
        wlaJM();
        EZpvd(new Application(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), getNewProxyInstance().AEQbTJ()));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            AbstractC55758xpw abstractC55758xpwEjfBZ = ejfBZ();
            Intrinsics.copydefault(abstractC55758xpwEjfBZ);
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(abstractC55758xpwEjfBZ));
            int i2 = zsXlph + 79;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = zsXlph + 43;
        uzCIH = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void copydefault(@NotNull final Function1<? super ResponseData<java.util.List<CountDownInfo>>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.getNewProxyInstance.KWHzl(new Function1() { // from class: o.xLT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLU.AEQbTJ(this.AEQbTJ, function1, (ResponseData) obj);
            }
        });
        int i2 = uzCIH + 51;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(xLU xlu, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = uzCIH + 35;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            int i4 = uzCIH + 51;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            if (responseData.getData() != null) {
                xlu.AEQbTJ("SWAP", (java.util.List<CountDownInfo>) responseData.getData());
                xlu.AubY();
            }
        }
        function1.invoke(responseData);
        Unit unit = Unit.INSTANCE;
        int i6 = uzCIH + 47;
        zsXlph = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [301=4] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r5 != null) goto L27;
     */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String gEmmrt(BizInstrument bizInstrument) {
        java.lang.String strOLrzqt;
        xOW newProxyInstance;
        int i = 2 % 2;
        SwapInstrument swapInstrument = null;
        if (bizInstrument instanceof SwapInstrument) {
            int i2 = zsXlph + 83;
            uzCIH = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            swapInstrument = (SwapInstrument) bizInstrument;
        } else {
            int i3 = zsXlph + 115;
            uzCIH = i3 % 128;
            int i4 = i3 % 2;
        }
        if (swapInstrument == null) {
            return "";
        }
        if (!swapInstrument.isPositiveContract()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                xOW newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                if (newProxyInstance2 != null) {
                    strOLrzqt = newProxyInstance2.OLrzqt();
                }
            }
            return "1";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && (strOLrzqt = newProxyInstance.iwGUEr()) != null) {
            int i5 = zsXlph + 51;
            uzCIH = i5 % 128;
            int i6 = i5 % 2;
            int i7 = uzCIH + 83;
            zsXlph = i7 % 128;
            int i8 = i7 % 2;
            return strOLrzqt;
        }
        return "1";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String copydefault(BizInstrument bizInstrument) {
        SwapInstrument swapInstrument;
        java.lang.String str;
        int i = 2 % 2;
        int i2 = zsXlph;
        int i3 = i2 + 57;
        uzCIH = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
            swapInstrument = bizInstrument instanceof SwapInstrument ? (SwapInstrument) bizInstrument : null;
        } else if (bizInstrument instanceof SwapInstrument) {
        }
        if (swapInstrument == null) {
            int i5 = i2 + 107;
            uzCIH = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        } else {
            int i7 = i2 + 91;
            uzCIH = i7 % 128;
            int i8 = i7 % 2;
            str = swapInstrument.isPositiveContract() ? "linear" : "inverse";
        }
        int i9 = uzCIH + 81;
        zsXlph = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 61 / 0;
        }
        return str;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String EZpvd(BizInstrument bizInstrument) {
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        int i = 2 % 2;
        if (bizInstrument == null) {
            return null;
        }
        int i2 = zsXlph + 87;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        if (isConnected(bizInstrument)) {
            int i4 = zsXlph + 79;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(bizInstrument.getInstFamily());
            if (idxCcyConfigFetchVPNInfo != null) {
                return idxCcyConfigFetchVPNInfo.getCcySign();
            }
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        int i6 = uzCIH + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        zsXlph = i6 % 128;
        if (i6 % 2 == 0) {
            interfaceC54581xNrOLrzqt.getNewProxyInstance();
            throw null;
        }
        xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
        if (newProxyInstance == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) {
            return null;
        }
        return value.getSymbol();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [363=5] */
    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(BizInstrument bizInstrument) {
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        int i = 2 % 2;
        int i2 = uzCIH + 41;
        zsXlph = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bizInstrument == null) {
            return null;
        }
        if (isConnected(bizInstrument)) {
            IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(bizInstrument.getInstFamily());
            if (idxCcyConfigFetchVPNInfo == null) {
                return null;
            }
            int i3 = zsXlph + 69;
            uzCIH = i3 % 128;
            if (i3 % 2 == 0) {
                return idxCcyConfigFetchVPNInfo.getCcyName();
            }
            java.lang.String ccyName = idxCcyConfigFetchVPNInfo.getCcyName();
            int i4 = 14 / 0;
            return ccyName;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) {
            return null;
        }
        int i5 = uzCIH + 81;
        zsXlph = i5 % 128;
        if (i5 % 2 == 0) {
            value.getIsoCode();
            obj.hashCode();
            throw null;
        }
        java.lang.String isoCode = value.getIsoCode();
        int i6 = uzCIH + 49;
        zsXlph = i6 % 128;
        int i7 = i6 % 2;
        return isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [378=6] */
    @Override // o.AbstractC54531xLw
    public java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        java.lang.String tradeSymbol;
        java.lang.String sign;
        int i = 2 % 2;
        java.lang.String strGEmmrt = gEmmrt(bizInstrument);
        if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
            int i2 = zsXlph + 85;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            if (bizInstrument == null || !bizInstrument.isPositiveContract()) {
                if (bizInstrument != null) {
                    return bizInstrument.getQuoteSymbol();
                }
                return null;
            }
            int i4 = uzCIH + 17;
            zsXlph = i4 % 128;
            if (i4 % 2 == 0) {
                sign = bizInstrument.getMarginSymbol();
                int i5 = 44 / 0;
            } else {
                sign = bizInstrument.getMarginSymbol();
            }
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                return C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
            }
            java.util.HashMap<java.lang.String, TradeCoinInfo> mapFetchVPNInfo = fetchVPNInfo();
            if (bizInstrument != null) {
                int i6 = uzCIH + 49;
                zsXlph = i6 % 128;
                int i7 = i6 % 2;
                tradeSymbol = bizInstrument.getTradeSymbol();
            } else {
                tradeSymbol = null;
            }
            TradeCoinInfo tradeCoinInfo = mapFetchVPNInfo.get(tradeSymbol);
            if (tradeCoinInfo == null) {
                return null;
            }
            int i8 = zsXlph + 43;
            uzCIH = i8 % 128;
            if (i8 % 2 != 0) {
                sign = tradeCoinInfo.getSign();
                int i9 = 17 / 0;
            } else {
                sign = tradeCoinInfo.getSign();
            }
        }
        return sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [393=4] */
    @Override // o.AbstractC54531xLw
    public java.lang.String OLrzqt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = uzCIH + 95;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String strGEmmrt = gEmmrt(bizInstrument);
        java.lang.Object obj = null;
        if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
            if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                return C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
            }
            if (bizInstrument == null) {
                return null;
            }
            int i4 = uzCIH + 105;
            zsXlph = i4 % 128;
            if (i4 % 2 != 0) {
                return bizInstrument.getTradeSymbol();
            }
            bizInstrument.getTradeSymbol();
            obj.hashCode();
            throw null;
        }
        if (bizInstrument != null) {
            int i5 = zsXlph + 71;
            uzCIH = i5 % 128;
            if (i5 % 2 == 0 ? bizInstrument.isPositiveContract() : !bizInstrument.isPositiveContract()) {
                return bizInstrument.getMarginSymbol();
            }
        }
        if (bizInstrument == null) {
            return null;
        }
        int i6 = zsXlph + 77;
        uzCIH = i6 % 128;
        int i7 = i6 % 2;
        return bizInstrument.getQuoteSymbol();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS gEmmrt(@NotNull java.lang.String str) {
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        java.lang.String isoCode;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (getNewProxyInstance(str)) {
            int i2 = zsXlph + 87;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            return hDKMBd(str);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i4 = zsXlph + 69;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null) {
                int i6 = zsXlph + 119;
                uzCIH = i6 % 128;
                if (i6 % 2 != 0) {
                    mutableLiveDataBG_.getValue();
                    throw null;
                }
                ValuationCurrencyData value = mutableLiveDataBG_.getValue();
                if (value != null && (isoCode = value.getIsoCode()) != null) {
                    str2 = isoCode;
                }
            }
        }
        return AEQbTJ(str, gEmmrt(str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54532xLx
    public xMS copydefault(@NotNull java.lang.String str) {
        xMS xmu;
        int i = 2 % 2;
        int i2 = uzCIH + 5;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (getNewProxyInstance(str)) {
            int i4 = uzCIH + 29;
            zsXlph = i4 % 128;
            if (i4 % 2 == 0) {
                hDKMBd(str);
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            xmu = hDKMBd(str);
        } else {
            xmu = new xMU();
        }
        int i5 = uzCIH + 75;
        zsXlph = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return xmu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS AYXKKw(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zsXlph + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        xMS xmsGEmmrt = gEmmrt(str);
        int i4 = uzCIH + 77;
        zsXlph = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return xmsGEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r2
  0x0031: PHI (r2v7 o.xNr) = (r2v6 o.xNr), (r2v11 o.xNr) binds: [B:10:0x002f, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        int i = 2 % 2;
        str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = null;
        if (!getNewProxyInstance(str)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
                strOLrzqt = newProxyInstance.OLrzqt();
            }
            return AEQbTJ(str, strOLrzqt != null ? strOLrzqt : "", str2);
        }
        int i2 = zsXlph + 41;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            int i3 = 97 / 0;
            if (interfaceC54581xNrOLrzqt != null) {
                xOW newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                if (newProxyInstance2 != null) {
                    strOLrzqt = newProxyInstance2.iwGUEr();
                }
            }
        } else {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
            }
        }
        if (strOLrzqt != null) {
            int i4 = zsXlph + 79;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            str3 = strOLrzqt;
        }
        return AEQbTJ(str, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMX copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        java.lang.String futureContractVal;
        int i = 2 % 2;
        java.lang.String str7 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        C54565xNb c54565xNb = new C54565xNb();
        if (bizInstrumentDbNXlk != null) {
            int i2 = zsXlph + 15;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            futureContractVal = bizInstrumentDbNXlk.getFutureContractVal();
            if (futureContractVal == null) {
                int i4 = zsXlph + 105;
                uzCIH = i4 % 128;
                int i5 = i4 % 2;
                futureContractVal = "";
            }
        }
        if (bizInstrumentDbNXlk != null) {
            java.lang.String futureMult = bizInstrumentDbNXlk.getFutureMult();
            if (futureMult == null) {
                int i6 = uzCIH + 123;
                zsXlph = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str7 = futureMult;
            }
        }
        return c54565xNb.KWHzl(str2, str3, str5, str6, futureContractVal, str7, getNewProxyInstance(str), str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public C54571xNh djBIcL(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        int i = 2 % 2;
        int i2 = uzCIH + 61;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            int i4 = uzCIH + 1;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            str3 = "";
        } else {
            str3 = str2;
        }
        return createTradeConvertorWithIndex$default(this, str, str3, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[PHI: r6
  0x005e: PHI (r6v7 java.lang.String) = (r6v6 java.lang.String), (r6v8 java.lang.String) binds: [B:20:0x005b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC54532xLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh KWHzl(@NotNull java.lang.String str) {
        java.lang.String marginDig;
        java.lang.String sheetDig;
        java.lang.String marginSymbol;
        java.lang.String str2 = "";
        int i = 2 % 2;
        int i2 = uzCIH + 121;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!getNewProxyInstance(str)) {
            int i4 = zsXlph + 17;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return null;
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        C54570xNg c54570xNg = new C54570xNg();
        if (idxConfigAkhnZx == null || (marginDig = idxConfigAkhnZx.getMarginDig()) == null) {
            marginDig = "";
        }
        if (bizInstrumentDbNXlk != null) {
            int i6 = zsXlph + 71;
            uzCIH = i6 % 128;
            if (i6 % 2 != 0) {
                marginSymbol = bizInstrumentDbNXlk.getMarginSymbol();
                int i7 = 73 / 0;
                if (marginSymbol != null) {
                    str2 = marginSymbol;
                }
            } else {
                marginSymbol = bizInstrumentDbNXlk.getMarginSymbol();
                if (marginSymbol != null) {
                }
            }
        }
        if (idxConfigAkhnZx != null) {
            int i8 = zsXlph + 37;
            uzCIH = i8 % 128;
            if (i8 % 2 != 0) {
                idxConfigAkhnZx.getSheetDig();
                throw null;
            }
            sheetDig = idxConfigAkhnZx.getSheetDig();
        } else {
            sheetDig = null;
        }
        C54571xNh c54571xNhKWHzl = c54570xNg.KWHzl(marginDig, str2, sheetDig, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
        c54571xNhKWHzl.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhKWHzl.AEQbTJ(AkhnZx(bizInstrumentDbNXlk));
        return c54571xNhKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String str3 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!getNewProxyInstance(str)) {
            return super.AEQbTJ(str, str2);
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentDbNXlk != null) {
            int i2 = zsXlph + 99;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
            if (profitSymbol == null) {
                profitSymbol = "";
            }
        }
        if (str2 != null) {
            int i4 = uzCIH + 73;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() == 0) {
                str2 = profitSymbol;
            }
        }
        if (idxConfigAkhnZx != null) {
            java.lang.String profitDig = idxConfigAkhnZx.getProfitDig();
            if (profitDig == null) {
                int i6 = uzCIH + 27;
                zsXlph = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            } else {
                str3 = profitDig;
            }
        }
        return xmv.KWHzl(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMV d_(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitDig;
        java.lang.String profitSymbol;
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!getNewProxyInstance(str)) {
            return super.d_(str, str2);
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentDbNXlk != null && (profitSymbol = bizInstrumentDbNXlk.getProfitSymbol()) != null) {
            str3 = profitSymbol;
        }
        if (str2 == null || str2.length() == 0) {
            int i2 = uzCIH + 125;
            zsXlph = i2 % 128;
            int i3 = i2 % 2;
            str2 = str3;
        }
        if (idxConfigAkhnZx == null || (profitDig = idxConfigAkhnZx.getProfitDig()) == null) {
            int i4 = uzCIH + 53;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            profitDig = "8";
        }
        return xmv.KWHzl(str2, profitDig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String feeDig;
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!getNewProxyInstance(str)) {
            return super.KWHzl(str, str2);
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        xMV xmv = new xMV();
        java.lang.Object obj = null;
        if (bizInstrumentDbNXlk != null) {
            int i2 = uzCIH + 21;
            zsXlph = i2 % 128;
            if (i2 % 2 == 0) {
                bizInstrumentDbNXlk.getProfitSymbol();
                throw null;
            }
            profitSymbol = bizInstrumentDbNXlk.getProfitSymbol();
            if (profitSymbol == null) {
                int i3 = uzCIH + 19;
                zsXlph = i3 % 128;
                int i4 = i3 % 2;
                profitSymbol = "";
            }
        }
        if (str2 != null) {
            int i5 = uzCIH + 31;
            zsXlph = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
                if (str2.length() == 0) {
                    str2 = profitSymbol;
                }
            } else if (str2.length() == 0) {
            }
        }
        if (idxConfig != null && (feeDig = idxConfig.getFeeDig()) != null) {
            str3 = feeDig;
        }
        xMV xmvKWHzl = xmv.KWHzl(str2, str3);
        int i7 = uzCIH + 63;
        zsXlph = i7 % 128;
        if (i7 % 2 != 0) {
            return xmvKWHzl;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // o.InterfaceC54532xLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh OLrzqt(@NotNull java.lang.String str) {
        java.lang.String settleCcy;
        java.lang.String marginDig;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String sheetDig;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        java.lang.String lotSize = null;
        if (getNewProxyInstance(str) && (bizInstrumentDbNXlk instanceof SwapInstrument)) {
            int i2 = uzCIH + 3;
            zsXlph = i2 % 128;
            int i3 = i2 % 2;
            settleCcy = ((SwapInstrument) bizInstrumentDbNXlk).getCtValCcy();
        } else {
            settleCcy = (getNewProxyInstance(str) || !(bizInstrumentDbNXlk instanceof SwapInstrument)) ? null : ((SwapInstrument) bizInstrumentDbNXlk).getSettleCcy();
        }
        if (getNewProxyInstance(str)) {
            if (idxConfigAkhnZx != null) {
                int i4 = uzCIH + 45;
                zsXlph = i4 % 128;
                if (i4 % 2 == 0) {
                    marginDig = idxConfigAkhnZx.getContractDig();
                    int i5 = 76 / 0;
                } else {
                    marginDig = idxConfigAkhnZx.getContractDig();
                }
            } else {
                marginDig = null;
            }
        } else if (idxConfigAkhnZx != null) {
            marginDig = idxConfigAkhnZx.getMarginDig();
            int i6 = zsXlph + 9;
            uzCIH = i6 % 128;
            int i7 = i6 % 2;
        }
        xMZ xmz = new xMZ();
        if (settleCcy == null) {
            int i8 = zsXlph + 103;
            uzCIH = i8 % 128;
            int i9 = i8 % 2;
            str2 = "";
        } else {
            str2 = settleCcy;
        }
        if (marginDig == null) {
            int i10 = uzCIH + 45;
            zsXlph = i10 % 128;
            int i11 = i10 % 2;
            str3 = "";
        } else {
            str3 = marginDig;
        }
        boolean newProxyInstance = getNewProxyInstance(str);
        if (idxConfigAkhnZx != null) {
            int i12 = uzCIH + 47;
            zsXlph = i12 % 128;
            int i13 = i12 % 2;
            sheetDig = idxConfigAkhnZx.getSheetDig();
        } else {
            sheetDig = null;
        }
        if (bizInstrumentDbNXlk != null) {
            int i14 = zsXlph + 75;
            uzCIH = i14 % 128;
            if (i14 % 2 != 0) {
                lotSize = bizInstrumentDbNXlk.getLotSize();
                int i15 = 52 / 0;
            } else {
                lotSize = bizInstrumentDbNXlk.getLotSize();
            }
        }
        C54571xNh c54571xNhAEQbTJ = xmz.AEQbTJ(str2, str3, newProxyInstance, sheetDig, lotSize);
        c54571xNhAEQbTJ.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhAEQbTJ.AEQbTJ(AkhnZx(bizInstrumentDbNXlk));
        return c54571xNhAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54532xLx
    public C54571xNh EZpvd(@NotNull java.lang.String str) {
        java.lang.String quoteSymbol;
        java.lang.String sheetDig;
        java.lang.String contractDig;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        C54569xNf c54569xNf = new C54569xNf();
        if (bizInstrumentDbNXlk == null || (quoteSymbol = bizInstrumentDbNXlk.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        if (idxConfigAkhnZx != null && (contractDig = idxConfigAkhnZx.getContractDig()) != null) {
            str2 = contractDig;
        }
        if (idxConfigAkhnZx != null) {
            int i2 = zsXlph + 29;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            sheetDig = idxConfigAkhnZx.getSheetDig();
        } else {
            sheetDig = null;
        }
        C54571xNh c54571xNhKWHzl = c54569xNf.KWHzl(quoteSymbol, str2, sheetDig, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
        c54571xNhKWHzl.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhKWHzl.AEQbTJ(AkhnZx(bizInstrumentDbNXlk));
        int i4 = zsXlph + 99;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return c54571xNhKWHzl;
    }

    public static /* synthetic */ C54571xNh createTradeConvertorWithIndex$default(xLU xlu, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        int i2 = 2 % 2;
        int i3 = uzCIH + 97;
        int i4 = i3 % 128;
        zsXlph = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 33;
            uzCIH = i6 % 128;
            str3 = null;
            if (i6 % 2 != 0) {
                str3.hashCode();
                throw null;
            }
        }
        C54571xNh c54571xNhAEQbTJ = xlu.AEQbTJ(str, str2, str3);
        int i7 = zsXlph + 87;
        uzCIH = i7 % 128;
        int i8 = i7 % 2;
        return c54571xNhAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54571xNh AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        C54571xNh c54571xNh;
        java.lang.String settleCcy;
        java.lang.String marginDig;
        java.lang.String quoteSymbol;
        java.lang.String marginSymbol;
        int i = 2 % 2;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (!(!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "1"))) {
            int i2 = uzCIH + 39;
            zsXlph = i2 % 128;
            int i3 = i2 % 2;
            IdxConfig idxConfigAkhnZx = AkhnZx(str);
            C54564xNa c54564xNa = new C54564xNa(idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null);
            Unit unit = Unit.INSTANCE;
            c54571xNh = c54564xNa;
        } else if (getNewProxyInstance(str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "2")) {
            IdxConfig idxConfigAkhnZx2 = AkhnZx(str);
            C54570xNg c54570xNg = new C54570xNg();
            if (idxConfigAkhnZx2 != null) {
                int i4 = uzCIH + 93;
                zsXlph = i4 % 128;
                int i5 = i4 % 2;
                java.lang.String marginDig2 = idxConfigAkhnZx2.getMarginDig();
                if (marginDig2 == null) {
                    marginDig2 = "";
                }
                if (bizInstrumentDbNXlk != null && (marginSymbol = bizInstrumentDbNXlk.getMarginSymbol()) != null) {
                    str4 = marginSymbol;
                }
                if (str3 == null || str3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
                    str3 = str4;
                }
                c54570xNg.KWHzl(marginDig2, str3, idxConfigAkhnZx2 != null ? idxConfigAkhnZx2.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                c54571xNh = c54570xNg;
            }
        } else if (iwGUEr(str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "2")) {
            IdxConfig idxConfigAkhnZx3 = AkhnZx(str);
            C54569xNf c54569xNf = new C54569xNf();
            if (bizInstrumentDbNXlk == null || (quoteSymbol = bizInstrumentDbNXlk.getQuoteSymbol()) == null) {
                quoteSymbol = "";
            }
            if (idxConfigAkhnZx3 != null) {
                int i6 = uzCIH + 77;
                zsXlph = i6 % 128;
                int i7 = i6 % 2;
                java.lang.String contractDig = idxConfigAkhnZx3.getContractDig();
                if (contractDig == null) {
                    int i8 = zsXlph + 119;
                    uzCIH = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    str4 = contractDig;
                }
            }
            java.lang.String sheetDig = idxConfigAkhnZx3 != null ? idxConfigAkhnZx3.getSheetDig() : null;
            if (bizInstrumentDbNXlk != null) {
                int i10 = zsXlph + 125;
                uzCIH = i10 % 128;
                int i11 = i10 % 2;
                lotSize = bizInstrumentDbNXlk.getLotSize();
            }
            c54569xNf.KWHzl(quoteSymbol, str4, sheetDig, lotSize);
            c54571xNh = c54569xNf;
        } else {
            IdxConfig idxConfigAkhnZx4 = AkhnZx(str);
            if (getNewProxyInstance(str)) {
                int i12 = uzCIH + 125;
                zsXlph = i12 % 128;
                if (i12 % 2 == 0) {
                    boolean z = bizInstrumentDbNXlk instanceof SwapInstrument;
                    throw null;
                }
                if (bizInstrumentDbNXlk instanceof SwapInstrument) {
                    settleCcy = ((SwapInstrument) bizInstrumentDbNXlk).getCtValCcy();
                } else if (!getNewProxyInstance(str)) {
                    int i13 = uzCIH + 11;
                    zsXlph = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 26 / 0;
                        settleCcy = bizInstrumentDbNXlk instanceof SwapInstrument ? ((SwapInstrument) bizInstrumentDbNXlk).getSettleCcy() : null;
                    } else if (bizInstrumentDbNXlk instanceof SwapInstrument) {
                    }
                }
                if (getNewProxyInstance(str)) {
                    if (idxConfigAkhnZx4 != null) {
                        int i15 = uzCIH + 109;
                        zsXlph = i15 % 128;
                        int i16 = i15 % 2;
                        marginDig = idxConfigAkhnZx4.getContractDig();
                    } else {
                        int i17 = uzCIH + 67;
                        zsXlph = i17 % 128;
                        int i18 = i17 % 2;
                        marginDig = null;
                    }
                    xMZ xmz = new xMZ();
                    xmz.AEQbTJ(settleCcy != null ? "" : settleCcy, marginDig != null ? "" : marginDig, getNewProxyInstance(str), idxConfigAkhnZx4 == null ? idxConfigAkhnZx4.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                    c54571xNh = xmz;
                } else {
                    if (idxConfigAkhnZx4 != null) {
                        int i19 = uzCIH + 83;
                        zsXlph = i19 % 128;
                        if (i19 % 2 == 0) {
                            marginDig = idxConfigAkhnZx4.getMarginDig();
                            int i20 = 79 / 0;
                        } else {
                            marginDig = idxConfigAkhnZx4.getMarginDig();
                        }
                    }
                    xMZ xmz2 = new xMZ();
                    xmz2.AEQbTJ(settleCcy != null ? "" : settleCcy, marginDig != null ? "" : marginDig, getNewProxyInstance(str), idxConfigAkhnZx4 == null ? idxConfigAkhnZx4.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                    c54571xNh = xmz2;
                }
            }
        }
        c54571xNh.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNh.AEQbTJ(AkhnZx(bizInstrumentDbNXlk));
        return c54571xNh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xMS AEQbTJ(@NotNull java.lang.String str, IdxCcyConfig idxCcyConfig) {
        java.lang.String ccyName;
        java.lang.String ccySign;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String ccySign2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, "USD");
        xMW xmw = new xMW(true);
        if (idxCcyConfig == null || (ccyName = idxCcyConfig.getCcyName()) == null) {
            ccyName = "";
        }
        if (idxCcyConfig == null || (ccySign = idxCcyConfig.getCcySign()) == null) {
            ccySign = "";
        }
        if (idxCcyConfig != null) {
            int i2 = zsXlph + 99;
            uzCIH = i2 % 128;
            if (i2 % 2 != 0) {
                idxCcyConfig.getPriceDig();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            java.lang.String priceDig = idxCcyConfig.getPriceDig();
            str2 = priceDig == null ? "" : priceDig;
        }
        if (idxCcyConfigGEmmrt != null) {
            int i3 = uzCIH + 9;
            zsXlph = i3 % 128;
            int i4 = i3 % 2;
            java.lang.String ccyName2 = idxCcyConfigGEmmrt.getCcyName();
            str3 = ccyName2 == null ? "" : ccyName2;
        }
        if (idxCcyConfigGEmmrt == null || (ccySign2 = idxCcyConfigGEmmrt.getCcySign()) == null) {
            int i5 = zsXlph + 95;
            uzCIH = i5 % 128;
            int i6 = i5 % 2;
            str4 = "";
        } else {
            str4 = ccySign2;
        }
        if (idxCcyConfigGEmmrt != null) {
            int i7 = uzCIH + 119;
            zsXlph = i7 % 128;
            int i8 = i7 % 2;
            java.lang.String priceDig2 = idxCcyConfigGEmmrt.getPriceDig();
            if (priceDig2 == null) {
                int i9 = uzCIH + 7;
                zsXlph = i9 % 128;
                int i10 = i9 % 2;
                str5 = "";
            } else {
                str5 = priceDig2;
            }
        } else {
            str5 = "";
        }
        return xmw.KWHzl(ccyName, ccySign, str2, str3, str4, str5, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xMS hDKMBd(@NotNull java.lang.String str) {
        java.lang.String priceDig;
        java.lang.String strGEmmrt;
        java.lang.String ccyName;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
        java.lang.Object obj = null;
        if (idxCcyConfigFetchVPNInfo != null) {
            priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
            int i2 = zsXlph + 59;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
        } else {
            priceDig = null;
        }
        if (priceDig == null || priceDig.length() == 0) {
            strGEmmrt = C33129mqd.gEmmrt(8);
        } else if (idxCcyConfigFetchVPNInfo != null) {
            int i4 = uzCIH + 1;
            zsXlph = i4 % 128;
            if (i4 % 2 == 0) {
                strGEmmrt = idxCcyConfigFetchVPNInfo.getPriceDig();
                int i5 = 41 / 0;
                if (strGEmmrt == null) {
                    strGEmmrt = "";
                }
            } else {
                strGEmmrt = idxCcyConfigFetchVPNInfo.getPriceDig();
                if (strGEmmrt == null) {
                }
            }
        }
        xMT xmt = new xMT();
        if (idxCcyConfigFetchVPNInfo == null || (ccyName = idxCcyConfigFetchVPNInfo.getCcyName()) == null) {
            int i6 = uzCIH + 3;
            zsXlph = i6 % 128;
            int i7 = i6 % 2;
            ccyName = "";
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            java.lang.String ccySign = idxCcyConfigFetchVPNInfo.getCcySign();
            if (ccySign == null) {
                int i8 = zsXlph + 43;
                uzCIH = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                str2 = ccySign;
            }
        }
        return xmt.OLrzqt(ccyName, str2, strGEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String fIwbmz(@NotNull java.lang.String str) {
        java.lang.String priceDig;
        IdxCcyConfig idxCcyConfigGEmmrt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        int i = 2 % 2;
        int i2 = uzCIH + 37;
        zsXlph = i2 % 128;
        java.lang.String priceDig2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 40 / 0;
            if (getNewProxyInstance(str)) {
                int i4 = uzCIH + 65;
                zsXlph = i4 % 128;
                int i5 = i4 % 2;
                IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
                if (idxCcyConfigFetchVPNInfo != null) {
                    int i6 = uzCIH + 7;
                    zsXlph = i6 % 128;
                    if (i6 % 2 == 0) {
                        idxCcyConfigFetchVPNInfo.getPriceDig();
                        throw null;
                    }
                    priceDig2 = idxCcyConfigFetchVPNInfo.getPriceDig();
                }
                if (priceDig2 == null || priceDig2.length() == 0) {
                    return "8";
                }
                if (idxCcyConfigFetchVPNInfo == null || (priceDig = idxCcyConfigFetchVPNInfo.getPriceDig()) == null) {
                    return "";
                }
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null) {
                    int i7 = zsXlph + 91;
                    uzCIH = i7 % 128;
                    int i8 = i7 % 2;
                    ValuationCurrencyData value = mutableLiveDataBG_.getValue();
                    if (value != null && (isoCode = value.getIsoCode()) != null) {
                        int i9 = zsXlph + 29;
                        uzCIH = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    idxCcyConfigGEmmrt = gEmmrt(str, isoCode);
                    if (idxCcyConfigGEmmrt != null) {
                    }
                    if (priceDig2 != null) {
                    }
                    return "2";
                }
                java.lang.String isoCode = "";
                idxCcyConfigGEmmrt = gEmmrt(str, isoCode);
                if (idxCcyConfigGEmmrt != null) {
                    int i11 = zsXlph + 1;
                    uzCIH = i11 % 128;
                    if (i11 % 2 != 0) {
                        idxCcyConfigGEmmrt.getPriceDig();
                        throw null;
                    }
                    priceDig2 = idxCcyConfigGEmmrt.getPriceDig();
                }
                if (priceDig2 != null || priceDig2.length() == 0) {
                    return "2";
                }
                if (idxCcyConfigGEmmrt == null) {
                    return "";
                }
                int i12 = zsXlph + 93;
                uzCIH = i12 % 128;
                if (i12 % 2 != 0) {
                    priceDig = idxCcyConfigGEmmrt.getPriceDig();
                    int i13 = 38 / 0;
                    if (priceDig == null) {
                        return "";
                    }
                } else {
                    priceDig = idxCcyConfigGEmmrt.getPriceDig();
                    if (priceDig == null) {
                        return "";
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (getNewProxyInstance(str)) {
            }
        }
        return priceDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument DbNXlk(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument = djBIcL().get(str + "-" + isConnected());
        int i2 = uzCIH + 9;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        return bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument getFieldNames(@NotNull java.lang.String str) {
        SwapInstrument swapInstrument;
        java.lang.String ruleType;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument = djBIcL().get(str + "-" + isConnected());
        java.lang.Object obj = null;
        if (!(bizInstrument instanceof SwapInstrument)) {
            int i2 = zsXlph + 105;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            swapInstrument = null;
        } else {
            int i4 = zsXlph + 25;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            swapInstrument = (SwapInstrument) bizInstrument;
        }
        if (swapInstrument != null) {
            int i5 = zsXlph + 85;
            uzCIH = i5 % 128;
            if (i5 % 2 != 0) {
                swapInstrument.getRuleType();
                obj.hashCode();
                throw null;
            }
            ruleType = swapInstrument.getRuleType();
        } else {
            ruleType = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) ruleType, (java.lang.Object) "normal")) {
            bizInstrument = null;
        }
        int i6 = uzCIH + 5;
        zsXlph = i6 % 128;
        int i7 = i6 % 2;
        return bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4, (java.lang.Object) "0") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r4, (java.lang.Object) "0") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r3 = r1.getMarginDig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        r10 = o.xLU.zsXlph + 117;
        o.xLU.uzCIH = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r3.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        r10 = r1.getMarginDig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if (r10 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return "";
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL(@NotNull java.lang.String str) {
        xOW newProxyInstance;
        java.lang.String strOLrzqt;
        xOW newProxyInstance2;
        int i = 2 % 2;
        int i2 = uzCIH + 53;
        zsXlph = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            AkhnZx(str);
            getNewProxyInstance(str);
            contractDig.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (getNewProxyInstance(str)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            strOLrzqt = (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance2.iwGUEr();
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
                strOLrzqt = newProxyInstance.OLrzqt();
            }
        }
        if (getNewProxyInstance(str) && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
            contractDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getContractDig() : null;
            if (contractDig != null && contractDig.length() != 0) {
                if (idxConfigAkhnZx == null || (contractDig = idxConfigAkhnZx.getContractDig()) == null) {
                    return "";
                }
                return contractDig;
            }
            return "8";
        }
        if (!getNewProxyInstance(str)) {
            int i3 = zsXlph + 105;
            uzCIH = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 26 / 0;
            }
        }
        if (getNewProxyInstance(str) && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2")) {
            if (idxConfigAkhnZx != null) {
                contractDig = idxConfigAkhnZx.getMarginDig();
                int i5 = uzCIH + 107;
                zsXlph = i5 % 128;
                int i6 = i5 % 2;
            }
            if (contractDig != null && contractDig.length() != 0) {
                if (idxConfigAkhnZx == null) {
                    return "";
                }
                java.lang.String contractDig = idxConfigAkhnZx.getMarginDig();
                if (contractDig == null) {
                    int i7 = uzCIH + 1;
                    zsXlph = i7 % 128;
                    int i8 = i7 % 2;
                    return "";
                }
                return contractDig;
            }
            return "8";
        }
        if (getNewProxyInstance(str) || (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2"))) {
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1")) {
                return "";
            }
            java.lang.String strFARcdN = fARcdN(str);
            return strFARcdN == null ? "0" : strFARcdN;
        }
        int i9 = zsXlph + 39;
        int i10 = i9 % 128;
        uzCIH = i10;
        int i11 = i9 % 2;
        if (idxConfigAkhnZx != null) {
            int i12 = i10 + 15;
            zsXlph = i12 % 128;
            int i13 = i12 % 2;
            contractDig = idxConfigAkhnZx.getContractDig();
        }
        if (contractDig != null && contractDig.length() != 0) {
            if (idxConfigAkhnZx == null || (contractDig = idxConfigAkhnZx.getContractDig()) == null) {
                return "";
            }
            return contractDig;
        }
        return "8";
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String fARcdN(java.lang.String str) {
        java.lang.String sheetDig;
        int i = 2 % 2;
        java.lang.Object obj = null;
        if (str == null) {
            int i2 = uzCIH + 17;
            int i3 = i2 % 128;
            zsXlph = i3;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 77;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return null;
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (idxConfigAkhnZx != null) {
            int i6 = zsXlph + 119;
            uzCIH = i6 % 128;
            int i7 = i6 % 2;
            sheetDig = idxConfigAkhnZx.getSheetDig();
            if (i7 != 0) {
                int i8 = 69 / 0;
            }
        } else {
            sheetDig = null;
        }
        int i9 = zsXlph + 83;
        uzCIH = i9 % 128;
        if (i9 % 2 == 0) {
            return sheetDig;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected(@NotNull BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = uzCIH + 55;
        zsXlph = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            boolean z = bizInstrument instanceof SwapInstrument;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (!(bizInstrument instanceof SwapInstrument) || !Intrinsics.EZpvd((java.lang.Object) ((SwapInstrument) bizInstrument).getCtType(), (java.lang.Object) "linear")) {
            return false;
        }
        int i3 = uzCIH + 69;
        zsXlph = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    @Override // o.AbstractC54531xLw
    public boolean getFieldNames() {
        int i = 2 % 2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strWlaJM = null;
        if (interfaceC54581xNrOLrzqt != null) {
            int i2 = uzCIH + 53;
            zsXlph = i2 % 128;
            if (i2 % 2 == 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                throw null;
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null) {
                int i3 = uzCIH + 45;
                zsXlph = i3 % 128;
                int i4 = i3 % 2;
                strWlaJM = newProxyInstance.wlaJM();
                int i5 = uzCIH + 91;
                zsXlph = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return C33129mqd.copydefault(strWlaJM, "2");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = zsXlph + 115;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (bizInstrumentDbNXlk instanceof SwapInstrument) {
            int i4 = zsXlph + 45;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.EZpvd((java.lang.Object) ((SwapInstrument) bizInstrumentDbNXlk).getCtType(), (java.lang.Object) "linear")) {
                int i6 = zsXlph + 39;
                uzCIH = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    public final boolean iwGUEr(java.lang.String str) {
        int i = 2 % 2;
        int i2 = zsXlph + 91;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (bizInstrumentDbNXlk instanceof SwapInstrument) {
            int i4 = uzCIH + 1;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.EZpvd((java.lang.Object) ((SwapInstrument) bizInstrumentDbNXlk).getCtType(), (java.lang.Object) "inverse")) {
                int i6 = uzCIH + 31;
                zsXlph = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    private final java.lang.String fetchVPNInfo(BizInstrument bizInstrument) {
        int i = 2 % 2;
        if (bizInstrument instanceof SwapInstrument) {
            int i2 = zsXlph + 125;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            return ((SwapInstrument) bizInstrument).getCtVal();
        }
        int i4 = uzCIH + 15;
        zsXlph = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        throw null;
    }

    private final java.lang.String AkhnZx(BizInstrument bizInstrument) {
        int i = 2 % 2;
        if (!(bizInstrument instanceof SwapInstrument)) {
            return "";
        }
        int i2 = zsXlph + 17;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String ctMult = ((SwapInstrument) bizInstrument).getCtMult();
        int i4 = uzCIH + 75;
        zsXlph = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna(@NotNull BizInstrument bizInstrument) {
        java.lang.String fundingFeeDig;
        java.lang.String str = "";
        int i = 2 % 2;
        int i2 = uzCIH + 27;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(bizInstrument.getInstFamily());
        if (idxConfigAkhnZx != null && (fundingFeeDig = idxConfigAkhnZx.getFundingFeeDig()) != null) {
            str = fundingFeeDig;
        }
        int i4 = uzCIH + 101;
        zsXlph = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [789=4] */
    @Override // o.AbstractC54531xLw
    public BizInstrument isConnected(java.lang.String str) {
        java.util.List<FutureGroupInfo> listFARcdN;
        int i = 2 % 2;
        int i2 = uzCIH + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        zsXlph = i2 % 128;
        BizInstrument bizInstrumentDbNXlk = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null || str.length() == 0) {
            int i3 = uzCIH + 21;
            zsXlph = i3 % 128;
            int i4 = i3 % 2;
            str = "BTC";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (listFARcdN = interfaceC54581xNrOLrzqt.fARcdN()) != null) {
            for (FutureGroupInfo futureGroupInfo : listFARcdN) {
                int i5 = zsXlph + 75;
                uzCIH = i5 % 128;
                int i6 = i5 % 2;
                if (bizInstrumentDbNXlk == null) {
                    bizInstrumentDbNXlk = DbNXlk(str + "-" + futureGroupInfo.getCcyType());
                    int i7 = uzCIH + 101;
                    zsXlph = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        return bizInstrumentDbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkSwapBiz$ensureInitialized$2 okSwapBiz$ensureInitialized$2;
        Mutex mutexFIwbmz;
        xLU xlu;
        java.lang.Throwable th;
        Mutex mutex;
        java.lang.Object objM7386unboximpl;
        int i = 2 % 2;
        int i2 = zsXlph + 17;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        if (continuation instanceof OkSwapBiz$ensureInitialized$2) {
            okSwapBiz$ensureInitialized$2 = (OkSwapBiz$ensureInitialized$2) continuation;
            int i4 = okSwapBiz$ensureInitialized$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                okSwapBiz$ensureInitialized$2.label = i4 - Integer.MIN_VALUE;
            } else {
                okSwapBiz$ensureInitialized$2 = new OkSwapBiz$ensureInitialized$2(this, continuation);
            }
        }
        java.lang.Object result = okSwapBiz$ensureInitialized$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = okSwapBiz$ensureInitialized$2.label;
        if (i5 != 0) {
            int i6 = uzCIH + 115;
            zsXlph = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) okSwapBiz$ensureInitialized$2.L$1;
                try {
                    C56391yDq.AEQbTJ(result);
                    int i7 = zsXlph + 53;
                    uzCIH = i7 % 128;
                    int i8 = i7 % 2;
                    mutexFIwbmz = mutex;
                    objM7386unboximpl = ((Result) result).m7386unboximpl();
                    mutexFIwbmz.unlock(null);
                    return objM7386unboximpl;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    mutexFIwbmz = mutex;
                    mutexFIwbmz.unlock(null);
                    throw th;
                }
            }
            z = okSwapBiz$ensureInitialized$2.Z$0;
            mutexFIwbmz = (Mutex) okSwapBiz$ensureInitialized$2.L$1;
            xlu = (xLU) okSwapBiz$ensureInitialized$2.L$0;
            C56391yDq.AEQbTJ(result);
        } else {
            C56391yDq.AEQbTJ(result);
            mutexFIwbmz = fIwbmz();
            okSwapBiz$ensureInitialized$2.L$0 = this;
            okSwapBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
            okSwapBiz$ensureInitialized$2.Z$0 = z;
            okSwapBiz$ensureInitialized$2.label = 1;
            if (mutexFIwbmz.lock(null, okSwapBiz$ensureInitialized$2) == objCopydefault) {
                int i9 = zsXlph + 45;
                uzCIH = i9 % 128;
                int i10 = i9 % 2;
                return objCopydefault;
            }
            xlu = this;
        }
        if (!z) {
            try {
                if (xlu.iwGUEr()) {
                    Result.Application application = Result.Companion;
                    objM7386unboximpl = Result.m7377constructorimpl(xlu);
                    mutexFIwbmz.unlock(null);
                    return objM7386unboximpl;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                mutexFIwbmz.unlock(null);
                throw th;
            }
        }
        okSwapBiz$ensureInitialized$2.L$0 = xlu;
        okSwapBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
        okSwapBiz$ensureInitialized$2.L$2 = okSwapBiz$ensureInitialized$2;
        okSwapBiz$ensureInitialized$2.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(okSwapBiz$ensureInitialized$2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(xlu.new StateListAnimator());
        xlu.AEQbTJ(true);
        KWHzl(xlu).copydefault(xlu.new TaskDescription(new AtomicBoolean(), cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(okSwapBiz$ensureInitialized$2);
        }
        if (result == objCopydefault) {
            return objCopydefault;
        }
        mutex = mutexFIwbmz;
        mutexFIwbmz = mutex;
        objM7386unboximpl = ((Result) result).m7386unboximpl();
        mutexFIwbmz.unlock(null);
        return objM7386unboximpl;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = 2 % 2;
        pUU.KWHzl("OkSwapBiz", "----------->OkSwapBiz loadBizInfoDetail " + bizInstrument.getInstId());
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        KWHzl(this).KWHzl(bizInstrument.getInstId(), new ActionBar(new AtomicBoolean(), cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            int i2 = uzCIH + 89;
            zsXlph = i2 % 128;
            int i3 = i2 % 2;
            C56447yFs.copydefault(continuation);
            if (i3 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = uzCIH + 37;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
        }
        return result;
    }

    public final void AYXKKw(java.util.List<InstrumentInfo> list) {
        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
        OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, -1897070362, 1897070363, new java.lang.Object[]{this, list});
    }

    public final void copydefault(ResponseData<SwapLoaderInfo> responseData) {
        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
        OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, 302375137, -302375137, new java.lang.Object[]{this, responseData});
    }

    public static /* synthetic */ Unit KWHzl(xLU xlu, ResponseData responseData) {
        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
        return (Unit) OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, 1655190533, -1655190531, new java.lang.Object[]{xlu, responseData});
    }

    public static /* synthetic */ Unit AEQbTJ(java.lang.String str, xLU xlu, Function1 function1, ResponseData responseData) {
        int iKWHzl = GetMaxMemberCountUseCase$execute$2.KWHzl();
        int iKWHzl2 = GetMaxMemberCountUseCase$execute$2.KWHzl();
        return (Unit) OLrzqt(iKWHzl, GetMaxMemberCountUseCase$execute$2.KWHzl(), GetMaxMemberCountUseCase$execute$2.KWHzl(), iKWHzl2, 316798993, -316798990, new java.lang.Object[]{str, xlu, function1, responseData});
    }
}
