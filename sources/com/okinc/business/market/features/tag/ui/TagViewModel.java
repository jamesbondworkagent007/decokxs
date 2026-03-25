package com.okinc.business.market.features.tag.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.token_detail.TokenDetail;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C25389ivm;
import o.C29709kyk;
import o.C29715kyq;
import o.C29772kzu;
import o.C29773kzv;
import o.C29774kzw;
import o.C56391yDq;
import o.C56442yFn;
import o.kMS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagViewModel extends ViewModel {
    public final C29715kyq AEQbTJ;
    public final C29709kyk EZpvd;
    public final C29773kzv KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C29774kzw copydefault;
    public final C29772kzu gEmmrt;

    @yCM
    public TagViewModel(@NotNull C29772kzu c29772kzu, @NotNull C29715kyq c29715kyq, @NotNull C29774kzw c29774kzw, @NotNull C29773kzv c29773kzv, @NotNull C29709kyk c29709kyk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29772kzu, "");
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(c29774kzw, "");
        Intrinsics.checkNotNullParameter(c29773kzv, "");
        Intrinsics.checkNotNullParameter(c29709kyk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = c29772kzu;
        this.AEQbTJ = c29715kyq;
        this.copydefault = c29774kzw;
        this.KWHzl = c29773kzv;
        this.EZpvd = c29709kyk;
        this.OLrzqt = coroutineDispatcher;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.tag.ui.TagViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TagViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C29709kyk c29709kyk = TagViewModel.this.EZpvd;
                this.label = 1;
                if (c29709kyk.EZpvd(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(LatestMarketInfoBean latestMarketInfoBean, @NotNull Continuation<? super Result<TokenDetail>> continuation) throws Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public static /* synthetic */ Object m6613generateTagFilterOptionsyxL6bBk$default(TagViewModel tagViewModel, List list, String str, boolean z, kMS kms, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            kms = null;
        }
        return tagViewModel.KWHzl(list, str, z, kms, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull List<String> list, @NotNull String str, boolean z, kMS kms, @NotNull Continuation<? super Result<? extends List<kMS>>> continuation) throws Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1 tagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1 = new TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1(null, kms, this, list, str, z);
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final Object copydefault(Integer num, Integer num2, @NotNull Continuation<? super Result<TagWrapper>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(List<String> list, Continuation<? super Result<? extends List<TagMeta>>> continuation) throws Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
