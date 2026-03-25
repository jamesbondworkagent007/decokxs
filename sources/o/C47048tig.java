package o;

import com.okinc.okrisk.collection.app.OKAppCollector$refresh$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47048tig {
    public static final C47048tig AEQbTJ = new C47048tig();

    private C47048tig() {
    }

    public final void EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKAppCollector$refresh$1(context, null), 3, null);
    }
}
