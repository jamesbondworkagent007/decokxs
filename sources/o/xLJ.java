package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.market.discover.features.markets.sub.rank.futures.ui.viewmodel.MarketFuturesListUpRankViewModelWithPeriod_HiltModules;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.TickConfig;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.biz.OkOptionBiz$ensureInitialized$2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import o.C55688xof;
import o.xBY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLJ extends AbstractC54531xLw {
    private static int AuCTelauCTel = 1;
    private static int iwGUEr;
    public java.util.ArrayList<BizInstrument> AuCTel;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> ejfBZ;
    public java.lang.String fIwbmz;
    public java.util.HashMap<java.lang.String, BizInstrument> fJNWhG;
    public java.util.HashMap<java.lang.String, java.util.ArrayList<OptionInstrument>> getFieldNames;
    public java.util.HashMap<java.lang.String, IdxCcyConfig> getNewProxyInstance;
    public C54560xMx hDKMBd;
    public java.util.HashMap<java.lang.String, IdxConfig> uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit EZpvd(xLJ xlj, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = iwGUEr + 125;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault(xlj, function1, responseData);
        }
        copydefault(xlj, function1, responseData);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit OLrzqt(xLJ xlj, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = iwGUEr + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AuCTelauCTel = i2 % 128;
        int i3 = i2 % 2;
        int iOLrzqt = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        int iOLrzqt2 = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        Unit unit = (Unit) copydefault(-90113957, 90113958, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), iOLrzqt2, iOLrzqt, new java.lang.Object[]{xlj, responseData}, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt());
        int i4 = iwGUEr + 31;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object copydefault(int i, int i2, int i3, int i4, int i5, java.lang.Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = ~(i7 | i5);
        int i10 = i8 | i9;
        int i11 = ~i2;
        int i12 = (~((~i5) | i7 | i2)) | (~(i7 | i11 | i5));
        int i13 = i9 | (~(i11 | i));
        int i14 = i + i2 + i4 + ((-1696018712) * i3) + (2108813197 * i6);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i) - 2121662464) + (1221732374 * i2) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i4) + (39845888 * i3) + (227278848 * i6) + ((-1705377792) * i15);
        int i17 = ((i * 362004572) - 1408384217) + (i2 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i4 * 362004373) + (i3 * (-1290304248)) + (i6 * 155295761) + (i15 * (-60686336));
        return i16 + ((i17 * i17) * (-1680474112)) != 1 ? AEQbTJ(objArr) : KWHzl(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxConfig> DbNXlk() {
        int i = 2 % 2;
        int i2 = iwGUEr + 105;
        int i3 = i2 % 128;
        AuCTelauCTel = i3;
        int i4 = i2 % 2;
        java.util.HashMap<java.lang.String, IdxConfig> map = this.uzCIH;
        int i5 = i3 + 33;
        iwGUEr = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, BizInstrument> djBIcL() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 55;
        int i3 = i2 % 128;
        iwGUEr = i3;
        if (i2 % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        java.util.HashMap<java.lang.String, BizInstrument> map = this.fJNWhG;
        int i4 = i3 + 17;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public boolean getFieldNames() {
        int i = 2 % 2;
        int i2 = AuCTelauCTel;
        int i3 = i2 + 117;
        iwGUEr = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        iwGUEr = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String isConnected() {
        int i = 2 % 2;
        int i2 = iwGUEr;
        int i3 = i2 + 53;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.fIwbmz;
        int i5 = i2 + 117;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> valueOf() {
        int i = 2 % 2;
        int i2 = iwGUEr + 119;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AuCTel;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxCcyConfig> values() {
        int i = 2 % 2;
        int i2 = iwGUEr + 43;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getNewProxyInstance;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xLJ(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
        this.ejfBZ = map;
        this.fIwbmz = "OPTION";
        this.AuCTel = new java.util.ArrayList<>();
        this.fJNWhG = new java.util.HashMap<>();
        this.getFieldNames = new java.util.HashMap<>();
        this.uzCIH = new java.util.HashMap<>();
        this.getNewProxyInstance = new java.util.HashMap<>();
        this.hDKMBd = new C54560xMx();
    }

    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        xLJ xlj = (xLJ) objArr[0];
        int i = 2 % 2;
        int i2 = iwGUEr + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        int i3 = i2 % 128;
        AuCTelauCTel = i3;
        int i4 = i2 % 2;
        C54560xMx c54560xMx = xlj.hDKMBd;
        int i5 = i3 + 99;
        iwGUEr = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return c54560xMx;
    }

    public static final /* synthetic */ void copydefault(xLJ xlj, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 61;
        iwGUEr = i2 % 128;
        int i3 = i2 % 2;
        xlj.KWHzl((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
        int i4 = AuCTelauCTel + 35;
        iwGUEr = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 63;
        iwGUEr = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        fJNWhG().add(mutableLiveData);
        if (!z) {
            int i4 = iwGUEr + 103;
            AuCTelauCTel = i4 % 128;
            java.lang.Object obj = null;
            if (i4 % 2 == 0) {
                iwGUEr();
                obj.hashCode();
                throw null;
            }
            if (iwGUEr()) {
                KWHzl(true, (java.lang.String) null);
                return;
            }
        }
        if (zLjUOn()) {
            return;
        }
        AEQbTJ(true);
        this.hDKMBd.OLrzqt(new Function1() { // from class: o.xLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return xLJ.OLrzqt(this.AEQbTJ, (ResponseData) obj2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        xLJ xlj = (xLJ) objArr[0];
        ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        xlj.AEQbTJ(false);
        if (responseData == null || responseData.getCode() != 0) {
            xlj.KWHzl(false, responseData != null ? responseData.getMsg() : null);
            int i2 = AuCTelauCTel + 125;
            iwGUEr = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
        } else {
            int i4 = AuCTelauCTel + 101;
            iwGUEr = i4 % 128;
            int i5 = i4 % 2;
            if (responseData.getData() != null) {
                xlj.KWHzl(responseData);
                xlj.KWHzl(true, (java.lang.String) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            xLJ.this.AEQbTJ(false);
        }
    }

    public static final class Application implements Function1<ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>>, Unit> {
        public final /* synthetic */ CancellableContinuation<Result<? extends AbstractC54531xLw>> EZpvd;
        public final /* synthetic */ AtomicBoolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Result<? extends o.xLw>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(AtomicBoolean atomicBoolean, CancellableContinuation<? super Result<? extends AbstractC54531xLw>> cancellableContinuation) {
            this.copydefault = atomicBoolean;
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>> responseData) {
            copydefault(responseData);
            return Unit.INSTANCE;
        }

        public final void copydefault(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
            pUU.KWHzl("TradeInstrumentTask-OkOptionBiz", "----->> ensureInitialized refreshData");
            if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                try {
                    xLJ.copydefault(xLJ.this, responseData);
                    xLJ.this.AEQbTJ(false);
                    xLJ.this.KWHzl(true, (java.lang.String) null);
                    if (this.copydefault.getAndSet(true)) {
                        return;
                    }
                    CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(xLJ.this))));
                    return;
                } catch (java.lang.Throwable th) {
                    xLJ.this.AEQbTJ(false);
                    throw th;
                }
            }
            xLJ.this.AEQbTJ(false);
            xLJ.this.KWHzl(false, responseData != null ? responseData.getMsg() : null);
            if (this.copydefault.getAndSet(true)) {
                return;
            }
            CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation2 = this.EZpvd;
            Result.Application application2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(responseData != null ? responseData.getMsg() : null))))));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [112=5, 114=6] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[PHI: r1
  0x0053: PHI (r1v18 com.okinc.unify_trade.biz.TradeConfigData) = (r1v17 com.okinc.unify_trade.biz.TradeConfigData), (r1v21 com.okinc.unify_trade.biz.TradeConfigData) binds: [B:16:0x0051, B:13:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
        java.util.List<InstrumentInfo> first;
        java.util.ArrayList<IdxConfig> idxConfig;
        TradeConfigData second;
        int i = 2 % 2;
        int i2 = iwGUEr + 69;
        AuCTelauCTel = i2 % 128;
        java.util.ArrayList<IdxCcyConfig> idxCcyConfig = null;
        if (i2 % 2 == 0) {
            responseData.getData();
            idxCcyConfig.hashCode();
            throw null;
        }
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data = responseData.getData();
        if (data != null) {
            int i3 = AuCTelauCTel + 11;
            iwGUEr = i3 % 128;
            int i4 = i3 % 2;
            first = data.getFirst();
        } else {
            first = null;
        }
        OLrzqt(first);
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data2 = responseData.getData();
        if (data2 != null) {
            int i5 = AuCTelauCTel + 73;
            iwGUEr = i5 % 128;
            if (i5 % 2 != 0) {
                second = data2.getSecond();
                int i6 = 83 / 0;
                idxConfig = second != null ? second.getIdxConfig() : null;
            } else {
                second = data2.getSecond();
                if (second != null) {
                }
            }
        }
        EZpvd(idxConfig);
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data3 = responseData.getData();
        if (data3 != null) {
            int i7 = AuCTelauCTel + 121;
            iwGUEr = i7 % 128;
            if (i7 % 2 != 0) {
                data3.getSecond();
                idxCcyConfig.hashCode();
                throw null;
            }
            TradeConfigData second2 = data3.getSecond();
            if (second2 != null) {
                idxCcyConfig = second2.getIdxCcyConfig();
            }
        }
        AEQbTJ(idxCcyConfig);
        int i8 = iwGUEr + 35;
        AuCTelauCTel = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [126=4] */
    public final void OLrzqt(java.util.List<InstrumentInfo> list) {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            int i2 = iwGUEr + 9;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            for (InstrumentInfo instrumentInfo : list) {
                int i4 = iwGUEr + 43;
                AuCTelauCTel = i4 % 128;
                int i5 = i4 % 2;
                OptionInstrument optionInstrumentOLrzqt = xBY.Companion.OLrzqt(instrumentInfo);
                arrayList.add(optionInstrumentOLrzqt);
                djBIcL().put(instrumentInfo.getInstId(), optionInstrumentOLrzqt);
                valueOf(optionInstrumentOLrzqt);
                AYXKKw(optionInstrumentOLrzqt);
            }
        }
        OLrzqt(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = iwGUEr + 27;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            Intrinsics.checkNotNullParameter(function1, "");
            AEQbTJ(bizInstrument.getInstId(), function1);
        } else {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            Intrinsics.checkNotNullParameter(function1, "");
            AEQbTJ(bizInstrument.getInstId(), function1);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.hDKMBd.EZpvd(str, new Function1() { // from class: o.xLH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLJ.EZpvd(this.AEQbTJ, function1, (ResponseData) obj);
            }
        });
        int i2 = AuCTelauCTel + 1;
        iwGUEr = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(xLJ xlj, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 11;
        iwGUEr = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        boolean z = false;
        if (responseData.getCode() == 0) {
            int i4 = AuCTelauCTel + 123;
            iwGUEr = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
                if (responseData.getData() != null) {
                    xBY.Application application = xBY.Companion;
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    OptionInstrument optionInstrumentOLrzqt = application.OLrzqt((InstrumentInfo) data);
                    xlj.djBIcL().put(optionInstrumentOLrzqt.getInstId(), optionInstrumentOLrzqt);
                }
            } else if (responseData.getData() != null) {
            }
        }
        if (responseData.getCode() == 0) {
            int i6 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            iwGUEr = i6 % 128;
            int i7 = i6 % 2;
            if (responseData.getData() != null) {
                int i8 = iwGUEr + 61;
                AuCTelauCTel = i8 % 128;
                if (i8 % 2 != 0) {
                    z = true;
                }
            }
        }
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function1<ResponseData<InstrumentInfo>, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ AtomicBoolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.copydefault = atomicBoolean;
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<InstrumentInfo> responseData) {
            copydefault(responseData);
            return Unit.INSTANCE;
        }

        public final void copydefault(ResponseData<InstrumentInfo> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                xBY.Application application = xBY.Companion;
                InstrumentInfo data = responseData.getData();
                Intrinsics.copydefault(data);
                OptionInstrument optionInstrumentOLrzqt = application.OLrzqt(data);
                xLJ.this.djBIcL().put(optionInstrumentOLrzqt.getInstId(), optionInstrumentOLrzqt);
            }
            if (this.copydefault.getAndSet(true)) {
                return;
            }
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.AEQbTJ;
            boolean z = responseData.getCode() == 0 && responseData.getData() != null;
            Result.Application application2 = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void KWHzl(@NotNull java.util.ArrayList<InstrumentInfo> arrayList) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 31;
        iwGUEr = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            super.KWHzl(arrayList);
            iwGUEr();
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        if (iwGUEr()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (!(!it.hasNext())) {
            OptionInstrument optionInstrumentOLrzqt = xBY.Companion.OLrzqt((InstrumentInfo) it.next());
            valueOf().add(optionInstrumentOLrzqt);
            djBIcL().put(optionInstrumentOLrzqt.getInstId(), optionInstrumentOLrzqt);
            AEQbTJ(optionInstrumentOLrzqt.getUly(), optionInstrumentOLrzqt.getExpTime(), optionInstrumentOLrzqt);
            int i3 = AuCTelauCTel + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            iwGUEr = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r0
  0x0023: PHI (r0v6 o.xNr) = (r0v5 o.xNr), (r0v8 o.xNr) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String gEmmrt(BizInstrument bizInstrument) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String fieldNames;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 77;
        iwGUEr = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            int i3 = 37 / 0;
            if (interfaceC54581xNrOLrzqt != null) {
                int i4 = AuCTelauCTel + 13;
                iwGUEr = i4 % 128;
                if (i4 % 2 != 0) {
                    interfaceC54581xNrOLrzqt.getNewProxyInstance();
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
                if (newProxyInstance != null && (fieldNames = newProxyInstance.getFieldNames()) != null) {
                    return fieldNames;
                }
            }
        } else {
            interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
            }
        }
        return "1";
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String copydefault(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = iwGUEr;
        int i3 = i2 + 93;
        AuCTelauCTel = i3 % 128;
        int i4 = i3 % 2;
        OptionInstrument optionInstrument = bizInstrument instanceof OptionInstrument ? (OptionInstrument) bizInstrument : null;
        if (optionInstrument != null) {
            int i5 = i2 + 69;
            AuCTelauCTel = i5 % 128;
            int i6 = i5 % 2;
            java.lang.String optType = optionInstrument.getOptType();
            if (i6 == 0) {
                int i7 = 8 / 0;
                if (optType != null) {
                    return optType;
                }
            } else if (optType != null) {
                return optType;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 47;
        iwGUEr = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            this.getFieldNames.get(str);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.util.ArrayList<OptionInstrument> arrayList = this.getFieldNames.get(str);
        if (arrayList == null) {
            java.util.ArrayList<OptionInstrument> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add((OptionInstrument) bizInstrument);
            this.getFieldNames.put(str, arrayList2);
        } else {
            arrayList.add((OptionInstrument) bizInstrument);
            int i3 = AuCTelauCTel + 85;
            iwGUEr = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [211=5] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(BizInstrument bizInstrument) {
        java.lang.String symbol;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        xOW newProxyInstance;
        ValuationCurrencyData value;
        xOW newProxyInstance2;
        int i = 2 % 2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.Object obj = null;
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            int i2 = AuCTelauCTel + 95;
            iwGUEr = i2 % 128;
            int i3 = i2 % 2;
            if (newProxyInstance2.ejfBZ()) {
                TradeCoinInfo tradeCoinInfo = fetchVPNInfo().get(bizInstrument != null ? bizInstrument.getProfitSymbol() : null);
                pUU.KWHzl("PriceAndAmtP", "optionBiz sign " + (tradeCoinInfo != null ? tradeCoinInfo.getSign() : null));
                TradeCoinInfo tradeCoinInfo2 = fetchVPNInfo().get(bizInstrument != null ? bizInstrument.getProfitSymbol() : null);
                if (tradeCoinInfo2 != null) {
                    return tradeCoinInfo2.getSign();
                }
                return null;
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null) {
            symbol = null;
        } else {
            int i4 = AuCTelauCTel + 87;
            iwGUEr = i4 % 128;
            int i5 = i4 % 2;
            MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_2 = newProxyInstance.bG_();
            if (mutableLiveDataBG_2 != null && (value = mutableLiveDataBG_2.getValue()) != null) {
                symbol = value.getSymbol();
            }
        }
        pUU.KWHzl("PriceAndAmtP", "optionBiz symbol " + symbol);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 == null) {
            return null;
        }
        int i6 = iwGUEr + 119;
        AuCTelauCTel = i6 % 128;
        if (i6 % 2 == 0) {
            interfaceC54581xNrOLrzqt3.getNewProxyInstance();
            obj.hashCode();
            throw null;
        }
        xOW newProxyInstance3 = interfaceC54581xNrOLrzqt3.getNewProxyInstance();
        if (newProxyInstance3 == null || (mutableLiveDataBG_ = newProxyInstance3.bG_()) == null) {
            return null;
        }
        int i7 = iwGUEr + 121;
        AuCTelauCTel = i7 % 128;
        int i8 = i7 % 2;
        ValuationCurrencyData value2 = mutableLiveDataBG_.getValue();
        if (i8 == 0) {
            throw null;
        }
        if (value2 != null) {
            return value2.getSymbol();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [222=5] */
    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(BizInstrument bizInstrument) {
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        int i = 2 % 2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.Object obj = null;
        if (interfaceC54581xNrOLrzqt != null) {
            int i2 = iwGUEr + 103;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                obj.hashCode();
                throw null;
            }
            xOW newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance2 != null) {
                int i3 = iwGUEr + 79;
                AuCTelauCTel = i3 % 128;
                int i4 = i3 % 2;
                if (newProxyInstance2.ejfBZ()) {
                    if (bizInstrument == null) {
                        return null;
                    }
                    java.lang.String profitSymbol = bizInstrument.getProfitSymbol();
                    int i5 = AuCTelauCTel + 51;
                    iwGUEr = i5 % 128;
                    int i6 = i5 % 2;
                    return profitSymbol;
                }
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) {
            return null;
        }
        int i7 = iwGUEr + 71;
        AuCTelauCTel = i7 % 128;
        if (i7 % 2 != 0) {
            return value.getIsoCode();
        }
        value.getIsoCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [232=5] */
    @Override // o.AbstractC54531xLw
    public java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        java.lang.String tradeSymbol;
        int i = 2 % 2;
        if (!Intrinsics.EZpvd((java.lang.Object) gEmmrt(bizInstrument), (java.lang.Object) "0")) {
            return C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
        }
        int i2 = iwGUEr + 35;
        AuCTelauCTel = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            fetchVPNInfo();
            throw null;
        }
        java.util.HashMap<java.lang.String, TradeCoinInfo> mapFetchVPNInfo = fetchVPNInfo();
        if (bizInstrument != null) {
            int i3 = iwGUEr + 29;
            AuCTelauCTel = i3 % 128;
            if (i3 % 2 == 0) {
                bizInstrument.getTradeSymbol();
                obj.hashCode();
                throw null;
            }
            tradeSymbol = bizInstrument.getTradeSymbol();
        } else {
            tradeSymbol = null;
        }
        TradeCoinInfo tradeCoinInfo = mapFetchVPNInfo.get(tradeSymbol);
        if (tradeCoinInfo != null) {
            return tradeCoinInfo.getSign();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4 = o.xLJ.iwGUEr + 31;
        o.xLJ.AuCTelauCTel = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        return o.C33070mpX.AYXKKw(o.C55688xof.Application.RgaQzq);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r4.getTradeSymbol();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) gEmmrt(r4), (java.lang.Object) "0") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) gEmmrt(r4), (java.lang.Object) "0") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r4 == null) goto L11;
     */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 33;
        iwGUEr = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<TickConfig> AhwBna(@NotNull BizInstrument bizInstrument) {
        java.util.List<TickConfig> tickConfig;
        java.util.List<TickConfig> listAhwBna;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(bizInstrument.getInstFamily());
        if (idxConfigAkhnZx != null) {
            int i2 = iwGUEr + 15;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            tickConfig = idxConfigAkhnZx.getTickConfig();
            int i4 = AuCTelauCTel + 33;
            iwGUEr = i4 % 128;
            int i5 = i4 % 2;
        } else {
            tickConfig = null;
        }
        if (C33129mqd.KWHzl((java.util.Collection) tickConfig)) {
            if (idxConfigAkhnZx == null || (listAhwBna = idxConfigAkhnZx.getTickConfig()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            return new java.util.ArrayList<>(listAhwBna);
        }
        java.util.ArrayList<TickConfig> arrayList = new java.util.ArrayList<>();
        int i6 = AuCTelauCTel + 101;
        iwGUEr = i6 % 128;
        if (i6 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[PHI: r2
  0x00a7: PHI (r2v9 java.lang.String) = (r2v5 java.lang.String), (r2v10 java.lang.String) binds: [B:38:0x009b, B:35:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMS gEmmrt(@NotNull java.lang.String str) {
        java.lang.String ccyName;
        java.lang.String ccySign;
        java.lang.String priceDig;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        java.lang.String profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getProfitSymbol() : null;
        if (profitSymbol == null) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (getFieldNames(str)) {
                int i2 = iwGUEr + 101;
                AuCTelauCTel = i2 % 128;
                int i3 = i2 % 2;
                profitSymbol = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
                if (profitSymbol == null) {
                    profitSymbol = "USDT";
                }
            } else {
                profitSymbol = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default);
            }
        }
        IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, profitSymbol);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i4 = iwGUEr + 1;
            AuCTelauCTel = i4 % 128;
            if (i4 % 2 == 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                throw null;
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null && newProxyInstance.ejfBZ()) {
                xMT xmt = new xMT();
                if (idxCcyConfigGEmmrt == null || (ccyName = idxCcyConfigGEmmrt.getCcyName()) == null) {
                    ccyName = "";
                }
                if (idxCcyConfigGEmmrt == null || (ccySign = idxCcyConfigGEmmrt.getCcySign()) == null) {
                    ccySign = "";
                }
                if (idxCcyConfigGEmmrt != null) {
                    int i5 = AuCTelauCTel + 79;
                    iwGUEr = i5 % 128;
                    if (i5 % 2 != 0) {
                        priceDig = idxCcyConfigGEmmrt.getPriceDig();
                        int i6 = 5 / 0;
                        if (priceDig == null) {
                            int i7 = AuCTelauCTel + 75;
                            iwGUEr = i7 % 128;
                            int i8 = i7 % 2;
                        } else {
                            str2 = priceDig;
                        }
                    } else {
                        priceDig = idxCcyConfigGEmmrt.getPriceDig();
                        if (priceDig == null) {
                        }
                    }
                }
                return xmt.OLrzqt(ccyName, ccySign, str2);
            }
        }
        return KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMS KWHzl(@NotNull java.lang.String str) {
        java.lang.String isoCode;
        java.lang.String ccyName;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEjfBZ;
        xOW newProxyInstance;
        java.lang.String priceDig;
        java.lang.String ccyName2;
        java.lang.String priceDig2;
        xOW newProxyInstance2;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        java.lang.String profitSymbol = bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getProfitSymbol() : null;
        if (profitSymbol == null) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (getFieldNames(str)) {
                profitSymbol = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
                if (profitSymbol == null) {
                    profitSymbol = "USDT";
                }
            } else {
                profitSymbol = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default);
            }
        }
        IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, profitSymbol);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance2.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (isoCode = value.getIsoCode()) == null) {
            isoCode = "";
        }
        IdxCcyConfig idxCcyConfigGEmmrt2 = gEmmrt(str, isoCode);
        xMQ xmq = new xMQ();
        if (idxCcyConfigGEmmrt2 != null) {
            int i2 = iwGUEr + 69;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                idxCcyConfigGEmmrt2.getCcyName();
                throw null;
            }
            ccyName = idxCcyConfigGEmmrt2.getCcyName();
            if (ccyName == null) {
                ccyName = "";
            }
        }
        if (idxCcyConfigGEmmrt2 != null) {
            int i3 = AuCTelauCTel + 15;
            iwGUEr = i3 % 128;
            if (i3 % 2 != 0) {
                idxCcyConfigGEmmrt2.getCcySign();
                throw null;
            }
            java.lang.String ccySign = idxCcyConfigGEmmrt2.getCcySign();
            str2 = ccySign == null ? "" : ccySign;
        }
        java.lang.String str4 = (idxCcyConfigGEmmrt2 == null || (priceDig2 = idxCcyConfigGEmmrt2.getPriceDig()) == null) ? "" : priceDig2;
        java.lang.String str5 = (idxCcyConfigGEmmrt == null || (ccyName2 = idxCcyConfigGEmmrt.getCcyName()) == null) ? "" : ccyName2;
        if (idxCcyConfigGEmmrt == null) {
            str3 = "";
        } else {
            java.lang.String ccySign2 = idxCcyConfigGEmmrt.getCcySign();
            if (ccySign2 == null) {
                int i4 = AuCTelauCTel + 63;
                iwGUEr = i4 % 128;
                int i5 = i4 % 2;
                str3 = "";
            } else {
                int i6 = iwGUEr + 57;
                AuCTelauCTel = i6 % 128;
                int i7 = i6 % 2;
                str3 = ccySign2;
            }
        }
        java.lang.String str6 = (idxCcyConfigGEmmrt == null || (priceDig = idxCcyConfigGEmmrt.getPriceDig()) == null) ? "" : priceDig;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null) {
            zEjfBZ = false;
        } else {
            int i8 = AuCTelauCTel + 103;
            iwGUEr = i8 % 128;
            int i9 = i8 % 2;
            zEjfBZ = newProxyInstance.ejfBZ();
        }
        int i10 = iwGUEr + 37;
        AuCTelauCTel = i10 % 128;
        if (i10 % 2 != 0) {
            return xmq.KWHzl(ccyName, str2, str4, str5, str3, str6, zEjfBZ);
        }
        int i11 = 37 / 0;
        return xmq.KWHzl(ccyName, str2, str4, str5, str3, str6, zEjfBZ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS AYXKKw(@NotNull java.lang.String str) {
        java.lang.String strGEmmrt;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String priceDig;
        java.lang.String ccySign;
        java.lang.String ccyName;
        java.lang.String ccySign2;
        java.lang.String ccyName2;
        java.lang.String marginSymbol;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (getFieldNames(str)) {
            int i2 = AuCTelauCTel + 125;
            iwGUEr = i2 % 128;
            int i3 = i2 % 2;
            BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
            if (bizInstrumentDbNXlk != null) {
                int i4 = iwGUEr + 125;
                AuCTelauCTel = i4 % 128;
                if (i4 % 2 == 0) {
                    bizInstrumentDbNXlk.getMarginSymbol();
                    defaultConstructorMarker.hashCode();
                    throw null;
                }
                marginSymbol = bizInstrumentDbNXlk.getMarginSymbol();
            } else {
                marginSymbol = null;
            }
            strGEmmrt = C33129mqd.gEmmrt(marginSymbol);
        } else {
            strGEmmrt = "USD";
        }
        IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, strGEmmrt);
        xMW xmw = new xMW(false, 1, defaultConstructorMarker);
        java.lang.String str4 = (idxCcyConfigGEmmrt == null || (ccyName2 = idxCcyConfigGEmmrt.getCcyName()) == null) ? "" : ccyName2;
        java.lang.String str5 = (idxCcyConfigGEmmrt == null || (ccySign2 = idxCcyConfigGEmmrt.getCcySign()) == null) ? "" : ccySign2;
        if (idxCcyConfigGEmmrt != null) {
            int i5 = AuCTelauCTel + 125;
            iwGUEr = i5 % 128;
            int i6 = i5 % 2;
            java.lang.String priceDig2 = idxCcyConfigGEmmrt.getPriceDig();
            if (priceDig2 == null) {
                int i7 = iwGUEr + 55;
                AuCTelauCTel = i7 % 128;
                int i8 = i7 % 2;
                str2 = "";
            } else {
                str2 = priceDig2;
            }
        } else {
            str2 = "";
        }
        java.lang.String str6 = (idxCcyConfigGEmmrt == null || (ccyName = idxCcyConfigGEmmrt.getCcyName()) == null) ? "" : ccyName;
        java.lang.String str7 = (idxCcyConfigGEmmrt == null || (ccySign = idxCcyConfigGEmmrt.getCcySign()) == null) ? "" : ccySign;
        if (idxCcyConfigGEmmrt == null || (priceDig = idxCcyConfigGEmmrt.getPriceDig()) == null) {
            str3 = "";
        } else {
            int i9 = AuCTelauCTel + 47;
            iwGUEr = i9 % 128;
            int i10 = i9 % 2;
            str3 = priceDig;
        }
        return xmw.KWHzl(str4, str5, str2, str6, str7, str3, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r5, (java.lang.Object) "linear") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r5, (java.lang.Object) "linear") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getFieldNames(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (bizInstrumentDbNXlk instanceof OptionInstrument) {
            int i2 = iwGUEr + 105;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String ctType = ((OptionInstrument) bizInstrumentDbNXlk).getCtType();
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
        }
        int i5 = iwGUEr + 83;
        AuCTelauCTel = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String fieldNames;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 5;
        iwGUEr = i2 % 128;
        java.lang.String sheetDig = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            C54589xNz.EZpvd.OLrzqt();
            sheetDig.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i3 = AuCTelauCTel + 59;
            iwGUEr = i3 % 128;
            if (i3 % 2 != 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                sheetDig.hashCode();
                throw null;
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null) {
                int i4 = AuCTelauCTel + 67;
                iwGUEr = i4 % 128;
                int i5 = i4 % 2;
                fieldNames = newProxyInstance.getFieldNames();
            } else {
                fieldNames = null;
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) fieldNames, (java.lang.Object) "1")) {
            return OLrzqt(str);
        }
        int i6 = iwGUEr + 123;
        AuCTelauCTel = i6 % 128;
        int i7 = i6 % 2;
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (idxConfigAkhnZx != null) {
            int i8 = iwGUEr + 87;
            AuCTelauCTel = i8 % 128;
            int i9 = i8 % 2;
            sheetDig = idxConfigAkhnZx.getSheetDig();
        }
        return new C54564xNa(sheetDig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54571xNh OLrzqt(@NotNull java.lang.String str) {
        java.lang.String tradeSymbol;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        java.lang.String lotSize = null;
        if (bizInstrumentDbNXlk != null) {
            tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol();
            int i2 = iwGUEr + 49;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
        } else {
            tradeSymbol = null;
        }
        if (tradeSymbol == null) {
            tradeSymbol = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
            int i4 = AuCTelauCTel + 69;
            iwGUEr = i4 % 128;
            int i5 = i4 % 2;
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        BizInstrument bizInstrumentDbNXlk2 = DbNXlk(str);
        C54567xNd c54567xNd = new C54567xNd();
        java.lang.String sheetDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getSheetDig() : null;
        if (bizInstrumentDbNXlk2 != null) {
            int i6 = AuCTelauCTel + 115;
            iwGUEr = i6 % 128;
            if (i6 % 2 != 0) {
                bizInstrumentDbNXlk2.getLotSize();
                throw null;
            }
            lotSize = bizInstrumentDbNXlk2.getLotSize();
        }
        c54567xNd.OLrzqt(tradeSymbol, sheetDig, lotSize);
        if (bizInstrumentDbNXlk2 != null && (bizInstrumentDbNXlk2 instanceof OptionInstrument)) {
            int i7 = iwGUEr + 11;
            AuCTelauCTel = i7 % 128;
            int i8 = i7 % 2;
            OptionInstrument optionInstrument = (OptionInstrument) bizInstrumentDbNXlk2;
            c54567xNd.AEQbTJ(optionInstrument.getCtMult());
            c54567xNd.valueOf(optionInstrument.getCtVal());
        }
        return c54567xNd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String fIwbmz(@NotNull java.lang.String str) {
        OptionInstrument optionInstrument;
        java.lang.String isoCode;
        java.lang.String priceDig;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        java.lang.String profitSymbol;
        java.lang.String priceDig2;
        xOW newProxyInstance2;
        MutableLiveData<java.lang.String> mutableLiveDataKWHzl;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String value = (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataKWHzl = newProxyInstance2.KWHzl()) == null) ? null : mutableLiveDataKWHzl.getValue();
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        if (bizInstrumentDbNXlk instanceof OptionInstrument) {
            int i2 = iwGUEr + 7;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            optionInstrument = (OptionInstrument) bizInstrumentDbNXlk;
        } else {
            optionInstrument = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null) {
                isoCode = "";
            } else {
                int i4 = AuCTelauCTel + 89;
                iwGUEr = i4 % 128;
                int i5 = i4 % 2;
                ValuationCurrencyData value2 = mutableLiveDataBG_.getValue();
                if (value2 == null || (isoCode = value2.getIsoCode()) == null) {
                }
            }
            IdxCcyConfig idxCcyConfigGEmmrt = gEmmrt(str, isoCode);
            priceDig = idxCcyConfigGEmmrt != null ? idxCcyConfigGEmmrt.getPriceDig() : null;
            return (priceDig == null || priceDig.length() == 0) ? "2" : (idxCcyConfigGEmmrt == null || (priceDig = idxCcyConfigGEmmrt.getPriceDig()) == null) ? "" : priceDig;
        }
        int i6 = AuCTelauCTel + 67;
        iwGUEr = i6 % 128;
        if (i6 % 2 != 0) {
            priceDig.hashCode();
            throw null;
        }
        if (optionInstrument == null || (profitSymbol = optionInstrument.getProfitSymbol()) == null) {
            profitSymbol = "";
        }
        IdxCcyConfig idxCcyConfigGEmmrt2 = gEmmrt(str, profitSymbol);
        if (idxCcyConfigGEmmrt2 != null) {
            int i7 = iwGUEr + 69;
            AuCTelauCTel = i7 % 128;
            int i8 = i7 % 2;
            priceDig = idxCcyConfigGEmmrt2.getPriceDig();
        }
        if (priceDig == null || priceDig.length() == 0) {
            return "8";
        }
        if (idxCcyConfigGEmmrt2 == null) {
            return "";
        }
        int i9 = iwGUEr + 19;
        AuCTelauCTel = i9 % 128;
        if (i9 % 2 == 0) {
            priceDig2 = idxCcyConfigGEmmrt2.getPriceDig();
            int i10 = 26 / 0;
            if (priceDig2 == null) {
                return "";
            }
        } else {
            priceDig2 = idxCcyConfigGEmmrt2.getPriceDig();
            if (priceDig2 == null) {
                return "";
            }
        }
        return priceDig2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument DbNXlk(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<OptionInstrument> arrayList = this.getFieldNames.get(str);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            int i2 = AuCTelauCTel;
            int i3 = i2 + 105;
            iwGUEr = i3 % 128;
            int i4 = i3 % 2;
            if (arrayList != null) {
                int i5 = i2 + 65;
                iwGUEr = i5 % 128;
                return i5 % 2 != 0 ? arrayList.get(1) : arrayList.get(0);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL(@NotNull java.lang.String str) {
        java.lang.String fieldNames;
        java.lang.String contractDig;
        java.lang.String contractDig2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String str2 = null;
        if (interfaceC54581xNrOLrzqt != null) {
            int i2 = iwGUEr + 105;
            AuCTelauCTel = i2 % 128;
            if (i2 % 2 == 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                throw null;
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null) {
                int i3 = iwGUEr + 37;
                AuCTelauCTel = i3 % 128;
                if (i3 % 2 == 0) {
                    newProxyInstance.getFieldNames();
                    throw null;
                }
                fieldNames = newProxyInstance.getFieldNames();
            } else {
                fieldNames = null;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) fieldNames, (java.lang.Object) "1")) {
            java.lang.String strFARcdN = fARcdN(str);
            return strFARcdN == null ? "0" : strFARcdN;
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (idxConfigAkhnZx != null) {
            int i4 = iwGUEr + 75;
            AuCTelauCTel = i4 % 128;
            if (i4 % 2 == 0) {
                contractDig2 = idxConfigAkhnZx.getContractDig();
                int i5 = 12 / 0;
            } else {
                contractDig2 = idxConfigAkhnZx.getContractDig();
            }
            str2 = contractDig2;
        }
        if (str2 != null) {
            int i6 = AuCTelauCTel + 65;
            iwGUEr = i6 % 128;
            int i7 = i6 % 2;
            if (str2.length() != 0) {
                return (idxConfigAkhnZx == null || (contractDig = idxConfigAkhnZx.getContractDig()) == null) ? "" : contractDig;
            }
        }
        return "8";
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String fARcdN(java.lang.String str) {
        IdxConfig idxConfigAkhnZx;
        int i = 2 % 2;
        int i2 = AuCTelauCTel + 27;
        iwGUEr = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        if (str == null || (idxConfigAkhnZx = AkhnZx(str)) == null) {
            return null;
        }
        int i4 = iwGUEr + 97;
        AuCTelauCTel = i4 % 128;
        if (i4 % 2 != 0) {
            return idxConfigAkhnZx.getSheetDig();
        }
        idxConfigAkhnZx.getSheetDig();
        obj.hashCode();
        throw null;
    }

    public java.lang.String copydefault(java.lang.String str) {
        int i = 2 % 2;
        OptionInstrument optionInstrumentEZpvd = EZpvd(str);
        if (optionInstrumentEZpvd == null) {
            int i2 = iwGUEr + 85;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = iwGUEr + 69;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        java.lang.String optionExpTime = optionInstrumentEZpvd.getOptionExpTime();
        int i6 = iwGUEr + 103;
        AuCTelauCTel = i6 % 128;
        int i7 = i6 % 2;
        return optionExpTime;
    }

    public final OptionInstrument EZpvd(java.lang.String str) {
        OptionInstrument optionInstrument;
        int i = 2 % 2;
        BizInstrument bizInstrument = djBIcL().get(str);
        if (bizInstrument instanceof OptionInstrument) {
            int i2 = AuCTelauCTel + 53;
            iwGUEr = i2 % 128;
            int i3 = i2 % 2;
            optionInstrument = (OptionInstrument) bizInstrument;
        } else {
            optionInstrument = null;
        }
        int i4 = AuCTelauCTel + 99;
        iwGUEr = i4 % 128;
        if (i4 % 2 == 0) {
            return optionInstrument;
        }
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public BizInstrument isConnected(java.lang.String str) {
        BizInstrument bizInstrument;
        int i = 2 % 2;
        int i2 = iwGUEr + 61;
        AuCTelauCTel = i2 % 128;
        if (i2 % 2 == 0) {
            bizInstrument = (BizInstrument) CollectionsKt___CollectionsKt.firstOrNull(valueOf());
            int i3 = 77 / 0;
        } else {
            bizInstrument = (BizInstrument) CollectionsKt___CollectionsKt.firstOrNull(valueOf());
        }
        int i4 = iwGUEr + 125;
        AuCTelauCTel = i4 % 128;
        int i5 = i4 % 2;
        return bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[PHI: r3 r6
  0x0031: PHI (r3v13 com.okinc.unify_trade.trade.biz.OkOptionBiz$ensureInitialized$2) = 
  (r3v12 com.okinc.unify_trade.trade.biz.OkOptionBiz$ensureInitialized$2)
  (r3v15 com.okinc.unify_trade.trade.biz.OkOptionBiz$ensureInitialized$2)
 binds: [B:11:0x002f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r6v10 int) = (r6v9 int), (r6v12 int) binds: [B:11:0x002f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkOptionBiz$ensureInitialized$2 okOptionBiz$ensureInitialized$2;
        Mutex mutexFIwbmz;
        boolean z2;
        xLJ xlj;
        java.lang.Object objM7377constructorimpl;
        Mutex mutex;
        int i;
        int i2 = 2 % 2;
        if (!(continuation instanceof OkOptionBiz$ensureInitialized$2)) {
            okOptionBiz$ensureInitialized$2 = new OkOptionBiz$ensureInitialized$2(this, continuation);
        } else {
            int i3 = AuCTelauCTel + 39;
            iwGUEr = i3 % 128;
            if (i3 % 2 != 0) {
                okOptionBiz$ensureInitialized$2 = (OkOptionBiz$ensureInitialized$2) continuation;
                i = okOptionBiz$ensureInitialized$2.label;
                int i4 = 29 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    okOptionBiz$ensureInitialized$2.label = i - Integer.MIN_VALUE;
                }
            } else {
                okOptionBiz$ensureInitialized$2 = (OkOptionBiz$ensureInitialized$2) continuation;
                i = okOptionBiz$ensureInitialized$2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        java.lang.Object result = okOptionBiz$ensureInitialized$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = okOptionBiz$ensureInitialized$2.label;
        java.lang.Object obj = null;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(result);
            mutexFIwbmz = fIwbmz();
            okOptionBiz$ensureInitialized$2.L$0 = this;
            okOptionBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
            z2 = z;
            okOptionBiz$ensureInitialized$2.Z$0 = z2;
            okOptionBiz$ensureInitialized$2.label = 1;
            if (mutexFIwbmz.lock(null, okOptionBiz$ensureInitialized$2) == objCopydefault) {
                return objCopydefault;
            }
            int i6 = iwGUEr + 93;
            AuCTelauCTel = i6 % 128;
            int i7 = i6 % 2;
            xlj = this;
        } else {
            if (i5 != 1) {
                int i8 = iwGUEr + 15;
                AuCTelauCTel = i8 % 128;
                int i9 = i8 % 2;
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) okOptionBiz$ensureInitialized$2.L$1;
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
            boolean z3 = okOptionBiz$ensureInitialized$2.Z$0;
            mutexFIwbmz = (Mutex) okOptionBiz$ensureInitialized$2.L$1;
            xlj = (xLJ) okOptionBiz$ensureInitialized$2.L$0;
            C56391yDq.AEQbTJ(result);
            int i10 = AuCTelauCTel + 87;
            iwGUEr = i10 % 128;
            int i11 = i10 % 2;
            z2 = z3;
        }
        if (!z2) {
            try {
                if (xlj.iwGUEr()) {
                    int i12 = iwGUEr + 49;
                    AuCTelauCTel = i12 % 128;
                    if (i12 % 2 != 0) {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(xlj);
                        mutexFIwbmz.unlock(null);
                        return objM7377constructorimpl;
                    }
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(xlj);
                    obj.hashCode();
                    throw null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                mutexFIwbmz.unlock(null);
                throw th;
            }
        }
        okOptionBiz$ensureInitialized$2.L$0 = xlj;
        okOptionBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
        okOptionBiz$ensureInitialized$2.L$2 = okOptionBiz$ensureInitialized$2;
        okOptionBiz$ensureInitialized$2.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(okOptionBiz$ensureInitialized$2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(xlj.new StateListAnimator());
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        xlj.AEQbTJ(true);
        int iOLrzqt = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        ((C54560xMx) copydefault(-435546755, 435546755, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), iOLrzqt, new java.lang.Object[]{xlj}, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt())).OLrzqt(xlj.new Application(atomicBoolean, cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(okOptionBiz$ensureInitialized$2);
        }
        if (result != objCopydefault) {
            mutex = mutexFIwbmz;
            objM7377constructorimpl = ((Result) result).m7386unboximpl();
            mutexFIwbmz = mutex;
            mutexFIwbmz.unlock(null);
            return objM7377constructorimpl;
        }
        int i13 = AuCTelauCTel + 43;
        iwGUEr = i13 % 128;
        if (i13 % 2 == 0) {
            return objCopydefault;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int iOLrzqt = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        int iOLrzqt2 = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        ((C54560xMx) copydefault(-435546755, 435546755, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), iOLrzqt2, iOLrzqt, new java.lang.Object[]{this}, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt())).EZpvd(bizInstrument.getInstId(), new ActionBar(atomicBoolean, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            int i2 = iwGUEr + 21;
            AuCTelauCTel = i2 % 128;
            int i3 = i2 % 2;
            C56447yFs.copydefault(continuation);
            if (i3 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [521=4] */
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> zsXlph() {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayListValueOf = valueOf();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = arrayListValueOf.iterator();
        while (!(!it.hasNext())) {
            java.lang.Object next = it.next();
            java.lang.String underlying = ((BizInstrument) next).getUnderlying();
            java.lang.Object arrayList = linkedHashMap.get(underlying);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(underlying, arrayList);
                int i2 = AuCTelauCTel + 119;
                iwGUEr = i2 % 128;
                int i3 = i2 % 2;
            }
            ((java.util.List) arrayList).add(next);
            int i4 = AuCTelauCTel + 77;
            iwGUEr = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String strCopydefault = TaskDescription.AEQbTJ((java.lang.String) entry.getKey()).copydefault();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = strCopydefault.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList2.add(new kotlin.Pair(upperCase, entry.getKey()));
        }
        return arrayList2;
    }

    public static final Unit EZpvd(xLJ xlj, ResponseData responseData) {
        int iOLrzqt = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        int iOLrzqt2 = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        return (Unit) copydefault(-90113957, 90113958, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), iOLrzqt2, iOLrzqt, new java.lang.Object[]{xlj, responseData}, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt());
    }

    public static final /* synthetic */ C54560xMx OLrzqt(xLJ xlj) {
        int iOLrzqt = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        int iOLrzqt2 = MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt();
        return (C54560xMx) copydefault(-435546755, 435546755, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt(), iOLrzqt2, iOLrzqt, new java.lang.Object[]{xlj}, MarketFuturesListUpRankViewModelWithPeriod_HiltModules.KeyModule.OLrzqt());
    }
}
