package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C53989wvr;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vJk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50303vJk extends AbstractC52789wYk {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public TacticsData AEQbTJ;

    /* JADX INFO: renamed from: o.vJk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vJk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50303vJk AEQbTJ(@NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", tacticsData);
            C50303vJk c50303vJk = new C50303vJk();
            c50303vJk.setArguments(bundle);
            return c50303vJk;
        }
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52789wYk, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? (TacticsData) arguments.getParcelable("bot_grid_req") : null;
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl();
    }

    private final void KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C55371xig c55371xig = new C55371xig(fragmentActivityRequireActivity, null, 2, null);
        c55371xig.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.setExtras));
        c55371xig.setDescriptionText(C33070mpX.AYXKKw(C55688xof.Application.setDescription));
        c55371xig.setClickCallback(new Function0() { // from class: o.vJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50303vJk.KWHzl(this.OLrzqt);
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        C55371xig c55371xig2 = new C55371xig(fragmentActivityRequireActivity2, null, 2, null);
        c55371xig2.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.setIconBitmap));
        c55371xig2.setDescriptionText(C33070mpX.AYXKKw(C55688xof.Application.setIconUri));
        c55371xig2.setClickCallback(new Function0() { // from class: o.vJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50303vJk.OLrzqt(this.OLrzqt);
            }
        });
        android.widget.TextView textViewGEmmrt = gEmmrt();
        if (textViewGEmmrt != null) {
            C55307xhV.AEQbTJ(textViewGEmmrt, C33070mpX.AYXKKw(C55688xof.Application.setLocationManually));
        }
        android.widget.TextView textViewValueOf = valueOf();
        if (textViewValueOf != null) {
            C55307xhV.AEQbTJ(textViewValueOf, C33070mpX.AYXKKw(C55688xof.Application.onReceive));
        }
        arrayList.add(c55371xig);
        arrayList.add(c55371xig2);
        OLrzqt(arrayList);
    }

    public static final Unit KWHzl(C50303vJk c50303vJk) {
        TacticsData tacticsData = c50303vJk.AEQbTJ;
        if (tacticsData != null) {
            java.lang.String orderType = tacticsData.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                vGL vglOLrzqt = vGL.Companion.OLrzqt(tacticsData);
                androidx.fragment.app.FragmentManager parentFragmentManager = c50303vJk.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                vglOLrzqt.show(parentFragmentManager);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                C50225vGn c50225vGnCopydefault = C50225vGn.Companion.copydefault(tacticsData);
                androidx.fragment.app.FragmentManager parentFragmentManager2 = c50303vJk.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                c50225vGnCopydefault.show(parentFragmentManager2);
            }
        }
        c50303vJk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C50303vJk c50303vJk) {
        java.lang.String stopType;
        java.util.List<SignParamItem> signParams;
        java.lang.Object next;
        java.lang.String orderType;
        java.lang.String algoId;
        TacticsData tacticsData = c50303vJk.AEQbTJ;
        java.lang.String str = (tacticsData == null || (algoId = tacticsData.getAlgoId()) == null) ? "" : algoId;
        TacticsData tacticsData2 = c50303vJk.AEQbTJ;
        java.lang.String str2 = (tacticsData2 == null || (orderType = tacticsData2.getOrderType()) == null) ? "" : orderType;
        TacticsData tacticsData3 = c50303vJk.AEQbTJ;
        java.lang.String instId = tacticsData3 != null ? tacticsData3.getInstId() : null;
        TacticsData tacticsData4 = c50303vJk.AEQbTJ;
        java.lang.String instType = tacticsData4 != null ? tacticsData4.getInstType() : null;
        TacticsData tacticsData5 = c50303vJk.AEQbTJ;
        java.lang.String tradeSymbol = tacticsData5 != null ? tacticsData5.getTradeSymbol() : null;
        TacticsData tacticsData6 = c50303vJk.AEQbTJ;
        java.lang.String tvTitle = tacticsData6 != null ? tacticsData6.getTvTitle() : null;
        TacticsData tacticsData7 = c50303vJk.AEQbTJ;
        java.lang.String sourceCcy = tacticsData7 != null ? tacticsData7.getSourceCcy() : null;
        TacticsData tacticsData8 = c50303vJk.AEQbTJ;
        if (tacticsData8 == null || (signParams = tacticsData8.getSignParams()) == null) {
            stopType = null;
        } else {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) "stop")) {
                    break;
                }
            }
            SignParamItem signParamItem = (SignParamItem) next;
            if (signParamItem != null) {
                stopType = signParamItem.getStopType();
            }
        }
        TacticsData tacticsData9 = c50303vJk.AEQbTJ;
        TacticsVoucherInfo voucherInfo = tacticsData9 != null ? tacticsData9.getVoucherInfo() : null;
        TacticsData tacticsData10 = c50303vJk.AEQbTJ;
        java.lang.String totalPnl = tacticsData10 != null ? tacticsData10.getTotalPnl() : null;
        TacticsData tacticsData11 = c50303vJk.AEQbTJ;
        new C53989wvr.ActionBar(str, str2, instId, instType, tradeSymbol, tvTitle, stopType, sourceCcy, voucherInfo, totalPnl, tacticsData11 != null ? tacticsData11.getCopyType() : null, new Function0() { // from class: o.vJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50303vJk.AEQbTJ();
            }
        }).KWHzl().show(c50303vJk.getParentFragmentManager(), "StopBotDialogFragment");
        c50303vJk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCaller), null, 0, null, 0, 0, 62, null);
        return Unit.INSTANCE;
    }
}
