package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.core.ktx.MatchPattern;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46731tch extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C42948rfz EZpvd;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.tch$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tch.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C46731tch OLrzqt(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str) {
            C46731tch c46731tch = new C46731tch();
            c46731tch.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("showValidator", bool), C56390yDp.OLrzqt("showBoost", bool2), C56390yDp.OLrzqt("boostRate", str)));
            return c46731tch;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.DGUQLIhJrIAr));
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C42948rfz.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("showValidator", false) : false;
        android.os.Bundle arguments2 = getArguments();
        boolean z2 = arguments2 != null ? arguments2.getBoolean("showBoost", false) : false;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str = (arguments3 == null || (string = arguments3.getString("boostRate")) == null) ? "" : string;
        C42948rfz c42948rfz = this.EZpvd;
        if (c42948rfz != null) {
            int iAEQbTJ = AEQbTJ();
            if (z) {
                ConstraintLayout constraintLayout2 = c42948rfz.KWHzl;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
                AppCompatImageView appCompatImageView = c42948rfz.AEQbTJ;
                appCompatImageView.setImageTintList(ContextCompat.getColorStateList(appCompatImageView.getContext(), iAEQbTJ));
                c42948rfz.djBIcL.setText(C33070mpX.AYXKKw(qZH.PendingIntent.YqksP));
                c42948rfz.AYXKKw.setText(C33070mpX.AYXKKw(qZH.PendingIntent.awiJhF));
            } else {
                ConstraintLayout constraintLayout3 = c42948rfz.KWHzl;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                constraintLayout3.setVisibility(8);
            }
            if (z2) {
                java.lang.String localizationStringWithPrecision$default = pTB.toLocalizationStringWithPrecision$default(C33129mqd.addS$default("1", str, null, null, null, 14, null), 1, 2, RoundingMode.FLOOR, null, 8, null);
                ConstraintLayout constraintLayout4 = c42948rfz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                constraintLayout4.setVisibility(0);
                AppCompatImageView appCompatImageView2 = c42948rfz.copydefault;
                appCompatImageView2.setImageTintList(ContextCompat.getColorStateList(appCompatImageView2.getContext(), iAEQbTJ));
                c42948rfz.valueOf.setText(C33069mpW.copydefault(qZH.PendingIntent.dzCpvv, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", "x" + localizationStringWithPrecision$default))));
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.frkDMe);
                c42948rfz.AhwBna.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(qZH.PendingIntent.DSiOMJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt("percent", localizationStringWithPrecision$default), C56390yDp.OLrzqt(MTCommonConstants.Lifecycle.KEY_ACTIVITY, strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.tcf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C46731tch.OLrzqt(this.EZpvd, (java.util.List) obj);
                    }
                }, 10, null));
                c42948rfz.AhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            } else {
                ConstraintLayout constraintLayout5 = c42948rfz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
                constraintLayout5.setVisibility(8);
            }
        }
        Function1<? super java.lang.String, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke("click_tag_icon");
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.tch$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            xWA xwa;
            Intrinsics.checkNotNullParameter(view, "");
            Function1<java.lang.String, Unit> function1Copydefault = C46731tch.this.copydefault();
            if (function1Copydefault != null) {
                function1Copydefault.invoke("click_boost_activity");
            }
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
            if (listKWHzl != null && (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                xwa.AEQbTJ(context);
            }
            C46731tch.this.dismissAllowingStateLoss();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.svhCHd));
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit OLrzqt(C46731tch c46731tch, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(c46731tch.new Activity());
        return Unit.INSTANCE;
    }

    public final int AEQbTJ() {
        return C33512mxp.AEQbTJ.AYXKKw() == 0 ? C52761wXj.Activity.DcMfJK : C52761wXj.Activity.dvKsVJ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
    }
}
