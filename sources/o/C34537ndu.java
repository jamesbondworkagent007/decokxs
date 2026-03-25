package o;

import com.okinc.dexkline.market.data.model.TagMetaData;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$fetchAllTagMetaData$1;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$getTagMetaByKeys$1;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$isEmptyCache$1;
import com.okinc.dexkline.market.features.tag.data.TagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34537ndu {
    public final InterfaceC32260mVk AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final java.util.Map<java.lang.String, TagMetaData> OLrzqt;

    public C34537ndu(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC32260mVk;
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        TagMetaRepo$fetchAllTagMetaData$1 tagMetaRepo$fetchAllTagMetaData$1;
        if (continuation instanceof TagMetaRepo$fetchAllTagMetaData$1) {
            tagMetaRepo$fetchAllTagMetaData$1 = (TagMetaRepo$fetchAllTagMetaData$1) continuation;
            int i = tagMetaRepo$fetchAllTagMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMetaRepo$fetchAllTagMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMetaRepo$fetchAllTagMetaData$1 = new TagMetaRepo$fetchAllTagMetaData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tagMetaRepo$fetchAllTagMetaData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMetaRepo$fetchAllTagMetaData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1 tagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1 = new TagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1(null, this);
            tagMetaRepo$fetchAllTagMetaData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1, tagMetaRepo$fetchAllTagMetaData$1);
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
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<? extends java.util.List<TagMetaData>>> continuation) throws java.lang.Throwable {
        TagMetaRepo$getTagMetaByKeys$1 tagMetaRepo$getTagMetaByKeys$1;
        if (continuation instanceof TagMetaRepo$getTagMetaByKeys$1) {
            tagMetaRepo$getTagMetaByKeys$1 = (TagMetaRepo$getTagMetaByKeys$1) continuation;
            int i = tagMetaRepo$getTagMetaByKeys$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMetaRepo$getTagMetaByKeys$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMetaRepo$getTagMetaByKeys$1 = new TagMetaRepo$getTagMetaByKeys$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tagMetaRepo$getTagMetaByKeys$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMetaRepo$getTagMetaByKeys$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1 tagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1 = new TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1(null, list, this);
            tagMetaRepo$getTagMetaByKeys$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1, tagMetaRepo$getTagMetaByKeys$1);
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
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        TagMetaRepo$isEmptyCache$1 tagMetaRepo$isEmptyCache$1;
        if (continuation instanceof TagMetaRepo$isEmptyCache$1) {
            tagMetaRepo$isEmptyCache$1 = (TagMetaRepo$isEmptyCache$1) continuation;
            int i = tagMetaRepo$isEmptyCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMetaRepo$isEmptyCache$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMetaRepo$isEmptyCache$1 = new TagMetaRepo$isEmptyCache$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tagMetaRepo$isEmptyCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMetaRepo$isEmptyCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1 tagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1 = new TagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1(null, this);
            tagMetaRepo$isEmptyCache$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1, tagMetaRepo$isEmptyCache$1);
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
