package com.okinc.web3.security.features.importing.bottomsheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.okinc.web3.security.databinding.FragmentImportTonWalletTipsBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C57407yho;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ImportTonWalletTipsBottomSheet extends wXX {
    private Function0<Unit> onPrimaryButtonClick;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.bottomsheet.ImportTonWalletTipsBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImportTonWalletTipsBottomSheet newInstance() {
            return new ImportTonWalletTipsBottomSheet();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        FragmentImportTonWalletTipsBinding.inflate(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(1);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C57407yho.Activity.AhwBna));
        final C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            final long j = 1000;
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.bottomsheet.ImportTonWalletTipsBottomSheet$onFooterCreated$lambda$1$$inlined$singleClick$default$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(c52794wYpCopydefault) > j || (c52794wYpCopydefault instanceof Checkable)) {
                        C55296xhK.OLrzqt(c52794wYpCopydefault, jCurrentTimeMillis);
                        Function0 function0 = this.onPrimaryButtonClick;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.dismissAllowingStateLoss();
                    }
                }
            });
        }
        float fDp$default = C55298xhM.dp$default(44, (Context) null, 1, (Object) null);
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) fDp$default;
        wyf.setLayoutParams(marginLayoutParams);
    }

    public final void show(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onPrimaryButtonClick = function0;
        show(fragmentManager, str);
    }
}
