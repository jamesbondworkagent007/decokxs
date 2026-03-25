package com.okinc.web3.security.features.importing.bottomsheet;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.web3.security.databinding.FragmentSecurityGuideBinding;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C33070mpX;
import o.C52794wYp;
import o.C55296xhK;
import o.C57407yho;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ImportSecurityTipsBottomSheet extends wXX {
    private static boolean hasShown;
    private FragmentSecurityGuideBinding mBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.bottomsheet.ImportSecurityTipsBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getHasShown() {
            return ImportSecurityTipsBottomSheet.hasShown;
        }

        public final ImportSecurityTipsBottomSheet newInstance() {
            return new ImportSecurityTipsBottomSheet();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        FragmentSecurityGuideBinding fragmentSecurityGuideBindingInflate = FragmentSecurityGuideBinding.inflate(LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.mBinding = fragmentSecurityGuideBindingInflate;
        constraintLayout.addView(fragmentSecurityGuideBindingInflate != null ? fragmentSecurityGuideBindingInflate.getRoot() : null);
        hasShown = true;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C57407yho.Activity.AEQbTJ));
        final C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            final long j = 1000;
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.bottomsheet.ImportSecurityTipsBottomSheet$onFooterCreated$$inlined$singleClick$default$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpCopydefault) > j || (c52794wYpCopydefault instanceof Checkable)) {
                        C55296xhK.OLrzqt(c52794wYpCopydefault, jCurrentTimeMillis);
                        this.dismissAllowingStateLoss();
                    }
                }
            });
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3WalletImportWallet_Sheet_Button_Click, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }
}
