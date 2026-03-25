package o;

import android.view.View;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.BatchResetRemovePasskeyViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$initView$1$3$3;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$trackButton$1;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$trackPageView$1;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aQD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6480aQD extends AbstractC6477aQA {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public C8247azD AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public java.lang.String AYXKKw = "SingleResetRemovePasskeyFragment";
    public final int isConnected = C8206ayP.Application.QOLQEE;
    public final java.lang.String AkhnZx = "images/account/common/passkey/passkey_remove.webp";
    public final java.lang.String values = "images/account/common/passkey/passkey_reset.webp";
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aQB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6480aQD.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aQE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C6480aQD.AYXKKw(this.EZpvd));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public C6480aQD() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BatchResetRemovePasskeyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BatchResetRemovePasskeyViewModel djBIcL() {
        return (BatchResetRemovePasskeyViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: renamed from: o.aQD$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aQD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C6480aQD OLrzqt(@NotNull java.lang.String str, @NotNull android.text.SpannableString spannableString, @NotNull PasskeyResetRemoveType passkeyResetRemoveType, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
            C6480aQD c6480aQD = new C6480aQD();
            c6480aQD.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_TITLE", str), C56390yDp.OLrzqt("ARG_DESC", spannableString), C56390yDp.OLrzqt("ARG_RESET_REMOVE_TYPE", passkeyResetRemoveType), C56390yDp.OLrzqt("ARG_SHOW_GUIDE_REMINDER", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("ARG_FORCE_INCOMPATIBLE_FOR_PASSKEY_ERROR", java.lang.Boolean.valueOf(z2))));
            return c6480aQD;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PasskeyResetRemoveType AYXKKw() {
        return (PasskeyResetRemoveType) this.gEmmrt.getValue();
    }

    public static final PasskeyResetRemoveType AhwBna(C6480aQD c6480aQD) {
        android.os.Bundle arguments = c6480aQD.getArguments();
        PasskeyResetRemoveType passkeyResetRemoveType = arguments != null ? (PasskeyResetRemoveType) arguments.getParcelable("ARG_RESET_REMOVE_TYPE") : null;
        PasskeyResetRemoveType passkeyResetRemoveType2 = passkeyResetRemoveType instanceof PasskeyResetRemoveType ? passkeyResetRemoveType : null;
        return passkeyResetRemoveType2 == null ? new PasskeyResetRemoveType.Reset(null, null, false, 7, null) : passkeyResetRemoveType2;
    }

    /* JADX DEBUG: Possible override for method o.aQA.AEQbTJ()V */
    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean AYXKKw(C6480aQD c6480aQD) {
        android.os.Bundle arguments = c6480aQD.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_SHOW_GUIDE_REMINDER");
        }
        return false;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C8247azD c8247azDOLrzqt = C8247azD.OLrzqt(layoutInflater, viewGroup, false);
        this.AhwBna = c8247azDOLrzqt;
        if (c8247azDOLrzqt != null) {
            return c8247azDOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C8247azD c8247azD = this.AhwBna;
        if (c8247azD != null) {
            SimpleToolBar simpleToolBar = c8247azD.KWHzl;
            simpleToolBar.setNavigationIconVisible(false);
            simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aQC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6480aQD.valueOf(this.AEQbTJ);
                }
            });
            android.widget.TextView textView = c8247azD.fetchVPNInfo;
            android.os.Bundle arguments = getArguments();
            java.lang.String string = arguments != null ? arguments.getString("ARG_TITLE") : null;
            if (string == null) {
                string = "";
            }
            textView.setText(string);
            android.os.Bundle arguments2 = getArguments();
            java.lang.CharSequence charSequence = arguments2 != null ? arguments2.getCharSequence("ARG_DESC") : null;
            android.text.SpannableString spannableString = charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : null;
            if (spannableString != null) {
                c8247azD.AYXKKw.setText(spannableString, TextView.BufferType.SPANNABLE);
            }
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(c8247azD.valueOf.getContext());
            java.lang.String str = this.AkhnZx;
            android.content.Context context = c8247azD.valueOf.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            componentCallbacks2C5333NrAEQbTJ.EZpvd(C43454rpb.copydefault(str, context, true)).EZpvd(c8247azD.valueOf);
            android.widget.ImageView imageView = c8247azD.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(AYXKKw() instanceof PasskeyResetRemoveType.Remove ? 0 : 8);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(c8247azD.djBIcL.getContext());
            java.lang.String str2 = this.values;
            android.content.Context context2 = c8247azD.djBIcL.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            componentCallbacks2C5333NrAEQbTJ2.EZpvd(C43454rpb.copydefault(str2, context2, true)).EZpvd(c8247azD.djBIcL);
            android.widget.ImageView imageView2 = c8247azD.djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(AYXKKw() instanceof PasskeyResetRemoveType.Reset ? 0 : 8);
            PasskeyResetRemoveType passkeyResetRemoveTypeAYXKKw = AYXKKw();
            if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Reset) {
                c8247azD.EZpvd.setOKDSType(257);
            } else if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Remove) {
                c8247azD.EZpvd.setOKDSType(263);
            }
            c8247azD.EZpvd.setText(valueOf());
            C52794wYp c52794wYp = c8247azD.EZpvd;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = c8247azD.AEQbTJ;
            c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
            OKReminder oKReminder = c8247azD.gEmmrt;
            Intrinsics.copydefault(oKReminder);
            oKReminder.setVisibility(AEQbTJ() ? 0 : 8);
            oKReminder.setStyle(2);
            oKReminder.setMessage(C33070mpX.AYXKKw(C8206ayP.Dialog.OJuSTm));
            oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C8206ayP.Dialog.UlJrfe), new Function0() { // from class: o.aQz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6480aQD.djBIcL(this.copydefault);
                }
            });
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setLeadingIconVisibility(true);
        }
    }

    public static final Unit valueOf(C6480aQD c6480aQD) {
        FragmentActivity activity = c6480aQD.getActivity();
        ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = activity instanceof ResetRemovePasskeySelectionActivity ? (ResetRemovePasskeySelectionActivity) activity : null;
        if (resetRemovePasskeySelectionActivity != null) {
            resetRemovePasskeySelectionActivity.OLrzqt();
        }
        c6480aQD.KWHzl(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aQD$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ ResetRemovePasskeySelectionActivity KWHzl;
        public final /* synthetic */ PasskeyResetRemoveType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, PasskeyResetRemoveType passkeyResetRemoveType) {
            this.KWHzl = resetRemovePasskeySelectionActivity;
            this.OLrzqt = passkeyResetRemoveType;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = this.KWHzl;
            PasskeyResetRemoveType passkeyResetRemoveType = this.OLrzqt;
            resetRemovePasskeySelectionActivity.copydefault(passkeyResetRemoveType, C56402yEa.EZpvd(((PasskeyResetRemoveType.Reset) passkeyResetRemoveType).AEQbTJ()));
        }
    }

    /* JADX INFO: renamed from: o.aQD$Activity */
    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ PasskeyResetRemoveType AEQbTJ;
        public final /* synthetic */ ResetRemovePasskeySelectionActivity OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, PasskeyResetRemoveType passkeyResetRemoveType) {
            this.OLrzqt = resetRemovePasskeySelectionActivity;
            this.AEQbTJ = passkeyResetRemoveType;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = this.OLrzqt;
            PasskeyResetRemoveType passkeyResetRemoveType = this.AEQbTJ;
            resetRemovePasskeySelectionActivity.copydefault(passkeyResetRemoveType, C56402yEa.EZpvd(((PasskeyResetRemoveType.Reset) passkeyResetRemoveType).AEQbTJ()));
        }
    }

    /* JADX INFO: renamed from: o.aQD$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C6480aQD AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6480aQD c6480aQD) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c6480aQD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = activity instanceof ResetRemovePasskeySelectionActivity ? (ResetRemovePasskeySelectionActivity) activity : null;
                if (resetRemovePasskeySelectionActivity == null) {
                    return;
                }
                PasskeyResetRemoveType passkeyResetRemoveTypeAYXKKw = this.AEQbTJ.AYXKKw();
                if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Reset) {
                    if (((PasskeyResetRemoveType.Reset) passkeyResetRemoveTypeAYXKKw).copydefault()) {
                        resetRemovePasskeySelectionActivity.KWHzl(new ActionBar(resetRemovePasskeySelectionActivity, passkeyResetRemoveTypeAYXKKw));
                    } else {
                        resetRemovePasskeySelectionActivity.AEQbTJ("", new Activity(resetRemovePasskeySelectionActivity, passkeyResetRemoveTypeAYXKKw));
                    }
                } else if (passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Remove) {
                    LifecycleOwner viewLifecycleOwner = this.AEQbTJ.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SingleResetRemovePasskeyFragment$initView$1$3$3(this.AEQbTJ, passkeyResetRemoveTypeAYXKKw, resetRemovePasskeySelectionActivity, null));
                } else {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, this.AEQbTJ.getTAG() + " reset remove type: " + passkeyResetRemoveTypeAYXKKw, 2, null);
                }
                this.AEQbTJ.KWHzl(Web3SecurityTrackEvent.VALUE_CONFIRM);
            }
        }
    }

    /* JADX INFO: renamed from: o.aQD$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6480aQD OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C6480aQD c6480aQD) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c6480aQD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = activity instanceof ResetRemovePasskeySelectionActivity ? (ResetRemovePasskeySelectionActivity) activity : null;
                if (resetRemovePasskeySelectionActivity != null) {
                    resetRemovePasskeySelectionActivity.OLrzqt();
                }
                this.OLrzqt.KWHzl(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
            }
        }
    }

    public static final Unit djBIcL(C6480aQD c6480aQD) {
        FragmentActivity activity = c6480aQD.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        C5724aBq.EZpvd.copydefault(activity);
        return Unit.INSTANCE;
    }

    private final java.lang.String valueOf() {
        PasskeyResetRemoveType passkeyResetRemoveTypeAYXKKw = AYXKKw();
        return passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Remove ? C33070mpX.AYXKKw(C8206ayP.Dialog.getFieldNames) : passkeyResetRemoveTypeAYXKKw instanceof PasskeyResetRemoveType.Reset ? C33070mpX.AYXKKw(C8206ayP.Dialog.fkESqH) : C33070mpX.AYXKKw(C8206ayP.Dialog.fkESqH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SingleResetRemovePasskeyFragment$trackButton$1(this, str, null));
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SingleResetRemovePasskeyFragment$trackPageView$1(this, null));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna = null;
    }
}
