package o;

import com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.auth.impl.reset2fa.domain.reset2fa.Reset2faUseCase$getPreLoginPreconditionFlow$1;
import com.okinc.auth.impl.reset2fa.domain.reset2fa.Reset2faUseCase$getPreLoginPreconditionFlow$2;
import com.okinc.auth.impl.reset2fa.domain.reset2fa.Reset2faUseCase$getPreconditionFlow$1;
import com.okinc.auth.impl.reset2fa.domain.reset2fa.Reset2faUseCase$getPreconditionFlow$2;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6623aSo {
    public final Reset2faRemoteDataSource AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C6623aSo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Reset2faRemoteDataSource reset2faRemoteDataSource) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(reset2faRemoteDataSource, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = reset2faRemoteDataSource;
    }

    /* JADX INFO: renamed from: o.aSo$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class StateListAnimator {
        public static final Application Companion = new Application(null);

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.aSo$StateListAnimator$Activity */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class Activity extends StateListAnimator {
            public static final Activity copydefault = new Activity();

            private Activity() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.aSo$StateListAnimator$ActionBar */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class ActionBar extends StateListAnimator {
            public static final int KWHzl = ResetMfaPreconditionResponse.$stable;
            public final ResetMfaPreconditionResponse AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ResetMfaPreconditionResponse OLrzqt() {
                return this.AEQbTJ;
            }

            public ActionBar(ResetMfaPreconditionResponse resetMfaPreconditionResponse) {
                super(null);
                this.AEQbTJ = resetMfaPreconditionResponse;
            }
        }

        /* JADX INFO: renamed from: o.aSo$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class C0821StateListAnimator extends StateListAnimator {
            public static final int KWHzl = ResetMfaPreconditionResponse.$stable;
            public final ResetMfaPreconditionResponse EZpvd;

            public C0821StateListAnimator(ResetMfaPreconditionResponse resetMfaPreconditionResponse) {
                super(null);
                this.EZpvd = resetMfaPreconditionResponse;
            }
        }

        /* JADX INFO: renamed from: o.aSo$StateListAnimator$TaskDescription */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class TaskDescription extends StateListAnimator {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.copydefault;
            }

            public TaskDescription(java.lang.String str) {
                super(null);
                this.copydefault = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:26) call: o.aSo.StateListAnimator.TaskDescription.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ TaskDescription(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }

        /* JADX INFO: renamed from: o.aSo$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aSo.StateListAnimator.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }
    }

    public final Flow<StateListAnimator> copydefault(SubdomainStrategy subdomainStrategy) {
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.flow(new Reset2faUseCase$getPreconditionFlow$1(this, subdomainStrategy, null)), new Reset2faUseCase$getPreconditionFlow$2(null)), this.KWHzl);
    }

    public final Flow<StateListAnimator> AEQbTJ(@NotNull java.lang.String str, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.flow(new Reset2faUseCase$getPreLoginPreconditionFlow$1(this, subdomainStrategy, str, null)), new Reset2faUseCase$getPreLoginPreconditionFlow$2(null)), this.KWHzl);
    }
}
