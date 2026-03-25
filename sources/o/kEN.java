package o;

import com.okinc.core.arch.data.StatefulData;
import com.okinc.market.common.bean.FavoriteRecommendListData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kEN extends AbstractC32952mnL<java.util.List<? extends FavoriteRecommendListData>> {

    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends FavoriteRecommendListData>> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends FavoriteRecommendListData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<FavoriteRecommendListData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<FavoriteRecommendListData> list, java.lang.Exception exc) {
            StatefulData statefulDataError$default;
            kEN ken = kEN.this;
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
                Intrinsics.copydefault(list);
                statefulDataError$default = stateListAnimator.EZpvd(list);
            } else {
                statefulDataError$default = StatefulData.StateListAnimator.error$default(StatefulData.Companion, new java.lang.IllegalArgumentException("empty data"), null, 2, null);
            }
            ken.setValue(statefulDataError$default);
        }
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        return C54770xUr.OLrzqt(new StateListAnimator());
    }
}
