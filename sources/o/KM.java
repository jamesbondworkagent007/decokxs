package o;

import com.amplitude.common.Logger;
import com.amplitude.core.utilities.EventsFileManager$1;
import com.amplitude.core.utilities.EventsFileManager$getEventString$1;
import com.amplitude.core.utilities.EventsFileManager$handleV1Files$1;
import com.amplitude.core.utilities.EventsFileManager$rollover$1;
import com.amplitude.core.utilities.EventsFileManager$storeEvent$1;
import com.squareup.moshi.Json;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KM {
    public static final Application Companion = new Application(null);
    public static final ConcurrentHashMap<java.lang.String, Mutex> EZpvd = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<java.lang.String, Mutex> OLrzqt = new ConcurrentHashMap<>();
    public final KL AEQbTJ;
    public final MR AYXKKw;
    public final java.util.Set<java.lang.String> AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.util.Map<java.lang.String, java.io.File> KWHzl;
    public final java.io.File copydefault;
    public final Mutex djBIcL;
    public final java.lang.String gEmmrt;
    public final Mutex isConnected;
    public final Logger valueOf;

    public KM(@NotNull java.io.File file, @NotNull java.lang.String str, @NotNull MR mr, @NotNull Logger logger, @NotNull KL kl) throws java.lang.InterruptedException {
        Mutex mutexPutIfAbsent;
        Mutex mutexPutIfAbsent2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mr, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(kl, "");
        this.copydefault = file;
        this.DbNXlk = str;
        this.AYXKKw = mr;
        this.valueOf = logger;
        this.AEQbTJ = kl;
        this.gEmmrt = "amplitude.events.file.index." + str;
        this.AkhnZx = "amplitude.events.file.version." + str;
        java.util.Set<java.lang.String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "");
        this.AhwBna = setNewSetFromMap;
        this.KWHzl = new ConcurrentHashMap();
        ConcurrentHashMap<java.lang.String, Mutex> concurrentHashMap = EZpvd;
        Mutex mutexMutex$default = concurrentHashMap.get(str);
        if (mutexMutex$default == null && (mutexPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (mutexMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
            mutexMutex$default = mutexPutIfAbsent2;
        }
        this.isConnected = mutexMutex$default;
        ConcurrentHashMap<java.lang.String, Mutex> concurrentHashMap2 = OLrzqt;
        Mutex mutexMutex$default2 = concurrentHashMap2.get(str);
        if (mutexMutex$default2 == null && (mutexPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (mutexMutex$default2 = MutexKt.Mutex$default(false, 1, null)))) != null) {
            mutexMutex$default2 = mutexPutIfAbsent;
        }
        this.djBIcL = mutexMutex$default2;
        AEQbTJ();
        BuildersKt__BuildersKt.runBlocking$default(null, new EventsFileManager$1(this, null), 1, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:18:0x005b, B:37:0x011a, B:21:0x0063, B:24:0x006f, B:28:0x00a5, B:30:0x00b0, B:32:0x00bd, B:35:0x00c2, B:36:0x00f3, B:27:0x0074), top: B:43:0x005b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        EventsFileManager$storeEvent$1 eventsFileManager$storeEvent$1;
        KM km;
        java.lang.String str2;
        Mutex mutex;
        if (continuation instanceof EventsFileManager$storeEvent$1) {
            eventsFileManager$storeEvent$1 = (EventsFileManager$storeEvent$1) continuation;
            int i = eventsFileManager$storeEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$storeEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$storeEvent$1 = new EventsFileManager$storeEvent$1(this, continuation);
            }
        }
        java.lang.Object obj = eventsFileManager$storeEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventsFileManager$storeEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.isConnected;
            Intrinsics.checkNotNullExpressionValue(mutex2, "");
            eventsFileManager$storeEvent$1.L$0 = this;
            eventsFileManager$storeEvent$1.L$1 = str;
            eventsFileManager$storeEvent$1.L$2 = mutex2;
            eventsFileManager$storeEvent$1.label = 1;
            if (mutex2.lock(null, eventsFileManager$storeEvent$1) == objCopydefault) {
                return objCopydefault;
            }
            km = this;
            str2 = str;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) eventsFileManager$storeEvent$1.L$2;
            java.lang.String str3 = (java.lang.String) eventsFileManager$storeEvent$1.L$1;
            km = (KM) eventsFileManager$storeEvent$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
        }
        try {
            if (km.AEQbTJ()) {
                java.io.File fileKWHzl = km.KWHzl();
                if (!fileKWHzl.exists()) {
                    try {
                        fileKWHzl.createNewFile();
                        while (fileKWHzl.length() > 975000) {
                            km.AEQbTJ(fileKWHzl);
                            fileKWHzl = km.KWHzl();
                            if (!fileKWHzl.exists()) {
                                try {
                                    fileKWHzl.createNewFile();
                                } catch (java.io.IOException e) {
                                    km.AEQbTJ.OLrzqt("Failed to create new storage file: " + e.getMessage());
                                    km.valueOf.EZpvd("Failed to create new storage file: " + fileKWHzl.getPath());
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        byte[] bytes = (C59449zhJ.replace$default(str2, Json.UNSET_NAME, "", false, 4, (java.lang.Object) null) + (char) 0).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        km.copydefault(bytes, fileKWHzl, true);
                    } catch (java.io.IOException e2) {
                        km.AEQbTJ.OLrzqt("Failed to create new storage file: " + e2.getMessage());
                        km.valueOf.EZpvd("Failed to create new storage file: " + fileKWHzl.getPath());
                    }
                } else {
                    while (fileKWHzl.length() > 975000) {
                    }
                    byte[] bytes2 = (C59449zhJ.replace$default(str2, Json.UNSET_NAME, "", false, 4, (java.lang.Object) null) + (char) 0).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    km.copydefault(bytes2, fileKWHzl, true);
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    public final boolean copydefault() {
        return this.AYXKKw.KWHzl(this.gEmmrt, this.AYXKKw.AEQbTJ(this.gEmmrt, 0L) + 1);
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.io.File file = (java.io.File) t;
            KM km = KM.this;
            Intrinsics.checkNotNullExpressionValue(file, "");
            java.lang.String strEZpvd = km.EZpvd(file);
            java.io.File file2 = (java.io.File) t2;
            KM km2 = KM.this;
            Intrinsics.checkNotNullExpressionValue(file2, "");
            return yET.KWHzl(strEZpvd, km2.EZpvd(file2));
        }
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.io.File[] fileArrListFiles = this.copydefault.listFiles(new java.io.FilenameFilter() { // from class: o.KN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                return KM.valueOf(this.EZpvd, file, str);
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new java.io.File[0];
        }
        java.util.List listKWHzl = yDV.KWHzl(fileArrListFiles, new Activity());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.io.File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    public static final boolean valueOf(KM km, java.io.File file, java.lang.String str) {
        Intrinsics.checkNotNullParameter(km, "");
        Intrinsics.checkNotNullExpressionValue(str, "");
        return (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) km.DbNXlk, false, 2, (java.lang.Object) null) || C59449zhJ.endsWith$default(str, ".tmp", false, 2, null) || C59449zhJ.endsWith$default(str, ".properties", false, 2, null)) ? false : true;
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.remove(str);
        return new java.io.File(str).delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        EventsFileManager$rollover$1 eventsFileManager$rollover$1;
        KM km;
        Mutex mutex;
        if (continuation instanceof EventsFileManager$rollover$1) {
            eventsFileManager$rollover$1 = (EventsFileManager$rollover$1) continuation;
            int i = eventsFileManager$rollover$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$rollover$1.label = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$rollover$1 = new EventsFileManager$rollover$1(this, continuation);
            }
        }
        java.lang.Object obj = eventsFileManager$rollover$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventsFileManager$rollover$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.isConnected;
            Intrinsics.checkNotNullExpressionValue(mutex2, "");
            eventsFileManager$rollover$1.L$0 = this;
            eventsFileManager$rollover$1.L$1 = mutex2;
            eventsFileManager$rollover$1.label = 1;
            if (mutex2.lock(null, eventsFileManager$rollover$1) == objCopydefault) {
                return objCopydefault;
            }
            km = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) eventsFileManager$rollover$1.L$1;
            km = (KM) eventsFileManager$rollover$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            java.io.File fileKWHzl = km.KWHzl();
            if (fileKWHzl.exists() && fileKWHzl.length() > 0) {
                km.AEQbTJ(fileKWHzl);
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONArray, "");
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            java.lang.String name = file.getName();
            java.io.File file2 = new java.io.File(this.copydefault, name + "-1.tmp");
            java.io.File file3 = new java.io.File(this.copydefault, name + "-2.tmp");
            kotlin.Pair<java.util.List<JSONObject>, java.util.List<JSONObject>> pairCopydefault = KX.copydefault(jSONArray);
            writeEventsToSplitFile$default(this, pairCopydefault.getFirst(), file2, false, 4, null);
            writeEventsToSplitFile$default(this, pairCopydefault.getSecond(), file3, false, 4, null);
            OLrzqt(str);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        EventsFileManager$getEventString$1 eventsFileManager$getEventString$1;
        java.lang.String str2;
        Mutex mutex;
        KM km;
        java.lang.String string;
        if (continuation instanceof EventsFileManager$getEventString$1) {
            eventsFileManager$getEventString$1 = (EventsFileManager$getEventString$1) continuation;
            int i = eventsFileManager$getEventString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$getEventString$1.label = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$getEventString$1 = new EventsFileManager$getEventString$1(this, continuation);
            }
        }
        java.lang.Object obj = eventsFileManager$getEventString$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventsFileManager$getEventString$1.label;
        java.lang.String str3 = "";
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.djBIcL;
            Intrinsics.checkNotNullExpressionValue(mutex2, "");
            eventsFileManager$getEventString$1.L$0 = this;
            str2 = str;
            eventsFileManager$getEventString$1.L$1 = str2;
            eventsFileManager$getEventString$1.L$2 = mutex2;
            eventsFileManager$getEventString$1.label = 1;
            if (mutex2.lock(null, eventsFileManager$getEventString$1) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            km = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) eventsFileManager$getEventString$1.L$2;
            str2 = (java.lang.String) eventsFileManager$getEventString$1.L$1;
            km = (KM) eventsFileManager$getEventString$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            if (km.AhwBna.contains(str2)) {
                km.AhwBna.remove(str2);
            } else {
                km.AhwBna.add(str2);
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(str2)), Charsets.UTF_8);
                java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                try {
                    java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    if (C59449zhJ.endsWith$default(strAEQbTJ, Json.UNSET_NAME, false, 2, null)) {
                        JSONArray jSONArray = new JSONArray();
                        for (java.lang.String str4 : StringsKt__StringsKt.split$default((java.lang.CharSequence) strAEQbTJ, new java.lang.String[]{Json.UNSET_NAME}, false, 0, 6, (java.lang.Object) null)) {
                            if (str4.length() > 0) {
                                try {
                                    jSONArray.put(new JSONObject(str4));
                                } catch (JSONException unused) {
                                    km.AEQbTJ.AEQbTJ(str4);
                                    km.valueOf.EZpvd("Failed to parse event: " + str4);
                                }
                            }
                        }
                        string = jSONArray.length() > 0 ? jSONArray.toString() : "";
                        Intrinsics.checkNotNullExpressionValue(string, "");
                    } else {
                        string = AbstractJsonLexerKt.BEGIN_LIST + StringsKt__StringsKt.OLrzqt(StringsKt__StringsKt.gEmmrt(strAEQbTJ, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.COMMA), AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.COMMA) + AbstractJsonLexerKt.END_LIST;
                        try {
                            java.lang.String string2 = new JSONArray(string).toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "");
                            str3 = string2;
                        } catch (JSONException unused2) {
                            km.AEQbTJ.AEQbTJ(string);
                            km.valueOf.EZpvd("Failed to parse events: " + string + ", dropping file: " + str2);
                            km.OLrzqt(str2);
                            str3 = string;
                        }
                        yFA.copydefault(bufferedReader, null);
                    }
                    str3 = string;
                    yFA.copydefault(bufferedReader, null);
                } finally {
                }
            }
            return str3;
        } finally {
            mutex.unlock(null);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.remove(str);
    }

    public final void OLrzqt() {
        this.AYXKKw.OLrzqt(this.gEmmrt);
        this.AYXKKw.OLrzqt(this.AkhnZx);
    }

    public final void AEQbTJ(java.io.File file) {
        if (file == null) {
            return;
        }
        KWHzl(file);
        copydefault();
        gEmmrt();
    }

    public final void KWHzl(java.io.File file) {
        if (!file.exists() || yFL.fetchVPNInfo(file).length() == 0) {
            return;
        }
        java.lang.String strDbNXlk = yFL.DbNXlk(file);
        java.io.File file2 = new java.io.File(this.copydefault, strDbNXlk);
        if (file2.exists()) {
            this.valueOf.OLrzqt("File already exists: " + file2 + ", handle gracefully.");
            file.renameTo(new java.io.File(this.copydefault, strDbNXlk + '-' + java.lang.System.currentTimeMillis() + '-' + new java.util.Random().nextInt(1000)));
            return;
        }
        file.renameTo(new java.io.File(this.copydefault, yFL.DbNXlk(file)));
    }

    public final java.io.File KWHzl() {
        java.io.File file = this.KWHzl.get(this.DbNXlk);
        if (file == null) {
            java.io.File[] fileArrListFiles = this.copydefault.listFiles(new java.io.FilenameFilter() { // from class: o.KQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.io.FilenameFilter
                public final boolean accept(java.io.File file2, java.lang.String str) {
                    return KM.OLrzqt(this.KWHzl, file2, str);
                }
            });
            if (fileArrListFiles == null) {
                fileArrListFiles = new java.io.File[0];
            }
            file = (java.io.File) yDV.gEmmrt(fileArrListFiles, 0);
        }
        long jAEQbTJ = this.AYXKKw.AEQbTJ(this.gEmmrt, 0L);
        java.util.Map<java.lang.String, java.io.File> map = this.KWHzl;
        java.lang.String str = this.DbNXlk;
        if (file == null) {
            file = new java.io.File(this.copydefault, this.DbNXlk + '-' + jAEQbTJ + ".tmp");
        }
        map.put(str, file);
        java.io.File file2 = this.KWHzl.get(this.DbNXlk);
        Intrinsics.copydefault(file2);
        return file2;
    }

    public static final boolean OLrzqt(KM km, java.io.File file, java.lang.String str) {
        Intrinsics.checkNotNullParameter(km, "");
        Intrinsics.checkNotNullExpressionValue(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) km.DbNXlk, false, 2, (java.lang.Object) null) && C59449zhJ.endsWith$default(str, ".tmp", false, 2, null);
    }

    public final java.lang.String EZpvd(java.io.File file) {
        java.lang.String strReplace$default = C59449zhJ.replace$default(yFL.DbNXlk(file), this.DbNXlk + '-', "", false, 4, (java.lang.Object) null);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strReplace$default, '-', 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            return strReplace$default;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = strReplace$default.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(StringsKt__StringsKt.copydefault(strSubstring, 10, '0'));
        java.lang.String strSubstring2 = strReplace$default.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static /* synthetic */ void writeToFile$default(KM km, byte[] bArr, java.io.File file, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        km.copydefault(bArr, file, z);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void copydefault(byte[] bArr, java.io.File file, boolean z) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, z);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(fileOutputStream, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    yFA.copydefault(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (java.io.FileNotFoundException e) {
            this.AEQbTJ.OLrzqt("Error writing to file: " + e.getMessage());
            this.valueOf.EZpvd("File not found: " + file.getPath());
        } catch (java.io.IOException e2) {
            this.AEQbTJ.OLrzqt("Error writing to file: " + e2.getMessage());
            this.valueOf.EZpvd("Failed to write to file: " + file.getPath());
        } catch (java.lang.SecurityException e3) {
            this.AEQbTJ.OLrzqt("Error writing to file: " + e3.getMessage());
            this.valueOf.EZpvd("Security exception when saving event: " + e3.getMessage());
        } catch (java.lang.Exception e4) {
            this.AEQbTJ.OLrzqt("Error writing to file: " + e4.getMessage());
            this.valueOf.EZpvd("Failed to write to file: " + file.getPath());
        }
    }

    public static /* synthetic */ void writeEventsToSplitFile$default(KM km, java.util.List list, java.io.File file, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        km.KWHzl((java.util.List<? extends JSONObject>) list, file, z);
    }

    public final void KWHzl(java.util.List<? extends JSONObject> list, java.io.File file, boolean z) {
        try {
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, Json.UNSET_NAME, null, Json.UNSET_NAME, 0, null, new Function1<JSONObject, java.lang.CharSequence>() { // from class: com.amplitude.core.utilities.EventsFileManager$writeEventsToSplitFile$contents$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull JSONObject jSONObject) {
                    Intrinsics.checkNotNullParameter(jSONObject, "");
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return C59449zhJ.replace$default(string, Json.UNSET_NAME, "", false, 4, (Object) null);
                }
            }, 26, null);
            file.createNewFile();
            byte[] bytes = strJoinToString$default.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            copydefault(bytes, file, z);
            KWHzl(file);
        } catch (java.io.IOException e) {
            this.AEQbTJ.OLrzqt("Failed to create or write to split file: " + e.getMessage());
            this.valueOf.EZpvd("Failed to create or write to split file: " + file.getPath());
        } catch (java.lang.Exception e2) {
            this.AEQbTJ.OLrzqt("Failed to write to split file: " + e2.getMessage());
            this.valueOf.EZpvd("Failed to write to split file: " + file.getPath() + " for error: " + e2.getMessage());
        }
    }

    public final void gEmmrt() {
        this.KWHzl.remove(this.DbNXlk);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        EventsFileManager$handleV1Files$1 eventsFileManager$handleV1Files$1;
        final KM km;
        Mutex mutex;
        if (continuation instanceof EventsFileManager$handleV1Files$1) {
            eventsFileManager$handleV1Files$1 = (EventsFileManager$handleV1Files$1) continuation;
            int i = eventsFileManager$handleV1Files$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eventsFileManager$handleV1Files$1.label = i - Integer.MIN_VALUE;
            } else {
                eventsFileManager$handleV1Files$1 = new EventsFileManager$handleV1Files$1(this, continuation);
            }
        }
        java.lang.Object obj = eventsFileManager$handleV1Files$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eventsFileManager$handleV1Files$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.isConnected;
            Intrinsics.checkNotNullExpressionValue(mutex2, "");
            eventsFileManager$handleV1Files$1.L$0 = this;
            eventsFileManager$handleV1Files$1.L$1 = mutex2;
            eventsFileManager$handleV1Files$1.label = 1;
            if (mutex2.lock(null, eventsFileManager$handleV1Files$1) == objCopydefault) {
                return objCopydefault;
            }
            km = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) eventsFileManager$handleV1Files$1.L$1;
            km = (KM) eventsFileManager$handleV1Files$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            if (km.AYXKKw.AEQbTJ(km.AkhnZx, 1L) <= 1) {
                java.io.File[] fileArrListFiles = km.copydefault.listFiles(new java.io.FilenameFilter() { // from class: o.KP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.io.FilenameFilter
                    public final boolean accept(java.io.File file, java.lang.String str) {
                        return KM.AEQbTJ(this.EZpvd, file, str);
                    }
                });
                if (fileArrListFiles == null) {
                    fileArrListFiles = new java.io.File[0];
                }
                for (java.io.File file : fileArrListFiles) {
                    Intrinsics.checkNotNullExpressionValue(file, "");
                    java.lang.String text$default = yFI.readText$default(file, null, 1, null);
                    if (!C59449zhJ.endsWith$default(text$default, Json.UNSET_NAME, false, 2, null)) {
                        java.lang.String str = AbstractJsonLexerKt.BEGIN_LIST + StringsKt__StringsKt.OLrzqt(StringsKt__StringsKt.gEmmrt(text$default, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.COMMA), AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.COMMA) + AbstractJsonLexerKt.END_LIST;
                        try {
                            km.KWHzl((java.util.List<? extends JSONObject>) KX.OLrzqt(new JSONArray(str)), file, false);
                            if (Intrinsics.EZpvd((java.lang.Object) yFL.fetchVPNInfo(file), (java.lang.Object) "tmp")) {
                                km.AEQbTJ(file);
                            }
                        } catch (JSONException unused) {
                            km.valueOf.EZpvd("Failed to parse events: " + str + ", dropping file: " + file.getPath());
                            java.lang.String path = file.getPath();
                            Intrinsics.checkNotNullExpressionValue(path, "");
                            km.OLrzqt(path);
                        }
                    }
                }
                km.AYXKKw.KWHzl(km.AkhnZx, 2L);
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    public static final boolean AEQbTJ(KM km, java.io.File file, java.lang.String str) {
        Intrinsics.checkNotNullParameter(km, "");
        Intrinsics.checkNotNullExpressionValue(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) km.DbNXlk, false, 2, (java.lang.Object) null) && !C59449zhJ.endsWith$default(str, ".properties", false, 2, null);
    }

    public final boolean AEQbTJ() {
        try {
            MQ.copydefault(this.copydefault);
            return true;
        } catch (java.io.IOException e) {
            this.AEQbTJ.OLrzqt("Failed to create directory: " + e.getMessage());
            this.valueOf.EZpvd("Failed to create directory for events storage: " + this.copydefault.getPath());
            return false;
        }
    }
}
