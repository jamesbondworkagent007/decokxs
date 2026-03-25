package o;

import com.okinc.dexkline.market.features.tag.domain.GetTagMetaUseCase$batchGet$1;
import com.okinc.dexkline.market.features.tag.domain.GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.tag.domain.GetTagMetaUseCase$getTagMeta$1;
import com.okinc.dexkline.market.features.tag.domain.GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34542ndz {
    public final CoroutineDispatcher KWHzl;
    public final C34537ndu OLrzqt;
    public final C34493ndC copydefault;

    @yCM
    public C34542ndz(@NotNull C34537ndu c34537ndu, @NotNull C34493ndC c34493ndC, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34537ndu, "");
        Intrinsics.checkNotNullParameter(c34493ndC, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c34537ndu;
        this.copydefault = c34493ndC;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: getTagMeta-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8699getTagMeta0E7RQCE$default(C34542ndz c34542ndz, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c34542ndz.KWHzl(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<TagMeta>> continuation) throws java.lang.Throwable {
        GetTagMetaUseCase$getTagMeta$1 getTagMetaUseCase$getTagMeta$1;
        if (continuation instanceof GetTagMetaUseCase$getTagMeta$1) {
            getTagMetaUseCase$getTagMeta$1 = (GetTagMetaUseCase$getTagMeta$1) continuation;
            int i = getTagMetaUseCase$getTagMeta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTagMetaUseCase$getTagMeta$1.label = i - Integer.MIN_VALUE;
            } else {
                getTagMetaUseCase$getTagMeta$1 = new GetTagMetaUseCase$getTagMeta$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTagMetaUseCase$getTagMeta$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTagMetaUseCase$getTagMeta$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1 getTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1 = new GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1(null, this, z, str);
            getTagMetaUseCase$getTagMeta$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1, getTagMetaUseCase$getTagMeta$1);
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

    /* JADX INFO: renamed from: batchGet-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8698batchGet0E7RQCE$default(C34542ndz c34542ndz, java.util.List list, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c34542ndz.OLrzqt(list, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Result<? extends java.util.List<TagMeta>>> continuation) throws java.lang.Throwable {
        GetTagMetaUseCase$batchGet$1 getTagMetaUseCase$batchGet$1;
        if (continuation instanceof GetTagMetaUseCase$batchGet$1) {
            getTagMetaUseCase$batchGet$1 = (GetTagMetaUseCase$batchGet$1) continuation;
            int i = getTagMetaUseCase$batchGet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTagMetaUseCase$batchGet$1.label = i - Integer.MIN_VALUE;
            } else {
                getTagMetaUseCase$batchGet$1 = new GetTagMetaUseCase$batchGet$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTagMetaUseCase$batchGet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTagMetaUseCase$batchGet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1 getTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1 = new GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1(null, this, z, list);
            getTagMetaUseCase$batchGet$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1, getTagMetaUseCase$batchGet$1);
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
}
