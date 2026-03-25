package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.okinc.business.defi.biz.core.scan.EnCodeResult;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC16400ejH;
import o.ActivityC20923gpz;
import o.C13754dXa;
import o.C33070mpX;
import o.C33570myu;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C8349bAz;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$launcher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $result;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$launcher$1$1(String str, ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$launcher$1$1> continuation) {
        super(2, continuation);
        this.$result = str;
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMultiTransferInputAddressActivity$launcher$1$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$launcher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String address;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C8349bAz c8349bAz = C8349bAz.OLrzqt;
            String str = this.$result;
            Intrinsics.copydefault((Object) str);
            this.label = 1;
            obj = c8349bAz.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        EnCodeResult enCodeResult = (EnCodeResult) obj;
        AbstractC16400ejH abstractC16400ejH = null;
        if (enCodeResult.getParsed() && enCodeResult.getType() == 1) {
            Object data = enCodeResult.getData();
            TransactionInfo transactionInfo = data instanceof TransactionInfo ? (TransactionInfo) data : null;
            if (transactionInfo == null || (address = transactionInfo.getAddress()) == null) {
            }
        } else {
            address = "";
        }
        if (address.length() > 0) {
            this.this$0.AEQbTJ().KWHzl(address);
            ActivityC20923gpz activityC20923gpz = this.this$0;
            AbstractC16400ejH abstractC16400ejH2 = activityC20923gpz.OLrzqt;
            if (abstractC16400ejH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16400ejH = abstractC16400ejH2;
            }
            C33570myu.AEQbTJ(activityC20923gpz, abstractC16400ejH.AkhnZx);
            View currentFocus = this.this$0.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C13754dXa.FragmentManager.postWhenReportersAreDone), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
