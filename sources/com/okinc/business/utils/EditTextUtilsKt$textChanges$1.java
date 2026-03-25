package com.okinc.business.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.okinc.business.utils.EditTextUtilsKt$textChanges$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C31194lpS;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class EditTextUtilsKt$textChanges$1 extends SuspendLambda implements Function2<ProducerScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55001xbh $this_textChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextUtilsKt$textChanges$1(C55001xbh c55001xbh, Continuation<? super EditTextUtilsKt$textChanges$1> continuation) {
        super(2, continuation);
        this.$this_textChanges = c55001xbh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditTextUtilsKt$textChanges$1 editTextUtilsKt$textChanges$1 = new EditTextUtilsKt$textChanges$1(this.$this_textChanges, continuation);
        editTextUtilsKt$textChanges$1.L$0 = obj;
        return editTextUtilsKt$textChanges$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super String> producerScope, Continuation<? super Unit> continuation) {
        return ((EditTextUtilsKt$textChanges$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            C31194lpS.copydefault();
            C55001xbh c55001xbh = this.$this_textChanges;
            final Application application = new Application(producerScope, c55001xbh);
            c55001xbh.addTextChangedListener(application);
            final C55001xbh c55001xbh2 = this.$this_textChanges;
            Function0 function0 = new Function0() { // from class: o.lpU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return EditTextUtilsKt$textChanges$1.invokeSuspend$lambda$1(c55001xbh2, application);
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
    public static final Unit invokeSuspend$lambda$1(C55001xbh c55001xbh, TextWatcher textWatcher) {
        c55001xbh.removeTextChangedListener(textWatcher);
        return Unit.INSTANCE;
    }

    public static final class Application implements TextWatcher {
        public final /* synthetic */ ProducerScope OLrzqt;
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(ProducerScope producerScope, C55001xbh c55001xbh) {
            this.OLrzqt = producerScope;
            this.copydefault = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.OLrzqt.mo5769trySendJP2dKIU(this.copydefault.isConnected());
        }
    }
}
