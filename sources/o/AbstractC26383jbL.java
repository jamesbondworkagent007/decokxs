package o;

import com.okinc.business.invest_biz.data.models.InvestHistoryBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26383jbL {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jbL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC26383jbL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jbL$TaskDescription */
    public static final class TaskDescription extends AbstractC26383jbL {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    private AbstractC26383jbL() {
    }

    /* JADX INFO: renamed from: o.jbL$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application extends AbstractC26383jbL {
        public final java.util.List<InvestHistoryBean> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<InvestHistoryBean> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.util.List<InvestHistoryBean> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }
    }

    /* JADX INFO: renamed from: o.jbL$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends AbstractC26383jbL {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.jbL$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar extends AbstractC26383jbL {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }
}
