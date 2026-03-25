package com.okinc.web3.security.features.backup.mnemonic;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.bridge.MnemonicValidateResult;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.databinding.FragmentBackupCheckMnemonicBinding;
import com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.model.Mnemonic;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.view.MnemonicCheckView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.C32866mlf;
import o.C52794wYp;
import o.C55296xhK;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C57407yho;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BackupCheckMnemonicFragment extends AbstractC32996moC {
    private final int layoutId = C57407yho.StateListAnimator.djBIcL;
    private FragmentBackupCheckMnemonicBinding mDataBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.layoutId;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BackupCheckMnemonicFragment newInstance(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BackupCheckMnemonicFragment backupCheckMnemonicFragment = new BackupCheckMnemonicFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mnemonic", str);
            bundle.putString(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            bundle.putBoolean("startForResult", z);
            backupCheckMnemonicFragment.setArguments(bundle);
            return backupCheckMnemonicFragment;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.mDataBinding = (FragmentBackupCheckMnemonicBinding) viewDataBindingBind;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("mnemonic") : null;
        if (string == null) {
            string = "";
        }
        MnemonicValidateResult mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib = Web3SecurityBridge.INSTANCE.validateMnemonic$OKWeb3Security_web3_security_lib(string);
        final Mnemonic mnemonic = new Mnemonic(string, mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib.getLanguage(), mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib.getValidate());
        FragmentBackupCheckMnemonicBinding fragmentBackupCheckMnemonicBinding = this.mDataBinding;
        if (fragmentBackupCheckMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupCheckMnemonicBinding = null;
        }
        MnemonicCheckView mnemonicCheckView = fragmentBackupCheckMnemonicBinding.mnemonicCheckView;
        mnemonicCheckView.setMnemonicList(mnemonic);
        mnemonicCheckView.setOnFinish(new Function1() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCheckMnemonicFragment.initView$lambda$1$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        FragmentBackupCheckMnemonicBinding fragmentBackupCheckMnemonicBinding2 = this.mDataBinding;
        if (fragmentBackupCheckMnemonicBinding2 == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupCheckMnemonicBinding2 = null;
        }
        final C52794wYp c52794wYp = fragmentBackupCheckMnemonicBinding2.complete;
        final long j = 1000;
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$initView$lambda$3$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp) > j || (c52794wYp instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp, jCurrentTimeMillis);
                    FragmentBackupCheckMnemonicBinding fragmentBackupCheckMnemonicBinding3 = this.mDataBinding;
                    if (fragmentBackupCheckMnemonicBinding3 == null) {
                        Intrinsics.gEmmrt("");
                        fragmentBackupCheckMnemonicBinding3 = null;
                    }
                    if (fragmentBackupCheckMnemonicBinding3.mnemonicCheckView.checkSuccess()) {
                        C55326xho.toastWithSuccessfulIcon$default(C57407yho.Activity.zsXlph, 0, 1, (Object) null);
                        Bundle arguments2 = this.getArguments();
                        if (arguments2 != null && arguments2.getBoolean("startForResult")) {
                            this.requireActivity().setResult(-1);
                            this.requireActivity().finish();
                        }
                        this.showLoading();
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                        BackupMnemonicListener listener = ((BackupMnemonicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BackupMnemonicViewModel.class)).getListener();
                        if (listener != null) {
                            FragmentActivity fragmentActivityRequireActivity2 = this.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                            final BackupCheckMnemonicFragment backupCheckMnemonicFragment = this;
                            listener.onCheckMnemonicPassed(fragmentActivityRequireActivity2, new Function0<Unit>() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$initView$2$1$1
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    backupCheckMnemonicFragment.dismissLoading();
                                }
                            });
                        }
                    } else {
                        c52794wYp.setEnabled(false);
                        FragmentBackupCheckMnemonicBinding fragmentBackupCheckMnemonicBinding4 = this.mDataBinding;
                        if (fragmentBackupCheckMnemonicBinding4 == null) {
                            Intrinsics.gEmmrt("");
                            fragmentBackupCheckMnemonicBinding4 = null;
                        }
                        fragmentBackupCheckMnemonicBinding4.mnemonicCheckView.clear(mnemonic, false);
                        C55326xho.toastWithFailedIcon$default(C57407yho.Activity.djBIcL, 0, 1, (Object) null);
                    }
                    C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedConfirm_Button_Click, (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$initView$2$1$2
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                            invoke2(eventParamsList);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EventParamsList eventParamsList) {
                            Intrinsics.checkNotNullParameter(eventParamsList, "");
                            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, false));
                        }
                    }, 1, (Object) null);
                }
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnonymousClass3(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$lambda$0(BackupCheckMnemonicFragment backupCheckMnemonicFragment, boolean z) {
        FragmentBackupCheckMnemonicBinding fragmentBackupCheckMnemonicBinding = backupCheckMnemonicFragment.mDataBinding;
        if (fragmentBackupCheckMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupCheckMnemonicBinding = null;
        }
        fragmentBackupCheckMnemonicBinding.complete.setEnabled(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$initView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedConfirm_Page_View, (TrackChannel[]) null, new Function1() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicFragment$initView$3$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BackupCheckMnemonicFragment.AnonymousClass3.invokeSuspend$lambda$0((EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(EventParamsList eventParamsList) {
            eventParamsList.add(new EventParam("already_have_wallet", "yes", true));
            return Unit.INSTANCE;
        }
    }
}
