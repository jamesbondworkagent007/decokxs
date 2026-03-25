package o;

import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotCreateSignPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vXZ extends AbstractC54505xKx<AbstractC50855vby, SignalBotCreateSignPresenter> {
    public static final Application Companion = new Application(null);
    public final int AEQbTJ = C48033uCm.Activity.aBDePw;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ AbstractC50855vby EZpvd(vXZ vxz) {
        return vxz.gGvvIC();
    }

    public static final /* synthetic */ SignalBotCreateSignPresenter KWHzl(vXZ vxz) {
        return vxz.dxcTrN();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vXZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final vXZ OLrzqt() {
            return new vXZ();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        AEQbTJ();
        dxcTrN().copydefault();
        C52688wUr.copydefault.OLrzqt(view);
    }

    private final void KWHzl() {
        C52794wYp c52794wYp = gGvvIC().AEQbTJ;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    private final void AEQbTJ() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataAEQbTJ = dxcTrN().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXZ.OLrzqt(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXZ.AEQbTJ(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vXZ vxz, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        vxz.OLrzqt(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName()) : 30, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription()) : 500);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vxz, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(vXZ vxz, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vxz.dxcTrN().AhwBna().bB_())) {
            S s = pair.second;
            if (s instanceof BizApiException) {
                Intrinsics.copydefault(s, "");
                if (Intrinsics.EZpvd((java.lang.Object) ((BizApiException) s).getCode(), (java.lang.Object) C56120xwn.valueOf.values())) {
                    vxz.gGvvIC().OLrzqt.EZpvd().clearFocus();
                    vxz.gGvvIC().OLrzqt.EZpvd().setActivated(false);
                    vxz.EZpvd(false, C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDDUqPf));
                } else {
                    java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                    }
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vxz.dxcTrN().OLrzqt().bB_())) {
            vxz.OLrzqt(30, 500);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vxz, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final int i, final int i2) {
        OKEditText oKEditTextEZpvd = gGvvIC().OLrzqt.EZpvd();
        OKEditText oKEditTextCopydefault = gGvvIC().OLrzqt.copydefault();
        copydefault(oKEditTextEZpvd, i);
        copydefault(oKEditTextCopydefault, i2);
        AEQbTJ(oKEditTextEZpvd);
        C33606mzd.AEQbTJ(oKEditTextEZpvd, new Function1() { // from class: o.vYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXZ.AEQbTJ(this.KWHzl, i, (java.lang.CharSequence) obj);
            }
        });
        C33606mzd.AEQbTJ(oKEditTextCopydefault, new Function1() { // from class: o.vYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vXZ.OLrzqt(this.copydefault, i2, (java.lang.CharSequence) obj);
            }
        });
        oKEditTextEZpvd.setText("");
        oKEditTextCopydefault.setText("");
        oKEditTextCopydefault.setHint(C33070mpX.AYXKKw(C55688xof.Application.onNavigationEvent));
    }

    public static final Unit AEQbTJ(vXZ vxz, int i, java.lang.CharSequence charSequence) {
        C52882wax c52882wax = vxz.gGvvIC().OLrzqt;
        xMR xmr = xMR.copydefault;
        c52882wax.setNameNotifyText(xmr.copydefault(C33129mqd.gEmmrt(charSequence != null ? java.lang.Integer.valueOf(charSequence.length()) : null)) + "/" + xmr.copydefault(java.lang.String.valueOf(i)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vXZ vxz, int i, java.lang.CharSequence charSequence) {
        C52882wax c52882wax = vxz.gGvvIC().OLrzqt;
        xMR xmr = xMR.copydefault;
        c52882wax.setIntroNotifyText(xmr.copydefault(C33129mqd.gEmmrt(charSequence != null ? java.lang.Integer.valueOf(charSequence.length()) : null)) + "/" + xmr.copydefault(java.lang.String.valueOf(i)));
        return Unit.INSTANCE;
    }

    public final boolean copydefault() {
        OKEditText oKEditTextEZpvd = gGvvIC().OLrzqt.EZpvd();
        android.text.Editable text = oKEditTextEZpvd.getText();
        if (C33129mqd.gEmmrt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null).length() != 0) {
            return true;
        }
        oKEditTextEZpvd.clearFocus();
        oKEditTextEZpvd.setActivated(false);
        EZpvd(false, C33070mpX.AYXKKw(C55688xof.Application.zNQIcI));
        return false;
    }

    public static /* synthetic */ void updateNotify$default(vXZ vxz, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        vxz.EZpvd(z, str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wax.setNameError$default(o.wax, boolean, java.lang.String, int, java.lang.Object):void */
    public final void EZpvd(boolean z, java.lang.String str) {
        if (z) {
            gGvvIC().OLrzqt.setNameNotifyVisible(true);
            C52882wax.setNameError$default(gGvvIC().OLrzqt, false, null, 2, null);
        } else {
            gGvvIC().OLrzqt.setNameNotifyVisible(false);
            gGvvIC().OLrzqt.setNameError(true, str);
        }
    }

    public final void copydefault(final android.widget.EditText editText, int i) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.vYd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                return vXZ.EZpvd(textView, i2, keyEvent);
            }
        });
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.vYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
                return vXZ.EZpvd(editText, charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter.LengthFilter(i)});
    }

    public static final boolean EZpvd(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        return StringsKt__StringsKt.fARcdN(text) && keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public static final java.lang.CharSequence EZpvd(android.widget.EditText editText, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        Intrinsics.copydefault(charSequence);
        if (StringsKt__StringsKt.fARcdN(charSequence)) {
            android.text.Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt__StringsKt.fARcdN(text)) {
                return "";
            }
        }
        return null;
    }

    public final void AEQbTJ(final android.widget.EditText editText) {
        final OKEditText oKEditTextEZpvd = gGvvIC().OLrzqt.EZpvd();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.vYa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                vXZ.EZpvd(editText, oKEditTextEZpvd, this, view, z);
            }
        });
    }

    public static final void EZpvd(android.widget.EditText editText, OKEditText oKEditText, vXZ vxz, android.view.View view, boolean z) {
        if (Intrinsics.EZpvd(editText, oKEditText) && z) {
            oKEditText.setActivated(true);
            updateNotify$default(vxz, true, null, 2, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vXZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vXZ vxz) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = vxz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.copydefault()) {
                    SignalBotCreateSignPresenter signalBotCreateSignPresenterKWHzl = vXZ.KWHzl(this.copydefault);
                    android.text.Editable text = vXZ.EZpvd(this.copydefault).OLrzqt.EZpvd().getText();
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null);
                    android.text.Editable text2 = vXZ.EZpvd(this.copydefault).OLrzqt.copydefault().getText();
                    signalBotCreateSignPresenterKWHzl.OLrzqt(strGEmmrt, C33129mqd.gEmmrt(text2 != null ? StringsKt__StringsKt.hDKMBd(text2) : null));
                }
            }
        }
    }
}
