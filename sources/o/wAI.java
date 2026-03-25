package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.biz.TacticsType;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.ContractGridRelatedPosPresenter;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44103sDl;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C54206wzw;
import o.C55688xof;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class wAI extends LinearLayoutCompat {
    public ContractGridRelatedPosPresenter AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public C48659uZp KWHzl;
    public ActionBar OLrzqt;
    public TacticsDetailPresenter copydefault;

    /* JADX INFO: loaded from: classes17.dex */
    public interface ActionBar {
        void AEQbTJ();

        void EZpvd();
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wAI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wAI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewBinding(@NotNull C48659uZp c48659uZp) {
        Intrinsics.checkNotNullParameter(c48659uZp, "");
        this.KWHzl = c48659uZp;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:74) call: o.wAI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wAI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wAI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C48659uZp c48659uZpEZpvd = C48659uZp.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c48659uZpEZpvd, "");
        this.KWHzl = c48659uZpEZpvd;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wAI.AYXKKw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw valueOf() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static /* synthetic */ void initView$default(wAI wai, androidx.fragment.app.FragmentManager fragmentManager, TacticsDetailPresenter tacticsDetailPresenter, LifecycleOwner lifecycleOwner, ActionBar actionBar, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            actionBar = null;
        }
        wai.KWHzl(fragmentManager, tacticsDetailPresenter, lifecycleOwner, actionBar);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TacticsDetailPresenter tacticsDetailPresenter, @NotNull LifecycleOwner lifecycleOwner, ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tacticsDetailPresenter, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.OLrzqt = actionBar;
        android.app.Application application = C35334ntP.KWHzl(this).getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        this.AEQbTJ = new ContractGridRelatedPosPresenter(application, new SavedStateHandle());
        copydefault(fragmentManager);
        KWHzl();
        AEQbTJ(tacticsDetailPresenter, lifecycleOwner, fragmentManager);
    }

    public final void AEQbTJ(TacticsDetailPresenter tacticsDetailPresenter, LifecycleOwner lifecycleOwner, androidx.fragment.app.FragmentManager fragmentManager) {
        this.copydefault = tacticsDetailPresenter;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = this.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        if (contractGridRelatedPosPresenter.OLrzqt().isHistory()) {
            return;
        }
        AhwBna();
        KWHzl(fragmentManager);
        AEQbTJ(lifecycleOwner);
    }

    public final void copydefault() {
        gEmmrt();
    }

    public final void KWHzl() {
        OKReminder oKReminder = this.KWHzl.KWHzl;
        oKReminder.setStyle(2);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dHAKvv);
        if (!(strAYXKKw instanceof java.lang.CharSequence)) {
            strAYXKKw = null;
        }
        oKReminder.setTitle((java.lang.CharSequence) strAYXKKw);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.OmJATG);
        oKReminder.setMessage((java.lang.CharSequence) (strAYXKKw2 instanceof java.lang.CharSequence ? strAYXKKw2 : null));
        oKReminder.setCloseIconVisibility(false);
    }

    private final void gEmmrt() {
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = this.AEQbTJ;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = null;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        if (contractGridRelatedPosPresenter.OLrzqt().isHistory()) {
            OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            return;
        }
        if (djBIcL()) {
            OLrzqt(true);
            return;
        }
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridRelatedPosPresenter2 = contractGridRelatedPosPresenter3;
        }
        contractGridRelatedPosPresenter2.isConnected();
    }

    private final void OLrzqt(java.lang.String str) {
        C49952uyJ.updateDataOrEmpty$default(valueOf(), yDY.AhwBna(), str, 0, null, null, false, 60, null);
    }

    private final boolean djBIcL() {
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = this.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        return Intrinsics.EZpvd((java.lang.Object) contractGridRelatedPosPresenter.OLrzqt().getState(), (java.lang.Object) "no_close_position");
    }

    private final void AhwBna() {
        android.widget.TextView textView = this.KWHzl.djBIcL;
        TacticsDetailPresenter tacticsDetailPresenter = this.copydefault;
        if (tacticsDetailPresenter == null) {
            Intrinsics.gEmmrt("");
            tacticsDetailPresenter = null;
        }
        textView.setText(tacticsDetailPresenter.fetchVPNInfo());
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager) {
        C55372xih c55372xih = this.KWHzl.copydefault;
        c55372xih.removeAllViews();
        TacticsDetailPresenter tacticsDetailPresenter = this.copydefault;
        if (tacticsDetailPresenter == null) {
            Intrinsics.gEmmrt("");
            tacticsDetailPresenter = null;
        }
        java.util.ArrayList<TacticsListLabelUiData> arrayListOLrzqt = tacticsDetailPresenter.OLrzqt(false);
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListOLrzqt) {
            TacticsListLabelUiData tacticsListLabelUiData = (TacticsListLabelUiData) obj;
            if ((tacticsListLabelUiData instanceof TacticsListLabelData) || (tacticsListLabelUiData instanceof TacticsListLabelLeverPrincipalData)) {
                if (!tacticsListLabelUiData.KWHzl()) {
                    arrayList.add(obj);
                }
            }
        }
        for (TacticsListLabelUiData tacticsListLabelUiData2 : arrayList) {
            C52534wOz c52534wOz = C52534wOz.KWHzl;
            android.content.Context context = c55372xih.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C55251xgS c55251xgSCopydefault = c52534wOz.copydefault(context, tacticsListLabelUiData2);
            if (tacticsListLabelUiData2 instanceof TacticsListLabelLeverPrincipalData) {
                c55251xgSCopydefault.setOnClickListener(new Application(c55251xgSCopydefault, 1000L, tacticsListLabelUiData2, fragmentManager));
            }
            c55372xih.addView(c55251xgSCopydefault);
        }
        Intrinsics.copydefault(c55372xih);
        c55372xih.setVisibility(0);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ TacticsListLabelUiData AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ androidx.fragment.app.FragmentManager KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, TacticsListLabelUiData tacticsListLabelUiData, androidx.fragment.app.FragmentManager fragmentManager) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = tacticsListLabelUiData;
            this.KWHzl = fragmentManager;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                new C51972vxB(((TacticsListLabelLeverPrincipalData) this.AEQbTJ).djBIcL(), ((TacticsListLabelLeverPrincipalData) this.AEQbTJ).gEmmrt(), ((TacticsListLabelLeverPrincipalData) this.AEQbTJ).EZpvd()).show(this.KWHzl);
            }
        }
    }

    public static /* synthetic */ void setPosSelect$default(wAI wai, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        wai.OLrzqt(z);
    }

    private final void OLrzqt(boolean z) {
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = null;
        if (z) {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = this.AEQbTJ;
            if (contractGridRelatedPosPresenter2 == null) {
                Intrinsics.gEmmrt("");
                contractGridRelatedPosPresenter2 = null;
            }
            contractGridRelatedPosPresenter2.isConnected();
        } else {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = this.AEQbTJ;
            if (contractGridRelatedPosPresenter3 == null) {
                Intrinsics.gEmmrt("");
                contractGridRelatedPosPresenter3 = null;
            }
            contractGridRelatedPosPresenter3.AEQbTJ();
        }
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter4 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridRelatedPosPresenter = contractGridRelatedPosPresenter4;
        }
        contractGridRelatedPosPresenter.DbNXlk();
    }

    public final void copydefault(final androidx.fragment.app.FragmentManager fragmentManager) {
        valueOf().register(DetailsData.class, new wNN(3, true, true, 0, new Function1() { // from class: o.wAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.copydefault(this.AEQbTJ, fragmentManager, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl(this.OLrzqt, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.EZpvd(this.KWHzl, (Triple) obj);
            }
        }));
        valueOf().register(TransDetailsData.class, new C52502wNu(new Function1() { // from class: o.wAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.EZpvd(this.EZpvd, (TransDetailsData) obj);
            }
        }));
        valueOf().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl(this.EZpvd, (EmptyData) obj);
            }
        }));
        this.KWHzl.EZpvd.setAdapter(valueOf());
        this.KWHzl.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public static final Unit copydefault(wAI wai, androidx.fragment.app.FragmentManager fragmentManager, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        C54206wzw.TaskDescription taskDescription = C54206wzw.Companion;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        taskDescription.copydefault(detailsData, contractGridRelatedPosPresenter.OLrzqt()).show(fragmentManager, "ContractGridClosePosFragment");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wAI wai, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        wai.OLrzqt(detailsData);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wAI wai, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        wai.copydefault((Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>) triple);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wAI wai, TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = null;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        java.lang.String algoId = contractGridRelatedPosPresenter.OLrzqt().getAlgoId();
        java.lang.String orderId = transDetailsData.getOrderId();
        ContractGridClosePositionData contractGridClosePositionData = new ContractGridClosePositionData(algoId, orderId == null ? "" : orderId, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = wai.AEQbTJ;
        if (contractGridRelatedPosPresenter3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridRelatedPosPresenter2 = contractGridRelatedPosPresenter3;
        }
        contractGridRelatedPosPresenter2.KWHzl(contractGridClosePositionData);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wAI wai, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        wai.gEmmrt();
        return Unit.INSTANCE;
    }

    private final void copydefault(Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData> triple) {
        TradePositionManager.PositionItem positionItem;
        java.lang.String doubtMsg;
        TacticsUiConst.BotListSubItemType first = triple.getFirst();
        java.lang.String str = "";
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip) {
            TacticsInsideItemData third = triple.getThird();
            if (third != null && (doubtMsg = third.getDoubtMsg()) != null) {
                str = doubtMsg;
            }
            EZpvd(str);
            return;
        }
        if ((first instanceof TacticsUiConst.BotListSubItemType.BotSubPosition) && triple.getSecond() != null && (triple.getSecond() instanceof DetailsData)) {
            java.lang.Object second = triple.getSecond();
            Intrinsics.copydefault(second, "");
            StrategyPositionResponse originPosition = ((DetailsData) second).getOriginPosition();
            if (originPosition == null || (positionItem = originPosition.getPositionItem()) == null) {
                return;
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C52696wUz.OLrzqt(positionItem, context);
        }
    }

    private final void OLrzqt(final DetailsData detailsData) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = null;
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && !newProxyInstance.uzCIH()) {
            java.lang.String algoId = detailsData.getAlgoId();
            ContractGridClosePositionReq contractGridClosePositionReq = new ContractGridClosePositionReq(algoId == null ? "" : algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null);
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = this.AEQbTJ;
            if (contractGridRelatedPosPresenter2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                contractGridRelatedPosPresenter = contractGridRelatedPosPresenter2;
            }
            contractGridRelatedPosPresenter.KWHzl(contractGridClosePositionReq);
            return;
        }
        java.lang.String type = detailsData.getType();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartActivityForResult);
        int i = C55688xof.Application.ActivityResultContractsRequestPermission;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter3 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter3 = null;
        }
        java.lang.String instId = contractGridRelatedPosPresenter3.OLrzqt().getInstId();
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter4 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter4 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter4 = null;
        }
        pairArr[0] = C56390yDp.OLrzqt("tradeTitle", C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, contractGridRelatedPosPresenter4.OLrzqt().getInstType(), false, false, 8, null));
        pairArr[1] = C56390yDp.OLrzqt("tradeType", type);
        pairArr[2] = C56390yDp.OLrzqt("tradeSymbol", C56033xvF.getBotLever$default(detailsData.getLevel(), false, 2, null));
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.AxsJAY, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC49607urj abstractC49607urj = (AbstractC49607urj) viewDataBindingInflate;
        android.widget.TextView textView = abstractC49607urj.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = abstractC49607urj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        abstractC49607urj.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                wAI.KWHzl(this.AEQbTJ, compoundButton, z);
            }
        });
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.updateBackInvokedCallbackStateactivity_release);
        final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fbC);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{type}, 0, null, false, new Function1() { // from class: o.wAH
            private static short[] djBIcL;
            private static final byte[] $$c = {SignedBytes.MAX_POWER_OF_TWO, -61, 50, Ascii.FS};
            private static final int $$d = 63;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {118, -27, 83, 94, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
            private static final int $$b = 234;
            private static int AYXKKw = 0;
            private static int gEmmrt = 1;
            private static int KWHzl = -2084759264;
            private static int AEQbTJ = 1640963109;
            private static int EZpvd = 180071538;
            private static byte[] copydefault = {-48, -63, 56, -59, 51, -49, 61, -64, Ascii.DC2, Ascii.VT, -14, 53, Utf8.REPLACEMENT_BYTE, -62, -53, 61, 54, 35, -20, 48, -56, 62, 49, 48, -48, -60, 56, -58, 61, 48, -61, 45, -25, 58, 62, Utf8.REPLACEMENT_BYTE, 53, 37, -33, 53, -61, -64, 56, 126, -111, Utf8.REPLACEMENT_BYTE, 62, -62, 54, 46, -45, -49, 44, -47, 19, -34, 43, -39, -20, Ascii.FS, -32, Ascii.RS, -23, Ascii.GS, -2, 0, 0, -11, 17, -26, 54, -53, Ascii.DC4, 48, -14, Ascii.EM, -17, -20, Ascii.DC4, -30, 92, -90, 74, -68, 79, 66, -68, 76, -78, -2, Ascii.ESC, -78, -74, -7, Ascii.SUB, -67, -2, Ascii.SO, 79, -108, 86, -85, -48, Ascii.SI, -2, 35, -28, -12, Ascii.NAK, -5, 7};
            private static char[] valueOf = {20285, 20325, 20349, 20327, 20324, 20324, 20304, 20409, 20386, 20384, 20413, 20413, 20397, 20398, 20409, 20411, 20386, 20387, 20370, 20399, 20410, 20408, 20410, 20409, 20384, 20408, 20408, 20368, 20272, 20336, 20339, 20365, 20363, 20347, 20345, 20361, 20282, 20326, 20326, 20323, 20330, 20335, 20310, 20331, 20344, 20349, 20323, 20324, 20308, 20333, 20323, 20325};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b, short s, short s2) {
                int i2;
                int i3;
                int i4 = 1 - (s * 3);
                int i5 = (s2 * 2) + 4;
                byte[] bArr = $$c;
                int i6 = 122 - b;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i7 = i6;
                    i6 = i4;
                    i3 = 0;
                    i5++;
                    i6 += i7;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = bArr[i5];
                    i5++;
                    i6 += i7;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i4) {
                    }
                } else {
                    i2 = 0;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i4) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i2, int i3, byte b, java.lang.Object[] objArr) {
                int i4;
                int i5;
                byte[] bArr = $$a;
                int i6 = (b * 10) + 4;
                int i7 = 99 - (i3 * 20);
                int i8 = (i2 * 5) + 6;
                byte[] bArr2 = new byte[i8];
                if (bArr == null) {
                    int i9 = i6;
                    i5 = 0;
                    int i10 = i8;
                    i7 = i10 + (-i7) + 8;
                    i6 = i9 + 1;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i7;
                    if (i5 == i8) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i11 = bArr[i6];
                    int i12 = i6;
                    i10 = i7;
                    i7 = i11;
                    i9 = i12;
                    i7 = i10 + (-i7) + 8;
                    i6 = i9 + 1;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i7;
                    if (i5 == i8) {
                    }
                } else {
                    i4 = 0;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i7;
                    if (i5 == i8) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i2 = 2 % 2;
                int i3 = AYXKKw + 3;
                gEmmrt = i3 % 128;
                int i4 = i3 % 2;
                Unit unitAEQbTJ = wAI.AEQbTJ(detailsData, (java.util.List) obj);
                int i5 = AYXKKw + 23;
                gEmmrt = i5 % 128;
                int i6 = i5 % 2;
                return unitAEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [220=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int[] iArr, boolean z, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2;
                int i3 = 2 % 2;
                Zk zk = new Zk();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = valueOf;
                if (cArr != null) {
                    int i8 = $10 + 63;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i10])};
                            java.lang.Object objEZpvd = YY.EZpvd(-455689676);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                objEZpvd = YY.EZpvd(398, 5, (char) 0, -520718520, false, $$e((byte) ($$d & 248), b, b), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr2[i10] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    zk.EZpvd = 0;
                    char c = 0;
                    while (zk.EZpvd < i5) {
                        int i11 = $10 + 107;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        if (bArr[zk.EZpvd] == 1) {
                            int i13 = zk.EZpvd;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[zk.EZpvd]), java.lang.Integer.valueOf(c)};
                            java.lang.Object objEZpvd2 = YY.EZpvd(-1969893699);
                            if (objEZpvd2 == null) {
                                byte b2 = (byte) 0;
                                objEZpvd2 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1900739647, false, $$e((byte) ($$d & 247), b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr4[i13] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                        } else {
                            int i14 = zk.EZpvd;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[zk.EZpvd]), java.lang.Integer.valueOf(c)};
                            java.lang.Object objEZpvd3 = YY.EZpvd(1852960686);
                            if (objEZpvd3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objEZpvd3 = YY.EZpvd(125, 4, (char) 0, 1783702226, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr4[i14] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[zk.EZpvd];
                        java.lang.Object[] objArr5 = {zk, zk};
                        java.lang.Object objEZpvd4 = YY.EZpvd(795576183);
                        if (objEZpvd4 == null) {
                            byte b5 = (byte) 0;
                            objEZpvd4 = YY.EZpvd(97, 4, (char) 0, 726354443, false, $$e((byte) ($$d & 241), b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                    }
                    int i15 = $11 + 87;
                    $10 = i15 % 128;
                    i2 = 2;
                    int i16 = i15 % 2;
                    cArr3 = cArr4;
                } else {
                    i2 = 2;
                }
                if (i7 > 0) {
                    int i17 = $11 + 107;
                    $10 = i17 % 128;
                    if (i17 % i2 != 0) {
                        char[] cArr5 = new char[i5];
                        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
                        java.lang.System.arraycopy(cArr5, 0, cArr3, i5 >>> i7, i7);
                        java.lang.System.arraycopy(cArr5, i7, cArr3, 1, i5 % i7);
                    } else {
                        char[] cArr6 = new char[i5];
                        java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i5);
                        int i18 = i5 - i7;
                        java.lang.System.arraycopy(cArr6, 0, cArr3, i18, i7);
                        java.lang.System.arraycopy(cArr6, i7, cArr3, 0, i18);
                    }
                }
                if (z) {
                    char[] cArr7 = new char[i5];
                    zk.EZpvd = 0;
                    while (zk.EZpvd < i5) {
                        cArr7[zk.EZpvd] = cArr3[(i5 - zk.EZpvd) - 1];
                        zk.EZpvd++;
                    }
                    cArr3 = cArr7;
                }
                if (i6 > 0) {
                    int i19 = $11 + 49;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    zk.EZpvd = 0;
                    while (zk.EZpvd < i5) {
                        cArr3[zk.EZpvd] = (char) (cArr3[zk.EZpvd] - iArr[2]);
                        zk.EZpvd++;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [175=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(int i2, int i3, byte b, short s, int i4, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i5;
                boolean z;
                int length;
                byte[] bArr;
                int i6;
                int length2;
                byte[] bArr2;
                int i7 = 2 % 2;
                Zj zj = new Zj();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(AEQbTJ)};
                    java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                    boolean z2 = iIntValue == -1;
                    if (z2) {
                        byte[] bArr3 = copydefault;
                        if (bArr3 != null) {
                            int i8 = $10 + 107;
                            $11 = i8 % 128;
                            if (i8 % 2 == 0) {
                                length2 = bArr3.length;
                                bArr2 = new byte[length2];
                            } else {
                                length2 = bArr3.length;
                                bArr2 = new byte[length2];
                            }
                            for (int i9 = 0; i9 < length2; i9++) {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i9])};
                                java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                                if (objEZpvd2 == null) {
                                    objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                bArr2[i9] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                            }
                            bArr3 = bArr2;
                        }
                        if (bArr3 != null) {
                            int i10 = $10 + 45;
                            $11 = i10 % 128;
                            if (i10 % 2 == 0) {
                                byte[] bArr4 = copydefault;
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(KWHzl)};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                                if (objEZpvd3 == null) {
                                    objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                }
                                i6 = ((byte) (((long) bArr4[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) - 2166281683126510581L)) * ((int) (((long) AEQbTJ) & (-2166281683126510581L)));
                            } else {
                                byte[] bArr5 = copydefault;
                                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(KWHzl)};
                                java.lang.Object objEZpvd4 = YY.EZpvd(-1048485176);
                                if (objEZpvd4 == null) {
                                    objEZpvd4 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                }
                                i6 = ((byte) (((long) bArr5[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L)));
                            }
                            iIntValue = (byte) i6;
                        } else {
                            iIntValue = (short) (((short) (((long) djBIcL[i4 + ((int) (((long) KWHzl) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                        }
                    }
                    if (iIntValue > 0) {
                        int i11 = ((i4 + iIntValue) - 2) + ((int) (((long) KWHzl) ^ (-2166281683126510581L)));
                        if (z2) {
                            int i12 = $11 + 125;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            i5 = 1;
                        } else {
                            int i14 = $11 + 67;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            i5 = 0;
                        }
                        zj.OLrzqt = i11 + i5;
                        java.lang.Object[] objArr6 = {zj, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(EZpvd), sb};
                        java.lang.Object objEZpvd5 = YY.EZpvd(-2015189563);
                        if (objEZpvd5 == null) {
                            byte b2 = (byte) 0;
                            objEZpvd5 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e((byte) ($$d & 11), b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        byte[] bArr6 = copydefault;
                        if (bArr6 != null) {
                            int i16 = $11 + 5;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                length = bArr6.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr6.length;
                                bArr = new byte[length];
                            }
                            for (int i17 = 0; i17 < length; i17++) {
                                bArr[i17] = (byte) (((long) bArr6[i17]) ^ (-2166281683126510581L));
                            }
                            bArr6 = bArr;
                        }
                        if (bArr6 != null) {
                            int i18 = $11 + 81;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        zj.KWHzl = 1;
                        while (zj.KWHzl < iIntValue) {
                            if (z) {
                                byte[] bArr7 = copydefault;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                int i20 = $11 + 83;
                                $10 = i20 % 128;
                                int i21 = i20 % 2;
                            } else {
                                short[] sArr = djBIcL;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                            }
                            sb.append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            zj.KWHzl++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void EZpvd(long j, long j2) throws java.lang.Throwable {
                int i2 = 2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(-1802809398, -47, (byte) 53, (short) 0, 495844053, objArr);
                java.lang.Object obj = null;
                java.lang.Object obj2 = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(-1802809394, -47, (byte) 54, (short) 0, 495844062, objArr2);
                    java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(new int[]{0, 6, 0, 0}, false, new byte[]{1, 1, 0, 1, 1, 0}, objArr4);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, objArr3);
                    java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(new int[]{0, 6, 0, 0}, false, new byte[]{1, 1, 0, 1, 1, 0}, objArr6);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(new int[]{6, 22, 73, 0}, true, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1}, objArr7);
                    java.lang.String str = (java.lang.String) objArr7[0];
                    int i3 = gEmmrt;
                    int i4 = i3 + 107;
                    AYXKKw = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 63;
                    AYXKKw = i6 % 128;
                    int i7 = i6 % 2;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(new int[]{28, 8, 19, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 0, 1}, objArr8);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                    method3.setAccessible(true);
                    java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(-1802809356, -47, (byte) -44, (short) 0, 495844108, objArr9);
                    java.lang.Object[] objArr10 = {objInvoke, (java.lang.String) objArr9[0]};
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(-1802809366, -47, Ascii.SUB, (short) 0, 495844111, objArr11);
                    java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objArr10);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(-1802809386, -47, (byte) -68, (short) 0, 495844132, objArr12);
                        java.lang.String string = ((java.lang.String) objArr12[0]).toString();
                        int i8 = AYXKKw + 63;
                        gEmmrt = i8 % 128;
                        if (i8 % 2 != 0) {
                            java.lang.Object[] objArr13 = {string};
                            java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                            declaredConstructor2.setAccessible(true);
                            throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                        }
                        java.lang.Object[] objArr14 = new java.lang.Object[0];
                        objArr14[1] = string;
                        java.lang.Class[] clsArr = new java.lang.Class[0];
                        clsArr[1] = java.lang.String.class;
                        java.lang.reflect.Constructor declaredConstructor3 = java.lang.IllegalStateException.class.getDeclaredConstructor(clsArr);
                        declaredConstructor3.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor3.newInstance(objArr14));
                    }
                    int i9 = AYXKKw + 5;
                    gEmmrt = i9 % 128;
                    if (i9 % 2 == 0) {
                        pUU.class.getField("copydefault").get(null);
                        obj.hashCode();
                        throw null;
                    }
                    java.lang.Object obj3 = pUU.class.getField("copydefault").get(null);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, obj3);
                    java.lang.Object[] objArr15 = {str, objInvoke};
                    java.lang.reflect.Method method6 = pUP.class.getMethod("copydefault", java.lang.String.class, java.lang.String.class);
                    method6.setAccessible(true);
                    method6.invoke(obj3, objArr15);
                    int i10 = AYXKKw + 67;
                    gEmmrt = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr = $$a;
                    byte b = (byte) (-bArr[6]);
                    byte b2 = bArr[13];
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    c(b, b2, b2, objArr16);
                    java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
                    method7.setAccessible(true);
                    java.lang.Object objInvoke2 = method7.invoke(obj2, null);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(new int[]{36, 16, 0, 15}, true, new byte[]{0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, objArr17);
                    DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).setBoolean(objInvoke2, true);
                    int i12 = gEmmrt + 121;
                    AYXKKw = i12 % 128;
                    int i13 = i12 % 2;
                    byte b3 = (byte) (-bArr[6]);
                    byte b4 = bArr[13];
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    c(b3, b4, b4, objArr18);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                    method8.setAccessible(true);
                    java.lang.Object objInvoke3 = method8.invoke(obj2, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    a(-1802809365, -47, Ascii.CR, (short) 0, 495844155, objArr19);
                    DetectionInfoBean.class.getField((java.lang.String) objArr19[0]).set(objInvoke3, lValueOf);
                    byte b5 = bArr[13];
                    byte b6 = (byte) (-bArr[6]);
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c(b5, b6, b6, objArr20);
                    java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                    method9.setAccessible(true);
                    method9.invoke(obj2, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }, 14, null), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.wAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl(iCopydefault, (java.util.List) obj);
            }
        }, 14, null), strAYXKKw2);
        android.view.View root = abstractC49607urj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.itxZVF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wAI.copydefault(detailsData, this, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C48033uCm.Fragment.DjWNei);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.wAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wAI.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(wAI wai, android.widget.CompoundButton compoundButton, boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C54630xPm c54630xPmAuCTelauCTel;
        if (!(wai.getContext() instanceof LifecycleOwner) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            return;
        }
        java.lang.Object context = wai.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        c54630xPmAuCTelauCTel.KWHzl(!z, lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
    }

    public static final Unit AEQbTJ(DetailsData detailsData, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(detailsData.getSideColor()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public static final void copydefault(DetailsData detailsData, wAI wai, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.String algoId = detailsData.getAlgoId();
        ContractGridClosePositionReq contractGridClosePositionReq = new ContractGridClosePositionReq(algoId == null ? "" : algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null);
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        contractGridRelatedPosPresenter.KWHzl(contractGridClosePositionReq);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void EZpvd(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wAI.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(LifecycleOwner lifecycleOwner) {
        TacticsDetailPresenter tacticsDetailPresenter = this.copydefault;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = null;
        if (tacticsDetailPresenter == null) {
            Intrinsics.gEmmrt("");
            tacticsDetailPresenter = null;
        }
        tacticsDetailPresenter.getNewProxyInstance().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.copydefault(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter2 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter2 = null;
        }
        contractGridRelatedPosPresenter2.djBIcL().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter3 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter3 = null;
        }
        contractGridRelatedPosPresenter3.AYXKKw().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter4 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter4 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter4 = null;
        }
        contractGridRelatedPosPresenter4.valueOf().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.EZpvd((java.util.ArrayList) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter5 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter5 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter5 = null;
        }
        contractGridRelatedPosPresenter5.EZpvd().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.copydefault((java.util.List) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter6 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter6 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter6 = null;
        }
        contractGridRelatedPosPresenter6.KWHzl().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl((java.util.List) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter7 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter7 == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter7 = null;
        }
        contractGridRelatedPosPresenter7.getAggregateErrorLiveData().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.OLrzqt(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter8 = this.AEQbTJ;
        if (contractGridRelatedPosPresenter8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridRelatedPosPresenter = contractGridRelatedPosPresenter8;
        }
        contractGridRelatedPosPresenter.getAggregateLoadingLiveData().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wAI.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(wAI wai, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        contractGridRelatedPosPresenter.OLrzqt((StrategyDetailsResponse) c55804xqp.copydefault());
        java.lang.String state = ((StrategyDetailsResponse) c55804xqp.copydefault()).getState();
        int iHashCode = state.hashCode();
        if (iHashCode != -1884319283) {
            if (iHashCode != -1821824562) {
                if (iHashCode == 1715648628 && state.equals("stopping")) {
                    wai.OLrzqt(true);
                }
            } else if (state.equals("no_close_position")) {
                wai.OLrzqt(true);
            }
        } else if (state.equals("stopped")) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wAI wai, java.util.ArrayList arrayList) {
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) contractGridRelatedPosPresenter.OLrzqt().getState(), (java.lang.Object) "pending_signal")) {
            C43316rmw c43316rmwValueOf = wai.valueOf();
            boolean zIsEmpty = arrayList.isEmpty();
            java.util.List<?> listEZpvd = arrayList;
            if (zIsEmpty) {
                listEZpvd = C56402yEa.EZpvd(new CommonEmptyData(C33070mpX.AYXKKw(C48033uCm.Fragment.DTg), C33070mpX.AYXKKw(C48033uCm.Fragment.hQufeQ), null, 6, 36, false, false, 24, 0, 324, null));
            }
            c43316rmwValueOf.setItems(listEZpvd);
            wai.valueOf().notifyDataSetChanged();
        } else {
            C43316rmw c43316rmwValueOf2 = wai.valueOf();
            boolean zIsEmpty2 = arrayList.isEmpty();
            java.util.List<?> listAEQbTJ = arrayList;
            if (zIsEmpty2) {
                listAEQbTJ = wai.AEQbTJ();
            }
            c43316rmwValueOf2.setItems(listAEQbTJ);
            wai.valueOf().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wAI wai, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        wai.AEQbTJ((StrategyPositionResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) c55804xqp.copydefault()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.syncState), 500);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wAI wai, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = null;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter.copydefault().bB_())) {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = wai.AEQbTJ;
            if (contractGridRelatedPosPresenter3 == null) {
                Intrinsics.gEmmrt("");
                contractGridRelatedPosPresenter3 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter3.fetchVPNInfo().bB_())) {
                ContractGridRelatedPosPresenter contractGridRelatedPosPresenter4 = wai.AEQbTJ;
                if (contractGridRelatedPosPresenter4 == null) {
                    Intrinsics.gEmmrt("");
                    contractGridRelatedPosPresenter4 = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter4.AhwBna().bB_())) {
                    java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                    }
                } else {
                    ContractGridRelatedPosPresenter contractGridRelatedPosPresenter5 = wai.AEQbTJ;
                    if (contractGridRelatedPosPresenter5 == null) {
                        Intrinsics.gEmmrt("");
                        contractGridRelatedPosPresenter5 = null;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter5.gEmmrt().bB_())) {
                        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter6 = wai.AEQbTJ;
                        if (contractGridRelatedPosPresenter6 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            contractGridRelatedPosPresenter2 = contractGridRelatedPosPresenter6;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) contractGridRelatedPosPresenter2.OLrzqt().getState(), (java.lang.Object) "stopped") || wai.djBIcL()) {
                            wai.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
                        } else {
                            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
                            if (message2 == null) {
                                message2 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                            }
                            C33064mpR.OLrzqt(wai.valueOf(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message2, 60, false, null, null, false, 60, null));
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(wAI wai, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter = wai.AEQbTJ;
        ContractGridRelatedPosPresenter contractGridRelatedPosPresenter2 = null;
        if (contractGridRelatedPosPresenter == null) {
            Intrinsics.gEmmrt("");
            contractGridRelatedPosPresenter = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter.copydefault().bB_())) {
            ContractGridRelatedPosPresenter contractGridRelatedPosPresenter3 = wai.AEQbTJ;
            if (contractGridRelatedPosPresenter3 == null) {
                Intrinsics.gEmmrt("");
                contractGridRelatedPosPresenter3 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter3.fetchVPNInfo().bB_())) {
                ContractGridRelatedPosPresenter contractGridRelatedPosPresenter4 = wai.AEQbTJ;
                if (contractGridRelatedPosPresenter4 == null) {
                    Intrinsics.gEmmrt("");
                    contractGridRelatedPosPresenter4 = null;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter4.gEmmrt().bB_())) {
                    ContractGridRelatedPosPresenter contractGridRelatedPosPresenter5 = wai.AEQbTJ;
                    if (contractGridRelatedPosPresenter5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        contractGridRelatedPosPresenter2 = contractGridRelatedPosPresenter5;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) contractGridRelatedPosPresenter2.AhwBna().bB_())) {
                    }
                } else if (((java.lang.Boolean) pair.second).booleanValue()) {
                    wai.OLrzqt();
                } else {
                    ActionBar actionBar = wai.OLrzqt;
                    if (actionBar != null) {
                        actionBar.AEQbTJ();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(StrategyPositionResponse strategyPositionResponse) {
        if (strategyPositionResponse == null) {
            return;
        }
        OKReminder oKReminder = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(C33129mqd.gEmmrt(strategyPositionResponse.getMgnRatio(), "3") ? 0 : 8);
    }

    public final void OLrzqt() {
        ActionBar actionBar;
        if (valueOf().getItemCount() != 0 || (actionBar = this.OLrzqt) == null) {
            return;
        }
        actionBar.EZpvd();
    }

    public final java.util.List<DetailsData> AEQbTJ() {
        TacticsDetailPresenter tacticsDetailPresenter = this.copydefault;
        if (tacticsDetailPresenter == null) {
            Intrinsics.gEmmrt("");
            tacticsDetailPresenter = null;
        }
        StrategyDetailsResponse strategyDetailsResponseAhwBna = tacticsDetailPresenter.AhwBna();
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getInstId(), false, null, null, 28, null);
        java.lang.String orderType = strategyDetailsResponseAhwBna.getOrderType();
        java.lang.String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getInstId(), "", null, 8, null);
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getInstId());
        java.lang.String strKWHzl = C56066xvm.EZpvd.KWHzl(strategyDetailsResponseAhwBna.getInstId(), strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getCcy());
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getInstId(), "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setMediaType) + "(" + botAmountUnit$default + ")", "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShowHideAnimationEnabled) + "(" + botAmountUnit$default + ")", "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PickVisualMediaRequestKt) + "(" + strAEQbTJ + ")", "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActivityResultRegistry) + "(" + strKWHzl + ")", "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContract) + "(" + strOLrzqt + ")", "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21), "--", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return C56402yEa.EZpvd(new DetailsData(orderType, strategyDetailsResponseAhwBna.getInstId(), strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getAlgoId(), null, coinTitle$default, false, TacticsType.TACTICS_CONTRACT_GRID, null, null, strategyDetailsResponseAhwBna.getLever(), null, new java.util.ArrayList(C56402yEa.fARcdN(listOLrzqt)), null, false, 0, 0, null, null, null, null, false, null, 8366864, null));
    }
}
