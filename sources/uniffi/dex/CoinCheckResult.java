package uniffi.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C4147AzP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CoinCheckResult {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.dex.CoinCheckResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CoinCheckResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CoinCheckResult() {
    }

    public static final class ActionBar extends CoinCheckResult {
        public static final int $stable = 8;
        public final C4147AzP EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C4147AzP c4147AzP, int i, Object obj) {
            if ((i & 1) != 0) {
                c4147AzP = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(c4147AzP);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull C4147AzP c4147AzP) {
            Intrinsics.checkNotNullParameter(c4147AzP, "");
            return new ActionBar(c4147AzP);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C4147AzP OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(data=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C4147AzP c4147AzP) {
            super(null);
            Intrinsics.checkNotNullParameter(c4147AzP, "");
            this.EZpvd = c4147AzP;
        }
    }

    public static final class Activity extends CoinCheckResult {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }
}
