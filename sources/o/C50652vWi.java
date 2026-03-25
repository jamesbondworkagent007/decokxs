package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50652vWi extends wXX {
    public int AYXKKw;
    public Function0<Unit> AkhnZx;
    public int DbNXlk;
    public AbstractC48412uQn OLrzqt;
    public Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> copydefault;
    public boolean djBIcL;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String KWHzl = "RecurringCycleStep2Sheet";
    public final C59534zip gEmmrt = new C59534zip();
    public final C59534zip valueOf = new C59534zip();
    public final java.util.ArrayList<C55795xqg> AhwBna = new java.util.ArrayList<>();
    public final java.util.ArrayList<C55795xqg> fetchVPNInfo = new java.util.ArrayList<>();
    public final boolean EZpvd = true;
    public final LinearSnapHelper values = new LinearSnapHelper();
    public final LinearSnapHelper isConnected = new LinearSnapHelper();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(int i) {
        this.DbNXlk = this.djBIcL ? i - 5 : i - 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(int i) {
        this.AYXKKw = this.djBIcL ? i - 5 : i - 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX INFO: renamed from: o.vWi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vWi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50652vWi EZpvd(@NotNull java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, boolean z, int i, int i2, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C50652vWi c50652vWi = new C50652vWi();
            c50652vWi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("periodList", list), C56390yDp.OLrzqt("periodSubList", list2), C56390yDp.OLrzqt("period_index", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("periodsub_index", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("isfullheight_key", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("title_key", str)));
            return c50652vWi;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("title_key")) != null) {
            str = string;
        }
        wxq.setStyle(2);
        wxq.setTitle(str);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = (AbstractC48412uQn) DataBindingUtil.inflate(getCustomLayoutInflater(), C48033uCm.Activity.UhxbNG, constraintLayout, true);
        copydefault();
        AbstractC48412uQn abstractC48412uQn = this.OLrzqt;
        if (abstractC48412uQn != null) {
            AEQbTJ(abstractC48412uQn);
            KWHzl(abstractC48412uQn);
            copydefault(abstractC48412uQn);
            OLrzqt(abstractC48412uQn);
        }
    }

    public final void AEQbTJ(AbstractC48412uQn abstractC48412uQn) {
        this.gEmmrt.register(C55795xqg.class, new ActionBar());
        this.values.attachToRecyclerView(abstractC48412uQn.KWHzl);
        abstractC48412uQn.KWHzl.setAdapter(this.gEmmrt);
        this.gEmmrt.setItems(this.AhwBna);
    }

    /* JADX INFO: renamed from: o.vWi$ActionBar */
    public static final class ActionBar extends AbstractC43310rmq<C55795xqg, AbstractC48451uRx> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48033uCm.Activity.DUUtXg;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC48451uRx> c43312rms, C55795xqg c55795xqg) {
            int iCopydefault;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c55795xqg, "");
            super.onBindViewHolder((C43312rms) c43312rms, c55795xqg);
            ((AbstractC48451uRx) c43312rms.OLrzqt()).EZpvd.setText(c55795xqg.EZpvd());
            android.widget.TextView textView = ((AbstractC48451uRx) c43312rms.OLrzqt()).EZpvd;
            if (c55795xqg.KWHzl()) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            }
            textView.setTextColor(iCopydefault);
        }
    }

    public final void OLrzqt(final AbstractC48412uQn abstractC48412uQn) {
        abstractC48412uQn.KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.vWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50652vWi.KWHzl(abstractC48412uQn, this);
            }
        }, 300L);
    }

    public static final void KWHzl(AbstractC48412uQn abstractC48412uQn, C50652vWi c50652vWi) {
        abstractC48412uQn.KWHzl.scrollBy(0, C55298xhM.dp2px$default(c50652vWi.AYXKKw * 52.0f, null, 1, null));
        RecyclerView recyclerView = abstractC48412uQn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            abstractC48412uQn.AEQbTJ.scrollBy(0, C55298xhM.dp2px$default(c50652vWi.DbNXlk * 52.0f, null, 1, null));
        }
        c50652vWi.KWHzl();
    }

    /* JADX INFO: renamed from: o.vWi$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50652vWi KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50652vWi c50652vWi) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c50652vWi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.AkhnZx;
                if (function0 != null) {
                    function0.invoke();
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vWi$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50652vWi KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50652vWi c50652vWi) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c50652vWi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.KWHzl.copydefault;
                if (function2 != null) {
                    function2.invoke(java.lang.Integer.valueOf(this.KWHzl.AYXKKw), java.lang.Integer.valueOf(this.KWHzl.DbNXlk));
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public final void KWHzl(AbstractC48412uQn abstractC48412uQn) {
        RecyclerView recyclerView = abstractC48412uQn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            this.valueOf.register(C55795xqg.class, new StateListAnimator());
            this.isConnected.attachToRecyclerView(abstractC48412uQn.AEQbTJ);
            abstractC48412uQn.AEQbTJ.setAdapter(this.valueOf);
            this.valueOf.setItems(this.fetchVPNInfo);
            abstractC48412uQn.AEQbTJ.scrollBy(0, C55298xhM.dp2px$default((this.DbNXlk + 1) * 52.0f, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: o.vWi$StateListAnimator */
    public static final class StateListAnimator extends AbstractC43310rmq<C55795xqg, AbstractC48451uRx> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48033uCm.Activity.DUUtXg;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC48451uRx> c43312rms, C55795xqg c55795xqg) {
            int iCopydefault;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c55795xqg, "");
            super.onBindViewHolder((C43312rms) c43312rms, c55795xqg);
            ((AbstractC48451uRx) c43312rms.OLrzqt()).EZpvd.setText(c55795xqg.EZpvd());
            android.widget.TextView textView = ((AbstractC48451uRx) c43312rms.OLrzqt()).EZpvd;
            if (c55795xqg.KWHzl()) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            }
            textView.setTextColor(iCopydefault);
        }
    }

    /* JADX INFO: renamed from: o.vWi$Fragment */
    public static final class Fragment implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC48412uQn KWHzl;
        public final /* synthetic */ C50652vWi OLrzqt;

        public Fragment(AbstractC48412uQn abstractC48412uQn, C50652vWi c50652vWi) {
            this.KWHzl = abstractC48412uQn;
            this.OLrzqt = c50652vWi;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.KWHzl.KWHzl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int iDp2px$default = C55298xhM.dp2px$default(this.OLrzqt.djBIcL ? 572.0f : 364.0f, null, 1, null);
            ViewGroup.LayoutParams layoutParams = this.KWHzl.KWHzl.getLayoutParams();
            layoutParams.height = iDp2px$default;
            this.KWHzl.KWHzl.setLayoutParams(layoutParams);
        }
    }

    public final void copydefault(AbstractC48412uQn abstractC48412uQn) {
        abstractC48412uQn.KWHzl.getViewTreeObserver().addOnGlobalLayoutListener(new Fragment(abstractC48412uQn, this));
        RecyclerView recyclerView = abstractC48412uQn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            abstractC48412uQn.AEQbTJ.getViewTreeObserver().addOnGlobalLayoutListener(new LoaderManager(abstractC48412uQn, this));
        }
    }

    /* JADX INFO: renamed from: o.vWi$LoaderManager */
    public static final class LoaderManager implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC48412uQn AEQbTJ;
        public final /* synthetic */ C50652vWi copydefault;

        public LoaderManager(AbstractC48412uQn abstractC48412uQn, C50652vWi c50652vWi) {
            this.AEQbTJ = abstractC48412uQn;
            this.copydefault = c50652vWi;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.AEQbTJ.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int iDp2px$default = C55298xhM.dp2px$default(this.copydefault.djBIcL ? 572.0f : 364.0f, null, 1, null);
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.AEQbTJ.getLayoutParams();
            layoutParams.height = iDp2px$default;
            this.AEQbTJ.AEQbTJ.setLayoutParams(layoutParams);
        }
    }

    private final void copydefault() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        RecyclerView recyclerView;
        java.util.ArrayList<java.lang.String> stringArrayList;
        java.util.ArrayList<java.lang.String> stringArrayList2;
        java.util.ArrayList<C55795xqg> arrayList3 = this.AhwBna;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (stringArrayList2 = arguments.getStringArrayList("periodList")) == null) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(stringArrayList2, 10));
            for (java.lang.String str : stringArrayList2) {
                Intrinsics.copydefault((java.lang.Object) str);
                arrayList.add(new C55795xqg(str, false, 2, null));
            }
        }
        arrayList3.addAll(arrayList);
        java.util.ArrayList<C55795xqg> arrayList4 = this.fetchVPNInfo;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (stringArrayList = arguments2.getStringArrayList("periodSubList")) == null) {
            arrayList2 = new java.util.ArrayList();
        } else {
            arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(stringArrayList, 10));
            for (java.lang.String str2 : stringArrayList) {
                Intrinsics.copydefault((java.lang.Object) str2);
                arrayList2.add(new C55795xqg(str2, false, 2, null));
            }
        }
        arrayList4.addAll(arrayList2);
        android.os.Bundle arguments3 = getArguments();
        this.AYXKKw = arguments3 != null ? arguments3.getInt("period_index") : 1;
        android.os.Bundle arguments4 = getArguments();
        this.DbNXlk = arguments4 != null ? arguments4.getInt("periodsub_index") : 1;
        if (C33129mqd.copydefault(java.lang.Integer.valueOf(this.AYXKKw), java.lang.Integer.valueOf(this.AhwBna.size()))) {
            this.AYXKKw = 0;
        } else {
            this.AhwBna.get(this.AYXKKw).OLrzqt(true);
        }
        if (C33129mqd.copydefault(java.lang.Integer.valueOf(this.DbNXlk), java.lang.Integer.valueOf(this.fetchVPNInfo.size()))) {
            this.DbNXlk = 0;
        } else {
            this.fetchVPNInfo.get(this.DbNXlk).OLrzqt(true);
        }
        android.os.Bundle arguments5 = getArguments();
        this.djBIcL = arguments5 != null ? arguments5.getBoolean("isfullheight_key") : false;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        int i = this.djBIcL ? 11 : 7;
        for (int i2 = 0; i2 < i - 2; i2++) {
            arrayList5.add(new C55795xqg("", false, 2, null));
        }
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(new C55795xqg("", false, 2, null));
        this.AhwBna.addAll(0, arrayListCopydefault);
        this.AhwBna.addAll(arrayList5);
        AbstractC48412uQn abstractC48412uQn = this.OLrzqt;
        if (abstractC48412uQn != null && (recyclerView = abstractC48412uQn.AEQbTJ) != null) {
            recyclerView.setVisibility(C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo) ? 0 : 8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo)) {
            this.fetchVPNInfo.addAll(0, arrayListCopydefault);
            this.fetchVPNInfo.addAll(arrayList5);
        }
    }

    /* JADX INFO: renamed from: o.vWi$TaskDescription */
    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                java.util.ArrayList arrayList = C50652vWi.this.AhwBna;
                C50652vWi c50652vWi = C50652vWi.this;
                int i2 = 0;
                for (java.lang.Object obj : arrayList) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    ((C55795xqg) obj).OLrzqt(i2 + (-1) == c50652vWi.AYXKKw);
                    i2++;
                }
                C50652vWi.this.gEmmrt.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            android.view.View viewFindSnapView;
            int position;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || (viewFindSnapView = C50652vWi.this.values.findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1) {
                return;
            }
            C50652vWi.this.OLrzqt(position);
        }
    }

    private final void KWHzl() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AbstractC48412uQn abstractC48412uQn = this.OLrzqt;
        if (abstractC48412uQn != null && (recyclerView2 = abstractC48412uQn.KWHzl) != null) {
            recyclerView2.addOnScrollListener(new TaskDescription());
        }
        AbstractC48412uQn abstractC48412uQn2 = this.OLrzqt;
        if (abstractC48412uQn2 == null || (recyclerView = abstractC48412uQn2.AEQbTJ) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Activity());
    }

    /* JADX INFO: renamed from: o.vWi$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                java.util.ArrayList arrayList = C50652vWi.this.fetchVPNInfo;
                C50652vWi c50652vWi = C50652vWi.this;
                int i2 = 0;
                for (java.lang.Object obj : arrayList) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    ((C55795xqg) obj).OLrzqt(i2 + (-1) == c50652vWi.DbNXlk);
                    i2++;
                }
                C50652vWi.this.valueOf.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            android.view.View viewFindSnapView;
            int position;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || (viewFindSnapView = C50652vWi.this.isConnected.findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1) {
                return;
            }
            C50652vWi.this.EZpvd(position);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.Ohcwxs));
        wyf.setOKDSSize(52);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new FragmentManager(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Dialog(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
        this.AkhnZx = null;
    }
}
