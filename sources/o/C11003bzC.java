package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11003bzC extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.Integer, Unit> KWHzl;

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
    }

    /* JADX INFO: renamed from: o.bzC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bzC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C11003bzC KWHzl(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C11003bzC c11003bzC = new C11003bzC();
            c11003bzC.KWHzl = function1;
            c11003bzC.setArguments(new android.os.Bundle());
            return c11003bzC;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.djBIcL);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.bzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C11003bzC.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C11003bzC c11003bzC) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c11003bzC, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zhUgOk));
        c54954xan.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zOIQXb));
        wYK wyk = c54954xan.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(262);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zYHWMc));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zqTOFw));
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new Activity(c52794wYpCopydefault3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new View.OnClickListener() { // from class: o.bzF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C11003bzC.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C11003bzC c11003bzC, android.view.View view) {
        c11003bzC.dismissAllowingStateLoss();
        Function1<? super java.lang.Integer, Unit> function1 = c11003bzC.KWHzl;
        if (function1 != null) {
            function1.invoke(2);
        }
    }

    /* JADX INFO: renamed from: o.bzC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C11003bzC OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C11003bzC c11003bzC) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c11003bzC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.KWHzl;
                if (function1 != null) {
                    function1.invoke(1);
                }
            }
        }
    }
}
