package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30627lei implements InterfaceC30628lej {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final AdvancedMainFragment AEQbTJ;
    public final C52812wZg OLrzqt;
    public final java.util.Map<java.lang.Integer, C52812wZg.StateListAnimator> copydefault;

    public C30627lei(@NotNull AdvancedMainFragment advancedMainFragment) {
        Intrinsics.checkNotNullParameter(advancedMainFragment, "");
        this.AEQbTJ = advancedMainFragment;
        FragmentActivity fragmentActivityRequireActivity = advancedMainFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.OLrzqt = new C52812wZg(fragmentActivityRequireActivity);
        this.copydefault = new LinkedHashMap();
    }

    @Override // o.InterfaceC30628lej
    public void AYXKKw() {
        this.OLrzqt.KWHzl();
    }

    /* JADX INFO: renamed from: o.lei$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lei.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
