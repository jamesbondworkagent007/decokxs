package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotCreateInstIdsPresenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50741vZq extends AbstractC49945uyC<AbstractC48346uOb, SignalBotCreateInstIdsPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final int copydefault = C48033uCm.Activity.getPostValueLengthLimit;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vZo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50741vZq.EZpvd(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.vZq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vZq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50741vZq OLrzqt(@NotNull SignalBotReq signalBotReq) {
            Intrinsics.checkNotNullParameter(signalBotReq, "");
            C50741vZq c50741vZq = new C50741vZq();
            c50741vZq.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", signalBotReq)));
            return c50741vZq;
        }
    }

    public final SignalBotReq copydefault() {
        return (SignalBotReq) this.KWHzl.getValue();
    }

    public static final SignalBotReq EZpvd(C50741vZq c50741vZq) {
        SignalBotReq signalBotReq;
        android.os.Bundle arguments = c50741vZq.getArguments();
        return (arguments == null || (signalBotReq = (SignalBotReq) arguments.getParcelable("data")) == null) ? new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null) : signalBotReq;
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt().AEQbTJ().addAll(copydefault().getTotalCoinPairs());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
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
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.DjzMc, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(OLrzqt().AEQbTJ().size()))))));
        wxq.setStyle(1);
        wxq.AYXKKw().setText(strCopydefault);
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final void ejfBZ() {
        this.AEQbTJ.register(C57637ymF.class, new C57634ymC(null, 1, null));
        this.AEQbTJ.register(SignalCoinPairItemData.class, new vZR(null, null, 3, null));
        this.AEQbTJ.register(C55844xrc.class, new vZV());
        RecyclerView recyclerView = values().copydefault;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new C50717vYt(C55298xhM.dp2px$default(6.0f, null, 1, null), C55298xhM.dp2px$default(6.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null)));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2, 1, false);
        gridLayoutManager.setSpanSizeLookup(new Application());
        recyclerView.setLayoutManager(gridLayoutManager);
        values().copydefault.setAdapter(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.vZq$Application */
    public static final class Application extends GridLayoutManager.SpanSizeLookup {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            java.lang.Object objAEQbTJ = C50741vZq.this.AEQbTJ.AEQbTJ(i);
            return (!(objAEQbTJ instanceof SignalCoinPairItemData) || ((SignalCoinPairItemData) objAEQbTJ).getSingleLine()) ? 2 : 1;
        }
    }

    private final void isConnected() {
        android.content.Context context = getContext();
        if (context != null) {
            C57636ymE.refreshDataOrEmpty$default(this.AEQbTJ, context, (java.util.List) OLrzqt().OLrzqt(copydefault().getLever()), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0.0f, 8, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.vZq$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C50741vZq AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50741vZq c50741vZq) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c50741vZq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
