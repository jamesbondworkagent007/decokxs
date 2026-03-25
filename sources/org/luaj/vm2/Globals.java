package org.luaj.vm2;

import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C60032zuH;
import o.C60038zuN;
import o.C7318aha;
import o.InterfaceC60037zuM;
import o.InterfaceC60042zuR;
import o.InterfaceC60044zuT;
import o.InterfaceC60050zuZ;
import o.pUU;
import org.luaj.vm2.utils.NativeLog;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public final class Globals extends LuaTable {
    public static long AEQbTJ = 10000;
    public static InterfaceC60042zuR AhwBna = null;
    public static boolean EZpvd = false;
    public static LongSparseArray<Globals> KWHzl = new LongSparseArray<>();
    public static LongSparseArray<Globals> OLrzqt = new LongSparseArray<>();
    public static int copydefault = 100;
    public static boolean gEmmrt;
    public static char valueOf;
    public long AYXKKw;
    public boolean AkhnZx;
    public Throwable AuCTel;
    public final long AuCTelauCTel;
    public boolean AubY;
    public String AxsJAY;
    public String DbNXlk;
    public final String djBIcL;
    public boolean ejfBZ;
    public Handler fARcdN;
    public String fIwbmz;
    public boolean fJNWhG;
    public long fetchVPNInfo;
    public InterfaceC60037zuM getFieldNames;
    public final HashMap<Class, String> getNewProxyInstance;
    public long hDKMBd;
    public boolean isConnected;
    public Thread iwGUEr;
    public int sSMYrx;
    public List<Application> uzCIH;
    public int values;
    public Set<InterfaceC60050zuZ> wlaJM;
    public InterfaceC60050zuZ zLjUOn;
    public StringBuilder zsXlph;
    public final C60038zuN zuBGHE;

    public interface Application {
        void AEQbTJ(Globals globals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public static boolean OLrzqt() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC60037zuM AuCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long ejfBZ() {
        return this.AYXKKw;
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.sSMYrx;
    }

    public long fJNWhG() {
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.sSMYrx == 100 || this.fetchVPNInfo > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.AuCTelauCTel != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.NLuaValue
    public int hashCode() {
        long j = this.AYXKKw;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final boolean isDestroyed() {
        return this.destroyed || this.AYXKKw == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean iwGUEr() {
        return this.fARcdN != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fIwbmz;
    }

    public Globals(long j, long j2) {
        super(-1L);
        this.fetchVPNInfo = 0L;
        this.sSMYrx = Integer.MIN_VALUE;
        this.fIwbmz = null;
        this.AuCTel = null;
        this.zsXlph = null;
        this.hDKMBd = 0L;
        this.fJNWhG = false;
        this.values = 0;
        this.zuBGHE = new C60038zuN();
        this.AubY = false;
        this.iwGUEr = Thread.currentThread();
        if (Looper.myLooper() != null) {
            this.fARcdN = new Handler();
        }
        this.AYXKKw = j;
        this.getNewProxyInstance = new HashMap<>();
        this.AuCTelauCTel = j2;
        this.djBIcL = "tag_" + hashCode();
    }

    public static boolean AEQbTJ() {
        if (!EZpvd) {
            try {
                gEmmrt = LuaCApi.EZpvd();
                LuaCApi._setAndroidVersion(Build.VERSION.SDK_INT);
                EZpvd = true;
            } catch (Throwable th) {
                pUU.OLrzqt("MlnInit", "Globals isInit failed", th);
                EZpvd = false;
            }
        }
        return EZpvd;
    }

    public static void OLrzqt(char c) {
        if (c == 1 || c == 2 || c == 3 || c == 0) {
            valueOf = c;
            LuaCApi._setStatisticsOpen(c != 0);
        }
    }

    public static void djBIcL() {
        if ((valueOf & 1) == 1) {
            LuaCApi._notifyStatisticsCallback();
        }
        if ((valueOf & 2) == 2) {
            LuaCApi._notifyRequireCallback();
        }
    }

    public static void OLrzqt(AssetManager assetManager) {
        LuaCApi._setAssetManager(assetManager);
    }

    public static Globals copydefault(boolean z) {
        Globals globals = new Globals(LuaCApi._createLState(z), 0L);
        globals.KWHzl(C60032zuH.EZpvd);
        globals.AkhnZx = z;
        KWHzl(globals);
        return globals;
    }

    public static void KWHzl(String... strArr) {
        LuaCApi._preRegisterEmptyMethods(strArr);
    }

    public static void EZpvd(String str, String... strArr) {
        LuaCApi._preRegisterUD(str, strArr);
    }

    public static void OLrzqt(String str, String... strArr) {
        LuaCApi._preRegisterStatic(str, strArr);
    }

    public static void KWHzl(Globals globals) {
        if (globals.ejfBZ) {
            OLrzqt.put(globals.AYXKKw, globals);
        } else {
            KWHzl.put(globals.AYXKKw, globals);
        }
    }

    @InterfaceC60044zuT
    public static void __onNativeCreateGlobals(long j, long j2, boolean z) {
        Globals globals = new Globals(j2, j);
        globals.AkhnZx = z;
        if (j == 0) {
            globals.ejfBZ = true;
            globals.OLrzqt(C60032zuH.EZpvd, false);
            OLrzqt(globals);
        } else {
            Globals globalsEZpvd = EZpvd(j);
            globals.OLrzqt(globalsEZpvd.getFieldNames);
            globals.OLrzqt(globalsEZpvd.DbNXlk, false);
            globals.KWHzl(globalsEZpvd.AxsJAY);
            globals.KWHzl(globalsEZpvd.zLjUOn);
            if (globalsEZpvd.wlaJM != null) {
                globals.wlaJM = new LinkedHashSet(globalsEZpvd.wlaJM);
            }
        }
        KWHzl(globals);
        C7318aha.KWHzl(globals, j == 0);
    }

    @InterfaceC60044zuT
    public static void __onGlobalsDestroyInNative(long j) {
        Globals globalsValueAt;
        int iIndexOfKey = KWHzl.indexOfKey(j);
        if (iIndexOfKey >= 0) {
            globalsValueAt = KWHzl.valueAt(iIndexOfKey);
            KWHzl.removeAt(iIndexOfKey);
        } else {
            int iIndexOfKey2 = OLrzqt.indexOfKey(j);
            if (iIndexOfKey2 > 0) {
                Globals globalsValueAt2 = OLrzqt.valueAt(iIndexOfKey2);
                OLrzqt.removeAt(iIndexOfKey2);
                globalsValueAt = globalsValueAt2;
            } else {
                globalsValueAt = null;
            }
        }
        if (globalsValueAt != null) {
            globalsValueAt.destroy();
        }
    }

    public static Globals EZpvd(long j) {
        Globals globals = KWHzl.get(j);
        return globals == null ? OLrzqt.get(j) : globals;
    }

    public static String copydefault() {
        int size = KWHzl.size();
        StringBuilder sb = new StringBuilder("normal globals pointers:[");
        for (int i = 0; i < size; i++) {
            long jKeyAt = KWHzl.keyAt(i);
            if (i == 0) {
                sb.append(Long.toHexString(jKeyAt));
            } else {
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(Long.toHexString(jKeyAt));
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        sb.append("\nspecial globals pointers:[");
        int size2 = OLrzqt.size();
        for (int i2 = 0; i2 < size2; i2++) {
            long jKeyAt2 = OLrzqt.keyAt(i2);
            if (i2 == 0) {
                sb.append(Long.toHexString(jKeyAt2));
            } else {
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(Long.toHexString(jKeyAt2));
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static int KWHzl() {
        return KWHzl.size() + OLrzqt.size();
    }

    public static long EZpvd() {
        return LuaCApi._allLvmMemUse();
    }

    public static void valueOf() {
        LuaCApi._logMemoryInfo();
    }

    public static void copydefault(String str) {
        if (!new File(str).exists()) {
            throw new IllegalStateException(str + " is not exists!");
        }
        LuaCApi._setDatabasePath(str);
    }

    public final void getFieldNames() {
        if (this.AkhnZx) {
            return;
        }
        LuaCApi._openDebug(this.AYXKKw);
        this.AkhnZx = true;
    }

    public final void OLrzqt(String str, boolean z) {
        AYXKKw();
        if (str == null) {
            str = "";
        }
        this.DbNXlk = str;
        LuaCApi._setBasePath(this.AYXKKw, str, z);
    }

    public final void KWHzl(String str) {
        if (str == null) {
            return;
        }
        AYXKKw();
        this.AxsJAY = str;
        LuaCApi._setSoPath(this.AYXKKw, str);
    }

    public final boolean copydefault(byte[] bArr, String str, int i) {
        AYXKKw();
        if (this.isConnected) {
            return true;
        }
        if (!this.AkhnZx) {
            getFieldNames();
        }
        try {
            this.sSMYrx = LuaCApi._startDebug(this.AYXKKw, bArr, str, i);
        } catch (Throwable th) {
            this.AuCTel = th;
            this.fIwbmz = th.getMessage();
            this.sSMYrx = -1;
        }
        boolean z = this.sSMYrx == 0;
        this.isConnected = z;
        return z;
    }

    public final boolean OLrzqt(String str, byte[] bArr) {
        AYXKKw();
        try {
            this.sSMYrx = LuaCApi._loadData(this.AYXKKw, str, bArr);
        } catch (Throwable th) {
            this.AuCTel = th;
            this.fIwbmz = th.getMessage();
            this.sSMYrx = -1;
        }
        return this.sSMYrx == 0;
    }

    public final boolean KWHzl(String str, String str2) {
        AYXKKw();
        try {
            this.sSMYrx = LuaCApi._loadFile(this.AYXKKw, str, str2);
        } catch (Throwable th) {
            this.AuCTel = th;
            this.fIwbmz = th.getMessage();
            this.sSMYrx = -1;
        }
        return this.sSMYrx == 0;
    }

    public final boolean AEQbTJ(String str, String str2) {
        AYXKKw();
        try {
            this.sSMYrx = LuaCApi._loadAssetsFile(this.AYXKKw, str, str2);
        } catch (Throwable th) {
            this.AuCTel = th;
            this.fIwbmz = th.getMessage();
            this.sSMYrx = -1;
        }
        return this.sSMYrx == 0;
    }

    public final boolean gEmmrt() {
        AYXKKw();
        int i = this.sSMYrx;
        if (i != 0) {
            if (i == Integer.MIN_VALUE) {
                throw new IllegalStateException("Lua script is not loaded!");
            }
            throw new IllegalStateException("state of loading lua script is not ok, code: " + this.sSMYrx);
        }
        try {
            this.sSMYrx = 100;
            this.sSMYrx = LuaCApi._doLoadedData(this.AYXKKw);
        } catch (Throwable th) {
            this.AuCTel = th;
            this.sSMYrx = -1;
            this.fIwbmz = th.getMessage();
        }
        return this.sSMYrx == 0;
    }

    public final void AEQbTJ(String[] strArr, String[] strArr2, String[] strArr3) {
        AYXKKw();
        int length = strArr.length;
        if (length != strArr2.length || length != strArr3.length) {
            throw new IllegalArgumentException("lcns lpcns jcns must have same length");
        }
        Thread.currentThread().getId();
        LuaCApi._registerAllStaticClass(this.AYXKKw, strArr, strArr2, strArr3);
    }

    public final void EZpvd(String[] strArr, String[] strArr2, String[] strArr3, boolean[] zArr) throws RuntimeException {
        AYXKKw();
        int length = strArr.length;
        if (length != strArr2.length || length != strArr3.length) {
            throw new IllegalArgumentException("lcns lpcns jcns must have same length");
        }
        LuaCApi._registerAllUserdata(this.AYXKKw, strArr, strArr2, strArr3, zArr);
    }

    public final void AEQbTJ(String str, String[] strArr, double[] dArr) {
        AYXKKw();
        if (strArr == null || dArr == null) {
            return;
        }
        if (strArr.length != dArr.length) {
            throw new IllegalArgumentException("keys and values must have same length!");
        }
        LuaCApi._registerNumberEnum(this.AYXKKw, str, strArr, dArr);
    }

    public final void OLrzqt(String str, String[] strArr, String[] strArr2) {
        AYXKKw();
        if (strArr == null || strArr2 == null) {
            return;
        }
        if (strArr.length != strArr2.length) {
            throw new IllegalArgumentException("keys and values must have same length!");
        }
        LuaCApi._registerStringEnum(this.AYXKKw, str, strArr, strArr2);
    }

    public static void OLrzqt(Globals globals) {
        int size = KWHzl.size();
        for (int i = 0; i < size; i++) {
            Globals globalsValueAt = KWHzl.valueAt(i);
            Set<InterfaceC60050zuZ> set = globalsValueAt.wlaJM;
            if (set != null) {
                globals.wlaJM.addAll(set);
                InterfaceC60050zuZ interfaceC60050zuZ = globalsValueAt.zLjUOn;
                if (interfaceC60050zuZ != null) {
                    globals.wlaJM.add(interfaceC60050zuZ);
                }
            }
        }
    }

    public static void EZpvd(InterfaceC60050zuZ interfaceC60050zuZ) {
        int size = OLrzqt.size();
        for (int i = 0; i < size; i++) {
            OLrzqt.valueAt(i).wlaJM.add(interfaceC60050zuZ);
        }
    }

    public void KWHzl(InterfaceC60050zuZ interfaceC60050zuZ) {
        this.zLjUOn = interfaceC60050zuZ;
        if (this.ejfBZ) {
            return;
        }
        EZpvd(interfaceC60050zuZ);
    }

    public void OLrzqt(Collection<InterfaceC60050zuZ> collection) {
        this.wlaJM = new LinkedHashSet(collection);
    }

    public void AEQbTJ(InterfaceC60050zuZ interfaceC60050zuZ) {
        if (this.wlaJM == null) {
            this.wlaJM = new LinkedHashSet();
        }
        this.wlaJM.add(interfaceC60050zuZ);
        if (this.ejfBZ) {
            return;
        }
        EZpvd(interfaceC60050zuZ);
    }

    public void isConnected() {
        Set<InterfaceC60050zuZ> set = this.wlaJM;
        if (set != null) {
            set.clear();
        }
    }

    public final boolean AEQbTJ(Runnable runnable) {
        Handler handler = this.fARcdN;
        if (handler != null) {
            return handler.post(runnable);
        }
        return false;
    }

    public final boolean AEQbTJ(Runnable runnable, long j) {
        Message messageObtain = Message.obtain(this.fARcdN, runnable);
        messageObtain.obj = this.djBIcL;
        return this.fARcdN.sendMessageDelayed(messageObtain, j);
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public final void destroy() {
        AkhnZx();
        if (!isDestroyed() && C7318aha.copydefault && (this.sSMYrx == 100 || this.fetchVPNInfo > 0)) {
            throw new IllegalStateException("throw in debug mode, cannot destroy lua vm when lua function is calling!");
        }
        if (isDestroyed()) {
            return;
        }
        C7318aha.copydefault(this);
        List<Application> list = this.uzCIH;
        if (list != null) {
            Iterator<Application> it = list.iterator();
            while (it.hasNext()) {
                it.next().AEQbTJ(this);
            }
            this.uzCIH.clear();
        }
        this.destroyed = true;
        long j = this.AYXKKw;
        this.AYXKKw = 0L;
        Handler handler = this.fARcdN;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this.djBIcL);
        }
        if (!hDKMBd()) {
            LuaCApi._close(j);
        }
        this.zuBGHE.EZpvd();
        InterfaceC60037zuM interfaceC60037zuM = this.getFieldNames;
        if (interfaceC60037zuM != null) {
            interfaceC60037zuM.KWHzl(this);
        }
        this.getFieldNames = null;
        NativeLog.AEQbTJ(j);
        KWHzl.remove(j);
        OLrzqt.remove(j);
        this.getNewProxyInstance.clear();
        this.zLjUOn = null;
        Set<InterfaceC60050zuZ> set = this.wlaJM;
        if (set != null) {
            set.clear();
        }
    }

    public final Object copydefault(String str, String str2, LuaValue... luaValueArr) throws RuntimeException {
        AYXKKw();
        return LuaCApi._createUserdataAndSet(this.AYXKKw, str, str2, luaValueArr);
    }

    public final void OLrzqt(InterfaceC60037zuM interfaceC60037zuM) {
        this.getFieldNames = interfaceC60037zuM;
        NativeLog.EZpvd(this.AYXKKw, interfaceC60037zuM);
    }

    public final String EZpvd(Class cls) {
        return this.getNewProxyInstance.get(cls);
    }

    public final void EZpvd(Map<Class, String> map) {
        this.getNewProxyInstance.putAll(map);
    }

    public void KWHzl(Application application) {
        synchronized (this) {
            if (application == null) {
                return;
            }
            if (this.uzCIH == null) {
                this.uzCIH = new ArrayList();
            }
            this.uzCIH.add(application);
        }
    }

    public void AEQbTJ(Application application) {
        synchronized (this) {
            List<Application> list = this.uzCIH;
            if (list != null) {
                list.remove(application);
            }
        }
    }

    public static String EZpvd(Class cls, Map<Class, String> map) {
        for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class && superclass != JavaUserdata.class && superclass != LuaUserdata.class; superclass = superclass.getSuperclass()) {
            String str = map.get(superclass);
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    public boolean uzCIH() {
        return this.iwGUEr == Thread.currentThread();
    }

    public void AkhnZx() {
        if (uzCIH()) {
            return;
        }
        throw new IllegalStateException("must called in main thread: " + this.globals.iwGUEr);
    }

    public boolean AEQbTJ(final LuaValue luaValue) {
        if (luaValue instanceof Globals) {
            return false;
        }
        AYXKKw();
        final long jNativeGlobalKey = luaValue.nativeGlobalKey();
        if (jNativeGlobalKey != 0 && jNativeGlobalKey != -1) {
            if (uzCIH() && AhwBna()) {
                boolean z = LuaCApi._removeNativeValue(this.AYXKKw, jNativeGlobalKey, luaValue.type()) <= 0;
                if (z) {
                    this.values++;
                    fetchVPNInfo();
                }
                return z;
            }
            Handler handler = this.fARcdN;
            if (handler != null) {
                handler.post(new Runnable() { // from class: org.luaj.vm2.Globals.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Globals.this.isDestroyed()) {
                            return;
                        }
                        LuaValue luaValue2 = luaValue;
                        luaValue2.destroyed = LuaCApi._removeNativeValue(Globals.this.AYXKKw, jNativeGlobalKey, luaValue2.type()) <= 0;
                        if (luaValue.destroyed) {
                            Globals.this.values++;
                            Globals.this.fetchVPNInfo();
                        }
                    }
                });
            }
        }
        return true;
    }

    public final boolean AhwBna() {
        return !this.fJNWhG || System.currentTimeMillis() - this.hDKMBd < 10;
    }

    public final boolean copydefault(long j) {
        return (this.fJNWhG || this.sSMYrx == Integer.MIN_VALUE || isDestroyed() || j - this.hDKMBd <= AEQbTJ) ? false : true;
    }

    public final boolean fetchVPNInfo() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!copydefault(jCurrentTimeMillis) || this.values <= copydefault) {
            return false;
        }
        this.values = 0;
        this.hDKMBd = jCurrentTimeMillis;
        this.fJNWhG = true;
        LuaCApi._lgc(this.AYXKKw);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.hDKMBd = jCurrentTimeMillis2;
        C7318aha.EZpvd(this, jCurrentTimeMillis2 - jCurrentTimeMillis);
        this.fJNWhG = false;
        return true;
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final void set(int i, LuaValue luaValue) {
        wlaJM();
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final void set(int i, double d) {
        wlaJM();
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final void set(int i, boolean z) {
        wlaJM();
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final void set(int i, String str) {
        wlaJM();
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.LuaValue
    public final LuaValue get(int i) {
        wlaJM();
        return null;
    }

    public final void wlaJM() {
        throw new UnsupportedOperationException("global is not support set/get a number key!");
    }

    @InterfaceC60044zuT
    private static Object __onLuaRequire(long j, String str) {
        return EZpvd(j).OLrzqt(str);
    }

    @InterfaceC60044zuT
    private static String __getRequireError(long j) {
        return EZpvd(j).fARcdN();
    }

    @InterfaceC60044zuT
    private static void __onLuaGC(long j) {
        System.gc();
    }

    @InterfaceC60044zuT
    private static void __onEmptyMethodCall(long j, String str, String str2) {
        Globals globalsEZpvd;
        if (AhwBna == null || (globalsEZpvd = EZpvd(j)) == null) {
            return;
        }
        AhwBna.AEQbTJ(globalsEZpvd, str, str2);
    }

    @InterfaceC60044zuT
    private static int __postCallback(final long j, final long j2, final long j3) {
        Globals globalsEZpvd = EZpvd(j);
        if (globalsEZpvd == null || globalsEZpvd.isDestroyed()) {
            return -2;
        }
        if (!globalsEZpvd.iwGUEr()) {
            return -3;
        }
        globalsEZpvd.fARcdN.post(new Runnable() { // from class: org.luaj.vm2.Globals.3
            @Override // java.lang.Runnable
            public void run() {
                LuaCApi._callMethod(Globals.this.isDestroyed() ? 0L : j, j2, j3);
            }
        });
        return 0;
    }

    public final Object OLrzqt(String str) {
        StringBuilder sb = this.zsXlph;
        if (sb != null) {
            sb.setLength(0);
        }
        InterfaceC60050zuZ interfaceC60050zuZ = this.zLjUOn;
        if (interfaceC60050zuZ == null && this.wlaJM == null) {
            if (this.zsXlph == null) {
                this.zsXlph = new StringBuilder();
            }
            this.zsXlph.append("\n\t\tno resource finder set in java!");
            return null;
        }
        Object objOLrzqt = OLrzqt(interfaceC60050zuZ, str);
        if (objOLrzqt != null) {
            return objOLrzqt;
        }
        copydefault(this.zLjUOn);
        Set<InterfaceC60050zuZ> set = this.wlaJM;
        if (set != null) {
            for (InterfaceC60050zuZ interfaceC60050zuZ2 : set) {
                Object objOLrzqt2 = OLrzqt(interfaceC60050zuZ2, str);
                if (objOLrzqt2 != null) {
                    return objOLrzqt2;
                }
                copydefault(interfaceC60050zuZ2);
            }
        }
        return null;
    }

    public final String fARcdN() {
        StringBuilder sb = this.zsXlph;
        if (sb == null || sb.length() == 0) {
            return null;
        }
        return this.zsXlph.toString();
    }

    public final void copydefault(InterfaceC60050zuZ interfaceC60050zuZ) {
        String strCopydefault;
        if (interfaceC60050zuZ == null || (strCopydefault = interfaceC60050zuZ.copydefault()) == null || strCopydefault.length() == 0) {
            return;
        }
        if (this.zsXlph == null) {
            this.zsXlph = new StringBuilder();
        }
        StringBuilder sb = this.zsXlph;
        sb.append("\n\t\t");
        sb.append(strCopydefault);
    }

    @InterfaceC60044zuT
    public static Object __getUserdata(long j, long j2) {
        Globals globalsEZpvd = EZpvd(j);
        if (globalsEZpvd == null) {
            return null;
        }
        return globalsEZpvd.zuBGHE.AEQbTJ(j2);
    }

    public final void AYXKKw() {
        if (isDestroyed()) {
            throw new IllegalStateException("this lua vm is destroyed!");
        }
    }

    public static Object OLrzqt(InterfaceC60050zuZ interfaceC60050zuZ, String str) {
        if (interfaceC60050zuZ == null) {
            return null;
        }
        String strAEQbTJ = interfaceC60050zuZ.AEQbTJ(str);
        String strCopydefault = interfaceC60050zuZ.copydefault(strAEQbTJ);
        if (strCopydefault != null) {
            return strCopydefault;
        }
        byte[] bArrOLrzqt = interfaceC60050zuZ.OLrzqt(strAEQbTJ);
        if (bArrOLrzqt == null) {
            return null;
        }
        interfaceC60050zuZ.KWHzl(strAEQbTJ);
        return bArrOLrzqt;
    }

    @Override // org.luaj.vm2.LuaTable, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return "Globals#" + hashCode();
    }
}
