package com.okinc.planet.biz_userprofile.view.share;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C33070mpX;
import o.C47501trL;
import o.C5335Nt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetShareView$loadImage$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $context;
    final /* synthetic */ PlanetShareView.Application $this_loadImage;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetShareView$loadImage$3(AbstractActivityC33041mov abstractActivityC33041mov, PlanetShareView.Application application, Continuation<? super PlanetShareView$loadImage$3> continuation) {
        super(2, continuation);
        this.$context = abstractActivityC33041mov;
        this.$this_loadImage = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetShareView$loadImage$3 planetShareView$loadImage$3 = new PlanetShareView$loadImage$3(this.$context, this.$this_loadImage, continuation);
        planetShareView$loadImage$3.L$0 = obj;
        return planetShareView$loadImage$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return ((PlanetShareView$loadImage$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [112=4] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        AbstractActivityC33041mov abstractActivityC33041mov = this.$context;
        PlanetShareView.Application application = this.$this_loadImage;
        try {
            Result.Application application2 = Result.Companion;
            Intrinsics.copydefault(abstractActivityC33041mov, "");
            C5335Nt<Drawable> c5335NtEZpvd = Glide.copydefault((FragmentActivity) abstractActivityC33041mov).EZpvd(((PlanetShareView.StateListAnimator) application).OLrzqt());
            objM7377constructorimpl = Result.m7377constructorimpl(((((PlanetShareView.StateListAnimator) application).copydefault() == null || ((PlanetShareView.StateListAnimator) application).AEQbTJ() == null) ? c5335NtEZpvd.AEQbTJ() : c5335NtEZpvd.AEQbTJ(((PlanetShareView.StateListAnimator) application).copydefault().intValue(), ((PlanetShareView.StateListAnimator) application).AEQbTJ().intValue())).get());
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : C33070mpX.KWHzl(C47501trL.ActionBar.getFieldNames);
    }
}
