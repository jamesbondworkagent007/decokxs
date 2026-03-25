package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46154tJv extends wXX {
    public boolean EZpvd;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.tJv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJv.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C46154tJv newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return actionBar.AEQbTJ(str, str2);
        }

        public final C46154tJv AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str);
            bundle.putString("message", str2);
            C46154tJv c46154tJv = new C46154tJv();
            c46154tJv.setArguments(bundle);
            return c46154tJv;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        final java.lang.String string = arguments != null ? arguments.getString("type") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("message") : null;
        tNC tncEZpvd = tNC.EZpvd(getLayoutInflater(), constraintLayout, true);
        tncEZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46154tJv.OLrzqt(this.KWHzl, string, view);
            }
        });
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1765778838) {
                if (iHashCode != -838375169) {
                    if (iHashCode == 1566505512 && string.equals("async_x_fail_follow")) {
                        C32866mlf.onEvent$default("Twitter_Sync_FollowLimit_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                        tncEZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DxnCrt));
                        tncEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKsfEqpH));
                    }
                } else if (string.equals("async_x_fail_abnormal")) {
                    tncEZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKgMxgjU));
                    tncEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKfbSiEC));
                }
            } else if (string.equals("link_x_fail")) {
                tncEZpvd.OLrzqt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gkZNMa));
                android.widget.TextView textView = tncEZpvd.AEQbTJ;
                if (string2 == null) {
                    string2 = C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKfwDlxl);
                }
                textView.setText(string2);
                C32866mlf.onEvent$default("Twitter_AccountLink_Unsuccessful_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
        constraintLayout.post(new java.lang.Runnable() { // from class: o.tJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46154tJv.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C46154tJv c46154tJv, java.lang.String str, android.view.View view) {
        c46154tJv.dismissAllowingStateLoss();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "async_x_fail_follow")) {
            C32866mlf.onEvent$default("Twitter_Sync_FollowLimit_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public static final void OLrzqt(C46154tJv c46154tJv) {
        if (c46154tJv.EZpvd) {
            return;
        }
        c46154tJv.EZpvd = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46154tJv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
