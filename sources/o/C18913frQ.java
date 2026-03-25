package o;

import com.okinc.business.defi.wallet.mine.search.data.model.TagMeta;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMetaData;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.GetTagMetaUseCase$getTagMeta$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18913frQ {
    public final C18948frz KWHzl;

    @yCM
    public C18913frQ(@NotNull C18948frz c18948frz) {
        Intrinsics.checkNotNullParameter(c18948frz, "");
        this.KWHzl = c18948frz;
    }

    /* JADX INFO: renamed from: getTagMeta-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8601getTagMeta0E7RQCE$default(C18913frQ c18913frQ, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c18913frQ.copydefault(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<TagMeta>> continuation) throws java.lang.Throwable {
        GetTagMetaUseCase$getTagMeta$1 getTagMetaUseCase$getTagMeta$1;
        C18913frQ c18913frQ;
        if (continuation instanceof GetTagMetaUseCase$getTagMeta$1) {
            getTagMetaUseCase$getTagMeta$1 = (GetTagMetaUseCase$getTagMeta$1) continuation;
            int i = getTagMetaUseCase$getTagMeta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTagMetaUseCase$getTagMeta$1.label = i - Integer.MIN_VALUE;
            } else {
                getTagMetaUseCase$getTagMeta$1 = new GetTagMetaUseCase$getTagMeta$1(this, continuation);
            }
        }
        java.lang.Object obj = getTagMetaUseCase$getTagMeta$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTagMetaUseCase$getTagMeta$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                java.lang.Object objCopydefault2 = this.KWHzl.copydefault();
                if (Result.m7380exceptionOrNullimpl(objCopydefault2) != null) {
                    objCopydefault2 = C56443yFo.KWHzl(true);
                }
                if (((java.lang.Boolean) objCopydefault2).booleanValue() && !z) {
                    return Result.m7377constructorimpl(tagMetaKWHzl);
                }
                if (z) {
                    C18948frz c18948frz = this.KWHzl;
                    getTagMetaUseCase$getTagMeta$1.L$0 = this;
                    getTagMetaUseCase$getTagMeta$1.L$1 = str;
                    getTagMetaUseCase$getTagMeta$1.label = 1;
                    if (c18948frz.OLrzqt(getTagMetaUseCase$getTagMeta$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                c18913frQ = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) getTagMetaUseCase$getTagMeta$1.L$1;
                c18913frQ = (C18913frQ) getTagMetaUseCase$getTagMeta$1.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            java.lang.Object objCopydefault3 = c18913frQ.KWHzl.copydefault(C56402yEa.EZpvd(str));
            if (Result.m7380exceptionOrNullimpl(objCopydefault3) != null) {
                objCopydefault3 = yDY.AhwBna();
            }
            TagMetaData tagMetaData = (TagMetaData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objCopydefault3);
            TagMeta tagMetaKWHzl = tagMetaData != null ? C18905frI.KWHzl(tagMetaData) : null;
            return Result.m7377constructorimpl(tagMetaKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
