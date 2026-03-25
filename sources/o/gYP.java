package o;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gYP {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gYP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ gYP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends gYP {
        public static final int EZpvd = AbstractC43419rot.$stable;
        public final AbstractC43419rot<V6QuoteResponseData, OKServerException> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gYP$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AbstractC43419rot abstractC43419rot, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC43419rot = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC43419rot<V6QuoteResponseData, OKServerException> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull AbstractC43419rot<V6QuoteResponseData, OKServerException> abstractC43419rot) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            return new ActionBar(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Quote(result=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC43419rot<V6QuoteResponseData, OKServerException> abstractC43419rot) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            this.KWHzl = abstractC43419rot;
        }
    }

    private gYP() {
    }

    public static final class Application extends gYP {
        public static final int KWHzl = AbstractC43419rot.$stable;
        public final AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gYP$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, AbstractC43419rot abstractC43419rot, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC43419rot = application.copydefault;
            }
            return application.OLrzqt(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> abstractC43419rot) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            return new Application(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuoteAndCalldata(result=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> abstractC43419rot) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            this.copydefault = abstractC43419rot;
        }
    }

    public static final class TaskDescription extends gYP {
        public static final int AEQbTJ = AbstractC43419rot.$stable;
        public final AbstractC43419rot<TokenPairRateQuote, OKServerException> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gYP$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, AbstractC43419rot abstractC43419rot, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC43419rot = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC43419rot<TokenPairRateQuote, OKServerException> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull AbstractC43419rot<TokenPairRateQuote, OKServerException> abstractC43419rot) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            return new TaskDescription(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Limit(result=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC43419rot<TokenPairRateQuote, OKServerException> abstractC43419rot) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            this.EZpvd = abstractC43419rot;
        }
    }
}
