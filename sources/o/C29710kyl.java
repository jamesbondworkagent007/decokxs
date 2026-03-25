package o;

import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.business.market.features.tag.data.TagMetaRepo$fetchAllTagMetaData$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$fetchAllTagMetaDataIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$fetchTokenTagAttributes$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$fetchTokenTagAttributes0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$getTagMetaByKeys$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$isEmptyCache$1;
import com.okinc.business.market.features.tag.data.TagMetaRepo$isEmptyCacheIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.domain.TagAttribute;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29710kyl {
    public final InterfaceC27595jyE EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, TagMetaData> OLrzqt;
    public final CoroutineDispatcher copydefault;

    public C29710kyl(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC27595jyE;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = new LinkedHashMap();
        this.KWHzl = "key_dex_mkt_tag_meta";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<TagAttribute>>> continuation) throws java.lang.Throwable {
        TagMetaRepo$fetchTokenTagAttributes$1 tagMetaRepo$fetchTokenTagAttributes$1;
        if (continuation instanceof TagMetaRepo$fetchTokenTagAttributes$1) {
            tagMetaRepo$fetchTokenTagAttributes$1 = (TagMetaRepo$fetchTokenTagAttributes$1) continuation;
            int i = tagMetaRepo$fetchTokenTagAttributes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMetaRepo$fetchTokenTagAttributes$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMetaRepo$fetchTokenTagAttributes$1 = new TagMetaRepo$fetchTokenTagAttributes$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tagMetaRepo$fetchTokenTagAttributes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMetaRepo$fetchTokenTagAttributes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            TagMetaRepo$fetchTokenTagAttributes0E7RQCE$$inlined$dexRunCatching$1 tagMetaRepo$fetchTokenTagAttributes0E7RQCE$$inlined$dexRunCatching$1 = new TagMetaRepo$fetchTokenTagAttributes0E7RQCE$$inlined$dexRunCatching$1(null, str, str2, this);
            tagMetaRepo$fetchTokenTagAttributes$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagMetaRepo$fetchTokenTagAttributes0E7RQCE$$inlined$dexRunCatching$1, tagMetaRepo$fetchTokenTagAttributes$1);
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
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<? extends java.util.List<TagMetaData>>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1 tagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1 = new TagMetaRepo$getTagMetaByKeysgIAlus$$inlined$dexRunCatching$1(null, this, list);
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

    public final void EZpvd() {
        LinkedHashMap linkedHashMap;
        java.util.ArrayList arrayList = SPUtils.getArrayList(this.KWHzl, TagMetaData.class);
        if (arrayList != null) {
            linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (java.lang.Object obj : arrayList) {
                linkedHashMap.put(((TagMetaData) obj).AkhnZx(), obj);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            this.OLrzqt.clear();
            this.OLrzqt.putAll(linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
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
