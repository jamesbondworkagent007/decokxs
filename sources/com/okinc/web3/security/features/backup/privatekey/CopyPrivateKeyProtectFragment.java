package com.okinc.web3.security.features.backup.privatekey;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.web3.security.databinding.FragmentCopyPrivateKeyProtectBinding;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.utils.WrapApi;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C43246rlf;
import o.C52794wYp;
import o.C55097xdX;
import o.C55296xhK;
import o.C56390yDp;
import o.C56423yEv;
import o.C57407yho;
import o.C57656ymY;
import o.pUU;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CopyPrivateKeyProtectFragment extends wXX {
    private FragmentCopyPrivateKeyProtectBinding mDataBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CopyPrivateKeyProtectFragment newInstance(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Bundle bundle = new Bundle();
            bundle.putString("privateKey", str);
            bundle.putString(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            bundle.putBoolean("isSafetyMode", z);
            CopyPrivateKeyProtectFragment copyPrivateKeyProtectFragment = new CopyPrivateKeyProtectFragment();
            copyPrivateKeyProtectFragment.setArguments(bundle);
            return copyPrivateKeyProtectFragment;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013b  */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        FragmentCopyPrivateKeyProtectBinding fragmentCopyPrivateKeyProtectBinding;
        String string;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        FragmentCopyPrivateKeyProtectBinding fragmentCopyPrivateKeyProtectBindingInflate = FragmentCopyPrivateKeyProtectBinding.inflate(LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.mDataBinding = fragmentCopyPrivateKeyProtectBindingInflate;
        FragmentCopyPrivateKeyProtectBinding fragmentCopyPrivateKeyProtectBinding2 = null;
        if (fragmentCopyPrivateKeyProtectBindingInflate == null) {
            Intrinsics.gEmmrt("");
            fragmentCopyPrivateKeyProtectBinding = null;
        } else {
            fragmentCopyPrivateKeyProtectBinding = fragmentCopyPrivateKeyProtectBindingInflate;
        }
        Bundle arguments = getArguments();
        String strDataUnwrap = (arguments == null || (string = arguments.getString("privateKey")) == null) ? null : WrapApi.dataUnwrap(C43246rlf.OLrzqt.valueOf(), string);
        final String str = strDataUnwrap == null ? "" : strDataUnwrap;
        if (str.length() < 6) {
            pUU.copydefault("CopyPrivateKeyProtectFragment", "decode private key failed, " + str.length());
            dismissAllowingStateLoss();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("isSafetyMode")) {
            fragmentCopyPrivateKeyProtectBinding.headerIcon.setImageDrawable(C33070mpX.KWHzl(C57407yho.ActionBar.djBIcL));
            final String strSubstring = str.substring(0, str.length() - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(str.length() - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput1.setText(String.valueOf(strSubstring2.charAt(0)));
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput2.setText(String.valueOf(strSubstring2.charAt(1)));
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput3.setText(String.valueOf(strSubstring2.charAt(2)));
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput4.setText(String.valueOf(strSubstring2.charAt(3)));
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput5.setText(String.valueOf(strSubstring2.charAt(4)));
            fragmentCopyPrivateKeyProtectBinding.tvCodeOutput6.setText(String.valueOf(strSubstring2.charAt(5)));
            fragmentCopyPrivateKeyProtectBinding.tipTitle.setText(C33070mpX.AYXKKw(C57407yho.Activity.ejfBZ));
            String strAYXKKw = C33070mpX.AYXKKw(C57407yho.Activity.values);
            TextView textView = fragmentCopyPrivateKeyProtectBinding.tip;
            Context context = getContext();
            if (context != null) {
                int i = C57407yho.Activity.fIwbmz;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) strAYXKKw);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, strAYXKKw.length(), 33);
                Unit unit = Unit.INSTANCE;
                SpannableString spannableStringValueOf = SpannableString.valueOf(new SpannedString(spannableStringBuilder));
                Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
                CharSequence charSequenceCopydefault = C33069mpW.copydefault(context, i, (Map<String, ? extends Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("add", spannableStringValueOf)));
                if (charSequenceCopydefault == null) {
                    charSequenceCopydefault = C33069mpW.copydefault(this, C57407yho.Activity.fIwbmz, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("add", strAYXKKw)));
                }
                textView.setText(charSequenceCopydefault);
                wYF wyf = fragmentCopyPrivateKeyProtectBinding.btnboxCopy;
                final C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C57407yho.Activity.copydefault));
                    final long j = 1000;
                    c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment$onCreateContent$lambda$14$lambda$7$lambda$5$$inlined$singleClick$default$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpCopydefault) > j || (c52794wYpCopydefault instanceof Checkable)) {
                                C55296xhK.OLrzqt(c52794wYpCopydefault, jCurrentTimeMillis);
                                if (c52794wYpCopydefault.getContext() != null) {
                                    Object systemService = c52794wYpCopydefault.getContext().getSystemService("clipboard");
                                    Intrinsics.copydefault(systemService);
                                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, strSubstring));
                                    this.dismissAllowingStateLoss();
                                    this.showNotification(C33070mpX.AYXKKw(C57407yho.Activity.fJNWhG));
                                    C32866mlf.onEvent$default(Web3SecurityTrackEvent.PRIVATEKEYPAGE_MID_SECURECOPY_CLICK, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                                }
                            }
                        }
                    });
                }
                C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setVisibility(8);
                }
                fragmentCopyPrivateKeyProtectBinding.llCode.setVisibility(0);
            }
        } else {
            fragmentCopyPrivateKeyProtectBinding.headerIcon.setImageDrawable(C33070mpX.KWHzl(C57407yho.ActionBar.AhwBna));
            fragmentCopyPrivateKeyProtectBinding.tipTitle.setText(C33070mpX.AYXKKw(C57407yho.Activity.AuCTel));
            fragmentCopyPrivateKeyProtectBinding.tip.setText(C33070mpX.AYXKKw(C57407yho.Activity.DbNXlk));
            wYF wyf2 = fragmentCopyPrivateKeyProtectBinding.btnboxCopy;
            wyf2.setType(7);
            final C52794wYp c52794wYpCopydefault2 = wyf2.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setText(C33070mpX.AYXKKw(C57407yho.Activity.EZpvd));
                final long j2 = 1000;
                c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment$onCreateContent$lambda$14$lambda$13$lambda$10$$inlined$singleClick$default$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpCopydefault2) > j2 || (c52794wYpCopydefault2 instanceof Checkable)) {
                            C55296xhK.OLrzqt(c52794wYpCopydefault2, jCurrentTimeMillis);
                            if (c52794wYpCopydefault2.getContext() != null) {
                                Object systemService = c52794wYpCopydefault2.getContext().getSystemService("clipboard");
                                Intrinsics.copydefault(systemService);
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
                                this.dismissAllowingStateLoss();
                                this.showNotification(C33070mpX.AYXKKw(C57407yho.Activity.fARcdN));
                                C32866mlf.onEvent$default(Web3SecurityTrackEvent.PRIVATEKEYPAGE_MID_COMPLETECOPY_CLICK, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                            }
                        }
                    }
                });
            }
            final C52794wYp c52794wYpAEQbTJ2 = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setText(C33070mpX.AYXKKw(C57407yho.Activity.OLrzqt));
                c52794wYpAEQbTJ2.setVisibility(0);
                c52794wYpAEQbTJ2.setOKDSType(260);
                final long j3 = 1000;
                c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment$onCreateContent$lambda$14$lambda$13$lambda$12$$inlined$singleClick$default$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpAEQbTJ2) > j3 || (c52794wYpAEQbTJ2 instanceof Checkable)) {
                            C55296xhK.OLrzqt(c52794wYpAEQbTJ2, jCurrentTimeMillis);
                            C32866mlf.onEvent$default(Web3SecurityTrackEvent.PRIVATEKEYPAGE_MID_COMPLETECOPYCANCEL_CLICK, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                            this.dismiss();
                        }
                    }
                });
            }
        }
        FragmentCopyPrivateKeyProtectBinding fragmentCopyPrivateKeyProtectBinding3 = this.mDataBinding;
        if (fragmentCopyPrivateKeyProtectBinding3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            fragmentCopyPrivateKeyProtectBinding2 = fragmentCopyPrivateKeyProtectBinding3;
        }
        constraintLayout.addView(fragmentCopyPrivateKeyProtectBinding2.getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setState(2);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }
}
