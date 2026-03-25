package o;

import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackBoostClick$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackBoostEvent$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackCampaignExposureEvent$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackCampaignLaunch$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackClickEvent$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackHotCardClick$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackLearnCardClick$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackOnTabChange$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackRecommendExposureEvent$2;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackViewMoreClick$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23703iGe implements InterfaceC23702iGd {
    public final java.util.HashSet<java.lang.String> AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public C23703iGe(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = new java.util.HashSet<>();
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object copydefault(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackBoostEvent$2(this, str, i, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackBoostClick$2(str, i, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackOnTabChange$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackRecommendExposureEvent$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackCampaignExposureEvent$2(null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackClickEvent$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackCampaignLaunch$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object EZpvd(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackHotCardClick$2(j, str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackViewMoreClick$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new InvestHomeTrackUseCaseImpl$trackLearnCardClick$2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23702iGd
    public void AEQbTJ() {
        this.AEQbTJ.clear();
    }
}
