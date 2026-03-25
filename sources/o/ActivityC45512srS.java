package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.feedback.net.bean.FeedbackBountyBoldTitleItem;
import com.okinc.okex.feedback.net.bean.FeedbackBountyChapterItem;
import com.okinc.okex.feedback.net.bean.FeedbackBountyNormalItem;
import com.okinc.okex.feedback.net.bean.FeedbackBountySummaryBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.srS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC45512srS extends AbstractActivityC33041mov {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public AbstractC47319tnm OLrzqt;
    public FeedbackBountySummaryBean djBIcL;
    public C45573ssb valueOf;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.srZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC45512srS.djBIcL(this.AEQbTJ));
        }
    });
    public boolean copydefault = true;
    public final C43316rmw KWHzl = new C43316rmw();
    public final java.util.ArrayList<java.lang.Object> AhwBna = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.srV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45512srS.AYXKKw(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.srS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.srS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC45512srS.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_WHITELIST", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean copydefault() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean djBIcL(ActivityC45512srS activityC45512srS) {
        android.content.Intent intent = activityC45512srS.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("KEY_WHITELIST", false);
        }
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        AbstractC32952mnL<FeedbackBountySummaryBean> abstractC32952mnLEZpvd;
        super.onCreate(bundle);
        AbstractC47319tnm abstractC47319tnm = (AbstractC47319tnm) DataBindingUtil.setContentView(this, C47315tni.ActionBar.KWHzl);
        if (abstractC47319tnm != null) {
            abstractC47319tnm.setLifecycleOwner(this);
            abstractC47319tnm.KWHzl(getString(copydefault() ? C47315tni.PendingIntent.WS : C47315tni.PendingIntent.aUsmxb));
        } else {
            abstractC47319tnm = null;
        }
        this.OLrzqt = abstractC47319tnm;
        C45573ssb c45573ssb = (C45573ssb) new ViewModelProvider(this).get(C45573ssb.class);
        this.valueOf = c45573ssb;
        if (c45573ssb != null && (abstractC32952mnLEZpvd = c45573ssb.EZpvd()) != null) {
            abstractC32952mnLEZpvd.observe(this, KWHzl());
        }
        AEQbTJ();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ssd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45512srS.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final void gEmmrt(ActivityC45512srS activityC45512srS) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45512srS, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        RecyclerView recyclerView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        RecyclerView recyclerView2;
        this.KWHzl.register(FeedbackBountyNormalItem.class, new ActionBar());
        this.KWHzl.register(FeedbackBountyBoldTitleItem.class, new TaskDescription());
        this.KWHzl.register(FeedbackBountyChapterItem.class, new StateListAnimator());
        AbstractC47319tnm abstractC47319tnm = this.OLrzqt;
        if (abstractC47319tnm != null && (recyclerView2 = abstractC47319tnm.valueOf) != null) {
            recyclerView2.setLayoutManager(C33047mpA.KWHzl(this));
            recyclerView2.setAdapter(this.KWHzl);
        }
        EZpvd();
        AbstractC47319tnm abstractC47319tnm2 = this.OLrzqt;
        if (abstractC47319tnm2 != null && (textView3 = abstractC47319tnm2.AhwBna) != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.srX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45512srS.KWHzl(this.EZpvd, view);
                }
            });
        }
        AbstractC47319tnm abstractC47319tnm3 = this.OLrzqt;
        if (abstractC47319tnm3 != null && (textView2 = abstractC47319tnm3.AYXKKw) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.srY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45512srS.copydefault(this.AEQbTJ, view);
                }
            });
        }
        AbstractC47319tnm abstractC47319tnm4 = this.OLrzqt;
        if (abstractC47319tnm4 != null && (textView = abstractC47319tnm4.gEmmrt) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.srW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45512srS.gEmmrt(this.OLrzqt, view);
                }
            });
        }
        AbstractC47319tnm abstractC47319tnm5 = this.OLrzqt;
        if (abstractC47319tnm5 == null || (recyclerView = abstractC47319tnm5.valueOf) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Application());
    }

    public static final void KWHzl(ActivityC45512srS activityC45512srS, android.view.View view) {
        activityC45512srS.OLrzqt(activityC45512srS.djBIcL);
    }

    public static final void copydefault(ActivityC45512srS activityC45512srS, android.view.View view) {
        activityC45512srS.copydefault(activityC45512srS.djBIcL);
    }

    public static final void gEmmrt(ActivityC45512srS activityC45512srS, android.view.View view) {
        RecyclerView recyclerView;
        AbstractC47319tnm abstractC47319tnm = activityC45512srS.OLrzqt;
        if (abstractC47319tnm == null || (recyclerView = abstractC47319tnm.valueOf) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: o.srS$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            android.widget.TextView textView;
            android.widget.TextView textView2;
            RecyclerView recyclerView2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            AbstractC47319tnm abstractC47319tnm = ActivityC45512srS.this.OLrzqt;
            if (((abstractC47319tnm == null || (recyclerView2 = abstractC47319tnm.valueOf) == null) ? 0 : recyclerView2.computeVerticalScrollOffset()) > C33566myq.EZpvd.OLrzqt(ActivityC45512srS.this)) {
                AbstractC47319tnm abstractC47319tnm2 = ActivityC45512srS.this.OLrzqt;
                if (abstractC47319tnm2 == null || (textView2 = abstractC47319tnm2.gEmmrt) == null) {
                    return;
                }
                textView2.setVisibility(0);
                return;
            }
            AbstractC47319tnm abstractC47319tnm3 = ActivityC45512srS.this.OLrzqt;
            if (abstractC47319tnm3 == null || (textView = abstractC47319tnm3.gEmmrt) == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.srS$LoaderManager */
    public static final class LoaderManager extends AbstractC32992mnz<FeedbackBountySummaryBean> {
        public LoaderManager(C55237xgE c55237xgE, AbstractC32952mnL<FeedbackBountySummaryBean> abstractC32952mnL, int i) {
            super(c55237xgE, abstractC32952mnL, i);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(FeedbackBountySummaryBean feedbackBountySummaryBean) {
            Intrinsics.checkNotNullParameter(feedbackBountySummaryBean, "");
            return ActivityC45512srS.this.KWHzl(feedbackBountySummaryBean);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(FeedbackBountySummaryBean feedbackBountySummaryBean, android.view.View view) {
            Intrinsics.checkNotNullParameter(feedbackBountySummaryBean, "");
            super.AEQbTJ(feedbackBountySummaryBean, view);
            ActivityC45512srS activityC45512srS = ActivityC45512srS.this;
            activityC45512srS.EZpvd(activityC45512srS.copydefault(), feedbackBountySummaryBean);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, FeedbackBountySummaryBean feedbackBountySummaryBean, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, feedbackBountySummaryBean, view);
        }
    }

    public final LoaderManager KWHzl() {
        return (LoaderManager) this.AEQbTJ.getValue();
    }

    public static final LoaderManager AYXKKw(ActivityC45512srS activityC45512srS) {
        AbstractC47319tnm abstractC47319tnm = activityC45512srS.OLrzqt;
        C55237xgE c55237xgE = abstractC47319tnm != null ? abstractC47319tnm.djBIcL : null;
        C45573ssb c45573ssb = activityC45512srS.valueOf;
        return activityC45512srS.new LoaderManager(c55237xgE, c45573ssb != null ? c45573ssb.EZpvd() : null, C52761wXj.FragmentManager.fIwbmz);
    }

    public final boolean KWHzl(FeedbackBountySummaryBean feedbackBountySummaryBean) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getFeedbackTiers() : null))) {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getSevereErrors() : null))) {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getGeneralErrors() : null))) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getDisplayError() : null))) {
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getLanguageIssues() : null))) {
                            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getRulesAndEligibility() : null))) {
                                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getRiskLevel() : null))) {
                                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP5Vulnerability() : null))) {
                                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP4Vulnerability() : null))) {
                                            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP3Vulnerability() : null))) {
                                                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP2Vulnerability() : null))) {
                                                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP1Vulnerability() : null))) {
                                                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getVulnerabilitySubmissionTemplate() : null))) {
                                                            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getGeneralRulesOfRating() : null))) {
                                                                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getDisputeResolution() : null))) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void EZpvd() {
        android.widget.LinearLayout linearLayout;
        C33537myN c33537myN;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.LinearLayout linearLayout2;
        C33537myN c33537myN2;
        if (!copydefault()) {
            this.copydefault = false;
            AbstractC47319tnm abstractC47319tnm = this.OLrzqt;
            if (abstractC47319tnm != null && (c33537myN = abstractC47319tnm.AEQbTJ) != null) {
                c33537myN.setAppBarTitle(C33070mpX.AYXKKw(C47315tni.PendingIntent.DCUTEIdCUTEI));
            }
            AbstractC47319tnm abstractC47319tnm2 = this.OLrzqt;
            if (abstractC47319tnm2 == null || (linearLayout = abstractC47319tnm2.copydefault) == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        this.copydefault = true;
        AbstractC47319tnm abstractC47319tnm3 = this.OLrzqt;
        if (abstractC47319tnm3 != null && (c33537myN2 = abstractC47319tnm3.AEQbTJ) != null) {
            c33537myN2.setAppBarTitle(C33070mpX.AYXKKw(C47315tni.PendingIntent.WS));
        }
        AbstractC47319tnm abstractC47319tnm4 = this.OLrzqt;
        if (abstractC47319tnm4 != null && (linearLayout2 = abstractC47319tnm4.copydefault) != null) {
            linearLayout2.setVisibility(0);
        }
        AbstractC47319tnm abstractC47319tnm5 = this.OLrzqt;
        if (abstractC47319tnm5 != null && (textView2 = abstractC47319tnm5.AhwBna) != null) {
            textView2.setBackgroundResource(C52761wXj.TaskDescription.OqhRBM);
        }
        AbstractC47319tnm abstractC47319tnm6 = this.OLrzqt;
        if (abstractC47319tnm6 == null || (textView = abstractC47319tnm6.AYXKKw) == null) {
            return;
        }
        textView.setBackground(null);
    }

    public static /* synthetic */ void showContent$default(ActivityC45512srS activityC45512srS, boolean z, FeedbackBountySummaryBean feedbackBountySummaryBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC45512srS.EZpvd(z, feedbackBountySummaryBean);
    }

    public final void EZpvd(boolean z, FeedbackBountySummaryBean feedbackBountySummaryBean) {
        this.djBIcL = feedbackBountySummaryBean;
        if (this.copydefault) {
            OLrzqt(feedbackBountySummaryBean);
        } else {
            copydefault(feedbackBountySummaryBean);
        }
    }

    public final void OLrzqt(FeedbackBountySummaryBean feedbackBountySummaryBean) {
        RecyclerView recyclerView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        this.copydefault = true;
        AbstractC47319tnm abstractC47319tnm = this.OLrzqt;
        if (abstractC47319tnm != null && (textView2 = abstractC47319tnm.AhwBna) != null) {
            textView2.setBackgroundResource(C52761wXj.TaskDescription.OqhRBM);
        }
        AbstractC47319tnm abstractC47319tnm2 = this.OLrzqt;
        if (abstractC47319tnm2 != null && (textView = abstractC47319tnm2.AYXKKw) != null) {
            textView.setBackground(null);
        }
        this.AhwBna.clear();
        AbstractC47319tnm abstractC47319tnm3 = this.OLrzqt;
        if (abstractC47319tnm3 != null && (recyclerView = abstractC47319tnm3.valueOf) != null) {
            recyclerView.scrollToPosition(0);
        }
        if (!KWHzl(feedbackBountySummaryBean)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getFeedbackTiers() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.run);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList.add(new FeedbackBountyBoldTitleItem(strAYXKKw, feedbackBountySummaryBean.getFeedbackTiers()));
            }
            this.AhwBna.add(new FeedbackBountyChapterItem(C33070mpX.AYXKKw(C47315tni.PendingIntent.djBIcL)));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getSevereErrors() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList2 = this.AhwBna;
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47315tni.PendingIntent.DCUTEIddSDPG);
                int i = C47315tni.Application.AYXKKw;
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C47315tni.PendingIntent.zblBkD);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList2.add(new FeedbackBountyNormalItem(strAYXKKw2, i, strAYXKKw3, feedbackBountySummaryBean.getSevereErrors()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getGeneralErrors() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList3 = this.AhwBna;
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C47315tni.PendingIntent.zDUObI);
                int i2 = C47315tni.Application.AkhnZx;
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C47315tni.PendingIntent.fERRXa);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList3.add(new FeedbackBountyNormalItem(strAYXKKw4, i2, strAYXKKw5, feedbackBountySummaryBean.getGeneralErrors()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getDisplayError() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList4 = this.AhwBna;
                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C47315tni.PendingIntent.ixgjPv);
                int i3 = C47315tni.Application.values;
                java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C47315tni.PendingIntent.DGOPHZ);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList4.add(new FeedbackBountyNormalItem(strAYXKKw6, i3, strAYXKKw7, feedbackBountySummaryBean.getDisplayError()));
            }
            this.AhwBna.add(new FeedbackBountyChapterItem(C33070mpX.AYXKKw(C47315tni.PendingIntent.call)));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getLanguageIssues() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList5 = this.AhwBna;
                java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C47315tni.PendingIntent.Dmq);
                java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C47315tni.PendingIntent.spnCvw);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList5.add(new FeedbackBountyNormalItem(strAYXKKw8, -1, strAYXKKw9, feedbackBountySummaryBean.getLanguageIssues()));
            }
        }
        this.KWHzl.setItems(this.AhwBna);
        this.KWHzl.notifyDataSetChanged();
    }

    public final void copydefault(FeedbackBountySummaryBean feedbackBountySummaryBean) {
        RecyclerView recyclerView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        this.copydefault = false;
        AbstractC47319tnm abstractC47319tnm = this.OLrzqt;
        if (abstractC47319tnm != null && (textView2 = abstractC47319tnm.AhwBna) != null) {
            textView2.setBackground(null);
        }
        AbstractC47319tnm abstractC47319tnm2 = this.OLrzqt;
        if (abstractC47319tnm2 != null && (textView = abstractC47319tnm2.AYXKKw) != null) {
            textView.setBackgroundResource(C52761wXj.TaskDescription.OqhRBM);
        }
        this.AhwBna.clear();
        AbstractC47319tnm abstractC47319tnm3 = this.OLrzqt;
        if (abstractC47319tnm3 != null && (recyclerView = abstractC47319tnm3.valueOf) != null) {
            recyclerView.scrollToPosition(0);
        }
        if (!KWHzl(feedbackBountySummaryBean)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getRulesAndEligibility() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList = this.AhwBna;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.gtCCJH);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList.add(new FeedbackBountyBoldTitleItem(strAYXKKw, feedbackBountySummaryBean.getRulesAndEligibility()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getRiskLevel() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList2 = this.AhwBna;
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47315tni.PendingIntent.DGUQLIDGUQLI);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList2.add(new FeedbackBountyBoldTitleItem(strAYXKKw2, feedbackBountySummaryBean.getRiskLevel()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP5Vulnerability() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList3 = this.AhwBna;
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C47315tni.PendingIntent.zzQwtT);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList3.add(new FeedbackBountyNormalItem(strAYXKKw3, -1, (java.lang.String) null, feedbackBountySummaryBean.getP5Vulnerability(), 4, (DefaultConstructorMarker) null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP4Vulnerability() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList4 = this.AhwBna;
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C47315tni.PendingIntent.dzCpvv);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList4.add(new FeedbackBountyNormalItem(strAYXKKw4, -1, (java.lang.String) null, feedbackBountySummaryBean.getP4Vulnerability(), 4, (DefaultConstructorMarker) null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP3Vulnerability() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList5 = this.AhwBna;
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C47315tni.PendingIntent.QfJbVf);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList5.add(new FeedbackBountyNormalItem(strAYXKKw5, -1, (java.lang.String) null, feedbackBountySummaryBean.getP3Vulnerability(), 4, (DefaultConstructorMarker) null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP2Vulnerability() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList6 = this.AhwBna;
                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C47315tni.PendingIntent.awiJhF);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList6.add(new FeedbackBountyNormalItem(strAYXKKw6, -1, (java.lang.String) null, feedbackBountySummaryBean.getP2Vulnerability(), 4, (DefaultConstructorMarker) null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getP1Vulnerability() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList7 = this.AhwBna;
                java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C47315tni.PendingIntent.frkDMe);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList7.add(new FeedbackBountyNormalItem(strAYXKKw7, -1, (java.lang.String) null, feedbackBountySummaryBean.getP1Vulnerability(), 4, (DefaultConstructorMarker) null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getVulnerabilitySubmissionTemplate() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList8 = this.AhwBna;
                java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C47315tni.PendingIntent.gwwfep);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList8.add(new FeedbackBountyBoldTitleItem(strAYXKKw8, feedbackBountySummaryBean.getVulnerabilitySubmissionTemplate()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getGeneralRulesOfRating() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList9 = this.AhwBna;
                java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C47315tni.PendingIntent.YqksP);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList9.add(new FeedbackBountyBoldTitleItem(strAYXKKw9, feedbackBountySummaryBean.getGeneralRulesOfRating()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (feedbackBountySummaryBean != null ? feedbackBountySummaryBean.getDisputeResolution() : null))) {
                java.util.ArrayList<java.lang.Object> arrayList10 = this.AhwBna;
                java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C47315tni.PendingIntent.DGUQLIekVPG);
                Intrinsics.copydefault(feedbackBountySummaryBean);
                arrayList10.add(new FeedbackBountyBoldTitleItem(strAYXKKw10, feedbackBountySummaryBean.getDisputeResolution()));
            }
        }
        this.KWHzl.setItems(this.AhwBna);
        this.KWHzl.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.srS$TaskDescription */
    public final class TaskDescription extends AbstractC43310rmq<FeedbackBountyBoldTitleItem, AbstractC47429tpq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C47315tni.ActionBar.flVtFt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C47317tnk.fARcdN;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC47429tpq> c43312rms, @NotNull FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(feedbackBountyBoldTitleItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, feedbackBountyBoldTitleItem);
            android.widget.TextView textView = ((AbstractC47429tpq) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C45621stW.EZpvd(textView, feedbackBountyBoldTitleItem.getSummary(), 16);
        }
    }

    /* JADX INFO: renamed from: o.srS$ActionBar */
    public final class ActionBar extends AbstractC43310rmq<FeedbackBountyNormalItem, AbstractC47430tpr> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C47315tni.ActionBar.gkJEwt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C47317tnk.fARcdN;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC47430tpr> c43312rms, @NotNull FeedbackBountyNormalItem feedbackBountyNormalItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(feedbackBountyNormalItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, feedbackBountyNormalItem);
            if (feedbackBountyNormalItem.getIconRes() >= 0) {
                ((AbstractC47430tpr) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                ((AbstractC47430tpr) c43312rms.OLrzqt()).KWHzl.setImageResource(feedbackBountyNormalItem.getIconRes());
            } else {
                ((AbstractC47430tpr) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) feedbackBountyNormalItem.getAward())) {
                ((AbstractC47430tpr) c43312rms.OLrzqt()).EZpvd.setVisibility(0);
                ((AbstractC47430tpr) c43312rms.OLrzqt()).EZpvd.setText(feedbackBountyNormalItem.getAward());
            } else {
                ((AbstractC47430tpr) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
            }
            android.widget.TextView textView = ((AbstractC47430tpr) c43312rms.OLrzqt()).djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C45621stW.EZpvd(textView, feedbackBountyNormalItem.getSummary(), 16);
        }
    }

    /* JADX INFO: renamed from: o.srS$StateListAnimator */
    public final class StateListAnimator extends AbstractC43310rmq<FeedbackBountyChapterItem, AbstractC47434tpv> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C47315tni.ActionBar.AxsJAYaxsJAY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C47317tnk.fARcdN;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
