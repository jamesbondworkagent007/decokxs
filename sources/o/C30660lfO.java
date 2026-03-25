package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30660lfO extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lfM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30660lfO.KWHzl(this.AEQbTJ);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.lfO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lfO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30660lfO AEQbTJ() {
            return new C30660lfO();
        }
    }

    private final kMM EZpvd() {
        return (kMM) this.AEQbTJ.getValue();
    }

    public static final kMM KWHzl(final C30660lfO c30660lfO) {
        kMM kmm = new kMM();
        kmm.register(C24374icd.class, new C24316ibY(new Function0() { // from class: o.lfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30660lfO.OLrzqt(this.AEQbTJ);
            }
        }));
        kmm.register(C30657lfL.class, new C30656lfK());
        return kmm;
    }

    public static final Unit OLrzqt(C30660lfO c30660lfO) {
        android.content.Intent intent = new android.content.Intent(c30660lfO.requireContext(), (java.lang.Class<?>) ActivityC21811hNe.class);
        intent.putExtra("swap_type", "Web3_DEX_LIMIT_ORDER");
        c30660lfO.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerlambda0));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23414hxl.OLrzqt(getCustomLayoutInflater(), constraintLayout, true).OLrzqt.setAdapter(EZpvd());
        java.lang.StringBuilder sbEZpvd = C59446zhG.EZpvd(new java.lang.StringBuilder(), C33070mpX.AYXKKw(C23274hvD.Fragment.access000), "\n", C33070mpX.AYXKKw(C23274hvD.Fragment.writeTypedObject), "\n\n", C33070mpX.AYXKKw(C23274hvD.Fragment.write), "\n\n", C33070mpX.AYXKKw(C23274hvD.Fragment.AudioAttributesCompatParcelizer), "\n");
        kMM kmmEZpvd = EZpvd();
        C30657lfL c30657lfL = new C30657lfL(C33070mpX.AYXKKw(C23274hvD.Fragment.search), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0));
        C30657lfL c30657lfL2 = new C30657lfL(C33070mpX.AYXKKw(C23274hvD.Fragment.unsubscribe), C33070mpX.AYXKKw(C23274hvD.Fragment.connect));
        C30657lfL c30657lfL3 = new C30657lfL(C33070mpX.AYXKKw(C23274hvD.Fragment.getServiceComponent), C33070mpX.AYXKKw(C23274hvD.Fragment.read));
        java.lang.String string = sbEZpvd.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        kMM.setData$default(kmmEZpvd, yDY.gEmmrt(c30657lfL, c30657lfL2, c30657lfL3, new C30657lfL("", string)), null, 2, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ));
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C23317hvu.copydefault(true);
    }

    /* JADX INFO: renamed from: o.lfO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C30660lfO OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30660lfO c30660lfO) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c30660lfO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
