package com.okinc.business.dex.trade.copytrading.edit.ui.model;

import android.content.Context;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public interface RangeFilterUnit extends Parcelable {
    long getScale();

    String getText(@NotNull Context context);

    String getUnitValue();
}
