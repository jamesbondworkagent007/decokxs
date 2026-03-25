package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalTypeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51399vmL extends AbstractC49945uyC<uVC, SignalBotCopyPresenter> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public java.util.List<SignalTypeData> AhwBna;
    public final int copydefault = C48033uCm.Activity.DGGHxk;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vmJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51399vmL.isConnected();
        }
    });
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    private final C43316rmw fARcdN() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.vmL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull java.util.List<SignalTypeData> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C51399vmL c51399vmL = new C51399vmL();
            c51399vmL.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("SUB_SELECT_LIST", list)));
            c51399vmL.show(fragmentManager, "SignalSubsSelectedDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C55867xrz.KWHzl.OLrzqt();
        AuCTel();
        ejfBZ();
        view.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.scanPackages)));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    private final void AuCTel() {
        java.util.List<SignalTypeData> listAhwBna;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (listAhwBna = arguments.getParcelableArrayList("SUB_SELECT_LIST")) == null) {
            listAhwBna = yDY.AhwBna();
        }
        this.AhwBna = listAhwBna;
    }

    private final void ejfBZ() {
        fARcdN().register(SignalTypeData.class, new C51402vmO(new Function1() { // from class: o.vmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51399vmL.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }));
        uVC uvcValues = values();
        uvcValues.EZpvd.setAdapter(fARcdN());
        java.util.List<SignalTypeData> list = null;
        uvcValues.EZpvd.addItemDecoration(new SpacingItemDecoration(0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        uvcValues.EZpvd.setLayoutManager(new LinearLayoutManager(getActivity()));
        C43316rmw c43316rmwFARcdN = fARcdN();
        java.util.List<SignalTypeData> list2 = this.AhwBna;
        if (list2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            list = list2;
        }
        C33064mpR.OLrzqt(c43316rmwFARcdN, (java.util.List<? extends java.lang.Object>) list);
    }

    public static final Unit copydefault(C51399vmL c51399vmL, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51399vmL.OLrzqt = str;
        C55867xrz.KWHzl.gEmmrt(str);
        c51399vmL.getParentFragmentManager().setFragmentResult("SUB_SELECT_TYPE", BundleKt.bundleOf(C56390yDp.OLrzqt("SUB_SELECT_TYPE", str)));
        c51399vmL.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.OLrzqt.length() == 0) {
            C55867xrz.KWHzl.gEmmrt(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        }
    }
}
