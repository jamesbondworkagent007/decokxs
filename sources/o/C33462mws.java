package o;

import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33462mws {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static C33462mws copydefault;
    public final C33453mwj OLrzqt;

    public C33462mws(@NotNull C33453mwj c33453mwj) {
        Intrinsics.checkNotNullParameter(c33453mwj, "");
        this.OLrzqt = c33453mwj;
    }

    public final androidx.fragment.app.Fragment copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        if (!AEQbTJ()) {
            return null;
        }
        C33371mvG c33371mvGAEQbTJ = C33371mvG.Companion.AEQbTJ(modeSwitchSourceEnum);
        c33371mvGAEQbTJ.show(fragmentManager);
        return c33371mvGAEQbTJ;
    }

    public final boolean AEQbTJ() {
        return this.OLrzqt.fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.mws$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mws.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C33462mws OLrzqt() {
            C33462mws c33462mws = C33462mws.copydefault;
            if (c33462mws == null) {
                synchronized (this) {
                    c33462mws = C33462mws.copydefault;
                    if (c33462mws == null) {
                        c33462mws = new C33462mws(C33453mwj.Companion.OLrzqt());
                        Application application = C33462mws.Companion;
                        C33462mws.copydefault = c33462mws;
                    }
                }
            }
            return c33462mws;
        }
    }
}
