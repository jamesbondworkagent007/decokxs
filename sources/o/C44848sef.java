package o;

import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import com.okinc.okex.campaign.usecase.GetRecentCampaignsUseCase$invoke$1;
import com.okinc.okex.campaign.usecase.GetRecentCampaignsUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44848sef {
    public final InterfaceC44921sfz EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C44848sef(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC44921sfz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<StateListAnimator>> continuation) throws java.lang.Throwable {
        GetRecentCampaignsUseCase$invoke$1 getRecentCampaignsUseCase$invoke$1;
        if (continuation instanceof GetRecentCampaignsUseCase$invoke$1) {
            getRecentCampaignsUseCase$invoke$1 = (GetRecentCampaignsUseCase$invoke$1) continuation;
            int i = getRecentCampaignsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRecentCampaignsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRecentCampaignsUseCase$invoke$1 = new GetRecentCampaignsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getRecentCampaignsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRecentCampaignsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetRecentCampaignsUseCase$invoke$2 getRecentCampaignsUseCase$invoke$2 = new GetRecentCampaignsUseCase$invoke$2(this, null);
            getRecentCampaignsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getRecentCampaignsUseCase$invoke$2, getRecentCampaignsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.sef$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final java.util.List<CampaignDisplayModel> AEQbTJ;
        public final boolean KWHzl;
        public final java.util.List<CampaignDisplayModel> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sef$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                list2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(z, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CampaignDisplayModel> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(boolean z, @NotNull java.util.List<CampaignDisplayModel> list, @NotNull java.util.List<CampaignDisplayModel> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new StateListAnimator(z, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CampaignDisplayModel> OLrzqt() {
            return this.OLrzqt;
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
            return this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RecentCampaignDisplayModel(isUserRiskControlled=" + this.KWHzl + ", ongoingCampaigns=" + this.AEQbTJ + ", endedCampaigns=" + this.OLrzqt + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.util.List<CampaignDisplayModel> list, @NotNull java.util.List<CampaignDisplayModel> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.KWHzl = z;
            this.AEQbTJ = list;
            this.OLrzqt = list2;
        }
    }
}
