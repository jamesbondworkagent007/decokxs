package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.nmp.home.domain.FetchDropdownInfoUseCase$execute$1;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52072vyw extends vNH<StateListAnimator, Activity> {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC50055vAf copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C52072vyw(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC50055vAf;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.vyw$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoOrdType=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: renamed from: o.vyw$Activity */
    public static final class Activity {
        public static final int EZpvd = HomeStrategyDropDownInfo.$stable;
        public final HomeStrategyDropDownInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, HomeStrategyDropDownInfo homeStrategyDropDownInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                homeStrategyDropDownInfo = activity.OLrzqt;
            }
            return activity.EZpvd(homeStrategyDropDownInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
            Intrinsics.checkNotNullParameter(homeStrategyDropDownInfo, "");
            return new Activity(homeStrategyDropDownInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HomeStrategyDropDownInfo copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.OLrzqt, ((Activity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(dropdownInfo=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
            Intrinsics.checkNotNullParameter(homeStrategyDropDownInfo, "");
            this.OLrzqt = homeStrategyDropDownInfo;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        FetchDropdownInfoUseCase$execute$1 fetchDropdownInfoUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator2;
        AbstractC43419rot actionBar2;
        HomeStrategyDropDownInfo homeStrategyDropDownInfo;
        ResponseData responseData;
        if (continuation instanceof FetchDropdownInfoUseCase$execute$1) {
            fetchDropdownInfoUseCase$execute$1 = (FetchDropdownInfoUseCase$execute$1) continuation;
            int i = fetchDropdownInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchDropdownInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchDropdownInfoUseCase$execute$1 = new FetchDropdownInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fetchDropdownInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchDropdownInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC50055vAf interfaceC50055vAf = this.copydefault;
                java.lang.String strCopydefault = stateListAnimator.copydefault();
                fetchDropdownInfoUseCase$execute$1.label = 1;
                objKWHzl = interfaceC50055vAf.KWHzl(strCopydefault, fetchDropdownInfoUseCase$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator2 = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator2 instanceof AbstractC43419rot.StateListAnimator)) {
            }
            homeStrategyDropDownInfo = (HomeStrategyDropDownInfo) actionBar2.AEQbTJ();
            if (homeStrategyDropDownInfo.getLocalTraderFirst()) {
            }
            return new Activity(homeStrategyDropDownInfo);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator2 = actionBar;
        if (!(stateListAnimator2 instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar2 = new AbstractC43419rot.StateListAnimator((HomeStrategyDropDownInfo) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator2).KWHzl()));
        } else {
            if (!(stateListAnimator2 instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator2).KWHzl());
        }
        homeStrategyDropDownInfo = (HomeStrategyDropDownInfo) actionBar2.AEQbTJ();
        if (homeStrategyDropDownInfo.getLocalTraderFirst()) {
            homeStrategyDropDownInfo.setCategory(yDY.AhwBna());
            homeStrategyDropDownInfo.setCoinCaches(new LinkedHashMap());
            homeStrategyDropDownInfo.setCoinList(yDY.AhwBna());
            homeStrategyDropDownInfo.setLeverage(yDY.AhwBna());
            homeStrategyDropDownInfo.setMaxDrawdown(yDY.AhwBna());
            homeStrategyDropDownInfo.setPnlRatio(yDY.AhwBna());
            homeStrategyDropDownInfo.setRunningTime(yDY.AhwBna());
            homeStrategyDropDownInfo.setUserRole(C56402yEa.EZpvd("LOCAL_TRADER"));
        }
        return new Activity(homeStrategyDropDownInfo);
    }
}
