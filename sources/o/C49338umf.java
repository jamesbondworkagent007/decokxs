package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ShareConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49338umf extends AbstractC32996moC implements InterfaceC48899ueQ {
    public android.widget.ImageView AEQbTJ;
    public android.view.ViewGroup AYXKKw;
    public final int EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.umn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49338umf.KWHzl(this.AEQbTJ);
        }
    });
    public android.widget.ImageView OLrzqt;
    public android.widget.ImageView copydefault;
    public android.widget.TextView gEmmrt;

    /* JADX INFO: renamed from: o.umf$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    private final C48934uez OLrzqt() {
        return (C48934uez) this.KWHzl.getValue();
    }

    public static final C48934uez KWHzl(C49338umf c49338umf) {
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(c49338umf);
        Intrinsics.copydefault(interfaceC48892ueJCopydefault);
        return (C48934uez) new ViewModelProvider(interfaceC48892ueJCopydefault.EZpvd()).get(C48934uez.class);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View viewInflate = layoutInflater.inflate(C48931uew.Application.AkhnZx, viewGroup, false);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C48931uew.StateListAnimator.QbewEr);
        this.AYXKKw = (android.view.ViewGroup) viewInflate.findViewById(C48931uew.StateListAnimator.QKudOq);
        this.copydefault = (android.widget.ImageView) viewInflate.findViewById(C48931uew.StateListAnimator.QUSxYX);
        this.gEmmrt = (android.widget.TextView) viewInflate.findViewById(C48931uew.StateListAnimator.RdAHlO);
        this.AEQbTJ = (android.widget.ImageView) viewInflate.findViewById(C48931uew.StateListAnimator.RJOkX);
        return viewInflate;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.umm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49338umf.KWHzl(interfaceC48892ueJCopydefault, this, (ShareConfig) obj);
            }
        }));
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.KWHzl(this);
        }
        view.post(new java.lang.Runnable() { // from class: o.uml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49338umf.EZpvd(this.copydefault);
            }
        });
    }

    public static final Unit KWHzl(InterfaceC48892ueJ interfaceC48892ueJ, C49338umf c49338umf, ShareConfig shareConfig) {
        c49338umf.copydefault(interfaceC48892ueJ != null ? interfaceC48892ueJ.fARcdN() : false, shareConfig.getShareParams(), shareConfig.getPreviewConfig());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C49338umf c49338umf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49338umf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC48899ueQ
    public void copydefault(boolean z) {
        ShareConfig value = OLrzqt().OLrzqt().getValue();
        Intrinsics.copydefault(value);
        ShareConfig shareConfig = value;
        copydefault(z, shareConfig.getShareParams(), shareConfig.getPreviewConfig());
    }

    public final void copydefault(boolean z, IShareParams iShareParams, ISharePreviewConfig iSharePreviewConfig) {
        if (!iSharePreviewConfig.getEditable()) {
            android.widget.ImageView imageView = this.OLrzqt;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.widget.TextView textView = this.gEmmrt;
            if (textView != null) {
                textView.setTextAlignment(5);
            }
            android.widget.TextView textView2 = this.gEmmrt;
            if (textView2 != null) {
                textView2.setText(iSharePreviewConfig.getPreviewTitle());
            }
            android.widget.ImageView imageView2 = this.copydefault;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            android.widget.ImageView imageView3 = this.copydefault;
            if (imageView3 != null) {
                imageView3.setOnClickListener(null);
            }
            android.widget.ImageView imageView4 = this.AEQbTJ;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            android.widget.ImageView imageView5 = this.AEQbTJ;
            if (imageView5 != null) {
                imageView5.setOnClickListener(null);
            }
        } else if (z) {
            android.widget.ImageView imageView6 = this.OLrzqt;
            if (imageView6 != null) {
                imageView6.setVisibility(4);
            }
            android.widget.ImageView imageView7 = this.copydefault;
            if (imageView7 != null) {
                imageView7.setVisibility(0);
            }
            android.widget.ImageView imageView8 = this.copydefault;
            if (imageView8 != null) {
                imageView8.setOnClickListener(new View.OnClickListener() { // from class: o.umk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C49338umf.EZpvd(this.KWHzl, view);
                    }
                });
            }
            android.widget.ImageView imageView9 = this.AEQbTJ;
            if (imageView9 != null) {
                imageView9.setVisibility(4);
            }
            android.widget.ImageView imageView10 = this.AEQbTJ;
            if (imageView10 != null) {
                imageView10.setOnClickListener(null);
            }
            android.widget.TextView textView3 = this.gEmmrt;
            if (textView3 != null) {
                textView3.setTextAlignment(4);
            }
            android.widget.TextView textView4 = this.gEmmrt;
            if (textView4 != null) {
                textView4.setText(getResources().getString(C48931uew.Activity.DbNXlk));
            }
        } else {
            android.widget.ImageView imageView11 = this.OLrzqt;
            if (imageView11 != null) {
                imageView11.setVisibility(0);
            }
            android.widget.ImageView imageView12 = this.copydefault;
            if (imageView12 != null) {
                imageView12.setVisibility(8);
            }
            android.widget.ImageView imageView13 = this.copydefault;
            if (imageView13 != null) {
                imageView13.setOnClickListener(null);
            }
            android.widget.ImageView imageView14 = this.AEQbTJ;
            if (imageView14 != null) {
                imageView14.setVisibility(0);
            }
            android.widget.ImageView imageView15 = this.AEQbTJ;
            if (imageView15 != null) {
                imageView15.setOnClickListener(new View.OnClickListener() { // from class: o.umj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C49338umf.OLrzqt(this.AEQbTJ, view);
                    }
                });
            }
            android.widget.TextView textView5 = this.gEmmrt;
            if (textView5 != null) {
                textView5.setTextAlignment(5);
            }
            android.widget.TextView textView6 = this.gEmmrt;
            if (textView6 != null) {
                textView6.setText(iSharePreviewConfig.getPreviewTitle());
            }
        }
        if (!z) {
            android.widget.TextView textView7 = this.gEmmrt;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            android.widget.TextView textView8 = this.gEmmrt;
            if (textView8 != null) {
                textView8.setText(iSharePreviewConfig.getPreviewTitle());
                return;
            }
            return;
        }
        if (!iSharePreviewConfig.getEditable()) {
            android.widget.ImageView imageView16 = this.AEQbTJ;
            if (imageView16 != null) {
                imageView16.setVisibility(8);
            }
            android.widget.ImageView imageView17 = this.AEQbTJ;
            if (imageView17 != null) {
                imageView17.setOnClickListener(null);
            }
        }
        android.widget.TextView textView9 = this.gEmmrt;
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        android.widget.TextView textView10 = this.gEmmrt;
        if (textView10 != null) {
            textView10.setText(getResources().getString(C48931uew.Activity.DbNXlk));
        }
    }

    public static final void EZpvd(C49338umf c49338umf, android.view.View view) {
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(c49338umf);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.ejfBZ();
        }
    }

    public static final void OLrzqt(C49338umf c49338umf, android.view.View view) {
        InterfaceC48969ufh<?, ?> interfaceC48969ufhAkhnZx;
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(c49338umf);
        if (interfaceC48892ueJCopydefault == null || (interfaceC48969ufhAkhnZx = interfaceC48892ueJCopydefault.AkhnZx()) == null) {
            return;
        }
        interfaceC48969ufhAkhnZx.onEditClick();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.OLrzqt(this);
        }
    }
}
