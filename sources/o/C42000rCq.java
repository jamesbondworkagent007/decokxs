package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.extension.bean.TestAccountData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.rCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42000rCq extends AbstractC33073mpa {
    public MutableLiveData<ResponseData<TestAccountData>> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ResponseData<TestAccountData>> AEQbTJ() {
        return this.EZpvd;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl() {
        AbstractC58185ywX abstractC58185ywXCopydefault = C46515tXe.copydefault(InterfaceC42001rCr.Companion.EZpvd().KWHzl());
        final Function1 function1 = new Function1() { // from class: o.rCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42000rCq.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C42000rCq.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42000rCq.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C42000rCq.KWHzl(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(C42000rCq c42000rCq, ResponseData responseData) {
        c42000rCq.EZpvd.setValue(responseData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
