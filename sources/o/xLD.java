package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import com.okinc.unify_trade.trade.biz.OkMarginBiz$ensureInitialized$2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import o.xBZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class xLD extends AbstractC54531xLw {
    private static int getFieldNames = 1;
    private static int getNewProxyInstance;
    public java.util.HashMap<java.lang.String, BizInstrument> AuCTel;
    public java.util.ArrayList<BizInstrument> ejfBZ;
    public java.lang.String fIwbmz;
    public final java.util.HashMap<java.lang.String, TradeCoinInfo> fJNWhG;
    public java.util.HashMap<java.lang.String, IdxConfig> hDKMBd;
    public C54537xMa iwGUEr;
    public java.util.HashMap<java.lang.String, IdxCcyConfig> uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit KWHzl(xLD xld, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = getFieldNames + 29;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOLrzqt = OLrzqt(xld, responseData);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return unitOLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unit KWHzl(xLD xld, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = getFieldNames + 83;
        getNewProxyInstance = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            OLrzqt(xld, function1, responseData);
            throw null;
        }
        Unit unitOLrzqt = OLrzqt(xld, function1, responseData);
        int i3 = getFieldNames + 77;
        getNewProxyInstance = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOLrzqt;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object copydefault(int i, java.lang.Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i6 | i7 | (~i4);
        int i9 = ~i6;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i2 + i6 + i3 + ((-92689393) * i) + (1942122663 * i5);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i2) - 357761024) + ((-674687396) * i6) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i3) + ((-1056047104) * i) + ((-742522880) * i5) + ((-592117760) * i12);
        int i14 = (i2 * 1048061654) + 1366922925 + (i6 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i3 * 1048061961) + (i * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? EZpvd(objArr) : AEQbTJ(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxConfig> DbNXlk() {
        int i = 2 % 2;
        int i2 = getFieldNames + 123;
        int i3 = i2 % 128;
        getNewProxyInstance = i3;
        int i4 = i2 % 2;
        java.util.HashMap<java.lang.String, IdxConfig> map = this.hDKMBd;
        int i5 = i3 + 55;
        getFieldNames = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 53;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        int iCopydefault = C7461akK.copydefault();
        int iCopydefault2 = C7461akK.copydefault();
        java.lang.Object objCopydefault = copydefault(C7461akK.copydefault(), new java.lang.Object[]{this, bizInstrument, continuation}, 404063283, iCopydefault2, iCopydefault, C7461akK.copydefault(), -404063283);
        int i4 = getNewProxyInstance + 125;
        getFieldNames = i4 % 128;
        if (i4 % 2 != 0) {
            return objCopydefault;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = getFieldNames + 51;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object objCopydefault = copydefault(this, z, continuation);
        int i4 = getNewProxyInstance + 61;
        getFieldNames = i4 % 128;
        int i5 = i4 % 2;
        return objCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String copydefault(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = getFieldNames + 5;
        int i3 = i2 % 128;
        getNewProxyInstance = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        getFieldNames = i5 % 128;
        if (i5 % 2 != 0) {
            return "";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, BizInstrument> djBIcL() {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 49;
        getFieldNames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AuCTel;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String gEmmrt(BizInstrument bizInstrument) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 79;
        int i3 = i2 % 128;
        getFieldNames = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        getNewProxyInstance = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String isConnected() {
        int i = 2 % 2;
        int i2 = getNewProxyInstance;
        int i3 = i2 + 33;
        getFieldNames = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.fIwbmz;
        int i5 = i2 + 93;
        getFieldNames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.ArrayList<BizInstrument> valueOf() {
        int i = 2 % 2;
        int i2 = getFieldNames + 71;
        getNewProxyInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ejfBZ;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.util.HashMap<java.lang.String, IdxCcyConfig> values() {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 69;
        int i3 = i2 % 128;
        getFieldNames = i3;
        int i4 = i2 % 2;
        java.util.HashMap<java.lang.String, IdxCcyConfig> map = this.uzCIH;
        int i5 = i3 + 61;
        getNewProxyInstance = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xLD(@NotNull java.util.HashMap<java.lang.String, TradeCoinInfo> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
        this.fJNWhG = map;
        this.fIwbmz = "MARGIN";
        this.ejfBZ = new java.util.ArrayList<>();
        this.AuCTel = new java.util.HashMap<>();
        this.hDKMBd = new java.util.HashMap<>();
        this.uzCIH = new java.util.HashMap<>();
        this.iwGUEr = new C54537xMa();
    }

    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        xLD xld = (xLD) objArr[0];
        int i = 2 % 2;
        int i2 = getFieldNames + 123;
        int i3 = i2 % 128;
        getNewProxyInstance = i3;
        int i4 = i2 % 2;
        C54537xMa c54537xMa = xld.iwGUEr;
        int i5 = i3 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        getFieldNames = i5 % 128;
        if (i5 % 2 != 0) {
            return c54537xMa;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void EZpvd(xLD xld, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 47;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        xld.KWHzl((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
        int i4 = getNewProxyInstance + 15;
        getFieldNames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void OLrzqt(@NotNull MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Exception>> mutableLiveData, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        fJNWhG().add(mutableLiveData);
        if (!z) {
            int i2 = getFieldNames + 115;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
            if (!(!iwGUEr())) {
                int i4 = getNewProxyInstance + 121;
                getFieldNames = i4 % 128;
                if (i4 % 2 == 0) {
                    KWHzl(true, (java.lang.String) null);
                    return;
                } else {
                    KWHzl(true, (java.lang.String) null);
                    return;
                }
            }
        }
        if (zLjUOn()) {
            return;
        }
        AEQbTJ(true);
        this.iwGUEr.copydefault(new Function1() { // from class: o.xLG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLD.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(xLD xld, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 39;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseData, "");
        xld.AEQbTJ(false);
        if (responseData.getCode() == 0) {
            int i4 = getNewProxyInstance + 89;
            getFieldNames = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
                if (responseData.getData() != null) {
                    xld.KWHzl((ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>>) responseData);
                    xld.KWHzl(true, (java.lang.String) null);
                } else {
                    xld.KWHzl(false, responseData.getMsg());
                }
            } else if (responseData.getData() != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = getFieldNames + 51;
        getNewProxyInstance = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            xLD.this.AEQbTJ(false);
        }
    }

    public static final class TaskDescription implements Function1<ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>>, Unit> {
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
        public /* synthetic */ Unit invoke(ResponseData<kotlin.Pair<? extends java.util.List<? extends InstrumentInfo>, ? extends TradeConfigData>> responseData) {
            KWHzl(responseData);
            return Unit.INSTANCE;
        }

        public final void KWHzl(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            pUU.KWHzl("TradeInstrumentTask-OkMarginBiz", "----->> ensureInitialized refreshData");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                try {
                    xLD.EZpvd(xLD.this, responseData);
                    xLD.this.AEQbTJ(false);
                    xLD.this.KWHzl(true, (java.lang.String) null);
                    if (this.AEQbTJ.getAndSet(true)) {
                        return;
                    }
                    CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation = this.copydefault;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(xLD.this))));
                    return;
                } catch (java.lang.Throwable th) {
                    xLD.this.AEQbTJ(false);
                    throw th;
                }
            }
            xLD.this.AEQbTJ(false);
            xLD.this.KWHzl(false, responseData.getMsg());
            if (this.AEQbTJ.getAndSet(true)) {
                return;
            }
            CancellableContinuation<Result<? extends AbstractC54531xLw>> cancellableContinuation2 = this.copydefault;
            Result.Application application2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(responseData.getMsg()))))));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=5] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1
  0x0051: PHI (r1v17 com.okinc.unify_trade.biz.TradeConfigData) = (r1v16 com.okinc.unify_trade.biz.TradeConfigData), (r1v20 com.okinc.unify_trade.biz.TradeConfigData) binds: [B:14:0x004f, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(ResponseData<kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData>> responseData) {
        java.util.List<InstrumentInfo> first;
        java.util.ArrayList<IdxConfig> idxConfig;
        TradeConfigData second;
        TradeConfigData second2;
        int i = 2 % 2;
        int i2 = getFieldNames + 33;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data = responseData.getData();
        java.util.ArrayList<IdxCcyConfig> idxCcyConfig = null;
        if (data != null) {
            first = data.getFirst();
            int i4 = getFieldNames + 89;
            getNewProxyInstance = i4 % 128;
            int i5 = i4 % 2;
        } else {
            first = null;
        }
        OLrzqt(first);
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data2 = responseData.getData();
        if (data2 != null) {
            int i6 = getNewProxyInstance + 13;
            getFieldNames = i6 % 128;
            if (i6 % 2 == 0) {
                second2 = data2.getSecond();
                int i7 = 32 / 0;
                if (second2 != null) {
                    int i8 = getNewProxyInstance + 77;
                    getFieldNames = i8 % 128;
                    int i9 = i8 % 2;
                    idxConfig = second2.getIdxConfig();
                } else {
                    idxConfig = null;
                }
            } else {
                second2 = data2.getSecond();
                if (second2 != null) {
                }
            }
        }
        EZpvd(idxConfig);
        kotlin.Pair<java.util.List<InstrumentInfo>, TradeConfigData> data3 = responseData.getData();
        if (data3 != null && (second = data3.getSecond()) != null) {
            int i10 = getFieldNames + 89;
            getNewProxyInstance = i10 % 128;
            int i11 = i10 % 2;
            idxCcyConfig = second.getIdxCcyConfig();
        }
        AEQbTJ(idxCcyConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [123=5] */
    public final void OLrzqt(java.util.List<InstrumentInfo> list) {
        int i = 2 % 2;
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            int i2 = getFieldNames + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
            int i4 = getNewProxyInstance + 75;
            getFieldNames = i4 % 128;
            int i5 = i4 % 2;
            for (InstrumentInfo instrumentInfo : list) {
                int i6 = getFieldNames + 85;
                getNewProxyInstance = i6 % 128;
                int i7 = i6 % 2;
                SpotInstrument spotInstrumentEZpvd = xBZ.Companion.EZpvd(instrumentInfo);
                arrayList.add(spotInstrumentEZpvd);
                djBIcL().put(instrumentInfo.getInstId(), spotInstrumentEZpvd);
                valueOf(spotInstrumentEZpvd);
                AYXKKw(spotInstrumentEZpvd);
            }
        }
        OLrzqt(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 23;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AEQbTJ(bizInstrument.getInstId(), function1);
        int i4 = getFieldNames + 5;
        getNewProxyInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.iwGUEr.OLrzqt(str, new Function1() { // from class: o.xLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xLD.KWHzl(this.copydefault, function1, (ResponseData) obj);
            }
        });
        int i2 = getFieldNames + 55;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(xLD xld, Function1 function1, ResponseData responseData) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 101;
        getFieldNames = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseData, "");
            int i3 = 65 / 0;
            if (responseData.getCode() == 0) {
                int i4 = getFieldNames + 99;
                getNewProxyInstance = i4 % 128;
                if (i4 % 2 != 0) {
                    responseData.getData();
                    throw null;
                }
                if (responseData.getData() != null) {
                    xBZ.StateListAnimator stateListAnimator = xBZ.Companion;
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    SpotInstrument spotInstrumentEZpvd = stateListAnimator.EZpvd((InstrumentInfo) data);
                    xld.djBIcL().put(spotInstrumentEZpvd.getInstId(), spotInstrumentEZpvd);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0) {
            }
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            int i5 = getFieldNames + 39;
            getNewProxyInstance = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function1<ResponseData<InstrumentInfo>, Unit> {
        public final /* synthetic */ AtomicBoolean AEQbTJ;
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(AtomicBoolean atomicBoolean, CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.AEQbTJ = atomicBoolean;
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<InstrumentInfo> responseData) {
            OLrzqt(responseData);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(ResponseData<InstrumentInfo> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                xBZ.StateListAnimator stateListAnimator = xBZ.Companion;
                InstrumentInfo data = responseData.getData();
                Intrinsics.copydefault(data);
                SpotInstrument spotInstrumentEZpvd = stateListAnimator.EZpvd(data);
                xLD.this.djBIcL().put(spotInstrumentEZpvd.getInstId(), spotInstrumentEZpvd);
            }
            if (this.AEQbTJ.getAndSet(true)) {
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
        int i2 = getFieldNames + 115;
        getNewProxyInstance = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            super.KWHzl(arrayList);
            iwGUEr();
            throw null;
        }
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        if (iwGUEr()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            SpotInstrument spotInstrumentEZpvd = xBZ.Companion.EZpvd((InstrumentInfo) it.next());
            valueOf().add(spotInstrumentEZpvd);
            djBIcL().put(spotInstrumentEZpvd.getInstId(), spotInstrumentEZpvd);
        }
        int i3 = getNewProxyInstance + 13;
        getFieldNames = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String EZpvd(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        java.lang.String sign;
        int i = 2 % 2;
        java.lang.String quoteSymbol = null;
        if (bizInstrument == null) {
            return null;
        }
        java.util.HashMap<java.lang.String, TradeCoinInfo> map = this.fJNWhG;
        if (bizInstrument instanceof SpotInstrument) {
            int i2 = getFieldNames + 45;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
            spotInstrument = (SpotInstrument) bizInstrument;
        } else {
            spotInstrument = null;
        }
        if (spotInstrument != null) {
            quoteSymbol = spotInstrument.getQuoteSymbol();
            int i4 = getNewProxyInstance + 107;
            getFieldNames = i4 % 128;
            int i5 = i4 % 2;
        }
        TradeCoinInfo tradeCoinInfo = map.get(quoteSymbol);
        return (tradeCoinInfo == null || (sign = tradeCoinInfo.getSign()) == null) ? "" : sign;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        int i = 2 % 2;
        if (bizInstrument instanceof SpotInstrument) {
            int i2 = getNewProxyInstance + 9;
            getFieldNames = i2 % 128;
            spotInstrument = (SpotInstrument) bizInstrument;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
        } else {
            spotInstrument = null;
        }
        if (spotInstrument == null) {
            return null;
        }
        java.lang.String quoteSymbol = spotInstrument.getQuoteSymbol();
        int i4 = getNewProxyInstance + 43;
        getFieldNames = i4 % 128;
        int i5 = i4 % 2;
        return quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        int i = 2 % 2;
        java.lang.String sign = null;
        if (bizInstrument != null) {
            java.util.HashMap<java.lang.String, TradeCoinInfo> map = this.fJNWhG;
            if (bizInstrument instanceof SpotInstrument) {
                int i2 = getFieldNames + 39;
                getNewProxyInstance = i2 % 128;
                int i3 = i2 % 2;
                spotInstrument = (SpotInstrument) bizInstrument;
            } else {
                spotInstrument = null;
            }
            if (spotInstrument != null) {
                int i4 = getFieldNames + 89;
                getNewProxyInstance = i4 % 128;
                int i5 = i4 % 2;
                sign = spotInstrument.getTradeSymbol();
            }
            TradeCoinInfo tradeCoinInfo = map.get(sign);
            if (tradeCoinInfo == null || (sign = tradeCoinInfo.getSign()) == null) {
                sign = "";
            }
        }
        int i6 = getNewProxyInstance + 93;
        getFieldNames = i6 % 128;
        int i7 = i6 % 2;
        return sign;
    }

    @Override // o.AbstractC54531xLw
    public java.lang.String OLrzqt(BizInstrument bizInstrument) {
        SpotInstrument spotInstrument;
        int i = 2 % 2;
        if (bizInstrument instanceof SpotInstrument) {
            int i2 = getNewProxyInstance + 47;
            getFieldNames = i2 % 128;
            spotInstrument = (SpotInstrument) bizInstrument;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
        } else {
            int i4 = getNewProxyInstance + 63;
            getFieldNames = i4 % 128;
            int i5 = i4 % 2;
            spotInstrument = null;
        }
        if (spotInstrument != null) {
            return spotInstrument.getTradeSymbol();
        }
        return null;
    }

    public java.util.List<ChargeGroupData> zsXlph() {
        java.util.List<ChargeGroupData> listAhwBna;
        int i = 2 % 2;
        int i2 = getFieldNames + 25;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (listAhwBna = interfaceC54581xNrOLrzqt.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        int i4 = getFieldNames + 99;
        getNewProxyInstance = i4 % 128;
        int i5 = i4 % 2;
        return listAhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMS gEmmrt(@NotNull java.lang.String str) {
        java.lang.String ccyName;
        java.lang.String ccySign;
        java.lang.String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        xMT xmt = new xMT();
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
        if (idxCcyConfigFetchVPNInfo != null) {
            int i2 = getNewProxyInstance + 19;
            getFieldNames = i2 % 128;
            int i3 = i2 % 2;
            ccyName = idxCcyConfigFetchVPNInfo.getCcyName();
            if (ccyName == null) {
                ccyName = "";
            }
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            int i4 = getFieldNames + 9;
            getNewProxyInstance = i4 % 128;
            if (i4 % 2 != 0) {
                idxCcyConfigFetchVPNInfo.getCcySign();
                throw null;
            }
            ccySign = idxCcyConfigFetchVPNInfo.getCcySign();
            if (ccySign == null) {
                ccySign = "";
            }
        }
        if (idxCcyConfigFetchVPNInfo != null) {
            int i5 = getNewProxyInstance + 65;
            getFieldNames = i5 % 128;
            int i6 = i5 % 2;
            java.lang.String priceDig = idxCcyConfigFetchVPNInfo.getPriceDig();
            if (priceDig == null) {
                int i7 = getFieldNames + 43;
                getNewProxyInstance = i7 % 128;
                int i8 = i7 % 2;
            } else {
                str2 = priceDig;
            }
        }
        return xmt.OLrzqt(ccyName, ccySign, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMS AYXKKw(@NotNull java.lang.String str) {
        xMS xmsGEmmrt;
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 17;
        getFieldNames = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            xmsGEmmrt = gEmmrt(str);
            int i3 = 38 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            xmsGEmmrt = gEmmrt(str);
        }
        int i4 = getFieldNames + 107;
        getNewProxyInstance = i4 % 128;
        int i5 = i4 % 2;
        return xmsGEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AhwBna(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String tradeSymbol;
        java.lang.String baseDig;
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentDbNXlk = DbNXlk(str);
        IdxConfig idxConfig = DbNXlk().get(str);
        if (str2 != null) {
            int i2 = getFieldNames + 19;
            getNewProxyInstance = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (bizInstrumentDbNXlk != null ? bizInstrumentDbNXlk.getTradeSymbol() : null))) {
                return EZpvd(str);
            }
        }
        if (bizInstrumentDbNXlk != null) {
            int i3 = getNewProxyInstance + 125;
            getFieldNames = i3 % 128;
            if (i3 % 2 == 0) {
                tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol();
                int i4 = 27 / 0;
                if (tradeSymbol == null) {
                    int i5 = getNewProxyInstance + 55;
                    getFieldNames = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 3 % 3;
                    }
                    tradeSymbol = "";
                }
            } else {
                tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol();
                if (tradeSymbol == null) {
                }
            }
        }
        if (idxConfig != null && (baseDig = idxConfig.getBaseDig()) != null) {
            str3 = baseDig;
        }
        return new xMY(tradeSymbol, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r5
  0x003b: PHI (r5v12 com.okinc.unify_trade.biz.IdxConfig) = 
  (r5v2 com.okinc.unify_trade.biz.IdxConfig)
  (r5v3 com.okinc.unify_trade.biz.IdxConfig)
  (r5v14 com.okinc.unify_trade.biz.IdxConfig)
 binds: [B:8:0x0033, B:10:0x0039, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r5
  0x0035: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v9 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v3 com.okinc.unify_trade.biz.IdxConfig) = (r5v2 com.okinc.unify_trade.biz.IdxConfig), (r5v14 com.okinc.unify_trade.biz.IdxConfig) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C54571xNh EZpvd(java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        IdxConfig idxConfig;
        java.lang.String quoteSymbol;
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 77;
        getFieldNames = i2 % 128;
        java.lang.String str2 = "";
        if (i2 % 2 == 0) {
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfig = DbNXlk().get(str);
            int i3 = 36 / 0;
            if (bizInstrumentDbNXlk != null) {
                quoteSymbol = bizInstrumentDbNXlk.getQuoteSymbol();
                if (quoteSymbol == null) {
                    quoteSymbol = "";
                }
            }
        } else {
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfig = DbNXlk().get(str);
            if (bizInstrumentDbNXlk != null) {
            }
        }
        if (idxConfig != null) {
            java.lang.String quoteDig = idxConfig.getQuoteDig();
            if (quoteDig == null) {
                int i4 = getFieldNames + 77;
                getNewProxyInstance = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 38 / 0;
                }
            } else {
                str2 = quoteDig;
            }
        }
        return new xMY(quoteSymbol, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[PHI: r7
  0x0040: PHI (r7v9 com.okinc.unify_trade.biz.IdxConfig) = 
  (r7v2 com.okinc.unify_trade.biz.IdxConfig)
  (r7v3 com.okinc.unify_trade.biz.IdxConfig)
  (r7v11 com.okinc.unify_trade.biz.IdxConfig)
 binds: [B:8:0x0038, B:10:0x003e, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[PHI: r7
  0x0079: PHI (r7v7 java.lang.String) = (r7v5 java.lang.String), (r7v8 java.lang.String) binds: [B:27:0x0076, B:23:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r7
  0x003a: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v9 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r7v3 com.okinc.unify_trade.biz.IdxConfig) = (r7v2 com.okinc.unify_trade.biz.IdxConfig), (r7v11 com.okinc.unify_trade.biz.IdxConfig) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54571xNh AEQbTJ(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentDbNXlk;
        IdxConfig idxConfig;
        java.lang.String tradeSymbol;
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 1;
        getFieldNames = i2 % 128;
        java.lang.String str2 = "";
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfig = DbNXlk().get(str);
            int i3 = 4 / 0;
            if (bizInstrumentDbNXlk != null) {
                tradeSymbol = bizInstrumentDbNXlk.getTradeSymbol();
                if (tradeSymbol == null) {
                    tradeSymbol = "";
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentDbNXlk = DbNXlk(str);
            idxConfig = DbNXlk().get(str);
            if (bizInstrumentDbNXlk != null) {
            }
        }
        java.lang.String baseDigDisplay = null;
        if (idxConfig != null) {
            int i4 = getFieldNames + 59;
            getNewProxyInstance = i4 % 128;
            if (i4 % 2 != 0) {
                idxConfig.getBaseDigDisplay();
                throw null;
            }
            baseDigDisplay = idxConfig.getBaseDigDisplay();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) baseDigDisplay)) {
            if (idxConfig != null) {
                int i5 = getFieldNames + 35;
                getNewProxyInstance = i5 % 128;
                int i6 = i5 % 2;
                java.lang.String baseDig = idxConfig.getBaseDigDisplay();
                if (baseDig != null) {
                    str2 = baseDig;
                }
            }
        } else if (idxConfig != null && (baseDig = idxConfig.getBaseDig()) != null) {
        }
        return new xMY(tradeSymbol, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public xMV KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = getFieldNames + 21;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        if (str2 != null) {
            int i4 = getNewProxyInstance + 71;
            getFieldNames = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (bizInstrumentValueOf != null ? bizInstrumentValueOf.getTradeSymbol() : null))) {
                return copydefault(str);
            }
        }
        xMV xmvKWHzl = super.KWHzl(str, str2);
        int i5 = getFieldNames + 17;
        getNewProxyInstance = i5 % 128;
        int i6 = i5 % 2;
        return xmvKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV copydefault(@NotNull java.lang.String str) {
        java.lang.String quoteSymbol;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentValueOf != null) {
            int i2 = getNewProxyInstance + 81;
            getFieldNames = i2 % 128;
            int i3 = i2 % 2;
            quoteSymbol = bizInstrumentValueOf.getQuoteSymbol();
            if (quoteSymbol == null) {
                int i4 = getNewProxyInstance + 49;
                getFieldNames = i4 % 128;
                int i5 = i4 % 2;
                quoteSymbol = "";
            }
        }
        if (idxConfigAkhnZx != null) {
            int i6 = getFieldNames + 59;
            getNewProxyInstance = i6 % 128;
            if (i6 % 2 != 0) {
                idxConfigAkhnZx.getQuoteFeeDig();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            java.lang.String quoteFeeDig = idxConfigAkhnZx.getQuoteFeeDig();
            if (quoteFeeDig != null) {
                str2 = quoteFeeDig;
            }
        }
        xmv.KWHzl(quoteSymbol, str2);
        int i7 = getNewProxyInstance + 55;
        getFieldNames = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 57 / 0;
        }
        return xmv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v7 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AYXKKw(@NotNull java.lang.String str, java.lang.String str2) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String tradeSymbol;
        int i = 2 % 2;
        int i2 = getFieldNames + 69;
        getNewProxyInstance = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            int i3 = 48 / 0;
            if (str2 != null) {
                int i4 = getFieldNames + 43;
                int i5 = i4 % 128;
                getNewProxyInstance = i5;
                int i6 = i4 % 2;
                if (bizInstrumentValueOf != null) {
                    tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
                } else {
                    int i7 = i5 + 3;
                    getFieldNames = i7 % 128;
                    int i8 = i7 % 2;
                    tradeSymbol = null;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) tradeSymbol)) {
                    return OLrzqt(str);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            if (str2 != null) {
            }
        }
        return super.AYXKKw(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMV OLrzqt(@NotNull java.lang.String str) {
        java.lang.String quoteSymbol;
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentValueOf = valueOf(str);
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (bizInstrumentValueOf == null || (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        if (idxConfigAkhnZx != null) {
            int i2 = getNewProxyInstance + 109;
            getFieldNames = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String quoteDig = idxConfigAkhnZx.getQuoteDig();
            if (quoteDig == null) {
                int i4 = getNewProxyInstance + 33;
                getFieldNames = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str2 = quoteDig;
            }
        }
        return xmv.KWHzl(quoteSymbol, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v5 com.okinc.unify_trade.biz.BizInstrument) = (r1v4 com.okinc.unify_trade.biz.BizInstrument), (r1v10 com.okinc.unify_trade.biz.BizInstrument) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xMV AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        BizInstrument bizInstrumentValueOf;
        int i = 2 % 2;
        int i2 = getFieldNames + 61;
        getNewProxyInstance = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            int i3 = 52 / 0;
            if (str2 != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (bizInstrumentValueOf != null ? bizInstrumentValueOf.getTradeSymbol() : null))) {
                    xMV xmvOLrzqt = OLrzqt(str);
                    int i4 = getNewProxyInstance + 5;
                    getFieldNames = i4 % 128;
                    int i5 = i4 % 2;
                    return xmvOLrzqt;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            bizInstrumentValueOf = valueOf(str);
            if (str2 != null) {
            }
        }
        return AbstractC54531xLw.createSizeConverterWithIndex$default(this, str, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMV valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        xMV xmv = new xMV();
        if (idxConfigAkhnZx != null) {
            int i2 = getNewProxyInstance + 75;
            getFieldNames = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String positionDig = idxConfigAkhnZx.getPositionDig();
            if (positionDig != null) {
                str3 = positionDig;
            }
        }
        xMV xmvKWHzl = xmv.KWHzl(str2, str3);
        int i4 = getFieldNames + 43;
        getNewProxyInstance = i4 % 128;
        int i5 = i4 % 2;
        return xmvKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMY DbNXlk(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String positionDig;
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 101;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        if (idxConfigAkhnZx == null || (positionDig = idxConfigAkhnZx.getPositionDig()) == null) {
            int i4 = getNewProxyInstance + 39;
            getFieldNames = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str3 = positionDig;
        }
        return new xMY(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public BizInstrument DbNXlk(@NotNull java.lang.String str) {
        int i = 2 % 2;
        int i2 = getNewProxyInstance + 125;
        getFieldNames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrument = djBIcL().get(str);
        int i4 = getNewProxyInstance + 43;
        getFieldNames = i4 % 128;
        if (i4 % 2 != 0) {
            return bizInstrument;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String fIwbmz(@NotNull java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        IdxCcyConfig idxCcyConfigFetchVPNInfo = fetchVPNInfo(str);
        java.lang.Object obj = null;
        java.lang.String priceDig = idxCcyConfigFetchVPNInfo != null ? idxCcyConfigFetchVPNInfo.getPriceDig() : null;
        if (priceDig == null || priceDig.length() == 0) {
            str2 = "8";
        } else if (idxCcyConfigFetchVPNInfo != null) {
            int i2 = getFieldNames + 71;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String priceDig2 = idxCcyConfigFetchVPNInfo.getPriceDig();
            if (priceDig2 != null) {
                str2 = priceDig2;
            }
        }
        int i4 = getFieldNames + 71;
        getNewProxyInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC54531xLw
    public java.lang.String djBIcL(@NotNull java.lang.String str) {
        java.lang.String baseDig;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IdxConfig idxConfigAkhnZx = AkhnZx(str);
        java.lang.String baseDig2 = idxConfigAkhnZx != null ? idxConfigAkhnZx.getBaseDig() : null;
        if (baseDig2 != null) {
            if (baseDig2.length() != 0) {
                return (idxConfigAkhnZx == null || (baseDig = idxConfigAkhnZx.getBaseDig()) == null) ? "" : baseDig;
            }
            int i2 = getFieldNames + 41;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = getFieldNames + 35;
        getNewProxyInstance = i4 % 128;
        int i5 = i4 % 2;
        return "8";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean getFieldNames() {
        java.lang.String strWlaJM;
        int i = 2 % 2;
        int i2 = getFieldNames + 43;
        getNewProxyInstance = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            int i4 = getFieldNames + 109;
            getNewProxyInstance = i4 % 128;
            if (i4 % 2 != 0) {
                interfaceC54581xNrOLrzqt.getNewProxyInstance();
                throw null;
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            strWlaJM = newProxyInstance != null ? newProxyInstance.wlaJM() : null;
        }
        boolean zCopydefault = C33129mqd.copydefault(strWlaJM, "2");
        int i5 = getFieldNames + 77;
        getNewProxyInstance = i5 % 128;
        if (i5 % 2 == 0) {
            return zCopydefault;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [417=5] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // o.AbstractC54531xLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BizInstrument isConnected(java.lang.String str) {
        int i = 2 % 2;
        BizInstrument bizInstrumentDbNXlk = null;
        if (str != null) {
            int i2 = getNewProxyInstance + 125;
            getFieldNames = i2 % 128;
            if (i2 % 2 == 0) {
                str.length();
                bizInstrumentDbNXlk.hashCode();
                throw null;
            }
            if (str.length() == 0) {
                str = "BTC";
            }
        }
        java.util.Iterator<T> it = zsXlph().iterator();
        int i3 = getFieldNames + 9;
        getNewProxyInstance = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = getNewProxyInstance + 67;
            getFieldNames = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getNewProxyInstance + 89;
            getFieldNames = i7 % 128;
            int i8 = i7 % 2;
            for (java.lang.String str2 : ((ChargeGroupData) it.next()).getTypes()) {
                if (bizInstrumentDbNXlk == null) {
                    bizInstrumentDbNXlk = DbNXlk(str + "-" + str2);
                }
            }
        }
        return bizInstrumentDbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(xLD xld, boolean z, Continuation<? super Result<? extends AbstractC54531xLw>> continuation) throws java.lang.Throwable {
        OkMarginBiz$ensureInitialized$2 okMarginBiz$ensureInitialized$2;
        Mutex mutexFIwbmz;
        boolean z2;
        java.lang.Object objM7377constructorimpl;
        Mutex mutex;
        xLD xld2 = xld;
        int i = 2 % 2;
        if (!(!(continuation instanceof OkMarginBiz$ensureInitialized$2))) {
            int i2 = getFieldNames + 33;
            getNewProxyInstance = i2 % 128;
            int i3 = i2 % 2;
            okMarginBiz$ensureInitialized$2 = (OkMarginBiz$ensureInitialized$2) continuation;
            int i4 = okMarginBiz$ensureInitialized$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                okMarginBiz$ensureInitialized$2.label = i4 - Integer.MIN_VALUE;
            } else {
                okMarginBiz$ensureInitialized$2 = new OkMarginBiz$ensureInitialized$2(xld, continuation);
            }
        }
        java.lang.Object result = okMarginBiz$ensureInitialized$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = okMarginBiz$ensureInitialized$2.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(result);
            mutexFIwbmz = xld.fIwbmz();
            okMarginBiz$ensureInitialized$2.L$0 = xld2;
            okMarginBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
            z2 = z;
            okMarginBiz$ensureInitialized$2.Z$0 = z2;
            okMarginBiz$ensureInitialized$2.label = 1;
            if (mutexFIwbmz.lock(null, okMarginBiz$ensureInitialized$2) == objCopydefault) {
                int i6 = getNewProxyInstance + 85;
                getFieldNames = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 58 / 0;
                }
                return objCopydefault;
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) okMarginBiz$ensureInitialized$2.L$1;
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
            boolean z3 = okMarginBiz$ensureInitialized$2.Z$0;
            mutexFIwbmz = (Mutex) okMarginBiz$ensureInitialized$2.L$1;
            xLD xld3 = (xLD) okMarginBiz$ensureInitialized$2.L$0;
            C56391yDq.AEQbTJ(result);
            z2 = z3;
            xld2 = xld3;
        }
        if (!z2) {
            try {
                if (xld2.iwGUEr()) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(xld2);
                    mutexFIwbmz.unlock(null);
                    return objM7377constructorimpl;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                mutexFIwbmz.unlock(null);
                throw th;
            }
        }
        okMarginBiz$ensureInitialized$2.L$0 = xld2;
        okMarginBiz$ensureInitialized$2.L$1 = mutexFIwbmz;
        okMarginBiz$ensureInitialized$2.L$2 = okMarginBiz$ensureInitialized$2;
        okMarginBiz$ensureInitialized$2.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(okMarginBiz$ensureInitialized$2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(xld2.new ActionBar());
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        xld2.AEQbTJ(true);
        int iCopydefault = C7461akK.copydefault();
        ((C54537xMa) copydefault(C7461akK.copydefault(), new java.lang.Object[]{xld2}, 1149756605, C7461akK.copydefault(), iCopydefault, C7461akK.copydefault(), -1149756604)).copydefault(xld2.new TaskDescription(atomicBoolean, cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(okMarginBiz$ensureInitialized$2);
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

    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        xLD xld = (xLD) objArr[0];
        BizInstrument bizInstrument = (BizInstrument) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int iCopydefault = C7461akK.copydefault();
        int iCopydefault2 = C7461akK.copydefault();
        ((C54537xMa) copydefault(C7461akK.copydefault(), new java.lang.Object[]{xld}, 1149756605, iCopydefault2, iCopydefault, C7461akK.copydefault(), -1149756604)).OLrzqt(bizInstrument.getInstId(), xld.new Activity(atomicBoolean, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            int i2 = getNewProxyInstance + 13;
            getFieldNames = i2 % 128;
            int i3 = i2 % 2;
            C56447yFs.copydefault(continuation);
        }
        int i4 = getFieldNames + 69;
        getNewProxyInstance = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    public static /* synthetic */ java.lang.Object KWHzl(xLD xld, BizInstrument bizInstrument, Continuation<? super java.lang.Boolean> continuation) {
        int iCopydefault = C7461akK.copydefault();
        int iCopydefault2 = C7461akK.copydefault();
        return copydefault(C7461akK.copydefault(), new java.lang.Object[]{xld, bizInstrument, continuation}, 404063283, iCopydefault2, iCopydefault, C7461akK.copydefault(), -404063283);
    }

    public static final /* synthetic */ C54537xMa OLrzqt(xLD xld) {
        int iCopydefault = C7461akK.copydefault();
        int iCopydefault2 = C7461akK.copydefault();
        return (C54537xMa) copydefault(C7461akK.copydefault(), new java.lang.Object[]{xld}, 1149756605, iCopydefault2, iCopydefault, C7461akK.copydefault(), -1149756604);
    }
}
