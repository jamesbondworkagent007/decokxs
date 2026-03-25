package com.okinc.im.imui.relationlist.helper;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C37730ozO;
import o.C37732ozQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sDN;

/* JADX INFO: loaded from: classes8.dex */
public final class RelationBasicInfoDisplayHelper$handleKeywordHighlight$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $ignoreSpace;
    final /* synthetic */ String $keyword;
    final /* synthetic */ String $originalText;
    final /* synthetic */ TextView $textView;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationBasicInfoDisplayHelper$handleKeywordHighlight$1(TextView textView, String str, String str2, boolean z, Continuation<? super RelationBasicInfoDisplayHelper$handleKeywordHighlight$1> continuation) {
        super(2, continuation);
        this.$textView = textView;
        this.$originalText = str;
        this.$keyword = str2;
        this.$ignoreSpace = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelationBasicInfoDisplayHelper$handleKeywordHighlight$1 relationBasicInfoDisplayHelper$handleKeywordHighlight$1 = new RelationBasicInfoDisplayHelper$handleKeywordHighlight$1(this.$textView, this.$originalText, this.$keyword, this.$ignoreSpace, continuation);
        relationBasicInfoDisplayHelper$handleKeywordHighlight$1.L$0 = obj;
        return relationBasicInfoDisplayHelper$handleKeywordHighlight$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RelationBasicInfoDisplayHelper$handleKeywordHighlight$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.helper.RelationBasicInfoDisplayHelper$handleKeywordHighlight$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $ignoreSpace;
        final /* synthetic */ String $keyword;
        final /* synthetic */ String $originalText;
        final /* synthetic */ TextView $textView;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextView textView, String str, String str2, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$textView = textView;
            this.$originalText = str;
            this.$keyword = str2;
            this.$ignoreSpace = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$textView, this.$originalText, this.$keyword, this.$ignoreSpace, continuation);
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
                TextView textView = this.$textView;
                String str = this.$originalText;
                String str2 = this.$keyword;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                boolean z = this.$ignoreSpace;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objEZpvd = c37732ozQ.EZpvd(textView, str, str2, numAEQbTJ, z, true, this);
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
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, C37730ozO.OLrzqt.OLrzqt(), null, new C04731(this.$textView, (CharSequence) obj, null), 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.helper.RelationBasicInfoDisplayHelper$handleKeywordHighlight$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TextView $textView;
            final /* synthetic */ CharSequence $title;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04731(TextView textView, CharSequence charSequence, Continuation<? super C04731> continuation) {
                super(2, continuation);
                this.$textView = textView;
                this.$title = charSequence;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04731(this.$textView, this.$title, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.$textView.setText(this.$title);
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
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, sDN.copydefault.copydefault(), null, new AnonymousClass1(this.$textView, this.$originalText, this.$keyword, this.$ignoreSpace, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
