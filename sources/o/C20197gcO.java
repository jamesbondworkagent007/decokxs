package o;

import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20197gcO extends wXX {
    public final float EZpvd;
    public TxExplain KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.gcO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gcO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C20197gcO KWHzl(@NotNull TxExplain txExplain) {
            Intrinsics.checkNotNullParameter(txExplain, "");
            C20197gcO c20197gcO = new C20197gcO();
            c20197gcO.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("explain", txExplain)));
            return c20197gcO;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("explain", TxExplain.class);
            } else {
                parcelable = arguments.getParcelable("explain");
            }
            this.KWHzl = (TxExplain) parcelable;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        wxq.gEmmrt();
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.setStyle(4);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String title;
        TxExplain.ExplainItem data;
        java.util.List<TxExplain.Desc> descList;
        java.lang.String text;
        java.lang.String desc;
        TxExplain.ExplainItem data2;
        TxExplain.ExplainItem data3;
        TxExplain.Image image;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16506elH c16506elHEZpvd = C16506elH.EZpvd(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c16506elHEZpvd, "");
        TxExplain txExplain = this.KWHzl;
        if (txExplain != null && (data3 = txExplain.getData()) != null && (image = data3.getImage()) != null) {
            android.widget.ImageView imageView = c16506elHEZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.AEQbTJ(imageView, OLrzqt(image));
        }
        android.widget.TextView textView = c16506elHEZpvd.OLrzqt;
        TxExplain txExplain2 = this.KWHzl;
        if (txExplain2 == null || (data2 = txExplain2.getData()) == null || (title = data2.getTitle()) == null) {
            title = "";
        }
        textView.setText(title);
        TxExplain txExplain3 = this.KWHzl;
        if (txExplain3 != null && (data = txExplain3.getData()) != null && (descList = data.getDescList()) != null) {
            for (TxExplain.Desc desc2 : descList) {
                android.content.Context context = getContext();
                if (context != null) {
                    C20187gcE c20187gcE = new C20187gcE(context);
                    if (desc2 == null || (text = desc2.getText()) == null) {
                        text = "";
                    }
                    c20187gcE.setTitleText(text);
                    if (desc2 == null || (desc = desc2.getDesc()) == null) {
                        desc = "";
                    }
                    c20187gcE.setDescText(desc);
                    c20187gcE.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    c16506elHEZpvd.AEQbTJ.addView(c20187gcE);
                }
            }
        }
        C52794wYp c52794wYp = c16506elHEZpvd.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        constraintLayout.addView(c16506elHEZpvd.getRoot());
        c16506elHEZpvd.getRoot().post(new java.lang.Runnable() { // from class: o.gcP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20197gcO.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(C20197gcO c20197gcO) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20197gcO, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String OLrzqt(TxExplain.Image image) {
        return !C33492mxV.OLrzqt() ? image.getLight() : image.getDark();
    }

    /* JADX INFO: renamed from: o.gcO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C20197gcO EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C20197gcO c20197gcO) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c20197gcO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.gcO$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C20197gcO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C20197gcO c20197gcO) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c20197gcO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
