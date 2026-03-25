package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.business.dexui.main.swap.route.dag.model.DexRouteUIModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24410idM extends ActivityResultContract<DexRouteUIModel, Unit> {
    public void OLrzqt(int i, android.content.Intent intent) {
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* synthetic */ Unit parseResult(int i, android.content.Intent intent) {
        OLrzqt(i, intent);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull DexRouteUIModel dexRouteUIModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dexRouteUIModel, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC24423idZ.class);
        intent.putExtra("extra_route_data", dexRouteUIModel);
        return intent;
    }
}
