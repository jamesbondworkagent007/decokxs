package com.okinc.business.market.watch.ui;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.watch.ui.GroupWatchListFragment$onActionClick$3;
import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27996kLa;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.kKI;
import o.qTA;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$onActionClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$onActionClick$3(kKI kki, String str, Continuation<? super GroupWatchListFragment$onActionClick$3> continuation) {
        super(2, continuation);
        this.this$0 = kki;
        this.$type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListFragment$onActionClick$3(this.this$0, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$onActionClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.watch.ui.GroupWatchListFragment$onActionClick$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C27996kLa, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $type;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ kKI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, kKI kki, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = str;
            this.this$0 = kki;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$type, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C27996kLa c27996kLa, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c27996kLa, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final C27996kLa c27996kLa = (C27996kLa) this.L$0;
                final String str = this.$type;
                if (str != null) {
                    final kKI kki = this.this$0;
                    C32866mlf.onEvent$default("DiscoverPage_Favorites_FloatingWindow_Click", (TrackChannel[]) null, new Function1() { // from class: o.kKU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return GroupWatchListFragment$onActionClick$3.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(c27996kLa, kki, str, (EventParamsList) obj2);
                        }
                    }, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(C27996kLa c27996kLa, kKI kki, String str, EventParamsList eventParamsList) {
            String instId;
            String instType;
            String strAEQbTJ;
            String strCopydefault = c27996kLa.copydefault();
            CoinQuote coinQuote = kki.fJNWhG;
            String str2 = "";
            if (coinQuote == null || (instId = coinQuote.getInstId()) == null) {
                instId = "";
            }
            eventParamsList.put("token_pair", instId, false);
            CoinQuote coinQuote2 = kki.fJNWhG;
            if (coinQuote2 != null && (instType = coinQuote2.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
                str2 = strAEQbTJ;
            }
            eventParamsList.put("biz_type", str2, true);
            if (strCopydefault == null) {
                strCopydefault = "all";
            }
            eventParamsList.put("tab", strCopydefault, true);
            eventParamsList.put("button_type", str, false);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKI kki = this.this$0;
            GroupWatchListViewModel groupWatchListViewModelAkhnZx = kki.AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$type, this.this$0, null);
            this.label = 1;
            if (kki.OLrzqt(groupWatchListViewModelAkhnZx, anonymousClass1, this) == objCopydefault) {
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
