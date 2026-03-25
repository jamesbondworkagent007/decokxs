package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenResp;
import com.okinc.business.defi.wallet.home.ReportRiskyCoinBottomSheet$doReport$1;
import com.okinc.business.defi.wallet.home.ReportRiskyCoinBottomSheet$onCreateContent$1$1$1$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eSZ extends wXX {
    public C16653enw AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.CharSequence EZpvd;
    public Function0<Unit> KWHzl;
    public eUG OLrzqt;
    public C10854bwM copydefault;
    public java.lang.String djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.eTb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eSZ.copydefault();
        }
    });
    public int gEmmrt;
    public java.lang.String valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    private final C13934dbu EZpvd() {
        return (C13934dbu) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13934dbu copydefault() {
        return new C13934dbu();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eSZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eSZ$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eSZ newInstance$default(ActionBar actionBar, int i, eUG eug, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                function0 = null;
            }
            return actionBar.AEQbTJ(i, eug, function0);
        }

        public final eSZ AEQbTJ(int i, @NotNull eUG eug, Function0<Unit> function0) {
            java.lang.String strOLrzqt;
            java.lang.String string;
            eUG eug2;
            Intrinsics.checkNotNullParameter(eug, "");
            eSZ esz = new eSZ();
            esz.KWHzl = function0;
            esz.gEmmrt = i;
            if (!eug.zsXlph()) {
                strOLrzqt = eug.gEmmrt();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(eug.AhwBna());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    strOLrzqt = "";
                }
            }
            esz.valueOf = strOLrzqt;
            esz.OLrzqt = eug;
            esz.EZpvd = eug.AhwBna();
            java.util.ArrayList<eUG> arrayListAYXKKw = eug.AYXKKw();
            java.lang.String strDjBIcL = (arrayListAYXKKw == null || (eug2 = (eUG) CollectionsKt___CollectionsKt.firstOrNull(arrayListAYXKKw)) == null) ? null : eug2.djBIcL();
            esz.djBIcL = strDjBIcL != null ? strDjBIcL : "";
            esz.copydefault = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
            return esz;
        }

        public final eSZ EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(str2, "");
            eSZ esz = new eSZ();
            esz.KWHzl = function0;
            esz.gEmmrt = i;
            esz.valueOf = str;
            esz.EZpvd = charSequence;
            esz.copydefault = c10854bwM;
            esz.djBIcL = str2;
            esz.AhwBna = str3;
            return esz;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(9);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16653enw c16653enwOLrzqt = C16653enw.OLrzqt(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.AYXKKw = c16653enwOLrzqt;
        C16653enw c16653enw = null;
        if (c16653enwOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16653enwOLrzqt = null;
        }
        c16653enwOLrzqt.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsCallbackDefault));
        wYF wyf = c16653enwOLrzqt.AEQbTJ;
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onNavigationEvent));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        c16653enwOLrzqt.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsCallbackStub));
        ShapeableImageView shapeableImageView = c16653enwOLrzqt.copydefault;
        if (shapeableImageView != null) {
            shapeableImageView.setImageResource(C52761wXj.TaskDescription.aHXSQp);
        }
        if (C9700baY.EZpvd(getContext()) && shapeableImageView != null) {
            java.lang.String str2 = this.valueOf;
            if (str2 == null) {
                Intrinsics.gEmmrt("");
                str = null;
            } else {
                str = str2;
            }
            C57659ymb.loadFixSizeBorderImage$default(shapeableImageView, str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, 4, null);
        }
        android.widget.TextView textView = c16653enwOLrzqt.EZpvd;
        java.lang.CharSequence charSequence = this.EZpvd;
        if (charSequence == null) {
            Intrinsics.gEmmrt("");
            charSequence = null;
        }
        textView.setText(charSequence);
        C16653enw c16653enw2 = this.AYXKKw;
        if (c16653enw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16653enw = c16653enw2;
        }
        constraintLayout.addView(c16653enw.getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReportRiskyCoinBottomSheet$doReport$1 reportRiskyCoinBottomSheet$doReport$1;
        long jAEQbTJ;
        java.lang.String strOLrzqt;
        eSZ esz;
        eSZ esz2;
        ChainAddress chainAddressAddressFromChainId$default;
        ReportRiskyTokenResp reportRiskyTokenResp;
        java.lang.Boolean reportStatus;
        Function0<Unit> function0;
        if (continuation instanceof ReportRiskyCoinBottomSheet$doReport$1) {
            reportRiskyCoinBottomSheet$doReport$1 = (ReportRiskyCoinBottomSheet$doReport$1) continuation;
            int i = reportRiskyCoinBottomSheet$doReport$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportRiskyCoinBottomSheet$doReport$1.label = i - Integer.MIN_VALUE;
            } else {
                reportRiskyCoinBottomSheet$doReport$1 = new ReportRiskyCoinBottomSheet$doReport$1(this, continuation);
            }
        }
        java.lang.Object objAwait = reportRiskyCoinBottomSheet$doReport$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = reportRiskyCoinBottomSheet$doReport$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            C10854bwM c10854bwM = this.copydefault;
            if (c10854bwM != null) {
                jAEQbTJ = c10854bwM.AEQbTJ();
                strOLrzqt = c10854bwM.OLrzqt();
                C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
                java.lang.String str = this.djBIcL;
                if (str == null) {
                    Intrinsics.gEmmrt("");
                    str = null;
                }
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = instance$default.OLrzqt(str, true);
                reportRiskyCoinBottomSheet$doReport$1.L$0 = this;
                reportRiskyCoinBottomSheet$doReport$1.L$1 = strOLrzqt;
                reportRiskyCoinBottomSheet$doReport$1.J$0 = jAEQbTJ;
                reportRiskyCoinBottomSheet$doReport$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, reportRiskyCoinBottomSheet$doReport$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                esz = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            esz2 = (eSZ) reportRiskyCoinBottomSheet$doReport$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
            reportRiskyTokenResp = (ReportRiskyTokenResp) ((ResponseData) objAwait).getData();
            if (reportRiskyTokenResp != null && (reportStatus = reportRiskyTokenResp.getReportStatus()) != null && reportStatus.booleanValue() && (function0 = esz2.KWHzl) != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        jAEQbTJ = reportRiskyCoinBottomSheet$doReport$1.J$0;
        strOLrzqt = (java.lang.String) reportRiskyCoinBottomSheet$doReport$1.L$1;
        esz = (eSZ) reportRiskyCoinBottomSheet$doReport$1.L$0;
        C56391yDq.AEQbTJ(objAwait);
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
        java.lang.String address = esz.AhwBna;
        if (address == null) {
            address = (abstractC12782ctV == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, jAEQbTJ, null, 2, null)) == null) ? null : chainAddressAddressFromChainId$default.getAddress();
        }
        if (address != null) {
            AbstractC58185ywX<ResponseData<ReportRiskyTokenResp>> abstractC58185ywXKWHzl = esz.EZpvd().KWHzl(new ReportRiskyTokenReq(C56443yFo.KWHzl(jAEQbTJ), address, strOLrzqt, C56443yFo.AEQbTJ(1)), abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), abstractC12782ctV.aUsmxb());
            reportRiskyCoinBottomSheet$doReport$1.L$0 = esz;
            reportRiskyCoinBottomSheet$doReport$1.L$1 = null;
            reportRiskyCoinBottomSheet$doReport$1.label = 2;
            objAwait = AwaitKt.awaitLast(abstractC58185ywXKWHzl, reportRiskyCoinBottomSheet$doReport$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            esz2 = esz;
            reportRiskyTokenResp = (ReportRiskyTokenResp) ((ResponseData) objAwait).getData();
            if (reportRiskyTokenResp != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ eSZ KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eSZ esz) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = esz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new ReportRiskyCoinBottomSheet$onCreateContent$1$1$1$1(this.KWHzl, null), 3, null);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ eSZ AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, eSZ esz) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = esz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
