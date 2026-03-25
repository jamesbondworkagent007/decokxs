package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PipedReader {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final PrintStream AEQbTJ;
    public final RandomAccessFile AhwBna;
    public final UTFDataFormatException KWHzl;
    public final java.lang.String OLrzqt;
    public final SequenceInputStream copydefault;
    public final Serializable djBIcL;
    public final StringBufferInputStream gEmmrt;
    public final PushbackReader valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PipedReader EZpvd(@NotNull StringBufferInputStream stringBufferInputStream, @NotNull PrintStream printStream, @NotNull RandomAccessFile randomAccessFile, @NotNull Serializable serializable, SequenceInputStream sequenceInputStream, PushbackReader pushbackReader, java.lang.String str, UTFDataFormatException uTFDataFormatException) {
        Intrinsics.checkNotNullParameter(stringBufferInputStream, "");
        Intrinsics.checkNotNullParameter(printStream, "");
        Intrinsics.checkNotNullParameter(randomAccessFile, "");
        Intrinsics.checkNotNullParameter(serializable, "");
        return new PipedReader(stringBufferInputStream, printStream, randomAccessFile, serializable, sequenceInputStream, pushbackReader, str, uTFDataFormatException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTFDataFormatException OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipedReader)) {
            return false;
        }
        PipedReader pipedReader = (PipedReader) obj;
        return Intrinsics.EZpvd(this.gEmmrt, pipedReader.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, pipedReader.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, pipedReader.AhwBna) && Intrinsics.EZpvd(this.djBIcL, pipedReader.djBIcL) && Intrinsics.EZpvd(this.copydefault, pipedReader.copydefault) && Intrinsics.EZpvd(this.valueOf, pipedReader.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pipedReader.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, pipedReader.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        SequenceInputStream sequenceInputStream = this.copydefault;
        int iHashCode5 = sequenceInputStream == null ? 0 : sequenceInputStream.hashCode();
        PushbackReader pushbackReader = this.valueOf;
        int iHashCode6 = pushbackReader == null ? 0 : pushbackReader.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        UTFDataFormatException uTFDataFormatException = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (uTFDataFormatException != null ? uTFDataFormatException.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AwsUserAgentMetadata(sdkMetadata=" + this.gEmmrt + ", apiMetadata=" + this.AEQbTJ + ", osMetadata=" + this.AhwBna + ", languageMetadata=" + this.djBIcL + ", execEnvMetadata=" + this.copydefault + ", frameworkMetadata=" + this.valueOf + ", appId=" + this.OLrzqt + ", customMetadata=" + this.KWHzl + ')';
    }

    public PipedReader(@NotNull StringBufferInputStream stringBufferInputStream, @NotNull PrintStream printStream, @NotNull RandomAccessFile randomAccessFile, @NotNull Serializable serializable, SequenceInputStream sequenceInputStream, PushbackReader pushbackReader, java.lang.String str, UTFDataFormatException uTFDataFormatException) {
        Intrinsics.checkNotNullParameter(stringBufferInputStream, "");
        Intrinsics.checkNotNullParameter(printStream, "");
        Intrinsics.checkNotNullParameter(randomAccessFile, "");
        Intrinsics.checkNotNullParameter(serializable, "");
        this.gEmmrt = stringBufferInputStream;
        this.AEQbTJ = printStream;
        this.AhwBna = randomAccessFile;
        this.djBIcL = serializable;
        this.copydefault = sequenceInputStream;
        this.valueOf = pushbackReader;
        this.OLrzqt = str;
        this.KWHzl = uTFDataFormatException;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PipedReader.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ PipedReader fromEnvironment$default(TaskDescription taskDescription, PrintStream printStream, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return taskDescription.OLrzqt(printStream, str);
        }

        public final PipedReader OLrzqt(@NotNull PrintStream printStream, java.lang.String str) {
            Intrinsics.checkNotNullParameter(printStream, "");
            return Reader.KWHzl(HL.OLrzqt.copydefault(), printStream, str);
        }
    }

    public final java.lang.String copydefault() {
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl;
        java.util.List<java.lang.Object> listCopydefault;
        java.util.List<java.lang.Object> listCopydefault2;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl2;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(this.gEmmrt);
        UTFDataFormatException uTFDataFormatException = this.KWHzl;
        if (uTFDataFormatException != null && (mapKWHzl2 = uTFDataFormatException.KWHzl()) != null) {
            if (!mapKWHzl2.containsKey("internal")) {
                mapKWHzl2 = null;
            }
            if (mapKWHzl2 != null) {
                listOLrzqt.add("md/internal");
            }
        }
        listOLrzqt.add(Reader.uaPair$default("ua", "2.0", null, 4, null));
        listOLrzqt.add(this.AEQbTJ);
        listOLrzqt.add(this.AhwBna);
        listOLrzqt.add(this.djBIcL);
        SequenceInputStream sequenceInputStream = this.copydefault;
        if (sequenceInputStream != null) {
            listOLrzqt.add(sequenceInputStream);
        }
        UTFDataFormatException uTFDataFormatException2 = this.KWHzl;
        if (uTFDataFormatException2 != null && (listCopydefault2 = uTFDataFormatException2.copydefault()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listCopydefault2) {
                if (obj instanceof UnsupportedEncodingException) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listOLrzqt.add(it.next());
            }
        }
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            listOLrzqt.add(Reader.uaPair$default("app", str, null, 4, null));
        }
        UTFDataFormatException uTFDataFormatException3 = this.KWHzl;
        if (uTFDataFormatException3 != null && (listCopydefault = uTFDataFormatException3.copydefault()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listCopydefault) {
                if (obj2 instanceof Appendable) {
                    arrayList2.add(obj2);
                }
            }
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                listOLrzqt.add(it2.next());
            }
        }
        PushbackReader pushbackReader = this.valueOf;
        if (pushbackReader != null) {
            listOLrzqt.add(pushbackReader);
        }
        UTFDataFormatException uTFDataFormatException4 = this.KWHzl;
        if (uTFDataFormatException4 != null && (mapKWHzl = uTFDataFormatException4.KWHzl()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.String> entry : mapKWHzl.entrySet()) {
                if (!Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "internal")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            listOLrzqt.add(PipedWriter.copydefault(PipedWriter.AEQbTJ(linkedHashMap)));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(C56402yEa.fARcdN(listOLrzqt), " ", null, null, 0, null, null, 62, null);
    }

    public final java.lang.String KWHzl() {
        return java.lang.String.valueOf(this.gEmmrt);
    }
}
