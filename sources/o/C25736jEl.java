package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.material3.CalendarModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25736jEl extends kMD<TrackerTrendUIModel> {
    public final Function1<TrackerTrendUIModel, Unit> AEQbTJ;
    public final java.util.Map<kMF, android.os.CountDownTimer> AhwBna;
    public final Function1<TrackerTrendUIModel, Unit> EZpvd;
    public final java.util.Map<kMF, TrackerTrendUIModel> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final Function1<TrackerTrendUIModel, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25736jEl() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:31) call: o.jEj.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:32) call: o.jEr.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:33) call: o.jEs.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0021: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:34) call: o.jEp.<init>():void type: CONSTRUCTOR) : (r4v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:30) call: o.jEl.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C25736jEl(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.jEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25736jEl.KWHzl((TrackerTrendUIModel) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.jEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25736jEl.EZpvd((TrackerTrendUIModel) obj);
            }
        } : function12, (i & 4) != 0 ? new Function1() { // from class: o.jEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25736jEl.valueOf((TrackerTrendUIModel) obj);
            }
        } : function13, (i & 8) != 0 ? new Function1() { // from class: o.jEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25736jEl.OLrzqt((java.lang.String) obj);
            }
        } : function14);
    }

    public static final Unit KWHzl(TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25736jEl(@NotNull Function1<? super TrackerTrendUIModel, Unit> function1, @NotNull Function1<? super TrackerTrendUIModel, Unit> function12, @NotNull Function1<? super TrackerTrendUIModel, Unit> function13, @NotNull Function1<? super java.lang.String, Unit> function14) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.AEQbTJ = function1;
        this.EZpvd = function12;
        this.copydefault = function13;
        this.OLrzqt = function14;
        this.AhwBna = new LinkedHashMap();
        this.KWHzl = new LinkedHashMap();
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hER herCopydefault = hER.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(herCopydefault, "");
        return herCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull kMF kmf) {
        Intrinsics.checkNotNullParameter(kmf, "");
        super.onViewRecycled(kmf);
        copydefault(kmf);
        this.KWHzl.remove(kmf);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hER her = viewBindingAEQbTJ instanceof hER ? (hER) viewBindingAEQbTJ : null;
        if (her == null) {
            return;
        }
        this.KWHzl.put(kmf, trackerTrendUIModel);
        copydefault(kmf);
        android.widget.LinearLayout root = her.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, trackerTrendUIModel));
        AppCompatImageView appCompatImageView = her.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.copydefault(appCompatImageView, trackerTrendUIModel.values(), C55298xhM.dp2px$default(4.0f, null, 1, null));
        her.fetchVPNInfo.setText(trackerTrendUIModel.isConnected());
        her.DbNXlk.setText(trackerTrendUIModel.AkhnZx());
        her.isConnected.setText(trackerTrendUIModel.OLrzqt());
        if (trackerTrendUIModel.AhwBna().length() == 0) {
            AppCompatImageView appCompatImageView2 = her.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView3 = her.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(0);
            AppCompatImageView appCompatImageView4 = her.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            C28884kjG.EZpvd(appCompatImageView4, trackerTrendUIModel.AhwBna(), C55298xhM.dp2px$default(2.0f, null, 1, null), trackerTrendUIModel.AYXKKw(), trackerTrendUIModel.EZpvd(), C52761wXj.TaskDescription.dzCpvv, C55298xhM.dp2px$default(2.0f, null, 1, null), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)));
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(her.getRoot().getContext().getColor(C52761wXj.Activity.ORxRYg));
        her.EZpvd.setImageDrawable(gradientDrawable);
        android.widget.TextView textView = her.AEQbTJ;
        android.content.Context context = her.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(pTD.EZpvd(context, C23274hvD.FragmentManager.gEmmrt, trackerTrendUIModel.copydefault(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(trackerTrendUIModel.copydefault())))));
        her.values.setText(trackerTrendUIModel.DbNXlk());
        android.widget.TextView textView2 = her.AhwBna;
        android.content.Context context2 = her.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView2.setText(C33069mpW.KWHzl(context2, C23274hvD.Fragment.playFromSearch, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getSymbol()))));
        C52794wYp c52794wYp = her.OLrzqt;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, trackerTrendUIModel));
        OLrzqt(her, trackerTrendUIModel);
        AppCompatImageView appCompatImageView5 = her.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
        appCompatImageView5.setVisibility(trackerTrendUIModel.gEmmrt() ? 0 : 8);
        android.widget.LinearLayout linearLayout = her.AuCTel;
        linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this, trackerTrendUIModel));
        copydefault(kmf, trackerTrendUIModel);
        OLrzqt(kmf, trackerTrendUIModel);
    }

    public final void OLrzqt(hER her, final TrackerTrendUIModel trackerTrendUIModel) {
        kMM kmm = new kMM();
        kmm.register(TrendTraderUIModel.class, new C25739jEo(this.OLrzqt, new Function0() { // from class: o.jEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25736jEl.EZpvd(this.OLrzqt, trackerTrendUIModel);
            }
        }));
        RecyclerView recyclerView = her.fARcdN;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(kmm);
        recyclerView.setNestedScrollingEnabled(false);
        kmm.setItems(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) trackerTrendUIModel.AuCTel(), 3));
        kmm.notifyDataSetChanged();
    }

    public static final Unit EZpvd(C25736jEl c25736jEl, TrackerTrendUIModel trackerTrendUIModel) {
        c25736jEl.copydefault.invoke(trackerTrendUIModel);
        return Unit.INSTANCE;
    }

    public final void copydefault(kMF kmf, TrackerTrendUIModel trackerTrendUIModel) {
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hER her = viewBindingAEQbTJ instanceof hER ? (hER) viewBindingAEQbTJ : null;
        if (her == null) {
            return;
        }
        int i = java.lang.System.currentTimeMillis() - trackerTrendUIModel.valueOf() < CalendarModelKt.MillisecondsIn24Hours ? C52761wXj.Activity.RWIpjU : C52761wXj.Activity.QwvEab;
        her.AkhnZx.setText(C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trackerTrendUIModel.valueOf())));
        her.AkhnZx.setTextColor(her.getRoot().getContext().getColor(i));
    }

    public final void OLrzqt(kMF kmf, TrackerTrendUIModel trackerTrendUIModel) {
        copydefault(kmf);
        Application application = new Application(kmf, trackerTrendUIModel);
        this.AhwBna.put(kmf, application);
        application.start();
    }

    /* JADX INFO: renamed from: o.jEl$Application */
    public static final class Application extends android.os.CountDownTimer {
        public final /* synthetic */ TrackerTrendUIModel AEQbTJ;
        public final /* synthetic */ kMF copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(kMF kmf, TrackerTrendUIModel trackerTrendUIModel) {
            super(Long.MAX_VALUE, 1000L);
            this.copydefault = kmf;
            this.AEQbTJ = trackerTrendUIModel;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            TrackerTrendUIModel trackerTrendUIModel = (TrackerTrendUIModel) C25736jEl.this.KWHzl.get(this.copydefault);
            if (Intrinsics.EZpvd((java.lang.Object) (trackerTrendUIModel != null ? trackerTrendUIModel.djBIcL() : null), (java.lang.Object) this.AEQbTJ.djBIcL())) {
                C25736jEl.this.copydefault(this.copydefault, this.AEQbTJ);
            } else {
                cancel();
                C25736jEl.this.AhwBna.remove(this.copydefault);
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C25736jEl.this.AhwBna.remove(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.jEl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TrackerTrendUIModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C25736jEl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25736jEl c25736jEl, TrackerTrendUIModel trackerTrendUIModel) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c25736jEl;
            this.EZpvd = trackerTrendUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.copydefault.invoke(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.jEl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ TrackerTrendUIModel EZpvd;
        public final /* synthetic */ C25736jEl KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25736jEl c25736jEl, TrackerTrendUIModel trackerTrendUIModel) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c25736jEl;
            this.EZpvd = trackerTrendUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.jEl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TrackerTrendUIModel AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25736jEl KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25736jEl c25736jEl, TrackerTrendUIModel trackerTrendUIModel) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c25736jEl;
            this.AEQbTJ = trackerTrendUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.invoke(this.AEQbTJ);
            }
        }
    }

    private final void copydefault(kMF kmf) {
        android.os.CountDownTimer countDownTimer = this.AhwBna.get(kmf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.AhwBna.remove(kmf);
    }
}
