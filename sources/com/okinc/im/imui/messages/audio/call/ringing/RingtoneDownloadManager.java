package com.okinc.im.imui.messages.audio.call.ringing;

import android.net.Uri;
import androidx.core.content.FileProvider;
import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.unifieddomain.DomainType;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32979mnm;
import o.C33143mqr;
import o.C43386roM;
import o.C56391yDq;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC33145mqt;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RingtoneDownloadManager {
    public static final RingtoneDownloadManager copydefault = new RingtoneDownloadManager();
    public static final ConcurrentHashMap<RingtoneType, Boolean> OLrzqt = new ConcurrentHashMap<>();
    public static final int KWHzl = 8;

    public interface StateListAnimator {
        void AEQbTJ(int i, String str);

        void KWHzl(@NotNull File file);
    }

    private RingtoneDownloadManager() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RingtoneType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RingtoneType[] $VALUES;
        public static final RingtoneType INCOMING = new RingtoneType("INCOMING", 0, "audio/im/voip_incoming_ring.mp3", "voip_incoming_ring.mp3");
        private final String cdnPath;
        private final String fileName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RingtoneType[] $values() {
            return new RingtoneType[]{INCOMING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RingtoneType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCdnPath() {
            return this.cdnPath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFileName() {
            return this.fileName;
        }

        private RingtoneType(String str, int i, String str2, String str3) {
            this.cdnPath = str2;
            this.fileName = str3;
        }

        static {
            RingtoneType[] ringtoneTypeArr$values = $values();
            $VALUES = ringtoneTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(ringtoneTypeArr$values);
        }

        public static RingtoneType valueOf(String str) {
            return (RingtoneType) Enum.valueOf(RingtoneType.class, str);
        }

        public static RingtoneType[] values() {
            return (RingtoneType[]) $VALUES.clone();
        }
    }

    public final File AEQbTJ(@NotNull RingtoneType ringtoneType) {
        Intrinsics.checkNotNullParameter(ringtoneType, "");
        File fileEZpvd = EZpvd(ringtoneType);
        if (!fileEZpvd.exists() || fileEZpvd.length() <= 0) {
            return null;
        }
        return fileEZpvd;
    }

    public final Uri KWHzl(@NotNull RingtoneType ringtoneType) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(ringtoneType, "");
        File fileAEQbTJ = AEQbTJ(ringtoneType);
        if (fileAEQbTJ == null) {
            return null;
        }
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(FileProvider.getUriForFile(applicationOLrzqt, applicationOLrzqt.getPackageName() + ".fileprovider", fileAEQbTJ));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("RingtoneDownloadManager", "Failed to get FileProvider URI, falling back to file URI: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = Uri.fromFile(fileAEQbTJ);
        }
        return (Uri) objM7377constructorimpl;
    }

    public final boolean copydefault(@NotNull RingtoneType ringtoneType) {
        Intrinsics.checkNotNullParameter(ringtoneType, "");
        return AEQbTJ(ringtoneType) != null;
    }

    public static /* synthetic */ void downloadIfNeeded$default(RingtoneDownloadManager ringtoneDownloadManager, RingtoneType ringtoneType, StateListAnimator stateListAnimator, int i, Object obj) {
        if ((i & 2) != 0) {
            stateListAnimator = null;
        }
        ringtoneDownloadManager.KWHzl(ringtoneType, stateListAnimator);
    }

    public final void KWHzl(@NotNull RingtoneType ringtoneType, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(ringtoneType, "");
        if (copydefault(ringtoneType)) {
            pUU.EZpvd("RingtoneDownloadManager", ringtoneType.name() + " already downloaded");
            if (stateListAnimator != null) {
                stateListAnimator.KWHzl(EZpvd(ringtoneType));
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(OLrzqt.get(ringtoneType), Boolean.TRUE)) {
            pUU.EZpvd("RingtoneDownloadManager", ringtoneType.name() + " download already in progress");
            return;
        }
        EZpvd(ringtoneType, stateListAnimator);
    }

    public final void EZpvd(RingtoneType ringtoneType, StateListAnimator stateListAnimator) {
        String strEZpvd = C43386roM.EZpvd.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            pUU.copydefault("RingtoneDownloadManager", "CDN domain not available");
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(-1, "CDN domain not available");
                return;
            }
            return;
        }
        String strEZpvd2 = EZpvd(strEZpvd, ringtoneType.getCdnPath());
        File fileEZpvd = EZpvd(ringtoneType);
        OLrzqt.put(ringtoneType, Boolean.TRUE);
        pUU.EZpvd("RingtoneDownloadManager", "Starting download for " + ringtoneType.name() + ": " + strEZpvd2);
        new C33143mqr(C32979mnm.EZpvd.OLrzqt(), strEZpvd2, fileEZpvd.getAbsolutePath(), null, DomainType.CDN, new Application(ringtoneType, stateListAnimator, fileEZpvd)).EZpvd();
    }

    public static final class Application implements InterfaceC33145mqt {
        public final /* synthetic */ RingtoneType KWHzl;
        public final /* synthetic */ StateListAnimator OLrzqt;
        public final /* synthetic */ File copydefault;

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
        }

        public Application(RingtoneType ringtoneType, StateListAnimator stateListAnimator, File file) {
            this.KWHzl = ringtoneType;
            this.OLrzqt = stateListAnimator;
            this.copydefault = file;
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, String str) {
            RingtoneDownloadManager.OLrzqt.remove(this.KWHzl);
            pUU.copydefault("RingtoneDownloadManager", "Download failed for " + this.KWHzl.name() + ": " + i + ", " + str);
            StateListAnimator stateListAnimator = this.OLrzqt;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(i, str);
            }
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(String str) {
            RingtoneDownloadManager.OLrzqt.remove(this.KWHzl);
            pUU.EZpvd("RingtoneDownloadManager", "Download success for " + this.KWHzl.name());
            StateListAnimator stateListAnimator = this.OLrzqt;
            if (stateListAnimator != null) {
                stateListAnimator.KWHzl(this.copydefault);
            }
        }
    }

    public final String EZpvd(String str, String str2) {
        String str3 = str + "/cdn/mobile/resources/" + str2;
        if (C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((CharSequence) str3).toString(), "http", false, 2, null)) {
            return str3;
        }
        return DefaultWebClient.HTTPS_SCHEME + str3;
    }

    public final File EZpvd(RingtoneType ringtoneType) {
        File file = new File(C32979mnm.EZpvd.OLrzqt().getFilesDir(), "im_ringtones");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, ringtoneType.getFileName());
    }
}
