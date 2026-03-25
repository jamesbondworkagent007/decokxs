package o;

import kotlin.Unit;
import o.IntentSender;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface ColorStateList<T extends IntentSender<Unit>> {
    T create(@NotNull PackageManager packageManager);

    long getVersion();

    T migrate(@NotNull PackageManager packageManager, long j, long j2, @NotNull SharedPreferences... sharedPreferencesArr);
}
