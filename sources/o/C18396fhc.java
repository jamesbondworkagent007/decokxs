package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import com.okinc.business.defi.wallet.icloud.viewmodel.CloudBackupNetworkListViewModel$getItemDataList$1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18396fhc extends AbstractC33073mpa {
    public final java.lang.String AEQbTJ;
    public final C10948byA EZpvd;
    public final kotlinx.coroutines.channels.Channel<java.util.ArrayList<java.lang.Object>> OLrzqt;
    public final CoroutineExceptionHandler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18396fhc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10948byA OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0006: INVOKE (wrap:o.byG:0x0004: SGET  A[WRAPPED] (LINE:21) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:21)) : (r1v0 o.byA))
 A[MD:(o.byA):void (m)] (LINE:20) call: o.fhc.<init>(o.byA):void type: THIS */
    public /* synthetic */ C18396fhc(C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    public C18396fhc(@NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.EZpvd = c10948byA;
        this.OLrzqt = ChannelKt.Channel$default(0, null, null, 7, null);
        this.AEQbTJ = C18396fhc.class.getName();
        this.copydefault = new StateListAnimator(CoroutineExceptionHandler.Key, this);
    }

    public final Flow<java.util.ArrayList<java.lang.Object>> KWHzl() {
        return FlowKt.receiveAsFlow(this.OLrzqt);
    }

    public final void EZpvd(@NotNull java.util.List<HDWalletBackupAddressBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new CloudBackupNetworkListViewModel$getItemDataList$1(list, new java.util.ArrayList(), this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.fhc$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C18396fhc OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(CoroutineExceptionHandler.Key key, C18396fhc c18396fhc) {
            super(key);
            this.OLrzqt = c18396fhc;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ(this.OLrzqt.AEQbTJ, th);
        }
    }
}
