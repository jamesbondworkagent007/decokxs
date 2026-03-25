package com.okinc.ok_kyc_core.presentation.countrylist;

import android.text.Editable;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import o.C42095rGd;
import o.C56391yDq;
import o.C56442yFn;
import o.rFY;

/* JADX INFO: loaded from: classes16.dex */
public final class CountryListFragment$onCreateContent$4 extends SuspendLambda implements Function2<List<? extends C42095rGd.TaskDescription>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rFY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryListFragment$onCreateContent$4(rFY rfy, Continuation<? super CountryListFragment$onCreateContent$4> continuation) {
        super(2, continuation);
        this.this$0 = rfy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CountryListFragment$onCreateContent$4 countryListFragment$onCreateContent$4 = new CountryListFragment$onCreateContent$4(this.this$0, continuation);
        countryListFragment$onCreateContent$4.L$0 = obj;
        return countryListFragment$onCreateContent$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C42095rGd.TaskDescription> list, Continuation<? super Unit> continuation) {
        return ((CountryListFragment$onCreateContent$4) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        String string2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            if (this.this$0.KWHzl) {
                this.this$0.KWHzl = false;
                return Unit.INSTANCE;
            }
            this.this$0.OLrzqt().KWHzl.copydefault();
            this.this$0.OLrzqt().AYXKKw.setVisibility(0);
            List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list);
            if (listFJNWhG.isEmpty()) {
                this.this$0.OLrzqt().gEmmrt.setVisibility(8);
                this.this$0.OLrzqt().EZpvd.setVisibility(0);
            } else {
                this.this$0.OLrzqt().gEmmrt.setVisibility(0);
                this.this$0.OLrzqt().EZpvd.setVisibility(8);
            }
            Editable text = this.this$0.OLrzqt().AYXKKw.EZpvd().getText();
            if (text == null || (string2 = text.toString()) == null || (string = StringsKt__StringsKt.hDKMBd((CharSequence) string2).toString()) == null) {
                string = "";
            }
            if (StringsKt__StringsKt.fARcdN((CharSequence) string)) {
                this.this$0.EZpvd((List<C42095rGd.TaskDescription>) listFJNWhG);
            }
            this.this$0.EZpvd.AhwBna(listFJNWhG);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
