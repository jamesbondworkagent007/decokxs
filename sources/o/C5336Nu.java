package o;

import android.os.Build;
import android.os.StrictMode;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: o.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5336Nu implements java.io.Closeable {
    public final java.io.File AEQbTJ;
    public final java.io.File AYXKKw;
    public int DbNXlk;
    public final java.io.File KWHzl;
    public final int OLrzqt;
    public long djBIcL;
    public final java.io.File gEmmrt;
    public java.io.Writer valueOf;
    public final int values;
    public long isConnected = 0;
    public final LinkedHashMap<java.lang.String, TaskDescription> AhwBna = new LinkedHashMap<>(0, 0.75f, true);
    public long fetchVPNInfo = 0;
    public final ThreadPoolExecutor copydefault = new ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new LinkedBlockingQueue(), new ActionBar());
    public final Callable<java.lang.Void> EZpvd = new Callable<java.lang.Void>() { // from class: o.Nu.4
        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() throws java.lang.Exception {
            synchronized (C5336Nu.this) {
                if (C5336Nu.this.valueOf == null) {
                    return null;
                }
                C5336Nu.this.AYXKKw();
                if (C5336Nu.this.EZpvd()) {
                    C5336Nu.this.gEmmrt();
                    C5336Nu.this.DbNXlk = 0;
                }
                return null;
            }
        }
    };

    public C5336Nu(java.io.File file, int i, int i2, long j) {
        this.KWHzl = file;
        this.OLrzqt = i;
        this.AEQbTJ = new java.io.File(file, "journal");
        this.AYXKKw = new java.io.File(file, "journal.tmp");
        this.gEmmrt = new java.io.File(file, "journal.bkp");
        this.values = i2;
        this.djBIcL = j;
    }

    public static C5336Nu copydefault(java.io.File file, int i, int i2, long j) throws java.io.IOException {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0");
        }
        java.io.File file2 = new java.io.File(file, "journal.bkp");
        if (file2.exists()) {
            java.io.File file3 = new java.io.File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                AEQbTJ(file2, file3, false);
            }
        }
        C5336Nu c5336Nu = new C5336Nu(file, i, i2, j);
        if (c5336Nu.AEQbTJ.exists()) {
            try {
                c5336Nu.copydefault();
                c5336Nu.AEQbTJ();
                return c5336Nu;
            } catch (java.io.IOException e) {
                java.lang.System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c5336Nu.KWHzl();
            }
        }
        file.mkdirs();
        C5336Nu c5336Nu2 = new C5336Nu(file, i, i2, j);
        c5336Nu2.gEmmrt();
        return c5336Nu2;
    }

    public final void copydefault() throws java.io.IOException {
        C5338Nw c5338Nw = new C5338Nw(new java.io.FileInputStream(this.AEQbTJ), C5339Nx.AEQbTJ);
        try {
            java.lang.String strOLrzqt = c5338Nw.OLrzqt();
            java.lang.String strOLrzqt2 = c5338Nw.OLrzqt();
            java.lang.String strOLrzqt3 = c5338Nw.OLrzqt();
            java.lang.String strOLrzqt4 = c5338Nw.OLrzqt();
            java.lang.String strOLrzqt5 = c5338Nw.OLrzqt();
            if (!"libcore.io.DiskLruCache".equals(strOLrzqt) || !"1".equals(strOLrzqt2) || !java.lang.Integer.toString(this.OLrzqt).equals(strOLrzqt3) || !java.lang.Integer.toString(this.values).equals(strOLrzqt4) || !"".equals(strOLrzqt5)) {
                throw new java.io.IOException("unexpected journal header: [" + strOLrzqt + ", " + strOLrzqt2 + ", " + strOLrzqt4 + ", " + strOLrzqt5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    AEQbTJ(c5338Nw.OLrzqt());
                    i++;
                } catch (java.io.EOFException unused) {
                    this.DbNXlk = i - this.AhwBna.size();
                    if (c5338Nw.EZpvd()) {
                        gEmmrt();
                    } else {
                        this.valueOf = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.AEQbTJ, true), C5339Nx.AEQbTJ));
                    }
                    C5339Nx.KWHzl(c5338Nw);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            C5339Nx.KWHzl(c5338Nw);
            throw th;
        }
    }

    public final void AEQbTJ(java.lang.String str) throws java.io.IOException {
        java.lang.String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new java.io.IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.AhwBna.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        TaskDescription taskDescription = this.AhwBna.get(strSubstring);
        if (taskDescription == null) {
            taskDescription = new TaskDescription(strSubstring);
            this.AhwBna.put(strSubstring, taskDescription);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            java.lang.String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            taskDescription.djBIcL = true;
            taskDescription.OLrzqt = null;
            taskDescription.EZpvd(strArrSplit);
            return;
        }
        if (iIndexOf2 != -1 || iIndexOf != 5 || !str.startsWith("DIRTY")) {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new java.io.IOException("unexpected journal line: " + str);
        }
        taskDescription.OLrzqt = new Activity(taskDescription);
    }

    public final void AEQbTJ() throws java.io.IOException {
        KWHzl(this.AYXKKw);
        java.util.Iterator<TaskDescription> it = this.AhwBna.values().iterator();
        while (it.hasNext()) {
            TaskDescription next = it.next();
            int i = 0;
            if (next.OLrzqt == null) {
                while (i < this.values) {
                    this.isConnected += next.copydefault[i];
                    i++;
                }
            } else {
                next.OLrzqt = null;
                while (i < this.values) {
                    KWHzl(next.copydefault(i));
                    KWHzl(next.KWHzl(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void gEmmrt() throws java.io.IOException {
        synchronized (this) {
            java.io.Writer writer = this.valueOf;
            if (writer != null) {
                KWHzl(writer);
            }
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.AYXKKw), C5339Nx.AEQbTJ));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(java.lang.Integer.toString(this.OLrzqt));
                bufferedWriter.write("\n");
                bufferedWriter.write(java.lang.Integer.toString(this.values));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (TaskDescription taskDescription : this.AhwBna.values()) {
                    if (taskDescription.OLrzqt != null) {
                        bufferedWriter.write("DIRTY " + taskDescription.EZpvd + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + taskDescription.EZpvd + taskDescription.copydefault() + '\n');
                    }
                }
                KWHzl(bufferedWriter);
                if (this.AEQbTJ.exists()) {
                    AEQbTJ(this.AEQbTJ, this.gEmmrt, true);
                }
                AEQbTJ(this.AYXKKw, this.AEQbTJ, false);
                this.gEmmrt.delete();
                this.valueOf = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.AEQbTJ, true), C5339Nx.AEQbTJ));
            } catch (java.lang.Throwable th) {
                KWHzl(bufferedWriter);
                throw th;
            }
        }
    }

    public static void KWHzl(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public static void AEQbTJ(java.io.File file, java.io.File file2, boolean z) throws java.io.IOException {
        if (z) {
            KWHzl(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    public Application OLrzqt(java.lang.String str) throws java.io.IOException {
        synchronized (this) {
            OLrzqt();
            TaskDescription taskDescription = this.AhwBna.get(str);
            if (taskDescription == null) {
                return null;
            }
            if (!taskDescription.djBIcL) {
                return null;
            }
            for (java.io.File file : taskDescription.KWHzl) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.DbNXlk++;
            this.valueOf.append((java.lang.CharSequence) "READ");
            this.valueOf.append(' ');
            this.valueOf.append((java.lang.CharSequence) str);
            this.valueOf.append('\n');
            if (EZpvd()) {
                this.copydefault.submit(this.EZpvd);
            }
            return new Application(str, taskDescription.valueOf, taskDescription.KWHzl, taskDescription.copydefault);
        }
    }

    public Activity KWHzl(java.lang.String str) throws java.io.IOException {
        return EZpvd(str, -1L);
    }

    public final Activity EZpvd(java.lang.String str, long j) throws java.io.IOException {
        synchronized (this) {
            OLrzqt();
            TaskDescription taskDescription = this.AhwBna.get(str);
            if (j != -1 && (taskDescription == null || taskDescription.valueOf != j)) {
                return null;
            }
            if (taskDescription == null) {
                taskDescription = new TaskDescription(str);
                this.AhwBna.put(str, taskDescription);
            } else if (taskDescription.OLrzqt != null) {
                return null;
            }
            Activity activity = new Activity(taskDescription);
            taskDescription.OLrzqt = activity;
            this.valueOf.append((java.lang.CharSequence) "DIRTY");
            this.valueOf.append(' ');
            this.valueOf.append((java.lang.CharSequence) str);
            this.valueOf.append('\n');
            AEQbTJ(this.valueOf);
            return activity;
        }
    }

    public final void OLrzqt(Activity activity, boolean z) throws java.io.IOException {
        synchronized (this) {
            TaskDescription taskDescription = activity.EZpvd;
            if (taskDescription.OLrzqt != activity) {
                throw new java.lang.IllegalStateException();
            }
            if (z && !taskDescription.djBIcL) {
                for (int i = 0; i < this.values; i++) {
                    if (!activity.KWHzl[i]) {
                        activity.copydefault();
                        throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!taskDescription.KWHzl(i).exists()) {
                        activity.copydefault();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.values; i2++) {
                java.io.File fileKWHzl = taskDescription.KWHzl(i2);
                if (z) {
                    if (fileKWHzl.exists()) {
                        java.io.File fileCopydefault = taskDescription.copydefault(i2);
                        fileKWHzl.renameTo(fileCopydefault);
                        long j = taskDescription.copydefault[i2];
                        long length = fileCopydefault.length();
                        taskDescription.copydefault[i2] = length;
                        this.isConnected = (this.isConnected - j) + length;
                    }
                } else {
                    KWHzl(fileKWHzl);
                }
            }
            this.DbNXlk++;
            taskDescription.OLrzqt = null;
            if (taskDescription.djBIcL | z) {
                taskDescription.djBIcL = true;
                this.valueOf.append((java.lang.CharSequence) "CLEAN");
                this.valueOf.append(' ');
                this.valueOf.append((java.lang.CharSequence) taskDescription.EZpvd);
                this.valueOf.append((java.lang.CharSequence) taskDescription.copydefault());
                this.valueOf.append('\n');
                if (z) {
                    long j2 = this.fetchVPNInfo;
                    this.fetchVPNInfo = 1 + j2;
                    taskDescription.valueOf = j2;
                }
            } else {
                this.AhwBna.remove(taskDescription.EZpvd);
                this.valueOf.append((java.lang.CharSequence) "REMOVE");
                this.valueOf.append(' ');
                this.valueOf.append((java.lang.CharSequence) taskDescription.EZpvd);
                this.valueOf.append('\n');
            }
            AEQbTJ(this.valueOf);
            if (this.isConnected > this.djBIcL || EZpvd()) {
                this.copydefault.submit(this.EZpvd);
            }
        }
    }

    public final boolean EZpvd() {
        int i = this.DbNXlk;
        return i >= 2000 && i >= this.AhwBna.size();
    }

    public boolean copydefault(java.lang.String str) throws java.io.IOException {
        synchronized (this) {
            OLrzqt();
            TaskDescription taskDescription = this.AhwBna.get(str);
            if (taskDescription != null && taskDescription.OLrzqt == null) {
                for (int i = 0; i < this.values; i++) {
                    java.io.File fileCopydefault = taskDescription.copydefault(i);
                    if (fileCopydefault.exists() && !fileCopydefault.delete()) {
                        throw new java.io.IOException("failed to delete " + fileCopydefault);
                    }
                    this.isConnected -= taskDescription.copydefault[i];
                    taskDescription.copydefault[i] = 0;
                }
                this.DbNXlk++;
                this.valueOf.append((java.lang.CharSequence) "REMOVE");
                this.valueOf.append(' ');
                this.valueOf.append((java.lang.CharSequence) str);
                this.valueOf.append('\n');
                this.AhwBna.remove(str);
                if (EZpvd()) {
                    this.copydefault.submit(this.EZpvd);
                }
                return true;
            }
            return false;
        }
    }

    public final void OLrzqt() {
        if (this.valueOf == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            if (this.valueOf == null) {
                return;
            }
            for (TaskDescription taskDescription : new java.util.ArrayList(this.AhwBna.values())) {
                if (taskDescription.OLrzqt != null) {
                    taskDescription.OLrzqt.copydefault();
                }
            }
            AYXKKw();
            KWHzl(this.valueOf);
            this.valueOf = null;
        }
    }

    public final void AYXKKw() throws java.io.IOException {
        while (this.isConnected > this.djBIcL) {
            copydefault(this.AhwBna.entrySet().iterator().next().getKey());
        }
    }

    public void KWHzl() throws java.io.IOException {
        close();
        C5339Nx.copydefault(this.KWHzl);
    }

    public static void KWHzl(java.io.Writer writer) throws java.io.IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void AEQbTJ(java.io.Writer writer) throws java.io.IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: o.Nu$Application */
    public final class Application {
        public final long AEQbTJ;
        public final java.io.File[] EZpvd;
        public final long[] OLrzqt;
        public final java.lang.String copydefault;

        public Application(java.lang.String str, long j, java.io.File[] fileArr, long[] jArr) {
            this.copydefault = str;
            this.AEQbTJ = j;
            this.EZpvd = fileArr;
            this.OLrzqt = jArr;
        }

        public java.io.File OLrzqt(int i) {
            return this.EZpvd[i];
        }
    }

    /* JADX INFO: renamed from: o.Nu$Activity */
    public final class Activity {
        public boolean AEQbTJ;
        public final TaskDescription EZpvd;
        public final boolean[] KWHzl;

        public Activity(TaskDescription taskDescription) {
            this.EZpvd = taskDescription;
            this.KWHzl = taskDescription.djBIcL ? null : new boolean[C5336Nu.this.values];
        }

        public java.io.File copydefault(int i) throws java.io.IOException {
            java.io.File fileKWHzl;
            synchronized (C5336Nu.this) {
                if (this.EZpvd.OLrzqt != this) {
                    throw new java.lang.IllegalStateException();
                }
                if (!this.EZpvd.djBIcL) {
                    this.KWHzl[i] = true;
                }
                fileKWHzl = this.EZpvd.KWHzl(i);
                C5336Nu.this.KWHzl.mkdirs();
            }
            return fileKWHzl;
        }

        public void AEQbTJ() throws java.io.IOException {
            C5336Nu.this.OLrzqt(this, true);
            this.AEQbTJ = true;
        }

        public void copydefault() throws java.io.IOException {
            C5336Nu.this.OLrzqt(this, false);
        }

        public void KWHzl() {
            if (this.AEQbTJ) {
                return;
            }
            try {
                copydefault();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o.Nu$TaskDescription */
    public final class TaskDescription {
        public java.io.File[] AEQbTJ;
        public final java.lang.String EZpvd;
        public java.io.File[] KWHzl;
        public Activity OLrzqt;
        public final long[] copydefault;
        public boolean djBIcL;
        public long valueOf;

        public TaskDescription(java.lang.String str) {
            this.EZpvd = str;
            this.copydefault = new long[C5336Nu.this.values];
            this.KWHzl = new java.io.File[C5336Nu.this.values];
            this.AEQbTJ = new java.io.File[C5336Nu.this.values];
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C5336Nu.this.values; i++) {
                sb.append(i);
                this.KWHzl[i] = new java.io.File(C5336Nu.this.KWHzl, sb.toString());
                sb.append(".tmp");
                this.AEQbTJ[i] = new java.io.File(C5336Nu.this.KWHzl, sb.toString());
                sb.setLength(length);
            }
        }

        public java.lang.String copydefault() throws java.io.IOException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (long j : this.copydefault) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final void EZpvd(java.lang.String[] strArr) throws java.io.IOException {
            if (strArr.length != C5336Nu.this.values) {
                throw copydefault(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.copydefault[i] = java.lang.Long.parseLong(strArr[i]);
                } catch (java.lang.NumberFormatException unused) {
                    throw copydefault(strArr);
                }
            }
        }

        public final java.io.IOException copydefault(java.lang.String[] strArr) throws java.io.IOException {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(strArr));
        }

        public java.io.File copydefault(int i) {
            return this.KWHzl[i];
        }

        public java.io.File KWHzl(int i) {
            return this.AEQbTJ[i];
        }
    }

    /* JADX INFO: renamed from: o.Nu$ActionBar */
    public static final class ActionBar implements ThreadFactory {
        private ActionBar() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread;
            synchronized (this) {
                thread = new java.lang.Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }
}
