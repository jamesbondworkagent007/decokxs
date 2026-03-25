package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotInstIdsPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vYH extends AbstractC49945uyC<AbstractC48348uOd, SignalBotInstIdsPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int OLrzqt = C48033uCm.Activity.QSBOWP;
    public final C43316rmw KWHzl = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC49945uyC
    public boolean fetchVPNInfo() {
        return true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final vYH AEQbTJ(@NotNull SignalBotReq signalBotReq) {
            Intrinsics.checkNotNullParameter(signalBotReq, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", signalBotReq);
            vYH vyh = new vYH();
            vyh.setArguments(bundle);
            return vyh;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> arrayList;
        SignalBotReq signalBotReq;
        super.onCreate(bundle);
        OLrzqt().OLrzqt().clear();
        java.util.ArrayList<java.lang.String> arrayListOLrzqt = OLrzqt().OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (signalBotReq = (SignalBotReq) arguments.getParcelable("data")) == null || (arrayList = signalBotReq.getInstIds()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        arrayListOLrzqt.addAll(arrayList);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
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
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.DjzMc, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(OLrzqt().OLrzqt().size()))))));
        wxq.setStyle(1);
        wxq.AYXKKw().setText(strCopydefault);
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final void copydefault() {
        this.KWHzl.register(C57637ymF.class, new C57634ymC(null, 1, null));
        this.KWHzl.register(SignalCoinPairItemData.class, new vZR(null, null, 3, null));
        RecyclerView recyclerView = values().AEQbTJ;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2, 1, false));
        recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null)));
        values().AEQbTJ.setAdapter(this.KWHzl);
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(OLrzqt().KWHzl().size()), (java.lang.Object) 1)) {
            RecyclerView recyclerView2 = values().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(8);
            C52883way c52883way = values().KWHzl;
            Intrinsics.copydefault(c52883way);
            c52883way.setVisibility(0);
            c52883way.setRightIconVisible(false);
            c52883way.setPaddingV(OLrzqt().KWHzl().get(0).getVPadding());
            c52883way.setTitle(OLrzqt().KWHzl().get(0).getTitle());
            c52883way.setTitleIcon(OLrzqt().KWHzl().get(0).getTitleUrl());
            return;
        }
        RecyclerView recyclerView3 = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
        recyclerView3.setVisibility(0);
        C52883way c52883way2 = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52883way2, "");
        c52883way2.setVisibility(8);
        android.content.Context context = getContext();
        if (context != null) {
            C57636ymE.refreshDataOrEmpty$default(this.KWHzl, context, (java.util.List) OLrzqt().KWHzl(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0.0f, 8, (java.lang.Object) null);
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vYH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vYH vyh) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = vyh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
