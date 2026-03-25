package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.biz.OkFutureBiz$ensureInitialized$2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import o.C32112mPy;
import o.C55688xof;
import o.xBV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLC extends AbstractC54531xLw implements InterfaceC54532xLx {
    private static int AuCTelauCTel = 1;
    private static int uzCIH;
    public java.util.HashMap<java.lang.String, BizInstrument> AuCTel;
    public java.lang.String ejfBZ;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> fIwbmz;
    public java.util.ArrayList<BizInstrument> fJNWhG;
    public java.util.HashMap<java.lang.String, IdxConfig> getFieldNames;
    public C54552xMp getNewProxyInstance;
    public java.util.HashMap<java.lang.String, IdxCcyConfig> hDKMBd;
    public java.util.HashMap<java.lang.String, LinkedHashMap<java.lang.String, FutureInstrument>> iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object AEQbTJ(int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~((~i) | i7 | i5);
        int i9 = (~i5) | i7;
        int i10 = i8 | (~(i9 | i)) | (~(i6 | i | i5));
        int i11 = ~i9;
        int i12 = (~(i5 | i6)) | i | i11;
        int i13 = (~(i7 | i)) | i11;
        int i14 = i6 + i + i4 + (933655473 * i3) + ((-1037598838) * i2);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i6) - 925892608) + (470833381 * i) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i4) + ((-1691877376) * i3) + ((-393216000) * i2) + ((-1633878016) * i15);
        int i17 = ((i6 * (-727610197)) - 1081761860) + (i * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i4 * (-727609241)) + (i3 * 1532828727) + (i2 * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 == 1) {
            return OLrzqt(objArr);
        }
        if (i18 == 2) {
            return EZpvd(objArr);
        }
        if (i18 != 3) {
            return copydefault(objArr);
        }
        xLC xlc = (xLC) objArr[0];
        java.util.List list = (java.util.List) objArr[1];
        int i19 = 2 % 2;
        int i20 = uzCIH + 123;
        AuCTelauCTel = i20 % 128;
        int i21 = i20 % 2;
        xlc.AkhnZx().clear();
        xlc.AkhnZx().addAll(list);
        int i22 = uzCIH + 77;
        AuCTelauCTel = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit KWHzl(xLC xlc, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 117;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAEQbTJ = AEQbTJ(xlc, responseData);
        int i4 = AuCTelauCTel + 125;
        uzCIH = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit OLrzqt(xLC xlc, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 29;
        uzCIH = i2 % 128;
        if (i2 % 2 == 0) {
            return EZpvd(xlc, function1, responseData);
        }
        EZpvd(xlc, function1, responseData);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxConfig> DbNXlk() {
        int i = 2 % 2;
        int i2 = uzCIH + 21;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getFieldNames;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, BizInstrument> djBIcL() {
        int i = 2 % 2;
        int i2 = uzCIH;
        int i3 = i2 + 105;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        java.util.HashMap<java.lang.String, BizInstrument> map = this.AuCTel;
        int i5 = i2 + 49;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String isConnected() {
        int i = 2 % 2;
        int i2 = uzCIH;
        int i3 = i2 + 65;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.ejfBZ;
        int i5 = i2 + 49;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> valueOf() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel;
        int i3 = i2 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        uzCIH = i3 % 128;
        int i4 = i3 % 2;
        java.util.ArrayList<BizInstrument> arrayList = this.fJNWhG;
        int i5 = i2 + 91;
        uzCIH = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxCcyConfig> values() {
        int i = 2 % 2;
        int i2 = uzCIH + 95;
        int i3 = i2 % 128;
        AuCTelauCTel = i3;
        int i4 = i2 % 2;
        java.util.HashMap<java.lang.String, IdxCcyConfig> map = this.hDKMBd;
        int i5 = i3 + 39;
        uzCIH = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xLC(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
        this.fIwbmz = map;
        this.ejfBZ = "FUTURES";
        this.fJNWhG = new java.util.ArrayList<>();
        this.AuCTel = new java.util.HashMap<>();
        this.iwGUEr = new java.util.HashMap<>();
        this.getFieldNames = new java.util.HashMap<>();
        this.hDKMBd = new java.util.HashMap<>();
        this.getNewProxyInstance = new C54552xMp();
    }

    public static final /* synthetic */ void EZpvd(xLC xlc, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 79;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        xlc.OLrzqt((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
        int i4 = AuCTelauCTel + 95;
        uzCIH = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        xLC xlc = (xLC) objArr[0];
        int i = 2 % 2;
        int i2 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        C54552xMp c54552xMp = xlc.getNewProxyInstance;
        if (i3 == 0) {
            return c54552xMp;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 71;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        fJNWhG().add(mutableLiveData);
        if (!z && iwGUEr()) {
            KWHzl(true, (java.lang.String) null);
            return;
        }
        if (zLjUOn()) {
            return;
        }
        AEQbTJ(true);
        pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> ensureInitialized isRefreshing");
        this.getNewProxyInstance.EZpvd(new Function1() { // from class: o.xLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLC.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        });
        int i4 = uzCIH + 125;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(xLC xlc, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = uzCIH + 67;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            xlc.AEQbTJ(true);
            pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> ensureInitialized refreshData");
            if (responseData != null) {
                if (responseData.getCode() == 0) {
                    int i3 = AuCTelauCTel + 89;
                    uzCIH = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 90 / 0;
                        if (responseData.getData() == null) {
                            xlc.KWHzl(false, responseData != null ? responseData.getMsg() : null);
                        } else {
                            int i5 = AuCTelauCTel + 43;
                            uzCIH = i5 % 128;
                            if (i5 % 2 != 0) {
                                xlc.OLrzqt((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
                                xlc.KWHzl(false, (java.lang.String) null);
                            } else {
                                xlc.OLrzqt((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
                                xlc.KWHzl(true, (java.lang.String) null);
                            }
                        }
                    } else if (responseData.getData() != null) {
                    }
                }
            }
        } else {
            xlc.AEQbTJ(false);
            pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> ensureInitialized refreshData");
            if (responseData != null) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            xLC.this.AEQbTJ(false);
        }
    }

    public static final class StateListAnimator implements Function1<ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>>, Unit> {
        public final /* synthetic */ CancellableContinuation<Result<? extends AbstractC54531xLw>> EZpvd;
        public final /* synthetic */ AtomicBoolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Result<? extends o.xLw>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(AtomicBoolean atomicBoolean, CancellableContinuation<? super Result<? extends AbstractC54531xLw>> cancellableContinuation) {
            this.OLrzqt = atomicBoolean;
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>> responseData) {
            EZpvd(responseData);
            return Unit.INSTANCE;
        }

        public final void EZpvd(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
            pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> ensureInitialized refreshData");
            if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                try {
                    xLC.EZpvd(xLC.this, responseData);
                    xLC.this.AEQbTJ(false);
                    xLC.this.KWHzl(true, (java.lang.String) null);
                    if (this.OLrzqt.getAndSet(true)) {
                        return;
                    }
                    CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(xLC.this))));
                    return;
                } catch (java.lang.Throwable th) {
                    xLC.this.AEQbTJ(false);
                    throw th;
                }
            }
            xLC.this.AEQbTJ(false);
            xLC.this.KWHzl(false, responseData != null ? responseData.getMsg() : null);
            if (this.OLrzqt.getAndSet(true)) {
                return;
            }
            CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation2 = this.EZpvd;
            Result.Application application2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(responseData != null ? responseData.getMsg() : null))))));
        }
    }

    private final void OLrzqt(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
        java.lang.Integer numValueOf;
        TradeConfigData second;
        java.util.List<InstrumentInfo> first;
        int i = 2 % 2;
        int i2 = uzCIH + 125;
        AuCTelauCTel = i2 % 128;
        java.util.ArrayList<IdxCcyConfig> idxCcyConfig = null;
        if (i2 % 2 != 0) {
            zsXlph();
            kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data = responseData.getData();
            copydefault(data != null ? data.getFirst() : null);
            kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data2 = responseData.getData();
            if (data2 == null || (first = data2.getFirst()) == null) {
                numValueOf = null;
            } else {
                int i3 = AuCTelauCTel + 61;
                uzCIH = i3 % 128;
                int i4 = i3 % 2;
                numValueOf = java.lang.Integer.valueOf(first.size());
            }
            pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> list: " + numValueOf + " --newMaps mBizInstMap:-" + djBIcL().size() + " -- " + djBIcL());
            kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data3 = responseData.getData();
            EZpvd((data3 == null || (second = data3.getSecond()) == null) ? null : second.getIdxConfig());
            kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data4 = responseData.getData();
            if (data4 != null) {
                int i5 = uzCIH + 101;
                AuCTelauCTel = i5 % 128;
                int i6 = i5 % 2;
                TradeConfigData second2 = data4.getSecond();
                if (i6 == 0) {
                    idxCcyConfig.hashCode();
                    throw null;
                }
                if (second2 != null) {
                    idxCcyConfig = second2.getIdxCcyConfig();
                }
            }
            AEQbTJ(idxCcyConfig);
            return;
        }
        zsXlph();
        responseData.getData();
        idxCcyConfig.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [186=5] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.util.List<InstrumentInfo> list) {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (list != null) {
            for (InstrumentInfo instrumentInfo : list) {
                FutureInstrument futureInstrumentCopydefault = xBV.Companion.copydefault(instrumentInfo);
                if (!futureInstrumentCopydefault.isPreMarketPair()) {
                    int i2 = AuCTelauCTel + 63;
                    uzCIH = i2 % 128;
                    int i3 = i2 % 2;
                    if (futureInstrumentCopydefault.isRebasePair()) {
                        if (getNewProxyInstance().fJNWhG()) {
                            int i4 = uzCIH + 11;
                            AuCTelauCTel = i4 % 128;
                            if (i4 % 2 == 0) {
                                futureInstrumentCopydefault.isPreMarketPair();
                                throw null;
                            }
                            if (!(!futureInstrumentCopydefault.isPreMarketPair())) {
                                int i5 = AuCTelauCTel + 51;
                                uzCIH = i5 % 128;
                                if (i5 % 2 != 0) {
                                    arrayList2.add(futureInstrumentCopydefault);
                                    throw null;
                                }
                                arrayList2.add(futureInstrumentCopydefault);
                            }
                        }
                        if (getNewProxyInstance().fJNWhG() && futureInstrumentCopydefault.isRebasePair()) {
                            arrayList3.add(futureInstrumentCopydefault);
                        }
                    } else {
                        arrayList.add(futureInstrumentCopydefault);
                        arrayList4.add(futureInstrumentCopydefault);
                    }
                }
                djBIcL().put(instrumentInfo.getInstId(), futureInstrumentCopydefault);
                valueOf(futureInstrumentCopydefault);
                AYXKKw(futureInstrumentCopydefault);
            }
        }
        KWHzl((java.util.List<? extends BizInstrument>) arrayList2);
        djBIcL(arrayList3);
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        AEQbTJ(301691812, C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), iKWHzl2, iKWHzl, -301691809, new java.lang.Object[]{this, arrayList4});
        OLrzqt(arrayList);
    }

    private final void KWHzl(java.util.List<? extends BizInstrument> list) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 55;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            AuCTel().clear();
            AuCTel().addAll(list);
            int i3 = 5 / 0;
        } else {
            AuCTel().clear();
            AuCTel().addAll(list);
        }
        int i4 = AuCTelauCTel + 51;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> uzCIH() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 23;
        uzCIH = i2 % 128;
        if (i2 % 2 == 0) {
            return AuCTel();
        }
        AuCTel();
        throw null;
    }

    private final void djBIcL(java.util.List<? extends BizInstrument> list) {
        int i = 2 % 2;
        int i2 = uzCIH + 49;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            fARcdN().clear();
            fARcdN().addAll(list);
            int i3 = 72 / 0;
        } else {
            fARcdN().clear();
            fARcdN().addAll(list);
        }
        int i4 = uzCIH + 3;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> hDKMBd() {
        java.util.ArrayList<BizInstrument> arrayListFARcdN;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 7;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            arrayListFARcdN = fARcdN();
            int i3 = 34 / 0;
        } else {
            arrayListFARcdN = fARcdN();
        }
        int i4 = uzCIH + 101;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return arrayListFARcdN;
    }

    @Override // o.AbstractC54531xLw
    public java.util.List<BizInstrument> AhwBna() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 21;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        java.util.ArrayList<BizInstrument> arrayListAkhnZx = AkhnZx();
        int i4 = uzCIH + 3;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return arrayListAkhnZx;
    }

    public final void zsXlph() {
        int i = 2 % 2;
        pUU.KWHzl("TradeInstrumentTask-OkFutureBiz", "----->> clearMaps mBizInstMap:-" + djBIcL().size());
        djBIcL().clear();
        this.iwGUEr.clear();
        int i2 = AuCTelauCTel + 95;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 89;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AEQbTJ(bizInstrument.getInstId(), function1);
        int i4 = AuCTelauCTel + 125;
        uzCIH = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getNewProxyInstance.AEQbTJ(str, new Function1() { // from class: o.xLE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLC.OLrzqt(this.copydefault, function1, (ResponseData) obj);
            }
        });
        int i2 = AuCTelauCTel + 41;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(xLC xlc, Function1 function1, ResponseData responseData) {
        boolean z;
        int i = 2 % 2;
        int i2 = uzCIH + 63;
        AuCTelauCTel = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseData, "");
            responseData.getCode();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            int i3 = uzCIH + 31;
            AuCTelauCTel = i3 % 128;
            if (i3 % 2 == 0) {
                responseData.getData();
                obj.hashCode();
                throw null;
            }
            if (responseData.getData() != null) {
                xBV.Activity activity = xBV.Companion;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                FutureInstrument futureInstrumentCopydefault = activity.copydefault((InstrumentInfo) data);
                xlc.djBIcL().put(futureInstrumentCopydefault.getInstId(), futureInstrumentCopydefault);
                xlc.AEQbTJ(futureInstrumentCopydefault.getInstFly(), futureInstrumentCopydefault.getAlias(), futureInstrumentCopydefault);
            }
        }
        if (responseData.getCode() == 0) {
            int i4 = uzCIH + 51;
            AuCTelauCTel = i4 % 128;
            if (i4 % 2 == 0) {
                responseData.getData();
                obj.hashCode();
                throw null;
            }
            z = responseData.getData() != null;
        }
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final class Application implements Function1<ResponseData<InstrumentInfo>, Unit> {
        public final /* synthetic */ AtomicBoolean EZpvd;
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.EZpvd = atomicBoolean;
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<InstrumentInfo> responseData) {
            AEQbTJ(responseData);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(ResponseData<InstrumentInfo> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                xBV.Activity activity = xBV.Companion;
                InstrumentInfo data = responseData.getData();
                Intrinsics.copydefault(data);
                FutureInstrument futureInstrumentCopydefault = activity.copydefault(data);
                xLC.this.djBIcL().put(futureInstrumentCopydefault.getInstId(), futureInstrumentCopydefault);
                xLC.this.AEQbTJ(futureInstrumentCopydefault.getInstFly(), futureInstrumentCopydefault.getAlias(), futureInstrumentCopydefault);
            }
            if (this.EZpvd.getAndSet(true)) {
                return;
            }
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.copydefault;
            boolean z = responseData.getCode() == 0 && responseData.getData() != null;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void KWHzl(@NotNull java.util.ArrayList<InstrumentInfo> arrayList) {
        int i = 2 % 2;
        int i2 = uzCIH + 71;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        if (iwGUEr()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        int i4 = uzCIH + 21;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            FutureInstrument futureInstrumentCopydefault = xBV.Companion.copydefault((InstrumentInfo) it.next());
            valueOf().add(futureInstrumentCopydefault);
            djBIcL().put(futureInstrumentCopydefault.getInstId(), futureInstrumentCopydefault);
            AEQbTJ(futureInstrumentCopydefault.getInstFly(), futureInstrumentCopydefault.getAlias(), futureInstrumentCopydefault);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [280=5] */
    @Override // o.AbstractC54531xLw
    public java.lang.String gEmmrt(BizInstrument bizInstrument) {
        java.lang.String strOLrzqt;
        xOW newProxyInstance;
        int i = 2 % 2;
        java.lang.Object obj = null;
        FutureInstrument futureInstrument = !((bizInstrument instanceof FutureInstrument) ^ true) ? (FutureInstrument) bizInstrument : null;
        if (futureInstrument == null) {
            return "";
        }
        int i2 = AuCTelauCTel + 5;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            futureInstrument.isPositiveContract();
            throw null;
        }
        if (futureInstrument.isPositiveContract()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
                return "1";
            }
            int i3 = uzCIH + 45;
            AuCTelauCTel = i3 % 128;
            if (i3 % 2 == 0) {
                newProxyInstance.iwGUEr();
                obj.hashCode();
                throw null;
            }
            strOLrzqt = newProxyInstance.iwGUEr();
            if (strOLrzqt == null) {
                return "1";
            }
            int i4 = uzCIH + 99;
            AuCTelauCTel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null) {
                return "1";
            }
            int i6 = uzCIH + 63;
            AuCTelauCTel = i6 % 128;
            int i7 = i6 % 2;
            xOW newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance();
            if (newProxyInstance2 == null || (strOLrzqt = newProxyInstance2.OLrzqt()) == null) {
                return "1";
            }
        }
        return strOLrzqt;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String copydefault(BizInstrument bizInstrument) {
        FutureInstrument futureInstrument;
        int i = 2 % 2;
        if (!(bizInstrument instanceof FutureInstrument)) {
            futureInstrument = null;
        } else {
            int i2 = uzCIH + 105;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                futureInstrument = (FutureInstrument) bizInstrument;
                int i3 = 23 / 0;
            } else {
                futureInstrument = (FutureInstrument) bizInstrument;
            }
        }
        if (futureInstrument == null) {
            int i4 = AuCTelauCTel + 97;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
        if (!futureInstrument.isPositiveContract()) {
            return "inverse";
        }
        int i6 = uzCIH + 1;
        AuCTelauCTel = i6 % 128;
        if (i6 % 2 != 0) {
            return "linear";
        }
        int i7 = 62 / 0;
        return "linear";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = uzCIH + 85;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        LinkedHashMap<java.lang.String, FutureInstrument> linkedHashMap = this.iwGUEr.get(str);
        if (linkedHashMap == null) {
            LinkedHashMap<java.lang.String, FutureInstrument> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put(str2, (FutureInstrument) bizInstrument);
            this.iwGUEr.put(str, linkedHashMap2);
        } else {
            linkedHashMap.put(str2, (FutureInstrument) bizInstrument);
            int i4 = uzCIH + 105;
            AuCTelauCTel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [342=6] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (AkhnZx(r5) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (AkhnZx(r5) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r5 = fetchVPNInfo(r5.getInstFamily());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = o.xLC.AuCTelauCTel + 99;
        o.xLC.uzCIH = r1 % 128;
        r1 = r1 % 2;
        r3 = r5.getCcySign();
        r5 = o.xLC.uzCIH + com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        o.xLC.AuCTelauCTel = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r5 = o.C54589xNz.EZpvd.OLrzqt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r5 = r5.getNewProxyInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        r5 = r5.bG_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r5 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r5 = r5.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        r1 = o.xLC.uzCIH + com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        o.xLC.AuCTelauCTel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return r5.getSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return null;
     */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i3 = i2 % 128;
        uzCIH = i3;
        if (i2 % 2 != 0) {
            int i4 = 20 / 0;
            if (bizInstrument == null) {
                return null;
            }
        } else if (bizInstrument == null) {
            return null;
        }
        int i5 = i3 + 45;
        AuCTelauCTel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [355=4] */
    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(BizInstrument bizInstrument) {
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 27;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
            if (bizInstrument == null) {
                return null;
            }
        } else if (bizInstrument == null) {
            return null;
        }
        if (!AkhnZx(bizInstrument)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) {
                return null;
            }
            return value.getIsoCode();
        }
        int i4 = uzCIH + 121;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 == 0) {
            fetchVPNInfo(bizInstrument.getInstFamily());
            throw null;
        }
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(bizInstrument.getInstFamily());
        if (idxCcyConfigFetchVPNInfo == null) {
            return null;
        }
        java.lang.String ccyName = idxCcyConfigFetchVPNInfo.getCcyName();
        int i5 = AuCTelauCTel + 47;
        uzCIH = i5 % 128;
        int i6 = i5 % 2;
        return ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [368=6] */
    @Override // o.AbstractC54531xLw
    public java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        int i = 2 % 2;
        java.lang.String strGEmmrt = gEmmrt(bizInstrument);
        java.lang.Object obj = null;
        if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
            if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                return C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
            }
            int i2 = uzCIH + 57;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            TradeCoinInfo tradeCoinInfo = fetchVPNInfo().get(bizInstrument != null ? bizInstrument.getTradeSymbol() : null);
            if (tradeCoinInfo != null) {
                return tradeCoinInfo.getSign();
            }
            return null;
        }
        if (bizInstrument != null) {
            int i4 = AuCTelauCTel + 31;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            if (bizInstrument.isPositiveContract()) {
                int i6 = uzCIH + 103;
                AuCTelauCTel = i6 % 128;
                if (i6 % 2 == 0) {
                    bizInstrument.getMarginSymbol();
                    obj.hashCode();
                    throw null;
                }
                java.lang.String marginSymbol = bizInstrument.getMarginSymbol();
                int i7 = uzCIH + 121;
                AuCTelauCTel = i7 % 128;
                int i8 = i7 % 2;
                return marginSymbol;
            }
        }
        if (bizInstrument == null) {
            return null;
        }
        int i9 = uzCIH + 43;
        AuCTelauCTel = i9 % 128;
        int i10 = i9 % 2;
        return bizInstrument.getQuoteSymbol();
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String OLrzqt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 19;
        uzCIH = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            java.lang.String strGEmmrt = gEmmrt(bizInstrument);
            if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
                if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
                }
                if (bizInstrument != null) {
                    return bizInstrument.getTradeSymbol();
                }
                return null;
            }
            if (bizInstrument != null) {
                int i3 = AuCTelauCTel + 97;
                uzCIH = i3 % 128;
                if (i3 % 2 == 0 ? bizInstrument.isPositiveContract() : bizInstrument.isPositiveContract()) {
                    return bizInstrument.getMarginSymbol();
                }
            }
            if (bizInstrument != null) {
                return bizInstrument.getQuoteSymbol();
            }
            return null;
        }
        Intrinsics.EZpvd((java.lang.Object) gEmmrt(bizInstrument), (java.lang.Object) "2");
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS gEmmrt(@NotNull java.lang.String str) {
        xOW newProxyInstance;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 39;
        uzCIH = i2 % 128;
        java.lang.String str2 = "";
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getFieldNames(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (getFieldNames(str)) {
            return hDKMBd(str);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            int i3 = AuCTelauCTel + 79;
            uzCIH = i3 % 128;
            if (i3 % 2 != 0) {
                newProxyInstance.bG_();
                throw null;
            }
            MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_ = newProxyInstance.bG_();
            if (mutableLiveDataBG_ != null && (value = mutableLiveDataBG_.getValue()) != null && (isoCode = value.getIsoCode()) != null) {
                str2 = isoCode;
            }
        }
        return EZpvd(str, gEmmrt(str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54532xLx
    public xMS copydefault(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 57;
        uzCIH = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getFieldNames(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (!getFieldNames(str)) {
            return new xMU();
        }
        int i3 = AuCTelauCTel + 27;
        uzCIH = i3 % 128;
        if (i3 % 2 == 0) {
            return hDKMBd(str);
        }
        hDKMBd(str);
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS AYXKKw(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = uzCIH + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AuCTelauCTel = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            gEmmrt(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        xMS xmsGEmmrt = gEmmrt(str);
        int i3 = AuCTelauCTel + 81;
        uzCIH = i3 % 128;
        if (i3 % 2 == 0) {
            return xmsGEmmrt;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String strOLrzqt;
        xOW newProxyInstance;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strIwGUEr = null;
        if (getFieldNames(str)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                strIwGUEr = newProxyInstance.iwGUEr();
            }
            return (C54571xNh) AEQbTJ(-1057605433, C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), 1057605435, new java.lang.Object[]{this, str, strIwGUEr != null ? strIwGUEr : "", str2});
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            int i2 = AuCTelauCTel + 77;
            uzCIH = i2 % 128;
            if (i2 % 2 != 0) {
                interfaceC54581xNrOLrzqt2.getNewProxyInstance();
                throw null;
            }
            xOW newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance();
            if (newProxyInstance2 != null) {
                int i3 = uzCIH + 69;
                AuCTelauCTel = i3 % 128;
                if (i3 % 2 == 0) {
                    strOLrzqt = newProxyInstance2.OLrzqt();
                    int i4 = 63 / 0;
                } else {
                    strOLrzqt = newProxyInstance2.OLrzqt();
                }
            } else {
                strOLrzqt = null;
            }
        }
        C54571xNh c54571xNh = (C54571xNh) AEQbTJ(-1057605433, C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), 1057605435, new java.lang.Object[]{this, str, strOLrzqt != null ? strOLrzqt : "", str2});
        int i5 = uzCIH + 77;
        AuCTelauCTel = i5 % 128;
        if (i5 % 2 != 0) {
            return c54571xNh;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public C54571xNh djBIcL(@NotNull java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = uzCIH + 7;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            int i4 = AuCTelauCTel + 49;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        C54571xNh c54571xNh = (C54571xNh) AEQbTJ(-1057605433, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, 1057605435, new java.lang.Object[]{this, str, str2, null});
        int i5 = AuCTelauCTel + 15;
        uzCIH = i5 % 128;
        if (i5 % 2 == 0) {
            return c54571xNh;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // o.InterfaceC54532xLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh KWHzl(@NotNull java.lang.String str) {
        java.lang.String marginDig;
        java.lang.String sheetDig;
        java.lang.String marginSymbol;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 93;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lotSize = null;
        if (!getFieldNames(str)) {
            int i4 = AuCTelauCTel + 1;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        C54570xNg c54570xNg = new C54570xNg();
        if (idxConfigAkhnZx != null) {
            int i6 = uzCIH + 119;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 == 0) {
                marginDig = idxConfigAkhnZx.getMarginDig();
                int i7 = 77 / 0;
                if (marginDig == null) {
                    marginDig = "";
                }
            } else {
                marginDig = idxConfigAkhnZx.getMarginDig();
                if (marginDig == null) {
                }
            }
        }
        if (bizInstrumentDbNXlk != null && (marginSymbol = bizInstrumentDbNXlk.getMarginSymbol()) != null) {
            str2 = marginSymbol;
        }
        if (idxConfigAkhnZx != null) {
            sheetDig = idxConfigAkhnZx.getSheetDig();
            int i8 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            uzCIH = i8 % 128;
            int i9 = i8 % 2;
        } else {
            sheetDig = null;
        }
        if (bizInstrumentDbNXlk != null) {
            lotSize = bizInstrumentDbNXlk.getLotSize();
            int i10 = uzCIH + 125;
            AuCTelauCTel = i10 % 128;
            int i11 = i10 % 2;
        }
        C54571xNh c54571xNhKWHzl = c54570xNg.KWHzl(marginDig, str2, sheetDig, lotSize);
        c54571xNhKWHzl.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhKWHzl.AEQbTJ(AhwBna(bizInstrumentDbNXlk));
        return c54571xNhKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMV AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        xMV xmvAEQbTJ;
        java.lang.String profitSymbol;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 7;
        uzCIH = i2 % 128;
        java.lang.String str3 = "";
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getFieldNames(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (getFieldNames(str)) {
            BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
            IdxConfig idxConfigAkhnZx = AkhnZx(str);
            xMV xmv = new xMV();
            if (bizInstrumentDbNXlk == null || (profitSymbol = bizInstrumentDbNXlk.getProfitSymbol()) == null) {
                profitSymbol = "";
            }
            if (str2 == null || str2.length() == 0) {
                str2 = profitSymbol;
            }
            if (idxConfigAkhnZx != null) {
                java.lang.String profitDig = idxConfigAkhnZx.getProfitDig();
                if (profitDig == null) {
                    int i3 = uzCIH + 13;
                    AuCTelauCTel = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    str3 = profitDig;
                }
            }
            xmvAEQbTJ = xmv.KWHzl(str2, str3);
        } else {
            xmvAEQbTJ = super.AEQbTJ(str, str2);
        }
        int i5 = uzCIH + 5;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return xmvAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = r1.getProfitSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r1 = o.xLC.AuCTelauCTel + 125;
        o.xLC.uzCIH = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r4 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r7.length() != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7.length() != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6 = r6.getProfitDig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r6 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r6 = o.xLC.uzCIH + 29;
        o.xLC.AuCTelauCTel = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if ((r6 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r6 = 3 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r6 = "8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r6 = super.d_(r6, r7);
        r7 = o.xLC.AuCTelauCTel + 39;
        o.xLC.uzCIH = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r3.KWHzl(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (getFieldNames(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (getFieldNames(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = DbNXlk(r6);
        r6 = AkhnZx(r6);
        r3 = new o.xMV();
     */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV d_(@NotNull java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = uzCIH + 35;
        AuCTelauCTel = i2 % 128;
        java.lang.String str3 = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[PHI: r7
  0x005b: PHI (r7v6 java.lang.String) = (r7v5 java.lang.String), (r7v7 java.lang.String) binds: [B:20:0x0058, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String profitSymbol;
        java.lang.String feeDig;
        java.lang.String str3 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!getFieldNames(str)) {
            return super.KWHzl(str, str2);
        }
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        xMV xmv = new xMV();
        if (bizInstrumentDbNXlk == null || (profitSymbol = bizInstrumentDbNXlk.getProfitSymbol()) == null) {
            profitSymbol = "";
        }
        if (str2 != null) {
            int i2 = AuCTelauCTel + 13;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            if (str2.length() == 0) {
                str2 = profitSymbol;
            }
        }
        if (idxConfig != null) {
            int i4 = AuCTelauCTel + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            uzCIH = i4 % 128;
            if (i4 % 2 != 0) {
                feeDig = idxConfig.getFeeDig();
                int i5 = 9 / 0;
                if (feeDig != null) {
                    str3 = feeDig;
                }
            } else {
                feeDig = idxConfig.getFeeDig();
                if (feeDig != null) {
                }
            }
        }
        return xmv.KWHzl(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r1 r4
  0x004f: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = 
  (r1v4 com.okinc.unify_trade.biz.BizInstrument)
  (r1v7 com.okinc.unify_trade.biz.BizInstrument)
  (r1v8 com.okinc.unify_trade.biz.BizInstrument)
 binds: [B:8:0x0038, B:10:0x0045, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r4v1 com.okinc.unify_trade.biz.IdxConfig) = 
  (r4v0 com.okinc.unify_trade.biz.IdxConfig)
  (r4v3 com.okinc.unify_trade.biz.IdxConfig)
  (r4v4 com.okinc.unify_trade.biz.IdxConfig)
 binds: [B:8:0x0038, B:10:0x0045, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r4
  0x003a: PHI (r1v7 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v8 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0038, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r4v3 com.okinc.unify_trade.biz.IdxConfig) = (r4v0 com.okinc.unify_trade.biz.IdxConfig), (r4v4 com.okinc.unify_trade.biz.IdxConfig) binds: [B:8:0x0038, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC54532xLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh OLrzqt(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        IdxConfig idxConfigAkhnZx;
        java.lang.String settleCcy;
        java.lang.String marginDig;
        int i = 2 % 2;
        int i2 = uzCIH + 57;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfigAkhnZx = AkhnZx(str);
            int i3 = 46 / 0;
            if (!(!getFieldNames(str))) {
                int i4 = uzCIH + 71;
                AuCTelauCTel = i4 % 128;
                int i5 = i4 % 2;
                if (bizInstrumentDbNXlk instanceof FutureInstrument) {
                    settleCcy = ((FutureInstrument) bizInstrumentDbNXlk).getCtValCcy();
                }
            } else if (!getFieldNames(str)) {
                int i6 = AuCTelauCTel;
                int i7 = i6 + 117;
                uzCIH = i7 % 128;
                int i8 = i7 % 2;
                if (bizInstrumentDbNXlk instanceof FutureInstrument) {
                    int i9 = i6 + 7;
                    uzCIH = i9 % 128;
                    int i10 = i9 % 2;
                    settleCcy = ((FutureInstrument) bizInstrumentDbNXlk).getSettleCcy();
                } else {
                    settleCcy = null;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfigAkhnZx = AkhnZx(str);
            if (getFieldNames(str)) {
            }
        }
        if (getFieldNames(str)) {
            marginDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getContractDig() : null;
        } else if (idxConfigAkhnZx != null) {
            marginDig = idxConfigAkhnZx.getMarginDig();
        }
        C54571xNh c54571xNhAEQbTJ = new xMZ().AEQbTJ(settleCcy == null ? "" : settleCcy, marginDig == null ? "" : marginDig, getFieldNames(str), idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
        c54571xNhAEQbTJ.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhAEQbTJ.AEQbTJ(AhwBna(bizInstrumentDbNXlk));
        return c54571xNhAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54532xLx
    public C54571xNh EZpvd(@NotNull java.lang.String str) {
        java.lang.String quoteSymbol;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        C54569xNf c54569xNf = new C54569xNf();
        if (bizInstrumentDbNXlk == null || (quoteSymbol = bizInstrumentDbNXlk.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        java.lang.String lotSize = null;
        if (idxConfigAkhnZx != null) {
            int i2 = AuCTelauCTel + 125;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String contractDig = idxConfigAkhnZx.getContractDig();
            if (contractDig == null) {
                int i4 = uzCIH + 41;
                int i5 = i4 % 128;
                AuCTelauCTel = i5;
                if (i4 % 2 == 0) {
                    lotSize.hashCode();
                    throw null;
                }
                int i6 = i5 + 85;
                uzCIH = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str2 = contractDig;
            }
        }
        java.lang.String sheetDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null;
        if (bizInstrumentDbNXlk != null) {
            int i8 = uzCIH + 51;
            AuCTelauCTel = i8 % 128;
            if (i8 % 2 == 0) {
                bizInstrumentDbNXlk.getLotSize();
                lotSize.hashCode();
                throw null;
            }
            lotSize = bizInstrumentDbNXlk.getLotSize();
        }
        C54571xNh c54571xNhKWHzl = c54569xNf.KWHzl(quoteSymbol, str2, sheetDig, lotSize);
        c54571xNhKWHzl.valueOf(fetchVPNInfo(bizInstrumentDbNXlk));
        c54571xNhKWHzl.AEQbTJ(AhwBna(bizInstrumentDbNXlk));
        return c54571xNhKWHzl;
    }

    public static /* synthetic */ C54571xNh createTradeConvertorWithIndex$default(xLC xlc, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        int i2 = 2 % 2;
        int i3 = AuCTelauCTel + 13;
        int i4 = i3 % 128;
        uzCIH = i4;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 5) != 0) {
            int i5 = i4 + 93;
            int i6 = i5 % 128;
            AuCTelauCTel = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 45;
            uzCIH = i8 % 128;
            int i9 = i8 % 2;
            str3 = null;
        }
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        return (C54571xNh) AEQbTJ(-1057605433, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, 1057605435, new java.lang.Object[]{xlc, str, str2, str3});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        java.lang.String settleCcy;
        java.lang.String marginDig;
        C54571xNh c54564xNa;
        java.lang.String sheetDig;
        java.lang.String marginSymbol;
        xLC xlc = (xLC) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        java.lang.String str3 = (java.lang.String) objArr[3];
        int i = 2 % 2;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BizInstrument bizInstrumentDbNXlk = xlc.DbNXlk(str);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "1")) {
            IdxConfig idxConfigAkhnZx = xlc.AkhnZx(str);
            c54564xNa = new C54564xNa(idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null);
            Unit unit = Unit.INSTANCE;
        } else if (xlc.getFieldNames(str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "2")) {
            IdxConfig idxConfigAkhnZx2 = xlc.AkhnZx(str);
            C54570xNg c54570xNg = new C54570xNg();
            if (idxConfigAkhnZx2 != null) {
                int i2 = uzCIH + 105;
                AuCTelauCTel = i2 % 128;
                int i3 = i2 % 2;
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
                if (idxConfigAkhnZx2 != null) {
                    int i4 = uzCIH + 51;
                    AuCTelauCTel = i4 % 128;
                    if (i4 % 2 == 0) {
                        idxConfigAkhnZx2.getSheetDig();
                        throw null;
                    }
                    sheetDig = idxConfigAkhnZx2.getSheetDig();
                } else {
                    sheetDig = null;
                }
                if (bizInstrumentDbNXlk != null) {
                    int i5 = uzCIH + 109;
                    AuCTelauCTel = i5 % 128;
                    if (i5 % 2 == 0) {
                        lotSize = bizInstrumentDbNXlk.getLotSize();
                        int i6 = 8 / 0;
                    } else {
                        lotSize = bizInstrumentDbNXlk.getLotSize();
                    }
                }
                c54570xNg.KWHzl(marginDig2, str3, sheetDig, lotSize);
                c54564xNa = c54570xNg;
            }
        } else if (xlc.getNewProxyInstance(str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "2")) {
            IdxConfig idxConfigAkhnZx3 = xlc.AkhnZx(str);
            C54569xNf c54569xNf = new C54569xNf();
            if (bizInstrumentDbNXlk != null) {
                int i7 = AuCTelauCTel + 91;
                uzCIH = i7 % 128;
                if (i7 % 2 != 0) {
                    bizInstrumentDbNXlk.getQuoteSymbol();
                    throw null;
                }
                java.lang.String quoteSymbol = bizInstrumentDbNXlk.getQuoteSymbol();
                if (quoteSymbol == null) {
                    quoteSymbol = "";
                }
                if (idxConfigAkhnZx3 != null) {
                    int i8 = uzCIH + 87;
                    AuCTelauCTel = i8 % 128;
                    if (i8 % 2 == 0) {
                        idxConfigAkhnZx3.getContractDig();
                        lotSize.hashCode();
                        throw null;
                    }
                    java.lang.String contractDig = idxConfigAkhnZx3.getContractDig();
                    if (contractDig == null) {
                        int i9 = uzCIH + 123;
                        AuCTelauCTel = i9 % 128;
                        if (i9 % 2 == 0) {
                            lotSize.hashCode();
                            throw null;
                        }
                    } else {
                        str4 = contractDig;
                    }
                }
                c54569xNf.KWHzl(quoteSymbol, str4, idxConfigAkhnZx3 != null ? idxConfigAkhnZx3.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                c54564xNa = c54569xNf;
            }
        } else {
            IdxConfig idxConfigAkhnZx4 = xlc.AkhnZx(str);
            if (xlc.getFieldNames(str) && (bizInstrumentDbNXlk instanceof FutureInstrument)) {
                settleCcy = ((FutureInstrument) bizInstrumentDbNXlk).getCtValCcy();
                int i10 = uzCIH + 81;
                AuCTelauCTel = i10 % 128;
                int i11 = i10 % 2;
            } else if (xlc.getFieldNames(str) || !(bizInstrumentDbNXlk instanceof FutureInstrument)) {
                settleCcy = null;
            } else {
                int i12 = AuCTelauCTel + 19;
                uzCIH = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 64 / 0;
                    settleCcy = ((FutureInstrument) bizInstrumentDbNXlk).getSettleCcy();
                } else {
                    settleCcy = ((FutureInstrument) bizInstrumentDbNXlk).getSettleCcy();
                }
            }
            if (xlc.getFieldNames(str)) {
                if (idxConfigAkhnZx4 != null) {
                    int i14 = AuCTelauCTel + 47;
                    uzCIH = i14 % 128;
                    if (i14 % 2 != 0) {
                        idxConfigAkhnZx4.getContractDig();
                        throw null;
                    }
                    marginDig = idxConfigAkhnZx4.getContractDig();
                    int i15 = AuCTelauCTel + 27;
                    uzCIH = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    marginDig = null;
                }
                xMZ xmz = new xMZ();
                xmz.AEQbTJ(settleCcy != null ? "" : settleCcy, marginDig != null ? "" : marginDig, xlc.getFieldNames(str), idxConfigAkhnZx4 == null ? idxConfigAkhnZx4.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                c54564xNa = xmz;
            } else {
                if (idxConfigAkhnZx4 != null) {
                    marginDig = idxConfigAkhnZx4.getMarginDig();
                }
                xMZ xmz2 = new xMZ();
                xmz2.AEQbTJ(settleCcy != null ? "" : settleCcy, marginDig != null ? "" : marginDig, xlc.getFieldNames(str), idxConfigAkhnZx4 == null ? idxConfigAkhnZx4.getSheetDig() : null, bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getLotSize() : null);
                c54564xNa = xmz2;
            }
        }
        c54564xNa.valueOf(xlc.fetchVPNInfo(bizInstrumentDbNXlk));
        c54564xNa.AEQbTJ(xlc.AhwBna(bizInstrumentDbNXlk));
        return c54564xNa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xMS EZpvd(@NotNull java.lang.String str, IdxCcyConfig idxCcyConfig) {
        java.lang.String ccyName;
        java.lang.String ccySign;
        java.lang.String str2;
        java.lang.String priceDig;
        java.lang.String ccySign2;
        java.lang.String ccyName2;
        java.lang.String priceDig2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, "USD");
        xMW xmw = new xMW(true);
        if (idxCcyConfig != null) {
            int i2 = uzCIH + 15;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                ccyName = idxCcyConfig.getCcyName();
                int i3 = 49 / 0;
                if (ccyName == null) {
                    ccyName = "";
                }
            } else {
                ccyName = idxCcyConfig.getCcyName();
                if (ccyName == null) {
                }
            }
        }
        if (idxCcyConfig != null) {
            int i4 = uzCIH + 43;
            AuCTelauCTel = i4 % 128;
            if (i4 % 2 == 0) {
                idxCcyConfig.getCcySign();
                throw null;
            }
            ccySign = idxCcyConfig.getCcySign();
            if (ccySign == null) {
                ccySign = "";
            }
        }
        java.lang.String str3 = (idxCcyConfig == null || (priceDig2 = idxCcyConfig.getPriceDig()) == null) ? "" : priceDig2;
        java.lang.String str4 = (idxCcyConfigGEmmrt == null || (ccyName2 = idxCcyConfigGEmmrt.getCcyName()) == null) ? "" : ccyName2;
        if (idxCcyConfigGEmmrt == null || (ccySign2 = idxCcyConfigGEmmrt.getCcySign()) == null) {
            int i5 = uzCIH + 97;
            AuCTelauCTel = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        } else {
            str2 = ccySign2;
        }
        return xmw.KWHzl(ccyName, ccySign, str3, str4, str2, (idxCcyConfigGEmmrt == null || (priceDig = idxCcyConfigGEmmrt.getPriceDig()) == null) ? "" : priceDig, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
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
        if (idxCcyConfigFetchVPNInfo != null) {
            int i2 = AuCTelauCTel + 11;
            uzCIH = i2 % 128;
            if (i2 % 2 != 0) {
                priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
                int i3 = 12 / 0;
            } else {
                priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
            }
        } else {
            priceDig = null;
        }
        if (priceDig != null) {
            int i4 = AuCTelauCTel + 83;
            uzCIH = i4 % 128;
            int i5 = i4 % 2;
            if (priceDig.length() == 0) {
                strGEmmrt = C33129mqd.gEmmrt(8);
            } else if (idxCcyConfigFetchVPNInfo != null) {
                int i6 = AuCTelauCTel + 51;
                uzCIH = i6 % 128;
                int i7 = i6 % 2;
                strGEmmrt = idxCcyConfigFetchVPNInfo.getPriceDig();
                if (strGEmmrt == null) {
                    strGEmmrt = "";
                }
            }
        }
        xMT xmt = new xMT();
        if (idxCcyConfigFetchVPNInfo != null) {
            int i8 = AuCTelauCTel + 9;
            uzCIH = i8 % 128;
            if (i8 % 2 != 0) {
                idxCcyConfigFetchVPNInfo.getCcyName();
                throw null;
            }
            ccyName = idxCcyConfigFetchVPNInfo.getCcyName();
            if (ccyName == null) {
                ccyName = "";
            }
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            int i9 = uzCIH + 83;
            AuCTelauCTel = i9 % 128;
            if (i9 % 2 == 0) {
                idxCcyConfigFetchVPNInfo.getCcySign();
                throw null;
            }
            java.lang.String ccySign = idxCcyConfigFetchVPNInfo.getCcySign();
            if (ccySign != null) {
                str2 = ccySign;
            }
        }
        return xmt.OLrzqt(ccyName, str2, strGEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument DbNXlk(@NotNull java.lang.String str) {
        java.util.Collection<FutureInstrument> collectionValues;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        LinkedHashMap<java.lang.String, FutureInstrument> linkedHashMap = this.iwGUEr.get(str);
        FutureInstrument futureInstrument = null;
        if (linkedHashMap != null && (collectionValues = linkedHashMap.values()) != null) {
            int i2 = uzCIH + 103;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Object objDNCPSb = CollectionsKt___CollectionsKt.dNCPSb(collectionValues);
            if (i3 == 0) {
                throw null;
            }
            futureInstrument = (FutureInstrument) objDNCPSb;
        }
        int i4 = uzCIH + 15;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return futureInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object copydefault(java.lang.Object[] objArr) {
        xLC xlc = (xLC) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap<java.lang.String, FutureInstrument> linkedHashMap = xlc.iwGUEr.get(str);
        java.lang.Object obj = null;
        if (linkedHashMap != null) {
            java.util.Iterator<Map.Entry<java.lang.String, FutureInstrument>> it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                int i2 = uzCIH + 17;
                AuCTelauCTel = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(it.next().getValue());
                    throw null;
                }
                arrayList.add(it.next().getValue());
            }
        }
        int i3 = uzCIH + 107;
        AuCTelauCTel = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureInstrument valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 17;
        uzCIH = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LinkedHashMap<java.lang.String, FutureInstrument> linkedHashMap = this.iwGUEr.get(str);
        if (linkedHashMap == null) {
            return null;
        }
        int i4 = uzCIH + 75;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return linkedHashMap.get(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[PHI: r7
  0x002c: PHI (r7v9 java.lang.String) = (r7v2 java.lang.String), (r7v14 java.lang.String) binds: [B:39:0x008c, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String fIwbmz(@NotNull java.lang.String str) {
        java.lang.String isoCode;
        java.lang.String priceDig;
        java.lang.String priceDig2;
        xOW newProxyInstance;
        ValuationCurrencyData value;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (getFieldNames(str)) {
            IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
            java.lang.String priceDig3 = idxCcyConfigFetchVPNInfo != null ? idxCcyConfigFetchVPNInfo.getPriceDig() : null;
            if (priceDig3 == null || priceDig3.length() == 0) {
                int i2 = uzCIH + 79;
                AuCTelauCTel = i2 % 128;
                int i3 = i2 % 2;
                str2 = "8";
            } else if (idxCcyConfigFetchVPNInfo != null && (priceDig2 = idxCcyConfigFetchVPNInfo.getPriceDig()) != null) {
                str2 = priceDig2;
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
                isoCode = "";
                IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, isoCode);
                priceDig = idxCcyConfigGEmmrt == null ? idxCcyConfigGEmmrt.getPriceDig() : null;
                if (priceDig != null || priceDig.length() == 0) {
                    str2 = "2";
                } else if (idxCcyConfigGEmmrt != null) {
                    priceDig2 = idxCcyConfigGEmmrt.getPriceDig();
                    if (priceDig2 == null) {
                        int i4 = uzCIH + 21;
                        AuCTelauCTel = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    }
                }
            } else {
                int i5 = uzCIH + 7;
                AuCTelauCTel = i5 % 128;
                int i6 = i5 % 2;
                MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_ = newProxyInstance.bG_();
                if (mutableLiveDataBG_ != null && (value = mutableLiveDataBG_.getValue()) != null) {
                    int i7 = uzCIH + 39;
                    AuCTelauCTel = i7 % 128;
                    int i8 = i7 % 2;
                    isoCode = value.getIsoCode();
                    if (isoCode == null) {
                    }
                    IdxCcyConfig idxCcyConfigGEmmrt2 = gEmmrt(str, isoCode);
                    if (idxCcyConfigGEmmrt2 == null) {
                    }
                    if (priceDig != null) {
                        str2 = "2";
                    }
                }
            }
        }
        int i9 = uzCIH + 27;
        AuCTelauCTel = i9 % 128;
        int i10 = i9 % 2;
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[PHI: r3
  0x0053: PHI (r3v4 o.xOW) = (r3v3 o.xOW), (r3v6 o.xOW) binds: [B:17:0x0051, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL(@NotNull java.lang.String str) {
        xOW newProxyInstance;
        java.lang.String strOLrzqt;
        java.lang.String contractDig;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (getFieldNames(str)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                int i3 = AuCTelauCTel + 25;
                uzCIH = i3 % 128;
                int i4 = i3 % 2;
                xOW newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                if (newProxyInstance2 != null) {
                    strOLrzqt = newProxyInstance2.iwGUEr();
                } else {
                    int i5 = uzCIH + 33;
                    AuCTelauCTel = i5 % 128;
                    int i6 = i5 % 2;
                    strOLrzqt = null;
                }
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                int i7 = uzCIH + 5;
                AuCTelauCTel = i7 % 128;
                if (i7 % 2 == 0) {
                    newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance();
                    int i8 = 29 / 0;
                    if (newProxyInstance != null) {
                        strOLrzqt = newProxyInstance.OLrzqt();
                    }
                } else {
                    newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance();
                    if (newProxyInstance != null) {
                    }
                }
            }
        }
        if (getFieldNames(str) && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
            contractDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getContractDig() : null;
            if (contractDig != null && contractDig.length() != 0) {
                if (idxConfigAkhnZx == null || (contractDig = idxConfigAkhnZx.getContractDig()) == null) {
                    return "";
                }
                return contractDig;
            }
            return "8";
        }
        if (!getFieldNames(str) && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
            int i9 = uzCIH + 11;
            AuCTelauCTel = i9 % 128;
            if (i9 % 2 == 0) {
                contractDig.hashCode();
                throw null;
            }
            contractDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getMarginDig() : null;
            if (contractDig != null && contractDig.length() != 0) {
                if (idxConfigAkhnZx == null) {
                    return "";
                }
                contractDig = idxConfigAkhnZx.getMarginDig();
                if (contractDig == null) {
                    int i10 = uzCIH + 9;
                    AuCTelauCTel = i10 % 128;
                    if (i10 % 2 != 0) {
                        return "";
                    }
                    i = 3;
                    int i11 = i % 2;
                    return "";
                }
                return contractDig;
            }
            return "8";
        }
        if (getFieldNames(str) && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2")) {
            if (idxConfigAkhnZx != null) {
                int i12 = AuCTelauCTel + 33;
                uzCIH = i12 % 128;
                if (i12 % 2 != 0) {
                    idxConfigAkhnZx.getMarginDig();
                    contractDig.hashCode();
                    throw null;
                }
                contractDig = idxConfigAkhnZx.getMarginDig();
            }
            if (contractDig != null && contractDig.length() != 0) {
                if (idxConfigAkhnZx == null || (contractDig = idxConfigAkhnZx.getMarginDig()) == null) {
                    return "";
                }
                return contractDig;
            }
            return "8";
        }
        if (getFieldNames(str) || !Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2")) {
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1")) {
                return "";
            }
            java.lang.String strFARcdN = fARcdN(str);
            if (strFARcdN != null) {
                return strFARcdN;
            }
            int i13 = AuCTelauCTel + 53;
            uzCIH = i13 % 128;
            int i14 = i13 % 2;
            return "0";
        }
        int i15 = uzCIH + 83;
        int i16 = i15 % 128;
        AuCTelauCTel = i16;
        if (i15 % 2 == 0) {
            throw null;
        }
        if (idxConfigAkhnZx != null) {
            int i17 = i16 + 49;
            uzCIH = i17 % 128;
            int i18 = i17 % 2;
            contractDig = idxConfigAkhnZx.getContractDig();
        }
        if (contractDig != null && contractDig.length() != 0) {
            if (idxConfigAkhnZx == null) {
                return "";
            }
            contractDig = idxConfigAkhnZx.getContractDig();
            if (contractDig == null) {
                i = uzCIH + 7;
                AuCTelauCTel = i % 128;
                int i112 = i % 2;
                return "";
            }
            return contractDig;
        }
        return "8";
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String fARcdN(java.lang.String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = uzCIH + 95;
            int i3 = i2 % 128;
            AuCTelauCTel = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            uzCIH = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (idxConfigAkhnZx == null) {
            return null;
        }
        int i6 = uzCIH + 35;
        AuCTelauCTel = i6 % 128;
        if (i6 % 2 != 0) {
            return idxConfigAkhnZx.getSheetDig();
        }
        idxConfigAkhnZx.getSheetDig();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AkhnZx(@NotNull BizInstrument bizInstrument) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (!(!(bizInstrument instanceof FutureInstrument))) {
            int i2 = AuCTelauCTel + 109;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            z = Intrinsics.EZpvd((java.lang.Object) ((FutureInstrument) bizInstrument).getCtType(), (java.lang.Object) "linear");
        }
        int i4 = uzCIH + 125;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r5
  0x002b: PHI (r5v2 com.okinc.unify_trade.biz.BizInstrument) = (r5v1 com.okinc.unify_trade.biz.BizInstrument), (r5v14 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getFieldNames(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 75;
        uzCIH = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            int i3 = 84 / 0;
            if (bizInstrumentDbNXlk instanceof FutureInstrument) {
                int i4 = uzCIH + 107;
                AuCTelauCTel = i4 % 128;
                int i5 = i4 % 2;
                if (Intrinsics.EZpvd((java.lang.Object) ((FutureInstrument) bizInstrumentDbNXlk).getCtType(), (java.lang.Object) "linear")) {
                    int i6 = uzCIH + 41;
                    AuCTelauCTel = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            if (bizInstrumentDbNXlk instanceof FutureInstrument) {
            }
        }
        int i8 = AuCTelauCTel + 49;
        uzCIH = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        int i9 = 4 / 5;
        return false;
    }

    private final boolean getNewProxyInstance(java.lang.String str) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 99;
        uzCIH = i2 % 128;
        if (i2 % 2 == 0) {
            BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
            if (!(bizInstrumentDbNXlk instanceof FutureInstrument) || !Intrinsics.EZpvd((java.lang.Object) ((FutureInstrument) bizInstrumentDbNXlk).getCtType(), (java.lang.Object) "inverse")) {
                return false;
            }
            int i3 = uzCIH;
            int i4 = i3 + 55;
            AuCTelauCTel = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            AuCTelauCTel = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 3;
            }
            return true;
        }
        boolean z = DbNXlk(str) instanceof FutureInstrument;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 o.xNr) = (r1v5 o.xNr), (r1v13 o.xNr) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean getFieldNames() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String strWlaJM;
        int i = 2 % 2;
        int i2 = uzCIH + 121;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            int i3 = 27 / 0;
            if (interfaceC54581xNrOLrzqt != null) {
                int i4 = AuCTelauCTel + 73;
                uzCIH = i4 % 128;
                int i5 = i4 % 2;
                xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                if (newProxyInstance != null) {
                    strWlaJM = newProxyInstance.wlaJM();
                } else {
                    int i6 = AuCTelauCTel + 125;
                    uzCIH = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 % 5;
                    }
                    strWlaJM = null;
                }
            }
        } else {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
            }
        }
        return C33129mqd.copydefault(strWlaJM, "2");
    }

    public final java.lang.String fetchVPNInfo(BizInstrument bizInstrument) {
        int i = 2 % 2;
        if (!(bizInstrument instanceof FutureInstrument)) {
            int i2 = uzCIH + 115;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
            return "";
        }
        int i4 = uzCIH + 27;
        AuCTelauCTel = i4 % 128;
        FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
        if (i4 % 2 != 0) {
            return futureInstrument.getCtVal();
        }
        futureInstrument.getCtVal();
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final java.lang.String AhwBna(BizInstrument bizInstrument) {
        int i = 2 % 2;
        if (bizInstrument instanceof FutureInstrument) {
            int i2 = AuCTelauCTel + 103;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            return ((FutureInstrument) bizInstrument).getCtMult();
        }
        int i4 = AuCTelauCTel + 37;
        uzCIH = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [891=5] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizInstrument isConnected(java.lang.String str) {
        int i = 2 % 2;
        int i2 = uzCIH + 123;
        int i3 = i2 % 128;
        AuCTelauCTel = i3;
        int i4 = i2 % 2;
        if (str != null) {
            int i5 = i3 + 81;
            uzCIH = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
                if (str.length() == 0) {
                    str = "BTC";
                }
            } else if (str.length() == 0) {
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentDbNXlk = null;
        if (interfaceC54581xNrOLrzqt != null) {
            int i7 = uzCIH + 101;
            AuCTelauCTel = i7 % 128;
            if (i7 % 2 == 0) {
                interfaceC54581xNrOLrzqt.DbNXlk();
                bizInstrumentDbNXlk.hashCode();
                throw null;
            }
            java.util.List<FutureGroupInfo> listDbNXlk = interfaceC54581xNrOLrzqt.DbNXlk();
            if (listDbNXlk != null) {
                for (FutureGroupInfo futureGroupInfo : listDbNXlk) {
                    int i8 = AuCTelauCTel + 29;
                    uzCIH = i8 % 128;
                    int i9 = i8 % 2;
                    if (bizInstrumentDbNXlk == null) {
                        bizInstrumentDbNXlk = DbNXlk(str + "-" + futureGroupInfo.getCcyType());
                    }
                }
            }
        }
        return bizInstrumentDbNXlk;
    }

    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> OLrzqt() {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(EZpvd());
        arrayList.addAll(uzCIH());
        int i2 = uzCIH + 65;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkFutureBiz$ensureInitialized$2 okFutureBiz$ensureInitialized$2;
        Mutex mutexFIwbmz;
        boolean z2;
        xLC xlc;
        java.lang.Object objM7377constructorimpl;
        Mutex mutex;
        int i = 2 % 2;
        if (continuation instanceof OkFutureBiz$ensureInitialized$2) {
            okFutureBiz$ensureInitialized$2 = (OkFutureBiz$ensureInitialized$2) continuation;
            int i2 = okFutureBiz$ensureInitialized$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = uzCIH + 109;
                AuCTelauCTel = i3 % 128;
                if (i3 % 2 == 0) {
                    okFutureBiz$ensureInitialized$2.label = i2 >> Integer.MIN_VALUE;
                } else {
                    okFutureBiz$ensureInitialized$2.label = i2 - Integer.MIN_VALUE;
                }
            } else {
                okFutureBiz$ensureInitialized$2 = new OkFutureBiz$ensureInitialized$2(this, continuation);
                int i4 = uzCIH + 119;
                AuCTelauCTel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        java.lang.Object result = okFutureBiz$ensureInitialized$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = okFutureBiz$ensureInitialized$2.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(result);
            mutexFIwbmz = fIwbmz();
            okFutureBiz$ensureInitialized$2.L$0 = this;
            okFutureBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
            z2 = z;
            okFutureBiz$ensureInitialized$2.Z$0 = z2;
            okFutureBiz$ensureInitialized$2.label = 1;
            if (mutexFIwbmz.lock(null, okFutureBiz$ensureInitialized$2) == objCopydefault) {
                return objCopydefault;
            }
            xlc = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) okFutureBiz$ensureInitialized$2.L$1;
                try {
                    C56391yDq.AEQbTJ(result);
                    objM7377constructorimpl = ((Result) result).m7386unboximpl();
                    mutexFIwbmz = mutex;
                    mutexFIwbmz.unlock(null);
                    return objM7377constructorimpl;
                } catch (java.lang.Throwable th) {
                    th = th;
                    mutexFIwbmz = mutex;
                    mutexFIwbmz.unlock(null);
                    throw th;
                }
            }
            boolean z3 = okFutureBiz$ensureInitialized$2.Z$0;
            mutexFIwbmz = (Mutex) okFutureBiz$ensureInitialized$2.L$1;
            xlc = (xLC) okFutureBiz$ensureInitialized$2.L$0;
            C56391yDq.AEQbTJ(result);
            z2 = z3;
        }
        if (!z2) {
            try {
                if (xlc.iwGUEr()) {
                    int i7 = AuCTelauCTel + 45;
                    uzCIH = i7 % 128;
                    if (i7 % 2 != 0) {
                        Result.Application application = Result.Companion;
                        Result.m7377constructorimpl(xlc);
                        throw null;
                    }
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(xlc);
                    mutexFIwbmz.unlock(null);
                    return objM7377constructorimpl;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                mutexFIwbmz.unlock(null);
                throw th;
            }
        }
        okFutureBiz$ensureInitialized$2.L$0 = xlc;
        okFutureBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
        okFutureBiz$ensureInitialized$2.L$2 = okFutureBiz$ensureInitialized$2;
        okFutureBiz$ensureInitialized$2.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(okFutureBiz$ensureInitialized$2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(xlc.new TaskDescription());
        xlc.AEQbTJ(true);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        ((C54552xMp) AEQbTJ(78072272, C32112mPy.ActionBar.KWHzl(), C32112mPy.ActionBar.KWHzl(), iKWHzl2, iKWHzl, -78072271, new java.lang.Object[]{xlc})).EZpvd(xlc.new StateListAnimator(atomicBoolean, cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(okFutureBiz$ensureInitialized$2);
        }
        if (result == objCopydefault) {
            return objCopydefault;
        }
        mutex = mutexFIwbmz;
        objM7377constructorimpl = ((Result) result).m7386unboximpl();
        mutexFIwbmz = mutex;
        mutexFIwbmz.unlock(null);
        return objM7377constructorimpl;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        ((C54552xMp) AEQbTJ(78072272, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, -78072271, new java.lang.Object[]{this})).AEQbTJ(bizInstrument.getInstId(), new Application(atomicBoolean, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            int i2 = AuCTelauCTel + 47;
            uzCIH = i2 % 128;
            int i3 = i2 % 2;
            C56447yFs.copydefault(continuation);
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
        }
        int i5 = AuCTelauCTel + 107;
        uzCIH = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }

    public final java.util.ArrayList<BizInstrument> iwGUEr(@NotNull java.lang.String str) {
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        return (java.util.ArrayList) AEQbTJ(-2038251653, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, 2038251653, new java.lang.Object[]{this, str});
    }

    public final C54571xNh OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        return (C54571xNh) AEQbTJ(-1057605433, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, 1057605435, new java.lang.Object[]{this, str, str2, str3});
    }

    private final void OLrzqt(java.util.List<? extends BizInstrument> list) {
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        AEQbTJ(301691812, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, -301691809, new java.lang.Object[]{this, list});
    }

    public static final /* synthetic */ C54552xMp copydefault(xLC xlc) {
        int iKWHzl = C32112mPy.ActionBar.KWHzl();
        int iKWHzl2 = C32112mPy.ActionBar.KWHzl();
        int iKWHzl3 = C32112mPy.ActionBar.KWHzl();
        return (C54552xMp) AEQbTJ(78072272, C32112mPy.ActionBar.KWHzl(), iKWHzl3, iKWHzl2, iKWHzl, -78072271, new java.lang.Object[]{xlc});
    }
}
