package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.content.Context;
import android.widget.TextView;
import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C17180ext;
import o.C19012ftJ;
import o.C54989xbV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultFragment$addDataListener$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19012ftJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultFragment$addDataListener$4(C19012ftJ c19012ftJ, Continuation<? super TokenSearchResultFragment$addDataListener$4> continuation) {
        super(2, continuation);
        this.this$0 = c19012ftJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultFragment$addDataListener$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultFragment$addDataListener$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SearchSortType, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19012ftJ this$0;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$4$1$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SearchSortType.values().length];
                try {
                    iArr[SearchSortType.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SearchSortType.TURNOVER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19012ftJ c19012ftJ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19012ftJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchSortType searchSortType, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(searchSortType, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            C54989xbV c54989xbV;
            TextView textViewEZpvd;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = StateListAnimator.copydefault[((SearchSortType) this.L$0).ordinal()];
                if (i == 1) {
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        string = context.getString(C13754dXa.FragmentManager.Rcolor);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = this.this$0.getContext();
                    string = context2 != null ? context2.getString(C13754dXa.FragmentManager.Rbool) : null;
                }
                C17180ext c17180ext = this.this$0.djBIcL;
                if (c17180ext != null && (c54989xbV = c17180ext.OLrzqt) != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
                    textViewEZpvd.setText(string);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<SearchSortType> stateFlowEZpvd = this.this$0.isConnected().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
}
