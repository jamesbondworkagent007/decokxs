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
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.presenter.ContractGridRelatedPosPresenter;
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

/* JADX INFO: renamed from: o.wzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54206wzw extends AbstractC49945uyC<AbstractC48654uZk, ContractGridRelatedPosPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.lang.Float, Unit> AhwBna;
    public ContractGridClosePositionReq djBIcL;
    public View.OnClickListener gEmmrt;
    public DetailsData valueOf;
    public final int copydefault = C48033uCm.Activity.Dff;
    public final uBH AYXKKw = new uBH(new Function0() { // from class: o.wzA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54206wzw.AhwBna(this.KWHzl);
        }
    });
    public final uBH KWHzl = new uBH(new Function0() { // from class: o.wzz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54206wzw.AYXKKw(this.AEQbTJ);
        }
    });
    public boolean AEQbTJ = true;

    /* JADX INFO: renamed from: o.wzw$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    public static final /* synthetic */ AbstractC48654uZk valueOf(C54206wzw c54206wzw) {
        return c54206wzw.values();
    }

    /* JADX INFO: renamed from: o.wzw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wzw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C54206wzw copydefault(@NotNull DetailsData detailsData, @NotNull StrategyDetailsResponse strategyDetailsResponse) {
            Intrinsics.checkNotNullParameter(detailsData, "");
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            C54206wzw c54206wzw = new C54206wzw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("positionsItem", detailsData);
            bundle.putParcelable("botItem", strategyDetailsResponse);
            c54206wzw.setArguments(bundle);
            return c54206wzw;
        }
    }

    public static final Unit AhwBna(C54206wzw c54206wzw) {
        c54206wzw.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C54206wzw c54206wzw) {
        c54206wzw.copydefault();
        c54206wzw.fIwbmz();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        StrategyDetailsResponse strategyDetailsResponse;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (strategyDetailsResponse = (StrategyDetailsResponse) arguments.getParcelable("botItem")) == null) {
            strategyDetailsResponse = new StrategyDetailsResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.ArrayList) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (ExtendedBusinessInfo) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (TacticsVoucherInfo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (java.lang.Float) null, (java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (java.util.List) null, (StrategyProfitResponse) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (java.lang.String) null, (BotVo) null, (StrategyDcaEditResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        contractGridRelatedPosPresenterOLrzqt.OLrzqt(strategyDetailsResponse);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? (DetailsData) arguments.getParcelable("positionsItem") : null;
        getNewProxyInstance();
        hDKMBd();
        ejfBZ();
        fJNWhG();
        fARcdN();
        iwGUEr();
        getFieldNames();
        uzCIH();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(OLrzqt().OLrzqt().getInstType(), OLrzqt().OLrzqt().getInstId(), OLrzqt().OLrzqt().isHistory(), null, null, 24, null);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AYXKKw().setText(C33069mpW.copydefault(C55688xof.Application.FullyDrawnReporterOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("tradingPair", coinTitle$default))));
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void iwGUEr() {
        OLrzqt().values();
    }

    public final void fARcdN() {
        java.lang.String posSide;
        StrategyPositionResponse originPosition;
        java.lang.String pos;
        StrategyPositionResponse originPosition2;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.valueOf;
        java.lang.String str = "";
        if (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData2 = this.valueOf;
        if (detailsData2 != null && (originPosition = detailsData2.getOriginPosition()) != null && (pos = originPosition.getPos()) != null) {
            str = pos;
        }
        Intrinsics.EZpvd((java.lang.Object) contractGridRelatedPosPresenterOLrzqt.OLrzqt(posSide, str), (java.lang.Object) "buy");
        C52794wYp c52794wYpCopydefault = values().copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(262);
        }
    }

    public final void fJNWhG() {
        C55258xgZ c55258xgZ = values().OLrzqt;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
        values().valueOf.setText("--");
    }

    /* JADX INFO: renamed from: o.wzw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public final void ejfBZ() {
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        java.lang.String strGEmmrt = "--";
        values().AYXKKw.setText("--");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(OLrzqt().OLrzqt().getInstId());
        android.widget.TextView textView = values().AhwBna;
        DetailsData detailsData = this.valueOf;
        java.lang.String pos = (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null) ? null : originPosition2.getPos();
        if (pos != null && pos.length() != 0) {
            java.lang.String instType = OLrzqt().OLrzqt().getInstType();
            DetailsData detailsData2 = this.valueOf;
            C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(instType, strAEQbTJ, (detailsData2 == null || (originPosition = detailsData2.getOriginPosition()) == null) ? null : originPosition.getPosCcy());
            strGEmmrt = c54571xNhOLrzqt != null ? c54571xNhOLrzqt.gEmmrt(AuCTel()) : null;
        }
        textView.setText(strGEmmrt);
    }

    public final java.lang.String AuCTel() {
        StrategyPositionResponse originPosition;
        java.lang.String pos;
        java.lang.String strReplaceFirst$default;
        DetailsData detailsData = this.valueOf;
        return (detailsData == null || (originPosition = detailsData.getOriginPosition()) == null || (pos = originPosition.getPos()) == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(pos, "-", "", false, 4, (java.lang.Object) null)) == null) ? "" : strReplaceFirst$default;
    }

    /* JADX INFO: renamed from: o.wzw$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C54206wzw EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C54206wzw c54206wzw) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c54206wzw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaImageOnly), C33070mpX.AYXKKw(C55688xof.Application.getMimeType));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), (View.OnClickListener) new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wzw$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C54206wzw KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C54206wzw c54206wzw) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c54206wzw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wzw$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C54206wzw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C54206wzw c54206wzw) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c54206wzw;
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
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.valueOf != null && this.copydefault.isConnected()) {
                    xUW xuw = xUW.KWHzl;
                    DetailsData detailsData = this.copydefault.valueOf;
                    if (detailsData == null || (instId = detailsData.getInstId()) == null) {
                        instId = "";
                    }
                    java.lang.String strAEQbTJ = xuw.AEQbTJ(instId);
                    java.lang.String strKWHzl = null;
                    if (!C54206wzw.valueOf(this.copydefault).KWHzl.zLjUOn()) {
                        DetailsData detailsData2 = this.copydefault.valueOf;
                        if (detailsData2 == null || (instType = detailsData2.getInstType()) == null) {
                            instType = "";
                        }
                        C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(instType, strAEQbTJ, null, 4, null);
                        if (c54571xNhCreateStrategyTradeConverter$default != null) {
                            strKWHzl = c54571xNhCreateStrategyTradeConverter$default.KWHzl(C54206wzw.valueOf(this.copydefault).KWHzl.AkhnZx());
                        }
                    } else {
                        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = this.copydefault.OLrzqt();
                        DetailsData detailsData3 = this.copydefault.valueOf;
                        strKWHzl = contractGridRelatedPosPresenterOLrzqt.KWHzl(detailsData3 != null ? detailsData3.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(C54206wzw.valueOf(this.copydefault).KWHzl.fJNWhG())));
                    }
                    xVK xvk = xVK.EZpvd;
                    java.lang.String str = strKWHzl == null ? "" : strKWHzl;
                    DetailsData detailsData4 = this.copydefault.valueOf;
                    if (detailsData4 == null || (instId2 = detailsData4.getInstId()) == null) {
                        instId2 = "";
                    }
                    DetailsData detailsData5 = this.copydefault.valueOf;
                    if (detailsData5 == null || (instType2 = detailsData5.getInstType()) == null) {
                        instType2 = "";
                    }
                    java.lang.String strKWHzl2 = xvk.KWHzl(str, instId2, instType2);
                    java.lang.String str2 = strKWHzl2 == null ? strKWHzl : strKWHzl2;
                    java.lang.String strKWHzl3 = C54206wzw.valueOf(this.copydefault).AEQbTJ.EZpvd() ? MultiTransferSignData.DEFAULT_INTERVAL : C54206wzw.valueOf(this.copydefault).AEQbTJ.KWHzl();
                    C54206wzw c54206wzw = this.copydefault;
                    DetailsData detailsData6 = c54206wzw.valueOf;
                    c54206wzw.djBIcL = new ContractGridClosePositionReq((detailsData6 == null || (algoId = detailsData6.getAlgoId()) == null) ? "" : algoId, (java.lang.String) null, str2, strKWHzl3, java.lang.Boolean.FALSE, 2, (DefaultConstructorMarker) null);
                    C54206wzw c54206wzw2 = this.copydefault;
                    ContractGridClosePositionReq contractGridClosePositionReq = c54206wzw2.djBIcL;
                    Intrinsics.copydefault(contractGridClosePositionReq);
                    c54206wzw2.AEQbTJ(contractGridClosePositionReq);
                }
            }
        }
    }

    private final void getNewProxyInstance() {
        java.lang.String posSide;
        java.lang.String pos;
        kotlin.Pair pairOLrzqt;
        java.lang.String level;
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        java.lang.String fondType;
        C52534wOz c52534wOz = C52534wOz.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        DetailsData detailsData = this.valueOf;
        values().EZpvd.addView(c52534wOz.copydefault(contextRequireContext, new TacticsListLabelData((detailsData == null || (fondType = detailsData.getFondType()) == null) ? "" : fondType, false, 0, 0, 0, 30, null)));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
        DetailsData detailsData2 = this.valueOf;
        if (detailsData2 == null || (originPosition2 = detailsData2.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData3 = this.valueOf;
        if (detailsData3 == null || (originPosition = detailsData3.getOriginPosition()) == null || (pos = originPosition.getPos()) == null) {
            pos = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) contractGridRelatedPosPresenterOLrzqt.OLrzqt(posSide, pos), (java.lang.Object) "buy")) {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addCallback), 14);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2), 13);
        }
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        values().EZpvd.setExpand(true);
        C55372xih c55372xih = values().EZpvd;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        c55372xih.addView(c52534wOz.copydefault(contextRequireContext2, new TacticsListLabelData(str2, false, iIntValue, 0, 0, 26, null)));
        C55372xih c55372xih2 = values().EZpvd;
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        DetailsData detailsData4 = this.valueOf;
        if (detailsData4 != null && (level = detailsData4.getLevel()) != null) {
            str = level;
        }
        c55372xih2.addView(c52534wOz.copydefault(contextRequireContext3, new TacticsListLabelData(C56033xvF.getBotLever$default(str, false, 2, null), false, iIntValue, 0, 0, 26, null)));
    }

    private final void hDKMBd() {
        values().AEQbTJ.setMarketText(C33070mpX.AYXKKw(C55688xof.Application.createFullyDrawnExecutor));
        values().AEQbTJ.setNormalTitle(C33070mpX.AYXKKw(C55688xof.Application.addCancellable));
        values().AEQbTJ.setMaxDecimal(C56033xvF.KWHzl(OLrzqt().OLrzqt().getInstType(), OLrzqt().OLrzqt().getInstId()));
        values().AEQbTJ.setLabel(C56033xvF.AEQbTJ(OLrzqt().OLrzqt().getInstType(), OLrzqt().OLrzqt().getInstId()));
        final C47988uAv c47988uAv = values().KWHzl;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.reportWhenComplete), null, 2, null);
        c47988uAv.setMaxDecimal(C56033xvF.OLrzqt(OLrzqt().OLrzqt().getInstType(), OLrzqt().OLrzqt().getInstId()));
        c47988uAv.setInputUnit(C56033xvF.getBotAmountUnit$default(OLrzqt().OLrzqt().getInstType(), OLrzqt().OLrzqt().getInstId(), null, null, 12, null));
        c47988uAv.post(new java.lang.Runnable() { // from class: o.wzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C54206wzw.AEQbTJ(c47988uAv);
            }
        });
        this.gEmmrt = new View.OnClickListener() { // from class: o.wzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C54206wzw.AEQbTJ(this.copydefault, view);
            }
        };
        this.AhwBna = new Function1() { // from class: o.wzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54206wzw.EZpvd(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
            }
        };
    }

    public static final void AEQbTJ(C47988uAv c47988uAv) {
        c47988uAv.setMaxPercent(true);
    }

    public static final void AEQbTJ(C54206wzw c54206wzw, android.view.View view) {
        c54206wzw.fIwbmz();
    }

    public static final Unit EZpvd(C54206wzw c54206wzw, float f) {
        c54206wzw.fIwbmz();
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        StrategyType strategyType;
        android.widget.TextView textView = values().valueOf;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.valueOf;
        StrategyPositionResponse originPosition = detailsData != null ? detailsData.getOriginPosition() : null;
        if (values().AEQbTJ.EZpvd()) {
            strategyType = StrategyType.MARKET;
        } else {
            strategyType = StrategyType.LIMIT;
        }
        textView.setText(contractGridRelatedPosPresenterOLrzqt.KWHzl(originPosition, strategyType, values().AEQbTJ.EZpvd() ? "" : values().AEQbTJ.KWHzl(), values().KWHzl.AkhnZx(), C33129mqd.gEmmrt(java.lang.Float.valueOf(values().KWHzl.fJNWhG()))));
    }

    private final void uzCIH() {
        values().AEQbTJ.setMarketSelectListener(new View.OnClickListener() { // from class: o.wzF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C54206wzw.OLrzqt(this.KWHzl, view);
            }
        });
        values().KWHzl.setPercentSeekBarListener(new Function1() { // from class: o.wzE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54206wzw.OLrzqt(this.copydefault, ((java.lang.Float) obj).floatValue());
            }
        });
        C52794wYp c52794wYpCopydefault = values().copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
    }

    public static final void OLrzqt(C54206wzw c54206wzw, android.view.View view) {
        c54206wzw.fIwbmz();
    }

    public static final Unit OLrzqt(C54206wzw c54206wzw, float f) {
        if (c54206wzw.values().KWHzl.zLjUOn()) {
            c54206wzw.values().KWHzl.AEQbTJ();
            c54206wzw.values().KWHzl.setInputCover(xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.copydefault(java.lang.Float.valueOf(f)), null, C38307pTy.Companion.copydefault(0), null, java.lang.Double.valueOf(100.0d), null, 42, null));
            c54206wzw.fIwbmz();
        } else {
            c54206wzw.values().KWHzl.setInputCover(null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(ContractGridClosePositionReq contractGridClosePositionReq) {
        C56283xzr c56283xzrAhwBna = OLrzqt().AhwBna();
        c56283xzrAhwBna.copydefault(contractGridClosePositionReq);
        c56283xzrAhwBna.KWHzl(new Function1() { // from class: o.wzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54206wzw.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56283xzrAhwBna, 0L, 1, null);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[PHI: r0
  0x0102: PHI (r0v29 java.lang.String) = (r0v22 java.lang.String), (r0v32 java.lang.String) binds: [B:54:0x0126, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isConnected() {
        java.lang.String instId;
        java.lang.String instType;
        if (!values().AEQbTJ.EZpvd() && C33129mqd.OLrzqt((java.lang.Object) values().AEQbTJ.KWHzl(), (java.lang.Object) 0)) {
            C55326xho.KWHzl(C55688xof.Application.ActionBarOnNavigationListener, 500);
            return false;
        }
        java.lang.String strAkhnZx = values().KWHzl.AkhnZx();
        java.lang.String str = "";
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Float.valueOf(values().KWHzl.fJNWhG()), (java.lang.Object) 0)) {
            if (C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
                C55326xho.KWHzl(C55688xof.Application.onMenuVisibilityChanged, 500);
                return false;
            }
        } else {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
            DetailsData detailsData = this.valueOf;
            strAkhnZx = contractGridRelatedPosPresenterOLrzqt.KWHzl(detailsData != null ? detailsData.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(values().KWHzl.fJNWhG())));
            if (strAkhnZx == null) {
                strAkhnZx = "";
            }
        }
        if (strAkhnZx.length() == 0 || C33129mqd.AEQbTJ(strAkhnZx) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            C55326xho.KWHzl(C55688xof.Application.onMenuVisibilityChanged, 500);
            return false;
        }
        if (values().KWHzl.getFieldNames()) {
            values().KWHzl.AuCTelauCTel();
            return false;
        }
        xUW xuw = xUW.KWHzl;
        DetailsData detailsData2 = this.valueOf;
        if (detailsData2 == null || (instId = detailsData2.getInstId()) == null) {
            instId = "";
        }
        java.lang.String strAEQbTJ = xuw.AEQbTJ(instId);
        if (values().KWHzl.zLjUOn()) {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt2 = OLrzqt();
            DetailsData detailsData3 = this.valueOf;
            java.lang.String strKWHzl = contractGridRelatedPosPresenterOLrzqt2.KWHzl(detailsData3 != null ? detailsData3.getOriginPosition() : null, C33129mqd.gEmmrt(java.lang.Float.valueOf(values().KWHzl.fJNWhG())));
            if (strKWHzl != null) {
                str = strKWHzl;
            }
        } else {
            DetailsData detailsData4 = this.valueOf;
            if (detailsData4 == null || (instType = detailsData4.getInstType()) == null) {
                instType = "";
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(instType, strAEQbTJ, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default != null && (strKWHzl = c54571xNhCreateStrategyTradeConverter$default.KWHzl(values().KWHzl.AkhnZx())) != null) {
            }
        }
        if (!C33129mqd.AEQbTJ(str, AuCTel())) {
            return true;
        }
        values().KWHzl.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.ImmLeaksCleaner));
        return false;
    }

    private final void getFieldNames() {
        TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> tradeLiveDataAkhnZx = OLrzqt().AkhnZx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.wzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54206wzw.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit KWHzl(C54206wzw c54206wzw, kotlin.Pair pair) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(c54206wzw.OLrzqt().OLrzqt().getInstId());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strGEmmrt = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c54206wzw.OLrzqt().OLrzqt().getInstType())) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) == null) ? null : xmsGEmmrt.gEmmrt((java.lang.String) pair.getFirst());
        c54206wzw.values().AYXKKw.setText(strGEmmrt);
        if (c54206wzw.AEQbTJ) {
            C47980uAn.setText$default(c54206wzw.values().AEQbTJ, strGEmmrt != null ? strGEmmrt : "", false, 2, null);
            c54206wzw.AEQbTJ = false;
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        java.lang.String posSide;
        java.lang.String pos;
        java.lang.String instType;
        java.lang.String instId;
        StrategyPositionResponse originPosition;
        StrategyPositionResponse originPosition2;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenterOLrzqt = OLrzqt();
        DetailsData detailsData = this.valueOf;
        if (detailsData == null || (originPosition2 = detailsData.getOriginPosition()) == null || (posSide = originPosition2.getPosSide()) == null) {
            posSide = "";
        }
        DetailsData detailsData2 = this.valueOf;
        if (detailsData2 == null || (originPosition = detailsData2.getOriginPosition()) == null || (pos = originPosition.getPos()) == null) {
            pos = "";
        }
        java.lang.String strOLrzqt = contractGridRelatedPosPresenterOLrzqt.OLrzqt(posSide, pos);
        DetailsData detailsData3 = this.valueOf;
        java.lang.String str2 = (detailsData3 == null || (instId = detailsData3.getInstId()) == null) ? "" : instId;
        DetailsData detailsData4 = this.valueOf;
        EZpvd(strOLrzqt, str, str2, (detailsData4 == null || (instType = detailsData4.getInstType()) == null) ? "" : instType, new Function1() { // from class: o.wzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54206wzw.copydefault(this.KWHzl, str, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C54206wzw c54206wzw, java.lang.String str, boolean z) {
        if (z) {
            ContractGridClosePositionReq contractGridClosePositionReq = c54206wzw.djBIcL;
            if (contractGridClosePositionReq != null) {
                contractGridClosePositionReq.setPx(str);
            }
            ContractGridClosePositionReq contractGridClosePositionReq2 = c54206wzw.djBIcL;
            if (contractGridClosePositionReq2 != null) {
                c54206wzw.AEQbTJ(contractGridClosePositionReq2);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final Function1<? super java.lang.Boolean, Unit> function1) {
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
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.iSpHlg), new View.OnClickListener() { // from class: o.wzD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C54206wzw.KWHzl(function1, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage), new View.OnClickListener() { // from class: o.wzC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C54206wzw.OLrzqt(function1, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(java.lang.Boolean.TRUE);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(java.lang.Boolean.FALSE);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault() {
        C47988uAv c47988uAv = values().KWHzl;
        xVK xvk = xVK.EZpvd;
        java.lang.String strAkhnZx = values().KWHzl.AkhnZx();
        DetailsData detailsData = this.valueOf;
        java.lang.String instId = detailsData != null ? detailsData.getInstId() : null;
        DetailsData detailsData2 = this.valueOf;
        c47988uAv.setInputErrorMsg(xvk.OLrzqt(strAkhnZx, instId, detailsData2 != null ? detailsData2.getInstType() : null));
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        values().AEQbTJ.KWHzl(this.AYXKKw);
        values().KWHzl.KWHzl(this.KWHzl);
        values().KWHzl.copydefault(this.AhwBna);
        values().AEQbTJ.setMarketSelectListener(this.gEmmrt);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        values().AEQbTJ.copydefault(this.AYXKKw);
        values().KWHzl.OLrzqt(this.KWHzl);
        values().KWHzl.AEQbTJ(this.AhwBna);
        values().AEQbTJ.setMarketSelectListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        values().KWHzl.setOnMaxValueTriggerCallback(null);
        super.onDestroy();
    }

    public static final Unit EZpvd(C54206wzw c54206wzw, ResponseData responseData) {
        ContractGridClosePositionData contractGridClosePositionData;
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
            c54206wzw.dismiss();
        } else if (C33129mqd.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), C56120xwn.valueOf.djBIcL())) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null && (contractGridClosePositionData = (ContractGridClosePositionData) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (str = contractGridClosePositionData.get_data()) != null) {
                str2 = str;
            }
            c54206wzw.AEQbTJ(str2);
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
