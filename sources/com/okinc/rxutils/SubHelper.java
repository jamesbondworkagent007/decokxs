package com.okinc.rxutils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.InterfaceC58217yxC;

/* JADX INFO: loaded from: classes11.dex */
public class SubHelper {
    public Map<Object, SubContainer> copydefault;

    public static class Application {
        public static SubHelper OLrzqt = new SubHelper();

        private Application() {
        }
    }

    public static SubHelper copydefault() {
        return Application.OLrzqt;
    }

    private SubHelper() {
        this.copydefault = new ConcurrentHashMap();
    }

    public static void OLrzqt(Object obj, InterfaceC58217yxC interfaceC58217yxC) {
        OLrzqt(obj, interfaceC58217yxC, null);
    }

    public static void OLrzqt(Object obj, InterfaceC58217yxC interfaceC58217yxC, String str) {
        SubContainer subContainer = copydefault().copydefault.get(obj);
        if (subContainer == null) {
            subContainer = new SubContainer();
            copydefault().copydefault.put(obj, subContainer);
        }
        if (str == null) {
            subContainer.put(interfaceC58217yxC);
        } else {
            subContainer.put(str, interfaceC58217yxC);
        }
    }

    public static void EZpvd(Object obj, String str) {
        SubContainer subContainer = copydefault().copydefault.get(obj);
        if (subContainer != null) {
            subContainer.delete(str);
            if (subContainer.size() == 0) {
                copydefault().copydefault.remove(obj);
            }
        }
    }

    public static void AEQbTJ(Object obj) {
        SubContainer subContainer = copydefault().copydefault.get(obj);
        if (subContainer != null) {
            subContainer.clear();
        }
        copydefault().copydefault.remove(obj);
    }

    public static class SubContainer extends ConcurrentHashMap<String, InterfaceC58217yxC> {
        private static final String BASE = "user";
        private int baseKey;

        private SubContainer() {
            this.baseKey = 0;
        }

        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public InterfaceC58217yxC put(String str, InterfaceC58217yxC interfaceC58217yxC) {
            remove(BASE + str);
            return (InterfaceC58217yxC) super.put(BASE + str, interfaceC58217yxC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(InterfaceC58217yxC interfaceC58217yxC) {
            super.put(String.valueOf(this.baseKey), interfaceC58217yxC);
            this.baseKey++;
        }

        public void delete(String str) {
            remove(BASE + str);
        }

        private void remove(String str) {
            InterfaceC58217yxC interfaceC58217yxC = get(str);
            if (interfaceC58217yxC != null && !interfaceC58217yxC.isDisposed()) {
                interfaceC58217yxC.dispose();
            }
            super.remove((Object) str);
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            for (InterfaceC58217yxC interfaceC58217yxC : values()) {
                if (interfaceC58217yxC != null && !interfaceC58217yxC.isDisposed()) {
                    interfaceC58217yxC.dispose();
                }
            }
            super.clear();
        }
    }
}
