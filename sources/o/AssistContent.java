package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssistContent<RowType> extends PictureInPictureParams<RowType> {

    public interface TaskDescription {
        void AEQbTJ();
    }

    public abstract void addListener(@NotNull TaskDescription taskDescription);

    public abstract void removeListener(@NotNull TaskDescription taskDescription);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistContent(@NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        super(function1);
        Intrinsics.checkNotNullParameter(function1, "");
    }
}
