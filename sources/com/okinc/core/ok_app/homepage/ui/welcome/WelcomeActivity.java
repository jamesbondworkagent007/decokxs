package com.okinc.core.ok_app.homepage.ui.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.os.BundleKt;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.gms.measurement.zza;
import com.google.common.collect.Iterators;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.rxutils.RxBus;
import dagger.Lazy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.AbstractActivityC33329muR;
import o.C32866mlf;
import o.C32868mlh;
import o.C32979mnm;
import o.C33160mrH;
import o.C33285mta;
import o.C33332muU;
import o.C33472mxB;
import o.C33476mxF;
import o.C34703nhO;
import o.C43251rlk;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C6777aVl;
import o.InterfaceC32628mhF;
import o.InterfaceC33171mrS;
import o.InterfaceC33254msw;
import o.InterfaceC33308mtx;
import o.InterfaceC46557tYt;
import o.InterfaceC47278tmy;
import o.mNP;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes15.dex */
public final class WelcomeActivity extends AbstractActivityC33329muR implements InterfaceC32628mhF {
    public static final TaskDescription Companion;
    public static final int OLrzqt;
    private static int ejfBZ = 1;
    private static int fARcdN = 1;
    private static int fJNWhG;
    private static int values;
    public volatile boolean AYXKKw;
    public FrameLayout AhwBna;
    public boolean AkhnZx;
    public VideoView DbNXlk;

    @yCM
    public C33285mta configManager;
    public boolean djBIcL;

    @yCM
    public Lazy<InterfaceC33308mtx> environment;

    @yCM
    public Lazy<OKComplianceRestrictionService> featureRestriction;
    public SplashScreen fetchVPNInfo;

