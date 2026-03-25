package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.okex.center.bean.LandingTransactionDisplayModel;
import com.okinc.okex.center.ui.SupportHomeBaseActivity;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.fragment.SupportRecentTransactionsCardFragment;
import com.okinc.okex.center.ui.fragment.SupportSelfToolsCardFragment;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import com.okinc.okex.center.view.UnReadMsgFabToButtonTransformationBehavior;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45136skB {
    public final AbstractC47302tnV AEQbTJ;
    public final AppBarLayout.OnOffsetChangedListener AYXKKw;
    public final java.lang.Runnable EZpvd;
    public final AbstractC47283tnC KWHzl;
    public float OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.skB$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportHomeBaseActivity.PageState.values().length];
            try {
                iArr[SupportHomeBaseActivity.PageState.CONTENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupportHomeBaseActivity.PageState.LOADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportHomeBaseActivity.PageState.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public C45136skB(@NotNull AbstractC47283tnC abstractC47283tnC, @NotNull AbstractC47302tnV abstractC47302tnV) {
        Intrinsics.checkNotNullParameter(abstractC47283tnC, "");
        Intrinsics.checkNotNullParameter(abstractC47302tnV, "");
        this.KWHzl = abstractC47283tnC;
        this.AEQbTJ = abstractC47302tnV;
        this.OLrzqt = 1.0f;
        this.AYXKKw = new AppBarLayout.OnOffsetChangedListener() { // from class: o.skC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C45136skB.OLrzqt(this.AEQbTJ, appBarLayout, i);
            }
        };
        this.copydefault = true;
        this.EZpvd = new java.lang.Runnable() { // from class: o.skE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45136skB.AEQbTJ(this.EZpvd);
            }
        };
    }

    public final void AEQbTJ(float f) {
        float totalScrollRange = this.KWHzl.copydefault.getTotalScrollRange();
        float f2 = this.OLrzqt;
        if (1.0f > f2 || f2 > totalScrollRange) {
            return;
        }
        this.OLrzqt = f;
    }

    public static final void OLrzqt(C45136skB c45136skB, AppBarLayout appBarLayout, int i) {
        float totalScrollRange = c45136skB.KWHzl.copydefault.getTotalScrollRange() + i;
        float f = c45136skB.OLrzqt;
        c45136skB.EZpvd(totalScrollRange < f ? 1 - (totalScrollRange / f) : 0.0f);
    }

    public static final void AEQbTJ(C45136skB c45136skB) {
        AbstractC47283tnC abstractC47283tnC = c45136skB.KWHzl;
        android.widget.FrameLayout frameLayout = abstractC47283tnC.djBIcL;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        C55173xeu c55173xeu = abstractC47283tnC.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C55113xdn c55113xdn = abstractC47283tnC.fJNWhG;
        c55113xdn.playAnimation();
        Intrinsics.copydefault(c55113xdn);
        c55113xdn.setVisibility(0);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        abstractC47283tnC.AYXKKw.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        abstractC47283tnC.copydefault.addOnOffsetChangedListener(this.AYXKKw);
        ViewGroup.LayoutParams layoutParams = abstractC47283tnC.AuCTel.getLayoutParams();
        layoutParams.height = C33570myu.AEQbTJ(C32979mnm.EZpvd.OLrzqt());
        abstractC47283tnC.AuCTel.setLayoutParams(layoutParams);
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.heceqZ));
        try {
            Result.Application application = Result.Companion;
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            androidx.fragment.app.Fragment fragmentEZpvd = ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).EZpvd();
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.ULRxlR, fragmentEZpvd, fragmentEZpvd.getClass().getSimpleName());
            SupportSelfToolsCardFragment supportSelfToolsCardFragmentKWHzl = SupportSelfToolsCardFragment.Companion.KWHzl();
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.hBpjJd, supportSelfToolsCardFragmentKWHzl, supportSelfToolsCardFragmentKWHzl.getTAG());
            C45124sjq c45124sjqKWHzl = C45124sjq.Companion.KWHzl();
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.dHguZz, c45124sjqKWHzl, c45124sjqKWHzl.getTAG());
            C45175sko c45175skoOLrzqt = C45175sko.Companion.OLrzqt();
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.dmfpNf, c45175skoOLrzqt, c45175skoOLrzqt.getTAG());
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(fragmentTransactionBeginTransaction.commitAllowingStateLoss()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.log$default("Failed to load landing fragments: " + thM7380exceptionOrNullimpl.getMessage(), null, 2, null);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            abstractC47283tnC.isConnected.setText(str);
            android.widget.FrameLayout frameLayout = abstractC47283tnC.AhwBna;
            abstractC47283tnC.AYXKKw.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.DGUQLI));
            EZpvd(0.0f);
            frameLayout.post(new java.lang.Runnable() { // from class: o.skD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45136skB.EZpvd(this.OLrzqt, abstractC47283tnC);
                }
            });
            AppBarLayout appBarLayout = abstractC47283tnC.copydefault;
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
            appBarLayout.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
            return;
        }
        AppBarLayout appBarLayout2 = abstractC47283tnC.copydefault;
        Intrinsics.checkNotNullExpressionValue(appBarLayout2, "");
        appBarLayout2.setVisibility(8);
        AppCompatTextView appCompatTextView = abstractC47283tnC.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
    }

    public static final void EZpvd(C45136skB c45136skB, AbstractC47283tnC abstractC47283tnC) {
        c45136skB.AEQbTJ(abstractC47283tnC.copydefault.getTotalScrollRange() * 0.5f);
    }

    public final void EZpvd(float f) {
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        abstractC47283tnC.AYXKKw.setAlpha(f);
        abstractC47283tnC.OLrzqt.setAlpha(f);
        abstractC47283tnC.OLrzqt.setClickable(f > 0.0f);
    }

    public final void EZpvd(boolean z, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorRes int i2, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        abstractC47283tnC.OLrzqt.setImageResource(i);
        abstractC47283tnC.OLrzqt.setColorFilter(C33070mpX.copydefault(i2));
        EZpvd(z);
        abstractC47283tnC.OLrzqt.setClickable(true);
        C55296xhK.singleClick$default(abstractC47283tnC.OLrzqt, onClickListener, 0L, 2, (java.lang.Object) null);
        if (z) {
            float alpha = abstractC47283tnC.AYXKKw.getAlpha();
            abstractC47283tnC.OLrzqt.setAlpha(alpha);
            abstractC47283tnC.OLrzqt.setClickable(alpha > 0.0f);
        }
    }

    /* JADX INFO: renamed from: o.skB$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ OKAlertBanner EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, OKAlertBanner oKAlertBanner) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Intrinsics.copydefault(this.EZpvd);
                this.EZpvd.setVisibility(8);
            }
        }
    }

    public final void KWHzl(boolean z, @androidx.annotation.DrawableRes int i, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        android.widget.ImageView imageView = abstractC47283tnC.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 8 : 0);
        if (z) {
            return;
        }
        abstractC47283tnC.EZpvd.setImageResource(i);
        C55296xhK.singleClick$default(abstractC47283tnC.EZpvd, onClickListener, 0L, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(boolean z) {
        this.KWHzl.EZpvd.setImageResource(z ? C47315tni.Application.isConnected : C47315tni.Application.DbNXlk);
    }

    public final void KWHzl(boolean z) {
        android.widget.LinearLayout linearLayout = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.AEQbTJ.copydefault;
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.AEQbTJ.djBIcL.getHeight() - this.KWHzl.copydefault.getHeight();
        } else {
            layoutParams = null;
        }
        linearLayout2.setLayoutParams(layoutParams);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        copydefault(z);
        EZpvd(z2);
    }

    public final void copydefault(boolean z) {
        android.widget.RelativeLayout relativeLayout = this.KWHzl.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        relativeLayout.setVisibility(z ? 0 : 8);
    }

    public final void EZpvd(boolean z) {
        int i = z ? 0 : 8;
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        abstractC47283tnC.KWHzl.setVisibility(i);
        abstractC47283tnC.OLrzqt.setVisibility(i);
    }

    public static /* synthetic */ void setupSupportBanner$default(C45136skB c45136skB, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 4;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c45136skB.OLrzqt(str, str2, i, i2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OKAlertBanner oKAlertBanner = this.KWHzl.AEQbTJ;
        oKAlertBanner.setType(i);
        oKAlertBanner.setStyle(i2);
        oKAlertBanner.setTitle(str);
        oKAlertBanner.setMessage(str2);
        android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new ActionBar(imageViewOLrzqt, 1000L, oKAlertBanner));
        Intrinsics.copydefault(oKAlertBanner);
        oKAlertBanner.setVisibility(0);
    }

    public final void OLrzqt(@NotNull android.os.Handler handler, @NotNull SupportHomeBaseActivity.PageState pageState) {
        Intrinsics.checkNotNullParameter(handler, "");
        Intrinsics.checkNotNullParameter(pageState, "");
        AbstractC47283tnC abstractC47283tnC = this.KWHzl;
        int i = StateListAnimator.OLrzqt[pageState.ordinal()];
        if (i == 1) {
            handler.removeCallbacks(this.EZpvd);
            C55173xeu c55173xeu = abstractC47283tnC.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            C55113xdn c55113xdn = abstractC47283tnC.fJNWhG;
            Intrinsics.copydefault(c55113xdn);
            c55113xdn.setVisibility(8);
            c55113xdn.pauseAnimation();
            android.widget.FrameLayout frameLayout = abstractC47283tnC.djBIcL;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            return;
        }
        if (i == 2) {
            handler.postDelayed(this.EZpvd, this.copydefault ? 0L : 300L);
            this.copydefault = false;
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        handler.removeCallbacks(this.EZpvd);
        android.widget.FrameLayout frameLayout2 = abstractC47283tnC.djBIcL;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(8);
        C55113xdn c55113xdn2 = abstractC47283tnC.fJNWhG;
        Intrinsics.copydefault(c55113xdn2);
        c55113xdn2.setVisibility(8);
        c55113xdn2.pauseAnimation();
        C55173xeu c55173xeu2 = abstractC47283tnC.DbNXlk;
        C52794wYp c52794wYpAEQbTJ = c55173xeu2.AEQbTJ();
        c52794wYpAEQbTJ.setVisibility(c52794wYpAEQbTJ.hasOnClickListeners() ? 0 : 8);
        Intrinsics.copydefault(c55173xeu2);
        c55173xeu2.setVisibility(0);
    }

    public final void copydefault(ChatbotEntryDisplayModel chatbotEntryDisplayModel, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(transformableFloatingUnReadMsgActionButton, "");
        AbstractC47302tnV abstractC47302tnV = this.AEQbTJ;
        if (chatbotEntryDisplayModel != null && !chatbotEntryDisplayModel.getChatbotEnabled()) {
            android.widget.LinearLayout linearLayout = abstractC47302tnV.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            AEQbTJ((android.view.View) linearLayout, transformableFloatingUnReadMsgActionButton, false);
            transformableFloatingUnReadMsgActionButton.setVisibility(8);
            transformableFloatingUnReadMsgActionButton.setTag(null);
            C52794wYp c52794wYp = abstractC47302tnV.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            C52794wYp c52794wYp2 = abstractC47302tnV.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(8);
        } else if (z) {
            android.widget.LinearLayout linearLayout2 = abstractC47302tnV.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            AEQbTJ((android.view.View) linearLayout2, transformableFloatingUnReadMsgActionButton, true);
            C52794wYp c52794wYp3 = abstractC47302tnV.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(8);
            C52794wYp c52794wYp4 = abstractC47302tnV.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
            c52794wYp4.setVisibility(8);
            transformableFloatingUnReadMsgActionButton.setVisibility(0);
            transformableFloatingUnReadMsgActionButton.setTag(SupportHomeBaseActivity.StateListAnimator.TaskDescription.OLrzqt);
            java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C47315tni.PendingIntent.hUfVAv);
            Intrinsics.checkNotNullExpressionValue(string, "");
            transformableFloatingUnReadMsgActionButton.setTitleText(string);
        } else {
            android.widget.LinearLayout linearLayout3 = abstractC47302tnV.valueOf;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            AEQbTJ((android.view.View) linearLayout3, transformableFloatingUnReadMsgActionButton, true);
            C52794wYp c52794wYp5 = abstractC47302tnV.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp5, "");
            c52794wYp5.setVisibility(8);
            C52794wYp c52794wYp6 = abstractC47302tnV.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp6, "");
            c52794wYp6.setVisibility(8);
            transformableFloatingUnReadMsgActionButton.setVisibility(0);
            transformableFloatingUnReadMsgActionButton.setTag(SupportHomeBaseActivity.StateListAnimator.C0533StateListAnimator.copydefault);
            java.lang.String string2 = C32979mnm.EZpvd.OLrzqt().getString(C47315tni.PendingIntent.giSNqX);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            transformableFloatingUnReadMsgActionButton.setTitleText(string2);
        }
        if (chatbotEntryDisplayModel != null) {
            C52794wYp c52794wYp7 = abstractC47302tnV.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp7, "");
            if (c52794wYp7.getVisibility() == 0) {
                abstractC47302tnV.KWHzl.setText(chatbotEntryDisplayModel.getChatWithUsTitle());
                java.lang.String chatbotIcon = chatbotEntryDisplayModel.getChatbotIcon();
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) chatbotIcon)) {
                    function1.invoke(chatbotIcon);
                }
            }
        }
    }

    public final void AEQbTJ(android.view.View view, TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, boolean z) {
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        int iOLrzqt = C55298xhM.OLrzqt(84, (android.content.Context) applicationOLrzqt);
        int dimensionPixelSize = applicationOLrzqt.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QfsBiF);
        ViewGroup.LayoutParams layoutParams = transformableFloatingUnReadMsgActionButton.getLayoutParams();
        CoordinatorLayout.Behavior behavior = null;
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (z) {
                behavior = layoutParams2.getBehavior() != null ? layoutParams2.getBehavior() : new UnReadMsgFabToButtonTransformationBehavior(applicationOLrzqt, null);
            }
            layoutParams2.setBehavior(behavior);
        }
        if (!z) {
            iOLrzqt = dimensionPixelSize;
        }
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), iOLrzqt);
    }

    public final void OLrzqt(boolean z) {
        TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(transformableFloatingUnReadMsgActionButton, "");
        transformableFloatingUnReadMsgActionButton.AEQbTJ(z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.scx.log$default(java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull kotlin.Pair<java.lang.String, ? extends java.util.List<LandingTransactionDisplayModel>> pair) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String first = pair.getFirst();
        if (C44857seo.AEQbTJ(first)) {
            try {
                Result.Application application = Result.Companion;
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragmentOLrzqt = SupportRecentTransactionsCardFragment.Companion.OLrzqt(first, pair.getSecond());
                fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.dHguZz, supportRecentTransactionsCardFragmentOLrzqt, supportRecentTransactionsCardFragmentOLrzqt.getTAG());
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(fragmentTransactionBeginTransaction.commitAllowingStateLoss()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44760scx.log$default("Failed to load transaction landing fragments: " + thM7380exceptionOrNullimpl.getMessage(), null, 2, null);
            }
        }
    }
}
