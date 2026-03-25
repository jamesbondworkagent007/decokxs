package o;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.features.holders.data.HolderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26288jYx implements jYB {
    public final C27640jyx copydefault;

    /* JADX INFO: renamed from: o.jYx$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.List<? extends CoinRankingWsData>> {
    }

    @yCM
    public C26288jYx(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        this.copydefault = c27640jyx;
    }

    @Override // o.jYB
    public java.lang.Object OLrzqt(@NotNull C27614jyX c27614jyX, @NotNull Continuation<? super Flow<java.lang.String>> continuation) {
        this.copydefault.AEQbTJ();
        return new Activity(this.copydefault.KWHzl("dex-market-v3", yDY.copydefault(new WsArgV5ForWeb3("dex-market-v3", null, c27614jyX.AEQbTJ(), c27614jyX.EZpvd(), null, 18, null))), this);
    }

    @Override // o.jYB
    public void EZpvd() {
        this.copydefault.AEQbTJ();
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        try {
            java.lang.Object objFromJson = new GsonBuilder().create().fromJson(str, new StateListAnimator().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            CoinRankingWsData coinRankingWsData = (CoinRankingWsData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objFromJson);
            if (coinRankingWsData == null) {
                return "";
            }
            java.lang.String holders = coinRankingWsData.getHolders();
            return holders != null ? holders : "";
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: o.jYx$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Flow<java.lang.String> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C26288jYx KWHzl;

        /* JADX INFO: renamed from: o.jYx$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C26288jYx AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C26288jYx c26288jYx) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c26288jYx;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HolderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1 holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1;
                if (continuation instanceof HolderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1) {
                    holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1 = (HolderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1) continuation;
                    int i = holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1 = new HolderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.lang.String strAEQbTJ = this.AEQbTJ.AEQbTJ((java.lang.String) obj);
                    holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(strAEQbTJ, holderOverviewRepositoryImpl$subscribeHolderAmount$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C26288jYx c26288jYx) {
            this.EZpvd = flow;
            this.KWHzl = c26288jYx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
