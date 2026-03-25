package o;

import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25708jDk {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC25708jDk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jDk$Application */
    public static final class Application extends AbstractC25708jDk {
        public Application() {
            super(null);
        }
    }

    private AbstractC25708jDk() {
    }

    /* JADX INFO: renamed from: o.jDk$ActionBar */
    public static final class ActionBar extends AbstractC25708jDk {
        public final java.lang.String EZpvd;
        public final java.util.List<LeaderBoardCardUIModel> KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<LeaderBoardCardUIModel> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.util.List<LeaderBoardCardUIModel> list, int i, int i2, java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.copydefault = i;
            this.OLrzqt = i2;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 int)
  (r3v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel>, int, int, java.lang.String):void (m)] (LINE:9) call: o.jDk.ActionBar.<init>(java.util.List, int, int, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.util.List list, int i, int i2, java.lang.String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, i2, (i3 & 8) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: o.jDk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC25708jDk {
        public StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.jDk$Activity */
    public static final class Activity extends AbstractC25708jDk {
        public Activity() {
            super(null);
        }
    }
}
