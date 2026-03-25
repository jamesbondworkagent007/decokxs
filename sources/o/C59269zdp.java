package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59269zdp extends AbstractC59325zes {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final AbstractC59325zes EZpvd;
    public final AbstractC59325zes OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.zes), (r2v0 o.zes) A[MD:(o.zes, o.zes):void (m)] call: o.zdp.<init>(o.zes, o.zes):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59269zdp(AbstractC59325zes abstractC59325zes, AbstractC59325zes abstractC59325zes2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC59325zes, abstractC59325zes2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59325zes OLrzqt(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59325zes abstractC59325zes2) {
        return AEQbTJ.AEQbTJ(abstractC59325zes, abstractC59325zes2);
    }

    @Override // o.AbstractC59325zes
    public boolean EZpvd() {
        return false;
    }

    /* JADX INFO: renamed from: o.zdp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zdp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC59325zes AEQbTJ(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59325zes abstractC59325zes2) {
            Intrinsics.checkNotNullParameter(abstractC59325zes, "");
            Intrinsics.checkNotNullParameter(abstractC59325zes2, "");
            return abstractC59325zes.EZpvd() ? abstractC59325zes2 : abstractC59325zes2.EZpvd() ? abstractC59325zes : new C59269zdp(abstractC59325zes, abstractC59325zes2, null);
        }
    }

    public C59269zdp(AbstractC59325zes abstractC59325zes, AbstractC59325zes abstractC59325zes2) {
        this.EZpvd = abstractC59325zes;
        this.OLrzqt = abstractC59325zes2;
    }

    @Override // o.AbstractC59325zes
    public InterfaceC59317zek copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC59317zek interfaceC59317zekCopydefault = this.EZpvd.copydefault(abstractC59233zdF);
        return interfaceC59317zekCopydefault == null ? this.OLrzqt.copydefault(abstractC59233zdF) : interfaceC59317zekCopydefault;
    }

    @Override // o.AbstractC59325zes
    public AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Variance variance) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(variance, "");
        return this.OLrzqt.copydefault(this.EZpvd.copydefault(abstractC59233zdF, variance), variance);
    }

    @Override // o.AbstractC59325zes
    public boolean copydefault() {
        return this.EZpvd.copydefault() || this.OLrzqt.copydefault();
    }

    @Override // o.AbstractC59325zes
    public boolean AEQbTJ() {
        return this.EZpvd.AEQbTJ() || this.OLrzqt.AEQbTJ();
    }

    @Override // o.AbstractC59325zes
    public yOL AEQbTJ(@NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return this.OLrzqt.AEQbTJ(this.EZpvd.AEQbTJ(yol));
    }
}
