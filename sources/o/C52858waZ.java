package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.C55770xqH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52858waZ extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.waZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.waZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C52858waZ OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C52858waZ c52858waZ = new C52858waZ();
            c52858waZ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("param_key_inst_id", str)));
            return c52858waZ;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("param_key_inst_id")) != null) {
            str = string;
        }
        this.copydefault = str;
        java.lang.String strKWHzl = C55770xqH.ActionBar.OLrzqt.KWHzl(str);
        if (strKWHzl == null) {
            strKWHzl = "--";
        }
        uQC uqcKWHzl = uQC.KWHzl(getLayoutInflater(), constraintLayout, true);
        uqcKWHzl.AEQbTJ.setText(C33069mpW.copydefault(C55688xof.Application.getItem, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strKWHzl))));
        uqcKWHzl.EZpvd.setText(C33069mpW.copydefault(C55688xof.Application.getServiceComponent, C56424yEw.gEmmrt(C56390yDp.OLrzqt("origCrypto", this.copydefault), C56390yDp.OLrzqt("stakeCrypto", strKWHzl))));
        android.widget.TextView textView = uqcKWHzl.OLrzqt;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.waZ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52858waZ OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52858waZ c52858waZ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c52858waZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.copydefault;
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                Intrinsics.copydefault(textView);
                WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(textView), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C48033uCm.Fragment.FQNKFG))), null, 4, null);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
