package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.android.error.MissingAndroidContextException;

/* JADX INFO: renamed from: o.zsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59930zsL {
    public static final android.content.Context AEQbTJ(@NotNull C60060zuj c60060zuj) throws MissingAndroidContextException {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        try {
            return (android.content.Context) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(android.content.Context.class), null, null);
        } catch (java.lang.Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final android.app.Application copydefault(@NotNull C60060zuj c60060zuj) throws MissingAndroidContextException {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        try {
            return (android.app.Application) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(android.app.Application.class), null, null);
        } catch (java.lang.Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
