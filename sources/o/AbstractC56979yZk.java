package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56979yZk extends AbstractC56975yZg<Unit> {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);

    public AbstractC56979yZk() {
        super(Unit.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Unit KWHzl() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: o.yZk$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56979yZk {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC56975yZg
        public java.lang.String toString() {
            return this.KWHzl;
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
        @Override // o.AbstractC56975yZg
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C59366zfg OLrzqt(@NotNull yNP ynp) {
            Intrinsics.checkNotNullParameter(ynp, "");
            return C59370zfk.EZpvd(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.yZk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yZk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC56979yZk OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }
    }
}
