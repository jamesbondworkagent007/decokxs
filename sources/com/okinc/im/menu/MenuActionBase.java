package com.okinc.im.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import com.okinc.okimcore.model.im.OKMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public interface MenuActionBase extends Parcelable {
    void AEQbTJ(@NotNull View view, @NotNull OKMessage oKMessage);

    String OLrzqt(@NotNull Context context);

    Drawable copydefault(@NotNull Context context);
}
