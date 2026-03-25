package com.okinc.im.imui.sticker.viewmodel;

import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.im.imui.sticker.model.StickerModel;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44487sRq;
import o.InterfaceC44488sRr;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerSettingsViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StickerSettingsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSettingsViewModel$fetchData$1(StickerSettingsViewModel stickerSettingsViewModel, Continuation<? super StickerSettingsViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = stickerSettingsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerSettingsViewModel$fetchData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerSettingsViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("sticker_log", "Fetching stickers for pack: " + this.this$0.isConnected + ", page: " + this.this$0.gEmmrt);
            InterfaceC44487sRq interfaceC44487sRq = this.this$0.fARcdN;
            String str = this.this$0.isConnected;
            int i2 = this.this$0.gEmmrt;
            this.label = 1;
            obj = interfaceC44487sRq.AEQbTJ(str, i2, 50, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Iterable<InterfaceC44488sRr> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (InterfaceC44488sRr interfaceC44488sRr : iterable) {
            arrayList.add(new ListItem.StickerItem(new StickerModel(interfaceC44488sRr.getStickerId(), interfaceC44488sRr.getIconUrl(), false, 4, null)));
        }
        pUU.EZpvd("sticker_log", "new data: " + arrayList.size());
        this.this$0.valueOf.tryEmit(CollectionsKt___CollectionsKt.djBIcL((Collection) this.this$0.valueOf.getValue(), (Iterable) arrayList));
        MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        this.this$0.EZpvd.tryEmit(C56443yFo.KWHzl(arrayList.size() == 50));
        return unit;
    }
}
