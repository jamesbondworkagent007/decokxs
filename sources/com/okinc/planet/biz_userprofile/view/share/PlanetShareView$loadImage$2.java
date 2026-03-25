package com.okinc.planet.biz_userprofile.view.share;

import android.graphics.drawable.Drawable;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareView;
import com.okinc.planet.utils.ImageLoadInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C46443tUn;
import o.C5335Nt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetShareView$loadImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $context;
    final /* synthetic */ PlanetShareView.Application $this_loadImage;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetShareView$loadImage$2(PlanetShareView.Application application, AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super PlanetShareView$loadImage$2> continuation) {
        super(2, continuation);
        this.$this_loadImage = application;
        this.$context = abstractActivityC33041mov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetShareView$loadImage$2(this.$this_loadImage, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return ((PlanetShareView$loadImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [96=5] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5335Nt c5335NtBuildRequestBuilder$default;
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (((PlanetShareView.Activity) this.$this_loadImage).EZpvd().length() == 0) {
            c5335NtBuildRequestBuilder$default = C46443tUn.buildDefaultRequestBuilder$default(C46443tUn.copydefault, this.$context, new ImageLoadInfo(((PlanetShareView.Activity) this.$this_loadImage).KWHzl(), ((PlanetShareView.Activity) this.$this_loadImage).AEQbTJ(), ((PlanetShareView.Activity) this.$this_loadImage).EZpvd(), 0, 0, 0.0f, 56, null), 0, 0.0f, 12, null);
        } else {
            c5335NtBuildRequestBuilder$default = C46443tUn.buildRequestBuilder$default(C46443tUn.copydefault, this.$context, ((PlanetShareView.Activity) this.$this_loadImage).EZpvd(), 0, 0, 0.0f, 28, null);
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((Drawable) c5335NtBuildRequestBuilder$default.AEQbTJ().get());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = c5335NtBuildRequestBuilder$default.AkhnZx();
        }
        return (Drawable) objM7377constructorimpl;
    }
}
