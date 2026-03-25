package o;

import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.market.features.holders.domain.usecase.HolderUseCase$getTokenHolders$1;
import com.okinc.business.market.features.holders.domain.usecase.HolderUseCase$subscribeHoldersRanking$1;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jYD {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final jYB AEQbTJ;
    public final jYA AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final C28586kda EZpvd;
    public final StateFlow<C26287jYw> KWHzl;
    public final MutableStateFlow<C26287jYw> copydefault;
    public final jYH djBIcL;
    public final CoroutineScope gEmmrt;
    public final jYG valueOf;
    public final java.util.List<Job> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26287jYw> AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public jYD(@NotNull jYA jya, @NotNull jYB jyb, @NotNull jYG jyg, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C28586kda c28586kda, @NotNull jYH jyh) {
        Intrinsics.checkNotNullParameter(jya, "");
        Intrinsics.checkNotNullParameter(jyb, "");
        Intrinsics.checkNotNullParameter(jyg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jyh, "");
        this.AYXKKw = jya;
        this.AEQbTJ = jyb;
        this.valueOf = jyg;
        this.AhwBna = coroutineDispatcher;
        this.EZpvd = c28586kda;
        this.djBIcL = jyh;
        this.gEmmrt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.values = new java.util.ArrayList();
        MutableStateFlow<C26287jYw> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jYD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        this.values.add(C25389ivm.safeLaunch$default(this.gEmmrt, null, null, new HolderUseCase$subscribeHoldersRanking$1(this, str, str2, str3, null), 3, null));
    }

    public final void EZpvd() {
        this.valueOf.OLrzqt();
        java.util.Iterator<T> it = this.values.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final java.lang.Object OLrzqt(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Flow<java.lang.String>> continuation) {
        return C22416heu.ejfBZ() ? FlowKt.emptyFlow() : this.AEQbTJ.OLrzqt(c27614jyX, continuation);
    }

    public final void KWHzl() {
        this.AEQbTJ.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<C26287jYw, OKServerException>> continuation) throws java.lang.Throwable {
        HolderUseCase$getTokenHolders$1 holderUseCase$getTokenHolders$1;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Integer num2;
        java.lang.Object objOLrzqt;
        java.lang.String str7;
        java.lang.String str8;
        jYD jyd;
        jYD jyd2;
        java.lang.Integer num3;
        AbstractC43419rot abstractC43419rot;
        java.lang.Object objOLrzqt2;
        if (continuation instanceof HolderUseCase$getTokenHolders$1) {
            holderUseCase$getTokenHolders$1 = (HolderUseCase$getTokenHolders$1) continuation;
            int i = holderUseCase$getTokenHolders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderUseCase$getTokenHolders$1.label = i - Integer.MIN_VALUE;
            } else {
                holderUseCase$getTokenHolders$1 = new HolderUseCase$getTokenHolders$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = holderUseCase$getTokenHolders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderUseCase$getTokenHolders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C28586kda c28586kda = this.EZpvd;
            holderUseCase$getTokenHolders$1.L$0 = this;
            holderUseCase$getTokenHolders$1.L$1 = str;
            str5 = str2;
            holderUseCase$getTokenHolders$1.L$2 = str5;
            str6 = str3;
            holderUseCase$getTokenHolders$1.L$3 = str6;
            holderUseCase$getTokenHolders$1.L$4 = str4;
            num2 = num;
            holderUseCase$getTokenHolders$1.L$5 = num2;
            holderUseCase$getTokenHolders$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(holderUseCase$getTokenHolders$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str7 = str4;
            str8 = str;
            jyd = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                    objOLrzqt2 = ((Result) objEZpvd).m7386unboximpl();
                    return new AbstractC43419rot.StateListAnimator((C26287jYw) (Result.m7383isFailureimpl(objOLrzqt2) ? null : objOLrzqt2));
                }
                num3 = (java.lang.Integer) holderUseCase$getTokenHolders$1.L$1;
                jyd2 = (jYD) holderUseCase$getTokenHolders$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                abstractC43419rot = (AbstractC43419rot) objEZpvd;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    TokenHolderResponseData tokenHolderResponseData = (TokenHolderResponseData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    jYH jyh = jyd2.djBIcL;
                    holderUseCase$getTokenHolders$1.L$0 = null;
                    holderUseCase$getTokenHolders$1.L$1 = null;
                    holderUseCase$getTokenHolders$1.label = 3;
                    objOLrzqt2 = jyh.OLrzqt(tokenHolderResponseData, num3, holderUseCase$getTokenHolders$1);
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    return new AbstractC43419rot.StateListAnimator((C26287jYw) (Result.m7383isFailureimpl(objOLrzqt2) ? null : objOLrzqt2));
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                }
                throw new NoWhenBranchMatchedException();
            }
            java.lang.Integer num4 = (java.lang.Integer) holderUseCase$getTokenHolders$1.L$5;
            str7 = (java.lang.String) holderUseCase$getTokenHolders$1.L$4;
            java.lang.String str9 = (java.lang.String) holderUseCase$getTokenHolders$1.L$3;
            java.lang.String str10 = (java.lang.String) holderUseCase$getTokenHolders$1.L$2;
            str8 = (java.lang.String) holderUseCase$getTokenHolders$1.L$1;
            jYD jyd3 = (jYD) holderUseCase$getTokenHolders$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objOLrzqt = ((Result) objEZpvd).m7386unboximpl();
            num2 = num4;
            jyd = jyd3;
            str6 = str9;
            str5 = str10;
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        C26289jYy c26289jYy = new C26289jYy(str8, str5, str6, str7, dexUserIdentity != null ? dexUserIdentity.EZpvd() : "");
        jYA jya = jyd.AYXKKw;
        holderUseCase$getTokenHolders$1.L$0 = jyd;
        holderUseCase$getTokenHolders$1.L$1 = num2;
        holderUseCase$getTokenHolders$1.L$2 = null;
        holderUseCase$getTokenHolders$1.L$3 = null;
        holderUseCase$getTokenHolders$1.L$4 = null;
        holderUseCase$getTokenHolders$1.L$5 = null;
        holderUseCase$getTokenHolders$1.label = 2;
        objEZpvd = jya.EZpvd(c26289jYy, holderUseCase$getTokenHolders$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        jyd2 = jyd;
        num3 = num2;
        abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }
}
