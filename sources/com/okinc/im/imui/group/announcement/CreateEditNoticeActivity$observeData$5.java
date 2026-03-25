package com.okinc.im.imui.group.announcement;

import com.okinc.im.imui.group.announcement.CreateEditNoticeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.nHV;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateEditNoticeActivity$observeData$5 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreateEditNoticeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditNoticeActivity$observeData$5(CreateEditNoticeActivity createEditNoticeActivity, Continuation<? super CreateEditNoticeActivity$observeData$5> continuation) {
        super(2, continuation);
        this.this$0 = createEditNoticeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateEditNoticeActivity$observeData$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((CreateEditNoticeActivity$observeData$5) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String stringExtra = this.this$0.getIntent().getStringExtra("info");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String string = StringsKt__StringsKt.hDKMBd((CharSequence) String.valueOf(((nHV) this.this$0.KWHzl()).AEQbTJ.getText())).toString();
            if (this.this$0.AEQbTJ == CreateEditNoticeActivity.Mode.CREATE && C33129mqd.OLrzqt((CharSequence) string)) {
                this.this$0.OLrzqt().copydefault(stringExtra, string);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