    @yCM
    public Lazy<InterfaceC47278tmy> userManager;
    public boolean gEmmrt = true;
    public final Mutex valueOf = MutexKt.Mutex$default(false, 1, null);
    public AtomicBoolean isConnected = new AtomicBoolean(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        TaskDescription taskDescription = new TaskDescription(defaultConstructorMarker);
        int i = ejfBZ;
        int i2 = i + 31;
        fJNWhG = i2 % 128;
        int i3 = i2 % 2;
        Companion = taskDescription;
        OLrzqt = 8;
        int i4 = (-2) - ((i + 82) ^ (-1));
        fJNWhG = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object AuCTelauCTel(Object[] objArr) {
        SplashScreenViewProvider splashScreenViewProvider = (SplashScreenViewProvider) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        fARcdN = i3 % 128;
        int i4 = i3 % 2;
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 2041217982, -2041217982, new Object[]{splashScreenViewProvider}, zza.AEQbTJ());
        int i5 = values + 85;
        fARcdN = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object DbNXlk(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        VideoView videoView = (VideoView) objArr[1];
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[2];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (i2 & 41) + (i2 | 41);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr2 = {welcomeActivity, videoView, mediaPlayer};
            EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -811673568, 811673578, objArr2, zza.AEQbTJ());
            return null;
        }
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -811673568, 811673578, new Object[]{welcomeActivity, videoView, mediaPlayer}, zza.AEQbTJ());
        int i4 = 21 / 0;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object EZpvd(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~((~i5) | i4)) | (~(i5 | i3));
        int i8 = ~i4;
        int i9 = (~(i8 | i3)) | i5;
        int i10 = (~(i3 | i4)) | (~(i8 | (~i3))) | i5;
        int i11 = i4 + i5 + i + ((-737137436) * i2) + ((-1840598144) * i6);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i4) - 818937856) + (24099949 * i5) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i) + (1335885824 * i2) + ((-1946157056) * i6) + ((-1593638912) * i12);
        int i14 = (i4 * 1252406331) + 1981669868 + (i5 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i * 1252407325) + (i2 * (-1820396076)) + (i6 * 1320834432) + (i12 * (-447283200));
        switch (i13 + (i14 * i14 * 1511325696)) {
            case 1:
                return AEQbTJ(objArr);
            case 2:
                return copydefault(objArr);
            case 3:
                return EZpvd(objArr);
            case 4:
                return KWHzl(objArr);
            case 5:
                return gEmmrt(objArr);
            case 6:
                return AhwBna(objArr);
            case 7:
                return AYXKKw(objArr);
            case 8:
                return valueOf(objArr);
            case 9:
                return djBIcL(objArr);
            case 10:
                return isConnected(objArr);
            case 11:
                return DbNXlk(objArr);
            case 12:
                return values(objArr);
            case 13:
                return fetchVPNInfo(objArr);
            case 14:
                return AkhnZx(objArr);
            case 15:
                return fARcdN(objArr);
            case 16:
                return AuCTel(objArr);
            case 17:
                return fJNWhG(objArr);
            case 18:
                return ejfBZ(objArr);
            case 19:
                return fIwbmz(objArr);
            case 20:
                return uzCIH(objArr);
            case 21:
                return iwGUEr(objArr);
            case 22:
                return getNewProxyInstance(objArr);
            case 23:
                return hDKMBd(objArr);
            case 24:
                return getFieldNames(objArr);
            case 25:
                return zsXlph(objArr);
            case 26:
                return AuCTelauCTel(objArr);
            case 27:
                return AubY(objArr);
            case 28:
                return wlaJM(objArr);
            case 29:
                return zLjUOn(objArr);
            case 30:
                return sSMYrx(objArr);
            case 31:
                return AwvSrB(objArr);
            case 32:
                return zuBGHE(objArr);
            case 33:
                return AxsJAY(objArr);
            case 34:
                return gHZMYf(objArr);
            case 35:
                return QOLQEE(objArr);
            default:
                return OLrzqt(objArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object djBIcL(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = fARcdN + 31;
        values = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -464973930, 464973933, new Object[]{welcomeActivity, mediaPlayer, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, zza.AEQbTJ())).booleanValue();
        int i4 = fARcdN + 71;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object ejfBZ(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue4 = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 109;
        int i4 = i3 + ((i2 ^ 109) | i3);
        fARcdN = i4 % 128;
        Object[] objArr2 = new Object[5];
        if (i4 % 2 != 0) {
            objArr2[0] = welcomeActivity;
            objArr2[1] = Boolean.valueOf(zBooleanValue);
            objArr2[2] = Boolean.valueOf(zBooleanValue2);
            objArr2[3] = Boolean.valueOf(zBooleanValue3);
            objArr2[4] = Boolean.valueOf(zBooleanValue4);
            return (Unit) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1466560581, -1466560550, objArr2, zza.AEQbTJ());
        }
        objArr2[0] = welcomeActivity;
        objArr2[1] = Boolean.valueOf(zBooleanValue);
        objArr2[2] = Boolean.valueOf(zBooleanValue2);
        objArr2[3] = Boolean.valueOf(zBooleanValue3);
        objArr2[4] = Boolean.valueOf(zBooleanValue4);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object fARcdN(Object[] objArr) {
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = ((i2 & 73) - (~(-(-(i2 | 73))))) - 1;
        values = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1864330841, -1864330809, new Object[]{mediaPlayer, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, zza.AEQbTJ())).booleanValue();
        int i5 = fARcdN;
        int i6 = (i5 & 67) + (i5 | 67);
        values = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object getFieldNames(Object[] objArr) {
        VideoView videoView = (VideoView) objArr[0];
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 87;
        int i4 = i2 | 87;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        int i6 = i5 % 2;
        boolean zBooleanValue = ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 648157548, -648157546, new Object[]{videoView, mediaPlayer, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, zza.AEQbTJ())).booleanValue();
        int i7 = fARcdN;
        int i8 = i7 & WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i9 = i8 + ((i7 ^ WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) | i8);
        values = i9 % 128;
        if (i9 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i10 = 66 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object getNewProxyInstance(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = (i2 & (-52)) | ((~i2) & 51);
        int i4 = (i2 & 51) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        int i6 = i5 % 2;
        int iAEQbTJ = zza.AEQbTJ();
        boolean zBooleanValue = ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 1933655393, -1933655389, new Object[]{welcomeActivity}, zza.AEQbTJ())).booleanValue();
        int i7 = fARcdN;
        int i8 = i7 & 7;
        int i9 = (i7 | 7) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        values = i11 % 128;
        int i12 = i11 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object wlaJM(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[1];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (i2 & 31) + (i2 | 31);
        values = i3 % 128;
        int i4 = i3 % 2;
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -918717779, 918717809, new Object[]{welcomeActivity, mediaPlayer}, zza.AEQbTJ());
        int i5 = values;
        int i6 = (i5 ^ 105) + ((i5 & 105) << 1);
        fARcdN = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object zuBGHE(Object[] objArr) {
        ((Number) objArr[1]).intValue();
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = -(-((i2 & 33) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        values = i5 % 128;
        return Boolean.valueOf(i5 % 2 == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 115;
        int i4 = -(-(i2 | 115));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object AkhnZx(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 & 32) + (i2 | 32)) - 1;
        fARcdN = i3 % 128;
        if (i3 % 2 == 0) {
            EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1683403455, -1683403439, new Object[]{welcomeActivity, continuation}, zza.AEQbTJ());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objEZpvd = EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1683403455, -1683403439, new Object[]{welcomeActivity, continuation}, zza.AEQbTJ());
        int i4 = values + 7;
        fARcdN = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return objEZpvd;
    }

    private static /* synthetic */ Object iwGUEr(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i = 2 % 2;
        int i2 = values;
        int i3 = (i2 | 105) << 1;
        int i4 = -(i2 ^ 105);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        if (i5 % 2 != 0) {
            int iAEQbTJ = zza.AEQbTJ();
            return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 541874949, -541874922, new Object[]{welcomeActivity, function1, continuation}, zza.AEQbTJ());
        }
        int iAEQbTJ2 = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ2, 541874949, -541874922, new Object[]{welcomeActivity, function1, continuation}, zza.AEQbTJ());
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object zsXlph(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 87;
        int i4 = (i2 ^ 87) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        fARcdN = i6;
        int i7 = i5 % 2;
        Lazy<OKComplianceRestrictionService> lazy = welcomeActivity.featureRestriction;
        if (lazy == null) {
            Intrinsics.gEmmrt("");
            int i8 = fARcdN;
            int i9 = (i8 & 67) + (i8 | 67);
            values = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 77 / 0;
            }
            return null;
        }
        int i11 = i6 + 33;
        values = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 40 / 0;
        }
        int i13 = i6 & 37;
        int i14 = (i13 - (~(-(-((i6 ^ 37) | i13))))) - 1;
        values = i14 % 128;
        int i15 = i14 % 2;
        return lazy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object AEQbTJ(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 87;
        int i4 = (~i3) & (i2 | 87);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        fARcdN = i6 % 128;
        int i7 = i6 % 2;
        Lazy<InterfaceC47278tmy> lazy = welcomeActivity.userManager;
        if (lazy == null) {
            Intrinsics.gEmmrt("");
            int i8 = fARcdN + 53;
            values = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        int i10 = (((i2 | 20) << 1) - (i2 ^ 20)) - 1;
        int i11 = i10 % 128;
        fARcdN = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 16;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        values = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 15 / 0;
        }
        return lazy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object gHZMYf(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 | 53) << 1) - (i2 ^ 53);
        int i4 = i3 % 128;
        fARcdN = i4;
        int i5 = i3 % 2;
        Lazy<InterfaceC33308mtx> lazy = welcomeActivity.environment;
        if (lazy == null) {
            Intrinsics.gEmmrt("");
            int i6 = fARcdN;
            int i7 = i6 & 53;
            int i8 = i7 + ((i6 ^ 53) | i7);
            values = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i9 = (i4 & 85) + (i4 | 85);
        int i10 = i9 % 128;
        values = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 61;
        fARcdN = i12 % 128;
        if (i12 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object valueOf(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 125;
        int i4 = (((i2 | 125) & (~i3)) - (~(i3 << 1))) - 1;
        int i5 = i4 % 128;
        values = i5;
        int i6 = i4 % 2;
        C33285mta c33285mta = welcomeActivity.configManager;
        if (c33285mta == null) {
            Intrinsics.gEmmrt("");
            int i7 = fARcdN;
            int i8 = ((i7 ^ 21) | (i7 & 21)) << 1;
            int i9 = -(((~i7) & 21) | (i7 & (-22)));
            int i10 = (i8 & i9) + (i9 | i8);
            values = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = i5 ^ 19;
        int i13 = (i5 & 19) << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        fARcdN = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i5 ^ WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i17 = i5 & WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i18 = (i16 | i17) << 1;
        int i19 = -((i5 | WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) & (~i17));
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        fARcdN = i20 % 128;
        int i21 = i20 % 2;
        return c33285mta;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        int i7 = fARcdN;
        int i8 = i7 & 75;
        int i9 = (((i7 | 75) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
        values = i9 % 128;
        int i10 = i9 % 2;
        pUU.copydefault("dexguard", "WelcomeActivity attachBaseContext");
        if (i10 != 0) {
            throw null;
        }
        int i11 = values + 65;
        fARcdN = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object OLrzqt(Object[] objArr) {
        SplashScreenViewProvider splashScreenViewProvider = (SplashScreenViewProvider) objArr[0];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 17;
        int i4 = -(-((i2 ^ 17) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        values = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "");
            splashScreenViewProvider.remove();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "");
        splashScreenViewProvider.remove();
        int i6 = fARcdN;
        int i7 = (i6 & 27) + (i6 | 27);
        values = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 77 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object KWHzl(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 73;
        int i4 = (i3 - (~((i2 ^ 73) | i3))) - 1;
        fARcdN = i4 % 128;
        int i5 = i4 % 2;
        AtomicBoolean atomicBoolean = welcomeActivity.isConnected;
        if (i5 != 0) {
            return Boolean.valueOf(atomicBoolean.get());
        }
        atomicBoolean.get();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [114=4, 116=6] */
    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Configuration configuration;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = fARcdN;
        int i5 = (i4 & 93) + (i4 | 93);
        values = i5 % 128;
        int i6 = i5 % 2;
        pUU.copydefault("dexguard", "WelcomeActivity onCreate");
        try {
            try {
                SplashScreen splashScreenInstallSplashScreen = SplashScreen.Companion.installSplashScreen(this);
                splashScreenInstallSplashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: o.muX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.core.splashscreen.SplashScreen.OnExitAnimationListener
                    public final void onSplashScreenExit(SplashScreenViewProvider splashScreenViewProvider) {
                        int iAEQbTJ = com.google.android.gms.measurement.zza.AEQbTJ();
                        WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), iAEQbTJ, 58056554, -58056528, new java.lang.Object[]{splashScreenViewProvider}, com.google.android.gms.measurement.zza.AEQbTJ());
                    }
                });
                splashScreenInstallSplashScreen.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: o.muW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
                    public final boolean shouldKeepOnScreen() {
                        java.lang.Object[] objArr = {this.KWHzl};
                        return ((java.lang.Boolean) WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 288481025, -288481003, objArr, com.google.android.gms.measurement.zza.AEQbTJ())).booleanValue();
                    }
                });
                int i7 = values;
                int i8 = i7 & 31;
                int i9 = (((i7 ^ 31) | i8) << 1) - ((i7 | 31) & (~i8));
                fARcdN = i9 % 128;
                if (i9 % 2 == 0) {
                    this.fetchVPNInfo = splashScreenInstallSplashScreen;
                    super.onCreate(bundle);
                    configuration = getResources().getConfiguration();
                    int i10 = 67 / 0;
                } else {
                    this.fetchVPNInfo = splashScreenInstallSplashScreen;
                    super.onCreate(bundle);
                    configuration = getResources().getConfiguration();
                }
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                AEQbTJ(this, configuration);
                i = C33160mrH.Application.KWHzl;
                int i11 = values;
                i2 = ((i11 & 58) + (i11 | 58)) - 1;
                fARcdN = i2 % 128;
            } catch (Exception e) {
                C6777aVl.Companion.EZpvd(e);
                pUU.copydefault("WelcomeActivity", String.valueOf(e));
            }
            if (i2 % 2 == 0) {
                setContentView(i);
                EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), -836440991, 836440998, new Object[]{this}, zza.AEQbTJ());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setContentView(i);
            EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), -836440991, 836440998, new Object[]{this}, zza.AEQbTJ());
            int i12 = fARcdN;
            int i13 = i12 & 25;
            int i14 = (((i12 ^ 25) | i13) << 1) - ((i12 | 25) & (~i13));
            values = i14 % 128;
            int i15 = i14 % 2;
            int i16 = fARcdN;
            int i17 = i16 & 115;
            int i18 = ((i16 ^ 115) | i17) << 1;
            int i19 = -((i16 | 115) & (~i17));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            values = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 43 / 0;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [128=4, 133=5] */
    private static /* synthetic */ Object AYXKKw(Object[] objArr) {
        Window window;
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (((i2 | 32) << 1) - (i2 ^ 32)) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            pUU.copydefault("TAG_APP_OP", "WelcomeActivity init");
            int iKWHzl = Iterators.AnonymousClass8.KWHzl();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iKWHzl, -943944476, 943944488, new Object[]{welcomeActivity}, zza.AEQbTJ());
            int i4 = 70 / 0;
        } else {
            pUU.copydefault("TAG_APP_OP", "WelcomeActivity init");
            int iKWHzl2 = Iterators.AnonymousClass8.KWHzl();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iKWHzl2, -943944476, 943944488, new Object[]{welcomeActivity}, zza.AEQbTJ());
        }
        int i5 = fARcdN;
        int i6 = ((i5 | 122) << 1) - (i5 ^ 122);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        values = i7 % 128;
        int i8 = i7 % 2;
        welcomeActivity.gEmmrt = SPUtils.getBoolean("first_launch", true);
        int i9 = fARcdN + 64;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        values = i10 % 128;
        if (i10 % 2 != 0) {
            int iAEQbTJ = zza.AEQbTJ();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, -1781969021, 1781969034, new Object[]{welcomeActivity}, zza.AEQbTJ());
            window = welcomeActivity.getWindow();
            int i11 = 9 / 0;
        } else {
            int iAEQbTJ2 = zza.AEQbTJ();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ2, -1781969021, 1781969034, new Object[]{welcomeActivity}, zza.AEQbTJ());
            window = welcomeActivity.getWindow();
        }
        Intrinsics.checkNotNullExpressionValue(window, "");
        C33472mxB c33472mxB = new C33472mxB(welcomeActivity, window);
        int i12 = fARcdN;
        int i13 = (-2) - ((((i12 | 38) << 1) - (i12 ^ 38)) ^ (-1));
        values = i13 % 128;
        int i14 = i13 % 2;
        c33472mxB.AEQbTJ();
        c33472mxB.EZpvd(false);
        int i15 = fARcdN + 114;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        values = i16 % 128;
        if (i16 % 2 != 0) {
            pUU.copydefault("TAG_APP_OP", "WelcomeActivity init end");
            int iKWHzl3 = Iterators.AnonymousClass8.KWHzl();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iKWHzl3, -229770524, 229770529, new Object[]{welcomeActivity}, zza.AEQbTJ());
            int i17 = 84 / 0;
        } else {
            pUU.copydefault("TAG_APP_OP", "WelcomeActivity init end");
            int iKWHzl4 = Iterators.AnonymousClass8.KWHzl();
            EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iKWHzl4, -229770524, 229770529, new Object[]{welcomeActivity}, zza.AEQbTJ());
        }
        int i18 = values;
        int i19 = i18 & 37;
        int i20 = (i18 ^ 37) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        fARcdN = i21 % 128;
        Object obj = null;
        if (i21 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [144=4, 139=9, 142=6] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object values(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 ^ 61) | (i2 & 61)) << 1;
        int i4 = -(((~i2) & 61) | (i2 & (-62)));
        int i5 = (i3 & i4) + (i4 | i3);
        fARcdN = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        welcomeActivity.AhwBna = (FrameLayout) welcomeActivity.findViewById(C33160mrH.StateListAnimator.getFieldNames);
        View viewFindViewById = welcomeActivity.findViewById(C33160mrH.StateListAnimator.EZpvd);
        int i6 = fARcdN;
        int i7 = i6 & 3;
        int i8 = i6 | 3;
        int i9 = (i7 & i8) + (i8 | i7);
        values = i9 % 128;
        if (i9 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        TextView textView = (TextView) viewFindViewById;
        String strEZpvd = C32979mnm.EZpvd.EZpvd();
        StringBuilder sb = new StringBuilder();
        int i10 = fARcdN;
        int i11 = ((i10 ^ AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + ((i10 & AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) << 1)) - 1;
        values = i11 % 128;
        if (i11 % 2 != 0) {
            sb.append("WelcomeActivity set version name: ");
            throw null;
        }
        sb.append("WelcomeActivity set version name: ");
        int i12 = values;
        int i13 = ((i12 | 119) << 1) - (i12 ^ 119);
        fARcdN = i13 % 128;
        int i14 = i13 % 2;
        sb.append(strEZpvd);
        int i15 = fARcdN + 93;
        values = i15 % 128;
        if (i15 % 2 != 0) {
            pUU.copydefault("TAG_APP_OP", sb.toString());
            int i16 = 32 / 0;
            if (strEZpvd != null) {
                StringBuilder sb2 = new StringBuilder();
                int i17 = fARcdN + 93;
                values = i17 % 128;
                if (i17 % 2 != 0) {
                    sb2.append(DateFormat.ABBR_GENERIC_TZ);
                    sb2.append(strEZpvd);
                    obj.hashCode();
                    throw null;
                }
                sb2.append(DateFormat.ABBR_GENERIC_TZ);
                sb2.append(strEZpvd);
                int i18 = fARcdN + 5;
                values = i18 % 128;
                if (i18 % 2 != 0) {
                    textView.setText(sb2.toString());
                    int i19 = 60 / 0;
                } else {
                    textView.setText(sb2.toString());
                }
            }
        } else {
            pUU.copydefault("TAG_APP_OP", sb.toString());
            if (strEZpvd != null) {
            }
        }
        int i20 = values;
        int i21 = ((i20 ^ 35) | (i20 & 35)) << 1;
        int i22 = -(((~i20) & 35) | (i20 & (-36)));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        fARcdN = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [154=5, 155=6, 187=5, 156=4] */
    private static /* synthetic */ Object AxsJAY(Object[] objArr) {
        final WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        boolean z = welcomeActivity.gEmmrt;
        StringBuilder sb = new StringBuilder();
        int i2 = values;
        int i3 = (i2 | 69) << 1;
        int i4 = -(((~i2) & 69) | (i2 & (-70)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        int i6 = i5 % 2;
        sb.append("WelcomeActivity launchVideo isFirstLaunch = ");
        sb.append(z);
        int i7 = fARcdN + 33;
        values = i7 % 128;
        int i8 = i7 % 2;
        sb.append("--------->");
        String string = sb.toString();
        int i9 = values;
        int i10 = ((i9 | 29) << 1) - (i9 ^ 29);
        fARcdN = i10 % 128;
        int i11 = i10 % 2;
        pUU.EZpvd("TAG_APP_OP", string);
        Object obj = null;
        if (!welcomeActivity.gEmmrt) {
            welcomeActivity.djBIcL = true;
            int i12 = fARcdN;
            int i13 = ((i12 & 94) + (i12 | 94)) - 1;
            values = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = values + 3;
            fARcdN = i15 % 128;
            if (i15 % 2 == 0) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                obj.hashCode();
                throw null;
            }
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("LiteAnimation_Full_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (Object) null);
            Boolean bool = Boolean.FALSE;
            int i16 = fARcdN;
            int i17 = ((i16 & 120) + (i16 | 120)) - 1;
            values = i17 % 128;
            if (i17 % 2 != 0) {
                SPUtils.put("first_launch", bool);
                FrameLayout frameLayout = welcomeActivity.AhwBna;
                throw null;
            }
            SPUtils.put("first_launch", bool);
            FrameLayout frameLayout2 = welcomeActivity.AhwBna;
            if (frameLayout2 == null) {
                int i18 = fARcdN;
                int i19 = ((i18 | 40) << 1) - (i18 ^ 40);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                values = i20 % 128;
                if (i20 % 2 != 0) {
                    Intrinsics.gEmmrt("");
                    int i21 = 80 / 0;
                } else {
                    Intrinsics.gEmmrt("");
                }
                frameLayout2 = null;
            } else {
                int i22 = values + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                fARcdN = i22 % 128;
                int i23 = i22 % 2;
            }
            final VideoView videoView = (VideoView) EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), zza.AEQbTJ(), 315098597, -315098577, new Object[]{welcomeActivity, frameLayout2}, Iterators.AnonymousClass8.KWHzl());
            String strKWHzl = C34703nhO.KWHzl(welcomeActivity);
            int i24 = C33160mrH.ActionBar.AEQbTJ;
            StringBuilder sb2 = new StringBuilder();
            int i25 = fARcdN;
            int i26 = i25 & 103;
            int i27 = (i26 - (~(-(-((i25 ^ 103) | i26))))) - 1;
            values = i27 % 128;
            if (i27 % 2 != 0) {
                sb2.append("android.resource://");
                sb2.append(strKWHzl);
                obj.hashCode();
                throw null;
            }
            sb2.append("android.resource://");
            sb2.append(strKWHzl);
            sb2.append("/");
            sb2.append(i24);
            videoView.setVideoPath(sb2.toString());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.muY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    java.lang.Object[] objArr2 = {this.KWHzl, videoView, mediaPlayer};
                    WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), -1039284596, 1039284607, objArr2, com.google.android.gms.measurement.zza.AEQbTJ());
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.mvb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    java.lang.Object[] objArr2 = {this.EZpvd, mediaPlayer};
                    WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), -1518681489, 1518681517, objArr2, com.google.android.gms.measurement.zza.AEQbTJ());
                }
            });
            videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o.mva
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i28, int i29) {
                    java.lang.Object[] objArr2 = {this.OLrzqt, mediaPlayer, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29)};
                    return ((java.lang.Boolean) WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), -533456477, 533456486, objArr2, com.google.android.gms.measurement.zza.AEQbTJ())).booleanValue();
                }
            });
            videoView.start();
            int i28 = fARcdN;
            int i29 = (i28 & 65) + (i28 | 65);
            values = i29 % 128;
            int i30 = i29 % 2;
            welcomeActivity.DbNXlk = videoView;
            int i31 = (-2) - ((i28 + WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ (-1));
            values = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = fARcdN;
        int i34 = i33 & 65;
        int i35 = (i34 - (~(-(-((i33 ^ 65) | i34))))) - 1;
        values = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 71 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object isConnected(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        final VideoView videoView = (VideoView) objArr[1];
        MediaPlayer mediaPlayer = (MediaPlayer) objArr[2];
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 & 68) + (i2 | 68)) - 1;
        fARcdN = i3 % 128;
        int i4 = i3 % 2;
        welcomeActivity.isConnected.compareAndSet(true, false);
        mediaPlayer.setVideoScalingMode(1);
        mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: o.muZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i5, int i6) {
                java.lang.Object[] objArr2 = {videoView, mediaPlayer2, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6)};
                return ((java.lang.Boolean) WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 1479169974, -1479169950, objArr2, com.google.android.gms.measurement.zza.AEQbTJ())).booleanValue();
            }
        });
        int i5 = fARcdN;
        int i6 = ((i5 | 45) << 1) - (i5 ^ 45);
        values = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object copydefault(Object[] objArr) {
        VideoView videoView = (VideoView) objArr[0];
        int iIntValue = ((Number) objArr[2]).intValue();
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = values;
        int i3 = ((i2 & 37) - (~(i2 | 37))) - 1;
        int i4 = i3 % 128;
        fARcdN = i4;
        int i5 = i3 % 2;
        if (iIntValue != 3) {
            int i6 = i2 & 93;
            int i7 = (i6 - (~(-(-((i2 ^ 93) | i6))))) - 1;
            fARcdN = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i4 & 33;
        int i9 = -(-((i4 ^ 33) | i8));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        values = i10 % 128;
        int i11 = i10 % 2;
        pUU.EZpvd("TAG_APP_OP", "WelcomeActivity launchVideo start--------->");
        videoView.setBackgroundColor(0);
        int i12 = fARcdN;
        int i13 = i12 ^ 77;
        int i14 = (i12 & 77) << 1;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        values = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    private static /* synthetic */ Object sSMYrx(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = ((i2 | 79) << 1) - (i2 ^ 79);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            pUU.EZpvd("TAG_APP_OP", "WelcomeActivity launchVideo finish--------->");
            welcomeActivity.djBIcL = false;
        } else {
            pUU.EZpvd("TAG_APP_OP", "WelcomeActivity launchVideo finish--------->");
            welcomeActivity.djBIcL = true;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(welcomeActivity);
        WelcomeActivity$showOKXAnimation$2$1 welcomeActivity$showOKXAnimation$2$1 = new WelcomeActivity$showOKXAnimation$2$1(welcomeActivity, null);
        int i4 = values + 13;
        fARcdN = i4 % 128;
        int i5 = i4 % 2;
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, welcomeActivity$showOKXAnimation$2$1, 3, null);
        int i6 = values;
        int i7 = i6 & 55;
        int i8 = (i6 | 55) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        fARcdN = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 79 / 0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object EZpvd(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        ((Number) objArr[2]).intValue();
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        welcomeActivity.djBIcL = true;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(welcomeActivity);
        WelcomeActivity$showOKXAnimation$3$1 welcomeActivity$showOKXAnimation$3$1 = new WelcomeActivity$showOKXAnimation$3$1(welcomeActivity, null);
        int i2 = fARcdN;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        values = i5 % 128;
        int i6 = i5 % 2;
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, welcomeActivity$showOKXAnimation$3$1, 3, null);
        int i7 = fARcdN;
        int i8 = (i7 ^ 89) + ((i7 & 89) << 1);
        values = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [200=8, 201=7] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r2
  0x002c: PHI (r2v3 android.widget.VideoView) = (r2v2 android.widget.VideoView), (r2v28 android.widget.VideoView) binds: [B:8:0x002a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStop() {
        VideoView videoView;
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        fARcdN = i6 % 128;
        boolean zIsPlaying = false;
        if (i6 % 2 == 0) {
            super.onStop();
            videoView = this.DbNXlk;
            int i7 = 45 / 0;
            if (videoView != null) {
                int i8 = values + 1;
                fARcdN = i8 % 128;
                int i9 = i8 % 2;
                zIsPlaying = videoView.isPlaying();
                int i10 = fARcdN;
                int i11 = (i10 & 55) + (i10 | 55);
                values = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = fARcdN;
                int i14 = i13 & 55;
                int i15 = ((i13 ^ 55) | i14) << 1;
                int i16 = -((i13 | 55) & (~i14));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                values = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            super.onStop();
            videoView = this.DbNXlk;
            if (videoView != null) {
            }
        }
        StringBuilder sb = new StringBuilder();
        int i19 = fARcdN;
        int i20 = (i19 ^ 31) + ((i19 & 31) << 1);
        values = i20 % 128;
        int i21 = i20 % 2;
        sb.append("WelcomeActivity video isPlaying--->");
        sb.append(zIsPlaying);
        int i22 = values + 125;
        fARcdN = i22 % 128;
        int i23 = i22 % 2;
        sb.append(" ,onStop--->,");
        pUU.EZpvd("TAG_APP_OP", sb.toString());
        int i24 = values;
        int i25 = ((i24 ^ 49) - (~((i24 & 49) << 1))) - 1;
        fARcdN = i25 % 128;
        Object obj = null;
        if (i25 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!(!this.AkhnZx)) {
            this.djBIcL = true;
            pUU.EZpvd("TAG_APP_OP", "WelcomeActivity video stopPlayback--->");
            VideoView videoView2 = this.DbNXlk;
            int i26 = values;
            int i27 = (((i26 ^ 99) | (i26 & 99)) << 1) - (((~i26) & 99) | (i26 & (-100)));
            int i28 = i27 % 128;
            fARcdN = i28;
            int i29 = i27 % 2;
            if (videoView2 != null) {
                int i30 = i28 + 69;
                values = i30 % 128;
                if (i30 % 2 != 0) {
                    videoView2.stopPlayback();
                    throw null;
                }
                videoView2.stopPlayback();
                int i31 = values;
                int i32 = i31 & 67;
                int i33 = (i32 - (~(-(-((i31 ^ 67) | i32))))) - 1;
                fARcdN = i33 % 128;
                int i34 = i33 % 2;
            }
        }
        int i35 = values;
        int i36 = i35 ^ 79;
        int i37 = (i35 & 79) << 1;
        int i38 = (i36 & i37) + (i37 | i36);
        fARcdN = i38 % 128;
        if (i38 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [211=4, 207=6] */
    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws InterruptedException {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = fARcdN + 97;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            pUU.copydefault("dexguard", "WelcomeActivity onResume");
            super.onResume();
            int i3 = 56 / 0;
        } else {
            pUU.copydefault("dexguard", "WelcomeActivity onResume");
            super.onResume();
        }
        VideoView videoView = this.DbNXlk;
        if (videoView != null) {
            int i4 = values;
            int i5 = (i4 & (-38)) | ((~i4) & 37);
            int i6 = (i4 & 37) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            fARcdN = i7 % 128;
            int i8 = i7 % 2;
            boolValueOf = Boolean.valueOf(videoView.isPlaying());
            int i9 = fARcdN;
            int i10 = ((i9 | 85) << 1) - (i9 ^ 85);
            values = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 3;
            }
        } else {
            int i12 = values;
            int i13 = (i12 & 117) + (i12 | 117);
            fARcdN = i13 % 128;
            int i14 = i13 % 2;
            boolValueOf = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WelcomeActivity video isPlaying--->");
        int i15 = values + 1;
        fARcdN = i15 % 128;
        int i16 = i15 % 2;
        sb.append(boolValueOf);
        pUU.EZpvd("TAG_APP_OP", sb.toString());
        int i17 = fARcdN;
        int i18 = (i17 & 49) + (i17 | 49);
        values = i18 % 128;
        int i19 = i18 % 2;
        if (this.djBIcL) {
            BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
            int i20 = fARcdN;
            int i21 = i20 + 37;
            values = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 & 69;
            int i24 = i20 | 69;
            int i25 = (i23 & i24) + (i24 | i23);
            values = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = fARcdN;
        int i28 = ((i27 | 24) << 1) - (i27 ^ 24);
        int i29 = (i28 ^ (-1)) + (i28 << 1);
        values = i29 % 128;
        int i30 = i29 % 2;
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity$onResume$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeActivity.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WelcomeActivity welcomeActivity = WelcomeActivity.this;
                this.label = 1;
                int iAEQbTJ = zza.AEQbTJ();
                obj = WelcomeActivity.EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 623399356, -623399342, new Object[]{welcomeActivity, this}, zza.AEQbTJ());
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    private static /* synthetic */ Object gEmmrt(Object[] objArr) {
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = ((i2 & (-118)) | ((~i2) & 117)) + ((i2 & 117) << 1);
        values = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0 ? SPUtils.getBoolean("init_reward_grey", true) : SPUtils.getBoolean("init_reward_grey", false)) {
            int i4 = fARcdN;
            int i5 = (i4 & (-20)) | ((~i4) & 19);
            int i6 = -(-((i4 & 19) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            values = i7 % 128;
            if (i7 % 2 != 0) {
                SPUtils.put("init_reward_grey", Boolean.FALSE);
                throw null;
            }
            SPUtils.put("init_reward_grey", Boolean.FALSE);
        }
        int i8 = fARcdN + 91;
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object fetchVPNInfo(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 ^ 47;
        int i4 = -(-((i2 & 47) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            if (!mNP.AEQbTJ.copydefault()) {
                int i6 = fARcdN + 21;
                values = i6 % 128;
                int i7 = i6 % 2;
                int iAEQbTJ = zza.AEQbTJ();
                InterfaceC33308mtx interfaceC33308mtx = (InterfaceC33308mtx) ((Lazy) EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, 214386808, -214386774, new Object[]{welcomeActivity}, Iterators.AnonymousClass8.KWHzl())).get();
                int i8 = values;
                int i9 = i8 & 37;
                int i10 = -(-((i8 ^ 37) | i9));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                fARcdN = i11 % 128;
                int i12 = i11 % 2;
                if (interfaceC33308mtx.AEQbTJ()) {
                    int i13 = values;
                    int i14 = (i13 & (-4)) | ((~i13) & 3);
                    int i15 = (i13 & 3) << 1;
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    fARcdN = i16 % 128;
                    int i17 = i16 % 2;
                    int iAEQbTJ2 = zza.AEQbTJ();
                    ((InterfaceC33308mtx) ((Lazy) EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ2, 214386808, -214386774, new Object[]{welcomeActivity}, Iterators.AnonymousClass8.KWHzl())).get()).copydefault(welcomeActivity, 1);
                    int i18 = values;
                    int i19 = ((i18 ^ 33) | (i18 & 33)) << 1;
                    int i20 = -(((~i18) & 33) | (i18 & (-34)));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    fARcdN = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    int iAEQbTJ3 = zza.AEQbTJ();
                    EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ3, 827833512, -827833489, new Object[]{welcomeActivity}, Iterators.AnonymousClass8.KWHzl());
                    int i23 = values + 53;
                    fARcdN = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            int i25 = fARcdN;
            int i26 = ((i25 ^ 53) | (i25 & 53)) << 1;
            int i27 = -(((~i25) & 53) | (i25 & (-54)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            values = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 32 / 0;
            }
            return null;
        }
        mNP.AEQbTJ.copydefault();
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object hDKMBd(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = (-2) - (((i2 ^ 20) + ((i2 & 20) << 1)) ^ (-1));
        values = i3 % 128;
        int i4 = i3 % 2;
        welcomeActivity.AkhnZx = true;
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iAEQbTJ, 2030980333, -2030980300, new Object[]{welcomeActivity}, zza.AEQbTJ());
        int iAEQbTJ2 = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iAEQbTJ2, -881684134, 881684169, new Object[]{welcomeActivity}, Iterators.AnonymousClass8.KWHzl());
        int i5 = values;
        int i6 = i5 ^ 71;
        int i7 = -(-((i5 & 71) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        fARcdN = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 98 / 0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AuCTel(Object[] objArr) throws Throwable {
        WelcomeActivity$jumpToMain$1 welcomeActivity$jumpToMain$1;
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 105;
        int i4 = (~i3) & (i2 | 105);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        values = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            boolean z = continuation instanceof WelcomeActivity$jumpToMain$1;
            obj.hashCode();
            throw null;
        }
        if (continuation instanceof WelcomeActivity$jumpToMain$1) {
            int i7 = i2 & 9;
            int i8 = -(-((i2 ^ 9) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            values = i9 % 128;
            int i10 = i9 % 2;
            welcomeActivity$jumpToMain$1 = (WelcomeActivity$jumpToMain$1) continuation;
            int i11 = welcomeActivity$jumpToMain$1.label;
            int i12 = values;
            int i13 = (i12 ^ 91) + ((i12 & 91) << 1);
            fARcdN = i13 % 128;
            int i14 = i13 % 2;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                int i15 = ((i12 & (-100)) | ((~i12) & 99)) + ((i12 & 99) << 1);
                fARcdN = i15 % 128;
                if (i15 % 2 == 0) {
                    welcomeActivity$jumpToMain$1.label = i11 >>> Integer.MIN_VALUE;
                } else {
                    int i16 = i11 - Integer.MAX_VALUE;
                    welcomeActivity$jumpToMain$1.label = (i16 ^ (-1)) + (i16 << 1);
                }
                int i17 = fARcdN + 89;
                values = i17 % 128;
                int i18 = i17 % 2;
            } else {
                welcomeActivity$jumpToMain$1 = new WelcomeActivity$jumpToMain$1(welcomeActivity, continuation);
                int i19 = values;
                int i20 = i19 & 123;
                int i21 = (((i19 ^ 123) | i20) << 1) - ((i19 | 123) & (~i20));
                fARcdN = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        Object obj2 = welcomeActivity$jumpToMain$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i23 = welcomeActivity$jumpToMain$1.label;
        int i24 = fARcdN;
        int i25 = (i24 & (-46)) | ((~i24) & 45);
        int i26 = (i24 & 45) << 1;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        values = i27 % 128;
        int i28 = i27 % 2;
        if (i23 != 0) {
            int i29 = i24 ^ 71;
            int i30 = -(-((i24 & 71) << 1));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            values = i31 % 128;
            if (i31 % 2 == 0 ? i23 != 1 : i23 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i32 = i24 + 35;
            values = i32 % 128;
            int i33 = i32 % 2;
            C56391yDq.AEQbTJ(obj2);
            int i34 = fARcdN + 83;
            values = i34 % 128;
            int i35 = i34 % 2;
        } else {
            C56391yDq.AEQbTJ(obj2);
            boolean z2 = welcomeActivity.djBIcL;
            StringBuilder sb = new StringBuilder();
            int i36 = fARcdN;
            int i37 = (i36 ^ 33) + ((i36 & 33) << 1);
            values = i37 % 128;
            int i38 = i37 % 2;
            sb.append("WelcomeActivity jumpToMain----->animDone: ");
            sb.append(z2);
            int i39 = values;
            int i40 = (((i39 | 29) << 1) - (~(-(((~i39) & 29) | (i39 & (-30)))))) - 1;
            fARcdN = i40 % 128;
            int i41 = i40 % 2;
            pUU.EZpvd("WelcomeActivity", sb.toString());
            if (!welcomeActivity.djBIcL) {
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                int i42 = values;
                int i43 = i42 ^ 21;
                int i44 = (((i42 & 21) | i43) << 1) - i43;
                fARcdN = i44 % 128;
                if (i44 % 2 != 0) {
                    return boolKWHzl;
                }
                throw null;
            }
            int i45 = values;
            int i46 = i45 & 27;
            int i47 = i46 + ((i45 ^ 27) | i46);
            fARcdN = i47 % 128;
            int i48 = i47 % 2;
            pUU.EZpvd("TAG_APP_OP", "WelcomeActivity jumpToMain----->");
            welcomeActivity$jumpToMain$1.label = 1;
            int i49 = fARcdN;
            int i50 = (i49 ^ 81) + ((i49 & 81) << 1);
            values = i50 % 128;
            if (i50 % 2 != 0) {
                int iAEQbTJ = zza.AEQbTJ();
                EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -2023582913, 2023582930, new Object[]{welcomeActivity, welcomeActivity$jumpToMain$1}, zza.AEQbTJ());
                throw null;
            }
            int iAEQbTJ2 = zza.AEQbTJ();
            if (EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ2, -2023582913, 2023582930, new Object[]{welcomeActivity, welcomeActivity$jumpToMain$1}, zza.AEQbTJ()) == objCopydefault) {
                int i51 = values;
                int i52 = (((i51 | 122) << 1) - (i51 ^ 122)) - 1;
                fARcdN = i52 % 128;
                int i53 = i52 % 2;
                int i54 = (i51 | 41) << 1;
                int i55 = -(i51 ^ 41);
                int i56 = (i54 & i55) + (i55 | i54);
                fARcdN = i56 % 128;
                if (i56 % 2 != 0) {
                    return objCopydefault;
                }
                throw null;
            }
        }
        Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
        int i57 = values;
        int i58 = ((i57 | 23) << 1) - (i57 ^ 23);
        fARcdN = i58 % 128;
        if (i58 % 2 != 0) {
            return boolKWHzl2;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [260=4, 263=5, 267=5] */
    private static /* synthetic */ Object fJNWhG(Object[] objArr) {
        boolean zValues;
        boolean z;
        final boolean zIwGUEr;
        final WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 21;
        int i4 = (i2 ^ 21) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        values = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        final boolean zFARcdN = interfaceC33171mrS.fARcdN();
        int i7 = values;
        int i8 = i7 & 105;
        int i9 = (((i7 | 105) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
        int i10 = i9 % 128;
        fARcdN = i10;
        int i11 = i9 % 2;
        if (zFARcdN) {
            int i12 = (i10 ^ 9) + ((i10 & 9) << 1);
            values = i12 % 128;
            if (i12 % 2 != 0) {
                interfaceC33171mrS.uzCIH();
                int i13 = 98 / 0;
            } else {
                interfaceC33171mrS.uzCIH();
            }
            int i14 = fARcdN;
            int i15 = ((i14 ^ 94) + ((i14 & 94) << 1)) - 1;
            values = i15 % 128;
            int i16 = i15 % 2;
        }
        final boolean zOLrzqt = ((OKComplianceRestrictionService) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1438042712, -1438042687, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).OLrzqt(OKComplianceRestrictionService.Feature.CEFI);
        InterfaceC33171mrS interfaceC33171mrS2 = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        int i17 = values;
        int i18 = ((i17 & 8) + (i17 | 8)) - 1;
        fARcdN = i18 % 128;
        if (i18 % 2 == 0) {
            zIwGUEr = interfaceC33171mrS2.iwGUEr();
            z = SPUtils.getBoolean("had_show_introduction", true);
            zValues = ((InterfaceC47278tmy) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -947666771, 947666772, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).values();
        } else {
            boolean zIwGUEr2 = interfaceC33171mrS2.iwGUEr();
            boolean z2 = SPUtils.getBoolean("had_show_introduction", false);
            zValues = ((InterfaceC47278tmy) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -947666771, 947666772, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).values();
            z = z2;
            zIwGUEr = zIwGUEr2;
        }
        boolean zFIwbmz = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz();
        SPUtils.put("show_login_from_wallet", C56443yFo.KWHzl(true));
        boolean z3 = welcomeActivity.gEmmrt;
        StringBuilder sb = new StringBuilder();
        sb.append("goIntroductionOrHome->hadShowIntroduction:");
        sb.append(z);
        int i19 = fARcdN;
        int i20 = ((i19 & 32) + (i19 | 32)) - 1;
        values = i20 % 128;
        Object obj = null;
        if (i20 % 2 != 0) {
            sb.append(" forbiddenType:");
            sb.append(zOLrzqt);
            sb.append(" isFirstLaunch:");
            sb.append(z3);
            obj.hashCode();
            throw null;
        }
        sb.append(" forbiddenType:");
        sb.append(zOLrzqt);
        sb.append(" isFirstLaunch:");
        sb.append(z3);
        sb.append(" isLogin:");
        sb.append(zValues);
        sb.append(" isOnChain:");
        sb.append(zFIwbmz);
        sb.append(" ");
        pUU.KWHzl("WelcomeActivity", sb.toString());
        Function1 function1 = new Function1() { // from class: o.muV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                java.lang.Object[] objArr2 = {this.EZpvd, java.lang.Boolean.valueOf(zFARcdN), java.lang.Boolean.valueOf(zIwGUEr), java.lang.Boolean.valueOf(zOLrzqt), java.lang.Boolean.valueOf(((java.lang.Boolean) obj2).booleanValue())};
                return (Unit) WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), -482985329, 482985347, objArr2, com.google.android.gms.measurement.zza.AEQbTJ());
            }
        };
        int i21 = values + 103;
        fARcdN = i21 % 128;
        int i22 = i21 % 2;
        Object objEZpvd = EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 541874949, -541874922, new Object[]{welcomeActivity, function1, continuation}, zza.AEQbTJ());
        if (objEZpvd == C56442yFn.copydefault()) {
            int i23 = fARcdN + 63;
            values = i23 % 128;
            if (i23 % 2 == 0) {
                return objEZpvd;
            }
            obj.hashCode();
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i24 = values;
        int i25 = (i24 & 101) + (i24 | 101);
        fARcdN = i25 % 128;
        if (i25 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [277=6] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v21, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r3 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r3 = com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.fARcdN;
        r9 = ((r3 ^ 33) | (r3 & 33)) << 1;
        r3 = -(((~r3) & 33) | (r3 & (-34)));
        r10 = ((r9 | r3) << 1) - (r3 ^ r9);
        com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.values = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if ((r10 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        r3 = (r7 ? 1 : 0) & 1;
        EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 1575964015, -1575963996, new java.lang.Object[]{r1, true, java.lang.Boolean.valueOf((r3 | (!r7 ? 1 : 0)) & (~r3))}, com.google.android.gms.measurement.zza.AEQbTJ());
        r0 = com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.fARcdN + 65;
        com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.values = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r3 = ((o.InterfaceC33171mrS) o.C43251rlk.copydefault(o.InterfaceC33171mrS.class)).fIwbmz();
        r5 = com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.values;
        r8 = (r5 ^ 75) + ((r5 & 75) << 1);
        com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.fARcdN = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        if ((r8 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c8, code lost:
    
        EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 1575964015, -1575963996, new java.lang.Object[]{r1, java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(((r7 ? 1 : 0) & (-2)) ^ ((~(r7 ? 1 : 0)) & 1))}, com.google.android.gms.measurement.zza.AEQbTJ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f3, code lost:
    
        r5 = (r7 ? 1 : 0) & 1;
        EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 1575964015, -1575963996, new java.lang.Object[]{r1, java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf((r5 | (!r7 ? 1 : 0)) & (~r5))}, com.google.android.gms.measurement.zza.AEQbTJ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0122, code lost:
    
        EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), 1415641712, -1415641683, new java.lang.Object[]{r1}, com.google.android.gms.measurement.zza.AEQbTJ());
        r0 = kotlin.Unit.INSTANCE;
        r1 = com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.values;
        r3 = ((r1 ^ okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT) + ((r1 & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT) << 1)) - 1;
        com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.fARcdN = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0150, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0151, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
        r1 = com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.fARcdN;
        r3 = r1 & 45;
        r1 = (r1 | 45) & (~r3);
        r3 = -(-(r3 << 1));
        r2 = ((r1 | r3) << 1) - (r1 ^ r3);
        com.okinc.core.ok_app.homepage.ui.welcome.WelcomeActivity.values = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0169, code lost:
    
        if ((r2 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x016b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x016c, code lost:
    
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        if ((!r1.AYXKKw) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if ((!r1.AYXKKw) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r1.AYXKKw = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AwvSrB(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
        ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = values;
        int i3 = (i2 & (-6)) | ((~i2) & 5);
        int i4 = -(-((i2 & 5) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        fARcdN = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v72, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AubY(Object[] objArr) throws Throwable {
        WelcomeActivity$isProModeHidden$1 welcomeActivity$isProModeHidden$1;
        Mutex mutex;
        Object objLock;
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 77;
        int i4 = (i2 ^ 77) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        values = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (continuation instanceof WelcomeActivity$isProModeHidden$1) {
            int i8 = (i6 ^ 107) + ((i6 & 107) << 1);
            fARcdN = i8 % 128;
            int i9 = i8 % 2;
            welcomeActivity$isProModeHidden$1 = (WelcomeActivity$isProModeHidden$1) continuation;
            int i10 = welcomeActivity$isProModeHidden$1.label;
            int i11 = values;
            int i12 = i11 & 61;
            int i13 = ((((i11 ^ 61) | i12) << 1) - (~(-((~i12) & (i11 | 61))))) - 1;
            fARcdN = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            if ((i10 & Integer.MIN_VALUE) != 0) {
                int i14 = i11 ^ 5;
                int i15 = ((i11 & 5) | i14) << 1;
                int i16 = -i14;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                fARcdN = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i10 & Integer.MIN_VALUE;
                welcomeActivity$isProModeHidden$1.label = i19 + ((i10 ^ Integer.MIN_VALUE) | i19);
                int i20 = fARcdN;
                int i21 = i20 & 21;
                int i22 = (i20 ^ 21) | i21;
                int i23 = (i21 & i22) + (i21 | i22);
                values = i23 % 128;
                int i24 = i23 % 2;
                int i25 = (i20 ^ 9) + ((i20 & 9) << 1);
                values = i25 % 128;
                int i26 = i25 % 2;
            } else {
                welcomeActivity$isProModeHidden$1 = new WelcomeActivity$isProModeHidden$1(welcomeActivity, continuation);
                int i27 = values;
                int i28 = (-2) - (((i27 ^ 22) + ((i27 & 22) << 1)) ^ (-1));
                fARcdN = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        Object obj2 = welcomeActivity$isProModeHidden$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i30 = welcomeActivity$isProModeHidden$1.label;
        int i31 = values;
        int i32 = i31 & 31;
        int i33 = i32 + ((i31 ^ 31) | i32);
        int i34 = i33 % 128;
        fARcdN = i34;
        int i35 = i33 % 2;
        if (i30 != 0) {
            int i36 = i34 & 5;
            int i37 = (((i34 ^ 5) | i36) << 1) - ((~i36) & (i34 | 5));
            int i38 = i37 % 128;
            values = i38;
            int i39 = i37 % 2;
            if (i30 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i40 = ((i38 & 92) + (i38 | 92)) - 1;
            fARcdN = i40 % 128;
            int i41 = i40 % 2;
            Mutex mutex2 = (Mutex) welcomeActivity$isProModeHidden$1.L$2;
            function1 = (Function1) welcomeActivity$isProModeHidden$1.L$1;
            int i42 = fARcdN + 101;
            values = i42 % 128;
            int i43 = i42 % 2;
            welcomeActivity = (WelcomeActivity) welcomeActivity$isProModeHidden$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            int i44 = values;
            int i45 = (((i44 | 28) << 1) - (i44 ^ 28)) - 1;
            fARcdN = i45 % 128;
            if (i45 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            mutex = mutex2;
        } else {
            C56391yDq.AEQbTJ(obj2);
            mutex = welcomeActivity.valueOf;
            int i46 = values;
            int i47 = i46 & WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            int i48 = (i46 | WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) & (~i47);
            int i49 = i47 << 1;
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            fARcdN = i50 % 128;
            int i51 = i50 % 2;
            welcomeActivity$isProModeHidden$1.L$0 = welcomeActivity;
            welcomeActivity$isProModeHidden$1.L$1 = function1;
            welcomeActivity$isProModeHidden$1.L$2 = mutex;
            int i52 = ~zza.AEQbTJ();
            int i53 = 2060295455 & i52;
            int i54 = -(~((i53 | ((~i53) & (2060295455 | i52))) * 495));
            int i55 = i52 & 2060295455;
            int i56 = (i52 | 2060295455) & (~i55);
            int i57 = ~((i56 & i55) | (i56 ^ i55));
            int i58 = (((-2) - ((((-832679696) ^ i54) + ((i54 & (-832679696)) << 1)) ^ (-1))) - (~(-(~(((i57 & 1879640345) | (1879640345 ^ i57)) * 495))))) - 1;
            int i59 = (i58 ^ (-1)) + (i58 << 1);
            int iAEQbTJ = zza.AEQbTJ();
            int i60 = ~iAEQbTJ;
            int i61 = ~iAEQbTJ;
            int i62 = ((iAEQbTJ | i61) & i60) | 1557980731;
            int i63 = (i62 | (~i62)) & (~i62);
            int i64 = 1498237154 & i63;
            int i65 = -(-((((~i64) & (i63 | 1498237154)) | i64) * 764));
            int i66 = ((-736214463) | i65) << 1;
            int i67 = -((i65 & 736214462) | ((~i65) & (-736214463)));
            int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
            int i69 = ((-1498237155) & i60) | ((~i60) & 1498237154) | (i60 & 1498237154);
            int i70 = (i69 | (~i69)) & (~i69);
            int i71 = 76588569 ^ i70;
            int i72 = i70 & 76588569;
            int i73 = (i68 - (~(((i72 & i71) | (i71 ^ i72)) * (-1528)))) - 1;
            int i74 = ~((i61 ^ 1557980731) | (i61 & 1557980731));
            int i75 = 93433561 & i74;
            int i76 = (((i74 | 93433561) & (~i75)) | i75) * 764;
            int i77 = ((i73 ^ i76) | (i73 & i76)) << 1;
            int i78 = -((i76 & (~i73)) | ((~i76) & i73));
            if (i59 <= ((i77 | i78) << 1) - (i78 ^ i77)) {
                welcomeActivity$isProModeHidden$1.label = 1;
                objLock = mutex.lock(null, welcomeActivity$isProModeHidden$1);
            } else {
                welcomeActivity$isProModeHidden$1.label = 1;
                objLock = mutex.lock(null, welcomeActivity$isProModeHidden$1);
            }
            int i79 = fARcdN + 75;
            int i80 = i79 % 128;
            values = i80;
            int i81 = i79 % 2;
            if (objLock == objCopydefault) {
                int i82 = (i80 | 105) << 1;
                int i83 = -((i80 & (-106)) | ((~i80) & 105));
                int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                int i85 = i84 % 128;
                fARcdN = i85;
                if (i84 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i86 = i85 ^ 99;
                int i87 = (((i85 & 99) | i86) << 1) - i86;
                values = i87 % 128;
                if (i87 % 2 != 0) {
                    int i88 = 46 / 0;
                }
                return objCopydefault;
            }
            int iIdentityHashCode = System.identityHashCode(welcomeActivity);
            int i89 = ~iIdentityHashCode;
            int i90 = (i89 & 1951260617) | ((~i89) & (-1951260618));
            int i91 = i89 & (-1951260618);
            int i92 = (i91 & i90) | (i90 ^ i91);
            int i93 = (i92 | (~i92)) & (~i92);
            int i94 = i93 & 877186689;
            int i95 = (i93 | 877186689) & (~i94);
            int i96 = (i95 & i94) | (i95 ^ i94);
            int i97 = (-34742305) & iIdentityHashCode;
            int i98 = (~i97) & ((-34742305) | iIdentityHashCode);
            int i99 = ~iIdentityHashCode;
            int i100 = ~(i97 | i98);
            int i101 = i96 ^ i100;
            int i102 = i96 & i100;
            int i103 = (-755027269) - (~(-(-(((i102 & i101) | (i101 ^ i102)) * 717))));
            int i104 = (~iIdentityHashCode) & (i99 | iIdentityHashCode);
            int i105 = (-34742305) ^ i104;
            int i106 = i104 & (-34742305);
            int i107 = ~((i106 & i105) | (i105 ^ i106));
            int i108 = ((-877186690) & i107) | ((~i107) & 877186689);
            int i109 = i107 & 877186689;
            int i110 = (i109 & i108) | (i108 ^ i109);
            int i111 = (1951260617 & iIdentityHashCode) | ((-1951260618) & i99);
            int i112 = iIdentityHashCode & (-1951260618);
            int i113 = ~((i112 & i111) | (i111 ^ i112));
            int i114 = (i103 - (~(-(~(-(-(((i113 & i110) | (((~i113) & i110) | ((~i110) & i113))) * 717))))))) - 1;
            int i115 = (i114 ^ (-1)) + (i114 << 1);
            int iIdentityHashCode2 = System.identityHashCode(welcomeActivity);
            int i116 = ~iIdentityHashCode2;
            int i117 = (148631677 & i116) | ((-148631678) & iIdentityHashCode2);
            int i118 = 148631677 & iIdentityHashCode2;
            int i119 = (-2) - ((1601111311 - (~(-(~(-(-(((i117 & i118) | (i117 ^ i118)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA))))))) ^ (-1));
            int i120 = ~iIdentityHashCode2;
            int i121 = i120 ^ 148631677;
            int i122 = 148631677 & i120;
            int i123 = (i122 & i121) | (i121 ^ i122);
            int i124 = (i123 | (~i123)) & (~i123);
            int i125 = ((~i124) & (-2044458238)) | (i124 & 2044458237);
            int i126 = i124 & (-2044458238);
            int i127 = -(-(((i126 & i125) | (i125 ^ i126)) * (-280)));
            int i128 = ((((~i127) & i119) | ((~i119) & i127)) - (~((i127 & i119) << 1))) - 1;
            int i129 = i116 & (-2040022217);
            int i130 = (i116 | (-2040022217)) & (~i129);
            int i131 = (i130 & i129) | (i130 ^ i129);
            int i132 = (i131 | (~i131)) & (~i131);
            int i133 = 144195656 ^ i132;
            int i134 = i132 & 144195656;
            int i135 = (i134 & i133) | (i133 ^ i134);
            int i136 = iIdentityHashCode2 | 2044458237;
            int i137 = (i136 | (~i136)) & (~i136);
            int i138 = ((~i137) & i135) | ((~i135) & i137);
            int i139 = i137 & i135;
            int i140 = ((i139 & i138) | (i138 ^ i139)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
            int i141 = i128 & i140;
            int i142 = -(-(i140 | i128));
            if (i115 <= (i141 & i142) + (i142 | i141)) {
                int i143 = 2 / 5;
            }
        }
        try {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1438042712, -1438042687, new Object[]{welcomeActivity}, zza.AEQbTJ())).get();
            OKComplianceRestrictionService.CefiMode cefiMode = OKComplianceRestrictionService.CefiMode.PRO;
            int i144 = fARcdN + 63;
            values = i144 % 128;
            int i145 = i144 % 2;
            boolean zAEQbTJ = oKComplianceRestrictionService.AEQbTJ(cefiMode);
            Boolean boolKWHzl = C56443yFo.KWHzl(((zAEQbTJ ? 1 : 0) | 1) & (~((zAEQbTJ ? 1 : 0) & 1)));
            int i146 = fARcdN;
            int i147 = i146 & 75;
            int i148 = (((i146 | 75) & (~i147)) - (~(i147 << 1))) - 1;
            values = i148 % 128;
            int i149 = i148 % 2;
            function1.invoke(boolKWHzl);
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            int i150 = values;
            int i151 = i150 + 35;
            fARcdN = i151 % 128;
            int i152 = i151 % 2;
            int i153 = ((i150 ^ 68) + ((i150 & 68) << 1)) - 1;
            fARcdN = i153 % 128;
            int i154 = i153 % 2;
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [315=15, 303=4] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object fIwbmz(Object[] objArr) {
        int i;
        Pair pairOLrzqt;
        Pair[] pairArr;
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        boolean zCopydefault = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3);
        StringBuilder sb = new StringBuilder();
        int i3 = values;
        int i4 = i3 ^ 53;
        int i5 = (((i3 & 53) | i4) << 1) - i4;
        fARcdN = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            sb.append("performModeJump->isOnChain:");
            sb.append(zBooleanValue);
            throw null;
        }
        sb.append("performModeJump->isOnChain:");
        sb.append(zBooleanValue);
        int i6 = values + 75;
        fARcdN = i6 % 128;
        if (i6 % 2 == 0) {
            sb.append(" isCeFiAllow:");
            sb.append(zBooleanValue2);
            int i7 = 58 / 0;
        } else {
            sb.append(" isCeFiAllow:");
            sb.append(zBooleanValue2);
        }
        sb.append(" canSwitchToOnChain:");
        sb.append(zCopydefault);
        int i8 = fARcdN + 41;
        values = i8 % 128;
        int i9 = i8 % 2;
        pUU.KWHzl("WelcomeActivity", sb.toString());
        if (zBooleanValue) {
            int i10 = fARcdN;
            int i11 = ((i10 ^ 61) | (i10 & 61)) << 1;
            int i12 = -((i10 & (-62)) | ((~i10) & 61));
            int i13 = (i11 & i12) + (i11 | i12);
            values = i13 % 128;
            int i14 = i13 % 2;
            if (!zCopydefault) {
                InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC33171mrS.class));
                int i15 = values + 103;
                int i16 = i15 % 128;
                fARcdN = i16;
                int i17 = i15 % 2;
                if (interfaceC33171mrS != null) {
                    int i18 = i16 + 5;
                    values = i18 % 128;
                    if (i18 % 2 != 0) {
                        pairOLrzqt = C56390yDp.OLrzqt("fade_animation", Boolean.TRUE);
                        pairArr = new Pair[1];
                    } else {
                        pairOLrzqt = C56390yDp.OLrzqt("fade_animation", Boolean.TRUE);
                        pairArr = new Pair[1];
                    }
                    pairArr[0] = pairOLrzqt;
                    int i19 = fARcdN;
                    int i20 = (((i19 | 34) << 1) - (i19 ^ 34)) - 1;
                    values = i20 % 128;
                    if (i20 % 2 != 0) {
                        InterfaceC33171mrS.Activity.autoSwitchMode$default(interfaceC33171mrS, welcomeActivity, false, true, BundleKt.bundleOf(pairArr), null, 49, null);
                    } else {
                        InterfaceC33171mrS.Activity.autoSwitchMode$default(interfaceC33171mrS, welcomeActivity, false, true, BundleKt.bundleOf(pairArr), null, 16, null);
                    }
                }
                int iAEQbTJ = zza.AEQbTJ();
                boolean zValues = ((InterfaceC47278tmy) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -947666771, 947666772, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).values();
                StringBuilder sb2 = new StringBuilder();
                int i21 = values;
                int i22 = (-2) - (((i21 ^ 94) + ((i21 & 94) << 1)) ^ (-1));
                fARcdN = i22 % 128;
                int i23 = i22 % 2;
                sb2.append("performModeJump->go to exchange-->isLogin:");
                sb2.append(zValues);
                if (i23 == 0) {
                    int i24 = 42 / 0;
                }
                int i25 = fARcdN;
                int i26 = i25 & 125;
                int i27 = -(-((i25 ^ 125) | i26));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                values = i28 % 128;
                int i29 = i28 % 2;
                sb2.append(" isCeFiAllow:");
                sb2.append(zBooleanValue2);
                if (i29 != 0) {
                    throw null;
                }
                pUU.EZpvd("WelcomeActivity", sb2.toString());
                int i30 = fARcdN;
                i = (((i30 | 4) << 1) - (i30 ^ 4)) - 1;
                values = i % 128;
            } else {
                int i31 = (i10 & 11) + (i10 | 11);
                values = i31 % 128;
                int i32 = i31 % 2;
                int iAEQbTJ2 = zza.AEQbTJ();
                OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ2, 1438042712, -1438042687, new Object[]{welcomeActivity}, zza.AEQbTJ())).get();
                int i33 = fARcdN + 65;
                values = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 30 / 0;
                    if (oKComplianceRestrictionService.OLrzqt(OKComplianceRestrictionService.AppMode.WEB3)) {
                        InterfaceC33171mrS interfaceC33171mrS2 = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
                        Boolean bool = Boolean.TRUE;
                        int i35 = fARcdN + 67;
                        values = i35 % 128;
                        int i36 = i35 % 2;
                        Pair pairOLrzqt2 = C56390yDp.OLrzqt("fade_animation", bool);
                        int i37 = values;
                        int i38 = i37 & 117;
                        int i39 = (~i38) & (i37 | 117);
                        int i40 = i38 << 1;
                        int i41 = (i39 & i40) + (i40 | i39);
                        fARcdN = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = (i37 & 3) + (i37 | 3);
                        fARcdN = i43 % 128;
                        int i44 = i43 % 2;
                        Bundle bundleBundleOf = BundleKt.bundleOf(pairOLrzqt2);
                        int i45 = fARcdN;
                        int i46 = ((i45 ^ 51) | (i45 & 51)) << 1;
                        int i47 = -(((~i45) & 51) | (i45 & (-52)));
                        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                        values = i48 % 128;
                        int i49 = i48 % 2;
                        InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS2, welcomeActivity, 3, false, 1, bundleBundleOf, null, 32, null);
                        int i50 = values + 87;
                        fARcdN = i50 % 128;
                        if (i50 % 2 == 0) {
                            pUU.KWHzl("WelcomeActivity", "performModeJump->enterWallet");
                            obj.hashCode();
                            throw null;
                        }
                        pUU.KWHzl("WelcomeActivity", "performModeJump->enterWallet");
                        int i51 = values;
                        int i52 = i51 & 101;
                        i = ((((i51 ^ 101) | i52) << 1) - (~(-((i51 | 101) & (~i52))))) - 1;
                        fARcdN = i % 128;
                    }
                } else if (oKComplianceRestrictionService.OLrzqt(OKComplianceRestrictionService.AppMode.WEB3)) {
                }
            }
        }
        int i53 = i % 2;
        RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
        int i54 = fARcdN;
        int i55 = i54 & 97;
        int i56 = (i54 ^ 97) | i55;
        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
        values = i57 % 128;
        if (i57 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = fARcdN;
        int i5 = i4 & 79;
        int i6 = -(-((i4 ^ 79) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        values = i7 % 128;
        int i8 = i7 % 2;
        super.onActivityResult(i, i2, intent);
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 827833512, -827833489, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
        int i9 = fARcdN;
        int i10 = i9 & 3;
        int i11 = -(-((i9 ^ 3) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        values = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object QOLQEE(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 & 79;
        int i4 = -(-((i2 ^ 79) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        fARcdN = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            ((InterfaceC47278tmy) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -947666771, 947666772, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).values();
            throw null;
        }
        int iAEQbTJ = zza.AEQbTJ();
        if (!((InterfaceC47278tmy) ((Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -947666771, 947666772, new Object[]{welcomeActivity}, zza.AEQbTJ())).get()).values()) {
            int i6 = fARcdN;
            int i7 = ((i6 ^ 49) | (i6 & 49)) << 1;
            int i8 = -(((~i6) & 49) | (i6 & (-50)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            values = i9 % 128;
            int i10 = i9 % 2;
            InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
            if (interfaceC46557tYt != null) {
                int i11 = (-2) - ((fARcdN + 108) ^ (-1));
                values = i11 % 128;
                int i12 = i11 % 2;
                interfaceC46557tYt.OLrzqt();
                int i13 = values;
                int i14 = i13 & 67;
                int i15 = (i13 ^ 67) | i14;
                int i16 = (i14 & i15) + (i15 | i14);
                fARcdN = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = values;
        int i19 = i18 | 97;
        int i20 = (i19 << 1) - ((~(i18 & 97)) & i19);
        fARcdN = i20 % 128;
        if (i20 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 3;
        int i4 = i2 | 3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        int i7 = fARcdN + 43;
        values = i7 % 128;
        int i8 = i7 % 2;
        AEQbTJ(this, configuration);
        if (i8 != 0) {
            throw null;
        }
        int i9 = values;
        int i10 = i9 & 63;
        int i11 = ((((i9 ^ 63) | i10) << 1) - (~(-((i9 | 63) & (~i10))))) - 1;
        fARcdN = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 54 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [347=4] */
    public void AEQbTJ(@NotNull Activity activity, @NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = values + 59;
        fARcdN = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        int i4 = fARcdN;
        int i5 = (i4 | 53) << 1;
        int i6 = -(i4 ^ 53);
        int i7 = (i5 & i6) + (i6 | i5);
        values = i7 % 128;
        int i8 = i7 % 2;
        if (C34703nhO.AYXKKw(this)) {
            zza.AEQbTJ();
            System.identityHashCode(this);
            activity.setRequestedOrientation(1);
            int i9 = fARcdN;
            int i10 = (((i9 ^ 39) | (i9 & 39)) << 1) - (((~i9) & 39) | (i9 & (-40)));
            values = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 2;
            }
        } else {
            activity.setRequestedOrientation(-1);
            int i12 = values;
            int i13 = i12 & 21;
            int i14 = i13 + ((i12 ^ 21) | i13);
            fARcdN = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = fARcdN;
        int i17 = i16 & 21;
        int i18 = ((i16 | 21) & (~i17)) + (i17 << 1);
        values = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        int i2 = 2 % 2;
        int i3 = values + 49;
        fARcdN = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT == 26) {
            int i5 = fARcdN;
            int i6 = i5 & 3;
            int i7 = (((i5 ^ 3) | i6) << 1) - ((i5 | 3) & (~i6));
            values = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                C33476mxF.KWHzl(this);
                obj.hashCode();
                throw null;
            }
            if (!(!C33476mxF.KWHzl(this))) {
                pUU.EZpvd("BaseActivity", "fix android 8.0 Activity setRequestedOrientation ");
                int i8 = fARcdN;
                int i9 = ((i8 | 39) << 1) - (i8 ^ 39);
                values = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        super.setRequestedOrientation(i);
        int i10 = fARcdN;
        int i11 = (i10 & 123) + (i10 | 123);
        values = i11 % 128;
        int i12 = i11 % 2;
    }

    private static /* synthetic */ Object uzCIH(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        C33332muU c33332muU = new C33332muU(C32979mnm.EZpvd.OLrzqt(), null);
        c33332muU.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o.muQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                java.lang.Object[] objArr2 = {mediaPlayer, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)};
                return ((java.lang.Boolean) WelcomeActivity.EZpvd(com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), com.google.android.gms.measurement.zza.AEQbTJ(), -1636754442, 1636754457, objArr2, com.google.android.gms.measurement.zza.AEQbTJ())).booleanValue();
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C55298xhM.OLrzqt(350, (Context) welcomeActivity), C55298xhM.OLrzqt(350, (Context) welcomeActivity));
        int i2 = fARcdN;
        int i3 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
        values = i3 % 128;
        layoutParams.gravity = i3 % 2 != 0 ? 27 : 17;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(c33332muU, layoutParams);
        int i4 = values;
        int i5 = (i4 & (-80)) | ((~i4) & 79);
        int i6 = (i4 & 79) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        fARcdN = i7 % 128;
        if (i7 % 2 != 0) {
            return c33332muU;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = fARcdN;
        int i3 = i2 & 49;
        int i4 = (i2 ^ 49) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            int iAEQbTJ = zza.AEQbTJ();
            EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, -251712505, 251712511, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
            super.onDestroy();
            int i6 = values;
            int i7 = (i6 & (-98)) | ((~i6) & 97);
            int i8 = -(-((i6 & 97) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            fARcdN = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int iAEQbTJ2 = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ2, -251712505, 251712511, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
        super.onDestroy();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object AhwBna(Object[] objArr) {
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values;
        int i3 = i2 + 7;
        fARcdN = i3 % 128;
        int i4 = i3 % 2;
        VideoView videoView = welcomeActivity.DbNXlk;
        Object obj = null;
        if (videoView != null) {
            int i5 = (((i2 & (-106)) | ((~i2) & 105)) - (~((i2 & 105) << 1))) - 1;
            fARcdN = i5 % 128;
            if (i5 % 2 == 0) {
                videoView.suspend();
                throw null;
            }
            videoView.suspend();
        }
        VideoView videoView2 = welcomeActivity.DbNXlk;
        if (videoView2 != null) {
            int i6 = fARcdN;
            int i7 = i6 & 13;
            int i8 = i7 + ((i6 ^ 13) | i7);
            values = i8 % 128;
            int i9 = i8 % 2;
            videoView2.setOnErrorListener(null);
            int i10 = fARcdN;
            int i11 = (i10 & 3) + (i10 | 3);
            values = i11 % 128;
            int i12 = i11 % 2;
        }
        VideoView videoView3 = welcomeActivity.DbNXlk;
        if (videoView3 != null) {
            int i13 = fARcdN;
            int i14 = (i13 & (-32)) | ((~i13) & 31);
            int i15 = -(-((i13 & 31) << 1));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            values = i16 % 128;
            if (i16 % 2 != 0) {
                videoView3.setOnPreparedListener(null);
                obj.hashCode();
                throw null;
            }
            videoView3.setOnPreparedListener(null);
        }
        VideoView videoView4 = welcomeActivity.DbNXlk;
        if (videoView4 != null) {
            int i17 = values + 27;
            fARcdN = i17 % 128;
            if (i17 % 2 == 0) {
                videoView4.setOnCompletionListener(null);
                obj.hashCode();
                throw null;
            }
            videoView4.setOnCompletionListener(null);
            int i18 = values + 9;
            fARcdN = i18 % 128;
            int i19 = i18 % 2;
        }
        welcomeActivity.DbNXlk = null;
        FrameLayout frameLayout = welcomeActivity.AhwBna;
        if (frameLayout == null) {
            int i20 = fARcdN;
            int i21 = (i20 ^ 21) + ((i20 & 21) << 1);
            values = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.gEmmrt("");
            int i23 = fARcdN;
            int i24 = (i23 ^ 107) + ((i23 & 107) << 1);
            values = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 3 / 3;
            }
            frameLayout = null;
        } else {
            int i26 = values;
            int i27 = ((i26 & (-90)) | ((~i26) & 89)) + ((i26 & 89) << 1);
            fARcdN = i27 % 128;
            int i28 = i27 % 2;
        }
        frameLayout.removeAllViews();
        Iterators.AnonymousClass8.KWHzl();
        Iterators.AnonymousClass8.KWHzl();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [288=6, 393=4] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r2
  0x0030: PHI (r2v5 java.util.List) = (r2v4 java.util.List), (r2v27 java.util.List) binds: [B:8:0x002e, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object zLjUOn(Object[] objArr) {
        List listKWHzl;
        WelcomeActivity welcomeActivity = (WelcomeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = values + 29;
        fARcdN = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
            int i3 = 26 / 0;
            if (listKWHzl != null) {
                int i4 = fARcdN;
                int i5 = i4 & 77;
                int i6 = i5 + ((i4 ^ 77) | i5);
                values = i6 % 128;
                if (i6 % 2 != 0) {
                    listKWHzl.iterator();
                    throw null;
                }
                Iterator it = listKWHzl.iterator();
                int i7 = values;
                int i8 = i7 & 53;
                int i9 = (i8 - (~(-(-((i7 ^ 53) | i8))))) - 1;
                fARcdN = i9 % 128;
                int i10 = i9 % 2;
                while (it.hasNext()) {
                    int i11 = fARcdN + 35;
                    values = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((InterfaceC33254msw) it.next()).KWHzl(welcomeActivity);
                        throw null;
                    }
                    ((InterfaceC33254msw) it.next()).KWHzl(welcomeActivity);
                    int i12 = values;
                    int i13 = (i12 & WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + (i12 | WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
                    fARcdN = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        } else {
            listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
            if (listKWHzl != null) {
            }
        }
        ((C33285mta) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 309540565, -309540557, new Object[]{welcomeActivity}, zza.AEQbTJ())).isConnected();
        welcomeActivity.finish();
        int i15 = values;
        int i16 = i15 & 83;
        int i17 = i15 | 83;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        fARcdN = i18 % 128;
        int i19 = i18 % 2;
        pUU.OLrzqt("TAG_APP_OP", "goIntroductionOrHome");
        int i20 = fARcdN;
        int i21 = (i20 & 93) + (i20 | 93);
        values = i21 % 128;
        if (i21 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33329muR, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final void isConnected() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iAEQbTJ, 2030980333, -2030980300, new Object[]{this}, zza.AEQbTJ());
    }

    public final void fetchVPNInfo() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, -251712505, 251712511, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2)};
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1575964015, -1575963996, objArr, zza.AEQbTJ());
    }

    public final void AkhnZx() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 1415641712, -1415641683, new Object[]{this}, zza.AEQbTJ());
    }

    public final Object KWHzl(Continuation<? super Boolean> continuation) {
        int iAEQbTJ = zza.AEQbTJ();
        return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 1683403455, -1683403439, new Object[]{this, continuation}, zza.AEQbTJ());
    }

    public final Object EZpvd(Function1<? super Boolean, Unit> function1, Continuation<? super Unit> continuation) {
        int iAEQbTJ = zza.AEQbTJ();
        return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 541874949, -541874922, new Object[]{this, function1, continuation}, zza.AEQbTJ());
    }

    public final void values() {
        int iKWHzl = Iterators.AnonymousClass8.KWHzl();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iKWHzl, -229770524, 229770529, new Object[]{this}, zza.AEQbTJ());
    }

    public final void DbNXlk() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 827833512, -827833489, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
    }

    public final void AYXKKw() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, -1781969021, 1781969034, new Object[]{this}, zza.AEQbTJ());
    }

    public final Object copydefault(Continuation<? super Unit> continuation) {
        int iAEQbTJ = zza.AEQbTJ();
        return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -2023582913, 2023582930, new Object[]{this, continuation}, zza.AEQbTJ());
    }

    public final Lazy<InterfaceC47278tmy> valueOf() {
        int iAEQbTJ = zza.AEQbTJ();
        return (Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -947666771, 947666772, new Object[]{this}, zza.AEQbTJ());
    }

    public final VideoView AEQbTJ(FrameLayout frameLayout) {
        int iAEQbTJ = zza.AEQbTJ();
        return (VideoView) EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iAEQbTJ, 315098597, -315098577, new Object[]{this, frameLayout}, Iterators.AnonymousClass8.KWHzl());
    }

    public final Lazy<OKComplianceRestrictionService> AhwBna() {
        int iAEQbTJ = zza.AEQbTJ();
        return (Lazy) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 1438042712, -1438042687, new Object[]{this}, zza.AEQbTJ());
    }

    /* JADX DEBUG: Possible override for method o.muR.djBIcL()V */
    public final Lazy<InterfaceC33308mtx> djBIcL() {
        int iAEQbTJ = zza.AEQbTJ();
        return (Lazy) EZpvd(zza.AEQbTJ(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, 214386808, -214386774, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
    }

    public final C33285mta gEmmrt() {
        int iAEQbTJ = zza.AEQbTJ();
        return (C33285mta) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 309540565, -309540557, new Object[]{this}, zza.AEQbTJ());
    }

    public final void OLrzqt() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), zza.AEQbTJ(), iAEQbTJ, -881684134, 881684169, new Object[]{this}, Iterators.AnonymousClass8.KWHzl());
    }

    public static final boolean AEQbTJ(WelcomeActivity welcomeActivity, MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {welcomeActivity, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -464973930, 464973933, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static final void KWHzl(WelcomeActivity welcomeActivity, MediaPlayer mediaPlayer) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -918717779, 918717809, new Object[]{welcomeActivity, mediaPlayer}, zza.AEQbTJ());
    }

    public static final boolean copydefault(VideoView videoView, MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {videoView, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 648157548, -648157546, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static final void OLrzqt(WelcomeActivity welcomeActivity, VideoView videoView, MediaPlayer mediaPlayer) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -811673568, 811673578, new Object[]{welcomeActivity, videoView, mediaPlayer}, zza.AEQbTJ());
    }

    public static final boolean AEQbTJ(WelcomeActivity welcomeActivity) {
        int iAEQbTJ = zza.AEQbTJ();
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 1933655393, -1933655389, new Object[]{welcomeActivity}, zza.AEQbTJ())).booleanValue();
    }

    public static final void copydefault(SplashScreenViewProvider splashScreenViewProvider) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 2041217982, -2041217982, new Object[]{splashScreenViewProvider}, zza.AEQbTJ());
    }

    private final void fJNWhG() {
        int iKWHzl = Iterators.AnonymousClass8.KWHzl();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iKWHzl, -943944476, 943944488, new Object[]{this}, zza.AEQbTJ());
    }

    private final void ejfBZ() {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(Iterators.AnonymousClass8.KWHzl(), Iterators.AnonymousClass8.KWHzl(), iAEQbTJ, -836440991, 836440998, new Object[]{this}, zza.AEQbTJ());
    }

    public static final Unit AEQbTJ(WelcomeActivity welcomeActivity, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {welcomeActivity, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)};
        return (Unit) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1466560581, -1466560550, objArr, zza.AEQbTJ());
    }

    public static final boolean AEQbTJ(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1864330841, -1864330809, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static final /* synthetic */ Object OLrzqt(WelcomeActivity welcomeActivity, Continuation continuation) {
        int iAEQbTJ = zza.AEQbTJ();
        return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 623399356, -623399342, new Object[]{welcomeActivity, continuation}, zza.AEQbTJ());
    }

    public static final /* synthetic */ Object copydefault(WelcomeActivity welcomeActivity, Function1 function1, Continuation continuation) {
        int iAEQbTJ = zza.AEQbTJ();
        return EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -446229921, 446229942, new Object[]{welcomeActivity, function1, continuation}, zza.AEQbTJ());
    }

    public static /* synthetic */ void copydefault(WelcomeActivity welcomeActivity, MediaPlayer mediaPlayer) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -1518681489, 1518681517, new Object[]{welcomeActivity, mediaPlayer}, zza.AEQbTJ());
    }

    public static /* synthetic */ boolean KWHzl(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -1636754442, 1636754457, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static /* synthetic */ boolean OLrzqt(WelcomeActivity welcomeActivity) {
        int iAEQbTJ = zza.AEQbTJ();
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 288481025, -288481003, new Object[]{welcomeActivity}, zza.AEQbTJ())).booleanValue();
    }

    public static /* synthetic */ Unit EZpvd(WelcomeActivity welcomeActivity, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {welcomeActivity, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)};
        return (Unit) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -482985329, 482985347, objArr, zza.AEQbTJ());
    }

    public static /* synthetic */ boolean OLrzqt(VideoView videoView, MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {videoView, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 1479169974, -1479169950, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static /* synthetic */ void EZpvd(SplashScreenViewProvider splashScreenViewProvider) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, 58056554, -58056528, new Object[]{splashScreenViewProvider}, zza.AEQbTJ());
    }

    public static /* synthetic */ boolean copydefault(WelcomeActivity welcomeActivity, MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {welcomeActivity, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Boolean) EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), -533456477, 533456486, objArr, zza.AEQbTJ())).booleanValue();
    }

    public static /* synthetic */ void EZpvd(WelcomeActivity welcomeActivity, VideoView videoView, MediaPlayer mediaPlayer) {
        int iAEQbTJ = zza.AEQbTJ();
        EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), iAEQbTJ, -1039284596, 1039284607, new Object[]{welcomeActivity, videoView, mediaPlayer}, zza.AEQbTJ());
    }
}
