package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.IntentSender;
import o.PictureInPictureParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class PictureInPictureParams<RowType> {
    private final Function1<AssetManager, RowType> mapper;

    public abstract <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AssetManager, RowType> getMapper() {
        return this.mapper;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.AssetManager, ? extends RowType> */
    /* JADX WARN: Multi-variable type inference failed */
    public PictureInPictureParams(@NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.mapper = function1;
    }

    public final java.util.List<RowType> executeAsList() {
        return (java.util.List) execute(new Function1<AssetManager, IntentSender<java.util.List<RowType>>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsList$1
            final /* synthetic */ PictureInPictureParams<RowType> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.PictureInPictureParams<? extends RowType> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final IntentSender<List<RowType>> invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                ArrayList arrayList = new ArrayList();
                while (assetManager.KWHzl().copydefault().booleanValue()) {
                    arrayList.add(this.this$0.getMapper().invoke(assetManager));
                }
                return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(arrayList));
            }
        }).copydefault();
    }

    public final RowType executeAsOne() {
        RowType rowtypeExecuteAsOneOrNull = executeAsOneOrNull();
        if (rowtypeExecuteAsOneOrNull != null) {
            return rowtypeExecuteAsOneOrNull;
        }
        throw new java.lang.NullPointerException("ResultSet returned null for " + this);
    }

    public final RowType executeAsOneOrNull() {
        return (RowType) execute(new Function1<AssetManager, IntentSender<RowType>>(this) { // from class: app.cash.sqldelight.ExecutableQuery$executeAsOneOrNull$1
            final /* synthetic */ PictureInPictureParams<RowType> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.PictureInPictureParams<? extends RowType> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final IntentSender<RowType> invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                if (!assetManager.KWHzl().copydefault().booleanValue()) {
                    return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault((Object) null));
                }
                RowType rowtypeInvoke = this.this$0.getMapper().invoke(assetManager);
                boolean zBooleanValue = assetManager.KWHzl().copydefault().booleanValue();
                PictureInPictureParams<RowType> pictureInPictureParams = this.this$0;
                if (!(!zBooleanValue)) {
                    throw new IllegalStateException(("ResultSet returned more than 1 row for " + pictureInPictureParams).toString());
                }
                return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(rowtypeInvoke));
            }
        }).copydefault();
    }
}
