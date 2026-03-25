package com.okinc.web.web;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import o.AbstractActivityC33041mov;

/* JADX INFO: loaded from: classes12.dex */
public interface IWebActivityAPI {
    Bitmap buildWebViewDrawCache();

    WeakReference<AbstractActivityC33041mov> getWebActivity();

    String getWebTitle();

    String getWebUrl();
}
