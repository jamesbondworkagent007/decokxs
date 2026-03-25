package o;

import com.huawei.hms.framework.common.ContainerUtils;
import o.C35962oKd;

/* JADX INFO: renamed from: o.ygZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57339ygZ {
    public static void OLrzqt() {
        C35962oKd.ActionBar.copydefault().copydefault("window", C57402yhj.class).copydefault("request", C57397yhe.class).AEQbTJ(new StateListAnimator()).EZpvd();
    }

    /* JADX INFO: renamed from: o.ygZ$StateListAnimator */
    public static class StateListAnimator implements InterfaceC35961oKc {
        private StateListAnimator() {
        }

        @Override // o.InterfaceC35961oKc
        public com.okinc.jsbridge.Message AEQbTJ(java.lang.String str) {
            com.okinc.jsbridge.Message message;
            if (str.startsWith("{")) {
                message = (com.okinc.jsbridge.Message) C33490mxT.EZpvd(str, com.okinc.jsbridge.Message.class);
            } else {
                com.okinc.jsbridge.Message message2 = null;
                try {
                    java.lang.String[] strArrSplit = str.split("\\?");
                    java.lang.String[] strArrSplit2 = strArrSplit[0].split("\\.");
                    java.lang.String str2 = strArrSplit2[0];
                    if (android.text.TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    java.lang.String str3 = strArrSplit2[1];
                    if (android.text.TextUtils.isEmpty(str3)) {
                        return null;
                    }
                    com.okinc.jsbridge.Message message3 = new com.okinc.jsbridge.Message();
                    try {
                        message3.uri = str2;
                        message3.method = str3;
                        try {
                            if (strArrSplit.length > 1) {
                                for (java.lang.String str4 : strArrSplit[1].split(ContainerUtils.FIELD_DELIMITER)) {
                                    java.lang.String[] strArrSplit3 = str4.split(ContainerUtils.KEY_VALUE_DELIMITER);
                                    if ("data".equals(strArrSplit3[0])) {
                                        message3.data = strArrSplit3[1];
                                    } else if ("success".equals(strArrSplit3[0])) {
                                        message3.success = strArrSplit3[1];
                                    } else if ("fail".equals(strArrSplit3[0])) {
                                        message3.fail = strArrSplit3[1];
                                    }
                                }
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        message = message3;
                    } catch (java.lang.Exception e) {
                        e = e;
                        message2 = message3;
                        android.util.Log.getStackTraceString(e);
                        message = message2;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
                android.util.Log.getStackTraceString(e);
                message = message2;
            }
            if (message != null) {
                C57399yhg.KWHzl(message);
            }
            return message;
        }
    }
}
