package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15287eCt extends AbstractC52792wYn {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.Integer, Unit> KWHzl;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.access000));
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(2);
        c55198xfS.setSingleOneColumnData(yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.writeTypedObject), 1, null, false, false, null, null, 124, null), new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.access100), 2, null, false, false, null, null, 124, null), new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RemoteActionCompatParcelizer), 3, null, false, false, null, null, 124, null)), new yHO() { // from class: o.eCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15287eCt.KWHzl(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(C15287eCt c15287eCt, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
        if (num != null) {
            int iIntValue = num.intValue();
            Function1<? super java.lang.Integer, Unit> function1 = c15287eCt.KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(iIntValue));
            }
        }
        c15287eCt.dismiss();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        show(fragmentManager);
    }

    /* JADX INFO: renamed from: o.eCt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eCt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C15287eCt KWHzl() {
            return new C15287eCt();
        }
    }
}
