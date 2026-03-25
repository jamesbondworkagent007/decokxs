package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_search.viewmodel.OrbitersActivityViewModel$loadData$1;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46097tHs extends ViewModel {
    public final InterfaceC46090tHl AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean EZpvd;
    public final MutableLiveData<C47655tuH> KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46097tHs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C47655tuH> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tHl:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tHl:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:15) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.QIZEnU():o.tHl A[MD:():o.tHl (m), WRAPPED] (LINE:15)) : (r1v0 o.tHl))
 A[MD:(o.tHl):void (m)] (LINE:14) call: o.tHs.<init>(o.tHl):void type: THIS */
    public /* synthetic */ C46097tHs(InterfaceC46090tHl interfaceC46090tHl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.QIZEnU() : interfaceC46090tHl);
    }

    public C46097tHs(@NotNull InterfaceC46090tHl interfaceC46090tHl) {
        Intrinsics.checkNotNullParameter(interfaceC46090tHl, "");
        this.AEQbTJ = interfaceC46090tHl;
        this.KWHzl = new MutableLiveData<>();
        this.copydefault = 20;
        this.AYXKKw = "";
    }

    public static /* synthetic */ void loadData$default(C46097tHs c46097tHs, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c46097tHs.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.KWHzl.setValue(new C47655tuH(StatefulView.Status.Loading, yDY.AhwBna(), false, true, null));
            this.EZpvd = false;
            this.OLrzqt = null;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrbitersActivityViewModel$loadData$1(this, z, null), 3, null);
    }
}
