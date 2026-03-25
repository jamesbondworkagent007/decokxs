package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49720utq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uuq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49773uuq extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC49727utx OLrzqt;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uup
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49773uuq.AhwBna(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uun
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49773uuq.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.uuo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C49773uuq.OLrzqt(this.KWHzl));
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final java.lang.String AhwBna(C49773uuq c49773uuq) {
        java.lang.String string;
        android.os.Bundle arguments = c49773uuq.getArguments();
        return (arguments == null || (string = arguments.getString("settleType")) == null) ? "" : string;
    }

    private final java.lang.String copydefault() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String valueOf(C49773uuq c49773uuq) {
        java.lang.String string;
        android.os.Bundle arguments = c49773uuq.getArguments();
        return (arguments == null || (string = arguments.getString("settlePx")) == null) ? "" : string;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final boolean OLrzqt(C49773uuq c49773uuq) {
        return Intrinsics.EZpvd((java.lang.Object) c49773uuq.copydefault(), (java.lang.Object) "settlement");
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o.uuq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uuq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C49773uuq c49773uuq = new C49773uuq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("settleType", str);
            bundle.putString("settlePx", str2);
            c49773uuq.setArguments(bundle);
            c49773uuq.show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(OLrzqt() ? C33070mpX.AYXKKw(C49720utq.Activity.fJNWhG) : C33070mpX.AYXKKw(C49720utq.Activity.fARcdN));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC49727utx abstractC49727utxOLrzqt = AbstractC49727utx.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        this.OLrzqt = abstractC49727utxOLrzqt;
        if (abstractC49727utxOLrzqt != null) {
            abstractC49727utxOLrzqt.OLrzqt.setText(OLrzqt() ? C33070mpX.AYXKKw(C49720utq.Activity.hDKMBd) : C33070mpX.AYXKKw(C49720utq.Activity.getFieldNames));
            abstractC49727utxOLrzqt.AEQbTJ.setText(EZpvd());
            android.widget.TextView textView = abstractC49727utxOLrzqt.copydefault;
            if (TradeAbTestManager.copydefault.valueOf()) {
                strAYXKKw = OLrzqt() ? C33070mpX.AYXKKw(C49720utq.Activity.DbNXlk) : C33070mpX.AYXKKw(C49720utq.Activity.AkhnZx);
            } else {
                strAYXKKw = OLrzqt() ? C33070mpX.AYXKKw(C49720utq.Activity.isConnected) : C33070mpX.AYXKKw(C49720utq.Activity.fetchVPNInfo);
            }
            textView.setText(strAYXKKw);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(OLrzqt() ? C33070mpX.AYXKKw(C49720utq.Activity.AuCTel) : C33070mpX.AYXKKw(C49720utq.Activity.ejfBZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, wyf, this));
        }
    }

    /* JADX INFO: renamed from: o.uuq$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wYF EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C49773uuq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wYF wyf, C49773uuq c49773uuq) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = wyf;
            this.copydefault = c49773uuq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                interfaceC49497upf.OLrzqt(context, this.copydefault.OLrzqt() ? "settlement" : "delivery");
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
