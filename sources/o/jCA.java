package o;

import android.text.InputFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jCA extends AbstractC25685jCo {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> AYXKKw;
    public hEA AhwBna;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jCx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jCA.copydefault(this.KWHzl);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 60.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX DEBUG: Possible override for method o.jCo.EZpvd()V */
    public final java.lang.String EZpvd() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String copydefault(jCA jca) {
        android.os.Bundle arguments = jca.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("ranking_filter_id") : null;
        return string == null ? "" : string;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final jCA copydefault(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            jCA jca = new jCA();
            android.os.Bundle bundle = new android.os.Bundle();
            jca.AYXKKw = function2;
            bundle.putString("ranking_filter_id", str);
            jca.setArguments(bundle);
            return jca;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.OJuSTm));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = hEA.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        C33054mpH.showKeyBoardDelay$default(this, 0L, 1, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getFieldNames));
        }
        final hEA hea = this.AhwBna;
        if (hea != null) {
            hea.EZpvd.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(25)});
            android.text.Editable text = hea.EZpvd.getText();
            hea.OLrzqt.setText(C33129mqd.AYXKKw(text != null ? java.lang.Integer.valueOf(text.length()) : null) + "/25");
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setEnabled(true ^ (text != null && text.length() == 0));
            }
            OKEditText oKEditText = hea.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            C33606mzd.AEQbTJ(oKEditText, new Function1() { // from class: o.jCB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jCA.KWHzl(wyf, hea, (java.lang.CharSequence) obj);
                }
            });
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new StateListAnimator(c52794wYpCopydefault3, 1000L, text, wyf, this, hea));
            }
        }
    }

    public static final Unit KWHzl(wYF wyf, hEA hea, java.lang.CharSequence charSequence) {
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(true ^ (charSequence == null || StringsKt__StringsKt.fARcdN(charSequence)));
        }
        hea.OLrzqt.setText(C33129mqd.AYXKKw(charSequence != null ? java.lang.Integer.valueOf(charSequence.length()) : null) + "/25");
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ hEA AEQbTJ;
        public final /* synthetic */ wYF EZpvd;
        public final /* synthetic */ android.text.Editable KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ jCA valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.text.Editable editable, wYF wyf, jCA jca, hEA hea) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = editable;
            this.EZpvd = wyf;
            this.valueOf = jca;
            this.AEQbTJ = hea;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.text.Editable editable = this.KWHzl;
                if (editable != null && editable.length() == 0) {
                    C52794wYp c52794wYpCopydefault = this.EZpvd.copydefault();
                    if (c52794wYpCopydefault != null) {
                        c52794wYpCopydefault.setEnabled(false);
                        return;
                    }
                    return;
                }
                android.text.Editable editable2 = this.KWHzl;
                if (C33129mqd.valueOf(editable2 != null ? java.lang.Integer.valueOf(editable2.length()) : null, 25)) {
                    C29408ktA.KWHzl.gEmmrt("filter_preset");
                    Function2 function2 = this.valueOf.AYXKKw;
                    if (function2 != null) {
                        function2.invoke(this.valueOf.EZpvd(), java.lang.String.valueOf(this.AEQbTJ.EZpvd.getText()));
                    }
                    this.valueOf.dismissAllowingStateLoss();
                    C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.dUDNAs), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
                }
            }
        }
    }
}
