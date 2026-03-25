package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressField;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C43662rtX;
import o.C55001xbh;
import o.C55009xbp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rAX;
import o.rGL;
import o.rOZ;

/* JADX INFO: loaded from: classes23.dex */
public final class InputTextItemView$observe$1$1$10$onItemClick$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ rAX<String> $cur;
    final /* synthetic */ int $position;
    final /* synthetic */ rGL $viewModel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rOZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTextItemView$observe$1$1$10$onItemClick$2$1(int i, rOZ roz, rAX<String> rax, rGL rgl, Continuation<? super InputTextItemView$observe$1$1$10$onItemClick$2$1> continuation) {
        super(2, continuation);
        this.$position = i;
        this.this$0 = roz;
        this.$cur = rax;
        this.$viewModel = rgl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InputTextItemView$observe$1$1$10$onItemClick$2$1 inputTextItemView$observe$1$1$10$onItemClick$2$1 = new InputTextItemView$observe$1$1$10$onItemClick$2$1(this.$position, this.this$0, this.$cur, this.$viewModel, continuation);
        inputTextItemView$observe$1$1$10$onItemClick$2$1.L$0 = obj;
        return inputTextItemView$observe$1$1$10$onItemClick$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputTextItemView$observe$1$1$10$onItemClick$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhEZpvd2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0) && this.$position < this.this$0.OLrzqt.size()) {
                AutoCompleteAddress autoCompleteAddress = (AutoCompleteAddress) this.this$0.OLrzqt.get(this.$position);
                for (AddressField addressField : autoCompleteAddress.getFields()) {
                    if (addressField.getProhibited()) {
                        String message = addressField.getMessage();
                        Context context = this.this$0.getContext();
                        C55326xho.toast$default(message, context != null ? context.getDrawable(C43662rtX.Activity.OqFWZa) : null, 0, (Integer) null, 0, 0, 30, (Object) null);
                        C55009xbp c55009xbpFIwbmz = this.this$0.KWHzl.EZpvd.fIwbmz();
                        if (c55009xbpFIwbmz != null && (c55001xbhEZpvd2 = c55009xbpFIwbmz.EZpvd()) != null) {
                            String value = this.$cur.getValue();
                            if (value == null) {
                                value = "";
                            }
                            c55001xbhEZpvd2.setText(value);
                        }
                        C55009xbp c55009xbpFIwbmz2 = this.this$0.KWHzl.EZpvd.fIwbmz();
                        if (c55009xbpFIwbmz2 != null && (c55001xbhEZpvd = c55009xbpFIwbmz2.EZpvd()) != null) {
                            String value2 = this.$cur.getValue();
                            c55001xbhEZpvd.setSelection(value2 != null ? value2.length() : 0);
                        }
                        return Unit.INSTANCE;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (AddressField addressField2 : autoCompleteAddress.getFields()) {
                    linkedHashMap.put(addressField2.getId(), new Pair(addressField2.getValue(), addressField2.getValueName()));
                    pUU.OLrzqt("autoComplete", addressField2.getId() + ", " + addressField2.getValue() + ", " + addressField2.getValueName());
                }
                this.$viewModel.AuCTelauCTel().setValue(linkedHashMap);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
