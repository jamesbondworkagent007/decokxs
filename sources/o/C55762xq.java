package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55762xq implements InterfaceC56027xv {

    /* JADX INFO: renamed from: o.xq$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AwsSignatureType.values().length];
            try {
                iArr[AwsSignatureType.HTTP_REQUEST_VIA_HEADERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.InterfaceC56027xv
    public InterfaceC5037Ch OLrzqt(@NotNull C55338xi c55338xi, @NotNull C55444xk c55444xk, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55338xi, "");
        Intrinsics.checkNotNullParameter(c55444xk, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = TaskDescription.copydefault[c55338xi.DbNXlk().ordinal()];
        if (i == 1) {
            C58617zJ c58617zJAEQbTJ = c55444xk.OLrzqt().AEQbTJ();
            c58617zJAEQbTJ.EZpvd("Authorization", "AWS4-HMAC-SHA256 " + ("Credential=" + C55815xr.AEQbTJ(c55338xi)) + ", " + ("SignedHeaders=" + c55444xk.KWHzl()) + ", " + ("Signature=" + str));
        } else if (i == 2) {
            c55444xk.OLrzqt().djBIcL().EZpvd().AEQbTJ().OLrzqt("X-Amz-Signature", str);
        } else {
            throw new NotImplementedError("An operation is not implemented: " + ("Support for " + c55338xi.DbNXlk() + " is not yet implemented"));
        }
        return c55444xk.OLrzqt().copydefault();
    }
}
