package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.log.LogLevel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.pUQ;
import o.pUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUP {
    public android.app.Application OLrzqt;
    public pUQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.app.Application copydefault() {
        return this.OLrzqt;
    }

    public pUP(@NotNull pUQ puq) {
        Intrinsics.checkNotNullParameter(puq, "");
        this.copydefault = puq;
        this.OLrzqt = puq.OLrzqt();
        EZpvd();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pUP(@NotNull TaskDescription taskDescription, @NotNull pUQ puq) {
        this(new pUQ.StateListAnimator(taskDescription.KWHzl()).EZpvd(puq.gEmmrt()).OLrzqt(puq.EZpvd()).EZpvd(taskDescription.AEQbTJ()).KWHzl());
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(puq, "");
    }

    public final void EZpvd() {
        pUZ.StateListAnimator stateListAnimator = pUZ.Companion;
        pUZ puzOLrzqt = stateListAnimator.OLrzqt();
        int level = this.copydefault.gEmmrt().getLevel();
        int model = this.copydefault.isConnected().getModel();
        java.lang.String strAEQbTJ = this.copydefault.AEQbTJ();
        java.lang.String strValueOf = this.copydefault.valueOf();
        java.lang.String strFetchVPNInfo = this.copydefault.fetchVPNInfo();
        java.lang.String strDbNXlk = this.copydefault.DbNXlk();
        if (strDbNXlk == null) {
            strDbNXlk = C38349pVm.AhwBna.AhwBna();
        }
        puzOLrzqt.AEQbTJ(level, model, strAEQbTJ, strValueOf, strFetchVPNInfo + "_" + strDbNXlk, this.copydefault.values(), this.copydefault.copydefault());
        stateListAnimator.OLrzqt().copydefault(this.copydefault.AYXKKw());
        stateListAnimator.OLrzqt().KWHzl((long) (this.copydefault.djBIcL() * RemoteMessageConst.DEFAULT_TTL));
        stateListAnimator.OLrzqt().KWHzl(this.copydefault.KWHzl());
    }

    public static final class TaskDescription {
        public boolean AEQbTJ;
        public final android.app.Application KWHzl;
        public LogLevel OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.app.Application KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            return this;
        }

        public TaskDescription(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.KWHzl = application;
            C38349pVm c38349pVm = C38349pVm.AhwBna;
            this.OLrzqt = c38349pVm.AEQbTJ();
            this.copydefault = "OK-LOG";
            this.AEQbTJ = c38349pVm.copydefault();
        }

        public final pUP AEQbTJ(@NotNull pUQ puq) {
            Intrinsics.checkNotNullParameter(puq, "");
            return new pUP(this, puq);
        }
    }

    public final void copydefault(java.lang.String str, java.lang.Object obj) {
        AEQbTJ(LogLevel.LEVEL_VERBOSE, str, obj);
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String name = ((java.io.File) t).getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            C38349pVm c38349pVm = C38349pVm.AhwBna;
            java.lang.Integer num = StringsKt__StringsKt.contains$default((java.lang.CharSequence) name, (java.lang.CharSequence) c38349pVm.AhwBna(), false, 2, (java.lang.Object) null) ? num : 1;
            java.lang.String name2 = ((java.io.File) t2).getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            return yET.KWHzl(num, StringsKt__StringsKt.contains$default((java.lang.CharSequence) name2, (java.lang.CharSequence) c38349pVm.AhwBna(), false, 2, (java.lang.Object) null) ? 0 : 1);
        }
    }

    public final void EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_VERBOSE, str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        KWHzl(LogLevel.LEVEL_VERBOSE, str, str2, th);
    }

    public final void EZpvd(java.lang.Object obj) {
        copydefault(LogLevel.LEVEL_DEBUG, obj);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(LogLevel.LEVEL_DEBUG, str);
    }

    public final void OLrzqt(java.lang.String str, java.lang.Object obj) {
        AEQbTJ(LogLevel.LEVEL_DEBUG, str, obj);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_DEBUG, str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        KWHzl(LogLevel.LEVEL_DEBUG, str, str2, th);
    }

    public final void KWHzl(java.lang.Object obj) {
        copydefault(LogLevel.LEVEL_INFO, obj);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(LogLevel.LEVEL_INFO, str);
    }

    public final void KWHzl(java.lang.String str, java.lang.Object obj) {
        AEQbTJ(LogLevel.LEVEL_INFO, str, obj);
    }

    public final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_INFO, str, str2);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        KWHzl(LogLevel.LEVEL_INFO, str, str2, th);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(LogLevel.LEVEL_WARNING, str);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.Object obj) {
        AEQbTJ(LogLevel.LEVEL_WARNING, str, obj);
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.util.Comparator comparator) {
            this.copydefault = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            return iCompare != 0 ? iCompare : yET.KWHzl(((java.io.File) t2).getName(), ((java.io.File) t).getName());
        }
    }

    public final void gEmmrt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_WARNING, str, str2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        KWHzl(LogLevel.LEVEL_WARNING, str, str2, th);
    }

    public final void OLrzqt(java.lang.Object obj) {
        copydefault(LogLevel.LEVEL_ERROR, obj);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(LogLevel.LEVEL_ERROR, str);
    }

    public final void EZpvd(java.lang.String str, java.lang.Object obj) {
        AEQbTJ(LogLevel.LEVEL_ERROR, str, obj);
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_ERROR, str, str2);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        KWHzl(LogLevel.LEVEL_ERROR, str, str2, th);
    }

    public final void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ(LogLevel.LEVEL_FATAL, str, str2);
    }

    public final void KWHzl(LogLevel logLevel, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.String str3;
        InterfaceC38344pVh interfaceC38344pVhAuCTel;
        if (str2 == null || str2.length() == 0) {
            str3 = "";
        } else {
            str3 = str2 + java.lang.System.lineSeparator();
        }
        java.lang.String strAEQbTJ = (th == null || (interfaceC38344pVhAuCTel = this.copydefault.AuCTel()) == null) ? null : interfaceC38344pVhAuCTel.AEQbTJ(th);
        OLrzqt(logLevel.getLevel(), str, str3 + strAEQbTJ);
    }

    public final <T> void copydefault(LogLevel logLevel, T t) {
        AEQbTJ(logLevel, (java.lang.String) null, t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void AEQbTJ(LogLevel logLevel, java.lang.String str, T t) {
        java.lang.String string;
        java.lang.String strAEQbTJ;
        if (t instanceof java.lang.Object[]) {
            string = yDN.ejfBZ((java.lang.Object[]) t);
        } else if (t instanceof java.lang.Throwable) {
            InterfaceC38344pVh interfaceC38344pVhAuCTel = this.copydefault.AuCTel();
            string = interfaceC38344pVhAuCTel != null ? interfaceC38344pVhAuCTel.AEQbTJ(t) : null;
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
        } else if (t != 0) {
            InterfaceC38337pVa<? super T> interfaceC38337pVaCopydefault = this.copydefault.copydefault(t);
            string = (interfaceC38337pVaCopydefault == null || (strAEQbTJ = interfaceC38337pVaCopydefault.AEQbTJ(t)) == null) ? t.toString() : strAEQbTJ;
        }
        OLrzqt(logLevel.getLevel(), str, string);
    }

    public final void OLrzqt(int i, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = this.copydefault.AkhnZx();
        }
        pUT put = new pUT(i, str, str2, "", "");
        int iAEQbTJ = put.AEQbTJ();
        java.lang.String strOLrzqt = put.OLrzqt();
        java.lang.String strKWHzl = put.KWHzl();
        if (this.copydefault.EZpvd() || i >= this.copydefault.gEmmrt().getLevel()) {
            if (iAEQbTJ == LogLevel.LEVEL_VERBOSE.getLevel()) {
                pUZ.Companion.OLrzqt().KWHzl(strOLrzqt, strKWHzl);
                return;
            }
            if (iAEQbTJ == LogLevel.LEVEL_DEBUG.getLevel()) {
                pUZ.Companion.OLrzqt().AEQbTJ(strOLrzqt, strKWHzl);
                return;
            }
            if (iAEQbTJ == LogLevel.LEVEL_INFO.getLevel()) {
                pUZ.Companion.OLrzqt().copydefault(strOLrzqt, strKWHzl);
                return;
            }
            if (iAEQbTJ == LogLevel.LEVEL_WARNING.getLevel()) {
                pUZ.Companion.OLrzqt().gEmmrt(strOLrzqt, strKWHzl);
            } else if (iAEQbTJ == LogLevel.LEVEL_ERROR.getLevel()) {
                pUZ.Companion.OLrzqt().EZpvd(strOLrzqt, strKWHzl);
            } else if (iAEQbTJ == LogLevel.LEVEL_FATAL.getLevel()) {
                pUZ.Companion.OLrzqt().OLrzqt(strOLrzqt, strKWHzl);
            }
        }
    }

    public final void AEQbTJ() {
        pUZ.Companion.OLrzqt().AEQbTJ();
    }

    public final void copydefault(boolean z) {
        pUZ.Companion.OLrzqt().OLrzqt(z);
    }

    public final java.util.List<java.io.File> OLrzqt() {
        java.lang.String strSubstring = this.copydefault.fetchVPNInfo().substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return KWHzl(strSubstring);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pUP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.io.File getTodayZipFileByLimit$default(pUP pup, java.lang.String str, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return pup.AEQbTJ(str, j, (java.util.List<java.io.File>) list);
    }

    public final java.io.File AEQbTJ(java.lang.String str, long j, java.util.List<java.io.File> list) throws java.io.IOException {
        java.lang.String str2;
        AEQbTJ();
        java.util.List<java.io.File> listOLrzqt = OLrzqt();
        if (listOLrzqt == null || listOLrzqt.isEmpty()) {
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            str2 = str + "_" + jCurrentTimeMillis + ".zip";
        } else {
            str2 = jCurrentTimeMillis + ".zip";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(listOLrzqt);
        java.io.File fileKWHzl = C38347pVk.OLrzqt.KWHzl(this.copydefault.AhwBna(), str2);
        C38354pVr.copydefault(arrayList, fileKWHzl, java.lang.Long.valueOf(j));
        Intrinsics.copydefault(fileKWHzl);
        fileKWHzl.length();
        return fileKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pUP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.io.File getZipFileByLimit$default(pUP pup, java.lang.String str, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return pup.OLrzqt(str, j, (java.util.List<java.io.File>) list);
    }

    public final java.io.File OLrzqt(java.lang.String str, long j, java.util.List<java.io.File> list) throws java.io.IOException {
        java.lang.String str2;
        AEQbTJ();
        java.util.List<java.io.File> listKWHzl = KWHzl();
        if (listKWHzl == null || listKWHzl.isEmpty()) {
            return null;
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listKWHzl, new StateListAnimator(new Activity()));
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            str2 = str + "_" + jCurrentTimeMillis + ".zip";
        } else {
            str2 = jCurrentTimeMillis + ".zip";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(listEZpvd);
        java.io.File fileKWHzl = C38347pVk.OLrzqt.KWHzl(this.copydefault.AhwBna(), str2);
        C38354pVr.copydefault(arrayList, fileKWHzl, java.lang.Long.valueOf(j));
        Intrinsics.copydefault(fileKWHzl);
        fileKWHzl.length();
        return fileKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pUP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.io.File getZipFile$default(pUP pup, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return pup.AEQbTJ(str, (java.util.List<java.io.File>) list);
    }

    public final java.io.File AEQbTJ(java.lang.String str, java.util.List<java.io.File> list) throws java.io.IOException {
        java.lang.String str2;
        AEQbTJ();
        java.util.List<java.io.File> listKWHzl = KWHzl();
        if (listKWHzl == null || listKWHzl.isEmpty()) {
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            str2 = str + "_" + jCurrentTimeMillis + ".zip";
        } else {
            str2 = jCurrentTimeMillis + ".zip";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(listKWHzl);
        java.io.File fileKWHzl = C38347pVk.OLrzqt.KWHzl(this.OLrzqt.getFilesDir().getAbsolutePath() + java.io.File.separator + "logZipDir", str2);
        C38354pVr.EZpvd(arrayList, fileKWHzl);
        return fileKWHzl;
    }

    public final java.util.List<java.io.File> KWHzl(final java.lang.String str) {
        C38347pVk c38347pVk = C38347pVk.OLrzqt;
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c38347pVk.EZpvd(this.copydefault.valueOf(), new java.io.FileFilter() { // from class: o.pUR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file) {
                return pUP.copydefault(str, file);
            }
        }), (java.lang.Iterable) c38347pVk.EZpvd(this.copydefault.AEQbTJ(), new java.io.FileFilter() { // from class: o.pUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file) {
                return pUP.OLrzqt(str, file);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean copydefault(java.lang.String str, java.io.File file) {
        java.lang.Boolean boolValueOf = null;
        if (file != null) {
            java.lang.String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (C59449zhJ.startsWith$default(name, str, false, 2, null)) {
                java.lang.String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                C38349pVm c38349pVm = C38349pVm.AhwBna;
                if (C59449zhJ.endsWith$default(name2, c38349pVm.EZpvd(), false, 2, null)) {
                    java.lang.String name3 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "");
                    boolean z = StringsKt__StringsKt.contains$default((java.lang.CharSequence) name3, (java.lang.CharSequence) c38349pVm.AhwBna(), false, 2, (java.lang.Object) null);
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OLrzqt(java.lang.String str, java.io.File file) {
        java.lang.Boolean boolValueOf = null;
        if (file != null) {
            java.lang.String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (C59449zhJ.startsWith$default(name, str, false, 2, null)) {
                java.lang.String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                C38349pVm c38349pVm = C38349pVm.AhwBna;
                if (C59449zhJ.endsWith$default(name2, c38349pVm.EZpvd(), false, 2, null)) {
                    java.lang.String name3 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "");
                    boolean z = StringsKt__StringsKt.contains$default((java.lang.CharSequence) name3, (java.lang.CharSequence) c38349pVm.AhwBna(), false, 2, (java.lang.Object) null);
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final java.util.List<java.io.File> KWHzl() {
        C38347pVk c38347pVk = C38347pVk.OLrzqt;
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) c38347pVk.EZpvd(this.copydefault.valueOf(), new Application()), (java.lang.Iterable) c38347pVk.EZpvd(this.copydefault.AEQbTJ(), new ActionBar()));
    }

    public static final class Application implements java.io.FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            java.lang.Boolean boolValueOf = null;
            if (file != null) {
                file.getName().length();
                java.lang.String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                boolValueOf = java.lang.Boolean.valueOf(C59449zhJ.endsWith$default(name, C38349pVm.AhwBna.EZpvd(), false, 2, null));
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        }
    }

    public static final class ActionBar implements java.io.FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            java.lang.Boolean boolValueOf = null;
            if (file != null) {
                file.getName().length();
                java.lang.String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                boolValueOf = java.lang.Boolean.valueOf(C59449zhJ.endsWith$default(name, C38349pVm.AhwBna.EZpvd(), false, 2, null));
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        }
    }
}
