package o;

import aws.smithy.kotlin.runtime.http.engine.AlpnId;
import aws.smithy.kotlin.runtime.net.TlsVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AC {
    public static final Application KWHzl = new Application(null);
    public static final AC copydefault = new AC(new ActionBar());
    public final TlsVersion EZpvd;
    public final java.util.List<AlpnId> OLrzqt;

    public static final class ActionBar {
        public java.util.List<? extends AlpnId> AEQbTJ = yDY.AhwBna();
        public TlsVersion KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TlsVersion KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends aws.smithy.kotlin.runtime.http.engine.AlpnId>, java.util.List<aws.smithy.kotlin.runtime.http.engine.AlpnId> */
        public final java.util.List<AlpnId> copydefault() {
            return this.AEQbTJ;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AlpnId> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TlsVersion EZpvd() {
        return this.EZpvd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AC EZpvd() {
            return AC.copydefault;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zf.resolve$default(o.zi, o.HM, int, java.lang.Object):java.lang.Object */
    public AC(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.OLrzqt = actionBar.copydefault();
        TlsVersion tlsVersionKWHzl = actionBar.KWHzl();
        this.EZpvd = tlsVersionKWHzl == null ? (TlsVersion) C59333zf.resolve$default(C57525yk.copydefault.AEQbTJ(), null, 1, null) : tlsVersionKWHzl;
    }
}
