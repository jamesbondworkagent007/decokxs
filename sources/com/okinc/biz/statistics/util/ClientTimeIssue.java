package com.okinc.biz.statistics.util;

import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import o.pUX;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ClientTimeIssue {
    public static final ClientTimeIssue AEQbTJ = new ClientTimeIssue();
    public static final int KWHzl = 8;
    public static boolean copydefault;

    private ClientTimeIssue() {
    }

    public static /* synthetic */ void checkAndUploadException$default(ClientTimeIssue clientTimeIssue, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        clientTimeIssue.EZpvd(str, str2, str3);
    }

    public final void EZpvd(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2 == null || str2.length() == 0 || str2.length() < 13) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strCopydefault = xVW.copydefault();
            if (!copydefault) {
                pUX.OLrzqt.AEQbTJ(new ClientTimeException("deviceID:" + strCopydefault + ",event:" + str + ",currentTime:" + jCurrentTimeMillis + ",clientTime;" + str2 + ",callMethod:" + str3));
                copydefault = true;
            }
            pUU.copydefault("ClientTimeException", "deviceID:" + strCopydefault + ",event:" + str + ",currentTime:" + jCurrentTimeMillis + ",clientTime;" + str2 + ",callMethod:" + str3);
        }
    }

    public static final class ClientTimeException extends Exception {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientTimeException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
