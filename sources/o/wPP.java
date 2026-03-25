package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.strategy.view.BorrowInterestBottomSheetUiModel;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.wOE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPP extends wXX {
    public int EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wPV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wPP.KWHzl(this.copydefault);
        }
    });
    public final C43316rmw OLrzqt;
    public final boolean copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public wPP() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(InterestInfoResponse.class, new wOS());
        c43316rmw.register(java.lang.String.class, new wOJ());
        c43316rmw.register(BillsArchive.class, new wOL());
        c43316rmw.register(wOE.Application.class, new wOE());
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        this.OLrzqt = c43316rmw;
        this.EZpvd = Integer.MAX_VALUE;
        this.copydefault = true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wPP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull BorrowInterestBottomSheetUiModel borrowInterestBottomSheetUiModel) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(borrowInterestBottomSheetUiModel, "");
            wPP wpp = new wPP();
            wpp.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DATA_KEY", borrowInterestBottomSheetUiModel)));
            C49662usl.EZpvd(wpp, fragmentManager, "BorrowInterestBottomSheet");
        }
    }

    public final BorrowInterestBottomSheetUiModel copydefault() {
        return (BorrowInterestBottomSheetUiModel) this.KWHzl.getValue();
    }

    public static final BorrowInterestBottomSheetUiModel KWHzl(wPP wpp) {
        BorrowInterestBottomSheetUiModel borrowInterestBottomSheetUiModel = (BorrowInterestBottomSheetUiModel) wpp.requireArguments().getParcelable("DATA_KEY");
        return borrowInterestBottomSheetUiModel == null ? BorrowInterestBottomSheetUiModel.Companion.KWHzl() : borrowInterestBottomSheetUiModel;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final uMN umnCopydefault = uMN.copydefault(getLayoutInflater(), constraintLayout, true);
        android.widget.RelativeLayout root = umnCopydefault.getRoot();
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        root.setMinimumHeight(C55302xhQ.AEQbTJ(resources));
        final RecyclerView recyclerView = umnCopydefault.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.OLrzqt);
        recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.wPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                wPP.AEQbTJ(recyclerView, umnCopydefault, this, view, i, i2, i3, i4);
            }
        });
        Intrinsics.copydefault(umnCopydefault);
        EZpvd(umnCopydefault);
        RecyclerView recyclerView2 = umnCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(recyclerView2, new TaskDescription(recyclerView2, umnCopydefault)), "");
    }

    public static final void AEQbTJ(RecyclerView recyclerView, uMN umn, wPP wpp, android.view.View view, int i, int i2, int i3, int i4) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
        android.widget.LinearLayout linearLayout = umn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(childAdapterPosition < wpp.EZpvd ? 8 : 0);
    }

    public final void EZpvd(uMN umn) {
        java.util.List<BillsArchive> listEZpvd = copydefault().EZpvd();
        android.widget.TextView textView = umn.EZpvd;
        int i = C48033uCm.Fragment.DcMfJKfNUfqk;
        java.lang.String strAEQbTJ = copydefault().AEQbTJ();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            strAEQbTJ = "--";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strAEQbTJ))));
        C43316rmw c43316rmw = this.OLrzqt;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        InterestInfoResponse interestInfoResponseCopydefault = copydefault().copydefault();
        if (interestInfoResponseCopydefault != null) {
            listOLrzqt.add(interestInfoResponseCopydefault);
        }
        if (!listEZpvd.isEmpty()) {
            listOLrzqt.add(copydefault().AEQbTJ());
            this.EZpvd = yDY.AuCTel(listOLrzqt);
            listOLrzqt.addAll(listEZpvd);
            if (listEZpvd.size() >= 100) {
                listOLrzqt.add(wOE.Application.KWHzl);
            }
        } else {
            listOLrzqt.add(new CommonEmptyData(C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), null, null, 0, 100, false, false, 100, C52761wXj.TaskDescription.HJWChPRGtXKC, WalletImportError.ERROR_CODE_AA_CREATE_KEY, null));
        }
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) C56402yEa.fARcdN(listOLrzqt));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView));
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wPP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wPP wpp) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = wpp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ uMN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, uMN umn) {
            this.EZpvd = view;
            this.copydefault = umn;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.widget.RelativeLayout root = this.copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            int i = 0;
            for (android.view.View view : ViewGroupKt.getChildren(root)) {
                int height = view.getHeight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i += height + i2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            }
            if (i < this.copydefault.getRoot().getHeight()) {
                android.widget.RelativeLayout root2 = this.copydefault.getRoot();
                root2.setMinimumHeight(i);
                root2.getLayoutParams().height = i;
            }
        }
    }
}
