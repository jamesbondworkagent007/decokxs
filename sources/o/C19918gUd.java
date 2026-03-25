package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19918gUd extends gOM {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC22502hga EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19918gUd() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:o.hga:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.hga:0x000c: INVOKE 
  (wrap:o.heE:0x0008: INVOKE (wrap:o.heK:0x0004: SGET  A[WRAPPED] (LINE:16) o.heK.OLrzqt o.heK), ("default_trade") VIRTUAL call: o.heK.copydefault(java.lang.String):o.heE A[MD:(java.lang.String):o.heE (m), WRAPPED] (LINE:16))
 VIRTUAL call: o.heE.AhwBna():o.hga A[MD:():o.hga (m), WRAPPED] (LINE:16)) : (r1v0 o.hga))
 A[MD:(o.hga):void (m)] (LINE:14) call: o.gUd.<init>(o.hga):void type: THIS */
    public /* synthetic */ C19918gUd(InterfaceC22502hga interfaceC22502hga, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C22380heK.OLrzqt.copydefault("default_trade").AhwBna() : interfaceC22502hga);
    }

    /* JADX INFO: renamed from: o.gUd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C19918gUd(@NotNull InterfaceC22502hga interfaceC22502hga) {
        Intrinsics.checkNotNullParameter(interfaceC22502hga, "");
        this.EZpvd = interfaceC22502hga;
    }

    @Override // o.gOM
    public void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1(this, null), 3, null);
    }
}
