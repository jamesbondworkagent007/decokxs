package o;

import com.okinc.im.imui.messageV2.model.ReplyResult;
import com.okinc.im.usecase.message.GetReferenceMessageByReplyResultUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35810oEn {
    public final C35813oEq KWHzl;

    @yCM
    public C35810oEn(@NotNull C35813oEq c35813oEq) {
        Intrinsics.checkNotNullParameter(c35813oEq, "");
        this.KWHzl = c35813oEq;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, ReplyResult replyResult, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        GetReferenceMessageByReplyResultUseCase$execute$1 getReferenceMessageByReplyResultUseCase$execute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetReferenceMessageByReplyResultUseCase$execute$1) {
            getReferenceMessageByReplyResultUseCase$execute$1 = (GetReferenceMessageByReplyResultUseCase$execute$1) continuation;
            int i = getReferenceMessageByReplyResultUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getReferenceMessageByReplyResultUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getReferenceMessageByReplyResultUseCase$execute$1 = new GetReferenceMessageByReplyResultUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getReferenceMessageByReplyResultUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getReferenceMessageByReplyResultUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                java.lang.Long lAEQbTJ = replyResult != null ? replyResult.AEQbTJ() : null;
                java.lang.Long lCopydefault = replyResult != null ? replyResult.copydefault() : null;
                java.lang.String strEZpvd = replyResult != null ? replyResult.EZpvd() : null;
                if (str == null || !Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) str) || Intrinsics.EZpvd(lAEQbTJ, lCopydefault)) {
                    return null;
                }
                Result.Application application = Result.Companion;
                C35813oEq c35813oEq = this.KWHzl;
                getReferenceMessageByReplyResultUseCase$execute$1.label = 1;
                objOLrzqt = c35813oEq.OLrzqt(str, getReferenceMessageByReplyResultUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (OKMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
