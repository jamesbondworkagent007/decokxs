package com.okinc.business.defi.wallet.home.addressDetail.data.resposity;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.ProfilePnlPrefsDataSource$currencyToggleFlow$1;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;
import o.eWB;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfilePnlPrefsDataSource$currencyToggleFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eWB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePnlPrefsDataSource$currencyToggleFlow$1(eWB ewb, Continuation<? super ProfilePnlPrefsDataSource$currencyToggleFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = ewb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePnlPrefsDataSource$currencyToggleFlow$1 profilePnlPrefsDataSource$currencyToggleFlow$1 = new ProfilePnlPrefsDataSource$currencyToggleFlow$1(this.this$0, continuation);
        profilePnlPrefsDataSource$currencyToggleFlow$1.L$0 = obj;
        return profilePnlPrefsDataSource$currencyToggleFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return ((ProfilePnlPrefsDataSource$currencyToggleFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final eWB ewb = this.this$0;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.eWx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    ProfilePnlPrefsDataSource$currencyToggleFlow$1.invokeSuspend$lambda$0(producerScope, ewb, sharedPreferences, str);
                }
            };
            SPUtils.registerOnSPChangeListener("wallet_profile_prefs", onSharedPreferenceChangeListener);
            final eWB ewb2 = this.this$0;
            Function0 function0 = new Function0() { // from class: o.eWy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ProfilePnlPrefsDataSource$currencyToggleFlow$1.invokeSuspend$lambda$1(ewb2, onSharedPreferenceChangeListener);
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
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, eWB ewb, SharedPreferences sharedPreferences, String str) {
        producerScope.mo5769trySendJP2dKIU(Boolean.valueOf(ewb.KWHzl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(eWB ewb, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        ewb.OLrzqt.getSharedPreferences("wallet_profile_prefs", 0).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
