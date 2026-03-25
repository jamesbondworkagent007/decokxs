package com.okinc.planet.biz_content.leaderboard.adapter;

import com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C47649tuB;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class PlanetLatestNewsAdapter$updatePriceData$2 extends FunctionReferenceImpl implements Function1<SpotlightToken, String> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetLatestNewsAdapter$updatePriceData$2(Object obj) {
        super(1, obj, C47649tuB.class, "getTokenSubscriptionKey", "getTokenSubscriptionKey(Lcom/okinc/planet/biz_content/leaderboard/bean/SpotlightToken;)Ljava/lang/String;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(SpotlightToken spotlightToken) {
        Intrinsics.checkNotNullParameter(spotlightToken, "");
        return ((C47649tuB) this.receiver).copydefault(spotlightToken);
    }
}
