package com.amplifyframework.core.model;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelPropertyPathKt {
    public static final List<PropertyContainerPath> includes(@NotNull PropertyContainerPath... propertyContainerPathArr) {
        Intrinsics.checkNotNullParameter(propertyContainerPathArr, "");
        return yDY.gEmmrt(Arrays.copyOf(propertyContainerPathArr, propertyContainerPathArr.length));
    }
}
