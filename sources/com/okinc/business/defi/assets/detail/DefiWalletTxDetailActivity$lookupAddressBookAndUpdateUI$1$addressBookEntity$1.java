package com.okinc.business.defi.assets.detail;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC10049bhC;
import o.C10854bwM;
import o.C56391yDq;
import o.C56442yFn;
import o.cGN;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AddressBookEntity>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ ActivityC10049bhC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1(String str, ActivityC10049bhC activityC10049bhC, Continuation<? super DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1> continuation) {
        super(2, continuation);
        this.$address = str;
        this.this$0 = activityC10049bhC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1(this.$address, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AddressBookEntity> continuation) {
        return ((DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cGN cgn = cGN.EZpvd;
            String str = this.$address;
            this.label = 1;
            obj = cgn.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (AddressBookEntity) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AddressBookEntity addressBookEntity = (AddressBookEntity) obj;
        if (addressBookEntity != null) {
            return addressBookEntity;
        }
        C10854bwM c10854bwM = this.this$0.copydefault;
        if (c10854bwM != null) {
            ActivityC10049bhC activityC10049bhC = this.this$0;
            String str2 = this.$address;
            String strKWHzl = activityC10049bhC.KWHzl(c10854bwM, str2);
            if (!Intrinsics.EZpvd((Object) strKWHzl, (Object) str2)) {
                cGN cgn2 = cGN.EZpvd;
                this.label = 2;
                obj = cgn2.OLrzqt(strKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                return (AddressBookEntity) obj;
            }
        }
        return null;
    }
}
