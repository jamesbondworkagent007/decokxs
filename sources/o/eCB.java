package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.defi.wallet.eip7702.ui.item.EIP7702UnavailableWalletViewBinding$1;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eCB extends AbstractC19608gIr<EIP7702UIState.UnavailableWallet, C17133ewz> {
    public final Function0<Unit> copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EIP7702UIState.UnavailableWallet.Status.values().length];
            try {
                iArr[EIP7702UIState.UnavailableWallet.Status.CURRENT_WALLET_IS_EVM_TRACKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EIP7702UIState.UnavailableWallet.Status.CURRENT_WALLET_IS_UNAVAILABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eCB(@NotNull Function0<Unit> function0) {
        super(EIP7702UnavailableWalletViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17133ewz c17133ewz, @NotNull EIP7702UIState.UnavailableWallet unavailableWallet) {
        Intrinsics.checkNotNullParameter(c17133ewz, "");
        Intrinsics.checkNotNullParameter(unavailableWallet, "");
        C55173xeu c55173xeu = c17133ewz.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(32.0f, null, 1, null);
            c55173xeu.setLayoutParams(marginLayoutParams);
            c55173xeu.setEmptyTypeImage(6);
            java.lang.String string = c55173xeu.getContext().getString(C13754dXa.FragmentManager.kcQGz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            int i = StateListAnimator.KWHzl[unavailableWallet.copydefault().ordinal()];
            if (i == 1) {
                java.lang.String string2 = c55173xeu.getContext().getString(C13754dXa.FragmentManager.QYvkLl);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            } else if (i == 2) {
                java.lang.String string3 = c55173xeu.getContext().getString(C13754dXa.FragmentManager.QYvkLl);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c55173xeu.setSubTitle((java.lang.CharSequence) string3);
            } else {
                c55173xeu.setSubTitle((java.lang.CharSequence) "");
            }
            c55173xeu.AEQbTJ().setVisibility(unavailableWallet.copydefault() != EIP7702UIState.UnavailableWallet.Status.ALL_WALLETS_UNAVAILABLE ? 0 : 8);
            c55173xeu.AEQbTJ().setText(c55173xeu.getContext().getString(C13754dXa.FragmentManager.getDrawerToggleDelegate));
            C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ eCB KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eCB ecb) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = ecb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.copydefault.invoke();
            }
        }
    }
}
