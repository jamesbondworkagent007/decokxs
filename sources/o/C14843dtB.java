package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14843dtB extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public C13146dAn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX INFO: renamed from: o.dtB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dtB$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14843dtB newInstance$default(ActionBar actionBar, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return actionBar.copydefault(function1);
        }

        public final C14843dtB copydefault(Function1<? super java.lang.Integer, Unit> function1) {
            C14843dtB c14843dtB = new C14843dtB();
            c14843dtB.EZpvd(function1);
            return c14843dtB;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setBackgroundResource(dLX.ActionBar.KWHzl);
        C13146dAn c13146dAn = (C13146dAn) getCustomLayoutInflater().inflate(dLX.Fragment.ejfBZ, (android.view.ViewGroup) constraintLayout, true).findViewById(dLX.Application.QKVWgx);
        this.copydefault = c13146dAn;
        if (c13146dAn != null) {
            c13146dAn.setDappTabData(C15112dyF.AEQbTJ.OLrzqt());
        }
        C13146dAn c13146dAn2 = this.copydefault;
        if (c13146dAn2 != null) {
            c13146dAn2.setOnClickMenuListener(new Function1() { // from class: o.dtA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14843dtB.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(C14843dtB c14843dtB, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c14843dtB.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        c14843dtB.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
