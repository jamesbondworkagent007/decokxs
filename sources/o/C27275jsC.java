package o;

import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27275jsC extends OKEditText {
    public StateListAnimator KWHzl;

    /* JADX INFO: renamed from: o.jsC$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();

        void copydefault(java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnKeyboardListener(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27275jsC(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27275jsC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27275jsC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final float KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPaint().measureText(str);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new TaskDescription(this, inputConnectionOnCreateInputConnection);
        }
        return null;
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i) {
        StateListAnimator stateListAnimator;
        if (i == 6 && (stateListAnimator = this.KWHzl) != null) {
            stateListAnimator.copydefault(java.lang.String.valueOf(getText()));
        }
        super.onEditorAction(i);
    }

    /* JADX INFO: renamed from: o.jsC$TaskDescription */
    public final class TaskDescription extends android.view.inputmethod.InputConnectionWrapper {
        public final android.view.inputmethod.InputConnection KWHzl;
        public final /* synthetic */ C27275jsC OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C27275jsC c27275jsC, android.view.inputmethod.InputConnection inputConnection) {
            super(inputConnection, true);
            Intrinsics.checkNotNullParameter(inputConnection, "");
            this.OLrzqt = c27275jsC;
            this.KWHzl = inputConnection;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(@NotNull android.view.KeyEvent keyEvent) {
            StateListAnimator stateListAnimator;
            Intrinsics.checkNotNullParameter(keyEvent, "");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (stateListAnimator = this.OLrzqt.KWHzl) != null) {
                stateListAnimator.AEQbTJ();
            }
            return super.sendKeyEvent(keyEvent);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (i == 1 && i2 == 0) {
                return sendKeyEvent(new android.view.KeyEvent(0, 67)) && sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean finishComposingText() {
            if (this.KWHzl == null) {
                return false;
            }
            return super.finishComposingText();
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public android.os.Handler getHandler() {
            return new android.os.Handler(this.OLrzqt.getContext().getMainLooper());
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public void closeConnection() {
            if (this.KWHzl == null) {
                return;
            }
            super.closeConnection();
        }
    }
}
