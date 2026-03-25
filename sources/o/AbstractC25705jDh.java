package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25705jDh {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDh.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC25705jDh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jDh$ActionBar */
    public static final class ActionBar extends AbstractC25705jDh {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC25705jDh() {
    }

    /* JADX INFO: renamed from: o.jDh$StateListAnimator */
    public static final class StateListAnimator extends AbstractC25705jDh {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.jDh$Fragment */
    public static final class Fragment extends AbstractC25705jDh {
        public final java.util.List<LeaderBoardFilterModel> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<LeaderBoardFilterModel> KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.util.List<LeaderBoardFilterModel> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.jDh$Application */
    public static final class Application extends AbstractC25705jDh {
        public final LeaderBoardFilterModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LeaderBoardFilterModel copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LeaderBoardFilterModel leaderBoardFilterModel) {
            super(null);
            Intrinsics.checkNotNullParameter(leaderBoardFilterModel, "");
            this.EZpvd = leaderBoardFilterModel;
        }
    }

    /* JADX INFO: renamed from: o.jDh$Activity */
    public static final class Activity extends AbstractC25705jDh {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.jDh$TaskDescription */
    public static final class TaskDescription extends AbstractC25705jDh {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}
