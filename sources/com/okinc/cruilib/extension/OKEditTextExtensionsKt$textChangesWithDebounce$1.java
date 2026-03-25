package com.okinc.cruilib.extension;

import android.text.Editable;
import android.text.TextWatcher;
import com.okinc.cruilib.extension.OKEditTextExtensionsKt$textChangesWithDebounce$1;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class OKEditTextExtensionsKt$textChangesWithDebounce$1 extends SuspendLambda implements Function2<ProducerScope<? super CharSequence>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKEditText $this_textChangesWithDebounce;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKEditTextExtensionsKt$textChangesWithDebounce$1(OKEditText oKEditText, Continuation<? super OKEditTextExtensionsKt$textChangesWithDebounce$1> continuation) {
        super(2, continuation);
        this.$this_textChangesWithDebounce = oKEditText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKEditTextExtensionsKt$textChangesWithDebounce$1 oKEditTextExtensionsKt$textChangesWithDebounce$1 = new OKEditTextExtensionsKt$textChangesWithDebounce$1(this.$this_textChangesWithDebounce, continuation);
        oKEditTextExtensionsKt$textChangesWithDebounce$1.L$0 = obj;
        return oKEditTextExtensionsKt$textChangesWithDebounce$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super CharSequence> producerScope, Continuation<? super Unit> continuation) {
        return ((OKEditTextExtensionsKt$textChangesWithDebounce$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements TextWatcher {
        public final /* synthetic */ ProducerScope<CharSequence> AEQbTJ;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.CharSequence> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(ProducerScope<? super CharSequence> producerScope) {
            this.AEQbTJ = producerScope;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChannelResult.m7430isSuccessimpl(this.AEQbTJ.mo5769trySendJP2dKIU(editable));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final ActionBar actionBar = new ActionBar(producerScope);
            this.$this_textChangesWithDebounce.addTextChangedListener(actionBar);
            final OKEditText oKEditText = this.$this_textChangesWithDebounce;
            Function0 function0 = new Function0() { // from class: o.mHJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKEditTextExtensionsKt$textChangesWithDebounce$1.invokeSuspend$lambda$0(oKEditText, actionBar);
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
    public static final Unit invokeSuspend$lambda$0(OKEditText oKEditText, ActionBar actionBar) {
        oKEditText.removeTextChangedListener(actionBar);
        return Unit.INSTANCE;
    }
}
