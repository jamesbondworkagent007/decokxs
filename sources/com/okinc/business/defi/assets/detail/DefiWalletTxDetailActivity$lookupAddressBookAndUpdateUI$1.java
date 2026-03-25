package com.okinc.business.defi.assets.detail;

import android.widget.TextView;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC10049bhC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ TextView $walletNameTag;
    int label;
    final /* synthetic */ ActivityC10049bhC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1(TextView textView, String str, ActivityC10049bhC activityC10049bhC, Continuation<? super DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1> continuation) {
        super(2, continuation);
        this.$walletNameTag = textView;
        this.$address = str;
        this.this$0 = activityC10049bhC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1(this.$walletNameTag, this.$address, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1 defiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1 = new DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1(this.$address, this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, defiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1$addressBookEntity$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AddressBookEntity addressBookEntity = (AddressBookEntity) obj;
        if (addressBookEntity != null) {
            this.$walletNameTag.setVisibility(0);
            this.$walletNameTag.setText(addressBookEntity.getName());
        } else {
            this.$walletNameTag.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
