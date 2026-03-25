package com.okinc.business.market.features.meme.preview;

import com.okinc.business.market.features.meme.preview.domain.model.TranslatedItemData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C28735kgQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28744kgZ;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewViewModel$fetchMainTranslation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contentId;
    final /* synthetic */ List<String> $referencedIds;
    final /* synthetic */ int $translateType;
    int label;
    final /* synthetic */ TwitterPreviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterPreviewViewModel$fetchMainTranslation$2(TwitterPreviewViewModel twitterPreviewViewModel, String str, List<String> list, int i, Continuation<? super TwitterPreviewViewModel$fetchMainTranslation$2> continuation) {
        super(2, continuation);
        this.this$0 = twitterPreviewViewModel;
        this.$contentId = str;
        this.$referencedIds = list;
        this.$translateType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwitterPreviewViewModel$fetchMainTranslation$2(this.this$0, this.$contentId, this.$referencedIds, this.$translateType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwitterPreviewViewModel$fetchMainTranslation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object value;
        C28735kgQ c28735kgQ;
        Object value2;
        C28735kgQ c28735kgQ2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28744kgZ interfaceC28744kgZ = this.this$0.copydefault;
            String str = this.$contentId;
            List<String> list = this.$referencedIds;
            int i2 = this.$translateType;
            this.label = 1;
            objAEQbTJ = interfaceC28744kgZ.AEQbTJ(str, list, i2, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        TwitterPreviewViewModel twitterPreviewViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            TwitterTranslateResponse twitterTranslateResponse = (TwitterTranslateResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            TranslatedItemData originalTranslatedData = twitterTranslateResponse.getOriginalTranslatedData();
            String translatedText = originalTranslatedData != null ? originalTranslatedData.getTranslatedText() : null;
            if (translatedText == null) {
                translatedText = "";
            }
            TranslatedItemData translatedItemData = (TranslatedItemData) CollectionsKt___CollectionsKt.firstOrNull(twitterTranslateResponse.getReferencedTranslatedData());
            String translatedText2 = translatedItemData != null ? translatedItemData.getTranslatedText() : null;
            String str2 = translatedText2 != null ? translatedText2 : "";
            MutableStateFlow mutableStateFlow = twitterPreviewViewModel.EZpvd;
            do {
                value2 = mutableStateFlow.getValue();
                c28735kgQ2 = (C28735kgQ) value2;
            } while (!mutableStateFlow.compareAndSet(value2, c28735kgQ2.EZpvd((63 & 1) != 0 ? c28735kgQ2.gEmmrt : translatedText.length() > 0, (63 & 2) != 0 ? c28735kgQ2.EZpvd : translatedText.length() == 0 ? c28735kgQ2.OLrzqt() : translatedText, (63 & 4) != 0 ? c28735kgQ2.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ2.copydefault : translatedText.length() == 0, (63 & 16) != 0 ? c28735kgQ2.djBIcL : false, (63 & 32) != 0 ? c28735kgQ2.AhwBna : str2.length() == 0 ? c28735kgQ2.copydefault() : str2, (63 & 64) != 0 ? c28735kgQ2.KWHzl : false, (63 & 128) != 0 ? c28735kgQ2.AEQbTJ : false)));
        }
        TwitterPreviewViewModel twitterPreviewViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            MutableStateFlow mutableStateFlow2 = twitterPreviewViewModel2.EZpvd;
            do {
                value = mutableStateFlow2.getValue();
                c28735kgQ = (C28735kgQ) value;
            } while (!mutableStateFlow2.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ.EZpvd : null, (63 & 4) != 0 ? c28735kgQ.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ.copydefault : true, (63 & 16) != 0 ? c28735kgQ.djBIcL : false, (63 & 32) != 0 ? c28735kgQ.AhwBna : null, (63 & 64) != 0 ? c28735kgQ.KWHzl : false, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
        }
        return Unit.INSTANCE;
    }
}
