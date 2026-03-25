package o;

import com.okinc.planet.biz_setting.domain.PlanetProfileSettingDataUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tIA extends AbstractC46360tRl<Activity, C46126tIu> {
    public final C46388tSm AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final tQP copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tIA(@NotNull C46388tSm c46388tSm, @NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(c46388tSm, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c46388tSm;
        this.copydefault = tqp;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull Activity activity, @NotNull Continuation<? super C46126tIu> continuation) {
        return SupervisorKt.supervisorScope(new PlanetProfileSettingDataUseCase$execute$2(this, null), continuation);
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class TaskDescription extends Activity {
            public static final TaskDescription KWHzl = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private Activity() {
        }
    }
}
