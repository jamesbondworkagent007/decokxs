package com.immomo.mls.fun.lt;

import android.text.TextUtils;
import android.util.Log;
import com.immomo.mls.adapter.MLSThreadAdapter;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.constants.FileInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C7323ahf;
import o.C7326ahi;
import o.C7833arL;
import o.C7840arS;
import o.C7862aro;
import o.C7864arq;
import o.C7866ars;
import o.C7869arv;
import o.C7872ary;
import o.InterfaceC7835arN;
import o.pUU;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(isStatic = true)
public class LTFile {
    @LuaBridge
    public static int syncMoveFile(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return -7;
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            return -14;
        }
        return file.renameTo(file2) ? 0 : -10;
    }

    @LuaBridge
    @Deprecated
    public static String getStorageDir() {
        return C7864arq.AEQbTJ().getAbsolutePath();
    }

    @LuaBridge
    public static String rootPath() {
        return C7864arq.KWHzl().getAbsolutePath();
    }

    @LuaBridge
    public static void asyncCreateFile(String str, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new Fragment(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncCreateDirs(String str, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new LoaderManager(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncDelete(String str, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new PendingIntent(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncMoveFile(Globals globals, String str, String str2, InterfaceC7835arN interfaceC7835arN) {
        C7833arL.copydefault("asyncMoveFile", "syncMoveFile", globals);
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new AssistContent(str, str2, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncCopyFile(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new ActionBar(str, str2, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncGetFileList(String str, boolean z, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new FragmentManager(str, z, interfaceC7835arN));
    }

    @LuaBridge
    public static Map getFileInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            C7833arL.KWHzl("path can`t be null");
            return null;
        }
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(FileInfo.FileSize, Long.valueOf(file.length()));
        map.put(FileInfo.ModiDate, Float.valueOf(file.lastModified() / 1000.0f));
        return map;
    }

    @LuaBridge
    public static boolean exist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        return C7864arq.OLrzqt(str);
    }

    @LuaBridge
    public static boolean isDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        return new File(str).isDirectory();
    }

    @LuaBridge
    public static boolean isFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        return new File(str).isFile();
    }

    @LuaBridge
    public static void asyncReadFile(String str, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new TaskStackBuilder(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncReadMapFile(String str, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new SharedElementCallback(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncReadArrayFile(String str, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new PictureInPictureParams(str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncWriteFile(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new ClipData(str, interfaceC7835arN, str2));
    }

    @LuaBridge
    public static void asyncWriteMap(String str, Map map, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new ComponentName(str, interfaceC7835arN, map));
    }

    @LuaBridge
    public static void asyncWriteArray(String str, List list, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new ComponentCallbacks(str, interfaceC7835arN, list));
    }

    @LuaBridge
    public static void asyncUnzipFile(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        if (C7872ary.gEmmrt(str2)) {
            str2 = C7872ary.OLrzqt(str2);
        }
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new VoiceInteractor(str, str2, str, interfaceC7835arN));
    }

    @LuaBridge
    public static void asyncMd5File(Globals globals, String str, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().KWHzl(MLSThreadAdapter.Priority.HIGH, new Dialog(globals, str, interfaceC7835arN));
    }

    @LuaBridge
    public static String syncReadString(String str) throws Throwable {
        StateListAnimator stateListAnimatorAYXKKw = AYXKKw(str);
        if (stateListAnimatorAYXKKw.EZpvd != 0) {
            return null;
        }
        return (String) stateListAnimatorAYXKKw.OLrzqt;
    }

    @LuaBridge
    public static int syncWriteFile(String str, String str2) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        int iOLrzqt = OLrzqt(str);
        return iOLrzqt != 0 ? iOLrzqt : EZpvd(new File(str), str2);
    }

    @LuaBridge
    public static int syncWriteMap(String str, Map map) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        int iOLrzqt = OLrzqt(str);
        return iOLrzqt != 0 ? iOLrzqt : EZpvd(new File(str), new JSONObject(map).toString());
    }

    @LuaBridge
    public static int syncWriteArray(String str, List list) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        int iOLrzqt = OLrzqt(str);
        return iOLrzqt != 0 ? iOLrzqt : EZpvd(new File(str), new JSONArray((Collection) list).toString());
    }

    @LuaBridge
    public static int syncUnzipFile(String str, String str2) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        if (C7872ary.gEmmrt(str2)) {
            str2 = C7872ary.OLrzqt(str2);
        }
        return KWHzl(str, str2);
    }

    @LuaBridge
    public static LuaValue syncMd5File(String str) {
        if (TextUtils.isEmpty(str)) {
            return LuaValue.Nil();
        }
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return LuaString.copydefault(C7862aro.EZpvd(C7864arq.copydefault(file)));
        }
        return LuaValue.Nil();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PictureInPictureParams extends Application {
        public PictureInPictureParams(String str, InterfaceC7835arN interfaceC7835arN) {
            super(str, interfaceC7835arN);
        }

        @Override // com.immomo.mls.fun.lt.LTFile.Application
        public Object EZpvd(String str) {
            try {
                return C7869arv.KWHzl(new JSONArray(str));
            } catch (JSONException unused) {
                OLrzqt(-4);
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SharedElementCallback extends Application {
        public SharedElementCallback(String str, InterfaceC7835arN interfaceC7835arN) {
            super(str, interfaceC7835arN);
        }

        @Override // com.immomo.mls.fun.lt.LTFile.Application
        public Object EZpvd(String str) {
            try {
                return C7869arv.KWHzl(new JSONObject(str));
            } catch (JSONException unused) {
                OLrzqt(-4);
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskStackBuilder extends Application {
        @Override // com.immomo.mls.fun.lt.LTFile.Application
        public Object EZpvd(String str) {
            return str;
        }

        public TaskStackBuilder(String str, InterfaceC7835arN interfaceC7835arN) {
            super(str, interfaceC7835arN);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Application extends Activity {
        public String copydefault;

        public abstract Object EZpvd(String str);

        public Application(String str, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.copydefault = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (C7872ary.EZpvd(this.copydefault)) {
                this.copydefault = C7872ary.copydefault(this.copydefault);
            } else if (C7872ary.gEmmrt(this.copydefault)) {
                this.copydefault = C7872ary.OLrzqt(this.copydefault);
            }
            File file = new File(this.copydefault);
            if (!file.exists()) {
                byte[] bArrOLrzqt = OLrzqt();
                if (bArrOLrzqt == null) {
                    OLrzqt(-1);
                    return;
                } else {
                    AEQbTJ(new String(bArrOLrzqt));
                    return;
                }
            }
            if (!file.isFile()) {
                OLrzqt(-2);
                return;
            }
            byte[] bArrCopydefault = C7864arq.copydefault(file);
            if (bArrCopydefault == null) {
                OLrzqt(-3);
            } else {
                AEQbTJ(new String(bArrCopydefault));
            }
        }

        public final byte[] OLrzqt() throws Throwable {
            IOException e;
            InputStream inputStreamOpen;
            InputStream inputStream = null;
            try {
                inputStreamOpen = C7326ahi.OLrzqt().getAssets().open(this.copydefault);
            } catch (IOException e2) {
                e = e2;
                inputStreamOpen = null;
            } catch (Throwable th) {
                th = th;
                C7866ars.AEQbTJ((Closeable) inputStream);
                throw th;
            }
            try {
                try {
                    byte[] bArrAEQbTJ = C7866ars.AEQbTJ(inputStreamOpen);
                    C7866ars.AEQbTJ((Closeable) inputStreamOpen);
                    return bArrAEQbTJ;
                } catch (Throwable th2) {
                    InputStream inputStream2 = inputStreamOpen;
                    th = th2;
                    inputStream = inputStream2;
                    C7866ars.AEQbTJ((Closeable) inputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                pUU.copydefault("mln", Log.getStackTraceString(e));
                C7866ars.AEQbTJ((Closeable) inputStreamOpen);
                return null;
            }
        }

        public void AEQbTJ(String str) {
            Object objEZpvd;
            if (this.EZpvd == null || (objEZpvd = EZpvd(str)) == null) {
                return;
            }
            EZpvd(0, objEZpvd);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ComponentCallbacks extends TaskDescription<List> {
        public ComponentCallbacks(String str, InterfaceC7835arN interfaceC7835arN, List list) {
            super(str, interfaceC7835arN, list);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/String; */
        @Override // com.immomo.mls.fun.lt.LTFile.TaskDescription
        public String EZpvd(List list) {
            return new JSONArray((Collection) list).toString();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ComponentName extends TaskDescription<Map> {
        public ComponentName(String str, InterfaceC7835arN interfaceC7835arN, Map map) {
            super(str, interfaceC7835arN, map);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/String; */
        @Override // com.immomo.mls.fun.lt.LTFile.TaskDescription
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public String EZpvd(Map map) {
            return new JSONObject(map).toString();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ClipData extends TaskDescription<String> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/String; */
        @Override // com.immomo.mls.fun.lt.LTFile.TaskDescription
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public String EZpvd(String str) {
            return str;
        }

        public ClipData(String str, InterfaceC7835arN interfaceC7835arN, String str2) {
            super(str, interfaceC7835arN, str2);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class TaskDescription<T> extends Activity {
        public T AEQbTJ;
        public String OLrzqt;

        public abstract String EZpvd(T t);

        public TaskDescription(String str, InterfaceC7835arN interfaceC7835arN, T t) {
            super(interfaceC7835arN);
            this.AEQbTJ = t;
            this.OLrzqt = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7872ary.EZpvd(this.OLrzqt)) {
                this.OLrzqt = C7872ary.copydefault(this.OLrzqt);
            } else if (C7872ary.gEmmrt(this.OLrzqt)) {
                this.OLrzqt = C7872ary.OLrzqt(this.OLrzqt);
            }
            File file = new File(this.OLrzqt);
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                OLrzqt(-5);
                return;
            }
            if (file.isDirectory()) {
                OLrzqt(-2);
                return;
            }
            String strEZpvd = EZpvd(this.AEQbTJ);
            if (strEZpvd == null) {
                return;
            }
            if (C7864arq.copydefault(file, OLrzqt(strEZpvd))) {
                EZpvd(0, C7872ary.KWHzl(this.OLrzqt));
            } else {
                OLrzqt(-6);
            }
        }

        public byte[] OLrzqt(String str) {
            return str.getBytes();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class VoiceInteractor extends Activity {
        public String KWHzl;
        public String OLrzqt;
        public String copydefault;

        public VoiceInteractor(String str, String str2, String str3, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.copydefault = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iKWHzl = LTFile.KWHzl(this.KWHzl, this.OLrzqt);
            EZpvd(Integer.valueOf(iKWHzl), this.copydefault);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Dialog extends Activity {
        public String KWHzl;
        public Globals copydefault;

        public Dialog(Globals globals, String str, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.KWHzl = str;
            this.copydefault = globals;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.KWHzl)) {
                EZpvd(LuaValue.Nil());
                return;
            }
            if (C7872ary.gEmmrt(this.KWHzl)) {
                this.KWHzl = C7872ary.OLrzqt(this.KWHzl);
            }
            File file = new File(this.KWHzl);
            if (file.exists() && file.isFile()) {
                EZpvd(C7862aro.EZpvd(C7864arq.copydefault(file)));
            } else {
                EZpvd(LuaValue.Nil());
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Fragment extends Activity {
        public String copydefault;

        public Fragment(String str, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.copydefault = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            OLrzqt(LTFile.OLrzqt(this.copydefault));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class LoaderManager extends Activity {
        public String OLrzqt;

        public LoaderManager(String str, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.OLrzqt = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            OLrzqt(LTFile.EZpvd(this.OLrzqt));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class PendingIntent extends Activity {
        public String KWHzl;

        public PendingIntent(String str, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.KWHzl = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.KWHzl)) {
                OLrzqt(-9);
                return;
            }
            if (C7872ary.gEmmrt(this.KWHzl)) {
                this.KWHzl = C7872ary.OLrzqt(this.KWHzl);
            }
            if (this.KWHzl != null) {
                File file = new File(this.KWHzl);
                if (file.exists()) {
                    try {
                        C7864arq.AEQbTJ(file);
                        OLrzqt(0);
                        return;
                    } catch (Throwable unused) {
                    }
                }
            }
            OLrzqt(-9);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class AssistContent extends Activity {
        public String AEQbTJ;
        public String OLrzqt;

        public AssistContent(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LTFile.copydefault(this.OLrzqt, this.AEQbTJ)) {
                OLrzqt(0);
            } else {
                OLrzqt(-10);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ActionBar extends Activity {
        public String KWHzl;
        public String copydefault;

        public ActionBar(String str, String str2, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.copydefault = str;
            this.KWHzl = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            boolean zOLrzqt;
            if (TextUtils.isEmpty(this.copydefault) || TextUtils.isEmpty(this.KWHzl)) {
                OLrzqt(-11);
                return;
            }
            if (C7872ary.gEmmrt(this.copydefault)) {
                this.copydefault = C7872ary.OLrzqt(this.copydefault);
            }
            if (C7872ary.gEmmrt(this.KWHzl)) {
                this.KWHzl = C7872ary.OLrzqt(this.KWHzl);
            }
            File file = new File(this.copydefault);
            File file2 = new File(this.KWHzl);
            if (!file.exists() || file2.exists() || (str = this.copydefault) == null || (str2 = this.KWHzl) == null || str.equals(str2)) {
                OLrzqt(-11);
                return;
            }
            if (file.isDirectory()) {
                zOLrzqt = LTFile.copydefault(file, this.KWHzl);
            } else {
                if (file.isFile()) {
                    zOLrzqt = LTFile.OLrzqt(file, this.KWHzl);
                }
                OLrzqt(-11);
            }
            if (zOLrzqt) {
                OLrzqt(0);
                return;
            }
            OLrzqt(-11);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class FragmentManager extends Activity {
        public String AEQbTJ;
        public boolean copydefault;

        public FragmentManager(String str, boolean z, InterfaceC7835arN interfaceC7835arN) {
            super(interfaceC7835arN);
            this.AEQbTJ = str;
            this.copydefault = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.AEQbTJ)) {
                C7833arL.KWHzl("path can`t be null");
                return;
            }
            if (C7872ary.gEmmrt(this.AEQbTJ)) {
                this.AEQbTJ = C7872ary.OLrzqt(this.AEQbTJ);
            }
            List listKWHzl = LTFile.KWHzl(this.AEQbTJ, new File(this.AEQbTJ), this.copydefault);
            if (listKWHzl != null) {
                EZpvd(0, listKWHzl);
            } else {
                OLrzqt(-12);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity implements Runnable {
        public InterfaceC7835arN EZpvd;

        public Activity(InterfaceC7835arN interfaceC7835arN) {
            this.EZpvd = interfaceC7835arN;
        }

        public final void OLrzqt(int i) {
            if (this.EZpvd != null) {
                EZpvd(Integer.valueOf(i));
            }
        }

        public void EZpvd(final Object... objArr) {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.lt.LTFile.Activity.1
                @Override // java.lang.Runnable
                public void run() {
                    Activity.this.EZpvd.EZpvd(objArr);
                }
            });
        }
    }

    public static StateListAnimator AYXKKw(String str) throws Throwable {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        int iCopydefault = copydefault(str);
        if (iCopydefault != 0) {
            return new StateListAnimator(iCopydefault);
        }
        byte[] bArrKWHzl = C7864arq.KWHzl(new File(str));
        if (bArrKWHzl == null) {
            return new StateListAnimator(-3);
        }
        return new StateListAnimator(0, new String(bArrKWHzl));
    }

    public static int copydefault(String str) {
        File file = new File(str);
        if (file.exists()) {
            return !file.isFile() ? -2 : 0;
        }
        return -1;
    }

    public static int OLrzqt(String str) {
        return AEQbTJ(str, true);
    }

    public static int EZpvd(String str) {
        return AEQbTJ(str, false);
    }

    public static int AEQbTJ(String str, boolean z) {
        if (C7872ary.gEmmrt(str)) {
            str = C7872ary.OLrzqt(str);
        }
        File file = new File(str);
        if (file.exists()) {
            if (!z || file.isFile()) {
                return (z || file.isDirectory()) ? 0 : -5;
            }
            return -2;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return -5;
        }
        if (!z) {
            return file.mkdir() ? 0 : -5;
        }
        try {
            return file.createNewFile() ? 0 : -8;
        } catch (Throwable unused) {
            return -8;
        }
    }

    public static int EZpvd(File file, String str) {
        return !C7864arq.OLrzqt(file, str.getBytes()) ? -6 : 0;
    }

    public static int KWHzl(String str, String str2) {
        int iCopydefault = copydefault(str);
        if (iCopydefault != 0) {
            return iCopydefault;
        }
        int iEZpvd = EZpvd(str2);
        if (iEZpvd != 0) {
            return iEZpvd;
        }
        try {
            C7864arq.KWHzl(str2, new FileInputStream(new File(str)));
            return 0;
        } catch (Exception e) {
            pUU.copydefault("mln", Log.getStackTraceString(e));
            return -2;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public int EZpvd;
        public Object OLrzqt;

        public StateListAnimator(int i, Object obj) {
            this.EZpvd = i;
            this.OLrzqt = obj;
        }

        public StateListAnimator(int i) {
            this.EZpvd = i;
            this.OLrzqt = null;
        }
    }

    public static boolean copydefault(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (C7872ary.gEmmrt(str)) {
                str = C7872ary.OLrzqt(str);
            }
            if (C7872ary.gEmmrt(str2)) {
                str2 = C7872ary.OLrzqt(str2);
            }
            File file = new File(str);
            if (file.exists() && str != null && str2 != null && !str.equals(str2)) {
                if (file.isFile()) {
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        return false;
                    }
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    return file.renameTo(file2);
                }
                if (!file.isDirectory()) {
                    return true;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return false;
                }
                File file3 = new File(str2);
                if (file3.exists()) {
                    return false;
                }
                file3.mkdirs();
                for (File file4 : fileArrListFiles) {
                    if (file4.isDirectory()) {
                        if (!copydefault(file4.getPath(), str2 + File.separator + file4.getName())) {
                            return false;
                        }
                        file4.delete();
                    }
                    if (file4.isFile()) {
                        File file5 = new File(file3 + File.separator + file4.getName());
                        if (file5.exists()) {
                            file5.delete();
                        }
                        if (!file4.renameTo(file5)) {
                            return false;
                        }
                    }
                }
                return file.delete();
            }
        }
        return false;
    }

    public static boolean OLrzqt(File file, String str) {
        if (file.exists() && file.isFile()) {
            return C7864arq.copydefault(file, new File(str));
        }
        return false;
    }

    public static boolean copydefault(File file, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        } else if (file2.isFile()) {
            return false;
        }
        for (String str2 : file.list()) {
            File file3 = new File(file.getAbsolutePath() + str2);
            if (file3.isFile()) {
                if (!C7864arq.copydefault(file3, new File(str + File.separator + file3.getName()))) {
                    return false;
                }
            }
            if (file3.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append(file.getAbsolutePath());
                String str3 = File.separator;
                sb.append(str3);
                sb.append(str2);
                if (!copydefault(new File(sb.toString()), str + str3 + str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<String> KWHzl(String str, File file, boolean z) {
        ArrayList arrayList = null;
        if (file != null && file.exists() && !file.isFile()) {
            if (!z) {
                String[] list = file.list();
                if (list != null) {
                    return Arrays.asList(list);
                }
                return null;
            }
            arrayList = new ArrayList();
            for (File file2 : file.listFiles()) {
                if (file2 != null && file2.exists()) {
                    if (file2.isFile()) {
                        arrayList.add(EZpvd(str, file2.getAbsolutePath()));
                    } else if (file2.isDirectory()) {
                        arrayList.add(EZpvd(str, file2.getAbsolutePath()));
                        List<String> listKWHzl = KWHzl(str, file2, z);
                        if (listKWHzl != null) {
                            arrayList.addAll(listKWHzl);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String EZpvd(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        return str2.replace(str, "");
    }
}
