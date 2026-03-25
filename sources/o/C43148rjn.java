package o;

import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.fun.lt.SINavigator;
import com.okinc.mln_ui.ui.OkexLuaNav;
import com.okinc.mln_ui.ui.okkit.UDCommonBridge;
import com.okinc.mln_ui.ui.okkit.UDGlobalValue;
import com.okinc.mln_ui.ui.okkit.UDGoPageBridge;
import com.okinc.mln_ui.ui.okkit.UDOkNotification;
import com.okinc.mln_ui.ui.okkit.UDPreference;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.mln_ui.ui.okkit.UdToast;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import o.C43148rjn;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.rjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43148rjn {
    public static final java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, SoftReference<InterfaceC7835arN>>> AEQbTJ = new java.util.HashMap();
    public static java.util.List<InterfaceC7378aih> EZpvd;

    public static void KWHzl() {
        LinkedList linkedList = new LinkedList();
        EZpvd = linkedList;
        linkedList.addAll(C7381aik.Companion.AEQbTJ());
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC7377aig.class);
        if (listKWHzl != null) {
            EZpvd.addAll(listKWHzl);
        }
    }

    public static C7325ahh.Application[] valueOf() {
        int length = 6;
        C7325ahh.Application[] applicationArr = {new C7325ahh.Application(SINavigator.LUA_CLASS_NAME, OkexLuaNav.class), new C7325ahh.Application(UDCommonBridge.LUA_CLASS_NAME, UDCommonBridge.class), new C7325ahh.Application(UdToast.LUA_CLASS_NAME, UdToast.class), new C7325ahh.Application(UDGoPageBridge.LUA_CLASS_NAME, UDGoPageBridge.class), new C7325ahh.Application(UDPreference.LUA_CLASS_NAME, UDPreference.class), new C7325ahh.Application(UDGlobalValue.LUA_CLASS_NAME, UDGlobalValue.class)};
        java.util.List<InterfaceC7378aih> list = EZpvd;
        if (list != null) {
            java.util.Iterator<InterfaceC7378aih> it = list.iterator();
            while (it.hasNext()) {
                C7325ahh.Application[] applicationArrRegisterSingleInstance = it.next().registerSingleInstance();
                if (applicationArrRegisterSingleInstance != null) {
                    applicationArr = (C7325ahh.Application[]) java.util.Arrays.copyOf(applicationArr, applicationArrRegisterSingleInstance.length + length);
                    java.lang.System.arraycopy(applicationArrRegisterSingleInstance, 0, applicationArr, length, applicationArrRegisterSingleInstance.length);
                    length = applicationArr.length;
                }
            }
        }
        return applicationArr;
    }

    public static C8010aue.LoaderManager[] djBIcL() {
        int length = 1;
        C8010aue.LoaderManager[] loaderManagerArr = {C8010aue.copydefault("OKMath", UdMath.class)};
        java.util.List<InterfaceC7378aih> list = EZpvd;
        if (list != null) {
            java.util.Iterator<InterfaceC7378aih> it = list.iterator();
            while (it.hasNext()) {
                C8010aue.LoaderManager[] loaderManagerArrRegisterStaticClass = it.next().registerStaticClass();
                if (loaderManagerArrRegisterStaticClass != null) {
                    loaderManagerArr = (C8010aue.LoaderManager[]) java.util.Arrays.copyOf(loaderManagerArr, loaderManagerArrRegisterStaticClass.length + length);
                    java.lang.System.arraycopy(loaderManagerArrRegisterStaticClass, 0, loaderManagerArr, length, loaderManagerArrRegisterStaticClass.length);
                    length = loaderManagerArr.length;
                }
            }
        }
        return loaderManagerArr;
    }

    public static C8010aue.AssistContent[] gEmmrt() {
        InterfaceComponentCallbacks2C43266rlz module;
        int length = 1;
        C8010aue.AssistContent[] assistContentArr = {C8010aue.OLrzqt(UDOkNotification.LUA_CLASS_NAME, UDOkNotification.class, true)};
        java.util.List<InterfaceC7378aih> list = EZpvd;
        if (list != null) {
            for (InterfaceC7378aih interfaceC7378aih : list) {
                C8010aue.AssistContent[] assistContentArrRegisterUserData = interfaceC7378aih.registerUserData();
                if (assistContentArrRegisterUserData != null) {
                    for (C8010aue.AssistContent assistContent : assistContentArrRegisterUserData) {
                        if ((interfaceC7378aih instanceof AbstractC7372aib) && (module = ((AbstractC7372aib) interfaceC7378aih).getModule()) != null) {
                            LuaUserdata.moduleMap.put(assistContent.EZpvd, module);
                        }
                    }
                    assistContentArr = (C8010aue.AssistContent[]) java.util.Arrays.copyOf(assistContentArr, assistContentArrRegisterUserData.length + length);
                    java.lang.System.arraycopy(assistContentArrRegisterUserData, 0, assistContentArr, length, assistContentArrRegisterUserData.length);
                    length = assistContentArr.length;
                }
            }
        }
        return assistContentArr;
    }

    public static C7325ahh.TaskDescription[] AEQbTJ() {
        C7325ahh.TaskDescription[] taskDescriptionArr = new C7325ahh.TaskDescription[0];
        java.util.List<InterfaceC7378aih> list = EZpvd;
        if (list != null) {
            java.util.Iterator<InterfaceC7378aih> it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                C7325ahh.TaskDescription[] taskDescriptionArrRegisterConverter = it.next().registerConverter();
                if (taskDescriptionArrRegisterConverter != null) {
                    taskDescriptionArr = (C7325ahh.TaskDescription[]) java.util.Arrays.copyOf(taskDescriptionArr, taskDescriptionArrRegisterConverter.length + length);
                    java.lang.System.arraycopy(taskDescriptionArrRegisterConverter, 0, taskDescriptionArr, length, taskDescriptionArrRegisterConverter.length);
                    length = taskDescriptionArr.length;
                }
            }
        }
        return taskDescriptionArr;
    }

    public static java.lang.Class<?>[] EZpvd() {
        java.lang.Class<?>[] clsArr = new java.lang.Class[0];
        java.util.List<InterfaceC7378aih> list = EZpvd;
        if (list != null) {
            java.util.Iterator<InterfaceC7378aih> it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                java.lang.Class<?>[] clsArrRegisterConstants = it.next().registerConstants();
                if (clsArrRegisterConstants != null) {
                    clsArr = (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArrRegisterConstants.length + length);
                    java.lang.System.arraycopy(clsArrRegisterConstants, 0, clsArr, length, clsArrRegisterConstants.length);
                    length = clsArr.length;
                }
            }
        }
        return clsArr;
    }

    public static InterfaceC7298ahG copydefault() {
        return new AnonymousClass2();
    }

    /* JADX INFO: renamed from: o.rjn$2, reason: invalid class name */
    public class AnonymousClass2 implements InterfaceC7298ahG {
        @Override // o.InterfaceC7298ahG
        public void EZpvd(java.lang.String str, InterfaceC7835arN interfaceC7835arN, java.lang.String str2) {
            java.util.HashMap map = (java.util.HashMap) C43148rjn.AEQbTJ.get(str);
            if (map == null) {
                map = new java.util.HashMap();
            }
            map.put(str2, new SoftReference(interfaceC7835arN));
            C43148rjn.AEQbTJ.put(str, map);
        }

        @Override // o.InterfaceC7298ahG
        public void AEQbTJ(java.lang.String str, java.lang.String[] strArr, final java.util.Map map) {
            final InterfaceC7835arN interfaceC7835arN;
            java.util.HashMap map2 = (java.util.HashMap) C43148rjn.AEQbTJ.get(str);
            if (map2 != null) {
                for (SoftReference softReference : map2.values()) {
                    if (softReference != null && (interfaceC7835arN = (InterfaceC7835arN) softReference.get()) != null) {
                        C7840arS.copydefault(new java.lang.Runnable() { // from class: o.rjq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C43148rjn.AnonymousClass2.OLrzqt(interfaceC7835arN, map);
                            }
                        });
                    }
                }
            }
        }

        public static /* synthetic */ void OLrzqt(InterfaceC7835arN interfaceC7835arN, java.util.Map map) {
            interfaceC7835arN.EZpvd(map);
        }

        @Override // o.InterfaceC7298ahG
        public void AEQbTJ(java.lang.String str, InterfaceC7835arN... interfaceC7835arNArr) {
            java.util.HashMap map = (java.util.HashMap) C43148rjn.AEQbTJ.get(str);
            if (map != null) {
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    SoftReference softReference = (SoftReference) it.next();
                    for (InterfaceC7835arN interfaceC7835arN : interfaceC7835arNArr) {
                        if (softReference.get() == interfaceC7835arN) {
                            interfaceC7835arN.OLrzqt();
                            it.remove();
                        }
                    }
                }
                if (map.size() == 0) {
                    C43148rjn.AEQbTJ.remove(str);
                }
            }
        }

        @Override // o.InterfaceC7298ahG
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            java.util.HashMap map = (java.util.HashMap) C43148rjn.AEQbTJ.get(str);
            if (map != null) {
                SoftReference softReference = (SoftReference) map.remove(str2);
                if (softReference != null && softReference.get() != null) {
                    ((InterfaceC7835arN) softReference.get()).OLrzqt();
                }
                if (map.size() == 0) {
                    C43148rjn.AEQbTJ.remove(str);
                }
            }
        }
    }

    public static android.content.Context KWHzl(@androidx.annotation.NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public static FragmentActivity AEQbTJ(Globals globals) {
        try {
            return (FragmentActivity) KWHzl(globals);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String OLrzqt(Globals globals) {
        C7328ahk c7328ahk;
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        return (c7322ahe == null || (c7328ahk = c7322ahe.copydefault) == null) ? "" : c7328ahk.gEmmrt();
    }
}
