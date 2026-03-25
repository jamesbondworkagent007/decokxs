package com.okinc.okimcore.feature.cache.user;

import android.content.SharedPreferences;
import com.okinc.okimcore.feature.cache.user.UserCacheImpl$observeUserInfoFlow$1;
import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C44157sFk;
import o.C44175sGb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class UserCacheImpl$observeUserInfoFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super UserInfo>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C44175sGb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCacheImpl$observeUserInfoFlow$1(C44175sGb c44175sGb, Continuation<? super UserCacheImpl$observeUserInfoFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c44175sGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserCacheImpl$observeUserInfoFlow$1 userCacheImpl$observeUserInfoFlow$1 = new UserCacheImpl$observeUserInfoFlow$1(this.this$0, continuation);
        userCacheImpl$observeUserInfoFlow$1.L$0 = obj;
        return userCacheImpl$observeUserInfoFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super UserInfo> producerScope, Continuation<? super Unit> continuation) {
        return ((UserCacheImpl$observeUserInfoFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope2 = (ProducerScope) this.L$0;
            final String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
            final C44175sGb c44175sGb = this.this$0;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.sFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    UserCacheImpl$observeUserInfoFlow$1.invokeSuspend$lambda$0(producerScope2, strCopydefault, c44175sGb, sharedPreferences, str);
                }
            };
            this.this$0.copydefault().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            UserInfo userInfoOLrzqt = this.this$0.OLrzqt();
            this.L$0 = producerScope2;
            this.L$1 = onSharedPreferenceChangeListener2;
            this.label = 1;
            if (producerScope2.send(userInfoOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            producerScope = producerScope2;
            onSharedPreferenceChangeListener = onSharedPreferenceChangeListener2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final C44175sGb c44175sGb2 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.sFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UserCacheImpl$observeUserInfoFlow$1.invokeSuspend$lambda$1(c44175sGb2, onSharedPreferenceChangeListener);
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, String str, C44175sGb c44175sGb, SharedPreferences sharedPreferences, String str2) {
        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new UserCacheImpl$observeUserInfoFlow$1$listener$1$1(str2, str, producerScope, c44175sGb, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C44175sGb c44175sGb, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        c44175sGb.copydefault().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
