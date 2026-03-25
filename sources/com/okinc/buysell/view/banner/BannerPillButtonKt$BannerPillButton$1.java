package com.okinc.buysell.view.banner;

import androidx.compose.runtime.MutableState;
import com.okinc.okx.paymentapi.service.SupportBanner;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C30342lUv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class BannerPillButtonKt$BannerPillButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SupportBanner> $allBanners;
    final /* synthetic */ Ref.ObjectRef<MutableState<List<SupportBanner>>> $bannersToShow;
    final /* synthetic */ MutableState<Boolean> $showPillBanner$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $showPillButtonEvent;
    final /* synthetic */ MutableState<Boolean> $showPopUp;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerPillButtonKt$BannerPillButton$1(List<SupportBanner> list, Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState, Ref.ObjectRef<MutableState<List<SupportBanner>>> objectRef, MutableState<Boolean> mutableState2, Continuation<? super BannerPillButtonKt$BannerPillButton$1> continuation) {
        super(2, continuation);
        this.$allBanners = list;
        this.$showPillButtonEvent = function1;
        this.$showPopUp = mutableState;
        this.$bannersToShow = objectRef;
        this.$showPillBanner$delegate = mutableState2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerPillButtonKt$BannerPillButton$1(this.$allBanners, this.$showPillButtonEvent, this.$showPopUp, this.$bannersToShow, this.$showPillBanner$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerPillButtonKt$BannerPillButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$allBanners.isEmpty()) {
                C30342lUv.OLrzqt(this.$showPillBanner$delegate, true);
                this.$showPopUp.setValue(C56443yFo.KWHzl(false));
                this.$bannersToShow.element.setValue(this.$allBanners);
            } else {
                this.$showPillButtonEvent.invoke(C56443yFo.KWHzl(false));
                C30342lUv.OLrzqt(this.$showPillBanner$delegate, false);
                this.$showPopUp.setValue(C56443yFo.KWHzl(false));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
