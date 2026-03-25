package com.okinc.okex.uploadlog.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import com.okinc.okex.uploadlog.view.UploadLogResultFragment;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC47423tpk;
import o.C33070mpX;
import o.C47315tni;
import o.C52794wYp;
import o.C55178xez;
import o.C55296xhK;
import o.C56390yDp;
import o.InterfaceC47278tmy;
import o.rVN;
import o.sCB;
import o.wYF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class UploadLogResultFragment extends sCB {
    public final int AhwBna = C47315tni.ActionBar.dxcTrN;

    @yCM
    public InterfaceC47278tmy userManager;
    public AbstractC47423tpk valueOf;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public final InterfaceC47278tmy AYXKKw() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.view.UploadLogResultFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final UploadLogResultFragment EZpvd(boolean z) {
            UploadLogResultFragment uploadLogResultFragment = new UploadLogResultFragment();
            uploadLogResultFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SHOW_SUCCESS", Boolean.valueOf(z))));
            return uploadLogResultFragment;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47423tpk abstractC47423tpkAEQbTJ = AbstractC47423tpk.AEQbTJ(layoutInflater, viewGroup, false);
        this.valueOf = abstractC47423tpkAEQbTJ;
        if (abstractC47423tpkAEQbTJ != null) {
            return abstractC47423tpkAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        C55178xez c55178xez;
        String strAYXKKw;
        String strAYXKKw2;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47423tpk abstractC47423tpk = this.valueOf;
        if (abstractC47423tpk != null && (c55178xez = abstractC47423tpk.copydefault) != null) {
            if (requireArguments().getBoolean("KEY_SHOW_SUCCESS")) {
                c55178xez.setStatus(4);
                c55178xez.setTitleText(C33070mpX.AYXKKw(C47315tni.PendingIntent.DLWbHP));
                if (AYXKKw().values()) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C47315tni.PendingIntent.gwTjWJ);
                } else {
                    strAYXKKw2 = C33070mpX.AYXKKw(C47315tni.PendingIntent.RdAHlO);
                }
                c55178xez.setSubTitleText(strAYXKKw2);
            } else {
                c55178xez.setStatus(3);
                c55178xez.setTitleText(C33070mpX.AYXKKw(C47315tni.PendingIntent.OHqIaq));
                if (AYXKKw().values()) {
                    strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.hBpjJd);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.ODXsMY);
                }
                c55178xez.setSubTitleText(strAYXKKw);
            }
            c55178xez.AEQbTJ().setVisibility(8);
            wYF wyfOLrzqt = c55178xez.OLrzqt();
            wyfOLrzqt.setPrimaryText(C33070mpX.AYXKKw(C47315tni.PendingIntent.OBJEWx));
            C52794wYp c52794wYpCopydefault = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
        }
        view.post(new Runnable() { // from class: o.sCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                UploadLogResultFragment.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(UploadLogResultFragment uploadLogResultFragment) {
        rVN.reportFullyDrawn$default((Fragment) uploadLogResultFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentKt.setFragmentResult(this, "KEY_FRAGMENT_ACTIONS", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESULT_SHOWN", Boolean.TRUE)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    /* JADX DEBUG: Possible override for method o.sCB.EZpvd()V */
    public final Unit EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ UploadLogResultFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, UploadLogResultFragment uploadLogResultFragment) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = uploadLogResultFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd();
            }
        }
    }
}
