package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59353zfT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59420zgh implements InterfaceC59353zfT {
    public final java.lang.String AEQbTJ;
    public final Function1<AbstractC56640yMw, AbstractC59233zdF> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 kotlin.jvm.functions.Function1) A[MD:(java.lang.String, kotlin.jvm.functions.Function1<? super o.yMw, ? extends o.zdF>):void (m)] call: o.zgh.<init>(java.lang.String, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59420zgh(java.lang.String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59353zfT
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.yMw, ? extends o.zdF> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC59420zgh(java.lang.String str, Function1<? super AbstractC56640yMw, ? extends AbstractC59233zdF> function1) {
        this.AEQbTJ = str;
        this.EZpvd = function1;
        this.copydefault = "must return " + str;
    }

    @Override // o.InterfaceC59353zfT
    public java.lang.String KWHzl(@NotNull yNG yng) {
        return InterfaceC59353zfT.Activity.EZpvd(this, yng);
    }

    @Override // o.InterfaceC59353zfT
    public boolean EZpvd(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        return Intrinsics.EZpvd(yng.gEmmrt(), this.EZpvd.invoke(yZE.AEQbTJ((InterfaceC56665yNu) yng)));
    }

    /* JADX INFO: renamed from: o.zgh$ActionBar */
    public static final class ActionBar extends AbstractC59420zgh {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
            super("Boolean", C59419zgg.copydefault, null);
        }

        public static final AbstractC59233zdF KWHzl(AbstractC56640yMw abstractC56640yMw) {
            Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
            AbstractC59242zdO abstractC59242zdOValueOf = abstractC56640yMw.valueOf();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOValueOf, "");
            return abstractC59242zdOValueOf;
        }
    }

    /* JADX INFO: renamed from: o.zgh$Activity */
    public static final class Activity extends AbstractC59420zgh {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super("Int", C59421zgi.AEQbTJ, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC59233zdF copydefault(AbstractC56640yMw abstractC56640yMw) {
            Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
            AbstractC59242zdO abstractC59242zdOFIwbmz = abstractC56640yMw.fIwbmz();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOFIwbmz, "");
            return abstractC59242zdOFIwbmz;
        }
    }

    /* JADX INFO: renamed from: o.zgh$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59420zgh {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super("Unit", C59422zgj.EZpvd, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC59233zdF AEQbTJ(AbstractC56640yMw abstractC56640yMw) {
            Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
            AbstractC59242zdO abstractC59242zdOSSMYrx = abstractC56640yMw.sSMYrx();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOSSMYrx, "");
            return abstractC59242zdOSSMYrx;
        }
    }
}
