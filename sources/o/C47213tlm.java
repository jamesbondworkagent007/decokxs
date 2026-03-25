package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.okinc.okrisk.util.OssManagerUtil;
import com.okinc.okrisk.util.OssUploadCoordinator$uploadSamples$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47213tlm {
    public static final C47213tlm copydefault = new C47213tlm();

    private C47213tlm() {
    }

    public static /* synthetic */ void uploadSamples$default(C47213tlm c47213tlm, android.content.Context context, C47218tlr c47218tlr, OssManagerUtil.NetworkUploadPolicy networkUploadPolicy, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            networkUploadPolicy = OssManagerUtil.NetworkUploadPolicy.WIFI_ONLY;
        }
        c47213tlm.KWHzl(context, c47218tlr, networkUploadPolicy);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull C47218tlr c47218tlr, @NotNull OssManagerUtil.NetworkUploadPolicy networkUploadPolicy) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c47218tlr, "");
        Intrinsics.checkNotNullParameter(networkUploadPolicy, "");
        java.util.List<C47206tlf> listEZpvd = c47218tlr.EZpvd();
        if (listEZpvd.isEmpty()) {
            return;
        }
        C47211tlk c47211tlkCopydefault = c47218tlr.copydefault();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47211tlkCopydefault.copydefault()) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47211tlkCopydefault.EZpvd()) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47211tlkCopydefault.AYXKKw()) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47211tlkCopydefault.OLrzqt()) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47211tlkCopydefault.AEQbTJ())) {
            pUU.AEQbTJ("OssUploadCoordinator - OSS config | endpoint=" + c47211tlkCopydefault.AEQbTJ() + ", bucket=" + c47211tlkCopydefault.OLrzqt() + ", accessKeyId=" + c47211tlkCopydefault.copydefault() + ", accessKeySecret=" + c47211tlkCopydefault.EZpvd() + ", securityToken=" + c47211tlkCopydefault.AYXKKw());
            java.lang.String strOLrzqt = StringsKt__StringsKt.OLrzqt(c47211tlkCopydefault.KWHzl(), JsonPointer.SEPARATOR);
            OssManagerUtil ossManagerUtilOLrzqt = OssManagerUtil.Companion.OLrzqt(context, c47211tlkCopydefault.AEQbTJ(), c47211tlkCopydefault.OLrzqt(), c47211tlkCopydefault.copydefault(), c47211tlkCopydefault.EZpvd(), c47211tlkCopydefault.AYXKKw(), new OssManagerUtil.Activity(0, false, 0, 0L, null, 0, 0, networkUploadPolicy, 127, null));
            for (C47206tlf c47206tlf : listEZpvd) {
                java.lang.String strCopydefault = c47206tlf.copydefault();
                java.lang.String strKWHzl = c47206tlf.KWHzl();
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                    pUU.EZpvd("OssUploadCoordinator - Skipping upload entry with empty path/md5 (index=" + c47206tlf.AEQbTJ() + ")");
                } else {
                    java.io.File file = new java.io.File(strCopydefault);
                    if (file.exists()) {
                        java.lang.String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        java.lang.String strAEQbTJ = AEQbTJ(strOLrzqt, strKWHzl, name);
                        pUU.AEQbTJ("OssUploadCoordinator - Preparing OSS upload | bucket=" + c47211tlkCopydefault.OLrzqt() + " | pathPrefix=" + strOLrzqt + " | objectKey=" + strAEQbTJ + " | file=" + file.getAbsolutePath());
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        java.lang.String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OssUploadCoordinator$uploadSamples$1(ossManagerUtilOLrzqt, atomicBoolean, ossManagerUtilOLrzqt.AEQbTJ(strAEQbTJ, absolutePath, new StateListAnimator(atomicBoolean, strAEQbTJ)), strAEQbTJ, null), 3, null);
                    } else {
                        pUU.EZpvd("OssUploadCoordinator - File not found for upload: " + strCopydefault);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tlm$StateListAnimator */
    public static final class StateListAnimator implements OssManagerUtil.StateListAnimator {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ AtomicBoolean copydefault;

        public StateListAnimator(AtomicBoolean atomicBoolean, java.lang.String str) {
            this.copydefault = atomicBoolean;
            this.AEQbTJ = str;
        }

        @Override // com.okinc.okrisk.util.OssManagerUtil.StateListAnimator
        public void EZpvd(boolean z, OssManagerUtil.UploadError uploadError) {
            this.copydefault.set(true);
            if (z) {
                pUU.AEQbTJ("OssUploadCoordinator - OSS upload success | key=" + this.AEQbTJ);
                return;
            }
            pUU.AEQbTJ("OssUploadCoordinator - OSS upload failed | key=" + this.AEQbTJ + " | error=" + (uploadError != null ? uploadError.getMessage() : null));
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str4 = str + "/";
        } else {
            str4 = "";
        }
        return str4 + str2;
    }
}
