package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5879aEm extends AbstractC5870aEd {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> djBIcL;

    /* JADX INFO: renamed from: o.aEm$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.aEm$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C5879aEm newInstance$default(Application application, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function02 = null;
            }
            return application.KWHzl(function0, function02);
        }

        public final C5879aEm KWHzl(Function0<Unit> function0, Function0<Unit> function02) {
            C5879aEm c5879aEm = new C5879aEm();
            c5879aEm.djBIcL = function0;
            c5879aEm.AYXKKw = function02;
            return c5879aEm;
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
        C8259azP c8259azPEZpvd = C8259azP.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        android.view.ViewParent parent = c8259azPEZpvd.copydefault.AEQbTJ().getParent();
        android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        c8259azPEZpvd.copydefault.AEQbTJ().setVisibility(8);
        c8259azPEZpvd.copydefault.setType(0);
        c8259azPEZpvd.copydefault.setStatus(5);
        c8259azPEZpvd.copydefault.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.dHguZz));
        c8259azPEZpvd.copydefault.setSubTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.RKDWNf));
        wYF wyfOLrzqt = c8259azPEZpvd.copydefault.OLrzqt();
        C52794wYp c52794wYpCopydefault = wyfOLrzqt.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.Swccd));
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
            c52794wYpAEQbTJ.setOKDSType(258);
            c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.OBJEWx));
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.aEm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C5879aEm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5879aEm c5879aEm) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c5879aEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0 function0 = this.copydefault.djBIcL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aEm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C5879aEm AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5879aEm c5879aEm) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c5879aEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0 function0 = this.AEQbTJ.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
