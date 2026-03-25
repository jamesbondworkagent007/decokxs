package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59353zfT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59413zga implements InterfaceC59353zfT {
    public final java.lang.String AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.zga.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59413zga(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59353zfT
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.zga$ActionBar */
    public static final class ActionBar extends AbstractC59413zga {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
            super("must be a member or an extension function", null);
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return (yng.AEQbTJ() == null && yng.djBIcL() == null) ? false : true;
        }
    }

    public AbstractC59413zga(java.lang.String str) {
        this.AEQbTJ = str;
    }

    @Override // o.InterfaceC59353zfT
    public java.lang.String KWHzl(@NotNull yNG yng) {
        return InterfaceC59353zfT.Activity.EZpvd(this, yng);
    }

    /* JADX INFO: renamed from: o.zga$Activity */
    public static final class Activity extends AbstractC59413zga {
        public static final Activity KWHzl = new Activity();

        private Activity() {
            super("must be a member function", null);
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return yng.AEQbTJ() != null;
        }
    }
}
