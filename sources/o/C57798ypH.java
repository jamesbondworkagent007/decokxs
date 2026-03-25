package o;

import com.okinc.p2p.api.OtcExtraKeys;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import o.C57837ypu;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57798ypH {
    public static int KWHzl = -99;
    public static java.lang.Class<?> copydefault;
    public android.content.Context AEQbTJ;
    public java.lang.Object AhwBna;
    public java.lang.reflect.Method EZpvd;
    public java.lang.reflect.Method OLrzqt;
    public boolean djBIcL;
    public android.content.ServiceConnection gEmmrt;
    public boolean AYXKKw = false;
    public java.util.ArrayList<java.lang.String> valueOf = new java.util.ArrayList<>();

    public C57798ypH(android.content.Context context) {
        this.djBIcL = true;
        this.AEQbTJ = context;
        try {
            JSONArray jSONArray = new JSONArray(C57834ypr.AEQbTJ("GTPlayerPurchases", "purchaseTokens", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.valueOf.add(jSONArray.get(i).toString());
            }
            boolean z = jSONArray.length() == 0;
            this.djBIcL = z;
            if (z) {
                this.djBIcL = C57834ypr.AEQbTJ("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        copydefault();
    }

    public static boolean KWHzl(android.content.Context context) {
        if (KWHzl == -99) {
            KWHzl = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (KWHzl == 0) {
                copydefault = java.lang.Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return KWHzl == 0;
        } catch (java.lang.Throwable unused) {
            KWHzl = 0;
            return false;
        }
    }

    public void copydefault() {
        if (this.gEmmrt != null) {
            if (this.AhwBna != null) {
                AEQbTJ();
            }
        } else {
            this.gEmmrt = new android.content.ServiceConnection() { // from class: o.ypH.4
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(android.content.ComponentName componentName) {
                    int unused = C57798ypH.KWHzl = -99;
                    C57798ypH.this.AhwBna = null;
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                    try {
                        java.lang.reflect.Method methodEZpvd = C57798ypH.EZpvd(java.lang.Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                        methodEZpvd.setAccessible(true);
                        C57798ypH.this.AhwBna = methodEZpvd.invoke(null, iBinder);
                        C57798ypH.this.AEQbTJ();
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.AEQbTJ.bindService(intent, this.gEmmrt, 1);
        }
    }

    public final void AEQbTJ() {
        if (this.AYXKKw) {
            return;
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: o.ypH.1
            @Override // java.lang.Runnable
            public void run() {
                C57798ypH.this.AYXKKw = true;
                try {
                    if (C57798ypH.this.OLrzqt == null) {
                        C57798ypH.this.OLrzqt = C57798ypH.KWHzl(C57798ypH.copydefault);
                        C57798ypH.this.OLrzqt.setAccessible(true);
                    }
                    android.os.Bundle bundle = (android.os.Bundle) C57798ypH.this.OLrzqt.invoke(C57798ypH.this.AhwBna, 3, C57798ypH.this.AEQbTJ.getPackageName(), "inapp", null);
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        for (int i = 0; i < stringArrayList2.size(); i++) {
                            java.lang.String str = stringArrayList2.get(i);
                            java.lang.String str2 = stringArrayList.get(i);
                            java.lang.String string = new JSONObject(str).getString("purchaseToken");
                            if (!C57798ypH.this.valueOf.contains(string) && !arrayList2.contains(string)) {
                                arrayList2.add(string);
                                arrayList.add(str2);
                            }
                        }
                        if (arrayList.size() > 0) {
                            C57798ypH.this.EZpvd(arrayList, arrayList2);
                        } else if (stringArrayList2.size() == 0) {
                            C57798ypH.this.djBIcL = false;
                            C57834ypr.KWHzl("GTPlayerPurchases", "ExistingPurchases", false);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
                C57798ypH.this.AYXKKw = false;
            }
        }).start();
    }

    public final void EZpvd(java.util.ArrayList<java.lang.String> arrayList, final java.util.ArrayList<java.lang.String> arrayList2) {
        try {
            if (this.EZpvd == null) {
                java.lang.reflect.Method methodOLrzqt = OLrzqt(copydefault);
                this.EZpvd = methodOLrzqt;
                methodOLrzqt.setAccessible(true);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            android.os.Bundle bundle2 = (android.os.Bundle) this.EZpvd.invoke(this.AhwBna, 3, this.AEQbTJ.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                java.util.HashMap map = new java.util.HashMap();
                java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    java.lang.String string = jSONObject.getString("productId");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put(OtcExtraKeys.AMOUNT, bigDecimalDivide.toString());
                    map.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                for (java.lang.String str : arrayList) {
                    if (map.containsKey(str)) {
                        jSONArray.put(map.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    OneSignal.OLrzqt(jSONArray, this.djBIcL, new C57837ypu.TaskDescription() { // from class: o.ypH.3
                        @Override // o.C57837ypu.TaskDescription
                        public void OLrzqt(java.lang.String str2) {
                            C57798ypH.this.valueOf.addAll(arrayList2);
                            C57834ypr.copydefault("GTPlayerPurchases", "purchaseTokens", C57798ypH.this.valueOf.toString());
                            C57834ypr.KWHzl("GTPlayerPurchases", "ExistingPurchases", true);
                            C57798ypH.this.djBIcL = false;
                            C57798ypH.this.AYXKKw = false;
                        }
                    });
                }
            }
        } catch (java.lang.Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "Failed to track IAP purchases", th);
        }
    }

    public static java.lang.reflect.Method EZpvd(java.lang.Class cls) {
        for (java.lang.reflect.Method method : cls.getMethods()) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == android.os.IBinder.class) {
                return method;
            }
        }
        return null;
    }

    public static java.lang.reflect.Method KWHzl(java.lang.Class cls) {
        for (java.lang.reflect.Method method : cls.getMethods()) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == java.lang.Integer.TYPE && parameterTypes[1] == java.lang.String.class && parameterTypes[2] == java.lang.String.class && parameterTypes[3] == java.lang.String.class) {
                return method;
            }
        }
        return null;
    }

    public static java.lang.reflect.Method OLrzqt(java.lang.Class cls) {
        for (java.lang.reflect.Method method : cls.getMethods()) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            java.lang.Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == java.lang.Integer.TYPE && parameterTypes[1] == java.lang.String.class && parameterTypes[2] == java.lang.String.class && parameterTypes[3] == android.os.Bundle.class && returnType == android.os.Bundle.class) {
                return method;
            }
        }
        return null;
    }
}
