package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import android.os.Process;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeTransactionViewModel_HiltModules {
    private MemeTransactionViewModel_HiltModules() {
    }

    public static final class KeyModule {
        public static int AEQbTJ;
        public static int copydefault;

        public static boolean EZpvd() {
            return true;
        }

        private KeyModule() {
        }

        public static int OLrzqt() {
            int i = copydefault;
            int i2 = i % 9000896;
            copydefault = i + 1;
            if (i2 != 0) {
                return AEQbTJ;
            }
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            AEQbTJ = startElapsedRealtime;
            return startElapsedRealtime;
        }
    }
}
