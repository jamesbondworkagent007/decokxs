package o;

import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAG extends OKEditText {
    public Application copydefault;

    public interface Application {
        boolean EZpvd();

        boolean KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnKeyClickListener(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qAG(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public static final class ActionBar extends android.view.inputmethod.InputConnectionWrapper {
        public final /* synthetic */ qAG EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(android.view.inputmethod.InputConnection inputConnection, qAG qag) {
            super(inputConnection, true);
            this.EZpvd = qag;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
            Application application;
            Application application2;
            java.lang.Integer numValueOf = keyEvent != null ? java.lang.Integer.valueOf(keyEvent.getKeyCode()) : null;
            if (numValueOf != null && numValueOf.intValue() == 67) {
                if (keyEvent.getAction() == 0 && (application2 = this.EZpvd.copydefault) != null && application2.KWHzl()) {
                    return true;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 66 && keyEvent.getAction() == 0 && (application = this.EZpvd.copydefault) != null && application.EZpvd()) {
                return true;
            }
            return super.sendKeyEvent(keyEvent);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            Application application;
            if (i == 1 && i2 == 0 && (application = this.EZpvd.copydefault) != null && application.KWHzl()) {
                return true;
            }
            return super.deleteSurroundingText(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new ActionBar(inputConnectionOnCreateInputConnection, this);
        }
        return null;
    }
}
