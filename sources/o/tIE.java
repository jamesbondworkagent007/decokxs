package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.material3.CalendarModelKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.charts.LineChart;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$1;
import com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$2;
import com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$3;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.uilab.reminder.OKReminder;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45920tBd;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tIE extends AbstractActivityC47505trP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC46225tMl AEQbTJ;
    public boolean AYXKKw;
    public long EZpvd;
    public tWD OLrzqt;
    public int copydefault;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.tIG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(tIE.valueOf(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.tID
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tIE.copydefault();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.tIM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(tIE.KWHzl());
        }
    });

    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return false;
    }

    public tIE() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(tIH.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tIE.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("INIT_TIME_KEY", java.lang.Long.valueOf(j))));
            return intent;
        }

        public final void KWHzl(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.ggKfIT);
            C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, strAYXKKw);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(3);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(strAYXKKw);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final int gEmmrt() {
        return ((java.lang.Number) this.gEmmrt.getValue()).intValue();
    }

    public static final int valueOf(tIE tie) {
        android.os.Bundle extras = tie.getIntent().getExtras();
        long j = extras != null ? extras.getLong("INIT_TIME_KEY") : 0L;
        if (j <= 0) {
            return 3000;
        }
        return (int) ((java.lang.System.currentTimeMillis() - j) / CalendarModelKt.MillisecondsIn24Hours);
    }

    public final tIH AYXKKw() {
        return (tIH) this.valueOf.getValue();
    }

    public static final tKU copydefault() {
        return tPF.copydefault.fXHmeK();
    }

    public final tKU AhwBna() {
        return (tKU) this.djBIcL.getValue();
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.AhwBna.getValue()).booleanValue();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View root;
        super.onCreate(bundle);
        AbstractC46225tMl abstractC46225tMlOLrzqt = AbstractC46225tMl.OLrzqt(getLayoutInflater());
        this.AEQbTJ = abstractC46225tMlOLrzqt;
        Intrinsics.copydefault(abstractC46225tMlOLrzqt);
        setContentView(abstractC46225tMlOLrzqt.getRoot());
        fetchVPNInfo();
        djBIcL();
        AkhnZx();
        AYXKKw().KWHzl();
        tIH tihAYXKKw = AYXKKw();
        PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ = AhwBna().AEQbTJ();
        java.lang.String strEZpvd = planetBasicUserInfoRespAEQbTJ != null ? planetBasicUserInfoRespAEQbTJ.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        tihAYXKKw.copydefault(strEZpvd, gEmmrt());
        showLoading();
        C46386tSk.copydefault.isConnected(AhwBna().KWHzl());
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl == null || (root = abstractC46225tMl.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tIE.AhwBna(this.EZpvd);
            }
        });
    }

    public static final void AhwBna(tIE tie) {
        if (tie.AYXKKw) {
            return;
        }
        tie.AYXKKw = true;
        rVN.reportFullyDrawn$default((android.app.Activity) tie, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fetchVPNInfo() {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        OKReminder oKReminder;
        C33537myN c33537myN;
        wYF wyf2;
        C52794wYp c52794wYpCopydefault2;
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl != null && (wyf2 = abstractC46225tMl.copydefault) != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
            c52794wYpCopydefault2.setEnabled(false);
        }
        AbstractC46225tMl abstractC46225tMl2 = this.AEQbTJ;
        if (abstractC46225tMl2 != null && (c33537myN = abstractC46225tMl2.KWHzl) != null) {
            android.widget.ImageView backImage = c33537myN.getBackImage();
            Intrinsics.checkNotNullExpressionValue(backImage, "");
            ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
                backImage.setLayoutParams(marginLayoutParams);
                c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tIK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        tIE.copydefault(this.copydefault, view);
                    }
                });
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        AbstractC46225tMl abstractC46225tMl3 = this.AEQbTJ;
        if (abstractC46225tMl3 != null && (oKReminder = abstractC46225tMl3.DbNXlk) != null) {
            oKReminder.setMessage(getString(C47501trL.Fragment.RzdrRQ));
            oKReminder.setStyle(2);
            oKReminder.setCloseIconVisibility(false);
        }
        AbstractC46225tMl abstractC46225tMl4 = this.AEQbTJ;
        if (abstractC46225tMl4 != null && (wyf = abstractC46225tMl4.copydefault) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C47501trL.TaskDescription.dbwnZN;
        C45920tBd.StateListAnimator stateListAnimator = C45920tBd.Companion;
        PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ = AhwBna().AEQbTJ();
        java.lang.String strEZpvd = planetBasicUserInfoRespAEQbTJ != null ? planetBasicUserInfoRespAEQbTJ.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        fragmentTransactionBeginTransaction.replace(i, stateListAnimator.copydefault(PlanetAuthorId.KWHzl(strEZpvd), true, "", ""));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final void copydefault(tIE tie, android.view.View view) {
        tie.onBackPressed();
    }

    public static final class Activity implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            tIE.this.AYXKKw().copydefault(tIE.this.EZpvd);
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ tIE OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tIE tie) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = tie;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C46096tHr c46096tHrCopydefault = C46096tHr.Companion.copydefault(this.OLrzqt.new Activity());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(c46096tHrCopydefault, supportFragmentManager, this.OLrzqt.getTAG());
            }
        }
    }

    private final void djBIcL() {
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl != null) {
            LineChart lineChart = abstractC46225tMl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(lineChart, "");
            this.OLrzqt = new tWD(lineChart);
        }
    }

    public final void EZpvd(java.util.ArrayList<java.lang.String> arrayList) {
        AppCompatSeekBar appCompatSeekBar;
        tWD twd = this.OLrzqt;
        if (twd != null) {
            twd.copydefault(arrayList);
        }
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl == null || (appCompatSeekBar = abstractC46225tMl.AYXKKw) == null) {
            return;
        }
        appCompatSeekBar.setOnSeekBarChangeListener(new TaskDescription(appCompatSeekBar));
    }

    public static final class TaskDescription implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ AppCompatSeekBar EZpvd;

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public TaskDescription(AppCompatSeekBar appCompatSeekBar) {
            this.EZpvd = appCompatSeekBar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            tIE.this.KWHzl(i);
            if (tIE.this.OLrzqt()) {
                tUP.m8767vibrategIAlus$default(tUP.KWHzl, this.EZpvd, 0L, 2, null);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            java.util.List<ChartProfileDataResp> listOLrzqt = tIE.this.AYXKKw().OLrzqt().getValue().OLrzqt();
            if (listOLrzqt != null) {
                ChartProfileDataResp chartProfileDataResp = (ChartProfileDataResp) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, seekBar != null ? seekBar.getProgress() : 0);
                if (chartProfileDataResp != null) {
                    int iCurrentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - chartProfileDataResp.KWHzl()) / CalendarModelKt.MillisecondsIn24Hours);
                    androidx.fragment.app.Fragment fragmentFindFragmentById = tIE.this.getSupportFragmentManager().findFragmentById(C47501trL.TaskDescription.dbwnZN);
                    C45920tBd c45920tBd = fragmentFindFragmentById instanceof C45920tBd ? (C45920tBd) fragmentFindFragmentById : null;
                    if (c45920tBd == null) {
                        return;
                    }
                    C45920tBd.refresh$default(c45920tBd, java.lang.Integer.valueOf(iCurrentTimeMillis), false, 2, null);
                }
            }
        }
    }

    public final void KWHzl(int i) {
        AppCompatSeekBar appCompatSeekBar;
        int size;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        ChartProfileDataResp chartProfileDataResp;
        android.view.View view;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        ChartProfileDataResp chartProfileDataResp2;
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl == null || (appCompatSeekBar = abstractC46225tMl.AYXKKw) == null) {
            return;
        }
        int width = appCompatSeekBar.getWidth();
        java.util.List<ChartProfileDataResp> listOLrzqt = AYXKKw().OLrzqt().getValue().OLrzqt();
        if (listOLrzqt == null || (size = listOLrzqt.size()) <= 1) {
            return;
        }
        java.util.List<ChartProfileDataResp> listOLrzqt2 = AYXKKw().OLrzqt().getValue().OLrzqt();
        this.EZpvd = (listOLrzqt2 == null || (chartProfileDataResp2 = (ChartProfileDataResp) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt2, i)) == null) ? 0L : chartProfileDataResp2.KWHzl();
        float f = (float) ((((double) i) / ((double) (size - 1))) * ((double) width));
        AbstractC46225tMl abstractC46225tMl2 = this.AEQbTJ;
        int width2 = 0;
        float width3 = ((abstractC46225tMl2 == null || (imageView2 = abstractC46225tMl2.values) == null) ? 0 : imageView2.getWidth()) / 2.0f;
        float f2 = f - width3;
        AbstractC46225tMl abstractC46225tMl3 = this.AEQbTJ;
        if (abstractC46225tMl3 != null && (imageView = abstractC46225tMl3.values) != null) {
            imageView.setTranslationX(f2);
        }
        AbstractC46225tMl abstractC46225tMl4 = this.AEQbTJ;
        if (abstractC46225tMl4 != null && (view = abstractC46225tMl4.AhwBna) != null) {
            view.setTranslationX(f2);
        }
        AbstractC46225tMl abstractC46225tMl5 = this.AEQbTJ;
        if (abstractC46225tMl5 != null && (textView3 = abstractC46225tMl5.AEQbTJ) != null) {
            java.util.List<ChartProfileDataResp> listOLrzqt3 = AYXKKw().OLrzqt().getValue().OLrzqt();
            textView3.setText((listOLrzqt3 == null || (chartProfileDataResp = (ChartProfileDataResp) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt3, i)) == null) ? null : EZpvd(chartProfileDataResp.KWHzl()));
        }
        AbstractC46225tMl abstractC46225tMl6 = this.AEQbTJ;
        if (abstractC46225tMl6 != null && (textView2 = abstractC46225tMl6.AEQbTJ) != null) {
            width2 = textView2.getWidth();
        }
        float f3 = width2 / 2.0f;
        AbstractC46225tMl abstractC46225tMl7 = this.AEQbTJ;
        if (abstractC46225tMl7 != null && (textView = abstractC46225tMl7.AEQbTJ) != null) {
            textView.setTranslationX(java.lang.Math.min(java.lang.Math.max(-width3, f - f3), (width - width2) + width3));
        }
        tWD twd = this.OLrzqt;
        if (twd != null) {
            twd.copydefault(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        boolean z;
        CurveResetInfo curveResetInfoOLrzqt;
        java.lang.String strCopydefault;
        java.lang.Integer intOrNull;
        AbstractC46225tMl abstractC46225tMl = this.AEQbTJ;
        if (abstractC46225tMl == null || (wyf = abstractC46225tMl.copydefault) == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        java.util.List<ChartProfileDataResp> listOLrzqt = AYXKKw().OLrzqt().getValue().OLrzqt();
        if (listOLrzqt != null) {
            z = (listOLrzqt.size() <= 1 || (curveResetInfoOLrzqt = AYXKKw().copydefault().getValue().OLrzqt()) == null || (strCopydefault = curveResetInfoOLrzqt.copydefault()) == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strCopydefault)) == null || intOrNull.intValue() <= 0) ? false : true;
        }
        c52794wYpCopydefault.setEnabled(z);
    }

    private final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SocialTradingDataResetActivity$setupViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SocialTradingDataResetActivity$setupViewModel$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SocialTradingDataResetActivity$setupViewModel$3(this, null), 3, null);
    }

    public final java.lang.String EZpvd(long j) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new SimpleDateFormat("yyyy/MM/dd", java.util.Locale.getDefault()).format(new Date(j)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = "";
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.AEQbTJ = null;
        super.onDestroy();
    }

    public static final boolean KWHzl() {
        return ((InterfaceC46554tYq) C43251rlk.copydefault(InterfaceC46554tYq.class)).copydefault();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
