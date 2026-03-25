package org.apache.http.client;

import java.util.Date;
import java.util.List;
import o.InterfaceC59601zkC;

/* JADX INFO: loaded from: classes13.dex */
public interface CookieStore {
    void addCookie(InterfaceC59601zkC interfaceC59601zkC);

    void clear();

    boolean clearExpired(Date date);

    List<InterfaceC59601zkC> getCookies();
}
