package o;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24739ijX extends AppCompatEditText {
    public Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnGoClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24739ijX(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ijZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return C24739ijX.copydefault(this.copydefault, textView, i, keyEvent);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24739ijX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ijZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return C24739ijX.copydefault(this.copydefault, textView, i, keyEvent);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24739ijX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ijZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                return C24739ijX.copydefault(this.copydefault, textView, i2, keyEvent);
            }
        });
    }

    public static final boolean copydefault(C24739ijX c24739ijX, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 2) {
            return false;
        }
        Function0<Unit> function0 = c24739ijX.KWHzl;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions;
        if ((i & 2) != 0) {
            editorInfo.imeOptions = (i ^ (i & 255)) | 2;
        }
        int i2 = editorInfo.imeOptions;
        if ((1073741824 & i2) != 0) {
            editorInfo.imeOptions = i2 & (-1073741825);
        }
        return inputConnectionOnCreateInputConnection;
    }
}
