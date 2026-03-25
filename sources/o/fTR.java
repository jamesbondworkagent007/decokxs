package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fTR extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super wXX, Unit> KWHzl;
    public C55276xgr copydefault;
    public final long OLrzqt = CalendarModelKt.MillisecondsIn24Hours;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fTO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fTR.AYXKKw();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super o.wXX, kotlin.Unit>, o.yHO<java.lang.Integer, java.lang.Boolean, o.wXX, kotlin.Unit> */
    public final yHO<java.lang.Integer, java.lang.Boolean, wXX, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super wXX, Unit> yho) {
        this.KWHzl = yho;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fTR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final fTR copydefault(int i, int i2, int i3, @NotNull java.util.ArrayList<java.lang.Integer> arrayList, int i4, boolean z, @NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super wXX, Unit> yho) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(yho, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putIntegerArrayList("input_time_list_key", arrayList);
            bundle.putInt("input_selected_time_key", i4);
            bundle.putBoolean("input_auto_renew", z);
            bundle.putInt("title_key", i);
            bundle.putInt("button_key", i2);
            bundle.putInt("enable_until_key", i3);
            fTR ftr = new fTR();
            ftr.setArguments(bundle);
            ftr.OLrzqt(yho);
            return ftr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw djBIcL() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    public final java.util.List<java.lang.Integer> OLrzqt() {
        java.util.ArrayList<java.lang.Integer> integerArrayList;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (integerArrayList = arguments.getIntegerArrayList("input_time_list_key")) == null) ? yDY.AhwBna() : integerArrayList;
    }

    public final int copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("input_selected_time_key", 15);
        }
        return 15;
    }

    public final boolean KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("input_auto_renew", false);
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC17038evJ abstractC17038evJ = (AbstractC17038evJ) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.apLTlu, constraintLayout, false);
        Intrinsics.copydefault(abstractC17038evJ);
        OLrzqt(abstractC17038evJ);
        constraintLayout.addView(abstractC17038evJ.getRoot(), new ConstraintLayout.LayoutParams(-1, -2));
    }

    public final void OLrzqt(AbstractC17038evJ abstractC17038evJ) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        AppCompatTextView appCompatTextView = abstractC17038evJ.AYXKKw;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (strAYXKKw = C33070mpX.AYXKKw(arguments.getInt("title_key"))) == null) {
            strAYXKKw = "";
        }
        appCompatTextView.setText(strAYXKKw);
        AppCompatTextView appCompatTextView2 = abstractC17038evJ.AhwBna;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (strAYXKKw2 = C33070mpX.AYXKKw(arguments2.getInt("enable_until_key"))) == null) {
            strAYXKKw2 = "";
        }
        appCompatTextView2.setText(strAYXKKw2);
        C52794wYp c52794wYp = abstractC17038evJ.copydefault;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (strAYXKKw3 = C33070mpX.AYXKKw(arguments3.getInt("button_key"))) != null) {
            str = strAYXKKw3;
        }
        c52794wYp.setText(str);
        C52794wYp c52794wYp2 = abstractC17038evJ.copydefault;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this, abstractC17038evJ));
        copydefault(abstractC17038evJ);
        EZpvd(abstractC17038evJ);
        EZpvd(abstractC17038evJ, copydefault());
    }

    public final void EZpvd(final AbstractC17038evJ abstractC17038evJ) {
        AppCompatTextView appCompatTextView = abstractC17038evJ.OLrzqt;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, abstractC17038evJ));
        abstractC17038evJ.AEQbTJ.setChecked(KWHzl());
        abstractC17038evJ.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                fTR.AEQbTJ(this.EZpvd, abstractC17038evJ, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(fTR ftr, AbstractC17038evJ abstractC17038evJ, android.widget.CompoundButton compoundButton, boolean z) {
        C55276xgr c55276xgr = ftr.copydefault;
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
        ftr.EZpvd(abstractC17038evJ, num != null ? num.intValue() : ftr.copydefault());
    }

    public final void copydefault(AbstractC17038evJ abstractC17038evJ) {
        java.lang.Object next;
        djBIcL().register(C55276xgr.class, new Activity(abstractC17038evJ));
        java.util.List<java.lang.Integer> listOLrzqt = OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (java.lang.Integer num : listOLrzqt) {
            arrayList.add(new C55276xgr(C33069mpW.copydefault(this, C13754dXa.FragmentManager.QezThh, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", num))), num, null, num != null && num.intValue() == copydefault(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((C55276xgr) next).AEQbTJ()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.copydefault = (C55276xgr) next;
        abstractC17038evJ.EZpvd.addItemDecoration(new C31703mAu(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE), C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.zuBGHE), 0));
        abstractC17038evJ.EZpvd.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        abstractC17038evJ.EZpvd.setAdapter(djBIcL());
        djBIcL().setItems(arrayList);
        djBIcL().notifyDataSetChanged();
    }

    public static final class Activity extends AbstractC43310rmq<C55276xgr, AbstractC16838erV> {
        public final /* synthetic */ AbstractC17038evJ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.getValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.fetchVPNInfo;
        }

        public Activity(AbstractC17038evJ abstractC17038evJ) {
            this.KWHzl = abstractC17038evJ;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16838erV> c43312rms, C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            ((AbstractC16838erV) c43312rms.OLrzqt()).AEQbTJ.setText(c55276xgr.AhwBna());
            AppCompatImageView appCompatImageView = ((AbstractC16838erV) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(c55276xgr.AEQbTJ() ? 0 : 8);
            android.view.View root = ((AbstractC16838erV) c43312rms.OLrzqt()).getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, this, c55276xgr, fTR.this, this.KWHzl));
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ AbstractC17038evJ AEQbTJ;
            public final /* synthetic */ C55276xgr EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ Activity copydefault;
            public final /* synthetic */ fTR valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Activity activity, C55276xgr c55276xgr, fTR ftr, AbstractC17038evJ abstractC17038evJ) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.copydefault = activity;
                this.EZpvd = c55276xgr;
                this.valueOf = ftr;
                this.AEQbTJ = abstractC17038evJ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    java.util.List<?> items = this.copydefault.getAdapter().getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    for (java.lang.Object obj : items) {
                        Intrinsics.copydefault(obj, "");
                        ((C55276xgr) obj).copydefault(false);
                    }
                    this.EZpvd.copydefault(true);
                    this.valueOf.copydefault = this.EZpvd;
                    fTR ftr = this.valueOf;
                    AbstractC17038evJ abstractC17038evJ = this.AEQbTJ;
                    java.lang.Object objOLrzqt = this.EZpvd.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt, "");
                    ftr.EZpvd(abstractC17038evJ, ((java.lang.Integer) objOLrzqt).intValue());
                    this.copydefault.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ fTR AEQbTJ;
        public final /* synthetic */ AbstractC17038evJ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fTR ftr, AbstractC17038evJ abstractC17038evJ) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = ftr;
            this.EZpvd = abstractC17038evJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                yHO<java.lang.Integer, java.lang.Boolean, wXX, Unit> yhoEZpvd = this.AEQbTJ.EZpvd();
                if (yhoEZpvd != null) {
                    C55276xgr c55276xgr = this.AEQbTJ.copydefault;
                    java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
                    java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
                    yhoEZpvd.invoke(java.lang.Integer.valueOf(num != null ? num.intValue() : this.AEQbTJ.copydefault()), java.lang.Boolean.valueOf(this.EZpvd.AEQbTJ.isChecked()), this.AEQbTJ);
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC17038evJ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC17038evJ abstractC17038evJ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = abstractC17038evJ;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.fVp.showDialog$default(o.fVp, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.Object):o.xaY */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C17877fVp.showDialog$default(c17877fVpOLrzqt, context, C33070mpX.AYXKKw(C13754dXa.FragmentManager.apNKau), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QBiWsm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
    }

    public final void EZpvd(AbstractC17038evJ abstractC17038evJ, int i) {
        java.lang.String strOLrzqt;
        AppCompatTextView appCompatTextView = abstractC17038evJ.valueOf;
        if (abstractC17038evJ.AEQbTJ.isChecked()) {
            strOLrzqt = C33069mpW.copydefault(C13754dXa.FragmentManager.dtVxwd, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)))));
        } else {
            strOLrzqt = OLrzqt(i);
        }
        appCompatTextView.setText(strOLrzqt);
    }

    public final java.lang.String OLrzqt(int i) {
        return pTA.formatDate$default(new Date(java.lang.System.currentTimeMillis() + (((long) i) * this.OLrzqt)), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }
}
