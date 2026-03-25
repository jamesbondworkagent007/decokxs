package o;

import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57289yfc extends OKEditText {
    public Application KWHzl;

    /* JADX INFO: renamed from: o.yfc$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public interface Application {
        void OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackspaceDownListener(Application application) {
        this.KWHzl = application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57289yfc(@NotNull android.content.Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57289yfc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57289yfc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setMeasuredDimension(measuredWidth + C55298xhM.OLrzqt(2, context), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: o.yfc$StateListAnimator */
    public static final class StateListAnimator extends android.view.inputmethod.InputConnectionWrapper {
        public final /* synthetic */ C57289yfc OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(android.view.inputmethod.InputConnection inputConnection, C57289yfc c57289yfc) {
            super(inputConnection, true);
            this.OLrzqt = c57289yfc;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
            Application application;
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (application = this.OLrzqt.KWHzl) != null) {
                application.OLrzqt();
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
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new StateListAnimator(inputConnectionOnCreateInputConnection, this);
        }
        return null;
    }
}
