package com.okinc.mln_ui.ui.okkit;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDOkNotification {
    public static final String HOT_LOAD_CHANGE = "OKBCCDataChangeNotifyKey";
    public static final String LOGIN_STATE_OBSERVABLE = "LoginStateChanged";
    public static final String LUA_CLASS_NAME = "OKNotificationCenter";
    public static final String USER_INFO_OBSERVABLE = "OKGAUPDATEUSERINFO_NOTIFICATION";
    public HashMap<String, NotifyObservable> bindMap = new HashMap<>();

    @LuaBridge
    public int property;

    public UDOkNotification(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        globals.KWHzl(new Globals.Application() { // from class: com.okinc.mln_ui.ui.okkit.UDOkNotification.1
            @Override // org.luaj.vm2.Globals.Application
            public void AEQbTJ(Globals globals2) {
                UDOkNotification.this.OLrzqt();
            }
        });
    }

    @LuaBridge
    public void removeObserver(String str) {
        NotifyObservable notifyObservable = this.bindMap.get(str);
        if (notifyObservable != null) {
            notifyObservable.getCallback().OLrzqt();
            SubHelper.EZpvd(this.bindMap.get(str), str);
            this.bindMap.remove(str);
        }
    }

    public void OLrzqt() {
        for (Map.Entry<String, NotifyObservable> entry : this.bindMap.entrySet()) {
            entry.getValue().getCallback().OLrzqt();
            SubHelper.AEQbTJ(entry.getKey());
            this.bindMap.put(entry.getKey(), null);
        }
    }

    @LuaBridge
    public String addObserver(String str, InterfaceC8029auy interfaceC8029auy) {
        final String str2 = str + System.currentTimeMillis();
        if (str.equals(USER_INFO_OBSERVABLE)) {
            this.bindMap.put(str2, new NotifyObservable(str, interfaceC8029auy));
            RxBus.AEQbTJ("user_info_change").subscribe(new RxBus.EventCallback<String>(str2) { // from class: com.okinc.mln_ui.ui.okkit.UDOkNotification.2
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str3) {
                    if (UDOkNotification.this.bindMap.get(str2) == null || ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback() == null || ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback().AEQbTJ()) {
                        return;
                    }
                    ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback().KWHzl(new Object[0]);
                }
            });
        } else if (str.equals(LOGIN_STATE_OBSERVABLE)) {
            this.bindMap.put(str2, new NotifyObservable(str, interfaceC8029auy));
            RxBus.AEQbTJ("ev_account_change", "ev_account_login", "ev_account_logout").subscribe(new RxBus.EventCallback<String>(str2) { // from class: com.okinc.mln_ui.ui.okkit.UDOkNotification.3
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str3) {
                    if (UDOkNotification.this.bindMap.get(str2) == null || ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback() == null || ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback().AEQbTJ()) {
                        return;
                    }
                    ((NotifyObservable) UDOkNotification.this.bindMap.get(str2)).getCallback().KWHzl(new Object[0]);
                }
            });
        } else {
            str.equals(HOT_LOAD_CHANGE);
        }
        return str2;
    }
}
