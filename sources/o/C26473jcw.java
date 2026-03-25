package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26473jcw extends AbstractC52779wYa {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C55298xhM.dp2px$default(200.0f, null, 1, null);
            layoutParams.width = -1;
            appCompatImageView.setLayoutParams(layoutParams);
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                AppCompatTextView appCompatTextView = c54956xap.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(8);
                c54956xap.copydefault.setItemSpace(C55298xhM.dp2px$default(24.0f, null, 1, null));
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                AppCompatImageView appCompatImageView2 = c54956xap.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                java.lang.String string = arguments.getString("key_learn_sheet_img_url");
                if (string == null) {
                    string = "";
                }
                c27569jxf.AEQbTJ(appCompatImageView2, string, c27569jxf.AEQbTJ());
                AppCompatTextView appCompatTextView2 = c54956xap.valueOf;
                java.lang.String string2 = arguments.getString("key_learn_sheet_title");
                if (string2 == null) {
                    string2 = "";
                }
                appCompatTextView2.setText(string2);
                ViewGroup.LayoutParams layoutParams2 = c54956xap.valueOf.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(8.0f, null, 1, null);
                c54956xap.valueOf.setLayoutParams(marginLayoutParams);
                ViewGroup.LayoutParams layoutParams3 = c54956xap.AEQbTJ.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams2.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
                c54956xap.AEQbTJ.setLayoutParams(marginLayoutParams2);
                AppCompatTextView appCompatTextView3 = c54956xap.AEQbTJ;
                java.lang.String string3 = arguments.getString("key_learn_sheet_sub_title");
                appCompatTextView3.setText(string3 != null ? string3 : "");
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
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
        wyf.setPrimaryText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.OHqIaq));
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.jcw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jcw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26473jcw EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C26473jcw c26473jcw = new C26473jcw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_learn_sheet_title", str);
            bundle.putString("key_learn_sheet_sub_title", str2);
            bundle.putString("key_learn_sheet_img_url", str3);
            c26473jcw.setArguments(bundle);
            return c26473jcw;
        }
    }

    /* JADX INFO: renamed from: o.jcw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26473jcw EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26473jcw c26473jcw) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c26473jcw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
