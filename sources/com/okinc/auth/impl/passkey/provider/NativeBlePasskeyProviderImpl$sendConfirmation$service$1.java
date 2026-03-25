package com.okinc.auth.impl.passkey.provider;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5947aGA;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeBlePasskeyProviderImpl$sendConfirmation$service$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BluetoothGattService>, Object> {
    final /* synthetic */ BluetoothGatt $gatt;
    int label;
    final /* synthetic */ C5947aGA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeBlePasskeyProviderImpl$sendConfirmation$service$1(C5947aGA c5947aGA, BluetoothGatt bluetoothGatt, Continuation<? super NativeBlePasskeyProviderImpl$sendConfirmation$service$1> continuation) {
        super(2, continuation);
        this.this$0 = c5947aGA;
        this.$gatt = bluetoothGatt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NativeBlePasskeyProviderImpl$sendConfirmation$service$1(this.this$0, this.$gatt, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BluetoothGattService> continuation) {
        return ((NativeBlePasskeyProviderImpl$sendConfirmation$service$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5947aGA c5947aGA = this.this$0;
            BluetoothGatt bluetoothGatt = this.$gatt;
            this.label = 1;
            obj = C5947aGA.getServiceWithRetry$default(c5947aGA, bluetoothGatt, "sendConfirmation", 0, 0L, this, 12, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
