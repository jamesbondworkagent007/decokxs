package com.okinc.auth.impl.twofactorauth.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.account.api.model.security.otp.TwoFactorAuthState;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C6660aTY;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorAuthViewModel extends ViewModel {
    public final SubdomainStrategy AEQbTJ;
    public final MutableSharedFlow<TwoFactorAuthState> EZpvd;
    public final SavedStateHandle KWHzl;
    public final SharedFlow<TwoFactorAuthState> OLrzqt;
    public final C6660aTY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TwoFactorAuthState> EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public TwoFactorAuthViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C6660aTY c6660aTY) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c6660aTY, "");
        this.KWHzl = savedStateHandle;
        this.copydefault = c6660aTY;
        MutableSharedFlow<TwoFactorAuthState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AEQbTJ = (SubdomainStrategy) savedStateHandle.get("KEY_SUBDOMAIN_STRATEGY");
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        copydefault(this.copydefault.EZpvd(str, str5, str2, str3, str6, str4, this.AEQbTJ));
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        copydefault(this.copydefault.AEQbTJ(str, str2, str3, str4, str5, str6, str7, str8, this.AEQbTJ));
    }

    public final <T> void copydefault(Flow<TwoFactorAuth<T>> flow) {
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(FlowKt.onStart(flow, new TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$1(this, null)), new TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$2(this, null)), new TwoFactorAuthViewModel$internalProcessTwoFactorAuthFlow$3(this, null)), ViewModelKt.getViewModelScope(this));
    }
}
