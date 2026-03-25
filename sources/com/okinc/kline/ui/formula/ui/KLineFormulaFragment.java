package com.okinc.kline.ui.formula.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.formula.ui.KLineFormulaFragment;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC39383prK;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.ActivityC39220poG;
import o.ActivityC39442psS;
import o.C31947mJv;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C33624mzv;
import o.C35964oKf;
import o.C36236oUh;
import o.C36246oUr;
import o.C36250oUv;
import o.C36312oXc;
import o.C37895pEr;
import o.C37897pEt;
import o.C37979pHu;
import o.C39263pox;
import o.C39339pqT;
import o.C39353pqh;
import o.C39358pqm;
import o.C39384prL;
import o.C39507pte;
import o.C39805pzK;
import o.C39828pzh;
import o.C43251rlk;
import o.C52794wYp;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C55328xhq;
import o.C56407yEf;
import o.C56524yIo;
import o.C57585ylG;
import o.C58114yvF;
import o.C58156yvv;
import o.C8003auW;
import o.InterfaceC35160nqA;
import o.InterfaceC35980oKv;
import o.InterfaceC35982oKx;
import o.InterfaceC35983oKy;
import o.InterfaceC39434psK;
import o.InterfaceC39499ptW;
import o.InterfaceC39502ptZ;
import o.InterfaceC39509ptg;
import o.InterfaceC43033rhe;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.ViewOnClickListenerC39282ppP;
import o.ViewOnClickListenerC39742pyA;
import o.ViewOnClickListenerC54939xaY;
import o.oLY;
import o.oME;
import o.oUJ;
import o.oWN;
import o.oYA;
import o.pFN;
import o.pFP;
import o.pFS;
import o.pXB;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yET;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineFormulaFragment extends AbstractC39383prK implements InterfaceC39502ptZ, View.OnClickListener {
    public static final Application Companion = new Application(null);
    public static final int RdAHlO = 8;
    public String DLWbHP;
    public boolean ODXsMY;
    public final InterfaceC56387yDm OFhtUX;
    public oME OHqIaq;
    public int OxVOHk;
    public String QSLkRj;

    @yCM
    public C39384prL historyFormulaKlineUseCase;
    public boolean hrNTAI;

    @yCM
    public CoroutineDispatcher ioDispatcher;

    public static final class Activity extends TypeToken<ArrayList<DrawingLinesData>> {
    }

    public static final class Fragment extends TypeToken<ArrayList<DrawingLinesData>> {
    }

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    @Override // o.InterfaceC39502ptZ
    public void AkhnZx(boolean z) {
    }

    @Override // o.InterfaceC39502ptZ
    public void KWHzl(int i, boolean z) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC36340oYd
    public void KWHzl(String str) {
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return true;
    }

    @Override // o.InterfaceC39502ptZ
    public void OFhtUX() {
    }

    @Override // o.InterfaceC39502ptZ
    public void QSLkRj() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void aUsmxb() {
        this.ODXsMY = true;
    }

    @Override // o.oYA
    public void accept() {
    }

    @Override // o.InterfaceC39502ptZ
    public void dUDNAs() {
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.RJOkX;
    }

    @Override // o.InterfaceC39502ptZ
    public void isConnected(boolean z) {
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
    }

    public static final class Dialog<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public static final class PendingIntent<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public KLineFormulaFragment() {
        final Function0 function0 = null;
        this.OFhtUX = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C39507pte.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.formula.ui.KLineFormulaFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.formula.ui.KLineFormulaFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.prW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KLineFormulaFragment.AuCTel(this.AEQbTJ);
            }
        });
    }

    public final CoroutineDispatcher OxVOHk() {
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.oYA.OLrzqt()V */
    /* JADX DEBUG: Possible override for method o.pbd.OLrzqt()V */
    /* JADX DEBUG: Possible override for method o.prK.OLrzqt()V */
    public final C39384prL OLrzqt() {
        C39384prL c39384prL = this.historyFormulaKlineUseCase;
        if (c39384prL != null) {
            return c39384prL;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C39507pte OJuSTm() {
        return (C39507pte) this.OFhtUX.getValue();
    }

    public static final C39507pte KWHzl(KLineFormulaFragment kLineFormulaFragment, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C39507pte(kLineFormulaFragment.OxVOHk(), kLineFormulaFragment.OLrzqt());
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.ui.formula.ui.KLineFormulaFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final KLineFormulaFragment copydefault(@NotNull String str, @NotNull KlineFormulaData klineFormulaData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(klineFormulaData, "");
            KLineFormulaFragment kLineFormulaFragment = new KLineFormulaFragment();
            Bundle bundle = new Bundle();
            bundle.putString("klineFormulaName", str);
            bundle.putParcelable("formulaInfo", klineFormulaData);
            kLineFormulaFragment.setArguments(bundle);
            return kLineFormulaFragment;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ KLineFormulaFragment EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, KLineFormulaFragment kLineFormulaFragment) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = kLineFormulaFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.fjfviF();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pXB.registerTradeFragmentTrack$default(o.pXB, androidx.fragment.app.Fragment, java.lang.String, kotlin.Pair[], kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineFormulaFragment", new Pair[0], null, 4, null);
    }

    @Override // o.AbstractC39383prK, o.oYA, o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC39434psK) C58114yvF.OLrzqt(context, InterfaceC39434psK.class)).copydefault(this);
        super.onAttach(context);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        FrameLayout frameLayout;
        ImageView imageView;
        AppCompatTextView appCompatTextView;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        super.onVisible();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx3.setPortraitChart(true);
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx2.setFullScreenMode(true);
        }
        if (!pFS.KWHzl.KWHzl(getParentFragment())) {
            C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
            EZpvd(C36312oXc.AEQbTJ(QVAiDq()));
            C36250oUv c36250oUvQVAiDq3 = QVAiDq();
            if (c36250oUvQVAiDq3 != null) {
                c36250oUvQVAiDq3.setCurrentStateMachine(RcXXUw());
            }
            C36312oXc c36312oXcRcXXUw = RcXXUw();
            if (c36312oXcRcXXUw != null) {
                c36312oXcRcXXUw.EZpvd(c36312oXcRcXXUw.wlaJM);
                C36250oUv c36250oUvQVAiDq4 = QVAiDq();
                if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq4.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setMDrawLineEnable(true);
                }
            }
        }
        oME ome = this.OHqIaq;
        if (ome != null && (appCompatTextView = ome.AxsJAY) != null) {
            appCompatTextView.setVisibility(8);
        }
        TextView textViewGkJEwt = gkJEwt();
        if (textViewGkJEwt != null) {
            textViewGkJEwt.setVisibility(8);
        }
        oME ome2 = this.OHqIaq;
        if (ome2 != null && (imageView = ome2.ejfBZ) != null) {
            imageView.setVisibility(8);
        }
        oME ome3 = this.OHqIaq;
        if (ome3 == null || (frameLayout = ome3.zuBGHE) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onInvisible() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq;
        HashMap<String, DataSource> mapEjfBZ;
        if (((!Intrinsics.EZpvd((Object) aKErDB(), (Object) "TYPE_KLINE") && !this.hrNTAI) || this.ODXsMY) && (c36250oUvQVAiDq = QVAiDq()) != null && (mapEjfBZ = c36250oUvQVAiDq.ejfBZ()) != null) {
            C36250oUv c36250oUvQVAiDq2 = QVAiDq();
            DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq2 != null ? c36250oUvQVAiDq2.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUvQVAiDq3 = QVAiDq();
        if (c36250oUvQVAiDq3 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setFullScreenMode(false);
        C36250oUv c36250oUvQVAiDq4 = QVAiDq();
        if (c36250oUvQVAiDq4 != null) {
            c36250oUvQVAiDq4.EZpvd();
        }
        chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(false);
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onDestroyView();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        this.OHqIaq = null;
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        Intrinsics.checkNotNullParameter(view, "");
        Bundle arguments = getArguments();
        gEmmrt(arguments != null && arguments.getBoolean("is_CR_Mode", false));
        valueOf(true);
        super.initView(view, bundle);
        this.OHqIaq = oME.AEQbTJ(view);
        Bundle arguments2 = getArguments();
        this.QSLkRj = arguments2 != null ? arguments2.getString("from") : null;
        Bundle arguments3 = getArguments();
        this.DLWbHP = arguments3 != null ? arguments3.getString("from_scene") : null;
        oME ome = this.OHqIaq;
        if (ome != null && (c52794wYp2 = ome.copydefault) != null) {
            c52794wYp2.setOKDSType(257);
            c52794wYp2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.iRgjgR));
        }
        oME ome2 = this.OHqIaq;
        if (ome2 != null && (c52794wYp = ome2.AEQbTJ) != null) {
            c52794wYp.setOKDSType(257);
            c52794wYp.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.iRgjgR));
        }
        if (QOLQEE().AEQbTJ() <= 0) {
            DCUTEIdCUTEI();
        }
        oWN.KWHzl(C33570myu.AEQbTJ());
        USBtdM();
        spnCvw();
        fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        Dmq();
        if (!Intrinsics.EZpvd((Object) "kline_follow_app", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (Intrinsics.EZpvd((Object) "kline_dark", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
                AkhnZx(true);
            } else {
                AkhnZx(false);
            }
        }
        zblBkD();
        DcqEDu();
        UlJrfe();
    }

    public final void UlJrfe() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KLineFormulaFragment$setupViewModel$1(this, null), 3, null);
    }

    public final void copydefault(String str, KlineFormulaData klineFormulaData) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        copydefault(new MarketCoinInfo(str, "formula", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null));
        C36246oUr.copydefault().isConnected(str);
        OLrzqt(str);
        KWHzl(klineFormulaData);
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setFromFormula(true);
        }
        htlTjW();
    }

    private final void DcqEDu() {
        QOLQEE().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.psI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit OLrzqt(KLineFormulaFragment kLineFormulaFragment, Integer num) {
        int iIntValue;
        if (C36246oUr.copydefault().zLjUOn().isCeFiMCapMode()) {
            int i = kLineFormulaFragment.OxVOHk;
            Intrinsics.copydefault(num);
            iIntValue = i - num.intValue();
        } else {
            int i2 = kLineFormulaFragment.OxVOHk;
            Intrinsics.copydefault(num);
            iIntValue = i2 + num.intValue();
        }
        kLineFormulaFragment.OxVOHk = iIntValue;
        return Unit.INSTANCE;
    }

    private final void zblBkD() {
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.psd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.djBIcL(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.psc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.DbNXlk(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.psa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.valueOf(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.pse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.AhwBna(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(this, new TaskDescription(new Function1() { // from class: o.psh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.gEmmrt(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit djBIcL(KLineFormulaFragment kLineFormulaFragment, List list) {
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(KLineFormulaFragment kLineFormulaFragment, List list) {
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(KLineFormulaFragment kLineFormulaFragment, List list) {
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(KLineFormulaFragment kLineFormulaFragment, List list) {
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(KLineFormulaFragment kLineFormulaFragment, List list) {
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    private final void DCUTEIdCUTEI() {
        TemplateSetting templateSettingWlaJM;
        ArrayList<String> sideIndicatorNames;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        Integer numValueOf = (c36250oUvQVAiDq == null || (templateSettingWlaJM = c36250oUvQVAiDq.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : Integer.valueOf(sideIndicatorNames.size());
        int iRlQdEF = C36246oUr.copydefault().RlQdEF();
        int iAccept = C36246oUr.copydefault().accept();
        Intrinsics.copydefault(numValueOf);
        this.OxVOHk = iRlQdEF + (iAccept * numValueOf.intValue());
        QOLQEE().KWHzl((int) (this.OxVOHk * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f)));
    }

    public void USBtdM() {
        C57585ylG c57585ylG;
        C57585ylG c57585ylG2;
        InterfaceC54577xNn interfaceC54577xNn;
        C57585ylG c57585ylG3;
        if (!QKVWgx()) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
                oME ome = this.OHqIaq;
                if (ome != null && (c57585ylG2 = ome.DTwDnp) != null) {
                    c57585ylG2.setVisibility(8);
                }
            } else {
                oME ome2 = this.OHqIaq;
                if (ome2 != null && (c57585ylG3 = ome2.DTwDnp) != null) {
                    c57585ylG3.setVisibility(0);
                }
            }
        }
        oME ome3 = this.OHqIaq;
        if (ome3 == null || (c57585ylG = ome3.DTwDnp) == null) {
            return;
        }
        String string = getString(C35964oKf.Fragment.fHqPtx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(C35964oKf.Fragment.gGvvIC);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c57585ylG.setText(string, string2);
        c57585ylG.setUserIconClick(new Function0() { // from class: o.prS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KLineFormulaFragment.fIwbmz(this.AEQbTJ);
            }
        });
        c57585ylG.setOnRealChangeClick(new Function0() { // from class: o.prY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KLineFormulaFragment.getNewProxyInstance(this.copydefault);
            }
        });
    }

    public static final Unit fIwbmz(KLineFormulaFragment kLineFormulaFragment) {
        C32866mlf.onEvent$default("app_demo_trading_header_user_center_click", (TrackChannel[]) null, new Function1() { // from class: o.psi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.DbNXlk((EventParamsList) obj);
            }
        }, 1, (Object) null);
        InterfaceC35160nqA interfaceC35160nqA = (InterfaceC35160nqA) C43251rlk.OLrzqt(InterfaceC35160nqA.class);
        if (interfaceC35160nqA != null) {
            FragmentActivity fragmentActivityRequireActivity = kLineFormulaFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC35160nqA.KWHzl(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(KLineFormulaFragment kLineFormulaFragment) {
        C32866mlf.onEvent$default("app_demo_trading_header_switch_mode_click", (TrackChannel[]) null, new Function1() { // from class: o.psg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.AkhnZx((EventParamsList) obj);
            }
        }, 1, (Object) null);
        kLineFormulaFragment.showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kLineFormulaFragment), null, null, new KLineFormulaFragment$setMarketOptionState$1$2$2(kLineFormulaFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str, KlineFormulaData klineFormulaData) {
        copydefault(str, klineFormulaData);
        onResume();
    }

    public final void htlTjW() {
        TextView textView;
        TextView textView2;
        oME ome = this.OHqIaq;
        if (ome != null && (textView2 = ome.zsXlph) != null) {
            textView2.setText(iwGUEr());
        }
        oME ome2 = this.OHqIaq;
        if (ome2 == null || (textView = ome2.AubY) == null) {
            return;
        }
        textView.setText(iwGUEr());
    }

    private final void spnCvw() {
        C55173xeu c55173xeu;
        ImageView imageView;
        ConstraintLayout constraintLayout;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        C33624mzv c33624mzv;
        C33624mzv c33624mzv2;
        C33624mzv c33624mzv3;
        C33624mzv c33624mzv4;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        ImageView imageView2;
        oME ome = this.OHqIaq;
        if (ome != null && (imageView2 = ome.AkhnZx) != null) {
            imageView2.setOnClickListener(this);
        }
        oME ome2 = this.OHqIaq;
        if (ome2 != null && (c52794wYp2 = ome2.copydefault) != null) {
            c52794wYp2.setOnClickListener(this);
        }
        oME ome3 = this.OHqIaq;
        if (ome3 != null && (c52794wYp = ome3.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(this);
        }
        oME ome4 = this.OHqIaq;
        if (ome4 != null && (c33624mzv4 = ome4.QUSxYX) != null) {
            c33624mzv4.setOnClickListener(this);
        }
        oME ome5 = this.OHqIaq;
        if (ome5 != null && (c33624mzv3 = ome5.RJOkX) != null) {
            c33624mzv3.setOnClickListener(this);
        }
        oME ome6 = this.OHqIaq;
        if (ome6 != null && (c33624mzv2 = ome6.QbewEr) != null) {
            c33624mzv2.setOnClickListener(this);
        }
        oME ome7 = this.OHqIaq;
        if (ome7 != null && (c33624mzv = ome7.QVAiDq) != null) {
            c33624mzv.setOnClickListener(this);
        }
        oME ome8 = this.OHqIaq;
        if (ome8 != null && (constraintLayout3 = ome8.OLrzqt) != null) {
            constraintLayout3.setOnClickListener(this);
        }
        oME ome9 = this.OHqIaq;
        if (ome9 != null && (constraintLayout2 = ome9.KWHzl) != null) {
            constraintLayout2.setOnClickListener(this);
        }
        oME ome10 = this.OHqIaq;
        if (ome10 != null && (viewOnClickListenerC39742pyA = ome10.valueOf) != null) {
            viewOnClickListenerC39742pyA.setClickListener(new StateListAnimator());
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.psp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.TaskDescription
                public final void AEQbTJ() {
                    KLineFormulaFragment.fJNWhG(this.OLrzqt);
                }
            });
        }
        oME ome11 = this.OHqIaq;
        if (ome11 != null && (constraintLayout = ome11.hDKMBd) != null) {
            constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
        }
        oME ome12 = this.OHqIaq;
        if (ome12 != null && (imageView = ome12.AuCTel) != null) {
            C8003auW.copydefault(imageView).throttleFirst(1L, TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.psw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    KLineFormulaFragment.KWHzl(this.EZpvd, obj);
                }
            });
        }
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_portrait_normal");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.psz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.valueOf(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.fJNWhG(function1, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_theme_type");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.psA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.gEmmrt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.fARcdN(function12, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("trade_button_position");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this);
        final Function1 function13 = new Function1() { // from class: o.psD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.djBIcL(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.fIwbmz(function13, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ4 = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd4 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ4, this);
        final Function1 function14 = new Function1() { // from class: o.psH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.AhwBna(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd4.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.ejfBZ(function14, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ5 = RxBus.AEQbTJ("hide_drawing_line");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ5, "");
        AbstractC58185ywX abstractC58185ywXEZpvd5 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ5, this);
        final Function1 function15 = new Function1() { // from class: o.psq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.DbNXlk((java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd5.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.AuCTel(function15, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ6 = RxBus.AEQbTJ("kline_layout_style");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ6, "");
        AbstractC58185ywX abstractC58185ywXEZpvd6 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ6, this);
        final Function1 function16 = new Function1() { // from class: o.pss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.isConnected(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd6.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.getNewProxyInstance(function16, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ7 = RxBus.AEQbTJ("kline_drawing_data_upload");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ7, "");
        AbstractC58185ywX abstractC58185ywXEZpvd7 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ7, this);
        final Function1 function17 = new Function1() { // from class: o.psu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd7.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                KLineFormulaFragment.wlaJM(function17, obj);
            }
        });
        oME ome13 = this.OHqIaq;
        if (ome13 == null || (c55173xeu = ome13.gHZMYf) == null) {
            return;
        }
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.psx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                KLineFormulaFragment.AEQbTJ(this.EZpvd, view);
            }
        });
    }

    public static final class StateListAnimator implements InterfaceC35982oKx {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC35982oKx
        public void copydefault() {
            if (DrawLineData.copydefault.isConnected() != null) {
                KLineFormulaFragment.this.QwvEab();
            }
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void OLrzqt() {
            if (DrawLineData.copydefault.isConnected() != null) {
                KLineFormulaFragment.this.QwvEab();
            }
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void AEQbTJ() {
            if (DrawLineData.copydefault.isConnected() != null) {
                KLineFormulaFragment.this.QwvEab();
            }
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void EZpvd() {
            KLineFormulaFragment.this.DWgRXt();
        }

        @Override // o.InterfaceC35982oKx
        public void AYXKKw() {
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            if (drawLineItemIsConnected != null) {
                KLineFormulaFragment kLineFormulaFragment = KLineFormulaFragment.this;
                if (drawLineItemIsConnected.getLocked()) {
                    drawLineItemIsConnected.setLineLocked(false);
                } else {
                    drawLineItemIsConnected.setLineLocked(true);
                }
                kLineFormulaFragment.QwvEab();
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = KLineFormulaFragment.this.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.fJNWhG();
            }
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pFP.isLogin$default(o.pFP, android.content.Context, int, java.lang.Object):boolean */
        @Override // o.InterfaceC35982oKx
        public void KWHzl() {
            String coinId;
            ArrayList<DrawLineData.DrawLineItem> arrayList;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Integer type;
            DrawLineData drawLineData = DrawLineData.copydefault;
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                KLineFormulaFragment kLineFormulaFragment = KLineFormulaFragment.this;
                drawLineItemIsConnected.setDelete(true);
                oUJ ouj = oUJ.KWHzl;
                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                    coinId = "";
                }
                drawLineItemIsConnected.setContract(coinId);
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                drawLineItemIsConnected.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                    kLineFormulaFragment.QwvEab();
                    C37895pEr c37895pEr = C37895pEr.copydefault;
                    C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
                    if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null || (arrayList = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<DrawLineData.DrawLineItem> arrayList2 = arrayList;
                    String strIwGUEr = kLineFormulaFragment.iwGUEr();
                    c37895pEr.AEQbTJ(arrayList2, "0", strIwGUEr == null ? "" : strIwGUEr, kLineFormulaFragment.fvQaOB(), kLineFormulaFragment.gasjUx());
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                } else {
                    drawLineData.EZpvd().remove(drawLineItemIsConnected);
                    drawLineData.EZpvd().add(drawLineItemIsConnected);
                    drawLineData.EZpvd(drawLineData.EZpvd());
                }
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = KLineFormulaFragment.this.isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.DbNXlk();
            }
        }
    }

    public static final void fJNWhG(KLineFormulaFragment kLineFormulaFragment) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        kLineFormulaFragment.run();
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setDrawing(false);
    }

    public static final void KWHzl(KLineFormulaFragment kLineFormulaFragment, Object obj) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        if (kLineFormulaFragment.isConnected() == null || (interfaceC39499ptWIsConnected = kLineFormulaFragment.isConnected()) == null) {
            return;
        }
        interfaceC39499ptWIsConnected.OLrzqt(0);
    }

    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(KLineFormulaFragment kLineFormulaFragment, String str) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected = kLineFormulaFragment.isConnected();
        if (interfaceC39499ptWIsConnected != null) {
            interfaceC39499ptWIsConnected.setPortraitNormal(kLineFormulaFragment.QVAiDq());
        }
        kLineFormulaFragment.hrNTAI = true;
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(KLineFormulaFragment kLineFormulaFragment, String str) {
        FragmentActivity activity = kLineFormulaFragment.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(KLineFormulaFragment kLineFormulaFragment, String str) {
        kLineFormulaFragment.fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(KLineFormulaFragment kLineFormulaFragment, String str) {
        HashMap<String, DataSource> mapEjfBZ;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setUtc8(pFP.OLrzqt.AEQbTJ());
        }
        C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq2 != null && (mapEjfBZ = c36250oUvQVAiDq2.ejfBZ()) != null) {
            C36250oUv c36250oUvQVAiDq3 = kLineFormulaFragment.QVAiDq();
            DataSource dataSource = mapEjfBZ.get(c36250oUvQVAiDq3 != null ? c36250oUvQVAiDq3.fIwbmz() : null);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36250oUv c36250oUvQVAiDq4 = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq4 != null) {
            c36250oUvQVAiDq4.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(String str) {
        C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(C35964oKf.Fragment.RSmiaq), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(KLineFormulaFragment kLineFormulaFragment, String str) {
        FragmentActivity activity = kLineFormulaFragment.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wlaJM(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(KLineFormulaFragment kLineFormulaFragment, String str) {
        ArrayList<DrawLineData.DrawLineItem> arrayList;
        ArrayList<DrawLineData.DrawLineItem> arrayList2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null) {
            if (drawLineItemIsConnected.getIndexId().length() == 0) {
                drawLineItemIsConnected.setIndexId(C37897pEt.KWHzl.copydefault(System.currentTimeMillis()));
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
                if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) == null || (arrayList = chartViewOutSideConfigAkhnZx2.getLinesList()) == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                C37895pEr c37895pEr = C37895pEr.copydefault;
                if (size > c37895pEr.EZpvd()) {
                    int size2 = arrayList.size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        DrawLineData.DrawLineItem drawLineItem = arrayList.get(0);
                        Intrinsics.checkNotNullExpressionValue(drawLineItem, "");
                        arrayList3.add(drawLineItem);
                        arrayList.remove(0);
                    }
                }
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
                if (c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) == null || (arrayList2 = chartViewOutSideConfigAkhnZx.getLinesList()) == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<DrawLineData.DrawLineItem> arrayList4 = arrayList2;
                String strIwGUEr = kLineFormulaFragment.iwGUEr();
                c37895pEr2.AEQbTJ(arrayList4, "0", strIwGUEr == null ? "" : strIwGUEr, kLineFormulaFragment.fvQaOB(), kLineFormulaFragment.gasjUx());
            } else {
                kLineFormulaFragment.call();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(KLineFormulaFragment kLineFormulaFragment, View view) {
        LinearLayout linearLayout;
        if (kLineFormulaFragment.QbewEr() != null) {
            oME ome = kLineFormulaFragment.OHqIaq;
            if (ome != null && (linearLayout = ome.values) != null) {
                linearLayout.setVisibility(8);
            }
            FragmentActivity activity = kLineFormulaFragment.getActivity();
            if (activity != null) {
                if (kLineFormulaFragment.QKVWgx()) {
                    ((ActivityC39220poG) activity).uzCIH();
                } else {
                    ((ActivityC39442psS) activity).AuCTel();
                }
            }
            kLineFormulaFragment.onResume();
            kLineFormulaFragment.QSLkRj();
        }
    }

    public final void fjfviF() {
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC43033rhe.EZpvd(childFragmentManager, new yHO() { // from class: o.prR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return KLineFormulaFragment.OLrzqt(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        }
    }

    public static final Unit OLrzqt(KLineFormulaFragment kLineFormulaFragment, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        kLineFormulaFragment.OJuSTm().OLrzqt(str, new KlineFormulaData(str2, str3));
        return Unit.INSTANCE;
    }

    public static final class FragmentManager implements InterfaceC35980oKv {
        public FragmentManager() {
        }

        @Override // o.InterfaceC35980oKv
        public void AEQbTJ() {
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null) {
                c36250oUvQVAiDq.invalidate();
            }
            if (DrawLineData.copydefault.isConnected() != null) {
                KLineFormulaFragment.this.QwvEab();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DWgRXt() {
        C39353pqh c39353pqhOLrzqt = C39353pqh.Companion.OLrzqt();
        c39353pqhOLrzqt.EZpvd(new FragmentManager());
        c39353pqhOLrzqt.show(getChildFragmentManager(), KLineFormulaFragment.class.getSimpleName());
    }

    private final void Dmq() {
        C39828pzh c39828pzh;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ImageView imageView;
        KlineFormulaData klineFormulaDataUzCIH;
        TextView textView;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        InterfaceC54577xNn interfaceC54577xNn;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA2;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA3;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA4;
        final C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            OLrzqt(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
            c36250oUvQVAiDq.setIsSupportDoubleClick(false);
            c36250oUvQVAiDq.AkhnZx().setScreen(false);
            c36250oUvQVAiDq.AkhnZx().setChartMode(1);
            c36250oUvQVAiDq.post(new Runnable() { // from class: o.prV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    KLineFormulaFragment.EZpvd(this.OLrzqt, c36250oUvQVAiDq);
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            oME ome = this.OHqIaq;
            if (ome != null && (viewOnClickListenerC39742pyA4 = ome.valueOf) != null) {
                viewOnClickListenerC39742pyA4.setRightToolMargin(0);
            }
            oME ome2 = this.OHqIaq;
            if (ome2 != null && (viewOnClickListenerC39742pyA3 = ome2.valueOf) != null) {
                viewOnClickListenerC39742pyA3.setDrawToolTopMargin(0);
            }
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
                oME ome3 = this.OHqIaq;
                if (ome3 != null && (viewOnClickListenerC39742pyA = ome3.valueOf) != null) {
                    viewOnClickListenerC39742pyA.setDrawToolBottomMargin(C55298xhM.copydefault(154.0f, (Context) activity));
                }
            } else {
                oME ome4 = this.OHqIaq;
                if (ome4 != null && (viewOnClickListenerC39742pyA2 = ome4.valueOf) != null) {
                    viewOnClickListenerC39742pyA2.setDrawToolBottomMargin(C55298xhM.copydefault(198.0f, (Context) activity));
                }
            }
            if (!QKVWgx()) {
                oME ome5 = this.OHqIaq;
                EZpvd((View) (ome5 != null ? ome5.isConnected : null));
                oME ome6 = this.OHqIaq;
                if (ome6 != null && (linearLayout4 = ome6.isConnected) != null) {
                    linearLayout4.setVisibility(0);
                }
                oME ome7 = this.OHqIaq;
                if (ome7 != null && (linearLayout3 = ome7.DbNXlk) != null) {
                    linearLayout3.setVisibility(8);
                }
                oME ome8 = this.OHqIaq;
                if (ome8 != null && (textView = ome8.AuCTelauCTel) != null) {
                    textView.setVisibility(8);
                }
            } else {
                oME ome9 = this.OHqIaq;
                EZpvd((View) (ome9 != null ? ome9.DbNXlk : null));
                oME ome10 = this.OHqIaq;
                if (ome10 != null && (imageView = ome10.AuCTel) != null) {
                    imageView.setVisibility(8);
                }
                oME ome11 = this.OHqIaq;
                if (ome11 != null && (linearLayout2 = ome11.isConnected) != null) {
                    linearLayout2.setVisibility(8);
                }
                oME ome12 = this.OHqIaq;
                if (ome12 != null && (linearLayout = ome12.DbNXlk) != null) {
                    linearLayout.setVisibility(0);
                }
            }
            String strIwGUEr = iwGUEr();
            if (strIwGUEr != null && (klineFormulaDataUzCIH = uzCIH()) != null) {
                copydefault(strIwGUEr, klineFormulaDataUzCIH);
            }
        }
        oME ome13 = this.OHqIaq;
        if (ome13 == null || (c39828pzh = ome13.uzCIH) == null) {
            return;
        }
        c39828pzh.setOnItemSelectListener(new Function1() { // from class: o.prZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final void EZpvd(KLineFormulaFragment kLineFormulaFragment, C36250oUv c36250oUv) {
        kLineFormulaFragment.QOLQEE().AEQbTJ(c36250oUv.getMeasuredHeight());
    }

    public static final Unit OLrzqt(KLineFormulaFragment kLineFormulaFragment, int i) {
        kLineFormulaFragment.AYXKKw(i);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final View view) {
        ConstraintLayout constraintLayout;
        oME ome = this.OHqIaq;
        if (ome == null || (constraintLayout = ome.hDKMBd) == null) {
            return;
        }
        constraintLayout.post(new Runnable() { // from class: o.psj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                KLineFormulaFragment.OLrzqt(view, this);
            }
        });
    }

    public static final void OLrzqt(View view, KLineFormulaFragment kLineFormulaFragment) {
        ConstraintLayout constraintLayout;
        Integer numValueOf = null;
        float fDjBIcL = C33129mqd.djBIcL(view != null ? Integer.valueOf(view.getMeasuredHeight()) : null);
        oME ome = kLineFormulaFragment.OHqIaq;
        if (ome != null && (constraintLayout = ome.hDKMBd) != null) {
            numValueOf = Integer.valueOf(constraintLayout.getMeasuredHeight());
        }
        float fDjBIcL2 = (fDjBIcL - C33129mqd.djBIcL(numValueOf)) / 2;
        if (view != null) {
            view.setTranslationY(fDjBIcL2);
        }
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36246oUr.copydefault().isConnected(str);
    }

    private final void AYXKKw(int i) {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        ArrayList<TimeIntervalItem> arrayListKWHzl;
        if (i == 4) {
            KDccX();
            return;
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL()) == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null) {
            return;
        }
        TimeIntervalItem timeIntervalItem = arrayListKWHzl.get(i);
        Intrinsics.checkNotNullExpressionValue(timeIntervalItem, "");
        oYA.changeTime$default(this, c36250oUvQVAiDq, timeIntervalItem, false, 4, null);
    }

    @Override // o.oYA
    public void EZpvd(boolean z, @NotNull String str) {
        Integer numValueOf;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX != null) {
            C36250oUv c36250oUvQVAiDq = QVAiDq();
            if (Intrinsics.EZpvd((Object) ((c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx3.getCurrentMode()), (Object) "YScale")) {
                C36250oUv c36250oUvQVAiDq2 = QVAiDq();
                if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setNeedUpdateInYScale(true);
                }
                C36250oUv c36250oUvQVAiDq3 = QVAiDq();
                if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setMoveInterceptMode(" YUPDOWNMOVE");
                }
            }
            ArrayList<IndicatorDataReq> arrayList = new ArrayList<>();
            if (z) {
                int size = templateSettingGiSNqX.getSideIndicatorNames().size();
                if (size >= 4) {
                    ArrayList<String> sideIndicatorNames = templateSettingGiSNqX.getSideIndicatorNames();
                    Intrinsics.checkNotNullExpressionValue(sideIndicatorNames, "");
                    String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(sideIndicatorNames);
                    if (str2 == null) {
                        str2 = "";
                    }
                    IndicatorDataReq indicatorDataReqCopydefault = copydefault(str2, false, false);
                    if (indicatorDataReqCopydefault != null) {
                        arrayList.add(indicatorDataReqCopydefault);
                    }
                }
                templateSettingGiSNqX.addSideIndicator(str);
                C36250oUv c36250oUvQVAiDq4 = QVAiDq();
                if (c36250oUvQVAiDq4 != null) {
                    c36250oUvQVAiDq4.copydefault(str);
                }
                C39263pox c39263poxAxsJAY = AxsJAY();
                ArrayList<String> sideIndicatorNames2 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
                c39263poxAxsJAY.OLrzqt(this, sideIndicatorNames2, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (size < 4 && DXXBbs()) {
                    this.OxVOHk += C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq5 = QVAiDq();
                    if (c36250oUvQVAiDq5 != null) {
                        C36250oUv c36250oUvQVAiDq6 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq6 != null ? Integer.valueOf(c36250oUvQVAiDq6.getMinimumHeight() + C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq5.setMinimumHeight(numValueOf.intValue());
                    }
                }
            } else {
                templateSettingGiSNqX.removeSideIndicator(str);
                C36250oUv c36250oUvQVAiDq7 = QVAiDq();
                if (c36250oUvQVAiDq7 != null) {
                    c36250oUvQVAiDq7.gEmmrt(str);
                }
                C39263pox c39263poxAxsJAY2 = AxsJAY();
                ArrayList<String> sideIndicatorNames3 = templateSettingGiSNqX.getSideIndicatorNames();
                Intrinsics.checkNotNullExpressionValue(sideIndicatorNames3, "");
                c39263poxAxsJAY2.OLrzqt(this, sideIndicatorNames3, OcIXYQ(), ORxRYg(), templateSettingGiSNqX.getSPTimeInterval());
                if (DXXBbs()) {
                    this.OxVOHk -= C36246oUr.copydefault().accept();
                    C36250oUv c36250oUvQVAiDq8 = QVAiDq();
                    if (c36250oUvQVAiDq8 != null) {
                        C36250oUv c36250oUvQVAiDq9 = QVAiDq();
                        numValueOf = c36250oUvQVAiDq9 != null ? Integer.valueOf(c36250oUvQVAiDq9.getMinimumHeight() - C36246oUr.copydefault().accept()) : null;
                        Intrinsics.copydefault(numValueOf);
                        c36250oUvQVAiDq8.setMinimumHeight(numValueOf.intValue());
                    }
                }
            }
            DCUTEIdCUTEI();
            if (z) {
                IndicatorDataReq indicatorDataReqCopydefault2 = copydefault(str, z, false);
                if (indicatorDataReqCopydefault2 != null) {
                    arrayList.add(indicatorDataReqCopydefault2);
                }
                AhwBna(arrayList);
            }
        }
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd((DrawLineData.LineType) null);
        drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
        fJNWhG(SPUtils.getBoolean("trade_button_left", true));
        QVsKAR();
    }

    @Override // o.oYA
    public void hUfVAv() {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        oME ome = this.OHqIaq;
        if (ome == null || (c39828pzh = ome.uzCIH) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // o.oYA
    public void DarRvM() {
        super.DarRvM();
        String strIwGUEr = iwGUEr();
        if (strIwGUEr != null) {
            oUJ.KWHzl.OLrzqt(strIwGUEr, "INDEX");
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            copydefault(c36250oUvQVAiDq);
            c36250oUvQVAiDq.AkhnZx().setMKlineAbstractType(1);
        }
    }

    private final void fJNWhG(boolean z) {
        AppCompatImageView appCompatImageView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        AppCompatImageView appCompatImageView2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        if (QKVWgx()) {
            oME ome = this.OHqIaq;
            if (ome != null && (linearLayout6 = ome.fARcdN) != null) {
                linearLayout6.setVisibility(8);
            }
            oME ome2 = this.OHqIaq;
            if (ome2 == null || (linearLayout5 = ome2.fJNWhG) == null) {
                return;
            }
            linearLayout5.setVisibility(8);
            return;
        }
        if (z) {
            oME ome3 = this.OHqIaq;
            if (ome3 != null && (linearLayout4 = ome3.fARcdN) != null) {
                linearLayout4.setVisibility(0);
            }
            oME ome4 = this.OHqIaq;
            if (ome4 != null && (linearLayout3 = ome4.fJNWhG) != null) {
                linearLayout3.setVisibility(8);
            }
            oME ome5 = this.OHqIaq;
            if (ome5 == null || (appCompatImageView2 = ome5.ORxRYg) == null) {
                return;
            }
            appCompatImageView2.setVisibility(C36236oUh.EZpvd.isConnected() ? 0 : 8);
            return;
        }
        oME ome6 = this.OHqIaq;
        if (ome6 != null && (linearLayout2 = ome6.fARcdN) != null) {
            linearLayout2.setVisibility(8);
        }
        oME ome7 = this.OHqIaq;
        if (ome7 != null && (linearLayout = ome7.fJNWhG) != null) {
            linearLayout.setVisibility(0);
        }
        oME ome8 = this.OHqIaq;
        if (ome8 == null || (appCompatImageView = ome8.QKVWgx) == null) {
            return;
        }
        appCompatImageView.setVisibility(C36236oUh.EZpvd.isConnected() ? 0 : 8);
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        LinearLayout linearLayout;
        oME ome = this.OHqIaq;
        if (ome != null && (linearLayout = ome.values) != null) {
            linearLayout.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (QKVWgx()) {
                ((ActivityC39220poG) activity).gEmmrt();
            } else {
                ((ActivityC39442psS) activity).KWHzl();
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (String) null, 2, (Object) null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AkhnZx();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (QKVWgx()) {
                ((ActivityC39220poG) activity).gEmmrt();
            } else {
                ((ActivityC39442psS) activity).KWHzl();
            }
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.AEQbTJ(list);
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.setShowEmptyUi(list.isEmpty());
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (String) null, 2, (Object) null);
        C36246oUr.copydefault().zLjUOn().isCeFiMCapMode();
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.KWHzl(list);
        }
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        super.onPause();
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null) {
            return;
        }
        chartViewOutSideConfigAkhnZx.setShowPriceType(false);
    }

    private final void KDccX() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, true, false, 2, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.psJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.AEQbTJ(this.copydefault, (MarketTypeSelect) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String simpleName = KLineFormulaFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(childFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.psL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                KLineFormulaFragment.AEQbTJ(this.OLrzqt, dialogInterface);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oYA.changeTime$default(o.oYA, o.oUv, com.okinc.kline.data.TimeIntervalItem, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(KLineFormulaFragment kLineFormulaFragment, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            Object data = marketTypeSelect.getData();
            Intrinsics.copydefault(data, "");
            oYA.changeTime$default(kLineFormulaFragment, c36250oUvQVAiDq, (TimeIntervalItem) data, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(KLineFormulaFragment kLineFormulaFragment, DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        oME ome = kLineFormulaFragment.OHqIaq;
        if (ome == null || (c39828pzh = ome.uzCIH) == null) {
            return;
        }
        c39828pzh.setData();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pqm.TaskDescription.newInstance$default(o.pqm$TaskDescription, boolean, java.lang.String, int, java.lang.Object):o.pqm */
    private final void fHqPtx() {
        TemplateSetting templateSettingGiSNqX = giSNqX();
        if (templateSettingGiSNqX == null || templateSettingGiSNqX.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm.TaskDescription taskDescription = C39358pqm.Companion;
        String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(taskDescription, false, strORxRYg, 1, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.psM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.copydefault(this.copydefault, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.prU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                KLineFormulaFragment.copydefault(this.KWHzl, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String simpleName = KLineFormulaFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    public static final Unit copydefault(KLineFormulaFragment kLineFormulaFragment, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((Object) marketTypeSelect.getSelectTypeName(), (Object) "VOLUME")) {
            return Unit.INSTANCE;
        }
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null) {
            kLineFormulaFragment.KWHzl(c36250oUvQVAiDq, marketTypeSelect);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(KLineFormulaFragment kLineFormulaFragment, DialogInterface dialogInterface) {
        C39828pzh c39828pzh;
        C36250oUv c36250oUvQVAiDq;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
        if (Intrinsics.EZpvd((Object) ((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) == null) ? null : chartViewOutSideConfigAkhnZx2.getCurrentMode()), (Object) "YScale") && (c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq()) != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setNeedUpdateInYScale(false);
        }
        oME ome = kLineFormulaFragment.OHqIaq;
        if (ome == null || (c39828pzh = ome.uzCIH) == null) {
            return;
        }
        c39828pzh.setData();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.keyboardTargetTextChanged;
        if (numValueOf != null && numValueOf.intValue() == i) {
            FragmentActivity activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            if (supportFragmentManager.getBackStackEntryCount() > 0) {
                supportFragmentManager.popBackStack();
                return;
            }
            InterfaceC39499ptW interfaceC39499ptWIsConnected = isConnected();
            if (interfaceC39499ptWIsConnected != null) {
                interfaceC39499ptWIsConnected.AYXKKw();
                return;
            }
            return;
        }
        int i2 = C35964oKf.StateListAnimator.QUSxYX;
        if (numValueOf == null || numValueOf.intValue() != i2) {
            int i3 = C35964oKf.StateListAnimator.aKErDB;
            if (numValueOf == null || numValueOf.intValue() != i3) {
                int i4 = C35964oKf.StateListAnimator.getFlags;
                if (numValueOf == null || numValueOf.intValue() != i4) {
                    int i5 = C35964oKf.StateListAnimator.toString;
                    if (numValueOf == null || numValueOf.intValue() != i5) {
                        int i6 = C35964oKf.StateListAnimator.newArray;
                        if (numValueOf == null || numValueOf.intValue() != i6) {
                            int i7 = C35964oKf.StateListAnimator.MediaBrowserCompatServiceBinderWrapper;
                            if (numValueOf == null || numValueOf.intValue() != i7) {
                                int i8 = C35964oKf.StateListAnimator.alsFma;
                                if (numValueOf == null || numValueOf.intValue() != i8) {
                                    int i9 = C35964oKf.StateListAnimator.akftKQ;
                                    if (numValueOf == null || numValueOf.intValue() != i9) {
                                        return;
                                    }
                                }
                                WS();
                                return;
                            }
                        }
                        fHqPtx();
                        return;
                    }
                }
                DCUTEIddSDPG();
                return;
            }
        }
        fjfviF();
    }

    private final void WS() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KLineFormulaFragment$showChartSetting$1(this, null));
    }

    private final void DCUTEIddSDPG() {
        ViewOnClickListenerC39282ppP viewOnClickListenerC39282ppPCopydefault = ViewOnClickListenerC39282ppP.Companion.copydefault("", "");
        viewOnClickListenerC39282ppPCopydefault.AEQbTJ(new LoaderManager());
        viewOnClickListenerC39282ppPCopydefault.show(getChildFragmentManager(), KLineFormulaFragment.class.getSimpleName());
    }

    public static final class LoaderManager implements InterfaceC35983oKy {
        public LoaderManager() {
        }

        @Override // o.InterfaceC35983oKy
        public void OLrzqt() {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            final boolean z = SPUtils.getBoolean("hide_kline_drawing_data", false);
            boolean z2 = !z;
            SPUtils.put("hide_kline_drawing_data", Boolean.valueOf(z2));
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(z2);
            }
            C36250oUv c36250oUvQVAiDq2 = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq2 != null) {
                c36250oUvQVAiDq2.invalidate();
            }
            if (!z) {
                DrawLineData.copydefault.KWHzl((DrawLineData.DrawLineItem) null);
                C36312oXc c36312oXcRcXXUw = KLineFormulaFragment.this.RcXXUw();
                if (c36312oXcRcXXUw != null) {
                    c36312oXcRcXXUw.AEQbTJ(true);
                }
                KLineFormulaFragment.this.QVsKAR();
                KLineFormulaFragment.this.QkdxfA();
                C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(C35964oKf.Fragment.RSmiaq), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            }
            C32866mlf.onEvent$default("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.psN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return KLineFormulaFragment.LoaderManager.OLrzqt(z, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit OLrzqt(boolean z, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("app_drawing_tool_type", !z ? "hide" : "show", true);
            eventParamsList.put("terminal", "app", true);
            eventParamsList.put("chart_type", "original", true);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC35983oKy
        public void KWHzl() {
            KLineFormulaFragment.this.ixgjPv();
        }

        @Override // o.InterfaceC35983oKy
        public void copydefault() {
            ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
            LinkedHashMap<String, ChartArea> linkedHashMapValues;
            ChartArea chartArea;
            HashMap<String, oWN> mapZLjUOn;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
            ArrayList<DrawLineData.DrawLineItem> linesList;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
            C36250oUv c36250oUvQVAiDq = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx4 = c36250oUvQVAiDq.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx4.setDrawing(true);
            }
            C36312oXc c36312oXcRcXXUw = KLineFormulaFragment.this.RcXXUw();
            if (c36312oXcRcXXUw != null) {
                c36312oXcRcXXUw.AEQbTJ(true);
            }
            C36250oUv c36250oUvQVAiDq2 = KLineFormulaFragment.this.QVAiDq();
            oWN own = null;
            if (((c36250oUvQVAiDq2 == null || (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq2.AkhnZx()) == null || (linesList = chartViewOutSideConfigAkhnZx3.getLinesList()) == null) ? 0 : linesList.size()) >= C37895pEr.copydefault.EZpvd() && !SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(C35964oKf.Fragment.gCNefq), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.EZpvd((DrawLineData.LineType) null);
                drawLineData.KWHzl((DrawLineData.DrawLineItem) null);
                return;
            }
            C36250oUv c36250oUvQVAiDq3 = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq3.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMHideKlineDrawingData()) {
                C36250oUv c36250oUvQVAiDq4 = KLineFormulaFragment.this.QVAiDq();
                if (c36250oUvQVAiDq4 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq4.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx2.setMHideKlineDrawingData(false);
                }
                SPUtils.put("hide_kline_drawing_data", Boolean.FALSE);
            }
            C36250oUv c36250oUvQVAiDq5 = KLineFormulaFragment.this.QVAiDq();
            if (c36250oUvQVAiDq5 != null && (mapZLjUOn = c36250oUvQVAiDq5.zLjUOn()) != null) {
                own = mapZLjUOn.get("ds0");
            }
            if (own != null) {
                C36250oUv c36250oUvQVAiDq6 = KLineFormulaFragment.this.QVAiDq();
                int iDjBIcL = 100;
                int measuredWidth = (c36250oUvQVAiDq6 != null ? c36250oUvQVAiDq6.getMeasuredWidth() : 100) / 2;
                C36250oUv c36250oUvQVAiDq7 = KLineFormulaFragment.this.QVAiDq();
                if (c36250oUvQVAiDq7 != null && (linkedHashMapValues = c36250oUvQVAiDq7.values()) != null && (chartArea = linkedHashMapValues.get("ds0.m")) != null) {
                    iDjBIcL = chartArea.djBIcL();
                }
                own.KWHzl(measuredWidth, iDjBIcL / 2);
                C36250oUv c36250oUvQVAiDq8 = KLineFormulaFragment.this.QVAiDq();
                if (c36250oUvQVAiDq8 != null) {
                    c36250oUvQVAiDq8.invalidate();
                }
                oME ome = KLineFormulaFragment.this.OHqIaq;
                if (ome == null || (viewOnClickListenerC39742pyA = ome.valueOf) == null) {
                    return;
                }
                viewOnClickListenerC39742pyA.AYXKKw();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UrRBLY() {
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq != null) {
            c36250oUvQVAiDq.QfsBiF();
        }
        C36250oUv c36250oUvQVAiDq2 = QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.invalidate();
        }
    }

    private final void run() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oME ome = this.OHqIaq;
        if (ome == null || (viewOnClickListenerC39742pyA = ome.valueOf) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.djBIcL();
    }

    private final void call() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        final DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            String strIwGUEr = iwGUEr();
            if (strIwGUEr == null) {
                strIwGUEr = "";
            }
            drawLineItemIsConnected.setContract(strIwGUEr);
            drawLineItemIsConnected.setKlineType(0);
            drawLineData.AEQbTJ(EZpvd(drawLineData.EZpvd(), drawLineItemIsConnected.getIndexId()));
            drawLineData.EZpvd().add(drawLineItemIsConnected);
            drawLineData.EZpvd(drawLineData.EZpvd());
            C31947mJv c31947mJv = new C31947mJv();
            String strIwGUEr2 = iwGUEr();
            AbstractC58260yxt<List<DrawingDataEntity>> abstractC58260yxtCopydefault = c31947mJv.copydefault(strIwGUEr2 != null ? strIwGUEr2 : "");
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.prQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KLineFormulaFragment.AEQbTJ(this.KWHzl, drawLineItemIsConnected, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.prT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KLineFormulaFragment.iwGUEr(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.psb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KLineFormulaFragment.EZpvd((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.psm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KLineFormulaFragment.uzCIH(function12, obj);
                    }
                });
            }
            drawLineData.AEQbTJ(new Function1() { // from class: o.psv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return KLineFormulaFragment.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final void iwGUEr(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(KLineFormulaFragment kLineFormulaFragment, DrawLineData.DrawLineItem drawLineItem, List list) {
        if (C33129mqd.KWHzl((Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Activity().getType()));
            ArrayList<DrawLineData.DrawLineItem> arrayListEZpvd = kLineFormulaFragment.EZpvd(C37897pEt.KWHzl.copydefault(drawingDataBean), drawLineItem.getIndexId());
            C37895pEr c37895pEr = C37895pEr.copydefault;
            String strIwGUEr = kLineFormulaFragment.iwGUEr();
            if (strIwGUEr == null) {
                strIwGUEr = "";
            }
            c37895pEr.AEQbTJ(arrayListEZpvd, "0", strIwGUEr, kLineFormulaFragment.fvQaOB(), kLineFormulaFragment.gasjUx());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final KLineFormulaFragment kLineFormulaFragment, ArrayList arrayList) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        int size = arrayList.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        int size2 = 0;
        if (size <= c37895pEr.EZpvd()) {
            C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                size2 = linesList.size();
            }
            if (size2 > c37895pEr.EZpvd()) {
                C31947mJv c31947mJv = new C31947mJv();
                String strIwGUEr = kLineFormulaFragment.iwGUEr();
                AbstractC58260yxt<List<DrawingDataEntity>> abstractC58260yxtCopydefault = c31947mJv.copydefault(strIwGUEr != null ? strIwGUEr : "");
                if (abstractC58260yxtCopydefault != null) {
                    final Function1 function1 = new Function1() { // from class: o.psk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return KLineFormulaFragment.fetchVPNInfo(this.KWHzl, (java.util.List) obj);
                        }
                    };
                    InterfaceC58227yxM<? super List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.psl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            KLineFormulaFragment.hDKMBd(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.pso
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return KLineFormulaFragment.AYXKKw((java.lang.Throwable) obj);
                        }
                    };
                    abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.psn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            KLineFormulaFragment.getFieldNames(function12, obj);
                        }
                    });
                }
            }
        } else {
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new PendingIntent());
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().remove(CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayList.remove(0);
            C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setLinesList(arrayList);
            }
            C36250oUv c36250oUvQVAiDq3 = kLineFormulaFragment.QVAiDq();
            if (c36250oUvQVAiDq3 != null) {
                c36250oUvQVAiDq3.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(final KLineFormulaFragment kLineFormulaFragment, List list) {
        if (C33129mqd.KWHzl((Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Fragment().getType()));
            final ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            if (arrayListCopydefault.size() > 1) {
                C56407yEf.copydefault(arrayListCopydefault, new Dialog());
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListCopydefault);
            drawLineItem.setDelete(true);
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd().add(drawLineItem);
            drawLineData.EZpvd(drawLineData.EZpvd());
            arrayListCopydefault.remove(0);
            C37895pEr c37895pEr = C37895pEr.copydefault;
            String strIwGUEr = kLineFormulaFragment.iwGUEr();
            if (strIwGUEr == null) {
                strIwGUEr = "";
            }
            c37895pEr.AEQbTJ(arrayListCopydefault, "0", strIwGUEr, kLineFormulaFragment.fvQaOB(), kLineFormulaFragment.gasjUx());
            drawLineData.AEQbTJ(new Function1() { // from class: o.prX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return KLineFormulaFragment.OLrzqt(arrayListCopydefault, kLineFormulaFragment, (java.util.ArrayList) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ArrayList arrayList, KLineFormulaFragment kLineFormulaFragment, ArrayList arrayList2) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList.addAll(arrayList2);
        C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setLinesList(arrayList);
        }
        C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq2 != null) {
            c36250oUvQVAiDq2.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void QwvEab() {
        call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixgjPv() {
        if (ejfBZ() == null) {
            return;
        }
        Context contextEjfBZ = ejfBZ();
        Intrinsics.copydefault(contextEjfBZ);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextEjfBZ);
        viewOnClickListenerC54939xaY.EZpvd(getString(C35964oKf.Fragment.Ufzxmz));
        String string = getString(C35964oKf.Fragment.igXuih);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.psG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                KLineFormulaFragment.OLrzqt(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        String string2 = getString(C35964oKf.Fragment.dYepVG);
        Intrinsics.copydefault(string2, "");
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, (CharSequence) string2, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(KLineFormulaFragment kLineFormulaFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ArrayList<DrawLineData.DrawLineItem> linesList;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        ArrayList<DrawLineData.DrawLineItem> linesList2;
        String coinId;
        Integer type;
        HashMap<String, oWN> mapZLjUOn;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        ArrayList<DrawLineData.DrawLineItem> linesList3;
        DrawLineData drawLineData = DrawLineData.copydefault;
        ArrayList<DrawLineData.DrawLineItem> arrayListFetchVPNInfo = drawLineData.fetchVPNInfo();
        if (arrayListFetchVPNInfo.size() > C37895pEr.copydefault.EZpvd()) {
            drawLineData.EZpvd().removeAll(arrayListFetchVPNInfo);
        } else {
            C36250oUv c36250oUvQVAiDq = kLineFormulaFragment.QVAiDq();
            if (c36250oUvQVAiDq != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvQVAiDq.AkhnZx()) != null && (linesList2 = chartViewOutSideConfigAkhnZx2.getLinesList()) != null) {
                for (DrawLineData.DrawLineItem drawLineItem : linesList2) {
                    oUJ ouj = oUJ.KWHzl;
                    DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                    if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                        coinId = "";
                    }
                    drawLineItem.setContract(coinId);
                    DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                    drawLineItem.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                    drawLineItem.setDelete(true);
                }
            }
            C36250oUv c36250oUvQVAiDq2 = kLineFormulaFragment.QVAiDq();
            if (c36250oUvQVAiDq2 != null && (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq2.AkhnZx()) != null && (linesList = chartViewOutSideConfigAkhnZx.getLinesList()) != null) {
                DrawLineData drawLineData2 = DrawLineData.copydefault;
                drawLineData2.EZpvd().removeAll(linesList);
                drawLineData2.EZpvd().addAll(linesList);
            }
            DrawLineData drawLineData3 = DrawLineData.copydefault;
            drawLineData3.EZpvd(drawLineData3.EZpvd());
            String strIwGUEr = kLineFormulaFragment.iwGUEr();
            kLineFormulaFragment.EZpvd(strIwGUEr != null ? strIwGUEr : "");
        }
        C36250oUv c36250oUvQVAiDq3 = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq3 != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvQVAiDq3.AkhnZx()) != null && (linesList3 = chartViewOutSideConfigAkhnZx3.getLinesList()) != null) {
            linesList3.clear();
        }
        C36312oXc c36312oXcRcXXUw = kLineFormulaFragment.RcXXUw();
        if (c36312oXcRcXXUw != null) {
            c36312oXcRcXXUw.AEQbTJ(true);
        }
        C36250oUv c36250oUvQVAiDq4 = kLineFormulaFragment.QVAiDq();
        if (c36250oUvQVAiDq4 != null) {
            c36250oUvQVAiDq4.invalidate();
        }
        viewOnClickListenerC54939xaY.dismiss();
        C36250oUv c36250oUvQVAiDq5 = kLineFormulaFragment.QVAiDq();
        oWN own = (c36250oUvQVAiDq5 == null || (mapZLjUOn = c36250oUvQVAiDq5.zLjUOn()) == null) ? null : mapZLjUOn.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
        kLineFormulaFragment.QVsKAR();
    }

    public final void gEmmrt(int i) {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oME ome = this.OHqIaq;
        if (ome == null || (viewOnClickListenerC39742pyA = ome.valueOf) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.setImageBackground(i);
    }

    public final void OLrzqt(double d, double d2) {
        oME ome;
        C39805pzK c39805pzK;
        C39805pzK c39805pzK2;
        oME ome2 = this.OHqIaq;
        if (ome2 != null && (c39805pzK2 = ome2.wlaJM) != null) {
            c39805pzK2.setVisibility(0);
        }
        C36250oUv c36250oUvQVAiDq = QVAiDq();
        if (c36250oUvQVAiDq == null || (ome = this.OHqIaq) == null || (c39805pzK = ome.wlaJM) == null) {
            return;
        }
        c39805pzK.setBitmapAndPos(c36250oUvQVAiDq, d, d2);
    }

    public final void QCjLjM() {
        C39805pzK c39805pzK;
        oME ome = this.OHqIaq;
        if (ome == null || (c39805pzK = ome.wlaJM) == null) {
            return;
        }
        c39805pzK.setVisibility(8);
    }

    public final void igXuih() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oME ome = this.OHqIaq;
        if (ome == null || (viewOnClickListenerC39742pyA = ome.valueOf) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.gEmmrt();
    }

    public final void fdOvFl() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oME ome = this.OHqIaq;
        if (ome == null || (viewOnClickListenerC39742pyA = ome.valueOf) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.copydefault();
    }

    public final void QVsKAR() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oME ome = this.OHqIaq;
        if (ome != null && (viewOnClickListenerC39742pyA = ome.valueOf) != null) {
            viewOnClickListenerC39742pyA.setVisibility(8);
        }
        run();
    }

    private final ArrayList<DrawLineData.DrawLineItem> EZpvd(ArrayList<DrawLineData.DrawLineItem> arrayList, String str) {
        int i = 0;
        int i2 = -1;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((Object) ((DrawLineData.DrawLineItem) obj).getIndexId(), (Object) str)) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            arrayList.remove(i2);
        }
        return arrayList;
    }

    public static final ViewModelProvider.Factory AuCTel(final KLineFormulaFragment kLineFormulaFragment) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C39507pte.class), new Function1() { // from class: o.psf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KLineFormulaFragment.KWHzl(this.KWHzl, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
