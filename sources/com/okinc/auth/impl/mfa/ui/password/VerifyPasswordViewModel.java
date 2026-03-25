package com.okinc.auth.impl.mfa.ui.password;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C33496mxZ;
import o.C5776aCp;
import o.C5778aCr;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyPasswordViewModel extends AbstractC33073mpa {
    public final MutableLiveData<String> AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final SharedFlow<MfaFailure> AhwBna;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<MfaResponse> KWHzl;
    public final MutableSharedFlow<MfaFailure> OLrzqt;
    public final MutableSharedFlow<String> copydefault;
    public final MutableLiveData<SubdomainStrategy> djBIcL;
    public final C5778aCr fetchVPNInfo;
    public final SharedFlow<String> gEmmrt;
    public final C5776aCp isConnected;
    public final SharedFlow<MfaResponse> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaResponse> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SubdomainStrategy> gEmmrt() {
        return this.djBIcL;
    }

    @yCM
    public VerifyPasswordViewModel(@NotNull C5778aCr c5778aCr, @NotNull C5776aCp c5776aCp) {
        Intrinsics.checkNotNullParameter(c5778aCr, "");
        Intrinsics.checkNotNullParameter(c5776aCp, "");
        this.fetchVPNInfo = c5778aCr;
        this.isConnected = c5776aCp;
        this.AEQbTJ = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<MfaResponse> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default4;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
    }

    public final Job OLrzqt(@NotNull String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyPasswordViewModel$initFlow$1(this, str, subdomainStrategy, null), 3, null);
    }

    public final Job EZpvd(@NotNull String str, @NotNull String str2, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyPasswordViewModel$verifyPassword$1(this, str, str2, mfaScenario, null), 3, null);
    }

    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            C33496mxZ c33496mxZ = C33496mxZ.AEQbTJ;
            byte[] bytes = "okexisnumberone".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return c33496mxZ.copydefault(str, c33496mxZ.KWHzl(bytes));
        } catch (Exception e) {
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            pUU.copydefault(stackTraceString);
            return str;
        }
    }

    public final Job KWHzl(@NotNull OTP otp, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(otp, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyPasswordViewModel$switchStep$1(this, otp, mfaScenario, null), 3, null);
    }
}
