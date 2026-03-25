package com.beloo.widget.chipslayoutmanager.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes21.dex */
public class AssertionUtils {
    private AssertionUtils() {
    }

    public static <T> void assertNotNull(@Nullable T t, @NonNull String str) throws AssertionError {
        if (t != null) {
            return;
        }
        throw new AssertionError(str + " can't be null.");
    }

    public static <T> void assertInstanceOf(@NonNull T t, @NonNull Class<?> cls, @NonNull String str) throws AssertionError {
        check(!cls.isInstance(t), str + " is not instance of " + cls.getName() + JwtUtilsKt.JWT_DELIMITER);
    }

    public static <T> void assertNotEquals(@NonNull T t, @NonNull T t2, @NonNull String str) throws AssertionError {
        check(t == t2 || t.equals(t2), str + " can't be equal to " + String.valueOf(t2) + JwtUtilsKt.JWT_DELIMITER);
    }

    public static void assertNotEmpty(String str, String str2) throws AssertionError {
        check(TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim()), str2 + " can't be empty.");
    }

    public static void check(boolean z, @NonNull String str) {
        if (z) {
            throw new AssertionError(str);
        }
    }
}
