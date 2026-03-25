package com.okinc.business.market.features.group;

import android.graphics.drawable.Drawable;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C23466hyk;
import o.C55001xbh;
import o.C55008xbo;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC26243jXf;
import o.jWT;

/* JADX INFO: loaded from: classes7.dex */
public final class CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jWT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1(jWT jwt, Continuation<? super CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jWT jwt;
        Object objAEQbTJ;
        String str;
        Object objM7377constructorimpl;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C23466hyk c23466hyk = this.this$0.AYXKKw;
            String strIsConnected = (c23466hyk == null || (c55008xbo = c23466hyk.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) ? null : c55001xbhAkhnZx.isConnected();
            if (strIsConnected != null) {
                jwt = this.this$0;
                if (jwt.AhwBna() == TokenGroupActionType.EDIT) {
                    Integer numValueOf = jwt.valueOf();
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        this.L$0 = jwt;
                        this.L$1 = strIsConnected;
                        this.label = 1;
                        objAEQbTJ = jwt.OLrzqt(iIntValue, strIsConnected, this);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Result.Application application = Result.Companion;
                        str = strIsConnected;
                        objM7377constructorimpl = Result.m7377constructorimpl(InterfaceC26243jXf.Application.EZpvd);
                    }
                } else {
                    this.L$0 = jwt;
                    this.L$1 = strIsConnected;
                    this.label = 2;
                    objAEQbTJ = jwt.AEQbTJ(strIsConnected, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                }
                str = strIsConnected;
                objM7377constructorimpl = objAEQbTJ;
            }
            return Unit.INSTANCE;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        jwt = (jWT) this.L$0;
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = ((Result) obj).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            jwt.copydefault((InterfaceC26243jXf) objM7377constructorimpl, str);
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C23274hvD.Fragment.UscePu), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
