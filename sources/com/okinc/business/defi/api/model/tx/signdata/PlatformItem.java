package com.okinc.business.defi.api.model.tx.signdata;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.just.agentweb.DefaultWebClient;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43251rlk;
import o.C56524yIo;
import o.InterfaceC9773bbs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformItem {
    public static final int $stable = 8;
    private String contract;
    private int drawableRes;
    private String logo;
    private String platform;
    private String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformItem() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDrawableRes() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContract(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contract = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableRes(int i) {
        this.drawableRes = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platform = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    public PlatformItem(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.platform = str;
        this.logo = str2;
        this.url = str3;
        this.drawableRes = i;
        this.contract = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:int:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:130) call: com.okinc.business.defi.api.model.tx.signdata.PlatformItem.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ PlatformItem(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0056 A[EXC_TOP_SPLITTER, PHI: r1 r4
  0x0056: PHI (r1v3 java.io.InputStream) = (r1v2 java.io.InputStream), (r1v5 java.io.InputStream) binds: [B:21:0x0054, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v7 java.lang.Object) binds: [B:21:0x0054, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getImage(@NotNull Context context) {
        Object objDecodeStream;
        Intrinsics.checkNotNullParameter(context, "");
        int i = this.drawableRes;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        InputStream inputStreamOpen = null;
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.logo)) {
            return null;
        }
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        InterfaceC9773bbs interfaceC9773bbs = listKWHzl != null ? (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl) : null;
        if (interfaceC9773bbs != null) {
            try {
                if (Intrinsics.EZpvd((Object) this.platform, (Object) context.getString(interfaceC9773bbs.KWHzl()))) {
                    try {
                        inputStreamOpen = context.getAssets().open(this.logo);
                        objDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    } catch (Exception unused) {
                        objDecodeStream = this.logo;
                        if (inputStreamOpen != null) {
                        }
                    }
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Exception unused2) {
                            return objDecodeStream;
                        }
                    }
                    return objDecodeStream;
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return this.logo;
    }

    public final String getUrlWithoutScheme() {
        Uri uri = Uri.parse(this.url);
        return StringsKt__StringsKt.substringAfter$default(this.url, uri.getScheme() + "://", (String) null, 2, (Object) null);
    }

    public final String getUrlOnlyHost() {
        if (this.url.length() == 0) {
            return null;
        }
        String host = Uri.parse(this.url).getHost();
        if (host != null && host.length() != 0) {
            return host;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) this.url, (CharSequence) DefaultWebClient.HTTPS_SCHEME, false, 2, (Object) null)) {
            String host2 = Uri.parse(DefaultWebClient.HTTPS_SCHEME + this.url).getHost();
            if (host2 != null && host2.length() != 0) {
                return host2;
            }
        }
        return this.url;
    }
}
