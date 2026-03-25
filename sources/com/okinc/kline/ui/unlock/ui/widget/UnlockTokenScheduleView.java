package com.okinc.kline.ui.unlock.ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC36095oPb;
import o.C32866mlf;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C35964oKf;
import o.C39703pxO;
import o.C39709pxU;
import o.C39739pxy;
import o.C39768pya;
import o.C39769pyb;
import o.C39778pyk;
import o.C39783pyp;
import o.C39785pyr;
import o.C43316rmw;
import o.C52761wXj;
import o.C54984xbQ;
import o.C55051xce;
import o.C55173xeu;
import o.C55237xgE;
import o.C55296xhK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56407yEf;
import o.C56548yJl;
import o.InterfaceC35978oKt;
import o.pTA;
import o.pTB;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenScheduleView extends ConstraintLayout implements DefaultLifecycleObserver, InterfaceC35978oKt {
    public AbstractC36095oPb AEQbTJ;
    public final C43316rmw AhwBna;
    public final String EZpvd;
    public final C39739pxy KWHzl;
    public LifecycleOwner OLrzqt;
    public Function1<? super Integer, Unit> copydefault;
    public final C39769pyb djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39739pxy EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35978oKt
    public void setDataDidLoadedCallBack(Function1<? super Integer, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:66) call: com.okinc.kline.ui.unlock.ui.widget.UnlockTokenScheduleView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ UnlockTokenScheduleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C35964oKf.Application.DPHsZd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC36095oPb) viewDataBindingInflate;
        this.djBIcL = new C39769pyb();
        this.EZpvd = "UnlockTokenScheduleView";
        this.KWHzl = new C39739pxy();
        this.AhwBna = new C43316rmw();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        C39778pyk c39778pyk = this.AEQbTJ.fetchVPNInfo;
        c39778pyk.getAxisRight().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getXAxis().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getXAxis().setAxisLineColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getAxisRight().setAxisLineColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        this.OLrzqt = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        AEQbTJ();
        OLrzqt();
        valueOf();
    }

    public static final class ActionBar<T> implements Comparator {
        public final /* synthetic */ Map OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Map map) {
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((Integer) this.OLrzqt.get((LineDataSet) t2), (Integer) this.OLrzqt.get((LineDataSet) t));
        }
    }

    public static final class PictureInPictureParams<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((C39709pxU) t2).gEmmrt()), Integer.valueOf(((C39709pxU) t).gEmmrt()));
        }
    }

    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "7d", false, 4, null);
        }
    }

    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager KWHzl = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "30d", false, 4, null);
        }
    }

    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog OLrzqt = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "1y", false, 4, null);
        }
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ UnlockTokenScheduleView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(View view, long j, UnlockTokenScheduleView unlockTokenScheduleView) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = unlockTokenScheduleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.fetchVPNInfo.highlightValue((Highlight) null, true);
                LifecycleOwner lifecycleOwner = this.OLrzqt.OLrzqt;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$initView$1$7$1(this.OLrzqt, null), 3, null);
                }
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, LoaderManager.AEQbTJ, 1, (Object) null);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ UnlockTokenScheduleView EZpvd;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, UnlockTokenScheduleView unlockTokenScheduleView) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = unlockTokenScheduleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.fetchVPNInfo.highlightValue((Highlight) null, true);
                this.EZpvd.EZpvd().KWHzl().setValue(Boolean.valueOf(!this.EZpvd.EZpvd().KWHzl().getValue().booleanValue()));
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ UnlockTokenScheduleView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, UnlockTokenScheduleView unlockTokenScheduleView) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = unlockTokenScheduleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AEQbTJ.fetchVPNInfo.highlightValue((Highlight) null, true);
                LifecycleOwner lifecycleOwner = this.copydefault.OLrzqt;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$initView$1$4$1(this.copydefault, null), 3, null);
                }
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, Activity.AEQbTJ, 1, (Object) null);
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ UnlockTokenScheduleView AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(View view, long j, UnlockTokenScheduleView unlockTokenScheduleView) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = unlockTokenScheduleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.fetchVPNInfo.highlightValue((Highlight) null, true);
                LifecycleOwner lifecycleOwner = this.AEQbTJ.OLrzqt;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$initView$1$6$1(this.AEQbTJ, null), 3, null);
                }
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, Dialog.OLrzqt, 1, (Object) null);
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ UnlockTokenScheduleView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(View view, long j, UnlockTokenScheduleView unlockTokenScheduleView) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = unlockTokenScheduleView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.fetchVPNInfo.highlightValue((Highlight) null, true);
                LifecycleOwner lifecycleOwner = this.OLrzqt.OLrzqt;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$initView$1$5$1(this.OLrzqt, null), 3, null);
                }
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, FragmentManager.KWHzl, 1, (Object) null);
            }
        }
    }

    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager AEQbTJ = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "all", false, 4, null);
        }
    }

    public final void OLrzqt() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = this.OLrzqt;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$handleExpand$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = this.OLrzqt;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new UnlockTokenScheduleView$requestData$1(this, null), 3, null);
    }

    public final void copydefault(List<UnlockTokenSchedule> list) {
        C39703pxO c39703pxOCopydefault = C39768pya.copydefault.copydefault(C56390yDp.OLrzqt(list, new LinkedHashMap()));
        copydefault(c39703pxOCopydefault, this.AEQbTJ.fetchVPNInfo);
        try {
            Result.Application application = Result.Companion;
            Map<String, List<C39709pxU>> mapOLrzqt = c39703pxOCopydefault.OLrzqt();
            String strKWHzl = c39703pxOCopydefault.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            List<C39709pxU> listAhwBna = mapOLrzqt.get(strKWHzl);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            KWHzl(listAhwBna);
            copydefault();
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void copydefault() {
        this.AEQbTJ.values.setSelectedStyle(Intrinsics.EZpvd((Object) this.djBIcL.OLrzqt(), (Object) "1W"), 4);
        this.AEQbTJ.valueOf.setSelectedStyle(Intrinsics.EZpvd((Object) this.djBIcL.OLrzqt(), (Object) "1M"), 4);
        this.AEQbTJ.DbNXlk.setSelectedStyle(Intrinsics.EZpvd((Object) this.djBIcL.OLrzqt(), (Object) "1Y"), 4);
        this.AEQbTJ.AEQbTJ.setSelectedStyle(Intrinsics.EZpvd((Object) this.djBIcL.OLrzqt(), (Object) "ALL"), 4);
    }

    private final void copydefault(C39703pxO c39703pxO, LineChart lineChart) {
        if (lineChart == null) {
            return;
        }
        int i = 0;
        if (c39703pxO.EZpvd().isEmpty()) {
            this.AEQbTJ.OLrzqt.setStatus(StatefulView.Status.Empty);
            C55173xeu c55173xeu = (C55173xeu) this.AEQbTJ.OLrzqt.findViewById(C52761wXj.FragmentManager.gasjUx);
            if (c55173xeu != null) {
                EZpvd(c55173xeu);
            }
            C55237xgE c55237xgE = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
            c55237xgE.setVisibility(0);
            C39778pyk c39778pyk = this.AEQbTJ.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c39778pyk, "");
            c39778pyk.setVisibility(8);
        } else {
            this.AEQbTJ.OLrzqt.setStatus(StatefulView.Status.Content);
            C55237xgE c55237xgE2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55237xgE2, "");
            c55237xgE2.setVisibility(8);
            C39778pyk c39778pyk2 = this.AEQbTJ.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c39778pyk2, "");
            c39778pyk2.setVisibility(0);
        }
        DataRenderer renderer = lineChart.getRenderer();
        C39785pyr c39785pyr = renderer instanceof C39785pyr ? (C39785pyr) renderer : null;
        if (c39785pyr != null) {
            c39785pyr.AEQbTJ(c39703pxO.copydefault());
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, List<C39709pxU>>> it = c39703pxO.EZpvd().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<C39709pxU>> next = it.next();
            String key = next.getKey();
            List<C39709pxU> value = next.getValue();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(value, 10));
            int i2 = i;
            for (Object obj : value) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C39709pxU c39709pxU = (C39709pxU) obj;
                arrayList2.add(new Entry(c39703pxO.AEQbTJ().indexOf(String.valueOf(c39709pxU.AhwBna())), (float) c39709pxU.djBIcL(), c39709pxU));
                i2++;
                it = it;
            }
            Iterator<Map.Entry<String, List<C39709pxU>>> it2 = it;
            try {
                Result.Application application = Result.Companion;
                LineDataSet lineDataSet = new LineDataSet(arrayList2, key);
                lineDataSet.setColor(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).EZpvd());
                lineDataSet.setFillColor(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).EZpvd());
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setFillAlpha(225);
                lineDataSet.setDrawHighlightIndicators(false);
                arrayList.add(lineDataSet);
                linkedHashMap.put(lineDataSet, Integer.valueOf(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).gEmmrt()));
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            it = it2;
            i = 0;
        }
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new ActionBar(linkedHashMap));
        }
        lineChart.setData(new LineData((List<ILineDataSet>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList)));
        lineChart.getAxisRight().setValueFormatter(new Application());
        lineChart.getXAxis().setValueFormatter(new TaskDescription(c39703pxO));
        lineChart.getXAxis().setLabelCount(4, true);
        lineChart.getXAxis().setGranularityEnabled(true);
        lineChart.getAxisRight().setLabelCount(4, false);
        lineChart.getAxisRight().setAxisMinimum(0.0f);
        lineChart.getAxisRight().setStartAtZero(true);
        lineChart.setOnChartValueSelectedListener(new StateListAnimator(c39703pxO));
        lineChart.invalidate();
    }

    public static final class Application extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getFormattedValue(float f) {
            return pTB.formatICUCompact$default(Float.valueOf(f), null, null, null, null, 15, null);
        }
    }

    public static final class TaskDescription extends ValueFormatter {
        public final /* synthetic */ C39703pxO EZpvd;

        public TaskDescription(C39703pxO c39703pxO) {
            this.EZpvd = c39703pxO;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getFormattedValue(float f) {
            Object objM7377constructorimpl;
            C39703pxO c39703pxO = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(c39703pxO.AEQbTJ().get((int) f))), null, 1, null));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = String.valueOf(f);
            }
            return (String) objM7377constructorimpl;
        }
    }

    public static final class StateListAnimator implements OnChartValueSelectedListener {
        public final /* synthetic */ C39703pxO OLrzqt;

        public StateListAnimator(C39703pxO c39703pxO) {
            this.OLrzqt = c39703pxO;
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            Object data = entry != null ? entry.getData() : null;
            C39709pxU c39709pxU = data instanceof C39709pxU ? (C39709pxU) data : null;
            if (c39709pxU == null) {
                UnlockTokenScheduleView.this.KWHzl((List<C39709pxU>) yDY.AhwBna());
                return;
            }
            UnlockTokenScheduleView unlockTokenScheduleView = UnlockTokenScheduleView.this;
            List<C39709pxU> listAhwBna = this.OLrzqt.OLrzqt().get(String.valueOf(c39709pxU.AhwBna()));
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            unlockTokenScheduleView.KWHzl(listAhwBna);
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            Map<String, List<C39709pxU>> mapOLrzqt = this.OLrzqt.OLrzqt();
            String strKWHzl = this.OLrzqt.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            List<C39709pxU> listAhwBna = mapOLrzqt.get(strKWHzl);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            UnlockTokenScheduleView.this.KWHzl(listAhwBna);
        }
    }

    public final void KWHzl() {
        int iValueOf;
        if (this.KWHzl.KWHzl().getValue().booleanValue()) {
            iValueOf = this.djBIcL.copydefault().size();
        } else {
            iValueOf = C56548yJl.valueOf(5, this.djBIcL.copydefault().size());
        }
        C33064mpR.OLrzqt(this.AhwBna, (List<? extends Object>) CollectionsKt___CollectionsKt.AhwBna((Iterable) this.djBIcL.copydefault(), iValueOf));
    }

    private final void EZpvd(C55173xeu c55173xeu) {
        c55173xeu.setEmptyTypeImage(6);
    }

    @Override // o.InterfaceC35978oKt
    public void setParam(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.copydefault(str);
    }

    private final void AEQbTJ() {
        setVisibility(8);
        AbstractC36095oPb abstractC36095oPb = this.AEQbTJ;
        C39778pyk c39778pyk = abstractC36095oPb.fetchVPNInfo;
        c39778pyk.getLegend().setEnabled(false);
        c39778pyk.getDescription().setEnabled(false);
        c39778pyk.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        c39778pyk.getXAxis().setDrawGridLines(false);
        c39778pyk.getXAxis().setGranularityEnabled(true);
        c39778pyk.getXAxis().setAvoidFirstLastClipping(true);
        Paint paint = c39778pyk.getPaint(7);
        if (paint != null) {
            paint.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        Paint paint2 = c39778pyk.getPaint(11);
        if (paint2 != null) {
            paint2.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        Paint paint3 = c39778pyk.getPaint(18);
        if (paint3 != null) {
            paint3.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        c39778pyk.getAxisRight().setDrawGridLines(false);
        c39778pyk.getAxisRight().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getAxisLeft().setEnabled(false);
        c39778pyk.getAxisRight().setGranularityEnabled(true);
        c39778pyk.getAxisLeft().mAxisMinimum = 0.0f;
        c39778pyk.getAxisLeft().setDrawGridLines(false);
        c39778pyk.getXAxis().setLabelCount(4, true);
        c39778pyk.getAxisRight().setLabelCount(4, false);
        c39778pyk.getAxisLeft().setGranularityEnabled(true);
        c39778pyk.getAxisLeft().setLabelCount(4);
        c39778pyk.getXAxis().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.setDoubleTapToZoomEnabled(false);
        c39778pyk.setDrawGridBackground(false);
        Intrinsics.copydefault(c39778pyk);
        ChartAnimator animator = c39778pyk.getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "");
        ViewPortHandler viewPortHandler = c39778pyk.getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        c39778pyk.setRenderer(new C39785pyr(c39778pyk, animator, viewPortHandler));
        c39778pyk.setClickable(false);
        abstractC36095oPb.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        abstractC36095oPb.EZpvd.setAdapter(this.AhwBna);
        C43316rmw c43316rmw = this.AhwBna;
        C39783pyp c39783pyp = new C39783pyp();
        c39783pyp.OLrzqt(this.djBIcL.KWHzl());
        Unit unit = Unit.INSTANCE;
        c43316rmw.register(C39709pxU.class, c39783pyp);
        LinearLayout linearLayout = abstractC36095oPb.copydefault;
        linearLayout.setOnClickListener(new Fragment(linearLayout, 1000L, this));
        C54984xbQ c54984xbQ = abstractC36095oPb.values;
        c54984xbQ.setOnClickListener(new PendingIntent(c54984xbQ, 1000L, this));
        C54984xbQ c54984xbQ2 = abstractC36095oPb.valueOf;
        c54984xbQ2.setOnClickListener(new VoiceInteractor(c54984xbQ2, 1000L, this));
        C54984xbQ c54984xbQ3 = abstractC36095oPb.DbNXlk;
        c54984xbQ3.setOnClickListener(new TaskStackBuilder(c54984xbQ3, 1000L, this));
        C54984xbQ c54984xbQ4 = abstractC36095oPb.AEQbTJ;
        c54984xbQ4.setOnClickListener(new AssistContent(c54984xbQ4, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(List<C39709pxU> list) {
        this.djBIcL.EZpvd(CollectionsKt___CollectionsKt.EZpvd(list, new PictureInPictureParams()));
        KWHzl();
        LinearLayout linearLayout = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(list.size() > 5 ? 0 : 8);
        if (list.isEmpty()) {
            ConstraintLayout root = this.AEQbTJ.djBIcL.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
            RecyclerView recyclerView = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
            return;
        }
        ConstraintLayout root2 = this.AEQbTJ.djBIcL.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(0);
        RecyclerView recyclerView2 = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setVisibility(0);
    }
}
