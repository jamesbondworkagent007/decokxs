package o;

import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotUpdatePresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50738vZn extends AbstractC49945uyC<uWQ, SignalBotUpdatePresenter> {
    public boolean KWHzl;
    public final int OLrzqt = C48033uCm.Activity.NRYds;
    public Function2<? super java.lang.Boolean, ? super SignalListItem, Unit> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vZn$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super java.lang.Boolean, ? super SignalListItem, Unit> function2) {
        this.copydefault = function2;
    }

    public static final /* synthetic */ uWQ KWHzl(C50738vZn c50738vZn) {
        return c50738vZn.values();
    }

    /* JADX INFO: renamed from: o.vZn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vZn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C50738vZn EZpvd(@NotNull SignalListItem signalListItem) {
            Intrinsics.checkNotNullParameter(signalListItem, "");
            C50738vZn c50738vZn = new C50738vZn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", signalListItem);
            c50738vZn.setArguments(bundle);
            return c50738vZn;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fIwbmz();
        ejfBZ();
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.dhOYXF));
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    private final void ejfBZ() {
        SignalListItem signalListItem;
        SignalBotUpdatePresenter signalBotUpdatePresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (signalListItem = (SignalListItem) arguments.getParcelable("data")) == null) {
            signalListItem = new SignalListItem((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32767, (DefaultConstructorMarker) null);
        }
        signalBotUpdatePresenterOLrzqt.OLrzqt(signalListItem);
        SignalBotUpdatePresenter signalBotUpdatePresenterOLrzqt2 = OLrzqt();
        java.lang.String signalChanName = OLrzqt().AhwBna().getSignalChanName();
        if (signalChanName == null) {
            signalChanName = "";
        }
        signalBotUpdatePresenterOLrzqt2.AEQbTJ(signalChanName);
        SignalBotUpdatePresenter signalBotUpdatePresenterOLrzqt3 = OLrzqt();
        java.lang.String signalDescription = OLrzqt().AhwBna().getSignalDescription();
        signalBotUpdatePresenterOLrzqt3.copydefault(signalDescription != null ? signalDescription : "");
        OLrzqt().OLrzqt();
    }

    private final void fIwbmz() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50738vZn.AEQbTJ(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<java.util.List<SignalListItem>> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.vZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50738vZn.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50738vZn.KWHzl(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C50738vZn c50738vZn, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c50738vZn.KWHzl(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName()) : 30, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription()) : 500);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50738vZn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50738vZn c50738vZn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c50738vZn.KWHzl = true;
        c50738vZn.isConnected();
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
    public static final Unit KWHzl(C50738vZn c50738vZn, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c50738vZn.OLrzqt().gEmmrt().bB_())) {
            S s = pair.second;
            if (s instanceof BizApiException) {
                Intrinsics.copydefault(s, "");
                if (Intrinsics.EZpvd((java.lang.Object) ((BizApiException) s).getCode(), (java.lang.Object) C56120xwn.valueOf.values())) {
                    c50738vZn.values().copydefault.EZpvd().clearFocus();
                    c50738vZn.values().copydefault.EZpvd().setActivated(false);
                    c50738vZn.OLrzqt(false, C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDDUqPf));
                } else {
                    java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                    }
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c50738vZn.OLrzqt().AEQbTJ().bB_())) {
            c50738vZn.KWHzl(30, 500);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50738vZn, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        C52794wYp c52794wYpAEQbTJ = values().AEQbTJ.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault = values().AEQbTJ.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    private final void KWHzl(final int i, final int i2) {
        final OKEditText oKEditTextEZpvd = ((uWQ) values()).copydefault.EZpvd();
        final OKEditText oKEditTextCopydefault = ((uWQ) values()).copydefault.copydefault();
        AEQbTJ(oKEditTextEZpvd, i);
        AEQbTJ(oKEditTextCopydefault, i2);
        AEQbTJ(oKEditTextEZpvd);
        C33606mzd.AEQbTJ(oKEditTextEZpvd, new Function1() { // from class: o.vZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50738vZn.OLrzqt(this.AEQbTJ, oKEditTextEZpvd, i, (java.lang.CharSequence) obj);
            }
        });
        C33606mzd.AEQbTJ(oKEditTextCopydefault, new Function1() { // from class: o.vZu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50738vZn.KWHzl(this.copydefault, oKEditTextCopydefault, i2, (java.lang.CharSequence) obj);
            }
        });
        oKEditTextCopydefault.setHint(C33070mpX.AYXKKw(C55688xof.Application.onNavigationEvent));
        OLrzqt(((SignalBotUpdatePresenter) OLrzqt()).djBIcL(), ((SignalBotUpdatePresenter) OLrzqt()).copydefault());
    }

    public static final Unit OLrzqt(C50738vZn c50738vZn, OKEditText oKEditText, int i, java.lang.CharSequence charSequence) {
        android.text.Editable text = oKEditText.getText();
        c50738vZn.AEQbTJ(text != null ? text.length() : 0, i);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50738vZn c50738vZn, OKEditText oKEditText, int i, java.lang.CharSequence charSequence) {
        android.text.Editable text = oKEditText.getText();
        c50738vZn.copydefault(text != null ? text.length() : 0, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vZn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C50738vZn KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50738vZn c50738vZn) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c50738vZn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vZn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50738vZn KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50738vZn c50738vZn) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c50738vZn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.vZn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50738vZn KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50738vZn c50738vZn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c50738vZn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.KWHzl.copydefault()) {
                    android.text.Editable text = C50738vZn.KWHzl(this.KWHzl).copydefault.EZpvd().getText();
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null);
                    android.text.Editable text2 = C50738vZn.KWHzl(this.KWHzl).copydefault.copydefault().getText();
                    this.KWHzl.OLrzqt().EZpvd(strGEmmrt, C33129mqd.gEmmrt(text2 != null ? StringsKt__StringsKt.hDKMBd(text2) : null));
                    if (this.KWHzl.OLrzqt().valueOf()) {
                        this.KWHzl.isConnected();
                    } else {
                        this.KWHzl.OLrzqt().DbNXlk();
                    }
                }
            }
        }
    }

    public final void AEQbTJ(int i, int i2) {
        C52882wax c52882wax = values().copydefault;
        xMR xmr = xMR.copydefault;
        c52882wax.setNameNotifyText(xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))) + "/" + xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))));
    }

    public final void copydefault(int i, int i2) {
        C52882wax c52882wax = values().copydefault;
        xMR xmr = xMR.copydefault;
        c52882wax.setIntroNotifyText(xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))) + "/" + xmr.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))));
    }

    public final boolean copydefault() {
        OKEditText oKEditTextEZpvd = values().copydefault.EZpvd();
        android.text.Editable text = oKEditTextEZpvd.getText();
        if (C33129mqd.gEmmrt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null).length() != 0) {
            return true;
        }
        oKEditTextEZpvd.clearFocus();
        oKEditTextEZpvd.setActivated(false);
        OLrzqt(false, C33070mpX.AYXKKw(C55688xof.Application.zNQIcI));
        return false;
    }

    public static /* synthetic */ void updateNotify$default(C50738vZn c50738vZn, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c50738vZn.OLrzqt(z, str);
    }

    private final void OLrzqt(boolean z, java.lang.String str) {
        if (z) {
            values().copydefault.setNameNotifyVisible(true);
            C52882wax.setNameError$default(values().copydefault, false, null, 2, null);
        } else {
            values().copydefault.setNameNotifyVisible(false);
            values().copydefault.setNameError(true, str);
        }
    }

    private final void AEQbTJ(final android.widget.EditText editText, int i) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.vZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                return C50738vZn.AEQbTJ(textView, i2, keyEvent);
            }
        });
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.vZx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
                return C50738vZn.copydefault(editText, charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter.LengthFilter(i)});
    }

    public static final boolean AEQbTJ(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        return StringsKt__StringsKt.fARcdN(text) && keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public static final java.lang.CharSequence copydefault(android.widget.EditText editText, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
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

    private final void AEQbTJ(final android.widget.EditText editText) {
        final OKEditText oKEditTextEZpvd = values().copydefault.EZpvd();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.vZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C50738vZn.copydefault(editText, oKEditTextEZpvd, this, view, z);
            }
        });
    }

    public static final void copydefault(android.widget.EditText editText, OKEditText oKEditText, C50738vZn c50738vZn, android.view.View view, boolean z) {
        if (Intrinsics.EZpvd(editText, oKEditText) && z) {
            oKEditText.setActivated(true);
            updateNotify$default(c50738vZn, true, null, 2, null);
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        OKEditText oKEditTextEZpvd = values().copydefault.EZpvd();
        OKEditText oKEditTextCopydefault = values().copydefault.copydefault();
        oKEditTextEZpvd.setText(str);
        oKEditTextCopydefault.setText(str2);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function2<? super java.lang.Boolean, ? super SignalListItem, Unit> function2 = this.copydefault;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(this.KWHzl), OLrzqt().AhwBna());
        }
    }
}
