package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.GetScanShareResponseBody;
import com.okinc.business.defi.wallet.mine.scan.viewmodel.MPCQrcodeViewMode$generateQrcodeContent$1;
import com.okinc.business.defi.wallet.mine.scan.viewmodel.MPCQrcodeViewMode$generateQrcodeContent$2;
import com.okinc.business.defi.wallet.mine.scan.viewmodel.MPCQrcodeViewMode$generateQrcodeContent$3;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.keypair.KeyPair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18856fqM extends AbstractC33073mpa {
    public KeyPair KWHzl;
    public int copydefault;
    public C13934dbu EZpvd = new C13934dbu();
    public final MutableLiveData<GetScanShareResponseBody> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<GetScanShareResponseBody> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyPair KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[PHI: r7
  0x007c: PHI (r7v9 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:25:0x0079, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        MPCQrcodeViewMode$generateQrcodeContent$1 mPCQrcodeViewMode$generateQrcodeContent$1;
        C18856fqM c18856fqM;
        C18856fqM c18856fqM2;
        if (continuation instanceof MPCQrcodeViewMode$generateQrcodeContent$1) {
            mPCQrcodeViewMode$generateQrcodeContent$1 = (MPCQrcodeViewMode$generateQrcodeContent$1) continuation;
            int i = mPCQrcodeViewMode$generateQrcodeContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mPCQrcodeViewMode$generateQrcodeContent$1.label = i - Integer.MIN_VALUE;
            } else {
                mPCQrcodeViewMode$generateQrcodeContent$1 = new MPCQrcodeViewMode$generateQrcodeContent$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mPCQrcodeViewMode$generateQrcodeContent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mPCQrcodeViewMode$generateQrcodeContent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (this.KWHzl == null) {
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                MPCQrcodeViewMode$generateQrcodeContent$2 mPCQrcodeViewMode$generateQrcodeContent$2 = new MPCQrcodeViewMode$generateQrcodeContent$2(null);
                mPCQrcodeViewMode$generateQrcodeContent$1.L$0 = this;
                mPCQrcodeViewMode$generateQrcodeContent$1.L$1 = this;
                mPCQrcodeViewMode$generateQrcodeContent$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, mPCQrcodeViewMode$generateQrcodeContent$2, mPCQrcodeViewMode$generateQrcodeContent$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c18856fqM2 = this;
                c18856fqM = c18856fqM2;
            } else {
                c18856fqM = this;
                CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
                MPCQrcodeViewMode$generateQrcodeContent$3 mPCQrcodeViewMode$generateQrcodeContent$3 = new MPCQrcodeViewMode$generateQrcodeContent$3(c18856fqM, null);
                mPCQrcodeViewMode$generateQrcodeContent$1.L$0 = null;
                mPCQrcodeViewMode$generateQrcodeContent$1.L$1 = null;
                mPCQrcodeViewMode$generateQrcodeContent$1.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, mPCQrcodeViewMode$generateQrcodeContent$3, mPCQrcodeViewMode$generateQrcodeContent$1);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18856fqM2 = (C18856fqM) mPCQrcodeViewMode$generateQrcodeContent$1.L$1;
            c18856fqM = (C18856fqM) mPCQrcodeViewMode$generateQrcodeContent$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        c18856fqM2.KWHzl = (KeyPair) objWithContext;
        CoroutineDispatcher coroutineDispatcher22 = Dispatchers.getDefault();
        MPCQrcodeViewMode$generateQrcodeContent$3 mPCQrcodeViewMode$generateQrcodeContent$32 = new MPCQrcodeViewMode$generateQrcodeContent$3(c18856fqM, null);
        mPCQrcodeViewMode$generateQrcodeContent$1.L$0 = null;
        mPCQrcodeViewMode$generateQrcodeContent$1.L$1 = null;
        mPCQrcodeViewMode$generateQrcodeContent$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher22, mPCQrcodeViewMode$generateQrcodeContent$32, mPCQrcodeViewMode$generateQrcodeContent$1);
        if (objWithContext != objCopydefault) {
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault() {
        KeyPair keyPair = this.KWHzl;
        if (keyPair != null) {
            AbstractC58185ywX<ResponseData<GetScanShareResponseBody>> abstractC58185ywXGEmmrt = this.EZpvd.gEmmrt(keyPair.getPubKey());
            final Function1 function1 = new Function1() { // from class: o.fqO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18856fqM.OLrzqt(this.KWHzl, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<GetScanShareResponseBody>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fqP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18856fqM.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.fqN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18856fqM.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
                }
            };
            call().AEQbTJ(abstractC58185ywXGEmmrt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fqQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18856fqM.OLrzqt(function12, obj);
                }
            }));
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C18856fqM c18856fqM, java.lang.Throwable th) {
        c18856fqM.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        int i = this.copydefault + 1;
        this.copydefault = i;
        if (i >= 5) {
            this.copydefault = 0;
            this.AEQbTJ.setValue(java.lang.Boolean.TRUE);
        }
    }

    public static final Unit OLrzqt(C18856fqM c18856fqM, ResponseData responseData) {
        GetScanShareResponseBody value;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c18856fqM.copydefault = 0;
            GetScanShareResponseBody getScanShareResponseBody = (GetScanShareResponseBody) responseData.getData();
            if (getScanShareResponseBody != null && ((value = c18856fqM.OLrzqt.getValue()) == null || value.getStatus() != 2)) {
                c18856fqM.OLrzqt.setValue(getScanShareResponseBody);
            }
        } else {
            c18856fqM.EZpvd();
        }
        return Unit.INSTANCE;
    }
}
