package com.okinc.auth.impl.passkey.ui.resetremove.selection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractActivityC6447aPX;
import o.ActivityC6373aOC;
import o.C33069mpW;
import o.C33070mpX;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.C5922aFc;
import o.C6430aPG;
import o.C6436aPM;
import o.C6443aPT;
import o.C6480aQD;
import o.C6521aQs;
import o.C8206ayP;
import o.C8212ayV;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ResetRemovePasskeySelectionActivity extends AbstractActivityC6447aPX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public String AYXKKw = "ResetRemovePasskeySelectionActivity";
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm djBIcL;
    public C8212ayV fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final ActivityResultLauncher<Intent> isConnected;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public ResetRemovePasskeySelectionActivity() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(BatchResetRemovePasskeyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ResetRemovePasskeySelectionActivity.OLrzqt(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.isConnected = activityResultLauncherRegisterForActivityResult;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.djBIcL(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.AhwBna(this.copydefault);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ResetRemovePasskeySelectionActivity.AYXKKw(this.EZpvd));
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ResetRemovePasskeySelectionActivity.valueOf(this.EZpvd));
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent OLrzqt(@NotNull Context context, PasskeyResetRemoveType passkeyResetRemoveType, @NotNull PasskeyScenario passkeyScenario, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyScenario, "");
            Intent intent = new Intent(context, (Class<?>) ResetRemovePasskeySelectionActivity.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_RESET_REMOVE_TYPE", passkeyResetRemoveType), C56390yDp.OLrzqt("ARG_PASSKEY_SCENARIO", passkeyScenario), C56390yDp.OLrzqt("ARG_SHOW_GUIDE_REMINDER", Boolean.valueOf(z)), C56390yDp.OLrzqt("ARG_FORCE_INCOMPATIBLE_FOR_PASSKEY_ERROR", Boolean.valueOf(z2))));
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BatchResetRemovePasskeyViewModel AYXKKw() {
        return (BatchResetRemovePasskeyViewModel) this.AkhnZx.getValue();
    }

    public static final void OLrzqt(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, ActivityResult activityResult) {
        PasskeyResetRemoveState passkeyResetRemoveState;
        FrameLayout frameLayout;
        Bundle extras;
        Intent data = activityResult.getData();
        if (data == null || (extras = data.getExtras()) == null || (passkeyResetRemoveState = (PasskeyResetRemoveState) extras.getParcelable("KEY_RESET_REMOVE_MFA_RESPONSE")) == null) {
            passkeyResetRemoveState = PasskeyResetRemoveState.Cancel.copydefault;
        }
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, resetRemovePasskeySelectionActivity.getTAG() + " reset remove mfa launcher: " + passkeyResetRemoveState, 2, null);
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.Cancel.copydefault)) {
            C8212ayV c8212ayV = resetRemovePasskeySelectionActivity.fetchVPNInfo;
            if (c8212ayV == null || (frameLayout = c8212ayV.copydefault) == null) {
                return;
            }
            frameLayout.setVisibility(0);
            return;
        }
        resetRemovePasskeySelectionActivity.KWHzl(passkeyResetRemoveState);
    }

    private final PasskeyResetRemoveType AhwBna() {
        return (PasskeyResetRemoveType) this.AhwBna.getValue();
    }

    public static final PasskeyResetRemoveType djBIcL(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity) {
        Parcelable parcelableExtra = resetRemovePasskeySelectionActivity.getIntent().getParcelableExtra("ARG_RESET_REMOVE_TYPE");
        PasskeyResetRemoveType passkeyResetRemoveType = parcelableExtra instanceof PasskeyResetRemoveType ? (PasskeyResetRemoveType) parcelableExtra : null;
        return passkeyResetRemoveType == null ? PasskeyResetRemoveType.BatchReset.EZpvd : passkeyResetRemoveType;
    }

    private final PasskeyScenario djBIcL() {
        return (PasskeyScenario) this.djBIcL.getValue();
    }

    public static final PasskeyScenario AhwBna(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity) {
        Parcelable parcelableExtra = resetRemovePasskeySelectionActivity.getIntent().getParcelableExtra("ARG_PASSKEY_SCENARIO");
        PasskeyScenario passkeyScenario = parcelableExtra instanceof PasskeyScenario ? (PasskeyScenario) parcelableExtra : null;
        return passkeyScenario == null ? PasskeyScenario.Account.AEQbTJ : passkeyScenario;
    }

    private final boolean gEmmrt() {
        return ((Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean AYXKKw(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity) {
        return resetRemovePasskeySelectionActivity.getIntent().getBooleanExtra("ARG_SHOW_GUIDE_REMINDER", false);
    }

    private final boolean valueOf() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean valueOf(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity) {
        return resetRemovePasskeySelectionActivity.getIntent().getBooleanExtra("ARG_FORCE_INCOMPATIBLE_FOR_PASSKEY_ERROR", false);
    }

    @Override // o.AbstractActivityC6447aPX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C8212ayV c8212ayVOLrzqt = C8212ayV.OLrzqt(getLayoutInflater());
        this.fetchVPNInfo = c8212ayVOLrzqt;
        setContentView(c8212ayVOLrzqt != null ? c8212ayVOLrzqt.getRoot() : null);
        AYXKKw().EZpvd().observe(this, new TaskDescription(new Function1() { // from class: o.aQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResetRemovePasskeySelectionActivity.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " argument reset remove type: " + AhwBna(), 2, null);
        PasskeyResetRemoveType passkeyResetRemoveTypeAhwBna = AhwBna();
        if (passkeyResetRemoveTypeAhwBna instanceof PasskeyResetRemoveType.Remove) {
            AEQbTJ((PasskeyResetRemoveType.Remove) passkeyResetRemoveTypeAhwBna);
        } else {
            AYXKKw().djBIcL();
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResetRemovePasskeySelectionActivity.OLrzqt(this.KWHzl, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit KWHzl(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, List list) {
        Intrinsics.copydefault(list);
        resetRemovePasskeySelectionActivity.AEQbTJ((List<AuthenticatorSelectModel>) list, resetRemovePasskeySelectionActivity.AhwBna());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        resetRemovePasskeySelectionActivity.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(PasskeyResetRemoveType.Remove remove) {
        String strKWHzl = C33069mpW.KWHzl(this, C8206ayP.Dialog.DLWbHP, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("passkeyName", remove.EZpvd())));
        SpannableString spannableString = new SpannableString(strKWHzl);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strKWHzl, remove.EZpvd(), 0, false, 6, (Object) null);
        int length = remove.EZpvd().length();
        spannableString.setSpan(new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), 0, strKWHzl.length(), 33);
        spannableString.setSpan(new StyleSpan(1), iIndexOf$default, length + iIndexOf$default, 33);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C8206ayP.StateListAnimator.hBpjJd;
        C6480aQD.StateListAnimator stateListAnimator = C6480aQD.Companion;
        String string = getString(C8206ayP.Dialog.QVsKAR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        fragmentTransactionBeginTransaction.replace(i, stateListAnimator.OLrzqt(string, spannableString, remove, gEmmrt(), valueOf())).commit();
    }

    public final void AEQbTJ(List<AuthenticatorSelectModel> list, PasskeyResetRemoveType passkeyResetRemoveType) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1(this, passkeyResetRemoveType, list, null));
    }

    public final void AEQbTJ(PasskeyResetRemoveType.Reset reset) {
        String strKWHzl = C33069mpW.KWHzl(this, C8206ayP.Dialog.OHqIaq, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("passkeyName", reset.OLrzqt())));
        SpannableString spannableString = new SpannableString(strKWHzl);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strKWHzl, reset.OLrzqt(), 0, false, 6, (Object) null);
        int length = reset.OLrzqt().length();
        spannableString.setSpan(new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), 0, strKWHzl.length(), 33);
        spannableString.setSpan(new StyleSpan(1), iIndexOf$default, length + iIndexOf$default, 33);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C8206ayP.StateListAnimator.hBpjJd;
        C6480aQD.StateListAnimator stateListAnimator = C6480aQD.Companion;
        String string = getString(C8206ayP.Dialog.QSLkRj);
        Intrinsics.checkNotNullExpressionValue(string, "");
        fragmentTransactionBeginTransaction.replace(i, stateListAnimator.OLrzqt(string, spannableString, reset, false, valueOf())).commit();
    }

    public final void copydefault(PasskeyResetRemoveType passkeyResetRemoveType) {
        C6521aQs c6521aQsAEQbTJ;
        if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.BatchReset) {
            C6521aQs.Activity activity = C6521aQs.Companion;
            String string = getString(C8206ayP.Dialog.QSLkRj);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(C8206ayP.Dialog.fFgQHt);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c6521aQsAEQbTJ = activity.AEQbTJ(string, string2, passkeyResetRemoveType);
        } else {
            C6521aQs.Activity activity2 = C6521aQs.Companion;
            String string3 = getString(C8206ayP.Dialog.OxVOHk);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = getString(C8206ayP.Dialog.QCjLjM);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            c6521aQsAEQbTJ = activity2.AEQbTJ(string3, string4, PasskeyResetRemoveType.BatchRemove.AEQbTJ);
        }
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, c6521aQsAEQbTJ).commit();
    }

    public final void copydefault(PasskeyResetRemoveType passkeyResetRemoveType, @NotNull List<String> list) {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(list, "");
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finishWithSelectedCredentialList: " + passkeyResetRemoveType + " list size: " + list.size(), 2, null);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((String) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        boolean z = passkeyResetRemoveType instanceof PasskeyResetRemoveType.Reset;
        ResetRemoveResponse batchRemove = null;
        PasskeyResetRemoveType.Reset reset = z ? (PasskeyResetRemoveType.Reset) passkeyResetRemoveType : null;
        String strAEQbTJ = reset != null ? reset.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = strAEQbTJ;
        }
        String str = (String) objM7377constructorimpl;
        try {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl((String) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        boolean z2 = passkeyResetRemoveType instanceof PasskeyResetRemoveType.Remove;
        PasskeyResetRemoveType.Remove remove = z2 ? (PasskeyResetRemoveType.Remove) passkeyResetRemoveType : null;
        String strOLrzqt = remove != null ? remove.OLrzqt() : null;
        String str2 = strOLrzqt != null ? strOLrzqt : "";
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = str2;
        }
        String str3 = (String) objM7377constructorimpl2;
        if (z) {
            batchRemove = new ResetRemoveResponse.SingleReset(str);
        } else if (z2) {
            batchRemove = new ResetRemoveResponse.SingleRemove(str3);
        } else if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.BatchReset) {
            batchRemove = new ResetRemoveResponse.BatchReset(list);
        } else if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.BatchRemove) {
            batchRemove = new ResetRemoveResponse.BatchRemove(list);
        }
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, getTAG() + " resetRemoveResponse: " + batchRemove, 2, null);
        if (batchRemove != null) {
            C8212ayV c8212ayV = this.fetchVPNInfo;
            if (c8212ayV != null && (frameLayout = c8212ayV.copydefault) != null) {
                frameLayout.setVisibility(z2 ? 0 : 8);
            }
            this.isConnected.launch(ActivityC6373aOC.Companion.copydefault(this, batchRemove, djBIcL(), valueOf()));
            return;
        }
        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, getTAG() + " finishWithSelectedCredentialList() has null resetRemoveResponse", 2, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C6430aPG.StateListAnimator stateListAnimator = C6430aPG.Companion;
        String string = getString(C8206ayP.Dialog.QHmsKR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(C8206ayP.Dialog.QkdxfA);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        final C6430aPG c6430aPGOLrzqt = stateListAnimator.OLrzqt(string, string2, str);
        c6430aPGOLrzqt.EZpvd(new Function0() { // from class: o.aQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.AEQbTJ(c6430aPGOLrzqt, function0);
            }
        });
        c6430aPGOLrzqt.copydefault(new Function0() { // from class: o.aQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.copydefault(c6430aPGOLrzqt);
            }
        });
        c6430aPGOLrzqt.show(getSupportFragmentManager(), ResetRemovePasskeySelectionActivity.class.getSimpleName());
    }

    public static final Unit AEQbTJ(C6430aPG c6430aPG, Function0 function0) {
        c6430aPG.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6430aPG c6430aPG) {
        c6430aPG.dismiss();
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        final C6443aPT c6443aPT = new C6443aPT();
        c6443aPT.OLrzqt(new Function0() { // from class: o.aQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.KWHzl(c6443aPT, function0);
            }
        });
        c6443aPT.copydefault(new Function0() { // from class: o.aQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.EZpvd(c6443aPT);
            }
        });
        c6443aPT.show(getSupportFragmentManager(), C6443aPT.class.getSimpleName());
    }

    public static final Unit KWHzl(C6443aPT c6443aPT, Function0 function0) {
        c6443aPT.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C6443aPT c6443aPT) {
        c6443aPT.dismiss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        final C6436aPM c6436aPM = new C6436aPM();
        c6436aPM.OLrzqt(new Function0() { // from class: o.aQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.copydefault(c6436aPM, function0);
            }
        });
        c6436aPM.KWHzl(new Function0() { // from class: o.aQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetRemovePasskeySelectionActivity.AEQbTJ(c6436aPM);
            }
        });
        c6436aPM.show(getSupportFragmentManager(), C6436aPM.class.getSimpleName());
    }

    public static final Unit copydefault(C6436aPM c6436aPM, Function0 function0) {
        c6436aPM.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6436aPM c6436aPM) {
        c6436aPM.dismiss();
        return Unit.INSTANCE;
    }

    private final void KWHzl(PasskeyResetRemoveState passkeyResetRemoveState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finish with: " + passkeyResetRemoveState, 2, null);
        setResult(-1, new Intent().putExtra("KEY_RESET_REMOVE_RESPONSE", passkeyResetRemoveState));
        finish();
    }

    public final void OLrzqt() {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finish with: cancel", 2, null);
        setResult(-1, new Intent().putExtra("KEY_RESET_REMOVE_RESPONSE", PasskeyResetRemoveState.Cancel.copydefault));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        this.fetchVPNInfo = null;
        overridePendingTransition(0, 0);
    }

    public static abstract class ResetRemoveResponse implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity.ResetRemoveResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ResetRemoveResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResetRemoveResponse() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class SingleReset extends ResetRemoveResponse {
            public static final Parcelable.Creator<SingleReset> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<SingleReset> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SingleReset createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new SingleReset(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SingleReset[] newArray(int i) {
                    return new SingleReset[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SingleReset copy$default(SingleReset singleReset, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = singleReset.EZpvd;
                }
                return singleReset.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SingleReset KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new SingleReset(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleReset) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((SingleReset) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SingleReset(credentialId=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleReset(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class SingleRemove extends ResetRemoveResponse {
            public static final Parcelable.Creator<SingleRemove> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<SingleRemove> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SingleRemove createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new SingleRemove(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SingleRemove[] newArray(int i) {
                    return new SingleRemove[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SingleRemove copy$default(SingleRemove singleRemove, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = singleRemove.EZpvd;
                }
                return singleRemove.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SingleRemove OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new SingleRemove(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleRemove) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((SingleRemove) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SingleRemove(credentialId=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleRemove(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class BatchReset extends ResetRemoveResponse {
            public static final Parcelable.Creator<BatchReset> CREATOR = new Creator();
            public final List<String> EZpvd;

            public static final class Creator implements Parcelable.Creator<BatchReset> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BatchReset createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new BatchReset(parcel.createStringArrayList());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BatchReset[] newArray(int i) {
                    return new BatchReset[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity$ResetRemoveResponse$BatchReset */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BatchReset copy$default(BatchReset batchReset, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = batchReset.EZpvd;
                }
                return batchReset.OLrzqt(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BatchReset OLrzqt(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new BatchReset(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> copydefault() {
                return this.EZpvd;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BatchReset) && Intrinsics.EZpvd(this.EZpvd, ((BatchReset) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BatchReset(modelList=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeStringList(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BatchReset(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class BatchRemove extends ResetRemoveResponse {
            public static final Parcelable.Creator<BatchRemove> CREATOR = new Creator();
            public final List<String> OLrzqt;

            public static final class Creator implements Parcelable.Creator<BatchRemove> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BatchRemove createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new BatchRemove(parcel.createStringArrayList());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BatchRemove[] newArray(int i) {
                    return new BatchRemove[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity$ResetRemoveResponse$BatchRemove */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BatchRemove copy$default(BatchRemove batchRemove, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = batchRemove.OLrzqt;
                }
                return batchRemove.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BatchRemove copydefault(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new BatchRemove(list);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BatchRemove) && Intrinsics.EZpvd(this.OLrzqt, ((BatchRemove) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BatchRemove(modelList=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeStringList(this.OLrzqt);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BatchRemove(@NotNull List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
            }
        }
    }

    @Override // o.AbstractActivityC6447aPX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6447aPX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6447aPX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6447aPX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
