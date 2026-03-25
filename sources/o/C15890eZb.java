package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15890eZb extends AbstractC52792wYn {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eYZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15890eZb.copydefault(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.eZb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eZb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C15890eZb copydefault(java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C15890eZb c15890eZb = new C15890eZb();
            c15890eZb.AEQbTJ = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str);
            c15890eZb.setArguments(bundle);
            return c15890eZb;
        }
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault(C15890eZb c15890eZb) {
        java.lang.String string;
        android.os.Bundle arguments = c15890eZb.getArguments();
        return (arguments == null || (string = arguments.getString("type", "3")) == null) ? "3" : string;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.eYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15890eZb.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(C15890eZb c15890eZb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15890eZb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setTitleAlignmentCenter(false);
        c52781wYc.setType(3);
        c52781wYc.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onServiceConnected));
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setSingleOneColumnData(AEQbTJ(), new yHO() { // from class: o.eYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15890eZb.EZpvd(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit EZpvd(C15890eZb c15890eZb, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super java.lang.String, Unit> function1 = c15890eZb.AEQbTJ;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(c55276xgr != null ? c55276xgr.OLrzqt() : null));
        }
        c15890eZb.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final java.util.List<C55276xgr> AEQbTJ() {
        return yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zUtmHU), "3", null, Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "3"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.validateSHA256), "4", null, Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "4"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(C13754dXa.FragmentManager.validateAndPutInMap), "5", null, Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "5"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
    }
}
