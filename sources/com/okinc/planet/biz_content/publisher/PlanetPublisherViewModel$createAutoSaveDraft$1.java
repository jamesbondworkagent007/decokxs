package com.okinc.planet.biz_content.publisher;

import com.okinc.planet.biz_content.input.data.InputDraft;
import com.okinc.planet.biz_content.input.data.InputDraftContent;
import com.okinc.planet.biz_content.input.data.InputDraftMetadata;
import com.okinc.planet.biz_content.input.data.InputDraftType;
import com.okinc.planet.biz_content.input.data.SerializableImageItem;
import com.okinc.planet.biz_content.input.data.SerializableInputTextState;
import com.okinc.planet.domain.remote.dto.ImageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C47793twn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC47550tsI;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherViewModel$createAutoSaveDraft$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ImageItem> $imageItems;
    final /* synthetic */ SerializableInputTextState $textState;
    int label;
    final /* synthetic */ C47793twn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherViewModel$createAutoSaveDraft$1(SerializableInputTextState serializableInputTextState, List<ImageItem> list, C47793twn c47793twn, Continuation<? super PlanetPublisherViewModel$createAutoSaveDraft$1> continuation) {
        super(2, continuation);
        this.$textState = serializableInputTextState;
        this.$imageItems = list;
        this.this$0 = c47793twn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherViewModel$createAutoSaveDraft$1(this.$textState, this.$imageItems, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherViewModel$createAutoSaveDraft$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InputDraftMetadata inputDraftMetadata = new InputDraftMetadata("auto_save_draft", InputDraftType.AUTO_SAVE, "Auto Save Draft", 0L, 0L, false, 0, 120, null);
                SerializableInputTextState serializableInputTextState = this.$textState;
                List<ImageItem> list = this.$imageItems;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(SerializableImageItem.Companion.EZpvd((ImageItem) it.next()));
                }
                InputDraft inputDraft = new InputDraft(inputDraftMetadata, new InputDraftContent(serializableInputTextState, arrayList, null, 4, null));
                InterfaceC47550tsI interfaceC47550tsI = this.this$0.aKErDB;
                this.label = 1;
                if (interfaceC47550tsI.OLrzqt(inputDraft, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.AxsJAYaxsJAY.set("draft_checked_on_recreation", C56443yFo.KWHzl(false));
        } catch (Exception e) {
            pUU.copydefault("PlanetPublisherViewModel", "Failed to create auto-save draft: " + e);
        }
        return Unit.INSTANCE;
    }
}
