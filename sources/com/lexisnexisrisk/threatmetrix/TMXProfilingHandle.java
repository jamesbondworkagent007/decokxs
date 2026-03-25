package com.lexisnexisrisk.threatmetrix;

import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: loaded from: classes3.dex */
public interface TMXProfilingHandle {

    public static class Result {
        public static int CGP = 1201;
        public static int _Hk = 4181;
        private String asOVqk;
        private final TMXStatusCode hkMEAD;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:25:0x004c) to fix multi-entry loop: BACK_EDGE: B:25:0x004c -> B:26:0x004e */
        public Result(String str, TMXStatusCode tMXStatusCode) {
            if (CGP <= 1200) {
                while (true) {
                    int i = CGP;
                    int i2 = i + 13;
                    if (i2 == 86) {
                        CGP = ((i % 49) + i) % 123;
                        if ((_Hk ^ 4181) != 0) {
                            while (true) {
                                int i3 = _Hk;
                                if (i3 + 91 == 58) {
                                    _Hk = (i3 * 46) % 6;
                                }
                            }
                        }
                    } else if (i2 == 277) {
                        do {
                            CGP = ((CGP + i) >> 43) + i;
                        } while (_Hk > 4180);
                        while (true) {
                            int i4 = _Hk;
                            if (i4 + 52 == 62) {
                                _Hk = i4 + i4 + i4;
                            }
                        }
                    } else if (i2 != 279) {
                        if (i2 == 333) {
                            while (true) {
                                CGP = ((CGP >> 99) % 20) * 21;
                            }
                        }
                    } else if ((_Hk ^ 4181) != 0) {
                        while (true) {
                            int i5 = _Hk;
                            int i6 = i5 + 117;
                            if (i6 == 67) {
                                _Hk = ((i5 ^ 1921) % 103) >> 3;
                                break;
                            } else if (i6 == 71) {
                                break;
                            } else if (i6 == 140) {
                                _Hk = (i5 + i5) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                            }
                        }
                        while (true) {
                            _Hk ^= 60;
                        }
                    } else {
                        CGP = ((i % 23) ^ 4050) + i;
                    }
                }
            }
            this.asOVqk = str;
            this.hkMEAD = tMXStatusCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getSessionID() {
            return this.asOVqk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TMXStatusCode getStatus() {
            return this.hkMEAD;
        }
    }

    void cancel();

    String getSessionID();

    void sendBehavioSecData();

    void stopBehavioSecDataCollection();
}
