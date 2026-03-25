package com.okinc.planet.biz_home.root;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C46268tOa;
import o.C47893tyh;
import o.C56391yDq;
import o.C56442yFn;
import o.tWM;
import o.yDV;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetRootFragment$initUI$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46268tOa $this_initUI;
    int label;
    final /* synthetic */ C47893tyh this$0;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FeedPage.values().length];
            try {
                iArr[FeedPage.FOR_YOU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedPage.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedPage.NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetRootFragment$initUI$1$1(C47893tyh c47893tyh, C46268tOa c46268tOa, Continuation<? super PlanetRootFragment$initUI$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c47893tyh;
        this.$this_initUI = c46268tOa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetRootFragment$initUI$1$1(this.this$0, this.$this_initUI, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetRootFragment$initUI$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PlanetPublisherChannelId planetPublisherChannelId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl().OLrzqt() == PlanetSubPage.FEED) {
                FeedPage feedPage = (FeedPage) yDV.gEmmrt(FeedPage.values(), this.this$0.KWHzl().AEQbTJ());
                int i2 = feedPage == null ? -1 : Activity.KWHzl[feedPage.ordinal()];
                if (i2 == 1) {
                    planetPublisherChannelId = PlanetPublisherChannelId.FEED_FOR_YOU;
                } else if (i2 == 2) {
                    planetPublisherChannelId = PlanetPublisherChannelId.FEED_FOLLOWING;
                } else if (i2 == 3) {
                    planetPublisherChannelId = PlanetPublisherChannelId.FEED_NEWS;
                } else {
                    planetPublisherChannelId = PlanetPublisherChannelId.FEED_FOR_YOU;
                }
            } else {
                planetPublisherChannelId = PlanetPublisherChannelId.FEED_FOR_YOU;
            }
            PlanetPublisherChannelId planetPublisherChannelId2 = planetPublisherChannelId;
            tWM twm = (tWM) C43251rlk.copydefault(tWM.class);
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            CoordinatorLayout root = this.$this_initUI.getRoot();
            this.label = 1;
            if (tWM.StateListAnimator.openPublishPage$default(twm, contextRequireContext, planetPublisherChannelId2, null, root, null, false, this, 48, null) == objCopydefault) {
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
