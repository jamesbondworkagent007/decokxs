package o;

import com.okinc.business.defi.biz.impl.WalletHttpClientServiceImpl$generateSignedHttpRequestConfig$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.json.JsonObject;
import o.C12827cuN;
import o.C13934dbu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZE implements xWK {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return true;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cZE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(JsonObject jsonObject, JsonObject jsonObject2, @NotNull java.lang.String str, @NotNull Continuation<? super C43280rmM> continuation) throws java.lang.Throwable {
        WalletHttpClientServiceImpl$generateSignedHttpRequestConfig$1 walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof WalletHttpClientServiceImpl$generateSignedHttpRequestConfig$1) {
            walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1 = (WalletHttpClientServiceImpl$generateSignedHttpRequestConfig$1) continuation;
            int i = walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1 = new WalletHttpClientServiceImpl$generateSignedHttpRequestConfig$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$0 = jsonObject;
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$1 = jsonObject2;
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$2 = str;
                walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$2;
                jsonObject2 = (JsonObject) walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$1;
                jsonObject = (JsonObject) walletHttpClientServiceImpl$generateSignedHttpRequestConfig$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletHttpClientService", "generateSignedHttpRequestConfig(" + jsonObject + ", " + jsonObject2 + ", " + str + ")", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        java.lang.String strAEQbTJ = jsonObject != null ? C13933dbt.AEQbTJ(jsonObject) : null;
        java.lang.String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
        java.lang.String strAEQbTJ2 = jsonObject2 != null ? C13933dbt.AEQbTJ(jsonObject2) : null;
        java.lang.String str3 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
        C13934dbu.StateListAnimator stateListAnimator = C13934dbu.Companion;
        java.lang.String strUSBtdM = abstractC12782ctV != null ? abstractC12782ctV.USBtdM() : null;
        java.lang.String str4 = strUSBtdM == null ? "" : strUSBtdM;
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        java.lang.String strEZpvd = stateListAnimator.EZpvd(str4, strDbNXlk == null ? "" : strDbNXlk, str2, str3, str);
        java.lang.String strDbNXlk2 = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        return new C11623cVc(strEZpvd, strDbNXlk2 != null ? strDbNXlk2 : "", str);
    }
}
