package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_userprofile.data.PlanetFollowRequest;
import com.okinc.planet.biz_userprofile.domain.PlanetFollowUserUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46203tLq extends AbstractC46360tRl<StateListAnimator, java.lang.Object> {
    public final tQP AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46203tLq(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = tqp;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
        PlanetFollowUserUseCase$execute$1 planetFollowUserUseCase$execute$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof PlanetFollowUserUseCase$execute$1) {
            planetFollowUserUseCase$execute$1 = (PlanetFollowUserUseCase$execute$1) continuation;
            int i = planetFollowUserUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetFollowUserUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                planetFollowUserUseCase$execute$1 = new PlanetFollowUserUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = planetFollowUserUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetFollowUserUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                tQP tqp = this.AEQbTJ;
                PlanetFollowRequest planetFollowRequest = new PlanetFollowRequest(stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                planetFollowUserUseCase$execute$1.label = 1;
                objOLrzqt = tqp.OLrzqt(planetFollowRequest, planetFollowUserUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tLq$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(isFollow=" + this.AEQbTJ + ", authorId=" + this.KWHzl + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = z;
            this.KWHzl = str;
        }
    }
}
