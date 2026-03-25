package org.jzvd.jzvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public class JZVideoA extends RelativeLayout {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public State AEQbTJ;

    public enum Screen {
        NORMAL,
        FULLSCREEN,
        TINY
    }

    public enum State {
        IDLE,
        NORMAL,
        PREPARING,
        PREPARING_CHANGE_URL,
        PREPARING_PLAYING,
        PREPARED,
        PLAYING,
        PAUSE,
        COMPLETE,
        ERROR
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "");
        this.AEQbTJ = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZVideoA(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZVideoA(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: org.jzvd.jzvideo.JZVideoA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
