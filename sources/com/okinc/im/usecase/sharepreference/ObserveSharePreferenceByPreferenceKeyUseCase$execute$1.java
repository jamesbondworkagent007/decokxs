package com.okinc.im.usecase.sharepreference;

import android.content.SharedPreferences;
import com.okinc.im.usecase.sharepreference.ObserveSharePreferenceByPreferenceKeyUseCase$execute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oGA;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
public final class ObserveSharePreferenceByPreferenceKeyUseCase$execute$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oGA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveSharePreferenceByPreferenceKeyUseCase$execute$1(oGA oga, String str, Continuation<? super ObserveSharePreferenceByPreferenceKeyUseCase$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = oga;
        this.$key = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveSharePreferenceByPreferenceKeyUseCase$execute$1 observeSharePreferenceByPreferenceKeyUseCase$execute$1 = new ObserveSharePreferenceByPreferenceKeyUseCase$execute$1(this.this$0, this.$key, continuation);
        observeSharePreferenceByPreferenceKeyUseCase$execute$1.L$0 = obj;
        return observeSharePreferenceByPreferenceKeyUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((ObserveSharePreferenceByPreferenceKeyUseCase$execute$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final String str = this.$key;
            final oGA oga = this.this$0;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.oGy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                    ObserveSharePreferenceByPreferenceKeyUseCase$execute$1.invokeSuspend$lambda$0(str, producerScope, oga, sharedPreferences, str2);
                }
            };
            this.this$0.EZpvd.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            Object obj2 = this.this$0.EZpvd.getAll().get(this.$key);
            if (obj2 == null) {
                obj2 = null;
            }
            producerScope.mo5769trySendJP2dKIU(obj2);
            final oGA oga2 = this.this$0;
            Function0 function0 = new Function0() { // from class: o.oGz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ObserveSharePreferenceByPreferenceKeyUseCase$execute$1.invokeSuspend$lambda$1(oga2, onSharedPreferenceChangeListener);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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
    public static final void invokeSuspend$lambda$0(String str, ProducerScope producerScope, oGA oga, SharedPreferences sharedPreferences, String str2) {
        if (Intrinsics.EZpvd((Object) str, (Object) str2)) {
            Object obj = oga.EZpvd.getAll().get(str);
            if (obj == null) {
                obj = null;
            }
            producerScope.mo5769trySendJP2dKIU(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(oGA oga, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        oga.EZpvd.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
