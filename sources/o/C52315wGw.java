package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.biz.StrategyType;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.presenter.NoClosePositionPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52315wGw extends AbstractC49945uyC<uRY, NoClosePositionPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public DetailsData AYXKKw;
    public ContractGridClosePositionReq djBIcL;
    public Function1<? super java.lang.Float, Unit> gEmmrt;
    public View.OnClickListener valueOf;
    public final int copydefault = C48033uCm.Activity.aJZHYI;
    public final uBH AhwBna = new uBH(new Function0() { // from class: o.wGI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52315wGw.AhwBna(this.OLrzqt);
        }
    });
    public final uBH AEQbTJ = new uBH(new Function0() { // from class: o.wGJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52315wGw.AYXKKw(this.KWHzl);
        }
    });
    public boolean KWHzl = true;

    /* JADX INFO: renamed from: o.wGw$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.AbstractC49945uyC
    public boolean fetchVPNInfo() {
        return true;
    }

    public static final /* synthetic */ uRY valueOf(C52315wGw c52315wGw) {
        return c52315wGw.values();
    }

    /* JADX INFO: renamed from: o.wGw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wGw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C52315wGw AEQbTJ(@NotNull DetailsData detailsData) {
            Intrinsics.checkNotNullParameter(detailsData, "");
            C52315wGw c52315wGw = new C52315wGw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("positionsItem", detailsData);
            c52315wGw.setArguments(bundle);
            return c52315wGw;
        }
    }

    public static final Unit AhwBna(C52315wGw c52315wGw) {
        c52315wGw.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C52315wGw c52315wGw) {
        c52315wGw.isConnected();
        c52315wGw.getFieldNames();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? (DetailsData) arguments.getParcelable("positionsItem") : null;
        uzCIH();
        getNewProxyInstance();
        ejfBZ();
        hDKMBd();
        fIwbmz();
        fARcdN();
        iwGUEr();
        copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterKtreportWhenComplete1));
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    private final void fARcdN() {
        OLrzqt().DbNXlk();
    }

    private final void fIwbmz() {
        java.lang.String posSide;
        StrategyPositionResponse originPosition;
        java.lang.String pos;
        StrategyPositionResponse originPosition2;
        NoClosePositionPresenter noClosePositionPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.AYXKKw;
        java.lang.String str = "";
        if (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData2 = this.AYXKKw;
        if (detailsData2 != null && (originPosition = detailsData2.getOriginPosition()) != null && (pos = originPosition.getPos()) != null) {
            str = pos;
        }
        Intrinsics.EZpvd((java.lang.Object) noClosePositionPresenterOLrzqt.EZpvd(posSide, str), (java.lang.Object) "buy");
        C52794wYp c52794wYpCopydefault = values().KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(262);
        }
    }

    private final void hDKMBd() {
        C55258xgZ c55258xgZ = values().OLrzqt;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        values().AYXKKw.setText("--");
    }

    /* JADX INFO: renamed from: o.wGw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    private final void ejfBZ() {
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        java.lang.String strGEmmrt = "--";
        values().valueOf.setText("--");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(OLrzqt().AEQbTJ().getInstId());
        android.widget.TextView textView = values().djBIcL;
        DetailsData detailsData = this.AYXKKw;
        java.lang.String pos = (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null) ? null : originPosition2.getPos();
        if (pos != null && pos.length() != 0) {
            java.lang.String instType = OLrzqt().AEQbTJ().getInstType();
            DetailsData detailsData2 = this.AYXKKw;
            C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(instType, strAEQbTJ, (detailsData2 == null || (originPosition = detailsData2.getOriginPosition()) == null) ? null : originPosition.getPosCcy());
            strGEmmrt = c54571xNhOLrzqt != null ? c54571xNhOLrzqt.gEmmrt(fJNWhG()) : null;
        }
        textView.setText(strGEmmrt);
    }

    private final java.lang.String fJNWhG() {
        StrategyPositionResponse originPosition;
        java.lang.String pos;
        java.lang.String strReplaceFirst$default;
        DetailsData detailsData = this.AYXKKw;
        return (detailsData == null || (originPosition = detailsData.getOriginPosition()) == null || (pos = originPosition.getPos()) == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(pos, "-", "", false, 4, (java.lang.Object) null)) == null) ? "" : strReplaceFirst$default;
    }

    private final void uzCIH() {
        java.lang.String posSide;
        java.lang.String pos;
        kotlin.Pair pairOLrzqt;
        java.lang.String level;
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        java.lang.String fondType;
        values().EZpvd.setText(C56033xvF.getCoinTitle$default(OLrzqt().AEQbTJ().getInstType(), OLrzqt().AEQbTJ().getInstId(), OLrzqt().AEQbTJ().isHistory(), null, null, 24, null));
        C55372xih c55372xih = values().AhwBna;
        C52534wOz c52534wOz = C52534wOz.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        DetailsData detailsData = this.AYXKKw;
        c55372xih.addView(c52534wOz.copydefault(contextRequireContext, new TacticsListLabelData((detailsData == null || (fondType = detailsData.getFondType()) == null) ? "" : fondType, false, 0, 0, 0, 30, null)));
        NoClosePositionPresenter noClosePositionPresenterOLrzqt = OLrzqt();
        DetailsData detailsData2 = this.AYXKKw;
        if (detailsData2 == null || (originPosition2 = detailsData2.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData3 = this.AYXKKw;
        if (detailsData3 == null || (originPosition = detailsData3.getOriginPosition()) == null || (pos = originPosition.getPos()) == null) {
            pos = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) noClosePositionPresenterOLrzqt.EZpvd(posSide, pos), (java.lang.Object) "buy")) {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addCallback), 14);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2), 13);
        }
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        values().AhwBna.setExpand(true);
        C55372xih c55372xih2 = values().AhwBna;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        c55372xih2.addView(c52534wOz.copydefault(contextRequireContext2, new TacticsListLabelData(str2, false, iIntValue, 0, 0, 26, null)));
        C55372xih c55372xih3 = values().AhwBna;
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        DetailsData detailsData4 = this.AYXKKw;
        if (detailsData4 != null && (level = detailsData4.getLevel()) != null) {
            str = level;
        }
        c55372xih3.addView(c52534wOz.copydefault(contextRequireContext3, new TacticsListLabelData(C56033xvF.getBotLever$default(str, false, 2, null), false, iIntValue, 0, 0, 26, null)));
    }

    /* JADX INFO: renamed from: o.wGw$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C52315wGw KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52315wGw c52315wGw) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c52315wGw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wGw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52315wGw KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52315wGw c52315wGw) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c52315wGw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaImageOnly), C33070mpX.AYXKKw(C55688xof.Application.getMimeType));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wGw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52315wGw AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52315wGw c52315wGw) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c52315wGw;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String instId;
            java.lang.String instType;
            java.lang.String instId2;
            java.lang.String instType2;
            java.lang.String algoId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.AEQbTJ.AYXKKw != null && this.AEQbTJ.AuCTel()) {
                    xUW xuw = xUW.KWHzl;
                    DetailsData detailsData = this.AEQbTJ.AYXKKw;
                    if (detailsData == null || (instId = detailsData.getInstId()) == null) {
                        instId = "";
                    }
                    java.lang.String strAEQbTJ = xuw.AEQbTJ(instId);
                    java.lang.String strKWHzl = null;
                    if (!C52315wGw.valueOf(this.AEQbTJ).AEQbTJ.zLjUOn()) {
                        DetailsData detailsData2 = this.AEQbTJ.AYXKKw;
                        if (detailsData2 == null || (instType = detailsData2.getInstType()) == null) {
                            instType = "";
                        }
                        C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(instType, strAEQbTJ, null, 4, null);
                        if (c54571xNhCreateStrategyTradeConverter$default != null) {
                            strKWHzl = c54571xNhCreateStrategyTradeConverter$default.KWHzl(C52315wGw.valueOf(this.AEQbTJ).AEQbTJ.AkhnZx());
                        }
                    } else {
                        NoClosePositionPresenter noClosePositionPresenterOLrzqt = this.AEQbTJ.OLrzqt();
                        DetailsData detailsData3 = this.AEQbTJ.AYXKKw;
                        strKWHzl = noClosePositionPresenterOLrzqt.AEQbTJ(detailsData3 != null ? detailsData3.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(C52315wGw.valueOf(this.AEQbTJ).AEQbTJ.fJNWhG())));
                    }
                    xVK xvk = xVK.EZpvd;
                    java.lang.String str = strKWHzl == null ? "" : strKWHzl;
                    DetailsData detailsData4 = this.AEQbTJ.AYXKKw;
                    if (detailsData4 == null || (instId2 = detailsData4.getInstId()) == null) {
                        instId2 = "";
                    }
                    DetailsData detailsData5 = this.AEQbTJ.AYXKKw;
                    if (detailsData5 == null || (instType2 = detailsData5.getInstType()) == null) {
                        instType2 = "";
                    }
                    java.lang.String strKWHzl2 = xvk.KWHzl(str, instId2, instType2);
                    java.lang.String str2 = strKWHzl2 == null ? strKWHzl : strKWHzl2;
                    java.lang.String strKWHzl3 = C52315wGw.valueOf(this.AEQbTJ).copydefault.EZpvd() ? MultiTransferSignData.DEFAULT_INTERVAL : C52315wGw.valueOf(this.AEQbTJ).copydefault.KWHzl();
                    C52315wGw c52315wGw = this.AEQbTJ;
                    DetailsData detailsData6 = c52315wGw.AYXKKw;
                    c52315wGw.djBIcL = new ContractGridClosePositionReq((detailsData6 == null || (algoId = detailsData6.getAlgoId()) == null) ? "" : algoId, (java.lang.String) null, str2, strKWHzl3, java.lang.Boolean.FALSE, 2, (DefaultConstructorMarker) null);
                    C52315wGw c52315wGw2 = this.AEQbTJ;
                    ContractGridClosePositionReq contractGridClosePositionReq = c52315wGw2.djBIcL;
                    Intrinsics.copydefault(contractGridClosePositionReq);
                    c52315wGw2.KWHzl(contractGridClosePositionReq);
                }
            }
        }
    }

    private final void getNewProxyInstance() {
        values().copydefault.setMarketText(C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor));
        values().copydefault.setNormalTitle(C33070mpX.AYXKKw(C55688xof.Application.addCancellable));
        values().copydefault.setMaxDecimal(C56033xvF.KWHzl(OLrzqt().AEQbTJ().getInstType(), OLrzqt().AEQbTJ().getInstId()));
        values().copydefault.setLabel(C56033xvF.AEQbTJ(OLrzqt().AEQbTJ().getInstType(), OLrzqt().AEQbTJ().getInstId()));
        final C47988uAv c47988uAv = values().AEQbTJ;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.reportWhenComplete), null, 2, null);
        c47988uAv.setMaxDecimal(C56033xvF.OLrzqt(OLrzqt().AEQbTJ().getInstType(), OLrzqt().AEQbTJ().getInstId()));
        c47988uAv.setInputUnit(C56033xvF.getBotAmountUnit$default(OLrzqt().AEQbTJ().getInstType(), OLrzqt().AEQbTJ().getInstId(), null, null, 12, null));
        c47988uAv.post(new java.lang.Runnable() { // from class: o.wGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C52315wGw.AEQbTJ(c47988uAv);
            }
        });
        this.valueOf = new View.OnClickListener() { // from class: o.wGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52315wGw.copydefault(this.OLrzqt, view);
            }
        };
        this.gEmmrt = new Function1() { // from class: o.wGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.AEQbTJ(this.KWHzl, ((java.lang.Float) obj).floatValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(C47988uAv c47988uAv) {
        c47988uAv.setMaxPercent(true);
    }

    public static final void copydefault(C52315wGw c52315wGw, android.view.View view) {
        c52315wGw.getFieldNames();
    }

    public static final Unit AEQbTJ(C52315wGw c52315wGw, float f) {
        c52315wGw.getFieldNames();
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        StrategyType strategyType;
        android.widget.TextView textView = values().AYXKKw;
        NoClosePositionPresenter noClosePositionPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.AYXKKw;
        StrategyPositionResponse originPosition = detailsData != null ? detailsData.getOriginPosition() : null;
        if (values().copydefault.EZpvd()) {
            strategyType = StrategyType.MARKET;
        } else {
            strategyType = StrategyType.LIMIT;
        }
        textView.setText(noClosePositionPresenterOLrzqt.EZpvd(originPosition, strategyType, values().copydefault.EZpvd() ? "" : values().copydefault.KWHzl(), values().AEQbTJ.AkhnZx(), C33129mqd.gEmmrt(java.lang.Float.valueOf(values().AEQbTJ.fJNWhG()))));
    }

    private final void copydefault() {
        values().copydefault.setMarketSelectListener(new View.OnClickListener() { // from class: o.wGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52315wGw.KWHzl(this.EZpvd, view);
            }
        });
        values().AEQbTJ.setPercentSeekBarListener(new Function1() { // from class: o.wGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.copydefault(this.KWHzl, ((java.lang.Float) obj).floatValue());
            }
        });
        C52794wYp c52794wYpCopydefault = values().KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final void KWHzl(C52315wGw c52315wGw, android.view.View view) {
        c52315wGw.getFieldNames();
    }

    public static final Unit copydefault(C52315wGw c52315wGw, float f) {
        if (c52315wGw.values().AEQbTJ.zLjUOn()) {
            c52315wGw.values().AEQbTJ.AEQbTJ();
            c52315wGw.values().AEQbTJ.setInputCover(xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.copydefault(java.lang.Float.valueOf(f)), null, C38307pTy.Companion.copydefault(0), null, java.lang.Double.valueOf(100.0d), null, 42, null));
            c52315wGw.getFieldNames();
        } else {
            c52315wGw.values().AEQbTJ.setInputCover(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(ContractGridClosePositionReq contractGridClosePositionReq) {
        C56283xzr c56283xzrValueOf = OLrzqt().valueOf();
        c56283xzrValueOf.copydefault(contractGridClosePositionReq);
        c56283xzrValueOf.KWHzl(new Function1() { // from class: o.wGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56283xzrValueOf, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[PHI: r0
  0x0102: PHI (r0v29 java.lang.String) = (r0v22 java.lang.String), (r0v32 java.lang.String) binds: [B:54:0x0126, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AuCTel() {
        java.lang.String instId;
        java.lang.String instType;
        if (!values().copydefault.EZpvd() && C33129mqd.OLrzqt((java.lang.Object) values().copydefault.KWHzl(), (java.lang.Object) 0)) {
            C55326xho.KWHzl(C55688xof.Application.ActionBarOnNavigationListener, 500);
            return false;
        }
        java.lang.String strAkhnZx = values().AEQbTJ.AkhnZx();
        java.lang.String str = "";
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Float.valueOf(values().AEQbTJ.fJNWhG()), (java.lang.Object) 0)) {
            if (C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
                C55326xho.KWHzl(C55688xof.Application.onMenuVisibilityChanged, 500);
                return false;
            }
        } else {
            NoClosePositionPresenter noClosePositionPresenterOLrzqt = OLrzqt();
            DetailsData detailsData = this.AYXKKw;
            strAkhnZx = noClosePositionPresenterOLrzqt.AEQbTJ(detailsData != null ? detailsData.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(values().AEQbTJ.fJNWhG())));
            if (strAkhnZx == null) {
                strAkhnZx = "";
            }
        }
        if (strAkhnZx.length() == 0 || C33129mqd.AEQbTJ(strAkhnZx) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            C55326xho.KWHzl(C55688xof.Application.onMenuVisibilityChanged, 500);
            return false;
        }
        if (values().AEQbTJ.getFieldNames()) {
            values().AEQbTJ.AuCTelauCTel();
            return false;
        }
        xUW xuw = xUW.KWHzl;
        DetailsData detailsData2 = this.AYXKKw;
        if (detailsData2 == null || (instId = detailsData2.getInstId()) == null) {
            instId = "";
        }
        java.lang.String strAEQbTJ = xuw.AEQbTJ(instId);
        if (values().AEQbTJ.zLjUOn()) {
            NoClosePositionPresenter noClosePositionPresenterOLrzqt2 = OLrzqt();
            DetailsData detailsData3 = this.AYXKKw;
            java.lang.String strKWHzl = noClosePositionPresenterOLrzqt2.AEQbTJ(detailsData3 != null ? detailsData3.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(values().AEQbTJ.fJNWhG())));
            if (strKWHzl != null) {
                str = strKWHzl;
            }
        } else {
            DetailsData detailsData4 = this.AYXKKw;
            if (detailsData4 == null || (instType = detailsData4.getInstType()) == null) {
                instType = "";
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(instType, strAEQbTJ, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default != null && (strKWHzl = c54571xNhCreateStrategyTradeConverter$default.KWHzl(values().AEQbTJ.AkhnZx())) != null) {
            }
        }
        if (!C33129mqd.AEQbTJ(str, fJNWhG())) {
            return true;
        }
        values().AEQbTJ.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.ImmLeaksCleaner));
        return false;
    }

    private final void iwGUEr() {
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.wGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.KWHzl((androidx.core.util.Pair) obj);
            }
        }));
        TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> tradeLiveDataGEmmrt = OLrzqt().gEmmrt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(androidx.core.util.Pair pair) {
        java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52315wGw c52315wGw, kotlin.Pair pair) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(c52315wGw.OLrzqt().AEQbTJ().getInstId());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strGEmmrt = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c52315wGw.OLrzqt().AEQbTJ().getInstType())) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) == null) ? null : xmsGEmmrt.gEmmrt((java.lang.String) pair.getFirst());
        c52315wGw.values().valueOf.setText(strGEmmrt);
        if (c52315wGw.KWHzl) {
            C47980uAn.setText$default(c52315wGw.values().copydefault, strGEmmrt != null ? strGEmmrt : "", false, 2, null);
            c52315wGw.KWHzl = false;
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(final java.lang.String str) {
        java.lang.String posSide;
        java.lang.String pos;
        java.lang.String instType;
        java.lang.String instId;
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        NoClosePositionPresenter noClosePositionPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.AYXKKw;
        if (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData2 = this.AYXKKw;
        if (detailsData2 == null || (originPosition = detailsData2.getOriginPosition()) == null || (pos = originPosition.getPos()) == null) {
            pos = "";
        }
        java.lang.String strEZpvd = noClosePositionPresenterOLrzqt.EZpvd(posSide, pos);
        DetailsData detailsData3 = this.AYXKKw;
        java.lang.String str2 = (detailsData3 == null || (instId = detailsData3.getInstId()) == null) ? "" : instId;
        DetailsData detailsData4 = this.AYXKKw;
        KWHzl(strEZpvd, str, str2, (detailsData4 == null || (instType = detailsData4.getInstType()) == null) ? "" : instType, new Function1() { // from class: o.wGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52315wGw.KWHzl(this.EZpvd, str, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(C52315wGw c52315wGw, java.lang.String str, boolean z) {
        if (z) {
            ContractGridClosePositionReq contractGridClosePositionReq = c52315wGw.djBIcL;
            if (contractGridClosePositionReq != null) {
                contractGridClosePositionReq.setPx(str);
            }
            ContractGridClosePositionReq contractGridClosePositionReq2 = c52315wGw.djBIcL;
            if (contractGridClosePositionReq2 != null) {
                contractGridClosePositionReq2.setMktClose(java.lang.Boolean.TRUE);
            }
            ContractGridClosePositionReq contractGridClosePositionReq3 = c52315wGw.djBIcL;
            if (contractGridClosePositionReq3 != null) {
                c52315wGw.KWHzl(contractGridClosePositionReq3);
            }
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.String strValues;
        java.lang.String strCopydefault;
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(str3, str4);
        if (xmsAEQbTJ == null || (strValues = xmsAEQbTJ.values(str2)) == null) {
            strValues = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.clearObservers, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, strValues)));
        } else {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.dTTfOR, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, strValues)));
        }
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.iSpHlg), new View.OnClickListener() { // from class: o.wGv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52315wGw.KWHzl(function1, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage), new View.OnClickListener() { // from class: o.wGB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52315wGw.AEQbTJ(function1, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(java.lang.Boolean.TRUE);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(java.lang.Boolean.FALSE);
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void isConnected() {
        C47988uAv c47988uAv = values().AEQbTJ;
        xVK xvk = xVK.EZpvd;
        java.lang.String strAkhnZx = values().AEQbTJ.AkhnZx();
        DetailsData detailsData = this.AYXKKw;
        java.lang.String instId = detailsData != null ? detailsData.getInstId() : null;
        DetailsData detailsData2 = this.AYXKKw;
        c47988uAv.setInputErrorMsg(xvk.OLrzqt(strAkhnZx, instId, detailsData2 != null ? detailsData2.getInstType() : null));
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        values().copydefault.KWHzl(this.AhwBna);
        values().AEQbTJ.KWHzl(this.AEQbTJ);
        values().AEQbTJ.copydefault(this.gEmmrt);
        values().copydefault.setMarketSelectListener(this.valueOf);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        values().copydefault.copydefault(this.AhwBna);
        values().AEQbTJ.OLrzqt(this.AEQbTJ);
        values().AEQbTJ.AEQbTJ(this.gEmmrt);
        values().copydefault.setMarketSelectListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        values().AEQbTJ.setOnMaxValueTriggerCallback(null);
        super.onDestroy();
    }

    public static final Unit AEQbTJ(C52315wGw c52315wGw, ResponseData responseData) {
        ContractGridClosePositionData contractGridClosePositionData;
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
            c52315wGw.dismiss();
        } else if (C33129mqd.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), C56120xwn.valueOf.djBIcL())) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null && (contractGridClosePositionData = (ContractGridClosePositionData) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (str = contractGridClosePositionData.get_data()) != null) {
                str2 = str;
            }
            c52315wGw.KWHzl(str2);
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
