package o;

import com.okinc.business.defi.wallet.mine.walletbind.usecase.VerifyBindCeFiDeeplinkUseCase$connect$1;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.VerifyBindCeFiDeeplinkUseCase$verify$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9845bdK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19330fzJ {
    @yCM
    public C19330fzJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull android.os.Bundle bundle, @NotNull Continuation<? super Result<Unit>> continuation) {
        VerifyBindCeFiDeeplinkUseCase$verify$1 verifyBindCeFiDeeplinkUseCase$verify$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof VerifyBindCeFiDeeplinkUseCase$verify$1) {
            verifyBindCeFiDeeplinkUseCase$verify$1 = (VerifyBindCeFiDeeplinkUseCase$verify$1) continuation;
            int i = verifyBindCeFiDeeplinkUseCase$verify$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyBindCeFiDeeplinkUseCase$verify$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyBindCeFiDeeplinkUseCase$verify$1 = new VerifyBindCeFiDeeplinkUseCase$verify$1(this, continuation);
            }
        }
        java.lang.Object obj = verifyBindCeFiDeeplinkUseCase$verify$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyBindCeFiDeeplinkUseCase$verify$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String string = bundle.getString("package");
            java.lang.String string2 = bundle.getString("verifyAppToken");
            if (string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                C19339fzS.EZpvd.OLrzqt("[Verify app]", "package is null");
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalArgumentException("package is null")));
            }
            if (string2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string2)) {
                C19339fzS.EZpvd.OLrzqt("[Verify app]", "verifyAppToken is null");
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalArgumentException("verifyAppToken is null")));
            }
            C19339fzS.EZpvd.OLrzqt("[Verify app]", "package=" + string + ", verifyAppToken=" + string2);
            InterfaceC9845bdK interfaceC9845bdK = (InterfaceC9845bdK) C43248rlh.KWHzl.AEQbTJ(InterfaceC9845bdK.class);
            verifyBindCeFiDeeplinkUseCase$verify$1.label = 1;
            objKWHzl = interfaceC9845bdK.KWHzl(string, string2, verifyBindCeFiDeeplinkUseCase$verify$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            C19339fzS.EZpvd.OLrzqt("[Verify app]", "verify app success");
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(Unit.INSTANCE);
        }
        C19339fzS c19339fzS = C19339fzS.EZpvd;
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        c19339fzS.OLrzqt("[Verify app]", "verify app error, error=" + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null));
        Result.Application application4 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.RuntimeException(Result.m7380exceptionOrNullimpl(objKWHzl))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        VerifyBindCeFiDeeplinkUseCase$connect$1 verifyBindCeFiDeeplinkUseCase$connect$1;
        java.lang.Object objM8563connectVerificationServer0E7RQCE$default;
        if (continuation instanceof VerifyBindCeFiDeeplinkUseCase$connect$1) {
            verifyBindCeFiDeeplinkUseCase$connect$1 = (VerifyBindCeFiDeeplinkUseCase$connect$1) continuation;
            int i = verifyBindCeFiDeeplinkUseCase$connect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyBindCeFiDeeplinkUseCase$connect$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyBindCeFiDeeplinkUseCase$connect$1 = new VerifyBindCeFiDeeplinkUseCase$connect$1(this, continuation);
            }
        }
        VerifyBindCeFiDeeplinkUseCase$connect$1 verifyBindCeFiDeeplinkUseCase$connect$12 = verifyBindCeFiDeeplinkUseCase$connect$1;
        java.lang.Object obj = verifyBindCeFiDeeplinkUseCase$connect$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyBindCeFiDeeplinkUseCase$connect$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9845bdK interfaceC9845bdK = (InterfaceC9845bdK) C43248rlh.KWHzl.AEQbTJ(InterfaceC9845bdK.class);
            verifyBindCeFiDeeplinkUseCase$connect$12.label = 1;
            objM8563connectVerificationServer0E7RQCE$default = InterfaceC9845bdK.ActionBar.m8563connectVerificationServer0E7RQCE$default(interfaceC9845bdK, str, 0L, verifyBindCeFiDeeplinkUseCase$connect$12, 2, null);
            if (objM8563connectVerificationServer0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8563connectVerificationServer0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8563connectVerificationServer0E7RQCE$default)) {
            if ((Result.m7383isFailureimpl(objM8563connectVerificationServer0E7RQCE$default) ? null : objM8563connectVerificationServer0E7RQCE$default) != null) {
                C19339fzS.EZpvd.OLrzqt("[Verify app]", "connect app success");
                Result.Application application = Result.Companion;
                if (Result.m7383isFailureimpl(objM8563connectVerificationServer0E7RQCE$default)) {
                    objM8563connectVerificationServer0E7RQCE$default = null;
                }
                Intrinsics.copydefault(objM8563connectVerificationServer0E7RQCE$default);
                return Result.m7377constructorimpl(objM8563connectVerificationServer0E7RQCE$default);
            }
        }
        C19339fzS c19339fzS = C19339fzS.EZpvd;
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8563connectVerificationServer0E7RQCE$default);
        c19339fzS.OLrzqt("[Verify app]", "connect app error, error=" + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null));
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.RuntimeException(Result.m7380exceptionOrNullimpl(objM8563connectVerificationServer0E7RQCE$default))));
    }
}
