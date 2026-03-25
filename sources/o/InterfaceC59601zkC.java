package o;

import java.util.Date;

/* JADX INFO: renamed from: o.zkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59601zkC {
    java.lang.String getDomain();

    Date getExpiryDate();

    java.lang.String getName();

    java.lang.String getPath();

    int[] getPorts();

    java.lang.String getValue();

    int getVersion();

    boolean isExpired(Date date);

    boolean isSecure();
}
