package o;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.uilab.dialog.OKDialog$onCreate$2;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xaY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnClickListenerC54939xaY extends AppCompatDialog implements View.OnClickListener {
    public int AEQbTJ;
    public C55022xcB AYXKKw;
    public final java.util.ArrayList<kotlin.Pair<android.view.View, java.lang.Integer>> AhwBna;
    public java.util.ArrayList<kotlin.Pair<java.lang.CharSequence, View.OnClickListener>> AkhnZx;
    public wZL AuCTel;
    public int AuCTelauCTel;
    public int AubY;
    public android.view.View DbNXlk;
    public final java.util.ArrayList<kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence>> OLrzqt;
    public android.widget.LinearLayout copydefault;
    public java.lang.CharSequence djBIcL;
    public C52794wYp ejfBZ;
    public int fARcdN;
    public View.OnClickListener fIwbmz;
    public java.lang.CharSequence fJNWhG;
    public android.widget.TextView fetchVPNInfo;
    public int gEmmrt;
    public int getFieldNames;
    public int getNewProxyInstance;
    public android.content.res.ColorStateList hDKMBd;
    public C52794wYp isConnected;
    public int iwGUEr;
    public android.content.res.ColorStateList uzCIH;
    public java.lang.String valueOf;
    public java.lang.CharSequence values;
    public int wlaJM;
    public boolean zLjUOn;
    private static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final InterfaceC56387yDm<java.lang.Float> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xbc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(ViewOnClickListenerC54939xaY.OLrzqt());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        this.fIwbmz = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AubY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.CharSequence charSequence, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.values = charSequence;
        this.fIwbmz = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewOnClickListenerC54939xaY KWHzl(@androidx.annotation.LayoutRes int i) {
        this.AEQbTJ = i;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC54939xaY(@NotNull android.content.Context context) {
        super(context, C52761wXj.LoaderManager.OqFWZa);
        Intrinsics.checkNotNullParameter(context, "");
        C52759wXh c52759wXh = C52759wXh.AEQbTJ;
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "");
        c52759wXh.OLrzqt(theme, C52761wXj.LoaderManager.fERRXa, C33512mxp.AEQbTJ.values());
        this.valueOf = "OKButtonedPopup";
        this.AhwBna = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.ArrayList<>();
        this.gEmmrt = -1;
        this.AkhnZx = new java.util.ArrayList<>();
        this.AuCTelauCTel = C55298xhM.OLrzqt(24, context);
        this.wlaJM = C55298xhM.OLrzqt(24, context);
        this.getFieldNames = C55298xhM.OLrzqt(24, context);
        this.fARcdN = C55298xhM.OLrzqt(24, context);
        KWHzl(ContextCompat.getColorStateList(context, C52761wXj.Activity.DcMfJKfbSiEC));
        copydefault(ContextCompat.getColorStateList(context, C52761wXj.Activity.DcMfJKfbSiEC));
    }

    /* JADX INFO: renamed from: o.xaY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xaY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final float OLrzqt(android.content.Context context) {
            return context.getResources().getDimension(C52761wXj.StateListAnimator.EZpvd);
        }

        public final float OLrzqt() {
            return ((java.lang.Number) ViewOnClickListenerC54939xaY.EZpvd.getValue()).floatValue();
        }
    }

    public static final float OLrzqt() {
        return Companion.OLrzqt(C52762wXk.AEQbTJ());
    }

    public final void KWHzl(android.content.res.ColorStateList colorStateList) {
        this.hDKMBd = colorStateList;
        C52794wYp c52794wYp = this.isConnected;
        if (c52794wYp != null) {
            c52794wYp.setTextColor(colorStateList);
        }
    }

    public final void copydefault(android.content.res.ColorStateList colorStateList) {
        this.uzCIH = colorStateList;
        C52794wYp c52794wYp = this.ejfBZ;
        if (c52794wYp != null) {
            c52794wYp.setTextColor(colorStateList);
        }
    }

    public final void OLrzqt(int i) {
        this.getNewProxyInstance = i;
        KWHzl(android.content.res.ColorStateList.valueOf(i));
    }

    public final void AEQbTJ(int i) {
        this.iwGUEr = i;
        copydefault(android.content.res.ColorStateList.valueOf(i));
    }

    private final void KWHzl(java.lang.CharSequence charSequence) {
        this.fJNWhG = charSequence;
        C55022xcB c55022xcB = this.AYXKKw;
        if (c55022xcB != null) {
            c55022xcB.setTitleAndMessage(charSequence, this.djBIcL);
        }
    }

    private final void AEQbTJ(java.lang.CharSequence charSequence) {
        this.djBIcL = charSequence;
        C55022xcB c55022xcB = this.AYXKKw;
        if (c55022xcB != null) {
            c55022xcB.setTitleAndMessage(this.fJNWhG, charSequence);
        }
        android.widget.TextView textView = this.fetchVPNInfo;
        if (textView != null) {
            textView.setText(this.djBIcL);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        C55118xds c55118xdsCopydefault;
        android.view.ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        wZL wzlAEQbTJ = wZL.AEQbTJ(getLayoutInflater());
        setContentView(wzlAEQbTJ.getRoot());
        Intrinsics.copydefault(wzlAEQbTJ);
        EZpvd(wzlAEQbTJ);
        wzlAEQbTJ.getRoot().setMaxHeightPercent(0.6f);
        wzlAEQbTJ.getRoot().setTag(C52761wXj.FragmentManager.DGOPHZDGOPHZ, "Dialog");
        copydefault(wzlAEQbTJ);
        this.AuCTel = wzlAEQbTJ;
        C55118xds c55118xdsCopydefault2 = wzlAEQbTJ.getRoot();
        if (c55118xdsCopydefault2 != null) {
            c55118xdsCopydefault2.setClipToOutline(true);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKDialog$onCreate$2(this, null), 3, null);
        wZL wzl = this.AuCTel;
        if (wzl != null && (c55118xdsCopydefault = wzl.getRoot()) != null && (viewTreeObserver = c55118xdsCopydefault.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator());
        }
        KWHzl(this.AuCTelauCTel, this.wlaJM, this.getFieldNames, this.fARcdN);
    }

    /* JADX INFO: renamed from: o.xaY$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C55118xds c55118xdsCopydefault;
            android.view.ViewTreeObserver viewTreeObserver;
            android.widget.LinearLayout linearLayout;
            ViewGroup.LayoutParams layoutParams;
            if (ViewOnClickListenerC54939xaY.this.AuCTel != null) {
                wZL wzl = ViewOnClickListenerC54939xaY.this.AuCTel;
                if ((wzl != null ? wzl.getRoot() : null) == null || ViewOnClickListenerC54939xaY.this.isConnected == null) {
                    return;
                }
                wZL wzl2 = ViewOnClickListenerC54939xaY.this.AuCTel;
                Intrinsics.copydefault(wzl2);
                int measuredHeight = wzl2.getRoot().getMeasuredHeight();
                android.content.Context context = ViewOnClickListenerC54939xaY.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iKWHzl = C55298xhM.KWHzl(48.0f, context);
                C52794wYp c52794wYp = ViewOnClickListenerC54939xaY.this.isConnected;
                Intrinsics.copydefault(c52794wYp);
                int measuredHeight2 = (measuredHeight - iKWHzl) - c52794wYp.getMeasuredHeight();
                if (ViewOnClickListenerC54939xaY.this.zLjUOn && ViewOnClickListenerC54939xaY.this.ejfBZ != null) {
                    C52794wYp c52794wYp2 = ViewOnClickListenerC54939xaY.this.ejfBZ;
                    Intrinsics.copydefault(c52794wYp2);
                    measuredHeight2 -= c52794wYp2.getMeasuredHeight();
                }
                wZL wzl3 = ViewOnClickListenerC54939xaY.this.AuCTel;
                if (wzl3 != null && (linearLayout = wzl3.EZpvd) != null && (layoutParams = linearLayout.getLayoutParams()) != null) {
                    layoutParams.height = measuredHeight2;
                }
                wZL wzl4 = ViewOnClickListenerC54939xaY.this.AuCTel;
                if (wzl4 == null || (c55118xdsCopydefault = wzl4.getRoot()) == null || (viewTreeObserver = c55118xdsCopydefault.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        KWHzl(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        if (this.zLjUOn) {
            return;
        }
        this.zLjUOn = true;
        android.widget.LinearLayout linearLayout = this.copydefault;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            linearLayout.setOrientation(1);
            C52794wYp c52794wYp = this.isConnected;
            C52794wYp c52794wYp2 = null;
            if (c52794wYp != null) {
                c52794wYp.setContentDescription("primaryButton");
                c52794wYp.setButtonCornerRadius(0.0f);
                c52794wYp.setTextColor(this.hDKMBd);
            } else {
                c52794wYp = null;
            }
            linearLayout.addView(c52794wYp, new ViewGroup.LayoutParams(-1, gEmmrt()));
            copydefault(linearLayout);
            C52794wYp c52794wYp3 = this.ejfBZ;
            if (c52794wYp3 != null) {
                c52794wYp3.setContentDescription("secondaryButton");
                C52794wYp.setButtonCornerRadius$default(c52794wYp3, 0.0f, 1, null);
                Activity activity = Companion;
                c52794wYp3.setLeftBottomRadius$OKUILib_uilib(activity.OLrzqt());
                c52794wYp3.setRightBottomRadius$OKUILib_uilib(activity.OLrzqt());
                c52794wYp3.setTextColor(this.uzCIH);
                c52794wYp2 = c52794wYp3;
            }
            linearLayout.addView(c52794wYp2, new ViewGroup.LayoutParams(-1, gEmmrt()));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wYp.setButtonCornerRadius$default(o.wYp, float, int, java.lang.Object):void */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(wZL wzl) {
        boolean z;
        java.util.Iterator<kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence>> it;
        java.util.Iterator<T> it2;
        java.lang.CharSequence charSequence;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        wzl.getRoot().getLayoutParams().width = this.gEmmrt;
        java.lang.String str = this.valueOf;
        if (str != null) {
            C55118xds c55118xdsCopydefault = wzl.getRoot();
            this.DbNXlk = c55118xdsCopydefault;
            if (c55118xdsCopydefault != null) {
                c55118xdsCopydefault.setContentDescription(str);
            }
        }
        wzl.EZpvd.removeAllViews();
        int i = 2;
        android.util.AttributeSet attributeSet = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (C33129mqd.OLrzqt(this.fJNWhG)) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C55022xcB c55022xcB = new C55022xcB(context, attributeSet, i, z4 ? 1 : 0);
            c55022xcB.setTitleAndMessage(this.fJNWhG, this.djBIcL);
            wzl.EZpvd.addView(c55022xcB, AYXKKw());
            c55022xcB.OLrzqt().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            c55022xcB.copydefault().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.AYXKKw = c55022xcB;
        } else if (C33129mqd.OLrzqt(this.djBIcL)) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.dHguZz);
            appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.svhCHd));
            appCompatTextView.setText(this.djBIcL);
            TextViewCompat.setLineHeight(appCompatTextView, C55298xhM.sp2px$default(20.0f, null, 1, null));
            wzl.EZpvd.addView(appCompatTextView, AYXKKw());
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.fetchVPNInfo = appCompatTextView;
        } else {
            z = true;
            it = this.OLrzqt.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            boolean z5 = z;
            while (it.hasNext()) {
                kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence> next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence> pair = next;
                java.lang.CharSequence charSequenceComponent1 = pair.component1();
                java.lang.CharSequence charSequenceComponent2 = pair.component2();
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C55022xcB c55022xcB2 = new C55022xcB(context2, z3 ? 1 : 0, i, z2 ? 1 : 0);
                c55022xcB2.setTitleAndMessage(charSequenceComponent1, charSequenceComponent2);
                c55022xcB2.OLrzqt().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                c55022xcB2.copydefault().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                android.widget.LinearLayout linearLayout = wzl.EZpvd;
                LinearLayout.LayoutParams layoutParamsAYXKKw = AYXKKw();
                layoutParamsAYXKKw.topMargin = z5 ? 0 : C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
                Unit unit = Unit.INSTANCE;
                linearLayout.addView(c55022xcB2, layoutParamsAYXKKw);
                z5 = false;
            }
            if (this.AEQbTJ != 0) {
                android.view.View.inflate(getContext(), this.AEQbTJ, wzl.EZpvd);
            }
            it2 = this.AhwBna.iterator();
            while (it2.hasNext()) {
                kotlin.Pair pair2 = (kotlin.Pair) it2.next();
                android.widget.LinearLayout linearLayout2 = wzl.EZpvd;
                android.view.View view = (android.view.View) pair2.getFirst();
                ViewGroup.LayoutParams layoutParams = ((android.view.View) pair2.getFirst()).getLayoutParams();
                if (layoutParams == null) {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
                }
                marginLayoutParams.topMargin = (C33129mqd.OLrzqt(this.fJNWhG) || C33129mqd.OLrzqt(this.djBIcL) || (this.OLrzqt.isEmpty() ^ true)) ? ((java.lang.Number) pair2.getSecond()).intValue() : 0;
                Unit unit2 = Unit.INSTANCE;
                linearLayout2.addView(view, marginLayoutParams);
            }
            if (!C33129mqd.OLrzqt(this.values) && this.AkhnZx.size() == 1) {
                C55118xds c55118xdsCopydefault2 = wzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(c55118xdsCopydefault2, "");
                copydefault(c55118xdsCopydefault2);
                if (C33129mqd.OLrzqt(this.values)) {
                    android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(getContext());
                    linearLayout3.setOrientation(0);
                    linearLayout3.setLayoutParams(AYXKKw());
                    this.copydefault = linearLayout3;
                    wzl.getRoot().addView(this.copydefault);
                }
                C52794wYp c52794wYpBuildActionButton$default = buildActionButton$default(this, 1, 0, 2, null);
                C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default, 0.0f, 1, null);
                Activity activity = Companion;
                c52794wYpBuildActionButton$default.setLeftBottomRadius$OKUILib_uilib(activity.OLrzqt());
                c52794wYpBuildActionButton$default.setTextColor(this.uzCIH);
                ViewGroup.LayoutParams layoutParams2 = c52794wYpBuildActionButton$default.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.width = 0;
                layoutParams3.weight = 1.0f;
                c52794wYpBuildActionButton$default.setText(this.values);
                View.OnClickListener onClickListener = this.fIwbmz;
                if (onClickListener == null) {
                    onClickListener = this;
                }
                c52794wYpBuildActionButton$default.setOnClickListener(onClickListener);
                android.widget.LinearLayout linearLayout4 = this.copydefault;
                if (linearLayout4 != null) {
                    linearLayout4.addView(c52794wYpBuildActionButton$default);
                }
                c52794wYpBuildActionButton$default.setContentDescription("secondaryButton");
                this.ejfBZ = c52794wYpBuildActionButton$default;
                android.widget.LinearLayout linearLayout5 = this.copydefault;
                if (linearLayout5 != null) {
                    android.view.View view2 = new android.view.View(getContext());
                    view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), C52761wXj.Activity.iUnTnt));
                    linearLayout5.addView(view2, new ViewGroup.LayoutParams(AhwBna(), -1));
                }
                C52794wYp c52794wYpBuildActionButton$default2 = buildActionButton$default(this, 0, 0, 2, null);
                C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default2, 0.0f, 1, null);
                c52794wYpBuildActionButton$default2.setRightBottomRadius$OKUILib_uilib(activity.OLrzqt());
                c52794wYpBuildActionButton$default2.setTextColor(this.hDKMBd);
                ViewGroup.LayoutParams layoutParams4 = c52794wYpBuildActionButton$default2.getLayoutParams();
                Intrinsics.copydefault(layoutParams4, "");
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                layoutParams5.width = 0;
                layoutParams5.weight = 1.0f;
                c52794wYpBuildActionButton$default2.setText(this.AkhnZx.get(0).getFirst());
                View.OnClickListener second = this.AkhnZx.get(0).getSecond();
                if (second == null) {
                    second = this;
                }
                c52794wYpBuildActionButton$default2.setOnClickListener(second);
                android.widget.LinearLayout linearLayout6 = this.copydefault;
                if (linearLayout6 != null) {
                    linearLayout6.addView(c52794wYpBuildActionButton$default2);
                }
                c52794wYpBuildActionButton$default2.setContentDescription("primaryButton");
                this.isConnected = c52794wYpBuildActionButton$default2;
                return;
            }
            int i2 = 0;
            for (java.lang.Object obj : this.AkhnZx) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair3 = (kotlin.Pair) obj;
                C55118xds c55118xdsCopydefault3 = wzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(c55118xdsCopydefault3, "");
                copydefault(c55118xdsCopydefault3);
                C52794wYp c52794wYpOLrzqt = OLrzqt(0, i2);
                if (i2 == yDY.AuCTel(this.AkhnZx) && ((charSequence = this.values) == null || charSequence.length() == 0)) {
                    C52794wYp.setButtonCornerRadius$default(c52794wYpOLrzqt, 0.0f, 1, null);
                    Activity activity2 = Companion;
                    c52794wYpOLrzqt.setLeftBottomRadius$OKUILib_uilib(activity2.OLrzqt());
                    c52794wYpOLrzqt.setRightBottomRadius$OKUILib_uilib(activity2.OLrzqt());
                } else {
                    C52794wYp.setButtonCornerRadius$default(c52794wYpOLrzqt, 0.0f, 1, null);
                }
                c52794wYpOLrzqt.setTextColor(this.hDKMBd);
                c52794wYpOLrzqt.setText((java.lang.CharSequence) pair3.getFirst());
                View.OnClickListener onClickListener2 = (View.OnClickListener) pair3.getSecond();
                if (onClickListener2 == null) {
                    onClickListener2 = this;
                }
                c52794wYpOLrzqt.setOnClickListener(onClickListener2);
                c52794wYpOLrzqt.setContentDescription("primaryButton");
                this.isConnected = c52794wYpOLrzqt;
                wzl.getRoot().addView(this.isConnected);
                i2++;
            }
            if (C33129mqd.OLrzqt(this.values)) {
                return;
            }
            C55118xds c55118xdsCopydefault4 = wzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(c55118xdsCopydefault4, "");
            copydefault(c55118xdsCopydefault4);
            C52794wYp c52794wYpBuildActionButton$default3 = buildActionButton$default(this, 1, 0, 2, null);
            C52794wYp.setButtonCornerRadius$default(c52794wYpBuildActionButton$default3, 0.0f, 1, null);
            Activity activity3 = Companion;
            c52794wYpBuildActionButton$default3.setLeftBottomRadius$OKUILib_uilib(activity3.OLrzqt());
            c52794wYpBuildActionButton$default3.setRightBottomRadius$OKUILib_uilib(activity3.OLrzqt());
            c52794wYpBuildActionButton$default3.setTextColor(this.uzCIH);
            c52794wYpBuildActionButton$default3.setText(this.values);
            View.OnClickListener onClickListener3 = this.fIwbmz;
            if (onClickListener3 == null) {
                onClickListener3 = this;
            }
            c52794wYpBuildActionButton$default3.setOnClickListener(onClickListener3);
            wzl.getRoot().addView(c52794wYpBuildActionButton$default3);
            c52794wYpBuildActionButton$default3.setContentDescription("secondaryButton");
            this.ejfBZ = c52794wYpBuildActionButton$default3;
            return;
        }
        z = false;
        it = this.OLrzqt.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        boolean z52 = z;
        while (it.hasNext()) {
        }
        if (this.AEQbTJ != 0) {
        }
        it2 = this.AhwBna.iterator();
        while (it2.hasNext()) {
        }
        if (!C33129mqd.OLrzqt(this.values)) {
        }
        int i22 = 0;
        while (r0.hasNext()) {
        }
        if (C33129mqd.OLrzqt(this.values)) {
        }
    }

    /* JADX INFO: renamed from: o.xaY$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.widget.TextView EZpvd;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;
        public final /* synthetic */ float[] copydefault;

        public TaskDescription(android.widget.TextView textView, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, float[] fArr) {
            this.EZpvd = textView;
            this.KWHzl = viewOnClickListenerC54939xaY;
            this.copydefault = fArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onPreDraw() {
            int lineCount = this.EZpvd.getLineCount();
            if (lineCount > 1 && !this.KWHzl.zLjUOn) {
                this.KWHzl.djBIcL();
                return false;
            }
            if (lineCount > 1) {
                float[] fArr = this.copydefault;
                float f = fArr[0];
                if (f > 12.0f) {
                    android.widget.TextView textView = this.EZpvd;
                    float f2 = f - 2.0f;
                    fArr[0] = f2;
                    textView.setTextSize(f2);
                } else {
                    this.EZpvd.getViewTreeObserver().removeOnPreDrawListener(this);
                }
            }
            float[] fArr2 = this.copydefault;
            if (fArr2[0] < 12.0f) {
                fArr2[0] = 12.0f;
                this.EZpvd.setTextSize(12.0f);
            }
            return false;
        }
    }

    public final void KWHzl(android.widget.TextView textView) {
        textView.getViewTreeObserver().addOnPreDrawListener(new TaskDescription(textView, this, new float[]{15.0f}));
    }

    public final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt(view, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        android.view.View view = this.DbNXlk;
        if (view != null) {
            view.setContentDescription(str);
        }
    }

    public final void EZpvd(java.lang.CharSequence charSequence) {
        AEQbTJ(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(@androidx.annotation.StringRes int i) {
        setTitle(getContext().getString(i));
    }

    public final void copydefault(@androidx.annotation.StringRes int i) {
        EZpvd(getContext().getString(i));
    }

    public static /* synthetic */ void addTitleAndMessage$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        viewOnClickListenerC54939xaY.AEQbTJ(i, i2);
    }

    public final void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
        EZpvd(i != 0 ? getContext().getString(i) : null, i2 != 0 ? getContext().getString(i2) : null);
    }

    public static /* synthetic */ void setSecondaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.String str, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        viewOnClickListenerC54939xaY.AEQbTJ(str, onClickListener);
    }

    public static /* synthetic */ void setSecondaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.CharSequence charSequence, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        viewOnClickListenerC54939xaY.EZpvd(charSequence, onClickListener);
    }

    public static /* synthetic */ void setSecondaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, int i, View.OnClickListener onClickListener, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            onClickListener = null;
        }
        viewOnClickListenerC54939xaY.OLrzqt(i, onClickListener);
    }

    public final void OLrzqt(@androidx.annotation.StringRes int i, View.OnClickListener onClickListener) {
        java.lang.String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AEQbTJ(string, onClickListener);
    }

    public static /* synthetic */ ViewOnClickListenerC54939xaY addPrimaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, int i, View.OnClickListener onClickListener, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            onClickListener = null;
        }
        return viewOnClickListenerC54939xaY.EZpvd(i, onClickListener);
    }

    public final ViewOnClickListenerC54939xaY EZpvd(@androidx.annotation.StringRes int i, View.OnClickListener onClickListener) {
        java.lang.String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return AEQbTJ((java.lang.CharSequence) string, onClickListener);
    }

    public static /* synthetic */ void setPrimaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.CharSequence charSequence, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        viewOnClickListenerC54939xaY.OLrzqt(charSequence, onClickListener);
    }

    public final void OLrzqt(@NotNull java.lang.CharSequence charSequence, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(charSequence, onClickListener);
    }

    public static /* synthetic */ ViewOnClickListenerC54939xaY addTitleAndMessage$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        return viewOnClickListenerC54939xaY.EZpvd(charSequence, charSequence2);
    }

    public final ViewOnClickListenerC54939xaY EZpvd(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.OLrzqt.add(new kotlin.Pair<>(charSequence, charSequence2));
        return this;
    }

    public static /* synthetic */ ViewOnClickListenerC54939xaY addPrimaryButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.CharSequence charSequence, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        return viewOnClickListenerC54939xaY.AEQbTJ(charSequence, onClickListener);
    }

    public final ViewOnClickListenerC54939xaY AEQbTJ(@NotNull java.lang.CharSequence charSequence, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.AkhnZx.add(C56390yDp.OLrzqt(charSequence, onClickListener));
        return this;
    }

    public static /* synthetic */ ViewOnClickListenerC54939xaY addCustomView$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return viewOnClickListenerC54939xaY.OLrzqt(view, i);
    }

    public final ViewOnClickListenerC54939xaY OLrzqt(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna.add(C56390yDp.OLrzqt(view, java.lang.Integer.valueOf(i)));
        return this;
    }

    public static /* synthetic */ void updatePadding$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
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
        viewOnClickListenerC54939xaY.KWHzl(i, i2, i3, i4);
    }

    public final void KWHzl(int i, int i2, int i3, int i4) {
        this.AuCTelauCTel = i;
        this.wlaJM = i2;
        this.getFieldNames = i3;
        this.fARcdN = i4;
        wZL wzl = this.AuCTel;
        if (wzl != null) {
            wzl.getRoot().setPaddingRelative(0, i2, 0, 0);
            wzl.EZpvd.setPaddingRelative(i, 0, i3, i4);
        }
    }

    public static /* synthetic */ C52794wYp buildActionButton$default(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return viewOnClickListenerC54939xaY.OLrzqt(i, i2);
    }

    private final C52794wYp OLrzqt(int i, int i2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setPaddingRelative(valueOf(), 0, valueOf(), 0);
        c52794wYp.setEllipsize(TextUtils.TruncateAt.END);
        c52794wYp.setTextSize(15.0f);
        c52794wYp.setMaxLines(2);
        c52794wYp.setOKDSType(49);
        if (i == 0) {
            TextViewCompat.setTextAppearance(c52794wYp, i2 == 0 ? C52761wXj.LoaderManager.fFgQHt : C52761wXj.LoaderManager.gGvvIC);
            c52794wYp.setTextColor(this.hDKMBd);
        } else {
            TextViewCompat.setTextAppearance(c52794wYp, C52761wXj.LoaderManager.gGvvIC);
            c52794wYp.setTextColor(this.uzCIH);
        }
        c52794wYp.setLayoutParams(new LinearLayout.LayoutParams(-1, gEmmrt()));
        KWHzl(c52794wYp);
        return c52794wYp;
    }

    private final int valueOf() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.djBIcL);
    }

    private final int gEmmrt() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.copydefault);
    }

    private final LinearLayout.LayoutParams AYXKKw() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    private final int AhwBna() {
        return getContext().getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.valueOf);
    }

    private final void copydefault(android.view.ViewGroup viewGroup) {
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), C52761wXj.Activity.iUnTnt));
        viewGroup.addView(view, new ViewGroup.LayoutParams(-1, AhwBna()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        try {
            dismiss();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(wZL wzl) {
        int i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55302xhQ.OLrzqt(context);
        if (C34703nhO.AYXKKw(getContext())) {
            i = (int) (((double) iOLrzqt) * (values() != 1 ? 0.5d : 0.75d));
        } else {
            i = iOLrzqt / 2;
        }
        this.gEmmrt = i;
        if (i <= 0 || wzl.getRoot().getLayoutParams() == null) {
            return;
        }
        wzl.getRoot().getLayoutParams().width = this.gEmmrt;
    }

    private final int values() {
        int i = this.AubY;
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return getContext().getResources().getConfiguration().orientation;
        }
        return 2;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        WeakReference<android.widget.Toast> weakReferenceKWHzl;
        android.widget.Toast toast;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            C55328xhq c55328xhq = C55328xhq.OLrzqt;
            if (c55328xhq.EZpvd() && (weakReferenceKWHzl = c55328xhq.KWHzl()) != null && (toast = weakReferenceKWHzl.get()) != null) {
                toast.cancel();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
