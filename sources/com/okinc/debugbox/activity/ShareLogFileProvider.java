package com.okinc.debugbox.activity;

import androidx.annotation.XmlRes;
import androidx.core.content.FileProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class ShareLogFileProvider extends FileProvider {
    public static final int $stable = 0;

    public ShareLogFileProvider() {
    }

    public ShareLogFileProvider(@XmlRes int i) {
        super(i);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        return super.onCreate();
    }
}
