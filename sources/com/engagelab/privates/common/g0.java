package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.FileUtils;
import com.engagelab.privates.common.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes14.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Queue<e0> f332a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, String str, ArrayList<e0> arrayList) {
        synchronized (g0.class) {
            MTCommonLog.d("MsgQueueUtils", "Action - saveObjects");
            if (context == null) {
                MTCommonLog.w("MsgQueueUtils", "unexcepted , context is null");
                return;
            }
            if (arrayList == null) {
                MTCommonLog.w("MsgQueueUtils", "mObjectList is null");
                return;
            }
            try {
                File file = new File(context.getFilesDir(), str);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayList.size(); i++) {
                    jSONArray.put(arrayList.get(i).a());
                }
                FileUtils.save(file.getAbsolutePath(), jSONArray.toString());
            } catch (Throwable th) {
                MTCommonLog.i("MsgQueueUtils", "save Objects  error:" + th.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Context context, String str) {
        synchronized (g0.class) {
            if (context == null) {
                MTCommonLog.w("MsgQueueUtils", "unexcepted , context is null");
                return;
            }
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                MTCommonLog.w("MsgQueueUtils", "can't get files dir");
                return;
            }
            File file = new File(filesDir, str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static ArrayList<e0> a(Context context, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (g0.class) {
            FileInputStream fileInputStream2 = null;
            if (context == null) {
                MTCommonLog.w("MsgQueueUtils", "unexcepted , context is null");
                return null;
            }
            ArrayList<e0> arrayList = new ArrayList<>();
            try {
                File file = new File(context.getFilesDir(), str);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        JSONArray jSONArray = new JSONArray(new String(Utils.readAvailable(fileInputStream)));
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(e0.a(jSONArray.getJSONObject(i)));
                        }
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            MTCommonLog.w("MsgQueueUtils", "load objects error:" + th.getMessage());
                            b(context, str);
                        } finally {
                            Utils.closeQuietly(fileInputStream);
                        }
                    }
                }
                Utils.closeQuietly(fileInputStream2);
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
            return arrayList;
        }
    }

    public static boolean a(Context context, e0 e0Var) {
        if (f332a == null) {
            f332a = new ConcurrentLinkedQueue();
            try {
                ArrayList<e0> arrayListA = a(context, "msg_queue_v350_privates");
                if (arrayListA != null && !arrayListA.isEmpty()) {
                    Iterator<e0> it = arrayListA.iterator();
                    while (it.hasNext()) {
                        f332a.offer(it.next());
                    }
                }
            } catch (Exception e) {
                MTCommonLog.i("MsgQueueUtils", "init lastMsgQueue failed:" + e.getMessage());
            }
        }
        if (context == null) {
            MTCommonLog.i("MsgQueueUtils", "#unexcepted - context was null");
            return false;
        }
        if (e0Var == null) {
            MTCommonLog.i("MsgQueueUtils", "#unexcepted - entityKey was null");
        }
        if (f332a.contains(e0Var)) {
            MTCommonLog.e("MsgQueueUtils", "Duplicated msg. Give up processing - " + e0Var);
            return true;
        }
        if (f332a.size() >= 200) {
            f332a.poll();
        }
        f332a.offer(e0Var);
        try {
            ArrayList<e0> arrayListA2 = a(context, "msg_queue_v350_privates");
            if (arrayListA2 == null) {
                arrayListA2 = new ArrayList<>();
            }
            if (arrayListA2.size() >= 50) {
                arrayListA2.remove(0);
            }
            arrayListA2.add(e0Var);
            a(context, "msg_queue_v350_privates", arrayListA2);
        } catch (Exception e2) {
            MTCommonLog.i("MsgQueueUtils", "msg save in sp failed:" + e2.getMessage());
        }
        return false;
    }
}
