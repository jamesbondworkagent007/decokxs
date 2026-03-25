package o;

import com.okinc.im.usecase.message.GetReferenceMessageIdUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35814oEr {
    public final oCE EZpvd;

    @yCM
    public C35814oEr(@NotNull oCE oce) {
        Intrinsics.checkNotNullParameter(oce, "");
        this.EZpvd = oce;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        GetReferenceMessageIdUseCase$execute$1 getReferenceMessageIdUseCase$execute$1;
        DraftMessageModel draftMessageModel;
        java.lang.String quotedMessageId;
        if (continuation instanceof GetReferenceMessageIdUseCase$execute$1) {
            getReferenceMessageIdUseCase$execute$1 = (GetReferenceMessageIdUseCase$execute$1) continuation;
            int i = getReferenceMessageIdUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getReferenceMessageIdUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getReferenceMessageIdUseCase$execute$1 = new GetReferenceMessageIdUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getReferenceMessageIdUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getReferenceMessageIdUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            oCE oce = this.EZpvd;
            getReferenceMessageIdUseCase$execute$1.label = 1;
            objOLrzqt = oce.OLrzqt(str, getReferenceMessageIdUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        OKConversation oKConversation = (OKConversation) objOLrzqt;
        if (oKConversation == null || (draftMessageModel = oKConversation.getDraftMessageModel()) == null || (quotedMessageId = draftMessageModel.getQuotedMessageId()) == null) {
            return null;
        }
        return StringsKt__StringNumberConversionsKt.getFieldNames(quotedMessageId);
    }
}
