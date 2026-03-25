package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC39407prj extends AppCompatDialog implements View.OnClickListener {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public android.view.View AYXKKw;
    public C52794wYp AhwBna;
    public java.lang.CharSequence AkhnZx;
    public int AuCTel;
    public C52794wYp DbNXlk;
    public int EZpvd;
    public C55022xcB OLrzqt;
    public android.widget.LinearLayout copydefault;
    public android.widget.TextView djBIcL;
    public int ejfBZ;
    public android.content.res.ColorStateList fARcdN;
    public android.content.res.ColorStateList fJNWhG;
    public wZL fetchVPNInfo;
    public java.lang.CharSequence gEmmrt;
    public java.lang.CharSequence isConnected;
    public java.util.ArrayList<kotlin.Pair<java.lang.CharSequence, View.OnClickListener>> valueOf;
    public View.OnClickListener values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
        this.values = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39407prj(@NotNull android.content.Context context) {
        super(context, C52761wXj.LoaderManager.OqFWZa);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = "OKButtonedPopup";
        this.EZpvd = -1;
        this.valueOf = new java.util.ArrayList<>();
        this.AuCTel = C55298xhM.OLrzqt(24, context);
        AEQbTJ(ContextCompat.getColorStateList(context, C52761wXj.Activity.DcMfJKfNUfqk));
        EZpvd(ContextCompat.getColorStateList(context, C52761wXj.Activity.DcMfJKfNUfqk));
    }

    /* JADX INFO: renamed from: o.prj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.prj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final void AEQbTJ(android.content.res.ColorStateList colorStateList) {
        this.fJNWhG = colorStateList;
        C52794wYp c52794wYp = this.AhwBna;
        if (c52794wYp != null) {
            c52794wYp.setTextColor(colorStateList);
        }
    }

    private final void EZpvd(android.content.res.ColorStateList colorStateList) {
        this.fARcdN = colorStateList;
        C52794wYp c52794wYp = this.DbNXlk;
        if (c52794wYp != null) {
            c52794wYp.setTextColor(colorStateList);
        }
    }

    public final void KWHzl(java.lang.CharSequence charSequence) {
        this.AkhnZx = charSequence;
        C55022xcB c55022xcB = this.OLrzqt;
        if (c55022xcB != null) {
            c55022xcB.setTitleAndMessage(charSequence, this.gEmmrt);
        }
    }

    public final void copydefault(java.lang.CharSequence charSequence) {
        this.gEmmrt = charSequence;
        C55022xcB c55022xcB = this.OLrzqt;
        if (c55022xcB != null) {
            c55022xcB.setTitleAndMessage(this.AkhnZx, charSequence);
        }
        android.widget.TextView textView = this.djBIcL;
        if (textView != null) {
            textView.setText(this.gEmmrt);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        wZL wzlAEQbTJ = wZL.AEQbTJ(getLayoutInflater());
        setContentView(wzlAEQbTJ.getRoot());
        Intrinsics.copydefault(wzlAEQbTJ);
        AEQbTJ(wzlAEQbTJ);
        wzlAEQbTJ.getRoot().setMaxHeightPercent(0.6f);
        wzlAEQbTJ.getRoot().setTag(C52761wXj.FragmentManager.DGOPHZDGOPHZ, "Dialog");
        copydefault(wzlAEQbTJ);
        this.fetchVPNInfo = wzlAEQbTJ;
        C55118xds root = wzlAEQbTJ.getRoot();
        if (root != null) {
            root.setClipToOutline(true);
        }
        int i = this.AuCTel;
        OLrzqt(i, i, i, i);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        KWHzl(charSequence);
    }

    public final void copydefault(wZL wzl) {
        java.lang.CharSequence charSequence;
        wzl.getRoot().getLayoutParams().width = this.EZpvd;
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            C55118xds root = wzl.getRoot();
            this.AYXKKw = root;
            if (root != null) {
                root.setContentDescription(str);
            }
        }
        wzl.EZpvd.removeAllViews();
        if (C33129mqd.OLrzqt(this.AkhnZx)) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C55022xcB c55022xcB = new C55022xcB(context, null, 2, null);
            c55022xcB.setTitleAndMessage(this.AkhnZx, this.gEmmrt);
            wzl.EZpvd.addView(c55022xcB, EZpvd());
            c55022xcB.OLrzqt().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            c55022xcB.copydefault().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.OLrzqt = c55022xcB;
        } else if (C33129mqd.OLrzqt(this.gEmmrt)) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.dHguZz);
            appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.Dmq));
            appCompatTextView.setText(this.gEmmrt);
            TextViewCompat.setLineHeight(appCompatTextView, C55298xhM.sp2px$default(20.0f, null, 1, null));
            wzl.EZpvd.addView(appCompatTextView, EZpvd());
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.djBIcL = appCompatTextView;
        }
        if (C33129mqd.OLrzqt(this.isConnected) && this.valueOf.size() == 1) {
            C55118xds root2 = wzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            copydefault(root2);
            if (C33129mqd.OLrzqt(this.isConnected)) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(EZpvd());
                this.copydefault = linearLayout;
                wzl.getRoot().addView(this.copydefault);
            }
            C52794wYp c52794wYpBuildActionButton$default = buildActionButton$default(this, 1, 0, 2, null);
            C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default, 0.0f, 1, null);
            c52794wYpBuildActionButton$default.setTextColor(this.fARcdN);
            ViewGroup.LayoutParams layoutParams = c52794wYpBuildActionButton$default.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
            c52794wYpBuildActionButton$default.setText(this.isConnected);
            View.OnClickListener onClickListener = this.values;
            if (onClickListener == null) {
                onClickListener = this;
            }
            c52794wYpBuildActionButton$default.setOnClickListener(onClickListener);
            android.widget.LinearLayout linearLayout2 = this.copydefault;
            if (linearLayout2 != null) {
                linearLayout2.addView(c52794wYpBuildActionButton$default);
            }
            c52794wYpBuildActionButton$default.setContentDescription("secondaryButton");
            this.DbNXlk = c52794wYpBuildActionButton$default;
            android.widget.LinearLayout linearLayout3 = this.copydefault;
            if (linearLayout3 != null) {
                android.view.View view = new android.view.View(getContext());
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), C52761wXj.Activity.zuBGHE));
                linearLayout3.addView(view, new ViewGroup.LayoutParams(copydefault(), -1));
            }
            C52794wYp c52794wYpBuildActionButton$default2 = buildActionButton$default(this, 0, 0, 2, null);
            C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default2, 0.0f, 1, null);
            c52794wYpBuildActionButton$default2.setTextColor(this.fJNWhG);
            ViewGroup.LayoutParams layoutParams3 = c52794wYpBuildActionButton$default2.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = 0;
            layoutParams4.weight = 1.0f;
            c52794wYpBuildActionButton$default2.setText(this.valueOf.get(0).getFirst());
            View.OnClickListener second = this.valueOf.get(0).getSecond();
            if (second == null) {
                second = this;
            }
            c52794wYpBuildActionButton$default2.setOnClickListener(second);
            android.widget.LinearLayout linearLayout4 = this.copydefault;
            if (linearLayout4 != null) {
                linearLayout4.addView(c52794wYpBuildActionButton$default2);
            }
            c52794wYpBuildActionButton$default2.setContentDescription("primaryButton");
            this.AhwBna = c52794wYpBuildActionButton$default2;
            return;
        }
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            C55118xds root3 = wzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            copydefault(root3);
            C52794wYp c52794wYpKWHzl = KWHzl(0, i);
            if (i != yDY.AuCTel(this.valueOf) || (charSequence = this.isConnected) == null || charSequence.length() == 0) {
                C52794wYp.setButtonCornerRadius$default(c52794wYpKWHzl, 0.0f, 1, null);
            } else {
                C52794wYp.setButtonCornerRadius$default(c52794wYpKWHzl, 0.0f, 1, null);
            }
            c52794wYpKWHzl.setTextColor(this.fJNWhG);
            c52794wYpKWHzl.setText((java.lang.CharSequence) pair.getFirst());
            View.OnClickListener onClickListener2 = (View.OnClickListener) pair.getSecond();
            if (onClickListener2 == null) {
                onClickListener2 = this;
            }
            c52794wYpKWHzl.setOnClickListener(onClickListener2);
            c52794wYpKWHzl.setContentDescription("primaryButton");
            this.AhwBna = c52794wYpKWHzl;
            wzl.getRoot().addView(this.AhwBna);
            i++;
        }
        if (C33129mqd.OLrzqt(this.isConnected)) {
            C55118xds root4 = wzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "");
            copydefault(root4);
            C52794wYp c52794wYpBuildActionButton$default3 = buildActionButton$default(this, 1, 0, 2, null);
            C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default3, 0.0f, 1, null);
            c52794wYpBuildActionButton$default3.setTextColor(this.fARcdN);
            c52794wYpBuildActionButton$default3.setText(this.isConnected);
            View.OnClickListener onClickListener3 = this.values;
            if (onClickListener3 == null) {
                onClickListener3 = this;
            }
            c52794wYpBuildActionButton$default3.setOnClickListener(onClickListener3);
            wzl.getRoot().addView(c52794wYpBuildActionButton$default3);
            c52794wYpBuildActionButton$default3.setContentDescription("secondaryButton");
            this.DbNXlk = c52794wYpBuildActionButton$default3;
        }
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence) {
        copydefault(charSequence);
    }

    public static /* synthetic */ void setSecondaryButton$default(ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, java.lang.String str, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        viewOnClickListenerC39407prj.copydefault(str, onClickListener);
    }

    public static /* synthetic */ ViewOnClickListenerC39407prj addPrimaryButton$default(ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, java.lang.CharSequence charSequence, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        return viewOnClickListenerC39407prj.OLrzqt(charSequence, onClickListener);
    }

    public final ViewOnClickListenerC39407prj OLrzqt(@NotNull java.lang.CharSequence charSequence, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.valueOf.add(C56390yDp.OLrzqt(charSequence, onClickListener));
        return this;
    }

    public static /* synthetic */ void updatePadding$default(ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        viewOnClickListenerC39407prj.OLrzqt(i, i2, i3, i4);
    }

    private final void OLrzqt(int i, int i2, int i3, int i4) {
        wZL wzl = this.fetchVPNInfo;
        if (wzl != null) {
            wzl.getRoot().setPaddingRelative(0, i2, 0, 0);
            wzl.EZpvd.setPaddingRelative(i, 0, i3, i4);
        }
    }

    public static /* synthetic */ C52794wYp buildActionButton$default(ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return viewOnClickListenerC39407prj.KWHzl(i, i2);
    }

    public final C52794wYp KWHzl(int i, int i2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setPaddingRelative(KWHzl(), 0, KWHzl(), 0);
        c52794wYp.setEllipsize(TextUtils.TruncateAt.END);
        c52794wYp.setTextSize(15.0f);
        c52794wYp.setMaxLines(2);
        c52794wYp.setOKDSType(49);
        if (i == 0) {
            TextViewCompat.setTextAppearance(c52794wYp, i2 == 0 ? C52761wXj.LoaderManager.fFgQHt : C52761wXj.LoaderManager.gGvvIC);
            c52794wYp.setTextColor(this.fJNWhG);
        } else {
            TextViewCompat.setTextAppearance(c52794wYp, C52761wXj.LoaderManager.gGvvIC);
            c52794wYp.setTextColor(this.fARcdN);
        }
        c52794wYp.setLayoutParams(new LinearLayout.LayoutParams(-1, AEQbTJ()));
        return c52794wYp;
    }

    private final int KWHzl() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.djBIcL);
    }

    public final int AEQbTJ() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.copydefault);
    }

    public final LinearLayout.LayoutParams EZpvd() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public final int copydefault() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.valueOf);
    }

    public final void copydefault(android.view.ViewGroup viewGroup) {
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), C52761wXj.Activity.zuBGHE));
        viewGroup.addView(view, new ViewGroup.LayoutParams(-1, copydefault()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        try {
            dismiss();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void AEQbTJ(wZL wzl) {
        int iOLrzqt;
        int i;
        if (OLrzqt() == 2) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt2 = C55302xhQ.OLrzqt(context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iOLrzqt = java.lang.Math.max(iOLrzqt2, C55302xhQ.AEQbTJ(context2));
        } else {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iOLrzqt = C55302xhQ.OLrzqt(context3);
        }
        if (C34703nhO.AYXKKw(getContext())) {
            i = (int) (((double) iOLrzqt) * (OLrzqt() != 1 ? 0.4d : 0.75d));
        } else {
            i = iOLrzqt / 2;
        }
        this.EZpvd = i;
        if (i <= 0 || wzl.getRoot().getLayoutParams() == null) {
            return;
        }
        wzl.getRoot().getLayoutParams().width = this.EZpvd;
    }

    private final int OLrzqt() {
        int i = this.ejfBZ;
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return getContext().getResources().getConfiguration().orientation;
        }
        return 2;
    }
}
