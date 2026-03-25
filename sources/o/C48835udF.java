package o;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48835udF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C48835udF() {
        this(false, 1, null);
    }

    /* JADX INFO: renamed from: o.udF$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.udF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public C48835udF(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:16) call: o.udF.<init>(boolean):void type: THIS */
    public /* synthetic */ C48835udF(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ boolean decompressFile$default(C48835udF c48835udF, java.lang.String str, java.lang.String str2, InterfaceC33145mqt interfaceC33145mqt, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC33145mqt = null;
        }
        return c48835udF.KWHzl(str, str2, interfaceC33145mqt);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:147:0x00fc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:148:0x00fc */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Type inference failed for r13v2. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r13v5. Raw type applied. Possible types: T */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017f, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (r17.AEQbTJ == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        r0 = r10.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0188, code lost:
    
        if (r0 == r12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        if (r20 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        r20.EZpvd(1001, "decompressFile:  error: expect count: [" + r0 + "], actual count: [" + r12 + "]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        if (r20 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        r20.copydefault("decompressFile: successfully.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        if (r10.element != r12) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01be, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object, java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC33145mqt interfaceC33145mqt) throws java.lang.Throwable {
        java.lang.Throwable th;
        ZipFile zipFile;
        java.io.File file;
        ZipInputStream zipInputStream;
        Ref.ObjectRef objectRef;
        Ref.IntRef intRef;
        int i;
        boolean z;
        java.lang.String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z2 = false;
        if (str.length() == 0) {
            return false;
        }
        java.lang.Throwable th2 = null;
        try {
            file = new java.io.File(str2);
        } catch (java.lang.Exception e) {
            e = e;
            zipFile = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            zipFile = null;
        }
        if (!file.exists()) {
            return false;
        }
        ZipFile zipFile2 = new ZipFile(file);
        try {
            try {
                zipInputStream = new ZipInputStream(new java.io.FileInputStream(file));
                objectRef = new Ref.ObjectRef();
                intRef = new Ref.IntRef();
                intRef.element = -1;
                i = 0;
            } catch (java.lang.Throwable th4) {
                th = th4;
                zipFile = zipFile2;
            }
            while (true) {
                ?? nextEntry = zipInputStream.getNextEntry();
                objectRef.element = nextEntry;
                if (nextEntry == 0) {
                    break;
                }
                Intrinsics.copydefault((java.lang.Object) nextEntry);
                java.lang.String name = nextEntry.getName();
                Intrinsics.copydefault((java.lang.Object) name);
                if (!StringsKt__StringsKt.contains$default(name, "__MACOSX/", z2, 2, th2)) {
                    java.lang.String str4 = java.io.File.separator;
                    java.io.File file2 = new java.io.File(str3 + str4 + name);
                    java.lang.Object obj = objectRef.element;
                    Intrinsics.copydefault(obj);
                    if (((ZipEntry) obj).isDirectory()) {
                        new java.io.File(str3 + str4 + name).mkdirs();
                    } else {
                        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                            file2.getParentFile().mkdirs();
                        }
                        byte[] bArr = new byte[1024];
                        java.io.InputStream inputStream = zipFile2.getInputStream((ZipEntry) objectRef.element);
                        if (!C59449zhJ.endsWith$default(name, "_ok_file_count.txt", z2, 2, th2)) {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                            fileOutputStream.close();
                            i++;
                            if (interfaceC33145mqt != null) {
                                interfaceC33145mqt.copydefault(i, intRef.element);
                            }
                        } else if (this.AEQbTJ) {
                            try {
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                                try {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    while (true) {
                                        java.lang.String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                    }
                                    ?? string = sb.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                    int length = string.length() - 1;
                                    ?? r15 = z2;
                                    boolean z3 = r15 == true ? 1 : 0;
                                    while (r15 <= length) {
                                        boolean z4 = Intrinsics.copydefault((int) string.charAt(!z3 ? r15 : length), 32) <= 0;
                                        if (z3) {
                                            if (!z4) {
                                                break;
                                            }
                                            length--;
                                            r15 = r15;
                                        } else if (z4) {
                                            r15++;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                    intRef.element = java.lang.Integer.parseInt(string.subSequence(r15, length + 1).toString());
                                    Unit unit = Unit.INSTANCE;
                                    yFA.copydefault(bufferedReader, th2);
                                } catch (java.lang.Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (java.lang.Throwable th6) {
                                        yFA.copydefault(bufferedReader, th5);
                                        throw th6;
                                    }
                                }
                            } catch (java.lang.Exception e2) {
                                e2.printStackTrace();
                                if (interfaceC33145mqt != null) {
                                    interfaceC33145mqt.EZpvd(1003, e2.getMessage());
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }
                        inputStream.close();
                        str3 = str;
                        th2 = null;
                        z2 = false;
                    }
                }
                str3 = str;
                if (zipFile == null) {
                    throw th;
                }
                try {
                    zipFile.close();
                    throw th;
                } catch (java.io.IOException e3) {
                    e3.printStackTrace();
                    throw th;
                }
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            zipFile = zipFile2;
            if (interfaceC33145mqt != null) {
            }
            android.util.Log.getStackTraceString(e);
            if (zipFile != null) {
            }
        }
        if (interfaceC33145mqt != null) {
            try {
                interfaceC33145mqt.EZpvd(1002, "decompressFile error: " + e.getMessage());
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        android.util.Log.getStackTraceString(e);
        if (zipFile != null) {
            return false;
        }
        try {
            zipFile.close();
            return false;
        } catch (java.io.IOException e5) {
            e5.printStackTrace();
            return false;
        }
        return z;
    }
}
