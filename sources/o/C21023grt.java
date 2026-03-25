package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21023grt extends C20816gny {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.grt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C21023grt KWHzl(android.os.Bundle bundle) {
            C21023grt c21023grt = new C21023grt();
            c21023grt.setArguments(bundle);
            return c21023grt;
        }
    }

    @Override // o.C20816gny, o.AbstractC20799gnh
    public void copydefault(@NotNull C20863gos c20863gos) {
        Intrinsics.checkNotNullParameter(c20863gos, "");
        super.copydefault(c20863gos);
        valueOf().fetchVPNInfo.setVisibility(8);
        valueOf().DbNXlk.setVisibility(8);
        valueOf().AEQbTJ.setVisibility(8);
    }
}
