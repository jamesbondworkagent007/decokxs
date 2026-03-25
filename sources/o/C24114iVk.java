package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C24114iVk extends AbstractC52779wYa {
    public static final Application Companion = new Application(null);

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = C55298xhM.dp2px$default(216.0f, null, 1, null);
        marginLayoutParams.width = -1;
        marginLayoutParams.topMargin = C55298xhM.dp2px$default(12.0f, null, 1, null);
        appCompatImageView.setLayoutParams(marginLayoutParams);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        AppCompatImageView appCompatImageView2 = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        android.content.Context context = c54956xap.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27569jxf.AEQbTJ(appCompatImageView2, C43454rpb.copydefault("images/web3_defi/defi_v3_zap_background.png", context, true), C52761wXj.TaskDescription.getUriFromString);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            AppCompatTextView appCompatTextView = c54956xap.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            AppCompatTextView appCompatTextView2 = c54956xap.valueOf;
            java.lang.String string = arguments.getString("key_zap_title");
            if (string == null) {
                string = "";
            }
            appCompatTextView2.setText(string);
            ViewGroup.LayoutParams layoutParams2 = c54956xap.valueOf.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = C55298xhM.dp2px$default(12.0f, null, 1, null);
            c54956xap.valueOf.setLayoutParams(marginLayoutParams2);
            ViewGroup.LayoutParams layoutParams3 = c54956xap.AEQbTJ.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
            marginLayoutParams3.topMargin = C55298xhM.dp2px$default(12.0f, null, 1, null);
            c54956xap.AEQbTJ.setLayoutParams(marginLayoutParams3);
            AppCompatTextView appCompatTextView3 = c54956xap.AEQbTJ;
            java.lang.String string2 = arguments.getString("key_zap_sub_title");
            appCompatTextView3.setText(string2 != null ? string2 : "");
        }
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DGOPHZ));
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.iVk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C24114iVk EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C24114iVk c24114iVk = new C24114iVk();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_zap_title", str);
            bundle.putString("key_zap_sub_title", str2);
            c24114iVk.setArguments(bundle);
            return c24114iVk;
        }
    }

    /* JADX INFO: renamed from: o.iVk$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C24114iVk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24114iVk c24114iVk) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c24114iVk;
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
}
