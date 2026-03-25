package com.okinc.planet.biz_content.input.token;

import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C47566tsY;
import o.C47621tta;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class TokenViewModel$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PublisherTokenInfo> $allTokens;
    final /* synthetic */ String $q;
    int label;
    final /* synthetic */ C47621tta this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$filter$1(String str, List<PublisherTokenInfo> list, C47621tta c47621tta, Continuation<? super TokenViewModel$filter$1> continuation) {
        super(2, continuation);
        this.$q = str;
        this.$allTokens = list;
        this.this$0 = c47621tta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenViewModel$filter$1(this.$q, this.$allTokens, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenViewModel$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String lowerCase = StringsKt__StringsKt.hDKMBd((CharSequence) this.$q).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            List<PublisherTokenInfo> list = this.$allTokens;
            if (lowerCase.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String lowerCase2 = ((PublisherTokenInfo) obj2).getName().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            List<PublisherTokenInfo> list2 = this.$allTokens;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ((C47566tsY) value).copydefault(list2, list)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
