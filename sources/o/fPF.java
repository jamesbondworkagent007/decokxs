package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.fPF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fPF {
    public static final fPF OLrzqt = new fPF();

    private fPF() {
    }

    public final AbstractC58260yxt<java.lang.Boolean> OLrzqt(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.fPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                fPF.OLrzqt(oKWBaseTransaction, fragmentManager, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(OKWBaseTransaction oKWBaseTransaction, androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        boolean z = oKWBaseTransaction instanceof InterfaceC9041bOB;
        InterfaceC9041bOB interfaceC9041bOB = z ? (InterfaceC9041bOB) oKWBaseTransaction : null;
        C9225bRa c9225bRaFJNWhG = interfaceC9041bOB != null ? interfaceC9041bOB.fJNWhG() : null;
        C9165bQT c9165bQTKWHzl = c9225bRaFJNWhG != null ? c9225bRaFJNWhG.KWHzl() : null;
        if (c9165bQTKWHzl != null) {
            InterfaceC9041bOB interfaceC9041bOB2 = z ? (InterfaceC9041bOB) oKWBaseTransaction : null;
            if (interfaceC9041bOB2 != null && interfaceC9041bOB2.sSMYrx() && !C33129mqd.valueOf(c9165bQTKWHzl.OLrzqt(), "0")) {
                C9225bRa c9225bRa = c9225bRaFJNWhG;
                StateListAnimator.Companion.copydefault(AbstractC8426bCW.formatToFeeCoinAmount$default(c9225bRa, c9165bQTKWHzl.OLrzqt(), false, false, false, 14, null), AbstractC8426bCW.formatToFeeCurrencyAmount$default(c9225bRa, c9165bQTKWHzl.OLrzqt(), false, false, false, 6, null), new Function1() { // from class: o.fPC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fPF.EZpvd(interfaceC58257yxq, ((java.lang.Boolean) obj).booleanValue());
                    }
                }).show(fragmentManager);
                return;
            }
        }
        interfaceC58257yxq.onSuccess(java.lang.Boolean.TRUE);
    }

    public static final Unit EZpvd(InterfaceC58257yxq interfaceC58257yxq, boolean z) {
        interfaceC58257yxq.onSuccess(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends AbstractC52785wYg {
        public Function1<? super java.lang.Boolean, Unit> EZpvd;
        public static final Application Companion = new Application(null);
        public static final int AEQbTJ = 8;
        public java.lang.String copydefault = "";
        public java.lang.String KWHzl = "";
        public final boolean OLrzqt = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC52785wYg
        public boolean AhwBna() {
            return this.OLrzqt;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fPF.StateListAnimator.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fPF$StateListAnimator$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator newInstance$default(Application application, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
                if ((i & 4) != 0) {
                    function1 = null;
                }
                return application.copydefault(str, str2, function1);
            }

            public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super java.lang.Boolean, Unit> function1) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                StateListAnimator stateListAnimator = new StateListAnimator();
                stateListAnimator.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, str2)));
                stateListAnimator.EZpvd = function1;
                return stateListAnimator;
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
        public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            super.onCancel(dialogInterface);
            Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
        }

        @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            java.lang.String string;
            java.lang.String string2;
            super.onCreate(bundle);
            if (bundle != null) {
                getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                return;
            }
            android.os.Bundle arguments = getArguments();
            if (arguments != null && (string2 = arguments.getString("token")) != null) {
                this.copydefault = string2;
            }
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString(FirebaseAnalytics.Param.PRICE)) == null) {
                return;
            }
            this.KWHzl = string;
        }

        @Override // o.AbstractC52785wYg, o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            super.onCreateHeader(c52781wYc);
            c52781wYc.setVisibility(8);
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull wXQ wxq) {
            Intrinsics.checkNotNullParameter(wxq, "");
            super.onCreateHeader(wxq);
            wxq.setStyle(0);
        }

        @Override // o.AbstractC52785wYg
        public void AEQbTJ(@NotNull C54954xan c54954xan) {
            Intrinsics.checkNotNullParameter(c54954xan, "");
            c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.NRYds);
            c54954xan.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSubDecor));
            c54954xan.OLrzqt.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.updateStatusGuardColor, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", this.copydefault), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, this.KWHzl))));
        }

        @Override // o.AbstractC52785wYg, o.wXX
        public void onFooterCreated(@NotNull final wYF wyf) {
            Intrinsics.checkNotNullParameter(wyf, "");
            super.onFooterCreated(wyf);
            wyf.setType(5);
            wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MainThread));
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fPI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        fPF.StateListAnimator.EZpvd(wyf, this, view);
                    }
                });
            }
        }

        public static final void EZpvd(wYF wyf, StateListAnimator stateListAnimator, android.view.View view) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(null);
            }
            Function1<? super java.lang.Boolean, Unit> function1 = stateListAnimator.EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
            stateListAnimator.dismissAllowingStateLoss();
        }
    }
}
