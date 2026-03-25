package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fET implements fDP {
    public boolean KWHzl;
    public final Function1<AbstractC12782ctV, Unit> OLrzqt;
    public final LifecycleOwner copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fET(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = lifecycleOwner;
        this.OLrzqt = function1;
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16920esy c16920esyCopydefault = C16920esy.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16920esyCopydefault, "");
        return new ActionBar(c16920esyCopydefault);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ActionBar actionBar = viewHolder instanceof ActionBar ? (ActionBar) viewHolder : null;
        if (actionBar == null) {
            return;
        }
        fEX fex = obj instanceof fEX ? (fEX) obj : null;
        if (fex == null) {
            return;
        }
        boolean z = !this.KWHzl;
        if (z) {
            this.KWHzl = true;
        }
        actionBar.KWHzl(fex.AEQbTJ(), this.copydefault, this.OLrzqt, z);
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        ActionBar actionBar = viewHolder instanceof ActionBar ? (ActionBar) viewHolder : null;
        if (actionBar != null) {
            actionBar.EZpvd();
        }
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public DefaultLifecycleObserver AEQbTJ;
        public final C16920esy EZpvd;
        public LifecycleOwner KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C16920esy c16920esy) {
            super(c16920esy.getRoot());
            Intrinsics.checkNotNullParameter(c16920esy, "");
            this.EZpvd = c16920esy;
        }

        private final void AEQbTJ() {
            LottieAnimationView lottieAnimationView = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            C14677dpv.KWHzl(lottieAnimationView, CDNSourceManager.LottieSource.WalletEnableSAccount);
            this.EZpvd.OLrzqt.cancelAnimation();
            this.EZpvd.OLrzqt.playAnimation();
        }

        public final void OLrzqt() {
            if (this.EZpvd.OLrzqt.isAnimating()) {
                return;
            }
            float progress = this.EZpvd.OLrzqt.getProgress();
            if (progress <= 0.0f || progress >= 1.0f) {
                return;
            }
            this.EZpvd.OLrzqt.resumeAnimation();
        }

        public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, boolean z) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (z && lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                AEQbTJ();
            }
            if (this.AEQbTJ == null) {
                this.KWHzl = lifecycleOwner;
                this.AEQbTJ = new DefaultLifecycleObserver() { // from class: com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.WalletEnableSmartAccountTipViewHolderCreate$ViewHolder$bind$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onStart(LifecycleOwner lifecycleOwner2) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                        this.KWHzl.OLrzqt();
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onStop(LifecycleOwner lifecycleOwner2) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                        this.KWHzl.EZpvd.OLrzqt.pauseAnimation();
                    }
                };
                Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                DefaultLifecycleObserver defaultLifecycleObserver = this.AEQbTJ;
                Intrinsics.copydefault(defaultLifecycleObserver);
                lifecycle.addObserver(defaultLifecycleObserver);
            }
            ConstraintLayout constraintLayout = this.EZpvd.EZpvd;
            constraintLayout.setOnClickListener(new Application(constraintLayout, 1000L, function1, abstractC12782ctV));
        }

        public final void EZpvd() {
            LifecycleOwner lifecycleOwner;
            Lifecycle lifecycle;
            this.EZpvd.OLrzqt.cancelAnimation();
            DefaultLifecycleObserver defaultLifecycleObserver = this.AEQbTJ;
            if (defaultLifecycleObserver != null && (lifecycleOwner = this.KWHzl) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(defaultLifecycleObserver);
            }
            this.AEQbTJ = null;
            this.KWHzl = null;
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ AbstractC12782ctV EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ Function1 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.copydefault = function1;
                this.EZpvd = abstractC12782ctV;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.copydefault.invoke(this.EZpvd);
                }
            }
        }
    }
}
