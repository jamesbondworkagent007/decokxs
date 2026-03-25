package o;

import com.google.common.base.Ascii;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC37674oyL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37676oyN {
    public final java.util.Map<java.lang.String, C37668oyF> AYXKKw = EZpvd();
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final byte[] AEQbTJ = {37, 80, 68, 70};
    public static final byte[] valueOf = {80, 75, 3, 4};
    public static final byte[] KWHzl = {-48, -49, 17, -32, -95, -79, Ascii.SUB, -31};
    public static final java.lang.String[] OLrzqt = {"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-excel"};
    public static final java.lang.String[] EZpvd = {"application/pdf"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] AEQbTJ(boolean z) {
        return z ? OLrzqt : EZpvd;
    }

    @yCM
    public C37676oyN() {
    }

    /* JADX INFO: renamed from: o.oyN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oyN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.util.Map<java.lang.String, C37668oyF> EZpvd() {
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("application/pdf", new C37668oyF("application/pdf", 20, AEQbTJ, C56402yEa.EZpvd("pdf"), null, false, 48, null));
        byte[] bArr = KWHzl;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("application/msword", new C37668oyF("application/msword", 20, bArr, C56402yEa.EZpvd("doc"), null, false, 48, null));
        byte[] bArr2 = valueOf;
        return C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("application/vnd.openxmlformats-officedocument.wordprocessingml.document", new C37668oyF("application/vnd.openxmlformats-officedocument.wordprocessingml.document", 20, bArr2, C56402yEa.EZpvd("docx"), null, false, 48, null)), C56390yDp.OLrzqt("text/csv", new C37668oyF("text/csv", 20, null, C56402yEa.EZpvd("csv"), null, false, 48, null)), C56390yDp.OLrzqt("text/plain", new C37668oyF("text/plain", 20, null, C56402yEa.EZpvd("txt"), null, false, 48, null)), C56390yDp.OLrzqt("application/vnd.ms-excel", new C37668oyF("application/vnd.ms-excel", 20, bArr, C56402yEa.EZpvd("xls"), null, false, 48, null)), C56390yDp.OLrzqt("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", new C37668oyF("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", 20, bArr2, C56402yEa.EZpvd("xlsx"), null, false, 48, null)));
    }

    public final boolean EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return yDV.valueOf(AEQbTJ(z), str);
    }

    public final C37668oyF KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.get(str);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final byte[] KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                byte[] bArr = new byte[8];
                inputStreamOpenInputStream.read(bArr);
                yFA.copydefault(inputStreamOpenInputStream, null);
                return bArr;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final AbstractC37674oyL OLrzqt(@NotNull C37668oyF c37668oyF, long j) {
        Intrinsics.checkNotNullParameter(c37668oyF, "");
        if (j <= ((long) c37668oyF.KWHzl()) * ((long) 1048576)) {
            return AbstractC37674oyL.Fragment.OLrzqt;
        }
        return new AbstractC37674oyL.ActionBar(c37668oyF.KWHzl(), j / ((double) 1048576));
    }

    public final AbstractC37674oyL EZpvd(@NotNull C37668oyF c37668oyF, byte[] bArr) {
        Intrinsics.checkNotNullParameter(c37668oyF, "");
        byte[] bArrCopydefault = c37668oyF.copydefault();
        if (bArrCopydefault == null) {
            return AbstractC37674oyL.Fragment.OLrzqt;
        }
        if (bArr != null && bArr.length >= bArrCopydefault.length && java.util.Arrays.equals(CollectionsKt___CollectionsKt.DbNXlk(yDV.KWHzl(bArr, bArrCopydefault.length)), bArrCopydefault)) {
            return AbstractC37674oyL.Fragment.OLrzqt;
        }
        return new AbstractC37674oyL.Activity(c37668oyF.AEQbTJ());
    }

    public final AbstractC37674oyL OLrzqt(@NotNull C37668oyF c37668oyF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c37668oyF, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = StringsKt__StringsKt.AEQbTJ(str, '.', "").toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (c37668oyF.OLrzqt().contains(lowerCase)) {
            return AbstractC37674oyL.Fragment.OLrzqt;
        }
        return new AbstractC37674oyL.Application(c37668oyF.OLrzqt());
    }

    public final AbstractC37674oyL OLrzqt(@NotNull C37668oyF c37668oyF, OKConversationType oKConversationType, GroupTagType groupTagType, boolean z) {
        Intrinsics.checkNotNullParameter(c37668oyF, "");
        if (c37668oyF.gEmmrt() && !z) {
            return new AbstractC37674oyL.TaskDescription("This file type is only allowed for official accounts");
        }
        return OLrzqt(c37668oyF, oKConversationType, groupTagType);
    }

    public final AbstractC37674oyL OLrzqt(C37668oyF c37668oyF, OKConversationType oKConversationType, GroupTagType groupTagType) {
        java.util.List<GroupTagType> listEZpvd = c37668oyF.EZpvd();
        if (listEZpvd != null && oKConversationType == OKConversationType.GROUP && (groupTagType == null || !listEZpvd.contains(groupTagType))) {
            return new AbstractC37674oyL.TaskDescription("This file type is not allowed in this group");
        }
        return AbstractC37674oyL.Fragment.OLrzqt;
    }
}
