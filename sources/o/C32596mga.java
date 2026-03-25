package o;

import com.okinc.network.okg.unifieddomain.DomainType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.HostMode;

/* JADX INFO: renamed from: o.mga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32596mga implements AZE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final AZC AEQbTJ;
    public final ExecutorService EZpvd;
    public C33143mqr KWHzl;
    public final AtomicBoolean copydefault;

    /* JADX INFO: renamed from: o.mga$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HostMode.values().length];
            try {
                iArr[HostMode.OSS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HostMode.CDN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public C32596mga(@NotNull AZC azc) {
        Intrinsics.checkNotNullParameter(azc, "");
        this.AEQbTJ = azc;
        this.EZpvd = Executors.newSingleThreadExecutor();
        this.copydefault = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: o.mga$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mga.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AZE
    public void KWHzl(@NotNull final InterfaceC2789AZh interfaceC2789AZh) {
        Intrinsics.checkNotNullParameter(interfaceC2789AZh, "");
        pUU.KWHzl("OKCoreLegacyDownloadTask", "Starting download: " + this.AEQbTJ.KWHzl() + " -> " + this.AEQbTJ.OLrzqt());
        HostMode hostModeCopydefault = this.AEQbTJ.copydefault();
        this.KWHzl = new C33143mqr(C32979mnm.EZpvd.OLrzqt(), this.AEQbTJ.KWHzl(), this.AEQbTJ.OLrzqt(), null, hostModeCopydefault != null ? copydefault(hostModeCopydefault) : null, new Activity(interfaceC2789AZh));
        this.EZpvd.execute(new java.lang.Runnable() { // from class: o.mgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32596mga.copydefault(this.AEQbTJ, interfaceC2789AZh);
            }
        });
    }

    /* JADX INFO: renamed from: o.mga$Activity */
    public static final class Activity implements InterfaceC33145mqt {
        public final /* synthetic */ InterfaceC2789AZh AEQbTJ;

        public Activity(InterfaceC2789AZh interfaceC2789AZh) {
            this.AEQbTJ = interfaceC2789AZh;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            if (C32596mga.this.copydefault.get()) {
                return;
            }
            try {
                this.AEQbTJ.EZpvd(C56396yDv.copydefault(j), C56396yDv.copydefault(j2));
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKCoreLegacyDownloadTask", "Error in onProgress callback: " + e.getMessage());
            }
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            pUU.copydefault("OKCoreLegacyDownloadTask", "Download error: code=" + i + ", desc=" + str);
            if (C32596mga.this.copydefault.get()) {
                return;
            }
            try {
                InterfaceC2789AZh interfaceC2789AZh = this.AEQbTJ;
                if (str == null) {
                    str = "Unknown error";
                }
                interfaceC2789AZh.copydefault(i, str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKCoreLegacyDownloadTask", "Error in onError callback: " + e.getMessage());
            }
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            pUU.KWHzl("OKCoreLegacyDownloadTask", "Download success: " + (str == null ? C32596mga.this.AEQbTJ.OLrzqt() : str));
            if (C32596mga.this.copydefault.get()) {
                return;
            }
            try {
                InterfaceC2789AZh interfaceC2789AZh = this.AEQbTJ;
                if (str == null) {
                    str = C32596mga.this.AEQbTJ.OLrzqt();
                }
                interfaceC2789AZh.EZpvd(str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKCoreLegacyDownloadTask", "Error in onSuccess callback: " + e.getMessage());
            }
        }
    }

    public static final void copydefault(C32596mga c32596mga, InterfaceC2789AZh interfaceC2789AZh) {
        try {
            C33143mqr c33143mqr = c32596mga.KWHzl;
            if (c33143mqr != null) {
                c33143mqr.EZpvd();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKCoreLegacyDownloadTask", "Download execution error: " + e.getMessage());
            if (c32596mga.copydefault.get()) {
                return;
            }
            try {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Download execution failed";
                }
                interfaceC2789AZh.copydefault(-1, message);
            } catch (java.lang.Exception e2) {
                pUU.copydefault("OKCoreLegacyDownloadTask", "Error in error callback: " + e2.getMessage());
            }
        }
    }

    @Override // o.AZE
    public void KWHzl() {
        pUU.KWHzl("OKCoreLegacyDownloadTask", "Cancelling download: " + this.AEQbTJ.OLrzqt());
        this.copydefault.set(true);
        C33143mqr c33143mqr = this.KWHzl;
        if (c33143mqr != null) {
            c33143mqr.copydefault();
        }
    }

    public final DomainType copydefault(HostMode hostMode) {
        int i = TaskDescription.OLrzqt[hostMode.ordinal()];
        if (i == 1) {
            return DomainType.OSS;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return DomainType.CDN;
    }
}
