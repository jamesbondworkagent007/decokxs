package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.components.track.TrackChannel;
import com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17746fQt extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public InterfaceC54855xXv AEQbTJ;
    public StateListAnimator EZpvd;
    public Function1<? super InterfaceC9738bbJ, java.lang.Boolean> OLrzqt;

    /* JADX INFO: renamed from: o.fQt$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType.values().length];
            try {
                iArr[CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType.MPCWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType.PrivateKeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType.HardwareWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType.AASmartAccount.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.fQt$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();

        void EZpvd();
    }

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17746fQt.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(C17746fQt c17746fQt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c17746fQt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        android.os.Bundle arguments;
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(c54954xan, "");
        android.content.Context context = getContext();
        if (context == null || (arguments = getArguments()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) arguments.getParcelable("CURRENT_WALLET_NOT_SUPPORTED_MODE", CurrentWalletNotSupportedMode.class);
        } else {
            parcelable = arguments.getParcelable("CURRENT_WALLET_NOT_SUPPORTED_MODE");
        }
        CurrentWalletNotSupportedMode currentWalletNotSupportedMode = (CurrentWalletNotSupportedMode) parcelable;
        if (currentWalletNotSupportedMode == null) {
            return;
        }
        AppCompatImageView appCompatImageView = c54954xan.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C55298xhM.copydefault(120.0f, context);
            layoutParams.height = C55298xhM.copydefault(120.0f, context);
            appCompatImageView.setLayoutParams(layoutParams);
            c54954xan.KWHzl.setImageResource(C13754dXa.Activity.fjfviF);
            c54954xan.AEQbTJ.setText(context.getString(C13754dXa.FragmentManager.setupCustomContent));
            if (currentWalletNotSupportedMode instanceof CurrentWalletNotSupportedMode.BusinessNotSupported) {
                CurrentWalletNotSupportedMode.BusinessNotSupported businessNotSupported = (CurrentWalletNotSupportedMode.BusinessNotSupported) currentWalletNotSupportedMode;
                c54954xan.OLrzqt.setText(pTD.KWHzl(context, C13754dXa.FragmentManager.AlertController, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("WalletType", OLrzqt(context, businessNotSupported.copydefault())), C56390yDp.OLrzqt("BusinessName", businessNotSupported.OLrzqt()))));
                return;
            }
            if (currentWalletNotSupportedMode instanceof CurrentWalletNotSupportedMode.NetworkNotSupported) {
                CurrentWalletNotSupportedMode.NetworkNotSupported networkNotSupported = (CurrentWalletNotSupportedMode.NetworkNotSupported) currentWalletNotSupportedMode;
                c54954xan.OLrzqt.setText(pTD.KWHzl(context, C13754dXa.FragmentManager.manageScrollIndicators, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("WalletType", OLrzqt(context, networkNotSupported.AEQbTJ())), C56390yDp.OLrzqt("network", networkNotSupported.copydefault()))));
                return;
            } else if (currentWalletNotSupportedMode instanceof CurrentWalletNotSupportedMode.NetworkNotSupportedForWalletType) {
                CurrentWalletNotSupportedMode.NetworkNotSupportedForWalletType networkNotSupportedForWalletType = (CurrentWalletNotSupportedMode.NetworkNotSupportedForWalletType) currentWalletNotSupportedMode;
                c54954xan.OLrzqt.setText(pTD.KWHzl(context, C13754dXa.FragmentManager.manageScrollIndicators, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("WalletType", copydefault(context, networkNotSupportedForWalletType.EZpvd())), C56390yDp.OLrzqt("network", networkNotSupportedForWalletType.KWHzl()))));
                return;
            } else {
                if (!(currentWalletNotSupportedMode instanceof CurrentWalletNotSupportedMode.CustomSubtitle)) {
                    throw new NoWhenBranchMatchedException();
                }
                c54954xan.OLrzqt.setText(((CurrentWalletNotSupportedMode.CustomSubtitle) currentWalletNotSupportedMode).OLrzqt());
                return;
            }
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final java.lang.String OLrzqt(android.content.Context context, CurrentWalletNotSupportedMode.WalletOrAccountNotSupportedType walletOrAccountNotSupportedType) {
        int i;
        int i2 = Application.EZpvd[walletOrAccountNotSupportedType.ordinal()];
        if (i2 == 1) {
            i = C13754dXa.FragmentManager.setScrollIndicators;
        } else if (i2 == 2) {
            i = C13754dXa.FragmentManager.selectContentView;
        } else if (i2 == 3) {
            i = C13754dXa.FragmentManager.centerButton;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C13754dXa.FragmentManager.resolvePanel;
        }
        java.lang.String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String copydefault(android.content.Context context, int i) {
        int i2;
        if (i == WalletType.MPCWallet.ordinal()) {
            i2 = C13754dXa.FragmentManager.setScrollIndicators;
        } else if (i == WalletType.KeyWallet.ordinal()) {
            i2 = C13754dXa.FragmentManager.selectContentView;
        } else if (i == WalletType.HardwareWallet.ordinal()) {
            i2 = C13754dXa.FragmentManager.centerButton;
        } else {
            i2 = i == WalletType.AAWallet.ordinal() ? C13754dXa.FragmentManager.resolvePanel : C13754dXa.FragmentManager.setupButtons;
        }
        java.lang.String string = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        wyf.setPrimaryText(context.getString(C13754dXa.FragmentManager.getDrawerToggleDelegate));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(context.getString(C13754dXa.FragmentManager.ActionBarDrawerToggle1));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.OLrzqt = null;
        this.AEQbTJ = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
            return;
        }
        super.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: o.fQt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fQt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C17746fQt KWHzl(@NotNull CurrentWalletNotSupportedMode currentWalletNotSupportedMode, @NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(currentWalletNotSupportedMode, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C17746fQt c17746fQt = new C17746fQt();
            c17746fQt.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("CURRENT_WALLET_NOT_SUPPORTED_MODE", currentWalletNotSupportedMode)));
            c17746fQt.EZpvd = stateListAnimator;
            return c17746fQt;
        }
    }

    /* JADX INFO: renamed from: o.fQt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C17746fQt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17746fQt c17746fQt) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c17746fQt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3WalletUnavailable_Sheet_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                StateListAnimator stateListAnimator = this.copydefault.EZpvd;
                if (stateListAnimator != null) {
                    stateListAnimator.AEQbTJ();
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.fQt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C17746fQt EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C17746fQt c17746fQt) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c17746fQt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                StateListAnimator stateListAnimator = this.EZpvd.EZpvd;
                if (stateListAnimator != null) {
                    stateListAnimator.EZpvd();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
