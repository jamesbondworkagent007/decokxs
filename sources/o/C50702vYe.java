package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotCreateSignPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50702vYe extends AbstractC54505xKx<AbstractC50853vbw, SignalBotCreateSignPresenter> {
    public static final Application Companion = new Application(null);
    public final int KWHzl = C48033uCm.Activity.DzCpqu;

    /* JADX INFO: renamed from: o.vYe$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public static final /* synthetic */ SignalBotCreateSignPresenter KWHzl(C50702vYe c50702vYe) {
        return c50702vYe.dxcTrN();
    }

    /* JADX INFO: renamed from: o.vYe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50702vYe OLrzqt() {
            return new C50702vYe();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        copydefault();
        KWHzl();
        C52688wUr.copydefault.OLrzqt(view);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        java.lang.String strAYXKKw;
        C52794wYp c52794wYp = gGvvIC().AEQbTJ;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.apLTlu);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.fJNWhG);
        }
        c52794wYp.setText(strAYXKKw);
    }

    private final void copydefault() {
        TradeLiveData<SignalListItem> tradeLiveDataValueOf = dxcTrN().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50702vYe.KWHzl(this.AEQbTJ, (SignalListItem) obj);
            }
        }));
    }

    public static final Unit KWHzl(C50702vYe c50702vYe, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = c50702vYe.getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(C48033uCm.Application.ActivityResultLauncherHolder, C50710vYm.Companion.copydefault(signalListItem.getSignalChanId()));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        C52794wYp c52794wYp = gGvvIC().AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = gGvvIC().EZpvd;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vYe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C50702vYe AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50702vYe c50702vYe) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c50702vYe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C33569myt.copydefault(this.AEQbTJ.requireContext(), android.net.Uri.parse(C33070mpX.AYXKKw(C55688xof.Application.getView)));
            }
        }
    }

    /* JADX INFO: renamed from: o.vYe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C50702vYe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50702vYe c50702vYe) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c50702vYe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C50702vYe.KWHzl(this.copydefault).KWHzl();
            }
        }
    }
}
