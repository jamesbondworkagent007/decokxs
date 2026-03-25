package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.CharacterStyle;
import o.MovementMethod;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TextWatcher implements InterfaceC4949Bx {
    public final MovementMethod.TaskDescription copydefault;

    public TextWatcher(@NotNull MovementMethod.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault = taskDescription;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        CharacterStyle.TaskDescription taskDescription = CharacterStyle.copydefault;
        CharacterStyle.Activity activity = new CharacterStyle.Activity();
        activity.EZpvd((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.copydefault.EZpvd().OLrzqt(activity.EZpvd(), continuation);
    }
}
