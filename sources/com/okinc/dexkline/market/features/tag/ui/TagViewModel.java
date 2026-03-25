package com.okinc.dexkline.market.features.tag.ui;

import androidx.lifecycle.ViewModel;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C34542ndz;
import o.C34576neg;
import o.C34577neh;
import o.C34579nej;
import o.C34640nfs;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TagViewModel extends ViewModel {
    public final C34576neg AEQbTJ;
    public final C34542ndz EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C34579nej OLrzqt;
    public final C34577neh copydefault;

    @yCM
    public TagViewModel(@NotNull C34576neg c34576neg, @NotNull C34542ndz c34542ndz, @NotNull C34577neh c34577neh, @NotNull C34579nej c34579nej, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34576neg, "");
        Intrinsics.checkNotNullParameter(c34542ndz, "");
        Intrinsics.checkNotNullParameter(c34577neh, "");
        Intrinsics.checkNotNullParameter(c34579nej, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c34576neg;
        this.EZpvd = c34542ndz;
        this.copydefault = c34577neh;
        this.OLrzqt = c34579nej;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(LatestMarketInfoBean latestMarketInfoBean, @NotNull Continuation<? super Result<TokenDetail>> continuation) throws Throwable {
        TagViewModel$mapTokenDetail$1 tagViewModel$mapTokenDetail$1;
        if (continuation instanceof TagViewModel$mapTokenDetail$1) {
            tagViewModel$mapTokenDetail$1 = (TagViewModel$mapTokenDetail$1) continuation;
            int i = tagViewModel$mapTokenDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$mapTokenDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$mapTokenDetail$1 = new TagViewModel$mapTokenDetail$1(this, continuation);
            }
        }
        Object objWithContext = tagViewModel$mapTokenDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$mapTokenDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1 tagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1 = new TagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1(null, this, latestMarketInfoBean);
            tagViewModel$mapTokenDetail$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$mapTokenDetailgIAlus$$inlined$dexRunCatching$1, tagViewModel$mapTokenDetail$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: generateTagFilterOptions-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m6707generateTagFilterOptionsyxL6bBk$default(TagViewModel tagViewModel, List list, String str, boolean z, C34640nfs c34640nfs, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            c34640nfs = null;
        }
        return tagViewModel.EZpvd(list, str, z, c34640nfs, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull List<String> list, @NotNull String str, boolean z, C34640nfs c34640nfs, @NotNull Continuation<? super Result<? extends List<C34640nfs>>> continuation) throws Throwable {
        TagViewModel$generateTagFilterOptions$1 tagViewModel$generateTagFilterOptions$1;
        if (continuation instanceof TagViewModel$generateTagFilterOptions$1) {
            tagViewModel$generateTagFilterOptions$1 = (TagViewModel$generateTagFilterOptions$1) continuation;
            int i = tagViewModel$generateTagFilterOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$generateTagFilterOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$generateTagFilterOptions$1 = new TagViewModel$generateTagFilterOptions$1(this, continuation);
            }
        }
        TagViewModel$generateTagFilterOptions$1 tagViewModel$generateTagFilterOptions$12 = tagViewModel$generateTagFilterOptions$1;
        Object objWithContext = tagViewModel$generateTagFilterOptions$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$generateTagFilterOptions$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1 tagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1 = new TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1(null, c34640nfs, this, list, str, z);
            tagViewModel$generateTagFilterOptions$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1, tagViewModel$generateTagFilterOptions$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super Result<TagMeta>> continuation) throws Throwable {
        TagViewModel$getTagMeta$1 tagViewModel$getTagMeta$1;
        if (continuation instanceof TagViewModel$getTagMeta$1) {
            tagViewModel$getTagMeta$1 = (TagViewModel$getTagMeta$1) continuation;
            int i = tagViewModel$getTagMeta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$getTagMeta$1.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$getTagMeta$1 = new TagViewModel$getTagMeta$1(this, continuation);
            }
        }
        Object objWithContext = tagViewModel$getTagMeta$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$getTagMeta$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1 tagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1 = new TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1(null, this, str);
            tagViewModel$getTagMeta$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$1, tagViewModel$getTagMeta$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Float f, @NotNull Continuation<? super Result<TagWrapper>> continuation) {
        TagViewModel$generateBundleTag$1 tagViewModel$generateBundleTag$1;
        if (continuation instanceof TagViewModel$generateBundleTag$1) {
            tagViewModel$generateBundleTag$1 = (TagViewModel$generateBundleTag$1) continuation;
            int i = tagViewModel$generateBundleTag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$generateBundleTag$1.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$generateBundleTag$1 = new TagViewModel$generateBundleTag$1(this, continuation);
            }
        }
        Object objWithContext = tagViewModel$generateBundleTag$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$generateBundleTag$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$generateBundleTaggIAlus$$inlined$dexRunCatching$1 tagViewModel$generateBundleTaggIAlus$$inlined$dexRunCatching$1 = new TagViewModel$generateBundleTaggIAlus$$inlined$dexRunCatching$1(null, this, f);
            tagViewModel$generateBundleTag$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$generateBundleTaggIAlus$$inlined$dexRunCatching$1, tagViewModel$generateBundleTag$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Integer num, Integer num2, @NotNull Continuation<? super Result<TagWrapper>> continuation) {
        TagViewModel$generateDevAnalysisTag$1 tagViewModel$generateDevAnalysisTag$1;
        if (continuation instanceof TagViewModel$generateDevAnalysisTag$1) {
            tagViewModel$generateDevAnalysisTag$1 = (TagViewModel$generateDevAnalysisTag$1) continuation;
            int i = tagViewModel$generateDevAnalysisTag$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$generateDevAnalysisTag$1.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$generateDevAnalysisTag$1 = new TagViewModel$generateDevAnalysisTag$1(this, continuation);
            }
        }
        Object objWithContext = tagViewModel$generateDevAnalysisTag$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$generateDevAnalysisTag$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1 tagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1 = new TagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1(null, this, num, num2);
            tagViewModel$generateDevAnalysisTag$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$generateDevAnalysisTag0E7RQCE$$inlined$dexRunCatching$1, tagViewModel$generateDevAnalysisTag$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(List<String> list, Continuation<? super Result<? extends List<TagMeta>>> continuation) throws Throwable {
        TagViewModel$getTagMeta$3 tagViewModel$getTagMeta$3;
        if (continuation instanceof TagViewModel$getTagMeta$3) {
            tagViewModel$getTagMeta$3 = (TagViewModel$getTagMeta$3) continuation;
            int i = tagViewModel$getTagMeta$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagViewModel$getTagMeta$3.label = i - Integer.MIN_VALUE;
            } else {
                tagViewModel$getTagMeta$3 = new TagViewModel$getTagMeta$3(this, continuation);
            }
        }
        Object objWithContext = tagViewModel$getTagMeta$3.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagViewModel$getTagMeta$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2 tagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2 = new TagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2(null, this, list);
            tagViewModel$getTagMeta$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tagViewModel$getTagMetagIAlus$$inlined$dexRunCatching$2, tagViewModel$getTagMeta$3);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
