package com.okinc.web3.security.features.backup.mnemonic;

import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.bridge.MnemonicValidateResult;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.databinding.FragmentBackupShowMnemonicBinding;
import com.okinc.web3.security.features.backup.mnemonic.BackupCheckMnemonicActivity;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.model.Mnemonic;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.view.MnemonicView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC32996moC;
import o.C32866mlf;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C57407yho;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BackupShowMnemonicFragment extends AbstractC32996moC {
    private boolean isSetFlagSecure;
    private FragmentBackupShowMnemonicBinding mDataBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int layoutId = C57407yho.StateListAnimator.AYXKKw;
    private boolean isMaskShow = true;
    private final BackupShowMnemonicFragment$broadcastReceiver$1 broadcastReceiver = new BroadcastReceiver() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment$broadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.EZpvd((Object) "android.intent.action.CLOSE_SYSTEM_DIALOGS", (Object) (intent != null ? intent.getAction() : null))) {
                this.this$0.showMaskStatus();
            }
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.layoutId;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BackupShowMnemonicFragment newInstance(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BackupShowMnemonicFragment backupShowMnemonicFragment = new BackupShowMnemonicFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mnemonic", str);
            bundle.putString(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            bundle.putBoolean("backedUp", z);
            bundle.putBoolean("startForResult", z2);
            backupShowMnemonicFragment.setArguments(bundle);
            return backupShowMnemonicFragment;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding = (FragmentBackupShowMnemonicBinding) viewDataBindingBind;
        this.mDataBinding = fragmentBackupShowMnemonicBinding;
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding2 = null;
        if (fragmentBackupShowMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupShowMnemonicBinding = null;
        }
        MnemonicView mnemonicView = fragmentBackupShowMnemonicBinding.mnemonicView;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("mnemonic") : null;
        if (string == null) {
            string = "";
        }
        MnemonicValidateResult mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib = Web3SecurityBridge.INSTANCE.validateMnemonic$OKWeb3Security_web3_security_lib(string);
        mnemonicView.setMnemonicList(new Mnemonic(string, mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib.getLanguage(), mnemonicValidateResultValidateMnemonic$OKWeb3Security_web3_security_lib.getValidate()).getWords());
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding3 = this.mDataBinding;
        if (fragmentBackupShowMnemonicBinding3 == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupShowMnemonicBinding3 = null;
        }
        final ImageView imageView = fragmentBackupShowMnemonicBinding3.ivMask;
        final long j = 1000;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment$initView$lambda$2$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(imageView) > j || (imageView instanceof Checkable)) {
                    C55296xhK.OLrzqt(imageView, jCurrentTimeMillis);
                    if (this.isMaskShow) {
                        this.hideMaskStatus();
                    }
                }
            }
        });
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding4 = this.mDataBinding;
        if (fragmentBackupShowMnemonicBinding4 == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupShowMnemonicBinding4 = null;
        }
        final C52794wYp c52794wYp = fragmentBackupShowMnemonicBinding4.obHide;
        Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.invokespecialgBtXYZ);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null));
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment$initView$lambda$4$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp) > j || (c52794wYp instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp, jCurrentTimeMillis);
                    this.showMaskStatus();
                }
            }
        });
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding5 = this.mDataBinding;
        if (fragmentBackupShowMnemonicBinding5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            fragmentBackupShowMnemonicBinding2 = fragmentBackupShowMnemonicBinding5;
        }
        final C52794wYp c52794wYp2 = fragmentBackupShowMnemonicBinding2.continueButton;
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment$initView$lambda$6$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp2) > j || (c52794wYp2 instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp2, jCurrentTimeMillis);
                    this.showMaskStatus();
                    try {
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.copydefault(fragmentActivityRequireActivity);
                        Bundle arguments2 = this.getArguments();
                        if (arguments2 != null && arguments2.getBoolean("backedUp")) {
                            fragmentActivityRequireActivity.finish();
                            return;
                        }
                        BackupCheckMnemonicActivity.Companion companion = BackupCheckMnemonicActivity.Companion;
                        Bundle arguments3 = this.getArguments();
                        String string2 = arguments3 != null ? arguments3.getString("mnemonic") : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        Bundle arguments4 = this.getArguments();
                        String string3 = arguments4 != null ? arguments4.getString(HintConstants.AUTOFILL_HINT_PASSWORD) : null;
                        if (string3 == null) {
                            string3 = "";
                        }
                        Bundle arguments5 = this.getArguments();
                        boolean z = arguments5 != null ? arguments5.getBoolean("startForResult") : false;
                        BackupMnemonicListener listener = ((BackupMnemonicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BackupMnemonicViewModel.class)).getListener();
                        if (listener == null) {
                            return;
                        }
                        companion.startActivity(fragmentActivityRequireActivity, string2, string3, z, listener);
                        C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedDisplay_Button_Click, (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: com.okinc.web3.security.features.backup.mnemonic.BackupShowMnemonicFragment$initView$4$1$1
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
                                eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "next_step", true));
                            }
                        }, 1, (Object) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        try {
            Context context = getContext();
            if (context == null) {
                return;
            }
            ContextCompat.registerReceiver(context, this.broadcastReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final List<String> parseMnemonic(String str, String str2) {
        return yDY.AhwBna();
    }

    public final void showMaskStatus() {
        this.isMaskShow = true;
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding = this.mDataBinding;
        if (fragmentBackupShowMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupShowMnemonicBinding = null;
        }
        fragmentBackupShowMnemonicBinding.ivMask.setAlpha(1.0f);
        fragmentBackupShowMnemonicBinding.llMaskContentText.setAlpha(1.0f);
        C52794wYp c52794wYp = fragmentBackupShowMnemonicBinding.obHide;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
        if (this.isSetFlagSecure) {
            this.isSetFlagSecure = false;
            requireActivity().getWindow().clearFlags(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideMaskStatus() {
        this.isMaskShow = false;
        requireActivity().getWindow().setFlags(8192, 8192);
        this.isSetFlagSecure = true;
        FragmentBackupShowMnemonicBinding fragmentBackupShowMnemonicBinding = this.mDataBinding;
        if (fragmentBackupShowMnemonicBinding == null) {
            Intrinsics.gEmmrt("");
            fragmentBackupShowMnemonicBinding = null;
        }
        ObjectAnimator.ofFloat(fragmentBackupShowMnemonicBinding.ivMask, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(fragmentBackupShowMnemonicBinding.llMaskContentText, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        C52794wYp c52794wYp = fragmentBackupShowMnemonicBinding.obHide;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        showMaskStatus();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        showMaskStatus();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        showMaskStatus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            context.unregisterReceiver(this.broadcastReceiver);
        }
        showMaskStatus();
    }
}
