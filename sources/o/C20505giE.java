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

/* JADX INFO: renamed from: o.giE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20505giE extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public TxExplain EZpvd;
    public final float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.giE$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.giE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20505giE EZpvd(@NotNull TxExplain txExplain) {
            Intrinsics.checkNotNullParameter(txExplain, "");
            C20505giE c20505giE = new C20505giE();
            c20505giE.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("explain", txExplain)));
            return c20505giE;
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
            this.EZpvd = (TxExplain) parcelable;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.setStyle(4);
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
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16614enJ c16614enJCopydefault = C16614enJ.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c16614enJCopydefault, "");
        TxExplain txExplain = this.EZpvd;
        if (txExplain != null && (data3 = txExplain.getData()) != null) {
            if (data3.getLocalImage() != null) {
                android.widget.ImageView imageView = c16614enJCopydefault.EZpvd;
                java.lang.Integer localImage = data3.getLocalImage();
                Intrinsics.copydefault(localImage);
                imageView.setImageResource(localImage.intValue());
            } else {
                TxExplain.Image image = data3.getImage();
                if (image != null) {
                    android.widget.ImageView imageView2 = c16614enJCopydefault.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    C33054mpH.AEQbTJ(imageView2, OLrzqt(image));
                }
            }
        }
        android.widget.TextView textView = c16614enJCopydefault.OLrzqt;
        TxExplain txExplain2 = this.EZpvd;
        if (txExplain2 == null || (data2 = txExplain2.getData()) == null || (title = data2.getTitle()) == null) {
            title = "";
        }
        textView.setText(title);
        TxExplain txExplain3 = this.EZpvd;
        if (txExplain3 != null && (data = txExplain3.getData()) != null && (descList = data.getDescList()) != null) {
            for (TxExplain.Desc desc2 : descList) {
                android.content.Context context = getContext();
                if (context != null) {
                    C20506giF c20506giF = new C20506giF(context);
                    if (desc2 == null || (text = desc2.getText()) == null) {
                        text = "";
                    }
                    c20506giF.setTitleText(text);
                    if (desc2 == null || (desc = desc2.getDesc()) == null) {
                        desc = "";
                    }
                    c20506giF.setDescText(desc);
                    c20506giF.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    c16614enJCopydefault.KWHzl.addView(c20506giF);
                }
            }
        }
        C52794wYp c52794wYp = c16614enJCopydefault.copydefault;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        constraintLayout.addView(c16614enJCopydefault.getRoot());
    }

    private final java.lang.String OLrzqt(TxExplain.Image image) {
        return !C33492mxV.OLrzqt() ? image.getLight() : image.getDark();
    }

    /* JADX INFO: renamed from: o.giE$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C20505giE KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C20505giE c20505giE) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c20505giE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
