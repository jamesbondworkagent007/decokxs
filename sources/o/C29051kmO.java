package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.market.features.overview.ui.widget.InfoItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29051kmO extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.kmO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kmO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29051kmO copydefault(@NotNull java.util.List<InfoItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C29051kmO c29051kmO = new C29051kmO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("ARGS_INFO_ITEMS", new java.util.ArrayList<>(list));
            c29051kmO.setArguments(bundle);
            return c29051kmO;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C23274hvD.Fragment.OcIXYQ));
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.ArrayList parcelableArrayList;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23479hyx c23479hyxEZpvd = C23479hyx.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "ARGS_INFO_ITEMS", InfoItem.class)) == null) {
            return;
        }
        int i = 0;
        for (java.lang.Object obj : parcelableArrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InfoItem infoItem = (InfoItem) obj;
            android.widget.LinearLayout root = c23479hyxEZpvd.getRoot();
            Intrinsics.copydefault(c23479hyxEZpvd);
            root.addView(copydefault(c23479hyxEZpvd, infoItem.AEQbTJ(), i == 0));
            c23479hyxEZpvd.getRoot().addView(OLrzqt(c23479hyxEZpvd, infoItem.EZpvd()));
            i++;
        }
    }

    public final android.widget.TextView copydefault(C23479hyx c23479hyx, @androidx.annotation.StringRes int i, boolean z) {
        android.widget.TextView textView = new android.widget.TextView(c23479hyx.getRoot().getContext());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        textView.setText(getString(i));
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TextViewCompat.setLineHeight(textView, C55298xhM.djBIcL(20.0f, context));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AwvSrB);
        int i2 = C52761wXj.Activity.fdOvFl;
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C25382ivf.copydefault(i2, context2));
        C55296xhK.margin$default(textView, null, java.lang.Float.valueOf(z ? 0.0f : 16.0f), null, null, 13, null);
        return textView;
    }

    public final android.widget.TextView OLrzqt(C23479hyx c23479hyx, @androidx.annotation.StringRes int i) {
        android.widget.TextView textView = new android.widget.TextView(c23479hyx.getRoot().getContext());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        textView.setText(getString(i));
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TextViewCompat.setLineHeight(textView, C55298xhM.djBIcL(22.0f, context));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.valueOf);
        int i2 = C52761wXj.Activity.DCUTEIddSDPG;
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C25382ivf.copydefault(i2, context2));
        C55296xhK.margin$default(textView, null, java.lang.Float.valueOf(8.0f), null, null, 13, null);
        return textView;
    }

    /* JADX INFO: renamed from: o.kmO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C29051kmO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29051kmO c29051kmO) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c29051kmO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
