package com.okinc.im.imui.search.provider;

import android.widget.TextView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C37417otT;
import o.C37683oyU;
import o.C37716ozA;
import o.C43251rlk;
import o.C44461sQr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sDN;
import o.sKH;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isVipChat;
    final /* synthetic */ SearchResultData.Message $item;
    int label;
    final /* synthetic */ C37417otT.TaskDescription this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1(SearchResultData.Message message, C37417otT.TaskDescription taskDescription, boolean z, Continuation<? super ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1> continuation) {
        super(2, continuation);
        this.$item = message;
        this.this$0 = taskDescription;
        this.$isVipChat = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1(this.$item, this.this$0, this.$isVipChat, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C44461sQr c44461sQr;
        InterfaceC35180nqU interfaceC35180nqU;
        sKH skhCopydefault;
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ;
        AnonymousClass1 anonymousClass1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage message = this.$item.getMessage();
            if (message != null && (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) != null && (skhCopydefault = interfaceC35180nqU.copydefault()) != null) {
                this.label = 1;
                obj = skhCopydefault.OLrzqt(message, (String) null, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                c44461sQr = null;
                mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                anonymousClass1 = new AnonymousClass1(c44461sQr, this.this$0, this.$isVipChat, null);
                this.label = 2;
                if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        c44461sQr = (C44461sQr) obj;
        mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
        anonymousClass1 = new AnonymousClass1(c44461sQr, this.this$0, this.$isVipChat, null);
        this.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.search.provider.ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C44461sQr $displayUserInfo;
        final /* synthetic */ boolean $isVipChat;
        int label;
        final /* synthetic */ C37417otT.TaskDescription this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C44461sQr c44461sQr, C37417otT.TaskDescription taskDescription, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$displayUserInfo = c44461sQr;
            this.this$0 = taskDescription;
            this.$isVipChat = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$displayUserInfo, this.this$0, this.$isVipChat, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C44461sQr c44461sQr = this.$displayUserInfo;
                if (c44461sQr != null) {
                    C37417otT.TaskDescription taskDescription = this.this$0;
                    boolean z = this.$isVipChat;
                    taskDescription.OLrzqt.gEmmrt.setText(C37683oyU.copydefault(c44461sQr));
                    TextView textView = taskDescription.OLrzqt.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    C37716ozA.updateTagViewWithTagInfo$default(textView, c44461sQr.EZpvd(), 0, null, false, false, z, 30, null);
                    taskDescription.KWHzl(c44461sQr);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
