package o;

import com.okinc.network.okg.unifieddomain.DomainType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48864udi {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public InterfaceC48873udr AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final boolean OLrzqt;
    public final java.util.Map<java.lang.String, java.util.List<Application>> djBIcL;
    public final C48834udE gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.udi$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.udi$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0977ActionBar {
            public static void OLrzqt(@NotNull ActionBar actionBar, long j, long j2) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void copydefault(@NotNull ActionBar actionBar, @NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
            }
        }

        void AEQbTJ(long j, long j2);

        void EZpvd(@NotNull java.lang.String str);

        void OLrzqt(@NotNull java.lang.Throwable th);
    }

    /* JADX INFO: renamed from: o.udi$Application */
    public interface Application {

        /* JADX INFO: renamed from: o.udi$Application$ActionBar */
        public static final class ActionBar {
            public static void EZpvd(@NotNull Application application, long j, long j2) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull Application application, @NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
            }

            public static void OLrzqt(@NotNull Application application) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void OLrzqt(@NotNull Application application, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        void EZpvd();

        void EZpvd(long j, long j2);

        void EZpvd(@NotNull C48860ude c48860ude, @NotNull java.lang.String str);

        void KWHzl(@NotNull java.lang.Throwable th);

        void OLrzqt(@NotNull java.lang.String str);

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C48834udE AEQbTJ() {
        return this.gEmmrt;
    }

    public abstract boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX INFO: renamed from: o.udi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.udi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public AbstractC48864udi(@NotNull final java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = z;
        this.gEmmrt = new C48834udE("DynamicResource");
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.udj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC48864udi.AEQbTJ(str);
            }
        });
        this.AYXKKw = new C48875udt();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.udm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC48864udi.KWHzl();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.udn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC48864udi.copydefault();
            }
        });
        this.djBIcL = new LinkedHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:29) call: o.udi.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AbstractC48864udi(java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final java.io.File valueOf() {
        return (java.io.File) this.valueOf.getValue();
    }

    public static final java.io.File AEQbTJ(java.lang.String str) {
        return new java.io.File(C32979mnm.EZpvd.OLrzqt().getFilesDir(), str);
    }

    public static final ExecutorService KWHzl() {
        return Executors.newSingleThreadExecutor();
    }

    public final ExecutorService AYXKKw() {
        return (ExecutorService) this.EZpvd.getValue();
    }

    public static final ExecutorService copydefault() {
        return Executors.newSingleThreadExecutor();
    }

    public final ExecutorService djBIcL() {
        return (ExecutorService) this.AhwBna.getValue();
    }

    public static /* synthetic */ void download$default(AbstractC48864udi abstractC48864udi, C48860ude c48860ude, Application application, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC48864udi.OLrzqt(c48860ude, application, z);
    }

    public final void OLrzqt(@NotNull final C48860ude c48860ude, @NotNull final Application application, boolean z) {
        Intrinsics.checkNotNullParameter(c48860ude, "");
        Intrinsics.checkNotNullParameter(application, "");
        final java.lang.String strValueOf = c48860ude.valueOf();
        AEQbTJ().AEQbTJ(strValueOf, "submit to download pool, " + c48860ude);
        (z ? djBIcL() : AYXKKw()).execute(new java.lang.Runnable() { // from class: o.udk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC48864udi.copydefault(this.AEQbTJ, strValueOf, application, c48860ude);
            }
        });
    }

    public static final void copydefault(AbstractC48864udi abstractC48864udi, java.lang.String str, Application application, C48860ude c48860ude) {
        if (!abstractC48864udi.EZpvd(str, application)) {
            abstractC48864udi.AEQbTJ().AEQbTJ(str, "trigger download");
            abstractC48864udi.KWHzl(c48860ude, abstractC48864udi.new TaskDescription(str));
        } else {
            abstractC48864udi.AEQbTJ().copydefault(str, "download-> in progress");
        }
    }

    /* JADX INFO: renamed from: o.udi$TaskDescription */
    public static final class TaskDescription implements Application {
        public final /* synthetic */ java.lang.String OLrzqt;

        public TaskDescription(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.this.copydefault(this.OLrzqt);
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AbstractC48864udi.this.OLrzqt(this.OLrzqt, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            AbstractC48864udi.this.OLrzqt(this.OLrzqt);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (!C59449zhJ.endsWith$default(c48860ude.valueOf(), "diff", false, 2, null) || !C33129mqd.OLrzqt((java.lang.CharSequence) c48860ude.AYXKKw())) {
                AbstractC48864udi.this.copydefault(c48860ude, str);
            } else {
                AbstractC48864udi.this.OLrzqt(c48860ude, str);
            }
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            AbstractC48864udi.this.copydefault(this.OLrzqt, th);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            AbstractC48864udi.this.KWHzl(this.OLrzqt, j, j2);
        }
    }

    public static /* synthetic */ java.util.List getCallbackList$default(AbstractC48864udi abstractC48864udi, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallbackList");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractC48864udi.copydefault(str, z);
    }

    public final java.util.List<Application> copydefault(java.lang.String str, boolean z) {
        java.util.List<Application> listRemove;
        synchronized (this.djBIcL) {
            listRemove = z ? this.djBIcL.remove(str) : this.djBIcL.get(str);
            Unit unit = Unit.INSTANCE;
        }
        return listRemove;
    }

    public final void copydefault(java.lang.String str) {
        java.util.List<Application> listCopydefault = copydefault(str, false);
        if (listCopydefault != null) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).copydefault();
            }
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        java.util.List<Application> listCopydefault = copydefault(str, false);
        if (listCopydefault != null) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).OLrzqt(str2);
            }
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.util.List callbackList$default = getCallbackList$default(this, str, false, 2, null);
        if (callbackList$default != null) {
            java.util.Iterator it = callbackList$default.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).EZpvd();
            }
        }
    }

    public final void copydefault(C48860ude c48860ude, java.lang.String str) {
        java.util.List callbackList$default = getCallbackList$default(this, c48860ude.valueOf(), false, 2, null);
        if (callbackList$default != null) {
            java.util.Iterator it = callbackList$default.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).EZpvd(c48860ude, str);
            }
        }
    }

    public final void OLrzqt(C48860ude c48860ude, java.lang.String str) {
        synchronized (this.djBIcL) {
            java.util.List<Application> list = this.djBIcL.get(c48860ude.valueOf());
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((Application) it.next()).EZpvd(c48860ude, str);
                }
            }
            this.djBIcL.remove(c48860ude.valueOf());
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        java.util.List callbackList$default = getCallbackList$default(this, str, false, 2, null);
        if (callbackList$default != null) {
            java.util.Iterator it = callbackList$default.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).KWHzl(th);
            }
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<Application> listCopydefault = copydefault(str, false);
        if (listCopydefault != null) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                ((Application) it.next()).EZpvd(j, j2);
            }
        }
    }

    public final void KWHzl(C48860ude c48860ude, Application application) {
        java.lang.String strCopydefault = c48860ude.copydefault();
        java.lang.String strAEQbTJ = c48860ude.AEQbTJ();
        java.lang.String strEZpvd = c48860ude.EZpvd();
        java.lang.String strOLrzqt = c48860ude.OLrzqt();
        if (!EZpvd(strCopydefault, strEZpvd)) {
            application.EZpvd();
            return;
        }
        java.lang.String absolutePath = new java.io.File(valueOf(), strCopydefault + JwtUtilsKt.JWT_DELIMITER + strEZpvd + ".zip").getAbsolutePath();
        C48834udE c48834udEAEQbTJ = AEQbTJ();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("start downloading ");
        sb.append(strOLrzqt);
        c48834udEAEQbTJ.copydefault(strCopydefault, sb.toString());
        application.copydefault();
        new C33143mqr(C32979mnm.EZpvd.OLrzqt(), strOLrzqt, absolutePath, strAEQbTJ, DomainType.OSS, new StateListAnimator(application, this, strCopydefault, absolutePath, strAEQbTJ, c48860ude)).EZpvd();
    }

    /* JADX INFO: renamed from: o.udi$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC33145mqt {
        public final /* synthetic */ Application AEQbTJ;
        public final /* synthetic */ C48860ude EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ AbstractC48864udi gEmmrt;

        public StateListAnimator(Application application, AbstractC48864udi abstractC48864udi, java.lang.String str, java.lang.String str2, java.lang.String str3, C48860ude c48860ude) {
            this.AEQbTJ = application;
            this.gEmmrt = abstractC48864udi;
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.EZpvd = c48860ude;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            this.AEQbTJ.EZpvd(j, j2);
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            this.gEmmrt.AEQbTJ().OLrzqt(this.KWHzl, "download error, " + i + ", " + str);
            this.AEQbTJ.KWHzl(new java.lang.Exception(i + ", " + str));
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            this.gEmmrt.AEQbTJ().copydefault(this.KWHzl, "download success, result = " + str);
            this.AEQbTJ.OLrzqt(this.gEmmrt.KWHzl(new java.io.File(this.copydefault)));
            java.lang.String str2 = this.copydefault;
            Intrinsics.copydefault((java.lang.Object) str2);
            if (C48833udD.KWHzl(str2, this.OLrzqt)) {
                AbstractC48864udi abstractC48864udi = this.gEmmrt;
                java.lang.String str3 = this.copydefault;
                Intrinsics.copydefault((java.lang.Object) str3);
                abstractC48864udi.KWHzl(str3, this.EZpvd, this.AEQbTJ);
                return;
            }
            java.lang.String str4 = "MD5 check failed, MD5: " + this.OLrzqt;
            this.gEmmrt.AEQbTJ().OLrzqt(this.KWHzl, str4);
            this.AEQbTJ.KWHzl(new java.lang.Throwable(str4));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.udF.decompressFile$default(o.udF, java.lang.String, java.lang.String, o.mqt, int, java.lang.Object):boolean */
    public final void KWHzl(java.lang.String str, C48860ude c48860ude, Application application) {
        java.lang.String strCopydefault = c48860ude.copydefault();
        java.lang.String strAEQbTJ = AEQbTJ(strCopydefault, c48860ude.EZpvd());
        AEQbTJ().AEQbTJ(strCopydefault, "decompress " + str + " to " + strAEQbTJ);
        if (C48835udF.decompressFile$default(new C48835udF(this.OLrzqt), strAEQbTJ, str, null, 4, null)) {
            AEQbTJ().copydefault(strCopydefault, "decompress success");
            application.EZpvd(c48860ude, strAEQbTJ);
        } else {
            AEQbTJ().OLrzqt(strCopydefault, "decompress failed");
            application.KWHzl(new java.lang.Throwable("decompress failed"));
        }
        AEQbTJ().AEQbTJ(strCopydefault, "delete " + str);
        C6800aWH.EZpvd(str);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull Application application) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.djBIcL) {
            zContainsKey = this.djBIcL.containsKey(str);
            java.util.List<Application> list = this.djBIcL.get(str);
            if (list != null) {
                list.add(application);
            }
        }
        return zContainsKey;
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull Application application) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        synchronized (this.djBIcL) {
            zContainsKey = this.djBIcL.containsKey(str);
            java.util.Map<java.lang.String, java.util.List<Application>> map = this.djBIcL;
            java.util.List<Application> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                map.put(str, arrayList);
            }
            arrayList.add(application);
        }
        return zContainsKey;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C48833udD.copydefault(valueOf(), str, str2);
    }

    public final java.lang.String KWHzl(java.io.File file) {
        long j = 0;
        try {
            java.util.Enumeration<? extends ZipEntry> enumerationEntries = this.AYXKKw.EZpvd(file).entries();
            long size = 0;
            while (enumerationEntries.hasMoreElements()) {
                size += enumerationEntries.nextElement().getSize();
            }
            j = size;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return C33129mqd.formatS$default(pTB.OLrzqt(java.lang.Double.valueOf(j / 1024.0d)), 8, null, null, 6, null);
    }
}
