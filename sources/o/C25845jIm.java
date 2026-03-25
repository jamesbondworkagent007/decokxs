package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25845jIm extends wXX {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public C42711rba copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public C25845jIm(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AEQbTJ = C33129mqd.OLrzqt((java.lang.CharSequence) str3);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42711rba c42711rbaEZpvd = C42711rba.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        this.copydefault = c42711rbaEZpvd;
        if (c42711rbaEZpvd == null) {
            Intrinsics.gEmmrt("");
            c42711rbaEZpvd = null;
        }
        c42711rbaEZpvd.copydefault.setText(this.EZpvd);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.setTitle(this.OLrzqt);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        if (this.KWHzl == null) {
            return;
        }
        wyf.setType(5);
        wyf.setOKDSSize(44);
        wyf.setPrimaryText(C33070mpX.AYXKKw(qZH.PendingIntent.zhUgOk));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this, wyf));
        }
    }

    /* JADX INFO: renamed from: o.jIm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wYF KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C25845jIm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25845jIm c25845jIm, wYF wyf) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c25845jIm;
            this.KWHzl = wyf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.copydefault.AEQbTJ()));
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
                this.copydefault.dismiss();
            }
        }
    }
}
