package com.okinc.core.ok_app.homepage.pro;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.primitives.Longs;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.core.ok_app.homepage.pro.MainActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.TokenType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33348muk;
import o.AbstractC33351mun;
import o.AbstractC58185ywX;
import o.ActivityC33266mtH;
import o.C32805mkX;
import o.C33070mpX;
import o.C33129mqd;
import o.C33160mrH;
import o.C33238msg;
import o.C33317muF;
import o.C33325muN;
import o.C33362muy;
import o.C33432mwO;
import o.C33505mxi;
import o.C34704nhP;
import o.C43251rlk;
import o.C47265tml;
import o.C52761wXj;
import o.C55089xdP;
import o.C55326xho;
import o.C56390yDp;
import o.C56424yEw;
import o.C56524yIo;
import o.C58156yvv;
import o.C6703aUO;
import o.C6777aVl;
import o.C9566bXx;
import o.InterfaceC33171mrS;
import o.InterfaceC33206msA;
import o.InterfaceC33209msD;
import o.InterfaceC33254msw;
import o.InterfaceC33255msx;
import o.InterfaceC35204nqs;
import o.InterfaceC35205nqt;
import o.InterfaceC43294rma;
import o.InterfaceC47278tmy;
import o.InterfaceC58227yxM;
import o.YY;
import o.Ze;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class MainActivity extends AbstractActivityC33348muk implements InterfaceC35205nqt, InterfaceC35204nqs {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static boolean AuCTelauCTel;
    private static int AubY;
    public static final Activity Companion;
    public static final int EZpvd;
    private static int getNewProxyInstance;
    private static char[] hDKMBd;
    private static int wlaJM;
    private static boolean zLjUOn;
    private static int zsXlph;
    private static int zuBGHE;
    public FrameLayout AYXKKw;
    public boolean AuCTel;
    public boolean DbNXlk;
    public C55089xdP djBIcL;
    public boolean fJNWhG;
    public Long fetchVPNInfo;
    public C33325muN getFieldNames;
    public AbstractC33351mun isConnected;
    public boolean iwGUEr;

    @yCM
    public InterfaceC47278tmy userManager;
    public boolean values;
    private static final byte[] $$c = {16, -6, 52, 123};
    private static final int $$f = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    public String fARcdN = "";
    public final Object fIwbmz = new Object();
    public final String uzCIH = "switchSystemKey";
    public final int valueOf = C33160mrH.Application.gEmmrt;
    public int ejfBZ = -1;
    public int AhwBna = 1;
    public final C33432mwO AkhnZx = new C33432mwO();
    public final TaskDescription gEmmrt = new TaskDescription();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(byte b, byte b2, int i) {
        int i2;
        int i3 = 101 - (i * 2);
        int i4 = 3 - (b2 * 2);
        byte[] bArr = $$c;
        int i5 = b * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 = (-i3) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i4++;
            i6 = i3;
            i3 = bArr[i4];
            i7 = i8;
            i3 = (-i3) + i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 65;
        int i4 = 11 - s2;
        byte[] bArr = $$a;
        int i5 = 42 - b;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            i2 = 0;
            i5++;
            i3 = (i3 + i6) - 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i3 = (i3 + i6) - 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = 111 - (s * 2);
        int i6 = 130 - i2;
        int i7 = i + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i7;
            int i10 = (i8 + (-i7)) - 3;
            int i11 = i9 + 1;
            i3 = i4;
            i5 = i10;
            i7 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i9 = i7;
            i7 = bArr[i7];
            i8 = i12;
            int i102 = (i8 + (-i7)) - 3;
            int i112 = i9 + 1;
            i3 = i4;
            i5 = i102;
            i7 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object copydefault(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i4;
        int i10 = i | i7;
        int i11 = (~(i | i4)) | (~(i7 | (~i4) | i8)) | (~(i4 | i3));
        int i12 = i4 + i3 + i6 + (764943627 * i5) + (189947931 * i2);
        int i13 = i12 * i12;
        int i14 = ((i4 * (-973936384)) - 801505280) + ((-973936384) * i3) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i6) + ((-1475084288) * i5) + ((-1479278592) * i2) + ((-626393088) * i13);
        int i15 = (i4 * 1860537600) + 224780607 + (i3 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i6 * 1860538117) + (i5 * (-1861700041)) + (i2 * (-831392377)) + (i13 * 995229696);
        int i16 = i14 + (i15 * i15 * 1053163520);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? KWHzl(objArr) : EZpvd(objArr) : OLrzqt(objArr) : AEQbTJ(objArr);
    }

    public static final /* synthetic */ void AEQbTJ(MainActivity mainActivity, C47265tml c47265tml) {
        int i = 2 % 2;
        int i2 = zsXlph + 103;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        mainActivity.AEQbTJ(c47265tml);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ C33432mwO EZpvd(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 61;
        zsXlph = i3 % 128;
        int i4 = i3 % 2;
        C33432mwO c33432mwO = mainActivity.AkhnZx;
        int i5 = i2 + 69;
        zsXlph = i5 % 128;
        if (i5 % 2 == 0) {
            return c33432mwO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void EZpvd(MainActivity mainActivity, C47265tml c47265tml) {
        int i = 2 % 2;
        int i2 = AubY + 17;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        mainActivity.OLrzqt(c47265tml);
        int i4 = AubY + 115;
        zsXlph = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.homepage.pro.MainActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55089xdP djBIcL() {
        int i = 2 % 2;
        int i2 = AubY + 119;
        int i3 = i2 % 128;
        zsXlph = i3;
        int i4 = i2 % 2;
        C55089xdP c55089xdP = this.djBIcL;
        if (c55089xdP == null) {
            Intrinsics.gEmmrt("");
            return null;
        }
        int i5 = i3 + 25;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return c55089xdP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ Object OLrzqt(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = zsXlph + 99;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            InterfaceC47278tmy interfaceC47278tmy = mainActivity.userManager;
            throw null;
        }
        InterfaceC47278tmy interfaceC47278tmy2 = mainActivity.userManager;
        if (interfaceC47278tmy2 != null) {
            return interfaceC47278tmy2;
        }
        Intrinsics.gEmmrt("");
        int i3 = AubY + 119;
        zsXlph = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static final class TaskDescription implements C6703aUO.StateListAnimator {
        public TaskDescription() {
        }

        @Override // o.C6703aUO.StateListAnimator
        public void OLrzqt() {
            try {
                if (MainActivity.EZpvd(MainActivity.this).copydefault()) {
                    for (Map.Entry<String, C33432mwO.Activity> entry : MainActivity.EZpvd(MainActivity.this).AEQbTJ().entrySet()) {
                        String key = entry.getKey();
                        for (Map.Entry<String, Long> entry2 : entry.getValue().EZpvd().entrySet()) {
                            if (entry2.getValue().longValue() > 100) {
                                EventData eventData = new EventData();
                                eventData.setAct(EventAction.PRO_MAIN_ANR.getType());
                                eventData.setPath(key);
                                eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("duration", String.valueOf(entry2.getValue().longValue())), C56390yDp.OLrzqt("path", entry2.getKey())));
                                ReportManager.AEQbTJ.EZpvd(eventData);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class Application extends OnBackPressedCallback {
        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (C34704nhP.copydefault.copydefault()) {
                if (MainActivity.this.AYXKKw()) {
                    MainActivity.this.moveTaskToBack(true);
                    return;
                }
                return;
            }
            MainActivity.this.moveTaskToBack(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [131=4, 172=6] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int[] iArr, int i, char[] cArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Ze ze = new Ze();
        char[] cArr2 = hDKMBd;
        if (cArr2 != null) {
            int i3 = $10 + 79;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 3;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objEZpvd = YY.EZpvd(-855574269);
                        if (objEZpvd == null) {
                            objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objEZpvd2 = YY.EZpvd(-855574269);
                    if (objEZpvd2 == null) {
                        objEZpvd2 = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i5++;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(getNewProxyInstance)};
            Object objEZpvd3 = YY.EZpvd(-1914793274);
            if (objEZpvd3 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objEZpvd3 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
            int i7 = -1317980492;
            if (zLjUOn) {
                ze.copydefault = bArr.length;
                char[] cArr4 = new char[ze.copydefault];
                ze.AEQbTJ = 0;
                while (ze.AEQbTJ < ze.copydefault) {
                    cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                    Object[] objArr5 = {ze, ze};
                    Object objEZpvd4 = YY.EZpvd(i7);
                    if (objEZpvd4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd4).invoke(null, objArr5);
                    i7 = -1317980492;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!AuCTelauCTel) {
                ze.copydefault = iArr.length;
                char[] cArr5 = new char[ze.copydefault];
                ze.AEQbTJ = 0;
                int i8 = $11 + 109;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (ze.AEQbTJ < ze.copydefault) {
                    cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                    ze.AEQbTJ++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            ze.copydefault = cArr.length;
            char[] cArr6 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                Object[] objArr6 = {ze, ze};
                Object objEZpvd5 = YY.EZpvd(-1317980492);
                if (objEZpvd5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objEZpvd5 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        byte[] bArr = new byte[519];
        System.arraycopy("8Eg\u0005ñÿ<Äõý\u0005ø\u00044Èîö\u0006ù\u0002>·\bø\u0000:Êù\u0001ú3êÙï-Ìÿ'Ø\tû\u001fÙ\u0001ú\u0016ãé)éð\n÷ÿðKï\u0000×õ\u0006ú>½ÿ!èç÷\u000f>Æÿûñ\fË\u000b>´3ö>ÄûøGÍðë\u0005$Üï\rî\u0006öù\b÷þGàÛì\bð\nòøñüô\u0012üü\u0002é\u0006õ>Àò\u000eñÿ<¼\u0001ÿø\b2¶\u0004\u0002\u0000ú\u0001þ3Åñ\u000e÷÷\u0005ô÷CèÛ\u001cÚ\u001bÜ\u0000ø\u0006\u001cÑ\u000e÷÷\u0005ô÷M®\u0000\bÿ÷\u0005òEý¸øÿ\u0000ø\u0006þ=Àûì\bð\nòø ê\u0001ë'Û\büööL½üü\u0002é\u0006õMì>Æ\u0015\u0006ñÿ<¼\u0001ÿø\b2¾\tì\u0004\u0003îCÇøó\rñö\u000eðAÅþ\u0001êü\u0000\nïB¾\tì\u0004\u0003îþB¸û\u00101¼ö\u000eðù\n\u0001ëF¶\t8Åñ\u000e÷÷\u0005ô÷C¸û\u00101Þéì\u0004\u0003î-Øó\rñö\u000eð Ö\u000eðù\n\u0001ë%Ö\u000eð\u000eòý#Ñ\u000e÷÷\u0005ô÷M®\u000bî%àóü\fô\u0006ðKïùñì\u000b\u0007>¸ü\t>Ä\u001dø>²\u0001\u0011:Íðë\u0005$Üï\rî\u0006öù\b÷þç\u0001B¸\fö:Àùø\u0005\u0000ø=¸\u000bðù\n\u0003ûïBÈñ\u0005ö\u0002ò\u0002\u0003\u0002üô÷\bòøH¸\u000bð\u000bü4èÎ\n\u0001ê\f\u0019âüô÷\bòø&Þý\u0000\u001aÜ\bð\u000eê\b÷þ\u0018ëð\u0006\u0005ò\u0000ì\u0012ð$ÔM®\u000bð\u0006\u0005ò\u0000ì\u0012\u001fÎ\n\u0001ê\f\u0019âüô÷\bòø&Þý\u0000\u001aÜ\bð\u000eê\b÷þ)Ð\bèRð\në>Áö\u001e)àÛì\bð\nòø>²\u0005ù".getBytes("ISO-8859-1"), 0, bArr, 0, 519);
        $$d = bArr;
        $$e = 215;
        $$a = new byte[]{98, -108, 56, -31, 5, Ascii.CR, Ascii.DC2, -13, -9, Ascii.SYN, Ascii.ETB, 7, -17, -2, 39, 9, -8, 4, Ascii.CR, -14, 51, -13, 7, -39, 8, Ascii.ESC, -22, 40, 16, -52, 45, -12, Ascii.CR, 2, 10, -20, 2, 2, -4, Ascii.NAK, -8, 9, -20, Ascii.FF, 10, -15, -21, Ascii.CAN};
        $$b = DateFormat.RELATIVE_SHORT;
        wlaJM = 0;
        zuBGHE = 1;
        zsXlph = 0;
        AubY = 1;
        AkhnZx();
        Companion = new Activity(null);
        EZpvd = 8;
        int i = wlaJM + 81;
        zuBGHE = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit AEQbTJ(MainActivity mainActivity, C33505mxi c33505mxi) {
        int i = 2 % 2;
        int i2 = AubY + 89;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        Unit unitEZpvd = EZpvd(mainActivity, c33505mxi);
        int i4 = zsXlph + 33;
        AubY = i4 % 128;
        int i5 = i4 % 2;
        return unitEZpvd;
    }

    private static /* synthetic */ Object KWHzl(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = zsXlph + 89;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 == 0) {
            int iOLrzqt = C9566bXx.OLrzqt();
            int iOLrzqt2 = C9566bXx.OLrzqt();
            int iOLrzqt3 = C9566bXx.OLrzqt();
            throw null;
        }
        int iOLrzqt4 = C9566bXx.OLrzqt();
        int iOLrzqt5 = C9566bXx.OLrzqt();
        int iOLrzqt6 = C9566bXx.OLrzqt();
        Unit unit = (Unit) copydefault(iOLrzqt4, C9566bXx.OLrzqt(), 608096646, -608096645, new Object[]{mainActivity, numValueOf}, iOLrzqt6, iOLrzqt5);
        int i4 = AubY + 33;
        zsXlph = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void KWHzl(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = zsXlph + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            int iOLrzqt = C9566bXx.OLrzqt();
            int iOLrzqt2 = C9566bXx.OLrzqt();
            int iOLrzqt3 = C9566bXx.OLrzqt();
            copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1144465164, -1144465161, new Object[]{function1, obj}, iOLrzqt3, iOLrzqt2);
            int i3 = 65 / 0;
        } else {
            int iOLrzqt4 = C9566bXx.OLrzqt();
            int iOLrzqt5 = C9566bXx.OLrzqt();
            int iOLrzqt6 = C9566bXx.OLrzqt();
            copydefault(iOLrzqt4, C9566bXx.OLrzqt(), 1144465164, -1144465161, new Object[]{function1, obj}, iOLrzqt6, iOLrzqt5);
        }
        int i4 = zsXlph + 19;
        AubY = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void copydefault(MainActivity mainActivity, Intent intent) {
        int i = 2 % 2;
        int i2 = AubY + 69;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        OLrzqt(mainActivity, intent);
        int i4 = zsXlph + 53;
        AubY = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        int i = 2 % 2;
        int i2 = zsXlph;
        int i3 = i2 + 71;
        AubY = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        AubY = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static /* synthetic */ Object EZpvd(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = AubY + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 54 / 0;
        return null;
    }

    public static final Unit EZpvd(MainActivity mainActivity, C33505mxi c33505mxi) {
        int i = 2 % 2;
        int i2 = zsXlph + 95;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        ActivityC33266mtH.Companion.KWHzl(mainActivity, c33505mxi.AEQbTJ(), c33505mxi.copydefault());
        Unit unit = Unit.INSTANCE;
        int i4 = AubY + 59;
        zsXlph = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [669=8, 166=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05ad  */
    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) throws Throwable {
        int intExtra;
        String stringExtra;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i = 2 % 2;
        if (bundle != null) {
            pUU.KWHzl(getTAG(), "getting currentMode from savedInstanceState");
            intExtra = bundle.getInt("app_mode", 1);
        } else {
            pUU.KWHzl(getTAG(), "getting currentMode from intent");
            intExtra = getIntent().getIntExtra("app_mode", 1);
        }
        this.AhwBna = intExtra;
        this.isConnected = gEmmrt();
        Object obj = null;
        if (bundle != null) {
            if (!bundle.isEmpty()) {
                int i2 = zsXlph + 61;
                AubY = i2 % 128;
                int i3 = i2 % 2;
                this.fARcdN = "";
                getIntent().removeExtra(OtcExtraKeys.MODE);
                AbstractC33351mun abstractC33351mun = this.isConnected;
                if (abstractC33351mun == null) {
                    Intrinsics.gEmmrt("");
                    abstractC33351mun = null;
                }
                abstractC33351mun.AEQbTJ(bundle);
            }
        } else if (Intrinsics.EZpvd((Object) this.fARcdN, (Object) "")) {
            Intent intent = getIntent();
            if (intent == null) {
                stringExtra = "";
                this.fARcdN = stringExtra;
            } else {
                stringExtra = intent.getStringExtra(OtcExtraKeys.MODE);
                if (stringExtra == null) {
                    int i4 = AubY + 125;
                    zsXlph = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 8 / 0;
                    }
                    stringExtra = "";
                }
                this.fARcdN = stringExtra;
            }
        }
        if (bundle != null) {
            int i6 = AubY + 19;
            zsXlph = i6 % 128;
            if (i6 % 2 != 0) {
                bundle.clear();
                obj.hashCode();
                throw null;
            }
            bundle.clear();
        }
        super.onCreate(bundle);
        Object objEZpvd = YY.EZpvd(862119861);
        if (objEZpvd == null) {
            byte b = (byte) 0;
            Object[] objArr4 = new Object[1];
            b(b, (byte) (b | 38), $$a[4], objArr4);
            objEZpvd = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr4[0], null);
        }
        long j = ((Field) objEZpvd).getLong(null);
        if (j != -1) {
            long j2 = j + 1889;
            Object[] objArr5 = new Object[1];
            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr6);
            if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                Object objEZpvd2 = YY.EZpvd(2079129037);
                if (objEZpvd2 == null) {
                    Object[] objArr7 = new Object[1];
                    b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr7);
                    objEZpvd2 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objEZpvd2).get(null);
                objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                int i7 = ((int[]) objArr8[3])[0];
                int i8 = ((int[]) objArr8[1])[0];
                String[] strArr = (String[]) objArr8[2];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i9 = (((245714571 + (((~((-81921) | (~startUptimeMillis))) | (~(2013100091 | startUptimeMillis))) * (-272))) + (((~((-592793641) | startUptimeMillis)) | 592711720) * (-272))) + (((~(startUptimeMillis | 592793640)) | 1420388371) * 272)) - 1539335378;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            } else {
                Context baseContext = getBaseContext();
                if (baseContext == null) {
                    Object[] objArr9 = new Object[1];
                    a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
                    baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                }
                if (baseContext != null) {
                    baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr13 = new Object[1];
                a(null, 127, null, new byte[]{-98, -116, -92, -91, -93, -97, -99, -112, -127, -91, -95, -127, -125, -99, -94, -94, -98, -127, -112, -91, -125, -112, -96, -91, -127, -112, -89, -92, -125, -92, -100, -95, -89, -125, -99, -91, -127, -96, -95, -91, -97, -90, -100, -91, -99, -127, -98, -100, -92, -94, -96, -127, -93, -94, -95, -125, -98, -96, -100, -97, -98, -99, -100, -100}, objArr13);
                try {
                    Object[] objArr14 = {baseContext, new String[]{(String) objArr13[0]}, Integer.valueOf(iIntValue), 1, -1539335378};
                    byte[] bArr = $$d;
                    byte b2 = bArr[24];
                    Object[] objArr15 = new Object[1];
                    c((short) 498, b2, (byte) (b2 | 116), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    short s = (short) (-bArr[76]);
                    byte b3 = bArr[262];
                    Object[] objArr16 = new Object[1];
                    c(s, b3, (byte) (b3 | 108), objArr16);
                    objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i12 = ((int[]) objArr[1])[0];
                    int i13 = ((int[]) objArr[3])[0];
                    if (baseContext != null) {
                        Object objEZpvd3 = YY.EZpvd(2079129037);
                        if (objEZpvd3 == null) {
                            Object[] objArr17 = new Object[1];
                            b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr17);
                            objEZpvd3 = YY.EZpvd(129, 4, (char) 39078, 2144088241, false, (String) objArr17[0], null);
                        }
                        ((Field) objEZpvd3).set(null, objArr);
                        try {
                            Object[] objArr18 = new Object[1];
                            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                            Long lValueOf = Long.valueOf(((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Object objEZpvd4 = YY.EZpvd(862119861);
                            if (objEZpvd4 == null) {
                                byte b4 = (byte) 0;
                                Object[] objArr20 = new Object[1];
                                b(b4, (byte) (b4 | 38), $$a[4], objArr20);
                                objEZpvd4 = YY.EZpvd(129, 4, (char) 39078, 927083209, false, (String) objArr20[0], null);
                            }
                            ((Field) objEZpvd4).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[2];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = AubY + 99;
        zsXlph = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[2];
        int iMyUid = Process.myUid();
        int i21 = ~iMyUid;
        int i22 = i18 + 1032206078 + (((~(i21 | 1700003176)) | 313178835) * (-1042)) + ((1700003176 | iMyUid) * 521) + (((~(iMyUid | (-313178836))) | 178240 | (~(i21 | 2013003771))) * 521);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
        setNavigationBarColorSafely(getResources().getColor(C52761wXj.Activity.fAklCm));
        getOnBackPressedDispatcher().addCallback(new Application());
        int i25 = ((int[]) objArr21[0])[0];
        int i26 = i25 * i25;
        int i27 = -(1142496516 * i25);
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        int i29 = -(i25 * (-1912108526));
        int i30 = ((i28 ^ i29) + ((i29 & i28) << 1)) - 1834783367;
        int i31 = ((i30 >> 27) - 63) / 32;
        int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
        int i33 = (i30 & i32) + (i32 | i30);
        int i34 = ((i30 >> 20) - 8191) / 4096;
        int i35 = -(i33 ^ ((i34 & 1) + (i34 | 1)));
        int i36 = (i35 ^ 8) + ((i35 & 8) << 1);
        int i37 = i36 >> 19;
        int i38 = ((((i37 | (-16383)) << 1) - (i37 ^ (-16383))) / 8192) + 1;
        String[] strArr4 = new String[0 / (((-((i38 & 1) + (i38 | 1))) & i36) * 49)];
        Object objEZpvd5 = YY.EZpvd(1466271760);
        if (objEZpvd5 == null) {
            byte[] bArr2 = $$a;
            byte b5 = bArr2[34];
            byte b6 = bArr2[47];
            Object[] objArr22 = new Object[1];
            b(b5, b6, (byte) (b6 >>> 2), objArr22);
            objEZpvd5 = YY.EZpvd(469, 4, (char) 64485, 1397048684, false, (String) objArr22[0], null);
        }
        long j3 = ((Field) objEZpvd5).getLong(null);
        if (j3 != -1) {
            int i39 = zsXlph + 103;
            AubY = i39 % 128;
            int i40 = i39 % 2;
            long j4 = j3 + Longs.MAX_POWER_OF_TWO;
            Object[] objArr23 = new Object[1];
            a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr23);
            Class<?> cls6 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr24);
            if (j4 >= ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                int i41 = zsXlph + 43;
                AubY = i41 % 128;
                int i42 = i41 % 2;
                Object objEZpvd6 = YY.EZpvd(574053742);
                if (objEZpvd6 == null) {
                    Object[] objArr25 = new Object[1];
                    b((byte) 34, $$a[34], (byte) 0, objArr25);
                    objEZpvd6 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr25[0], null);
                }
                Object[] objArr26 = (Object[]) ((Field) objEZpvd6).get(null);
                int i43 = ((int[]) objArr26[2])[0];
                int i44 = ((int[]) objArr26[0])[0];
                String[] strArr5 = (String[]) objArr26[3];
                int[] iArr = {i43};
                int i45 = ~(new Random().nextInt() | 1976803440);
                int i46 = (-1022801673) + (((-170500190) | i45) * (-220)) + ((i45 | (-2147197054)) * 220) + 628678937;
                int i47 = (i46 << 13) ^ i46;
                int i48 = i47 ^ (i47 >>> 17);
                ((int[]) objArr2[1])[0] = i48 ^ (i48 << 5);
                objArr2 = new Object[]{new int[]{i44}, new int[1], iArr, strArr5};
            } else {
                Object[] objArr27 = new Object[1];
                a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr27);
                Class<?> cls7 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr28);
                int iIntValue2 = ((Integer) cls7.getMethod((String) objArr28[0], Object.class).invoke(null, this)).intValue();
                int i49 = zsXlph + 33;
                AubY = i49 % 128;
                int i50 = i49 % 2;
                Object[] objArr29 = {Integer.valueOf(iIntValue2), 671927747};
                int i51 = $$e;
                byte[] bArr3 = $$d;
                byte b7 = bArr3[24];
                Object[] objArr30 = new Object[1];
                c((short) (i51 | 296), b7, (byte) (b7 | 125), objArr30);
                Class<?> cls8 = Class.forName((String) objArr30[0]);
                byte b8 = bArr3[17];
                Object[] objArr31 = new Object[1];
                c((short) (i51 >>> 1), b8, (byte) (b8 | 113), objArr31);
                objArr2 = (Object[]) cls8.getMethod((String) objArr31[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                Object objEZpvd7 = YY.EZpvd(574053742);
                if (objEZpvd7 == null) {
                    Object[] objArr32 = new Object[1];
                    b((byte) 34, $$a[34], (byte) 0, objArr32);
                    objEZpvd7 = YY.EZpvd(469, 4, (char) 64485, 639078418, false, (String) objArr32[0], null);
                }
                ((Field) objEZpvd7).set(null, objArr2);
                try {
                    Object[] objArr33 = new Object[1];
                    a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr33);
                    Class<?> cls9 = Class.forName((String) objArr33[0]);
                    Object[] objArr34 = new Object[1];
                    a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr34);
                    Long lValueOf2 = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr34[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd8 = YY.EZpvd(1466271760);
                    if (objEZpvd8 == null) {
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[34];
                        byte b10 = bArr4[47];
                        Object[] objArr35 = new Object[1];
                        b(b9, b10, (byte) (b10 >>> 2), objArr35);
                        objEZpvd8 = YY.EZpvd(469, 4, (char) 64485, 1397048684, false, (String) objArr35[0], null);
                    }
                    ((Field) objEZpvd8).set(null, lValueOf2);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
        }
        int i52 = ((int[]) objArr2[0])[0];
        int i53 = ((int[]) objArr2[2])[0];
        if (i53 == i52) {
            int i54 = zsXlph + 79;
            AubY = i54 % 128;
            int i55 = i54 % 2;
            int i56 = ((int[]) objArr2[1])[0];
            int i57 = ((int[]) objArr2[2])[0];
            int i58 = ((int[]) objArr2[0])[0];
            String[] strArr6 = (String[]) objArr2[3];
            int[] iArr2 = {i57};
            int iIdentityHashCode = System.identityHashCode(this);
            int i59 = ~iIdentityHashCode;
            int i60 = ~(911546879 | i59);
            int i61 = i56 + 1056497797 + ((1235756544 | i60) * (-712)) + (((~(iIdentityHashCode | 2147303423)) | (~(i59 | (-1235756545)))) * (-712)) + (((-1235756751) | i60) * 712);
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr3[1])[0] = i63 ^ (i63 << 5);
            objArr3 = new Object[]{new int[]{i58}, new int[1], iArr2, strArr6};
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr7 = (String[]) objArr2[3];
            if (strArr7 != null) {
                for (String str2 : strArr7) {
                    int i64 = zsXlph + 23;
                    AubY = i64 % 128;
                    int i65 = i64 % 2;
                    arrayList2.add(str2);
                }
            }
            int[] iArr3 = new int[i53];
            int i66 = i53 - 1;
            iArr3[i66] = 1;
            Toast.makeText((Context) null, iArr3[((i53 * i66) % 2) - 1], 1).show();
            int i67 = ((int[]) objArr2[1])[0];
            int i68 = ((int[]) objArr2[2])[0];
            int i69 = ((int[]) objArr2[0])[0];
            String[] strArr8 = (String[]) objArr2[3];
            int[] iArr4 = {i68};
            int[] iArr5 = {i69};
            int iMyPid = Process.myPid();
            int i70 = 1988886909 + (((~((-5045622) | iMyPid)) | 16720 | (~((-2142258009) | iMyPid))) * (-880));
            int i71 = (~((-5045622) | (~iMyPid))) | 2142258008;
            int i72 = ~(iMyPid | 5045621);
            int i73 = i67 + i70 + ((i71 | i72) * (-880)) + (i72 * 880);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr3[1])[0] = i75 ^ (i75 << 5);
            objArr3 = new Object[]{iArr5, new int[1], iArr4, strArr8};
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33505mxi.class, strArr4);
        String strConcat = "17\\22\\19\\".concat("listen(...)");
        int i76 = ((int[]) objArr3[1])[0];
        int i77 = i76 * i76;
        int i78 = -(441176739 * i76);
        int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
        int i80 = -(i76 * (-1593282629));
        int i81 = (i79 & i80) + (i80 | i79);
        int i82 = (i81 & 1018767009) + (1018767009 | i81);
        int i83 = ((i82 >> 17) - 65535) / 32768;
        int i84 = -(((i82 - (~((i83 ^ 1) + ((i83 & 1) << 1)))) - 1) ^ ((((i82 >> 26) - 127) / 64) + 1));
        int i85 = ((i84 | 7) << 1) - (i84 ^ 7);
        int i86 = i85 >> 27;
        int i87 = (((i86 | (-63)) << 1) - (i86 ^ (-63))) / 32;
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, strConcat.substring(106344 / (((-(((i87 ^ 1) + ((i87 & 1) << 1)) + 1)) & i85) * 1688)));
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.muo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return MainActivity.AEQbTJ(this.EZpvd, (C33505mxi) obj2);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                MainActivity.KWHzl(function1, obj2);
            }
        });
        RxBus.KWHzl("event_home_page_created");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [693=4] */
    @Override // o.AbstractActivityC33041mov
    public void init() {
        int i = 2 % 2;
        super.init();
        C33432mwO c33432mwO = this.AkhnZx;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c33432mwO.EZpvd(supportFragmentManager);
        C6703aUO.Companion.AEQbTJ(this.gEmmrt);
        values();
        copydefault((C55089xdP) findViewById(C33160mrH.StateListAnimator.OLrzqt));
        int headerValue = (((InterfaceC47278tmy) copydefault(C9566bXx.OLrzqt(), C9566bXx.OLrzqt(), 1669210156, -1669210154, new Object[]{this}, C9566bXx.OLrzqt(), C9566bXx.OLrzqt())).fJNWhG() ? TokenType.DEMO_TRADING : TokenType.LIVE_TRADING).getHeaderValue();
        int i2 = AubY + 3;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        this.ejfBZ = headerValue;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        if (listKWHzl != null) {
            int i4 = AubY + 37;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            Iterator it = listKWHzl.iterator();
            while (!(!it.hasNext())) {
                ((InterfaceC33254msw) it.next()).OLrzqt();
            }
        }
        this.AYXKKw = (FrameLayout) findViewById(C33160mrH.StateListAnimator.values);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        EZpvd(intent);
        SPUtils.put("had_enter_main", Boolean.TRUE);
        RxBus.KWHzl(C47265tml.class, new String[0]).subscribe(new RxBus.EventCallback<C47265tml>(this.fIwbmz, this.uzCIH) { // from class: com.okinc.core.ok_app.homepage.pro.MainActivity.init.2
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C47265tml c47265tml) {
                pUU.KWHzl("systemChange", "SwitchTradingModeEvent event.type: " + (c47265tml != null ? Integer.valueOf(c47265tml.copydefault()) : null) + " --path " + (c47265tml != null ? c47265tml.EZpvd() : null));
                MainActivity.EZpvd(MainActivity.this, c47265tml);
                MainActivity.AEQbTJ(MainActivity.this, c47265tml);
            }
        });
        int i6 = AubY + 75;
        zsXlph = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Intent intent) {
        int i = 2 % 2;
        int i2 = zsXlph + 91;
        int i3 = i2 % 128;
        AubY = i3;
        int i4 = i2 % 2;
        AbstractC33351mun abstractC33351mun = this.isConnected;
        AbstractC33351mun abstractC33351mun2 = null;
        if (abstractC33351mun == null) {
            int i5 = i3 + 91;
            zsXlph = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.gEmmrt("");
            abstractC33351mun = null;
        }
        abstractC33351mun.AhwBna();
        AbstractC33351mun abstractC33351mun3 = this.isConnected;
        if (abstractC33351mun3 == null) {
            Intrinsics.gEmmrt("");
            int i7 = AubY + 43;
            zsXlph = i7 % 128;
            int i8 = i7 % 2;
        } else {
            abstractC33351mun2 = abstractC33351mun3;
        }
        abstractC33351mun2.OLrzqt(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [711=4, 715=4] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[PHI: r1
  0x0051: PHI (r1v17 java.util.List) = (r1v16 java.util.List), (r1v21 java.util.List) binds: [B:10:0x004f, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(C47265tml c47265tml) {
        List listKWHzl;
        int i = 2 % 2;
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        int iOLrzqt3 = C9566bXx.OLrzqt();
        if (((InterfaceC47278tmy) copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1669210156, -1669210154, new Object[]{this}, iOLrzqt3, iOLrzqt2)).fJNWhG()) {
            int i2 = AubY + 41;
            zsXlph = i2 % 128;
            if (i2 % 2 != 0) {
                listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33255msx.class));
                int i3 = 32 / 0;
                if (listKWHzl != null) {
                    Iterator it = listKWHzl.iterator();
                    while (it.hasNext()) {
                        int i4 = zsXlph + 121;
                        AubY = i4 % 128;
                        int i5 = i4 % 2;
                        ((InterfaceC33255msx) it.next()).OLrzqt(c47265tml);
                    }
                }
            } else {
                listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33255msx.class));
                if (listKWHzl != null) {
                }
            }
        } else {
            SPUtils.put("test_change_real_show_snack", Boolean.TRUE);
        }
        List listKWHzl2 = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33206msA.class));
        if (listKWHzl2 != null) {
            int i6 = zsXlph + 117;
            AubY = i6 % 128;
            int i7 = i6 % 2;
            Iterator it2 = listKWHzl2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC33206msA) it2.next()).OLrzqt(c47265tml);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [737=5, 750=7] */
    public final void AEQbTJ(C47265tml c47265tml) {
        String strEZpvd;
        int i = 2 % 2;
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        String strEZpvd2 = null;
        if (c47265tml != null) {
            int i2 = AubY + 93;
            zsXlph = i2 % 128;
            if (i2 % 2 != 0) {
                c47265tml.EZpvd();
                strEZpvd2.hashCode();
                throw null;
            }
            strEZpvd = c47265tml.EZpvd();
        } else {
            strEZpvd = null;
        }
        if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
            int i3 = AubY + 13;
            zsXlph = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            intent.putExtra("path", c47265tml != null ? c47265tml.EZpvd() : null);
            if (Intrinsics.EZpvd((Object) (c47265tml != null ? c47265tml.EZpvd() : null), (Object) "trade/main/page")) {
                Map<String, Object> mapFetchVPNInfo = ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).fetchVPNInfo(c47265tml.EZpvd());
                try {
                    Object obj = mapFetchVPNInfo.get("tabType");
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        int i4 = zsXlph + 119;
                        AubY = i4 % 128;
                        int i5 = i4 % 2;
                        intent.putExtra("tab_type", Integer.parseInt(str));
                    }
                    Object obj2 = mapFetchVPNInfo.get("bizType");
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 != null) {
                        int i6 = AubY + 23;
                        zsXlph = i6 % 128;
                        if (i6 % 2 != 0) {
                            intent.putExtra("bizType", Integer.parseInt(str2));
                            int i7 = 71 / 0;
                        } else {
                            intent.putExtra("bizType", Integer.parseInt(str2));
                        }
                    }
                    Object obj3 = mapFetchVPNInfo.get("instId");
                    String str3 = obj3 instanceof String ? (String) obj3 : null;
                    if (str3 != null) {
                        int i8 = zsXlph + 17;
                        AubY = i8 % 128;
                        if (i8 % 2 == 0) {
                            intent.putExtra("instId", str3);
                            int i9 = 28 / 0;
                        } else {
                            intent.putExtra("instId", str3);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (C33129mqd.OLrzqt((CharSequence) (c47265tml != null ? c47265tml.EZpvd() : null))) {
            if (c47265tml != null) {
                int i10 = AubY + 83;
                zsXlph = i10 % 128;
                int i11 = i10 % 2;
                strEZpvd2 = c47265tml.EZpvd();
            }
            intent.putExtra(OtcRouteConst.MAIN_ROUTE_NAV, strEZpvd2);
        }
        getApplicationContext().startActivity(intent);
        finish();
        overridePendingTransition(C33238msg.StateListAnimator.AEQbTJ, C33238msg.StateListAnimator.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v6 int) = (r1v4 int), (r1v8 int) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStart() {
        int i;
        TokenType tokenType;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = zsXlph + 43;
        AubY = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.ejfBZ;
            int i5 = 43 / 0;
            if (i != -1) {
                int iOLrzqt = C9566bXx.OLrzqt();
                int iOLrzqt2 = C9566bXx.OLrzqt();
                int iOLrzqt3 = C9566bXx.OLrzqt();
                Object obj = null;
                byte b = 0;
                byte b2 = 0;
                if (((InterfaceC47278tmy) copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1669210156, -1669210154, new Object[]{this}, iOLrzqt3, iOLrzqt2)).fJNWhG()) {
                    int i6 = AubY + 123;
                    zsXlph = i6 % 128;
                    if (i6 % 2 != 0) {
                        TokenType tokenType2 = TokenType.DEMO_TRADING;
                        obj.hashCode();
                        throw null;
                    }
                    tokenType = TokenType.DEMO_TRADING;
                } else {
                    tokenType = TokenType.LIVE_TRADING;
                }
                int headerValue = tokenType.getHeaderValue();
                int i7 = AubY + 27;
                zsXlph = i7 % 128;
                int i8 = i7 % 2;
                if (i != headerValue) {
                    AEQbTJ(new C47265tml(i2, b2 == true ? 1 : 0, i2, b == true ? 1 : 0));
                }
            }
        } else {
            i = this.ejfBZ;
            if (i != -1) {
            }
        }
        try {
            super.onStart();
        } catch (Exception e) {
            C6777aVl.Companion.EZpvd(e);
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        int i = 2 % 2;
        int i2 = zsXlph + 69;
        AubY = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWindowFocusChanged(z);
            throw null;
        }
        super.onWindowFocusChanged(z);
        if (!this.DbNXlk) {
            this.DbNXlk = true;
            C32805mkX.EZpvd.OLrzqt(this);
            C33432mwO c33432mwO = this.AkhnZx;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c33432mwO.AEQbTJ(supportFragmentManager);
            C6703aUO.Companion.OLrzqt(this.gEmmrt);
        }
        int i3 = AubY + 43;
        zsXlph = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        int i;
        int i2 = 2 % 2;
        if (this.iwGUEr) {
            this.AuCTel = true;
            if (this.fJNWhG) {
                int i3 = zsXlph + 29;
                AubY = i3 % 128;
                int i4 = i3 % 2;
                if (!((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
                    AhwBna();
                    i = zsXlph + 97;
                    AubY = i % 128;
                } else {
                    int i5 = AubY + 23;
                    zsXlph = i5 % 128;
                    int i6 = i5 % 2;
                    InterfaceC33171mrS.Activity.enterOKXLite$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), this, false, false, false, 6, null);
                    i = AubY + 15;
                    zsXlph = i % 128;
                }
                int i7 = i % 2;
            }
        }
        this.fJNWhG = false;
        this.iwGUEr = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [818=5] */
    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        Dialog dialog;
        int i = 2 % 2;
        super.onResume();
        EZpvd();
        if (this.values) {
            recreate();
            this.values = false;
        }
        if (SPUtils.getBoolean("test_change_real_show_snack", false)) {
            int i2 = zsXlph + 73;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            SPUtils.put("test_change_real_show_snack", Boolean.FALSE);
            copydefault(this);
            int i4 = zsXlph + 13;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        C33325muN c33325muN = this.getFieldNames;
        if (c33325muN == null || (dialog = c33325muN.getDialog()) == null || !dialog.isShowing()) {
            return;
        }
        int i6 = AubY + 79;
        zsXlph = i6 % 128;
        if (i6 % 2 != 0) {
            c33325muN.isAdded();
            throw null;
        }
        if (c33325muN.isAdded()) {
            int i7 = zsXlph + 5;
            AubY = i7 % 128;
            int i8 = i7 % 2;
            c33325muN.dismissAllowingStateLoss();
            if (i8 == 0) {
                int i9 = 13 / 0;
            }
        }
    }

    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = zsXlph + 71;
        AubY = i2 % 128;
        if (i2 % 2 != 0) {
            super.onPause();
            C33432mwO c33432mwO = this.AkhnZx;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c33432mwO.AEQbTJ(supportFragmentManager);
            C6703aUO.Companion.OLrzqt(this.gEmmrt);
            SubHelper.EZpvd(this, "event_change_user");
            int i3 = zsXlph + 21;
            AubY = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onPause();
        C33432mwO c33432mwO2 = this.AkhnZx;
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        c33432mwO2.AEQbTJ(supportFragmentManager2);
        C6703aUO.Companion.OLrzqt(this.gEmmrt);
        SubHelper.EZpvd(this, "event_change_user");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Iterator it;
        int i = 2 % 2;
        int i2 = AubY + 41;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        SubHelper.AEQbTJ(this);
        SubHelper.EZpvd(this.fIwbmz, this.uzCIH);
        SubHelper.AEQbTJ(this.fIwbmz);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        if (listKWHzl != null) {
            int i4 = AubY + 29;
            zsXlph = i4 % 128;
            if (i4 % 2 != 0) {
                it = listKWHzl.iterator();
                int i5 = 14 / 0;
            } else {
                it = listKWHzl.iterator();
            }
            while (!(!it.hasNext())) {
                ((InterfaceC33254msw) it.next()).copydefault();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra("app_mode", 1);
        pUU.KWHzl(getTAG(), "MainActivity onNewIntent: currentMode: " + this.AhwBna + ", newMode: " + intExtra);
        Intent intent2 = getIntent();
        AbstractC33351mun abstractC33351mun = null;
        if (intent2 != null) {
            int i2 = AubY + 47;
            zsXlph = i2 % 128;
            if (i2 % 2 != 0) {
                intent2.putExtra("app_mode", intExtra);
                throw null;
            }
            intent2.putExtra("app_mode", intExtra);
        }
        if (this.AhwBna == intExtra) {
            AbstractC33351mun abstractC33351mun2 = this.isConnected;
            if (abstractC33351mun2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC33351mun = abstractC33351mun2;
            }
            abstractC33351mun.AEQbTJ(intent);
            return;
        }
        int i3 = AubY + 37;
        zsXlph = i3 % 128;
        if (i3 % 2 != 0) {
            intent.getStringExtra(OtcExtraKeys.MODE);
            abstractC33351mun.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra(OtcExtraKeys.MODE);
        this.fARcdN = stringExtra != null ? stringExtra : "";
        AEQbTJ(intent);
        values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(final Intent intent) {
        int i = 2 % 2;
        int i2 = AubY + 25;
        int i3 = i2 % 128;
        zsXlph = i3;
        int i4 = i2 % 2;
        AbstractC33351mun abstractC33351mun = this.isConnected;
        if (abstractC33351mun == null) {
            int i5 = i3 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            AubY = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.gEmmrt("");
            if (i6 == 0) {
                int i7 = 83 / 0;
            }
            abstractC33351mun = null;
        }
        abstractC33351mun.OLrzqt(new Runnable() { // from class: o.muj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.copydefault(this.EZpvd, intent);
            }
        });
    }

    public static final void OLrzqt(MainActivity mainActivity, Intent intent) {
        int i = 2 % 2;
        int i2 = zsXlph + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        mainActivity.AhwBna = intent.getIntExtra("app_mode", 1);
        mainActivity.isConnected = mainActivity.gEmmrt();
        mainActivity.EZpvd(intent);
        int i4 = AubY + 123;
        zsXlph = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final AbstractC33351mun gEmmrt() {
        AbstractC33351mun c33317muF;
        int i = 2 % 2;
        pUU.KWHzl(getTAG(), "MainActivity createDelegate: " + this.AhwBna);
        if (this.AhwBna == 5) {
            c33317muF = new C33362muy(this);
        } else {
            c33317muF = new C33317muF(this);
            int i2 = zsXlph + 91;
            AubY = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AubY + 55;
        zsXlph = i4 % 128;
        int i5 = i4 % 2;
        return c33317muF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AYXKKw() {
        boolean z;
        long jCurrentTimeMillis;
        Long l;
        long jLongValue;
        int i = 2 % 2;
        int i2 = zsXlph + 103;
        AubY = i2 % 128;
        boolean z2 = true;
        if (i2 % 2 == 0) {
            if (this.fetchVPNInfo != null) {
                z = true;
                jCurrentTimeMillis = System.currentTimeMillis();
                l = this.fetchVPNInfo;
                if (l == null) {
                    jLongValue = l.longValue();
                    int i3 = AubY + 91;
                    zsXlph = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    jLongValue = 0;
                }
                if (jCurrentTimeMillis - jLongValue >= 3000) {
                    return true;
                }
                C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                this.fetchVPNInfo = Long.valueOf(System.currentTimeMillis());
                int i5 = AubY + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                zsXlph = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
            this.fetchVPNInfo = Long.valueOf(System.currentTimeMillis());
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return z2;
        }
        z = false;
        if (this.fetchVPNInfo == null) {
            z2 = false;
            this.fetchVPNInfo = Long.valueOf(System.currentTimeMillis());
            C55326xho.toast$default(C33070mpX.AYXKKw(C33238msg.Application.OLrzqt), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return z2;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        l = this.fetchVPNInfo;
        if (l == null) {
        }
        if (jCurrentTimeMillis - jLongValue >= 3000) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void values() {
        int i = 2 % 2;
        String str = this.fARcdN;
        if (str != null) {
            int i2 = zsXlph + 55;
            AubY = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                AhwBna();
                int i4 = AubY + 21;
                zsXlph = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = AubY + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            zsXlph = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [900=4] */
    public final void AhwBna() {
        int i = 2 % 2;
        getContentView(this).setVisibility(4);
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        AbstractC33351mun abstractC33351mun = this.isConnected;
        if (abstractC33351mun == null) {
            int i2 = AubY + 71;
            zsXlph = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.gEmmrt("");
                int i3 = 48 / 0;
            } else {
                Intrinsics.gEmmrt("");
            }
            int i4 = AubY + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            abstractC33351mun = null;
        }
        InterfaceC33171mrS.Activity.showAnim$default(interfaceC33171mrS, this, abstractC33351mun.valueOf(), null, null, new Function1() { // from class: o.mul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object[] objArr = {this.EZpvd, java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue())};
                int iOLrzqt = C9566bXx.OLrzqt();
                int iOLrzqt2 = C9566bXx.OLrzqt();
                return (Unit) MainActivity.copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1413093755, -1413093755, objArr, C9566bXx.OLrzqt(), iOLrzqt2);
            }
        }, 12, null);
    }

    private static /* synthetic */ Object AEQbTJ(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = AubY;
        int i3 = i2 + 63;
        zsXlph = i3 % 128;
        int i4 = i3 % 2;
        if (iIntValue == 1) {
            int i5 = i2 + 121;
            zsXlph = i5 % 128;
            int i6 = i5 % 2;
            mainActivity.getContentView(mainActivity).setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = zsXlph + 11;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        AbstractC33351mun abstractC33351mun = this.isConnected;
        if (abstractC33351mun == null) {
            int i4 = zsXlph + 17;
            AubY = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Intrinsics.gEmmrt("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            abstractC33351mun = null;
        }
        abstractC33351mun.OLrzqt(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [927=4] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33209msD.class));
        if (listKWHzl != null) {
            int i4 = AubY + 99;
            zsXlph = i4 % 128;
            int i5 = i4 % 2;
            InterfaceC33209msD interfaceC33209msD = (InterfaceC33209msD) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl);
            if (interfaceC33209msD != null) {
                interfaceC33209msD.onActivityResult(i, i2, intent);
                int i6 = AubY + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                zsXlph = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = AubY + 45;
        zsXlph = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.app.Activity activity) {
        int i = 2 % 2;
        int i2 = zsXlph + 121;
        AubY = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        C33325muN c33325muN = this.getFieldNames;
        if (c33325muN != null) {
            if (c33325muN == null) {
                return;
            }
            int i3 = zsXlph + 25;
            AubY = i3 % 128;
            if (i3 % 2 == 0) {
                c33325muN.getDialog();
                obj.hashCode();
                throw null;
            }
            Dialog dialog = c33325muN.getDialog();
            if (dialog == null || dialog.isShowing()) {
                return;
            }
        }
        C33325muN c33325muNCopydefault = C33325muN.Companion.copydefault();
        this.getFieldNames = c33325muNCopydefault;
        if (c33325muNCopydefault != null) {
            c33325muNCopydefault.show(((FragmentActivity) activity).getSupportFragmentManager(), C33325muN.class.getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = zsXlph + 79;
        AubY = i2 % 128;
        AbstractC33351mun abstractC33351mun = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putInt("app_mode", this.AhwBna);
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putInt("app_mode", this.AhwBna);
        AbstractC33351mun abstractC33351mun2 = this.isConnected;
        if (abstractC33351mun2 == null) {
            int i3 = AubY + 67;
            zsXlph = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.gEmmrt("");
                throw null;
            }
            Intrinsics.gEmmrt("");
        } else {
            abstractC33351mun = abstractC33351mun2;
        }
        abstractC33351mun.copydefault(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.InterfaceC35205nqt
    public boolean AwvSrB() {
        int i = 2 % 2;
        int i2 = zsXlph + 117;
        AubY = i2 % 128;
        return i2 % 2 != 0;
    }

    public final void copydefault(@NotNull C55089xdP c55089xdP) {
        int i = 2 % 2;
        int i2 = zsXlph + 43;
        AubY = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c55089xdP, "");
        this.djBIcL = c55089xdP;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = AubY + 41;
        zsXlph = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // o.InterfaceC35204nqs
    public void fARcdN() throws Throwable {
        Object[] objArr;
        Object[] objArrEZpvd$1908f70b;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i = 2 % 2;
        Object[] objArr9 = new Object[1];
        a(null, 127, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
        String str = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        a(null, 127, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr10);
        String str2 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        a(null, 127, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
        String str3 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(null, 127, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
        String str4 = (String) objArr12[0];
        Object objEZpvd = YY.EZpvd(1378450737);
        if (objEZpvd == null) {
            byte b = (byte) 0;
            Object[] objArr13 = new Object[1];
            b(b, (byte) (b | 38), $$a[4], objArr13);
            objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr13[0], null);
        }
        long j = ((Field) objEZpvd).getLong(null);
        if (j == -1 || j + 2004 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr14 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                Class<?> cls = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr15);
                baseContext = (Context) cls.getMethod((String) objArr15[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            int i2 = AubY + 67;
            zsXlph = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr16 = {baseContext, Integer.valueOf(iIntValue), 0, -208691925};
                byte[] bArr = $$d;
                Object[] objArr17 = new Object[1];
                c(bArr[24], bArr[17], bArr[204], objArr17);
                Class<?> cls2 = Class.forName((String) objArr17[0]);
                short s = (short) (-bArr[76]);
                byte b2 = bArr[262];
                Object[] objArr18 = new Object[1];
                c(s, b2, (byte) (b2 | 108), objArr18);
                objArr = (Object[]) cls2.getMethod((String) objArr18[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16);
                Object objEZpvd2 = YY.EZpvd(-813709103);
                if (objEZpvd2 == null) {
                    Object[] objArr19 = new Object[1];
                    b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr19);
                    objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr19[0], null);
                }
                ((Field) objEZpvd2).set(null, objArr);
                try {
                    Long lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd3 = YY.EZpvd(1378450737);
                    if (objEZpvd3 == null) {
                        byte b3 = (byte) 0;
                        Object[] objArr20 = new Object[1];
                        b(b3, (byte) (b3 | 38), $$a[4], objArr20);
                        objEZpvd3 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 1443475533, false, (String) objArr20[0], null);
                    }
                    ((Field) objEZpvd3).set(null, lValueOf);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            Object objEZpvd4 = YY.EZpvd(-813709103);
            if (objEZpvd4 == null) {
                Object[] objArr21 = new Object[1];
                b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr21);
                objEZpvd4 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, -882965075, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objEZpvd4).get(null);
            objArr = new Object[]{new int[1], (List) objArr22[1], new int[]{((int[]) objArr22[2])[0]}, new int[]{((int[]) objArr22[3])[0]}, (List) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = ((((-1266553653) + (((~((-1093186679) | iIdentityHashCode)) | (~((-181687862) | i4))) * 217)) + (((~(iIdentityHashCode | (-181687862))) | 5172) * 217)) + (((~((-1093186679) | i4)) | 181687861) * 217)) - 208691925;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        }
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArr[0])[0];
            Object[] objArr23 = {new int[1], (List) objArr[1], new int[]{((int[]) objArr[2])[0]}, new int[]{((int[]) objArr[3])[0]}, (List) objArr[4]};
            int i11 = i10 + (((66777619 | r5) * (-658)) - 206770883) + (((~(((int) Process.getStartElapsedRealtime()) | 621378637)) | 49447442) * 658);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr23[0])[0] = i13 ^ (i13 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            try {
                Object[] objArr24 = {objArr};
                Object objEZpvd5 = YY.EZpvd(494303840);
                if (objEZpvd5 == null) {
                    objEZpvd5 = YY.EZpvd(948, 5, (char) 0, 425113372, false, "KWHzl", new Class[]{Object[].class});
                }
                arrayList.add(((Method) objEZpvd5).invoke(null, objArr24));
                Object[] objArr25 = {objArr};
                Object objEZpvd6 = YY.EZpvd(-709912695);
                if (objEZpvd6 == null) {
                    objEZpvd6 = YY.EZpvd(948, 5, (char) 0, -779134219, false, "AEQbTJ", new Class[]{Object[].class});
                }
                arrayList.add(((Method) objEZpvd6).invoke(null, objArr25));
                try {
                    Object[] objArr26 = {Long.valueOf(((long) (i8 ^ i9)) ^ (((long) (-855428606)) << 32)), Long.valueOf(-855428598)};
                    byte[] bArr2 = $$d;
                    short s2 = bArr2[25];
                    byte b4 = bArr2[24];
                    Object[] objArr27 = new Object[1];
                    c(s2, b4, (byte) (b4 | 125), objArr27);
                    Class<?> cls3 = Class.forName((String) objArr27[0]);
                    short s3 = bArr2[20];
                    byte b5 = bArr2[216];
                    Object[] objArr28 = new Object[1];
                    c(s3, b5, (byte) (b5 | 104), objArr28);
                    cls3.getMethod((String) objArr28[0], Long.TYPE, Long.TYPE).invoke(null, objArr26);
                    int i14 = ((int[]) objArr[0])[0];
                    Object[] objArr29 = {new int[1], (List) objArr[1], new int[]{((int[]) objArr[2])[0]}, new int[]{((int[]) objArr[3])[0]}, (List) objArr[4]};
                    int iNextInt = new Random().nextInt(1709631899);
                    int i15 = i14 + 1716913654 + ((~((~iNextInt) | (-584073289))) * 433) + (((~((-355253556) | iNextInt)) | (-919620985)) * (-433)) + (((~(iNextInt | (-919620985))) | (-939326844)) * 433);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr29[0])[0] = i17 ^ (i17 << 5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        Object objEZpvd7 = YY.EZpvd(-160594826);
        if (objEZpvd7 == null) {
            Object[] objArr30 = new Object[1];
            b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr30);
            objEZpvd7 = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr30[0], null);
        }
        long j2 = ((Field) objEZpvd7).getLong(null);
        if (j2 == -1 || j2 + 2031 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            int iIntValue2 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {-2093983263};
            Object objEZpvd8 = YY.EZpvd(-336872700);
            if (objEZpvd8 == null) {
                objEZpvd8 = YY.EZpvd(245, 5, (char) 0, -271878536, false, null, new Class[]{Integer.TYPE});
            }
            objArrEZpvd$1908f70b = DecimalFormatSymbols.AnonymousClass3.EZpvd$1908f70b(iIntValue2, 0, ((Constructor) objEZpvd8).newInstance(objArr31), -776933542, false);
            Object objEZpvd9 = YY.EZpvd(4139753);
            if (objEZpvd9 == null) {
                Object[] objArr32 = new Object[1];
                b((byte) (-$$a[19]), (byte) 29, r0[4], objArr32);
                objEZpvd9 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr32[0], null);
            }
            ((Field) objEZpvd9).set(null, objArrEZpvd$1908f70b);
            try {
                Long lValueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd10 = YY.EZpvd(-160594826);
                if (objEZpvd10 == null) {
                    Object[] objArr33 = new Object[1];
                    b(r9[17], (byte) 33, (byte) ($$a[11] - 1), objArr33);
                    objEZpvd10 = YY.EZpvd(250, 5, (char) 0, -229816054, false, (String) objArr33[0], null);
                }
                ((Field) objEZpvd10).set(null, lValueOf2);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd11 = YY.EZpvd(4139753);
            if (objEZpvd11 == null) {
                Object[] objArr34 = new Object[1];
                b((byte) (-$$a[19]), (byte) 29, r0[4], objArr34);
                objEZpvd11 = YY.EZpvd(250, 5, (char) 0, 69199765, false, (String) objArr34[0], null);
            }
            Object[] objArr35 = (Object[]) ((Field) objEZpvd11).get(null);
            objArrEZpvd$1908f70b = new Object[]{new int[]{((int[]) objArr35[0])[0]}, new int[]{((int[]) objArr35[1])[0]}, new int[1], (String[]) objArr35[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode2;
            int i19 = (((1812913960 + (((~((-930456273) | i18)) | 882963132) * (-90))) + (((~((-930456273) | iIdentityHashCode2)) | (-938865405)) * (-45))) + ((((~(iIdentityHashCode2 | (-882963133))) | (-930456273)) | (~(i18 | 882963132))) * 45)) - 776933542;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArrEZpvd$1908f70b[2])[0] = i21 ^ (i21 << 5);
        }
        int i22 = ((int[]) objArrEZpvd$1908f70b[0])[0];
        int i23 = ((int[]) objArrEZpvd$1908f70b[1])[0];
        if (i23 == i22) {
            int i24 = ((int[]) objArrEZpvd$1908f70b[2])[0];
            Object[] objArr36 = {new int[]{((int[]) objArrEZpvd$1908f70b[0])[0]}, new int[]{((int[]) objArrEZpvd$1908f70b[1])[0]}, new int[1], (String[]) objArrEZpvd$1908f70b[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i25 = i24 + ((((~((-1237598537) | r11)) | (~(1811246972 | iIdentityHashCode3))) * 988) - 503970728) + (((~(iIdentityHashCode3 | (-1239770969))) | 2172432 | (~((~iIdentityHashCode3) | 1811246972))) * 988);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr36[2])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = (String[]) objArrEZpvd$1908f70b[3];
            if (strArr != null) {
                for (String str5 : strArr) {
                    int i28 = zsXlph + 69;
                    AubY = i28 % 128;
                    int i29 = i28 % 2;
                    arrayList2.add(str5);
                }
            }
            Object[] objArr37 = {Long.valueOf(((long) (i22 ^ i23)) ^ (((long) 1064659048) << 32)), Long.valueOf(1064659050)};
            byte[] bArr3 = $$d;
            short s4 = bArr3[251];
            byte b6 = bArr3[24];
            Object[] objArr38 = new Object[1];
            c(s4, b6, (byte) (b6 | 125), objArr38);
            Class<?> cls4 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            c(bArr3[272], bArr3[114], (byte) 125, objArr39);
            cls4.getMethod((String) objArr39[0], Long.TYPE, Long.TYPE).invoke(null, objArr37);
            int i30 = ((int[]) objArrEZpvd$1908f70b[2])[0];
            Object[] objArr40 = {new int[]{((int[]) objArrEZpvd$1908f70b[0])[0]}, new int[]{((int[]) objArrEZpvd$1908f70b[1])[0]}, new int[1], (String[]) objArrEZpvd$1908f70b[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i31 = i30 + (-220175492) + (((~(iIdentityHashCode4 | 652158544)) | (-1161260861)) * (-668)) + ((652158544 | (~((-1161260861) | iIdentityHashCode4))) * 1336) + ((iIdentityHashCode4 | (-1092634925)) * 668);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr40[2])[0] = i33 ^ (i33 << 5);
        }
        Object objEZpvd12 = YY.EZpvd(-1900789179);
        if (objEZpvd12 == null) {
            Object[] objArr41 = new Object[1];
            b((byte) (-$$a[19]), (byte) 29, r0[4], objArr41);
            objEZpvd12 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr41[0], null);
        }
        long j3 = ((Field) objEZpvd12).getLong(null);
        if (j3 == -1 || j3 + 1929 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr42 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1243692064};
            Object objEZpvd13 = YY.EZpvd(777374025);
            if (objEZpvd13 == null) {
                Object[] objArr43 = new Object[1];
                b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr43);
                objEZpvd13 = YY.EZpvd(226, 4, (char) 0, 712311861, false, (String) objArr43[0], new Class[]{Integer.TYPE, Integer.TYPE});
            }
            objArr2 = (Object[]) ((Method) objEZpvd13).invoke(null, objArr42);
            Object objEZpvd14 = YY.EZpvd(193597850);
            if (objEZpvd14 == null) {
                Object[] objArr44 = new Object[1];
                b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr44);
                objEZpvd14 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr44[0], null);
            }
            ((Field) objEZpvd14).set(null, objArr2);
            try {
                Long lValueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd15 = YY.EZpvd(-1900789179);
                if (objEZpvd15 == null) {
                    Object[] objArr45 = new Object[1];
                    b((byte) (-$$a[19]), (byte) 29, r11[4], objArr45);
                    objEZpvd15 = YY.EZpvd(226, 4, (char) 0, -1969975495, false, (String) objArr45[0], null);
                }
                ((Field) objEZpvd15).set(null, lValueOf3);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd16 = YY.EZpvd(193597850);
            if (objEZpvd16 == null) {
                Object[] objArr46 = new Object[1];
                b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr46);
                objEZpvd16 = YY.EZpvd(226, 4, (char) 0, 262855910, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objEZpvd16).get(null);
            objArr2 = new Object[]{new int[1], new int[1], new int[1]};
            int i34 = ((int[]) objArr47[1])[0];
            int i35 = ((int[]) objArr47[0])[0];
            ((int[]) objArr2[1])[0] = i34;
            ((int[]) objArr2[0])[0] = i35;
            int ringerMode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i36 = ~ringerMode;
            int i37 = (-1894481355) + (((~(778253688 | i36)) | (-1065304063)) * 98) + (((~(i36 | (-857479903))) | 778253688 | (~(857479902 | ringerMode))) * (-49)) + (((~(ringerMode | 778253688)) | 207824160) * 49) + 1243692064;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr2[2])[0] = i39 ^ (i39 << 5);
        }
        Object obj = objArr2[0];
        int i40 = ((int[]) obj)[0];
        Object obj2 = objArr2[1];
        int i41 = ((int[]) obj2)[0];
        if (i41 == i40) {
            int i42 = AubY + 33;
            zsXlph = i42 % 128;
            int i43 = i42 % 2;
            Object[] objArr48 = {new int[1], new int[1], new int[1]};
            int i44 = ((int[]) objArr2[2])[0];
            int i45 = ((int[]) obj2)[0];
            int i46 = ((int[]) obj)[0];
            ((int[]) objArr48[1])[0] = i45;
            ((int[]) objArr48[0])[0] = i46;
            int ringerMode2 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            int i47 = ~ringerMode2;
            int i48 = i44 + (-1365615638) + ((935098459 | i47) * (-757)) + ((~(935328511 | ringerMode2)) * 1514) + (((~(ringerMode2 | (-230053))) | (~(i47 | 855872245)) | 79456266) * 757);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr48[2])[0] = i50 ^ (i50 << 5);
        } else {
            Object[] objArr49 = {Long.valueOf(((long) (i40 ^ i41)) ^ (((long) 275317663) << 32)), Long.valueOf(275319711)};
            byte[] bArr4 = $$d;
            short s5 = (short) (-bArr4[134]);
            byte b7 = bArr4[24];
            Object[] objArr50 = new Object[1];
            c(s5, b7, (byte) (b7 | 125), objArr50);
            Class<?> cls5 = Class.forName((String) objArr50[0]);
            short s6 = bArr4[20];
            byte b8 = bArr4[216];
            Object[] objArr51 = new Object[1];
            c(s6, b8, (byte) (b8 | 104), objArr51);
            cls5.getMethod((String) objArr51[0], Long.TYPE, Long.TYPE).invoke(null, objArr49);
            Object[] objArr52 = {new int[1], new int[1], new int[1]};
            int i51 = ((int[]) objArr2[2])[0];
            int i52 = ((int[]) objArr2[1])[0];
            int i53 = ((int[]) objArr2[0])[0];
            ((int[]) objArr52[1])[0] = i52;
            ((int[]) objArr52[0])[0] = i53;
            int streamVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
            int i54 = (-58023461) + (((~((-674188070) | streamVolume)) | 594961855) * (-318));
            int i55 = ~(594961855 | streamVolume);
            int i56 = ~streamVolume;
            int i57 = i51 + i54 + ((i55 | (~((-55583899) | i56))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(streamVolume | (-55583899))) | (~(729771967 | i56))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i58 = i57 ^ (i57 << 13);
            int i59 = i58 ^ (i58 >>> 17);
            ((int[]) objArr52[2])[0] = i59 ^ (i59 << 5);
        }
        Object objEZpvd17 = YY.EZpvd(1772514135);
        if (objEZpvd17 == null) {
            byte[] bArr5 = $$a;
            byte b9 = bArr5[34];
            byte b10 = bArr5[47];
            Object[] objArr53 = new Object[1];
            b(b9, b10, (byte) (b10 >>> 2), objArr53);
            objEZpvd17 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr53[0], null);
        }
        long j4 = ((Field) objEZpvd17).getLong(null);
        if (j4 == -1 || j4 + 2027 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr54 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr54);
                Class<?> cls6 = Class.forName((String) objArr54[0]);
                Object[] objArr55 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr55);
                baseContext2 = (Context) cls6.getMethod((String) objArr55[0], new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr56 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1074184388};
            byte[] bArr6 = $$d;
            short s7 = (short) (-bArr6[354]);
            byte b11 = bArr6[24];
            Object[] objArr57 = new Object[1];
            c(s7, b11, (byte) (b11 | 100), objArr57);
            Class<?> cls7 = Class.forName((String) objArr57[0]);
            short s8 = (short) ($$e >>> 1);
            byte b12 = bArr6[17];
            Object[] objArr58 = new Object[1];
            c(s8, b12, (byte) (b12 | 113), objArr58);
            objArr3 = (Object[]) cls7.getMethod((String) objArr58[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
            if (baseContext2 != null) {
                Object objEZpvd18 = YY.EZpvd(1361516365);
                if (objEZpvd18 == null) {
                    Object[] objArr59 = new Object[1];
                    b((byte) (-$$a[19]), (byte) 29, r0[4], objArr59);
                    objEZpvd18 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr59[0], null);
                }
                ((Field) objEZpvd18).set(null, objArr3);
                try {
                    Long lValueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd19 = YY.EZpvd(1772514135);
                    if (objEZpvd19 == null) {
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[34];
                        byte b14 = bArr7[47];
                        Object[] objArr60 = new Object[1];
                        b(b13, b14, (byte) (b14 >>> 2), objArr60);
                        objEZpvd19 = YY.EZpvd(172, 4, (char) 0, 1837540907, false, (String) objArr60[0], null);
                    }
                    ((Field) objEZpvd19).set(null, lValueOf4);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objEZpvd20 = YY.EZpvd(1361516365);
            if (objEZpvd20 == null) {
                Object[] objArr61 = new Object[1];
                b((byte) (-$$a[19]), (byte) 29, r0[4], objArr61);
                objEZpvd20 = YY.EZpvd(172, 4, (char) 0, 1426577969, false, (String) objArr61[0], null);
            }
            Object[] objArr62 = (Object[]) ((Field) objEZpvd20).get(null);
            objArr3 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i60 = ((int[]) objArr62[3])[0];
            int i61 = ((int[]) objArr62[0])[0];
            String str6 = (String) objArr62[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i62 = ~iIdentityHashCode5;
            int i63 = (-389761804) + ((63798868 | i62) * (-757)) + ((~((-1212674) | iIdentityHashCode5)) * 1514) + (((~(iIdentityHashCode5 | 65011541)) | (~(i62 | (-47439686))) | 46227012) * 757) + 1074184388;
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr3[2])[0] = i65 ^ (i65 << 5);
        }
        int i66 = ((int[]) objArr3[0])[0];
        int i67 = ((int[]) objArr3[3])[0];
        if (i67 == i66) {
            Object[] objArr63 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i68 = ((int[]) objArr3[2])[0];
            int i69 = ((int[]) objArr3[3])[0];
            int i70 = ((int[]) objArr3[0])[0];
            String str7 = (String) objArr3[1];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i71 = ~iIdentityHashCode6;
            int i72 = i68 + 1808795603 + (((~(200632274 | i71)) | (~((-311870829) | iIdentityHashCode6))) * 1900) + (((~(i71 | 311870828)) | (~(iIdentityHashCode6 | (-200632275)))) * (-950)) + (((~(iIdentityHashCode6 | 311870828)) | (~(i71 | (-200632275)))) * 950);
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr63[2])[0] = i74 ^ (i74 << 5);
        } else {
            Object[] objArr64 = {Long.valueOf(((long) (i66 ^ i67)) ^ (((long) 1368813828) << 32)), Long.valueOf(1368813824)};
            byte[] bArr8 = $$d;
            byte b15 = bArr8[24];
            Object[] objArr65 = new Object[1];
            c((short) 117, b15, (byte) (b15 | 125), objArr65);
            Class<?> cls8 = Class.forName((String) objArr65[0]);
            short s9 = (short) (-bArr8[76]);
            byte b16 = bArr8[262];
            Object[] objArr66 = new Object[1];
            c(s9, b16, (byte) (b16 | 108), objArr66);
            cls8.getMethod((String) objArr66[0], Long.TYPE, Long.TYPE).invoke(null, objArr64);
            Object[] objArr67 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i75 = ((int[]) objArr3[2])[0];
            int i76 = ((int[]) objArr3[3])[0];
            int i77 = ((int[]) objArr3[0])[0];
            String str8 = (String) objArr3[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i78 = ~iUptimeMillis;
            int i79 = i75 + (-1129772783) + (((~((-916467520) | i78)) | 268447258 | (~(805228965 | i78))) * (-1136)) + (((~((-916467520) | iUptimeMillis)) | (~(805228965 | iUptimeMillis)) | (~((-157208705) | i78))) * (-568)) + (((~(iUptimeMillis | (-268447259))) | (~(i78 | (-805228966))) | (~(916467519 | i78))) * 568);
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr67[2])[0] = i81 ^ (i81 << 5);
        }
        Object objEZpvd21 = YY.EZpvd(114367195);
        if (objEZpvd21 == null) {
            Object[] objArr68 = new Object[1];
            b((byte) 35, (byte) (-$$a[35]), r5[4], objArr68);
            objEZpvd21 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr68[0], null);
        }
        long j5 = ((Field) objEZpvd21).getLong(null);
        if (j5 == -1 || j5 + 2044 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr69 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 98309487};
            Object[] objArr70 = new Object[1];
            c((short) 121, r11[17], (byte) (-$$d[38]), objArr70);
            Class<?> cls9 = Class.forName((String) objArr70[0]);
            Object[] objArr71 = new Object[1];
            c(r11[272], r11[114], (byte) 125, objArr71);
            objArr4 = (Object[]) cls9.getMethod((String) objArr71[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr69);
            Object objEZpvd22 = YY.EZpvd(-1686262422);
            if (objEZpvd22 == null) {
                Object[] objArr72 = new Object[1];
                b((byte) 0, (byte) (-$$a[45]), r11[4], objArr72);
                objEZpvd22 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr72[0], null);
            }
            ((Field) objEZpvd22).set(null, objArr4);
            try {
                Long lValueOf5 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd23 = YY.EZpvd(114367195);
                if (objEZpvd23 == null) {
                    Object[] objArr73 = new Object[1];
                    b((byte) 35, (byte) (-$$a[35]), r12[4], objArr73);
                    objEZpvd23 = YY.EZpvd(172, 4, (char) 0, 49403815, false, (String) objArr73[0], null);
                }
                ((Field) objEZpvd23).set(null, lValueOf5);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        } else {
            int i82 = AubY + 105;
            zsXlph = i82 % 128;
            int i83 = i82 % 2;
            Object objEZpvd24 = YY.EZpvd(-1686262422);
            if (objEZpvd24 == null) {
                Object[] objArr74 = new Object[1];
                b((byte) 0, (byte) (-$$a[45]), r5[4], objArr74);
                objEZpvd24 = YY.EZpvd(172, 4, (char) 0, -1621270506, false, (String) objArr74[0], null);
            }
            Object[] objArr75 = (Object[]) ((Field) objEZpvd24).get(null);
            objArr4 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i84 = ((int[]) objArr75[3])[0];
            int i85 = ((int[]) objArr75[0])[0];
            String str9 = (String) objArr75[1];
            int i86 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i87 = (-2002270549) + (((~((-923445177) | i86)) | 812206622) * (-318));
            int i88 = ~(812206622 | i86);
            int i89 = ~i86;
            int i90 = i87 + ((i88 | (~((-6375431) | i89))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i86 | (-6375431))) | (~(929820606 | i89))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 98309487;
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr4[2])[0] = i92 ^ (i92 << 5);
        }
        int i93 = ((int[]) objArr4[0])[0];
        int i94 = ((int[]) objArr4[3])[0];
        if (i94 == i93) {
            Object[] objArr76 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i95 = ((int[]) objArr4[2])[0];
            int i96 = ((int[]) objArr4[3])[0];
            int i97 = ((int[]) objArr4[0])[0];
            String str10 = (String) objArr4[1];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i98 = ~iIdentityHashCode7;
            int i99 = i95 + (((~((-915781925) | iIdentityHashCode7)) | (~(804543370 | i98)) | (~(i98 | 915781924))) * 959) + 277510780 + (((~(iIdentityHashCode7 | 915781924)) | (~((-915781925) | i98)) | (~(804543370 | iIdentityHashCode7))) * 959);
            int i100 = (i99 << 13) ^ i99;
            int i101 = i100 ^ (i100 >>> 17);
            ((int[]) objArr76[2])[0] = i101 ^ (i101 << 5);
        } else {
            new ArrayList().add((String) objArr4[1]);
            Object[] objArr77 = {Long.valueOf(((long) (i93 ^ i94)) ^ (((long) 820950869) << 32)), Long.valueOf(820950853)};
            short s10 = (short) ($$e - 5);
            byte b17 = $$d[24];
            Object[] objArr78 = new Object[1];
            c(s10, b17, (byte) (b17 | 125), objArr78);
            Class<?> cls10 = Class.forName((String) objArr78[0]);
            Object[] objArr79 = new Object[1];
            c(r10[272], r10[114], (byte) 125, objArr79);
            cls10.getMethod((String) objArr79[0], Long.TYPE, Long.TYPE).invoke(null, objArr77);
            Object[] objArr80 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i102 = ((int[]) objArr4[2])[0];
            int i103 = ((int[]) objArr4[3])[0];
            int i104 = ((int[]) objArr4[0])[0];
            String str11 = (String) objArr4[1];
            int i105 = ~(((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamMaxVolume(3) | (-900272198));
            int i106 = i102 + (((268511667 + (((-1011510752) | i105) * (-220))) + ((i105 | 27332608) * 220)) - 1069545626);
            int i107 = (i106 << 13) ^ i106;
            int i108 = i107 ^ (i107 >>> 17);
            ((int[]) objArr80[2])[0] = i108 ^ (i108 << 5);
        }
        Object objEZpvd25 = YY.EZpvd(1457287029);
        if (objEZpvd25 == null) {
            Object[] objArr81 = new Object[1];
            b((byte) 34, $$a[34], (byte) 0, objArr81);
            objEZpvd25 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr81[0], null);
        }
        long j6 = ((Field) objEZpvd25).getLong(null);
        if (j6 == -1 || j6 + 1885 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                Object[] objArr82 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr82);
                Class<?> cls11 = Class.forName((String) objArr82[0]);
                Object[] objArr83 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr83);
                baseContext3 = (Context) cls11.getMethod((String) objArr83[0], new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            int i109 = zsXlph + 35;
            AubY = i109 % 128;
            int i110 = i109 % 2;
            Object[] objArr84 = {baseContext3, Integer.valueOf(iIntValue3), 1275412779};
            short s11 = (short) ($$e - 1);
            byte[] bArr9 = $$d;
            Object[] objArr85 = new Object[1];
            c(s11, bArr9[17], bArr9[344], objArr85);
            Class<?> cls12 = Class.forName((String) objArr85[0]);
            Object[] objArr86 = new Object[1];
            c((short) 336, (byte) (-bArr9[47]), (byte) 124, objArr86);
            objArr5 = (Object[]) cls12.getMethod((String) objArr86[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr84);
            if (baseContext3 != null) {
                Object objEZpvd26 = YY.EZpvd(1362558065);
                if (objEZpvd26 == null) {
                    Object[] objArr87 = new Object[1];
                    b((byte) 53, (byte) 0, $$a[17], objArr87);
                    objEZpvd26 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr87[0], null);
                }
                ((Field) objEZpvd26).set(null, objArr5);
                try {
                    Long lValueOf6 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd27 = YY.EZpvd(1457287029);
                    if (objEZpvd27 == null) {
                        Object[] objArr88 = new Object[1];
                        b((byte) 34, $$a[34], (byte) 0, objArr88);
                        objEZpvd27 = YY.EZpvd(172, 4, (char) 0, 1392288265, false, (String) objArr88[0], null);
                    }
                    ((Field) objEZpvd27).set(null, lValueOf6);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objEZpvd28 = YY.EZpvd(1362558065);
            if (objEZpvd28 == null) {
                Object[] objArr89 = new Object[1];
                b((byte) 53, (byte) 0, $$a[17], objArr89);
                objEZpvd28 = YY.EZpvd(172, 4, (char) 0, 1427517709, false, (String) objArr89[0], null);
            }
            Object[] objArr90 = (Object[]) ((Field) objEZpvd28).get(null);
            objArr5 = new Object[]{new int[]{i}, str, new int[1], new int[]{i}};
            int i111 = ((int[]) objArr90[3])[0];
            int i112 = ((int[]) objArr90[0])[0];
            String str12 = (String) objArr90[1];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i113 = ~iIdentityHashCode8;
            int i114 = 1808795603 + (((~(72027902 | i113)) | (~((-183266457) | iIdentityHashCode8))) * 1900) + (((~(i113 | 183266456)) | (~(iIdentityHashCode8 | (-72027903)))) * (-950)) + (((~(iIdentityHashCode8 | 183266456)) | (~(i113 | (-72027903)))) * 950) + 1275412779;
            int i115 = (i114 << 13) ^ i114;
            int i116 = i115 ^ (i115 >>> 17);
            ((int[]) objArr5[2])[0] = i116 ^ (i116 << 5);
        }
        int i117 = ((int[]) objArr5[0])[0];
        int i118 = ((int[]) objArr5[3])[0];
        if (i118 == i117) {
            int i119 = AubY + 119;
            zsXlph = i119 % 128;
            int i120 = i119 % 2;
            Object[] objArr91 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i121 = ((int[]) objArr5[2])[0];
            int i122 = ((int[]) objArr5[3])[0];
            int i123 = ((int[]) objArr5[0])[0];
            String str13 = (String) objArr5[1];
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i124 = ~((-279086747) | iIdentityHashCode9);
            int i125 = ~iIdentityHashCode9;
            int i126 = i121 + 1927411850 + ((i124 | (~(468697055 | i125))) * 497) + (((~(iIdentityHashCode9 | 468697055)) | (~((-300848864) | i125)) | 21762117) * 497);
            int i127 = (i126 << 13) ^ i126;
            int i128 = i127 ^ (i127 >>> 17);
            ((int[]) objArr91[2])[0] = i128 ^ (i128 << 5);
        } else {
            Object[] objArr92 = objArr5;
            Object[] objArr93 = {Long.valueOf(((long) (i117 ^ i118)) ^ (((long) 1916698841) << 32)), Long.valueOf(1916699353)};
            byte b18 = $$d[24];
            Object[] objArr94 = new Object[1];
            c((short) 341, b18, (byte) (b18 | 125), objArr94);
            Class<?> cls13 = Class.forName((String) objArr94[0]);
            Object[] objArr95 = new Object[1];
            c(r10[272], r10[114], (byte) 125, objArr95);
            cls13.getMethod((String) objArr95[0], Long.TYPE, Long.TYPE).invoke(null, objArr93);
            Object[] objArr96 = {new int[]{i}, str, new int[1], new int[]{i}};
            int i129 = ((int[]) objArr92[2])[0];
            int i130 = ((int[]) objArr92[3])[0];
            int i131 = ((int[]) objArr92[0])[0];
            String str14 = (String) objArr92[1];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i132 = ~startElapsedRealtime;
            int i133 = i129 + 822006142 + (((~(762681473 | i132)) | 873920027) * (-90)) + (((~(762681473 | startElapsedRealtime)) | 157354112) * (-45)) + (((~(startElapsedRealtime | (-873920028))) | 762681473 | (~(i132 | 873920027))) * 45);
            int i134 = (i133 << 13) ^ i133;
            int i135 = i134 ^ (i134 >>> 17);
            ((int[]) objArr96[2])[0] = i135 ^ (i135 << 5);
        }
        Object objEZpvd29 = YY.EZpvd(-1484370570);
        if (objEZpvd29 == null) {
            Object[] objArr97 = new Object[1];
            b((byte) 34, $$a[34], (byte) 0, objArr97);
            objEZpvd29 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr97[0], null);
        }
        long j7 = ((Field) objEZpvd29).getLong(null);
        if (j7 == -1 || j7 + 2017 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object objEZpvd30 = YY.EZpvd(981579467);
            if (objEZpvd30 == null) {
                objEZpvd30 = YY.EZpvd(PsExtractor.VIDEO_STREAM_MASK, 5, (char) 0, 1050770359, false, null, new Class[0]);
            }
            Object[] objArr98 = {null, ((Constructor) objEZpvd30).newInstance(null), 1177257876, 0};
            Object objEZpvd31 = YY.EZpvd(1167604386);
            if (objEZpvd31 == null) {
                byte[] bArr10 = $$a;
                byte b19 = bArr10[34];
                byte b20 = bArr10[47];
                Object[] objArr99 = new Object[1];
                b(b19, b20, (byte) (b20 >>> 2), objArr99);
                objEZpvd31 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1102641118, false, (String) objArr99[0], new Class[]{(Class) YY.AEQbTJ(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 13, (char) 2212), (Class) YY.AEQbTJ(150, 22, (char) 48137), Integer.TYPE, Integer.TYPE});
            }
            objArr6 = (Object[]) ((Method) objEZpvd31).invoke(null, objArr98);
            Object objEZpvd32 = YY.EZpvd(1636616175);
            if (objEZpvd32 == null) {
                byte b21 = (byte) 0;
                Object[] objArr100 = new Object[1];
                b(b21, (byte) (b21 | 38), $$a[4], objArr100);
                objEZpvd32 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr100[0], null);
            }
            ((Field) objEZpvd32).set(null, objArr6);
            try {
                Long lValueOf7 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd33 = YY.EZpvd(-1484370570);
                if (objEZpvd33 == null) {
                    Object[] objArr101 = new Object[1];
                    b((byte) 34, $$a[34], (byte) 0, objArr101);
                    objEZpvd33 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, -1549369334, false, (String) objArr101[0], null);
                }
                ((Field) objEZpvd33).set(null, lValueOf7);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        } else {
            Object objEZpvd34 = YY.EZpvd(1636616175);
            if (objEZpvd34 == null) {
                byte b22 = (byte) 0;
                Object[] objArr102 = new Object[1];
                b(b22, (byte) (b22 | 38), $$a[4], objArr102);
                objEZpvd34 = YY.EZpvd(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 4, (char) 0, 1705773715, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objEZpvd34).get(null);
            objArr6 = new Object[]{new int[1], new int[1], new int[1]};
            int i136 = ((int[]) objArr103[0])[0];
            int i137 = ((int[]) objArr103[2])[0];
            ((int[]) objArr6[0])[0] = i136;
            ((int[]) objArr6[2])[0] = i137;
            int i138 = (~((int) SystemClock.elapsedRealtime())) | 1066209706;
            int i139 = (-866587606) + (i138 * 495) + (((~i138) | 453841184) * 495) + 1177257876;
            int i140 = (i139 << 13) ^ i139;
            int i141 = i140 ^ (i140 >>> 17);
            ((int[]) objArr6[1])[0] = i141 ^ (i141 << 5);
        }
        Object obj3 = objArr6[2];
        int i142 = ((int[]) obj3)[0];
        Object obj4 = objArr6[0];
        int i143 = ((int[]) obj4)[0];
        if (i143 == i142) {
            int i144 = AubY + 23;
            zsXlph = i144 % 128;
            int i145 = i144 % 2;
            Object[] objArr104 = {new int[1], new int[1], new int[1]};
            int i146 = ((int[]) objArr6[1])[0];
            int i147 = ((int[]) obj4)[0];
            int i148 = ((int[]) obj3)[0];
            ((int[]) objArr104[0])[0] = i147;
            ((int[]) objArr104[2])[0] = i148;
            int streamVolume2 = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
            int i149 = ~streamVolume2;
            int i150 = i146 + 1474603241 + (((~((-329873289) | i149)) | (~((-116625300) | streamVolume2))) * 1900) + (((~(i149 | 116625299)) | (~(streamVolume2 | 329873288))) * (-950)) + (((~(streamVolume2 | 116625299)) | (~(i149 | 329873288))) * 950);
            int i151 = i150 ^ (i150 << 13);
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr104[1])[0] = i152 ^ (i152 << 5);
        } else {
            Object[] objArr105 = {Long.valueOf((((long) (-313711152)) << 32) ^ ((long) (i142 ^ i143))), Long.valueOf(-313707056)};
            short s12 = (short) ($$e - 5);
            byte b23 = $$d[24];
            Object[] objArr106 = new Object[1];
            c(s12, b23, (byte) (b23 | 125), objArr106);
            Class<?> cls14 = Class.forName((String) objArr106[0]);
            Object[] objArr107 = new Object[1];
            c(r9[272], r9[114], (byte) 125, objArr107);
            cls14.getMethod((String) objArr107[0], Long.TYPE, Long.TYPE).invoke(null, objArr105);
            Object[] objArr108 = {new int[1], new int[1], new int[1]};
            int i153 = ((int[]) objArr6[1])[0];
            int i154 = ((int[]) objArr6[0])[0];
            int i155 = ((int[]) objArr6[2])[0];
            ((int[]) objArr108[0])[0] = i154;
            ((int[]) objArr108[2])[0] = i155;
            int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            int i156 = ~mode;
            int i157 = i153 + 2017159192 + (((~(i156 | 398981475)) | 47517112) * (-1042)) + ((398981475 | mode) * 521) + (((~(mode | (-47517113))) | 46467360 | (~(i156 | 400031227))) * 521);
            int i158 = (i157 << 13) ^ i157;
            int i159 = i158 ^ (i158 >>> 17);
            ((int[]) objArr108[1])[0] = i159 ^ (i159 << 5);
        }
        Object objEZpvd35 = YY.EZpvd(-1909595884);
        if (objEZpvd35 == null) {
            Object[] objArr109 = new Object[1];
            b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr109);
            objEZpvd35 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr109[0], null);
        }
        long j8 = ((Field) objEZpvd35).getLong(null);
        if (j8 == -1 || j8 + 2032 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr110 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1365375091};
            Object objEZpvd36 = YY.EZpvd(544886635);
            if (objEZpvd36 == null) {
                Object[] objArr111 = new Object[1];
                b((byte) (-$$a[19]), (byte) 29, r0[4], objArr111);
                objEZpvd36 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, 609911319, false, (String) objArr111[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objEZpvd36).invoke(null, objArr110);
            Object objEZpvd37 = YY.EZpvd(-131060873);
            if (objEZpvd37 == null) {
                Object[] objArr112 = new Object[1];
                b((byte) 34, $$a[34], (byte) 0, objArr112);
                objEZpvd37 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr112[0], null);
            }
            ((Field) objEZpvd37).set(null, objArr7);
            try {
                Long lValueOf8 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objEZpvd38 = YY.EZpvd(-1909595884);
                if (objEZpvd38 == null) {
                    Object[] objArr113 = new Object[1];
                    b(r9[17], (byte) 33, (byte) ($$a[11] - 1), objArr113);
                    objEZpvd38 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1978848152, false, (String) objArr113[0], null);
                }
                ((Field) objEZpvd38).set(null, lValueOf8);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        } else {
            int i160 = zsXlph + 43;
            AubY = i160 % 128;
            int i161 = i160 % 2;
            Object objEZpvd39 = YY.EZpvd(-131060873);
            if (objEZpvd39 == null) {
                Object[] objArr114 = new Object[1];
                b((byte) 34, $$a[34], (byte) 0, objArr114);
                objEZpvd39 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -66001397, false, (String) objArr114[0], null);
            }
            Object[] objArr115 = (Object[]) ((Field) objEZpvd39).get(null);
            objArr7 = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i162 = ((int[]) objArr115[1])[0];
            int i163 = ((int[]) objArr115[2])[0];
            String[] strArr2 = (String[]) objArr115[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i164 = 1064561974 + (((~(511985925 | elapsedCpuTime)) | 21739128) * (-140)) + ((~(533725053 | elapsedCpuTime)) * 70) + (((~(elapsedCpuTime | 89110137)) | 466354044) * 70) + 1365375091;
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr7[3])[0] = i166 ^ (i166 << 5);
        }
        int i167 = ((int[]) objArr7[2])[0];
        int i168 = ((int[]) objArr7[1])[0];
        if (i168 == i167) {
            Object[] objArr116 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i169 = ((int[]) objArr7[3])[0];
            int i170 = ((int[]) objArr7[1])[0];
            int i171 = ((int[]) objArr7[2])[0];
            String[] strArr3 = (String[]) objArr7[0];
            int iNextInt2 = new Random().nextInt();
            int i172 = ~iNextInt2;
            int i173 = i169 + (-113974484) + ((691558874 | i172) * (-757)) + ((~(763124699 | iNextInt2)) * 1514) + (((~(iNextInt2 | (-71565826))) | (~(i172 | 90462811)) | 672661888) * 757);
            int i174 = (i173 << 13) ^ i173;
            int i175 = i174 ^ (i174 >>> 17);
            ((int[]) objArr116[3])[0] = i175 ^ (i175 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr4 = (String[]) objArr7[0];
            if (strArr4 != null) {
                for (String str15 : strArr4) {
                    int i176 = zsXlph + 51;
                    AubY = i176 % 128;
                    int i177 = i176 % 2;
                    arrayList3.add(str15);
                }
            }
            Object[] objArr117 = {Long.valueOf(((long) (i167 ^ i168)) ^ (((long) 1118470812) << 32)), Long.valueOf(1118470813)};
            byte b24 = $$d[24];
            Object[] objArr118 = new Object[1];
            c((short) 345, b24, (byte) (b24 | 125), objArr118);
            Class<?> cls15 = Class.forName((String) objArr118[0]);
            Object[] objArr119 = new Object[1];
            c(r9[272], r9[114], (byte) 125, objArr119);
            cls15.getMethod((String) objArr119[0], Long.TYPE, Long.TYPE).invoke(null, objArr117);
            Object[] objArr120 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i178 = ((int[]) objArr7[3])[0];
            int i179 = ((int[]) objArr7[1])[0];
            int i180 = ((int[]) objArr7[2])[0];
            String[] strArr5 = (String[]) objArr7[0];
            int iNextInt3 = new Random().nextInt();
            int i181 = ~iNextInt3;
            int i182 = i178 + (((~(i181 | 947194949)) | (~(346098886 | i181)) | (~((-947194950) | iNextInt3))) * 959) + 287833982 + (((~(iNextInt3 | 947194949)) | (~(i181 | (-947194950))) | (~(346098886 | iNextInt3))) * 959);
            int i183 = (i182 << 13) ^ i182;
            int i184 = i183 ^ (i183 >>> 17);
            ((int[]) objArr120[3])[0] = i184 ^ (i184 << 5);
        }
        Object objEZpvd40 = YY.EZpvd(1699149472);
        if (objEZpvd40 == null) {
            byte b25 = (byte) 0;
            Object[] objArr121 = new Object[1];
            b(b25, (byte) (b25 | 38), $$a[4], objArr121);
            objEZpvd40 = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr121[0], null);
        }
        long j9 = ((Field) objEZpvd40).getLong(null);
        if (j9 == -1 || j9 + 1950 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                Object[] objArr122 = new Object[1];
                a(null, 127, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr122);
                Class<?> cls16 = Class.forName((String) objArr122[0]);
                Object[] objArr123 = new Object[1];
                a(null, 127, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr123);
                baseContext4 = (Context) cls16.getMethod((String) objArr123[0], new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                int i185 = zsXlph + 45;
                AubY = i185 % 128;
                if (i185 % 2 == 0) {
                    boolean z = baseContext4 instanceof ContextWrapper;
                    throw null;
                }
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            Object[] objArr124 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 938230877};
            byte[] bArr11 = $$d;
            byte b26 = bArr11[24];
            Object[] objArr125 = new Object[1];
            c((short) 349, b26, (byte) (b26 | 109), objArr125);
            Class<?> cls17 = Class.forName((String) objArr125[0]);
            Object[] objArr126 = new Object[1];
            c((short) 336, (byte) (-bArr11[47]), (byte) 124, objArr126);
            Object[] objArr127 = (Object[]) cls17.getMethod((String) objArr126[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr124);
            if (baseContext4 != null) {
                Object objEZpvd41 = YY.EZpvd(-249174654);
                if (objEZpvd41 == null) {
                    Object[] objArr128 = new Object[1];
                    b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr128);
                    objEZpvd41 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr128[0], null);
                }
                ((Field) objEZpvd41).set(null, objArr127);
                try {
                    Long lValueOf9 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objEZpvd42 = YY.EZpvd(1699149472);
                    if (objEZpvd42 == null) {
                        byte b27 = (byte) 0;
                        Object[] objArr129 = new Object[1];
                        b(b27, (byte) (b27 | 38), $$a[4], objArr129);
                        objEZpvd42 = YY.EZpvd(368, 5, (char) 0, 1634089948, false, (String) objArr129[0], null);
                    }
                    ((Field) objEZpvd42).set(null, lValueOf9);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            objArr8 = objArr127;
        } else {
            Object objEZpvd43 = YY.EZpvd(-249174654);
            if (objEZpvd43 == null) {
                Object[] objArr130 = new Object[1];
                b(r0[17], (byte) 33, (byte) ($$a[11] - 1), objArr130);
                objEZpvd43 = YY.EZpvd(368, 5, (char) 0, -184211202, false, (String) objArr130[0], null);
            }
            Object[] objArr131 = (Object[]) ((Field) objEZpvd43).get(null);
            objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr131[1])[0]}, (String) objArr131[2], new int[]{((int[]) objArr131[3])[0]}, (String) objArr131[4]};
            int iNextInt4 = new Random().nextInt();
            int i186 = ~iNextInt4;
            int i187 = 2051697962 + ((iNextInt4 | 276980752) * 988) + (((~(430603441 | i186)) | 608469572) * (-1976)) + (((~(iNextInt4 | (-762092262))) | 276980752 | (~(762092261 | i186))) * 988) + 938230877;
            int i188 = (i187 << 13) ^ i187;
            int i189 = i188 ^ (i188 >>> 17);
            ((int[]) objArr8[0])[0] = i189 ^ (i189 << 5);
        }
        int i190 = ((int[]) objArr8[1])[0];
        int i191 = ((int[]) objArr8[3])[0];
        if (i191 == i190) {
            int i192 = ((int[]) objArr8[0])[0];
            Object[] objArr132 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (String) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String) objArr8[4]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i193 = i192 + 278947742 + ((~((~iIdentityHashCode10) | 646901622)) * (-116)) + ((613084720 | iIdentityHashCode10) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + (((~(iIdentityHashCode10 | (-579610983))) | 545794080) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            int i194 = (i193 << 13) ^ i193;
            int i195 = i194 ^ (i194 >>> 17);
            ((int[]) objArr132[0])[0] = i195 ^ (i195 << 5);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add((String) objArr8[2]);
        arrayList4.add((String) objArr8[4]);
        Object[] objArr133 = {Long.valueOf((((long) (-969969820)) << 32) ^ ((long) (i190 ^ i191))), Long.valueOf(-969969852)};
        byte[] bArr12 = $$d;
        Object[] objArr134 = new Object[1];
        c((short) 369, bArr12[344], bArr12[24], objArr134);
        Class<?> cls18 = Class.forName((String) objArr134[0]);
        Object[] objArr135 = new Object[1];
        c((short) 336, (byte) (-bArr12[47]), (byte) 124, objArr135);
        cls18.getMethod((String) objArr135[0], Long.TYPE, Long.TYPE).invoke(null, objArr133);
        int i196 = ((int[]) objArr8[0])[0];
        Object[] objArr136 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (String) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String) objArr8[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i197 = i196 + ((((-1604822352) + (((~((-134422561) | iElapsedRealtime)) | (~(1058273142 | iElapsedRealtime))) * 69)) + (((~(iElapsedRealtime | 990095138)) | ((~((-202600565) | iElapsedRealtime)) | 68178004)) * (-69))) - 1088134262);
        int i198 = (i197 << 13) ^ i197;
        int i199 = i198 ^ (i198 >>> 17);
        ((int[]) objArr136[0])[0] = i199 ^ (i199 << 5);
    }

    @Override // o.AbstractActivityC33041mov
    public int getContentView() {
        int i = 2 % 2;
        int i2 = AubY + 81;
        zsXlph = i2 % 128;
        if (i2 % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }

    static void AkhnZx() {
        hDKMBd = new char[]{62569, 62556, 62550, 62552, 62555, 62545, 62492, 62535, 62567, 62529, 62534, 62549, 62557, 62583, 62558, 62551, 62559, 62554, 62584, 62473, 62532, 62566, 62546, 62533, 62544, 62547, 62578, 62467, 62568, 62465, 62468, 62470, 62466, 62548, 62469, 62490, 62489, 62471, 62488};
        getNewProxyInstance = 585627082;
        AuCTelauCTel = true;
        zLjUOn = true;
    }

    @Override // o.AbstractActivityC33348muk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = AubY + 103;
        zsXlph = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = AubY + 37;
        zsXlph = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
    }

    public final InterfaceC47278tmy valueOf() {
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        int iOLrzqt3 = C9566bXx.OLrzqt();
        return (InterfaceC47278tmy) copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1669210156, -1669210154, new Object[]{this}, iOLrzqt3, iOLrzqt2);
    }

    public static final Unit OLrzqt(MainActivity mainActivity, int i) {
        Object[] objArr = {mainActivity, Integer.valueOf(i)};
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        return (Unit) copydefault(iOLrzqt, C9566bXx.OLrzqt(), 608096646, -608096645, objArr, C9566bXx.OLrzqt(), iOLrzqt2);
    }

    private static final void AEQbTJ(Function1 function1, Object obj) {
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        int iOLrzqt3 = C9566bXx.OLrzqt();
        copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1144465164, -1144465161, new Object[]{function1, obj}, iOLrzqt3, iOLrzqt2);
    }

    public static /* synthetic */ Unit KWHzl(MainActivity mainActivity, int i) {
        Object[] objArr = {mainActivity, Integer.valueOf(i)};
        int iOLrzqt = C9566bXx.OLrzqt();
        int iOLrzqt2 = C9566bXx.OLrzqt();
        return (Unit) copydefault(iOLrzqt, C9566bXx.OLrzqt(), 1413093755, -1413093755, objArr, C9566bXx.OLrzqt(), iOLrzqt2);
    }
}
