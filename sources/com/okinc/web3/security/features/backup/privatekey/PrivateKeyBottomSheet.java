package com.okinc.web3.security.features.backup.privatekey;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.web3.security.databinding.DialogPrivateKeyBinding;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.utils.WrapApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C43246rlf;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C57407yho;
import o.C57659ymb;
import o.wXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PrivateKeyBottomSheet extends wXX {
    private static final String KEY_ADDRESS = "address";
    private static final String KEY_CHAIN_ICON = "chain_icon";
    private static final String KEY_CHAIN_NAME = "chain_name";
    private static final String KEY_PRIVATE_KEY = "private_key";
    private DialogPrivateKeyBinding mBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PrivateKeyBottomSheet newInstance(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            PrivateKeyBottomSheet privateKeyBottomSheet = new PrivateKeyBottomSheet();
            privateKeyBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PrivateKeyBottomSheet.KEY_CHAIN_ICON, str), C56390yDp.OLrzqt(PrivateKeyBottomSheet.KEY_CHAIN_NAME, str2), C56390yDp.OLrzqt("private_key", str3), C56390yDp.OLrzqt("address", str4)));
            return privateKeyBottomSheet;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        DialogPrivateKeyBinding dialogPrivateKeyBinding = (DialogPrivateKeyBinding) DataBindingUtil.inflate(layoutInflater, C57407yho.StateListAnimator.EZpvd, viewGroup, false);
        this.mBinding = dialogPrivateKeyBinding;
        if (dialogPrivateKeyBinding != null) {
            return dialogPrivateKeyBinding.getRoot();
        }
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        DialogPrivateKeyBinding dialogPrivateKeyBinding;
        TextView textView;
        final C52794wYp c52794wYp;
        final C52794wYp c52794wYp2;
        final AppCompatImageView appCompatImageView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        ImageView imageView;
        String string;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString(KEY_CHAIN_ICON) : null;
        Bundle arguments2 = getArguments();
        String string3 = arguments2 != null ? arguments2.getString(KEY_CHAIN_NAME) : null;
        Bundle arguments3 = getArguments();
        final String strDataUnwrap = (arguments3 == null || (string = arguments3.getString("private_key")) == null) ? null : WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), string);
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("address") : null;
        DialogPrivateKeyBinding dialogPrivateKeyBinding2 = this.mBinding;
        if (dialogPrivateKeyBinding2 != null && (imageView = dialogPrivateKeyBinding2.logo) != null) {
            C57659ymb.loadFixSizeBorderImage$default(imageView, string2, C52761wXj.TaskDescription.aHXSQp, 0.5f, 0.0f, 8, null);
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding3 = this.mBinding;
        if (dialogPrivateKeyBinding3 != null && (textView5 = dialogPrivateKeyBinding3.tvName) != null) {
            textView5.setText(string3 != null ? string3 : "");
        }
        if ((string4 == null || string4.length() == 0) && (dialogPrivateKeyBinding = this.mBinding) != null && (textView = dialogPrivateKeyBinding.tvAddress) != null) {
            textView.setVisibility(8);
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding4 = this.mBinding;
        if (dialogPrivateKeyBinding4 != null && (textView4 = dialogPrivateKeyBinding4.tvAddress) != null) {
            textView4.setVisibility(C33129mqd.OLrzqt((CharSequence) string4) ? 0 : 8);
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding5 = this.mBinding;
        if (dialogPrivateKeyBinding5 != null && (textView3 = dialogPrivateKeyBinding5.tvAddress) != null) {
            textView3.setText(string4);
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding6 = this.mBinding;
        if (dialogPrivateKeyBinding6 != null && (textView2 = dialogPrivateKeyBinding6.tvPrivateKey) != null) {
            textView2.setText(strDataUnwrap);
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding7 = this.mBinding;
        final long j = 1000;
        if (dialogPrivateKeyBinding7 != null && (appCompatImageView = dialogPrivateKeyBinding7.ivClose) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet$onViewCreated$$inlined$singleClick$default$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(appCompatImageView) > j || (appCompatImageView instanceof Checkable)) {
                        C55296xhK.OLrzqt(appCompatImageView, jCurrentTimeMillis);
                        this.dismissAllowingStateLoss();
                    }
                }
            });
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding8 = this.mBinding;
        if (dialogPrivateKeyBinding8 != null && (c52794wYp2 = dialogPrivateKeyBinding8.btnCopy) != null) {
            final long j2 = 1000;
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet$onViewCreated$$inlined$singleClick$default$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp2) > j2 || (c52794wYp2 instanceof Checkable)) {
                        C55296xhK.OLrzqt(c52794wYp2, jCurrentTimeMillis);
                        C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3WalletManagement_Sheet_PrivateKey_Click, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                        Context context = this.getContext();
                        Object systemService = context != null ? context.getSystemService("clipboard") : null;
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, strDataUnwrap));
                        }
                        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C57407yho.Activity.zLjUOn), 0, 1, (Object) null);
                        this.dismissAllowingStateLoss();
                    }
                }
            });
        }
        DialogPrivateKeyBinding dialogPrivateKeyBinding9 = this.mBinding;
        if (dialogPrivateKeyBinding9 == null || (c52794wYp = dialogPrivateKeyBinding9.btnNotCopy) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet$onViewCreated$$inlined$singleClick$default$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYp) > j || (c52794wYp instanceof Checkable)) {
                    C55296xhK.OLrzqt(c52794wYp, jCurrentTimeMillis);
                    this.dismissAllowingStateLoss();
                }
            }
        });
    }
}
