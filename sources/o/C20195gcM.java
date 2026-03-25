package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20195gcM extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public final float EZpvd;
    public CDNSourceManager.ImageSource KWHzl;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.gcM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gcM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C20195gcM OLrzqt(@NotNull CDNSourceManager.ImageSource imageSource, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
            Intrinsics.checkNotNullParameter(imageSource, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C20195gcM c20195gcM = new C20195gcM();
            c20195gcM.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("iconCDN", imageSource), C56390yDp.OLrzqt("baseTitle", str), C56390yDp.OLrzqt("tvNum1Title", str2), C56390yDp.OLrzqt("tvNum1Subtitle", str3), C56390yDp.OLrzqt("tvNum2Title", str4), C56390yDp.OLrzqt("tvNum2Subtitle", str5), C56390yDp.OLrzqt("isApproveToken", java.lang.Boolean.valueOf(z))));
            return c20195gcM;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.io.Serializable serializable = arguments.getSerializable("iconCDN");
            CDNSourceManager.ImageSource imageSource = serializable instanceof CDNSourceManager.ImageSource ? (CDNSourceManager.ImageSource) serializable : null;
            if (imageSource == null) {
                imageSource = CDNSourceManager.ImageSource.TxConfirmPermit;
            }
            this.KWHzl = imageSource;
            java.lang.String string = arguments.getString("baseTitle");
            if (string == null) {
                string = "";
            }
            this.AEQbTJ = string;
            java.lang.String string2 = arguments.getString("tvNum1Title");
            if (string2 == null) {
                string2 = "";
            }
            this.AhwBna = string2;
            java.lang.String string3 = arguments.getString("tvNum1Subtitle");
            if (string3 == null) {
                string3 = "";
            }
            this.djBIcL = string3;
            java.lang.String string4 = arguments.getString("tvNum2Title");
            if (string4 == null) {
                string4 = "";
            }
            this.valueOf = string4;
            java.lang.String string5 = arguments.getString("tvNum2Subtitle");
            if (string5 == null) {
                string5 = "";
            }
            this.AYXKKw = string5;
            java.lang.String string6 = arguments.getString("tvNum2Subtitle");
            this.AYXKKw = string6 != null ? string6 : "";
            this.copydefault = arguments.getBoolean("isApproveToken");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        if (this.copydefault) {
            wxq.gEmmrt();
            wxq.AEQbTJ().setVisibility(8);
            wxq.KWHzl().setVisibility(0);
            wxq.setStyle(4);
            android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
            imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
            return;
        }
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16509elK c16509elKKWHzl = C16509elK.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c16509elKKWHzl, "");
        setDynamicFullScreen(this.copydefault);
        android.widget.ImageView imageView = c16509elKKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        CDNSourceManager.ImageSource imageSource = this.KWHzl;
        java.lang.String str = null;
        if (imageSource == null) {
            Intrinsics.gEmmrt("");
            imageSource = null;
        }
        C14677dpv.OLrzqt(imageView, imageSource);
        android.widget.TextView textView = c16509elKKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String str2 = this.AhwBna;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? 0 : 8);
        android.widget.TextView textView2 = c16509elKKWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        java.lang.String str3 = this.AhwBna;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str3) ? 0 : 8);
        android.widget.TextView textView3 = c16509elKKWHzl.djBIcL;
        java.lang.String str4 = this.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        }
        textView3.setText(str4);
        android.widget.TextView textView4 = c16509elKKWHzl.copydefault;
        java.lang.String str5 = this.AhwBna;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        }
        textView4.setText(str5);
        android.widget.TextView textView5 = c16509elKKWHzl.EZpvd;
        java.lang.String str6 = this.djBIcL;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        }
        textView5.setText(str6);
        android.widget.TextView textView6 = c16509elKKWHzl.gEmmrt;
        java.lang.String str7 = this.valueOf;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
            str7 = null;
        }
        textView6.setText(str7);
        android.widget.TextView textView7 = c16509elKKWHzl.AhwBna;
        java.lang.String str8 = this.AYXKKw;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str8;
        }
        textView7.setText(str);
        android.widget.TextView textView8 = c16509elKKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        if (textView8.getVisibility() != 0) {
            c16509elKKWHzl.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            c16509elKKWHzl.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
        C52794wYp c52794wYp = c16509elKKWHzl.KWHzl;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        constraintLayout.addView(c16509elKKWHzl.getRoot());
        c16509elKKWHzl.getRoot().post(new java.lang.Runnable() { // from class: o.gcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20195gcM.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C20195gcM c20195gcM) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20195gcM, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.gcM$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C20195gcM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C20195gcM c20195gcM) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c20195gcM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.gcM$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C20195gcM AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C20195gcM c20195gcM) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c20195gcM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
