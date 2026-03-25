package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tKI extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public tNR EZpvd;
    public final boolean copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tKH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tKI.EZpvd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.tKG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tKI.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tKE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tKI.KWHzl(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void show$default(StateListAnimator stateListAnimator, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            stateListAnimator.OLrzqt(fragmentManager, str, str2, str3);
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            tKI tki = new tKI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KEY_AVATAR", str);
            bundle.putString("KEY_NAME", str2);
            bundle.putString("KEY_JOIN_TIME", str3);
            tki.setArguments(bundle);
            tki.show(fragmentManager);
        }
    }

    public static final java.lang.String EZpvd(tKI tki) {
        java.lang.String string;
        android.os.Bundle arguments = tki.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_AVATAR")) == null) ? "" : string;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String djBIcL(tKI tki) {
        java.lang.String string;
        android.os.Bundle arguments = tki.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_NAME")) == null) ? "" : string;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String KWHzl(tKI tki) {
        java.lang.String string;
        android.os.Bundle arguments = tki.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_JOIN_TIME")) == null) ? "" : string;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        tNR tnrOLrzqt = tNR.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.EZpvd = tnrOLrzqt;
        if (tnrOLrzqt != null && (imageView = tnrOLrzqt.AEQbTJ) != null) {
            C33054mpH.loadAvatar$default(imageView, AEQbTJ(), null, null, 6, null);
        }
        tNR tnr = this.EZpvd;
        if (tnr != null && (textView2 = tnr.EZpvd) != null) {
            textView2.setText(OLrzqt());
        }
        tNR tnr2 = this.EZpvd;
        if (tnr2 == null || (textView = tnr2.KWHzl) == null) {
            return;
        }
        textView.setText(C33069mpW.copydefault(C47501trL.Fragment.TarCU, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatDate$default(new Date(C33129mqd.valueOf(EZpvd())), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null)))));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(8);
    }
}
