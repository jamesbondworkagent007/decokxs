package o;

import com.okinc.business.defi.wallet.mine.search.data.model.CompactTag;
import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMeta;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMetaData;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.business.defi.wallet.mine.search.domain.mapper.TagMapperKt$mapToTagWrapper$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18905frI {
    public static final CompactTag OLrzqt(@NotNull CompactTagData compactTagData) {
        Intrinsics.checkNotNullParameter(compactTagData, "");
        return new CompactTag(compactTagData.AEQbTJ(), Intrinsics.EZpvd((java.lang.Object) compactTagData.KWHzl(), (java.lang.Object) "1"), compactTagData.OLrzqt());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull CompactTag compactTag, @NotNull C18913frQ c18913frQ, @NotNull Continuation<? super TagWrapper> continuation) {
        TagMapperKt$mapToTagWrapper$1 tagMapperKt$mapToTagWrapper$1;
        java.lang.Object objM8601getTagMeta0E7RQCE$default;
        if (continuation instanceof TagMapperKt$mapToTagWrapper$1) {
            tagMapperKt$mapToTagWrapper$1 = (TagMapperKt$mapToTagWrapper$1) continuation;
            int i = tagMapperKt$mapToTagWrapper$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagMapperKt$mapToTagWrapper$1.label = i - Integer.MIN_VALUE;
            } else {
                tagMapperKt$mapToTagWrapper$1 = new TagMapperKt$mapToTagWrapper$1(continuation);
            }
        }
        TagMapperKt$mapToTagWrapper$1 tagMapperKt$mapToTagWrapper$12 = tagMapperKt$mapToTagWrapper$1;
        java.lang.Object obj = tagMapperKt$mapToTagWrapper$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagMapperKt$mapToTagWrapper$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strKWHzl = compactTag.KWHzl();
            tagMapperKt$mapToTagWrapper$12.L$0 = compactTag;
            tagMapperKt$mapToTagWrapper$12.label = 1;
            objM8601getTagMeta0E7RQCE$default = C18913frQ.m8601getTagMeta0E7RQCE$default(c18913frQ, strKWHzl, false, tagMapperKt$mapToTagWrapper$12, 2, null);
            if (objM8601getTagMeta0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            compactTag = (CompactTag) tagMapperKt$mapToTagWrapper$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8601getTagMeta0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8601getTagMeta0E7RQCE$default)) {
            objM8601getTagMeta0E7RQCE$default = null;
        }
        return new TagWrapper(compactTag, (TagMeta) objM8601getTagMeta0E7RQCE$default);
    }

    public static final TagMeta KWHzl(@NotNull TagMetaData tagMetaData) {
        Intrinsics.checkNotNullParameter(tagMetaData, "");
        return new TagMeta(tagMetaData.isConnected(), tagMetaData.AkhnZx(), tagMetaData.djBIcL(), tagMetaData.KWHzl(), tagMetaData.OLrzqt(), tagMetaData.AEQbTJ(), tagMetaData.copydefault(), tagMetaData.EZpvd(), tagMetaData.AYXKKw(), tagMetaData.gEmmrt(), tagMetaData.AhwBna(), tagMetaData.valueOf(), tagMetaData.values());
    }
}
