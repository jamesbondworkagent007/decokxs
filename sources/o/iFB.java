package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFB implements iFC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC35203nqr OLrzqt;

    @yCM
    public iFB(@NotNull InterfaceC35203nqr interfaceC35203nqr) {
        Intrinsics.checkNotNullParameter(interfaceC35203nqr, "");
        this.OLrzqt = interfaceC35203nqr;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.iFC
    public boolean copydefault() {
        return this.OLrzqt.AEQbTJ("defi_dashboard_v2");
    }
}
