package o;

import android.view.View;
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

/* JADX INFO: renamed from: o.gax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20126gax extends AbstractC20105gac<C12244cjL> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.gax$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gax.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20126gax EZpvd(@NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            C20126gax c20126gax = new C20126gax();
            c20126gax.setArguments(bundle);
            return c20126gax;
        }
    }

    @Override // o.AbstractC20109gag, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AkhnZx();
    }

    @Override // o.AbstractC20109gag
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        super.KWHzl(abstractC8426bCW, c8486bDd);
        copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20105gac, o.AbstractC20109gag
    public void copydefault() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) C12244cjL.getErrorMsg$default((C12244cjL) gEmmrt(), 0, 1, null))) {
            java.lang.String errorMsg$default = C12244cjL.getErrorMsg$default((C12244cjL) gEmmrt(), 0, 1, null);
            if (errorMsg$default != null) {
                C55326xho.toastWithFailedIcon$default(errorMsg$default, 0, 1, (java.lang.Object) null);
            }
            dismissAllowingStateLoss();
            return;
        }
        super.copydefault();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(((C12244cjL) gEmmrt()).DGgnkA(), 0);
        AEQbTJ(zAEQbTJ);
        OLrzqt(zAEQbTJ);
        KWHzl(zAEQbTJ);
    }

    public final void AkhnZx() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dvImUD);
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.fLIjIY, C56423yEv.EZpvd(C56390yDp.OLrzqt("cpfp", strAYXKKw)));
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        spannableString.setSpan(new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), strAYXKKw), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null), strCopydefault.length(), 18);
        OLrzqt().AkhnZx.setText(spannableString);
        OLrzqt().AkhnZx.setOnTouchListener(new ViewOnTouchListenerC14460dlq(OLrzqt().AkhnZx, strCopydefault, strAYXKKw, new Function0() { // from class: o.gaz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20126gax.EZpvd(this.copydefault);
            }
        }));
    }

    public static final Unit EZpvd(C20126gax c20126gax) {
        android.content.Context context = c20126gax.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.UhxbNG);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        OLrzqt().copydefault.AEQbTJ.setShowUnderline(z);
        OLrzqt().copydefault.AEQbTJ.setEnabled(z);
        OLrzqt().copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.gav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20126gax.copydefault(this.AEQbTJ, view);
            }
        });
        OLrzqt().copydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.alsFma));
        OLrzqt().copydefault.copydefault.setVisibility(8);
        OLrzqt().copydefault.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(((C12244cjL) gEmmrt()).QXDzTk(), 0, null, 2, null) + " Sat/vB");
        OLrzqt().AEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aHXSQp));
        OLrzqt().AEQbTJ.copydefault.setVisibility(8);
        OLrzqt().AEQbTJ.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        OLrzqt().AEQbTJ.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(((C12244cjL) gEmmrt()).DNMMPQ(), 0, null, 2, null) + " Sat/vB");
    }

    public static final void copydefault(C20126gax c20126gax, android.view.View view) {
        android.content.Context context = c20126gax.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.ULRxlR);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        OLrzqt().djBIcL.getRoot().setVisibility(0);
        OLrzqt().djBIcL.copydefault.setVisibility(8);
        OLrzqt().djBIcL.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.akftKQ));
        OLrzqt().djBIcL.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(((C12244cjL) gEmmrt()).RKcVTr(), 0, null, 2, null) + " vB");
        if (z) {
            OLrzqt().EZpvd.getRoot().setVisibility(0);
            OLrzqt().EZpvd.copydefault.setVisibility(8);
            OLrzqt().EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RXzakW));
            OLrzqt().EZpvd.KWHzl.setText(pTB.formatLocalizedWithMinPrecision$default(((C12244cjL) gEmmrt()).DGgnkA(), 0, null, 2, null) + " vB");
            return;
        }
        OLrzqt().EZpvd.getRoot().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        C11990ceW c11990ceW = (C11990ceW) ((C12244cjL) gEmmrt()).QKudOq();
        java.lang.String strDaRZkR = ((C12244cjL) gEmmrt()).DaRZkR();
        OLrzqt().values.getRoot().setVisibility(0);
        OLrzqt().values.copydefault.setVisibility(8);
        OLrzqt().values.AEQbTJ.setShowUnderline(z);
        OLrzqt().values.AEQbTJ.setEnabled(z);
        OLrzqt().values.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.gay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20126gax.OLrzqt(this.OLrzqt, view);
            }
        });
        OLrzqt().values.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aJFbMH));
        OLrzqt().values.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW));
        OLrzqt().values.KWHzl.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(c11990ceW, strDaRZkR, false, false, false, 14, null) + " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(c11990ceW, strDaRZkR, false, false, false, 14, null));
    }

    public static final void OLrzqt(C20126gax c20126gax, android.view.View view) {
        android.content.Context context = c20126gax.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.DGgnkA);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
    }

    @Override // o.AbstractC20105gac, o.AbstractC20109gag
    public void AEQbTJ() {
        C55173xeu c55173xeu = OLrzqt().KWHzl;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.apNbdB));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QXDzTk));
        c55173xeu.setVisibility(0);
        OLrzqt().AhwBna.setVisibility(8);
    }

    @Override // o.AbstractC20109gag
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        EZpvd(true);
        super.OLrzqt(c9748bbT);
    }

    @Override // o.AbstractC20109gag
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(false);
        super.KWHzl(str);
    }

    public final void EZpvd(final boolean z) {
        C32866mlf.onEvent$default("BTCAccelerate_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gaw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20126gax.copydefault(z, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(boolean z, C20126gax c20126gax, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (z) {
            str = "success";
        } else {
            str = ((C12244cjL) c20126gax.gEmmrt()).QIZEnU() ? "utxo_fail" : "other_fail";
        }
        eventParamsList.put("accelerate_status", str, true);
        return Unit.INSTANCE;
    }
}
