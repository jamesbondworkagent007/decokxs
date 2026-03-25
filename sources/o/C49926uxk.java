package o;

import androidx.databinding.ObservableField;
import com.okinc.biz.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.uxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49926uxk {
    public static final Application Companion = new Application(null);
    public static final ObservableField<TradeType> OLrzqt = new ObservableField<>();

    /* JADX INFO: renamed from: o.uxk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final ObservableField<TradeType> OLrzqt() {
            return C49926uxk.OLrzqt;
        }

        public final TradeType AEQbTJ() {
            TradeType tradeType = C49861uwY.Companion.copydefault().get();
            return tradeType == null ? OLrzqt().get() : tradeType;
        }
    }
}
