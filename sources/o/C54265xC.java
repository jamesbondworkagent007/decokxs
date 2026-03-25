package o;

import android.support.v4.media.session.PlaybackStateCompat;
import aws.smithy.kotlin.runtime.ClientException;
import com.google.common.net.HttpHeaders;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55709xp;
import o.CO;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54265xC {
    public static final void KWHzl(@NotNull CQ cq, @NotNull InterfaceC58725zN interfaceC58725zN) {
        Intrinsics.checkNotNullParameter(cq, "");
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        for (Map.Entry entry : CollectionsKt___CollectionsKt.EZpvd(interfaceC58725zN.AEQbTJ(), new Application())) {
            CO.Application.writeUtf8$default(cq, (java.lang.String) entry.getKey(), 0, 0, 6, null);
            CO.Application.writeUtf8$default(cq, ":", 0, 0, 6, null);
            CO.Application.writeUtf8$default(cq, CollectionsKt___CollectionsKt.joinToString$default((java.lang.Iterable) entry.getValue(), ",", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedUtilKt$writeTrailers$2$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
                }
            }, 30, null), 0, 0, 6, null);
            CO.Application.writeUtf8$default(cq, "\r\n", 0, 0, 6, null);
        }
    }

    public static final void OLrzqt(@NotNull CQ cq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(cq, "");
        Intrinsics.checkNotNullParameter(str, "");
        CO.Application.writeUtf8$default(cq, "x-amz-trailer-signature:" + str + "\r\n", 0, 0, 6, null);
    }

    public static final boolean KWHzl(@NotNull zP zPVar) {
        Intrinsics.checkNotNullParameter(zPVar, "");
        if (((zPVar instanceof zP.Application) || (zPVar instanceof zP.Activity)) && zPVar.AEQbTJ() != null) {
            if (!zPVar.b_()) {
                java.lang.Long lAEQbTJ = zPVar.AEQbTJ();
                Intrinsics.copydefault(lAEQbTJ);
                if (lAEQbTJ.longValue() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean KWHzl(@NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(c55338xi, "");
        AbstractC55709xp abstractC55709xpCopydefault = c55338xi.copydefault();
        if ((abstractC55709xpCopydefault instanceof AbstractC55709xp.Activity) || (abstractC55709xpCopydefault instanceof AbstractC55709xp.TaskDescription)) {
            return true;
        }
        return abstractC55709xpCopydefault instanceof AbstractC55709xp.FragmentManager;
    }

    public static final void OLrzqt(@NotNull C5036Cg c5036Cg) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        c5036Cg.AEQbTJ().OLrzqt("Content-Encoding", "aws-chunked");
        c5036Cg.AEQbTJ().EZpvd(HttpHeaders.TRANSFER_ENCODING, "chunked");
        C58617zJ c58617zJAEQbTJ = c5036Cg.AEQbTJ();
        java.lang.Long lAEQbTJ = c5036Cg.KWHzl().AEQbTJ();
        Intrinsics.copydefault(lAEQbTJ);
        c58617zJAEQbTJ.EZpvd("X-Amz-Decoded-Content-Length", java.lang.String.valueOf(lAEQbTJ.longValue()));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zO.toSdkByteReadChannel$default(o.zP, kotlinx.coroutines.CoroutineScope, int, java.lang.Object):o.CS */
    public static final void EZpvd(@NotNull C5036Cg c5036Cg, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull C55338xi c55338xi, @NotNull byte[] bArr, @NotNull InterfaceC58536zG interfaceC58536zG) {
        zP zPVarOLrzqt;
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(interfaceC55285xh, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        zP zPVarKWHzl = c5036Cg.KWHzl();
        if (zPVarKWHzl instanceof zP.Activity) {
            CS sdkByteReadChannel$default = C58752zO.toSdkByteReadChannel$default(c5036Cg.KWHzl(), null, 1, null);
            if (sdkByteReadChannel$default == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            zPVarOLrzqt = C58752zO.KWHzl(new C55020xc(sdkByteReadChannel$default, interfaceC55285xh, c55338xi, bArr, interfaceC58536zG), -1L);
        } else if (zPVarKWHzl instanceof zP.Application) {
            zP zPVarKWHzl2 = c5036Cg.KWHzl();
            Intrinsics.copydefault(zPVarKWHzl2, "");
            zPVarOLrzqt = C58752zO.OLrzqt((InterfaceC5060De) new C55126xe(((zP.Application) zPVarKWHzl2).copydefault(), interfaceC55285xh, c55338xi, bArr, interfaceC58536zG), (java.lang.Long) (-1L));
        } else {
            throw new ClientException("HttpBody type is not supported");
        }
        c5036Cg.EZpvd(zPVarOLrzqt);
    }

    /* JADX INFO: renamed from: o.xC$Application */
    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String str = (java.lang.String) ((Map.Entry) t).getKey();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = ((java.lang.String) ((Map.Entry) t2).getKey()).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
