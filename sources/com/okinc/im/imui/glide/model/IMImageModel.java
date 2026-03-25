package com.okinc.im.imui.glide.model;

import android.net.Uri;
import com.okinc.im.imui.glide.model.IMImageModel;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.C32979mnm;
import o.C56391yDq;
import o.C56392yDr;
import o.C56444yFp;
import o.C59454zhO;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IMImageModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final InterfaceC56387yDm<File> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nPy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return IMImageModel.OLrzqt();
        }
    });
    public final Integer AEQbTJ;
    public final Uri AYXKKw;
    public final Integer AhwBna;
    public final boolean EZpvd;
    public final Uri KWHzl;
    public final Uri djBIcL;
    public final String gEmmrt;
    public final SourceStrategy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IMImageModel() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMImageModel copy$default(IMImageModel iMImageModel, String str, Uri uri, Uri uri2, Uri uri3, Integer num, Integer num2, SourceStrategy sourceStrategy, boolean z, int i, Object obj) {
        return iMImageModel.copydefault((i & 1) != 0 ? iMImageModel.gEmmrt : str, (i & 2) != 0 ? iMImageModel.djBIcL : uri, (i & 4) != 0 ? iMImageModel.KWHzl : uri2, (i & 8) != 0 ? iMImageModel.AYXKKw : uri3, (i & 16) != 0 ? iMImageModel.AhwBna : num, (i & 32) != 0 ? iMImageModel.AEQbTJ : num2, (i & 64) != 0 ? iMImageModel.valueOf : sourceStrategy, (i & 128) != 0 ? iMImageModel.EZpvd : z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SourceStrategy AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMImageModel copydefault(String str, Uri uri, Uri uri2, Uri uri3, Integer num, Integer num2, @NotNull SourceStrategy sourceStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(sourceStrategy, "");
        return new IMImageModel(str, uri, uri2, uri3, num, num2, sourceStrategy, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMImageModel)) {
            return false;
        }
        IMImageModel iMImageModel = (IMImageModel) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) iMImageModel.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, iMImageModel.djBIcL) && Intrinsics.EZpvd(this.KWHzl, iMImageModel.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, iMImageModel.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, iMImageModel.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, iMImageModel.AEQbTJ) && this.valueOf == iMImageModel.valueOf && this.EZpvd == iMImageModel.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gEmmrt;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.djBIcL;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.KWHzl;
        int iHashCode3 = uri2 == null ? 0 : uri2.hashCode();
        Uri uri3 = this.AYXKKw;
        int iHashCode4 = uri3 == null ? 0 : uri3.hashCode();
        Integer num = this.AhwBna;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMImageModel(thumbnail=" + this.gEmmrt + ", thumbUri=" + this.djBIcL + ", localUri=" + this.KWHzl + ", remoteUri=" + this.AYXKKw + ", width=" + this.AhwBna + ", height=" + this.AEQbTJ + ", sourceStrategy=" + this.valueOf + ", blurThumb=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.gEmmrt;
    }

    public IMImageModel(String str, Uri uri, Uri uri2, Uri uri3, Integer num, Integer num2, @NotNull SourceStrategy sourceStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(sourceStrategy, "");
        this.gEmmrt = str;
        this.djBIcL = uri;
        this.KWHzl = uri2;
        this.AYXKKw = uri3;
        this.AhwBna = num;
        this.AEQbTJ = num2;
        this.valueOf = sourceStrategy;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r10v0 android.net.Uri))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r11v0 android.net.Uri))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r12v0 android.net.Uri))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:com.okinc.im.imui.glide.model.IMImageModel$SourceStrategy:?: TERNARY null = ((wrap:int:0x002c: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:34) com.okinc.im.imui.glide.model.IMImageModel.SourceStrategy.Default com.okinc.im.imui.glide.model.IMImageModel$SourceStrategy) : (r15v0 com.okinc.im.imui.glide.model.IMImageModel$SourceStrategy))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, android.net.Uri, android.net.Uri, android.net.Uri, java.lang.Integer, java.lang.Integer, com.okinc.im.imui.glide.model.IMImageModel$SourceStrategy, boolean):void (m)] (LINE:27) call: com.okinc.im.imui.glide.model.IMImageModel.<init>(java.lang.String, android.net.Uri, android.net.Uri, android.net.Uri, java.lang.Integer, java.lang.Integer, com.okinc.im.imui.glide.model.IMImageModel$SourceStrategy, boolean):void type: THIS */
    public /* synthetic */ IMImageModel(String str, Uri uri, Uri uri2, Uri uri3, Integer num, Integer num2, SourceStrategy sourceStrategy, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : uri2, (i & 8) != 0 ? null : uri3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null, (i & 64) != 0 ? SourceStrategy.Default : sourceStrategy, (i & 128) != 0 ? false : z);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.glide.model.IMImageModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final File KWHzl() {
            return (File) IMImageModel.copydefault.getValue();
        }
    }

    public static final File OLrzqt() {
        File file = new File(C32979mnm.EZpvd.OLrzqt().getCacheDir(), "blur_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SourceStrategy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SourceStrategy[] $VALUES;
        public static final SourceStrategy Default = new SourceStrategy("Default", 0);
        public static final SourceStrategy SkipRemote = new SourceStrategy("SkipRemote", 1);
        public static final SourceStrategy OnlyThumbs = new SourceStrategy("OnlyThumbs", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SourceStrategy[] $values() {
            return new SourceStrategy[]{Default, SkipRemote, OnlyThumbs};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SourceStrategy> getEntries() {
            return $ENTRIES;
        }

        private SourceStrategy(String str, int i) {
        }

        static {
            SourceStrategy[] sourceStrategyArr$values = $values();
            $VALUES = sourceStrategyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sourceStrategyArr$values);
        }

        public static SourceStrategy valueOf(String str) {
            return (SourceStrategy) Enum.valueOf(SourceStrategy.class, str);
        }

        public static SourceStrategy[] values() {
            return (SourceStrategy[]) $VALUES.clone();
        }
    }

    public final Uri AYXKKw() {
        Uri uri = this.KWHzl;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = this.AYXKKw;
        if (uri2 != null) {
            return uri2;
        }
        Uri uri3 = this.djBIcL;
        if (uri3 != null) {
            return uri3;
        }
        Uri uri4 = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri4, "");
        return uri4;
    }

    public final boolean djBIcL() {
        String str;
        return (this.KWHzl == null && (this.AYXKKw == null || this.valueOf == SourceStrategy.SkipRemote) && this.djBIcL == null && ((str = this.gEmmrt) == null || StringsKt__StringsKt.fARcdN((CharSequence) str))) ? false : true;
    }

    public final String fetchVPNInfo() {
        String strHashString$default;
        Uri uri = this.KWHzl;
        if (uri != null) {
            strHashString$default = uri.toString();
        } else {
            Uri uri2 = this.AYXKKw;
            if (uri2 != null) {
                strHashString$default = uri2.toString();
            } else {
                Uri uri3 = this.djBIcL;
                if (uri3 != null) {
                    strHashString$default = uri3.toString();
                } else {
                    String str = this.gEmmrt;
                    strHashString$default = str != null ? hashString$default(this, str, null, 2, null) : null;
                }
            }
        }
        Uri uri4 = this.KWHzl;
        Uri uri5 = this.AYXKKw;
        Uri uri6 = this.djBIcL;
        boolean z = this.gEmmrt != null;
        pUU.EZpvd("IMImageModel", "localUri: " + uri4 + ", remoteUri: " + uri5 + ", thumbUri: " + uri6 + ", hasThumbnail: " + z + ", blurThumb: " + this.EZpvd);
        StringBuilder sb = new StringBuilder();
        sb.append("stableId: ");
        sb.append(strHashString$default);
        pUU.EZpvd("IMImageModel", sb.toString());
        return strHashString$default;
    }

    public static /* synthetic */ String hashString$default(IMImageModel iMImageModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "SHA-256";
        }
        return iMImageModel.KWHzl(str, str2);
    }

    public final String KWHzl(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = "";
        for (byte b : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    public final IMImageModel copydefault() {
        String str;
        String strAkhnZx;
        String str2 = this.gEmmrt;
        if (str2 == null || (strAkhnZx = C59454zhO.AkhnZx(str2, 10)) == null) {
            str = null;
        } else {
            str = strAkhnZx + "...";
        }
        return copy$default(this, str, null, null, null, null, null, null, false, 254, null);
    }

    public final String KWHzl() throws NoSuchAlgorithmException {
        String str = fetchVPNInfo() + "_blur";
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return yDV.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: o.nPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return IMImageModel.copydefault(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    public static final CharSequence copydefault(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final Uri DbNXlk() throws NoSuchAlgorithmException {
        String strKWHzl = KWHzl();
        File file = new File(Companion.KWHzl(), strKWHzl + ".jpg");
        pUU.EZpvd("IMImageModel", "getCachedBlurUri: cacheKey=" + strKWHzl + ", fileExists=" + file.exists() + ", fileSize=" + file.length());
        if (file.exists() && file.length() > 0) {
            return Uri.fromFile(file);
        }
        pUU.EZpvd("IMImageModel", "getCachedBlurUri: No cached blur found, generating synchronously");
        return AEQbTJ(file);
    }

    public final Uri AEQbTJ(File file) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((Uri) BuildersKt.runBlocking(Dispatchers.getIO(), new IMImageModel$generateBlurCacheSync$1$1(this, file, null)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("IMImageModel", "Failed to generate blur cache synchronously", thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            pUU.EZpvd("IMImageModel", "generateBlurCacheSync: Successfully generated blur cache, fileSize=" + file.length() + ", cacheUri=" + ((Uri) objM7377constructorimpl));
        }
        return (Uri) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
