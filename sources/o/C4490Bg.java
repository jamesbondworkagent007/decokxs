package o;

import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.http.interceptors.ChecksumMismatchException;
import kotlin.jvm.internal.Intrinsics;
import o.zP;

/* JADX INFO: renamed from: o.Bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4490Bg {
    public static final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("x-amz-checksum-crc32c", "x-amz-checksum-crc32", "x-amz-checksum-sha1", "x-amz-checksum-sha256");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List<java.lang.String> copydefault() {
        return KWHzl;
    }

    public static final zP EZpvd(zP zPVar, java.lang.String str) {
        if (zPVar instanceof zP.Application) {
            InterfaceC5060De interfaceC5060DeCopydefault = ((zP.Application) zPVar).copydefault();
            Intrinsics.copydefault(interfaceC5060DeCopydefault, "");
            return C58752zO.OLrzqt(new C4356Bc(str, (CM) interfaceC5060DeCopydefault), zPVar.AEQbTJ());
        }
        if (!(zPVar instanceof zP.Activity)) {
            throw new ClientException("HttpBody type is not supported");
        }
        CS csCopydefault = ((zP.Activity) zPVar).copydefault();
        Intrinsics.copydefault(csCopydefault, "");
        return C58752zO.KWHzl(new C4463Bf(str, (CE) csCopydefault), zPVar.AEQbTJ());
    }

    public static final void copydefault(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            return;
        }
        throw new ChecksumMismatchException("Checksum mismatch. Expected " + str + " but was " + str2);
    }
}
