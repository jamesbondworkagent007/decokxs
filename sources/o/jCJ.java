package o;

import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jCJ {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCJ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ jCJ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends jCJ {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    private jCJ() {
    }

    public static final class TaskDescription extends jCJ {
        public final LeaderBoardCardUIModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LeaderBoardCardUIModel copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel) {
            super(null);
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            this.OLrzqt = leaderBoardCardUIModel;
        }
    }

    public static final class Activity extends jCJ {
        public final int EZpvd;
        public final LeaderBoardCardUIModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LeaderBoardCardUIModel AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(int i, @NotNull LeaderBoardCardUIModel leaderBoardCardUIModel) {
            super(null);
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            this.EZpvd = i;
            this.copydefault = leaderBoardCardUIModel;
        }
    }

    public static final class Application extends jCJ {
        public final LeaderBoardCardUIModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LeaderBoardCardUIModel KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel) {
            super(null);
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            this.KWHzl = leaderBoardCardUIModel;
        }
    }
}
