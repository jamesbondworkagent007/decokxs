package o;

import android.media.AudioAttributes;
import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedAddressTabItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17610fLs extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C16558emG AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DPhTBN;
    }

    /* JADX INFO: renamed from: o.fLs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17610fLs copydefault(@NotNull EscapedAddressTabItem escapedAddressTabItem, boolean z) {
            Intrinsics.checkNotNullParameter(escapedAddressTabItem, "");
            C17610fLs c17610fLs = new C17610fLs();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("escaped_address_data", escapedAddressTabItem.getEscapedAddressData());
            bundle.putBoolean("escaped_show_dex_address", z);
            c17610fLs.setArguments(bundle);
            return c17610fLs;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16558emG c16558emGAEQbTJ = C16558emG.AEQbTJ(layoutInflater, viewGroup, false);
        this.AEQbTJ = c16558emGAEQbTJ;
        if (c16558emGAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16558emGAEQbTJ = null;
        }
        return c16558emGAEQbTJ.getRoot();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("escaped_address_data", EscapedAddressData.class);
            } else {
                parcelable = arguments.getParcelable("escaped_address_data");
            }
            EscapedAddressData escapedAddressData = (EscapedAddressData) parcelable;
            if (escapedAddressData == null) {
                return;
            }
            android.os.Bundle arguments2 = getArguments();
            boolean z = arguments2 != null ? arguments2.getBoolean("escaped_show_dex_address") : true;
            C16558emG c16558emG = this.AEQbTJ;
            C16558emG c16558emG2 = null;
            if (c16558emG == null) {
                Intrinsics.gEmmrt("");
                c16558emG = null;
            }
            c16558emG.AYXKKw.setText(escapedAddressData.getNewAddress());
            C16558emG c16558emG3 = this.AEQbTJ;
            if (c16558emG3 == null) {
                Intrinsics.gEmmrt("");
                c16558emG3 = null;
            }
            AppCompatImageView appCompatImageView = c16558emG3.OLrzqt;
            appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
            C16558emG c16558emG4 = this.AEQbTJ;
            if (c16558emG4 == null) {
                Intrinsics.gEmmrt("");
                c16558emG4 = null;
            }
            AppCompatImageView appCompatImageView2 = c16558emG4.KWHzl;
            appCompatImageView2.setOnClickListener(new Application(appCompatImageView2, 1000L, this));
            AEQbTJ(z);
            if (z) {
                C16558emG c16558emG5 = this.AEQbTJ;
                if (c16558emG5 == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG5 = null;
                }
                AppCompatImageView appCompatImageView3 = c16558emG5.copydefault;
                appCompatImageView3.setOnClickListener(new Activity(appCompatImageView3, 1000L, this));
                C16558emG c16558emG6 = this.AEQbTJ;
                if (c16558emG6 == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG6 = null;
                }
                AppCompatImageView appCompatImageView4 = c16558emG6.AEQbTJ;
                appCompatImageView4.setOnClickListener(new TaskDescription(appCompatImageView4, 1000L, this));
                C16558emG c16558emG7 = this.AEQbTJ;
                if (c16558emG7 == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG7 = null;
                }
                AppCompatImageView appCompatImageView5 = c16558emG7.EZpvd;
                appCompatImageView5.setOnClickListener(new Fragment(appCompatImageView5, 1000L, this));
                if (escapedAddressData.getDexControlAddress().length() == 0) {
                    C16558emG c16558emG8 = this.AEQbTJ;
                    if (c16558emG8 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG8 = null;
                    }
                    c16558emG8.AkhnZx.setVisibility(8);
                    C16558emG c16558emG9 = this.AEQbTJ;
                    if (c16558emG9 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG9 = null;
                    }
                    c16558emG9.AhwBna.setVisibility(8);
                    C16558emG c16558emG10 = this.AEQbTJ;
                    if (c16558emG10 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG10 = null;
                    }
                    c16558emG10.EZpvd.setVisibility(8);
                    C16558emG c16558emG11 = this.AEQbTJ;
                    if (c16558emG11 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG11 = null;
                    }
                    c16558emG11.valueOf.setVisibility(8);
                    C16558emG c16558emG12 = this.AEQbTJ;
                    if (c16558emG12 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16558emG2 = c16558emG12;
                    }
                    c16558emG2.djBIcL.setText(escapedAddressData.getDexStorageAddress());
                } else if (escapedAddressData.getDexStorageAddress().length() == 0) {
                    C16558emG c16558emG13 = this.AEQbTJ;
                    if (c16558emG13 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG13 = null;
                    }
                    c16558emG13.AkhnZx.setVisibility(8);
                    C16558emG c16558emG14 = this.AEQbTJ;
                    if (c16558emG14 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG14 = null;
                    }
                    c16558emG14.AhwBna.setVisibility(8);
                    C16558emG c16558emG15 = this.AEQbTJ;
                    if (c16558emG15 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG15 = null;
                    }
                    c16558emG15.AEQbTJ.setVisibility(8);
                    C16558emG c16558emG16 = this.AEQbTJ;
                    if (c16558emG16 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG16 = null;
                    }
                    c16558emG16.djBIcL.setVisibility(8);
                    C16558emG c16558emG17 = this.AEQbTJ;
                    if (c16558emG17 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16558emG2 = c16558emG17;
                    }
                    c16558emG2.valueOf.setText(escapedAddressData.getDexControlAddress());
                } else {
                    C16558emG c16558emG18 = this.AEQbTJ;
                    if (c16558emG18 == null) {
                        Intrinsics.gEmmrt("");
                        c16558emG18 = null;
                    }
                    c16558emG18.djBIcL.setText(escapedAddressData.getDexStorageAddress());
                    C16558emG c16558emG19 = this.AEQbTJ;
                    if (c16558emG19 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16558emG2 = c16558emG19;
                    }
                    c16558emG2.valueOf.setText(escapedAddressData.getDexControlAddress());
                }
            }
            view.post(new java.lang.Runnable() { // from class: o.fLt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C17610fLs.EZpvd(this.EZpvd);
                }
            });
        }
    }

    public static final void EZpvd(C17610fLs c17610fLs) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c17610fLs, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(boolean z) {
        C16558emG c16558emG = this.AEQbTJ;
        C16558emG c16558emG2 = null;
        if (c16558emG == null) {
            Intrinsics.gEmmrt("");
            c16558emG = null;
        }
        android.widget.TextView textView = c16558emG.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        C16558emG c16558emG3 = this.AEQbTJ;
        if (c16558emG3 == null) {
            Intrinsics.gEmmrt("");
            c16558emG3 = null;
        }
        AppCompatImageView appCompatImageView = c16558emG3.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        C16558emG c16558emG4 = this.AEQbTJ;
        if (c16558emG4 == null) {
            Intrinsics.gEmmrt("");
            c16558emG4 = null;
        }
        android.widget.TextView textView2 = c16558emG4.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        C16558emG c16558emG5 = this.AEQbTJ;
        if (c16558emG5 == null) {
            Intrinsics.gEmmrt("");
            c16558emG5 = null;
        }
        AppCompatImageView appCompatImageView2 = c16558emG5.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(z ? 0 : 8);
        C16558emG c16558emG6 = this.AEQbTJ;
        if (c16558emG6 == null) {
            Intrinsics.gEmmrt("");
            c16558emG6 = null;
        }
        android.widget.TextView textView3 = c16558emG6.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z ? 0 : 8);
        C16558emG c16558emG7 = this.AEQbTJ;
        if (c16558emG7 == null) {
            Intrinsics.gEmmrt("");
            c16558emG7 = null;
        }
        android.widget.TextView textView4 = c16558emG7.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(z ? 0 : 8);
        C16558emG c16558emG8 = this.AEQbTJ;
        if (c16558emG8 == null) {
            Intrinsics.gEmmrt("");
            c16558emG8 = null;
        }
        android.widget.TextView textView5 = c16558emG8.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(z ? 0 : 8);
        C16558emG c16558emG9 = this.AEQbTJ;
        if (c16558emG9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16558emG2 = c16558emG9;
        }
        AppCompatImageView appCompatImageView3 = c16558emG2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        appCompatImageView3.setVisibility(z ? 0 : 8);
    }

    public final void copydefault(int i, int i2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.setTitle(requireContext().getString(i));
        viewOnClickListenerC54939xaY.EZpvd(requireContext().getString(i2));
        java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.DarRvM);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17610fLs.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.CharSequence charSequence) {
        EZpvd();
        java.lang.Object systemService = requireContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, charSequence));
        }
        java.lang.String string = getString(C13754dXa.FragmentManager.gvFztT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    private final void EZpvd() {
        java.lang.Object systemService = requireContext().getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            android.os.Vibrator vibrator2 = vibrator.hasVibrator() ? vibrator : null;
            if (vibrator2 != null) {
                vibrator2.vibrate(100L, new AudioAttributes.Builder().build());
            }
        }
    }

    /* JADX INFO: renamed from: o.fLs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C17610fLs EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17610fLs c17610fLs) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c17610fLs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(C13754dXa.FragmentManager.getAudioStream, C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImpl);
            }
        }
    }

    /* JADX INFO: renamed from: o.fLs$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C17610fLs EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C17610fLs c17610fLs) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c17610fLs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplBase, C13754dXa.FragmentManager.MediaControllerCompatMediaControllerExtraData);
            }
        }
    }

    /* JADX INFO: renamed from: o.fLs$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C17610fLs OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C17610fLs c17610fLs) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c17610fLs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17610fLs c17610fLs = this.OLrzqt;
                C16558emG c16558emG = c17610fLs.AEQbTJ;
                if (c16558emG == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG = null;
                }
                c17610fLs.EZpvd(c16558emG.valueOf.getText());
            }
        }
    }

    /* JADX INFO: renamed from: o.fLs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C17610fLs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17610fLs c17610fLs) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c17610fLs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17610fLs c17610fLs = this.copydefault;
                C16558emG c16558emG = c17610fLs.AEQbTJ;
                if (c16558emG == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG = null;
                }
                c17610fLs.EZpvd(c16558emG.AYXKKw.getText());
            }
        }
    }

    /* JADX INFO: renamed from: o.fLs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C17610fLs AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17610fLs c17610fLs) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c17610fLs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C17610fLs c17610fLs = this.AEQbTJ;
                C16558emG c16558emG = c17610fLs.AEQbTJ;
                if (c16558emG == null) {
                    Intrinsics.gEmmrt("");
                    c16558emG = null;
                }
                c17610fLs.EZpvd(c16558emG.djBIcL.getText());
            }
        }
    }
}
