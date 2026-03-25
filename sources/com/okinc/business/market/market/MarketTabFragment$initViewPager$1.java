package com.okinc.business.market.market;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C27857kFx;
import o.pWN;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class MarketTabFragment$initViewPager$1 extends FunctionReferenceImpl implements Function1<pWN, Fragment> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTabFragment$initViewPager$1(Object obj) {
        super(1, obj, C27857kFx.class, "factoryFragment", "factoryFragment(Lcom/okinc/market/common/MarketTab;)Landroidx/fragment/app/Fragment;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Fragment invoke(pWN pwn) {
        Intrinsics.checkNotNullParameter(pwn, "");
        return ((C27857kFx) this.receiver).KWHzl(pwn);
    }
}
