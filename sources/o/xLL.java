package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.StableInstrumentInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.manager.CoinLoanCheckBoxBean;
import com.okinc.unify_trade.trade.biz.OkSpotBiz$ensureInitialized$2;
import com.okinc.unify_trade.trade.biz.task.SpotLoaderInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLL extends AbstractC54531xLw implements xLF {
    private static int AubY = 0;
    private static int wlaJM = 1;
    public java.lang.String AuCTel;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> ejfBZ;
    public java.util.HashMap<java.lang.String, BizInstrument> fIwbmz;
    public java.util.ArrayList<BizInstrument> fJNWhG;
    public C54543xMg getFieldNames;
    public java.util.HashMap<java.lang.String, StableInstrumentInfo.ActionBar> getNewProxyInstance;
    public java.util.HashMap<java.lang.String, IdxConfig> hDKMBd;
    public java.util.HashMap<java.lang.String, IdxCcyConfig> iwGUEr;
    public final java.util.HashMap<java.lang.String, CoinLoanCheckBoxBean> uzCIH;
    public final xLZ zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        xLL xll = (xLL) objArr[0];
        ResponseData responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        int i2 = AubY + 99;
        wlaJM = i2 % 128;
        if (i2 % 2 != 0) {
            return AYXKKw(xll, responseData);
        }
        AYXKKw(xll, responseData);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit AEQbTJ(java.lang.String str, Function1 function1, xLL xll, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = wlaJM + 29;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(str, function1, xll, responseData);
        int i4 = AubY + 9;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        xLL xll = (xLL) objArr[0];
        ResponseData responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        int i2 = wlaJM + 25;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            AhwBna(xll, responseData);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAhwBna = AhwBna(xll, responseData);
        int i3 = AubY + 103;
        wlaJM = i3 % 128;
        int i4 = i3 % 2;
        return unitAhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        xLL xll = (xLL) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        ResponseData responseData = (ResponseData) objArr[2];
        int i = 2 % 2;
        int i2 = wlaJM + 69;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return AEQbTJ(xll, function1, responseData);
        }
        AEQbTJ(xll, function1, responseData);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object copydefault(int i, int i2, int i3, int i4, java.lang.Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i5) | i4);
        int i11 = i9 | i10 | (~(i4 | i3));
        int i12 = (~(i3 | i5)) | (~(i7 | i5));
        int i13 = i8 | i10;
        int i14 = i5 + i4 + i2 + (793188503 * i6) + (2090109681 * i);
        int i15 = i14 * i14;
        int i16 = (837707615 * i5) + 1286602752 + ((-1676358574) * i4) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i2) + (1186463744 * i6) + (1166540800 * i) + ((-1956446208) * i15);
        int i17 = ((i5 * 1389925299) - 652765764) + (i4 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i2 * 1389926445) + (i6 * (-1551828341)) + (i * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? EZpvd(objArr) : OLrzqt(objArr) : AEQbTJ(objArr) : KWHzl(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit copydefault(xLL xll, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = wlaJM + 79;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            return EZpvd(xll, responseData);
        }
        EZpvd(xll, responseData);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxConfig> DbNXlk() {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 115;
        wlaJM = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        java.util.HashMap<java.lang.String, IdxConfig> map = this.hDKMBd;
        int i4 = i2 + 33;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String copydefault(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AubY + 69;
        int i3 = i2 % 128;
        wlaJM = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, BizInstrument> djBIcL() {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 75;
        wlaJM = i3 % 128;
        int i4 = i3 % 2;
        java.util.HashMap<java.lang.String, BizInstrument> map = this.fIwbmz;
        int i5 = i2 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        wlaJM = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String gEmmrt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = AubY + 115;
        wlaJM = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public boolean getFieldNames() {
        int i = 2 % 2;
        int i2 = wlaJM;
        int i3 = i2 + 101;
        AubY = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        AubY = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String isConnected() {
        int i = 2 % 2;
        int i2 = wlaJM;
        int i3 = i2 + 3;
        AubY = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        java.lang.String str = this.AuCTel;
        int i4 = i2 + 31;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> valueOf() {
        int i = 2 % 2;
        int i2 = wlaJM;
        int i3 = i2 + 85;
        AubY = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        java.util.ArrayList<BizInstrument> arrayList = this.fJNWhG;
        int i4 = i2 + 37;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxCcyConfig> values() {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 25;
        wlaJM = i3 % 128;
        int i4 = i3 % 2;
        java.util.HashMap<java.lang.String, IdxCcyConfig> map = this.iwGUEr;
        int i5 = i2 + 99;
        wlaJM = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return map;
    }

    public static final /* synthetic */ java.util.HashMap EZpvd(xLL xll) {
        int i = 2 % 2;
        int i2 = AubY + 67;
        int i3 = i2 % 128;
        wlaJM = i3;
        int i4 = i2 % 2;
        java.util.HashMap<java.lang.String, CoinLoanCheckBoxBean> map = xll.uzCIH;
        int i5 = i3 + 99;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ xLZ KWHzl(xLL xll) {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 85;
        wlaJM = i3 % 128;
        int i4 = i3 % 2;
        java.lang.Object obj = null;
        xLZ xlz = xll.zLjUOn;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 39;
        wlaJM = i5 % 128;
        if (i5 % 2 != 0) {
            return xlz;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void OLrzqt(xLL xll, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AubY + 59;
        wlaJM = i2 % 128;
        if (i2 % 2 == 0) {
            int iKWHzl = C48199uIq.KWHzl();
            int iKWHzl2 = C48199uIq.KWHzl();
            int iKWHzl3 = C48199uIq.KWHzl();
            copydefault(C48199uIq.KWHzl(), iKWHzl2, iKWHzl, 1436414968, new java.lang.Object[]{xll, responseData}, -1436414967, iKWHzl3);
            int i3 = 1 / 0;
        } else {
            int iKWHzl4 = C48199uIq.KWHzl();
            int iKWHzl5 = C48199uIq.KWHzl();
            int iKWHzl6 = C48199uIq.KWHzl();
            copydefault(C48199uIq.KWHzl(), iKWHzl5, iKWHzl4, 1436414968, new java.lang.Object[]{xll, responseData}, -1436414967, iKWHzl6);
        }
        int i4 = wlaJM + 55;
        AubY = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ C54543xMg copydefault(xLL xll) {
        int i = 2 % 2;
        int i2 = AubY + 51;
        int i3 = i2 % 128;
        wlaJM = i3;
        int i4 = i2 % 2;
        C54543xMg c54543xMg = xll.getFieldNames;
        int i5 = i3 + 115;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return c54543xMg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xLL(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
        this.ejfBZ = map;
        this.AuCTel = "SPOT";
        this.fJNWhG = new java.util.ArrayList<>();
        this.fIwbmz = new java.util.HashMap<>();
        this.hDKMBd = new java.util.HashMap<>();
        this.iwGUEr = new java.util.HashMap<>();
        this.getFieldNames = new C54543xMg();
        this.getNewProxyInstance = new java.util.HashMap<>();
        this.zLjUOn = new xLZ();
        this.uzCIH = new java.util.HashMap<>();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z) {
        int i = 2 % 2;
        int i2 = wlaJM + 91;
        AubY = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mutableLiveData, "");
            fJNWhG().add(mutableLiveData);
            throw null;
        }
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        fJNWhG().add(mutableLiveData);
        if (!z) {
            int i3 = wlaJM + 89;
            AubY = i3 % 128;
            int i4 = i3 % 2;
            if (iwGUEr()) {
                KWHzl(true, (java.lang.String) null);
                return;
            }
        }
        if (!zLjUOn()) {
            AEQbTJ(true);
            pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> ensureInitialized isRefreshing");
            this.getFieldNames.OLrzqt(new Function1() { // from class: o.xLM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return xLL.copydefault(this.copydefault, (ResponseData) obj2);
                }
            });
        }
        int i5 = wlaJM + 33;
        AubY = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(xLL xll, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AubY + 75;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        xll.AEQbTJ(false);
        pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> ensureInitialized refreshData");
        if (responseData == null || responseData.getCode() != 0) {
            xll.KWHzl(false, responseData != null ? responseData.getMsg() : null);
        } else {
            int i4 = AubY + 5;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
            if (responseData.getData() != null) {
                int iKWHzl = C48199uIq.KWHzl();
                copydefault(C48199uIq.KWHzl(), C48199uIq.KWHzl(), iKWHzl, 1436414968, new java.lang.Object[]{xll, responseData}, -1436414967, C48199uIq.KWHzl());
                xll.KWHzl(true, (java.lang.String) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            xLL.this.AEQbTJ(false);
        }
    }

    public static final class TaskDescription implements Function1<ResponseData<SpotLoaderInfo>, Unit> {
        public final /* synthetic */ AtomicBoolean AEQbTJ;
        public final /* synthetic */ CancellableContinuation<Result<? extends AbstractC54531xLw>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Result<? extends o.xLw>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(AtomicBoolean atomicBoolean, CancellableContinuation<? super Result<? extends AbstractC54531xLw>> cancellableContinuation) {
            this.AEQbTJ = atomicBoolean;
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<SpotLoaderInfo> responseData) {
            EZpvd(responseData);
            return Unit.INSTANCE;
        }

        public final void EZpvd(ResponseData<SpotLoaderInfo> responseData) {
            pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> ensureInitialized refreshData");
            if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                try {
                    xLL.OLrzqt(xLL.this, responseData);
                    xLL.this.AEQbTJ(false);
                    xLL.this.KWHzl(true, (java.lang.String) null);
                    if (!this.AEQbTJ.getAndSet(true)) {
                        CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation = this.copydefault;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(xLL.this))));
                    }
                    Result.Application application2 = Result.Companion;
                    return;
                } catch (java.lang.Throwable th) {
                    xLL.this.AEQbTJ(false);
                    throw th;
                }
            }
            xLL.this.AEQbTJ(false);
            xLL.this.KWHzl(false, responseData != null ? responseData.getMsg() : null);
            if (this.AEQbTJ.getAndSet(true)) {
                return;
            }
            CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation2 = this.copydefault;
            Result.Application application3 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(responseData != null ? responseData.getMsg() : null))))));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [119=4] */
    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        java.util.List<InstrumentInfo> listAhwBna;
        java.util.Collection collectionAhwBna;
        java.util.List<IdxCcyConfig> listAhwBna2;
        java.util.List<CountDownInfo> countDownList;
        TradeConfigData config;
        TradeConfigData config2;
        xLL xll = (xLL) objArr[0];
        ResponseData responseData = (ResponseData) objArr[1];
        int i = 2 % 2;
        xll.AubY();
        SpotLoaderInfo spotLoaderInfo = (SpotLoaderInfo) responseData.getData();
        if (spotLoaderInfo == null || (listAhwBna = spotLoaderInfo.getBizList()) == null) {
            listAhwBna = yDY.AhwBna();
            int i2 = AubY + 125;
            wlaJM = i2 % 128;
            int i3 = i2 % 2;
        }
        xll.copydefault(new java.util.ArrayList(listAhwBna));
        SpotLoaderInfo spotLoaderInfo2 = (SpotLoaderInfo) responseData.getData();
        if (spotLoaderInfo2 == null || (config2 = spotLoaderInfo2.getConfig()) == null || (collectionAhwBna = config2.getIdxConfig()) == null) {
            collectionAhwBna = yDY.AhwBna();
        }
        xll.EZpvd(new java.util.ArrayList(collectionAhwBna));
        SpotLoaderInfo spotLoaderInfo3 = (SpotLoaderInfo) responseData.getData();
        if (spotLoaderInfo3 == null || (config = spotLoaderInfo3.getConfig()) == null || (listAhwBna2 = config.getIdxCcyConfig()) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        xll.AEQbTJ(listAhwBna2);
        SpotLoaderInfo spotLoaderInfo4 = (SpotLoaderInfo) responseData.getData();
        if (spotLoaderInfo4 != null) {
            countDownList = spotLoaderInfo4.getCountDownList();
            int i4 = AubY + 13;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = wlaJM + 47;
            AubY = i6 % 128;
            int i7 = i6 % 2;
            countDownList = null;
        }
        xll.AEQbTJ("SPOT", countDownList);
        xll.gHZMYf();
        int i8 = AubY + 55;
        wlaJM = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void copydefault(java.util.List<InstrumentInfo> list) {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        int i2 = AubY + 7;
        wlaJM = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 2;
        }
        for (InstrumentInfo instrumentInfo : list) {
            SpotInstrument spotInstrumentAEQbTJ = new xLZ().AEQbTJ(instrumentInfo);
            arrayList.add(spotInstrumentAEQbTJ);
            djBIcL().put(instrumentInfo.getInstId(), spotInstrumentAEQbTJ);
            AhwBna(spotInstrumentAEQbTJ);
            valueOf(spotInstrumentAEQbTJ);
            AYXKKw(spotInstrumentAEQbTJ);
        }
        OLrzqt(arrayList);
        int i4 = wlaJM + 35;
        AubY = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AhwBna(BizInstrument bizInstrument) {
        int i = 2 % 2;
        BizInstrument bizInstrument2 = gEmmrt().get(bizInstrument.getInstId());
        if (bizInstrument2 != null) {
            int i2 = wlaJM + 11;
            AubY = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 == 0) {
                if ((bizInstrument2 instanceof SpotInstrument) && !((SpotInstrument) bizInstrument2).compare(bizInstrument)) {
                    pUU.EZpvd("TradeInstrumentTask-OkSpotBiz", "----->> bizInfo1 != bizInfo---bizInfo1:" + bizInstrument2 + "---bizInfo:" + bizInstrument);
                    gEmmrt().put(bizInstrument.getInstId(), null);
                }
            } else {
                boolean z = bizInstrument2 instanceof SpotInstrument;
                obj.hashCode();
                throw null;
            }
        }
        int i3 = wlaJM + 43;
        AubY = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void AubY() {
        int i = 2 % 2;
        pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> clearMaps mBizInstMap:-" + djBIcL().size());
        djBIcL().clear();
        int i2 = AubY + 37;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AEQbTJ(bizInstrument.getInstId(), function1);
        this.getFieldNames.AEQbTJ(new Function1() { // from class: o.xLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.copydefault, (ResponseData) obj};
                int iKWHzl = C48199uIq.KWHzl();
                return (Unit) xLL.copydefault(C48199uIq.KWHzl(), C48199uIq.KWHzl(), iKWHzl, 497780161, objArr, -497780161, C48199uIq.KWHzl());
            }
        });
        int i2 = wlaJM + 5;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AhwBna(xLL xll, ResponseData responseData) {
        java.util.ArrayList<java.lang.String> stableInstrumentList;
        int size;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        StableInstrumentInfo stableInstrumentInfo = (StableInstrumentInfo) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            int i2 = 0;
            if (stableInstrumentInfo != null) {
                int i3 = wlaJM + 99;
                AubY = i3 % 128;
                if (i3 % 2 != 0) {
                    stableInstrumentList = stableInstrumentInfo.getStableInstrumentList();
                    int i4 = 82 / 0;
                } else {
                    stableInstrumentList = stableInstrumentInfo.getStableInstrumentList();
                }
            } else {
                stableInstrumentList = null;
            }
            if (stableInstrumentList != null && (!stableInstrumentInfo.getStableInstrumentList().isEmpty())) {
                int i5 = wlaJM + 73;
                AubY = i5 % 128;
                if (i5 % 2 != 0) {
                    size = stableInstrumentInfo.getStableInstrumentList().size();
                    i2 = 1;
                } else {
                    size = stableInstrumentInfo.getStableInstrumentList().size();
                }
                while (i2 < size) {
                    xll.getNewProxyInstance.put(stableInstrumentInfo.getStableInstrumentList().get(i2), new StableInstrumentInfo.ActionBar(stableInstrumentInfo.getMaxPrice(), stableInstrumentInfo.getMinPrice()));
                    i2++;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getFieldNames.copydefault(str, new Function1() { // from class: o.xLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLL.AEQbTJ(str, function1, this, (ResponseData) obj);
            }
        });
        int i2 = wlaJM + 31;
        AubY = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(java.lang.String str, Function1 function1, xLL xll, ResponseData responseData) {
        boolean z;
        InstrumentInfo instrumentInfo;
        int i = 2 % 2;
        int i2 = wlaJM + 23;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            int i4 = wlaJM + 101;
            AubY = i4 % 128;
            if (i4 % 2 != 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            kotlin.Pair pair = (kotlin.Pair) responseData.getData();
            if (pair != null && (instrumentInfo = (InstrumentInfo) pair.getFirst()) != null) {
                SpotInstrument spotInstrumentAEQbTJ = xll.zLjUOn.AEQbTJ(instrumentInfo);
                xll.gEmmrt().put(spotInstrumentAEQbTJ.getInstId(), spotInstrumentAEQbTJ);
            }
            kotlin.Pair pair2 = (kotlin.Pair) responseData.getData();
            if (pair2 != null) {
                int i5 = wlaJM + 33;
                AubY = i5 % 128;
                int i6 = i5 % 2;
                CoinLoanCheckBoxBean coinLoanCheckBoxBean = (CoinLoanCheckBoxBean) pair2.getSecond();
                if (coinLoanCheckBoxBean != null) {
                    xll.uzCIH.put(str, coinLoanCheckBoxBean);
                    int i7 = AubY + 101;
                    wlaJM = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 / 3;
                    }
                }
            }
        }
        boolean z2 = false;
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            z = false;
        } else {
            int i9 = AubY + 71;
            wlaJM = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> kline use loadBizInfoDetail to load instId: " + str + " is success " + z);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            z2 = true;
        }
        function1.invoke(java.lang.Boolean.valueOf(z2));
        Unit unit = Unit.INSTANCE;
        int i11 = AubY + 69;
        wlaJM = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument valueOf(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = wlaJM + 9;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentAhwBna = AhwBna(str);
        int i4 = wlaJM + 75;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return bizInstrumentAhwBna;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AYXKKw(xLL xll, ResponseData responseData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        StableInstrumentInfo stableInstrumentInfo = (StableInstrumentInfo) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if ((stableInstrumentInfo != null ? stableInstrumentInfo.getStableInstrumentList() : null) != null && (!stableInstrumentInfo.getStableInstrumentList().isEmpty())) {
                int i2 = AubY + 105;
                wlaJM = i2 % 128;
                int i3 = i2 % 2;
                int size = stableInstrumentInfo.getStableInstrumentList().size();
                int i4 = AubY + 15;
                wlaJM = i4 % 128;
                int i5 = i4 % 2;
                for (int i6 = 0; i6 < size; i6++) {
                    xll.getNewProxyInstance.put(stableInstrumentInfo.getStableInstrumentList().get(i6), new StableInstrumentInfo.ActionBar(stableInstrumentInfo.getMaxPrice(), stableInstrumentInfo.getMinPrice()));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function1<ResponseData<kotlin.Pair<? extends InstrumentInfo, ? extends CoinLoanCheckBoxBean>>, Unit> {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> EZpvd;
        public final /* synthetic */ AtomicBoolean KWHzl;
        public final /* synthetic */ xLL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(BizInstrument bizInstrument, AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation, xLL xll) {
            this.AEQbTJ = bizInstrument;
            this.KWHzl = atomicBoolean;
            this.EZpvd = cancellableContinuation;
            this.copydefault = xll;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<kotlin.Pair<? extends InstrumentInfo, ? extends CoinLoanCheckBoxBean>> responseData) {
            copydefault(responseData);
            return Unit.INSTANCE;
        }

        public final void copydefault(ResponseData<kotlin.Pair<InstrumentInfo, CoinLoanCheckBoxBean>> responseData) {
            CoinLoanCheckBoxBean second;
            InstrumentInfo first;
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                kotlin.Pair<InstrumentInfo, CoinLoanCheckBoxBean> data = responseData.getData();
                if (data != null && (first = data.getFirst()) != null) {
                    xLL xll = this.copydefault;
                    SpotInstrument spotInstrumentAEQbTJ = xLL.KWHzl(xll).AEQbTJ(first);
                    xll.gEmmrt().put(spotInstrumentAEQbTJ.getInstId(), spotInstrumentAEQbTJ);
                }
                kotlin.Pair<InstrumentInfo, CoinLoanCheckBoxBean> data2 = responseData.getData();
                if (data2 != null && (second = data2.getSecond()) != null) {
                    xLL.EZpvd(this.copydefault).put(this.AEQbTJ.getInstId(), second);
                }
            }
            boolean z = false;
            pUU.KWHzl("TradeInstrumentTask-OkSpotBiz", "----->> kline use loadBizInfoDetail to load instId: " + this.AEQbTJ.getInstId() + " is success " + (responseData.getCode() == 0 && responseData.getData() != null));
            if (this.KWHzl.getAndSet(true)) {
                return;
            }
            CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.EZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                z = true;
            }
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    public static final class Activity extends AbstractC55758xpw {
        public Activity(java.lang.String str, java.lang.String str2) {
            super(str, str2, "SPOT");
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<CountDownInfo> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("OkSpotBiz", "CountDownBizInfoListener---" + list);
            xLL.this.AEQbTJ("SPOT", list);
            RxBus.KWHzl("NEW_COIN_ONLINE_STATUS_UPDATE");
        }
    }

    private final void gHZMYf() {
        java.util.ArrayList<java.lang.Object> arrayListCopydefault;
        int i = 2 % 2;
        wlaJM();
        EZpvd(new Activity(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), getNewProxyInstance().AEQbTJ()));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i2 = wlaJM + 15;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            AbstractC55758xpw abstractC55758xpwEjfBZ = ejfBZ();
            Intrinsics.copydefault(abstractC55758xpwEjfBZ);
            if (i3 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[0];
                objArr[1] = abstractC55758xpwEjfBZ;
                arrayListCopydefault = yDY.copydefault(objArr);
            } else {
                arrayListCopydefault = yDY.copydefault(abstractC55758xpwEjfBZ);
            }
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void copydefault(@NotNull final Function1<? super ResponseData<java.util.List<CountDownInfo>>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.getFieldNames.copydefault(new Function1() { // from class: o.xLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.EZpvd, function1, (ResponseData) obj};
                int iKWHzl = C48199uIq.KWHzl();
                return (Unit) xLL.copydefault(C48199uIq.KWHzl(), C48199uIq.KWHzl(), iKWHzl, -291748831, objArr, 291748834, C48199uIq.KWHzl());
            }
        });
        int i2 = wlaJM + 95;
        AubY = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(xLL xll, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = AubY + 71;
        wlaJM = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseData, "");
            responseData.getCode();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            int i3 = wlaJM + 59;
            AubY = i3 % 128;
            if (i3 % 2 != 0) {
                xll.AEQbTJ("SPOT", (java.util.List<CountDownInfo>) responseData.getData());
                xll.gHZMYf();
                obj.hashCode();
                throw null;
            }
            xll.AEQbTJ("SPOT", (java.util.List<CountDownInfo>) responseData.getData());
            xll.gHZMYf();
        }
        function1.invoke(responseData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void KWHzl(@NotNull java.util.ArrayList<InstrumentInfo> arrayList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        if (iwGUEr()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        int i2 = AubY + 115;
        wlaJM = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            SpotInstrument spotInstrumentAEQbTJ = this.zLjUOn.AEQbTJ((InstrumentInfo) it.next());
            valueOf().add(spotInstrumentAEQbTJ);
            djBIcL().put(spotInstrumentAEQbTJ.getInstId(), spotInstrumentAEQbTJ);
            i2 = wlaJM + 81;
            AubY = i2 % 128;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(BizInstrument bizInstrument) {
        java.lang.String sign;
        SpotInstrument spotInstrument;
        java.lang.String displayQuoteSymbol;
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 21;
        int i4 = i3 % 128;
        wlaJM = i4;
        if (i3 % 2 == 0) {
            int i5 = 33 / 0;
            if (bizInstrument == null) {
                int i6 = i4 + 95;
                AubY = i6 % 128;
                int i7 = i6 % 2;
                sign = null;
            } else {
                java.util.HashMap<java.lang.String, TradeCoinInfo> map = this.ejfBZ;
                if (!(!(bizInstrument instanceof SpotInstrument))) {
                    int i8 = i2 + 3;
                    wlaJM = i8 % 128;
                    int i9 = i8 % 2;
                    spotInstrument = (SpotInstrument) bizInstrument;
                } else {
                    spotInstrument = null;
                }
                if (spotInstrument != null) {
                    int i10 = i2 + 47;
                    wlaJM = i10 % 128;
                    int i11 = i10 % 2;
                    displayQuoteSymbol = spotInstrument.getDisplayQuoteSymbol();
                    int i12 = wlaJM + 39;
                    AubY = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    displayQuoteSymbol = null;
                }
                TradeCoinInfo tradeCoinInfo = map.get(displayQuoteSymbol);
                if (tradeCoinInfo == null || (sign = tradeCoinInfo.getSign()) == null) {
                    sign = "";
                }
            }
        } else if (bizInstrument == null) {
        }
        int i14 = AubY + 35;
        wlaJM = i14 % 128;
        if (i14 % 2 != 0) {
            return sign;
        }
        throw null;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 29;
        wlaJM = i3 % 128;
        java.lang.String displayQuoteSymbol = null;
        if (i3 % 2 == 0) {
            boolean z = bizInstrument instanceof SpotInstrument;
            displayQuoteSymbol.hashCode();
            throw null;
        }
        if (bizInstrument instanceof SpotInstrument) {
            int i4 = i2 + 9;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
            spotInstrument = (SpotInstrument) bizInstrument;
        } else {
            spotInstrument = null;
        }
        if (spotInstrument != null) {
            int i6 = i2 + 17;
            wlaJM = i6 % 128;
            if (i6 % 2 == 0) {
                spotInstrument.getDisplayQuoteSymbol();
                throw null;
            }
            displayQuoteSymbol = spotInstrument.getDisplayQuoteSymbol();
        }
        int i7 = AubY + 5;
        wlaJM = i7 % 128;
        int i8 = i7 % 2;
        return displayQuoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        int i = 2 % 2;
        if (bizInstrument == null) {
            int i2 = wlaJM + 65;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        java.util.HashMap<java.lang.String, TradeCoinInfo> map = this.ejfBZ;
        if (bizInstrument instanceof SpotInstrument) {
            spotInstrument = (SpotInstrument) bizInstrument;
            int i4 = AubY + 19;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
        } else {
            spotInstrument = null;
        }
        TradeCoinInfo tradeCoinInfo = map.get(spotInstrument != null ? spotInstrument.getTradeSymbol() : null);
        if (tradeCoinInfo != null) {
            int i6 = wlaJM + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            AubY = i6 % 128;
            int i7 = i6 % 2;
            java.lang.String sign = tradeCoinInfo.getSign();
            if (sign != null) {
                return sign;
            }
        }
        return "";
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String OLrzqt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = wlaJM + 93;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        SpotInstrument spotInstrument = bizInstrument instanceof SpotInstrument ? (SpotInstrument) bizInstrument : null;
        java.lang.String tradeSymbol = spotInstrument != null ? spotInstrument.getTradeSymbol() : null;
        int i4 = wlaJM + 65;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return tradeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xLF
    public boolean KWHzl(@NotNull java.lang.String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        if (bizInstrumentValueOf != null) {
            int i2 = wlaJM + 35;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            if ((bizInstrumentValueOf instanceof SpotInstrument) && C33129mqd.OLrzqt((java.lang.CharSequence) ((SpotInstrument) bizInstrumentValueOf).getLevel())) {
                return true;
            }
        }
        int i4 = AubY + 95;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public java.util.List<ChargeGroupData> zsXlph() {
        int i = 2 % 2;
        int i2 = AubY + 87;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i4 = wlaJM + 15;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            java.util.List<ChargeGroupData> listAEQbTJ = interfaceC54581xNrOLrzqt.AEQbTJ();
            if (listAEQbTJ != null) {
                return listAEQbTJ;
            }
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMS gEmmrt(@NotNull java.lang.String str) {
        java.lang.String ccyName;
        java.lang.String displaySign;
        java.lang.String ccySign;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        xMT xmt = new xMT();
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (idxCcyConfigFetchVPNInfo != null ? idxCcyConfigFetchVPNInfo.getDisplayName() : null))) {
            if (idxCcyConfigFetchVPNInfo == null || (ccyName = idxCcyConfigFetchVPNInfo.getDisplayName()) == null) {
                ccyName = "";
            }
        } else if (idxCcyConfigFetchVPNInfo != null) {
            int i2 = wlaJM + 101;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            ccyName = idxCcyConfigFetchVPNInfo.getCcyName();
            if (ccyName == null) {
            }
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            displaySign = idxCcyConfigFetchVPNInfo.getDisplaySign();
            int i4 = AubY + 33;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
        } else {
            displaySign = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) displaySign)) {
            if (idxCcyConfigFetchVPNInfo != null) {
                int i6 = wlaJM + 61;
                AubY = i6 % 128;
                int i7 = i6 % 2;
                ccySign = idxCcyConfigFetchVPNInfo.getDisplaySign();
                if (ccySign == null) {
                    ccySign = "";
                }
            }
        } else if (idxCcyConfigFetchVPNInfo != null) {
            int i8 = wlaJM + 79;
            AubY = i8 % 128;
            int i9 = i8 % 2;
            ccySign = idxCcyConfigFetchVPNInfo.getCcySign();
            if (ccySign == null) {
            }
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            java.lang.String priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
            if (priceDig == null) {
                int i10 = AubY + 101;
                wlaJM = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            } else {
                str2 = priceDig;
            }
        }
        return xmt.OLrzqt(ccyName, ccySign, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS AYXKKw(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 61;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        xMS xmsGEmmrt = gEmmrt(str);
        int i4 = wlaJM + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return xmsGEmmrt;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String tradeSymbol;
        java.lang.String baseDig;
        java.lang.String tradeSymbol2;
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (str2 != null) {
            if (bizInstrumentDbNXlk != null) {
                int i2 = wlaJM + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                AubY = i2 % 128;
                int i3 = i2 % 2;
                tradeSymbol2 = bizInstrumentDbNXlk.getTradeSymbol();
            } else {
                tradeSymbol2 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) tradeSymbol2)) {
                if (idxConfig != null) {
                    java.lang.String quoteDig = idxConfig.getQuoteDig();
                    if (quoteDig == null) {
                        int i4 = wlaJM;
                        int i5 = i4 + 61;
                        AubY = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 125;
                        AubY = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        str3 = quoteDig;
                    }
                }
                return new xMY(str2, str3);
            }
        }
        if (bizInstrumentDbNXlk == null || (tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        if (idxConfig != null && (baseDig = idxConfig.getBaseDig()) != null) {
            str3 = baseDig;
        }
        xMY xmy = new xMY(tradeSymbol, str3);
        int i9 = wlaJM + 85;
        AubY = i9 % 128;
        if (i9 % 2 == 0) {
            return xmy;
        }
        int i10 = 5 / 2;
        return xmy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[PHI: r7
  0x0068: PHI (r7v8 java.lang.String) = (r7v3 java.lang.String), (r7v9 java.lang.String) binds: [B:20:0x0058, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String tradeSymbol;
        java.lang.String baseDigDisplay;
        java.lang.String baseDig;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (bizInstrumentDbNXlk == null || (tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        if (idxConfig != null) {
            baseDigDisplay = idxConfig.getBaseDigDisplay();
        } else {
            int i2 = AubY + 85;
            wlaJM = i2 % 128;
            int i3 = i2 % 2;
            baseDigDisplay = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) baseDigDisplay)) {
            int i4 = AubY + 21;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
            if (idxConfig != null) {
                baseDig = idxConfig.getBaseDigDisplay();
                if (baseDig == null) {
                    int i6 = AubY + 105;
                    wlaJM = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str2 = baseDig;
                }
            }
        } else if (idxConfig != null) {
            baseDig = idxConfig.getBaseDig();
            if (baseDig == null) {
                int i8 = AubY + 13;
                wlaJM = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 85 / 0;
                }
            }
        }
        return new xMY(tradeSymbol, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    @Override // o.xLF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String quoteDig;
        int i = 2 % 2;
        int i2 = AubY + 25;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (str2 == null) {
            if (bizInstrumentDbNXlk != null) {
                str2 = bizInstrumentDbNXlk.getDisplayQuoteSymbol();
            } else {
                int i4 = AubY + 15;
                wlaJM = i4 % 128;
                int i5 = i4 % 2;
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
        }
        if (idxConfig != null) {
            int i6 = wlaJM + 63;
            AubY = i6 % 128;
            int i7 = i6 % 2;
            quoteDig = idxConfig.getQuoteDig();
            if (quoteDig == null) {
                quoteDig = " ";
            }
        }
        return new xMY(str2, quoteDig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMV KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String tradeSymbol;
        java.lang.String quoteFeeDig;
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        if (bizInstrumentValueOf != null) {
            int i2 = AubY + 99;
            wlaJM = i2 % 128;
            int i3 = i2 % 2;
            tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
        } else {
            int i4 = AubY + 123;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
            tradeSymbol = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) tradeSymbol)) {
            int i6 = AubY + 41;
            wlaJM = i6 % 128;
            if (i6 % 2 == 0) {
                super.KWHzl(str, str2);
                throw null;
            }
            xMV xmvKWHzl = super.KWHzl(str, str2);
            int i7 = wlaJM + 83;
            AubY = i7 % 128;
            int i8 = i7 % 2;
            return xmvKWHzl;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return EZpvd(str);
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        Intrinsics.copydefault((java.lang.Object) str2);
        if (idxConfigAkhnZx == null || (quoteFeeDig = idxConfigAkhnZx.getQuoteFeeDig()) == null) {
            int i9 = wlaJM + 19;
            AubY = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str3 = quoteFeeDig;
        }
        return xmv.KWHzl(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV EZpvd(@NotNull java.lang.String str) {
        java.lang.String displayQuoteSymbol;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentValueOf != null) {
            int i2 = wlaJM + 65;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            displayQuoteSymbol = bizInstrumentValueOf.getDisplayQuoteSymbol();
            if (displayQuoteSymbol == null) {
                displayQuoteSymbol = "";
            }
        }
        if (idxConfigAkhnZx != null) {
            int i4 = AubY + 89;
            wlaJM = i4 % 128;
            int i5 = i4 % 2;
            java.lang.String quoteFeeDig = idxConfigAkhnZx.getQuoteFeeDig();
            if (quoteFeeDig != null) {
                str2 = quoteFeeDig;
            }
        }
        xmv.KWHzl(displayQuoteSymbol, str2);
        return xmv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMV AYXKKw(@NotNull java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        java.lang.String tradeSymbol = null;
        if (bizInstrumentValueOf != null) {
            int i2 = wlaJM + 121;
            AubY = i2 % 128;
            if (i2 % 2 != 0) {
                bizInstrumentValueOf.getTradeSymbol();
                tradeSymbol.hashCode();
                throw null;
            }
            tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
            int i3 = AubY + 63;
            wlaJM = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) tradeSymbol)) {
            return OLrzqt(str);
        }
        int i5 = wlaJM + 73;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return super.AYXKKw(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV OLrzqt(@NotNull java.lang.String str) {
        java.lang.String displayQuoteSymbol;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentValueOf != null) {
            int i2 = AubY + 71;
            wlaJM = i2 % 128;
            int i3 = i2 % 2;
            displayQuoteSymbol = bizInstrumentValueOf.getDisplayQuoteSymbol();
            if (displayQuoteSymbol == null) {
                int i4 = wlaJM + 5;
                AubY = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 4;
                }
                displayQuoteSymbol = "";
            }
        }
        if (idxConfigAkhnZx != null) {
            java.lang.String quoteDig = idxConfigAkhnZx.getQuoteDig();
            if (quoteDig == null) {
                int i6 = wlaJM + 43;
                AubY = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } else {
                str2 = quoteDig;
            }
        }
        xMV xmvKWHzl = xmv.KWHzl(displayQuoteSymbol, str2);
        int i7 = wlaJM + 93;
        AubY = i7 % 128;
        int i8 = i7 % 2;
        return xmvKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v10 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String tradeSymbol;
        java.lang.String quoteDig;
        int i = 2 % 2;
        int i2 = AubY + 67;
        wlaJM = i2 % 128;
        java.lang.String str3 = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            int i3 = 47 / 0;
            if (bizInstrumentValueOf != null) {
                int i4 = AubY + 63;
                wlaJM = i4 % 128;
                int i5 = i4 % 2;
                tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
            } else {
                tradeSymbol = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            if (bizInstrumentValueOf != null) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) tradeSymbol)) {
            return AbstractC54531xLw.createSizeConverterWithIndex$default(this, str, null, 2, null);
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return OLrzqt(str);
        }
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        Intrinsics.copydefault((java.lang.Object) str2);
        if (idxConfigAkhnZx != null && (quoteDig = idxConfigAkhnZx.getQuoteDig()) != null) {
            str3 = quoteDig;
        }
        return xmv.KWHzl(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMV valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        java.lang.Object obj = null;
        if (idxConfigAkhnZx != null) {
            int i2 = AubY + 97;
            wlaJM = i2 % 128;
            if (i2 % 2 == 0) {
                idxConfigAkhnZx.getPositionDig();
                obj.hashCode();
                throw null;
            }
            java.lang.String positionDig = idxConfigAkhnZx.getPositionDig();
            if (positionDig != null) {
                str3 = positionDig;
            }
        }
        xMV xmvKWHzl = xmv.KWHzl(str2, str3);
        int i3 = AubY + 81;
        wlaJM = i3 % 128;
        if (i3 % 2 != 0) {
            return xmvKWHzl;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument DbNXlk(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 7;
        wlaJM = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return valueOf(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        valueOf(str);
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL(@NotNull java.lang.String str) {
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        java.lang.String baseDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getBaseDig() : null;
        if (baseDig == null || baseDig.length() == 0) {
            str2 = "8";
        } else if (idxConfigAkhnZx != null) {
            int i2 = wlaJM + 79;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String baseDig2 = idxConfigAkhnZx.getBaseDig();
            if (baseDig2 == null) {
                int i4 = wlaJM + 37;
                AubY = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            } else {
                str2 = baseDig2;
            }
        }
        int i6 = wlaJM + 81;
        AubY = i6 % 128;
        int i7 = i6 % 2;
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String fIwbmz(@NotNull java.lang.String str) {
        java.lang.String priceDig;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
        java.lang.Object obj = null;
        if (idxCcyConfigFetchVPNInfo != null) {
            int i2 = wlaJM + 17;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
        } else {
            int i4 = wlaJM + 41;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            priceDig = null;
        }
        if (priceDig == null || priceDig.length() == 0) {
            return "8";
        }
        if (idxCcyConfigFetchVPNInfo == null) {
            return "";
        }
        int i6 = AubY + 75;
        wlaJM = i6 % 128;
        if (i6 % 2 != 0) {
            java.lang.String priceDig2 = idxCcyConfigFetchVPNInfo.getPriceDig();
            return priceDig2 == null ? "" : priceDig2;
        }
        idxCcyConfigFetchVPNInfo.getPriceDig();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizInstrument isConnected(java.lang.String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = wlaJM + 55;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() == 0) {
                int i4 = wlaJM + 121;
                AubY = i4 % 128;
                int i5 = i4 % 2;
                str = "BTC";
            }
        }
        java.util.Iterator<T> it = zsXlph().iterator();
        BizInstrument bizInstrumentDbNXlk = null;
        while (!(!it.hasNext())) {
            for (java.lang.String str2 : ((ChargeGroupData) it.next()).getTypes()) {
                if (bizInstrumentDbNXlk == null) {
                    bizInstrumentDbNXlk = DbNXlk(str + "-" + str2);
                }
            }
        }
        return bizInstrumentDbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinLoanCheckBoxBean copydefault(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = AubY + 49;
        wlaJM = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CoinLoanCheckBoxBean coinLoanCheckBoxBean = this.uzCIH.get(str);
        int i4 = wlaJM + 73;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            return coinLoanCheckBoxBean;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkSpotBiz$ensureInitialized$2 okSpotBiz$ensureInitialized$2;
        Mutex mutexFIwbmz;
        xLL xll;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        Mutex mutex;
        int i = 2 % 2;
        int i2 = wlaJM + 73;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
            if (!(continuation instanceof OkSpotBiz$ensureInitialized$2)) {
                okSpotBiz$ensureInitialized$2 = new OkSpotBiz$ensureInitialized$2(this, continuation);
            } else {
                okSpotBiz$ensureInitialized$2 = (OkSpotBiz$ensureInitialized$2) continuation;
                int i4 = okSpotBiz$ensureInitialized$2.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    int i5 = wlaJM + 15;
                    AubY = i5 % 128;
                    if (i5 % 2 != 0) {
                        okSpotBiz$ensureInitialized$2.label = i4 - Integer.MIN_VALUE;
                    } else {
                        okSpotBiz$ensureInitialized$2.label = i4 - Integer.MIN_VALUE;
                    }
                }
            }
        } else if (continuation instanceof OkSpotBiz$ensureInitialized$2) {
        }
        java.lang.Object result = okSpotBiz$ensureInitialized$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = okSpotBiz$ensureInitialized$2.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(result);
            mutexFIwbmz = fIwbmz();
            okSpotBiz$ensureInitialized$2.L$0 = this;
            okSpotBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
            okSpotBiz$ensureInitialized$2.Z$0 = z;
            okSpotBiz$ensureInitialized$2.label = 1;
            if (mutexFIwbmz.lock(null, okSpotBiz$ensureInitialized$2) == objCopydefault) {
                return objCopydefault;
            }
            xll = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) okSpotBiz$ensureInitialized$2.L$1;
                try {
                    C56391yDq.AEQbTJ(result);
                    mutexFIwbmz = mutex;
                    objM7377constructorimpl = ((Result) result).m7386unboximpl();
                    mutexFIwbmz.unlock(null);
                    return objM7377constructorimpl;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    mutexFIwbmz = mutex;
                    mutexFIwbmz.unlock(null);
                    throw th;
                }
            }
            z = okSpotBiz$ensureInitialized$2.Z$0;
            mutexFIwbmz = (Mutex) okSpotBiz$ensureInitialized$2.L$1;
            xll = (xLL) okSpotBiz$ensureInitialized$2.L$0;
            C56391yDq.AEQbTJ(result);
        }
        if (!z) {
            try {
                if (xll.iwGUEr()) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(xll);
                    mutexFIwbmz.unlock(null);
                    return objM7377constructorimpl;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                mutexFIwbmz.unlock(null);
                throw th;
            }
        }
        okSpotBiz$ensureInitialized$2.L$0 = xll;
        okSpotBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
        okSpotBiz$ensureInitialized$2.L$2 = okSpotBiz$ensureInitialized$2;
        okSpotBiz$ensureInitialized$2.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(okSpotBiz$ensureInitialized$2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(xll.new Application());
        xll.AEQbTJ(true);
        copydefault(xll).OLrzqt(xll.new TaskDescription(new AtomicBoolean(), cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(okSpotBiz$ensureInitialized$2);
        }
        if (result == objCopydefault) {
            int i7 = wlaJM + 115;
            AubY = i7 % 128;
            int i8 = i7 % 2;
            return objCopydefault;
        }
        mutex = mutexFIwbmz;
        mutexFIwbmz = mutex;
        objM7377constructorimpl = ((Result) result).m7386unboximpl();
        mutexFIwbmz.unlock(null);
        return objM7377constructorimpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = 2 % 2;
        this.getFieldNames.AEQbTJ(new Function1() { // from class: o.xLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.KWHzl, (ResponseData) obj};
                int iKWHzl = C48199uIq.KWHzl();
                return (Unit) xLL.copydefault(C48199uIq.KWHzl(), C48199uIq.KWHzl(), iKWHzl, 1945829937, objArr, -1945829935, C48199uIq.KWHzl());
            }
        });
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        copydefault(this).copydefault(bizInstrument.getInstId(), new ActionBar(bizInstrument, new AtomicBoolean(), cancellableContinuationImpl, this));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            int i2 = wlaJM + 121;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            C56447yFs.copydefault(continuation);
        }
        int i4 = AubY + 11;
        wlaJM = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    private final void KWHzl(ResponseData<SpotLoaderInfo> responseData) {
        int iKWHzl = C48199uIq.KWHzl();
        int iKWHzl2 = C48199uIq.KWHzl();
        int iKWHzl3 = C48199uIq.KWHzl();
        copydefault(C48199uIq.KWHzl(), iKWHzl2, iKWHzl, 1436414968, new java.lang.Object[]{this, responseData}, -1436414967, iKWHzl3);
    }

    public static /* synthetic */ Unit EZpvd(xLL xll, Function1 function1, ResponseData responseData) {
        int iKWHzl = C48199uIq.KWHzl();
        int iKWHzl2 = C48199uIq.KWHzl();
        int iKWHzl3 = C48199uIq.KWHzl();
        return (Unit) copydefault(C48199uIq.KWHzl(), iKWHzl2, iKWHzl, -291748831, new java.lang.Object[]{xll, function1, responseData}, 291748834, iKWHzl3);
    }

    public static /* synthetic */ Unit KWHzl(xLL xll, ResponseData responseData) {
        int iKWHzl = C48199uIq.KWHzl();
        int iKWHzl2 = C48199uIq.KWHzl();
        int iKWHzl3 = C48199uIq.KWHzl();
        return (Unit) copydefault(C48199uIq.KWHzl(), iKWHzl2, iKWHzl, 497780161, new java.lang.Object[]{xll, responseData}, -497780161, iKWHzl3);
    }

    public static /* synthetic */ Unit AEQbTJ(xLL xll, ResponseData responseData) {
        int iKWHzl = C48199uIq.KWHzl();
        int iKWHzl2 = C48199uIq.KWHzl();
        int iKWHzl3 = C48199uIq.KWHzl();
        return (Unit) copydefault(C48199uIq.KWHzl(), iKWHzl2, iKWHzl, 1945829937, new java.lang.Object[]{xll, responseData}, -1945829935, iKWHzl3);
    }
}
