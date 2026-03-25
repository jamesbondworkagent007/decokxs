package com.okinc.web.view;

import androidx.annotation.NonNull;
import com.okinc.network.okg.cor.SubdomainStrategy;

/* JADX INFO: loaded from: classes12.dex */
public interface IOKWebContentView {
    void url(String str);

    void url(@NonNull String str, SubdomainStrategy subdomainStrategy);
}
