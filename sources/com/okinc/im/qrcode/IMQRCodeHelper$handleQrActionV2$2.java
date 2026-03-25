package com.okinc.im.qrcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.im.qrcode.IMQRCodeHelper$handleQrActionV2$2;
import com.okinc.okimcore.model.other.QRCodeResultInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C44157sFk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.oBK;

/* JADX INFO: loaded from: classes8.dex */
public final class IMQRCodeHelper$handleQrActionV2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $baseActivity;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $qrCode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMQRCodeHelper$handleQrActionV2$2(String str, AbstractActivityC33041mov abstractActivityC33041mov, Context context, Continuation<? super IMQRCodeHelper$handleQrActionV2$2> continuation) {
        super(2, continuation);
        this.$qrCode = str;
        this.$baseActivity = abstractActivityC33041mov;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMQRCodeHelper$handleQrActionV2$2(this.$qrCode, this.$baseActivity, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMQRCodeHelper$handleQrActionV2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oBK obk = oBK.KWHzl;
            String str = this.$qrCode;
            final AbstractActivityC33041mov abstractActivityC33041mov = this.$baseActivity;
            final Context context = this.$context;
            Function1 function1 = new Function1() { // from class: o.oBP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return IMQRCodeHelper$handleQrActionV2$2.invokeSuspend$lambda$0(abstractActivityC33041mov, context, (QRCodeResultInfo) obj2);
                }
            };
            final AbstractActivityC33041mov abstractActivityC33041mov2 = this.$baseActivity;
            Function1 function12 = new Function1() { // from class: o.oBW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return IMQRCodeHelper$handleQrActionV2$2.invokeSuspend$lambda$1(abstractActivityC33041mov2, (java.lang.Throwable) obj2);
                }
            };
            this.label = 1;
            if (obk.OLrzqt(str, function1, function12, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractActivityC33041mov abstractActivityC33041mov, Context context, QRCodeResultInfo qRCodeResultInfo) {
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        oBK.KWHzl.KWHzl(context, qRCodeResultInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AbstractActivityC33041mov abstractActivityC33041mov, Throwable th) {
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        C55326xho.toast$default(C44157sFk.copydefault(th), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }
}
