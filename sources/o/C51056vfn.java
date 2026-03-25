package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EditGridProfitAutoReinvestRequest;
import com.okinc.unify_trade.biz.EditGridProfitAutoReinvestResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51056vfn extends xKQ<java.util.List<? extends EditGridProfitAutoReinvestResponse>> {
    public EditGridProfitAutoReinvestRequest copydefault;

    public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = new EditGridProfitAutoReinvestRequest(stateListAnimator.OLrzqt(), stateListAnimator.EZpvd());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.coroutines.Continuation<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EditGridProfitAutoReinvestResponse>>>] */
    @Override // o.xKQ
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<? extends EditGridProfitAutoReinvestResponse>>> continuation) {
        EditGridProfitAutoReinvestRequest editGridProfitAutoReinvestRequest = this.copydefault;
        if (editGridProfitAutoReinvestRequest != null) {
            return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).editGridProfitAutoReinvest(editGridProfitAutoReinvestRequest, continuation);
        }
        throw new java.lang.IllegalArgumentException("Input is null");
    }

    /* JADX INFO: renamed from: o.vfn$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.EZpvd + ", enabled=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.AEQbTJ = z;
        }
    }
}
