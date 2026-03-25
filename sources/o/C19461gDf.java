package o;

import android.view.View;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19461gDf extends gCF<UTXOSpeedUpInfoBean, C12540cos> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C12540cos djBIcL = new C12540cos();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/cmV; */
    /* JADX DEBUG: Possible override for method o.gCF.djBIcL()V */
    @Override // o.gCR
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C12540cos gEmmrt() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.gDf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gDf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C19461gDf copydefault(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C19461gDf c19461gDf = new C19461gDf();
            c19461gDf.setArguments(bundle);
            return c19461gDf;
        }
    }

    @Override // o.gCR, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
    }

    @Override // o.gCF, o.gCR
    public void copydefault() {
        super.copydefault();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(gEmmrt().zuBGHE(), 0);
        OLrzqt(zAEQbTJ);
        EZpvd(zAEQbTJ);
        KWHzl(zAEQbTJ);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dvImUD);
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.fLIjIY, C56423yEv.EZpvd(C56390yDp.OLrzqt("cpfp", strAYXKKw)));
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        spannableString.setSpan(new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), strAYXKKw), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null), strCopydefault.length(), 18);
        KWHzl().AkhnZx.setText(spannableString);
        KWHzl().AkhnZx.setOnTouchListener(new ViewOnTouchListenerC14460dlq(KWHzl().AkhnZx, strCopydefault, strAYXKKw, new Function0() { // from class: o.gDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19461gDf.EZpvd(this.OLrzqt);
            }
        }));
    }

    public static final Unit EZpvd(C19461gDf c19461gDf) {
        android.content.Context context = c19461gDf.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.UhxbNG);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    private final void OLrzqt(boolean z) {
        KWHzl().copydefault.AEQbTJ.setShowUnderline(z);
        KWHzl().copydefault.AEQbTJ.setEnabled(z);
        KWHzl().copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.gDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19461gDf.copydefault(this.OLrzqt, view);
            }
        });
        KWHzl().copydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.alsFma));
        KWHzl().copydefault.copydefault.setVisibility(8);
        KWHzl().copydefault.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().gHZMYf(), 0, null, 2, null) + " Sat/vB");
        KWHzl().AEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aHXSQp));
        KWHzl().AEQbTJ.copydefault.setVisibility(8);
        KWHzl().AEQbTJ.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        KWHzl().AEQbTJ.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().AuCTelauCTel(), 0, null, 2, null) + " Sat/vB");
    }

    public static final void copydefault(C19461gDf c19461gDf, android.view.View view) {
        android.content.Context context = c19461gDf.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.ULRxlR);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
    }

    private final void EZpvd(boolean z) {
        KWHzl().djBIcL.getRoot().setVisibility(0);
        KWHzl().djBIcL.copydefault.setVisibility(8);
        KWHzl().djBIcL.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.akftKQ));
        KWHzl().djBIcL.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().sSMYrx(), 0, null, 2, null) + " vB");
        if (z) {
            KWHzl().EZpvd.getRoot().setVisibility(0);
            KWHzl().EZpvd.copydefault.setVisibility(8);
            KWHzl().EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RXzakW));
            KWHzl().EZpvd.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(gEmmrt().zuBGHE(), 0, null, 2, null) + " vB");
            return;
        }
        KWHzl().EZpvd.getRoot().setVisibility(8);
    }

    private final void KWHzl(boolean z) {
        KWHzl().values.getRoot().setVisibility(0);
        KWHzl().values.copydefault.setVisibility(8);
        KWHzl().values.AEQbTJ.setShowUnderline(z);
        KWHzl().values.AEQbTJ.setEnabled(z);
        KWHzl().values.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.gDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19461gDf.AEQbTJ(this.OLrzqt, view);
            }
        });
        KWHzl().values.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aJFbMH));
        KWHzl().values.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW));
        KWHzl().values.KWHzl.setText(gEmmrt().valueOf().KWHzl(gEmmrt().copydefault()));
    }

    public static final void AEQbTJ(C19461gDf c19461gDf, android.view.View view) {
        android.content.Context context = c19461gDf.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.DGgnkA);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
    }

    @Override // o.gCF, o.gCR
    public void AEQbTJ() {
        if (gEmmrt().AxsJAY() == 10004 || gEmmrt().AxsJAY() == 100041 || gEmmrt().AxsJAY() == 400002 || gEmmrt().AxsJAY() == 10001) {
            dismissAllowingStateLoss();
            return;
        }
        C55173xeu c55173xeu = KWHzl().KWHzl;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.apNbdB));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QXDzTk));
        c55173xeu.setVisibility(0);
        KWHzl().AhwBna.setVisibility(8);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.gCR
    public void KWHzl(@NotNull DappTxResultBean dappTxResultBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dappTxResultBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        trackResult$default(this, true, 0, 2, null);
        super.KWHzl(dappTxResultBean, str);
    }

    @Override // o.gCR
    public void KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(false, i);
        super.KWHzl(i, str);
    }

    public static /* synthetic */ void trackResult$default(C19461gDf c19461gDf, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        c19461gDf.OLrzqt(z, i);
    }

    public final void OLrzqt(final boolean z, final int i) {
        C32866mlf.onEvent$default("BTCAccelerate_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19461gDf.EZpvd(z, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(boolean z, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("accelerate_status", z ? "success" : (i == 10004 || i == 100041) ? "utxo_fail" : "other_fail", true);
        return Unit.INSTANCE;
    }
}
