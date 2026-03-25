package o;

import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14784drw extends OKEditText {
    public Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPasteListener(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14784drw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        Function0<Unit> function0;
        if (i == 16908322 && (function0 = this.AEQbTJ) != null) {
            function0.invoke();
        }
        return super.onTextContextMenuItem(i);
    }
}
