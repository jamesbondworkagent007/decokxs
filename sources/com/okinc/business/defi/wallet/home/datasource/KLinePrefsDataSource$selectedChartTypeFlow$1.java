package com.okinc.business.defi.wallet.home.datasource;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.home.datasource.KLinePrefsDataSource$selectedChartTypeFlow$1;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C18039faq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class KLinePrefsDataSource$selectedChartTypeFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18039faq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLinePrefsDataSource$selectedChartTypeFlow$1(C18039faq c18039faq, Continuation<? super KLinePrefsDataSource$selectedChartTypeFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c18039faq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLinePrefsDataSource$selectedChartTypeFlow$1 kLinePrefsDataSource$selectedChartTypeFlow$1 = new KLinePrefsDataSource$selectedChartTypeFlow$1(this.this$0, continuation);
        kLinePrefsDataSource$selectedChartTypeFlow$1.L$0 = obj;
        return kLinePrefsDataSource$selectedChartTypeFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
        return ((KLinePrefsDataSource$selectedChartTypeFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.fas
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    KLinePrefsDataSource$selectedChartTypeFlow$1.invokeSuspend$lambda$0(producerScope, sharedPreferences, str);
                }
            };
            SPUtils.registerOnSPChangeListener("wallet_kline_prefs", onSharedPreferenceChangeListener);
            final C18039faq c18039faq = this.this$0;
            Function0 function0 = new Function0() { // from class: o.fap
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return KLinePrefsDataSource$selectedChartTypeFlow$1.invokeSuspend$lambda$1(c18039faq, onSharedPreferenceChangeListener);
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
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, SharedPreferences sharedPreferences, String str) {
        producerScope.mo5769trySendJP2dKIU(Integer.valueOf(sharedPreferences.getInt("kline_chart_type_id", 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C18039faq c18039faq, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        c18039faq.EZpvd.getSharedPreferences("wallet_kline_prefs", 0).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
