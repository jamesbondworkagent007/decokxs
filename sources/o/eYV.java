package o;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eYV extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC16461ekP AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> KWHzl;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean KWHzl() {
            return SPUtils.getBoolean("sp_key_wallet_is_filter_risky_token_in_profile", true);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.eYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eYV.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(eYV eyv) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eyv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        java.lang.String string = getString(C13754dXa.FragmentManager.viewModels);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        AbstractC16461ekP abstractC16461ekP = (AbstractC16461ekP) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.aHXSQp, constraintLayout, true);
        this.AEQbTJ = abstractC16461ekP;
        AbstractC16461ekP abstractC16461ekP2 = null;
        if (abstractC16461ekP == null) {
            Intrinsics.gEmmrt("");
            abstractC16461ekP = null;
        }
        abstractC16461ekP.KWHzl.setChecked(SPUtils.getBoolean("sp_key_wallet_is_filter_risky_token_in_profile", true));
        AbstractC16461ekP abstractC16461ekP3 = this.AEQbTJ;
        if (abstractC16461ekP3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16461ekP2 = abstractC16461ekP3;
        }
        abstractC16461ekP2.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.eZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                eYV.copydefault(this.EZpvd, compoundButton, z);
            }
        });
    }

    public static final void copydefault(eYV eyv, android.widget.CompoundButton compoundButton, final boolean z) {
        if (SPUtils.commit("sp_key_wallet_is_filter_risky_token_in_profile", java.lang.Boolean.valueOf(z))) {
            Function1<? super java.lang.Boolean, Unit> function1 = eyv.KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(z));
            }
            C32866mlf.onEvent$default("Web3PNLAnalysis_RecentPNL_HideRiskyAssetsBtn_Click", (TrackChannel[]) null, new Function1() { // from class: o.eYW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eYV.KWHzl(z, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("toggle", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        fragmentManager.beginTransaction().add(this, str).commitAllowingStateLoss();
    }
}
