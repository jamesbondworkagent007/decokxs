package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.features.address_tracker_sa.domain.model.KolStrategyRes;
import com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem;
import com.okinc.business.market.features.address_tracker_sa.repo.SaLeaderboardRepositoryImp$getLeaderBoardContent$2;
import com.okinc.business.market.features.address_tracker_sa.repo.SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1;
import com.okinc.business.market.features.address_tracker_sa.repo.SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$2;
import com.okinc.business.market.features.address_tracker_sa.repo.SaLeaderboardRepositoryImp$getSaLeaderboardConfig$2;
import com.okinc.business.market.features.address_tracker_sa.repo.SaLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1;
import com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25673jCc implements jBZ {
    public final Json AEQbTJ;
    public final InterfaceC27595jyE EZpvd;
    public final Gson KWHzl;
    public final C27640jyx OLrzqt;

    public C25673jCc(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.EZpvd = interfaceC27595jyE;
        this.OLrzqt = c27640jyx;
        this.AEQbTJ = json;
        this.KWHzl = gson;
    }

    /* JADX INFO: renamed from: o.jCc$ActionBar */
    public static final class ActionBar implements Flow<jBB> {
        public final /* synthetic */ C25673jCc EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.jCc$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C25673jCc AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C25673jCc c25673jCc) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = c25673jCc;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SaLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1 saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1;
                java.lang.Object objM7377constructorimpl;
                if (continuation instanceof SaLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1) {
                    saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1 = (SaLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1) continuation;
                    int i = saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1 = new SaLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(str.length() > 0 ? (jBB) this.AEQbTJ.KWHzl.fromJson(str, (java.lang.Class) jBB.class) : null);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("DEX", "dexRunCatching", th);
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    java.lang.Object obj3 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
                    saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, saLeaderboardRepositoryImp$subscribeLeaderBoardCards$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C25673jCc c25673jCc) {
            this.copydefault = flow;
            this.EZpvd = c25673jCc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super jBB> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.jBZ
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<jBC, OKServerException>> continuation) {
        return kAB.EZpvd(new SaLeaderboardRepositoryImp$getSaLeaderboardConfig$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.jBZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TopTradersItem>, OKServerException>> continuation) throws java.lang.Throwable {
        SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1 saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1;
        if (continuation instanceof SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1) {
            saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1 = (SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1) continuation;
            int i = saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1.label = i - Integer.MIN_VALUE;
            } else {
                saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1 = new SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$2 saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$2 = new SaLeaderboardRepositoryImp$getLeaderBoardKolStrategy$2(this, str, null);
            saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1.label = 1;
            objEZpvd = kAB.EZpvd(saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$2, saLeaderboardRepositoryImp$getLeaderBoardKolStrategy$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(((KolStrategyRes) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getKols());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o.jBZ
    public java.lang.Object KWHzl(@NotNull jBH jbh, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<jBB, OKServerException>> continuation) {
        java.util.HashMap<java.lang.String, java.lang.String> mapOLrzqt = C25667jBx.OLrzqt(jbh);
        C31198lpW.AEQbTJ(mapOLrzqt, "userWalletAddress", str);
        return kAB.EZpvd(new SaLeaderboardRepositoryImp$getLeaderBoardContent$2(this, mapOLrzqt, null), continuation);
    }

    @Override // o.jBZ
    public java.lang.Object copydefault(@NotNull RankingWsExtraParams rankingWsExtraParams, @NotNull Continuation<? super Flow<jBB>> continuation) {
        return new ActionBar(this.OLrzqt.KWHzl("dex-market-sa-leaderboard", yDY.copydefault(new WsArgV5ForWeb3("dex-market-sa-leaderboard", null, null, null, copydefault(rankingWsExtraParams), 14, null))), this);
    }

    @Override // o.jBZ
    public void EZpvd() {
        this.OLrzqt.AEQbTJ();
    }

    public final JsonObject copydefault(@NotNull RankingWsExtraParams rankingWsExtraParams) {
        Intrinsics.checkNotNullParameter(rankingWsExtraParams, "");
        return (JsonObject) this.KWHzl.fromJson(this.AEQbTJ.encodeToString(RankingWsExtraParams.Companion.serializer(), rankingWsExtraParams), JsonObject.class);
    }
}
