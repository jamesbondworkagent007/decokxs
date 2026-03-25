package o;

import com.okinc.share.bean.MultiShareConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48907ueY extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.ufb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC48907ueY.AEQbTJ(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.ueY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ueY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull MultiShareConfig multiShareConfig, @NotNull androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("extra_multi_config", multiShareConfig);
            fragment.setArguments(bundle);
        }
    }

    public final C48974ufm copydefault() {
        return (C48974ufm) this.AEQbTJ.getValue();
    }

    public static final C48974ufm AEQbTJ(AbstractC48907ueY abstractC48907ueY) {
        return C48971ufj.KWHzl(abstractC48907ueY);
    }
}
