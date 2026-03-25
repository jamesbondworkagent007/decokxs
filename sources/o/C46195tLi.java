package o;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.domain.PlanetFetchSelfUserInfoUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46195tLi extends AbstractC46360tRl<StateListAnimator, C46189tLc> {
    public final CoroutineDispatcher AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final tQV copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46195tLi(@NotNull tQV tqv, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.copydefault = tqv;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = coroutineDispatcher2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super C46189tLc> continuation) {
        if (!stateListAnimator.KWHzl().gEmmrt()) {
            stateListAnimator.KWHzl().KWHzl((PlanetBasicUserInfoResp) null);
            return new C46189tLc(null, false, null, 7, null);
        }
        return SupervisorKt.supervisorScope(new PlanetFetchSelfUserInfoUseCase$execute$2(this, stateListAnimator, null), continuation);
    }

    /* JADX INFO: renamed from: o.tLi$StateListAnimator */
    public static final class StateListAnimator {
        public final C46189tLc EZpvd;
        public final InterfaceC46387tSl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C46189tLc c46189tLc, InterfaceC46387tSl interfaceC46387tSl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c46189tLc = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                interfaceC46387tSl = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(c46189tLc, interfaceC46387tSl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC46387tSl KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(C46189tLc c46189tLc, @NotNull InterfaceC46387tSl interfaceC46387tSl) {
            Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
            return new StateListAnimator(c46189tLc, interfaceC46387tSl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46189tLc copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            C46189tLc c46189tLc = this.EZpvd;
            return ((c46189tLc == null ? 0 : c46189tLc.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(currentUserInfo=" + this.EZpvd + ", accountUserManager=" + this.KWHzl + ")";
        }

        public StateListAnimator(C46189tLc c46189tLc, @NotNull InterfaceC46387tSl interfaceC46387tSl) {
            Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
            this.EZpvd = c46189tLc;
            this.KWHzl = interfaceC46387tSl;
        }
    }
}
