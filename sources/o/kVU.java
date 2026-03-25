package o;

import com.okinc.business.trade.features.home.meme.usecase.MemeSearchUseCase$checkTokenPair$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeSearchUseCase$searchMemeModeTokensByAddress$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeSearchUseCase$searchMemeModeTokensByAddressBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC28274kVi KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public kVU(@NotNull InterfaceC28274kVi interfaceC28274kVi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28274kVi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC28274kVi;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kVU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<MemeSearchBean>> continuation) throws java.lang.Throwable {
        MemeSearchUseCase$searchMemeModeTokensByAddress$1 memeSearchUseCase$searchMemeModeTokensByAddress$1;
        if (continuation instanceof MemeSearchUseCase$searchMemeModeTokensByAddress$1) {
            memeSearchUseCase$searchMemeModeTokensByAddress$1 = (MemeSearchUseCase$searchMemeModeTokensByAddress$1) continuation;
            int i = memeSearchUseCase$searchMemeModeTokensByAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeSearchUseCase$searchMemeModeTokensByAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                memeSearchUseCase$searchMemeModeTokensByAddress$1 = new MemeSearchUseCase$searchMemeModeTokensByAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeSearchUseCase$searchMemeModeTokensByAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeSearchUseCase$searchMemeModeTokensByAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MemeSearchUseCase$searchMemeModeTokensByAddressBWLJW6A$$inlined$dexRunCatching$1 memeSearchUseCase$searchMemeModeTokensByAddressBWLJW6A$$inlined$dexRunCatching$1 = new MemeSearchUseCase$searchMemeModeTokensByAddressBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str3, str2);
            memeSearchUseCase$searchMemeModeTokensByAddress$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeSearchUseCase$searchMemeModeTokensByAddressBWLJW6A$$inlined$dexRunCatching$1, memeSearchUseCase$searchMemeModeTokensByAddress$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super Result<ValidateTokensResponse>> continuation) throws java.lang.Throwable {
        MemeSearchUseCase$checkTokenPair$1 memeSearchUseCase$checkTokenPair$1;
        if (continuation instanceof MemeSearchUseCase$checkTokenPair$1) {
            memeSearchUseCase$checkTokenPair$1 = (MemeSearchUseCase$checkTokenPair$1) continuation;
            int i = memeSearchUseCase$checkTokenPair$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeSearchUseCase$checkTokenPair$1.label = i - Integer.MIN_VALUE;
            } else {
                memeSearchUseCase$checkTokenPair$1 = new MemeSearchUseCase$checkTokenPair$1(this, continuation);
            }
        }
        MemeSearchUseCase$checkTokenPair$1 memeSearchUseCase$checkTokenPair$12 = memeSearchUseCase$checkTokenPair$1;
        java.lang.Object objCopydefault = memeSearchUseCase$checkTokenPair$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = memeSearchUseCase$checkTokenPair$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC28274kVi interfaceC28274kVi = this.KWHzl;
            memeSearchUseCase$checkTokenPair$12.L$0 = str4;
            memeSearchUseCase$checkTokenPair$12.L$1 = str5;
            memeSearchUseCase$checkTokenPair$12.label = 1;
            objCopydefault = interfaceC28274kVi.copydefault(str, str2, str3, str4, str5, memeSearchUseCase$checkTokenPair$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (java.lang.String) memeSearchUseCase$checkTokenPair$12.L$1;
            str4 = (java.lang.String) memeSearchUseCase$checkTokenPair$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
        pUU.KWHzl("MemeSearchUseCase", "checkTokenPair error: transactionToken=" + str4 + ", currencyToken=" + str5, (java.lang.Throwable) actionBar.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar.KWHzl()));
    }
}
