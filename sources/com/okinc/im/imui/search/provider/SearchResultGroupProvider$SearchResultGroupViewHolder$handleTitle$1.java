package com.okinc.im.imui.search.provider;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C37482ouf;
import o.C37730ozO;
import o.C37732ozQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $title;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37482ouf.ActionBar this$0;
    final /* synthetic */ C37482ouf this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1(C37482ouf.ActionBar actionBar, String str, C37482ouf c37482ouf, Continuation<? super SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1> continuation) {
        super(2, continuation);
        this.this$0 = actionBar;
        this.$title = str;
        this.this$1 = c37482ouf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1 searchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1 = new SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1(this.this$0, this.$title, this.this$1, continuation);
        searchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1.L$0 = obj;
        return searchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.provider.SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $title;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C37482ouf.ActionBar this$0;
        final /* synthetic */ C37482ouf this$1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C37482ouf.ActionBar actionBar, String str, C37482ouf c37482ouf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = actionBar;
            this.$title = str;
            this.this$1 = c37482ouf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$title, this.this$1, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                C37732ozQ c37732ozQ = C37732ozQ.copydefault;
                TextView textView = this.this$0.EZpvd.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                String str = this.$title;
                String str2 = (String) this.this$1.AEQbTJ.invoke();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objEZpvd = c37732ozQ.EZpvd(textView, str, str2, numAEQbTJ, true, true, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, C37730ozO.OLrzqt.OLrzqt(), null, new C04811(this.this$0, (CharSequence) obj, null), 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.provider.SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CharSequence $text;
            int label;
            final /* synthetic */ C37482ouf.ActionBar this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04811(C37482ouf.ActionBar actionBar, CharSequence charSequence, Continuation<? super C04811> continuation) {
                super(2, continuation);
                this.this$0 = actionBar;
                this.$text = charSequence;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04811(this.this$0, this.$text, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd.gEmmrt.setText(this.$text);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, sDN.copydefault.copydefault(), null, new AnonymousClass1(this.this$0, this.$title, this.this$1, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
