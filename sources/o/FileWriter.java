package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FilePermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class FileWriter {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<FileReader> EZpvd;
    public final FileInputStream OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.FileWriter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileWriter copy$default(FileWriter fileWriter, FileInputStream fileInputStream, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fileInputStream = fileWriter.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = fileWriter.EZpvd;
        }
        return fileWriter.EZpvd(fileInputStream, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileInputStream AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FileReader> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileWriter EZpvd(@NotNull FileInputStream fileInputStream, @NotNull java.util.List<FileReader> list) {
        Intrinsics.checkNotNullParameter(fileInputStream, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FileWriter(fileInputStream, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileWriter)) {
            return false;
        }
        FileWriter fileWriter = (FileWriter) obj;
        return Intrinsics.EZpvd(this.OLrzqt, fileWriter.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, fileWriter.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileChain(leaf=" + this.OLrzqt + ", roles=" + this.EZpvd + ')';
    }

    public FileWriter(@NotNull FileInputStream fileInputStream, @NotNull java.util.List<FileReader> list) {
        Intrinsics.checkNotNullParameter(fileInputStream, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = fileInputStream;
        this.EZpvd = list;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FileWriter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final FileWriter OLrzqt(@NotNull ObjectOutputStream objectOutputStream) {
            java.lang.String str;
            FileInputStream fileInputStreamAEQbTJ;
            Intrinsics.checkNotNullParameter(objectOutputStream, "");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String strOLrzqt = objectOutputStream.OLrzqt().OLrzqt();
            while (true) {
                ObjectStreamField objectStreamField = objectOutputStream.copydefault().get(strOLrzqt);
                if (objectStreamField == null) {
                    if (linkedHashSet.isEmpty()) {
                        str = "could not find source profile " + strOLrzqt;
                    } else {
                        str = "could not find source profile " + strOLrzqt + " referenced from " + ((java.lang.String) CollectionsKt___CollectionsKt.aKErDB(linkedHashSet));
                    }
                    throw new ProviderConfigurationException(str, null, 2, null);
                }
                if (!linkedHashSet.add(strOLrzqt)) {
                    throw new ProviderConfigurationException("profile formed an infinite loop: " + CollectionsKt___CollectionsKt.joinToString$default(linkedHashSet, " -> ", null, null, 0, null, null, 62, null) + " -> " + strOLrzqt, null, 2, null);
                }
                if (linkedHashSet.size() > 1 && (fileInputStreamAEQbTJ = FilenameFilter.djBIcL(objectStreamField)) != null) {
                    break;
                }
                FileReader fileReaderValueOf = FilenameFilter.valueOf(objectStreamField);
                if (fileReaderValueOf == null) {
                    fileInputStreamAEQbTJ = FilenameFilter.AEQbTJ(objectStreamField, objectOutputStream);
                    break;
                }
                arrayList.add(fileReaderValueOf);
                FilePermission filePermissionEZpvd = FilenameFilter.EZpvd(objectStreamField);
                if (filePermissionEZpvd instanceof FilePermission.Application) {
                    fileInputStreamAEQbTJ = FilenameFilter.AEQbTJ(objectStreamField, objectOutputStream);
                    break;
                }
                if (filePermissionEZpvd instanceof FilePermission.ActionBar) {
                    strOLrzqt = ((FilePermission.ActionBar) filePermissionEZpvd).OLrzqt();
                }
            }
            C56404yEc.zsXlph(arrayList);
            if (fileInputStreamAEQbTJ != null) {
                return new FileWriter(fileInputStreamAEQbTJ, arrayList);
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
    }
}
