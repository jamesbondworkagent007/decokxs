package o;

import app.cash.sqldelight.async.coroutines.SynchronousKt$synchronous$1$create$1;
import app.cash.sqldelight.async.coroutines.SynchronousKt$synchronous$1$migrate$1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.IntentSender;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class IntentFilter {

    public static final class Application implements ColorStateList<IntentSender.Activity<Unit>> {
        public final /* synthetic */ ColorStateList<IntentSender.ActionBar<Unit>> EZpvd;
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ColorStateList
        public long getVersion() {
            return this.KWHzl;
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender create(PackageManager packageManager) {
            return IntentSender.Activity.EZpvd(AEQbTJ(packageManager));
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender migrate(PackageManager packageManager, long j, long j2, SharedPreferences[] sharedPreferencesArr) {
            return IntentSender.Activity.EZpvd(AEQbTJ(packageManager, j, j2, sharedPreferencesArr));
        }

        public java.lang.Object AEQbTJ(@NotNull PackageManager packageManager) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            return IntentSender.Activity.copydefault(BuildersKt__BuildersKt.runBlocking$default(null, new SynchronousKt$synchronous$1$create$1(this.EZpvd, packageManager, null), 1, null));
        }

        public java.lang.Object AEQbTJ(@NotNull PackageManager packageManager, long j, long j2, @NotNull SharedPreferences... sharedPreferencesArr) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            Intrinsics.checkNotNullParameter(sharedPreferencesArr, "");
            return IntentSender.Activity.copydefault(BuildersKt__BuildersKt.runBlocking$default(null, new SynchronousKt$synchronous$1$migrate$1(this.EZpvd, packageManager, j, j2, sharedPreferencesArr, null), 1, null));
        }
    }
}
