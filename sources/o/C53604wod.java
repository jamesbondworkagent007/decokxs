package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradeuilib.imgs.CdnResourceType;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.unify_trade.biz.GridProfitResponse;
import com.okinc.unify_trade.bot.data.ProDetailData;
import com.okinc.unify_trade.bot.data.ProfitDetailData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.GridWithDrawPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53604wod extends AbstractC49945uyC<AbstractC50905vcv, GridWithDrawPresenter> {
    public Function1<? super TacticsData, Unit> OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int copydefault = C48033uCm.Activity.seuMaA;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.woc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53604wod.EZpvd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wok
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53604wod.gEmmrt(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wod$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX INFO: renamed from: o.wod$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wod.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53604wod OLrzqt(@NotNull ProfitDetailData profitDetailData, @NotNull TacticsData tacticsData, @NotNull Function1<? super TacticsData, Unit> function1) {
            Intrinsics.checkNotNullParameter(profitDetailData, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C53604wod c53604wod = new C53604wod();
            c53604wod.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("EXTRA_PROFIT_DATA", profitDetailData), C56390yDp.OLrzqt("EXTRA_TACTICS_DATA", tacticsData)));
            c53604wod.OLrzqt = function1;
            return c53604wod;
        }
    }

    public final ProfitDetailData copydefault() {
        return (ProfitDetailData) this.KWHzl.getValue();
    }

    public static final ProfitDetailData EZpvd(C53604wod c53604wod) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53604wod.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable("EXTRA_PROFIT_DATA", ProfitDetailData.class);
            } else {
                java.lang.Object parcelable2 = arguments.getParcelable("EXTRA_PROFIT_DATA");
                if (!(parcelable2 instanceof ProfitDetailData)) {
                    parcelable2 = null;
                }
                parcelable = (ProfitDetailData) parcelable2;
            }
            ProfitDetailData profitDetailData = (ProfitDetailData) parcelable;
            if (profitDetailData != null) {
                return profitDetailData;
            }
        }
        return new ProfitDetailData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (kotlin.Pair) null, 255, (DefaultConstructorMarker) null);
    }

    private final TacticsData isConnected() {
        return (TacticsData) this.AhwBna.getValue();
    }

    public static final TacticsData gEmmrt(C53604wod c53604wod) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53604wod.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("EXTRA_TACTICS_DATA", TacticsData.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("EXTRA_TACTICS_DATA");
            parcelable = (TacticsData) (parcelable2 instanceof TacticsData ? parcelable2 : null);
        }
        return (TacticsData) parcelable;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C53769wrj.AEQbTJ.AEQbTJ();
        ejfBZ();
        fJNWhG();
        AuCTel();
        fIwbmz();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowHomeEnabled));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
    }

    private final void ejfBZ() {
        OLrzqt().AEQbTJ(copydefault());
    }

    private final void fJNWhG() {
        AbstractC50905vcv abstractC50905vcvValues = values();
        abstractC50905vcvValues.EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.getSelectedNavigationIndex) + " (" + copydefault().getTitle() + ")");
        abstractC50905vcvValues.AEQbTJ.setText(GridWithDrawPresenter.getProfitAmt$default(OLrzqt(), copydefault(), false, 2, null));
        boolean zAEQbTJ = C33129mqd.AEQbTJ(copydefault().getQuoteAmt(), 0);
        android.widget.TextView textView = abstractC50905vcvValues.djBIcL;
        if (zAEQbTJ) {
            textView.setText(C33070mpX.AYXKKw(C55688xof.Application.closeOptionsMenu));
            textView.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
        } else {
            textView.setText(C33070mpX.AYXKKw(C55688xof.Application.unregisterMediaButtonEventReceiver));
            textView.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.AubY));
        }
        C52794wYp c52794wYpCopydefault = abstractC50905vcvValues.KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(zAEQbTJ);
        }
        RecyclerView recyclerView = abstractC50905vcvValues.AYXKKw;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(ProDetailData.class, new C52501wNt());
        c59534zip.setItems(copydefault().getList());
        recyclerView.setAdapter(c59534zip);
    }

    private final void AuCTel() {
        C52794wYp c52794wYpCopydefault = values().KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    private final void fIwbmz() {
        TradeLiveData<java.lang.String> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53604wod.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.util.List<GridProfitResponse>> tradeLiveDataOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.woi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53604wod.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.woh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53604wod.copydefault((java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C53604wod c53604wod, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53604wod.values().OLrzqt.setText(c53604wod.OLrzqt().KWHzl(C33129mqd.mulS$default(c53604wod.copydefault().getQuoteAmt(), str, null, null, null, 14, null)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C53604wod c53604wod, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TacticsData tacticsDataIsConnected = c53604wod.isConnected();
        if (tacticsDataIsConnected != null) {
            android.content.Context context = c53604wod.getContext();
            java.lang.String strOLrzqt = context != null ? C49722uts.OLrzqt("lottie/tradingbot/bot_withdraw_profit.lottie", context, CdnResourceType.Lottie, true) : null;
            BotPreShareBottomSheet.ActionBar actionBar = BotPreShareBottomSheet.Companion;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.onProviderDisabled);
            int i = C48033uCm.Fragment.onStatusChanged;
            java.lang.String title = c53604wod.copydefault().getTitle();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) title)) {
                title = "--";
            }
            BotPreShareBottomSheet botPreShareBottomSheetOLrzqt = actionBar.OLrzqt(new BotPreShareBottomSheet.UiParam(strAYXKKw, C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", title))), c53604wod.OLrzqt().copydefault(c53604wod.copydefault(), true), tacticsDataIsConnected, null, strOLrzqt, 16, null), new Function1() { // from class: o.woj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53604wod.EZpvd(this.AEQbTJ, (TacticsData) obj);
                }
            }, new Function0() { // from class: o.woq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C53604wod.AYXKKw(this.KWHzl);
                }
            });
            androidx.fragment.app.FragmentManager parentFragmentManager = c53604wod.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            botPreShareBottomSheetOLrzqt.show(parentFragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53604wod c53604wod, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Function1<? super TacticsData, Unit> function1 = c53604wod.OLrzqt;
        if (function1 != null) {
            function1.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C53604wod c53604wod) {
        c53604wod.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wod$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C53604wod AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53604wod c53604wod) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c53604wod;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wod$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C53604wod KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53604wod c53604wod) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c53604wod;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().OLrzqt(this.KWHzl.copydefault().getAlgoId());
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        super.onDestroyView();
    }
}
