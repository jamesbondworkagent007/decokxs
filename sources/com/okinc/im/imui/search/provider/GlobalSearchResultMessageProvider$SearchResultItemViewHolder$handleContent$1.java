package com.okinc.im.imui.search.provider;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C37422otY;
import o.C37730ozO;
import o.C37732ozQ;
import o.C44166sFt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sDN;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKTextMessage $content;
    final /* synthetic */ SearchResultData.Message $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37422otY.Activity this$0;
    final /* synthetic */ C37422otY this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1(SearchResultData.Message message, C37422otY.Activity activity, OKTextMessage oKTextMessage, C37422otY c37422otY, Continuation<? super GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1> continuation) {
        super(2, continuation);
        this.$item = message;
        this.this$0 = activity;
        this.$content = oKTextMessage;
        this.this$1 = c37422otY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1 globalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1 = new GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1(this.$item, this.this$0, this.$content, this.this$1, continuation);
        globalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1.L$0 = obj;
        return globalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.provider.GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OKTextMessage $content;
        final /* synthetic */ SearchResultData.Message $item;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ C37422otY.Activity this$0;
        final /* synthetic */ C37422otY this$1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchResultData.Message message, C37422otY.Activity activity, OKTextMessage oKTextMessage, C37422otY c37422otY, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = message;
            this.this$0 = activity;
            this.$content = oKTextMessage;
            this.this$1 = c37422otY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.this$0, this.$content, this.this$1, continuation);
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
            String str;
            CoroutineScope coroutineScope;
            OKMessage message;
            OKMessageContent content;
            OKUserInfo userInfo;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                OKMessage message2 = this.$item.getMessage();
                String name = (((message2 != null ? message2.getContent() : null) instanceof OKRecallNotificationMessage) || C44166sFt.OLrzqt(this.$item.getConversation()) || (message = this.$item.getMessage()) == null || (content = message.getContent()) == null || (userInfo = content.getUserInfo()) == null) ? null : userInfo.getName();
                C37732ozQ c37732ozQ = C37732ozQ.copydefault;
                TextView textView = this.this$0.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                OKTextMessage oKTextMessage = this.$content;
                String strValueOf = String.valueOf(oKTextMessage != null ? oKTextMessage.getAliasedContent() : null);
                String str2 = (String) this.this$1.KWHzl.invoke();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.L$0 = coroutineScope2;
                this.L$1 = name;
                this.label = 1;
                Object objEZpvd = c37732ozQ.EZpvd(textView, strValueOf, str2, numAEQbTJ, false, true, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str = name;
                coroutineScope = coroutineScope2;
                obj = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope3;
            }
            CharSequence charSequenceAppend = (CharSequence) obj;
            if (C33129mqd.OLrzqt((CharSequence) str) && this.$item.getConversation().getConversationType() == OKConversationType.GROUP) {
                charSequenceAppend = new SpannableStringBuilder().append((CharSequence) (str + ": ")).append(charSequenceAppend);
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, C37730ozO.OLrzqt.OLrzqt(), null, new C04781(this.this$0, charSequenceAppend, null), 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.search.provider.GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CharSequence $displayedContent;
            int label;
            final /* synthetic */ C37422otY.Activity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04781(C37422otY.Activity activity, CharSequence charSequence, Continuation<? super C04781> continuation) {
                super(2, continuation);
                this.this$0 = activity;
                this.$displayedContent = charSequence;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04781(this.this$0, this.$displayedContent, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.OLrzqt.OLrzqt.setText(this.$displayedContent);
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
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, sDN.copydefault.copydefault(), null, new AnonymousClass1(this.$item, this.this$0, this.$content, this.this$1, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
