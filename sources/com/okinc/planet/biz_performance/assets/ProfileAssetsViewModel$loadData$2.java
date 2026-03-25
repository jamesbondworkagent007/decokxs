package com.okinc.planet.biz_performance.assets;

import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC46197tLk;
import o.C45919tBc;
import o.C56391yDq;
import o.C56442yFn;
import o.tBE;
import o.tBG;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfileAssetsViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45919tBc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetsViewModel$loadData$2(C45919tBc c45919tBc, Continuation<? super ProfileAssetsViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = c45919tBc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetsViewModel$loadData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetsViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AEQbTJ() != null) {
                tBE tbe = this.this$0.AEQbTJ;
                String strAEQbTJ = this.this$0.AEQbTJ();
                Intrinsics.copydefault((Object) strAEQbTJ);
                PlanetAuthorId planetAuthorIdOLrzqt = strAEQbTJ != null ? PlanetAuthorId.OLrzqt(strAEQbTJ) : null;
                this.label = 1;
                obj = tbe.KWHzl(planetAuthorIdOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!(((tBG) obj2).KWHzl() == 0.0f)) {
                arrayList.add(obj2);
            }
        }
        this.this$0.copydefault.setValue(AbstractC46197tLk.Companion.KWHzl(arrayList));
        return Unit.INSTANCE;
    }
}
