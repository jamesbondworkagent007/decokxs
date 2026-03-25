package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.bot.data.EditCoinPairBean;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotEditInstIdsPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50719vYv extends AbstractC49945uyC<AbstractC48345uOa, SignalBotEditInstIdsPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int KWHzl = C48033uCm.Activity.ffGIBT;
    public final boolean OLrzqt = true;
    public final C43316rmw djBIcL = new C43316rmw();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vYz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50719vYv.KWHzl(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.vYv$PendingIntent */
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
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.vYv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C50719vYv EZpvd(@NotNull EditCoinPairBean editCoinPairBean) {
            Intrinsics.checkNotNullParameter(editCoinPairBean, "");
            C50719vYv c50719vYv = new C50719vYv();
            c50719vYv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", editCoinPairBean)));
            return c50719vYv;
        }
    }

    public final EditCoinPairBean copydefault() {
        return (EditCoinPairBean) this.copydefault.getValue();
    }

    public static final EditCoinPairBean KWHzl(C50719vYv c50719vYv) {
        EditCoinPairBean editCoinPairBean;
        android.os.Bundle arguments = c50719vYv.getArguments();
        return (arguments == null || (editCoinPairBean = (EditCoinPairBean) arguments.getParcelable("data")) == null) ? new EditCoinPairBean(null, null, null, null, 15, null) : editCoinPairBean;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().KWHzl(copydefault());
        fIwbmz();
        isConnected();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.wtf));
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(C33129mqd.KWHzl((java.util.Collection) copydefault().getSelectedInstIds()) ? 0 : 8);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new LoaderManager(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.vYv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC49945uyC.showLoading$default(C50719vYv.this, 0L, 1, null);
            C50719vYv.this.OLrzqt().EZpvd(C50719vYv.this.copydefault());
            this.KWHzl.dismiss();
        }
    }

    private final void fIwbmz() {
        AppCompatTextView appCompatTextView = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((C33129mqd.KWHzl((java.util.Collection) copydefault().getSelectedInstIds()) && yDY.gEmmrt(1, 3).contains(java.lang.Integer.valueOf(OLrzqt().OLrzqt()))) ? 0 : 8);
        this.djBIcL.register(C57637ymF.class, new C57634ymC(null, 1, null));
        this.djBIcL.register(SignalCoinPairItemData.class, new vZR(null, null, 3, null));
        this.djBIcL.register(C55844xrc.class, new vZV());
        RecyclerView recyclerView = values().EZpvd;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new C50717vYt(C55298xhM.dp2px$default(6.0f, null, 1, null), C55298xhM.dp2px$default(6.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null)));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2, 1, false);
        gridLayoutManager.setSpanSizeLookup(new Activity());
        recyclerView.setLayoutManager(gridLayoutManager);
        values().EZpvd.setAdapter(this.djBIcL);
        if (getContext() != null) {
            C49952uyJ.updateDataOrEmpty$default(this.djBIcL, OLrzqt().KWHzl(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), C55298xhM.dpInt$default(40.0f, (android.content.Context) null, 1, (java.lang.Object) null), null, null, false, 56, null);
        }
    }

    /* JADX INFO: renamed from: o.vYv$Activity */
    public static final class Activity extends GridLayoutManager.SpanSizeLookup {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            java.lang.Object objAEQbTJ = C50719vYv.this.djBIcL.AEQbTJ(i);
            return (!(objAEQbTJ instanceof SignalCoinPairItemData) || ((SignalCoinPairItemData) objAEQbTJ).getSingleLine()) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: o.vYv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C50719vYv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50719vYv c50719vYv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c50719vYv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vYv$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50719vYv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C50719vYv c50719vYv) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c50719vYv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vYv$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50719vYv EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50719vYv c50719vYv) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c50719vYv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                int iOLrzqt = this.EZpvd.OLrzqt().OLrzqt();
                if (iOLrzqt == 1) {
                    AbstractC49945uyC.showLoading$default(this.EZpvd, 0L, 1, null);
                    this.EZpvd.OLrzqt().EZpvd(this.EZpvd.copydefault());
                    return;
                }
                if (iOLrzqt == 2 || iOLrzqt == 3) {
                    android.content.Context contextRequireContext = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.dESsmu));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.sGvRiA));
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt), (View.OnClickListener) this.EZpvd.new ActionBar(viewOnClickListenerC54939xaY));
                    ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onConfigurationChanged, (View.OnClickListener) null, 2, (java.lang.Object) null);
                    viewOnClickListenerC54939xaY.show();
                    return;
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    private final void isConnected() {
        TradeLiveData<java.util.List<EmptyResp>> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50719vYv.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50719vYv.AEQbTJ(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C50719vYv c50719vYv, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c50719vYv.EZpvd();
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.isDevMode, 0, 1, (java.lang.Object) null);
        c50719vYv.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50719vYv c50719vYv, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c50719vYv.EZpvd();
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
