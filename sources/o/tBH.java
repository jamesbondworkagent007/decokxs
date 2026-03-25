package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_performance.data.ProfileChartDto;
import com.okinc.planet.biz_performance.data.ProfileChartTypeDto;
import com.okinc.planet.biz_performance.usecase.FetchProfileChartDataUseCase$execute$1;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.tQP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBH extends AbstractC46360tRl<StateListAnimator, java.util.List<? extends ChartProfileDataResp>> {
    public final tQP KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC46360tRl
    public /* synthetic */ java.lang.Object AEQbTJ(StateListAnimator stateListAnimator, Continuation<? super java.util.List<? extends ChartProfileDataResp>> continuation) {
        return KWHzl(stateListAnimator, (Continuation<? super java.util.List<ChartProfileDataResp>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tBH(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tQP tqp) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = tqp;
    }

    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final ProfileChartTypeDto EZpvd;
        public final java.lang.Integer OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.okinc.planet.biz_performance.data.ProfileChartTypeDto)
  (r2v0 java.lang.Integer)
  (r3v0 java.lang.String)
  (r4v0 boolean)
 A[MD:(com.okinc.planet.biz_performance.data.ProfileChartTypeDto, java.lang.Integer, java.lang.String, boolean):void (m)] call: o.tBH.StateListAnimator.<init>(com.okinc.planet.biz_performance.data.ProfileChartTypeDto, java.lang.Integer, java.lang.String, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(ProfileChartTypeDto profileChartTypeDto, java.lang.Integer num, java.lang.String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(profileChartTypeDto, num, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-L5Tsb3A$default, reason: not valid java name */
        public static /* synthetic */ StateListAnimator m8712copyL5Tsb3A$default(StateListAnimator stateListAnimator, ProfileChartTypeDto profileChartTypeDto, java.lang.Integer num, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profileChartTypeDto = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                num = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 8) != 0) {
                z = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(profileChartTypeDto, num, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull ProfileChartTypeDto profileChartTypeDto, java.lang.Integer num, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(profileChartTypeDto, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(profileChartTypeDto, num, str, z, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
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
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && PlanetAuthorId.OLrzqt(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.Integer num = this.OLrzqt;
            return (((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + PlanetAuthorId.AEQbTJ(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(chartType=" + this.EZpvd + ", days=" + this.OLrzqt + ", authorId=" + PlanetAuthorId.EZpvd(this.AEQbTJ) + ", preview=" + this.copydefault + ")";
        }

        public StateListAnimator(ProfileChartTypeDto profileChartTypeDto, java.lang.Integer num, java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(profileChartTypeDto, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = profileChartTypeDto;
            this.OLrzqt = num;
            this.AEQbTJ = str;
            this.copydefault = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super java.util.List<ChartProfileDataResp>> continuation) throws java.lang.Throwable {
        FetchProfileChartDataUseCase$execute$1 fetchProfileChartDataUseCase$execute$1;
        ProfileChartDto profileChartDto;
        if (continuation instanceof FetchProfileChartDataUseCase$execute$1) {
            fetchProfileChartDataUseCase$execute$1 = (FetchProfileChartDataUseCase$execute$1) continuation;
            int i = fetchProfileChartDataUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchProfileChartDataUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchProfileChartDataUseCase$execute$1 = new FetchProfileChartDataUseCase$execute$1(this, continuation);
            }
        }
        FetchProfileChartDataUseCase$execute$1 fetchProfileChartDataUseCase$execute$12 = fetchProfileChartDataUseCase$execute$1;
        java.lang.Object objM8735getChartsDataJoYFazM$default = fetchProfileChartDataUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchProfileChartDataUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objM8735getChartsDataJoYFazM$default);
                tQP tqp = this.KWHzl;
                java.lang.String strEZpvd = stateListAnimator.EZpvd();
                java.lang.Integer numOLrzqt = stateListAnimator.OLrzqt();
                boolean zCopydefault = stateListAnimator.copydefault();
                fetchProfileChartDataUseCase$execute$12.label = 1;
                objM8735getChartsDataJoYFazM$default = tQP.Application.m8735getChartsDataJoYFazM$default(tqp, strEZpvd, null, numOLrzqt, zCopydefault, fetchProfileChartDataUseCase$execute$12, 2, null);
                if (objM8735getChartsDataJoYFazM$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objM8735getChartsDataJoYFazM$default);
            }
            java.util.List list = (java.util.List) ((ResponseData) objM8735getChartsDataJoYFazM$default).getData();
            java.util.List<ChartProfileDataResp> listEZpvd = (list == null || (profileChartDto = (ProfileChartDto) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : profileChartDto.EZpvd();
            return listEZpvd == null ? yDY.AhwBna() : listEZpvd;
        } catch (java.lang.Exception unused) {
            return yDY.AhwBna();
        }
    }
}
