package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gOM extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<ExpireTimeConfig>>> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<ExpireTimeConfig>>> KWHzl() {
        return this.copydefault;
    }

    public abstract void copydefault();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gOM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
