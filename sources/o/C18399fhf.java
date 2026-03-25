package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.wallet.icloud.viewmodel.ICloudeViewModel$generateCloudBackupData$1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18399fhf extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.Integer> AEQbTJ;
    public final C12827cuN AhwBna;
    public final kotlinx.coroutines.channels.Channel<java.util.ArrayList<java.lang.Object>> EZpvd;
    public final CoroutineExceptionHandler KWHzl;
    public final MutableLiveData<java.lang.String> OLrzqt;
    public int copydefault;
    public java.util.List<java.lang.Integer> djBIcL;
    public final MutableLiveData<java.lang.Integer> gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18399fhf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12827cuN djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0007: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:27) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:27)) : (r1v0 o.cuN))
 A[MD:(o.cuN):void (m)] (LINE:27) call: o.fhf.<init>(o.cuN):void type: THIS */
    public /* synthetic */ C18399fhf(C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C18399fhf(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.AhwBna = c12827cuN;
        this.gEmmrt = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = 1;
        this.djBIcL = yDY.AhwBna();
        this.EZpvd = ChannelKt.Channel$default(0, null, null, 7, null);
        this.valueOf = C18399fhf.class.getName();
        this.KWHzl = new Activity(CoroutineExceptionHandler.Key, this);
    }

    public final Flow<java.util.ArrayList<java.lang.Object>> EZpvd() {
        return FlowKt.receiveAsFlow(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.fhf$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C18399fhf AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(CoroutineExceptionHandler.Key key, C18399fhf c18399fhf) {
            super(key);
            this.AEQbTJ = c18399fhf;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ(this.AEQbTJ.valueOf, th);
        }
    }

    public final void OLrzqt(FragmentActivity fragmentActivity) {
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        if (fragmentActivity == null) {
            return;
        }
        final java.lang.String strAEQbTJ = c14392dkb.AEQbTJ(fragmentActivity, this.copydefault);
        ((InterfaceC54838xXe) C43251rlk.copydefault(InterfaceC54838xXe.class)).OLrzqt(fragmentActivity, this.copydefault, new Function1() { // from class: o.fhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18399fhf.OLrzqt(this.copydefault, strAEQbTJ, (java.util.List) obj);
            }
        });
    }

    public static final Unit OLrzqt(C18399fhf c18399fhf, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c18399fhf.KWHzl(str, (java.util.List<HDWalletCloudBackupBean>) list);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.util.List<HDWalletCloudBackupBean> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new ICloudeViewModel$generateCloudBackupData$1(this, str, list, new java.util.ArrayList(), null), 2, null);
    }
}
