package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6452aPc extends AbstractC6416aOt {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.aOt.AEQbTJ()V */
    public final Function0<Unit> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX INFO: renamed from: o.aPc$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aPc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6452aPc copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C6452aPc c6452aPc = new C6452aPc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putString("desc", str2);
            c6452aPc.setArguments(bundle);
            return c6452aPc;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        AppCompatTextView appCompatTextView = c54954xan.AEQbTJ;
        android.os.Bundle arguments = getArguments();
        appCompatTextView.setText(arguments != null ? arguments.getString("title") : null);
        AppCompatTextView appCompatTextView2 = c54954xan.OLrzqt;
        android.os.Bundle arguments2 = getArguments();
        appCompatTextView2.setText(arguments2 != null ? arguments2.getString("desc") : null);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.RAQtXZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setType(7);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.wlaJM));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.aPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6452aPc.EZpvd(this.EZpvd, view);
                }
            });
        }
    }

    public static final void EZpvd(C6452aPc c6452aPc, android.view.View view) {
        c6452aPc.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6452aPc.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.aPc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C6452aPc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6452aPc c6452aPc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c6452aPc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0<Unit> function0AEQbTJ = this.copydefault.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
            }
        }
    }
}
