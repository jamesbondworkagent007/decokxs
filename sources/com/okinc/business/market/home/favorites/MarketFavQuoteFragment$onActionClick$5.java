package com.okinc.business.market.home.favorites;

import androidx.fragment.app.FragmentActivity;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.database.MarketFavDataBase;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C40440qVy;
import o.C46688tbr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.jSN;
import o.pUU;
import o.qWI;
import o.qWO;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$onActionClick$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$onActionClick$5(MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super MarketFavQuoteFragment$onActionClick$5> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketFavQuoteFragment$onActionClick$5 marketFavQuoteFragment$onActionClick$5 = new MarketFavQuoteFragment$onActionClick$5(this.this$0, continuation);
        marketFavQuoteFragment$onActionClick$5.L$0 = obj;
        return marketFavQuoteFragment$onActionClick$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$onActionClick$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        qWO qwoCopydefault;
        MarketFavQuoteFragment marketFavQuoteFragment;
        MarketFavQuoteFragment marketFavQuoteFragment2;
        UserGroup userGroup;
        String groupName;
        FragmentActivity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketFavQuoteFragment marketFavQuoteFragment3 = this.this$0;
            Result.Application application2 = Result.Companion;
            qwoCopydefault = qWO.Companion.copydefault(MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null));
            this.L$0 = marketFavQuoteFragment3;
            this.L$1 = qwoCopydefault;
            this.label = 1;
            Object objAEQbTJ = marketFavQuoteFragment3.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            marketFavQuoteFragment = marketFavQuoteFragment3;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                marketFavQuoteFragment2 = (MarketFavQuoteFragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                userGroup = (UserGroup) obj;
                if (userGroup != null && (activity = marketFavQuoteFragment2.getActivity()) != null) {
                    jSN.Companion.OLrzqt(activity, userGroup.getGroupName(), userGroup.getTranslatedGroupName());
                }
                C46688tbr c46688tbr = C46688tbr.KWHzl;
                if (userGroup != null || (groupName = userGroup.getGroupName()) == null || (strEZpvd = qWI.EZpvd(groupName)) == null) {
                    String strEZpvd = "";
                }
                c46688tbr.KWHzl("Home_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("edit fav", strEZpvd)));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                MarketFavQuoteFragment marketFavQuoteFragment4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(marketFavQuoteFragment4.getTAG(), "onActionClick: ", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            qwoCopydefault = (qWO) this.L$1;
            marketFavQuoteFragment = (MarketFavQuoteFragment) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
        MarketFavQuoteFragment$onActionClick$5$1$allGroup$1 marketFavQuoteFragment$onActionClick$5$1$allGroup$1 = new MarketFavQuoteFragment$onActionClick$5$1$allGroup$1(qwoCopydefault, (String) obj, null);
        this.L$0 = marketFavQuoteFragment;
        this.L$1 = null;
        this.label = 2;
        obj = BuildersKt.withContext(coroutineDispatcherAEQbTJ, marketFavQuoteFragment$onActionClick$5$1$allGroup$1, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        marketFavQuoteFragment2 = marketFavQuoteFragment;
        userGroup = (UserGroup) obj;
        if (userGroup != null) {
            jSN.Companion.OLrzqt(activity, userGroup.getGroupName(), userGroup.getTranslatedGroupName());
        }
        C46688tbr c46688tbr2 = C46688tbr.KWHzl;
        if (userGroup != null) {
            String strEZpvd2 = "";
            c46688tbr2.KWHzl("Home_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("edit fav", strEZpvd2)));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        }
        MarketFavQuoteFragment marketFavQuoteFragment42 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
