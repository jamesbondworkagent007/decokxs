package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49656usf extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public Function0<Unit> copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C49598ura c49598uraOLrzqt = C49598ura.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        c49598uraOLrzqt.KWHzl.setText(C33070mpX.AYXKKw(C49511upt.Activity.AuCTel));
        c49598uraOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C49511upt.Activity.ejfBZ));
    }

    /* JADX INFO: renamed from: o.usf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.usf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        wyf.setPrimaryText(C33070mpX.AYXKKw(C49511upt.Activity.KWHzl));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C49511upt.Activity.fJNWhG));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.usf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C49656usf KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C49656usf c49656usf) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c49656usf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.usf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C49656usf EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C49656usf c49656usf) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c49656usf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismiss();
            }
        }
    }
}
