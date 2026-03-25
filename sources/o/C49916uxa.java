package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.LoanModeReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49916uxa extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> EZpvd;
    public final C56174xxo OLrzqt = new C56174xxo();
    public AbstractC49533uqO copydefault;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX INFO: renamed from: o.uxa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C49916uxa OLrzqt(boolean z) {
            C49916uxa c49916uxa = new C49916uxa();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("SUPPORT_DISCLAIMER", z);
            c49916uxa.setArguments(bundle);
            return c49916uxa;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getBoolean("SUPPORT_DISCLAIMER") : false;
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
        AbstractC49533uqO abstractC49533uqOAEQbTJ = AbstractC49533uqO.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.copydefault = abstractC49533uqOAEQbTJ;
        AbstractC49533uqO abstractC49533uqO = null;
        if (abstractC49533uqOAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqOAEQbTJ = null;
        }
        abstractC49533uqOAEQbTJ.EZpvd.setImageResource(C49511upt.TaskDescription.KWHzl);
        AbstractC49533uqO abstractC49533uqO2 = this.copydefault;
        if (abstractC49533uqO2 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO2 = null;
        }
        abstractC49533uqO2.AhwBna.setText(C33070mpX.AYXKKw(C49511upt.Activity.iRxXKY));
        AbstractC49533uqO abstractC49533uqO3 = this.copydefault;
        if (abstractC49533uqO3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO3 = null;
        }
        abstractC49533uqO3.OLrzqt.setText(C33070mpX.AYXKKw(C49511upt.Activity.QKudOq));
        AbstractC49533uqO abstractC49533uqO4 = this.copydefault;
        if (abstractC49533uqO4 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO4 = null;
        }
        abstractC49533uqO4.KWHzl.setText(C33070mpX.AYXKKw(C49511upt.Activity.hUfVAv));
        AbstractC49533uqO abstractC49533uqO5 = this.copydefault;
        if (abstractC49533uqO5 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO5 = null;
        }
        abstractC49533uqO5.copydefault.setText(C33070mpX.AYXKKw(C49511upt.Activity.EZpvd));
        AbstractC49533uqO abstractC49533uqO6 = this.copydefault;
        if (abstractC49533uqO6 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO6 = null;
        }
        C52794wYp c52794wYp = abstractC49533uqO6.KWHzl;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        AbstractC49533uqO abstractC49533uqO7 = this.copydefault;
        if (abstractC49533uqO7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49533uqO = abstractC49533uqO7;
        }
        C52794wYp c52794wYp2 = abstractC49533uqO.copydefault;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
        AEQbTJ();
    }

    public final void copydefault() {
        android.content.Context context = getContext();
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoading();
        }
        this.OLrzqt.AYXKKw();
        C56174xxo c56174xxo = this.OLrzqt;
        c56174xxo.KWHzl(new LoanModeReq(true));
        c56174xxo.KWHzl(new Function1() { // from class: o.uwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49916uxa.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56174xxo, 0L, 1, null);
    }

    public static final Unit EZpvd(C49916uxa c49916uxa, ResponseData responseData) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(responseData, "");
        android.content.Context context = c49916uxa.getContext();
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        if (responseData.getCode() == 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                newProxyInstance.OLrzqt(true);
            }
            C55326xho.toastWithSuccessfulIcon$default(C49511upt.Activity.QkdxfA, 0, 1, (java.lang.Object) null);
            Function0<Unit> function0 = c49916uxa.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
            c49916uxa.dismissAllowingStateLoss();
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.AYXKKw);
        android.text.SpannableString spannableStringCopydefault = C49965uyW.EZpvd.copydefault(C33069mpW.copydefault(C49511upt.Activity.QUSxYX, C56423yEv.EZpvd(C56390yDp.OLrzqt("link", strAYXKKw))), strAYXKKw, C33070mpX.copydefault(C52761wXj.Activity.Dmq), new Function0() { // from class: o.uwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49916uxa.KWHzl(this.AEQbTJ);
            }
        });
        AbstractC49533uqO abstractC49533uqO = this.copydefault;
        AbstractC49533uqO abstractC49533uqO2 = null;
        if (abstractC49533uqO == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO = null;
        }
        abstractC49533uqO.AEQbTJ.setText(spannableStringCopydefault);
        AbstractC49533uqO abstractC49533uqO3 = this.copydefault;
        if (abstractC49533uqO3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49533uqO3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC49533uqO3.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(this.valueOf ? 0 : 8);
        AbstractC49533uqO abstractC49533uqO4 = this.copydefault;
        if (abstractC49533uqO4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49533uqO2 = abstractC49533uqO4;
        }
        abstractC49533uqO2.AEQbTJ.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final Unit KWHzl(C49916uxa c49916uxa) {
        android.content.Context context = c49916uxa.getContext();
        if (context != null) {
            C49953uyK.AEQbTJ(context);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt.AYXKKw();
    }

    /* JADX INFO: renamed from: o.uxa$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C49916uxa KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C49916uxa c49916uxa) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c49916uxa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                Function0<Unit> function0KWHzl = this.KWHzl.KWHzl();
                if (function0KWHzl != null) {
                    function0KWHzl.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uxa$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C49916uxa EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C49916uxa c49916uxa) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c49916uxa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault();
            }
        }
    }
}
